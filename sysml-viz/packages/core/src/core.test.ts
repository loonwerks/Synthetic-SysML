import assert from "node:assert/strict";
import { promises as fs } from "node:fs";
import os from "node:os";
import path from "node:path";
import test from "node:test";
import { fileURLToPath } from "node:url";

import {
  computeDiagramHealth,
  buildRenderScene,
  annotationBounds,
  deriveDiagram,
  discoverSysmlFiles,
  findRequirements,
  inspectElement,
  pathPatternMatcher,
  parseProject,
  parseProjectSources,
  nearestFreePosition,
  presentationNodeBounds,
  rectanglesOverlap,
  renderDiagramSvg,
  summarizeModel,
  type DiagramModel,
  assessContainerResize,
  defaultContainerResizeConstraints,
} from "./index.js";

const repositoryRoot = fileURLToPath(new URL("../../../../", import.meta.url));
const simpleModelRoot = fileURLToPath(
  new URL("../test/fixtures/simple_model/", import.meta.url),
);

test("expanded container resize bounds are deterministic across browser and server callers", () => {
  const child = { id: "child", x: 500, y: 260, width: 248, height: 118 };
  const constraints = defaultContainerResizeConstraints([child]);
  assert.equal(assessContainerResize({ x: 100, y: 100, width: 676, height: 380 }, constraints).valid, true);
  const tooNarrow = assessContainerResize({ x: 100, y: 100, width: 640, height: 380 }, constraints);
  assert.equal(tooNarrow.valid, false);
  assert.equal(tooNarrow.escapingChildId, "child");
  assert.equal(tooNarrow.required.width, 676);
  assert.equal(
    assessContainerResize(
      { x: 100, y: 100, width: 676, height: 380 },
      defaultContainerResizeConstraints([child], { x: 120, y: 80, width: 900, height: 700 }),
    ).outsideParent,
    true,
  );
});

test("shared presentation geometry places objects deterministically with clearance", () => {
  assert.deepEqual(
    presentationNodeBounds({ id: "actor", kind: "actor", label: "Actor", x: 10, y: 20, width: 40, height: 50 }),
    { x: 10, y: 20, width: 248, height: 142 },
  );
  assert.deepEqual(annotationBounds({ text: "A short note", position: { x: 5, y: 6 } }), {
    x: 5,
    y: 6,
    width: 220,
    height: 71,
  });
  assert.equal(annotationBounds({
    text: "A short note",
    position: { x: 5, y: 6 },
    arrow: { targetId: "port", targetKind: "port" },
  }).height, 96);
  const occupied = [{ x: 0, y: 0, width: 100, height: 100 }];
  assert.deepEqual(nearestFreePosition({ x: 200, y: 200 }, { width: 20, height: 20 }, occupied), { x: 200, y: 200 });
  const first = nearestFreePosition({ x: 10, y: 10 }, { width: 20, height: 20 }, occupied);
  const second = nearestFreePosition({ x: 10, y: 10 }, { width: 20, height: 20 }, occupied);
  assert.deepEqual(first, second);
  assert.equal(rectanglesOverlap({ ...first, width: 20, height: 20 }, occupied[0]!, 28), false);
});

test("adjacent @trace comments survive normalization and diagram derivation", () => {
  const result = parseProjectSources({
    root: "/trace-project",
    sources: [{
      path: "/trace-project/Trace.sysml",
      content: `package Trace {
        // @trace PART-01 MON-01
        part def Child :> System {
          // @trace MON-01 CTX-01
          port input : DataPort { in :>> type : Sample; }
        }
        part def Root :> System {
          // an adjacent non-trace annotation remains harmless
          // @trace PART-01 CTX-01 PART-01
          part child : Child;
        }
      }`,
    }],
  });
  const part = result.model.parts.find((candidate) => candidate.name === "child");
  assert.deepEqual(part?.traceIds, ["PART-01", "CTX-01"]);
  const diagram = deriveDiagram(result.model, { rootId: "Trace::Root" });
  assert.deepEqual(diagram.nodes[0]?.traceIds, ["PART-01", "CTX-01", "MON-01"]);
  assert.deepEqual(diagram.nodes[0]?.ports[0]?.traceIds, ["MON-01", "CTX-01"]);
});

