import assert from "node:assert/strict";
import test from "node:test";

import {
  alignNodes,
  applyLayoutConstraints,
  applyLayeredLayout,
  distributeNodes,
  resetLayout,
  type LayoutAlignment,
  type LayoutDistribution,
} from "../src/layout.js";
import { createDefaultView } from "../src/view-store.js";

test("persistent directional constraints use rectangle dimensions and gap", () => {
  const view = createDefaultView("root");
  view.positions.subject = { x: 0, y: 0, width: 80, height: 50, pinned: true };
  view.positions.anchor = { x: 300, y: 200, width: 120, height: 70, pinned: true };
  view.constraints = [{
    id: "subject-left-of-anchor",
    relation: "left-of",
    subjectId: "subject",
    objectId: "anchor",
    gap: 25,
  }];
  const constrained = applyLayoutConstraints(view);
  assert.equal(constrained.positions.subject?.x, 195);
  assert.equal(constrained.positions.subject?.y, 0);
});

test("incremental layout never moves pinned nodes", () => {
  const initial = createDefaultView("root");
  initial.positions.existing = { x: 911, y: 407, pinned: true };
  const laidOut = applyLayeredLayout(
    initial,
    {
      nodes: [{ id: "existing" }, { id: "new" }],
      edges: [{ source: "existing", target: "new" }],
    },
    { onlyNew: true },
  );
  assert.deepEqual(laidOut.positions.existing, { x: 911, y: 407, pinned: true });
  assert.ok(laidOut.positions.new);
});

test("incremental layout places new nodes around pinned rectangles", () => {
  const initial = createDefaultView("root");
  initial.positions.pinned = {
    x: 80,
    y: 80,
    width: 250,
    height: 150,
    pinned: true,
  };
  const laidOut = applyLayeredLayout(
    initial,
    {
      // Sorting puts `new` in the pinned node's nominal grid slot. This was
      // previously an exact overlap at (80, 80).
      nodes: [{ id: "pinned" }, { id: "new" }],
      edges: [],
    },
    { onlyNew: true },
  );

  assert.deepEqual(laidOut.positions.pinned, initial.positions.pinned);
  assert.deepEqual(laidOut.positions.new, { x: 80, y: 266, pinned: false });
});

test("full layout moves unpinned nodes around wide pinned geometry deterministically", () => {
  const initial = createDefaultView("root");
  initial.positions.anchor = {
    x: 80,
    y: 80,
    width: 600,
    height: 150,
    pinned: true,
  };
  initial.positions.target = { x: 1_200, y: 900, pinned: false };
  const graph = {
    nodes: [{ id: "anchor" }, { id: "target" }],
    edges: [{ source: "anchor", target: "target" }],
  };

  const first = applyLayeredLayout(initial, graph);
  const second = applyLayeredLayout(initial, graph);

  assert.deepEqual(first.positions.anchor, initial.positions.anchor);
  assert.deepEqual(first.positions.target, { x: 760, y: 80, pinned: false });
  assert.deepEqual(second.positions, first.positions);
});

test("layered layout persists real dimensions and leaves readable gaps between tall nodes", () => {
  const laidOut = applyLayeredLayout(createDefaultView("root"), {
    nodes: [
      { id: "tall", width: 248, height: 310 },
      { id: "short", width: 248, height: 120 },
    ],
    edges: [],
  });

  assert.equal(laidOut.positions.tall?.width, 248);
  assert.equal(laidOut.positions.tall?.height, 310);
  assert.equal(laidOut.positions.short?.width, 248);
  assert.equal(laidOut.positions.short?.height, 120);
  const top = [laidOut.positions.tall!, laidOut.positions.short!].sort((a, b) => a.y - b.y);
  assert.ok(top[1]!.y >= top[0]!.y + (top[0]!.height ?? 0) + 36);
});

