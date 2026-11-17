### MR-STATEFUL-REARM-8D7F

When an English requirement says that a prior event changes whether a later
input is actionable—especially "after invalid", "before rearm", "remain held",
"must first release", "shall not bypass", or "becomes fresh"—formalize the
history as an explicit finite GUMBO `state` value on the owning thread.  Give
that state a concrete initialization guarantee and make each transition case
refer to the entry value with `In(state)`, while guaranteeing both the emitted
classification and the next state.  Retain separate cases for the initial
acceptance, continued/held input, reset/release, fault entry, and attempted
use before reset whenever the English distinguishes them.

Attach the state declaration, `initialize`, and `compute_cases` to the SysML
thread that owns the input-to-intent transition; keep the state type and enum
literals identical to the names visible in the active SysML model.  HAMR then
generates the state variable and `In_` container fields, so the Slang
implementation must update that generated state and the API output together
on every branch.  Its `initialise` and `timeTriggered` contracts must declare
the generated state and API in `Modifies`; otherwise Logika reports missing
frame permissions for the mutations.  Preserve the requirement's safety
meaning: do not substitute a stateless current-input test for a re-arm or
hysteresis obligation.

This rule was extracted from a verified request-qualification episode with a
three-valued memory (released, accepted-active, rearm-required), a valid
release reset, an invalid-input latch, and a blocked active input until reset.

### MR-VALIDITY-QUALIFIED-ENUM-2C91

When English defines a finite observed value together with a separate validity
or availability qualifier, first formalize the invalid/unavailable qualifier
as the controlling branch, then formalize each valid combination as an
explicit classification result.  A compact GUMBO compute case may use one
conjunctive guarantee of implication clauses when all clauses are one total
classification table; use conditional `assume` clauses instead when the
requirement assigns distinct named behavioral cases.  Do not infer
quantitative facts or physical behavior that the finite source classifications
do not state.

Place the contract on the thread that owns the input-to-classification output.
Use the active model's port names, enum types, and fully qualified literals
unchanged so the generated operational API exposes matching `get_` and `put_`
members.  In Slang, read each operational input, implement the same precedence
as a finite `if`/`else` decision, and write the output on every path; declare
`Modifies(api)` in the implementation contract before using a generated output
setter.  Treat a missing or unavailable source as the safe unknown/blocked
classification rather than as an affirmative condition.

This rule is supported by two verified tables: validity plus a binary
observation produced unknown/clear/needs-action, and availability plus a
permission value produced unavailable-blocked/restricted-blocked/eligible.

### MR-PRIORITIZED-FAILSAFE-POLICY-5A44

When a requirement combines an actionable intent, an observation fact, and a
resource decision into command and status outputs, derive an ordered decision
table from the stated blockers before writing contracts or code.  Give
non-actionable or invalid intent first priority, then unknown observation,
then resource ineligibility, and only then the eligible nominal outcomes when
that ordering is stated or needed to preserve fail-safe behavior.  Encode each
priority region as a GUMBO `compute_cases` case with its guard in `assume` and
all coupled output effects in `guarantee`; for a final value-dependent nominal
region, use implication subclauses to preserve both alternatives.  Initialize
command outputs to the safe/off value and their disposition to the inactive
value when initialization behavior is specified.

Attach the policy contract to the thread that owns both the command and
disposition outputs, and retain exact input/output identifiers so HAMR maps
the guarantees to the generated API specification variables.  The Slang body
should use the identical precedence ladder and set every coupled output in
each branch.  A downstream reporting thread should translate the resulting
intent/disposition pair independently, giving blocking/fault conditions
precedence over nominal reporting and preserving idle behavior for
non-actionable intent.  Add `Modifies(api)` to each output-writing entrypoint;
Logika rejects otherwise-correct generated-API writes without that frame.

This rule is extracted from a verified fail-off policy and driver-reporting
episode: unknown input and ineligible resource prevented an enable command,
while eligible actionable clear/obscured facts selected complete/defrosting
outcomes and all derived reports proved through the generated HAMR/Logika
stack.
