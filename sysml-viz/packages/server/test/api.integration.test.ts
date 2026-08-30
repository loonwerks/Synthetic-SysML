import assert from "node:assert/strict";
import { createHash } from "node:crypto";
import { chmod, access, copyFile, mkdtemp, readFile, readdir, writeFile } from "node:fs/promises";
import os from "node:os";
import path from "node:path";
import { setTimeout as delay } from "node:timers/promises";
import test from "node:test";
import sharp from "sharp";

import {
  isLoopbackOrigin,
  requestViewPatch,
  serializeDiagram,
  serializePreview,
  serializeViews,
} from "../src/api.js";
import { CAPABILITY_INVENTORY } from "../src/capabilities.js";
import { FAA_A1_PRESET_ID, FAA_A1_PRESET_VERSION } from "../src/presets.js";
import { SysmlVizSession } from "../src/session.js";
import type { ViewDocument, ViewState } from "../src/types.js";

const MODEL = `package Demo {
  private import HAMR::*;
  part def Reading :> Data { part value : Base_Types::Integer_32; }
  part def Filter :> Thread {}
  part def Sensor :> Device {
    port reading : DataPort { out :>> type : Reading; }
    part filter : Filter;
  }
  part def Controller :> Thread {
    // @trace PORT-01
    port reading : DataPort { in :>> type : Reading; }
    language "GUMBO" /*{
      compute
        // @trace CTRL-01 ORPHAN-99
        guarantee REQ_DEMO_1 "The controller accepts a reading": reading.value >= 0;
        guarantee REQ_DEMO_2 "An unrelated controller property": true;
    }*/
  }
  part def DemoSystem :> System {
    part sensor : Sensor;
    // @trace PART-01
    part controller : Controller;
    connection reading_flow : PortConnection connect sensor.reading to controller.reading;
  }
}`;

async function validationRunCount(counter: string): Promise<number> {
  try {
    return (await readFile(counter, "utf8")).split("\n").filter(Boolean).length;
  } catch (error) {
    if ((error as NodeJS.ErrnoException).code === "ENOENT") return 0;
    throw error;
  }
}

async function fakeSireum(
  root: string,
  options: { firstInvalid?: boolean; delayMs?: number } = {},
): Promise<{ executable: string; counter: string }> {
  const executable = path.join(root, "fake-sireum.mjs");
  const counter = path.join(root, "validation-runs.txt");
  const diagnostic = `${path.join(root, "Demo.sysml")}:1:1:1:2: error: synthetic first-run failure`;
  const source = [
    "#!/bin/sh",
    `counter=${JSON.stringify(counter)}`,
    'if [ -s "$counter" ]; then first=0; else first=1; fi',
    'printf "run\\n" >> "$counter"',
    `sleep ${(options.delayMs ?? 0) / 1_000}`,
    options.firstInvalid
      ? `if [ "$first" -eq 1 ]; then printf "%s\\n" ${JSON.stringify(diagnostic)}; else printf "Well-formed!\\n"; fi`
      : 'printf "Well-formed!\\n"',
    "",
  ].join("\n");
  await writeFile(executable, source, "utf8");
  await chmod(executable, 0o755);
  return { executable, counter };
}

async function waitFor(
  predicate: () => boolean | Promise<boolean>,
  message: string,
  timeoutMs = 5_000,
): Promise<void> {
  const deadline = Date.now() + timeoutMs;
  while (Date.now() < deadline) {
    if (await predicate()) return;
    await delay(20);
  }
  throw new Error(message);
}

async function findRepositoryFixture(relativePath: string): Promise<string> {
  let candidate = path.resolve(process.cwd());
  while (true) {
    const fixture = path.join(candidate, relativePath);
    try {
      await access(fixture);
      return fixture;
    } catch {
      const parent = path.dirname(candidate);
      if (parent === candidate) {
        throw new Error(`Could not find test fixture '${relativePath}' above ${process.cwd()}`);
      }
      candidate = parent;
    }
  }
}

async function copyIsoletteProject(prefix: string): Promise<{ root: string; library: string }> {
  const source = await findRepositoryFixture("external/inspecta-scp/scp_demo_artifacts/isolette_io");
  const library = await findRepositoryFixture("external/sysml-aadl-libraries");
  const root = await mkdtemp(path.join(os.tmpdir(), prefix));
  for (const name of await readdir(source)) {
    if (name.endsWith(".sysml")) {
      await copyFile(path.join(source, name), path.join(root, name));
    }
  }
  return { root, library };
}

test("only loopback browser origins are trusted", () => {
  assert.equal(isLoopbackOrigin("http://127.0.0.1:5173"), true);
  assert.equal(isLoopbackOrigin("http://localhost:5173"), true);
  assert.equal(isLoopbackOrigin("https://evil.example"), false);
  assert.equal(isLoopbackOrigin("not a URL"), false);
});

test("workflow capabilities are stable, unique, and document transport-only exceptions", () => {
  const ids = CAPABILITY_INVENTORY.capabilities.map((item) => item.id);
  assert.equal(new Set(ids).size, ids.length);
  assert.ok(ids.includes("annotation.crud"));
  assert.ok(ids.includes("presentation.node.crud"));
  assert.ok(ids.includes("template.upload"));
  assert.ok(ids.includes("health.inspect"));
  assert.ok(ids.includes("checkpoint.list"));
  for (const item of CAPABILITY_INVENTORY.capabilities) {
    assert.equal(item.testSelector, `[data-capability="${item.id}"]`);
    assert.ok(item.agentEntryPoint);
    assert.ok(item.manualSurface);
  }
  assert.deepEqual(
    CAPABILITY_INVENTORY.transportOnlyExceptions.map((item) => item.id),
    ["transport.json-formatting", "transport.server-url", "transport.provenance-labels", "transport.dry-run"],
  );
});

