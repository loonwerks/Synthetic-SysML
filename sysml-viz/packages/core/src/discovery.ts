import { promises as fs } from "node:fs";
import path from "node:path";

import type { DiscoveredSysmlFile, DiscoveryOptions, SourceOrigin } from "./types.js";

const DEFAULT_PROJECT_EXCLUSIONS = new Set([
  ".git",
  ".slang",
  ".sysmlviz",
  ".cache",
  "__pycache__",
  "node_modules",
  "dist",
  "build",
  "out",
  "target",
  "generated",
  "hamr-output",
  // A copied dependency must be opted in through --library, never silently modeled.
  "sysml-aadl-libraries",
]);

const DEFAULT_LIBRARY_EXCLUSIONS = new Set([
  ".git",
  ".slang",
  ".sysmlviz",
  ".cache",
  "__pycache__",
  "node_modules",
  "dist",
  "build",
  "out",
  "target",
]);

export class DiscoveryError extends Error {
  public constructor(
    public readonly code: string,
    message: string,
    public readonly target: string,
  ) {
    super(message);
    this.name = "DiscoveryError";
  }
}

function normalizeRelative(value: string): string {
  return value
    .split(path.sep)
    .join("/")
    .replaceAll("\\", "/")
    .replace(/^(?:\.\/)+/u, "");
}

function isInside(candidate: string, root: string): boolean {
  const relative = path.relative(root, candidate);
  return (
    relative === "" ||
    (relative !== ".." &&
      !relative.startsWith(`..${path.sep}`) &&
      !path.isAbsolute(relative))
  );
}

function globRegex(pattern: string): RegExp {
  let expression = "";
  for (let index = 0; index < pattern.length; index += 1) {
    const character = pattern[index] ?? "";
    if (character === "*") {
      if (pattern[index + 1] === "*") {
        if (pattern[index + 2] === "/") {
          expression += "(?:.*/)?";
          index += 2;
        } else {
          expression += ".*";
          index += 1;
        }
      } else expression += "[^/]*";
    } else if (character === "?") expression += "[^/]";
    else expression += character.replace(/[|\\{}()[\]^$+?.]/gu, "\\$&");
  }
  return new RegExp(`^(?:${expression})$`, "u");
}

export function pathPatternMatcher(
  patterns: readonly string[],
): (relative: string, name?: string) => boolean {
  const matchers = patterns.map((entry) => {
    const normalized = normalizeRelative(entry).replace(/\/+$/u, "");
    return {
      basenameOnly: !normalized.includes("/"),
      normalized,
      regex: globRegex(normalized),
    };
  });
  return (relative, suppliedName) => {
    const normalizedRelative = normalizeRelative(relative);
    const normalizedName = normalizeRelative(
      suppliedName ?? normalizedRelative.split("/").at(-1) ?? normalizedRelative,
    );
    const name = normalizedName.split("/").at(-1) ?? "";
    return matchers.some(({ basenameOnly, normalized, regex }) => {
      if (!basenameOnly) return regex.test(normalizedRelative);
      return normalized.includes("*") || normalized.includes("?")
        ? regex.test(name)
        : name === normalized;
    });
  };
}

async function checkedDirectory(candidate: string, label: string): Promise<string> {
  const absolute = path.resolve(candidate);
  let real: string;
  try {
    real = await fs.realpath(absolute);
  } catch {
    throw new DiscoveryError(
      "SYSML_ROOT_NOT_FOUND",
      `${label} does not exist or is not accessible: ${absolute}`,
      absolute,
    );
  }
  const stat = await fs.stat(real);
  if (!stat.isDirectory()) {
    throw new DiscoveryError(
      "SYSML_ROOT_NOT_DIRECTORY",
      `${label} must be a directory: ${absolute}`,
      absolute,
    );
  }
  return real;
}

interface WalkOptions {
  readonly root: string;
  readonly origin: SourceOrigin;
  readonly libraryName?: string;
  readonly includeHidden: boolean;
  readonly excludes: ReadonlySet<string>;
  readonly customExcluded: (relative: string, name: string) => boolean;
  readonly included: ((relative: string, name: string) => boolean) | null;
  readonly nestedRoots: readonly string[];
}

