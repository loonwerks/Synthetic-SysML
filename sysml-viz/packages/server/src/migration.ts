import {
  deriveDiagram,
  type AllocationModel,
  type ComponentDefinition,
  type ConnectionEndpoint,
  type DiagramEdge,
  type DiagramModel,
  type DiagramNode,
  type DiagramPort,
  type GumboContract,
  type NormalizedElement,
  type NormalizedModel,
  type PartUsage,
  type PortModel,
  type RequirementRecord,
} from "@sysml-viz/core";

import type { ViewDocument, ViewState } from "./types.js";

export interface ViewMigrationWarning {
  readonly code: string;
  readonly message: string;
  readonly oldIds: readonly string[];
  readonly candidates: readonly string[];
  readonly viewId?: string;
}

export interface ViewMigrationResult {
  readonly document: ViewDocument;
  readonly warnings: readonly ViewMigrationWarning[];
  /**
   * Old-to-new semantic IDs and derived diagram keys. Per-view keys are also
   * published as `view:<view id>:<old key>` because boundary-port keys do not
   * contain their diagram root and may mean different things in different views.
   */
  readonly mappings: Readonly<Record<string, string>>;
}

interface ModelIndex {
  readonly definitionsById: ReadonlyMap<string, ComponentDefinition>;
  readonly definitionsByQualifiedName: ReadonlyMap<string, readonly ComponentDefinition[]>;
  readonly definitionsByLocalName: ReadonlyMap<string, readonly ComponentDefinition[]>;
  readonly partsByOwner: ReadonlyMap<string, readonly PartUsage[]>;
  readonly portsByOwner: ReadonlyMap<string, readonly PortModel[]>;
  readonly connectionsByOwner: ReadonlyMap<string, NormalizedModel["connections"]>;
  readonly allocationsByOwner: ReadonlyMap<string, readonly AllocationModel[]>;
  readonly elementsByQualifiedName: ReadonlyMap<string, readonly NormalizedElement[]>;
}

type MutableMappings = Record<string, string>;
type WarningSink = (warning: ViewMigrationWarning) => void;

function groupedByOwner<T extends { readonly ownerDefinitionId: string }>(
  values: readonly T[],
): ReadonlyMap<string, readonly T[]> {
  const grouped = new Map<string, T[]>();
  for (const value of values) {
    const entries = grouped.get(value.ownerDefinitionId) ?? [];
    entries.push(value);
    grouped.set(value.ownerDefinitionId, entries);
  }
  return grouped;
}

function groupedBy<T, K extends string>(
  values: readonly T[],
  key: (value: T) => K,
): ReadonlyMap<K, readonly T[]> {
  const grouped = new Map<K, T[]>();
  for (const value of values) {
    const groupKey = key(value);
    const entries = grouped.get(groupKey) ?? [];
    entries.push(value);
    grouped.set(groupKey, entries);
  }
  return grouped;
}

function indexModel(model: NormalizedModel): ModelIndex {
  return {
    definitionsById: new Map(model.definitions.map((definition) => [definition.id, definition])),
    definitionsByQualifiedName: groupedBy(model.definitions, (definition) => definition.qualifiedName),
    definitionsByLocalName: groupedBy(model.definitions, (definition) => definition.name),
    partsByOwner: groupedByOwner(model.parts),
    portsByOwner: groupedByOwner(model.ports),
    connectionsByOwner: groupedByOwner(model.connections),
    allocationsByOwner: groupedByOwner(model.allocations),
    elementsByQualifiedName: groupedBy(
      Object.values(model.elements),
      (element) => element.qualifiedName,
    ),
  };
}

function normalizeTypeName(value: string | undefined): string {
  return (value ?? "").replace(/\s+/gu, "");
}

function portShape(port: PortModel): readonly unknown[] {
  return [port.portKind, port.direction, normalizeTypeName(port.typeName)];
}

/** A deliberately shallow, name-free description used to describe referenced types. */
function definitionSurface(index: ModelIndex, definition: ComponentDefinition): readonly unknown[] {
  return [
    definition.category,
    [...(index.partsByOwner.get(definition.id) ?? [])]
      .map((part) => part.category)
      .sort(),
    [...(index.portsByOwner.get(definition.id) ?? [])]
      .map((port) => portShape(port))
      .sort((left, right) => JSON.stringify(left).localeCompare(JSON.stringify(right))),
    index.connectionsByOwner.get(definition.id)?.length ?? 0,
    index.allocationsByOwner.get(definition.id)?.length ?? 0,
  ];
}

function partShape(index: ModelIndex, part: PartUsage): readonly unknown[] {
  const resolved = part.resolvedDefinitionId === undefined
    ? undefined
    : index.definitionsById.get(part.resolvedDefinitionId);
  return resolved === undefined
    ? [part.category, "unresolved", normalizeTypeName(part.typeName)]
    : [part.category, "resolved", definitionSurface(index, resolved)];
}

function endpointShape(
  model: NormalizedModel,
  index: ModelIndex,
  endpoint: ConnectionEndpoint,
): readonly unknown[] {
  const element = endpoint.resolvedElementId === undefined
    ? undefined
    : model.elements[endpoint.resolvedElementId];
  const port = endpoint.resolvedPortId === undefined
    ? undefined
    : model.elements[endpoint.resolvedPortId];
  const elementShape = element?.kind === "part-usage"
    ? ["part", partShape(index, element)]
    : element?.kind === "part-definition"
      ? ["definition", element.category]
      : [element?.kind ?? "unresolved"];
  return [
    endpoint.resolution,
    endpoint.path.length,
    elementShape,
    port?.kind === "port" ? portShape(port) : ["unresolved-port"],
  ];
}

