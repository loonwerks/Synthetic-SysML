package Drone_Battery_Charge_Qualification_Supervisor {

  private import HAMR::*;

  // Closed finite boundary and owner-local domains.
  // @trace MON-01
  enum def ServiceRequest { enum None; enum Assess; enum BeginCharge; enum EndCharge; enum AcknowledgeNotice; }
  // @trace MON-02
  enum def BatteryBand { enum Full; enum Nominal; enum Low; enum Critical; }
  // @trace MON-02
  enum def Validity { enum Valid; enum Invalid; }
  // @trace MON-03
  enum def ChargerReport { enum Disconnected; enum Ready; enum Faulted; enum Unknown; }
  // @trace MON-04
  enum def ChargeInterfaceReport { enum Idle; enum Active; enum Faulted; enum Unknown; }
  // @trace MON-05
  enum def LifecyclePhase { enum Off; enum Standby; enum Charging; enum Ready; enum Flying; }
  // @trace CTRL-01
  enum def ChargeAuthorization { enum Denied; enum Permitted; }
  // @trace CTRL-02
  enum def PilotNotice { enum EvidenceUntrusted; enum Critical; enum Low; enum ChargeAttention; enum RecoveryPending; enum Clear; }
  // @trace CTRL-03
  enum def FlightControlNotice { enum EvidenceUntrusted; enum Critical; enum Low; enum RecoveryPending; enum Clear; }
  // @trace CTRL-04
  enum def PilotAdvisory {
    enum ADVISORY_UNKNOWN;
    enum BATTERY_READY;
    enum CHARGE_QUALIFIED;
    enum CHARGE_BLOCKED;
    enum AIRBORNE_ATTENTION;
  }
  // @trace CTRL-04
  enum def RequestResult { enum None; enum Accepted; enum Rejected; enum Deferred; enum NoEffect; }
  // @trace STATE-01
  enum def BatteryConfidence { enum Untrusted; enum Confirming; enum Trusted; }
  // @trace STATE-02
  enum def AttentionState { enum Clear; enum Attention; }
  // @trace STATE-03
  enum def ChargeSession { enum Idle; enum Eligible; enum Authorized; enum Suspended; }
  // @trace STATE-03
  enum def SourceChargeSession { enum Idle; enum Eligible; enum Authorized; enum Suspended; }
  // @trace PART-02
  enum def QualifiedBand { enum Suppressed; enum Full; enum Nominal; enum Low; enum Critical; }
  // @trace PART-07
  enum def ChargeEligibility { enum Blocked; enum NotNeeded; enum Permitted; }
  // @trace PART-08
  enum def AttentionCause { enum Untrusted; enum Critical; enum Low; enum RecoveryPending; enum Clear; }
  // @trace CASE-AUDIT-01
  enum def ConfidenceCase { enum CONF_01; enum CONF_02; enum CONF_03; enum CONF_04; }
  // @trace CASE-AUDIT-01
  enum def AttentionCase { enum ATTN_01; enum ATTN_02; enum ATTN_03; enum ATTN_04; enum ATTN_05; enum ATTN_06; }
  // @trace CASE-AUDIT-01
  enum def SessionCase {
    enum SESS_01; enum SESS_02; enum SESS_03; enum SESS_04; enum SESS_05;
    enum SESS_06; enum SESS_07; enum SESS_08; enum SESS_09; enum SESS_10;
    enum SESS_11; enum SESS_12; enum SESS_13;
  }

  // Every member below is an attribute because final GUMBO expressions inspect it.
  // @trace MON-02
  part def BatteryReportValue :> Data {
    // @trace MON-02
    attribute band : BatteryBand;
    // @trace MON-02
    attribute validity : Validity;
  }
  // @trace MON-05
  part def LifecycleReportValue :> Data {
    // @trace MON-05
    attribute phase : LifecyclePhase;
    // @trace MON-05
    attribute validity : Validity;
  }
  // @trace PART-02
  part def BatteryQualification :> Data {
    // @trace PART-02
    attribute validEvidence : Boolean;
    // @trace PART-02
    attribute band : QualifiedBand;
  }
  // @trace PART-03
  part def ChargerFacts :> Data {
    // @trace PART-03
    attribute chargerUsable : Boolean;
    // @trace PART-03
    attribute chargerConnected : Boolean;
    // @trace PART-03
    attribute chargerFault : Boolean;
  }
  // @trace PART-04
  part def InterfaceFacts :> Data {
    // @trace PART-04
    attribute interfaceHealthy : Boolean;
    // @trace PART-04
    attribute activityObserved : Boolean;
    // @trace PART-04
    attribute interfaceFault : Boolean;
  }
  // @trace PART-05
  part def LifecycleFacts :> Data {
    // @trace PART-05
    attribute chargeContextAllowed : Boolean;
    // @trace PART-05
    attribute airborneContext : Boolean;
    // @trace PART-05
    attribute contextValid : Boolean;
    // @trace PART-05
    attribute contextFault : Boolean;
  }
  // @trace PART-06
  part def BatteryStateFacts :> Data {
    // @trace PART-06
    attribute confidence : BatteryConfidence;
    // @trace PART-06
    attribute band : QualifiedBand;
    // @trace PART-06
    attribute chargeNeeded : Boolean;
    // @trace PART-06
    attribute batteryUsable : Boolean;
    // @trace PART-06
    attribute batteryFault : Boolean;
    // @trace CASE-AUDIT-01
    attribute winningCase : ConfidenceCase;
  }
  // @trace PART-08
  part def AttentionResolution :> Data {
    // @trace PART-08
    attribute newAttention : AttentionState;
    // @trace PART-08
    attribute cause : AttentionCause;
    // @trace PART-08
    attribute attentionClearedNow : Boolean;
    // @trace CASE-AUDIT-01
    attribute winningCase : AttentionCase;
  }
  // @trace PART-10
  part def FaultVector :> Data {
    // @trace PART-10
    attribute batteryFault : Boolean;
    // @trace PART-10
    attribute chargerFault : Boolean;
    // @trace PART-10
    attribute interfaceFault : Boolean;
    // @trace PART-10
    attribute contextFault : Boolean;
    // @trace PART-10
    attribute sessionConflict : Boolean;
  }
  // @trace PART-10
  part def FaultFacts :> Data {
    // @trace PART-10
    attribute vector : FaultVector;
    // @trace PART-10
    attribute aggregateFault : Boolean;
  }
  // @trace PART-11
  part def PublishedSession :> Data {
    // @trace PART-11
    attribute sessionValue : ChargeSession;
  }
  // @trace PART-11
  part def SessionResolution :> Data {
    // @trace PART-11
    attribute sourceSession : SourceChargeSession;
    // @trace PART-11
    attribute newSession : PublishedSession;
    // @trace PART-11
    attribute sessionConflict : Boolean;
    // @trace CASE-AUDIT-01
    attribute winningCase : SessionCase;
  }
  // @trace PART-09
  part def AdvisoryFacts :> Data {
    // @trace PART-09
    attribute advisoryValue : PilotAdvisory;
  }
  // @trace PART-01
  part def PublishedRequestResult :> Data {
    // @trace PART-01
    attribute requestResultValue : RequestResult;
  }
  // @trace PART-01
  part def PublicDecisionFacts :> Data {
    // @trace PART-09
    attribute advisory : AdvisoryFacts;
    // @trace PART-01
    attribute requestResult : PublishedRequestResult;
    // @trace PART-11
    attribute newSession : PublishedSession;
  }
  // @trace PART-12
  part def NotificationFacts :> Data {
    // @trace PART-12
    attribute pilotNotice : PilotNotice;
    // @trace PART-12
    attribute flightControlNotice : FlightControlNotice;
  }
  // @trace CTRL-04
  part def PilotStatus :> Data {
    // @trace PART-09
    attribute statusAdvisory : AdvisoryFacts;
    // @trace PART-11
    attribute statusSession : PublishedSession;
    // @trace PART-01
    attribute statusRequestResult : PublishedRequestResult;
    // @trace PART-10
    attribute faults : FaultVector;
    // @trace PART-10
    attribute aggregateFault : Boolean;
  }

  // @trace PART-01
  part def CurrentRequestResultDecisionOwner :> Thread {
    // @trace INT-01
    port requestIn : DataPort { in :>> type : ServiceRequest; }
    // @trace INT-31
    port attentionClearedIn : DataPort { in :>> type : Boolean; }
    // @trace INT-25
    port advisoryIn : DataPort { in :>> type : AdvisoryFacts; }
    // @trace INT-30
    port sessionIn : DataPort { in :>> type : SessionResolution; }
    // @trace INT-08
    port publicFactsOut : DataPort { out :>> type : PublicDecisionFacts; }

    // @trace POL-REQ-01
    language "GUMBO" /*{
      initialize
        // @trace BEH-07
        guarantee INITIAL_PUBLIC_REQUEST_RESULT "No request is accepted before a complete evaluation":
          publicFactsOut.requestResult.requestResultValue == RequestResult.None;
        // @trace BEH-07
        guarantee INITIAL_PUBLIC_ADVISORY "The public advisory initializes without trusted battery evidence":
          publicFactsOut.advisory.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN;
        // @trace BEH-07
        guarantee INITIAL_PUBLIC_SESSION "The public charge session initializes idle":
          publicFactsOut.newSession.sessionValue == ChargeSession.Idle;

      compute
        // @trace COMP-01
        guarantee PUBLIC_DECISION_COPIES "The uncredited advisory and session fields preserve their producing owners":
          publicFactsOut.advisory.advisoryValue == advisoryIn.advisoryValue &
          publicFactsOut.newSession.sessionValue == sessionIn.newSession.sessionValue;

        compute_cases
          // @trace POL-REQ-01
          case REQUEST_NONE "None has no request result":
            assume requestIn == ServiceRequest.None;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.None;
          // @trace POL-REQ-01
          case ASSESS_DEFERRED "Assess is deferred while the advisory is unknown":
            assume requestIn == ServiceRequest.Assess & advisoryIn.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Deferred;
          // @trace POL-REQ-01
          case ASSESS_ACCEPTED "Assess is accepted for every known advisory":
            assume requestIn == ServiceRequest.Assess & advisoryIn.advisoryValue != PilotAdvisory.ADVISORY_UNKNOWN;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted;
          // @trace POL-REQ-01
          case BEGIN_ACCEPTED "Begin is accepted only for a winning fresh authorization case":
            assume requestIn == ServiceRequest.BeginCharge &
                   (sessionIn.winningCase == SessionCase.SESS_07 |
                    sessionIn.winningCase == SessionCase.SESS_09);
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted;
          // @trace POL-REQ-01
          case BEGIN_DEFERRED "Begin is deferred for conflict, blocked, or retained suspension":
            assume requestIn == ServiceRequest.BeginCharge &
                   (sessionIn.winningCase == SessionCase.SESS_01 |
                    sessionIn.winningCase == SessionCase.SESS_02 |
                    sessionIn.winningCase == SessionCase.SESS_08);
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Deferred;
          // @trace POL-REQ-01
          case BEGIN_NO_EFFECT "Begin has no effect when authorization is retained":
            assume requestIn == ServiceRequest.BeginCharge &
                   sessionIn.winningCase == SessionCase.SESS_06;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.NoEffect;
          // @trace POL-REQ-01
          case BEGIN_REJECTED "Every other Begin result is rejected":
            assume requestIn == ServiceRequest.BeginCharge &
                   sessionIn.winningCase != SessionCase.SESS_01 &
                   sessionIn.winningCase != SessionCase.SESS_02 &
                   sessionIn.winningCase != SessionCase.SESS_06 &
                   sessionIn.winningCase != SessionCase.SESS_07 &
                   sessionIn.winningCase != SessionCase.SESS_08 &
                   sessionIn.winningCase != SessionCase.SESS_09;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Rejected;
          // @trace POL-REQ-01
          case END_ACCEPTED "End is accepted only for the two applicable ending cases":
            assume requestIn == ServiceRequest.EndCharge &
                   (sessionIn.winningCase == SessionCase.SESS_03 |
                    sessionIn.winningCase == SessionCase.SESS_04);
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted;
          // @trace POL-REQ-01
          case END_NO_EFFECT "Every other End request has no effect":
            assume requestIn == ServiceRequest.EndCharge &
                   sessionIn.winningCase != SessionCase.SESS_03 &
                   sessionIn.winningCase != SessionCase.SESS_04;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.NoEffect;
          // @trace POL-REQ-01
          case ACKNOWLEDGEMENT_ACCEPTED "Acknowledge is accepted only when attention clears now":
            assume requestIn == ServiceRequest.AcknowledgeNotice & attentionClearedIn;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted;
          // @trace POL-REQ-01
          case ACKNOWLEDGEMENT_NO_EFFECT "An inapplicable acknowledgement has no effect":
            assume requestIn == ServiceRequest.AcknowledgeNotice & not attentionClearedIn;
            guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.NoEffect;
    }*/
  }
  // @trace PART-02
  part def BatteryEvidenceQualifier :> Thread {
    // @trace INT-02
    port reportIn : DataPort { in :>> type : BatteryReportValue; }
    // @trace INT-09
    port qualificationOut : DataPort { out :>> type : BatteryQualification; }

    // @trace PART-02
    language "GUMBO" /*{
      initialize
        // @trace BEH-07
        guarantee INITIAL_BATTERY_QUALIFICATION "Battery evidence initializes suppressed and invalid":
          not qualificationOut.validEvidence &
          qualificationOut.band == QualifiedBand.Suppressed;
      compute
        compute_cases
          // @trace BEH-01
          case INVALID_BATTERY_REPORT "Invalid status suppresses every accompanying band":
            assume reportIn.validity == Validity.Invalid;
            guarantee not qualificationOut.validEvidence &
                      qualificationOut.band == QualifiedBand.Suppressed;
          // @trace BEH-01
          case VALID_FULL_REPORT "A valid Full report preserves Full":
            assume reportIn.validity == Validity.Valid & reportIn.band == BatteryBand.Full;
            guarantee qualificationOut.validEvidence & qualificationOut.band == QualifiedBand.Full;
          // @trace BEH-01
          case VALID_NOMINAL_REPORT "A valid Nominal report preserves Nominal":
            assume reportIn.validity == Validity.Valid & reportIn.band == BatteryBand.Nominal;
            guarantee qualificationOut.validEvidence & qualificationOut.band == QualifiedBand.Nominal;
          // @trace BEH-01
          case VALID_LOW_REPORT "A valid Low report preserves Low":
            assume reportIn.validity == Validity.Valid & reportIn.band == BatteryBand.Low;
            guarantee qualificationOut.validEvidence & qualificationOut.band == QualifiedBand.Low;
          // @trace BEH-01
          case VALID_CRITICAL_REPORT "A valid Critical report preserves Critical":
            assume reportIn.validity == Validity.Valid & reportIn.band == BatteryBand.Critical;
            guarantee qualificationOut.validEvidence & qualificationOut.band == QualifiedBand.Critical;
    }*/
  }
  // @trace PART-03
  part def ChargerEvidenceQualifier :> Thread {
    // @trace INT-03
    port reportIn : DataPort { in :>> type : ChargerReport; }
    // @trace INT-10
    port factsToEligibility : DataPort { out :>> type : ChargerFacts; }
    // @trace INT-11
    port faultToAggregation : DataPort { out :>> type : Boolean; }

    // @trace PART-03
    language "GUMBO" /*{
      initialize
        // @trace BEH-07
        guarantee INITIAL_CHARGER_FACTS "Charger evidence initializes unusable and faulted":
          not factsToEligibility.chargerUsable &
          not factsToEligibility.chargerConnected &
          factsToEligibility.chargerFault & faultToAggregation;
      compute
        // @trace COMP-01
        guarantee CHARGER_FAULT_PUBLICATION "The aggregation bit preserves the local classification":
          faultToAggregation == factsToEligibility.chargerFault;
        compute_cases
          // @trace MON-03
          case CHARGER_DISCONNECTED "Disconnected is unavailable without fault":
            assume reportIn == ChargerReport.Disconnected;
            guarantee not factsToEligibility.chargerUsable &
                      not factsToEligibility.chargerConnected &
                      not factsToEligibility.chargerFault;
          // @trace MON-03
          case CHARGER_READY "Ready is connected and usable":
            assume reportIn == ChargerReport.Ready;
            guarantee factsToEligibility.chargerUsable &
                      factsToEligibility.chargerConnected &
                      not factsToEligibility.chargerFault;
          // @trace MON-03
          case CHARGER_FAULTED "Faulted is connected but unusable and faulted":
            assume reportIn == ChargerReport.Faulted;
            guarantee not factsToEligibility.chargerUsable &
                      factsToEligibility.chargerConnected &
                      factsToEligibility.chargerFault;
          // @trace MON-03
          case CHARGER_UNKNOWN "Unknown is unusable and faulted":
            assume reportIn == ChargerReport.Unknown;
            guarantee not factsToEligibility.chargerUsable &
                      not factsToEligibility.chargerConnected &
                      factsToEligibility.chargerFault;
    }*/
  }
  // @trace PART-04
  part def ChargingInterfaceEvidenceQualifier :> Thread {
    // @trace INT-04
    port reportIn : DataPort { in :>> type : ChargeInterfaceReport; }
    // @trace INT-12
    port factsToEligibility : DataPort { out :>> type : InterfaceFacts; }
    // @trace INT-13
    port factsToSession : DataPort { out :>> type : InterfaceFacts; }
    // @trace INT-14
    port faultToAggregation : DataPort { out :>> type : Boolean; }

    // @trace PART-04
    language "GUMBO" /*{
      initialize
        // @trace BEH-07
        guarantee INITIAL_INTERFACE_FACTS "Interface evidence initializes unhealthy, inactive, and faulted":
          not factsToEligibility.interfaceHealthy &
          not factsToEligibility.activityObserved &
          factsToEligibility.interfaceFault &
          not factsToSession.interfaceHealthy &
          not factsToSession.activityObserved &
          factsToSession.interfaceFault & faultToAggregation;
      compute
        // @trace COMP-01
        guarantee INTERFACE_PUBLICATIONS_AGREE "Both consumers and the fault aggregator receive the same local classification":
          factsToEligibility.interfaceHealthy == factsToSession.interfaceHealthy &
          factsToEligibility.activityObserved == factsToSession.activityObserved &
          factsToEligibility.interfaceFault == factsToSession.interfaceFault &
          faultToAggregation == factsToEligibility.interfaceFault;
        compute_cases
          // @trace MON-04
          case INTERFACE_IDLE "Idle is healthy without observed activity":
            assume reportIn == ChargeInterfaceReport.Idle;
            guarantee factsToEligibility.interfaceHealthy &
                      not factsToEligibility.activityObserved &
                      not factsToEligibility.interfaceFault;
          // @trace MON-04
          case INTERFACE_ACTIVE "Active is healthy with observed activity":
            assume reportIn == ChargeInterfaceReport.Active;
            guarantee factsToEligibility.interfaceHealthy &
                      factsToEligibility.activityObserved &
                      not factsToEligibility.interfaceFault;
          // @trace MON-04
          case INTERFACE_FAULTED "Faulted is unhealthy and faulted":
            assume reportIn == ChargeInterfaceReport.Faulted;
            guarantee not factsToEligibility.interfaceHealthy &
                      not factsToEligibility.activityObserved &
                      factsToEligibility.interfaceFault;
          // @trace MON-04
          case INTERFACE_UNKNOWN "Unknown is unhealthy and faulted":
            assume reportIn == ChargeInterfaceReport.Unknown;
            guarantee not factsToEligibility.interfaceHealthy &
                      not factsToEligibility.activityObserved &
                      factsToEligibility.interfaceFault;
    }*/
  }
  // @trace PART-05
  part def LifecycleContextApplicabilityOwner :> Thread {
    // @trace INT-05
    port reportIn : DataPort { in :>> type : LifecycleReportValue; }
    // @trace INT-15
    port factsToEligibility : DataPort { out :>> type : LifecycleFacts; }
    // @trace INT-16
    port factsToAdvisory : DataPort { out :>> type : LifecycleFacts; }
    // @trace INT-17
    port faultToAggregation : DataPort { out :>> type : Boolean; }

    // @trace PART-05
    language "GUMBO" /*{
      initialize
        // @trace BEH-07
        guarantee INITIAL_LIFECYCLE_FACTS "Read-only lifecycle context initializes invalid and disallowed":
          not factsToEligibility.chargeContextAllowed &
          not factsToEligibility.airborneContext &
          not factsToEligibility.contextValid &
          factsToEligibility.contextFault &
          not factsToAdvisory.chargeContextAllowed &
          not factsToAdvisory.airborneContext &
          not factsToAdvisory.contextValid &
          factsToAdvisory.contextFault & faultToAggregation;
      compute
        // @trace COMP-01
        guarantee LIFECYCLE_PUBLICATIONS_AGREE "Eligibility, advisory, and aggregation receive one applicability classification":
          factsToEligibility.chargeContextAllowed == factsToAdvisory.chargeContextAllowed &
          factsToEligibility.airborneContext == factsToAdvisory.airborneContext &
          factsToEligibility.contextValid == factsToAdvisory.contextValid &
          factsToEligibility.contextFault == factsToAdvisory.contextFault &
          faultToAggregation == factsToEligibility.contextFault;
        // @trace MON-05
        guarantee LIFECYCLE_VALIDITY "Only valid status grants phase authority":
          factsToEligibility.contextValid == (reportIn.validity == Validity.Valid) &
          factsToEligibility.contextFault == (reportIn.validity == Validity.Invalid);
        // @trace MON-05
        guarantee CHARGING_CONTEXT_APPLICABILITY "Only valid Off, Standby, or Charging context allows charging":
          factsToEligibility.chargeContextAllowed ==
            (reportIn.validity == Validity.Valid &
             (reportIn.phase == LifecyclePhase.Off |
              reportIn.phase == LifecyclePhase.Standby |
              reportIn.phase == LifecyclePhase.Charging));
        // @trace MON-05
        guarantee AIRBORNE_CONTEXT_APPLICABILITY "Only valid Flying context is airborne":
          factsToEligibility.airborneContext ==
            (reportIn.validity == Validity.Valid & reportIn.phase == LifecyclePhase.Flying);
    }*/
  }
  // @trace PART-06
  part def BatteryConfidenceStateOwner :> Thread {
    // @trace INT-09
    port qualificationIn : DataPort { in :>> type : BatteryQualification; }
    // @trace INT-18
    port stateToEligibility : DataPort { out :>> type : BatteryStateFacts; }
    // @trace INT-19
    port stateToAttention : DataPort { out :>> type : BatteryStateFacts; }
    // @trace INT-20
    port stateToAdvisory : DataPort { out :>> type : BatteryStateFacts; }
    // @trace INT-21
    port faultToAggregation : DataPort { out :>> type : Boolean; }

    // @trace STATE-01
    language "GUMBO" /*{
      state
        // @trace STATE-01
        confidenceState: BatteryConfidence;
      initialize
        modifies confidenceState;
        // @trace BEH-07
        guarantee INITIAL_CONFIDENCE "Confidence and every publication initialize untrusted without a trusted band":
          confidenceState == BatteryConfidence.Untrusted &
          stateToEligibility.confidence == BatteryConfidence.Untrusted &
          stateToEligibility.band == QualifiedBand.Suppressed &
          not stateToEligibility.chargeNeeded &
          not stateToEligibility.batteryUsable &
          stateToEligibility.batteryFault &
          stateToEligibility.winningCase == ConfidenceCase.CONF_01 &
          stateToAttention.confidence == BatteryConfidence.Untrusted &
          stateToAttention.band == QualifiedBand.Suppressed &
          not stateToAttention.chargeNeeded &
          not stateToAttention.batteryUsable &
          stateToAttention.batteryFault &
          stateToAttention.winningCase == ConfidenceCase.CONF_01 &
          stateToAdvisory.confidence == BatteryConfidence.Untrusted &
          stateToAdvisory.band == QualifiedBand.Suppressed &
          not stateToAdvisory.chargeNeeded &
          not stateToAdvisory.batteryUsable &
          stateToAdvisory.batteryFault &
          stateToAdvisory.winningCase == ConfidenceCase.CONF_01 &
          faultToAggregation;
      compute
        modifies confidenceState;
        // @trace COMP-01
        guarantee CONFIDENCE_PUBLICATIONS_AGREE "All consumers receive the one committed confidence result":
          stateToEligibility.confidence == confidenceState &
          stateToAttention.confidence == stateToEligibility.confidence &
          stateToAttention.band == stateToEligibility.band &
          stateToAttention.chargeNeeded == stateToEligibility.chargeNeeded &
          stateToAttention.batteryUsable == stateToEligibility.batteryUsable &
          stateToAttention.batteryFault == stateToEligibility.batteryFault &
          stateToAttention.winningCase == stateToEligibility.winningCase &
          stateToAdvisory.confidence == stateToEligibility.confidence &
          stateToAdvisory.band == stateToEligibility.band &
          stateToAdvisory.chargeNeeded == stateToEligibility.chargeNeeded &
          stateToAdvisory.batteryUsable == stateToEligibility.batteryUsable &
          stateToAdvisory.batteryFault == stateToEligibility.batteryFault &
          stateToAdvisory.winningCase == stateToEligibility.winningCase &
          faultToAggregation == stateToEligibility.batteryFault;
        // @trace ASM-06
        guarantee CONFIDENCE_DERIVED_FACTS "Usability and charge need follow only the committed confidence and qualified band":
          stateToEligibility.band == qualificationIn.band &
          stateToEligibility.batteryUsable == (confidenceState == BatteryConfidence.Trusted) &
          stateToEligibility.batteryFault == (not qualificationIn.validEvidence) &
          stateToEligibility.chargeNeeded ==
            (confidenceState == BatteryConfidence.Trusted & qualificationIn.band != QualifiedBand.Full);
        compute_cases
          // @trace CASE-CONF-01
          case CONF_01_INVALID "Invalid evidence immediately selects Untrusted":
            assume not qualificationIn.validEvidence;
            guarantee confidenceState == BatteryConfidence.Untrusted &
                      stateToEligibility.winningCase == ConfidenceCase.CONF_01;
          // @trace CASE-CONF-02
          case CONF_02_FIRST_VALID "A first valid report advances Untrusted to Confirming":
            assume qualificationIn.validEvidence & In(confidenceState) == BatteryConfidence.Untrusted;
            guarantee confidenceState == BatteryConfidence.Confirming &
                      stateToEligibility.winningCase == ConfidenceCase.CONF_02;
          // @trace CASE-CONF-03
          case CONF_03_SECOND_VALID "A second consecutive valid report advances Confirming to Trusted":
            assume qualificationIn.validEvidence & In(confidenceState) == BatteryConfidence.Confirming;
            guarantee confidenceState == BatteryConfidence.Trusted &
                      stateToEligibility.winningCase == ConfidenceCase.CONF_03;
          // @trace CASE-CONF-04
          case CONF_04_RETAIN_TRUST "A valid report retains Trusted":
            assume qualificationIn.validEvidence & In(confidenceState) == BatteryConfidence.Trusted;
            guarantee confidenceState == BatteryConfidence.Trusted &
                      stateToEligibility.winningCase == ConfidenceCase.CONF_04;
    }*/
  }
  // @trace PART-07
  part def ChargeEligibilityDecisionOwner :> Thread {
    // @trace INT-10
    port chargerIn : DataPort { in :>> type : ChargerFacts; }
    // @trace INT-12
    port interfaceIn : DataPort { in :>> type : InterfaceFacts; }
    // @trace INT-15
    port lifecycleIn : DataPort { in :>> type : LifecycleFacts; }
    // @trace INT-18
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    // @trace INT-22
    port eligibilityToAdvisory : DataPort { out :>> type : ChargeEligibility; }
    // @trace INT-23
    port eligibilityToSession : DataPort { out :>> type : ChargeEligibility; }

    // @trace POL-ELIG-01
    language "GUMBO" /*{
      initialize
        // @trace BEH-07
        guarantee INITIAL_ELIGIBILITY "Eligibility initializes blocked":
          eligibilityToAdvisory == ChargeEligibility.Blocked &
          eligibilityToSession == ChargeEligibility.Blocked;
      compute
        // @trace COMP-01
        guarantee ELIGIBILITY_PUBLICATIONS_AGREE "Both consumers receive one eligibility decision":
          eligibilityToAdvisory == eligibilityToSession;
        compute_cases
          // @trace POL-ELIG-01
          case ELIGIBILITY_BLOCKED "Any unusable evidence domain blocks charging":
            assume batteryIn.confidence != BatteryConfidence.Trusted |
                   not chargerIn.chargerUsable |
                   not interfaceIn.interfaceHealthy |
                   not lifecycleIn.chargeContextAllowed;
            guarantee eligibilityToAdvisory == ChargeEligibility.Blocked;
          // @trace POL-ELIG-01
          case ELIGIBILITY_NOT_NEEDED "All usable evidence with Full selects NotNeeded":
            assume batteryIn.confidence == BatteryConfidence.Trusted &
                   chargerIn.chargerUsable & interfaceIn.interfaceHealthy &
                   lifecycleIn.chargeContextAllowed & batteryIn.band == QualifiedBand.Full;
            guarantee eligibilityToAdvisory == ChargeEligibility.NotNeeded;
          // @trace POL-ELIG-01
          case ELIGIBILITY_PERMITTED "All usable non-Full evidence selects Permitted":
            assume batteryIn.confidence == BatteryConfidence.Trusted &
                   chargerIn.chargerUsable & interfaceIn.interfaceHealthy &
                   lifecycleIn.chargeContextAllowed & batteryIn.band != QualifiedBand.Full;
            guarantee eligibilityToAdvisory == ChargeEligibility.Permitted;
    }*/
  }
  // @trace PART-08
  part def AttentionLatchStateOwner :> Thread {
    // @trace INT-06
    port requestIn : DataPort { in :>> type : ServiceRequest; }
    // @trace INT-19
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    // @trace INT-24
    port resolutionToNotification : DataPort { out :>> type : AttentionResolution; }
    // @trace INT-31
    port clearedToRequestResult : DataPort { out :>> type : Boolean; }

    // @trace STATE-02
    language "GUMBO" /*{
      state
        // @trace STATE-02
        attentionState: AttentionState;
      initialize
        modifies attentionState;
        // @trace BEH-07
        guarantee INITIAL_ATTENTION "Attention initializes latched and untrusted":
          attentionState == AttentionState.Attention &
          resolutionToNotification.newAttention == AttentionState.Attention &
          resolutionToNotification.cause == AttentionCause.Untrusted &
          not resolutionToNotification.attentionClearedNow &
          resolutionToNotification.winningCase == AttentionCase.ATTN_01 &
          not clearedToRequestResult;
      compute
        modifies attentionState;
        // @trace COMP-01
        guarantee ATTENTION_PUBLICATION "The resolution carries the committed state and current clearing fact":
          resolutionToNotification.newAttention == attentionState &
          clearedToRequestResult == resolutionToNotification.attentionClearedNow;
        compute_cases
          // @trace CASE-ATTN-01
          case ATTN_01_UNTRUSTED "Nontrusted evidence has highest attention priority":
            assume batteryIn.confidence != BatteryConfidence.Trusted;
            guarantee attentionState == AttentionState.Attention &
                      resolutionToNotification.cause == AttentionCause.Untrusted &
                      not resolutionToNotification.attentionClearedNow &
                      resolutionToNotification.winningCase == AttentionCase.ATTN_01;
          // @trace CASE-ATTN-02
          case ATTN_02_CRITICAL "Trusted Critical evidence retains critical attention":
            assume batteryIn.confidence == BatteryConfidence.Trusted &
                   batteryIn.band == QualifiedBand.Critical;
            guarantee attentionState == AttentionState.Attention &
                      resolutionToNotification.cause == AttentionCause.Critical &
                      not resolutionToNotification.attentionClearedNow &
                      resolutionToNotification.winningCase == AttentionCase.ATTN_02;
          // @trace CASE-ATTN-03
          case ATTN_03_LOW "Trusted Low evidence retains low attention":
            assume batteryIn.confidence == BatteryConfidence.Trusted &
                   batteryIn.band == QualifiedBand.Low;
            guarantee attentionState == AttentionState.Attention &
                      resolutionToNotification.cause == AttentionCause.Low &
                      not resolutionToNotification.attentionClearedNow &
                      resolutionToNotification.winningCase == AttentionCase.ATTN_03;
          // @trace CASE-ATTN-04
          case ATTN_04_FRESH_ACKNOWLEDGEMENT "A fresh acknowledgement clears retained attention on trusted recovered evidence":
            assume batteryIn.confidence == BatteryConfidence.Trusted &
                   batteryIn.band != QualifiedBand.Critical &
                   batteryIn.band != QualifiedBand.Low &
                   In(attentionState) == AttentionState.Attention &
                   requestIn == ServiceRequest.AcknowledgeNotice;
            guarantee attentionState == AttentionState.Clear &
                      resolutionToNotification.cause == AttentionCause.Clear &
                      resolutionToNotification.attentionClearedNow &
                      resolutionToNotification.winningCase == AttentionCase.ATTN_04;
          // @trace CASE-ATTN-05
          case ATTN_05_RECOVERY_PENDING "Recovered evidence without a fresh acknowledgement retains attention":
            assume batteryIn.confidence == BatteryConfidence.Trusted &
                   batteryIn.band != QualifiedBand.Critical &
                   batteryIn.band != QualifiedBand.Low &
                   In(attentionState) == AttentionState.Attention &
                   requestIn != ServiceRequest.AcknowledgeNotice;
            guarantee attentionState == AttentionState.Attention &
                      resolutionToNotification.cause == AttentionCause.RecoveryPending &
                      not resolutionToNotification.attentionClearedNow &
                      resolutionToNotification.winningCase == AttentionCase.ATTN_05;
          // @trace CASE-ATTN-06
          case ATTN_06_RETAIN_CLEAR "Recovered evidence retains prior Clear":
            assume batteryIn.confidence == BatteryConfidence.Trusted &
                   batteryIn.band != QualifiedBand.Critical &
                   batteryIn.band != QualifiedBand.Low &
                   In(attentionState) == AttentionState.Clear;
            guarantee attentionState == AttentionState.Clear &
                      resolutionToNotification.cause == AttentionCause.Clear &
                      not resolutionToNotification.attentionClearedNow &
                      resolutionToNotification.winningCase == AttentionCase.ATTN_06;
    }*/
  }
  // @trace PART-09
  part def BatteryAdvisoryDecisionOwner :> Thread {
    // @trace INT-16
    port lifecycleIn : DataPort { in :>> type : LifecycleFacts; }
    // @trace INT-20
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    // @trace INT-22
    port eligibilityIn : DataPort { in :>> type : ChargeEligibility; }
    // @trace INT-25
    port advisoryToRequestResult : DataPort { out :>> type : AdvisoryFacts; }

    // @trace POL-ADV-01
    language "GUMBO" /*{
      initialize
        // @trace BEH-07
        guarantee INITIAL_ADVISORY "The battery advisory initializes unknown":
          advisoryToRequestResult.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN;
      compute
        compute_cases
          // @trace POL-ADV-01
          case ADVISORY_UNKNOWN "Untrusted battery or invalid lifecycle context produces Unknown":
            assume batteryIn.confidence != BatteryConfidence.Trusted | not lifecycleIn.contextValid;
            guarantee advisoryToRequestResult.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN;
          // @trace POL-ADV-01
          case ADVISORY_AIRBORNE_ATTENTION "Trusted low or critical evidence while Flying produces AirborneAttention":
            assume batteryIn.confidence == BatteryConfidence.Trusted & lifecycleIn.contextValid &
                   lifecycleIn.airborneContext &
                   (batteryIn.band == QualifiedBand.Low | batteryIn.band == QualifiedBand.Critical);
            guarantee advisoryToRequestResult.advisoryValue == PilotAdvisory.AIRBORNE_ATTENTION;
          // @trace POL-ADV-01
          case ADVISORY_BATTERY_READY "Trusted Full or Nominal evidence produces BatteryReady":
            assume batteryIn.confidence == BatteryConfidence.Trusted & lifecycleIn.contextValid &
                   (batteryIn.band == QualifiedBand.Full | batteryIn.band == QualifiedBand.Nominal);
            guarantee advisoryToRequestResult.advisoryValue == PilotAdvisory.BATTERY_READY;
          // @trace POL-ADV-01
          case ADVISORY_CHARGE_QUALIFIED "Grounded trusted Low or Critical with Permitted produces ChargeQualified":
            assume batteryIn.confidence == BatteryConfidence.Trusted & lifecycleIn.contextValid &
                   not lifecycleIn.airborneContext &
                   (batteryIn.band == QualifiedBand.Low | batteryIn.band == QualifiedBand.Critical) &
                   eligibilityIn == ChargeEligibility.Permitted;
            guarantee advisoryToRequestResult.advisoryValue == PilotAdvisory.CHARGE_QUALIFIED;
          // @trace POL-ADV-01
          case ADVISORY_CHARGE_BLOCKED "Every other trusted grounded Low or Critical condition produces ChargeBlocked":
            assume batteryIn.confidence == BatteryConfidence.Trusted & lifecycleIn.contextValid &
                   not lifecycleIn.airborneContext &
                   (batteryIn.band == QualifiedBand.Low | batteryIn.band == QualifiedBand.Critical) &
                   eligibilityIn != ChargeEligibility.Permitted;
            guarantee advisoryToRequestResult.advisoryValue == PilotAdvisory.CHARGE_BLOCKED;
    }*/
  }
  // @trace PART-10
  part def FaultAggregationOwner :> Thread {
    // @trace INT-11
    port chargerFaultIn : DataPort { in :>> type : Boolean; }
    // @trace INT-14
    port interfaceFaultIn : DataPort { in :>> type : Boolean; }
    // @trace INT-17
    port contextFaultIn : DataPort { in :>> type : Boolean; }
    // @trace INT-21
    port batteryFaultIn : DataPort { in :>> type : Boolean; }
    // @trace INT-28
    port sessionConflictIn : DataPort { in :>> type : Boolean; }
    // @trace INT-26
    port faultsToNotification : DataPort { out :>> type : FaultFacts; }
    // @trace INT-27
    port faultsToComposition : DataPort { out :>> type : FaultFacts; }

    // @trace PART-10
    language "GUMBO" /*{
      initialize
        // @trace BEH-07
        guarantee INITIAL_FAULT_FACTS "Absent initialized evidence is conservatively faulted without inventing a session conflict":
          faultsToNotification.vector.batteryFault &
          faultsToNotification.vector.chargerFault &
          faultsToNotification.vector.interfaceFault &
          faultsToNotification.vector.contextFault &
          not faultsToNotification.vector.sessionConflict &
          faultsToNotification.aggregateFault &
          faultsToComposition.vector.batteryFault &
          faultsToComposition.vector.chargerFault &
          faultsToComposition.vector.interfaceFault &
          faultsToComposition.vector.contextFault &
          not faultsToComposition.vector.sessionConflict &
          faultsToComposition.aggregateFault;
      compute
        // @trace FAULT-04
        guarantee EXACT_FAULT_VECTOR "The vector preserves each assigned current source bit":
          faultsToNotification.vector.batteryFault == batteryFaultIn &
          faultsToNotification.vector.chargerFault == chargerFaultIn &
          faultsToNotification.vector.interfaceFault == interfaceFaultIn &
          faultsToNotification.vector.contextFault == contextFaultIn &
          faultsToNotification.vector.sessionConflict == sessionConflictIn;
        // @trace FAULT-04
        guarantee EXACT_FAULT_DISJUNCTION "Aggregate fault is exactly the OR of all five vector bits":
          faultsToNotification.aggregateFault ==
            (batteryFaultIn | chargerFaultIn | interfaceFaultIn | contextFaultIn | sessionConflictIn);
        // @trace COMP-01
        guarantee FAULT_PUBLICATIONS_AGREE "Notification and public composition receive the exact same fault facts":
          faultsToComposition.vector.batteryFault == faultsToNotification.vector.batteryFault &
          faultsToComposition.vector.chargerFault == faultsToNotification.vector.chargerFault &
          faultsToComposition.vector.interfaceFault == faultsToNotification.vector.interfaceFault &
          faultsToComposition.vector.contextFault == faultsToNotification.vector.contextFault &
          faultsToComposition.vector.sessionConflict == faultsToNotification.vector.sessionConflict &
          faultsToComposition.aggregateFault == faultsToNotification.aggregateFault;
    }*/
  }
  // @trace PART-11
  part def ChargeSessionPriorityStateOwner :> Thread {
    // @trace INT-07
    port requestIn : DataPort { in :>> type : ServiceRequest; }
    // @trace INT-13
    port interfaceIn : DataPort { in :>> type : InterfaceFacts; }
    // @trace INT-23
    port eligibilityIn : DataPort { in :>> type : ChargeEligibility; }
    // @trace INT-28
    port conflictToAggregation : DataPort { out :>> type : Boolean; }
    // @trace INT-29
    port resolutionToNotification : DataPort { out :>> type : SessionResolution; }

    // @trace STATE-03
    language "GUMBO" /*{
      state
        // @trace STATE-03
        sessionState: SourceChargeSession;
      initialize
        modifies sessionState;
        // @trace BEH-07
        guarantee INITIAL_SESSION "The charge session publication initializes Idle without conflict":
          sessionState == SourceChargeSession.Idle &
          not conflictToAggregation &
          resolutionToNotification.sourceSession == SourceChargeSession.Idle &
          resolutionToNotification.newSession.sessionValue == ChargeSession.Idle &
          not resolutionToNotification.sessionConflict &
          resolutionToNotification.winningCase == SessionCase.SESS_13;
      compute
        modifies sessionState;
        // @trace COMP-01
        guarantee SESSION_PUBLICATION "Both consumers receive the one winning session resolution":
          ((sessionState == SourceChargeSession.Idle &
            resolutionToNotification.newSession.sessionValue == ChargeSession.Idle) |
           (sessionState == SourceChargeSession.Eligible &
            resolutionToNotification.newSession.sessionValue == ChargeSession.Eligible) |
           (sessionState == SourceChargeSession.Authorized &
            resolutionToNotification.newSession.sessionValue == ChargeSession.Authorized) |
           (sessionState == SourceChargeSession.Suspended &
            resolutionToNotification.newSession.sessionValue == ChargeSession.Suspended)) &
          resolutionToNotification.sessionConflict ==
            (interfaceIn.activityObserved & In(sessionState) != SourceChargeSession.Authorized) &
          conflictToAggregation == resolutionToNotification.sessionConflict;
        // @trace COMP-01
        guarantee SOURCE_SESSION_MAPPING "The carried source session exactly represents the owner's prior state":
          ((In(sessionState) == SourceChargeSession.Idle &
            resolutionToNotification.sourceSession == SourceChargeSession.Idle) |
           (In(sessionState) == SourceChargeSession.Eligible &
            resolutionToNotification.sourceSession == SourceChargeSession.Eligible) |
           (In(sessionState) == SourceChargeSession.Authorized &
            resolutionToNotification.sourceSession == SourceChargeSession.Authorized) |
           (In(sessionState) == SourceChargeSession.Suspended &
            resolutionToNotification.sourceSession == SourceChargeSession.Suspended));
        compute_cases
          // @trace CASE-SESS-01
          case SESS_01_UNEXPECTED_ACTIVITY "Unexpected activity has highest priority":
            assume interfaceIn.activityObserved & In(sessionState) != SourceChargeSession.Authorized;
            guarantee sessionState == SourceChargeSession.Suspended &
                      resolutionToNotification.winningCase == SessionCase.SESS_01;
          // @trace CASE-SESS-02
          case SESS_02_BLOCKED "Blocked evidence suspends after excluding unexpected activity":
            assume not (interfaceIn.activityObserved & In(sessionState) != SourceChargeSession.Authorized) &
                   eligibilityIn == ChargeEligibility.Blocked;
            guarantee sessionState == SourceChargeSession.Suspended &
                      resolutionToNotification.winningCase == SessionCase.SESS_02;
          // @trace CASE-SESS-03
          case SESS_03_END_TO_ELIGIBLE "Applicable End under Permitted selects Eligible":
            assume not (interfaceIn.activityObserved & In(sessionState) != SourceChargeSession.Authorized) &
                   eligibilityIn == ChargeEligibility.Permitted &
                   (In(sessionState) == SourceChargeSession.Authorized | In(sessionState) == SourceChargeSession.Suspended) &
                   requestIn == ServiceRequest.EndCharge;
            guarantee sessionState == SourceChargeSession.Eligible &
                      resolutionToNotification.winningCase == SessionCase.SESS_03;
          // @trace CASE-SESS-04
          case SESS_04_END_TO_IDLE "Applicable End under NotNeeded selects Idle":
            assume not (interfaceIn.activityObserved & In(sessionState) != SourceChargeSession.Authorized) &
                   eligibilityIn == ChargeEligibility.NotNeeded &
                   (In(sessionState) == SourceChargeSession.Authorized | In(sessionState) == SourceChargeSession.Suspended) &
                   requestIn == ServiceRequest.EndCharge;
            guarantee sessionState == SourceChargeSession.Idle &
                      resolutionToNotification.winningCase == SessionCase.SESS_04;
          // @trace CASE-SESS-05
          case SESS_05_AUTOMATIC_WITHDRAWAL "Authorized and NotNeeded withdraws without an End request":
            assume In(sessionState) == SourceChargeSession.Authorized &
                   eligibilityIn == ChargeEligibility.NotNeeded &
                   requestIn != ServiceRequest.EndCharge;
            guarantee sessionState == SourceChargeSession.Idle &
                      resolutionToNotification.winningCase == SessionCase.SESS_05;
          // @trace CASE-SESS-06
          case SESS_06_RETAIN_AUTHORIZED "Authorized retains under Permitted absent End":
            assume In(sessionState) == SourceChargeSession.Authorized &
                   eligibilityIn == ChargeEligibility.Permitted &
                   requestIn != ServiceRequest.EndCharge;
            guarantee sessionState == SourceChargeSession.Authorized &
                      resolutionToNotification.winningCase == SessionCase.SESS_06;
          // @trace CASE-SESS-07
          case SESS_07_FRESH_SUSPENDED_RECOVERY "Suspended recovers only on a fresh permitted Begin":
            assume not interfaceIn.activityObserved &
                   In(sessionState) == SourceChargeSession.Suspended &
                   eligibilityIn == ChargeEligibility.Permitted &
                   requestIn == ServiceRequest.BeginCharge;
            guarantee sessionState == SourceChargeSession.Authorized &
                      resolutionToNotification.winningCase == SessionCase.SESS_07;
          // @trace CASE-SESS-08
          case SESS_08_RETAIN_SUSPENDED "All remaining nonblocked suspended conditions retain suspension":
            assume not interfaceIn.activityObserved &
                   In(sessionState) == SourceChargeSession.Suspended &
                   eligibilityIn != ChargeEligibility.Blocked &
                   not ((requestIn == ServiceRequest.EndCharge & eligibilityIn == ChargeEligibility.Permitted) |
                        (requestIn == ServiceRequest.EndCharge & eligibilityIn == ChargeEligibility.NotNeeded) |
                        (requestIn == ServiceRequest.BeginCharge & eligibilityIn == ChargeEligibility.Permitted));
            guarantee sessionState == SourceChargeSession.Suspended &
                      resolutionToNotification.winningCase == SessionCase.SESS_08;
          // @trace CASE-SESS-09
          case SESS_09_FRESH_ELIGIBLE_BEGIN "Eligible plus a fresh permitted Begin authorizes":
            assume not interfaceIn.activityObserved &
                   In(sessionState) == SourceChargeSession.Eligible &
                   eligibilityIn == ChargeEligibility.Permitted &
                   requestIn == ServiceRequest.BeginCharge;
            guarantee sessionState == SourceChargeSession.Authorized &
                      resolutionToNotification.winningCase == SessionCase.SESS_09;
          // @trace CASE-SESS-10
          case SESS_10_ELIGIBLE_NOT_NEEDED "Eligible moves to Idle whenever charging is not needed":
            assume not interfaceIn.activityObserved &
                   In(sessionState) == SourceChargeSession.Eligible &
                   eligibilityIn == ChargeEligibility.NotNeeded;
            guarantee sessionState == SourceChargeSession.Idle &
                      resolutionToNotification.winningCase == SessionCase.SESS_10;
          // @trace CASE-SESS-11
          case SESS_11_RETAIN_ELIGIBLE "Eligible retains under Permitted without a fresh Begin":
            assume not interfaceIn.activityObserved &
                   In(sessionState) == SourceChargeSession.Eligible &
                   eligibilityIn == ChargeEligibility.Permitted &
                   requestIn != ServiceRequest.BeginCharge;
            guarantee sessionState == SourceChargeSession.Eligible &
                      resolutionToNotification.winningCase == SessionCase.SESS_11;
          // @trace CASE-SESS-12
          case SESS_12_IDLE_TO_ELIGIBLE "Idle moves to Eligible under Permitted":
            assume not interfaceIn.activityObserved &
                   In(sessionState) == SourceChargeSession.Idle &
                   eligibilityIn == ChargeEligibility.Permitted;
            guarantee sessionState == SourceChargeSession.Eligible &
                      resolutionToNotification.winningCase == SessionCase.SESS_12;
          // @trace CASE-SESS-13
          case SESS_13_RETAIN_IDLE "Idle retains under NotNeeded":
            assume not interfaceIn.activityObserved &
                   In(sessionState) == SourceChargeSession.Idle &
                   eligibilityIn == ChargeEligibility.NotNeeded;
            guarantee sessionState == SourceChargeSession.Idle &
                      resolutionToNotification.winningCase == SessionCase.SESS_13;
    }*/
  }
  // @trace PART-12
  part def NotificationCompositionOwner :> Thread {
    // @trace INT-24
    port attentionIn : DataPort { in :>> type : AttentionResolution; }
    // @trace INT-26
    port faultsIn : DataPort { in :>> type : FaultFacts; }
    // @trace INT-29
    port sessionIn : DataPort { in :>> type : SessionResolution; }
    // @trace INT-32
    port pilotNoticeOut : DataPort { out :>> type : PilotNotice; }
    // @trace INT-33
    port flightControlNoticeOut : DataPort { out :>> type : FlightControlNotice; }

    // @trace POL-NOTICE-01
    language "GUMBO" /*{
      initialize
        // @trace BEH-07
        guarantee INITIAL_NOTICES "Untrusted initialization is visible to both audiences":
          pilotNoticeOut == PilotNotice.EvidenceUntrusted &
          flightControlNoticeOut == FlightControlNotice.EvidenceUntrusted;
      compute
        // @trace POL-NOTICE-01
        guarantee PILOT_EVIDENCE_UNTRUSTED "Battery fault has highest pilot priority":
          '->:'(faultsIn.vector.batteryFault,
                pilotNoticeOut == PilotNotice.EvidenceUntrusted);
        // @trace POL-NOTICE-01
        guarantee PILOT_CRITICAL "Critical attention follows after excluding battery fault":
          '->:'(not faultsIn.vector.batteryFault & attentionIn.cause == AttentionCause.Critical,
                pilotNoticeOut == PilotNotice.Critical);
        // @trace POL-NOTICE-01
        guarantee PILOT_LOW "Low attention follows after excluding battery fault and Critical":
          '->:'(not faultsIn.vector.batteryFault & attentionIn.cause == AttentionCause.Low,
                pilotNoticeOut == PilotNotice.Low);
        // @trace POL-NOTICE-01
        guarantee PILOT_CHARGE_ATTENTION "Other aggregate faults or suspension create pilot charge attention":
          '->:'(not faultsIn.vector.batteryFault &
                attentionIn.cause != AttentionCause.Critical &
                attentionIn.cause != AttentionCause.Low &
                (faultsIn.aggregateFault | sessionIn.newSession.sessionValue == ChargeSession.Suspended),
                pilotNoticeOut == PilotNotice.ChargeAttention);
        // @trace POL-NOTICE-01
        guarantee PILOT_RECOVERY_PENDING "Retained battery attention is visible after higher priorities":
          '->:'(not faultsIn.vector.batteryFault &
                attentionIn.cause != AttentionCause.Critical &
                attentionIn.cause != AttentionCause.Low &
                not faultsIn.aggregateFault &
                sessionIn.newSession.sessionValue != ChargeSession.Suspended &
                attentionIn.newAttention == AttentionState.Attention,
                pilotNoticeOut == PilotNotice.RecoveryPending);
        // @trace POL-NOTICE-01
        guarantee PILOT_CLEAR "Every remaining pilot partition is Clear":
          '->:'(not faultsIn.vector.batteryFault &
                attentionIn.cause != AttentionCause.Critical &
                attentionIn.cause != AttentionCause.Low &
                not faultsIn.aggregateFault &
                sessionIn.newSession.sessionValue != ChargeSession.Suspended &
                attentionIn.newAttention == AttentionState.Clear,
                pilotNoticeOut == PilotNotice.Clear);
        // @trace POL-NOTICE-01
        guarantee FLIGHT_EVIDENCE_UNTRUSTED "Battery fault has highest flight-control priority":
          '->:'(faultsIn.vector.batteryFault,
                flightControlNoticeOut == FlightControlNotice.EvidenceUntrusted);
        // @trace POL-NOTICE-01
        guarantee FLIGHT_CRITICAL "Critical battery attention is sent to flight control":
          '->:'(not faultsIn.vector.batteryFault & attentionIn.cause == AttentionCause.Critical,
                flightControlNoticeOut == FlightControlNotice.Critical);
        // @trace POL-NOTICE-01
        guarantee FLIGHT_LOW "Low battery attention is sent to flight control":
          '->:'(not faultsIn.vector.batteryFault & attentionIn.cause == AttentionCause.Low,
                flightControlNoticeOut == FlightControlNotice.Low);
        // @trace POL-NOTICE-01
        guarantee FLIGHT_RECOVERY_PENDING "Retained battery attention is sent after higher battery priorities":
          '->:'(not faultsIn.vector.batteryFault &
                attentionIn.cause != AttentionCause.Critical &
                attentionIn.cause != AttentionCause.Low &
                attentionIn.newAttention == AttentionState.Attention,
                flightControlNoticeOut == FlightControlNotice.RecoveryPending);
        // @trace POL-NOTICE-01
        guarantee FLIGHT_CLEAR "Every remaining flight-control partition is Clear":
          '->:'(not faultsIn.vector.batteryFault &
                attentionIn.cause != AttentionCause.Critical &
                attentionIn.cause != AttentionCause.Low &
                attentionIn.newAttention == AttentionState.Clear,
                flightControlNoticeOut == FlightControlNotice.Clear);
    }*/
  }
  // @trace PART-13
  part def AuthorizationStatusCompositionOwner :> Thread {
    // @trace INT-08
    port publicFactsIn : DataPort { in :>> type : PublicDecisionFacts; }
    // @trace INT-27
    port faultsIn : DataPort { in :>> type : FaultFacts; }
    // @trace INT-34
    port pilotStatusOut : DataPort { out :>> type : PilotStatus; }
    // @trace INT-35
    port chargeAuthorizationOut : DataPort { out :>> type : ChargeAuthorization; }

    // @trace POL-AUTH-01
    language "GUMBO" /*{
      initialize
        // @trace BEH-07
        guarantee INITIAL_PUBLIC_OUTCOMES "Public outcomes initialize denied, unknown, idle, and conservatively faulted":
          chargeAuthorizationOut == ChargeAuthorization.Denied &
          pilotStatusOut.statusAdvisory.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN &
          pilotStatusOut.statusSession.sessionValue == ChargeSession.Idle &
          pilotStatusOut.statusRequestResult.requestResultValue == RequestResult.None &
          pilotStatusOut.faults.batteryFault &
          pilotStatusOut.faults.chargerFault &
          pilotStatusOut.faults.interfaceFault &
          pilotStatusOut.faults.contextFault &
          not pilotStatusOut.faults.sessionConflict &
          pilotStatusOut.aggregateFault;
      compute
        // @trace COMP-01
        guarantee STATUS_PRESERVES_OWNER_FACTS "Status preserves PART-01 and PART-10 values without recomputation":
          pilotStatusOut.statusAdvisory.advisoryValue == publicFactsIn.advisory.advisoryValue &
          pilotStatusOut.statusSession.sessionValue == publicFactsIn.newSession.sessionValue &
          pilotStatusOut.statusRequestResult.requestResultValue == publicFactsIn.requestResult.requestResultValue &
          pilotStatusOut.faults.batteryFault == faultsIn.vector.batteryFault &
          pilotStatusOut.faults.chargerFault == faultsIn.vector.chargerFault &
          pilotStatusOut.faults.interfaceFault == faultsIn.vector.interfaceFault &
          pilotStatusOut.faults.contextFault == faultsIn.vector.contextFault &
          pilotStatusOut.faults.sessionConflict == faultsIn.vector.sessionConflict &
          pilotStatusOut.aggregateFault == faultsIn.aggregateFault;
        compute_cases
          // @trace POL-AUTH-01
          case AUTHORIZATION_PERMITTED "Only an Authorized post-session without aggregate fault is permitted":
            assume publicFactsIn.newSession.sessionValue == ChargeSession.Authorized & not faultsIn.aggregateFault;
            guarantee chargeAuthorizationOut == ChargeAuthorization.Permitted;
          // @trace POL-AUTH-01
          case AUTHORIZATION_DENIED "Every other session and fault combination is denied":
            assume publicFactsIn.newSession.sessionValue != ChargeSession.Authorized | faultsIn.aggregateFault;
            guarantee chargeAuthorizationOut == ChargeAuthorization.Denied;
    }*/
  }

  // @generated-support Behavior-free containment and routing only.
  part def ChargeQualificationProcess :> Process {
    // @generated-support Transparent MON-01 containment endpoint.
    port serviceRequest : DataPort { in :>> type : ServiceRequest; }
    // @generated-support Transparent MON-02 containment endpoint.
    port batteryReport : DataPort { in :>> type : BatteryReportValue; }
    // @generated-support Transparent MON-03 containment endpoint.
    port chargerReport : DataPort { in :>> type : ChargerReport; }
    // @generated-support Transparent MON-04 containment endpoint.
    port chargeInterfaceReport : DataPort { in :>> type : ChargeInterfaceReport; }
    // @generated-support Transparent MON-05 containment endpoint.
    port lifecycleReport : DataPort { in :>> type : LifecycleReportValue; }
    // @generated-support Transparent CTRL-01 containment endpoint.
    port chargeAuthorization : DataPort { out :>> type : ChargeAuthorization; }
    // @generated-support Transparent CTRL-02 containment endpoint.
    port pilotNotice : DataPort { out :>> type : PilotNotice; }
    // @generated-support Transparent CTRL-03 containment endpoint.
    port flightControlNotice : DataPort { out :>> type : FlightControlNotice; }
    // @generated-support Transparent CTRL-04 containment endpoint.
    port pilotStatus : DataPort { out :>> type : PilotStatus; }

    // @trace PART-01
    part currentRequestResultDecisionOwner : CurrentRequestResultDecisionOwner;
    // @trace PART-02
    part batteryEvidenceQualifier : BatteryEvidenceQualifier;
    // @trace PART-03
    part chargerEvidenceQualifier : ChargerEvidenceQualifier;
    // @trace PART-04
    part chargingInterfaceEvidenceQualifier : ChargingInterfaceEvidenceQualifier;
    // @trace PART-05
    part lifecycleContextApplicabilityOwner : LifecycleContextApplicabilityOwner;
    // @trace PART-06
    part batteryConfidenceStateOwner : BatteryConfidenceStateOwner;
    // @trace PART-07
    part chargeEligibilityDecisionOwner : ChargeEligibilityDecisionOwner;
    // @trace PART-08
    part attentionLatchStateOwner : AttentionLatchStateOwner;
    // @trace PART-09
    part batteryAdvisoryDecisionOwner : BatteryAdvisoryDecisionOwner;
    // @trace PART-10
    part faultAggregationOwner : FaultAggregationOwner;
    // @trace PART-11
    part chargeSessionPriorityStateOwner : ChargeSessionPriorityStateOwner;
    // @trace PART-12
    part notificationCompositionOwner : NotificationCompositionOwner;
    // @trace PART-13
    part authorizationStatusCompositionOwner : AuthorizationStatusCompositionOwner;

    // Exactly 35 approved semantic interactions.
    // @trace INT-01
    connection int01 : PortConnection connect serviceRequest to currentRequestResultDecisionOwner.requestIn;
    // @trace INT-02
    connection int02 : PortConnection connect batteryReport to batteryEvidenceQualifier.reportIn;
    // @trace INT-03
    connection int03 : PortConnection connect chargerReport to chargerEvidenceQualifier.reportIn;
    // @trace INT-04
    connection int04 : PortConnection connect chargeInterfaceReport to chargingInterfaceEvidenceQualifier.reportIn;
    // @trace INT-05
    connection int05 : PortConnection connect lifecycleReport to lifecycleContextApplicabilityOwner.reportIn;
    // @trace INT-06
    connection int06 : PortConnection connect serviceRequest to attentionLatchStateOwner.requestIn;
    // @trace INT-07
    connection int07 : PortConnection connect serviceRequest to chargeSessionPriorityStateOwner.requestIn;
    // @trace INT-08
    connection int08 : PortConnection connect currentRequestResultDecisionOwner.publicFactsOut to authorizationStatusCompositionOwner.publicFactsIn;
    // @trace INT-09
    connection int09 : PortConnection connect batteryEvidenceQualifier.qualificationOut to batteryConfidenceStateOwner.qualificationIn;
    // @trace INT-10
    connection int10 : PortConnection connect chargerEvidenceQualifier.factsToEligibility to chargeEligibilityDecisionOwner.chargerIn;
    // @trace INT-11
    connection int11 : PortConnection connect chargerEvidenceQualifier.faultToAggregation to faultAggregationOwner.chargerFaultIn;
    // @trace INT-12
    connection int12 : PortConnection connect chargingInterfaceEvidenceQualifier.factsToEligibility to chargeEligibilityDecisionOwner.interfaceIn;
    // @trace INT-13
    connection int13 : PortConnection connect chargingInterfaceEvidenceQualifier.factsToSession to chargeSessionPriorityStateOwner.interfaceIn;
    // @trace INT-14
    connection int14 : PortConnection connect chargingInterfaceEvidenceQualifier.faultToAggregation to faultAggregationOwner.interfaceFaultIn;
    // @trace INT-15
    connection int15 : PortConnection connect lifecycleContextApplicabilityOwner.factsToEligibility to chargeEligibilityDecisionOwner.lifecycleIn;
    // @trace INT-16
    connection int16 : PortConnection connect lifecycleContextApplicabilityOwner.factsToAdvisory to batteryAdvisoryDecisionOwner.lifecycleIn;
    // @trace INT-17
    connection int17 : PortConnection connect lifecycleContextApplicabilityOwner.faultToAggregation to faultAggregationOwner.contextFaultIn;
    // @trace INT-18
    connection int18 : PortConnection connect batteryConfidenceStateOwner.stateToEligibility to chargeEligibilityDecisionOwner.batteryIn;
    // @trace INT-19
    connection int19 : PortConnection connect batteryConfidenceStateOwner.stateToAttention to attentionLatchStateOwner.batteryIn;
    // @trace INT-20
    connection int20 : PortConnection connect batteryConfidenceStateOwner.stateToAdvisory to batteryAdvisoryDecisionOwner.batteryIn;
    // @trace INT-21
    connection int21 : PortConnection connect batteryConfidenceStateOwner.faultToAggregation to faultAggregationOwner.batteryFaultIn;
    // @trace INT-22
    connection int22 : PortConnection connect chargeEligibilityDecisionOwner.eligibilityToAdvisory to batteryAdvisoryDecisionOwner.eligibilityIn;
    // @trace INT-23
    connection int23 : PortConnection connect chargeEligibilityDecisionOwner.eligibilityToSession to chargeSessionPriorityStateOwner.eligibilityIn;
    // @trace INT-24
    connection int24 : PortConnection connect attentionLatchStateOwner.resolutionToNotification to notificationCompositionOwner.attentionIn;
    // @trace INT-25
    connection int25 : PortConnection connect batteryAdvisoryDecisionOwner.advisoryToRequestResult to currentRequestResultDecisionOwner.advisoryIn;
    // @trace INT-26
    connection int26 : PortConnection connect faultAggregationOwner.faultsToNotification to notificationCompositionOwner.faultsIn;
    // @trace INT-27
    connection int27 : PortConnection connect faultAggregationOwner.faultsToComposition to authorizationStatusCompositionOwner.faultsIn;
    // @trace INT-28
    connection int28 : PortConnection connect chargeSessionPriorityStateOwner.conflictToAggregation to faultAggregationOwner.sessionConflictIn;
    // @trace INT-29
    connection int29 : PortConnection connect chargeSessionPriorityStateOwner.resolutionToNotification to notificationCompositionOwner.sessionIn;
    // @trace INT-30
    connection int30 : PortConnection connect chargeSessionPriorityStateOwner.resolutionToNotification to currentRequestResultDecisionOwner.sessionIn;
    // @trace INT-31
    connection int31 : PortConnection connect attentionLatchStateOwner.clearedToRequestResult to currentRequestResultDecisionOwner.attentionClearedIn;
    // @trace INT-32
    connection int32 : PortConnection connect notificationCompositionOwner.pilotNoticeOut to pilotNotice;
    // @trace INT-33
    connection int33 : PortConnection connect notificationCompositionOwner.flightControlNoticeOut to flightControlNotice;
    // @trace INT-34
    connection int34 : PortConnection connect authorizationStatusCompositionOwner.pilotStatusOut to pilotStatus;
    // @trace INT-35
    connection int35 : PortConnection connect authorizationStatusCompositionOwner.chargeAuthorizationOut to chargeAuthorization;
  }

  // @trace BOUND-01
  part def DroneBatteryChargeQualificationSystem :> System {
    // @trace MON-01
    port serviceRequest : DataPort { in :>> type : ServiceRequest; }
    // @trace MON-02
    port batteryReport : DataPort { in :>> type : BatteryReportValue; }
    // @trace MON-03
    port chargerReport : DataPort { in :>> type : ChargerReport; }
    // @trace MON-04
    port chargeInterfaceReport : DataPort { in :>> type : ChargeInterfaceReport; }
    // @trace MON-05
    port lifecycleReport : DataPort { in :>> type : LifecycleReportValue; }
    // @trace CTRL-01
    port chargeAuthorization : DataPort { out :>> type : ChargeAuthorization; }
    // @trace CTRL-02
    port pilotNotice : DataPort { out :>> type : PilotNotice; }
    // @trace CTRL-03
    port flightControlNotice : DataPort { out :>> type : FlightControlNotice; }
    // @trace CTRL-04
    port pilotStatus : DataPort { out :>> type : PilotStatus; }

    // @generated-support Sole behavior-free Process usage.
    part chargeQualificationProcess : ChargeQualificationProcess;
    // Exactly nine transparent boundary delegations.
    // @generated-support root-to-Process service request.
    connection support01 : PortConnection connect serviceRequest to chargeQualificationProcess.serviceRequest;
    // @generated-support root-to-Process battery report.
    connection support02 : PortConnection connect batteryReport to chargeQualificationProcess.batteryReport;
    // @generated-support root-to-Process charger report.
    connection support03 : PortConnection connect chargerReport to chargeQualificationProcess.chargerReport;
    // @generated-support root-to-Process interface report.
    connection support04 : PortConnection connect chargeInterfaceReport to chargeQualificationProcess.chargeInterfaceReport;
    // @generated-support root-to-Process lifecycle report.
    connection support05 : PortConnection connect lifecycleReport to chargeQualificationProcess.lifecycleReport;
    // @generated-support Process-to-root authorization.
    connection support06 : PortConnection connect chargeQualificationProcess.chargeAuthorization to chargeAuthorization;
    // @generated-support Process-to-root pilot notice.
    connection support07 : PortConnection connect chargeQualificationProcess.pilotNotice to pilotNotice;
    // @generated-support Process-to-root flight-control notice.
    connection support08 : PortConnection connect chargeQualificationProcess.flightControlNotice to flightControlNotice;
    // @generated-support Process-to-root pilot status.
    connection support09 : PortConnection connect chargeQualificationProcess.pilotStatus to pilotStatus;
  }

  // @trace BOUND-01
  part droneBatteryChargeQualificationSupervisor : DroneBatteryChargeQualificationSystem;
}
