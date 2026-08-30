import assert from "node:assert/strict";
import test from "node:test";

import {
  nonNegativeIntegerOption,
  parseArguments,
  positiveIntegerOption,
  stringOptions,
} from "../src/arguments.js";
import { errorEnvelope } from "../src/errors.js";
import { AgentApiError } from "../src/http.js";

test("parses an explicitly rooted serve command and repeated libraries", () => {
  const result = parseArguments([
    "serve",
    "--root",
    "/models/isolette",
    "--library",
    "/libraries/a",
    "--library",
    "/libraries/b",
    "--include",
    "src/**/*.sysml",
    "--exclude",
    "**/draft.sysml",
  ]);
  assert.deepEqual(result.command, ["serve"]);
  assert.equal(result.options.root, "/models/isolette");
  assert.deepEqual(stringOptions(result, "library"), ["/libraries/a", "/libraries/b"]);
  assert.deepEqual(stringOptions(result, "include"), ["src/**/*.sysml"]);
  assert.deepEqual(stringOptions(result, "exclude"), ["**/draft.sysml"]);
});

test("structured agent failures preserve code, suggestion, and candidates", () => {
  assert.deepEqual(
    errorEnvelope(
      new AgentApiError("Ambiguous element", "SYSML_AMBIGUOUS_ELEMENT", 409, "Use an ID", {
        candidates: ["part:A::x", "part:B::x"],
      }),
    ),
    {
      ok: false,
      error: {
        code: "SYSML_AMBIGUOUS_ELEMENT",
        message: "Ambiguous element",
        status: 409,
        suggestion: "Use an ID",
        details: { candidates: ["part:A::x", "part:B::x"] },
      },
    },
  );
});

test("parses nested agent commands", () => {
  const result = parseArguments(["layout", "move", "--view", "faa", "--id", "thermostat", "--x", "12"]);
  assert.deepEqual(result.command, ["layout", "move"]);
  assert.equal(result.options.view, "faa");
  assert.equal(result.options.id, "thermostat");
  assert.equal(result.options.x, "12");
});

test("parses exact and fit container resize modes", () => {
  const exact = parseArguments([
    "layout", "resize", "--view", "faa", "--id", "anIncubator",
    "--width", "900", "--height", "560", "--x", "40", "--y", "80",
  ]);
  assert.deepEqual(exact.command, ["layout", "resize"]);
  assert.deepEqual(
    {
      view: exact.options.view,
      id: exact.options.id,
      width: exact.options.width,
      height: exact.options.height,
      x: exact.options.x,
      y: exact.options.y,
    },
    { view: "faa", id: "anIncubator", width: "900", height: "560", x: "40", y: "80" },
  );
  const fit = parseArguments(["layout", "resize", "--view", "faa", "--id", "anIncubator", "--fit"]);
  assert.equal(fit.options.fit, true);
});

test("parses three-word layout template commands", () => {
  const result = parseArguments([
    "layout", "template", "apply", "--view", "comparison", "--in", "layout.json",
  ]);
  assert.deepEqual(result.command, ["layout", "template", "apply"]);
  assert.equal(result.options.in, "layout.json");
});

test("parses arbitrary-depth presentation commands without parser exceptions", () => {
  const result = parseArguments([
    "view", "presentation", "edge", "update", "--view", "architecture",
    "--presentation-id", "operator-link", "--bend", "10,20", "--bend", "30,40",
  ]);
  assert.deepEqual(result.command, ["view", "presentation", "edge", "update"]);
  assert.deepEqual(stringOptions(result, "bend"), ["10,20", "30,40"]);
});

test("parses repeatable layout targets and dry-run provenance", () => {
  const result = parseArguments([
    "layout",
    "align",
    "--view",
    "faa-a1",
    "--id",
    "thermostat",
    "--id",
    "heat-source",
    "--alignment",
    "top",
    "--dry-run",
    "--actor",
    "layout-agent",
  ]);
  assert.deepEqual(result.command, ["layout", "align"]);
  assert.deepEqual(stringOptions(result, "id"), ["thermostat", "heat-source"]);
  assert.equal(result.options["dry-run"], true);
  assert.equal(result.options.actor, "layout-agent");
});

test("parses and validates a bounded model search limit", () => {
  const result = parseArguments(["model", "search", "--query", "monitor mode", "--limit", "25"]);
  assert.deepEqual(result.command, ["model", "search"]);
  assert.equal(result.options.query, "monitor mode");
  assert.equal(positiveIntegerOption(result, "limit"), 25);
  assert.equal(positiveIntegerOption(parseArguments(["model", "search"]), "limit"), undefined);
  assert.throws(
    () => positiveIntegerOption(parseArguments(["model", "search", "--limit", "0"]), "limit"),
    /--limit must be a positive integer/u,
  );
  assert.throws(
    () => positiveIntegerOption(parseArguments(["model", "search", "--limit", "2.5"]), "limit"),
    /--limit must be a positive integer/u,
  );
});

test("accepts an explicit non-negative validation debounce", () => {
  assert.equal(
    nonNegativeIntegerOption(
      parseArguments(["serve", "--root", "/models/isolette", "--validation-debounce-ms", "0"]),
      "validation-debounce-ms",
    ),
    0,
  );
  assert.equal(
    nonNegativeIntegerOption(parseArguments(["serve", "--root", "/models/isolette"]), "validation-debounce-ms"),
    undefined,
  );
  assert.throws(
    () =>
      nonNegativeIntegerOption(
        parseArguments(["serve", "--root", "/models/isolette", "--validation-debounce-ms", "-1"]),
        "validation-debounce-ms",
      ),
    /non-negative integer/u,
  );
});