function definitionSignature(
  model: NormalizedModel,
  index: ModelIndex,
  definition: ComponentDefinition,
): string {
  const base = definition.baseDefinitionId === undefined
    ? ["external", normalizeTypeName(definition.baseType)]
    : [
        "resolved",
        definitionSurface(
          index,
          index.definitionsById.get(definition.baseDefinitionId) ?? definition,
        ),
      ];
  const parts = [...(index.partsByOwner.get(definition.id) ?? [])]
    .map((part) => partShape(index, part))
    .sort((left, right) => JSON.stringify(left).localeCompare(JSON.stringify(right)));
  const ports = [...(index.portsByOwner.get(definition.id) ?? [])]
    .map((port) => portShape(port))
    .sort((left, right) => JSON.stringify(left).localeCompare(JSON.stringify(right)));
  const connections = [...(index.connectionsByOwner.get(definition.id) ?? [])]
    .map((connection) => [
      connection.connectionType,
      endpointShape(model, index, connection.source),
      endpointShape(model, index, connection.target),
    ])
    .sort((left, right) => JSON.stringify(left).localeCompare(JSON.stringify(right)));
  const allocations = [...(index.allocationsByOwner.get(definition.id) ?? [])]
    .map((allocation) => [
      allocation.allocationType,
      endpointShape(model, index, allocation.source),
      endpointShape(model, index, allocation.target),
    ])
    .sort((left, right) => JSON.stringify(left).localeCompare(JSON.stringify(right)));
  const contracts = model.contracts
    .filter((contract) => contract.ownerId === definition.id)
    .map((contract) => [
      contract.contractKind,
      contract.phase,
      contract.clauses.map((clause) => clause.kind).sort(),
    ])
    .sort((left, right) => JSON.stringify(left).localeCompare(JSON.stringify(right)));
  return JSON.stringify([
    definition.category,
    base,
    parts,
    ports,
    connections,
    allocations,
    contracts,
  ]);
}

function resolveTypeReference(
  model: NormalizedModel,
  index: ModelIndex,
  ownerDefinitionId: string,
  rawTypeName: string | undefined,
): ComponentDefinition | undefined {
  const typeName = normalizeTypeName(rawTypeName);
  if (typeName === "") return undefined;
  const directlyQualified = index.definitionsByQualifiedName.get(typeName);
  if (directlyQualified?.length === 1) return directlyQualified[0];
  const owner = index.definitionsById.get(ownerDefinitionId);
  if (owner !== undefined) {
    const ownerPackage = model.packages.find((candidate) => candidate.id === owner.packageId);
    if (ownerPackage !== undefined) {
      const samePackage = index.definitionsByQualifiedName.get(
        `${ownerPackage.qualifiedName}::${typeName}`,
      );
      if (samePackage?.length === 1) return samePackage[0];
    }
  }
  const localName = typeName.split("::").at(-1) ?? typeName;
  const local = index.definitionsByLocalName.get(localName);
  return local?.length === 1 ? local[0] : undefined;
}

function mappedPortType(
  model: NormalizedModel,
  index: ModelIndex,
  port: PortModel,
  mappings: Readonly<Record<string, string>> | undefined,
): string | undefined {
  const resolved = resolveTypeReference(model, index, port.ownerDefinitionId, port.typeName);
  if (resolved === undefined) return `type:${normalizeTypeName(port.typeName)}`;
  if (mappings === undefined) return `definition:${resolved.id}`;
  const mapped = mappings[resolved.id];
  return mapped === undefined ? undefined : `definition:${mapped}`;
}

function oldPartSignature(
  part: PartUsage,
  mappings: Readonly<Record<string, string>>,
): string | undefined {
  const owner = mappings[part.ownerDefinitionId];
  if (owner === undefined) return undefined;
  let type: string;
  if (part.resolvedDefinitionId === undefined) {
    type = `unresolved:${normalizeTypeName(part.typeName)}`;
  } else {
    const resolved = mappings[part.resolvedDefinitionId];
    if (resolved === undefined) return undefined;
    type = `definition:${resolved}`;
  }
  return JSON.stringify([owner, type, part.category]);
}

function newPartSignature(part: PartUsage): string {
  const type = part.resolvedDefinitionId === undefined
    ? `unresolved:${normalizeTypeName(part.typeName)}`
    : `definition:${part.resolvedDefinitionId}`;
  return JSON.stringify([part.ownerDefinitionId, type, part.category]);
}

function oldPortSignature(
  model: NormalizedModel,
  index: ModelIndex,
  port: PortModel,
  mappings: Readonly<Record<string, string>>,
): string | undefined {
  const owner = mappings[port.ownerDefinitionId];
  const type = mappedPortType(model, index, port, mappings);
  if (owner === undefined || type === undefined) return undefined;
  return JSON.stringify([owner, port.direction, type, port.portKind]);
}

