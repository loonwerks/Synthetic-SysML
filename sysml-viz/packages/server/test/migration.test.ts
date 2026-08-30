import assert from "node:assert/strict";
import test from "node:test";

import {
  deriveDiagram,
  parseProjectSources,
  type NormalizedModel,
} from "@sysml-viz/core";

import { migrateViewDocument } from "../src/migration.js";
import type { ViewDocument } from "../src/types.js";

const OLD_MODEL = `
package Migration {
  part def Signal :> Data;

  part def Worker :> Thread {
    port incoming : DataPort { in :>> type : Signal; }
    port outgoing : DataPort { out :>> type : Signal; }
  }

  part def Nested :> System {
    port command : DataPort { in :>> type : Signal; }
    port result : DataPort { out :>> type : Signal; }
    part worker : Worker;
    connection to_worker : PortConnection connect command to worker.incoming;
    connection from_worker : PortConnection connect worker.outgoing to result;
  }

  part def Root :> System {
    port command : DataPort { in :>> type : Signal; }
    port result : DataPort { out :>> type : Signal; }
    part subsystem : Nested;
    connection into_nested : PortConnection connect command to subsystem.command;
    connection out_of_nested : PortConnection connect subsystem.result to result;
    allocation bind_nested : ProcessorBinding allocate subsystem to subsystem;
    language "GUMBO" /*{
      compute
        guarantee REQ_ROOT_OLD "The root input remains stable": command == command;
    }*/
  }
}
`;

const RENAMED_MODEL = `
package Migration {
  part def Signal :> Data;

  part def Worker :> Thread {
    port incoming : DataPort { in :>> type : Signal; }
    port outgoing : DataPort { out :>> type : Signal; }
  }

  part def Nested :> System {
    port command : DataPort { in :>> type : Signal; }
    port result : DataPort { out :>> type : Signal; }
    part worker : Worker;
    connection to_worker : PortConnection connect command to worker.incoming;
    connection from_worker : PortConnection connect worker.outgoing to result;
  }

  part def RenamedRoot :> System {
    port request : DataPort { in :>> type : Signal; }
    port result : DataPort { out :>> type : Signal; }
    part control : Nested;
    connection into_nested : PortConnection connect request to control.command;
    connection out_of_nested : PortConnection connect control.result to result;
    allocation deploy_control : ProcessorBinding allocate control to control;
    language "GUMBO" /*{
      compute
        guarantee REQ_ROOT_NEW "The root input remains stable": request == request;
    }*/
  }
}
`;

function parse(content: string): NormalizedModel {
  const result = parseProjectSources({
    root: "/virtual/migration",
    sources: [
      {
        path: "/virtual/migration/Model.sysml",
        root: "/virtual/migration",
        content,
      },
    ],
  });
  assert.equal(result.renderable, true, JSON.stringify(result.diagnostics, null, 2));
  return result.model;
}

function required<T>(value: T | undefined, message: string): T {
  assert.ok(value, message);
  return value;
}

