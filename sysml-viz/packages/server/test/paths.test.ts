import assert from "node:assert/strict";
import { mkdtemp, mkdir, realpath, rm, symlink, writeFile } from "node:fs/promises";
import os from "node:os";
import path from "node:path";
import test from "node:test";

import { discoverSysmlFiles } from "@sysml-viz/core";

import { isExcludedProjectPath, isWithinRoot, resolveSessionRoots } from "../src/paths.js";
import { NoActiveProjectError, SessionManager } from "../src/manager.js";

test("session roots are explicit and canonical", async () => {
  const temporary = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-roots-"));
  const project = path.join(temporary, "project");
  const library = path.join(temporary, "library");
  await mkdir(project);
  await mkdir(library);
  const roots = await resolveSessionRoots(project, [library, library]);
  assert.equal(roots.root, await realpath(project));
  assert.deepEqual(roots.libraryRoots, [await realpath(library)]);
});

test("paths cannot escape the configured project root", () => {
  const root = path.resolve("/tmp/sysml-viz-project");
  assert.equal(isWithinRoot(root, path.join(root, "model.sysml")), true);
  assert.equal(isWithinRoot(root, path.join(root, "..models", "model.sysml")), true);
  assert.equal(isWithinRoot(root, path.resolve(root, "../other/model.sysml")), false);
  assert.equal(isExcludedProjectPath(root, path.join(root, ".slang", "generated.sysml")), true);
  assert.equal(isExcludedProjectPath(root, path.join(root, ".private", "model.sysml")), true);
  assert.equal(isExcludedProjectPath(root, path.join(root, "src", ".draft.sysml")), true);
  assert.equal(isExcludedProjectPath(root, path.join(root, "src", "model.sysml")), false);
  const patterns = { include: ["src/**/*.sysml"], exclude: ["**/draft-?.sysml"] };
  assert.equal(
    isExcludedProjectPath(root, path.join(root, "src", "nested", "model.sysml"), [], patterns),
    false,
  );
  assert.equal(
    isExcludedProjectPath(root, path.join(root, "other", "model.sysml"), [], patterns),
    true,
  );
  assert.equal(
    isExcludedProjectPath(root, path.join(root, "src", "draft-1.sysml"), [], patterns),
    true,
  );
  // Directories must remain watchable so an include can match descendants.
  assert.equal(isExcludedProjectPath(root, path.join(root, "src"), [], patterns), false);
});

test("watch filters use conventional segment globs and basename exclusions", () => {
  const root = path.resolve("/tmp/sysml-viz-pattern-project");

  assert.equal(
    isExcludedProjectPath(
      root,
      path.join(root, "src", "Model.sysml"),
      [],
      { include: ["src/*.sysml"] },
    ),
    false,
  );
  assert.equal(
    isExcludedProjectPath(
      root,
      path.join(root, "src", "nested", "Model.sysml"),
      [],
      { include: ["src/*.sysml"] },
    ),
    true,
  );
  assert.equal(
    isExcludedProjectPath(
      root,
      path.join(root, "src", "nested", "Model.sysml"),
      [],
      { include: ["*.sysml"] },
    ),
    false,
  );
  assert.equal(
    isExcludedProjectPath(
      root,
      path.join(root, "src", "scratch", "Model.sysml"),
      [],
      { exclude: ["src/*"] },
    ),
    true,
  );
  assert.equal(
    isExcludedProjectPath(
      root,
      path.join(root, "src", "draft-1.sysml"),
      [],
      { exclude: ["draft-?.sysml"] },
    ),
    true,
  );
  assert.equal(
    isExcludedProjectPath(
      root,
      path.join(root, "src", "draft-10.sysml"),
      [],
      { exclude: ["draft-?.sysml"] },
    ),
    false,
  );
});

test("only library roots nested below the project are removed from the watch tree", () => {
  const root = path.resolve("/tmp/sysml-viz-library-bounds/library/project");
  const nestedLibrary = path.join(root, "vendor", "library");
  const ancestorLibrary = path.dirname(root);
  const projectFile = path.join(root, "Model.sysml");

  assert.equal(isExcludedProjectPath(root, projectFile, [nestedLibrary]), false);
  assert.equal(
    isExcludedProjectPath(root, path.join(nestedLibrary, "Context.sysml"), [nestedLibrary]),
    true,
  );
  assert.equal(isExcludedProjectPath(root, projectFile, [ancestorLibrary]), false);
});