function newPortSignature(
  model: NormalizedModel,
  index: ModelIndex,
  port: PortModel,
): string {
  return JSON.stringify([
    port.ownerDefinitionId,
    port.direction,
    mappedPortType(model, index, port, undefined),
    port.portKind,
  ]);
}

function oldEndpointSignature(
  endpoint: ConnectionEndpoint,
  mappings: Readonly<Record<string, string>>,
): readonly string[] | undefined {
  if (
    endpoint.resolution !== "resolved" ||
    endpoint.resolvedElementId === undefined ||
    endpoint.resolvedPortId === undefined
  ) {
    return undefined;
  }
  const element = mappings[endpoint.resolvedElementId];
  const port = mappings[endpoint.resolvedPortId];
  return element === undefined || port === undefined ? undefined : [element, port];
}

function newEndpointSignature(endpoint: ConnectionEndpoint): readonly string[] | undefined {
  if (
    endpoint.resolution !== "resolved" ||
    endpoint.resolvedElementId === undefined ||
    endpoint.resolvedPortId === undefined
  ) {
    return undefined;
  }
  return [endpoint.resolvedElementId, endpoint.resolvedPortId];
}

function oldConnectionSignature(
  connection: NormalizedModel["connections"][number],
  mappings: Readonly<Record<string, string>>,
): string | undefined {
  const owner = mappings[connection.ownerDefinitionId];
  const source = oldEndpointSignature(connection.source, mappings);
  const target = oldEndpointSignature(connection.target, mappings);
  if (owner === undefined || source === undefined || target === undefined) return undefined;
  return JSON.stringify([owner, connection.connectionType, source, target]);
}

function newConnectionSignature(
  connection: NormalizedModel["connections"][number],
): string | undefined {
  const source = newEndpointSignature(connection.source);
  const target = newEndpointSignature(connection.target);
  if (source === undefined || target === undefined) return undefined;
  return JSON.stringify([connection.ownerDefinitionId, connection.connectionType, source, target]);
}

function oldAllocationEndpointSignature(
  endpoint: ConnectionEndpoint,
  mappings: Readonly<Record<string, string>>,
): readonly (string | null)[] | undefined {
  if (endpoint.resolution !== "resolved" || endpoint.resolvedElementId === undefined) {
    return undefined;
  }
  const element = mappings[endpoint.resolvedElementId];
  if (element === undefined) return undefined;
  if (endpoint.resolvedPortId === undefined) return [element, null];
  const port = mappings[endpoint.resolvedPortId];
  return port === undefined ? undefined : [element, port];
}

function newAllocationEndpointSignature(
  endpoint: ConnectionEndpoint,
): readonly (string | null)[] | undefined {
  if (endpoint.resolution !== "resolved" || endpoint.resolvedElementId === undefined) {
    return undefined;
  }
  return [endpoint.resolvedElementId, endpoint.resolvedPortId ?? null];
}

function oldAllocationSignature(
  allocation: AllocationModel,
  mappings: Readonly<Record<string, string>>,
): string | undefined {
  const owner = mappings[allocation.ownerDefinitionId];
  const source = oldAllocationEndpointSignature(allocation.source, mappings);
  const target = oldAllocationEndpointSignature(allocation.target, mappings);
  if (owner === undefined || source === undefined || target === undefined) return undefined;
  return JSON.stringify([owner, allocation.allocationType, source, target]);
}

function newAllocationSignature(allocation: AllocationModel): string | undefined {
  const source = newAllocationEndpointSignature(allocation.source);
  const target = newAllocationEndpointSignature(allocation.target);
  if (source === undefined || target === undefined) return undefined;
  return JSON.stringify([allocation.ownerDefinitionId, allocation.allocationType, source, target]);
}

function normalizedText(value: string | undefined): string {
  return (value ?? "").replace(/\s+/gu, " ").trim();
}

function escapedRegularExpression(value: string): string {
  return value.replace(/[.*+?^${}()|[\]\\]/gu, "\\$&");
}

function normalizedExpression(
  model: NormalizedModel,
  expression: string,
  referencedPortIds: readonly string[],
  mappings: Readonly<Record<string, string>> | undefined,
  targetModel: NormalizedModel,
): string | undefined {
  let normalized = expression;
  if (mappings !== undefined) {
    const replacements: Array<{ readonly oldName: string; readonly newName: string }> = [];
    for (const oldPortId of referencedPortIds) {
      const oldPort = model.elements[oldPortId];
      const newPortId = mappings[oldPortId];
      const newPort = newPortId === undefined ? undefined : targetModel.elements[newPortId];
      if (oldPort?.kind !== "port" || newPort?.kind !== "port") return undefined;
      replacements.push({ oldName: oldPort.name, newName: newPort.name });
    }
    replacements.sort((left, right) => right.oldName.length - left.oldName.length);
    for (const replacement of replacements) {
      normalized = normalized.replace(
        new RegExp(
          `(?<![A-Za-z0-9_])${escapedRegularExpression(replacement.oldName)}(?![A-Za-z0-9_])`,
          "gu",
        ),
        replacement.newName,
      );
    }
  }
  return normalizedText(normalized);
}

function mappedPortReferences(
  references: readonly string[],
  mappings: Readonly<Record<string, string>> | undefined,
): readonly string[] | undefined {
  if (mappings === undefined) return [...references].sort();
  const result: string[] = [];
  for (const reference of references) {
    const mapped = mappings[reference];
    if (mapped === undefined) return undefined;
    result.push(mapped);
  }
  return result.sort();
}