test("migrates pinned nested layouts, view references, boundary ports, and edge routes across renames", () => {
  const oldModel = parse(OLD_MODEL);
  const newModel = parse(RENAMED_MODEL);
  const oldRoot = required(
    oldModel.definitions.find((definition) => definition.name === "Root"),
    "old root",
  );
  const newRoot = required(
    newModel.definitions.find((definition) => definition.name === "RenamedRoot"),
    "new root",
  );
  const oldPart = required(
    oldModel.parts.find((part) => part.ownerDefinitionId === oldRoot.id),
    "old root part",
  );
  const newPart = required(
    newModel.parts.find((part) => part.ownerDefinitionId === newRoot.id),
    "new root part",
  );
  const oldPort = required(
    oldModel.ports.find(
      (port) => port.ownerDefinitionId === oldRoot.id && port.direction === "in",
    ),
    "old root input",
  );
  const newPort = required(
    newModel.ports.find(
      (port) => port.ownerDefinitionId === newRoot.id && port.direction === "in",
    ),
    "new root input",
  );
  const oldConnection = required(
    oldModel.connections.find(
      (connection) =>
        connection.ownerDefinitionId === oldRoot.id && connection.name === "into_nested",
    ),
    "old root connection",
  );
  const newConnection = required(
    newModel.connections.find(
      (connection) =>
        connection.ownerDefinitionId === newRoot.id && connection.name === "into_nested",
    ),
    "new root connection",
  );
  const oldAllocation = required(
    oldModel.allocations.find((allocation) => allocation.ownerDefinitionId === oldRoot.id),
    "old allocation",
  );
  const newAllocation = required(
    newModel.allocations.find((allocation) => allocation.ownerDefinitionId === newRoot.id),
    "new allocation",
  );
  const oldContract = required(
    oldModel.contracts.find((contract) => contract.ownerId === oldRoot.id),
    "old contract",
  );
  const newContract = required(
    newModel.contracts.find((contract) => contract.ownerId === newRoot.id),
    "new contract",
  );
  const oldRequirement = required(
    oldModel.requirements.find((requirement) => requirement.ownerId === oldRoot.id),
    "old requirement",
  );
  const newRequirement = required(
    newModel.requirements.find((requirement) => requirement.ownerId === newRoot.id),
    "new requirement",
  );

  const oldDiagram = deriveDiagram(oldModel, {
    rootId: oldRoot.id,
    expanded: [oldPart.id],
  });
  const newDiagram = deriveDiagram(newModel, {
    rootId: newRoot.id,
    expanded: [newPart.id],
  });
  const oldParentNode = required(
    oldDiagram.nodes.find((node) => node.elementId === oldPart.id),
    "old parent node",
  );
  const newParentNode = required(
    newDiagram.nodes.find((node) => node.elementId === newPart.id),
    "new parent node",
  );
  const oldChildNode = required(
    oldDiagram.nodes.find((node) => node.parentNodeId === oldParentNode.id),
    "old child node",
  );
  const newChildNode = required(
    newDiagram.nodes.find((node) => node.parentNodeId === newParentNode.id),
    "new child node",
  );
  const oldBoundary = required(
    oldDiagram.boundaryPorts.find((port) => port.elementId === oldPort.id),
    "old boundary port",
  );
  const newBoundary = required(
    newDiagram.boundaryPorts.find((port) => port.elementId === newPort.id),
    "new boundary port",
  );
  const oldNestedEdge = required(
    oldDiagram.edges.find((edge) => edge.name === "to_worker"),
    "old nested edge",
  );
  const newNestedEdge = required(
    newDiagram.edges.find((edge) => edge.name === "to_worker"),
    "new nested edge",
  );
  const oldBoundaryKey = `boundary:${oldBoundary.id}`;
  const newBoundaryKey = `boundary:${newBoundary.id}`;
  const parentLayout = { x: 120, y: 80, width: 500, height: 320, pinned: true };
  const childLayout = { x: 175, y: 150, pinned: true };
  const boundaryLayout = { x: 20, y: 220, pinned: true };
  const route = {
    pinned: true,
    points: [
      { x: 200, y: 200 },
      { x: 300, y: 200 },
    ],
  };
  const document: ViewDocument = {
    schemaVersion: 1,
    viewRevision: 7,
    mutations: [],
    activeViewId: "architecture",
    views: [
      {
        id: "architecture",
        name: "Architecture",
        rootId: oldRoot.id,
        positions: {
          [oldParentNode.id]: parentLayout,
          [oldChildNode.id]: childLayout,
          [oldBoundaryKey]: boundaryLayout,
        },
        edgeRoutes: { [oldNestedEdge.id]: route },
        hidden: [oldPort.id],
        expanded: [oldPart.id, oldParentNode.id],
        aliases: {
          [oldPart.id]: "Controller",
          [oldPort.id]: "Request",
          [oldConnection.id]: "Input",
          [oldAllocation.id]: "Deployment",
          [oldContract.id]: "Root guarantee",
          [oldRequirement.id]: "Root requirement",
        },
        annotations: [
          {
            id: "linked-note",
            text: "Keep this relationship",
            position: { x: 10, y: 10 },
            linkedElementId: oldPart.id,
          },
        ],
        camera: { x: 5, y: 10, zoom: 0.9 },
        updatedAt: "2026-07-22T00:00:00.000Z",
      },
    ],
  };

  const result = migrateViewDocument(oldModel, newModel, document);
  const migrated = required(result.document.views[0], "migrated view");
  assert.equal(result.warnings.length, 0, JSON.stringify(result.warnings, null, 2));
  assert.equal(result.mappings[oldRoot.id], newRoot.id);
  assert.equal(result.mappings[oldPart.id], newPart.id);
  assert.equal(result.mappings[oldPort.id], newPort.id);
  assert.equal(result.mappings[oldConnection.id], newConnection.id);
  assert.equal(result.mappings[oldAllocation.id], newAllocation.id);
  assert.equal(result.mappings[oldContract.id], newContract.id);
  assert.equal(result.mappings[oldRequirement.id], newRequirement.id);
  assert.equal(result.mappings[oldParentNode.id], newParentNode.id);
  assert.equal(result.mappings[oldChildNode.id], newChildNode.id);
  assert.equal(result.mappings[oldNestedEdge.id], newNestedEdge.id);
  assert.equal(result.mappings[oldBoundaryKey], newBoundaryKey);

  assert.equal(migrated.rootId, newRoot.id);
  assert.deepEqual(migrated.positions[newParentNode.id], parentLayout);
  assert.deepEqual(migrated.positions[newChildNode.id], childLayout);
  assert.deepEqual(migrated.positions[newBoundaryKey], boundaryLayout);
  assert.equal(migrated.positions[oldParentNode.id], undefined);
  assert.equal(migrated.positions[oldChildNode.id], undefined);
  assert.deepEqual(migrated.edgeRoutes[newNestedEdge.id], route);
  assert.deepEqual(migrated.hidden, [newPort.id]);
  assert.deepEqual(migrated.expanded, [newPart.id, newParentNode.id]);
  assert.equal(migrated.aliases[newPart.id], "Controller");
  assert.equal(migrated.aliases[newPort.id], "Request");
  assert.equal(migrated.aliases[newConnection.id], "Input");
  assert.equal(migrated.aliases[newAllocation.id], "Deployment");
  assert.equal(migrated.aliases[newContract.id], "Root guarantee");
  assert.equal(migrated.aliases[newRequirement.id], "Root requirement");
  assert.equal(migrated.annotations[0]?.linkedElementId, newPart.id);
});

