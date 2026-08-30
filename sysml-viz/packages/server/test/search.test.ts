import assert from "node:assert/strict";
import test from "node:test";

import { parseProjectSources } from "@sysml-viz/core";

import { searchModel } from "../src/search.js";

const MODEL = `package SearchDemo {
  part def Reading :> Data;
  part def Controller :> Thread {
    port measured_temperature : DataPort { in :>> type : Reading; }
    language "GUMBO" /*{
      compute
        guarantee REQ_SEARCH_1 "Temperature stays bounded": measured_temperature == measured_temperature;
    }*/
  }
}`;

function model() {
  return parseProjectSources({
    root: "/virtual/search",
    sources: [{ path: "/virtual/search/Thermal.sysml", root: "/virtual/search", content: MODEL }],
  }).model;
}

test("search spans semantic names, ports, files, and GUMBO text", () => {
  assert.equal(searchModel(model(), "measured_temperature")[0]?.kind, "port");
  assert.equal(searchModel(model(), "REQ_SEARCH_1")[0]?.kind, "requirement");
  assert.equal(searchModel(model(), "stays bounded").some((item) => item.kind === "requirement"), true);
  assert.equal(searchModel(model(), "Thermal.sysml").some((item) => item.kind === "file"), true);
  assert.deepEqual(searchModel(model(), "   "), []);
});
