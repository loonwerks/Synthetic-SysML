AGENT PLAN
============

Title: Isolette English → GUMBO Contract Synthesis Plan (for SysML v2 models)
Authoring context: Use Appendix A of FAA REMH (pp. 92–A25/A26) as the normative English source; SysML v2 structural models are provided; this plan tells the agent how to produce GUMBO contracts and embed them in the SysML v2 files for Sireum/HAMR/Logika verification.

---
0) OBJECTIVE
------------
Given: SysML v2 element structure (threads/parts/ports) exists but lacks GUMBO contracts.
Goal: Convert English requirements from Appendix A into GUMBO contracts embedded in each SysML v2 element, using the exact “language "GUMBO"” pattern found in the repo, suitable for Sireum CLI parse + HAMR codegen + Logika proof.

Primary English sources and anchors (Appendix A):
- A.1–A.2: Overview and use/exception cases (pp. 92 onward).
- A.3: External entities & environmental assumptions (EA-*).
- A.4: Safety requirements (e.g., alarm <= 5 s).
- A.5.*: Functions (Regulate/Monitor + subfunctions): includes concrete “shall” statements.
  • A.5.1.1 Manage Regulator Interface (MRI): REQ-MRI-* (display rounding, interface failure, desired range mux).
  • A.5.1.2 Manage Regulator Mode (MRM): diagram A-4 (INIT/NORMAL/FAILED + 1.0 s timeout).
  • A.5.1.3 Manage Heat Source (MHS): REQ-MHS-1..5 + latency rationale (<= 6 s).
  • A.5.2.1 Manage Monitor Interface (MMI): REQ-MMI-1..7 (monitor status, interface failure, alarm range mux).
  • A.5.2.2 Manage Monitor Mode (MMM): diagram A-6 (INIT/NORMAL/FAILED + 1.0 s timeout).
  • A.5.2.3 Manage Alarm (MA): REQ-MA-1..5 + hysteresis bands and <= 5 s activation.

---
1) CONTRACT EMBEDDING: CANONICAL BLOCK
--------------------------------------
Embed one GUMBO block per SysML v2 element that implements the English functionality (MRI, MRM, MHS, MMI, MMM, MA, etc.). Use the exact structure and section order shown below.

SysML v2 snippet (inside the element body):

language "GUMBO" /*{
  state
    // (optional) persistent variables for previous outputs, timers, accumulators
    lastCmd: Isolette_Data_Model::On_Off;

  functions
    // (optional) pure helper definitions; must be side-effect-free
    def timeout_condition_satisfied(): Base_Types::Boolean := T;

  integration
    // Environmental assumptions (EA-* tables), port/data range constraints, cross-component invariants
    assume <IdOrTableLabel> "Short text | <deep-pdf-link#page=N>":
      <boolean_formula>;
    // …more assumes…

  initialize
    // Guarantees at initialize entrypoint (one-cycle init behavior)
    guarantee <name>: <boolean_formula>;

  compute
    // Per-dispatch (periodic) behavioral logic; one case per English “shall”
    compute_cases
      case <CaseId> "English paraphrase | <deep-pdf-link#page=N>":
        assume <guards>;
        guarantee <post-conditions>;
      // more case …
}*/

Formatting constraints:
- Keep the quoted English + the deep PDF link in each case/assume (for traceability).
- Use model namespaces (e.g., Isolette_Data_Model::Status.Init_Status) exactly as in the SysML files.
- Use Wstatus records consistently (e.g., lower_alarm_tempWstatus.degrees, .status).
- Keep boolean syntax: & (and), | (or), implies, == equality, and literal T/F or true false if they are T/F are not defined (as used in your repo).

---
2) WHEN TO USE EACH SECTION
---------------------------
2.1 state
- Add if the English requires memory:
  • Hysteresis “shall not be changed” / “hold previous” (Heat within desired band; Alarm no-change band).
  • Timeouts (duration in mode > 1.0 s) if not directly available from the platform as a primitive.
  Pattern examples:
    lastHeat: Isolette_Data_Model::On_Off
    initElapsed: Base_Types::S64  // time units per your modeling conventions