function contractSignature(options: {
  readonly contract: GumboContract;
  readonly model: NormalizedModel;
  readonly targetModel: NormalizedModel;
  readonly mappings?: Readonly<Record<string, string>>;
}): string | undefined {
  const owner = options.mappings === undefined
    ? options.contract.ownerId
    : options.mappings[options.contract.ownerId];
  const references = mappedPortReferences(options.contract.referencedPortIds, options.mappings);
  const expression = normalizedExpression(
    options.model,
    options.contract.expression,
    options.contract.referencedPortIds,
    options.mappings,
    options.targetModel,
  );
  if (owner === undefined || references === undefined || expression === undefined) return undefined;
  const clauses: unknown[] = [];
  for (const clause of options.contract.clauses) {
    const clauseReferences = mappedPortReferences(clause.referencedPortIds, options.mappings);
    const clauseExpression = normalizedExpression(
      options.model,
      clause.expression,
      clause.referencedPortIds,
      options.mappings,
      options.targetModel,
    );
    if (clauseReferences === undefined || clauseExpression === undefined) return undefined;
    clauses.push([
      clause.kind,
      normalizedText(clause.description),
      clauseExpression,
      clauseReferences,
    ]);
  }
  return JSON.stringify([
    owner,
    options.contract.contractKind,
    options.contract.phase,
    normalizedText(options.contract.description),
    expression,
    references,
    clauses,
    [...options.contract.urls].sort(),
  ]);
}

function requirementContentSignature(options: {
  readonly requirement: RequirementRecord;
  readonly model: NormalizedModel;
  readonly targetModel: NormalizedModel;
  readonly mappings?: Readonly<Record<string, string>>;
}): string | undefined {
  const owner = options.mappings === undefined
    ? options.requirement.ownerId
    : options.mappings[options.requirement.ownerId];
  const references = mappedPortReferences(options.requirement.referencedPortIds, options.mappings);
  const expression = normalizedExpression(
    options.model,
    options.requirement.expression,
    options.requirement.referencedPortIds,
    options.mappings,
    options.targetModel,
  );
  if (owner === undefined || references === undefined || expression === undefined) return undefined;
  return JSON.stringify([
    owner,
    options.requirement.contractKind,
    options.requirement.phase,
    normalizedText(options.requirement.description),
    expression,
    references,
    [...options.requirement.urls].sort(),
  ]);
}

function oldRequirementSignature(
  requirement: RequirementRecord,
  oldModel: NormalizedModel,
  newModel: NormalizedModel,
  mappings: Readonly<Record<string, string>>,
): string | undefined {
  const contract = mappings[requirement.contractId];
  if (contract !== undefined) return JSON.stringify(["contract", contract]);
  const content = requirementContentSignature({
    requirement,
    model: oldModel,
    targetModel: newModel,
    mappings,
  });
  return content === undefined ? undefined : JSON.stringify(["content", content]);
}

function newRequirementSignature(
  requirement: RequirementRecord,
  newModel: NormalizedModel,
  mappedContractTargets: ReadonlySet<string>,
): string | undefined {
  if (mappedContractTargets.has(requirement.contractId)) {
    return JSON.stringify(["contract", requirement.contractId]);
  }
  const content = requirementContentSignature({
    requirement,
    model: newModel,
    targetModel: newModel,
  });
  return content === undefined ? undefined : JSON.stringify(["content", content]);
}

function addUniqueStructuralMatches<T extends { readonly id: string }>(options: {
  readonly label: string;
  readonly code: string;
  readonly oldValues: readonly T[];
  readonly newValues: readonly T[];
  readonly oldSignature: (value: T) => string | undefined;
  readonly newSignature: (value: T) => string | undefined;
  readonly mappings: MutableMappings;
  readonly warn: WarningSink;
}): void {
  const usedTargets = new Set(Object.values(options.mappings));
  const oldGroups = new Map<string, T[]>();
  const newGroups = new Map<string, T[]>();
  for (const value of options.oldValues) {
    if (options.mappings[value.id] !== undefined) continue;
    const signature = options.oldSignature(value);
    if (signature === undefined) continue;
    const group = oldGroups.get(signature) ?? [];
    group.push(value);
    oldGroups.set(signature, group);
  }
  for (const value of options.newValues) {
    if (usedTargets.has(value.id)) continue;
    const signature = options.newSignature(value);
    if (signature === undefined) continue;
    const group = newGroups.get(signature) ?? [];
    group.push(value);
    newGroups.set(signature, group);
  }
  for (const [signature, oldGroup] of oldGroups) {
    const newGroup = newGroups.get(signature) ?? [];
    const oldValue = oldGroup[0];
    const newValue = newGroup[0];
    if (oldGroup.length === 1 && newGroup.length === 1 && oldValue && newValue) {
      options.mappings[oldValue.id] = newValue.id;
      usedTargets.add(newValue.id);
      continue;
    }
    if (newGroup.length > 0) {
      options.warn({
        code: options.code,
        message: `Did not migrate ${options.label} layout state because its structural signature is ambiguous (${oldGroup.length} old, ${newGroup.length} new).`,
        oldIds: oldGroup.map((value) => value.id).sort(),
        candidates: newGroup.map((value) => value.id).sort(),
      });
    }
  }
}

