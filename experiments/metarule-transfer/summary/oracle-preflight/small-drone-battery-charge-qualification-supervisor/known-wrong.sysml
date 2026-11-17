package Drone_Battery_Charge_Supervisor {

  private import HAMR::*;

  // @trace MON-01
  enum def BatteryIndication {
    enum Adequate;
    enum Low;
  }

  // @trace MON-01
  enum def InputStatus {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-02
  enum def ChargerAvailability {
    enum Available;
    enum Unavailable;
  }

  // @trace MON-03
  enum def FlightActivity {
    enum Inactive;
    enum Active;
  }

  // @trace MON-04
  enum def ChargeIntent {
    enum NoIntent;
    enum BeginCharge;
    enum EndCharge;
  }

  // @trace CTRL-01
  enum def ChargeAuthorization {
    enum InhibitCharge;
    enum PermitCharge;
  }

  // @trace CTRL-02
  enum def BatteryAttention {
    enum None;
    enum LowBattery;
    enum InputFault;
    enum RecoveryPending;
  }

  // @trace CTRL-03
  enum def BatteryReadinessEvidence {
    enum BatteryReady;
    enum BatteryNotReady;
    enum EvidenceUnavailable;
  }

  // @trace PART-01
  enum def BatteryEvidence {
    enum InvalidBattery;
    enum LowBatteryEvidence;
    enum AdequateBatteryEvidence;
  }

  // @trace PART-02
  enum def ChargeContext {
    enum InvalidChargeContext;
    enum FlightActiveContext;
    enum AvailableInactiveContext;
    enum UnavailableInactiveContext;
  }

  // @trace PART-03
  enum def QualifiedChargeIntent {
    enum InvalidChargeIntent;
    enum NoIntent;
    enum BeginCharge;
    enum EndCharge;
  }

  // @trace PART-04
  enum def ChargeDisposition {
    enum InputFault;
    enum RecoveryPending;
    enum BeginAccepted;
    enum BeginDenied;
    enum Continued;
    enum Inactive;
  }

  // @trace STATE-01
  enum def RecoveryPhase {
    enum Normal;
    enum AwaitNeutral;
    enum AwaitFreshIntent;
  }

  // GUMBO inspects every record member below, so each is an attribute.
  // @trace MON-01
  part def BatterySample :> Data {
    // @trace MON-01
    attribute indication : BatteryIndication;
    // @trace MON-01
    attribute status : InputStatus;
  }

  // @trace MON-02
  part def ChargerSample :> Data {
    // @trace MON-02
    attribute availability : ChargerAvailability;
    // @trace MON-02
    attribute status : InputStatus;
  }

  // @trace MON-03
  part def FlightActivitySample :> Data {
    // @trace MON-03
    attribute activity : FlightActivity;
    // @trace MON-03
    attribute status : InputStatus;
  }

  // @trace MON-04
  part def ChargeIntentSample :> Data {
    // @trace MON-04
    attribute intent : ChargeIntent;
    // @trace MON-04
    attribute status : InputStatus;
  }

  // @trace PART-04
  part def ChargeDecision :> Data {
    // @trace CTRL-01
    attribute authorization : ChargeAuthorization;
    // @trace PART-04
    attribute disposition : ChargeDisposition;
  }

  // @trace PART-01
  part def Battery_Evidence_Qualification :> Thread {
    // @trace INT-01
    port battery_sample : DataPort { in :>> type : BatterySample; }
    // @trace INT-05
    port evidence_to_owner : DataPort { out :>> type : BatteryEvidence; }
    // @trace INT-10
    port evidence_to_attention : DataPort { out :>> type : BatteryEvidence; }
    // @trace INT-13
    port evidence_to_readiness : DataPort { out :>> type : BatteryEvidence; }

    // @trace OWNER-01
    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_BATTERY_EVIDENCE "All three evidence publications initialize as untrusted":
          evidence_to_owner == BatteryEvidence.InvalidBattery &
          evidence_to_attention == BatteryEvidence.InvalidBattery &
          evidence_to_readiness == BatteryEvidence.InvalidBattery;

      compute
        compute_cases
          // @trace QUAL-BATT-01
          case BATTERY_INVALID "Either invalid-status battery sample collapses to InvalidBattery":
            assume battery_sample.status == InputStatus.Invalid;
            guarantee evidence_to_owner == BatteryEvidence.InvalidBattery &
                      evidence_to_attention == BatteryEvidence.InvalidBattery &
                      evidence_to_readiness == BatteryEvidence.InvalidBattery;
          // @trace QUAL-BATT-01
          case BATTERY_LOW "A valid Low indication derives LowBatteryEvidence":
            assume battery_sample.status == InputStatus.Valid &
                   battery_sample.indication == BatteryIndication.Low;
            guarantee evidence_to_owner == BatteryEvidence.LowBatteryEvidence &
                      evidence_to_attention == BatteryEvidence.LowBatteryEvidence &
                      evidence_to_readiness == BatteryEvidence.LowBatteryEvidence;
          // @trace QUAL-BATT-01
          case BATTERY_ADEQUATE "A valid Adequate indication derives AdequateBatteryEvidence":
            assume battery_sample.status == InputStatus.Valid &
                   battery_sample.indication == BatteryIndication.Adequate;
            guarantee evidence_to_owner == BatteryEvidence.AdequateBatteryEvidence &
                      evidence_to_attention == BatteryEvidence.AdequateBatteryEvidence &
                      evidence_to_readiness == BatteryEvidence.AdequateBatteryEvidence;
    }*/
  }

  // @trace PART-02
  part def Charge_Context_Qualification :> Thread {
    // @trace INT-02
    port charger_sample : DataPort { in :>> type : ChargerSample; }
    // @trace INT-03
    port flight_sample : DataPort { in :>> type : FlightActivitySample; }
    // @trace INT-06
    port charge_context : DataPort { out :>> type : ChargeContext; }

    // @trace OWNER-01
    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_CHARGE_CONTEXT "Charge context initializes as invalid":
          charge_context == ChargeContext.InvalidChargeContext;

      compute
        compute_cases
          // @trace QUAL-CTX-01
          case CONTEXT_INVALID "Any invalid charger or flight status has priority":
            assume charger_sample.status == InputStatus.Invalid |
                   flight_sample.status == InputStatus.Invalid;
            guarantee charge_context == ChargeContext.InvalidChargeContext;
          // @trace QUAL-CTX-01
          case CONTEXT_FLIGHT_ACTIVE "Any all-valid Active flight sample derives FlightActiveContext":
            assume charger_sample.status == InputStatus.Valid &
                   flight_sample.status == InputStatus.Valid &
                   flight_sample.activity == FlightActivity.Active;
            guarantee charge_context == ChargeContext.FlightActiveContext;
          // @trace QUAL-CTX-01
          case CONTEXT_AVAILABLE_INACTIVE "All-valid available and inactive evidence derives AvailableInactiveContext":
            assume charger_sample.status == InputStatus.Valid &
                   flight_sample.status == InputStatus.Valid &
                   flight_sample.activity == FlightActivity.Inactive &
                   charger_sample.availability == ChargerAvailability.Available;
            guarantee charge_context == ChargeContext.AvailableInactiveContext;
          // @trace QUAL-CTX-01
          case CONTEXT_UNAVAILABLE_INACTIVE "All-valid unavailable and inactive evidence derives UnavailableInactiveContext":
            assume charger_sample.status == InputStatus.Valid &
                   flight_sample.status == InputStatus.Valid &
                   flight_sample.activity == FlightActivity.Inactive &
                   charger_sample.availability == ChargerAvailability.Unavailable;
            guarantee charge_context == ChargeContext.UnavailableInactiveContext;
    }*/
  }

  // @trace PART-03
  part def Charge_Intent_Qualification :> Thread {
    // @trace INT-04
    port intent_sample : DataPort { in :>> type : ChargeIntentSample; }
    // @trace INT-07
    port qualified_intent : DataPort { out :>> type : QualifiedChargeIntent; }

    // @trace OWNER-01
    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_QUALIFIED_INTENT "Qualified intent initializes as invalid":
          qualified_intent == QualifiedChargeIntent.InvalidChargeIntent;

      compute
        compute_cases
          // @trace QUAL-INTENT-01
          case INTENT_INVALID "Every invalid-status intent collapses to InvalidChargeIntent":
            assume intent_sample.status == InputStatus.Invalid;
            guarantee qualified_intent == QualifiedChargeIntent.InvalidChargeIntent;
          // @trace QUAL-INTENT-01
          case INTENT_NEUTRAL "A valid NoIntent derives qualified NoIntent":
            assume intent_sample.status == InputStatus.Valid &
                   intent_sample.intent == ChargeIntent.NoIntent;
            guarantee qualified_intent == QualifiedChargeIntent.NoIntent;
          // @trace QUAL-INTENT-01
          case INTENT_BEGIN "A valid BeginCharge derives qualified BeginCharge":
            assume intent_sample.status == InputStatus.Valid &
                   intent_sample.intent == ChargeIntent.BeginCharge;
            guarantee qualified_intent == QualifiedChargeIntent.BeginCharge;
          // @trace QUAL-INTENT-01
          case INTENT_END "A valid EndCharge derives qualified EndCharge":
            assume intent_sample.status == InputStatus.Valid &
                   intent_sample.intent == ChargeIntent.EndCharge;
            guarantee qualified_intent == QualifiedChargeIntent.EndCharge;
    }*/
  }

  // @trace PART-04
  part def Charge_Qualification_Owner :> Thread {
    // @trace INT-05
    port battery_evidence : DataPort { in :>> type : BatteryEvidence; }
    // @trace INT-06
    port charge_context : DataPort { in :>> type : ChargeContext; }
    // @trace INT-07
    port qualified_intent : DataPort { in :>> type : QualifiedChargeIntent; }
    // @trace INT-08
    port authorization : DataPort { out :>> type : ChargeAuthorization; }
    // @trace INT-09
    port decision_to_attention : DataPort { out :>> type : ChargeDecision; }
    // @trace INT-12
    port decision_to_readiness : DataPort { out :>> type : ChargeDecision; }

    // @trace OWNER-01
    language "GUMBO" /*{
      // @trace STATE-01
      state
        authorizationState: ChargeAuthorization;
        recoveryPhase: RecoveryPhase;

      initialize
        // @trace INIT-01
        guarantee INITIAL_OWNER_STATE_AND_OUTPUTS "The sole owner and all publications initialize to the approved safe values":
          authorizationState == ChargeAuthorization.InhibitCharge &
          recoveryPhase == RecoveryPhase.Normal &
          authorization == ChargeAuthorization.InhibitCharge &
          decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
          decision_to_attention.disposition == ChargeDisposition.Inactive &
          decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
          decision_to_readiness.disposition == ChargeDisposition.Inactive;

      compute
        // @trace INVAR-01
        guarantee RECOVERY_INHIBITS "Every recovery post-state is inhibited":
          '->:'(recoveryPhase != RecoveryPhase.Normal,
                authorizationState == ChargeAuthorization.InhibitCharge);
        // @trace OUTPUT-01
        guarantee OWNER_PUBLICATIONS_AGREE "The authorization and both complete decisions carry the committed post-state":
          authorization == authorizationState &
          decision_to_attention.authorization == authorizationState &
          decision_to_readiness.authorization == authorizationState &
          decision_to_attention.disposition == decision_to_readiness.disposition;

        compute_cases
          // @trace CASE-01
          case CASE_01_INPUT_FAULT "Any invalid qualified input inhibits and enters AwaitNeutral":
            assume battery_evidence == BatteryEvidence.InvalidBattery |
                   charge_context == ChargeContext.InvalidChargeContext |
                   qualified_intent == QualifiedChargeIntent.InvalidChargeIntent;
            guarantee authorizationState == ChargeAuthorization.InhibitCharge &
                      recoveryPhase == RecoveryPhase.AwaitNeutral &
                      authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.disposition == ChargeDisposition.InputFault &
                      decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_readiness.disposition == ChargeDisposition.InputFault;

          // @trace CASE-02
          case CASE_02_RETAINED_NONNEUTRAL "A retained valid nonneutral intent cannot be replayed while AwaitNeutral":
            assume battery_evidence != BatteryEvidence.InvalidBattery &
                   charge_context != ChargeContext.InvalidChargeContext &
                   qualified_intent != QualifiedChargeIntent.InvalidChargeIntent &
                   In(recoveryPhase) == RecoveryPhase.AwaitNeutral &
                   qualified_intent != QualifiedChargeIntent.NoIntent;
            guarantee authorizationState == ChargeAuthorization.InhibitCharge &
                      recoveryPhase == RecoveryPhase.AwaitNeutral &
                      authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.disposition == ChargeDisposition.RecoveryPending &
                      decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_readiness.disposition == ChargeDisposition.RecoveryPending;

          // @trace CASE-03
          case CASE_03_NEUTRAL_ADVANCES_RECOVERY "A valid neutral sample advances recovery to AwaitFreshIntent without authorization":
            assume battery_evidence != BatteryEvidence.InvalidBattery &
                   charge_context != ChargeContext.InvalidChargeContext &
                   qualified_intent == QualifiedChargeIntent.NoIntent &
                   In(recoveryPhase) == RecoveryPhase.AwaitNeutral;
            guarantee authorizationState == ChargeAuthorization.InhibitCharge &
                      recoveryPhase == RecoveryPhase.AwaitFreshIntent &
                      authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.disposition == ChargeDisposition.RecoveryPending &
                      decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_readiness.disposition == ChargeDisposition.RecoveryPending;

          // @trace CASE-04
          case CASE_04_WAIT_FOR_FRESH_INTENT "Repeated valid neutral evidence remains AwaitFreshIntent and inhibited":
            assume battery_evidence != BatteryEvidence.InvalidBattery &
                   charge_context != ChargeContext.InvalidChargeContext &
                   qualified_intent == QualifiedChargeIntent.NoIntent &
                   In(recoveryPhase) == RecoveryPhase.AwaitFreshIntent;
            guarantee authorizationState == ChargeAuthorization.InhibitCharge &
                      recoveryPhase == RecoveryPhase.AwaitFreshIntent &
                      authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.disposition == ChargeDisposition.RecoveryPending &
                      decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_readiness.disposition == ChargeDisposition.RecoveryPending;

          // @trace CASE-05
          case CASE_05_FRESH_END "A fresh EndCharge completes recovery without authorization":
            assume battery_evidence != BatteryEvidence.InvalidBattery &
                   charge_context != ChargeContext.InvalidChargeContext &
                   qualified_intent == QualifiedChargeIntent.EndCharge &
                   In(recoveryPhase) == RecoveryPhase.AwaitFreshIntent;
            guarantee authorizationState == ChargeAuthorization.InhibitCharge &
                      recoveryPhase == RecoveryPhase.Normal &
                      authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.disposition == ChargeDisposition.Inactive &
                      decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_readiness.disposition == ChargeDisposition.Inactive;

          // @trace CASE-06
          case CASE_06_FRESH_ELIGIBLE_BEGIN "A fresh eligible BeginCharge completes recovery and permits charge":
            assume battery_evidence == BatteryEvidence.LowBatteryEvidence &
                   charge_context == ChargeContext.AvailableInactiveContext &
                   qualified_intent == QualifiedChargeIntent.BeginCharge &
                   In(recoveryPhase) == RecoveryPhase.AwaitFreshIntent;
            guarantee authorizationState == ChargeAuthorization.PermitCharge &
                      recoveryPhase == RecoveryPhase.Normal &
                      authorization == ChargeAuthorization.PermitCharge &
                      decision_to_attention.authorization == ChargeAuthorization.PermitCharge &
                      decision_to_attention.disposition == ChargeDisposition.BeginAccepted &
                      decision_to_readiness.authorization == ChargeAuthorization.PermitCharge &
                      decision_to_readiness.disposition == ChargeDisposition.BeginAccepted;

          // @trace CASE-07
          case CASE_07_FRESH_INELIGIBLE_BEGIN "A fresh ineligible BeginCharge completes recovery but remains inhibited":
            assume battery_evidence != BatteryEvidence.InvalidBattery &
                   charge_context != ChargeContext.InvalidChargeContext &
                   qualified_intent == QualifiedChargeIntent.BeginCharge &
                   In(recoveryPhase) == RecoveryPhase.AwaitFreshIntent &
                   not (battery_evidence == BatteryEvidence.LowBatteryEvidence &
                        charge_context == ChargeContext.AvailableInactiveContext);
            guarantee authorizationState == ChargeAuthorization.InhibitCharge &
                      recoveryPhase == RecoveryPhase.Normal &
                      authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.disposition == ChargeDisposition.BeginDenied &
                      decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_readiness.disposition == ChargeDisposition.BeginDenied;

          // @trace CASE-08
          case CASE_08_NORMAL_END "A valid EndCharge in Normal always inhibits":
            assume battery_evidence != BatteryEvidence.InvalidBattery &
                   charge_context != ChargeContext.InvalidChargeContext &
                   qualified_intent == QualifiedChargeIntent.EndCharge &
                   In(recoveryPhase) == RecoveryPhase.Normal;
            guarantee authorizationState == ChargeAuthorization.InhibitCharge &
                      recoveryPhase == RecoveryPhase.Normal &
                      authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.disposition == ChargeDisposition.Inactive &
                      decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_readiness.disposition == ChargeDisposition.Inactive;

          // @trace CASE-09
          case CASE_09_NORMAL_ELIGIBLE_BEGIN "An eligible BeginCharge in Normal permits charge":
            assume battery_evidence == BatteryEvidence.LowBatteryEvidence &
                   charge_context == ChargeContext.AvailableInactiveContext &
                   qualified_intent == QualifiedChargeIntent.BeginCharge &
                   In(recoveryPhase) == RecoveryPhase.Normal;
            guarantee authorizationState == ChargeAuthorization.PermitCharge &
                      recoveryPhase == RecoveryPhase.Normal &
                      authorization == ChargeAuthorization.PermitCharge &
                      decision_to_attention.authorization == ChargeAuthorization.PermitCharge &
                      decision_to_attention.disposition == ChargeDisposition.BeginAccepted &
                      decision_to_readiness.authorization == ChargeAuthorization.PermitCharge &
                      decision_to_readiness.disposition == ChargeDisposition.BeginAccepted;

          // @trace CASE-10
          case CASE_10_NORMAL_INELIGIBLE_BEGIN "An ineligible BeginCharge in Normal is denied":
            assume battery_evidence != BatteryEvidence.InvalidBattery &
                   charge_context != ChargeContext.InvalidChargeContext &
                   qualified_intent == QualifiedChargeIntent.BeginCharge &
                   In(recoveryPhase) == RecoveryPhase.Normal &
                   not (battery_evidence == BatteryEvidence.LowBatteryEvidence &
                        charge_context == ChargeContext.AvailableInactiveContext);
            guarantee authorizationState == ChargeAuthorization.InhibitCharge &
                      recoveryPhase == RecoveryPhase.Normal &
                      authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.disposition == ChargeDisposition.BeginDenied &
                      decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_readiness.disposition == ChargeDisposition.BeginDenied;

          // @trace CASE-11
          case CASE_11_RETAIN_ELIGIBLE_PERMISSION "Eligible NoIntent retains a prior permission":
            assume battery_evidence == BatteryEvidence.LowBatteryEvidence &
                   charge_context == ChargeContext.AvailableInactiveContext &
                   qualified_intent == QualifiedChargeIntent.NoIntent &
                   In(recoveryPhase) == RecoveryPhase.Normal &
                   In(authorizationState) == ChargeAuthorization.PermitCharge;
            guarantee authorizationState == ChargeAuthorization.PermitCharge &
                      recoveryPhase == RecoveryPhase.Normal &
                      authorization == ChargeAuthorization.PermitCharge &
                      decision_to_attention.authorization == ChargeAuthorization.PermitCharge &
                      decision_to_attention.disposition == ChargeDisposition.Continued &
                      decision_to_readiness.authorization == ChargeAuthorization.PermitCharge &
                      decision_to_readiness.disposition == ChargeDisposition.Continued;

          // @trace CASE-12
          case CASE_12_REMAIN_OR_REVOKE "Every other all-valid Normal NoIntent snapshot inhibits":
            assume battery_evidence != BatteryEvidence.InvalidBattery &
                   charge_context != ChargeContext.InvalidChargeContext &
                   qualified_intent == QualifiedChargeIntent.NoIntent &
                   In(recoveryPhase) == RecoveryPhase.Normal &
                   not (In(authorizationState) == ChargeAuthorization.PermitCharge &
                        battery_evidence == BatteryEvidence.LowBatteryEvidence &
                        charge_context == ChargeContext.AvailableInactiveContext);
            guarantee authorizationState == ChargeAuthorization.InhibitCharge &
                      recoveryPhase == RecoveryPhase.Normal &
                      authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_attention.disposition == ChargeDisposition.Inactive &
                      decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
                      decision_to_readiness.disposition == ChargeDisposition.Inactive;
    }*/
  }

  // @trace PART-05
  part def Pilot_Attention_Derivation :> Thread {
    // @trace INT-09
    port charge_decision : DataPort { in :>> type : ChargeDecision; }
    // @trace INT-10
    port battery_evidence : DataPort { in :>> type : BatteryEvidence; }
    // @trace INT-11
    port battery_attention : DataPort { out :>> type : BatteryAttention; }

    // @trace OWNER-01
    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_ATTENTION "Pilot attention initializes to None":
          battery_attention == BatteryAttention.None;

      compute
        compute_cases
          // @trace ADVISORY-01
          case ATTENTION_INPUT_FAULT "InputFault disposition has top advisory priority":
            assume charge_decision.disposition == ChargeDisposition.InputFault;
            guarantee battery_attention == BatteryAttention.InputFault;
          // @trace ADVISORY-01
          case ATTENTION_RECOVERY_PENDING "RecoveryPending disposition has second advisory priority":
            assume charge_decision.disposition == ChargeDisposition.RecoveryPending;
            guarantee battery_attention == BatteryAttention.RecoveryPending;
          // @trace ADVISORY-01
          case ATTENTION_LOW_BATTERY "Low evidence is reported after fault and recovery exclusions":
            assume charge_decision.disposition != ChargeDisposition.InputFault &
                   charge_decision.disposition != ChargeDisposition.RecoveryPending &
                   battery_evidence == BatteryEvidence.LowBatteryEvidence;
            guarantee battery_attention == BatteryAttention.LowBattery;
          // @trace ADVISORY-01
          case ATTENTION_NONE "Every remaining nonfault and nonrecovery evidence value reports None":
            assume charge_decision.disposition != ChargeDisposition.InputFault &
                   charge_decision.disposition != ChargeDisposition.RecoveryPending &
                   battery_evidence != BatteryEvidence.LowBatteryEvidence;
            guarantee battery_attention == BatteryAttention.None;
    }*/
  }

  // @trace PART-06
  part def Readiness_Evidence_Derivation :> Thread {
    // @trace INT-12
    port charge_decision : DataPort { in :>> type : ChargeDecision; }
    // @trace INT-13
    port battery_evidence : DataPort { in :>> type : BatteryEvidence; }
    // @trace INT-14
    port readiness_evidence : DataPort { out :>> type : BatteryReadinessEvidence; }

    // @trace OWNER-01
    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_READINESS "Readiness evidence initializes as unavailable":
          readiness_evidence == BatteryReadinessEvidence.EvidenceUnavailable;

      compute
        compute_cases
          // @trace READINESS-01
          case READINESS_UNAVAILABLE "Fault or recovery disposition makes evidence unavailable":
            assume charge_decision.disposition == ChargeDisposition.InputFault |
                   charge_decision.disposition == ChargeDisposition.RecoveryPending;
            guarantee readiness_evidence == BatteryReadinessEvidence.EvidenceUnavailable;
          // @trace READINESS-01
          case READINESS_LOW "Producer-admissible nonfault low evidence is not ready":
            assume charge_decision.disposition != ChargeDisposition.InputFault &
                   charge_decision.disposition != ChargeDisposition.RecoveryPending &
                   battery_evidence == BatteryEvidence.LowBatteryEvidence;
            guarantee readiness_evidence == BatteryReadinessEvidence.BatteryNotReady;
          // @trace READINESS-01
          case READINESS_ADEQUATE "Producer-admissible nonfault adequate evidence is ready":
            assume charge_decision.disposition != ChargeDisposition.InputFault &
                   charge_decision.disposition != ChargeDisposition.RecoveryPending &
                   battery_evidence == BatteryEvidence.AdequateBatteryEvidence;
            guarantee readiness_evidence == BatteryReadinessEvidence.BatteryReady;
    }*/
  }

  // @generated-support SUPPORT-01 behavior-free containment and boundary delegation only
  part def Charge_Supervision_Process :> Process {
    // @trace PART-01
    part battery_evidence_qualification : Battery_Evidence_Qualification;
    // @trace PART-02
    part charge_context_qualification : Charge_Context_Qualification;
    // @trace PART-03
    part charge_intent_qualification : Charge_Intent_Qualification;
    // @trace PART-04
    part charge_qualification_owner : Charge_Qualification_Owner;
    // @trace PART-05
    part pilot_attention_derivation : Pilot_Attention_Derivation;
    // @trace PART-06
    part readiness_evidence_derivation : Readiness_Evidence_Derivation;

    // @generated-support process boundary for semantic interaction
    // @trace INT-01
    port battery_sample : DataPort { in :>> type : BatterySample; }
    // @generated-support process boundary for semantic interaction
    // @trace INT-02
    port charger_sample : DataPort { in :>> type : ChargerSample; }
    // @generated-support process boundary for semantic interaction
    // @trace INT-03
    port flight_sample : DataPort { in :>> type : FlightActivitySample; }
    // @generated-support process boundary for semantic interaction
    // @trace INT-04
    port intent_sample : DataPort { in :>> type : ChargeIntentSample; }
    // @generated-support process boundary for semantic interaction
    // @trace INT-08
    port authorization : DataPort { out :>> type : ChargeAuthorization; }
    // @generated-support process boundary for semantic interaction
    // @trace INT-11
    port battery_attention : DataPort { out :>> type : BatteryAttention; }
    // @generated-support process boundary for semantic interaction
    // @trace INT-14
    port readiness_evidence : DataPort { out :>> type : BatteryReadinessEvidence; }

    // @generated-support inbound delegation hop
    // @trace INT-01
    connection battery_sample_to_qualification : PortConnection
      connect battery_sample to battery_evidence_qualification.battery_sample;
    // @generated-support inbound delegation hop
    // @trace INT-02
    connection charger_sample_to_context : PortConnection
      connect charger_sample to charge_context_qualification.charger_sample;
    // @generated-support inbound delegation hop
    // @trace INT-03
    connection flight_sample_to_context : PortConnection
      connect flight_sample to charge_context_qualification.flight_sample;
    // @generated-support inbound delegation hop
    // @trace INT-04
    connection intent_sample_to_qualification : PortConnection
      connect intent_sample to charge_intent_qualification.intent_sample;

    // @trace INT-05
    connection battery_evidence_to_owner : PortConnection
      connect battery_evidence_qualification.evidence_to_owner to charge_qualification_owner.battery_evidence;
    // @trace INT-06
    connection charge_context_to_owner : PortConnection
      connect charge_context_qualification.charge_context to charge_qualification_owner.charge_context;
    // @trace INT-07
    connection qualified_intent_to_owner : PortConnection
      connect charge_intent_qualification.qualified_intent to charge_qualification_owner.qualified_intent;
    // @trace INT-09
    connection decision_to_attention : PortConnection
      connect charge_qualification_owner.decision_to_attention to pilot_attention_derivation.charge_decision;
    // @trace INT-10
    connection evidence_to_attention : PortConnection
      connect battery_evidence_qualification.evidence_to_attention to pilot_attention_derivation.battery_evidence;
    // @trace INT-12
    connection decision_to_readiness : PortConnection
      connect charge_qualification_owner.decision_to_readiness to readiness_evidence_derivation.charge_decision;
    // @trace INT-13
    connection evidence_to_readiness : PortConnection
      connect battery_evidence_qualification.evidence_to_readiness to readiness_evidence_derivation.battery_evidence;

    // @generated-support outbound delegation hop
    // @trace INT-08
    connection authorization_to_process_boundary : PortConnection
      connect charge_qualification_owner.authorization to authorization;
    // @generated-support outbound delegation hop
    // @trace INT-11
    connection attention_to_process_boundary : PortConnection
      connect pilot_attention_derivation.battery_attention to battery_attention;
    // @generated-support outbound delegation hop
    // @trace INT-14
    connection readiness_to_process_boundary : PortConnection
      connect readiness_evidence_derivation.readiness_evidence to readiness_evidence;
  }

  // @trace BOUND-01
  part def Drone_Battery_Charge_Supervisor_System :> System {
    // @generated-support SUPPORT-01 sole behavior-free Process usage
    part charge_supervision_process : Charge_Supervision_Process;

    // @trace MON-01
    port battery_sample : DataPort { in :>> type : BatterySample; }
    // @trace MON-02
    port charger_sample : DataPort { in :>> type : ChargerSample; }
    // @trace MON-03
    port flight_sample : DataPort { in :>> type : FlightActivitySample; }
    // @trace MON-04
    port intent_sample : DataPort { in :>> type : ChargeIntentSample; }
    // @trace CTRL-01
    port charge_authorization : DataPort { out :>> type : ChargeAuthorization; }
    // @trace CTRL-02
    port battery_attention : DataPort { out :>> type : BatteryAttention; }
    // @trace CTRL-03
    port battery_readiness_evidence : DataPort { out :>> type : BatteryReadinessEvidence; }

    // @generated-support root-to-Process delegation hop
    // @trace INT-01
    connection boundary_battery_sample : PortConnection
      connect battery_sample to charge_supervision_process.battery_sample;
    // @generated-support root-to-Process delegation hop
    // @trace INT-02
    connection boundary_charger_sample : PortConnection
      connect charger_sample to charge_supervision_process.charger_sample;
    // @generated-support root-to-Process delegation hop
    // @trace INT-03
    connection boundary_flight_sample : PortConnection
      connect flight_sample to charge_supervision_process.flight_sample;
    // @generated-support root-to-Process delegation hop
    // @trace INT-04
    connection boundary_intent_sample : PortConnection
      connect intent_sample to charge_supervision_process.intent_sample;
    // @generated-support Process-to-root delegation hop
    // @trace INT-08
    connection boundary_authorization : PortConnection
      connect charge_supervision_process.authorization to charge_authorization;
    // @generated-support Process-to-root delegation hop
    // @trace INT-11
    connection boundary_attention : PortConnection
      connect charge_supervision_process.battery_attention to battery_attention;
    // @generated-support Process-to-root delegation hop
    // @trace INT-14
    connection boundary_readiness : PortConnection
      connect charge_supervision_process.readiness_evidence to battery_readiness_evidence;
  }

  // @trace BOUND-01
  part drone_battery_charge_supervisor : Drone_Battery_Charge_Supervisor_System;
}
