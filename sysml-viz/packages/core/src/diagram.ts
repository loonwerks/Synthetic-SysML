import { fingerprint } from "./identity.js";
import type {
  ComponentDefinition,
  ContractCounts,
  DeriveDiagramOptions,
  Diagnostic,
  DiagramEdge,
  DiagramModel,
  DiagramNode,
  DiagramPort,
  GumboContract,
  NormalizedModel,
  PartUsage,
  PortModel,
} from "./types.js";

export class ModelQueryError extends Error {
  public constructor(
    public readonly code: string,
    message: string,
    public readonly candidates: readonly string[] = [],
  ) {
    super(message);
    this.name = "ModelQueryError";
  }
}

function resolveRoot(model: NormalizedModel, query: string): ComponentDefinition {
  const byId = model.definitions.find((definition) => definition.id === query);
  if (byId !== undefined) return byId;
  const exact = model.definitions.filter(
    (definition) => definition.qualifiedName === query || definition.name === query,
  );
  if (exact.length === 1 && exact[0] !== undefined) return exact[0];
  if (exact.length > 1) {
    throw new ModelQueryError(
      "SYSML_AMBIGUOUS_ROOT",
      `Root '${query}' matches ${exact.length} definitions. Use a qualified name or semantic ID.`,
      exact.map((definition) => definition.id),
    );
  }
  throw new ModelQueryError(
    "SYSML_ROOT_NOT_FOUND",
    `No part definition matches root '${query}'.`,
    model.rootCandidates,
  );
}

function countContracts(
  ownerId: string,
  contracts: readonly GumboContract[],
  requirementOwnerIds: readonly string[],
): ContractCounts {
  const owned = contracts.filter((contract) => contract.ownerId === ownerId);
  return {
    invariants: owned.filter((contract) => contract.contractKind === "invariant").length,
    assumptions:
      owned.filter((contract) => contract.contractKind === "assume").length +
      owned.reduce(
        (count, contract) =>
          count + contract.clauses.filter((clause) => clause.kind === "assume").length,
        0,
      ),
    guarantees:
      owned.filter((contract) => contract.contractKind === "guarantee").length +
      owned.reduce(
        (count, contract) =>
          count + contract.clauses.filter((clause) => clause.kind === "guarantee").length,
        0,
      ),
    cases: owned.filter((contract) => contract.contractKind === "case").length,
    requirements: requirementOwnerIds.filter((candidate) => candidate === ownerId).length,
  };
}

function diagramPort(
  port: PortModel,
  ownerNodeId: string | null,
  boundary: boolean,
  aliases: Readonly<Record<string, string>>,
): DiagramPort {
  const scope = ownerNodeId ?? "boundary";
  return {
    id: `${scope}/port/${port.name}`,
    elementId: port.id,
    ownerNodeId,
    name: port.name,
    label: aliases[port.id] ?? port.name,
    direction: port.direction,
    ...(port.typeName === undefined ? {} : { typeName: port.typeName }),
    boundary,
    traceIds: port.traceIds,
    source: port.span,
  };
}