test("trace identifiers may use a single refinement suffix", () => {
  const result = parseProjectSources({
    root: "/suffix-project",
    sources: [{
      path: "/suffix-project/Suffix.sysml",
      content: `package Demo {
        part def Status;
        part def Root {
          // @trace CTRL-03A CTRL-03B RES-MR-01
          part status : Status;
        }
      }`,
    }],
  });
  const usage = result.model.parts.find((element) => element.name === "status");
  assert.deepEqual(usage?.traceIds, ["CTRL-03A", "CTRL-03B", "RES-MR-01"]);
});

test("adjacent GUMBO @trace comments attach to contracts and compute-case clauses", () => {
  const result = parseProjectSources({
    root: "/gumbo-trace-project",
    sources: [{
      path: "/gumbo-trace-project/Trace.sysml",
      content: `package Trace {
        part def Controller :> Thread {
          language "GUMBO" /*{
            invariants
              // @trace MON-01 MON-01
              inv bounded: true;
            compute
              // @trace CTRL-01 SAF-03
              guarantee command_is_safe: true;
              // @trace DETACHED-01

              guarantee detached_comment: true;
              // rationale mentions @trace PROSE-01 but is not authoritative
              guarantee prose_comment: true;
              // @trace ORPHAN-01
            compute_cases
              // @trace BEH-01
              case nominal:
                // @trace ASM-01
                assume input_valid;
                // @trace CTRL-02 BEH-01
                guarantee output_valid;
          }*/
        }
      }`,
    }],
  });
  const contracts = Object.fromEntries(result.model.contracts.map((contract) => [contract.name, contract]));
  assert.deepEqual(contracts["bounded"]?.traceIds, ["MON-01"]);
  assert.deepEqual(contracts["command_is_safe"]?.traceIds, ["CTRL-01", "SAF-03"]);
  assert.deepEqual(contracts["detached_comment"]?.traceIds, []);
  assert.deepEqual(contracts["prose_comment"]?.traceIds, []);
  assert.deepEqual(contracts["nominal"]?.traceIds, ["BEH-01", "ASM-01", "CTRL-02"]);
  assert.deepEqual(contracts["nominal"]?.clauses.map((clause) => clause.traceIds), [
    ["ASM-01"],
    ["CTRL-02", "BEH-01"],
  ]);
  assert.equal(result.model.contracts.some((contract) => contract.traceIds.includes("ORPHAN-01")), false);
});

test("path patterns handle basename globs, globstars, and normalized separators", () => {
  assert.equal(pathPatternMatcher(["Model.sysml"])("nested/Model.sysml"), true);
  assert.equal(pathPatternMatcher(["draft-?.sysml"])("src/draft-1.sysml"), true);
  assert.equal(pathPatternMatcher(["draft-?.sysml"])("src/draft-10.sysml"), false);
  assert.equal(pathPatternMatcher(["src/*.sysml"])("src/Model.sysml"), true);
  assert.equal(pathPatternMatcher(["src/*.sysml"])("src/nested/Model.sysml"), false);
  assert.equal(pathPatternMatcher(["src/**/*.sysml"])("src/Model.sysml"), true);
  assert.equal(pathPatternMatcher(["src/**/*.sysml"])("src\\nested\\Model.sysml"), true);
  assert.equal(pathPatternMatcher(["src\\**\\*.sysml"])("././src/nested/Model.sysml"), true);
  assert.equal(pathPatternMatcher(["src/**/*.sysml"])("other/Model.sysml"), false);
});

