import { EventEmitter } from "node:events";
import { readdir } from "node:fs/promises";
import path from "node:path";

import { discoverSysmlFiles } from "@sysml-viz/core";

import { resolveBoundedDirectory, resolveDirectory } from "./paths.js";
import { SysmlVizSession } from "./session.js";
import type { ProjectConfiguration, SessionOptions } from "./types.js";

export class NoActiveProjectError extends Error {
  readonly code = "NO_ACTIVE_PROJECT";

  constructor() {
    super("No SysML project is open");
    this.name = "NoActiveProjectError";
  }
}

class ProjectSelectionError extends Error {
  constructor(readonly code: string, message: string) {
    super(message);
    this.name = "ProjectSelectionError";
  }
}

export interface ProjectPreview {
  root: string;
  libraryRoots: string[];
  include: string[];
  exclude: string[];
  projectFileCount: number;
  libraryFileCount: number;
  totalFileCount: number;
}

export class SessionManager {
  readonly events = new EventEmitter();
  readonly workspaceRoot: string;
  readonly session: SysmlVizSession;

  #active: SysmlVizSession | null = null;
  #switchTail: Promise<void> = Promise.resolve();
  #baseOptions: Omit<SessionOptions, "root" | "libraryRoots" | "include" | "exclude" | "workspaceRoot">;
  #forwardEvent = (event: unknown): void => {
    this.events.emit("event", event);
  };

  private constructor(workspaceRoot: string, options: SessionOptions) {
    this.workspaceRoot = workspaceRoot;
    const { root: _root, libraryRoots: _libraries, include: _include, exclude: _exclude, workspaceRoot: _workspace, ...base } = options;
    this.#baseOptions = base;
    const manager = this;
    this.session = new Proxy({} as SysmlVizSession, {
      get(_target, property) {
        if (property === "events") return manager.events;
        const active = manager.#active;
        if (!active) throw new NoActiveProjectError();
        const value = Reflect.get(active, property, active) as unknown;
        return typeof value === "function" ? value.bind(active) : value;
      },
    });
  }

  static async create(options: SessionOptions): Promise<SessionManager> {
    const workspaceRoot = await resolveDirectory(
      options.workspaceRoot ?? process.cwd(),
      "Workspace root",
    );
    const manager = new SessionManager(workspaceRoot, options);
    if (options.root) {
      await manager.switchProject({
        root: options.root,
        ...(options.libraryRoots === undefined ? {} : { libraryRoots: options.libraryRoots }),
        ...(options.include === undefined ? {} : { include: options.include }),
        ...(options.exclude === undefined ? {} : { exclude: options.exclude }),
      });
    }
    return manager;
  }

  get active(): SysmlVizSession | null {
    return this.#active;
  }

  async sessionState(): Promise<Record<string, unknown>> {
    if (!this.#active) {
      return {
        active: false,
        workspaceRoot: this.workspaceRoot,
        root: null,
        libraryRoots: [],
        include: [],
        exclude: [],
        files: [],
        fileRecords: [],
        revision: 0,
        viewRevision: 0,
        parseStatus: "idle",
        stale: false,
        diagnostics: [],
        validation: { status: "not-run", message: "Open a project to enable validation" },
      };
    }
    return { active: true, workspaceRoot: this.workspaceRoot, ...(await this.#active.snapshot()) };
  }

  async normalize(configuration: ProjectConfiguration): Promise<ProjectConfiguration> {
    if (typeof configuration.root !== "string" || !configuration.root.trim()) {
      throw new Error("Project root must be a non-empty path");
    }
    const root = await resolveBoundedDirectory(this.workspaceRoot, configuration.root, "Project root");
    const libraryRoots: string[] = [];
    for (const input of configuration.libraryRoots ?? []) {
      if (typeof input !== "string" || !input.trim()) throw new Error("Library roots must be non-empty paths");
      const canonical = await resolveBoundedDirectory(this.workspaceRoot, input, "Library root");
      if (canonical === root) throw new Error(`A library root cannot also be the project root: ${canonical}`);
      if (!libraryRoots.includes(canonical)) libraryRoots.push(canonical);
    }
    const include = this.patterns(configuration.include, "Include");
    const exclude = this.patterns(configuration.exclude, "Exclude");
    return { root, libraryRoots, include, exclude };
  }

  async preview(configuration: ProjectConfiguration): Promise<ProjectPreview> {
    const normalized = await this.normalize(configuration);
    const files = await discoverSysmlFiles(normalized);
    const projectFileCount = files.filter((file) => file.origin === "project").length;
    if (projectFileCount === 0) {
      throw new ProjectSelectionError(
        "NO_PROJECT_SYSML_FILES",
        `No project SysML files matched beneath ${normalized.root}. Check the root, include patterns, and default exclusions.`,
      );
    }
    return {
      root: normalized.root,
      libraryRoots: normalized.libraryRoots ?? [],
      include: normalized.include ?? [],
      exclude: normalized.exclude ?? [],
      projectFileCount,
      libraryFileCount: files.length - projectFileCount,
      totalFileCount: files.length,
    };
  }

  async switchProject(configuration: ProjectConfiguration): Promise<Record<string, unknown>> {
    let release!: () => void;
    const previous = this.#switchTail;
    this.#switchTail = new Promise<void>((resolve) => { release = resolve; });
    await previous;
    try {
      const normalized = await this.normalize(configuration);
      await this.preview(normalized);
      const next = await SysmlVizSession.create({
        ...this.#baseOptions,
        ...normalized,
        workspaceRoot: this.workspaceRoot,
      });
      const old = this.#active;
      old?.events.off("event", this.#forwardEvent);
      this.#active = next;
      next.events.on("event", this.#forwardEvent);
      this.events.emit("event", {
        type: "session.switched",
        at: new Date().toISOString(),
        revision: next.revision,
        data: await next.snapshot(),
      });
      if (old) await old.close();
      return await this.sessionState();
    } finally {
      release();
    }
  }

  async listDirectory(input?: string): Promise<Record<string, unknown>> {
    const directory = input?.trim()
      ? await resolveBoundedDirectory(this.workspaceRoot, input, "Directory")
      : this.workspaceRoot;
    const entries = await readdir(directory, { withFileTypes: true });
    const directories: Array<{ name: string; path: string }> = [];
    for (const entry of entries.sort((a, b) => a.name.localeCompare(b.name))) {
      if ((!entry.isDirectory() && !entry.isSymbolicLink()) || entry.name.startsWith(".")) continue;
      const candidate = path.join(directory, entry.name);
      try {
        const canonical = await resolveBoundedDirectory(this.workspaceRoot, candidate, "Directory");
        directories.push({ name: entry.name, path: canonical });
      } catch {
        // Hide inaccessible directories and symlink escapes.
      }
    }
    return {
      workspaceRoot: this.workspaceRoot,
      path: directory,
      parent: directory === this.workspaceRoot ? null : path.dirname(directory),
      directories,
    };
  }

  async close(): Promise<void> {
    await this.#switchTail;
    await this.#active?.close();
    this.#active = null;
  }

  private patterns(value: string[] | undefined, label: string): string[] {
    if (value === undefined) return [];
    if (!Array.isArray(value) || !value.every((entry) => typeof entry === "string")) {
      throw new Error(`${label} patterns must be an array of strings`);
    }
    return value.map((entry) => entry.trim()).filter(Boolean);
  }
}
