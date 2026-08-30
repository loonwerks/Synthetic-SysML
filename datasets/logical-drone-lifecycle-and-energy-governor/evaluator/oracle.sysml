// Canonical final checkpoint: approved architecture plus owner-local GUMBO.
// Bounded analysis mirrors these relations without extending the claim boundary.

// @trace SCOPE-01
package Drone_Lifecycle_Energy_Governor {
  private import HAMR::*;

  // @trace MON-01
  enum def LifecycleRequest {
    enum NONE; enum SWITCH_ON; enum SWITCH_OFF; enum START_CHARGE;
    enum STOP_CHARGE; enum ACTIVATE; enum DEACTIVATE; enum LAUNCH;
    enum RETURN; enum LAND;
  }
  // @trace PART-01
  enum def RequestFamily {
    enum ABSENT; enum POWER; enum CHARGE; enum READINESS; enum AIRBORNE;
  }
  // @trace INT-10
  enum def ExactRequestCode {
    enum NONE; enum SWITCH_ON; enum SWITCH_OFF; enum START_CHARGE;
    enum STOP_CHARGE; enum ACTIVATE; enum DEACTIVATE; enum LAUNCH;
    enum RETURN; enum LAND;
  }
  // @trace MON-02
  enum def BatteryBand { enum FULL; enum MEDIUM; enum LOW; enum CRITICAL; }
  // @trace ASM-03
  enum def EvidenceValidity { enum VALID; enum INVALID; }
  // @trace MON-03
  enum def ChargerReport {
    enum DISCONNECTED; enum CONNECTED_HEALTHY; enum CONNECTED_FAULTED;
  }
  // @trace MON-04
  enum def NavigationReport { enum USABLE; enum UNUSABLE; }
  // @trace MON-05
  enum def FlightControlReport { enum AVAILABLE; enum FAULTED; }
  // @trace MON-06
  enum def HomeValue { enum AWAY; enum REACHED; }
  // @trace MON-07
  enum def TouchdownValue { enum NOT_CONFIRMED; enum CONFIRMED; }
  // @trace PART-08
  enum def BatteryConfidence { enum UNTRUSTED; enum CONFIRMING; enum TRUSTED; }
  // @trace CTRL-01
  enum def LifecyclePhase {
    enum OFF; enum STANDBY; enum CHARGING; enum READY;
    enum FLYING; enum RETURNING; enum LANDING;
  }
  // @trace PART-12
  enum def SourceLifecyclePhase {
    enum OFF; enum STANDBY; enum CHARGING; enum READY;
    enum FLYING; enum RETURNING; enum LANDING;
  }
  // @trace CTRL-01
  enum def PublishedPhase {
    enum OFF; enum STANDBY; enum CHARGING; enum READY;
    enum FLYING; enum RETURNING; enum LANDING;
  }
  // @trace PART-10
  enum def AirborneRequestProposal {
    enum NO_AIRBORNE_REQUEST; enum RETURN_REQUESTED; enum LAND_REQUESTED;
  }
  // @trace CASE-AUDIT-01
  enum def LifecycleCase {
    enum L01; enum L02; enum L03; enum L04; enum L05; enum L06; enum L07;
    enum L08; enum L09; enum L10; enum L11; enum L12; enum L13; enum L14;
    enum L15; enum L16; enum L17; enum L18; enum L19; enum L20; enum L21;
    enum L22; enum L23; enum L24; enum L25; enum L26;
  }
  // @trace CTRL-02
  enum def RequestResult { enum NONE; enum ACCEPTED; enum REJECTED; enum PREEMPTED; }
  // @trace CTRL-03
  enum def BatteryNotice { enum UNTRUSTED; enum CLEAR; enum LOW; enum CRITICAL; }
  // @trace CTRL-05
  enum def ChargePermission { enum DENIED; enum PERMITTED; }
  // @trace CTRL-06
  enum def FlightIntent { enum HOLD; enum LAUNCH; enum CONTINUE; enum RETURN; enum LAND; }
  // @trace CTRL-07
  enum def LaunchPermission { enum DENIED; enum PERMITTED; }
  // @trace CTRL-08
  enum def PropulsionPermission { enum DISABLED; enum ENABLED; }

  // Every record member inspected by GUMBO is an attribute, never a nested part.
  // @trace MON-02
  part def BatteryReportValue :> Data {
    // @trace MON-02
    attribute band : BatteryBand;
    // @trace MON-02
    attribute validity : EvidenceValidity;
  }
  // @trace MON-06
  part def HomeReportValue :> Data {
    // @trace MON-06
    attribute homeValue : HomeValue;
    // @trace MON-06
    attribute validity : EvidenceValidity;
  }
  // @trace MON-07
  part def TouchdownReportValue :> Data {
    // @trace MON-07
    attribute touchdownValue : TouchdownValue;
    // @trace MON-07
    attribute validity : EvidenceValidity;
  }
  // @trace PART-01
  part def AirborneClassifiedRequest :> Data {
    // @trace MON-01
    attribute intentCode : ExactRequestCode;
    // @trace PART-01
    attribute requestFamily : RequestFamily;
  }
  // @trace PART-01
  part def LifecycleClassifiedRequest :> Data {
    // @trace MON-01
    attribute intentCode : ExactRequestCode;
    // @trace PART-01
    attribute requestFamily : RequestFamily;
  }
  // @trace PART-02
  part def BatteryEvidence :> Data {
    // @trace MON-02
    attribute band : BatteryBand;
    // @trace PART-02
    attribute validBand : Base_Types::Boolean;
  }
  // @trace PART-03
  part def ChargerFacts :> Data {
    // @trace PART-03
    attribute connected : Base_Types::Boolean;
    // @trace PART-03
    attribute healthyConnected : Base_Types::Boolean;
    // @trace PART-03
    attribute chargerFault : Base_Types::Boolean;
  }
  // @trace PART-04
  part def ChargeEligibility :> Data {
    // @trace PART-04
    attribute entryEligible : Base_Types::Boolean;
    // @trace PART-04
    attribute retentionEligible : Base_Types::Boolean;
    // @trace PART-04
    attribute exitRequired : Base_Types::Boolean;
  }
  // @trace PART-06
  part def HomeFacts :> Data {
    // @trace PART-06
    attribute arrivalEstablished : Base_Types::Boolean;
    // @trace PART-06
    attribute evidenceValid : Base_Types::Boolean;
    // @trace FAULT-03
    attribute homeFault : Base_Types::Boolean;
  }
  // @trace PART-07
  part def TouchdownFacts :> Data {
    // @trace PART-07
    attribute touchdownEstablished : Base_Types::Boolean;
    // @trace PART-07
    attribute evidenceValid : Base_Types::Boolean;
    // @trace FAULT-03
    attribute touchdownFault : Base_Types::Boolean;
  }
  // @trace PART-08
  part def BatteryStateFacts :> Data {
    // @trace MON-02
    attribute band : BatteryBand;
    // @trace PART-08
    attribute confidence : BatteryConfidence;
    // @trace POL-01
    attribute usable : Base_Types::Boolean;
  }
  // @trace PART-09
  part def HazardProposal :> Data {
    // @trace CASE-L-01
    attribute emergencyLand : Base_Types::Boolean;
    // @trace CASE-L-03
    attribute forcedReturn : Base_Types::Boolean;
    // @trace CASE-L-09
    attribute batteryUnusable : Base_Types::Boolean;
    // @trace CASE-L-10
    attribute lowOrCritical : Base_Types::Boolean;
    // @trace CASE-L-02
    attribute navigationUnusable : Base_Types::Boolean;
  }
  // @trace PART-11
  part def FaultVector :> Data {
    // @trace FAULT-01
    attribute batteryFault : Base_Types::Boolean;
    // @trace FAULT-04
    attribute chargerFault : Base_Types::Boolean;
    // @trace FAULT-02
    attribute navigationFault : Base_Types::Boolean;
    // @trace FAULT-01
    attribute flightControlFault : Base_Types::Boolean;
    // @trace FAULT-03
    attribute homeFault : Base_Types::Boolean;
    // @trace FAULT-03
    attribute touchdownFault : Base_Types::Boolean;
    // @trace FAULT-05
    attribute aggregateFault : Base_Types::Boolean;
  }
  // @trace PART-12
  part def LifecycleResolution :> Data {
    // @trace CASE-AUDIT-01
    attribute winningCase : LifecycleCase;
    // @trace PART-12
    attribute sourceLifecycleState : SourceLifecyclePhase;
    // @trace PART-12
    attribute nextPhase : LifecyclePhase;
    // @trace BEH-05
    attribute requestPresent : Base_Types::Boolean;
    // @trace BEH-05
    attribute requestApplicable : Base_Types::Boolean;
    // @trace BEH-05
    attribute requestCausedTransition : Base_Types::Boolean;
    // @trace BEH-05
    attribute requestDefeatedByPriority : Base_Types::Boolean;
    // @trace BEH-03
    attribute chargeRetentionEligible : Base_Types::Boolean;
    // @trace BEH-03
    attribute launchReady : Base_Types::Boolean;
  }
  // @trace CTRL-04
  part def PilotStatus :> Data {
    // @trace CTRL-01
    attribute phase : PublishedPhase;
    // @trace CTRL-02
    attribute requestResult : RequestResult;
    // @trace CTRL-03
    attribute batteryNotice : BatteryNotice;
    // @trace CTRL-04
    attribute batteryFault : Base_Types::Boolean;
    // @trace CTRL-04
    attribute chargerFault : Base_Types::Boolean;
    // @trace CTRL-04
    attribute navigationFault : Base_Types::Boolean;
    // @trace CTRL-04
    attribute flightControlFault : Base_Types::Boolean;
    // @trace CTRL-04
    attribute homeFault : Base_Types::Boolean;
    // @trace CTRL-04
    attribute touchdownFault : Base_Types::Boolean;
    // @trace CTRL-04
    attribute aggregateFault : Base_Types::Boolean;
  }
  // @trace CTRL-06
  part def FlightControlOutputs :> Data {
    // @trace CTRL-06
    attribute intent : FlightIntent;
    // @trace CTRL-07
    attribute launchPermission : LaunchPermission;
  }

  // @trace PART-01
  part def RequestApplicabilityOwner :> Thread {
    // @trace INT-01
    port requestIn : DataPort { in :>> type : LifecycleRequest; }
    // @trace INT-09
    port semanticsToAirborne : DataPort { out :>> type : AirborneClassifiedRequest; }
    // @trace INT-10
    port semanticsToLifecycle : DataPort { out :>> type : LifecycleClassifiedRequest; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-06
        guarantee INITIAL_REQUEST_ABSENT:
          semanticsToAirborne.intentCode == ExactRequestCode.NONE &
          semanticsToAirborne.requestFamily == RequestFamily.ABSENT &
          semanticsToLifecycle.intentCode == ExactRequestCode.NONE &
          semanticsToLifecycle.requestFamily == RequestFamily.ABSENT;
      compute
        // @trace PART-01
        guarantee REQUEST_FAMILY_CLASSIFICATION:
          semanticsToAirborne.intentCode == semanticsToLifecycle.intentCode &
          semanticsToAirborne.requestFamily == semanticsToLifecycle.requestFamily &
          ((requestIn == LifecycleRequest.NONE &
            semanticsToLifecycle.intentCode == ExactRequestCode.NONE &
            semanticsToLifecycle.requestFamily == RequestFamily.ABSENT) |
           (requestIn == LifecycleRequest.SWITCH_ON &
            semanticsToLifecycle.intentCode == ExactRequestCode.SWITCH_ON &
            semanticsToLifecycle.requestFamily == RequestFamily.POWER) |
           (requestIn == LifecycleRequest.SWITCH_OFF &
            semanticsToLifecycle.intentCode == ExactRequestCode.SWITCH_OFF &
            semanticsToLifecycle.requestFamily == RequestFamily.POWER) |
           (requestIn == LifecycleRequest.START_CHARGE &
            semanticsToLifecycle.intentCode == ExactRequestCode.START_CHARGE &
            semanticsToLifecycle.requestFamily == RequestFamily.CHARGE) |
           (requestIn == LifecycleRequest.STOP_CHARGE &
            semanticsToLifecycle.intentCode == ExactRequestCode.STOP_CHARGE &
            semanticsToLifecycle.requestFamily == RequestFamily.CHARGE) |
           (requestIn == LifecycleRequest.ACTIVATE &
            semanticsToLifecycle.intentCode == ExactRequestCode.ACTIVATE &
            semanticsToLifecycle.requestFamily == RequestFamily.READINESS) |
           (requestIn == LifecycleRequest.DEACTIVATE &
            semanticsToLifecycle.intentCode == ExactRequestCode.DEACTIVATE &
            semanticsToLifecycle.requestFamily == RequestFamily.READINESS) |
           (requestIn == LifecycleRequest.LAUNCH &
            semanticsToLifecycle.intentCode == ExactRequestCode.LAUNCH &
            semanticsToLifecycle.requestFamily == RequestFamily.READINESS) |
           (requestIn == LifecycleRequest.RETURN &
            semanticsToLifecycle.intentCode == ExactRequestCode.RETURN &
            semanticsToLifecycle.requestFamily == RequestFamily.AIRBORNE) |
           (requestIn == LifecycleRequest.LAND &
            semanticsToLifecycle.intentCode == ExactRequestCode.LAND &
            semanticsToLifecycle.requestFamily == RequestFamily.AIRBORNE));
    }*/
  }
  // @trace PART-02
  part def BatteryEvidenceQualifier :> Thread {
    // @trace INT-02
    port reportIn : DataPort { in :>> type : BatteryReportValue; }
    // @trace INT-11
    port evidenceOut : DataPort { out :>> type : BatteryEvidence; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-05
        guarantee INITIAL_BATTERY_EVIDENCE_UNTRUSTED:
          evidenceOut.band == BatteryBand.CRITICAL & evidenceOut.validBand == F;
      compute
        // @trace PART-02
        guarantee VALID_BAND_SUPPRESSION:
          evidenceOut.band == reportIn.band &
          (evidenceOut.validBand == (reportIn.validity == EvidenceValidity.VALID));
    }*/
  }
  // @trace PART-03
  part def ChargerEvidenceQualifier :> Thread {
    // @trace INT-03
    port reportIn : DataPort { in :>> type : ChargerReport; }
    // @trace INT-16
    port factsToCharge : DataPort { out :>> type : ChargerFacts; }
    // @trace INT-17
    port faultToAggregation : DataPort { out :>> type : Base_Types::Boolean; }

    language "GUMBO" /*{
      initialize
        // @trace FAULT-04
        guarantee INITIAL_CHARGER_FACTS_SAFE:
          factsToCharge.connected == F &
          factsToCharge.healthyConnected == F &
          factsToCharge.chargerFault == F & faultToAggregation == F;
      compute
        // @trace PART-03
        guarantee CHARGER_POLICY_CLASSIFICATION:
          (factsToCharge.connected == (reportIn != ChargerReport.DISCONNECTED)) &
          (factsToCharge.healthyConnected == (reportIn == ChargerReport.CONNECTED_HEALTHY)) &
          (factsToCharge.chargerFault == (reportIn == ChargerReport.CONNECTED_FAULTED)) &
          faultToAggregation == factsToCharge.chargerFault;
    }*/
  }
  // @trace PART-04
  part def ChargeEligibilityOwner :> Thread {
    // @trace INT-12
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    // @trace INT-16
    port chargerIn : DataPort { in :>> type : ChargerFacts; }
    // @trace INT-22
    port eligibilityOut : DataPort { out :>> type : ChargeEligibility; }

    language "GUMBO" /*{
      initialize
        // @trace FAULT-04
        guarantee INITIAL_CHARGE_DENIED:
          eligibilityOut.entryEligible == F &
          eligibilityOut.retentionEligible == F &
          eligibilityOut.exitRequired == T;
      compute
        // @trace PART-04
        guarantee CHARGE_ELIGIBILITY_COMBINATION:
          (eligibilityOut.entryEligible ==
            (batteryIn.usable & batteryIn.band != BatteryBand.FULL & chargerIn.healthyConnected)) &
          (eligibilityOut.retentionEligible ==
            (batteryIn.usable & batteryIn.band != BatteryBand.FULL & chargerIn.healthyConnected)) &
          (eligibilityOut.exitRequired ==
            not (batteryIn.usable & batteryIn.band != BatteryBand.FULL & chargerIn.healthyConnected));
    }*/
  }
  // @trace PART-05
  part def FlightReadinessOwner :> Thread {
    // @trace INT-04
    port navigationIn : DataPort { in :>> type : NavigationReport; }
    // @trace INT-05
    port flightControlIn : DataPort { in :>> type : FlightControlReport; }
    // @trace INT-13
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    // @trace INT-23
    port readinessOut : DataPort { out :>> type : Base_Types::Boolean; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-05
        guarantee INITIAL_FLIGHT_NOT_READY: readinessOut == F;
      compute
        // @trace PART-05
        guarantee COMBINED_FLIGHT_READINESS:
          (readinessOut ==
            (batteryIn.usable &
             (batteryIn.band == BatteryBand.MEDIUM | batteryIn.band == BatteryBand.FULL) &
             navigationIn == NavigationReport.USABLE &
             flightControlIn == FlightControlReport.AVAILABLE));
    }*/
  }
  // @trace PART-06
  part def HomeEvidenceQualifier :> Thread {
    // @trace INT-06
    port reportIn : DataPort { in :>> type : HomeReportValue; }
    // @trace INT-24
    port factsToLifecycle : DataPort { out :>> type : HomeFacts; }
    // @trace INT-25
    port faultToAggregation : DataPort { out :>> type : Base_Types::Boolean; }

    language "GUMBO" /*{
      initialize
        // @trace FAULT-03
        guarantee INITIAL_HOME_NOT_ESTABLISHED:
          factsToLifecycle.arrivalEstablished == F &
          factsToLifecycle.evidenceValid == F &
          factsToLifecycle.homeFault == T & faultToAggregation == T;
      compute
        // @trace PART-06
        guarantee QUALIFIED_HOME_COMPLETION:
          (factsToLifecycle.arrivalEstablished ==
            (reportIn.validity == EvidenceValidity.VALID & reportIn.homeValue == HomeValue.REACHED)) &
          (factsToLifecycle.evidenceValid == (reportIn.validity == EvidenceValidity.VALID)) &
          (factsToLifecycle.homeFault == (reportIn.validity == EvidenceValidity.INVALID)) &
          faultToAggregation == factsToLifecycle.homeFault;
    }*/
  }
  // @trace PART-07
  part def TouchdownEvidenceQualifier :> Thread {
    // @trace INT-07
    port reportIn : DataPort { in :>> type : TouchdownReportValue; }
    // @trace INT-26
    port factsToLifecycle : DataPort { out :>> type : TouchdownFacts; }
    // @trace INT-27
    port faultToAggregation : DataPort { out :>> type : Base_Types::Boolean; }

    language "GUMBO" /*{
      initialize
        // @trace FAULT-03
        guarantee INITIAL_TOUCHDOWN_NOT_ESTABLISHED:
          factsToLifecycle.touchdownEstablished == F &
          factsToLifecycle.evidenceValid == F &
          factsToLifecycle.touchdownFault == T & faultToAggregation == T;
      compute
        // @trace PART-07
        guarantee QUALIFIED_TOUCHDOWN_COMPLETION:
          (factsToLifecycle.touchdownEstablished ==
            (reportIn.validity == EvidenceValidity.VALID &
             reportIn.touchdownValue == TouchdownValue.CONFIRMED)) &
          (factsToLifecycle.evidenceValid == (reportIn.validity == EvidenceValidity.VALID)) &
          (factsToLifecycle.touchdownFault == (reportIn.validity == EvidenceValidity.INVALID)) &
          faultToAggregation == factsToLifecycle.touchdownFault;
    }*/
  }
  // @trace PART-08
  part def BatteryConfidenceOwner :> Thread {
    // @trace INT-11
    port evidenceIn : DataPort { in :>> type : BatteryEvidence; }
    // @trace INT-12
    port stateToCharge : DataPort { out :>> type : BatteryStateFacts; }
    // @trace INT-13
    port stateToReadiness : DataPort { out :>> type : BatteryStateFacts; }
    // @trace INT-14
    port confidenceToFault : DataPort { out :>> type : BatteryConfidence; }
    // @trace INT-15
    port stateToComposition : DataPort { out :>> type : BatteryStateFacts; }
    // @trace INT-21
    port stateToHazard : DataPort { out :>> type : BatteryStateFacts; }

    language "GUMBO" /*{
      state
        // @trace PART-08
        confidenceState: BatteryConfidence;
      initialize
        modifies confidenceState;
        // @trace ASM-05
        guarantee INITIAL_CONFIDENCE_AND_OUTPUTS:
          confidenceState == BatteryConfidence.UNTRUSTED &
          stateToCharge.band == BatteryBand.CRITICAL &
          stateToCharge.confidence == BatteryConfidence.UNTRUSTED & stateToCharge.usable == F &
          stateToReadiness.band == BatteryBand.CRITICAL &
          stateToReadiness.confidence == BatteryConfidence.UNTRUSTED & stateToReadiness.usable == F &
          confidenceToFault == BatteryConfidence.UNTRUSTED &
          stateToComposition.band == BatteryBand.CRITICAL &
          stateToComposition.confidence == BatteryConfidence.UNTRUSTED & stateToComposition.usable == F &
          stateToHazard.band == BatteryBand.CRITICAL &
          stateToHazard.confidence == BatteryConfidence.UNTRUSTED & stateToHazard.usable == F;
      compute
        modifies confidenceState;
        // @trace POL-01
        guarantee SAME_STEP_CONFIDENCE_PRESERVATION:
          stateToCharge.band == evidenceIn.band &
          stateToReadiness.band == evidenceIn.band &
          stateToComposition.band == evidenceIn.band &
          stateToHazard.band == evidenceIn.band &
          stateToCharge.confidence == confidenceState &
          stateToReadiness.confidence == confidenceState &
          confidenceToFault == confidenceState &
          stateToComposition.confidence == confidenceState &
          stateToHazard.confidence == confidenceState &
          (stateToCharge.usable == (confidenceState == BatteryConfidence.TRUSTED)) &
          stateToReadiness.usable == stateToCharge.usable &
          stateToComposition.usable == stateToCharge.usable &
          stateToHazard.usable == stateToCharge.usable;
        compute_cases
          // @trace CASE-A-01
          case CASE_A_01_INVALID:
            assume evidenceIn.validBand == F;
            guarantee confidenceState == BatteryConfidence.UNTRUSTED;
          // @trace CASE-A-02
          case CASE_A_02_FIRST_VALID:
            assume evidenceIn.validBand == T & In(confidenceState) == BatteryConfidence.UNTRUSTED;
            guarantee confidenceState == BatteryConfidence.CONFIRMING;
          // @trace CASE-A-03
          case CASE_A_03_SECOND_VALID:
            assume evidenceIn.validBand == T & In(confidenceState) == BatteryConfidence.CONFIRMING;
            guarantee confidenceState == BatteryConfidence.TRUSTED;
          // @trace CASE-A-04
          case CASE_A_04_TRUSTED_RETENTION:
            assume evidenceIn.validBand == T & In(confidenceState) == BatteryConfidence.TRUSTED;
            guarantee confidenceState == BatteryConfidence.TRUSTED;
    }*/
  }
  // @trace PART-09
  part def AirborneHazardProposalOwner :> Thread {
    // @trace INT-08
    port navigationIn : DataPort { in :>> type : NavigationReport; }
    // @trace INT-19
    port flightControlIn : DataPort { in :>> type : FlightControlReport; }
    // @trace INT-21
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    // @trace INT-28
    port proposalOut : DataPort { out :>> type : HazardProposal; }

    language "GUMBO" /*{
      initialize
        // @trace FAULT-01
        guarantee INITIAL_HAZARD_PROPOSAL_SAFE:
          proposalOut.emergencyLand == T & proposalOut.forcedReturn == F &
          proposalOut.batteryUnusable == T & proposalOut.lowOrCritical == F &
          proposalOut.navigationUnusable == F;
      compute
        // @trace PART-09
        guarantee AIRBORNE_HAZARD_PROPOSALS:
          (proposalOut.batteryUnusable == (batteryIn.usable == F)) &
          (proposalOut.lowOrCritical ==
            (batteryIn.usable &
             (batteryIn.band == BatteryBand.LOW | batteryIn.band == BatteryBand.CRITICAL))) &
          (proposalOut.navigationUnusable == (navigationIn == NavigationReport.UNUSABLE)) &
          (proposalOut.emergencyLand ==
            (batteryIn.usable == F |
             (batteryIn.confidence == BatteryConfidence.TRUSTED &
              batteryIn.band == BatteryBand.CRITICAL) |
             flightControlIn == FlightControlReport.FAULTED)) &
          (proposalOut.forcedReturn ==
            (navigationIn == NavigationReport.UNUSABLE |
             (batteryIn.confidence == BatteryConfidence.TRUSTED &
              batteryIn.band == BatteryBand.LOW)));
    }*/
  }
  // @trace PART-10
  part def AirborneRequestProposalOwner :> Thread {
    // @trace INT-09
    port semanticsIn : DataPort { in :>> type : AirborneClassifiedRequest; }
    // @trace INT-29
    port proposalOut : DataPort { out :>> type : AirborneRequestProposal; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-06
        guarantee INITIAL_NO_AIRBORNE_REQUEST:
          proposalOut == AirborneRequestProposal.NO_AIRBORNE_REQUEST;
      compute
        // @trace PART-10
        guarantee AIRBORNE_REQUEST_CLASSIFICATION:
          ((semanticsIn.intentCode == ExactRequestCode.RETURN &
            proposalOut == AirborneRequestProposal.RETURN_REQUESTED) |
           (semanticsIn.intentCode == ExactRequestCode.LAND &
            proposalOut == AirborneRequestProposal.LAND_REQUESTED) |
           ((semanticsIn.intentCode != ExactRequestCode.RETURN &
             semanticsIn.intentCode != ExactRequestCode.LAND) &
            proposalOut == AirborneRequestProposal.NO_AIRBORNE_REQUEST));
    }*/
  }
  // @trace PART-11
  part def FaultAggregationOwner :> Thread {
    // @trace INT-14
    port confidenceIn : DataPort { in :>> type : BatteryConfidence; }
    // @trace INT-17
    port chargerFaultIn : DataPort { in :>> type : Base_Types::Boolean; }
    // @trace INT-18
    port navigationIn : DataPort { in :>> type : NavigationReport; }
    // @trace INT-20
    port flightControlIn : DataPort { in :>> type : FlightControlReport; }
    // @trace INT-25
    port homeFaultIn : DataPort { in :>> type : Base_Types::Boolean; }
    // @trace INT-27
    port touchdownFaultIn : DataPort { in :>> type : Base_Types::Boolean; }
    // @trace INT-30
    port faultsOut : DataPort { out :>> type : FaultVector; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-05
        guarantee INITIAL_BATTERY_FAULT_ONLY:
          faultsOut.batteryFault == T & faultsOut.chargerFault == F &
          faultsOut.navigationFault == F & faultsOut.flightControlFault == F &
          faultsOut.homeFault == F & faultsOut.touchdownFault == F &
          faultsOut.aggregateFault == T;
      compute
        // @trace PART-11
        guarantee CURRENT_FAULT_VECTOR_AND_DISJUNCTION:
          (faultsOut.batteryFault == (confidenceIn != BatteryConfidence.TRUSTED)) &
          faultsOut.chargerFault == chargerFaultIn &
          (faultsOut.navigationFault == (navigationIn == NavigationReport.UNUSABLE)) &
          (faultsOut.flightControlFault == (flightControlIn == FlightControlReport.FAULTED)) &
          faultsOut.homeFault == homeFaultIn &
          faultsOut.touchdownFault == touchdownFaultIn &
          (faultsOut.aggregateFault ==
            (faultsOut.batteryFault | faultsOut.chargerFault |
             faultsOut.navigationFault | faultsOut.flightControlFault |
             faultsOut.homeFault | faultsOut.touchdownFault));
    }*/
  }
  // @trace PART-12
  part def LifecyclePriorityOwner :> Thread {
    // @trace INT-10
    port semanticsIn : DataPort { in :>> type : LifecycleClassifiedRequest; }
    // @trace INT-22
    port chargeEligibilityIn : DataPort { in :>> type : ChargeEligibility; }
    // @trace INT-23
    port readinessIn : DataPort { in :>> type : Base_Types::Boolean; }
    // @trace INT-24
    port homeFactsIn : DataPort { in :>> type : HomeFacts; }
    // @trace INT-26
    port touchdownFactsIn : DataPort { in :>> type : TouchdownFacts; }
    // @trace INT-28
    port hazardProposalIn : DataPort { in :>> type : HazardProposal; }
    // @trace INT-29
    port airborneRequestIn : DataPort { in :>> type : AirborneRequestProposal; }
    // @trace INT-31
    port resolutionOut : DataPort { out :>> type : LifecycleResolution; }

    language "GUMBO" /*{
      state
        // @trace PART-12
        phaseState: LifecyclePhase;
      initialize
        modifies phaseState;
        // @trace ASM-05
        guarantee INITIAL_PHASE_AND_RESOLUTION:
          phaseState == LifecyclePhase.OFF &
          resolutionOut.winningCase == LifecycleCase.L12 &
          resolutionOut.sourceLifecycleState == SourceLifecyclePhase.OFF &
          resolutionOut.nextPhase == LifecyclePhase.OFF &
          resolutionOut.requestPresent == F &
          resolutionOut.requestApplicable == F &
          resolutionOut.requestCausedTransition == F &
          resolutionOut.requestDefeatedByPriority == F &
          resolutionOut.chargeRetentionEligible == F &
          resolutionOut.launchReady == F;
      compute
        modifies phaseState;
        // @trace BEH-05
        guarantee REQUEST_EFFECT_EVIDENCE:
          (resolutionOut.requestPresent == (semanticsIn.requestFamily != RequestFamily.ABSENT)) &
          (resolutionOut.requestApplicable ==
            ((In(phaseState) == LifecyclePhase.OFF & semanticsIn.requestFamily == RequestFamily.POWER &
              semanticsIn.intentCode == ExactRequestCode.SWITCH_ON) |
             (In(phaseState) == LifecyclePhase.STANDBY & semanticsIn.requestFamily == RequestFamily.POWER &
              semanticsIn.intentCode == ExactRequestCode.SWITCH_OFF) |
             (In(phaseState) == LifecyclePhase.STANDBY & semanticsIn.requestFamily == RequestFamily.CHARGE &
              semanticsIn.intentCode == ExactRequestCode.START_CHARGE &
              chargeEligibilityIn.entryEligible) |
             (In(phaseState) == LifecyclePhase.STANDBY & semanticsIn.requestFamily == RequestFamily.READINESS &
              semanticsIn.intentCode == ExactRequestCode.ACTIVATE & readinessIn) |
             (In(phaseState) == LifecyclePhase.CHARGING &
              ((semanticsIn.requestFamily == RequestFamily.POWER &
                semanticsIn.intentCode == ExactRequestCode.SWITCH_OFF) |
               (semanticsIn.requestFamily == RequestFamily.CHARGE &
                semanticsIn.intentCode == ExactRequestCode.STOP_CHARGE))) |
             (In(phaseState) == LifecyclePhase.READY &
              ((semanticsIn.requestFamily == RequestFamily.POWER &
                semanticsIn.intentCode == ExactRequestCode.SWITCH_OFF) |
               (semanticsIn.requestFamily == RequestFamily.READINESS &
                semanticsIn.intentCode == ExactRequestCode.DEACTIVATE))) |
             (In(phaseState) == LifecyclePhase.READY & semanticsIn.requestFamily == RequestFamily.READINESS &
              semanticsIn.intentCode == ExactRequestCode.LAUNCH & readinessIn) |
             (In(phaseState) == LifecyclePhase.FLYING & semanticsIn.requestFamily == RequestFamily.AIRBORNE &
              (airborneRequestIn == AirborneRequestProposal.RETURN_REQUESTED |
               airborneRequestIn == AirborneRequestProposal.LAND_REQUESTED)) |
             (In(phaseState) == LifecyclePhase.RETURNING & semanticsIn.requestFamily == RequestFamily.AIRBORNE &
              airborneRequestIn == AirborneRequestProposal.LAND_REQUESTED))) &
          (resolutionOut.requestCausedTransition ==
            ((resolutionOut.winningCase == LifecycleCase.L04 & semanticsIn.intentCode == ExactRequestCode.LAND) |
             (resolutionOut.winningCase == LifecycleCase.L05 & semanticsIn.intentCode == ExactRequestCode.RETURN) |
             (resolutionOut.winningCase == LifecycleCase.L11 & semanticsIn.intentCode == ExactRequestCode.SWITCH_ON) |
             (resolutionOut.winningCase == LifecycleCase.L13 & semanticsIn.intentCode == ExactRequestCode.SWITCH_OFF) |
             (resolutionOut.winningCase == LifecycleCase.L14 & semanticsIn.intentCode == ExactRequestCode.START_CHARGE) |
             (resolutionOut.winningCase == LifecycleCase.L15 & semanticsIn.intentCode == ExactRequestCode.ACTIVATE) |
             (resolutionOut.winningCase == LifecycleCase.L17 & semanticsIn.intentCode == ExactRequestCode.SWITCH_OFF) |
             (resolutionOut.winningCase == LifecycleCase.L18 & semanticsIn.intentCode == ExactRequestCode.STOP_CHARGE) |
             (resolutionOut.winningCase == LifecycleCase.L20 & semanticsIn.intentCode == ExactRequestCode.SWITCH_OFF) |
             (resolutionOut.winningCase == LifecycleCase.L21 & semanticsIn.intentCode == ExactRequestCode.DEACTIVATE) |
             (resolutionOut.winningCase == LifecycleCase.L22 & semanticsIn.intentCode == ExactRequestCode.LAUNCH))) &
          (resolutionOut.requestDefeatedByPriority ==
            (resolutionOut.requestApplicable & not resolutionOut.requestCausedTransition));
        // @trace BEH-03
        guarantee RESOLUTION_PRESERVATION:
          ((In(phaseState) == LifecyclePhase.OFF &
            resolutionOut.sourceLifecycleState == SourceLifecyclePhase.OFF) |
           (In(phaseState) == LifecyclePhase.STANDBY &
            resolutionOut.sourceLifecycleState == SourceLifecyclePhase.STANDBY) |
           (In(phaseState) == LifecyclePhase.CHARGING &
            resolutionOut.sourceLifecycleState == SourceLifecyclePhase.CHARGING) |
           (In(phaseState) == LifecyclePhase.READY &
            resolutionOut.sourceLifecycleState == SourceLifecyclePhase.READY) |
           (In(phaseState) == LifecyclePhase.FLYING &
            resolutionOut.sourceLifecycleState == SourceLifecyclePhase.FLYING) |
           (In(phaseState) == LifecyclePhase.RETURNING &
            resolutionOut.sourceLifecycleState == SourceLifecyclePhase.RETURNING) |
           (In(phaseState) == LifecyclePhase.LANDING &
            resolutionOut.sourceLifecycleState == SourceLifecyclePhase.LANDING)) &
          resolutionOut.nextPhase == phaseState &
          resolutionOut.chargeRetentionEligible == chargeEligibilityIn.retentionEligible &
          resolutionOut.launchReady == readinessIn;
        compute_cases
          // @trace CASE-L-01
          case CASE_L_01_AIRBORNE_EMERGENCY:
            assume
              (In(phaseState) == LifecyclePhase.FLYING |
               In(phaseState) == LifecyclePhase.RETURNING |
               In(phaseState) == LifecyclePhase.LANDING) &
              hazardProposalIn.emergencyLand;
            guarantee phaseState == LifecyclePhase.LANDING & resolutionOut.winningCase == LifecycleCase.L01;

          // @trace CASE-L-02
          case CASE_L_02_RETURNING_NAVIGATION_LOSS:
            assume In(phaseState) == LifecyclePhase.RETURNING &
              not hazardProposalIn.emergencyLand & hazardProposalIn.navigationUnusable;
            guarantee phaseState == LifecyclePhase.LANDING & resolutionOut.winningCase == LifecycleCase.L02;

          // @trace CASE-L-03
          case CASE_L_03_FLYING_FORCED_RETURN:
            assume In(phaseState) == LifecyclePhase.FLYING &
              not hazardProposalIn.emergencyLand & hazardProposalIn.forcedReturn;
            guarantee phaseState == LifecyclePhase.RETURNING & resolutionOut.winningCase == LifecycleCase.L03;

          // @trace CASE-L-04
          case CASE_L_04_AIRBORNE_LAND_REQUEST:
            assume
              ((In(phaseState) == LifecyclePhase.FLYING &
                not hazardProposalIn.emergencyLand & not hazardProposalIn.forcedReturn) |
               (In(phaseState) == LifecyclePhase.RETURNING &
                not hazardProposalIn.emergencyLand & not hazardProposalIn.navigationUnusable)) &
              airborneRequestIn == AirborneRequestProposal.LAND_REQUESTED;
            guarantee phaseState == LifecyclePhase.LANDING & resolutionOut.winningCase == LifecycleCase.L04;

          // @trace CASE-L-05
          case CASE_L_05_FLYING_RETURN_REQUEST:
            assume In(phaseState) == LifecyclePhase.FLYING &
              not hazardProposalIn.emergencyLand & not hazardProposalIn.forcedReturn &
              airborneRequestIn != AirborneRequestProposal.LAND_REQUESTED &
              airborneRequestIn == AirborneRequestProposal.RETURN_REQUESTED;
            guarantee phaseState == LifecyclePhase.RETURNING & resolutionOut.winningCase == LifecycleCase.L05;

          // @trace CASE-L-06
          case CASE_L_06_QUALIFIED_ARRIVAL:
            assume In(phaseState) == LifecyclePhase.RETURNING &
              not hazardProposalIn.emergencyLand & not hazardProposalIn.navigationUnusable &
              airborneRequestIn != AirborneRequestProposal.LAND_REQUESTED &
              homeFactsIn.arrivalEstablished;
            guarantee phaseState == LifecyclePhase.LANDING & resolutionOut.winningCase == LifecycleCase.L06;

          // @trace CASE-L-07
          case CASE_L_07_TOUCHDOWN_READY:
            assume In(phaseState) == LifecyclePhase.LANDING &
              not hazardProposalIn.emergencyLand &
              touchdownFactsIn.touchdownEstablished & readinessIn;
            guarantee phaseState == LifecyclePhase.READY & resolutionOut.winningCase == LifecycleCase.L07;

          // @trace CASE-L-08
          case CASE_L_08_TOUCHDOWN_STANDBY:
            assume In(phaseState) == LifecyclePhase.LANDING &
              not hazardProposalIn.emergencyLand &
              touchdownFactsIn.touchdownEstablished & not readinessIn;
            guarantee phaseState == LifecyclePhase.STANDBY & resolutionOut.winningCase == LifecycleCase.L08;

          // @trace CASE-L-09
          case CASE_L_09_GROUND_BATTERY_FALLBACK:
            assume
              (In(phaseState) == LifecyclePhase.STANDBY |
               In(phaseState) == LifecyclePhase.CHARGING |
               In(phaseState) == LifecyclePhase.READY) &
              hazardProposalIn.batteryUnusable;
            guarantee phaseState == LifecyclePhase.STANDBY & resolutionOut.winningCase == LifecycleCase.L09;

          // @trace CASE-L-10
          case CASE_L_10_READY_LOW_FALLBACK:
            assume In(phaseState) == LifecyclePhase.READY &
              not hazardProposalIn.batteryUnusable & hazardProposalIn.lowOrCritical;
            guarantee phaseState == LifecyclePhase.STANDBY & resolutionOut.winningCase == LifecycleCase.L10;

          // @trace CASE-L-11
          case CASE_L_11_SWITCH_ON:
            assume In(phaseState) == LifecyclePhase.OFF &
              semanticsIn.intentCode == ExactRequestCode.SWITCH_ON;
            guarantee phaseState == LifecyclePhase.STANDBY & resolutionOut.winningCase == LifecycleCase.L11;

          // @trace CASE-L-12
          case CASE_L_12_OFF_HOLD:
            assume In(phaseState) == LifecyclePhase.OFF &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_ON;
            guarantee phaseState == LifecyclePhase.OFF & resolutionOut.winningCase == LifecycleCase.L12;

          // @trace CASE-L-13
          case CASE_L_13_STANDBY_SWITCH_OFF:
            assume In(phaseState) == LifecyclePhase.STANDBY &
              not hazardProposalIn.batteryUnusable &
              semanticsIn.intentCode == ExactRequestCode.SWITCH_OFF;
            guarantee phaseState == LifecyclePhase.OFF & resolutionOut.winningCase == LifecycleCase.L13;

          // @trace CASE-L-14
          case CASE_L_14_START_CHARGE:
            assume In(phaseState) == LifecyclePhase.STANDBY &
              not hazardProposalIn.batteryUnusable &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              semanticsIn.intentCode == ExactRequestCode.START_CHARGE &
              chargeEligibilityIn.entryEligible;
            guarantee phaseState == LifecyclePhase.CHARGING & resolutionOut.winningCase == LifecycleCase.L14;

          // @trace CASE-L-15
          case CASE_L_15_ACTIVATE:
            assume In(phaseState) == LifecyclePhase.STANDBY &
              not hazardProposalIn.batteryUnusable &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              not (semanticsIn.intentCode == ExactRequestCode.START_CHARGE &
                   chargeEligibilityIn.entryEligible) &
              semanticsIn.intentCode == ExactRequestCode.ACTIVATE & readinessIn;
            guarantee phaseState == LifecyclePhase.READY & resolutionOut.winningCase == LifecycleCase.L15;

          // @trace CASE-L-16
          case CASE_L_16_STANDBY_HOLD:
            assume In(phaseState) == LifecyclePhase.STANDBY &
              not hazardProposalIn.batteryUnusable &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              not (semanticsIn.intentCode == ExactRequestCode.START_CHARGE &
                   chargeEligibilityIn.entryEligible) &
              not (semanticsIn.intentCode == ExactRequestCode.ACTIVATE & readinessIn);
            guarantee phaseState == LifecyclePhase.STANDBY & resolutionOut.winningCase == LifecycleCase.L16;

          // @trace CASE-L-17
          case CASE_L_17_CHARGING_SWITCH_OFF:
            assume In(phaseState) == LifecyclePhase.CHARGING &
              not hazardProposalIn.batteryUnusable &
              semanticsIn.intentCode == ExactRequestCode.SWITCH_OFF;
            guarantee phaseState == LifecyclePhase.OFF & resolutionOut.winningCase == LifecycleCase.L17;

          // @trace CASE-L-18
          case CASE_L_18_CHARGE_EXIT:
            assume In(phaseState) == LifecyclePhase.CHARGING &
              not hazardProposalIn.batteryUnusable &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              (semanticsIn.intentCode == ExactRequestCode.STOP_CHARGE |
               chargeEligibilityIn.exitRequired);
            guarantee phaseState == LifecyclePhase.STANDBY & resolutionOut.winningCase == LifecycleCase.L18;

          // @trace CASE-L-19
          case CASE_L_19_CHARGING_HOLD:
            assume In(phaseState) == LifecyclePhase.CHARGING &
              not hazardProposalIn.batteryUnusable &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              semanticsIn.intentCode != ExactRequestCode.STOP_CHARGE &
              not chargeEligibilityIn.exitRequired;
            guarantee phaseState == LifecyclePhase.CHARGING & resolutionOut.winningCase == LifecycleCase.L19;

          // @trace CASE-L-20
          case CASE_L_20_READY_SWITCH_OFF:
            assume In(phaseState) == LifecyclePhase.READY &
              not hazardProposalIn.batteryUnusable & not hazardProposalIn.lowOrCritical &
              semanticsIn.intentCode == ExactRequestCode.SWITCH_OFF;
            guarantee phaseState == LifecyclePhase.OFF & resolutionOut.winningCase == LifecycleCase.L20;

          // @trace CASE-L-21
          case CASE_L_21_DEACTIVATE:
            assume In(phaseState) == LifecyclePhase.READY &
              not hazardProposalIn.batteryUnusable & not hazardProposalIn.lowOrCritical &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              semanticsIn.intentCode == ExactRequestCode.DEACTIVATE;
            guarantee phaseState == LifecyclePhase.STANDBY & resolutionOut.winningCase == LifecycleCase.L21;

          // @trace CASE-L-22
          case CASE_L_22_LAUNCH:
            assume In(phaseState) == LifecyclePhase.READY &
              not hazardProposalIn.batteryUnusable & not hazardProposalIn.lowOrCritical &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              semanticsIn.intentCode != ExactRequestCode.DEACTIVATE &
              semanticsIn.intentCode == ExactRequestCode.LAUNCH & readinessIn;
            guarantee phaseState == LifecyclePhase.FLYING & resolutionOut.winningCase == LifecycleCase.L22;

          // @trace CASE-L-23
          case CASE_L_23_READY_HOLD:
            assume In(phaseState) == LifecyclePhase.READY &
              not hazardProposalIn.batteryUnusable & not hazardProposalIn.lowOrCritical &
              semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
              semanticsIn.intentCode != ExactRequestCode.DEACTIVATE &
              not (semanticsIn.intentCode == ExactRequestCode.LAUNCH & readinessIn);
            guarantee phaseState == LifecyclePhase.READY & resolutionOut.winningCase == LifecycleCase.L23;

          // @trace CASE-L-24
          case CASE_L_24_FLYING_HOLD:
            assume In(phaseState) == LifecyclePhase.FLYING &
              not hazardProposalIn.emergencyLand & not hazardProposalIn.forcedReturn &
              airborneRequestIn != AirborneRequestProposal.LAND_REQUESTED &
              airborneRequestIn != AirborneRequestProposal.RETURN_REQUESTED;
            guarantee phaseState == LifecyclePhase.FLYING & resolutionOut.winningCase == LifecycleCase.L24;

          // @trace CASE-L-25
          case CASE_L_25_RETURNING_HOLD:
            assume In(phaseState) == LifecyclePhase.RETURNING &
              not hazardProposalIn.emergencyLand & not hazardProposalIn.navigationUnusable &
              airborneRequestIn != AirborneRequestProposal.LAND_REQUESTED &
              not homeFactsIn.arrivalEstablished;
            guarantee phaseState == LifecyclePhase.RETURNING & resolutionOut.winningCase == LifecycleCase.L25;

          // @trace CASE-L-26
          case CASE_L_26_LANDING_HOLD:
            assume In(phaseState) == LifecyclePhase.LANDING &
              not hazardProposalIn.emergencyLand &
              not touchdownFactsIn.touchdownEstablished;
            guarantee phaseState == LifecyclePhase.LANDING & resolutionOut.winningCase == LifecycleCase.L26;
    }*/
  }
  // @trace PART-13
  part def OutcomeCompositionOwner :> Thread {
    // @trace INT-15
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    // @trace INT-30
    port faultsIn : DataPort { in :>> type : FaultVector; }
    // @trace INT-31
    port resolutionIn : DataPort { in :>> type : LifecycleResolution; }
    // @trace INT-32
    port pilotStatusOut : DataPort { out :>> type : PilotStatus; }
    // @trace INT-33
    port chargePermissionOut : DataPort { out :>> type : ChargePermission; }
    // @trace INT-34
    port flightControlOut : DataPort { out :>> type : FlightControlOutputs; }
    // @trace INT-35
    port propulsionPermissionOut : DataPort { out :>> type : PropulsionPermission; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-05
        guarantee INITIAL_PUBLIC_TUPLE_SAFE:
          pilotStatusOut.phase == PublishedPhase.OFF &
          pilotStatusOut.requestResult == RequestResult.NONE &
          pilotStatusOut.batteryNotice == BatteryNotice.UNTRUSTED &
          pilotStatusOut.batteryFault == T & pilotStatusOut.chargerFault == F &
          pilotStatusOut.navigationFault == F & pilotStatusOut.flightControlFault == F &
          pilotStatusOut.homeFault == F & pilotStatusOut.touchdownFault == F &
          pilotStatusOut.aggregateFault == T &
          chargePermissionOut == ChargePermission.DENIED &
          flightControlOut.intent == FlightIntent.HOLD &
          flightControlOut.launchPermission == LaunchPermission.DENIED &
          propulsionPermissionOut == PropulsionPermission.DISABLED;
      compute
        // @trace BEH-05
        guarantee REQUEST_RESULT_DERIVATION:
          ((resolutionIn.requestPresent == F &
            pilotStatusOut.requestResult == RequestResult.NONE) |
           (resolutionIn.requestPresent & resolutionIn.requestCausedTransition &
            pilotStatusOut.requestResult == RequestResult.ACCEPTED) |
           (resolutionIn.requestPresent & not resolutionIn.requestCausedTransition &
            resolutionIn.requestDefeatedByPriority &
            pilotStatusOut.requestResult == RequestResult.PREEMPTED) |
           (resolutionIn.requestPresent & not resolutionIn.requestCausedTransition &
            not resolutionIn.requestDefeatedByPriority &
            pilotStatusOut.requestResult == RequestResult.REJECTED));
        // @trace BEH-04
        guarantee BATTERY_NOTICE_DERIVATION:
          ((batteryIn.confidence != BatteryConfidence.TRUSTED &
            pilotStatusOut.batteryNotice == BatteryNotice.UNTRUSTED) |
           (batteryIn.confidence == BatteryConfidence.TRUSTED &
            (batteryIn.band == BatteryBand.MEDIUM | batteryIn.band == BatteryBand.FULL) &
            pilotStatusOut.batteryNotice == BatteryNotice.CLEAR) |
           (batteryIn.confidence == BatteryConfidence.TRUSTED &
            batteryIn.band == BatteryBand.LOW &
            pilotStatusOut.batteryNotice == BatteryNotice.LOW) |
           (batteryIn.confidence == BatteryConfidence.TRUSTED &
            batteryIn.band == BatteryBand.CRITICAL &
            pilotStatusOut.batteryNotice == BatteryNotice.CRITICAL));
        // @trace BEH-03
        guarantee FLIGHT_INTENT_DERIVATION:
          ((resolutionIn.nextPhase == LifecyclePhase.FLYING &
            resolutionIn.sourceLifecycleState != SourceLifecyclePhase.FLYING &
            flightControlOut.intent == FlightIntent.LAUNCH) |
           (resolutionIn.nextPhase == LifecyclePhase.FLYING &
            resolutionIn.sourceLifecycleState == SourceLifecyclePhase.FLYING &
            flightControlOut.intent == FlightIntent.CONTINUE) |
           (resolutionIn.nextPhase == LifecyclePhase.RETURNING &
            flightControlOut.intent == FlightIntent.RETURN) |
           (resolutionIn.nextPhase == LifecyclePhase.LANDING &
            flightControlOut.intent == FlightIntent.LAND) |
           ((resolutionIn.nextPhase == LifecyclePhase.OFF |
             resolutionIn.nextPhase == LifecyclePhase.STANDBY |
             resolutionIn.nextPhase == LifecyclePhase.CHARGING |
             resolutionIn.nextPhase == LifecyclePhase.READY) &
            flightControlOut.intent == FlightIntent.HOLD));
        // @trace BEH-03
        guarantee PERMISSION_DERIVATION:
          ((chargePermissionOut == ChargePermission.PERMITTED) ==
            (resolutionIn.nextPhase == LifecyclePhase.CHARGING &
             resolutionIn.chargeRetentionEligible)) &
          ((flightControlOut.launchPermission == LaunchPermission.PERMITTED) ==
            (resolutionIn.nextPhase == LifecyclePhase.READY & resolutionIn.launchReady)) &
          ((propulsionPermissionOut == PropulsionPermission.ENABLED) ==
            (flightControlOut.intent != FlightIntent.HOLD));
        // @trace FAULT-05
        guarantee ATOMIC_PHASE_AND_FAULT_COPY:
          ((resolutionIn.nextPhase == LifecyclePhase.OFF & pilotStatusOut.phase == PublishedPhase.OFF) |
           (resolutionIn.nextPhase == LifecyclePhase.STANDBY & pilotStatusOut.phase == PublishedPhase.STANDBY) |
           (resolutionIn.nextPhase == LifecyclePhase.CHARGING & pilotStatusOut.phase == PublishedPhase.CHARGING) |
           (resolutionIn.nextPhase == LifecyclePhase.READY & pilotStatusOut.phase == PublishedPhase.READY) |
           (resolutionIn.nextPhase == LifecyclePhase.FLYING & pilotStatusOut.phase == PublishedPhase.FLYING) |
           (resolutionIn.nextPhase == LifecyclePhase.RETURNING & pilotStatusOut.phase == PublishedPhase.RETURNING) |
           (resolutionIn.nextPhase == LifecyclePhase.LANDING & pilotStatusOut.phase == PublishedPhase.LANDING)) &
          pilotStatusOut.batteryFault == faultsIn.batteryFault &
          pilotStatusOut.chargerFault == faultsIn.chargerFault &
          pilotStatusOut.navigationFault == faultsIn.navigationFault &
          pilotStatusOut.flightControlFault == faultsIn.flightControlFault &
          pilotStatusOut.homeFault == faultsIn.homeFault &
          pilotStatusOut.touchdownFault == faultsIn.touchdownFault &
          pilotStatusOut.aggregateFault == faultsIn.aggregateFault;
    }*/
  }

  // @generated-support Behavior-free Process containment and transparent routing only.
  part def GovernorProcess :> Process {
    // @generated-support Seven boundary inputs and four boundary outputs.
    port request : DataPort { in :>> type : LifecycleRequest; }
    port batteryReport : DataPort { in :>> type : BatteryReportValue; }
    port chargerReport : DataPort { in :>> type : ChargerReport; }
    port navigationReport : DataPort { in :>> type : NavigationReport; }
    port flightControlReport : DataPort { in :>> type : FlightControlReport; }
    port homeReport : DataPort { in :>> type : HomeReportValue; }
    port touchdownReport : DataPort { in :>> type : TouchdownReportValue; }
    port pilotStatus : DataPort { out :>> type : PilotStatus; }
    port chargePermission : DataPort { out :>> type : ChargePermission; }
    port flightControlOutputs : DataPort { out :>> type : FlightControlOutputs; }
    port propulsionPermission : DataPort { out :>> type : PropulsionPermission; }

    // @trace PART-01
    part requestApplicabilityOwner : RequestApplicabilityOwner;
    // @trace PART-02
    part batteryEvidenceQualifier : BatteryEvidenceQualifier;
    // @trace PART-03
    part chargerEvidenceQualifier : ChargerEvidenceQualifier;
    // @trace PART-04
    part chargeEligibilityOwner : ChargeEligibilityOwner;
    // @trace PART-05
    part flightReadinessOwner : FlightReadinessOwner;
    // @trace PART-06
    part homeEvidenceQualifier : HomeEvidenceQualifier;
    // @trace PART-07
    part touchdownEvidenceQualifier : TouchdownEvidenceQualifier;
    // @trace PART-08
    part batteryConfidenceOwner : BatteryConfidenceOwner;
    // @trace PART-09
    part airborneHazardProposalOwner : AirborneHazardProposalOwner;
    // @trace PART-10
    part airborneRequestProposalOwner : AirborneRequestProposalOwner;
    // @trace PART-11
    part faultAggregationOwner : FaultAggregationOwner;
    // @trace PART-12
    part lifecyclePriorityOwner : LifecyclePriorityOwner;
    // @trace PART-13
    part outcomeCompositionOwner : OutcomeCompositionOwner;

    // Thirty-five approved semantic interactions.
    // @trace INT-01
    connection int01 : PortConnection connect request to requestApplicabilityOwner.requestIn;
    // @trace INT-02
    connection int02 : PortConnection connect batteryReport to batteryEvidenceQualifier.reportIn;
    // @trace INT-03
    connection int03 : PortConnection connect chargerReport to chargerEvidenceQualifier.reportIn;
    // @trace INT-04
    connection int04 : PortConnection connect navigationReport to flightReadinessOwner.navigationIn;
    // @trace INT-05
    connection int05 : PortConnection connect flightControlReport to flightReadinessOwner.flightControlIn;
    // @trace INT-06
    connection int06 : PortConnection connect homeReport to homeEvidenceQualifier.reportIn;
    // @trace INT-07
    connection int07 : PortConnection connect touchdownReport to touchdownEvidenceQualifier.reportIn;
    // @trace INT-08
    connection int08 : PortConnection connect navigationReport to airborneHazardProposalOwner.navigationIn;
    // @trace INT-09
    connection int09 : PortConnection connect requestApplicabilityOwner.semanticsToAirborne to airborneRequestProposalOwner.semanticsIn;
    // @trace INT-10
    connection int10 : PortConnection connect requestApplicabilityOwner.semanticsToLifecycle to lifecyclePriorityOwner.semanticsIn;
    // @trace INT-11
    connection int11 : PortConnection connect batteryEvidenceQualifier.evidenceOut to batteryConfidenceOwner.evidenceIn;
    // @trace INT-12
    connection int12 : PortConnection connect batteryConfidenceOwner.stateToCharge to chargeEligibilityOwner.batteryIn;
    // @trace INT-13
    connection int13 : PortConnection connect batteryConfidenceOwner.stateToReadiness to flightReadinessOwner.batteryIn;
    // @trace INT-14
    connection int14 : PortConnection connect batteryConfidenceOwner.confidenceToFault to faultAggregationOwner.confidenceIn;
    // @trace INT-15
    connection int15 : PortConnection connect batteryConfidenceOwner.stateToComposition to outcomeCompositionOwner.batteryIn;
    // @trace INT-16
    connection int16 : PortConnection connect chargerEvidenceQualifier.factsToCharge to chargeEligibilityOwner.chargerIn;
    // @trace INT-17
    connection int17 : PortConnection connect chargerEvidenceQualifier.faultToAggregation to faultAggregationOwner.chargerFaultIn;
    // @trace INT-18
    connection int18 : PortConnection connect navigationReport to faultAggregationOwner.navigationIn;
    // @trace INT-19
    connection int19 : PortConnection connect flightControlReport to airborneHazardProposalOwner.flightControlIn;
    // @trace INT-20
    connection int20 : PortConnection connect flightControlReport to faultAggregationOwner.flightControlIn;
    // @trace INT-21
    connection int21 : PortConnection connect batteryConfidenceOwner.stateToHazard to airborneHazardProposalOwner.batteryIn;
    // @trace INT-22
    connection int22 : PortConnection connect chargeEligibilityOwner.eligibilityOut to lifecyclePriorityOwner.chargeEligibilityIn;
    // @trace INT-23
    connection int23 : PortConnection connect flightReadinessOwner.readinessOut to lifecyclePriorityOwner.readinessIn;
    // @trace INT-24
    connection int24 : PortConnection connect homeEvidenceQualifier.factsToLifecycle to lifecyclePriorityOwner.homeFactsIn;
    // @trace INT-25
    connection int25 : PortConnection connect homeEvidenceQualifier.faultToAggregation to faultAggregationOwner.homeFaultIn;
    // @trace INT-26
    connection int26 : PortConnection connect touchdownEvidenceQualifier.factsToLifecycle to lifecyclePriorityOwner.touchdownFactsIn;
    // @trace INT-27
    connection int27 : PortConnection connect touchdownEvidenceQualifier.faultToAggregation to faultAggregationOwner.touchdownFaultIn;
    // @trace INT-28
    connection int28 : PortConnection connect airborneHazardProposalOwner.proposalOut to lifecyclePriorityOwner.hazardProposalIn;
    // @trace INT-29
    connection int29 : PortConnection connect airborneRequestProposalOwner.proposalOut to lifecyclePriorityOwner.airborneRequestIn;
    // @trace INT-30
    connection int30 : PortConnection connect faultAggregationOwner.faultsOut to outcomeCompositionOwner.faultsIn;
    // @trace INT-31
    connection int31 : PortConnection connect lifecyclePriorityOwner.resolutionOut to outcomeCompositionOwner.resolutionIn;
    // @trace INT-32
    connection int32 : PortConnection connect outcomeCompositionOwner.pilotStatusOut to pilotStatus;
    // @trace INT-33
    connection int33 : PortConnection connect outcomeCompositionOwner.chargePermissionOut to chargePermission;
    // @trace INT-34
    connection int34 : PortConnection connect outcomeCompositionOwner.flightControlOut to flightControlOutputs;
    // @trace INT-35
    connection int35 : PortConnection connect outcomeCompositionOwner.propulsionPermissionOut to propulsionPermission;
  }

  // @trace PURPOSE-01
  part def DroneLifecycleEnergyGovernorSystem :> System {
    // @trace MON-01
    port request : DataPort { in :>> type : LifecycleRequest; }
    // @trace MON-02
    port batteryReport : DataPort { in :>> type : BatteryReportValue; }
    // @trace MON-03
    port chargerReport : DataPort { in :>> type : ChargerReport; }
    // @trace MON-04
    port navigationReport : DataPort { in :>> type : NavigationReport; }
    // @trace MON-05
    port flightControlReport : DataPort { in :>> type : FlightControlReport; }
    // @trace MON-06
    port homeReport : DataPort { in :>> type : HomeReportValue; }
    // @trace MON-07
    port touchdownReport : DataPort { in :>> type : TouchdownReportValue; }
    // @trace CTRL-04
    port pilotStatus : DataPort { out :>> type : PilotStatus; }
    // @trace CTRL-05
    port chargePermission : DataPort { out :>> type : ChargePermission; }
    // @trace CTRL-06
    port flightControlOutputs : DataPort { out :>> type : FlightControlOutputs; }
    // @trace CTRL-08
    port propulsionPermission : DataPort { out :>> type : PropulsionPermission; }

    // @generated-support Sole behavior-free containment usage approved by SUPPORT-01.
    part governorProcess : GovernorProcess;

    // Exactly eleven transparent root/Process delegations.
    // @generated-support root-to-Process delegation 01.
    connection support01 : PortConnection connect request to governorProcess.request;
    // @generated-support root-to-Process delegation 02.
    connection support02 : PortConnection connect batteryReport to governorProcess.batteryReport;
    // @generated-support root-to-Process delegation 03.
    connection support03 : PortConnection connect chargerReport to governorProcess.chargerReport;
    // @generated-support root-to-Process delegation 04.
    connection support04 : PortConnection connect navigationReport to governorProcess.navigationReport;
    // @generated-support root-to-Process delegation 05.
    connection support05 : PortConnection connect flightControlReport to governorProcess.flightControlReport;
    // @generated-support root-to-Process delegation 06.
    connection support06 : PortConnection connect homeReport to governorProcess.homeReport;
    // @generated-support root-to-Process delegation 07.
    connection support07 : PortConnection connect touchdownReport to governorProcess.touchdownReport;
    // @generated-support Process-to-root delegation 08.
    connection support08 : PortConnection connect governorProcess.pilotStatus to pilotStatus;
    // @generated-support Process-to-root delegation 09.
    connection support09 : PortConnection connect governorProcess.chargePermission to chargePermission;
    // @generated-support Process-to-root delegation 10.
    connection support10 : PortConnection connect governorProcess.flightControlOutputs to flightControlOutputs;
    // @generated-support Process-to-root delegation 11.
    connection support11 : PortConnection connect governorProcess.propulsionPermission to propulsionPermission;
  }

  // @trace CONSTR-01
  part droneLifecycleEnergyGovernor : DroneLifecycleEnergyGovernorSystem;
}
