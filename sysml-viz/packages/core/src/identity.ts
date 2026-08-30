const FNV_OFFSET = 0xcbf29ce484222325n;
const FNV_PRIME = 0x100000001b3n;
const MASK_64 = 0xffffffffffffffffn;

/** Stable, dependency-free hash used for layout/rename fingerprints. */
export function stableHash(value: string): string {
  let hash = FNV_OFFSET;
  for (let index = 0; index < value.length; index += 1) {
    hash ^= BigInt(value.charCodeAt(index));
    hash = (hash * FNV_PRIME) & MASK_64;
  }
  return hash.toString(16).padStart(16, "0");
}

export function semanticId(kind: string, qualifiedName: string): string {
  return `${kind}:${qualifiedName}`;
}

export function occurrenceId(
  kind: string,
  qualifiedName: string,
  offset: number,
): string {
  return `${semanticId(kind, qualifiedName)}@${offset}`;
}

export function localName(qualifiedName: string): string {
  const pieces = qualifiedName.split("::");
  return pieces.at(-1) ?? qualifiedName;
}

export function normalizeQualifiedName(value: string): string {
  return value
    .replace(/\s*::\s*/gu, "::")
    .replace(/\s*\.\s*/gu, ".")
    .trim();
}

export function fingerprint(parts: readonly unknown[]): string {
  return stableHash(JSON.stringify(parts));
}
