// Canonical contract-bearing source generated from the retained architecture checkpoint.
// @trace PURPOSE-01
package Observation_Sortie_Eligibility_Supervisor {
  private import HAMR::*;

  // Finite boundary and policy domains.
  // @trace MON-01
  enum def EnergyQuality { enum Nominal; enum Limited; enum Unavailable; enum Unknown; }
  // @trace MON-02
  enum def EquipmentCondition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  // @trace MON-02
  enum def GpsCondition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  // @trace MON-02
  enum def InertialCondition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  // @trace MON-02
  enum def BarometricCondition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  // @trace MON-06
  enum def Engine1Condition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  // @trace MON-06
  enum def Engine2Condition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  // @trace MON-06
  enum def Engine3Condition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  // @trace MON-06
  enum def Engine4Condition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  // @trace ASM-02
  enum def Validity { enum Valid; enum Invalid; }
  // @trace ASM-02
  enum def Freshness { enum Current; enum Stale; }
  // @trace MON-06
  enum def Confirmation { enum Confirmed; enum NotConfirmed; }
  // @trace MON-07
  enum def OperatorEvent { enum None; enum Submit; enum Cancel; enum AcknowledgeRecovery; }
  // @trace TYPE-03
  enum def RequestPhase { enum Idle; enum Pending; enum Released; }
  // @trace TYPE-03
  enum def RecoveryPhase { enum Normal; enum Quarantined; enum AwaitingAck; }
  // @trace TYPE-03
  enum def PriorityDirective { enum Inhibit; enum Cancel; enum Recover; enum Submit; enum Hold; }
  // @trace TYPE-03
  enum def CarriedPriority { enum Inhibit; enum Cancel; enum Recover; enum Submit; enum Hold; }
  // @trace TYPE-03
  enum def RecoveryGate { enum Open; enum Closed; }
  // @trace CTRL-01
  enum def SortieDirective { enum Withhold; enum Permit; }
  // @trace TYPE-03
  enum def EligibilityReason { enum None; enum Equipment; enum Recovery; enum NoRequest; }
  // @trace TYPE-03
  enum def ReleaseFeedback { enum NotReleased; enum Released; }
  // @trace TYPE-02
  enum def FaultState { enum Clear; enum Active; }
  // @trace TYPE-02
  enum def EquipmentCause { enum None; enum Energy; enum Propulsion; enum Navigation; enum Obstacle; enum Observation; enum Communication; }
  // @trace CTRL-02
  enum def LimitingCause { enum None; enum Energy; enum Propulsion; enum Navigation; enum Obstacle; enum Observation; enum Communication; enum Recovery; enum NoRequest; }
  // @trace CTRL-02
  enum def StatusRequestPhase { enum Idle; enum Pending; enum Released; }
  // @trace CTRL-02
  enum def StatusFaultState { enum Clear; enum Active; }
  // @trace CTRL-02
  enum def StatusRecoveryPhase { enum Normal; enum Quarantined; enum AwaitingAck; }
  // @trace CTRL-02
  enum def StatusDecision { enum Withhold; enum Permit; }
  // @trace TYPE-04
  enum def EnergyCause { enum None; enum Invalid; enum Stale; enum UnavailableOrUnknown; enum Limited; }
  // @trace TYPE-04
  enum def NavigationCause { enum None; enum Invalid; enum Stale; enum Gps; enum Inertial; enum Barometric; }
  // @trace TYPE-04
  enum def SingleEquipmentCause { enum None; enum Invalid; enum Stale; enum Condition; }
  // @trace TYPE-04
  enum def PropulsionCause { enum None; enum Invalid; enum Stale; enum Configuration; enum Engine1; enum Engine2; enum Engine3; enum Engine4; }

  // Every record field inspected by GUMBO is a direct attribute.
  // @trace MON-01
  part def EnergyEvidence :> Data {
    attribute quality : EnergyQuality;
    attribute validity : Validity;
    attribute freshness : Freshness;
  }
  // @trace MON-02
  part def NavigationEvidenceRecord :> Data {
    attribute gpsCondition : GpsCondition;
    attribute inertial : InertialCondition;
    attribute barometric : BarometricCondition;
    attribute validity : Validity;
    attribute freshness : Freshness;
  }
  // @trace MON-03
  part def EquipmentEvidence :> Data {
    attribute condition : EquipmentCondition;
    attribute validity : Validity;
    attribute freshness : Freshness;
  }
  // @trace MON-06
  part def PropulsionEvidence :> Data {
    attribute engine1 : Engine1Condition;
    attribute engine2 : Engine2Condition;
    attribute engine3 : Engine3Condition;
    attribute engine4 : Engine4Condition;
    attribute validity : Validity;
    attribute freshness : Freshness;
    attribute alternatingKindsConfirmed : Confirmation;
  }
  // @trace TYPE-01
  part def EnergyAssessment :> Data {
    attribute ready : Base_Types::Boolean;
    attribute localCause : EnergyCause;
  }
  // @trace TYPE-01
  part def NavigationAssessment :> Data {
    attribute ready : Base_Types::Boolean;
    attribute localCause : NavigationCause;
  }
  // @trace TYPE-01
  part def SingleEquipmentAssessment :> Data {
    attribute ready : Base_Types::Boolean;
    attribute localCause : SingleEquipmentCause;
  }
  // @trace TYPE-01
  part def PropulsionAssessment :> Data {
    attribute ready : Base_Types::Boolean;
    attribute localCause : PropulsionCause;
  }
  // @trace TYPE-02
  part def FaultSummary :> Data {
    attribute faultState : FaultState;
    attribute primaryCause : EquipmentCause;
  }
  // @trace TYPE-03
  part def RecoveryFacts :> Data {
    attribute phase : RecoveryPhase;
    attribute gate : RecoveryGate;
    attribute carriedPriority : CarriedPriority;
  }
  // @trace TYPE-03
  part def EligibilityDecision :> Data {
    attribute directive : SortieDirective;
    attribute reason : EligibilityReason;
  }
  // @trace CTRL-02
  part def EligibilityStatus :> Data {
    attribute requestPhase : StatusRequestPhase;
    attribute faultState : StatusFaultState;
    attribute recoveryPhase : StatusRecoveryPhase;
    attribute decisionDirective : StatusDecision;
    attribute limitingCause : LimitingCause;
  }

  // @trace PART-01
  part def EnergyEvidenceAssessor :> Thread {
    // @trace MON-01
    port energy_evidence : DataPort { in :>> type : EnergyEvidence; }
    // @trace INT-08
    port energy_assessment : DataPort { out :>> type : EnergyAssessment; }

    language "GUMBO" /*{
      initialize
        // @trace POL-07
        guarantee INITIAL_ENERGY_NOT_READY:
          energy_assessment.ready == F &
          energy_assessment.localCause == EnergyCause.Invalid;
      compute
        compute_cases
          // @trace CASE-01
          case ENERGY_READY:
            assume energy_evidence.validity == Validity.Valid &
              energy_evidence.freshness == Freshness.Current &
              energy_evidence.quality == EnergyQuality.Nominal;
            guarantee energy_assessment.ready == T &
              energy_assessment.localCause == EnergyCause.None;
          // @trace CASE-02
          case ENERGY_NOT_READY:
            assume energy_evidence.validity == Validity.Invalid |
              energy_evidence.freshness == Freshness.Stale |
              energy_evidence.quality != EnergyQuality.Nominal;
            guarantee energy_assessment.ready == F &
              ((energy_evidence.validity == Validity.Invalid &
                energy_assessment.localCause == EnergyCause.Invalid) |
               (energy_evidence.validity == Validity.Valid &
                energy_evidence.freshness == Freshness.Stale &
                energy_assessment.localCause == EnergyCause.Stale) |
               (energy_evidence.validity == Validity.Valid &
                energy_evidence.freshness == Freshness.Current &
                (energy_evidence.quality == EnergyQuality.Unavailable |
                 energy_evidence.quality == EnergyQuality.Unknown) &
                energy_assessment.localCause == EnergyCause.UnavailableOrUnknown) |
               (energy_evidence.validity == Validity.Valid &
                energy_evidence.freshness == Freshness.Current &
                energy_evidence.quality == EnergyQuality.Limited &
                energy_assessment.localCause == EnergyCause.Limited));
    }*/
  }

  // @trace PART-02
  part def NavigationEvidenceAssessor :> Thread {
    // @trace MON-02
    port navigation_evidence : DataPort { in :>> type : NavigationEvidenceRecord; }
    // @trace INT-09
    port navigation_assessment : DataPort { out :>> type : NavigationAssessment; }

    language "GUMBO" /*{
      initialize
        // @trace POL-07
        guarantee INITIAL_NAVIGATION_NOT_READY:
          navigation_assessment.ready == F &
          navigation_assessment.localCause == NavigationCause.Invalid;
      compute
        compute_cases
          // @trace CASE-03
          case NAVIGATION_READY:
            assume navigation_evidence.validity == Validity.Valid &
              navigation_evidence.freshness == Freshness.Current &
              navigation_evidence.gpsCondition == GpsCondition.Nominal &
              navigation_evidence.inertial == InertialCondition.Nominal &
              navigation_evidence.barometric == BarometricCondition.Nominal;
            guarantee navigation_assessment.ready == T &
              navigation_assessment.localCause == NavigationCause.None;
          // @trace CASE-04
          case NAVIGATION_NOT_READY:
            assume navigation_evidence.validity == Validity.Invalid |
              navigation_evidence.freshness == Freshness.Stale |
              navigation_evidence.gpsCondition != GpsCondition.Nominal |
              navigation_evidence.inertial != InertialCondition.Nominal |
              navigation_evidence.barometric != BarometricCondition.Nominal;
            guarantee navigation_assessment.ready == F &
              ((navigation_evidence.validity == Validity.Invalid &
                navigation_assessment.localCause == NavigationCause.Invalid) |
               (navigation_evidence.validity == Validity.Valid &
                navigation_evidence.freshness == Freshness.Stale &
                navigation_assessment.localCause == NavigationCause.Stale) |
               (navigation_evidence.validity == Validity.Valid &
                navigation_evidence.freshness == Freshness.Current &
                navigation_evidence.gpsCondition != GpsCondition.Nominal &
                navigation_assessment.localCause == NavigationCause.Gps) |
               (navigation_evidence.validity == Validity.Valid &
                navigation_evidence.freshness == Freshness.Current &
                navigation_evidence.gpsCondition == GpsCondition.Nominal &
                navigation_evidence.inertial != InertialCondition.Nominal &
                navigation_assessment.localCause == NavigationCause.Inertial) |
               (navigation_evidence.validity == Validity.Valid &
                navigation_evidence.freshness == Freshness.Current &
                navigation_evidence.gpsCondition == GpsCondition.Nominal &
                navigation_evidence.inertial == InertialCondition.Nominal &
                navigation_evidence.barometric != BarometricCondition.Nominal &
                navigation_assessment.localCause == NavigationCause.Barometric));
    }*/
  }

  // @trace PART-03
  part def CommunicationEvidenceAssessor :> Thread {
    // @trace MON-03
    port communication_evidence : DataPort { in :>> type : EquipmentEvidence; }
    // @trace INT-10
    port communication_assessment : DataPort { out :>> type : SingleEquipmentAssessment; }

    language "GUMBO" /*{
      initialize
        // @trace POL-07
        guarantee INITIAL_COMMUNICATION_NOT_READY:
          communication_assessment.ready == F &
          communication_assessment.localCause == SingleEquipmentCause.Invalid;
      compute
        compute_cases
          // @trace CASE-05
          case COMMUNICATION_READY:
            assume communication_evidence.validity == Validity.Valid &
              communication_evidence.freshness == Freshness.Current &
              communication_evidence.condition == EquipmentCondition.Nominal;
            guarantee communication_assessment.ready == T &
              communication_assessment.localCause == SingleEquipmentCause.None;
          // @trace CASE-06
          case COMMUNICATION_NOT_READY:
            assume communication_evidence.validity == Validity.Invalid |
              communication_evidence.freshness == Freshness.Stale |
              communication_evidence.condition != EquipmentCondition.Nominal;
            guarantee communication_assessment.ready == F &
              ((communication_evidence.validity == Validity.Invalid &
                communication_assessment.localCause == SingleEquipmentCause.Invalid) |
               (communication_evidence.validity == Validity.Valid &
                communication_evidence.freshness == Freshness.Stale &
                communication_assessment.localCause == SingleEquipmentCause.Stale) |
               (communication_evidence.validity == Validity.Valid &
                communication_evidence.freshness == Freshness.Current &
                communication_evidence.condition != EquipmentCondition.Nominal &
                communication_assessment.localCause == SingleEquipmentCause.Condition));
    }*/
  }

  // @trace PART-04
  part def ObservationEvidenceAssessor :> Thread {
    // @trace MON-04
    port observation_evidence : DataPort { in :>> type : EquipmentEvidence; }
    // @trace INT-11
    port observation_assessment : DataPort { out :>> type : SingleEquipmentAssessment; }

    language "GUMBO" /*{
      initialize
        // @trace POL-07
        guarantee INITIAL_OBSERVATION_NOT_READY:
          observation_assessment.ready == F &
          observation_assessment.localCause == SingleEquipmentCause.Invalid;
      compute
        compute_cases
          // @trace CASE-07
          case OBSERVATION_READY:
            assume observation_evidence.validity == Validity.Valid &
              observation_evidence.freshness == Freshness.Current &
              observation_evidence.condition == EquipmentCondition.Nominal;
            guarantee observation_assessment.ready == T &
              observation_assessment.localCause == SingleEquipmentCause.None;
          // @trace CASE-08
          case OBSERVATION_NOT_READY:
            assume observation_evidence.validity == Validity.Invalid |
              observation_evidence.freshness == Freshness.Stale |
              observation_evidence.condition != EquipmentCondition.Nominal;
            guarantee observation_assessment.ready == F &
              ((observation_evidence.validity == Validity.Invalid &
                observation_assessment.localCause == SingleEquipmentCause.Invalid) |
               (observation_evidence.validity == Validity.Valid &
                observation_evidence.freshness == Freshness.Stale &
                observation_assessment.localCause == SingleEquipmentCause.Stale) |
               (observation_evidence.validity == Validity.Valid &
                observation_evidence.freshness == Freshness.Current &
                observation_evidence.condition != EquipmentCondition.Nominal &
                observation_assessment.localCause == SingleEquipmentCause.Condition));
    }*/
  }

  // @trace PART-05
  part def ObstacleEvidenceAssessor :> Thread {
    // @trace MON-05
    port obstacle_evidence : DataPort { in :>> type : EquipmentEvidence; }
    // @trace INT-12
    port obstacle_assessment : DataPort { out :>> type : SingleEquipmentAssessment; }

    language "GUMBO" /*{
      initialize
        // @trace POL-07
        guarantee INITIAL_OBSTACLE_NOT_READY:
          obstacle_assessment.ready == F &
          obstacle_assessment.localCause == SingleEquipmentCause.Invalid;
      compute
        compute_cases
          // @trace CASE-09
          case OBSTACLE_READY:
            assume obstacle_evidence.validity == Validity.Valid &
              obstacle_evidence.freshness == Freshness.Current &
              obstacle_evidence.condition == EquipmentCondition.Nominal;
            guarantee obstacle_assessment.ready == T &
              obstacle_assessment.localCause == SingleEquipmentCause.None;
          // @trace CASE-10
          case OBSTACLE_NOT_READY:
            assume obstacle_evidence.validity == Validity.Invalid |
              obstacle_evidence.freshness == Freshness.Stale |
              obstacle_evidence.condition != EquipmentCondition.Nominal;
            guarantee obstacle_assessment.ready == F &
              ((obstacle_evidence.validity == Validity.Invalid &
                obstacle_assessment.localCause == SingleEquipmentCause.Invalid) |
               (obstacle_evidence.validity == Validity.Valid &
                obstacle_evidence.freshness == Freshness.Stale &
                obstacle_assessment.localCause == SingleEquipmentCause.Stale) |
               (obstacle_evidence.validity == Validity.Valid &
                obstacle_evidence.freshness == Freshness.Current &
                obstacle_evidence.condition != EquipmentCondition.Nominal &
                obstacle_assessment.localCause == SingleEquipmentCause.Condition));
    }*/
  }

  // @trace PART-06
  part def PropulsionEvidenceAssessor :> Thread {
    // @trace MON-06
    port propulsion_evidence : DataPort { in :>> type : PropulsionEvidence; }
    // @trace INT-13
    port propulsion_assessment : DataPort { out :>> type : PropulsionAssessment; }

    language "GUMBO" /*{
      initialize
        // @trace POL-07
        guarantee INITIAL_PROPULSION_NOT_READY:
          propulsion_assessment.ready == F &
          propulsion_assessment.localCause == PropulsionCause.Invalid;
      compute
        compute_cases
          // @trace CASE-11
          case PROPULSION_READY:
            assume propulsion_evidence.validity == Validity.Valid &
              propulsion_evidence.freshness == Freshness.Current &
              propulsion_evidence.alternatingKindsConfirmed == Confirmation.Confirmed &
              propulsion_evidence.engine1 == Engine1Condition.Nominal &
              propulsion_evidence.engine2 == Engine2Condition.Nominal &
              propulsion_evidence.engine3 == Engine3Condition.Nominal &
              propulsion_evidence.engine4 == Engine4Condition.Nominal;
            guarantee propulsion_assessment.ready == T &
              propulsion_assessment.localCause == PropulsionCause.None;
          // @trace CASE-12
          case PROPULSION_NOT_READY:
            assume propulsion_evidence.validity == Validity.Invalid |
              propulsion_evidence.freshness == Freshness.Stale |
              propulsion_evidence.alternatingKindsConfirmed == Confirmation.NotConfirmed |
              propulsion_evidence.engine1 != Engine1Condition.Nominal |
              propulsion_evidence.engine2 != Engine2Condition.Nominal |
              propulsion_evidence.engine3 != Engine3Condition.Nominal |
              propulsion_evidence.engine4 != Engine4Condition.Nominal;
            guarantee propulsion_assessment.ready == F &
              ((propulsion_evidence.validity == Validity.Invalid &
                propulsion_assessment.localCause == PropulsionCause.Invalid) |
               (propulsion_evidence.validity == Validity.Valid &
                propulsion_evidence.freshness == Freshness.Stale &
                propulsion_assessment.localCause == PropulsionCause.Stale) |
               (propulsion_evidence.validity == Validity.Valid &
                propulsion_evidence.freshness == Freshness.Current &
                propulsion_evidence.alternatingKindsConfirmed == Confirmation.NotConfirmed &
                propulsion_assessment.localCause == PropulsionCause.Configuration) |
               (propulsion_evidence.validity == Validity.Valid &
                propulsion_evidence.freshness == Freshness.Current &
                propulsion_evidence.alternatingKindsConfirmed == Confirmation.Confirmed &
                propulsion_evidence.engine1 != Engine1Condition.Nominal &
                propulsion_assessment.localCause == PropulsionCause.Engine1) |
               (propulsion_evidence.validity == Validity.Valid &
                propulsion_evidence.freshness == Freshness.Current &
                propulsion_evidence.alternatingKindsConfirmed == Confirmation.Confirmed &
                propulsion_evidence.engine1 == Engine1Condition.Nominal &
                propulsion_evidence.engine2 != Engine2Condition.Nominal &
                propulsion_assessment.localCause == PropulsionCause.Engine2) |
               (propulsion_evidence.validity == Validity.Valid &
                propulsion_evidence.freshness == Freshness.Current &
                propulsion_evidence.alternatingKindsConfirmed == Confirmation.Confirmed &
                propulsion_evidence.engine1 == Engine1Condition.Nominal &
                propulsion_evidence.engine2 == Engine2Condition.Nominal &
                propulsion_evidence.engine3 != Engine3Condition.Nominal &
                propulsion_assessment.localCause == PropulsionCause.Engine3) |
               (propulsion_evidence.validity == Validity.Valid &
                propulsion_evidence.freshness == Freshness.Current &
                propulsion_evidence.alternatingKindsConfirmed == Confirmation.Confirmed &
                propulsion_evidence.engine1 == Engine1Condition.Nominal &
                propulsion_evidence.engine2 == Engine2Condition.Nominal &
                propulsion_evidence.engine3 == Engine3Condition.Nominal &
                propulsion_evidence.engine4 != Engine4Condition.Nominal &
                propulsion_assessment.localCause == PropulsionCause.Engine4));
    }*/
  }

  // @trace PART-07
  part def RequestLifecycleOwner :> Thread {
    // @trace MON-07
    port operator_event : DataPort { in :>> type : OperatorEvent; }
    // @trace INT-22
    port accepted_directive : DataPort { in :>> type : PriorityDirective; }
    // @trace INT-28
    port release_feedback : DataPort { in :>> type : ReleaseFeedback; }
    // @trace INT-20
    port candidate_event : DataPort { out :>> type : OperatorEvent; }
    // @trace INT-26
    port request_phase : DataPort { out :>> type : RequestPhase; }

    language "GUMBO" /*{
      state
        // @trace PART-07
        requestMemory: RequestPhase;
      initialize
        modifies requestMemory;
        // @trace POL-07
        guarantee INITIAL_REQUEST_IDLE:
          requestMemory == RequestPhase.Idle &
          request_phase == RequestPhase.Idle &
          candidate_event == OperatorEvent.None;
      compute
        modifies requestMemory;
        // @trace INT-20
        guarantee CANDIDATE_EVENT_PUBLISHED:
          candidate_event == operator_event;
        // @trace INT-26
        guarantee PRE_EVALUATION_REQUEST_PUBLISHED:
          request_phase == In(requestMemory);
        compute_cases
          // @trace CASE-18
          case REQUEST_CANCEL:
            assume accepted_directive == PriorityDirective.Cancel;
            guarantee requestMemory == RequestPhase.Idle;
          // @trace CASE-19
          case REQUEST_FRESH_SUBMIT:
            assume accepted_directive == PriorityDirective.Submit &
              In(requestMemory) == RequestPhase.Idle;
            guarantee requestMemory == RequestPhase.Pending;
          // @trace CASE-20
          case REQUEST_DUPLICATE_SUBMIT:
            assume accepted_directive == PriorityDirective.Submit &
              In(requestMemory) != RequestPhase.Idle &
              release_feedback == ReleaseFeedback.NotReleased;
            guarantee requestMemory == In(requestMemory);
          // @trace CASE-21
          case REQUEST_RELEASE_FEEDBACK:
            assume accepted_directive != PriorityDirective.Cancel &
              In(requestMemory) == RequestPhase.Pending &
              release_feedback == ReleaseFeedback.Released;
            guarantee requestMemory == RequestPhase.Released;
          // @trace CASE-22
          case REQUEST_REARM_OR_RETAIN:
            assume (In(requestMemory) == RequestPhase.Released &
                    accepted_directive == PriorityDirective.Hold) |
              (In(requestMemory) == RequestPhase.Idle &
               accepted_directive != PriorityDirective.Cancel &
               accepted_directive != PriorityDirective.Submit) |
              (In(requestMemory) == RequestPhase.Pending &
               release_feedback == ReleaseFeedback.NotReleased &
               accepted_directive != PriorityDirective.Cancel &
               accepted_directive != PriorityDirective.Submit) |
              (In(requestMemory) == RequestPhase.Released &
               accepted_directive != PriorityDirective.Cancel &
               accepted_directive != PriorityDirective.Hold &
               (accepted_directive != PriorityDirective.Submit |
                release_feedback == ReleaseFeedback.Released));
            guarantee ((In(requestMemory) == RequestPhase.Released &
                        accepted_directive == PriorityDirective.Hold &
                        requestMemory == RequestPhase.Idle) |
                       ((In(requestMemory) != RequestPhase.Released |
                         accepted_directive != PriorityDirective.Hold) &
                        requestMemory == In(requestMemory)));
    }*/
  }

  // @trace PART-08
  part def FaultRegistry :> Thread {
    // @trace INT-08
    port energy_assessment : DataPort { in :>> type : EnergyAssessment; }
    // @trace INT-09
    port navigation_assessment : DataPort { in :>> type : NavigationAssessment; }
    // @trace INT-10
    port communication_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    // @trace INT-11
    port observation_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    // @trace INT-12
    port obstacle_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    // @trace INT-13
    port propulsion_assessment : DataPort { in :>> type : PropulsionAssessment; }
    // @trace INT-21
    port fault_summary : DataPort { out :>> type : FaultSummary; }

    language "GUMBO" /*{
      initialize
        // @trace POL-07
        guarantee INITIAL_FAULT_CLEAR:
          fault_summary.faultState == FaultState.Clear &
          fault_summary.primaryCause == EquipmentCause.None;
      compute
        compute_cases
          // @trace CASE-23
          case FAULT_ACTIVE_PRIORITY:
            assume energy_assessment.ready == F |
              propulsion_assessment.ready == F |
              navigation_assessment.ready == F |
              obstacle_assessment.ready == F |
              observation_assessment.ready == F |
              communication_assessment.ready == F;
            guarantee fault_summary.faultState == FaultState.Active &
              ((energy_assessment.ready == F &
                fault_summary.primaryCause == EquipmentCause.Energy) |
               (energy_assessment.ready & propulsion_assessment.ready == F &
                fault_summary.primaryCause == EquipmentCause.Propulsion) |
               (energy_assessment.ready & propulsion_assessment.ready &
                navigation_assessment.ready == F &
                fault_summary.primaryCause == EquipmentCause.Navigation) |
               (energy_assessment.ready & propulsion_assessment.ready &
                navigation_assessment.ready & obstacle_assessment.ready == F &
                fault_summary.primaryCause == EquipmentCause.Obstacle) |
               (energy_assessment.ready & propulsion_assessment.ready &
                navigation_assessment.ready & obstacle_assessment.ready &
                observation_assessment.ready == F &
                fault_summary.primaryCause == EquipmentCause.Observation) |
               (energy_assessment.ready & propulsion_assessment.ready &
                navigation_assessment.ready & obstacle_assessment.ready &
                observation_assessment.ready & communication_assessment.ready == F &
                fault_summary.primaryCause == EquipmentCause.Communication));
          // @trace CASE-24
          case FAULT_CLEAR:
            assume energy_assessment.ready & propulsion_assessment.ready &
              navigation_assessment.ready & obstacle_assessment.ready &
              observation_assessment.ready & communication_assessment.ready;
            guarantee fault_summary.faultState == FaultState.Clear &
              fault_summary.primaryCause == EquipmentCause.None;
    }*/
  }

  // @trace PART-09
  part def PriorityArbiter :> Thread {
    // @trace INT-20
    port candidate_event : DataPort { in :>> type : OperatorEvent; }
    // @trace INT-21
    port fault_summary : DataPort { in :>> type : FaultSummary; }
    // @trace INT-22
    port accepted_directive : DataPort { out :>> type : PriorityDirective; }

    language "GUMBO" /*{
      initialize
        // @trace POL-07
        guarantee INITIAL_PRIORITY_INHIBIT:
          accepted_directive == PriorityDirective.Inhibit;
      compute
        compute_cases
          // @trace CASE-13
          case PRIORITY_ACTIVE_FAULT:
            assume fault_summary.faultState == FaultState.Active;
            guarantee accepted_directive == PriorityDirective.Inhibit;
          // @trace CASE-14
          case PRIORITY_CANCEL:
            assume fault_summary.faultState == FaultState.Clear &
              candidate_event == OperatorEvent.Cancel;
            guarantee accepted_directive == PriorityDirective.Cancel;
          // @trace CASE-15
          case PRIORITY_RECOVER:
            assume fault_summary.faultState == FaultState.Clear &
              candidate_event == OperatorEvent.AcknowledgeRecovery;
            guarantee accepted_directive == PriorityDirective.Recover;
          // @trace CASE-16
          case PRIORITY_SUBMIT:
            assume fault_summary.faultState == FaultState.Clear &
              candidate_event == OperatorEvent.Submit;
            guarantee accepted_directive == PriorityDirective.Submit;
          // @trace CASE-17
          case PRIORITY_HOLD:
            assume fault_summary.faultState == FaultState.Clear &
              candidate_event == OperatorEvent.None;
            guarantee accepted_directive == PriorityDirective.Hold;
    }*/
  }

  // @trace PART-10
  part def RecoveryQualificationOwner :> Thread {
    // @trace INT-23
    port accepted_directive : DataPort { in :>> type : PriorityDirective; }
    // @trace INT-24
    port fault_summary : DataPort { in :>> type : FaultSummary; }
    // @trace INT-25
    port recovery_facts : DataPort { out :>> type : RecoveryFacts; }
    // @trace INT-31
    port recovery_phase : DataPort { out :>> type : RecoveryPhase; }

    language "GUMBO" /*{
      state
        // @trace PART-10
        recoveryMemory: RecoveryPhase;
      initialize
        modifies recoveryMemory;
        // @trace POL-07
        guarantee INITIAL_RECOVERY_QUARANTINED:
          recoveryMemory == RecoveryPhase.Quarantined &
          recovery_facts.phase == RecoveryPhase.Quarantined &
          recovery_facts.gate == RecoveryGate.Closed &
          recovery_facts.carriedPriority == CarriedPriority.Inhibit &
          recovery_phase == RecoveryPhase.Quarantined;
      compute
        modifies recoveryMemory;
        // @trace INT-25
        guarantee RECOVERY_FACTS_COHERENT:
          recovery_facts.phase == recoveryMemory &
          recovery_phase == recoveryMemory &
          ((accepted_directive == PriorityDirective.Inhibit &
            recovery_facts.carriedPriority == CarriedPriority.Inhibit) |
           (accepted_directive == PriorityDirective.Cancel &
            recovery_facts.carriedPriority == CarriedPriority.Cancel) |
           (accepted_directive == PriorityDirective.Recover &
            recovery_facts.carriedPriority == CarriedPriority.Recover) |
           (accepted_directive == PriorityDirective.Submit &
            recovery_facts.carriedPriority == CarriedPriority.Submit) |
           (accepted_directive == PriorityDirective.Hold &
            recovery_facts.carriedPriority == CarriedPriority.Hold));
        compute_cases
          // @trace CASE-25
          case RECOVERY_CURRENT_FAULT:
            assume fault_summary.faultState == FaultState.Active;
            guarantee recoveryMemory == RecoveryPhase.Quarantined &
              recovery_facts.gate == RecoveryGate.Closed;
          // @trace CASE-26
          case RECOVERY_OPEN:
            assume fault_summary.faultState == FaultState.Clear &
              (In(recoveryMemory) == RecoveryPhase.Normal |
               accepted_directive == PriorityDirective.Recover);
            guarantee recoveryMemory == RecoveryPhase.Normal &
              recovery_facts.gate == RecoveryGate.Open;
          // @trace CASE-27
          case RECOVERY_AWAITING_ACK:
            assume fault_summary.faultState == FaultState.Clear &
              In(recoveryMemory) != RecoveryPhase.Normal &
              accepted_directive != PriorityDirective.Recover;
            guarantee recoveryMemory == RecoveryPhase.AwaitingAck &
              recovery_facts.gate == RecoveryGate.Closed;
    }*/
  }

  // @trace PART-11
  part def EligibilityDecisionOwner :> Thread {
    // @trace INT-14
    port energy_assessment : DataPort { in :>> type : EnergyAssessment; }
    // @trace INT-15
    port navigation_assessment : DataPort { in :>> type : NavigationAssessment; }
    // @trace INT-16
    port communication_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    // @trace INT-17
    port observation_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    // @trace INT-18
    port obstacle_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    // @trace INT-19
    port propulsion_assessment : DataPort { in :>> type : PropulsionAssessment; }
    // @trace INT-25
    port recovery_facts : DataPort { in :>> type : RecoveryFacts; }
    // @trace INT-26
    port request_phase : DataPort { in :>> type : RequestPhase; }
    // @trace INT-27
    port eligibility_decision : DataPort { out :>> type : EligibilityDecision; }

    language "GUMBO" /*{
      initialize
        // @trace POL-07
        guarantee INITIAL_ELIGIBILITY_WITHHELD:
          eligibility_decision.directive == SortieDirective.Withhold &
          eligibility_decision.reason == EligibilityReason.Recovery;
      compute
        compute_cases
          // @trace CASE-28
          case ELIGIBILITY_BLOCKED_CONTEXT:
            assume request_phase != RequestPhase.Pending |
              recovery_facts.gate == RecoveryGate.Closed |
              recovery_facts.carriedPriority == CarriedPriority.Cancel;
            guarantee eligibility_decision.directive == SortieDirective.Withhold &
              (((energy_assessment.ready == F |
                 navigation_assessment.ready == F |
                 communication_assessment.ready == F |
                 observation_assessment.ready == F |
                 obstacle_assessment.ready == F |
                 propulsion_assessment.ready == F |
                 recovery_facts.carriedPriority == CarriedPriority.Inhibit) &
                eligibility_decision.reason == EligibilityReason.Equipment) |
               (energy_assessment.ready & navigation_assessment.ready &
                communication_assessment.ready & observation_assessment.ready &
                obstacle_assessment.ready & propulsion_assessment.ready &
                recovery_facts.carriedPriority != CarriedPriority.Inhibit &
                recovery_facts.gate == RecoveryGate.Closed &
                eligibility_decision.reason == EligibilityReason.Recovery) |
               (energy_assessment.ready & navigation_assessment.ready &
                communication_assessment.ready & observation_assessment.ready &
                obstacle_assessment.ready & propulsion_assessment.ready &
                recovery_facts.carriedPriority != CarriedPriority.Inhibit &
                recovery_facts.gate == RecoveryGate.Open &
                (request_phase != RequestPhase.Pending |
                 recovery_facts.carriedPriority == CarriedPriority.Cancel) &
                eligibility_decision.reason == EligibilityReason.NoRequest));
          // @trace CASE-29
          case ELIGIBILITY_PERMIT:
            assume request_phase == RequestPhase.Pending &
              recovery_facts.gate == RecoveryGate.Open &
              energy_assessment.ready & navigation_assessment.ready &
              communication_assessment.ready & observation_assessment.ready &
              obstacle_assessment.ready & propulsion_assessment.ready &
              (recovery_facts.carriedPriority == CarriedPriority.Hold |
               recovery_facts.carriedPriority == CarriedPriority.Submit |
               recovery_facts.carriedPriority == CarriedPriority.Recover);
            guarantee eligibility_decision.directive == SortieDirective.Permit &
              eligibility_decision.reason == EligibilityReason.None;
          // @trace CASE-30
          case ELIGIBILITY_EQUIPMENT_WITHHOLD:
            assume request_phase == RequestPhase.Pending &
              recovery_facts.gate == RecoveryGate.Open &
              recovery_facts.carriedPriority != CarriedPriority.Cancel &
              (energy_assessment.ready == F |
               navigation_assessment.ready == F |
               communication_assessment.ready == F |
               observation_assessment.ready == F |
               obstacle_assessment.ready == F |
               propulsion_assessment.ready == F |
               recovery_facts.carriedPriority == CarriedPriority.Inhibit);
            guarantee eligibility_decision.directive == SortieDirective.Withhold &
              eligibility_decision.reason == EligibilityReason.Equipment;
    }*/
  }

  // @trace PART-12
  part def PermissionReleaseLedger :> Thread {
    // @trace INT-27
    port eligibility_decision : DataPort { in :>> type : EligibilityDecision; }
    // @trace INT-35
    port request_phase : DataPort { in :>> type : RequestPhase; }
    // @trace INT-28
    port release_feedback : DataPort { out :>> type : ReleaseFeedback; }
    // @trace CTRL-01
    port sortie_directive : DataPort { out :>> type : SortieDirective; }

    language "GUMBO" /*{
      state
        // @trace PART-12
        releaseMemory: ReleaseFeedback;
      initialize
        modifies releaseMemory;
        // @trace BEH-01
        guarantee INITIAL_RELEASE_WITHHELD:
          releaseMemory == ReleaseFeedback.NotReleased &
          release_feedback == ReleaseFeedback.NotReleased &
          sortie_directive == SortieDirective.Withhold;
      compute
        modifies releaseMemory;
        // @trace BEH-01
        guarantee ONE_SHOT_RELEASE_OUTPUT:
          ((request_phase == RequestPhase.Pending &
            eligibility_decision.directive == SortieDirective.Permit &
            In(releaseMemory) == ReleaseFeedback.NotReleased &
            sortie_directive == SortieDirective.Permit &
            release_feedback == ReleaseFeedback.Released) |
           ((request_phase != RequestPhase.Pending |
             eligibility_decision.directive != SortieDirective.Permit |
             In(releaseMemory) == ReleaseFeedback.Released) &
            sortie_directive == SortieDirective.Withhold &
            release_feedback == ReleaseFeedback.NotReleased));
        // @trace FAULT-03
        guarantee RELEASE_LEDGER_TRANSITION:
          ((request_phase == RequestPhase.Idle &
            releaseMemory == ReleaseFeedback.NotReleased) |
           (request_phase != RequestPhase.Idle &
            request_phase == RequestPhase.Pending &
            eligibility_decision.directive == SortieDirective.Permit &
            In(releaseMemory) == ReleaseFeedback.NotReleased &
            releaseMemory == ReleaseFeedback.Released) |
           (request_phase != RequestPhase.Idle &
            (request_phase != RequestPhase.Pending |
             eligibility_decision.directive != SortieDirective.Permit |
             In(releaseMemory) == ReleaseFeedback.Released) &
            releaseMemory == In(releaseMemory)));
    }*/
  }

  // @trace PART-13
  part def StatusComposer :> Thread {
    // @trace INT-29
    port eligibility_decision : DataPort { in :>> type : EligibilityDecision; }
    // @trace INT-30
    port fault_summary : DataPort { in :>> type : FaultSummary; }
    // @trace INT-31
    port recovery_phase : DataPort { in :>> type : RecoveryPhase; }
    // @trace INT-32
    port request_phase : DataPort { in :>> type : RequestPhase; }
    // @trace CTRL-02
    port eligibility_status : DataPort { out :>> type : EligibilityStatus; }

    language "GUMBO" /*{
      initialize
        // @trace POL-07
        guarantee INITIAL_STATUS_RECOVERY_REQUIRED:
          eligibility_status.requestPhase == StatusRequestPhase.Idle &
          eligibility_status.faultState == StatusFaultState.Clear &
          eligibility_status.recoveryPhase == StatusRecoveryPhase.Quarantined &
          eligibility_status.decisionDirective == StatusDecision.Withhold &
          eligibility_status.limitingCause == LimitingCause.Recovery;
      compute
        // @trace BEH-02
        guarantee STATUS_PRESERVES_OWNER_FACTS:
          ((request_phase == RequestPhase.Idle &
            eligibility_status.requestPhase == StatusRequestPhase.Idle) |
           (request_phase == RequestPhase.Pending &
            eligibility_status.requestPhase == StatusRequestPhase.Pending) |
           (request_phase == RequestPhase.Released &
            eligibility_status.requestPhase == StatusRequestPhase.Released)) &
          ((fault_summary.faultState == FaultState.Clear &
            eligibility_status.faultState == StatusFaultState.Clear) |
           (fault_summary.faultState == FaultState.Active &
            eligibility_status.faultState == StatusFaultState.Active)) &
          ((recovery_phase == RecoveryPhase.Normal &
            eligibility_status.recoveryPhase == StatusRecoveryPhase.Normal) |
           (recovery_phase == RecoveryPhase.Quarantined &
            eligibility_status.recoveryPhase == StatusRecoveryPhase.Quarantined) |
           (recovery_phase == RecoveryPhase.AwaitingAck &
            eligibility_status.recoveryPhase == StatusRecoveryPhase.AwaitingAck)) &
          ((eligibility_decision.directive == SortieDirective.Withhold &
            eligibility_status.decisionDirective == StatusDecision.Withhold) |
           (eligibility_decision.directive == SortieDirective.Permit &
            eligibility_status.decisionDirective == StatusDecision.Permit));
        // @trace BEH-02
        guarantee STATUS_REFINES_LIMITING_CAUSE:
          ((eligibility_decision.reason == EligibilityReason.None &
            eligibility_status.limitingCause == LimitingCause.None) |
           (eligibility_decision.reason == EligibilityReason.Recovery &
            eligibility_status.limitingCause == LimitingCause.Recovery) |
           (eligibility_decision.reason == EligibilityReason.NoRequest &
            eligibility_status.limitingCause == LimitingCause.NoRequest) |
           (eligibility_decision.reason == EligibilityReason.Equipment &
            ((fault_summary.primaryCause == EquipmentCause.Energy &
              eligibility_status.limitingCause == LimitingCause.Energy) |
             (fault_summary.primaryCause == EquipmentCause.Propulsion &
              eligibility_status.limitingCause == LimitingCause.Propulsion) |
             (fault_summary.primaryCause == EquipmentCause.Navigation &
              eligibility_status.limitingCause == LimitingCause.Navigation) |
             (fault_summary.primaryCause == EquipmentCause.Obstacle &
              eligibility_status.limitingCause == LimitingCause.Obstacle) |
             (fault_summary.primaryCause == EquipmentCause.Observation &
              eligibility_status.limitingCause == LimitingCause.Observation) |
             (fault_summary.primaryCause == EquipmentCause.Communication &
              eligibility_status.limitingCause == LimitingCause.Communication))));
    }*/
  }

  // @generated-support Behavior-free containment and transparent boundary endpoints.
  part def EligibilitySupervisorProcess :> Process {
    port energy_evidence : DataPort { in :>> type : EnergyEvidence; }
    port navigation_evidence : DataPort { in :>> type : NavigationEvidenceRecord; }
    port communication_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port observation_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port obstacle_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port propulsion_evidence : DataPort { in :>> type : PropulsionEvidence; }
    port operator_event : DataPort { in :>> type : OperatorEvent; }
    port sortie_directive : DataPort { out :>> type : SortieDirective; }
    port eligibility_status : DataPort { out :>> type : EligibilityStatus; }

    // Thirteen sibling semantic usages in approved allocation order.
    // @trace PART-01
    part energy_evidence_assessor : EnergyEvidenceAssessor;
    // @trace PART-02
    part navigation_evidence_assessor : NavigationEvidenceAssessor;
    // @trace PART-03
    part communication_evidence_assessor : CommunicationEvidenceAssessor;
    // @trace PART-04
    part observation_evidence_assessor : ObservationEvidenceAssessor;
    // @trace PART-05
    part obstacle_evidence_assessor : ObstacleEvidenceAssessor;
    // @trace PART-06
    part propulsion_evidence_assessor : PropulsionEvidenceAssessor;
    // @trace PART-07
    part request_lifecycle_owner : RequestLifecycleOwner;
    // @trace PART-08
    part fault_registry : FaultRegistry;
    // @trace PART-09
    part priority_arbiter : PriorityArbiter;
    // @trace PART-10
    part recovery_qualification_owner : RecoveryQualificationOwner;
    // @trace PART-11
    part eligibility_decision_owner : EligibilityDecisionOwner;
    // @trace PART-12
    part permission_release_ledger : PermissionReleaseLedger;
    // @trace PART-13
    part status_composer : StatusComposer;

    // Exactly thirty-five directed semantic interactions.
    // @trace INT-01
    connection int01 : PortConnection connect energy_evidence to energy_evidence_assessor.energy_evidence;
    // @trace INT-02
    connection int02 : PortConnection connect navigation_evidence to navigation_evidence_assessor.navigation_evidence;
    // @trace INT-03
    connection int03 : PortConnection connect communication_evidence to communication_evidence_assessor.communication_evidence;
    // @trace INT-04
    connection int04 : PortConnection connect observation_evidence to observation_evidence_assessor.observation_evidence;
    // @trace INT-05
    connection int05 : PortConnection connect obstacle_evidence to obstacle_evidence_assessor.obstacle_evidence;
    // @trace INT-06
    connection int06 : PortConnection connect propulsion_evidence to propulsion_evidence_assessor.propulsion_evidence;
    // @trace INT-07
    connection int07 : PortConnection connect operator_event to request_lifecycle_owner.operator_event;
    // @trace INT-08
    connection int08 : PortConnection connect energy_evidence_assessor.energy_assessment to fault_registry.energy_assessment;
    // @trace INT-09
    connection int09 : PortConnection connect navigation_evidence_assessor.navigation_assessment to fault_registry.navigation_assessment;
    // @trace INT-10
    connection int10 : PortConnection connect communication_evidence_assessor.communication_assessment to fault_registry.communication_assessment;
    // @trace INT-11
    connection int11 : PortConnection connect observation_evidence_assessor.observation_assessment to fault_registry.observation_assessment;
    // @trace INT-12
    connection int12 : PortConnection connect obstacle_evidence_assessor.obstacle_assessment to fault_registry.obstacle_assessment;
    // @trace INT-13
    connection int13 : PortConnection connect propulsion_evidence_assessor.propulsion_assessment to fault_registry.propulsion_assessment;
    // @trace INT-14
    connection int14 : PortConnection connect energy_evidence_assessor.energy_assessment to eligibility_decision_owner.energy_assessment;
    // @trace INT-15
    connection int15 : PortConnection connect navigation_evidence_assessor.navigation_assessment to eligibility_decision_owner.navigation_assessment;
    // @trace INT-16
    connection int16 : PortConnection connect communication_evidence_assessor.communication_assessment to eligibility_decision_owner.communication_assessment;
    // @trace INT-17
    connection int17 : PortConnection connect observation_evidence_assessor.observation_assessment to eligibility_decision_owner.observation_assessment;
    // @trace INT-18
    connection int18 : PortConnection connect obstacle_evidence_assessor.obstacle_assessment to eligibility_decision_owner.obstacle_assessment;
    // @trace INT-19
    connection int19 : PortConnection connect propulsion_evidence_assessor.propulsion_assessment to eligibility_decision_owner.propulsion_assessment;
    // @trace INT-20
    connection int20 : PortConnection connect request_lifecycle_owner.candidate_event to priority_arbiter.candidate_event;
    // @trace INT-21
    connection int21 : PortConnection connect fault_registry.fault_summary to priority_arbiter.fault_summary;
    // @trace INT-22
    connection int22 : PortConnection connect priority_arbiter.accepted_directive to request_lifecycle_owner.accepted_directive;
    // @trace INT-23
    connection int23 : PortConnection connect priority_arbiter.accepted_directive to recovery_qualification_owner.accepted_directive;
    // @trace INT-24
    connection int24 : PortConnection connect fault_registry.fault_summary to recovery_qualification_owner.fault_summary;
    // @trace INT-25
    connection int25 : PortConnection connect recovery_qualification_owner.recovery_facts to eligibility_decision_owner.recovery_facts;
    // @trace INT-26
    connection int26 : PortConnection connect request_lifecycle_owner.request_phase to eligibility_decision_owner.request_phase;
    // @trace INT-27
    connection int27 : PortConnection connect eligibility_decision_owner.eligibility_decision to permission_release_ledger.eligibility_decision;
    // @trace INT-28
    connection int28 : PortConnection connect permission_release_ledger.release_feedback to request_lifecycle_owner.release_feedback;
    // @trace INT-29
    connection int29 : PortConnection connect eligibility_decision_owner.eligibility_decision to status_composer.eligibility_decision;
    // @trace INT-30
    connection int30 : PortConnection connect fault_registry.fault_summary to status_composer.fault_summary;
    // @trace INT-31
    connection int31 : PortConnection connect recovery_qualification_owner.recovery_phase to status_composer.recovery_phase;
    // @trace INT-32
    connection int32 : PortConnection connect request_lifecycle_owner.request_phase to status_composer.request_phase;
    // @trace INT-33
    connection int33 : PortConnection connect permission_release_ledger.sortie_directive to sortie_directive;
    // @trace INT-34
    connection int34 : PortConnection connect status_composer.eligibility_status to eligibility_status;
    // @trace INT-35
    connection int35 : PortConnection connect request_lifecycle_owner.request_phase to permission_release_ledger.request_phase;

  }

  // @trace BOUND-01
  part def ObservationSortieEligibilitySupervisorSystem :> System {
    // @trace MON-01
    port energy_evidence : DataPort { in :>> type : EnergyEvidence; }
    // @trace MON-02
    port navigation_evidence : DataPort { in :>> type : NavigationEvidenceRecord; }
    // @trace MON-03
    port communication_evidence : DataPort { in :>> type : EquipmentEvidence; }
    // @trace MON-04
    port observation_evidence : DataPort { in :>> type : EquipmentEvidence; }
    // @trace MON-05
    port obstacle_evidence : DataPort { in :>> type : EquipmentEvidence; }
    // @trace MON-06
    port propulsion_evidence : DataPort { in :>> type : PropulsionEvidence; }
    // @trace MON-07
    port operator_event : DataPort { in :>> type : OperatorEvent; }
    // @trace CTRL-01
    port sortie_eligibility_directive : DataPort { out :>> type : SortieDirective; }
    // @trace CTRL-02
    port eligibility_status : DataPort { out :>> type : EligibilityStatus; }

    // @generated-support Sole behavior-free Process.
    part eligibility_supervisor_process : EligibilitySupervisorProcess;

    // @generated-support Eighteen unchanged boundary-delegation declarations
    // authorized by SUPPORT-01; the paired declarations carry no semantic credit.
    connection support01 : PortConnection connect energy_evidence to eligibility_supervisor_process.energy_evidence;
    connection support02 : PortConnection connect navigation_evidence to eligibility_supervisor_process.navigation_evidence;
    connection support03 : PortConnection connect communication_evidence to eligibility_supervisor_process.communication_evidence;
    connection support04 : PortConnection connect observation_evidence to eligibility_supervisor_process.observation_evidence;
    connection support05 : PortConnection connect obstacle_evidence to eligibility_supervisor_process.obstacle_evidence;
    connection support06 : PortConnection connect propulsion_evidence to eligibility_supervisor_process.propulsion_evidence;
    connection support07 : PortConnection connect operator_event to eligibility_supervisor_process.operator_event;
    connection support08 : PortConnection connect eligibility_supervisor_process.sortie_directive to sortie_eligibility_directive;
    connection support09 : PortConnection connect eligibility_supervisor_process.eligibility_status to eligibility_status;
    connection support10 : PortConnection connect energy_evidence to eligibility_supervisor_process.energy_evidence;
    connection support11 : PortConnection connect navigation_evidence to eligibility_supervisor_process.navigation_evidence;
    connection support12 : PortConnection connect communication_evidence to eligibility_supervisor_process.communication_evidence;
    connection support13 : PortConnection connect observation_evidence to eligibility_supervisor_process.observation_evidence;
    connection support14 : PortConnection connect obstacle_evidence to eligibility_supervisor_process.obstacle_evidence;
    connection support15 : PortConnection connect propulsion_evidence to eligibility_supervisor_process.propulsion_evidence;
    connection support16 : PortConnection connect operator_event to eligibility_supervisor_process.operator_event;
    connection support17 : PortConnection connect eligibility_supervisor_process.sortie_directive to sortie_eligibility_directive;
    connection support18 : PortConnection connect eligibility_supervisor_process.eligibility_status to eligibility_status;
  }

  // Exactly one explicit root System usage.
  // @trace SCOPE-01
  part observation_sortie_eligibility_supervisor : ObservationSortieEligibilitySupervisorSystem;
}