test("does not guess when multiple renamed part usages have the same structural signature", () => {
  const oldModel = parse(`
    package Ambiguous {
      part def Worker :> Thread;
      part def Root :> System {
        part first : Worker;
        part second : Worker;
        part fixed : Worker;
        allocation bind_one : ProcessorBinding allocate fixed to fixed;
        allocation bind_two : ProcessorBinding allocate fixed to fixed;
        language "GUMBO" /*{
          compute
            guarantee REQ_FIRST: true;
            guarantee REQ_SECOND: true;
        }*/
      }
    }
  `);
  const newModel = parse(`
    package Ambiguous {
      part def Worker :> Thread;
      part def Root :> System {
        part alpha : Worker;
        part beta : Worker;
        part fixed : Worker;
        allocation deploy_one : ProcessorBinding allocate fixed to fixed;
        allocation deploy_two : ProcessorBinding allocate fixed to fixed;
        language "GUMBO" /*{
          compute
            guarantee REQ_ALPHA: true;
            guarantee REQ_BETA: true;
        }*/
      }
    }
  `);
  const root = required(
    oldModel.definitions.find((definition) => definition.name === "Root"),
    "root",
  );
  const oldDiagram = deriveDiagram(oldModel, { rootId: root.id });
  const newDiagram = deriveDiagram(newModel, { rootId: root.id });
  const oldFirst = required(
    oldModel.parts.find((part) => part.name === "first"),
    "first part",
  );
  const firstNode = required(
    oldDiagram.nodes.find((node) => node.elementId === oldFirst.id),
    "first node",
  );
  const oldAllocation = required(oldModel.allocations[0], "old allocation");
  const oldContract = required(oldModel.contracts[0], "old contract");
  const oldRequirement = required(oldModel.requirements[0], "old requirement");
  const document: ViewDocument = {
    schemaVersion: 1,
    viewRevision: 3,
    mutations: [],
    activeViewId: "architecture",
    views: [
      {
        id: "architecture",
        name: "Architecture",
        rootId: root.id,
        positions: { [firstNode.id]: { x: 444, y: 222, pinned: true } },
        edgeRoutes: {},
        hidden: [],
        expanded: [],
        aliases: {
          [oldFirst.id]: "Important worker",
          [oldAllocation.id]: "Important allocation",
          [oldContract.id]: "Important contract",
          [oldRequirement.id]: "Important requirement",
        },
        annotations: [],
        camera: { x: 0, y: 0, zoom: 1 },
        updatedAt: "2026-07-22T00:00:00.000Z",
      },
    ],
  };

  const result = migrateViewDocument(oldModel, newModel, document);
  const migrated = required(result.document.views[0], "migrated view");
  assert.equal(result.mappings[oldFirst.id], undefined);
  assert.equal(
    result.warnings.some(
      (warning) =>
        warning.code === "MIGRATION_AMBIGUOUS_PART" && warning.oldIds.includes(oldFirst.id),
    ),
    true,
  );
  assert.equal(
    result.warnings.some((warning) => warning.code === "MIGRATION_AMBIGUOUS_ALLOCATION"),
    true,
  );
  assert.equal(
    result.warnings.some((warning) => warning.code === "MIGRATION_AMBIGUOUS_CONTRACT"),
    true,
  );
  assert.equal(
    result.warnings.some((warning) => warning.code === "MIGRATION_AMBIGUOUS_REQUIREMENT"),
    true,
  );
  assert.deepEqual(migrated.positions[firstNode.id], { x: 444, y: 222, pinned: true });
  assert.equal(migrated.aliases[oldFirst.id], "Important worker");
  assert.equal(migrated.aliases[oldAllocation.id], "Important allocation");
  assert.equal(migrated.aliases[oldContract.id], "Important contract");
  assert.equal(migrated.aliases[oldRequirement.id], "Important requirement");
  assert.equal(
    newDiagram.nodes.some((node) => migrated.positions[node.id] !== undefined),
    false,
  );
});
