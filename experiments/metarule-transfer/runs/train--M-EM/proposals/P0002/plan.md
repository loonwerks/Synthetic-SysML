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

- **Trigger:** Loss of validity or authority suppresses a previously accepted request until a fresh event; the requirement distinguishes “still armed” from “must rearm,” including stale-command prevention, release-to-rearm, or invalid/unavailable latching.
- **Formal pattern:** Use finite GUMBO `state` with a concrete safe initialization and consistent visible decision. Use `In(state)` only for entry-state guards. Give invalid/fault, unavailable, inhibited-without-fresh-event, inhibited-with-fresh-event, and already-armed cases both a next state and emitted decision.
- **Placement:** Put the state and `initialize`/`compute_cases` on the thread owning qualified availability plus freshness to authorization. Preserve enum types, ports, and literals so HAMR generates matching state, `In_` pre-state, and API fields.
- **Implementation and repair:** In Slang, update state and decision on every branch; initialization establishes safe state without reading input. Declare `Modifies(api, state)`. For an unframed write, add only the required frame clause; never replace memory with a current-input-only test.
- **Verified episode:** A proved two-state recovery authority initialized inhibited, reset on invalid/unavailable context, armed on one fresh event, and remained armed while context stayed usable.

### MR-VALIDITY-FIRST-TOTAL-CLASSIFIER-41C8

- **Trigger:** English classifies finite inputs with an explicit unknown, invalid, unavailable, or untrusted value and maps remaining combinations to an intent, capability, or demand enum.
- **Formal pattern:** Put invalid/untrusted first and map every valid finite region explicitly. Use one GUMBO compute guarantee with implications for a total table, or separate `compute_cases` for named policy cases. Initialize to the stated safe classification; infer no numeric, sensor, or physical facts beyond supplied categories.
- **Placement:** Put the relation on the input-to-classification owner thread. Preserve exact ports, attribute paths, record fields, and enum literals so guarantees map directly to generated API inputs and setters.
- **Implementation and repair:** Read each input once into an explicitly typed Slang value, mirror the ordered `if`/`else` partition, emit output on every path, and declare `Modifies(api)`. Treat missing operational data as nonaffirmative only when the active contract supports it.
- **Verified episode:** Three classifiers proved: request plus thermal relation to comfort intent; request plus observation to visibility intent; and three-field context to capability. Invalid-first and all valid-region branches passed Logika.

### MR-PRIORITIZED-COUPLED-POLICY-9B72

- **Trigger:** Qualified intent, authorization, and finite resource context jointly produce command/status results under explicit blockers or precedence.
- **Formal pattern:** Build a complete ordered decision table with blocker/fault regions before nominal regions. Every case guarantees all coupled effects, such as command tuple plus disposition or service plus reason. Guard each lower-priority status clause by negating every higher-priority region so simultaneous facts cannot demand conflicting outputs.
- **Placement:** Keep qualification, arbitration, allocation, actuation, and status composition on their owner threads. Preserve shared record-field names between threads so HAMR carries decisions with their explanatory enums.
- **Implementation and repair:** Mirror the precedence ladder as typed Slang `if`/`else`, set every coupled output, and declare `Modifies(api)`. If Logika cannot prove a nominal postcondition, check for overlapping higher-priority implication guards and add only the missing exclusions; do not weaken the fault guarantee.
- **Verified episode:** A service-to-resource policy, command coordinator, and public status composer proved. Explicit higher-priority exclusions repaired initially overlapping fault and nominal-service implications.
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
