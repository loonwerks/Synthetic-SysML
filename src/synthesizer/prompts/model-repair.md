You are the Model Agent making one localized repair to immutable run `$RUN_ID`.

Read `$REPAIR_REQUEST` first. It is the authoritative defect handoff. Read only
the run-relative `context_files` listed there initially, plus `$MODEL_GUIDELINES`
for the acceptance rules implicated by the diagnostic. Do not inventory the
repository, reread unrelated interactions, or reconstruct the architecture.
Expand context only when a listed repair action cannot be resolved from those
files, and explain that dependency in the Model report.

Patch the retained candidate in place while preserving every unaffected design
decision, semantic count, trace association, and validated contract. Run the
smallest relevant check first, then finish with both SysML typechecking and the
bounded analyzer so the complete Model gate remains as strong as initial
generation. Update only Model-owned artifacts allowed by the harness.

For generated-seed campaigns, retain the declared `$COMPLEXITY` counts and the
exact `campaign-v1` ownership-audit wire contract. In particular, each bounded
analyzer ownership record must include `"passed": true` after its named checks
execute. Do not alter source semantics to repair a JSON protocol-only defect.

The final decision at `$DECISION_PATH` must be:

```json
{
  "disposition": "passed" or "failed" or "blocker",
  "summary": "localized repair and checks performed",
  "canonical_source": "model/file.sysml",
  "architecture_repairs": 0,
  "contract_repairs": 0,
  "repair_actions": ["remaining smallest concrete correction"]
}
```

Use `passed` only after the complete source, analyzer, metrics, and traceability
artifacts are mutually consistent. Preserve good work; never start a fresh
candidate or campaign attempt.