test("shared render scene includes negative overlays, labels, markers, and perimeter routes", async () => {
  const result = await parseProject({ root: simpleModelRoot });
  const diagram = deriveDiagram(result.model, { rootId: "Simple_Sump_Pump::Sump_Pump_System_i" });
  const target = diagram.nodes[0];
  assert.ok(target);
  const scene = buildRenderScene(diagram, {
    showEdgeLabels: false,
    layout: { nodes: { [target.id]: { x: 100, y: 100, width: 230, height: 90 } } },
    presentation: {
      annotations: [{
        id: "negative-note",
        text: "Left-side note",
        position: { x: -240, y: -80 },
        arrow: { targetId: target.id, targetKind: "node" },
      }],
      nodes: [{ id: "pilot", kind: "actor", label: "Pilot", x: -100, y: 420 }],
      edges: [{
        id: "pilot-command",
        sourceId: "pilot",
        targetId: target.id,
        kind: "informational",
        label: "advises & reviews",
        bendPoints: [{ x: 20, y: 300 }],
      }],
    },
  });
  assert.ok(scene.bounds.x <= -240);
  assert.ok(scene.bounds.y <= -152);
  assert.ok(scene.translate.x > 0);
  assert.ok(scene.translate.y > 0);
  assert.equal(scene.labels.some((label) => label.id === "pilot-command--label"), true);
  assert.equal(scene.labels.some((label) => label.kind === "edge"), false);
  assert.deepEqual(
    scene.presentationNodes.find((node) => node.id === "pilot")?.bounds,
    { x: -100, y: 420, width: 248, height: 142 },
  );
  const route = scene.routes.find((candidate) => candidate.id === "pilot-command");
  assert.ok(route);
  const end = route.points.at(-1);
  assert.ok(end);
  const box = scene.nodes[target.id]!;
  assert.ok(
    Math.abs(end.x - box.x) < 1 ||
    Math.abs(end.x - (box.x + box.width)) < 1 ||
    Math.abs(end.y - box.y) < 1 ||
    Math.abs(end.y - (box.y + box.height)) < 1,
  );
  const svg = renderDiagramSvg(diagram, {
    layout: { nodes: { [target.id]: box } },
    showEdgeLabels: false,
    presentation: {
      nodes: [{ id: "pilot", kind: "actor", label: "Pilot", x: -100, y: 420 }],
      edges: [{ id: "pilot-command", sourceId: "pilot", targetId: target.id, kind: "informational", label: "advises & reviews" }],
    },
  });
  assert.match(svg, /data-kind="actor"/u);
  const actorMarkup = svg.match(/<g id="pilot"[\s\S]*?<\/g>/u)?.[0] ?? "";
  assert.match(actorMarkup, /<rect/u);
  assert.doesNotMatch(actorMarkup, /<circle|actor-head|actor-body/u);
  assert.match(svg, /advises &amp; reviews/u);
  assert.match(svg, /class="edge-label presentation-only"/u);
});

test("health tests actual segments against rendered label rectangles", async () => {
  const result = await parseProject({ root: simpleModelRoot });
  const diagram = deriveDiagram(result.model, { rootId: "Simple_Sump_Pump::Sump_Pump_System_i" });
  const presentation = {
    nodes: [
      { id: "a", kind: "actor" as const, label: "A", x: 0, y: 0, width: 30, height: 112 },
      { id: "b", kind: "actor" as const, label: "B", x: 100, y: 100, width: 30, height: 112 },
    ],
    edges: [{ id: "diagonal", sourceId: "a", targetId: "b", kind: "informational" as const }],
  };
  const health = computeDiagramHealth(diagram, {}, { presentation });
  assert.equal(
    health.labelCollisions.some((collision) =>
      collision.kind === "label-edge" &&
      collision.firstId === "a--label" &&
      collision.secondId === "diagonal"
    ),
    false,
  );

  const trueHealth = computeDiagramHealth(diagram, {}, {
    presentation: {
      nodes: [
        ...presentation.nodes,
        { id: "top", kind: "reference", label: "Top", x: 5, y: -120, width: 20, height: 20 },
        { id: "bottom", kind: "reference", label: "Bottom", x: 5, y: 180, width: 20, height: 20 },
      ],
      edges: [{ id: "vertical", sourceId: "top", targetId: "bottom", kind: "informational" }],
    },
  });
  const collision = trueHealth.labelCollisions.find((candidate) =>
    candidate.kind === "label-edge" &&
    candidate.firstId === "a--label" &&
    candidate.secondId === "vertical"
  );
  assert.ok(collision?.labelBounds);
  assert.ok(collision?.routeSegment);
  assert.ok(collision?.intersection);
  assert.equal(collision?.distance, 0);
  const routeFinding = trueHealth.findings.find((finding) => finding.code === "route-object-collision");
  assert.equal(routeFinding?.severity, "attention");
  assert.equal(routeFinding?.repairable, false);

  const dangling = computeDiagramHealth(diagram, {}, {
    presentation: {
      edges: [{ id: "missing-link", sourceId: "missing-a", targetId: "missing-b", kind: "reference" }],
    },
  });
  assert.deepEqual(dangling.danglingPresentationLinkIds, ["missing-link"]);
  assert.equal(dangling.findings.some((finding) =>
    finding.code === "dangling-presentation-link" && finding.severity === "blocked" && !finding.repairable
  ), true);

  const annotationTarget = diagram.nodes[0];
  assert.ok(annotationTarget);
  const annotationHealth = computeDiagramHealth(diagram, {}, {
    presentation: {
      annotations: [{
        id: "note",
        text: "Expected annotation border contact",
        position: { x: -400, y: -300 },
        arrow: { targetId: annotationTarget.id, targetKind: "node" },
      }],
    },
  });
  assert.equal(annotationHealth.routeObjectCollisions.some((candidate) =>
    candidate.routeId === "note--arrow" && candidate.objectId === "note" && !candidate.actionable
  ), true);
});

