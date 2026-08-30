import { isDeepStrictEqual } from "node:util";

import { deriveDiagram, type NormalizedModel } from "@sysml-viz/core";

import type { NodeLayout, ViewPresetMarker, ViewState } from "./types.js";

export const FAA_A1_PRESET_ID = "faa-a1";
export const FAA_A1_PRESET_VERSION = 1;

export type ViewPresetDefinition = Omit<ViewState, "preset" | "updatedAt"> & {
  preset: ViewPresetMarker;
};

export type PresetReconciliation =
  | { action: "adopted" | "upgraded"; view: ViewState }
  | { action: "unchanged" | "refused"; view: ViewState };

type Annotation = ViewState["annotations"][number];
type OptionalPresentationKey = "showPorts" | "showEdgeLabels" | "showTypes";

const ABSENT = Symbol("absent");

function own(value: object, key: PropertyKey): boolean {
  return Object.prototype.hasOwnProperty.call(value, key);
}

function clone<T>(value: T): T {
  return structuredClone(value);
}

function mergeValue<T>(current: T, previous: T, next: T): T {
  return clone(isDeepStrictEqual(current, previous) ? next : current);
}

function mergeRecord<T>(
  current: Readonly<Record<string, T>>,
  previous: Readonly<Record<string, T>>,
  next: Readonly<Record<string, T>>,
): Record<string, T> {
  const result: Record<string, T> = {};
  const keys = [...new Set([
    ...Object.keys(current),
    ...Object.keys(previous),
    ...Object.keys(next),
  ])].sort();
  for (const key of keys) {
    const hasCurrent = own(current, key);
    const hadPrevious = own(previous, key);
    const hasNext = own(next, key);
    const currentValue = current[key];
    const previousValue = previous[key];
    const nextValue = next[key];
    if (hasCurrent && currentValue !== undefined) {
      if (hadPrevious && previousValue !== undefined && isDeepStrictEqual(currentValue, previousValue)) {
        if (hasNext && nextValue !== undefined) result[key] = clone(nextValue);
      } else {
        result[key] = clone(currentValue);
      }
    } else if (!hadPrevious && hasNext && nextValue !== undefined) {
      result[key] = clone(nextValue);
    }
  }
  return result;
}

function mergeSetArray(
  current: readonly string[],
  previous: readonly string[],
  next: readonly string[],
): string[] {
  const currentSet = new Set(current);
  const previousSet = new Set(previous);
  const removedByUser = new Set(previous.filter((value) => !currentSet.has(value)));
  const result = next.filter((value) => !removedByUser.has(value));
  const included = new Set(result);
  for (const value of current) {
    if (!previousSet.has(value) && !included.has(value)) {
      result.push(value);
      included.add(value);
    }
  }
  return result;
}

function annotationsById(annotations: readonly Annotation[]): Record<string, Annotation> {
  return Object.fromEntries(annotations.map((annotation) => [annotation.id, annotation]));
}

function mergeAnnotations(
  current: readonly Annotation[],
  previous: readonly Annotation[],
  next: readonly Annotation[],
): Annotation[] {
  const merged = mergeRecord(
    annotationsById(current),
    annotationsById(previous),
    annotationsById(next),
  );
  const orderedIds = [...new Set([
    ...next.map((annotation) => annotation.id),
    ...current.map((annotation) => annotation.id),
    ...Object.keys(merged).sort(),
  ])];
  return orderedIds.flatMap((id) => merged[id] === undefined ? [] : [merged[id]]);
}

function mergeOptionalPresentation(
  key: OptionalPresentationKey,
  current: ViewState,
  previous: ViewPresetDefinition,
  next: ViewPresetDefinition,
): boolean | typeof ABSENT {
  const hasCurrent = own(current, key);
  const hadPrevious = own(previous, key);
  const hasNext = own(next, key);
  if (hasCurrent) {
    if (hadPrevious && current[key] === previous[key]) {
      return hasNext ? next[key] ?? ABSENT : ABSENT;
    }
    return current[key] ?? ABSENT;
  }
  if (hadPrevious) return ABSENT;
  return hasNext ? next[key] ?? ABSENT : ABSENT;
}