async function walk(options: WalkOptions): Promise<DiscoveredSysmlFile[]> {
  const discovered: DiscoveredSysmlFile[] = [];

  const visit = async (directory: string): Promise<void> => {
    const entries = await fs.readdir(directory, { withFileTypes: true });
    entries.sort((left, right) => left.name.localeCompare(right.name));
    for (const entry of entries) {
      const absolute = path.join(directory, entry.name);
      const relative = normalizeRelative(path.relative(options.root, absolute));
      if (!options.includeHidden && entry.name.startsWith(".")) continue;
      if (options.excludes.has(entry.name)) continue;
      if (options.customExcluded(relative, entry.name)) continue;
      if (options.nestedRoots.some((nestedRoot) => isInside(absolute, nestedRoot))) {
        continue;
      }
      if (entry.isSymbolicLink()) {
        // Never follow directory links. A file link is accepted only when it remains bounded.
        let linked: string;
        try {
          linked = await fs.realpath(absolute);
        } catch {
          continue;
        }
        if (!isInside(linked, options.root)) continue;
        if (options.nestedRoots.some((nestedRoot) => isInside(linked, nestedRoot))) continue;
        const linkedStat = await fs.stat(linked).catch(() => null);
        // The link target may disappear between realpath and stat.
        if (!linkedStat) continue;
        if (!linkedStat.isFile() || path.extname(entry.name).toLowerCase() !== ".sysml") continue;
        if (options.included && !options.included(relative, entry.name)) continue;
        discovered.push({
          path: absolute,
          realPath: linked,
          relativePath: relative,
          root: options.root,
          origin: options.origin,
          ...(options.libraryName === undefined ? {} : { libraryName: options.libraryName }),
        });
      } else if (entry.isDirectory()) {
        await visit(absolute);
      } else if (
        entry.isFile() &&
        path.extname(entry.name).toLowerCase() === ".sysml" &&
        (!options.included || options.included(relative, entry.name))
      ) {
        discovered.push({
          path: absolute,
          realPath: absolute,
          relativePath: relative,
          root: options.root,
          origin: options.origin,
          ...(options.libraryName === undefined ? {} : { libraryName: options.libraryName }),
        });
      }
    }
  };

  await visit(options.root);
  return discovered;
}

/**
 * Discover only files below the exact configured roots. This function never searches a
 * parent, sibling, import-derived, or current-working-directory tree.
 */
export async function discoverSysmlFiles(
  options: DiscoveryOptions,
): Promise<readonly DiscoveredSysmlFile[]> {
  if (options.root.trim() === "") {
    throw new DiscoveryError("SYSML_ROOT_REQUIRED", "An explicit SysML project root is required.", options.root);
  }

  const projectRoot = await checkedDirectory(options.root, "Project root");
  const libraryRoots: string[] = [];
  for (const configured of options.libraryRoots ?? []) {
    const libraryRoot = await checkedDirectory(configured, "Library root");
    if (libraryRoot === projectRoot) {
      throw new DiscoveryError(
        "SYSML_LIBRARY_EQUALS_PROJECT_ROOT",
        `A library root cannot also be the project root: ${libraryRoot}`,
        libraryRoot,
      );
    }
    if (!libraryRoots.includes(libraryRoot)) libraryRoots.push(libraryRoot);
  }
  libraryRoots.sort();

  const customExcluded = pathPatternMatcher(options.exclude ?? []);
  const included = options.include?.length ? pathPatternMatcher(options.include) : null;
  const project = await walk({
    root: projectRoot,
    origin: "project",
    includeHidden: options.includeHidden ?? false,
    excludes: DEFAULT_PROJECT_EXCLUSIONS,
    customExcluded,
    included,
    nestedRoots: libraryRoots.filter((candidate) => isInside(candidate, projectRoot)),
  });

  const libraries: DiscoveredSysmlFile[] = [];
  for (const libraryRoot of libraryRoots) {
    libraries.push(
      ...(await walk({
        root: libraryRoot,
        origin: "library",
        libraryName: path.basename(libraryRoot),
        includeHidden: options.includeHidden ?? false,
        excludes: DEFAULT_LIBRARY_EXCLUSIONS,
        customExcluded,
        included: null,
        nestedRoots: [
          ...(isInside(projectRoot, libraryRoot) ? [projectRoot] : []),
          ...libraryRoots.filter(
            (candidate) => candidate !== libraryRoot && isInside(candidate, libraryRoot),
          ),
        ],
      })),
    );
  }

  // Project meaning wins for any unusual overlap; repeated libraries are collapsed by real path.
  const byRealPath = new Map<string, DiscoveredSysmlFile>();
  for (const file of [...project, ...libraries]) {
    if (!byRealPath.has(file.realPath)) byRealPath.set(file.realPath, file);
  }
  return [...byRealPath.values()].sort((left, right) => {
    if (left.origin !== right.origin) return left.origin === "project" ? -1 : 1;
    return left.path.localeCompare(right.path);
  });
}