/** Derive an instance-oriented architecture view without expanding the entire model greedily. */
export function deriveDiagram(
  model: NormalizedModel,
  options: DeriveDiagramOptions,
): DiagramModel {
  const root = resolveRoot(model, options.rootId);
  const hidden = new Set(options.view?.hiddenElementIds ?? []);
  const aliases = options.view?.aliases ?? {};
  const expanded = new Set(options.expanded ?? []);
  const maxDepth = Math.max(1, options.maxDepth ?? 8);
  const definitionsById = new Map(model.definitions.map((definition) => [definition.id, definition]));
  const partsByOwner = new Map<string, PartUsage[]>();
  const portsByOwner = new Map<string, PortModel[]>();
  for (const part of model.parts) {
    const values = partsByOwner.get(part.ownerDefinitionId) ?? [];
    values.push(part);
    partsByOwner.set(part.ownerDefinitionId, values);
  }
  for (const port of model.ports) {
    const values = portsByOwner.get(port.ownerDefinitionId) ?? [];
    values.push(port);
    portsByOwner.set(port.ownerDefinitionId, values);
  }
  const requirementOwnerIds = model.requirements.map((requirement) => requirement.ownerId);
  const nodes: DiagramNode[] = [];
  const edges: DiagramEdge[] = [];
  const derivedDiagnostics: Diagnostic[] = [];
  const hiddenIds = new Set<string>();

  const boundaryPorts = (portsByOwner.get(root.id) ?? [])
    .filter((port) => !hidden.has(port.id))
    .map((port) => diagramPort(port, null, true, aliases));

  const addContext = (
    definition: ComponentDefinition,
    instancePath: readonly string[],
    containingNodeId: string | null,
    depth: number,
  ): void => {
    const contextParts = [...(partsByOwner.get(definition.id) ?? [])].sort((left, right) =>
      left.name.localeCompare(right.name),
    );
    const childByName = new Map<string, DiagramNode>();
    for (const part of contextParts) {
      const nodeId = `node:${root.id}/${[...instancePath, part.name].join("/")}`;
      if (hidden.has(part.id) || hidden.has(nodeId)) {
        hiddenIds.add(part.id);
        continue;
      }
      const childDefinition = part.resolvedDefinitionId === undefined
        ? undefined
        : definitionsById.get(part.resolvedDefinitionId);
      const isExpanded =
        childDefinition !== undefined &&
        depth < maxDepth &&
        (expanded.has(part.id) || expanded.has(nodeId));
      const childPorts = childDefinition === undefined
        ? []
        : (portsByOwner.get(childDefinition.id) ?? [])
            .filter((port) => !hidden.has(port.id))
            .map((port) => diagramPort(port, nodeId, false, aliases));
      const node: DiagramNode = {
        id: nodeId,
        elementId: part.id,
        instancePath: [...instancePath, part.name],
        parentNodeId: containingNodeId,
        name: part.name,
        label: aliases[part.id] ?? part.name,
        typeName: part.typeName,
        ...(childDefinition === undefined ? {} : { definitionId: childDefinition.id }),
        category: childDefinition?.category ?? part.category,
        depth,
        canExpand: childDefinition !== undefined &&
          (partsByOwner.get(childDefinition.id)?.length ?? 0) > 0,
        expanded: isExpanded,
        ports: childPorts,
        contracts: countContracts(
          childDefinition?.id ?? part.id,
          model.contracts,
          requirementOwnerIds,
        ),
        traceIds: [...new Set([...part.traceIds, ...(childDefinition?.traceIds ?? [])])],
        source: part.span,
      };
      nodes.push(node);
      childByName.set(part.name, node);
      if (isExpanded && childDefinition !== undefined) {
        addContext(childDefinition, node.instancePath, node.id, depth + 1);
      }
    }

    const contextConnections = model.connections
      .filter((connection) => connection.ownerDefinitionId === definition.id)
      .sort((left, right) => left.name.localeCompare(right.name));
    const containingPorts = containingNodeId === null
      ? boundaryPorts
      : nodes.find((node) => node.id === containingNodeId)?.ports ?? [];

    const resolveEndpoint = (
      endpointPath: readonly string[],
    ): { nodeId: string | null; portId: string | null; hidden: boolean } => {
      if (endpointPath.length === 1) {
        const port = containingPorts.find((candidate) => candidate.name === endpointPath[0]);
        return { nodeId: containingNodeId, portId: port?.id ?? null, hidden: false };
      }
      const child = childByName.get(endpointPath[0] ?? "");
      if (child === undefined) {
        const hiddenPart = contextParts.find((part) => part.name === endpointPath[0]);
        return {
          nodeId: null,
          portId: null,
          hidden: hiddenPart !== undefined && hiddenIds.has(hiddenPart.id),
        };
      }
      const portName = endpointPath.at(-1);
      const port = child.ports.find((candidate) => candidate.name === portName);
      return { nodeId: child.id, portId: port?.id ?? null, hidden: false };
    };

    for (const connection of contextConnections) {
      if (hidden.has(connection.id)) {
        hiddenIds.add(connection.id);
        continue;
      }
      const source = resolveEndpoint(connection.source.path);
      const target = resolveEndpoint(connection.target.path);
      if (source.hidden || target.hidden) {
        hiddenIds.add(connection.id);
        continue;
      }
      const unresolved = source.portId === null || target.portId === null;
      const edgeId = `edge:${root.id}/${[...instancePath, connection.name].join("/")}`;
      edges.push({
        id: edgeId,
        elementId: connection.id,
        name: connection.name,
        label: aliases[connection.id] ?? connection.name,
        sourceNodeId: source.nodeId,
        sourcePortId: source.portId,
        targetNodeId: target.nodeId,
        targetPortId: target.portId,
        sourcePath: connection.source.path,
        targetPath: connection.target.path,
        unresolved,
        depth,
        traceIds: connection.traceIds,
        source: connection.span,
      });
      if (unresolved) {
        derivedDiagnostics.push({
          code: "DIAGRAM_UNRESOLVED_ENDPOINT",
          severity: "warning",
          fatal: false,
          message: `Diagram edge '${connection.name}' has an unresolved endpoint (${connection.source.raw} -> ${connection.target.raw}).`,
          span: connection.span,
          hint: "Load the referenced type through the project root or an explicit library root.",
        });
      }
    }
  };

  addContext(root, [], null, 0);
  nodes.sort((left, right) => left.id.localeCompare(right.id));
  edges.sort((left, right) => left.id.localeCompare(right.id));
  return {
    version: 1,
    id: `diagram:${fingerprint([root.id, [...expanded].sort(), [...hidden].sort()])}`,
    rootDefinitionId: root.id,
    rootQualifiedName: root.qualifiedName,
    title: aliases[root.id] ?? root.name,
    nodes,
    boundaryPorts,
    edges,
    hiddenElementIds: [...hiddenIds].sort(),
    diagnostics: derivedDiagnostics,
  };
}