test("discovers only the explicit project and library roots", async () => {
  const temporary = await fs.mkdtemp(path.join(os.tmpdir(), "sysml-viz-discovery-"));
  try {
    const project = path.join(temporary, "project");
    const sibling = path.join(temporary, "copy");
    const library = path.join(temporary, "library");
    await fs.mkdir(path.join(project, "external/sysml-aadl-libraries"), { recursive: true });
    await fs.mkdir(path.join(project, "nested"), { recursive: true });
    await fs.mkdir(sibling, { recursive: true });
    await fs.mkdir(library, { recursive: true });
    await Promise.all([
      fs.writeFile(path.join(project, "Model.sysml"), "package Model {}"),
      fs.writeFile(path.join(project, "ignore.txt"), "not a model"),
      fs.writeFile(path.join(project, "external/sysml-aadl-libraries", "Copied.sysml"), "package Copied {}"),
      fs.writeFile(path.join(project, "nested", "Keep.sysml"), "package Keep {}"),
      fs.writeFile(path.join(project, "nested", "Skip.sysml"), "package Skip {}"),
      fs.writeFile(path.join(sibling, "Duplicate.sysml"), "package Duplicate {}"),
      fs.writeFile(path.join(library, "AADL.sysml"), "package AADL {}"),
    ]);

    const withoutLibrary = await discoverSysmlFiles({ root: project });
    assert.deepEqual(withoutLibrary.map((file) => file.relativePath), [
      "Model.sysml",
      "nested/Keep.sysml",
      "nested/Skip.sysml",
    ]);

    const filtered = await discoverSysmlFiles({
      root: project,
      libraryRoots: [library],
      include: ["Model.sysml", "nested/**/*.sysml"],
      exclude: ["**/Skip.sysml"],
    });
    assert.deepEqual(
      filtered.map((file) => [file.origin, file.relativePath]),
      [
        ["project", "Model.sysml"],
        ["project", "nested/Keep.sysml"],
        ["library", "AADL.sysml"],
      ],
    );

    const withLibrary = await discoverSysmlFiles({ root: project, libraryRoots: [library] });
    assert.equal(withLibrary.length, 4);
    assert.deepEqual(withLibrary.map((file) => file.origin), ["project", "project", "project", "library"]);
    assert.equal(withLibrary.some((file) => file.path.includes("copy")), false);
    assert.equal(withLibrary.some((file) => file.path.includes("external/sysml-aadl-libraries")), false);
  } finally {
    await fs.rm(temporary, { recursive: true, force: true });
  }
});