/**
 * Apply a field-aware three-way preset upgrade. A value still equal to the
 * prior preset follows the new preset; a user deviation wins. Maps and set-like
 * filters merge per key/member so new defaults do not erase custom layout.
 */
export function threeWayMergePresetView(
  current: ViewState,
  previous: ViewPresetDefinition,
  next: ViewPresetDefinition,
): ViewState {
  if (previous.preset.id !== next.preset.id) {
    throw new Error("Cannot merge definitions from different view presets");
  }
  const showPorts = mergeOptionalPresentation("showPorts", current, previous, next);
  const showEdgeLabels = mergeOptionalPresentation("showEdgeLabels", current, previous, next);
  const showTypes = mergeOptionalPresentation("showTypes", current, previous, next);
  return {
    id: current.id,
    name: mergeValue(current.name, previous.name, next.name),
    preset: clone(next.preset),
    rootId: mergeValue(current.rootId, previous.rootId, next.rootId),
    positions: mergeRecord(current.positions, previous.positions, next.positions),
    edgeRoutes: mergeRecord(current.edgeRoutes, previous.edgeRoutes, next.edgeRoutes),
    hidden: mergeSetArray(current.hidden, previous.hidden, next.hidden),
    expanded: mergeSetArray(current.expanded, previous.expanded, next.expanded),
    aliases: mergeRecord(current.aliases, previous.aliases, next.aliases),
    annotations: mergeAnnotations(current.annotations, previous.annotations, next.annotations),
    constraints: mergeSetArray(
      (current.constraints ?? []).map((item) => JSON.stringify(item)),
      (previous.constraints ?? []).map((item) => JSON.stringify(item)),
      (next.constraints ?? []).map((item) => JSON.stringify(item)),
    ).map((item) => JSON.parse(item) as NonNullable<ViewState["constraints"]>[number]),
    presentationNodes: clone(current.presentationNodes ?? next.presentationNodes ?? []),
    presentationEdges: clone(current.presentationEdges ?? next.presentationEdges ?? []),
    ...(showPorts === ABSENT ? {} : { showPorts }),
    ...(showEdgeLabels === ABSENT ? {} : { showEdgeLabels }),
    ...(showTypes === ABSENT ? {} : { showTypes }),
    camera: mergeValue(current.camera, previous.camera, next.camera),
    updatedAt: current.updatedAt,
  };
}

/** Exact matching is intentionally conservative for an unmarked legacy view. */
export function matchesExactLegacyPreset(
  current: ViewState,
  definition: ViewPresetDefinition,
): boolean {
  const { preset: _currentPreset, updatedAt: _updatedAt, ...currentFields } = current;
  const { preset: _definitionPreset, ...definitionFields } = definition;
  return isDeepStrictEqual(currentFields, definitionFields);
}

/**
 * Adopt an exact legacy preset or upgrade a marked older version. Unknown,
 * mismatched, and newer markers are fail-closed and left byte-for-byte alone.
 */
