### MR-STATEFUL-FAULT-RECOVERY-3E72

Trigger: English distinguishes a critical fault hold from recovery and requires an acknowledgement, a clean intermediate evaluation, or a fresh later request before normal operation resumes.

Formalization choice: represent the recovery protocol as a finite GUMBO `state` with an explicit initialization guarantee. Use `In(state)` only to select entry-state cases. Each case must set both the next recovery state and the externally visible report. Keep fault attribution priority explicit when several fault facts coexist, and make a new fault during recovery return to the latched state.

Structural and toolchain target: attach the state and `compute_cases` to the thread that owns fault-to-recovery translation, not to a downstream publisher. Preserve generated state names, `In_` pre-state naming, port fields, and enum literals. The Slang owner must initialize and update the same state and report on every branch; frame both `api` and the state in `Modifies`.

Repair knowledge and episode evidence: the supervised HVAC episode introduced Clear/Latched/Pending recovery state, fault-priority attribution, acknowledgement-gated transition, and recurrent-fault latching. Logika initially rejected unframed API writes; explicit `Modifies(api, state)` made the stateful entrypoints verifiable. The model-level gate and both recovery-owner entrypoints then passed.

### MR-VALIDITY-FIRST-FINITE-CLASSIFIER-B5A1

Trigger: A requirement maps a finite observation to a finite demand or readiness result while carrying an explicit validity, availability, or unknown qualifier.

Formalization choice: make invalid or missing qualification the controlling result, then give a total mapping for valid finite values. Couple related outputs when one fact determines both a classification and a criticality/degradation indicator. Initialization must emit the stated conservative classification without reading an input.

Structural and toolchain target: place the relation on the owner that consumes the boundary observation and produces the derived decision. Retain exact record paths and fully qualified enum literals so HAMR produces the intended input getter and output setter. Slang must explicitly type values derived from `Option` and exhaustively write outputs; missing operational input is treated as the conservative qualified result only where the contract supports it.

Repair knowledge and episode evidence: the episode contains validity-qualified mappings for request, thermal, visibility, humidity, air-quality, electrical, waste-heat, and equipment facts. Early Slang diagnostics identified implicit complex local initialization; explicitly typed finite result values repaired the toolchain issue without weakening the GUMBO guarantees. All corresponding initialization and compute proofs passed.

### MR-PRIORITY-ARBITRATION-AND-ATOMIC-PUBLICATION-74C9

Trigger: Multiple finite proposals compete for one externally visible command, with blockers, urgency, user intent, resource eligibility, degradation causes, and safe output coherence.

Formalization choice: derive an ordered decision table. Put fault/hold and reauthorization suppression before urgent service, explicit user service, local service priorities, nominal service, and idle. Guard lower-priority cases against higher-priority regions. Carry the selected service together with its cause, then compose one atomic command using a separate resource/energy stage. Publish safe all-off output for hold or awaiting-fresh states and encode service/intensity/energy/heat-source coherence as global guarantees.

Structural and toolchain target: separate owner threads for qualification, local proposals, arbitration, resource-safe plan composition, and public publication. Preserve coupled fields and explanatory enums through each interface. In Slang, mirror the precedence ladder, assign every coupled output in each branch, and frame API writes with `Modifies(api)`.

Repair knowledge and episode evidence: the supervised model formalizes urgency, recovery suppression, noncritical-cause precedence, energy-tier reduction, and atomic public status in distinct owner threads. Logika rejected API mutations until their frames were declared; after minimal frame and syntax repairs, the arbitration, composer, and publisher initialization/compute entrypoints all passed in the 30-method gate.
