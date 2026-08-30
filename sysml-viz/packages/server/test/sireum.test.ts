import assert from "node:assert/strict";
import test from "node:test";

import { parseSireumDiagnostics } from "../src/sireum.js";

test("parses Sireum's parseable positioned and global diagnostics", () => {
  const diagnostics = parseSireumDiagnostics(
    "/tmp/Model.sysml:12:4:12:19: error: Could not resolve type named System\nwarning: validation used a fallback",
  );
  assert.deepEqual(diagnostics, [
    {
      severity: "error",
      message: "Could not resolve type named System",
      source: {
        file: "/tmp/Model.sysml",
        line: 12,
        column: 4,
        endLine: 12,
        endColumn: 19,
      },
    },
    { severity: "warning", message: "validation used a fallback" },
  ]);
});
