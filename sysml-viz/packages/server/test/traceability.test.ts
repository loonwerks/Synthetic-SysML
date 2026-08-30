import assert from "node:assert/strict";
import { promises as fs } from "node:fs";
import os from "node:os";
import path from "node:path";
import test from "node:test";

import { loadSystemAbstract, parseMarkdownTraceAnchors } from "../src/traceability.js";

test("System Abstract IDs map to exact paragraph ranges", () => {
  const markdown = `# Abstract

## Goals

GOAL-01: First line.
Continuation.

Rationale: Kept with the goal.

GOAL-02: Second goal.

## Context

CTX-01: Context text.

INT-01: A complete interaction sentence.

Unscoped section prose must not be absorbed.

ABS-01 — An evidence-class declaration.

BEH-01 / CASE-01: One clause with two stable IDs.

PART-03A (refined owner): Qualified title.

FAULT-02 [case 2]: Qualified fault.

RES-MR-01 — Compound resolution.
`;
  const anchors = parseMarkdownTraceAnchors(markdown);
  assert.deepEqual(anchors.map(({ id, startLine, endLine, heading }) => ({ id, startLine, endLine, heading })), [
    { id: "GOAL-01", startLine: 5, endLine: 8, heading: "Goals" },
    { id: "GOAL-02", startLine: 10, endLine: 10, heading: "Goals" },
    { id: "CTX-01", startLine: 14, endLine: 14, heading: "Context" },
    { id: "INT-01", startLine: 16, endLine: 16, heading: "Context" },
    { id: "ABS-01", startLine: 20, endLine: 20, heading: "Context" },
    { id: "BEH-01", startLine: 22, endLine: 22, heading: "Context" },
    { id: "CASE-01", startLine: 22, endLine: 22, heading: "Context" },
    { id: "PART-03A", startLine: 24, endLine: 24, heading: "Context" },
    { id: "FAULT-02", startLine: 26, endLine: 26, heading: "Context" },
    { id: "RES-MR-01", startLine: 28, endLine: 28, heading: "Context" },
  ]);
  assert.equal(anchors.find((anchor) => anchor.id === "INT-01")?.text, "INT-01: A complete interaction sentence.");
  assert.equal(markdown.slice(anchors[0]!.startOffset, anchors[0]!.endOffset).trim(), anchors[0]!.text);
});

test("System Abstract discovery is conventional, workspace-bounded, and reports missing IDs", async () => {
  const workspace = await fs.mkdtemp(path.join(os.tmpdir(), "sysml-viz-trace-"));
  try {
    const run = path.join(workspace, "run");
    const model = path.join(run, "model");
    await fs.mkdir(model, { recursive: true });
    await fs.writeFile(path.join(run, "system-abstract.md"), "# A\n\nPART-01: Responsibility.\n");
    const document = await loadSystemAbstract(
      model,
      workspace,
      ["PART-01", "MON-99"],
      { taggedElementCount: 3, traceAssociationCount: 4 },
    );
    assert.equal(document?.relativePath, path.join("run", "system-abstract.md"));
    assert.deepEqual(document?.referencedTraceIds, ["MON-99", "PART-01"]);
    assert.deepEqual(document?.unresolvedTraceIds, ["MON-99"]);
    assert.deepEqual(document?.duplicateAnchorIds, []);
    assert.equal(document?.taggedElementCount, 3);
    assert.equal(document?.traceAssociationCount, 4);
    assert.equal(document?.anchors[0]?.text, "PART-01: Responsibility.");
  } finally {
    await fs.rm(workspace, { recursive: true, force: true });
  }
});