test("local session exposes a rooted model, persistent layout, requirements, and SVG", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-api-"));
  await writeFile(path.join(root, "Demo.sysml"), MODEL, "utf8");
  await writeFile(path.join(root, "system-abstract.md"), "# Demo\n\nPART-01: Controller responsibility.\n\nPORT-01: Reading input.\n\nCTRL-01: Controller behavior.\n", "utf8");
  const sessionInstance = await SysmlVizSession.create({ root });
  try {
    const session = await sessionInstance.snapshot();
    assert.equal(session.root, root);
    assert.deepEqual(session.files, ["Demo.sysml"]);

    const model = sessionInstance.modelSummary();
    const definitions = model.definitions as Array<{ id: string; name: string }>;
    const system = definitions.find((definition) => definition.name === "DemoSystem");
    assert.ok(system);
    type HierarchyItem = {
      id: string;
      elementId: string;
      definitionId?: string;
      ownerDefinitionId?: string;
      kind: string;
      name: string;
      direction?: string;
      children: HierarchyItem[];
    };
    const hierarchy = model.hierarchy as HierarchyItem[];
    assert.equal(hierarchy.length, 1);
    assert.equal(hierarchy[0]?.name, "DemoSystem");
    const sensorOccurrence = hierarchy[0]?.children.find((item) => item.name === "sensor");
    assert.ok(sensorOccurrence);
    assert.notEqual(sensorOccurrence.elementId, sensorOccurrence.definitionId);
    assert.deepEqual(sensorOccurrence.children.map((item) => item.name), ["filter", "reading"]);
    const sensorPort = sensorOccurrence.children.find((item) => item.kind === "port");
    assert.equal(sensorPort?.direction, "out");
    assert.equal(sensorPort?.ownerDefinitionId, sensorOccurrence.definitionId);
    const controllerOccurrence = hierarchy[0]?.children.find((item) => item.name === "controller");
    assert.deepEqual(controllerOccurrence?.children.map((item) => item.name), ["reading"]);
    const diagram = await sessionInstance.diagram(undefined, system.id);
    assert.equal((diagram.nodes as unknown[]).length, 2);
    assert.equal((diagram.edges as unknown[]).length, 1);
    assert.equal(diagram.viewRevision, 0);
    assert.equal((await sessionInstance.viewDocument()).viewRevision, 0);
    const abstract = await sessionInstance.systemAbstract();
    assert.equal(abstract?.anchors[0]?.id, "PART-01");
    assert.deepEqual(abstract?.unresolvedTraceIds, ["ORPHAN-99"]);

    const requirements = sessionInstance.requirements("REQ_DEMO_1");
    assert.equal(requirements.length, 1);
    const requirement = requirements[0];
    assert.ok(requirement);
    assert.equal(typeof requirement.contractId, "string");
    assert.deepEqual(requirement.traceIds, ["CTRL-01", "ORPHAN-99"]);
    const contractRecords = model.contracts as Array<{
      name: string;
      ownerId: string;
      ownerUsageIds: string[];
      traceIds: string[];
    }>;
    const tracedContract = contractRecords.find((contract) => contract.name === "REQ_DEMO_1");
    assert.deepEqual(tracedContract?.traceIds, ["CTRL-01", "ORPHAN-99"]);
    assert.equal(typeof tracedContract?.ownerId, "string");
    assert.equal(tracedContract?.ownerUsageIds.length, 1);

    const controller = diagram.nodes.find((node) => node.name === "controller");
    assert.ok(controller);
    const readingPort = controller.ports.find((port) => port.name === "reading");
    assert.ok(readingPort);
    const portDetails = await sessionInstance.inspect(readingPort.elementId);
    assert.equal(portDetails.typeName, "Reading");
    assert.deepEqual(portDetails.traceIds, ["PORT-01"]);
    assert.deepEqual(
      (portDetails.contracts as Array<{ requirementId?: string }>).map((contract) => contract.requirementId),
      ["REQ_DEMO_1"],
    );
    assert.deepEqual(
      (portDetails.contracts as Array<{ traceIds?: string[] }>)[0]?.traceIds,
      ["CTRL-01", "ORPHAN-99"],
    );
    const connection = diagram.edges[0];
    assert.ok(connection);
    const connectionDetails = await sessionInstance.inspect(connection.elementId);
    assert.deepEqual(
      (connectionDetails.contracts as Array<{ requirementId?: string }>).map((contract) => contract.requirementId),
      ["REQ_DEMO_1"],
    );
    const controllerDetails = await sessionInstance.inspect(String(controller.definitionId));
    assert.deepEqual(
      (controllerDetails.contracts as Array<{ requirementId?: string }>).map((contract) => contract.requirementId),
      ["REQ_DEMO_1", "REQ_DEMO_2"],
    );

    const views = await sessionInstance.viewDocument();
    const activeViewId = views.activeViewId;
    const firstNode = diagram.nodes[0];
    assert.ok(firstNode);
    const events: unknown[] = [];
    sessionInstance.events.on("event", (event) => events.push(event));
    const beforePreview = structuredClone(await sessionInstance.viewDocument());
    const preview = await sessionInstance.previewMove(
      activeViewId,
      firstNode.id,
      { x: 777, y: 333 },
      true,
    );
    assert.equal(preview.dryRun, true);
    assert.equal(preview.operation, "layout.move");
    assert.deepEqual(preview.resolvedIds, [firstNode.id]);
    assert.deepEqual(
      { x: preview.after.positions[firstNode.id]?.x, y: preview.after.positions[firstNode.id]?.y },
      { x: 777, y: 333 },
    );
    assert.deepEqual(await sessionInstance.viewDocument(), beforePreview);
    assert.equal(events.length, 0);

    await sessionInstance.move(
      activeViewId,
      firstNode.id,
      777,
      333,
      true,
      {
        actor: "layout-agent",
        client: "cli",
        clientId: "integration-client",
        mutationId: "integration-client:move-1",
      },
    );
    const movedDiagram = await sessionInstance.diagram(undefined, system.id);
    const persisted = movedDiagram.nodes.find((node) => node.id === firstNode.id);
    assert.equal(persisted?.position.x, 777);
    assert.equal(persisted?.position.y, 333);
    assert.equal(persisted?.pinned, true);
    assert.equal(sessionInstance.revision, diagram.revision);
    assert.equal(sessionInstance.viewRevision, diagram.viewRevision + 1);
    const mutation = (await sessionInstance.viewDocument()).mutations.at(-1);
    assert.equal(mutation?.actor, "layout-agent");
    assert.equal(mutation?.client, "cli");
    assert.equal(mutation?.operation, "layout.move");
    assert.deepEqual(mutation?.targetIds, [firstNode.id]);
    const moveEvent = events.find((event) =>
      typeof event === "object" && event !== null &&
      (event as { type?: string }).type === "view.updated"
    ) as { data?: { clientId?: string; mutationId?: string } } | undefined;
    assert.equal(moveEvent?.data?.clientId, "integration-client");
    assert.equal(moveEvent?.data?.mutationId, "integration-client:move-1");

    const serializedDiagram = serializeDiagram(
      await sessionInstance.diagram(undefined, system.id),
    ) as {
      viewRevision: number;
      nodes: Array<{ id: string; canExpand?: boolean }>;
      edges: Array<{ elementId?: string; sourceLocation?: { file?: string; line?: number } }>;
    };
    assert.equal(serializedDiagram.viewRevision, sessionInstance.viewRevision);
    assert.equal(serializedDiagram.edges[0]?.elementId, connection.elementId);
    assert.equal(serializedDiagram.edges[0]?.sourceLocation?.file, path.join(root, "Demo.sysml"));
    assert.equal(typeof serializedDiagram.edges[0]?.sourceLocation?.line, "number");
    const sensor = diagram.nodes.find((node) => node.name === "sensor");
    assert.ok(sensor);
    assert.equal(
      serializedDiagram.nodes.find((node) => node.id === sensor.id)?.canExpand,
      true,
    );
    const serializedViewDocument = serializeViews(await sessionInstance.viewDocument()) as {
      viewRevision: number;
      mutations: unknown[];
    };
    assert.equal(serializedViewDocument.viewRevision, sessionInstance.viewRevision);
    assert.equal(serializedViewDocument.mutations.length, 1);

    const createdPatch = await requestViewPatch(sessionInstance, "agent-view", {
      name: "Agent view",
      rootId: system.id,
      positions: { [firstNode.id]: { x: 123, y: 456 } },
      pinned: [firstNode.id],
    });
    await sessionInstance.updateView("agent-view", createdPatch);
    await sessionInstance.setActiveView("agent-view");
    const reloadedViews = await sessionInstance.viewDocument();
    assert.equal(reloadedViews.activeViewId, "agent-view");
    assert.equal(
      reloadedViews.views.find((view) => view.id === "agent-view")?.positions[firstNode.id]?.pinned,
      true,
    );
    const expansionPatch = await requestViewPatch(sessionInstance, "agent-view", {
      expanded: [sensor.id],
    });
    assert.deepEqual(expansionPatch.expanded, [sensor.elementId]);
    const edgeRoutePatch = await requestViewPatch(sessionInstance, "agent-view", {
      edgeRoutes: {
        "edge:reading-flow": {
          pinned: true,
          points: [{ x: 220, y: 180 }],
          sourceAttachment: { side: "bottom", offset: 0.35 },
          targetAttachment: { side: "left", offset: 0.72 },
        },
      },
    });
    assert.deepEqual(edgeRoutePatch.edgeRoutes?.["edge:reading-flow"], {
      pinned: true,
      points: [{ x: 220, y: 180 }],
      sourceAttachment: { side: "bottom", offset: 0.35 },
      targetAttachment: { side: "left", offset: 0.72 },
    });
    await assert.rejects(
      requestViewPatch(sessionInstance, "agent-view", {
        edgeRoutes: {
          broken: {
            pinned: true,
            points: [],
            targetAttachment: { side: "right", offset: 2 },
          },
        },
      }),
      /between 0 and 1/,
    );
    await assert.rejects(
      requestViewPatch(sessionInstance, "agent-view", {
        positions: { [firstNode.id]: { x: Number.POSITIVE_INFINITY, y: 0 } },
      }),
      /finite number/,
    );

    await assert.rejects(
      sessionInstance.inspect("reading"),
      (error: unknown) =>
        typeof error === "object" &&
        error !== null &&
        "code" in error &&
        String((error as { code: unknown }).code).includes("AMBIGUOUS"),
    );

    const rendered = await sessionInstance.render("svg");
    assert.match(rendered.toString("utf8"), /<svg/);
    const overlayPatch = await requestViewPatch(sessionInstance, "agent-view", {
      positions: {
        "stale:other-root": { x: 10_000, y: 10_000, pinned: true },
      },
      annotations: [
        {
          id: "far-note",
          text: "The export bounds include this note.",
          position: { x: 1_600, y: 1_100 },
        },
      ],
      presentationNodes: [
        { id: "operator", label: "Operator", kind: "actor", x: -320, y: -140 },
      ],
      presentationEdges: [
        {
          id: "operator-advises",
          sourceId: "operator",
          targetId: firstNode.elementId,
          kind: "informational",
          label: "advises & reviews",
          bendPoints: [{ x: -80, y: 120 }],
        },
      ],
    });
    await sessionInstance.updateView("agent-view", overlayPatch);
    const boundedSvg = (await sessionInstance.render("svg", "agent-view", system.id)).toString("utf8");
    const svgWidth = Number(/<svg[^>]+width="([0-9.]+)"/u.exec(boundedSvg)?.[1]);
    const svgHeight = Number(/<svg[^>]+height="([0-9.]+)"/u.exec(boundedSvg)?.[1]);
    assert.ok(svgWidth >= 1_800 && svgWidth < 5_000, `unexpected SVG width ${svgWidth}`);
    assert.ok(svgHeight >= 1_190 && svgHeight < 5_000, `unexpected SVG height ${svgHeight}`);
    assert.match(boundedSvg, /data-annotation-id="far-note"/);
    assert.match(boundedSvg, /data-kind="actor"/);
    assert.match(boundedSvg, /advises &amp; reviews/u);
    const overlayHealth = await sessionInstance.health("agent-view", system.id);
    assert.equal(overlayHealth.nodeCount, (await sessionInstance.diagram("agent-view", system.id)).nodes.length);
    assert.equal(overlayHealth.outOfBoundsCount, 0);
    const png = await sessionInstance.render("png", "agent-view", system.id);
    assert.deepEqual([...png.subarray(0, 8)], [137, 80, 78, 71, 13, 10, 26, 10]);
    const pngMetadata = await sharp(png).metadata();
    assert.equal(pngMetadata.width, svgWidth);
    assert.equal(pngMetadata.height, svgHeight);

    await sessionInstance.move("agent-view", controller.id, 614, 271, true);
    const revisionBeforeReload = sessionInstance.revision;
    const viewRevisionBeforeReload = sessionInstance.viewRevision;
    const renamedModel = MODEL
      .replace("part def Controller", "part def Coordinator")
      .replace("part controller : Controller", "part coordinator : Coordinator")
      .replace("controller.reading", "coordinator.reading");
    await writeFile(path.join(root, "Demo.sysml"), renamedModel, "utf8");
    await sessionInstance.refresh("test semantic rename");
    assert.equal(sessionInstance.revision, revisionBeforeReload + 1);
    assert.equal(sessionInstance.viewRevision, viewRevisionBeforeReload);
    const migratedDiagram = await sessionInstance.diagram("agent-view", system.id);
    const coordinator = migratedDiagram.nodes.find((node) => node.name === "coordinator");
    assert.ok(coordinator);
    assert.equal(coordinator.position.x, 614);
    assert.equal(coordinator.position.y, 271);
    assert.equal(coordinator.pinned, true);

    await writeFile(path.join(root, "Demo.sysml"), "package Demo { part def Broken :> System {", "utf8");
    const stale = await sessionInstance.refresh("test malformed edit");
    assert.equal(stale.stale, true);
    assert.equal((stale.validation as { status: string }).status, "stale");
    const staleDiagram = await sessionInstance.diagram();
    const fatal = staleDiagram.diagnostics.find((diagnostic) => diagnostic.fatal);
    assert.ok(fatal?.span);
    assert.match(fatal.message, /not closed|unclosed|closing/i);
  } finally {
    await sessionInstance.close();
  }
});

