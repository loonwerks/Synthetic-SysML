import assert from "node:assert/strict";
import test from "node:test";

import {
  matchesExactLegacyPreset,
  reconcilePresetView,
  type ViewPresetDefinition,
} from "../src/presets.js";
import type { ViewState } from "../src/types.js";

function definition(version: number): ViewPresetDefinition {
  const secondVersion = version === 2;
  return {
    id: "faa-a1",
    name: secondVersion ? "FAA Figure A-1 (revised)" : "FAA Figure A-1",
    preset: { id: "faa-a1", version },
    rootId: "root",
    positions: {
      primary: secondVersion
        ? { x: 20, y: 30, pinned: true }
        : { x: 10, y: 15, pinned: true },
      removable: secondVersion
        ? { x: 45, y: 55, pinned: true }
        : { x: 40, y: 50, pinned: true },
      ...(secondVersion ? { added: { x: 70, y: 80, pinned: true } } : {}),
    },
    edgeRoutes: {},
    hidden: secondVersion ? ["keep-hidden", "new-hidden"] : ["old-hidden", "keep-hidden"],
    expanded: secondVersion ? ["default-expanded", "new-expanded"] : ["default-expanded"],
    aliases: {
      primary: secondVersion ? "New default" : "Old default",
      removable: secondVersion ? "Changed removable" : "Old removable",
      ...(secondVersion ? { added: "New alias" } : {}),
    },
    annotations: [],
    showPorts: false,
    showEdgeLabels: true,
    showTypes: false,
    camera: secondVersion ? { x: 10, y: 20, zoom: 0.9 } : { x: 0, y: 0, zoom: 0.8 },
  };
}

function materialize(definition: ViewPresetDefinition): ViewState {
  return { ...structuredClone(definition), updatedAt: "2026-07-22T00:00:00.000Z" };
}

test("exact legacy presets are adopted while arbitrary same-id views are refused", () => {
  const current = definition(1);
  const { preset: _preset, ...legacyDefinition } = current;
  const legacy: ViewState = {
    ...structuredClone(legacyDefinition),
    updatedAt: "2026-07-22T00:00:00.000Z",
  };
  assert.equal(matchesExactLegacyPreset(legacy, current), true);
  const adopted = reconcilePresetView(legacy, [current]);
  assert.equal(adopted.action, "adopted");
  assert.deepEqual(adopted.view.preset, { id: "faa-a1", version: 1 });
  assert.deepEqual(adopted.view.positions, legacy.positions);

  const arbitrary: ViewState = { ...legacy, name: "My unrelated FAA view" };
  const refused = reconcilePresetView(arbitrary, [current]);
  assert.equal(refused.action, "refused");
  assert.equal(refused.view, arbitrary);
  assert.equal(refused.view.preset, undefined);
});

test("three-way upgrades preserve customized positions, aliases, and filters", () => {
  const previous = definition(1);
  const next = definition(2);
  const customized = materialize(previous);
  customized.positions.primary = { x: 900, y: 700, pinned: true };
  delete customized.positions.removable;
  customized.positions.user = { x: 12, y: 34, pinned: true };
  customized.aliases.primary = "Operator's custom label";
  delete customized.aliases.removable;
  customized.aliases.user = "User alias";
  customized.hidden = ["old-hidden", "user-hidden"];
  customized.expanded = ["default-expanded", "user-expanded"];

  const first = reconcilePresetView(customized, [previous, next]);
  const second = reconcilePresetView(customized, [previous, next]);
  assert.equal(first.action, "upgraded");
  assert.deepEqual(first, second);
  assert.deepEqual(first.view.preset, { id: "faa-a1", version: 2 });
  assert.equal(first.view.name, "FAA Figure A-1 (revised)");
  assert.deepEqual(first.view.positions.primary, { x: 900, y: 700, pinned: true });
  assert.equal(first.view.positions.removable, undefined);
  assert.deepEqual(first.view.positions.added, { x: 70, y: 80, pinned: true });
  assert.deepEqual(first.view.positions.user, { x: 12, y: 34, pinned: true });
  assert.equal(first.view.aliases.primary, "Operator's custom label");
  assert.equal(first.view.aliases.removable, undefined);
  assert.equal(first.view.aliases.added, "New alias");
  assert.equal(first.view.aliases.user, "User alias");
  assert.deepEqual(first.view.hidden, ["new-hidden", "user-hidden"]);
  assert.deepEqual(first.view.expanded, ["default-expanded", "new-expanded", "user-expanded"]);
  assert.deepEqual(first.view.camera, { x: 10, y: 20, zoom: 0.9 });
  assert.equal(first.view.updatedAt, customized.updatedAt);
});

test("current presets are idempotent and newer or unknown versions are left untouched", () => {
  const current = materialize(definition(1));
  const unchanged = reconcilePresetView(current, [definition(1)]);
  assert.equal(unchanged.action, "unchanged");
  assert.equal(unchanged.view, current);

  const newer: ViewState = { ...current, preset: { id: "faa-a1", version: 99 } };
  const refusedNewer = reconcilePresetView(newer, [definition(1)]);
  assert.equal(refusedNewer.action, "refused");
  assert.equal(refusedNewer.view, newer);

  const unknownOlder: ViewState = { ...current, preset: { id: "faa-a1", version: 1 } };
  const refusedUnknown = reconcilePresetView(unknownOlder, [definition(2)]);
  assert.equal(refusedUnknown.action, "refused");
  assert.equal(refusedUnknown.view, unknownOlder);
});