test("discovery keeps nested library files out of the project even through symlinks", async () => {
  const temporary = await fs.mkdtemp(path.join(os.tmpdir(), "sysml-viz-discovery-links-"));
  try {
    const project = path.join(temporary, "project");
    const library = path.join(project, "vendor", "library");
    const external = path.join(temporary, "external");
    await Promise.all([
      fs.mkdir(library, { recursive: true }),
      fs.mkdir(external, { recursive: true }),
    ]);
    const internalTarget = path.join(project, "InternalTarget.sysml");
    const libraryTarget = path.join(library, "Library.sysml");
    const externalTarget = path.join(external, "External.sysml");
    await Promise.all([
      fs.writeFile(path.join(project, "Project.sysml"), "package Project {}"),
      fs.writeFile(internalTarget, "package InternalTarget {}"),
      fs.writeFile(libraryTarget, "package Library {}"),
      fs.writeFile(externalTarget, "package External {}"),
    ]);
    await Promise.all([
      fs.symlink(internalTarget, path.join(project, "InternalAlias.sysml")),
      fs.symlink(libraryTarget, path.join(project, "LibraryAlias.sysml")),
      fs.symlink(externalTarget, path.join(project, "ExternalAlias.sysml")),
    ]);

    const discovered = await discoverSysmlFiles({
      root: project,
      libraryRoots: [library],
      include: [
        "Project.sysml",
        "InternalAlias.sysml",
        "InternalTarget.sysml",
        "LibraryAlias.sysml",
        "ExternalAlias.sysml",
      ],
    });

    assert.deepEqual(
      discovered.map((file) => [file.origin, file.relativePath]),
      [
        ["project", "InternalAlias.sysml"],
        ["project", "Project.sysml"],
        ["library", "Library.sysml"],
      ],
    );
    const canonicalInternalTarget = await fs.realpath(internalTarget);
    assert.equal(
      discovered.filter((file) => file.realPath === canonicalInternalTarget).length,
      1,
    );
  } finally {
    await fs.rm(temporary, { recursive: true, force: true });
  }
});

test("an ancestor library cannot re-add project files rejected by the project include", async () => {
  const temporary = await fs.mkdtemp(path.join(os.tmpdir(), "sysml-viz-discovery-overlap-"));
  try {
    const library = path.join(temporary, "library");
    const project = path.join(library, "project");
    await fs.mkdir(project, { recursive: true });
    await Promise.all([
      fs.writeFile(path.join(project, "Keep.sysml"), "package Keep {}"),
      fs.writeFile(path.join(project, "Omitted.sysml"), "package Omitted {}"),
      fs.writeFile(path.join(library, "Context.sysml"), "package Context {}"),
      fs.writeFile(path.join(library, "Draft.sysml"), "package Draft {}"),
    ]);

    const discovered = await discoverSysmlFiles({
      root: project,
      libraryRoots: [library],
      include: ["Keep.sysml"],
      exclude: ["Draft.sysml"],
    });

    assert.deepEqual(
      discovered.map((file) => [file.origin, file.relativePath]),
      [
        ["project", "Keep.sysml"],
        ["library", "Context.sysml"],
      ],
    );
  } finally {
    await fs.rm(temporary, { recursive: true, force: true });
  }
});

test("parses the Simple Sump Pump semantic hierarchy and GUMBO", async () => {
  const result = await parseProject({ root: simpleModelRoot });
  assert.equal(result.renderable, true);
  assert.deepEqual(result.diagnostics, []);
  const summary = summarizeModel(result.model);
  assert.equal(summary.definitionCount, 4);
  assert.equal(summary.partCount, 3);
  assert.equal(summary.portCount, 12);
  assert.equal(summary.connectionCount, 8);
  assert.equal(summary.contractCount, 6);

  const controller = result.model.definitions.find(
    (definition) => definition.qualifiedName === "Simple_Sump_Pump::Pump_Controller_i",
  );
  assert.equal(controller?.category, "thread");
  const contracts = result.model.contracts.filter((contract) => contract.ownerId === controller?.id);
  assert.equal(contracts.some((contract) => contract.name === "init_controller_mode"), true);
  assert.equal(
    contracts
      .find((contract) => contract.name === "init_controller_mode")
      ?.referencedPortIds.some((id) => id.endsWith("::pump_command")),
    true,
  );

  const diagram = deriveDiagram(result.model, {
    rootId: "Simple_Sump_Pump::Sump_Pump_System_i",
  });
  assert.deepEqual(diagram.nodes.map((node) => node.name), ["controller_process"]);
  assert.equal(diagram.boundaryPorts.length, 4);
  assert.equal(diagram.edges.length, 4);
  assert.equal(diagram.edges.every((edge) => !edge.unresolved), true);
});