test("model explorer preserves repeated occurrences and nests ports under each owner", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-hierarchy-"));
  await writeFile(path.join(root, "Reuse.sysml"), `package Reuse {
  part def Leaf :> Thread {
    port sample : DataPort { in :>> type : Base_Types::Integer_32; }
  }
  part def Root :> System {
    part primary : Leaf;
    part backup : Leaf;
  }
}`, "utf8");
  const session = await SysmlVizSession.create({ root });
  try {
    type HierarchyItem = {
      elementId: string;
      definitionId?: string;
      kind: string;
      name: string;
      children: HierarchyItem[];
    };
    const hierarchy = session.modelSummary().hierarchy as HierarchyItem[];
    assert.deepEqual(hierarchy.map((item) => item.name), ["Root"]);
    assert.deepEqual(hierarchy[0]?.children.map((item) => item.name), ["primary", "backup"]);
    const primary = hierarchy[0]?.children[0];
    const backup = hierarchy[0]?.children[1];
    assert.ok(primary && backup);
    assert.notEqual(primary.elementId, backup.elementId);
    assert.equal(primary.definitionId, backup.definitionId);
    assert.deepEqual(primary.children.map((item) => [item.kind, item.name]), [["port", "sample"]]);
    assert.deepEqual(backup.children.map((item) => [item.kind, item.name]), [["port", "sample"]]);
  } finally {
    await session.close();
  }
});