2.2 functions
- Add pure helper predicates for reusable logic, e.g.:
    def in_reset_band(t, lo, hi): Boolean := lo + 0.5[s32] <= t & t <= hi - 0.5[s32]

2.3 integration 
Guarantees: When to Use
-----------------------------------
Use **integration.guarantee** when your element is the **producer** of a property that:
- Must hold for **all time** (init + compute).
- Is **not** contingent on a transient case condition (e.g., mode or alarm band), and
- Is best treated as a cross-interface invariant (e.g., ordering, units, encoding domain).

- Place environmental assumptions (EA-*). Typical content:
  • Sensor temperature range/units/precision (A.3.2).
  • Isolette warm/cool slew limits ±1°F/min (A.3.1) – used to justify latency.
  • Operator Interface ranges and ordering of desired/alarm temps (A.3.4).
  Example:
    assume Table_A_12_LowerAlarmTemp "...|#page=112": 96 [s32] <= lower_alarm_tempWstatus.degrees & lower_alarm_tempWstatus.degrees <= 101 [s32];
    assume Table_A_12_UpperAlarmTemp "...|#page=112": 97 [s32] <= upper_alarm_tempWstatus.degrees & upper_alarm_tempWstatus.degrees <= 102 [s32];


2.4 initialize
- Add when English clearly states init entry behavior (e.g., status initially Init).
  Example (MMI REQ-MMI-1): monitor_status == Isolette_Data_Model::Status.Init_Status.

2.5 compute / compute_cases
compute 
- You may add assume/guarantees if they the English suggests they hold for all of the below compute_cases.
Compute_cases
- Create one case per “shall”. Each case:
  • “assume” = guard from the English (mode, value status, inequality).
  • “guarantee” = post-condition effect on outputs/state.
- Use English paraphrase + deep link in case title.

  See below as an example:
  ---------------------------
/* Manage_Monitor_Interface_Contracts */ 
 
  compute
     may add assume/guarantees if the the English suggests they hold for all of the below compute_cases.
    compute_cases
      case REQ_MMI_1 "If mode INIT ⇒ status Init |<pdf#page=113>":
        assume monitor_mode == Isolette_Data_Model::Monitor_Mode.Init_Monitor_Mode;
        guarantee monitor_status == Isolette_Data_Model::Status.Init_Status;

      case REQ_MMI_2 "If mode NORMAL ⇒ status On |<pdf#page=113>":
        assume monitor_mode == Isolette_Data_Model::Monitor_Mode.Normal_Monitor_Mode;
        guarantee monitor_status == Isolette_Data_Model::Status.On_Status;

      case REQ_MMI_3 "If mode FAILED ⇒ status Failed |<pdf#page=113>":
        assume monitor_mode == Isolette_Data_Model::Monitor_Mode.Failed_Monitor_Mode;
        guarantee monitor_status == Isolette_Data_Model::Status.Failed_Status;

      case REQ_MMI_4 "If lower OR upper status Invalid ⇒ interface failure True |<pdf#page=113>":
        assume lower_alarm_tempWstatus.status == Isolette_Data_Model::ValueStatus.Invalid |
               upper_alarm_tempWstatus.status == Isolette_Data_Model::ValueStatus.Invalid;
        guarantee interface_failure.flag;

      case REQ_MMI_5 "If lower AND upper status Valid ⇒ interface failure False |<pdf#page=113>":
        assume lower_alarm_tempWstatus.status == Isolette_Data_Model::ValueStatus.Valid &
               upper_alarm_tempWstatus.status == Isolette_Data_Model::ValueStatus.Valid;
        guarantee not interface_failure.flag;

      case REQ_MMI_6 "If NOT interface failure ⇒ copy alarm range (mux) |<pdf#page=113>":
        assume T;
        guarantee (not interface_failure.flag) implies
          (lower_alarm_temp.degrees == lower_alarm_tempWstatus.degrees &
           upper_alarm_temp.degrees == upper_alarm_tempWstatus.degrees);

      case REQ_MMI_7 "If interface failure True ⇒ UNSPECIFIED |<pdf#page=113>":
        assume T;
        guarantee interface_failure.flag implies true;
}*/
  