function semanticMappings(
  oldModel: NormalizedModel,
  newModel: NormalizedModel,
  oldIndex: ModelIndex,
  newIndex: ModelIndex,
  warn: WarningSink,
): MutableMappings {
  const mappings: MutableMappings = {};
  for (const oldElement of Object.values(oldModel.elements)) {
    const newElement = newModel.elements[oldElement.id];
    if (newElement?.kind === oldElement.kind) mappings[oldElement.id] = newElement.id;
  }

  addUniqueStructuralMatches({
    label: "definition",
    code: "MIGRATION_AMBIGUOUS_DEFINITION",
    oldValues: oldModel.definitions,
    newValues: newModel.definitions,
    oldSignature: (definition) => definitionSignature(oldModel, oldIndex, definition),
    newSignature: (definition) => definitionSignature(newModel, newIndex, definition),
    mappings,
    warn,
  });
  addUniqueStructuralMatches({
    label: "part usage",
    code: "MIGRATION_AMBIGUOUS_PART",
    oldValues: oldModel.parts,
    newValues: newModel.parts,
    oldSignature: (part) => oldPartSignature(part, mappings),
    newSignature: (part) => newPartSignature(part),
    mappings,
    warn,
  });
  addUniqueStructuralMatches({
    label: "port",
    code: "MIGRATION_AMBIGUOUS_PORT",
    oldValues: oldModel.ports,
    newValues: newModel.ports,
    oldSignature: (port) => oldPortSignature(oldModel, oldIndex, port, mappings),
    newSignature: (port) => newPortSignature(newModel, newIndex, port),
    mappings,
    warn,
  });
  addUniqueStructuralMatches({
    label: "connection",
    code: "MIGRATION_AMBIGUOUS_CONNECTION",
    oldValues: oldModel.connections,
    newValues: newModel.connections,
    oldSignature: (connection) => oldConnectionSignature(connection, mappings),
    newSignature: newConnectionSignature,
    mappings,
    warn,
  });
  addUniqueStructuralMatches({
    label: "allocation",
    code: "MIGRATION_AMBIGUOUS_ALLOCATION",
    oldValues: oldModel.allocations,
    newValues: newModel.allocations,
    oldSignature: (allocation) => oldAllocationSignature(allocation, mappings),
    newSignature: newAllocationSignature,
    mappings,
    warn,
  });
  addUniqueStructuralMatches({
    label: "GUMBO contract",
    code: "MIGRATION_AMBIGUOUS_CONTRACT",
    oldValues: oldModel.contracts,
    newValues: newModel.contracts,
    oldSignature: (contract) =>
      contractSignature({
        contract,
        model: oldModel,
        targetModel: newModel,
        mappings,
      }),
    newSignature: (contract) =>
      contractSignature({
        contract,
        model: newModel,
        targetModel: newModel,
      }),
    mappings,
    warn,
  });
  const mappedContractTargets = new Set(
    oldModel.contracts.flatMap((contract) => {
      const mapped = mappings[contract.id];
      return mapped === undefined ? [] : [mapped];
    }),
  );
  addUniqueStructuralMatches({
    label: "requirement",
    code: "MIGRATION_AMBIGUOUS_REQUIREMENT",
    oldValues: oldModel.requirements,
    newValues: newModel.requirements,
    oldSignature: (requirement) =>
      oldRequirementSignature(requirement, oldModel, newModel, mappings),
    newSignature: (requirement) =>
      newRequirementSignature(requirement, newModel, mappedContractTargets),
    mappings,
    warn,
  });
  return mappings;
}

function resolveDefinitionRoot(
  model: NormalizedModel,
  index: ModelIndex,
  requested: string,
): ComponentDefinition | undefined {
  const direct = index.definitionsById.get(requested);
  if (direct !== undefined) return direct;
  const qualified = index.definitionsByQualifiedName.get(requested);
  if (qualified?.length === 1) return qualified[0];
  const element = model.elements[requested];
  if (element?.kind === "part-usage" && element.resolvedDefinitionId !== undefined) {
    return index.definitionsById.get(element.resolvedDefinitionId);
  }
  const usage = model.parts.filter((part) => part.qualifiedName === requested);
  if (usage.length === 1 && usage[0]?.resolvedDefinitionId !== undefined) {
    return index.definitionsById.get(usage[0].resolvedDefinitionId);
  }
  return undefined;
}

function remapSemanticReference(
  reference: string,
  mappings: Readonly<Record<string, string>>,
  oldIndex: ModelIndex,
): string {
  const direct = mappings[reference];
  if (direct !== undefined) return direct;
  const qualified = oldIndex.elementsByQualifiedName.get(reference);
  const oldElement = qualified?.length === 1 ? qualified[0] : undefined;
  return oldElement === undefined ? reference : (mappings[oldElement.id] ?? reference);
}

function nodeAncestors(nodeId: string): readonly string[] {
  if (!nodeId.startsWith("node:")) return [];
  const firstSlash = nodeId.indexOf("/");
  if (firstSlash < 0) return [];
  const prefix = nodeId.slice(0, firstSlash);
  const pieces = nodeId.slice(firstSlash + 1).split("/").filter((piece) => piece !== "");
  return pieces.map((_, index) => `${prefix}/${pieces.slice(0, index + 1).join("/")}`);
}