test("startup recovers a legacy contextual node ID saved as a view root", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-root-recovery-"));
  await writeFile(path.join(root, "Demo.sysml"), MODEL, "utf8");
  const first = await SysmlVizSession.create({ root });
  let contextualId: string;
  let controllerDefinitionId: string;
  try {
    const summary = first.modelSummary();
    const definitions = summary.definitions as Array<{ id: string; name: string }>;
    const system = definitions.find((definition) => definition.name === "DemoSystem");
    const controller = definitions.find((definition) => definition.name === "Controller");
    assert.ok(system);
    assert.ok(controller);
    controllerDefinitionId = controller.id;
    const diagram = await first.diagram(undefined, system.id);
    contextualId = diagram.nodes.find((node) => node.name === "controller")!.id;
  } finally {
    await first.close();
  }

  const viewsPath = path.join(root, ".sysmlviz", "views.json");
  const document = JSON.parse(await readFile(viewsPath, "utf8")) as ViewDocument;
  const active = document.views.find((view) => view.id === document.activeViewId);
  assert.ok(active);
  active.rootId = contextualId;
  await writeFile(viewsPath, `${JSON.stringify(document, null, 2)}\n`, "utf8");

  const recovered = await SysmlVizSession.create({ root });
  try {
    assert.equal((await recovered.snapshot()).activeRootId, controllerDefinitionId);
    assert.equal((await recovered.view()).rootId, controllerDefinitionId);
    assert.equal((await recovered.viewDocument()).mutations.at(-1)?.operation, "view.root.recovered");
  } finally {
    await recovered.close();
  }
});