test("parses Isolette requirements and expands the FAA context instance", async () => {
  const result = await parseProject({
    root: path.join(repositoryRoot, "external", "inspecta-scp", "scp_demo_artifacts", "isolette_io"),
  });
  assert.equal(result.renderable, true);
  assert.equal(result.diagnostics.length, 0);
  assert.equal(result.model.definitions.length, 38);
  assert.equal(result.model.connections.length, 121);
  assert.equal(result.model.allocations.length, 4);

  const requirement = findRequirements(result.model, "REQ_MMI_1")[0];
  assert.equal(requirement?.requirementId, "REQ_MMI_1");
  assert.equal(requirement?.ownerId, "def:Monitor::Manage_Monitor_Interface_i");
  assert.equal(requirement?.description?.includes("status Init"), true);
  assert.deepEqual(
    requirement?.referencedPortIds.map((id) => id.split("::").at(-1)),
    ["monitor_mode", "monitor_status"],
  );
  const inspection = inspectElement(result.model, requirement?.id ?? "missing");
  assert.equal(inspection.owner?.id, "def:Monitor::Manage_Monitor_Interface_i");
  assert.equal(inspection.related.some((element) => element.kind === "gumbo-contract"), true);

  const root = "Isolette_Environment::Isolette_Environment_Normal_Operation_Normal_Operation";
  const initial = deriveDiagram(result.model, { rootId: root });
  assert.deepEqual(
    initial.nodes.map((node) => node.name),
    ["anIncubator", "anInfant", "aNurse", "theAir"],
  );
  const incubator = initial.nodes.find((node) => node.name === "anIncubator");
  assert.ok(incubator);
  assert.equal(incubator.canExpand, true);
  assert.equal(initial.nodes.find((node) => node.name === "anInfant")?.canExpand, false);
  const processor = result.model.parts.find(
    (part) => part.qualifiedName === "Isolette::Isolette_Single_Sensor::isolette_processor",
  );
  assert.ok(processor);
  const expanded = deriveDiagram(result.model, {
    rootId: root,
    expanded: [incubator.elementId],
    view: { hiddenElementIds: [processor.id] },
  });
  const nested = expanded.nodes.filter((node) => node.parentNodeId === incubator.id);
  assert.deepEqual(
    nested.map((node) => node.name),
    ["heat_source", "operator_interface", "temperature_sensor", "thermostat"],
  );
  assert.equal(nested.every((node) => node.instancePath[0] === "anIncubator"), true);
  assert.equal(expanded.edges.every((edge) => !edge.unresolved), true);
  assert.equal(expanded.edges.some((edge) => edge.id.endsWith("/anIncubator/ct")), true);
});

test("fatal syntax diagnostics make the current revision unrenderable", () => {
  const result = parseProjectSources({
    root: "/virtual/project",
    sources: [
      {
        path: "/virtual/project/Broken.sysml",
        root: "/virtual/project",
        content: "package Broken { part def System_i :> System { port input : DataPort { in :>> type : D; }",
      },
    ],
  });
  assert.equal(result.renderable, false);
  assert.equal(result.diagnostics.some((diagnostic) => diagnostic.code === "SYSML_UNCLOSED_BRACE"), true);
  assert.equal(result.model.definitions.some((definition) => definition.name === "System_i"), true);
});

test("GUMBO brace failures are fatal and source located", () => {
  const result = parseProjectSources({
    root: "/virtual/project",
    sources: [
      {
        path: "/virtual/project/BrokenGumbo.sysml",
        root: "/virtual/project",
        content: 'package Broken { part def T :> Thread { language "GUMBO" /*{ compute guarantee x: true; */ } }',
      },
    ],
  });
  const diagnostic = result.diagnostics.find((item) => item.code === "GUMBO_UNCLOSED_BRACE");
  assert.equal(result.renderable, false);
  assert.ok(diagnostic?.span);
  assert.equal(diagnostic.span.file, "/virtual/project/BrokenGumbo.sysml");
});

