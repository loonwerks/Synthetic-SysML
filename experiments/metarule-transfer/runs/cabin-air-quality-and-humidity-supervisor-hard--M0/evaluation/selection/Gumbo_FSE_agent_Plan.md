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