test("checkpoint validation completion updates the originating checkpoint and records both revisions", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-checkpoint-"));
  await writeFile(path.join(root, "Demo.sysml"), MODEL, "utf8");
  const validator = await fakeSireum(root, { firstInvalid: true, delayMs: 150 });
  const session = await SysmlVizSession.create({ root, sireum: validator.executable });
  try {
    const diagram = await session.diagram();
    const node = diagram.nodes[0];
    assert.ok(node);
    await session.move(diagram.view.id, node.id, 100, 120, true);
    const first = await session.checkpoint({ name: "first" });
    assert.equal(first.modelRevision, 1);
    assert.equal(first.viewRevision, 1);
    assert.equal(first.validationStatus, "pending");

    await writeFile(path.join(root, "Demo.sysml"), `${MODEL}\n// revision two\n`, "utf8");
    await session.refresh("checkpoint test reload");
    await session.move(diagram.view.id, node.id, 140, 160, true);
    const second = await session.checkpoint({ name: "second" });
    assert.equal(second.modelRevision, 2);
    assert.equal(second.viewRevision, 2);
    assert.equal(second.validationStatus, "pending");

    await waitFor(
      async () => (await session.checkpoints()).every((checkpoint) => checkpoint.validationStatus !== "pending"),
      "checkpoint validation did not complete",
    );
    const checkpoints = await session.checkpoints();
    assert.equal(checkpoints.find((checkpoint) => checkpoint.id === first.id)?.validationStatus, "invalid");
    assert.equal(checkpoints.find((checkpoint) => checkpoint.id === second.id)?.validationStatus, "valid");
    assert.equal(await validationRunCount(validator.counter), 2);
  } finally {
    await session.close();
  }
});

test("configured validation is debounced across successful live reloads and not run on startup", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-validation-debounce-"));
  await writeFile(path.join(root, "Demo.sysml"), MODEL, "utf8");
  const validator = await fakeSireum(root);
  const session = await SysmlVizSession.create({
    root,
    sireum: validator.executable,
    validationDebounceMs: 60,
  });
  try {
    await delay(100);
    assert.equal(await validationRunCount(validator.counter), 0);

    await writeFile(path.join(root, "Demo.sysml"), `${MODEL}\n// reload one\n`, "utf8");
    await session.refresh("debounce reload one");
    await writeFile(path.join(root, "Demo.sysml"), `${MODEL}\n// reload two\n`, "utf8");
    await session.refresh("debounce reload two");

    await waitFor(
      async () => (await validationRunCount(validator.counter)) === 1 && session.validation.status === "valid",
      "debounced validation did not run",
    );
    await delay(100);
    assert.equal(await validationRunCount(validator.counter), 1);
    assert.equal(session.validation.revision, session.revision);
  } finally {
    await session.close();
  }
});

test("diagram health reports deterministic plain-language fidelity with precedence", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-fidelity-"));
  await writeFile(path.join(root, "Demo.sysml"), MODEL, "utf8");
  const validator = await fakeSireum(root, { firstInvalid: true });
  const session = await SysmlVizSession.create({ root, sireum: validator.executable });
  try {
    const local = await session.health();
    assert.deepEqual(local.fidelity, {
      state: "local",
      label: "Locally rendered",
      summary: "Rendered locally; Sireum validation has not been requested. Fidelity covers the supported AADL-oriented SysML subset, not complete SysML v2.",
      scope: "aadl-oriented-subset",
    });
    assert.equal(typeof local.nodeCount, "number");
    assert.ok(Array.isArray(local.findings));

    await session.validate();
    const invalid = await session.health();
    assert.equal(invalid.fidelity.state, "invalid");
    assert.equal(invalid.fidelity.label, "Validation found errors");

    await session.validate();
    const validated = await session.health();
    assert.equal(validated.fidelity.state, "validated");
    assert.equal(validated.fidelity.label, "Validated by Sireum");

    const unresolvedModel = MODEL.replace(
      "sensor.reading to controller.reading",
      "sensor.reading to controller.missing",
    );
    await writeFile(path.join(root, "Demo.sysml"), unresolvedModel, "utf8");
    await session.refresh("introduce unresolved endpoint");
    const partial = await session.health();
    assert.equal(partial.unresolvedEndpointCount, 1);
    assert.equal(partial.fidelity.state, "partial");
    assert.match(partial.fidelity.summary, /1 unresolved connection endpoint/u);

    await writeFile(path.join(root, "Demo.sysml"), "package Demo { part def Broken :> System {", "utf8");
    await session.refresh("introduce unrenderable source");
    const stale = await session.health();
    assert.equal(stale.fidelity.state, "stale");
    assert.equal(stale.fidelity.label, "Showing last good diagram");
    assert.match(stale.fidelity.summary, /not complete SysML v2/u);
  } finally {
    await session.close();
  }
});