test("health metrics include unresolved edges, overlaps, and crossings", () => {
  const span = {
    file: "/test.sysml",
    start: { offset: 0, line: 1, column: 1 },
    end: { offset: 1, line: 1, column: 2 },
  };
  const diagram: DiagramModel = {
    version: 1,
    id: "diagram:test",
    rootDefinitionId: "def:test",
    rootQualifiedName: "Test::Root",
    title: "Root",
    boundaryPorts: [],
    hiddenElementIds: ["hidden"],
    diagnostics: [],
    nodes: ["a", "b", "c", "d"].map((name) => ({
      id: `node:${name}`,
      elementId: `part:${name}`,
      instancePath: [name],
      parentNodeId: null,
      name,
      label: name,
      typeName: "T",
      category: "system" as const,
      depth: 0,
      expanded: false,
      ports: [],
      contracts: { invariants: 0, assumptions: 0, guarantees: 0, cases: 0, requirements: 0 },
      traceIds: [],
      source: span,
    })),
    edges: [
      {
        id: "edge:ac",
        elementId: "connection:ac",
        name: "ac",
        label: "ac",
        sourceNodeId: "node:a",
        sourcePortId: null,
        targetNodeId: "node:c",
        targetPortId: null,
        sourcePath: ["a"],
        targetPath: ["c"],
        unresolved: true,
        depth: 0,
        traceIds: [],
        source: span,
      },
      {
        id: "edge:bd",
        elementId: "connection:bd",
        name: "bd",
        label: "bd",
        sourceNodeId: "node:b",
        sourcePortId: null,
        targetNodeId: "node:d",
        targetPortId: null,
        sourcePath: ["b"],
        targetPath: ["d"],
        unresolved: false,
        depth: 0,
        traceIds: [],
        source: span,
      },
    ],
  };
  const health = computeDiagramHealth(diagram, {
    nodes: {
      "node:a": { x: 0, y: 0, width: 20, height: 20 },
      "node:b": { x: 100, y: 0, width: 20, height: 20 },
      "node:c": { x: 100, y: 100, width: 20, height: 20 },
      "node:d": { x: 0, y: 100, width: 20, height: 20 },
    },
    edges: {
      "edge:ac": [{ x: 10, y: 10 }, { x: 110, y: 110 }],
      "edge:bd": [{ x: 110, y: 10 }, { x: 10, y: 110 }],
    },
  });
  assert.equal(health.unresolvedEndpointCount, 1);
  assert.equal(health.crossingCount, 1);
  assert.equal(health.hiddenElementCount, 1);
  assert.equal(health.status, "blocked");
  assert.deepEqual(health.findings[0], {
    code: "unresolved-endpoint",
    severity: "blocked",
    message: "1 connection endpoint is unresolved.",
    count: 1,
    elementIds: ["edge:ac"],
    repairable: false,
  });

  const overlap = computeDiagramHealth(diagram, {
    nodes: {
      "node:a": { x: 0, y: 0, width: 20, height: 20 },
      "node:b": { x: 10, y: 10, width: 20, height: 20 },
    },
  });
  assert.equal(overlap.overlapCount, 1);
  assert.equal(overlap.overlaps[0]?.area, 100);
  assert.equal(overlap.findings.some((finding) => finding.code === "object-overlap" && finding.repairable), true);

  const parent = { ...diagram.nodes[0]!, expanded: true };
  const child = { ...diagram.nodes[1]!, parentNodeId: parent.id };
  const grandchild = { ...diagram.nodes[2]!, parentNodeId: child.id };
  const containment = computeDiagramHealth(
    { ...diagram, nodes: [parent, child, grandchild], edges: [] },
    {
      nodes: {
        [parent.id]: { x: 0, y: 0, width: 200, height: 200 },
        [child.id]: { x: 20, y: 20, width: 150, height: 150 },
        [grandchild.id]: { x: 40, y: 40, width: 50, height: 50 },
      },
    },
  );
  assert.equal(containment.overlapCount, 0);
  assert.deepEqual(containment.overlaps, []);
});

test("SVG export is deterministic and carries semantic IDs", async () => {
  const result = await parseProject({ root: simpleModelRoot });
  const diagram = deriveDiagram(result.model, {
    rootId: "Simple_Sump_Pump::Sump_Pump_System_i",
  });
  const first = renderDiagramSvg(diagram, { width: 900, height: 600 });
  const second = renderDiagramSvg(diagram, { width: 900, height: 600 });
  assert.equal(first, second);
  assert.match(first, /^<svg/u);
  assert.match(first, /data-element-id="part:Simple_Sump_Pump::Sump_Pump_System_i::controller_process"/u);
  assert.match(first, /alarm_from_controller/u);
});

