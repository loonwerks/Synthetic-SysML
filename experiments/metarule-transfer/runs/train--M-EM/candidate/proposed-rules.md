### MR-STATEFUL-REAUTHORIZATION-6F3A

Trigger: An English requirement says that loss of validity or authority suppresses a previously accepted request until a fresh event occurs, or otherwise distinguishes “still armed” from “must rearm.” This includes stale-command prevention, release-to-rearm, and invalid-or-unavailable latching.

Formalization choice: Model the remembered authorization as a finite GUMBO `state` variable. Give it a concrete safe initialization value and initialize the externally visible decision consistently. Use `In(state)` only in compute-case guards that refer to entry state. Separate invalid/fault entry, unavailable entry, inhibited-without-fresh-event, inhibited-with-fresh-event, and already-armed cases; each guarantee must set both the next state and the emitted decision.

Structural placement and naming: Attach the state and its `initialize`/`compute_cases` block to the thread that owns the transition from qualified availability plus freshness input to authorization output. Preserve the active model’s enum types, ports, and literals, so HAMR generates a matching component state variable, `In_` pre-state container, and API fields.

Toolchain and repair knowledge: In Slang, update generated state and emit the decision on every branch; initialization must establish the safe state without reading an input port. Declare `Modifies(api, state)` on stateful output-writing entrypoints. If Logika reports an unframed write, add only the required frame clause. Do not replace a memory obligation with a current-input-only test.

Verified episode: A two-state recovery authority initialized inhibited, reset on invalid or unavailable context, accepted one fresh event to arm, and thereafter remained armed while the context was usable. Its generated initialization and compute methods passed Logika.

### MR-VALIDITY-FIRST-TOTAL-CLASSIFIER-41C8

Trigger: English defines a finite input classification with an explicit unknown, invalid, unavailable, or untrusted value and maps the remaining finite combinations to an intent/capability/demand enum.

Formalization choice: Make the invalid/untrusted condition the first formal branch and map every valid finite region to an explicit result. Express the relation as one GUMBO compute guarantee containing implication clauses when the requirement is a total table; retain separate `compute_cases` when the English names distinct policy cases. Initialize the output to the stated safe classification. Do not infer numeric, sensor, or physical facts beyond the supplied finite categories.

Structural placement and naming: Put the relation on the input-to-classification owner thread. Use the exact port and attribute paths from the active model, including record fields and generated enum literals, so the guarantees become operational API input fields and output setters without a translation layer.

Toolchain and repair knowledge: In Slang, read each input once into explicitly typed values and implement the same ordered `if`/`else` partition. Emit the output on every path and declare `Modifies(api)`. Treat missing operational data as nonaffirmative only when that behavior is supported by the active contract; verification is over the generated API’s specified input value.

Verified episode: Three classifiers proved: a request plus relation to a comfort intent, a request plus observation to a visibility intent, and a three-field context to a capability enum. The invalid-first and complete valid-region branches discharged their generated Logika obligations.

### MR-PRIORITIZED-COUPLED-POLICY-9B72

Trigger: A requirement combines qualified intent, authorization, finite resource context, and a command/status result, with explicit blockers or a stated precedence order.

Formalization choice: Derive a complete ordered decision table. Formalize blocker/fault regions before nominal regions, and make every case guarantee all coupled effects: for example, a complete quiescent command tuple together with a disposition, or a selected service together with its reason. For a downstream status, guard each lower-priority nominal clause with the negation of every higher-priority region so simultaneous facts cannot require conflicting outputs.

Structural placement and naming: Keep qualification, arbitration, allocation, actuation, and status composition on their respective owner threads. Preserve shared data-record field names between adjacent threads; this lets HAMR carry a decision and its explanatory enum together through generated ports.

Toolchain and repair knowledge: Implement the same precedence ladder as a typed Slang `if`/`else` chain, set all coupled outputs, and frame every output-writing method with `Modifies(api)`. A Logika “could not deduce postcondition” on a nominal result can indicate overlapping implication guards rather than an implementation error: check the contract for a higher-priority guard that remains true, then add only the missing precedence exclusions rather than weakening the safe/fault guarantee.

Verified episode: A finite service-to-resource policy, command coordinator, and public status composer passed Logika. The status proof initially exposed overlapping fault and nominal-service implications; adding explicit higher-priority exclusions to the nominal status guards made the intended precedence executable and verifiable.