test("feedback cycles are spread into readable layers instead of one overlapping column", () => {
  const laidOut = applyLayeredLayout(createDefaultView("root"), {
    nodes: [
      { id: "a", width: 248, height: 180 },
      { id: "b", width: 248, height: 240 },
      { id: "c", width: 248, height: 140 },
    ],
    edges: [
      { source: "a", target: "b" },
      { source: "b", target: "c" },
      { source: "c", target: "a" },
    ],
  });

  assert.ok(laidOut.positions.a!.x < laidOut.positions.b!.x);
  assert.ok(laidOut.positions.b!.x < laidOut.positions.c!.x);
  const centers = Object.values(laidOut.positions).map((position) =>
    position.y + (position.height ?? 150) / 2,
  );
  assert.ok(centers.every((center) => center === centers[0]), "layers should share a visual centerline");
});

test("alignment uses rectangle dimensions and preserves unrelated positions", () => {
  const initial = createDefaultView("root");
  initial.positions.wide = {
    x: 10,
    y: 20,
    width: 100,
    height: 40,
    pinned: false,
  };
  initial.positions.narrow = {
    x: 200,
    y: 100,
    width: 50,
    height: 80,
    pinned: false,
  };
  initial.positions.unrelated = {
    x: -20,
    y: 300,
    width: 77,
    height: 66,
    pinned: true,
  };
  const originalPositions = structuredClone(initial.positions);
  const cases: Array<{
    alignment: LayoutAlignment;
    wide: { x: number; y: number };
    narrow: { x: number; y: number };
  }> = [
    { alignment: "left", wide: { x: 10, y: 20 }, narrow: { x: 10, y: 100 } },
    { alignment: "center-x", wide: { x: 80, y: 20 }, narrow: { x: 105, y: 100 } },
    { alignment: "right", wide: { x: 150, y: 20 }, narrow: { x: 200, y: 100 } },
    { alignment: "top", wide: { x: 10, y: 20 }, narrow: { x: 200, y: 20 } },
    { alignment: "center-y", wide: { x: 10, y: 80 }, narrow: { x: 200, y: 60 } },
    { alignment: "bottom", wide: { x: 10, y: 140 }, narrow: { x: 200, y: 100 } },
  ];

  for (const expected of cases) {
    // Reverse spatial order to prove the alignment does not use the first ID
    // as an implicit anchor.
    const aligned = alignNodes(initial, ["narrow", "wide"], expected.alignment);
    assert.deepEqual(
      { x: aligned.positions.wide?.x, y: aligned.positions.wide?.y },
      expected.wide,
      expected.alignment,
    );
    assert.deepEqual(
      { x: aligned.positions.narrow?.x, y: aligned.positions.narrow?.y },
      expected.narrow,
      expected.alignment,
    );
    assert.equal(aligned.positions.wide?.pinned, true);
    assert.equal(aligned.positions.narrow?.pinned, true);
    assert.deepEqual(aligned.positions.unrelated, initial.positions.unrelated);
  }

  assert.deepEqual(initial.positions, originalPositions, "alignment must not mutate its input view");
});

test("alignment validates its mode, distinct count, and existing layout IDs", () => {
  const initial = createDefaultView("root");
  initial.positions.a = { x: 0, y: 0, pinned: false };
  initial.positions.b = { x: 100, y: 100, pinned: false };

  assert.throws(
    () => alignNodes(initial, ["a"], "left"),
    /Cannot align nodes: expected at least 2 distinct node IDs, received 1/,
  );
  assert.throws(
    () => alignNodes(initial, ["a", "a"], "left"),
    /Cannot align nodes: duplicate node IDs 'a'/,
  );
  assert.throws(
    () => alignNodes(initial, ["a", "missing"], "left"),
    /Cannot align nodes: no layout position exists for 'missing'/,
  );
  assert.throws(
    () => alignNodes(initial, ["a", "b"], "diagonal" as LayoutAlignment),
    /Unknown layout alignment 'diagonal'; expected one of:/,
  );
});