test("SVG paints container backgrounds before internal edges and foreground content", async () => {
  const result = await parseProject({ root: simpleModelRoot });
  const collapsed = deriveDiagram(result.model, {
    rootId: "Simple_Sump_Pump::Sump_Pump_System_i",
  });
  const container = collapsed.nodes.find((node) => node.name === "controller_process");
  assert.ok(container);
  const diagram = deriveDiagram(result.model, {
    rootId: "Simple_Sump_Pump::Sump_Pump_System_i",
    expanded: [container.elementId],
  });
  const expandedContainer = diagram.nodes.find((node) => node.id === container.id);
  const leaf = diagram.nodes.find((node) => node.parentNodeId === container.id);
  const internalEdge = diagram.edges.find((edge) =>
    edge.id.endsWith("/controller_process/level_to_controller"),
  );
  assert.ok(expandedContainer);
  assert.ok(leaf);
  assert.ok(internalEdge);

  const svg = renderDiagramSvg(diagram, {
    width: 900,
    height: 650,
    layout: {
      nodes: {
        [expandedContainer.id]: { x: 80, y: 90, width: 700, height: 470 },
        [leaf.id]: { x: 270, y: 230, width: 260, height: 180 },
      },
    },
  });
  const backgroundIndex = svg.indexOf(`id="${expandedContainer.id}--background"`);
  const edgeIndex = svg.indexOf(`id="${internalEdge.id}"`);
  const leafIndex = svg.indexOf(`<g id="${leaf.id}"`);
  const foregroundLayerIndex = svg.indexOf('<g id="container-foregrounds">');
  const containerForegroundIndex = svg.indexOf(
    `<g id="${expandedContainer.id}"`,
    foregroundLayerIndex,
  );
  assert.ok(backgroundIndex >= 0);
  assert.ok(edgeIndex > backgroundIndex);
  assert.ok(leafIndex > edgeIndex);
  assert.ok(foregroundLayerIndex > leafIndex);
  assert.ok(containerForegroundIndex > foregroundLayerIndex);
  assert.match(
    svg.slice(containerForegroundIndex, containerForegroundIndex + 700),
    /fill="none"/u,
  );
});

test("SVG renders aliased edge labels at route midpoints and constrains the root subtitle", async () => {
  const result = await parseProject({ root: simpleModelRoot });
  const connection = result.model.connections.find(
    (candidate) =>
      candidate.qualifiedName ===
      "Simple_Sump_Pump::Sump_Pump_System_i::level_to_controller",
  );
  assert.ok(connection);
  const diagram = deriveDiagram(result.model, {
    rootId: "Simple_Sump_Pump::Sump_Pump_System_i",
    view: { aliases: { [connection.id]: "Operator Settings" } },
  });
  const edge = diagram.edges.find((candidate) => candidate.elementId === connection.id);
  assert.ok(edge);
  const svg = renderDiagramSvg(diagram, {
    width: 900,
    height: 600,
    layout: {
      edges: { [edge.id]: [{ x: 100, y: 200 }, { x: 500, y: 200 }] },
    },
  });
  assert.ok(svg.includes(`id="${edge.id}--label"`));
  assert.match(svg, /class="edge-label"/u);
  assert.match(svg, /fill-opacity="0\.94"/u);
  assert.match(svg, /paint-order="stroke"/u);
  assert.match(svg, /<text x="64" y="198\.83"[^>]*>Operator Settings<\/text>/u);
  assert.equal(svg.match(/>Operator Settings<\/text>/gu)?.length, 1);

  const emptyLabelSvg = renderDiagramSvg({
    ...diagram,
    edges: diagram.edges.map((candidate) =>
      candidate.id === edge.id ? { ...candidate, label: "   " } : candidate,
    ),
  });
  assert.equal(emptyLabelSvg.includes(`id="${edge.id}--label"`), false);

  const narrow = renderDiagramSvg(diagram, { width: 260, height: 600 });
  assert.ok(
    narrow.includes(`data-root-qualified-name="${diagram.rootQualifiedName}"`),
  );
  assert.ok(
    narrow.includes(`${diagram.title} — ${diagram.rootQualifiedName}</title>`),
  );
  const visibleSubtitle = narrow.match(/<text id="root-qualified-name"[^>]*>([^<]+)<\/text>/u)?.[1];
  assert.ok(visibleSubtitle?.endsWith("…"));
  assert.notEqual(visibleSubtitle, diagram.rootQualifiedName);

  const presentation = renderDiagramSvg(diagram, {
    width: 900,
    height: 600,
    showPorts: false,
    showEdgeLabels: false,
    showTypes: false,
  });
  assert.doesNotMatch(presentation, /<circle/u);
  assert.doesNotMatch(presentation, /class="edge-label"/u);
  assert.doesNotMatch(presentation, /id="root-qualified-name"/u);
});