test("session layout commands align, move relatively, and reset without changing semantics", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-layout-api-"));
  const layoutModel = MODEL.replace(
    "part controller : Controller;",
    "part controller : Controller;\n    part spare : Sensor;",
  );
  await writeFile(path.join(root, "Demo.sysml"), layoutModel, "utf8");
  const session = await SysmlVizSession.create({ root });
  try {
    const viewId = (await session.viewDocument()).activeViewId;
    const diagram = await session.diagram();
    const sensor = diagram.nodes.find((node) => node.name === "sensor");
    const controller = diagram.nodes.find((node) => node.name === "controller");
    const spare = diagram.nodes.find((node) => node.name === "spare");
    assert.ok(sensor && controller && spare);

    await session.move(viewId, sensor.id, 100, 120, true);
    await session.move(viewId, controller.id, 500, 420, true);
    const beforePreviews = structuredClone(await session.viewDocument());
    const persistedBeforePreviews = await readFile(session.views.viewsPath, "utf8");
    const previewEvents: unknown[] = [];
    session.events.on("event", (event) => previewEvents.push(event));
    const previews = [
      await session.previewMove(
        viewId,
        controller.id,
        { relativeTo: sensor.id, dx: 75, dy: 45 },
        true,
      ),
      await session.previewPin(viewId, sensor.id, false),
      await session.previewApplyLayout(viewId),
      await session.previewAlign(viewId, [sensor.id, controller.id], "top"),
      await session.previewDistribute(
        viewId,
        [sensor.id, controller.id, spare.id],
        "horizontal",
      ),
      await session.previewResetViewLayout(viewId),
    ];
    assert.equal(previews.every((preview) => preview.dryRun), true);
    assert.deepEqual(await session.viewDocument(), beforePreviews);
    assert.equal(await readFile(session.views.viewsPath, "utf8"), persistedBeforePreviews);
    assert.deepEqual(previewEvents, []);
    const firstPreview = previews[0];
    assert.ok(firstPreview);
    const serialized = serializePreview(firstPreview);
    assert.equal(serialized.dryRun, true);
    assert.equal(serialized.baseViewRevision, beforePreviews.viewRevision);
    assert.ok(serialized.before);
    assert.ok(serialized.after);

    await session.align(
      viewId,
      [sensor.id, controller.id],
      "top",
      true,
      { actor: "layout-audit", client: "cli" },
    );
    let view = await session.view(viewId);
    assert.equal(view.positions[sensor.id]?.y, 120);
    assert.equal(view.positions[controller.id]?.y, 120);

    await session.moveRelative(viewId, controller.id, sensor.id, 75, 45, true);
    view = await session.view(viewId);
    assert.deepEqual(
      { x: view.positions[controller.id]?.x, y: view.positions[controller.id]?.y },
      { x: 175, y: 165 },
    );

    await session.resetViewLayout(viewId);
    view = await session.view(viewId);
    assert.equal(Object.keys(view.positions).length, 3);
    assert.equal(Object.values(view.positions).every((position) => !position.pinned), true);
    assert.deepEqual(view.edgeRoutes, {});
    const document = await session.viewDocument();
    assert.equal(document.viewRevision, 5);
    assert.deepEqual(
      document.mutations.map((mutation) => mutation.operation),
      ["layout.move", "layout.move", "layout.align.top", "layout.move-relative", "layout.reset"],
    );
    assert.equal(document.mutations[2]?.actor, "layout-audit");
    assert.equal(document.mutations[2]?.client, "cli");
    assert.deepEqual(document.mutations[2]?.changedFields, ["positions"]);
  } finally {
    await session.close();
  }
});

test("automatic edge routes are discarded on geometry changes and refreshes while manual routes survive", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-route-lifecycle-"));
  await writeFile(path.join(root, "Demo.sysml"), MODEL, "utf8");
  const session = await SysmlVizSession.create({ root });
  try {
    const diagram = await session.diagram();
    const node = diagram.nodes[0];
    assert.ok(node);
    const generated = { pinned: false, points: [{ x: 200, y: 200 }] };
    const manual = { pinned: true, points: [{ x: 210, y: 210 }] };
    await session.updateView(diagram.view.id, { edgeRoutes: { generated, manual } });

    await session.move(diagram.view.id, node.id, node.position.x + 20, node.position.y + 20, true);
    let view = await session.view(diagram.view.id);
    assert.deepEqual(view.edgeRoutes, { manual });

    await session.updateView(diagram.view.id, { edgeRoutes: { generated, manual } });
    const refreshed = await session.diagram(diagram.view.id);
    assert.deepEqual(refreshed.view.edgeRoutes, { manual });
    view = await session.view(diagram.view.id);
    assert.deepEqual(view.edgeRoutes, { manual });
  } finally {
    await session.close();
  }
});