function edgeContextFromKey(edgeId: string): string | null {
  if (!edgeId.startsWith("edge:")) return null;
  const lastSlash = edgeId.lastIndexOf("/");
  if (lastSlash < 0) return null;
  const candidate = `node:${edgeId.slice("edge:".length, lastSlash)}`;
  return candidate.includes("/") ? candidate : null;
}

function collectExpansionKeys(view: ViewState): Set<string> {
  const result = new Set(view.expanded);
  const references = [
    ...Object.keys(view.positions),
    ...Object.keys(view.edgeRoutes),
    ...view.hidden,
    ...Object.keys(view.aliases),
    ...view.annotations.flatMap((annotation) =>
      annotation.linkedElementId === undefined ? [] : [annotation.linkedElementId]
    ),
  ];
  for (const reference of references) {
    for (const ancestor of nodeAncestors(reference)) result.add(ancestor);
    const edgeContext = edgeContextFromKey(reference);
    if (edgeContext !== null) {
      for (const ancestor of nodeAncestors(edgeContext)) result.add(ancestor);
    }
  }
  return result;
}

function addContextNodeMappings(
  oldDiagram: DiagramModel,
  newDiagram: DiagramModel,
  semantic: Readonly<Record<string, string>>,
  mappings: MutableMappings,
  viewId: string,
  warn: WarningSink,
): void {
  const usedTargets = new Set(Object.values(mappings));
  const newById = new Map(newDiagram.nodes.map((node) => [node.id, node]));
  for (const oldNode of oldDiagram.nodes) {
    if (mappings[oldNode.id] !== undefined) continue;
    const candidate = newById.get(oldNode.id);
    if (
      candidate !== undefined &&
      semantic[oldNode.elementId] === candidate.elementId &&
      !usedTargets.has(candidate.id)
    ) {
      mappings[oldNode.id] = candidate.id;
      usedTargets.add(candidate.id);
    }
  }

  const depths = [...new Set(oldDiagram.nodes.map((node) => node.depth))].sort(
    (left, right) => left - right,
  );
  for (const depth of depths) {
    const oldGroups = new Map<string, DiagramNode[]>();
    const newGroups = new Map<string, DiagramNode[]>();
    for (const oldNode of oldDiagram.nodes) {
      if (oldNode.depth !== depth || mappings[oldNode.id] !== undefined) continue;
      const element = semantic[oldNode.elementId];
      const parent = oldNode.parentNodeId === null ? null : mappings[oldNode.parentNodeId];
      if (element === undefined || (oldNode.parentNodeId !== null && parent === undefined)) continue;
      const signature = JSON.stringify([parent, element]);
      const group = oldGroups.get(signature) ?? [];
      group.push(oldNode);
      oldGroups.set(signature, group);
    }
    for (const newNode of newDiagram.nodes) {
      if (newNode.depth !== depth || usedTargets.has(newNode.id)) continue;
      const signature = JSON.stringify([newNode.parentNodeId, newNode.elementId]);
      const group = newGroups.get(signature) ?? [];
      group.push(newNode);
      newGroups.set(signature, group);
    }
    for (const [signature, oldGroup] of oldGroups) {
      const newGroup = newGroups.get(signature) ?? [];
      const oldNode = oldGroup[0];
      const newNode = newGroup[0];
      if (oldGroup.length === 1 && newGroup.length === 1 && oldNode && newNode) {
        mappings[oldNode.id] = newNode.id;
        usedTargets.add(newNode.id);
      } else if (newGroup.length > 0) {
        warn({
          code: "MIGRATION_AMBIGUOUS_DIAGRAM_NODE",
          message: "Did not migrate contextual node layout because the mapped parent and element identify multiple nodes.",
          oldIds: oldGroup.map((node) => node.id).sort(),
          candidates: newGroup.map((node) => node.id).sort(),
          viewId,
        });
      }
    }
  }
}

function addDiagramPortMappings(
  oldDiagram: DiagramModel,
  newDiagram: DiagramModel,
  semantic: Readonly<Record<string, string>>,
  contextual: MutableMappings,
): void {
  const matchPorts = (oldPorts: readonly DiagramPort[], newPorts: readonly DiagramPort[]): void => {
    const usedTargets = new Set(Object.values(contextual));
    for (const oldPort of oldPorts) {
      const mappedElement = semantic[oldPort.elementId];
      if (mappedElement === undefined) continue;
      const candidates = newPorts.filter(
        (candidate) => candidate.elementId === mappedElement && !usedTargets.has(candidate.id),
      );
      const candidate = candidates.length === 1 ? candidates[0] : undefined;
      if (candidate !== undefined) {
        contextual[oldPort.id] = candidate.id;
        usedTargets.add(candidate.id);
      }
    }
  };

  matchPorts(oldDiagram.boundaryPorts, newDiagram.boundaryPorts);
  for (const oldNode of oldDiagram.nodes) {
    const newNodeId = contextual[oldNode.id];
    if (newNodeId === undefined) continue;
    const newNode = newDiagram.nodes.find((candidate) => candidate.id === newNodeId);
    if (newNode !== undefined) matchPorts(oldNode.ports, newNode.ports);
  }
  for (const oldPort of oldDiagram.boundaryPorts) {
    const newPortId = contextual[oldPort.id];
    if (newPortId !== undefined) {
      contextual[`boundary:${oldPort.id}`] = `boundary:${newPortId}`;
    }
  }
}

