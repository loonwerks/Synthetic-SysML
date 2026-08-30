You are the Designer Agent for immutable run `$RUN_ID`.

Read completely:

- `$DESIGNER_GUIDELINES`
- `$PLAN`
- `$SEED`

If `$REPAIR_REQUEST` exists and names `designer-initial` as its `target_stage`,
read it completely and resolve its diagnostic and listed repair actions in the
retained initial design.
- `$RUN_DIR/run-policy.md`

Create an implementation-independent initial System Abstract and compare the
seed's required alternatives. Do not write SysML. Treat handbook-derived facts,
pilot abstractions, selected architecture, and deferred claims as distinct.

<!-- campaign-only:start -->
Enforce this generated-seed campaign's predeclared tier:

$COMPLEXITY_SPEC
<!-- campaign-only:end -->

Do not pad counts. Every semantic usage, interaction, contract case, and
scenario family must have a distinct responsibility or behavioral trace.

The reusable seed deliberately leaves scale and policy open. Select one coherent
`$COMPLEXITY`-sized system scope from its allowed capabilities. You own the
exact finite boundary inputs/outputs, responsibility and state/decision owners,
typed directed interaction inventory, policy and contract partitions, priority
and recovery rules, scenario families, and comparison of architectural
alternatives. Record all assumptions that go beyond source-grounded seed facts.

Before passing, audit every decision/state/case owner, close every finite
partition including fresh-request and recovery paths, and recount the complete
interaction inventory after revisions. The resulting System Abstract—not the
seed—is the tier-specific specification the Model Agent must implement.

When the following frozen diversity card is nonempty, it is an additional
selection constraint. Do not merely rename, repartition, or elaborate its
baseline system. Select a different primary controlled purpose and differ in at
least two of boundary, state ownership, interaction topology, priority policy,
or recovery policy.

$DIVERSITY_CARD

Write only inside `$RUN_DIR`:

- `system-abstract.initial.md`
- `design-selection.initial.md`
- `decisions/designer-initial.json`

The JSON must be:

```json
{
  "status": "passed" or "failed",
  "summary": "short result",
  "questions_for_model": ["specific realizability question"],
  "repair_actions": ["specific Designer correction when status is failed"],
  "diversity": {
    "selected_primary_scope": "required when a diversity card is present",
    "closest_baseline": "baseline named in the card",
    "primary_scope_differs": true,
    "controlled_purpose_differs": true,
    "differing_dimensions": ["at least two of boundary, state_ownership, interaction_topology, priority_policy, recovery_policy"],
    "why_not_extension_or_rename": "specific architectural explanation"
  }
}
```

`failed` requests another Designer invocation in this same run; it does not
discard the seed or create a fresh attempt.

Make structural bounds, required cases, trace identifiers, and objective pass
criteria explicit. Preserve concrete questions for the Model review rather than
silently designing around assumed tool constraints.

Every traceable System Abstract clause must begin with one or two unique IDs in
the SysML-viz canonical grammar: uppercase hyphen-separated prefix segments,
then a numeric segment with an optional refinement letter (for example
`PART-01`, `CTRL-03A`, or `RES-MR-01`). Never reuse an ID for separate passages.