test("expanded containers resize by canonical aliases without moving descendants", async () => {
  const root = await mkdtemp(path.join(os.tmpdir(), "sysml-viz-resize-api-"));
  await writeFile(path.join(root, "Demo.sysml"), MODEL, "utf8");
  const session = await SysmlVizSession.create({ root });
  try {
    const summary = session.modelSummary();
    const definitions = summary.definitions as Array<{ id: string; name: string }>;
    const system = definitions.find((candidate) => candidate.name === "DemoSystem");
    assert.ok(system);
    const viewId = (await session.viewDocument()).activeViewId;
    let diagram = await session.diagram(viewId, system.id);
    const sensor = diagram.nodes.find((node) => node.name === "sensor");
    assert.ok(sensor?.elementId);
    await session.updateView(viewId, { rootId: system.id, expanded: [sensor.elementId] });
    diagram = await session.diagram(viewId, system.id);
    const container = diagram.nodes.find((node) => node.id === sensor.id);
    const child = diagram.nodes.find((node) => node.parentNodeId === sensor.id);
    assert.ok(container?.position.width);
    assert.ok(container.position.height);
    assert.ok(child);
    const childBefore = { ...child.position };
    const viewRevisionBefore = session.viewRevision;
    const preview = await session.previewResize(viewId, "sensor", {
      x: container.position.x - 40,
      y: container.position.y - 40,
      width: container.position.width + 40,
      height: container.position.height + 40,
    });
    assert.deepEqual(preview.resolvedIds, [sensor.id]);
    assert.equal(preview.operation, "layout.resize");
    assert.deepEqual(preview.after.positions[child.id], childBefore);
    assert.equal(session.viewRevision, viewRevisionBefore);

    const pinnedBefore = container.position.pinned;
    await session.resize(
      viewId,
      sensor.id,
      {
        x: container.position.x - 40,
        y: container.position.y - 40,
        width: container.position.width + 40,
        height: container.position.height + 40,
      },
      { actor: "resize-agent", client: "api" },
    );
    const resized = await session.diagram(viewId, system.id);
    assert.deepEqual(resized.nodes.find((node) => node.id === child.id)?.position, childBefore);
    assert.equal(pinnedBefore, false);
    assert.equal(resized.nodes.find((node) => node.id === sensor.id)?.position.pinned, true);
    const mutation = (await session.viewDocument()).mutations.at(-1);
    assert.equal(mutation?.operation, "layout.resize");
    assert.deepEqual(mutation?.targetIds, [sensor.id]);

    const resizedContainer = resized.nodes.find((node) => node.id === sensor.id)!;
    const resizedChild = resized.nodes.find((node) => node.id === child.id)!;
    await session.move(
      viewId,
      sensor.id,
      resizedContainer.position.x + 60,
      resizedContainer.position.y + 35,
      true,
      { actor: "resize-agent", client: "api" },
    );
    const movedGroup = await session.diagram(viewId, system.id);
    assert.deepEqual(movedGroup.nodes.find((node) => node.id === child.id)?.position, {
      ...resizedChild.position,
      x: resizedChild.position.x + 60,
      y: resizedChild.position.y + 35,
    });

    const controller = movedGroup.nodes.find((node) => node.name === "controller");
    assert.ok(controller);
    await Promise.all([
      session.move(viewId, sensor.id, resizedContainer.position.x + 90, resizedContainer.position.y + 55, true),
      session.move(viewId, controller.id, controller.position.x + 45, controller.position.y + 25, true),
    ]);
    const concurrent = await session.diagram(viewId, system.id);
    assert.equal(concurrent.nodes.find((node) => node.id === sensor.id)?.position.x, resizedContainer.position.x + 90);
    assert.equal(concurrent.nodes.find((node) => node.id === controller.id)?.position.x, controller.position.x + 45);

    const fit = await session.previewResize(viewId, sensor.elementId, { fit: true });
    assert.equal(fit.after.positions[sensor.id]?.width, 640);
    assert.equal(fit.after.positions[sensor.id]?.height, 380);
    await assert.rejects(
      session.move(viewId, child.id, container.position.x, container.position.y, true),
      /allowable bounds/u,
    );
    await assert.rejects(
      session.previewResize(viewId, child.id, { width: 640, height: 380 }),
      /only expanded system containers/u,
    );
  } finally {
    await session.close();
  }
});

