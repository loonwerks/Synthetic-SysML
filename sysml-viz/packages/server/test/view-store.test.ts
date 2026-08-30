import assert from "node:assert/strict";
import { access, mkdtemp, readFile, symlink, writeFile } from "node:fs/promises";
import os from "node:os";
import path from "node:path";
import test from "node:test";

import { ViewStore } from "../src/view-store.js";

test("view positions and pins survive a reload", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-view-"));
  const store = new ViewStore(root);
  await store.upsert(
    "architecture",
    { positions: { thermostat: { x: 320, y: 240, pinned: true } } },
    "Isolette::Isolette_Single_Sensor",
  );
  const reloaded = await new ViewStore(root).load();
  assert.deepEqual(reloaded.views[0]?.positions.thermostat, { x: 320, y: 240, pinned: true });
  assert.match(await readFile(store.viewsPath, "utf8"), /"pinned": true/);
});

test("per-edge source and target attachments survive reload and reject malformed offsets", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-edge-attachments-"));
  const store = new ViewStore(root);
  const route = {
    pinned: true,
    points: [{ x: 200, y: 240 }],
    sourceAttachment: { side: "bottom" as const, offset: 0.3 },
    targetAttachment: { side: "left" as const, offset: 0.72 },
  };
  await store.upsert("architecture", { edgeRoutes: { heat: route } }, "root");

  const reloaded = await new ViewStore(root).load();
  assert.deepEqual(reloaded.views[0]?.edgeRoutes.heat, route);

  await assert.rejects(
    store.upsert(
      "architecture",
      {
        edgeRoutes: {
          heat: {
            ...route,
            targetAttachment: { side: "left", offset: 1.2 },
          },
        },
      },
      "root",
    ),
    /offset between 0 and 1/,
  );
});

test("legacy documents default missing view revisions and migrate on mutation", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-view-legacy-"));
  const store = new ViewStore(root);
  await store.upsert("architecture", { name: "Legacy architecture" }, "root");

  const legacyDocument = JSON.parse(await readFile(store.viewsPath, "utf8")) as Record<string, unknown>;
  delete legacyDocument.viewRevision;
  await writeFile(store.viewsPath, `${JSON.stringify(legacyDocument, null, 2)}\n`, "utf8");

  const loaded = await new ViewStore(root).load();
  assert.equal(loaded.viewRevision, 0);
  assert.deepEqual(loaded.mutations, []);

  const migrated = await store.upsert(
    "architecture",
    { name: "Migrated architecture" },
    "root",
    true,
  );
  assert.equal(migrated.viewRevision, 1);
  assert.equal(migrated.mutations.length, 1);
  assert.equal(migrated.mutations[0]?.client, "system");
  assert.equal(
    (JSON.parse(await readFile(store.viewsPath, "utf8")) as { viewRevision?: number }).viewRevision,
    1,
  );
});

test("visual mutation provenance is atomic, explicit, and bounded metadata", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-provenance-"));
  const store = new ViewStore(root);
  const document = await store.upsert(
    "architecture",
    { positions: { thermostat: { x: 12, y: 34, pinned: true } } },
    "root",
    {
      actor: "layout-agent",
      client: "cli",
      operation: "layout.move",
      modelRevision: 7,
      targetIds: ["thermostat"],
      changedFields: ["positions"],
    },
  );
  assert.equal(document.viewRevision, 1);
  assert.equal(document.mutations.length, 1);
  assert.deepEqual(
    {
      actor: document.mutations[0]?.actor,
      client: document.mutations[0]?.client,
      operation: document.mutations[0]?.operation,
      modelRevision: document.mutations[0]?.modelRevision,
      viewRevision: document.mutations[0]?.viewRevision,
      targetIds: document.mutations[0]?.targetIds,
      changedFields: document.mutations[0]?.changedFields,
    },
    {
      actor: "layout-agent",
      client: "cli",
      operation: "layout.move",
      modelRevision: 7,
      viewRevision: 1,
      targetIds: ["thermostat"],
      changedFields: ["positions"],
    },
  );
  assert.match(document.mutations[0]?.at ?? "", /^\d{4}-\d{2}-\d{2}T/u);
  assert.ok(document.mutations[0]?.id);
});

test("legacy checkpoints default missing view revisions and targeted updates preserve siblings", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-checkpoint-legacy-"));
  const store = new ViewStore(root);
  await store.upsert("architecture", {}, "root");
  const common = {
    name: "Legacy checkpoint",
    createdAt: "2026-07-22T00:00:00.000Z",
    modelRevision: 4,
    viewId: "architecture",
    parseStatus: "valid",
  };
  await writeFile(
    store.checkpointsPath,
    `${JSON.stringify([
      { ...common, id: "first", validationStatus: "pending" },
      { ...common, id: "second", validationStatus: "pending" },
    ], null, 2)}\n`,
    "utf8",
  );

  const loaded = await store.listCheckpoints();
  assert.deepEqual(loaded.map((checkpoint) => checkpoint.viewRevision), [0, 0]);

  await store.updateCheckpoint("first", { validationStatus: "invalid" });
  const updated = await store.listCheckpoints();
  assert.equal(updated.find((checkpoint) => checkpoint.id === "first")?.validationStatus, "invalid");
  assert.equal(updated.find((checkpoint) => checkpoint.id === "second")?.validationStatus, "pending");
});

test("concurrent view mutations are serialized without lost updates", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-view-race-"));
  const store = new ViewStore(root);
  await Promise.all(
    Array.from({ length: 30 }, (_, index) =>
      store.upsert(
        `view-${index}`,
        { name: `View ${index}`, camera: { x: index, y: index * 2, zoom: 1 } },
        "root",
      ),
    ),
  );
  const document = await store.load();
  assert.equal(document.views.filter((view) => view.id.startsWith("view-")).length, 30);
});

test("persistence refuses a .sysmlviz symlink escape", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-view-root-"));
  const outside = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-view-outside-"));
  await symlink(outside, path.join(root, ".sysmlviz"), "dir");
  const store = new ViewStore(root);
  await assert.rejects(
    store.upsert("architecture", { name: "Unsafe" }, "root"),
    /symlinked persistence path/,
  );
  await assert.rejects(access(path.join(outside, "views.json")));
});

test("invalid numeric layout data is rejected before it can poison persistence", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-view-invalid-"));
  const store = new ViewStore(root);
  await store.upsert(
    "architecture",
    { positions: { thermostat: { x: 10, y: 20, pinned: true } } },
    "root",
  );

  await assert.rejects(
    store.upsert(
      "architecture",
      { positions: { thermostat: { x: Number.POSITIVE_INFINITY, y: 20, pinned: true } } },
      "root",
    ),
    /finite x\/y/,
  );

  const reloaded = await new ViewStore(root).load();
  assert.deepEqual(reloaded.views[0]?.positions.thermostat, { x: 10, y: 20, pinned: true });
});
