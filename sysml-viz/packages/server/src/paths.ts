import { realpath, stat } from "node:fs/promises";
import path from "node:path";

import { pathPatternMatcher } from "@sysml-viz/core";

const DEFAULT_EXCLUDED_SEGMENTS = new Set([
  ".git",
  ".slang",
  ".sysmlviz",
  ".cache",
  "__pycache__",
  "node_modules",
  "generated",
  "dist",
  "build",
  "out",
  "target",
  "hamr-output",
  "sysml-aadl-libraries",
]);

export async function resolveDirectory(input: string, label: string): Promise<string> {
  const absolute = path.resolve(input);
  let canonical: string;
  try {
    canonical = await realpath(absolute);
  } catch {
    throw new Error(`${label} does not exist: ${absolute}`);
  }
  const info = await stat(canonical);
  if (!info.isDirectory()) {
    throw new Error(`${label} is not a directory: ${canonical}`);
  }
  return canonical;
}

export async function resolveSessionRoots(
  root: string,
  libraryRoots: readonly string[] = [],
): Promise<{ root: string; libraryRoots: string[] }> {
  const canonicalRoot = await resolveDirectory(root, "Project root");
  const canonicalLibraries: string[] = [];
  for (const library of libraryRoots) {
    const canonical = await resolveDirectory(library, "Library root");
    if (canonical === canonicalRoot) {
      continue;
    }
    if (!canonicalLibraries.includes(canonical)) {
      canonicalLibraries.push(canonical);
    }
  }
  return { root: canonicalRoot, libraryRoots: canonicalLibraries };
}

export async function resolveBoundedDirectory(
  workspaceRoot: string,
  input: string,
  label: string,
): Promise<string> {
  const candidate = path.isAbsolute(input)
    ? input
    : path.resolve(workspaceRoot, input);
  const canonical = await resolveDirectory(candidate, label);
  if (!isWithinRoot(workspaceRoot, canonical)) {
    throw new Error(`${label} must remain inside workspace root ${workspaceRoot}`);
  }
  return canonical;
}

export function isWithinRoot(root: string, candidate: string): boolean {
  const relative = path.relative(root, candidate);
  return (
    relative === "" ||
    (relative !== ".." &&
      !relative.startsWith(`..${path.sep}`) &&
      !path.isAbsolute(relative))
  );
}

export function assertWithinRoot(root: string, candidate: string, label = "Path"): void {
  if (!isWithinRoot(root, path.resolve(candidate))) {
    throw new Error(`${label} must remain inside the configured project root`);
  }
}

export function isExcludedProjectPath(
  root: string,
  candidate: string,
  libraryRoots: readonly string[] = [],
  patterns: { include?: readonly string[]; exclude?: readonly string[] } = {},
): boolean {
  if (!isWithinRoot(root, candidate)) {
    return true;
  }
  if (
    libraryRoots.some(
      (libraryRoot) =>
        libraryRoot !== root &&
        isWithinRoot(root, libraryRoot) &&
        isWithinRoot(libraryRoot, candidate),
    )
  ) {
    return true;
  }
  const relative = path.relative(root, candidate);
  const segments = relative.split(path.sep).filter(Boolean);
  if (
    segments.some(
      (segment) => segment.startsWith(".") || DEFAULT_EXCLUDED_SEGMENTS.has(segment),
    )
  ) {
    return true;
  }
  const normalized = relative.split(path.sep).join("/");
  if (patterns.exclude?.length) {
    const excluded = pathPatternMatcher(patterns.exclude);
    const prefixes = segments.map((_, index) => segments.slice(0, index + 1).join("/"));
    if (prefixes.some((prefix) => excluded(prefix))) return true;
  }
  return Boolean(
    patterns.include?.length &&
      path.extname(candidate).toLowerCase() === ".sysml" &&
      !pathPatternMatcher(patterns.include)(normalized),
  );
}