export function reconcilePresetView(
  current: ViewState,
  definitions: readonly ViewPresetDefinition[],
  legacyMatcher: (view: ViewState, definition: ViewPresetDefinition) => boolean = matchesExactLegacyPreset,
): PresetReconciliation {
  if (definitions.length === 0) return { action: "refused", view: current };
  const ordered = [...definitions].sort((left, right) => left.preset.version - right.preset.version);
  const latest = ordered.at(-1);
  if (!latest) return { action: "refused", view: current };
  if (
    ordered.some((definition) => definition.preset.id !== latest.preset.id) ||
    new Set(ordered.map((definition) => definition.preset.version)).size !== ordered.length
  ) {
    throw new Error("View preset definitions must have one ID and unique versions");
  }
  if (!current.preset) {
    return legacyMatcher(current, latest)
      ? { action: "adopted", view: { ...current, preset: clone(latest.preset) } }
      : { action: "refused", view: current };
  }
  if (current.preset.id !== latest.preset.id || current.preset.version > latest.preset.version) {
    return { action: "refused", view: current };
  }
  if (current.preset.version === latest.preset.version) {
    return { action: "unchanged", view: current };
  }
  const previous = ordered.find(
    (definition) => definition.preset.version === current.preset?.version,
  );
  if (!previous) return { action: "refused", view: current };
  return {
    action: "upgraded",
    view: threeWayMergePresetView(current, previous, latest),
  };
}