function edgeContext(edge: DiagramEdge): string | null {
  return edge.depth === 0 ? null : edgeContextFromKey(edge.id);
}

function addDiagramEdgeMappings(
  oldDiagram: DiagramModel,
  newDiagram: DiagramModel,
  semantic: Readonly<Record<string, string>>,
  contextual: MutableMappings,
  viewId: string,
  warn: WarningSink,
): void {
  const usedTargets = new Set(Object.values(contextual));
  const newById = new Map(newDiagram.edges.map((edge) => [edge.id, edge]));
  for (const oldEdge of oldDiagram.edges) {
    const candidate = newById.get(oldEdge.id);
    if (
      candidate !== undefined &&
      semantic[oldEdge.elementId] === candidate.elementId &&
      !usedTargets.has(candidate.id)
    ) {
      contextual[oldEdge.id] = candidate.id;
      usedTargets.add(candidate.id);
    }
  }

  const oldGroups = new Map<string, DiagramEdge[]>();
  const newGroups = new Map<string, DiagramEdge[]>();
  for (const oldEdge of oldDiagram.edges) {
    if (contextual[oldEdge.id] !== undefined) continue;
    const element = semantic[oldEdge.elementId];
    const oldContext = edgeContext(oldEdge);
    const context = oldContext === null ? null : contextual[oldContext];
    if (element === undefined || (oldContext !== null && context === undefined)) continue;
    const signature = JSON.stringify([context, element]);
    const group = oldGroups.get(signature) ?? [];
    group.push(oldEdge);
    oldGroups.set(signature, group);
  }
  for (const newEdge of newDiagram.edges) {
    if (usedTargets.has(newEdge.id)) continue;
    const signature = JSON.stringify([edgeContext(newEdge), newEdge.elementId]);
    const group = newGroups.get(signature) ?? [];
    group.push(newEdge);
    newGroups.set(signature, group);
  }
  for (const [signature, oldGroup] of oldGroups) {
    const newGroup = newGroups.get(signature) ?? [];
    const oldEdge = oldGroup[0];
    const newEdge = newGroup[0];
    if (oldGroup.length === 1 && newGroup.length === 1 && oldEdge && newEdge) {
      contextual[oldEdge.id] = newEdge.id;
      usedTargets.add(newEdge.id);
    } else if (newGroup.length > 0) {
      warn({
        code: "MIGRATION_AMBIGUOUS_DIAGRAM_EDGE",
        message: "Did not migrate an edge route because its mapped connection occurs more than once in the same context.",
        oldIds: oldGroup.map((edge) => edge.id).sort(),
        candidates: newGroup.map((edge) => edge.id).sort(),
        viewId,
      });
    }
  }
}

function errorMessage(error: unknown): string {
  return error instanceof Error ? error.message : String(error);
}

function contextualMappings(options: {
  readonly oldModel: NormalizedModel;
  readonly newModel: NormalizedModel;
  readonly oldIndex: ModelIndex;
  readonly newIndex: ModelIndex;
  readonly semantic: Readonly<Record<string, string>>;
  readonly view: ViewState;
  readonly migratedRootId: string | null;
  readonly warn: WarningSink;
}): MutableMappings {
  const mappings: MutableMappings = {};
  if (options.view.rootId === null || options.migratedRootId === null) return mappings;
  const oldRoot = resolveDefinitionRoot(options.oldModel, options.oldIndex, options.view.rootId);
  const newRoot = resolveDefinitionRoot(options.newModel, options.newIndex, options.migratedRootId);
  if (oldRoot === undefined || newRoot === undefined) {
    options.warn({
      code: "MIGRATION_ROOT_UNMATCHED",
      message: `Could not derive contextual layout mappings for view '${options.view.id}' because its root no longer resolves uniquely.`,
      oldIds: [options.view.rootId],
      candidates: [],
      viewId: options.view.id,
    });
    return mappings;
  }

  const oldExpansion = collectExpansionKeys(options.view);
  let oldDiagram: DiagramModel;
  let newDiagram: DiagramModel;
  try {
    oldDiagram = deriveDiagram(options.oldModel, {
      rootId: oldRoot.id,
      expanded: [...oldExpansion],
    });
    const newExpansion = new Set<string>();
    for (const oldReference of oldExpansion) {
      const mapped = remapSemanticReference(oldReference, options.semantic, options.oldIndex);
      newExpansion.add(mapped);
    }
    newDiagram = deriveDiagram(options.newModel, {
      rootId: newRoot.id,
      expanded: [...newExpansion],
    });

    // A contextual expansion key is only knowable after its parent is visible.
    // Re-derive one level at a time as parent mappings unlock descendants.
    for (let iteration = 0; iteration < 10; iteration += 1) {
      addContextNodeMappings(
        oldDiagram,
        newDiagram,
        options.semantic,
        mappings,
        options.view.id,
        options.warn,
      );
      let addedExpansion = false;
      for (const oldReference of oldExpansion) {
        const mapped = mappings[oldReference];
        if (mapped !== undefined && !newExpansion.has(mapped)) {
          newExpansion.add(mapped);
          addedExpansion = true;
        }
      }
      if (!addedExpansion) break;
      newDiagram = deriveDiagram(options.newModel, {
        rootId: newRoot.id,
        expanded: [...newExpansion],
      });
    }
  } catch (error) {
    options.warn({
      code: "MIGRATION_DIAGRAM_DERIVATION_FAILED",
      message: `Could not derive contextual layout mappings for view '${options.view.id}': ${errorMessage(error)}`,
      oldIds: [options.view.rootId],
      candidates: [],
      viewId: options.view.id,
    });
    return mappings;
  }

  addContextNodeMappings(
    oldDiagram,
    newDiagram,
    options.semantic,
    mappings,
    options.view.id,
    options.warn,
  );
  addDiagramPortMappings(oldDiagram, newDiagram, options.semantic, mappings);
  addDiagramEdgeMappings(
    oldDiagram,
    newDiagram,
    options.semantic,
    mappings,
    options.view.id,
    options.warn,
  );
  return mappings;
}