test("horizontal distribution uses widths, equal gaps, and stable spatial order", () => {
  const initial = createDefaultView("root");
  initial.positions.left = { x: 0, y: 30, width: 100, height: 40, pinned: false };
  initial.positions.middle = { x: 180, y: 70, width: 200, height: 60, pinned: false };
  initial.positions.right = { x: 500, y: 110, width: 50, height: 80, pinned: false };
  initial.positions.unrelated = { x: 750, y: 900, pinned: false };

  const distributed = distributeNodes(
    initial,
    ["right", "left", "middle"],
    "horizontal",
  );
  const reordered = distributeNodes(
    initial,
    ["middle", "right", "left"],
    "horizontal",
  );

  assert.deepEqual(distributed.positions.left, {
    x: 0,
    y: 30,
    width: 100,
    height: 40,
    pinned: true,
  });
  assert.deepEqual(distributed.positions.middle, {
    x: 200,
    y: 70,
    width: 200,
    height: 60,
    pinned: true,
  });
  assert.deepEqual(distributed.positions.right, {
    x: 500,
    y: 110,
    width: 50,
    height: 80,
    pinned: true,
  });
  assert.deepEqual(distributed.positions.unrelated, initial.positions.unrelated);
  assert.deepEqual(reordered.positions, distributed.positions);
});

test("vertical distribution uses heights and can leave selected nodes unpinned", () => {
  const initial = createDefaultView("root");
  initial.positions.top = { x: 10, y: 10, width: 80, height: 40, pinned: true };
  initial.positions.middle = { x: 30, y: 150, width: 90, height: 100, pinned: true };
  initial.positions.bottom = { x: 50, y: 500, width: 100, height: 60, pinned: true };

  const distributed = distributeNodes(
    initial,
    ["bottom", "middle", "top"],
    "vertical",
    false,
  );

  assert.deepEqual(distributed.positions.top, {
    x: 10,
    y: 10,
    width: 80,
    height: 40,
    pinned: false,
  });
  assert.deepEqual(distributed.positions.middle, {
    x: 30,
    y: 225,
    width: 90,
    height: 100,
    pinned: false,
  });
  assert.deepEqual(distributed.positions.bottom, {
    x: 50,
    y: 500,
    width: 100,
    height: 60,
    pinned: false,
  });
});

test("distribution validates its direction, distinct count, and existing layout IDs", () => {
  const initial = createDefaultView("root");
  initial.positions.a = { x: 0, y: 0, pinned: false };
  initial.positions.b = { x: 100, y: 100, pinned: false };
  initial.positions.c = { x: 200, y: 200, pinned: false };

  assert.throws(
    () => distributeNodes(initial, ["a", "b"], "horizontal"),
    /Cannot distribute nodes: expected at least 3 distinct node IDs, received 2/,
  );
  assert.throws(
    () => distributeNodes(initial, ["a", "b", "a"], "horizontal"),
    /Cannot distribute nodes: duplicate node IDs 'a'/,
  );
  assert.throws(
    () => distributeNodes(initial, ["a", "b", "missing"], "horizontal"),
    /Cannot distribute nodes: no layout position exists for 'missing'/,
  );
  assert.throws(
    () => distributeNodes(initial, ["a", "b", "c"], "diagonal" as LayoutDistribution),
    /Unknown layout distribution 'diagonal'; expected one of:/,
  );
});

test("reset clears manual geometry and feeds a fresh unpinned layered layout", () => {
  const initial = createDefaultView("root");
  initial.hidden = ["hidden-element"];
  initial.positions.a = { x: 900, y: 700, width: 500, height: 300, pinned: true };
  initial.positions.b = { x: 1_100, y: 900, pinned: false };
  initial.edgeRoutes.edge = {
    pinned: true,
    points: [
      { x: 1, y: 2 },
      { x: 3, y: 4 },
    ],
  };

  const reset = resetLayout(initial);
  assert.deepEqual(reset.positions, {});
  assert.deepEqual(reset.edgeRoutes, {});
  assert.deepEqual(reset.hidden, ["hidden-element"]);
  assert.ok(initial.positions.a, "reset must not mutate its input view");
  assert.ok(initial.edgeRoutes.edge, "reset must not mutate its input routes");

  const laidOut = applyLayeredLayout(reset, {
    nodes: [{ id: "a" }, { id: "b" }],
    edges: [{ source: "a", target: "b" }],
  });
  assert.deepEqual(laidOut.positions.a, { x: 80, y: 80, pinned: false });
  assert.deepEqual(laidOut.positions.b, { x: 410, y: 80, pinned: false });
});