function buildFaaA1Preset(model: NormalizedModel): ViewPresetDefinition | null {
  const environment = model.definitions.find(
    (definition) =>
      definition.qualifiedName ===
      "Isolette_Environment::Isolette_Environment_Normal_Operation_Normal_Operation",
  );
  if (!environment) return null;
  const incubatorPart = model.parts.find(
    (part) => part.ownerDefinitionId === environment.id && part.name === "anIncubator",
  );
  if (!incubatorPart) return null;

  const expanded = [incubatorPart.id];
  const preview = deriveDiagram(model, { rootId: environment.id, expanded });
  const byName = new Map(preview.nodes.map((node) => [node.name, node]));
  const positions: Record<string, NodeLayout> = {};
  const place = (
    name: string,
    x: number,
    y: number,
    width?: number,
    height?: number,
  ): void => {
    const node = byName.get(name);
    if (node) {
      positions[node.id] = {
        x,
        y,
        pinned: true,
        ...(width === undefined ? {} : { width }),
        ...(height === undefined ? {} : { height }),
      };
    }
  };
  place("anIncubator", 70, 140, 1_060, 560);
  place("operator_interface", 430, 180);
  place("thermostat", 430, 390);
  place("temperature_sensor", 70, 390);
  place("heat_source", 820, 390);
  place("theAir", 430, 610);
  place("aNurse", 430, 0);
  place("anInfant", 430, 800);

  const aliases: Record<string, string> = { [environment.id]: "FAA A-1 · Isolette Context" };
  const aliasElement = (
    kind: "part" | "connection",
    owner: string,
    name: string,
    label: string,
  ): void => {
    const collection = kind === "part" ? model.parts : model.connections;
    const element = collection.find(
      (candidate) => candidate.ownerDefinitionId === owner && candidate.name === name,
    );
    if (element) aliases[element.id] = label;
  };
  aliasElement("part", environment.id, "anIncubator", "Isolette");
  aliasElement("part", environment.id, "theAir", "Air");
  aliasElement("part", environment.id, "aNurse", "Nurse");
  aliasElement("part", environment.id, "anInfant", "Infant");
  aliasElement("connection", environment.id, "a2i", "Heat");
  aliasElement("connection", environment.id, "hs2a", "Heat");
  aliasElement("connection", environment.id, "tmp", "Heat");
  aliasElement("connection", environment.id, "n2ioc", "");
  aliasElement("connection", environment.id, "n2oivi", "");
  aliasElement("connection", environment.id, "n2ioa", "Operator Feedback");

  const presentationHiddenIds: string[] = [];
  const hideConnections = (owner: string, names: readonly string[]): void => {
    const hiddenNames = new Set(names);
    presentationHiddenIds.push(
      ...model.connections
        .filter(
          (connection) =>
            connection.ownerDefinitionId === owner && hiddenNames.has(connection.name),
        )
        .map((connection) => connection.id),
    );
  };
  hideConnections(environment.id, ["n2ioa"]);
  const implementation = model.definitions.find(
    (definition) => definition.qualifiedName === "Isolette::Isolette_Single_Sensor",
  );
  if (implementation) {
    aliasElement("part", implementation.id, "operator_interface", "Operator Interface");
    aliasElement("part", implementation.id, "thermostat", "Thermostat");
    aliasElement("part", implementation.id, "temperature_sensor", "Temperature Sensor");
    aliasElement("part", implementation.id, "heat_source", "Heat Source");
    aliasElement("connection", implementation.id, "ct", "Current Temperature");
    aliasElement("connection", implementation.id, "hc", "Heat Control");
    for (const name of ["a2ts", "hs", "oioc", "oiovi"]) {
      aliasElement("connection", implementation.id, name, "");
    }
    for (const name of ["ldt", "udt", "lat", "uat"]) {
      aliasElement("connection", implementation.id, name, "Operator Settings");
    }
    for (const name of ["rs", "ms", "dt", "al"]) {
      aliasElement("connection", implementation.id, name, "Operator Feedback");
    }
    hideConnections(implementation.id, [
      "a2ts",
      "al",
      "hs",
      "lat",
      "ms",
      "oioa",
      "oioc",
      "oiovi",
      "rs",
      "uat",
      "udt",
    ]);
  }

  const processor = preview.nodes.find((node) => node.name === "isolette_processor");
  const heatLoss = model.ports.find(
    (port) => port.ownerDefinitionId === environment.id && port.name === "heat_loss",
  );
  const heatLossConnection = model.connections.find(
    (connection) => connection.ownerDefinitionId === environment.id && connection.name === "hl",
  );
  const edgeRoutes: ViewState["edgeRoutes"] = {};
  const route = (name: string, points: Array<{ x: number; y: number }>): void => {
    const edge = preview.edges.find((candidate) => candidate.name === name);
    if (edge) edgeRoutes[edge.id] = { pinned: true, points };
  };
  route("a2i", [{ x: 555, y: 688 }, { x: 555, y: 800 }]);
  route("ct", [{ x: 320, y: 429 }, { x: 430, y: 429 }]);
  route("dt", [{ x: 610, y: 390 }, { x: 610, y: 258 }]);
  route("hc", [{ x: 680, y: 429 }, { x: 820, y: 429 }]);
  route("ldt", [{ x: 500, y: 258 }, { x: 500, y: 390 }]);
  route("hs2a", [{ x: 945, y: 468 }, { x: 945, y: 649 }, { x: 680, y: 649 }]);
  route("n2ioc", [{ x: 520, y: 78 }, { x: 520, y: 180 }]);
  route("n2oivi", [{ x: 590, y: 180 }, { x: 590, y: 78 }]);
  route("tmp", [{ x: 430, y: 649 }, { x: 195, y: 649 }, { x: 195, y: 468 }]);

  return {
    id: FAA_A1_PRESET_ID,
    name: "FAA Figure A-1",
    preset: { id: FAA_A1_PRESET_ID, version: FAA_A1_PRESET_VERSION },
    rootId: environment.id,
    positions,
    edgeRoutes,
    expanded,
    hidden: [
      ...(processor ? [processor.elementId] : []),
      ...(heatLoss ? [heatLoss.id] : []),
      ...(heatLossConnection ? [heatLossConnection.id] : []),
      ...presentationHiddenIds,
    ],
    aliases,
    annotations: [
      {
        id: "faa-a1-provenance",
        text: "Curated presentation view of FAA Figure A-1. Air is visually grouped with the Isolette while its semantic parent remains the environment model.",
        position: { x: 740, y: 735 },
      },
    ],
    constraints: [],
    presentationNodes: [],
    presentationEdges: [],
    showPorts: false,
    showEdgeLabels: true,
    showTypes: false,
    camera: { x: 0, y: 0, zoom: 0.78 },
  };
}

/** Kept as a version list so adding v2 requires retaining the v1 builder. */
export function faaA1PresetDefinitions(model: NormalizedModel): ViewPresetDefinition[] {
  const current = buildFaaA1Preset(model);
  return current ? [current] : [];
}