function remapArray(values: readonly string[], remap: (value: string) => string): string[] {
  return [...new Set(values.map(remap))];
}

function remapRecord<T>(options: {
  readonly values: Readonly<Record<string, T>>;
  readonly remap: (value: string) => string;
  readonly field: string;
  readonly viewId: string;
  readonly warn: WarningSink;
}): Record<string, T> {
  const entries = Object.entries(options.values).map(([key, value]) => ({
    key,
    value,
    target: options.remap(key),
  }));
  // Existing exact keys win over a renamed key if a stale document happens to
  // contain both. The old value is retained under its old key for recovery.
  entries.sort((left, right) =>
    Number(left.target !== left.key) - Number(right.target !== right.key)
  );
  const result: Record<string, T> = {};
  for (const entry of entries) {
    if (!Object.hasOwn(result, entry.target)) {
      result[entry.target] = entry.value;
      continue;
    }
    if (entry.target !== entry.key && !Object.hasOwn(result, entry.key)) {
      result[entry.key] = entry.value;
    }
    options.warn({
      code: "MIGRATION_VIEW_KEY_COLLISION",
      message: `Did not overwrite an existing ${options.field} entry while migrating '${entry.key}' to '${entry.target}'.`,
      oldIds: [entry.key],
      candidates: [entry.target],
      viewId: options.viewId,
    });
  }
  return result;
}

/**
 * Migrate persisted visual state between two renderable in-session models.
 * Exact IDs always win. Rename recovery is intentionally conservative: only a
 * one-old-to-one-new structural signature is accepted.
 */
export function migrateViewDocument(
  oldModel: NormalizedModel,
  newModel: NormalizedModel,
  document: ViewDocument,
): ViewMigrationResult {
  const warnings: ViewMigrationWarning[] = [];
  const warningKeys = new Set<string>();
  const warn: WarningSink = (warning) => {
    const key = JSON.stringify([
      warning.code,
      warning.viewId ?? "",
      warning.oldIds,
      warning.candidates,
    ]);
    if (!warningKeys.has(key)) {
      warningKeys.add(key);
      warnings.push(warning);
    }
  };
  const oldIndex = indexModel(oldModel);
  const newIndex = indexModel(newModel);
  const semantic = semanticMappings(oldModel, newModel, oldIndex, newIndex, warn);
  const publishedMappings: MutableMappings = { ...semantic };

  const views = document.views.map((view): ViewState => {
    const migratedRootId = view.rootId === null
      ? null
      : remapSemanticReference(view.rootId, semantic, oldIndex);
    const contextual = contextualMappings({
      oldModel,
      newModel,
      oldIndex,
      newIndex,
      semantic,
      view,
      migratedRootId,
      warn,
    });
    for (const [oldKey, newKey] of Object.entries(contextual)) {
      const scopedKey = `view:${view.id}:${oldKey}`;
      publishedMappings[scopedKey] = newKey;
      const existing = publishedMappings[oldKey];
      if (existing === undefined || existing === newKey) publishedMappings[oldKey] = newKey;
    }
    const remap = (reference: string): string =>
      contextual[reference] ?? remapSemanticReference(reference, semantic, oldIndex);
    return {
      ...view,
      rootId: migratedRootId,
      positions: remapRecord({
        values: view.positions,
        remap,
        field: "position",
        viewId: view.id,
        warn,
      }),
      edgeRoutes: remapRecord({
        values: view.edgeRoutes,
        remap,
        field: "edge route",
        viewId: view.id,
        warn,
      }),
      hidden: remapArray(view.hidden, remap),
      expanded: remapArray(view.expanded, remap),
      aliases: remapRecord({
        values: view.aliases,
        remap,
        field: "alias",
        viewId: view.id,
        warn,
      }),
      annotations: view.annotations.map((annotation) =>
        ({
          ...annotation,
          ...(annotation.linkedElementId === undefined
            ? {}
            : { linkedElementId: remap(annotation.linkedElementId) }),
          ...(annotation.arrow === undefined
            ? {}
            : { arrow: { ...annotation.arrow, targetId: remap(annotation.arrow.targetId) } }),
        })
      ),
      constraints: (view.constraints ?? []).map((constraint) => ({
        ...constraint,
        subjectId: remap(constraint.subjectId),
        objectId: remap(constraint.objectId),
      })),
    };
  });

  return {
    document: { ...document, views },
    warnings,
    mappings: publishedMappings,
  };
}