test("Isolette FAA preset is curated, bounded, and fully resolved", async () => {
  const { root, library } = await copyIsoletteProject("sysml-viz-isolette-");
  const session = await SysmlVizSession.create({ root, libraryRoots: [library] });
  try {
    const view = await session.view("faa-a1");
    assert.deepEqual(view.preset, {
      id: FAA_A1_PRESET_ID,
      version: FAA_A1_PRESET_VERSION,
    });
    assert.equal((await session.viewDocument()).viewRevision, 0);
    const diagram = await session.diagram("faa-a1");
    const requirement = session.requirements("REQ_MMI_1")[0];
    assert.ok(requirement);
    const requirementDetails = await session.inspect(String(requirement.id));
    assert.equal(requirementDetails.label, "REQ_MMI_1");
    assert.equal(requirementDetails.ownerId, "def:Monitor::Manage_Monitor_Interface_i");
    assert.equal(requirementDetails.contractKind, "case");
    assert.equal((requirementDetails.references as string[]).length, 2);
    assert.equal((requirementDetails.related as Array<{ kind: string }>).some((item) => item.kind === "gumbo-contract"), true);
    assert.equal(view.name, "FAA Figure A-1");
    assert.equal(view.showPorts, false);
    assert.equal(view.showTypes, false);
    assert.equal(diagram.nodes.some((node) => node.name === "isolette_processor"), false);
    assert.equal(diagram.boundaryPorts.some((port) => port.name === "heat_loss"), false);
    assert.equal(diagram.edges.some((edge) => edge.name === "hl"), false);
    assert.equal(diagram.edges.some((edge) => edge.unresolved), false);
    assert.equal(diagram.edges.length, 9);
    assert.equal(
      diagram.edges.some((edge) =>
        ["a2ts", "al", "hs", "lat", "ms", "oioa", "oioc", "oiovi", "rs", "uat", "udt", "n2ioa"].includes(edge.name),
      ),
      false,
    );
    assert.equal(Object.keys(view.edgeRoutes).length, 9);
    const boundary = diagram.nodes.find((node) => node.name === "anIncubator");
    assert.deepEqual(
      boundary && {
        x: boundary.position.x,
        y: boundary.position.y,
        width: boundary.position.width,
        height: boundary.position.height,
      },
      { x: 42, y: 108, width: 1_088, height: 592 },
    );
    const svg = (await session.render("svg", "faa-a1")).toString("utf8");
    assert.match(svg, /view-annotations/);
    assert.match(svg, /d="M320,444 L430,444"/u);
    assert.doesNotMatch(svg, /<circle/u);
    assert.doesNotMatch(svg, /id="root-qualified-name"/u);
    assert.equal(
      createHash("sha256").update(svg).digest("hex"),
      "060f5bc0819cd874365fe8198de7a5e506c77255d437211025355d926d277cb6",
    );
  } finally {
    await session.close();
  }
});

test("FAA preset adoption is safe, revisioned, idempotent, and fail-closed", async () => {
  const { root, library } = await copyIsoletteProject("sysml-viz-isolette-preset-");
  const viewsPath = path.join(root, ".sysmlviz", "views.json");
  const readDocument = async (): Promise<ViewDocument> =>
    JSON.parse(await readFile(viewsPath, "utf8")) as ViewDocument;
  const writeDocument = async (document: ViewDocument): Promise<void> =>
    await writeFile(viewsPath, `${JSON.stringify(document, null, 2)}\n`, "utf8");
  const open = async (): Promise<{ document: ViewDocument; view: ViewState }> => {
    const session = await SysmlVizSession.create({ root, libraryRoots: [library] });
    try {
      return {
        document: structuredClone(await session.viewDocument()),
        view: structuredClone(await session.view(FAA_A1_PRESET_ID)),
      };
    } finally {
      await session.close();
    }
  };

  const fresh = await open();
  assert.deepEqual(fresh.view.preset, { id: FAA_A1_PRESET_ID, version: FAA_A1_PRESET_VERSION });
  assert.equal(fresh.document.viewRevision, 0);

  const legacy = await readDocument();
  const legacyView = legacy.views.find((view) => view.id === FAA_A1_PRESET_ID);
  assert.ok(legacyView);
  delete legacyView.preset;
  legacy.viewRevision = 7;
  await writeDocument(legacy);
  const adopted = await open();
  assert.deepEqual(adopted.view.preset, { id: FAA_A1_PRESET_ID, version: FAA_A1_PRESET_VERSION });
  assert.equal(adopted.document.viewRevision, 8);
  const adoption = adopted.document.mutations.at(-1);
  assert.equal(adoption?.operation, "preset.adopted");
  assert.equal(adoption?.client, "system");
  assert.equal(adoption?.viewRevision, 8);
  assert.deepEqual(adoption?.targetIds, [FAA_A1_PRESET_ID]);
  assert.deepEqual(adoption?.changedFields, ["preset"]);

  const idempotent = await open();
  assert.equal(idempotent.document.viewRevision, 8);
  assert.deepEqual(idempotent.view, adopted.view);
  assert.deepEqual(idempotent.document.mutations, adopted.document.mutations);

  const newer = await readDocument();
  const newerView = newer.views.find((view) => view.id === FAA_A1_PRESET_ID);
  assert.ok(newerView);
  newerView.preset = { id: FAA_A1_PRESET_ID, version: 99 };
  newer.viewRevision = 9;
  await writeDocument(newer);
  const refusedNewer = await open();
  assert.deepEqual(refusedNewer.view.preset, { id: FAA_A1_PRESET_ID, version: 99 });
  assert.equal(refusedNewer.document.viewRevision, 9);

  const arbitrary = await readDocument();
  const arbitraryView = arbitrary.views.find((view) => view.id === FAA_A1_PRESET_ID);
  assert.ok(arbitraryView);
  delete arbitraryView.preset;
  arbitraryView.name = "User-created FAA workspace";
  arbitrary.viewRevision = 10;
  await writeDocument(arbitrary);
  const refusedArbitrary = await open();
  assert.equal(refusedArbitrary.view.preset, undefined);
  assert.equal(refusedArbitrary.view.name, "User-created FAA workspace");
  assert.equal(refusedArbitrary.document.viewRevision, 10);
});