---
3) LEARNED META-RULES
---------------------
Only rules accepted by this experiment may appear between the markers.

<!-- BEGIN LEARNED META-RULES -->

### MR-STATEFUL-REARM-8D7F

- **Trigger:** A prior event changes whether a later input is actionable—for example hysteresis, “hold previous,” invalid-until-release, “must first release,” or release-to-rearm.
- **Formal pattern:** Declare finite GUMBO state with a concrete initialization guarantee. Use `In(state)` only for entry-state guards, and guarantee both the emitted classification and next state. Keep distinct cases for initial acceptance/fresh output, continued-active/held output, valid release/reset, invalid fault entry, and active input attempted before rearm/blocked output.
- **Placement:** Put the state, `initialize`, and `compute_cases` on the SysML thread that owns the input-to-intent transition, preserving exact state types, names, and enum literals.
- **Implementation and repair:** HAMR generates the state, `In_` container, and API fields. Update generated state and API output together on every Slang branch; include both in the `initialise` and `timeTriggered` `Modifies` clauses. Never replace an explicit memory obligation with a stateless current-input test.
- **Verified episode:** A released/accepted-active/rearm-required state machine proved valid release reset, invalid-input latching, held activation, and blocked activation before reset.

### MR-VALIDITY-QUALIFIED-ENUM-2C91

- **Trigger:** English defines a finite observed value together with a separate validity or availability qualifier.
- **Formal pattern:** First formalize invalid/unavailable as the controlling branch, then map each valid combination to an explicit classification result. A compact GUMBO compute case can use one conjunctive guarantee of implication clauses for a total classification table; use conditional `assume` clauses when requirements name distinct behavioral cases. Do not infer quantitative facts or physical behavior that the finite source classifications do not state.
- **Placement:** Put the contract on the thread owning the input-to-classification output. Preserve the active model's port names, enum types, and fully qualified literals so HAMR generates matching operational `get_` and `put_` API members.
- **Implementation and repair:** Read every operational input, implement the same precedence as finite Slang `if`/`else`, and write the output on every path. Declare `Modifies(api)` before a generated output setter. Treat missing or unavailable sources as safe unknown/blocked, never affirmative.
- **Verified episode:** Two verified tables support the rule: validity plus a binary observation produced unknown/clear/needs-action; availability plus a permission value produced unavailable-blocked/restricted-blocked/eligible.

### MR-PRIORITIZED-FAILSAFE-POLICY-5A44

- **Trigger:** A requirement combines actionable intent, an observation fact, and a resource decision into command and status outputs.
- **Formal pattern:** Derive an ordered decision table from the stated blockers: non-actionable or invalid intent first, unknown observation next, resource ineligibility next, and eligible nominal outcomes last. Encode every priority region as a GUMBO `compute_cases` case with its guard in `assume` and all coupled effects in `guarantee`. In the final value-dependent nominal region, use implication subclauses for both alternatives. When specified, initialize command to safe/off and disposition to inactive.
- **Placement:** Put the policy on the thread owning both command and disposition outputs; retain exact input/output identifiers so HAMR maps guarantees to generated API variables. Keep downstream reporting independent: translate the intent/disposition pair with blocking or fault conditions ahead of nominal reporting and preserve idle behavior for non-actionable intent.
- **Implementation and repair:** Use the identical precedence ladder in Slang and set every coupled output in every branch. Add `Modifies(api)` to each output-writing entrypoint; Logika otherwise rejects generated-API writes.
- **Verified episode:** In a proved fail-off and driver-reporting episode, unknown input and ineligible resources prevented enable; eligible actionable clear/obscured facts selected complete/defrosting outcomes, with all reports proved through HAMR/Logika.

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
<!-- END LEARNED META-RULES -->

---
5) TRACEABILITY
---------------
- Keep a 1:1 mapping between each English “shall” and a compute_cases ‘case’ with:
  • case identifier (use the document’s REQ IDs when available)
  • short paraphrase in quotes
  • deep PDF link (#page=N)
- Add source comments for integration assumes mirroring table/EA labels.

---
6) SIREUM / LOGIKA / HAMR INTEGRATION CHECKS
---------------------------------------------
- Contract blocks are syntactically valid for your “language "GUMBO"” grammar.
- Namespaces/types match your Isolette_Data_Model and SysML definitions.
- Functions are pure; no side effects in contracts.
- If temporal operators are not native, carry latency obligations into the generated proof/test harness via text and helper predicates.
- After embedding, follow `sireum_verification_plan.md`; its staged commands are authoritative for this repository.

