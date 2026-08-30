import { ModelQueryError } from "./diagram.js";
import type {
  ElementInspection,
  ModelSummary,
  NormalizedElement,
  NormalizedModel,
  RequirementRecord,
} from "./types.js";

export function summarizeModel(model: NormalizedModel): ModelSummary {
  const files = model.files;
  return {
    projectRoot: model.projectRoot,
    projectFileCount: files.filter((file) => file.origin === "project").length,
    libraryFileCount: files.filter((file) => file.origin === "library").length,
    packageCount: model.packages.length,
    definitionCount: model.definitions.length,
    partCount: model.parts.length,
    portCount: model.ports.length,
    connectionCount: model.connections.length,
    allocationCount: model.allocations.length,
    contractCount: model.contracts.length,
    requirementCount: model.requirements.length,
    rootCandidates: model.rootCandidates
      .map((id) => model.definitions.find((definition) => definition.id === id))
      .filter((definition) => definition !== undefined)
      .map((definition) => ({
        id: definition.id,
        qualifiedName: definition.qualifiedName,
        category: definition.category,
        partCount: definition.partIds.length,
        portCount: definition.portIds.length,
        contractCount: model.contracts.filter((contract) => contract.ownerId === definition.id).length,
        source: definition.span,
      })),
  };
}

export function findRequirements(
  model: NormalizedModel,
  query = "",
): readonly RequirementRecord[] {
  const normalized = query.trim().toLocaleLowerCase();
  const score = (requirement: RequirementRecord): number => {
    if (normalized === "") return 1;
    const id = requirement.requirementId.toLocaleLowerCase();
    if (id === normalized) return 100;
    if (id.startsWith(normalized)) return 75;
    if (id.includes(normalized)) return 60;
    if ((requirement.description ?? "").toLocaleLowerCase().includes(normalized)) return 30;
    if (requirement.expression.toLocaleLowerCase().includes(normalized)) return 20;
    const owner = model.elements[requirement.ownerId];
    if (owner?.qualifiedName.toLocaleLowerCase().includes(normalized)) return 10;
    return 0;
  };
  return model.requirements
    .map((requirement) => ({ requirement, score: score(requirement) }))
    .filter((entry) => entry.score > 0)
    .sort(
      (left, right) =>
        right.score - left.score ||
        left.requirement.requirementId.localeCompare(right.requirement.requirementId) ||
        left.requirement.span.start.offset - right.requirement.span.start.offset,
    )
    .map((entry) => entry.requirement);
}

function resolveElement(model: NormalizedModel, query: string): NormalizedElement {
  const direct = model.elements[query];
  if (direct !== undefined) return direct;
  const candidates = Object.values(model.elements).filter(
    (element) =>
      element.qualifiedName === query ||
      (element.kind === "requirement" ? element.requirementId === query : element.name === query),
  );
  if (candidates.length === 1 && candidates[0] !== undefined) return candidates[0];
  if (candidates.length > 1) {
    throw new ModelQueryError(
      "SYSML_AMBIGUOUS_ELEMENT",
      `Element '${query}' is ambiguous; use a qualified name or semantic ID.`,
      candidates.map((candidate) => candidate.id).sort(),
    );
  }
  throw new ModelQueryError("SYSML_ELEMENT_NOT_FOUND", `Element '${query}' was not found.`);
}

export function inspectElement(model: NormalizedModel, query: string): ElementInspection {
  const element = resolveElement(model, query);
  let owner: NormalizedElement | undefined;
  const children: NormalizedElement[] = [];
  const related: NormalizedElement[] = [];

  if (element.kind === "part-definition") {
    const childIds = [
      ...element.partIds,
      ...element.portIds,
      ...element.connectionIds,
      ...element.allocationIds,
      ...element.gumboBlockIds,
    ];
    for (const id of childIds) {
      const child = model.elements[id];
      if (child !== undefined) children.push(child);
    }
    for (const part of model.parts) {
      if (part.resolvedDefinitionId === element.id) related.push(part);
    }
  } else if (
    element.kind === "part-usage" ||
    element.kind === "port" ||
    element.kind === "connection" ||
    element.kind === "allocation"
  ) {
    owner = model.elements[element.ownerDefinitionId];
    if (element.kind === "part-usage" && element.resolvedDefinitionId !== undefined) {
      const definition = model.elements[element.resolvedDefinitionId];
      if (definition !== undefined) related.push(definition);
    }
    if (element.kind === "port") {
      for (const contract of model.contracts) {
        if (contract.referencedPortIds.includes(element.id)) related.push(contract);
      }
      for (const connection of model.connections) {
        if (
          connection.source.resolvedPortId === element.id ||
          connection.target.resolvedPortId === element.id
        ) {
          related.push(connection);
        }
      }
    }
  } else if (element.kind === "gumbo-block" || element.kind === "gumbo-contract") {
    owner = model.elements[element.ownerId];
    if (element.kind === "gumbo-block") {
      for (const id of element.contractIds) {
        const child = model.elements[id];
        if (child !== undefined) children.push(child);
      }
    } else {
      for (const portId of element.referencedPortIds) {
        const port = model.elements[portId];
        if (port !== undefined) related.push(port);
      }
    }
  } else if (element.kind === "requirement") {
    owner = model.elements[element.ownerId];
    const contract = model.elements[element.contractId];
    if (contract !== undefined) related.push(contract);
    for (const portId of element.referencedPortIds) {
      const port = model.elements[portId];
      if (port !== undefined) related.push(port);
    }
  } else if (element.kind === "package") {
    for (const id of [...element.importIds, ...element.definitionIds, ...element.gumboBlockIds]) {
      const child = model.elements[id];
      if (child !== undefined) children.push(child);
    }
    if (element.parentPackageId !== undefined) owner = model.elements[element.parentPackageId];
  } else if (element.kind === "import") owner = model.elements[element.packageId];

  const unique = (values: readonly NormalizedElement[]): NormalizedElement[] => [
    ...new Map(values.map((value) => [value.id, value])).values(),
  ].sort((left, right) => left.qualifiedName.localeCompare(right.qualifiedName));
  return {
    element,
    ...(owner === undefined ? {} : { owner }),
    children: unique(children),
    related: unique(related),
  };
}