test("project discovery and watcher filtering select the same SysML paths", async () => {
  const temporary = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-watch-parity-"));
  try {
    const root = path.join(temporary, "project");
    const library = path.join(root, "vendor", "library");
    const relativeFiles = [
      "Root.sysml",
      "src/Keep.sysml",
      "src/draft-1.sysml",
      "src/nested/TooDeep.sysml",
      "deep/nested/Included.sysml",
      "other/Omitted.sysml",
      ".private/Hidden.sysml",
      "generated/Generated.sysml",
    ];
    await Promise.all(
      [...relativeFiles.map((relative) => path.dirname(path.join(root, relative))), library].map(
        (directory) => mkdir(directory, { recursive: true }),
      ),
    );
    await Promise.all([
      ...relativeFiles.map((relative) =>
        writeFile(path.join(root, relative), `package ${path.basename(relative, ".sysml")} {}`),
      ),
      writeFile(path.join(library, "Context.sysml"), "package Context {}"),
    ]);
    const patterns = {
      include: ["Root.sysml", "src/*.sysml", "deep/**/*.sysml"],
      exclude: ["draft-?.sysml"],
    };

    const discovered = await discoverSysmlFiles({
      root,
      libraryRoots: [library],
      ...patterns,
    });
    const watchedProjectFiles = relativeFiles
      .filter(
        (relative) =>
          !isExcludedProjectPath(root, path.join(root, relative), [library], patterns),
      )
      .sort();

    assert.deepEqual(
      discovered
        .filter((file) => file.origin === "project")
        .map((file) => file.relativePath)
        .sort(),
      watchedProjectFiles,
    );
    assert.deepEqual(watchedProjectFiles, [
      "Root.sysml",
      "deep/nested/Included.sysml",
      "src/Keep.sysml",
    ]);
    assert.deepEqual(
      discovered.filter((file) => file.origin === "library").map((file) => file.relativePath),
      ["Context.sysml"],
      "project includes must not trim explicitly configured library context",
    );
  } finally {
    await rm(temporary, { recursive: true, force: true });
  }
});

test("workspace manager starts idle and atomically retains the active project on failure", async () => {
  const workspace = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-workspace-"));
  try {
    const first = path.join(workspace, "first");
    const second = path.join(workspace, "second");
    await Promise.all([mkdir(first), mkdir(second)]);
    await writeFile(path.join(first, "First.sysml"), "package First { part def FirstSystem :> System; }");
    await writeFile(path.join(second, "Second.sysml"), "package Second { part def SecondSystem :> System; }");
    const manager = await SessionManager.create({ workspaceRoot: workspace });
    try {
      assert.equal((await manager.sessionState()).active, false);
      assert.throws(() => manager.session.revision, NoActiveProjectError);

      const firstState = await manager.switchProject({ root: "first" });
      assert.equal(firstState.root, first);
      assert.equal(manager.active?.root, first);
      await manager.active?.updateView("first-only", { name: "First project view", rootId: null });

      await assert.rejects(
        manager.switchProject({ root: path.join(workspace, "missing") }),
        /does not exist/,
      );
      assert.equal(manager.active?.root, first);

      const secondState = await manager.switchProject({ root: second });
      assert.equal(secondState.root, second);
      assert.equal(manager.active?.root, second);
      assert.equal((await manager.active?.viewDocument())?.views.some((view) => view.id === "first-only"), false);

      await Promise.all([
        manager.switchProject({ root: first }),
        manager.switchProject({ root: second }),
      ]);
      assert.equal(manager.active?.root, second, "concurrent switches must run in request order");

      await manager.switchProject({ root: first });
      assert.equal(
        (await manager.active?.viewDocument())?.views.some((view) => view.id === "first-only"),
        true,
        "reopening a project must use its own .sysmlviz view store",
      );
    } finally {
      await manager.close();
    }
  } finally {
    await rm(workspace, { recursive: true, force: true });
  }
});

test("workspace previews apply project includes and shared exclusions and reject symlink escapes", async () => {
  const workspace = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-preview-"));
  const outside = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-outside-"));
  try {
    const project = path.join(workspace, "project");
    const library = path.join(workspace, "library");
    await Promise.all([
      mkdir(path.join(project, "src"), { recursive: true }),
      mkdir(library),
    ]);
    await Promise.all([
      writeFile(path.join(project, "Root.sysml"), "package Root {}"),
      writeFile(path.join(project, "src", "Keep.sysml"), "package Keep {}"),
      writeFile(path.join(project, "src", "Skip.sysml"), "package Skip {}"),
      writeFile(path.join(library, "Context.sysml"), "package Context {}"),
      writeFile(path.join(library, "Skip.sysml"), "package LibrarySkip {}"),
    ]);
    await symlink(outside, path.join(workspace, "escape"));
    const manager = await SessionManager.create({ workspaceRoot: workspace });
    try {
      const listing = await manager.listDirectory() as {
        directories: Array<{ name: string }>;
      };
      assert.equal(
        listing.directories.some((entry) => entry.name === "escape"),
        false,
      );
      const preview = await manager.preview({
        root: project,
        libraryRoots: [library],
        include: ["src/*.sysml"],
        exclude: ["Skip.sysml"],
      });
      assert.equal(preview.projectFileCount, 1);
      assert.equal(preview.libraryFileCount, 1);
      assert.equal(preview.totalFileCount, 2);
      await assert.rejects(manager.preview({ root: path.join(workspace, "escape") }), /inside workspace root/);
    } finally {
      await manager.close();
    }
  } finally {
    await Promise.all([
      rm(workspace, { recursive: true, force: true }),
      rm(outside, { recursive: true, force: true }),
    ]);
  }
});