---
7) EXAMPLE (MMI) – TEMPLATE
---------------------------
/* Manage_Monitor_Interface_Contracts */ 

language "GUMBO" /*{
  state
    lastStatus: Isolette_Data_Model::Status;

  functions
    def ok(): Base_Types::Boolean := T;

  integration
    assume Table_A_12_LowerAlarmTemp "Range [96..101]|<pdf#page=112>":
      96 [s32] <= lower_alarm_tempWstatus.degrees & lower_alarm_tempWstatus.degrees <= 101 [s32];
    assume Table_A_12_UpperAlarmTemp "Range [97..102]|<pdf#page=112>":
      97 [s32] <= upper_alarm_tempWstatus.degrees & lower_alarm_tempWstatus.degrees <= 102 [s32];

  initialize
    guarantee monitorStatusInitiallyInit:
      monitor_status == Isolette_Data_Model::Status.Init_Status;

  compute
     may add assume/guarantees if they the English suggest they hold for all of the below compute_cases.
    compute_cases
      case REQ_MMI_1 "If mode INIT ⇒ status Init |<pdf#page=113>":
        assume monitor_mode == Isolette_Data_Model::Monitor_Mode.Init_Monitor_Mode;
        guarantee monitor_status == Isolette_Data_Model::Status.Init_Status;

      case REQ_MMI_2 "If mode NORMAL ⇒ status On |<pdf#page=113>":
        assume monitor_mode == Isolette_Data_Model::Monitor_Mode.Normal_Monitor_Mode;
        guarantee monitor_status == Isolette_Data_Model::Status.On_Status;

      case REQ_MMI_3 "If mode FAILED ⇒ status Failed |<pdf#page=113>":
        assume monitor_mode == Isolette_Data_Model::Monitor_Mode.Failed_Monitor_Mode;
        guarantee monitor_status == Isolette_Data_Model::Status.Failed_Status;

      case REQ_MMI_4 "If lower OR upper status Invalid ⇒ interface failure True |<pdf#page=113>":
        assume lower_alarm_tempWstatus.status == Isolette_Data_Model::ValueStatus.Invalid |
               upper_alarm_tempWstatus.status == Isolette_Data_Model::ValueStatus.Invalid;
        guarantee interface_failure.flag;

      case REQ_MMI_5 "If lower AND upper status Valid ⇒ interface failure False |<pdf#page=113>":
        assume lower_alarm_tempWstatus.status == Isolette_Data_Model::ValueStatus.Valid &
               upper_alarm_tempWstatus.status == Isolette_Data_Model::ValueStatus.Valid;
        guarantee not interface_failure.flag;

      case REQ_MMI_6 "If NOT interface failure ⇒ copy alarm range (mux) |<pdf#page=113>":
        assume T;
        guarantee (not interface_failure.flag) implies
          (lower_alarm_temp.degrees == lower_alarm_tempWstatus.degrees &
           upper_alarm_temp.degrees == upper_alarm_tempWstatus.degrees);

      case REQ_MMI_7 "If interface failure True ⇒ UNSPECIFIED |<pdf#page=113>":
        assume T;
        guarantee interface_failure.flag implies true;
}*/

---
8) IMPLEMENTATION CHECKLIST
---------------------------
- Contracts exist for: MRI, MRM, MHS, MMI, MMM, MA (and any other threads with externally visible behavior).
- Each compute_cases ‘case’ aligns to a single English “shall” with mode/value guards.
- All integration assumptions are present (OI ranges/ordering; sensor ranges; slew limits if used for latency).
- Hysteresis cases use hold semantics via state or tool’s previous operator.
- Latency constraints are represented (explicit temporal operator or test harness note).
- Initialize section sets initial status where required.
- Names/units/types conform to SysML files and data model namespaces.
- After this you may follow plan the verification plan in this location: sireum_verification_plan.md.
