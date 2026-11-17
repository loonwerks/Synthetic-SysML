// Canonical contract-bearing source generated from the retained architecture checkpoint.
package Observation_Sortie_Eligibility_Supervisor {
  private import HAMR::*;

  // Finite boundary and policy domains.
  enum def EnergyQuality { enum Nominal; enum Limited; enum Unavailable; enum Unknown; }
  enum def EquipmentCondition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def GpsCondition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def InertialCondition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def BarometricCondition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def Engine1Condition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def Engine2Condition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def Engine3Condition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def Engine4Condition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def Validity { enum Valid; enum Invalid; }
  enum def Freshness { enum Current; enum Stale; }
  enum def Confirmation { enum Confirmed; enum NotConfirmed; }
  enum def OperatorEvent { enum None; enum Submit; enum Cancel; enum AcknowledgeRecovery; }
  enum def RequestPhase { enum Idle; enum Pending; enum Released; }
  enum def RecoveryPhase { enum Normal; enum Quarantined; enum AwaitingAck; }
  enum def PriorityDirective { enum Inhibit; enum Cancel; enum Recover; enum Submit; enum Hold; }
  enum def CarriedPriority { enum Inhibit; enum Cancel; enum Recover; enum Submit; enum Hold; }
  enum def RecoveryGate { enum Open; enum Closed; }
  enum def SortieDirective { enum Withhold; enum Permit; }
  enum def EligibilityReason { enum None; enum Equipment; enum Recovery; enum NoRequest; }
  enum def ReleaseFeedback { enum NotReleased; enum Released; }
  enum def FaultState { enum Clear; enum Active; }
  enum def EquipmentCause { enum None; enum Energy; enum Propulsion; enum Navigation; enum Obstacle; enum Observation; enum Communication; }
  enum def LimitingCause { enum None; enum Energy; enum Propulsion; enum Navigation; enum Obstacle; enum Observation; enum Communication; enum Recovery; enum NoRequest; }
  enum def StatusRequestPhase { enum Idle; enum Pending; enum Released; }
  enum def StatusFaultState { enum Clear; enum Active; }
  enum def StatusRecoveryPhase { enum Normal; enum Quarantined; enum AwaitingAck; }
  enum def StatusDecision { enum Withhold; enum Permit; }
  enum def EnergyCause { enum None; enum Invalid; enum Stale; enum UnavailableOrUnknown; enum Limited; }
  enum def NavigationCause { enum None; enum Invalid; enum Stale; enum Gps; enum Inertial; enum Barometric; }
  enum def SingleEquipmentCause { enum None; enum Invalid; enum Stale; enum Condition; }
  enum def PropulsionCause { enum None; enum Invalid; enum Stale; enum Configuration; enum Engine1; enum Engine2; enum Engine3; enum Engine4; }

  // Every record field inspected by GUMBO is a direct attribute.
  part def EnergyEvidence :> Data {
    attribute quality : EnergyQuality;
    attribute validity : Validity;
    attribute freshness : Freshness;
  }
  part def NavigationEvidenceRecord :> Data {
    attribute gpsCondition : GpsCondition;
    attribute inertial : InertialCondition;
    attribute barometric : BarometricCondition;
    attribute validity : Validity;
    attribute freshness : Freshness;
  }
  part def EquipmentEvidence :> Data {
    attribute condition : EquipmentCondition;
    attribute validity : Validity;
    attribute freshness : Freshness;
  }
  part def PropulsionEvidence :> Data {
    attribute engine1 : Engine1Condition;
    attribute engine2 : Engine2Condition;
    attribute engine3 : Engine3Condition;
    attribute engine4 : Engine4Condition;
    attribute validity : Validity;
    attribute freshness : Freshness;
    attribute alternatingKindsConfirmed : Confirmation;
  }
  part def EnergyAssessment :> Data {
    attribute ready : Base_Types::Boolean;
    attribute localCause : EnergyCause;
  }
  part def NavigationAssessment :> Data {
    attribute ready : Base_Types::Boolean;
    attribute localCause : NavigationCause;
  }
  part def SingleEquipmentAssessment :> Data {
    attribute ready : Base_Types::Boolean;
    attribute localCause : SingleEquipmentCause;
  }
  part def PropulsionAssessment :> Data {
    attribute ready : Base_Types::Boolean;
    attribute localCause : PropulsionCause;
  }
  part def FaultSummary :> Data {
    attribute faultState : FaultState;
    attribute primaryCause : EquipmentCause;
  }
  part def RecoveryFacts :> Data {
    attribute phase : RecoveryPhase;
    attribute gate : RecoveryGate;
    attribute carriedPriority : CarriedPriority;
  }
  part def EligibilityDecision :> Data {
    attribute directive : SortieDirective;
    attribute reason : EligibilityReason;
  }
  part def EligibilityStatus :> Data {
    attribute requestPhase : StatusRequestPhase;
    attribute faultState : StatusFaultState;
    attribute recoveryPhase : StatusRecoveryPhase;
    attribute decisionDirective : StatusDecision;
    attribute limitingCause : LimitingCause;
  }

  part def EnergyEvidenceAssessor :> Thread {
    port energy_evidence : DataPort { in :>> type : EnergyEvidence; }
    port energy_assessment : DataPort { out :>> type : EnergyAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_ENERGY_NOT_READY:
          not energy_assessment.ready &
          energy_assessment.localCause == EnergyCause.Invalid;

      compute
        compute_cases
          case ENERGY_READY:
            assume energy_evidence.validity == Validity.Valid &
                   energy_evidence.freshness == Freshness.Current &
                   energy_evidence.quality == EnergyQuality.Nominal;
            guarantee energy_assessment.ready &
                      energy_assessment.localCause == EnergyCause.None;

          case ENERGY_NOT_READY_INVALID:
            assume energy_evidence.validity == Validity.Invalid;
            guarantee not energy_assessment.ready &
                      energy_assessment.localCause == EnergyCause.Invalid;

          case ENERGY_NOT_READY_STALE:
            assume energy_evidence.validity == Validity.Valid &
                   energy_evidence.freshness == Freshness.Stale;
            guarantee not energy_assessment.ready &
                      energy_assessment.localCause == EnergyCause.Stale;

          case ENERGY_NOT_READY_UNAVAILABLE_OR_UNKNOWN:
            assume energy_evidence.validity == Validity.Valid &
                   energy_evidence.freshness == Freshness.Current &
                   (energy_evidence.quality == EnergyQuality.Unavailable |
                    energy_evidence.quality == EnergyQuality.Unknown);
            guarantee not energy_assessment.ready &
                      energy_assessment.localCause == EnergyCause.UnavailableOrUnknown;

          case ENERGY_NOT_READY_LIMITED:
            assume energy_evidence.validity == Validity.Valid &
                   energy_evidence.freshness == Freshness.Current &
                   energy_evidence.quality == EnergyQuality.Limited;
            guarantee not energy_assessment.ready &
                      energy_assessment.localCause == EnergyCause.Limited;
    }*/
  }

  part def NavigationEvidenceAssessor :> Thread {
    port navigation_evidence : DataPort { in :>> type : NavigationEvidenceRecord; }
    port navigation_assessment : DataPort { out :>> type : NavigationAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_NAVIGATION_NOT_READY:
          not navigation_assessment.ready &
          navigation_assessment.localCause == NavigationCause.Invalid;

      compute
        compute_cases
          case NAVIGATION_READY:
            assume navigation_evidence.validity == Validity.Valid &
              navigation_evidence.freshness == Freshness.Current &
              navigation_evidence.gpsCondition == GpsCondition.Nominal &
              navigation_evidence.inertial == InertialCondition.Nominal &
              navigation_evidence.barometric == BarometricCondition.Nominal;
            guarantee navigation_assessment.ready &
              navigation_assessment.localCause == NavigationCause.None;
          case NAVIGATION_INVALID:
            assume navigation_evidence.validity == Validity.Invalid;
            guarantee not navigation_assessment.ready &
              navigation_assessment.localCause == NavigationCause.Invalid;
          case NAVIGATION_STALE:
            assume navigation_evidence.validity == Validity.Valid &
              navigation_evidence.freshness == Freshness.Stale;
            guarantee not navigation_assessment.ready &
              navigation_assessment.localCause == NavigationCause.Stale;
          case NAVIGATION_GPS:
            assume navigation_evidence.validity == Validity.Valid &
              navigation_evidence.freshness == Freshness.Current &
              navigation_evidence.gpsCondition != GpsCondition.Nominal;
            guarantee not navigation_assessment.ready &
              navigation_assessment.localCause == NavigationCause.Gps;
          case NAVIGATION_INERTIAL:
            assume navigation_evidence.validity == Validity.Valid &
              navigation_evidence.freshness == Freshness.Current &
              navigation_evidence.gpsCondition == GpsCondition.Nominal &
              navigation_evidence.inertial != InertialCondition.Nominal;
            guarantee not navigation_assessment.ready &
              navigation_assessment.localCause == NavigationCause.Inertial;
          case NAVIGATION_BAROMETRIC:
            assume navigation_evidence.validity == Validity.Valid &
              navigation_evidence.freshness == Freshness.Current &
              navigation_evidence.gpsCondition == GpsCondition.Nominal &
              navigation_evidence.inertial == InertialCondition.Nominal &
              navigation_evidence.barometric != BarometricCondition.Nominal;
            guarantee not navigation_assessment.ready &
              navigation_assessment.localCause == NavigationCause.Barometric;
    }*/
  }

  part def CommunicationEvidenceAssessor :> Thread {
    port communication_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port communication_assessment : DataPort { out :>> type : SingleEquipmentAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_COMMUNICATION_NOT_READY:
          not communication_assessment.ready &
          communication_assessment.localCause == SingleEquipmentCause.Invalid;
      compute
        compute_cases
          case COMMUNICATION_READY:
            assume communication_evidence.validity == Validity.Valid &
              communication_evidence.freshness == Freshness.Current &
              communication_evidence.condition == EquipmentCondition.Nominal;
            guarantee communication_assessment.ready &
              communication_assessment.localCause == SingleEquipmentCause.None;
          case COMMUNICATION_INVALID:
            assume communication_evidence.validity == Validity.Invalid;
            guarantee not communication_assessment.ready &
              communication_assessment.localCause == SingleEquipmentCause.Invalid;
          case COMMUNICATION_STALE:
            assume communication_evidence.validity == Validity.Valid &
              communication_evidence.freshness == Freshness.Stale;
            guarantee not communication_assessment.ready &
              communication_assessment.localCause == SingleEquipmentCause.Stale;
          case COMMUNICATION_CONDITION:
            assume communication_evidence.validity == Validity.Valid &
              communication_evidence.freshness == Freshness.Current &
              communication_evidence.condition != EquipmentCondition.Nominal;
            guarantee not communication_assessment.ready &
              communication_assessment.localCause == SingleEquipmentCause.Condition;
    }*/
  }

  part def ObservationEvidenceAssessor :> Thread {
    port observation_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port observation_assessment : DataPort { out :>> type : SingleEquipmentAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_OBSERVATION_NOT_READY:
          not observation_assessment.ready &
          observation_assessment.localCause == SingleEquipmentCause.Invalid;
      compute
        compute_cases
          case OBSERVATION_READY:
            assume observation_evidence.validity == Validity.Valid &
              observation_evidence.freshness == Freshness.Current &
              observation_evidence.condition == EquipmentCondition.Nominal;
            guarantee observation_assessment.ready &
              observation_assessment.localCause == SingleEquipmentCause.None;
          case OBSERVATION_INVALID:
            assume observation_evidence.validity == Validity.Invalid;
            guarantee not observation_assessment.ready &
              observation_assessment.localCause == SingleEquipmentCause.Invalid;
          case OBSERVATION_STALE:
            assume observation_evidence.validity == Validity.Valid &
              observation_evidence.freshness == Freshness.Stale;
            guarantee not observation_assessment.ready &
              observation_assessment.localCause == SingleEquipmentCause.Stale;
          case OBSERVATION_CONDITION:
            assume observation_evidence.validity == Validity.Valid &
              observation_evidence.freshness == Freshness.Current &
              observation_evidence.condition != EquipmentCondition.Nominal;
            guarantee not observation_assessment.ready &
              observation_assessment.localCause == SingleEquipmentCause.Condition;
    }*/
  }

  part def ObstacleEvidenceAssessor :> Thread {
    port obstacle_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port obstacle_assessment : DataPort { out :>> type : SingleEquipmentAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_OBSTACLE_NOT_READY:
          not obstacle_assessment.ready &
          obstacle_assessment.localCause == SingleEquipmentCause.Invalid;
      compute
        compute_cases
          case OBSTACLE_READY:
            assume obstacle_evidence.validity == Validity.Valid &
              obstacle_evidence.freshness == Freshness.Current &
              obstacle_evidence.condition == EquipmentCondition.Nominal;
            guarantee obstacle_assessment.ready &
              obstacle_assessment.localCause == SingleEquipmentCause.None;
          case OBSTACLE_INVALID:
            assume obstacle_evidence.validity == Validity.Invalid;
            guarantee not obstacle_assessment.ready &
              obstacle_assessment.localCause == SingleEquipmentCause.Invalid;
          case OBSTACLE_STALE:
            assume obstacle_evidence.validity == Validity.Valid &
              obstacle_evidence.freshness == Freshness.Stale;
            guarantee not obstacle_assessment.ready &
              obstacle_assessment.localCause == SingleEquipmentCause.Stale;
          case OBSTACLE_CONDITION:
            assume obstacle_evidence.validity == Validity.Valid &
              obstacle_evidence.freshness == Freshness.Current &
              obstacle_evidence.condition != EquipmentCondition.Nominal;
            guarantee not obstacle_assessment.ready &
              obstacle_assessment.localCause == SingleEquipmentCause.Condition;
    }*/
  }

  part def PropulsionEvidenceAssessor :> Thread {
    port propulsion_evidence : DataPort { in :>> type : PropulsionEvidence; }
    port propulsion_assessment : DataPort { out :>> type : PropulsionAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_PROPULSION_NOT_READY:
          not propulsion_assessment.ready &
          propulsion_assessment.localCause == PropulsionCause.Invalid;
      compute
        compute_cases
          case PROPULSION_READY:
            assume propulsion_evidence.validity == Validity.Valid &
              propulsion_evidence.freshness == Freshness.Current &
              propulsion_evidence.alternatingKindsConfirmed == Confirmation.Confirmed &
              propulsion_evidence.engine1 == Engine1Condition.Nominal &
              propulsion_evidence.engine2 == Engine2Condition.Nominal &
              propulsion_evidence.engine3 == Engine3Condition.Nominal &
              propulsion_evidence.engine4 == Engine4Condition.Nominal;
            guarantee propulsion_assessment.ready &
              propulsion_assessment.localCause == PropulsionCause.None;
          case PROPULSION_INVALID:
            assume propulsion_evidence.validity == Validity.Invalid;
            guarantee not propulsion_assessment.ready &
              propulsion_assessment.localCause == PropulsionCause.Invalid;
          case PROPULSION_STALE:
            assume propulsion_evidence.validity == Validity.Valid &
              propulsion_evidence.freshness == Freshness.Stale;
            guarantee not propulsion_assessment.ready &
              propulsion_assessment.localCause == PropulsionCause.Stale;
          case PROPULSION_CONFIGURATION:
            assume propulsion_evidence.validity == Validity.Valid &
              propulsion_evidence.freshness == Freshness.Current &
              propulsion_evidence.alternatingKindsConfirmed == Confirmation.NotConfirmed;
            guarantee not propulsion_assessment.ready &
              propulsion_assessment.localCause == PropulsionCause.Configuration;
          case PROPULSION_ENGINE1:
            assume propulsion_evidence.validity == Validity.Valid &
              propulsion_evidence.freshness == Freshness.Current &
              propulsion_evidence.alternatingKindsConfirmed == Confirmation.Confirmed &
              propulsion_evidence.engine1 != Engine1Condition.Nominal;
            guarantee not propulsion_assessment.ready &
              propulsion_assessment.localCause == PropulsionCause.Engine1;
          case PROPULSION_ENGINE2:
            assume propulsion_evidence.validity == Validity.Valid &
              propulsion_evidence.freshness == Freshness.Current &
              propulsion_evidence.alternatingKindsConfirmed == Confirmation.Confirmed &
              propulsion_evidence.engine1 == Engine1Condition.Nominal &
              propulsion_evidence.engine2 != Engine2Condition.Nominal;
            guarantee not propulsion_assessment.ready &
              propulsion_assessment.localCause == PropulsionCause.Engine2;
          case PROPULSION_ENGINE3:
            assume propulsion_evidence.validity == Validity.Valid &
              propulsion_evidence.freshness == Freshness.Current &
              propulsion_evidence.alternatingKindsConfirmed == Confirmation.Confirmed &
              propulsion_evidence.engine1 == Engine1Condition.Nominal &
              propulsion_evidence.engine2 == Engine2Condition.Nominal &
              propulsion_evidence.engine3 != Engine3Condition.Nominal;
            guarantee not propulsion_assessment.ready &
              propulsion_assessment.localCause == PropulsionCause.Engine3;
          case PROPULSION_ENGINE4:
            assume propulsion_evidence.validity == Validity.Valid &
              propulsion_evidence.freshness == Freshness.Current &
              propulsion_evidence.alternatingKindsConfirmed == Confirmation.Confirmed &
              propulsion_evidence.engine1 == Engine1Condition.Nominal &
              propulsion_evidence.engine2 == Engine2Condition.Nominal &
              propulsion_evidence.engine3 == Engine3Condition.Nominal &
              propulsion_evidence.engine4 != Engine4Condition.Nominal;
            guarantee not propulsion_assessment.ready &
              propulsion_assessment.localCause == PropulsionCause.Engine4;
    }*/
  }

  part def RequestLifecycleOwner :> Thread {
    port operator_event : DataPort { in :>> type : OperatorEvent; }
    port accepted_directive : DataPort { in :>> type : PriorityDirective; }
    port release_feedback : DataPort { in :>> type : ReleaseFeedback; }
    port candidate_event : DataPort { out :>> type : OperatorEvent; }
    port request_phase : DataPort { out :>> type : RequestPhase; }

    language "GUMBO" /*{
      state
        requestMemory: RequestPhase;
      initialize
        guarantee INITIAL_REQUEST_IDLE:
          requestMemory == RequestPhase.Idle &
          request_phase == RequestPhase.Idle &
          candidate_event == OperatorEvent.None;
      compute
        guarantee CANDIDATE_EVENT_PUBLISHED:
          candidate_event == operator_event;
        compute_cases
          case REQUEST_CANCEL:
            assume accepted_directive == PriorityDirective.Cancel;
            guarantee requestMemory == RequestPhase.Idle;
          case REQUEST_FRESH_SUBMIT:
            assume accepted_directive == PriorityDirective.Submit &
              requestMemory == RequestPhase.Idle;
            guarantee requestMemory == RequestPhase.Pending;
          case REQUEST_RELEASE_FEEDBACK:
            assume accepted_directive != PriorityDirective.Cancel &
              requestMemory == RequestPhase.Pending &
              release_feedback == ReleaseFeedback.Released;
            guarantee requestMemory == RequestPhase.Released;
          case REQUEST_REARM:
            assume requestMemory == RequestPhase.Released &
              accepted_directive == PriorityDirective.Hold;
            guarantee requestMemory == RequestPhase.Idle;
    }*/
  }

  part def FaultRegistry :> Thread {
    port energy_assessment : DataPort { in :>> type : EnergyAssessment; }
    port navigation_assessment : DataPort { in :>> type : NavigationAssessment; }
    port communication_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    port observation_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    port obstacle_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    port propulsion_assessment : DataPort { in :>> type : PropulsionAssessment; }
    port fault_summary : DataPort { out :>> type : FaultSummary; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_FAULT_CLEAR:
          fault_summary.faultState == FaultState.Clear &
          fault_summary.primaryCause == EquipmentCause.None;
      compute
        compute_cases
          case FAULT_ENERGY:
            assume not energy_assessment.ready;
            guarantee fault_summary.faultState == FaultState.Active &
              fault_summary.primaryCause == EquipmentCause.Energy;
          case FAULT_PROPULSION:
            assume energy_assessment.ready & not propulsion_assessment.ready;
            guarantee fault_summary.faultState == FaultState.Active &
              fault_summary.primaryCause == EquipmentCause.Propulsion;
          case FAULT_NAVIGATION:
            assume energy_assessment.ready & propulsion_assessment.ready &
              not navigation_assessment.ready;
            guarantee fault_summary.faultState == FaultState.Active &
              fault_summary.primaryCause == EquipmentCause.Navigation;
          case FAULT_OBSTACLE:
            assume energy_assessment.ready & propulsion_assessment.ready &
              navigation_assessment.ready & not obstacle_assessment.ready;
            guarantee fault_summary.faultState == FaultState.Active &
              fault_summary.primaryCause == EquipmentCause.Obstacle;
          case FAULT_OBSERVATION:
            assume energy_assessment.ready & propulsion_assessment.ready &
              navigation_assessment.ready & obstacle_assessment.ready &
              not observation_assessment.ready;
            guarantee fault_summary.faultState == FaultState.Active &
              fault_summary.primaryCause == EquipmentCause.Observation;
          case FAULT_COMMUNICATION:
            assume energy_assessment.ready & propulsion_assessment.ready &
              navigation_assessment.ready & obstacle_assessment.ready &
              observation_assessment.ready & not communication_assessment.ready;
            guarantee fault_summary.faultState == FaultState.Active &
              fault_summary.primaryCause == EquipmentCause.Communication;
          case FAULT_CLEAR:
            assume energy_assessment.ready & propulsion_assessment.ready &
              navigation_assessment.ready & obstacle_assessment.ready &
              observation_assessment.ready & communication_assessment.ready;
            guarantee fault_summary.faultState == FaultState.Clear &
              fault_summary.primaryCause == EquipmentCause.None;
    }*/
  }

  part def PriorityArbiter :> Thread {
    port candidate_event : DataPort { in :>> type : OperatorEvent; }
    port fault_summary : DataPort { in :>> type : FaultSummary; }
    port accepted_directive : DataPort { out :>> type : PriorityDirective; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_PRIORITY_INHIBIT:
          accepted_directive == PriorityDirective.Inhibit;
      compute
        compute_cases
          case PRIORITY_ACTIVE_FAULT:
            assume fault_summary.faultState == FaultState.Active;
            guarantee accepted_directive == PriorityDirective.Inhibit;
          case PRIORITY_CANCEL:
            assume fault_summary.faultState == FaultState.Clear &
              candidate_event == OperatorEvent.Cancel;
            guarantee accepted_directive == PriorityDirective.Cancel;
          case PRIORITY_RECOVER:
            assume fault_summary.faultState == FaultState.Clear &
              candidate_event == OperatorEvent.AcknowledgeRecovery;
            guarantee accepted_directive == PriorityDirective.Recover;
          case PRIORITY_SUBMIT:
            assume fault_summary.faultState == FaultState.Clear &
              candidate_event == OperatorEvent.Submit;
            guarantee accepted_directive == PriorityDirective.Submit;
          case PRIORITY_HOLD:
            assume fault_summary.faultState == FaultState.Clear &
              candidate_event == OperatorEvent.None;
            guarantee accepted_directive == PriorityDirective.Hold;
    }*/
  }

  part def RecoveryQualificationOwner :> Thread {
    port accepted_directive : DataPort { in :>> type : PriorityDirective; }
    port fault_summary : DataPort { in :>> type : FaultSummary; }
    port recovery_facts : DataPort { out :>> type : RecoveryFacts; }
    port recovery_phase : DataPort { out :>> type : RecoveryPhase; }

    language "GUMBO" /*{
      state
        recoveryMemory: RecoveryPhase;
      initialize
        guarantee INITIAL_RECOVERY_QUARANTINED:
          recoveryMemory == RecoveryPhase.Quarantined &
          recovery_facts.phase == RecoveryPhase.Quarantined &
          recovery_facts.gate == RecoveryGate.Closed &
          recovery_facts.carriedPriority == CarriedPriority.Inhibit &
          recovery_phase == RecoveryPhase.Quarantined;
      compute
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
          case RECOVERY_CURRENT_FAULT:
            assume fault_summary.faultState == FaultState.Active;
            guarantee recoveryMemory == RecoveryPhase.Quarantined &
              recovery_facts.gate == RecoveryGate.Closed;
          case RECOVERY_OPEN:
            assume fault_summary.faultState == FaultState.Clear &
              accepted_directive == PriorityDirective.Recover;
            guarantee recoveryMemory == RecoveryPhase.Normal &
              recovery_facts.gate == RecoveryGate.Open;
          case RECOVERY_AWAITING_ACK:
            assume fault_summary.faultState == FaultState.Clear &
              accepted_directive != PriorityDirective.Recover &
              recoveryMemory != RecoveryPhase.Normal;
            guarantee recoveryMemory == RecoveryPhase.AwaitingAck &
              recovery_facts.gate == RecoveryGate.Closed;
    }*/
  }

  part def EligibilityDecisionOwner :> Thread {
    port energy_assessment : DataPort { in :>> type : EnergyAssessment; }
    port navigation_assessment : DataPort { in :>> type : NavigationAssessment; }
    port communication_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    port observation_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    port obstacle_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    port propulsion_assessment : DataPort { in :>> type : PropulsionAssessment; }
    port recovery_facts : DataPort { in :>> type : RecoveryFacts; }
    port request_phase : DataPort { in :>> type : RequestPhase; }
    port eligibility_decision : DataPort { out :>> type : EligibilityDecision; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_ELIGIBILITY_WITHHELD:
          eligibility_decision.directive == SortieDirective.Withhold &
          eligibility_decision.reason == EligibilityReason.Recovery;
      compute
        compute_cases
          case ELIGIBILITY_EQUIPMENT_WITHHOLD:
            assume not energy_assessment.ready | not navigation_assessment.ready |
              not communication_assessment.ready | not observation_assessment.ready |
              not obstacle_assessment.ready | not propulsion_assessment.ready |
              recovery_facts.carriedPriority == CarriedPriority.Inhibit;
            guarantee eligibility_decision.directive == SortieDirective.Withhold &
              eligibility_decision.reason == EligibilityReason.Equipment;
          case ELIGIBILITY_RECOVERY_WITHHOLD:
            assume energy_assessment.ready & navigation_assessment.ready &
              communication_assessment.ready & observation_assessment.ready &
              obstacle_assessment.ready & propulsion_assessment.ready &
              recovery_facts.carriedPriority != CarriedPriority.Inhibit &
              recovery_facts.gate == RecoveryGate.Closed;
            guarantee eligibility_decision.directive == SortieDirective.Withhold &
              eligibility_decision.reason == EligibilityReason.Recovery;
          case ELIGIBILITY_NO_REQUEST_WITHHOLD:
            assume energy_assessment.ready & navigation_assessment.ready &
              communication_assessment.ready & observation_assessment.ready &
              obstacle_assessment.ready & propulsion_assessment.ready &
              recovery_facts.carriedPriority != CarriedPriority.Inhibit &
              recovery_facts.gate == RecoveryGate.Open &
              (request_phase != RequestPhase.Pending |
               recovery_facts.carriedPriority == CarriedPriority.Cancel);
            guarantee eligibility_decision.directive == SortieDirective.Withhold &
              eligibility_decision.reason == EligibilityReason.NoRequest;
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
    }*/
  }

  part def PermissionReleaseLedger :> Thread {
    port eligibility_decision : DataPort { in :>> type : EligibilityDecision; }
    port request_phase : DataPort { in :>> type : RequestPhase; }
    port release_feedback : DataPort { out :>> type : ReleaseFeedback; }
    port sortie_directive : DataPort { out :>> type : SortieDirective; }

    language "GUMBO" /*{
      state
        releaseMemory: ReleaseFeedback;
      initialize
        guarantee INITIAL_RELEASE_WITHHELD:
          releaseMemory == ReleaseFeedback.NotReleased &
          release_feedback == ReleaseFeedback.NotReleased &
          sortie_directive == SortieDirective.Withhold;
      compute
        compute_cases
          case ONE_SHOT_RELEASE_OUTPUT:
            assume request_phase == RequestPhase.Pending &
              eligibility_decision.directive == SortieDirective.Permit &
              releaseMemory == ReleaseFeedback.NotReleased;
            guarantee sortie_directive == SortieDirective.Permit &
              release_feedback == ReleaseFeedback.Released &
              releaseMemory == ReleaseFeedback.Released;
          case RELEASE_WITHHELD:
            assume request_phase != RequestPhase.Pending |
              eligibility_decision.directive != SortieDirective.Permit |
              releaseMemory == ReleaseFeedback.Released;
            guarantee sortie_directive == SortieDirective.Withhold &
              release_feedback == ReleaseFeedback.NotReleased;
          case RELEASE_RESET:
            assume request_phase == RequestPhase.Idle;
            guarantee releaseMemory == ReleaseFeedback.NotReleased;
    }*/
  }

  part def StatusComposer :> Thread {
    port eligibility_decision : DataPort { in :>> type : EligibilityDecision; }
    port fault_summary : DataPort { in :>> type : FaultSummary; }
    port recovery_phase : DataPort { in :>> type : RecoveryPhase; }
    port request_phase : DataPort { in :>> type : RequestPhase; }
    port eligibility_status : DataPort { out :>> type : EligibilityStatus; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_STATUS_RECOVERY_REQUIRED:
          eligibility_status.requestPhase == StatusRequestPhase.Idle &
          eligibility_status.faultState == StatusFaultState.Clear &
          eligibility_status.recoveryPhase == StatusRecoveryPhase.Quarantined &
          eligibility_status.decisionDirective == StatusDecision.Withhold &
          eligibility_status.limitingCause == LimitingCause.Recovery;
      compute
        compute_cases
          case STATUS_OWNER_FACTS:
            assume T;
            guarantee
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
          case STATUS_NO_LIMIT:
            assume eligibility_decision.reason == EligibilityReason.None;
            guarantee eligibility_status.limitingCause == LimitingCause.None;
          case STATUS_RECOVERY_LIMIT:
            assume eligibility_decision.reason == EligibilityReason.Recovery;
            guarantee eligibility_status.limitingCause == LimitingCause.Recovery;
          case STATUS_NO_REQUEST_LIMIT:
            assume eligibility_decision.reason == EligibilityReason.NoRequest;
            guarantee eligibility_status.limitingCause == LimitingCause.NoRequest;
          case STATUS_ENERGY_LIMIT:
            assume eligibility_decision.reason == EligibilityReason.Equipment &
              fault_summary.primaryCause == EquipmentCause.Energy;
            guarantee eligibility_status.limitingCause == LimitingCause.Energy;
          case STATUS_PROPULSION_LIMIT:
            assume eligibility_decision.reason == EligibilityReason.Equipment &
              fault_summary.primaryCause == EquipmentCause.Propulsion;
            guarantee eligibility_status.limitingCause == LimitingCause.Propulsion;
          case STATUS_NAVIGATION_LIMIT:
            assume eligibility_decision.reason == EligibilityReason.Equipment &
              fault_summary.primaryCause == EquipmentCause.Navigation;
            guarantee eligibility_status.limitingCause == LimitingCause.Navigation;
          case STATUS_OBSTACLE_LIMIT:
            assume eligibility_decision.reason == EligibilityReason.Equipment &
              fault_summary.primaryCause == EquipmentCause.Obstacle;
            guarantee eligibility_status.limitingCause == LimitingCause.Obstacle;
          case STATUS_OBSERVATION_LIMIT:
            assume eligibility_decision.reason == EligibilityReason.Equipment &
              fault_summary.primaryCause == EquipmentCause.Observation;
            guarantee eligibility_status.limitingCause == LimitingCause.Observation;
          case STATUS_COMMUNICATION_LIMIT:
            assume eligibility_decision.reason == EligibilityReason.Equipment &
              fault_summary.primaryCause == EquipmentCause.Communication;
            guarantee eligibility_status.limitingCause == LimitingCause.Communication;
    }*/
  }

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
    part energy_evidence_assessor : EnergyEvidenceAssessor;
    part navigation_evidence_assessor : NavigationEvidenceAssessor;
    part communication_evidence_assessor : CommunicationEvidenceAssessor;
    part observation_evidence_assessor : ObservationEvidenceAssessor;
    part obstacle_evidence_assessor : ObstacleEvidenceAssessor;
    part propulsion_evidence_assessor : PropulsionEvidenceAssessor;
    part request_lifecycle_owner : RequestLifecycleOwner;
    part fault_registry : FaultRegistry;
    part priority_arbiter : PriorityArbiter;
    part recovery_qualification_owner : RecoveryQualificationOwner;
    part eligibility_decision_owner : EligibilityDecisionOwner;
    part permission_release_ledger : PermissionReleaseLedger;
    part status_composer : StatusComposer;

    // Exactly thirty-five directed semantic interactions.
    connection int01 : PortConnection connect energy_evidence to energy_evidence_assessor.energy_evidence;
    connection int02 : PortConnection connect navigation_evidence to navigation_evidence_assessor.navigation_evidence;
    connection int03 : PortConnection connect communication_evidence to communication_evidence_assessor.communication_evidence;
    connection int04 : PortConnection connect observation_evidence to observation_evidence_assessor.observation_evidence;
    connection int05 : PortConnection connect obstacle_evidence to obstacle_evidence_assessor.obstacle_evidence;
    connection int06 : PortConnection connect propulsion_evidence to propulsion_evidence_assessor.propulsion_evidence;
    connection int07 : PortConnection connect operator_event to request_lifecycle_owner.operator_event;
    connection int08 : PortConnection connect energy_evidence_assessor.energy_assessment to fault_registry.energy_assessment;
    connection int09 : PortConnection connect navigation_evidence_assessor.navigation_assessment to fault_registry.navigation_assessment;
    connection int10 : PortConnection connect communication_evidence_assessor.communication_assessment to fault_registry.communication_assessment;
    connection int11 : PortConnection connect observation_evidence_assessor.observation_assessment to fault_registry.observation_assessment;
    connection int12 : PortConnection connect obstacle_evidence_assessor.obstacle_assessment to fault_registry.obstacle_assessment;
    connection int13 : PortConnection connect propulsion_evidence_assessor.propulsion_assessment to fault_registry.propulsion_assessment;
    connection int14 : PortConnection connect energy_evidence_assessor.energy_assessment to eligibility_decision_owner.energy_assessment;
    connection int15 : PortConnection connect navigation_evidence_assessor.navigation_assessment to eligibility_decision_owner.navigation_assessment;
    connection int16 : PortConnection connect communication_evidence_assessor.communication_assessment to eligibility_decision_owner.communication_assessment;
    connection int17 : PortConnection connect observation_evidence_assessor.observation_assessment to eligibility_decision_owner.observation_assessment;
    connection int18 : PortConnection connect obstacle_evidence_assessor.obstacle_assessment to eligibility_decision_owner.obstacle_assessment;
    connection int19 : PortConnection connect propulsion_evidence_assessor.propulsion_assessment to eligibility_decision_owner.propulsion_assessment;
    connection int20 : PortConnection connect request_lifecycle_owner.candidate_event to priority_arbiter.candidate_event;
    connection int21 : PortConnection connect fault_registry.fault_summary to priority_arbiter.fault_summary;
    connection int22 : PortConnection connect priority_arbiter.accepted_directive to request_lifecycle_owner.accepted_directive;
    connection int23 : PortConnection connect priority_arbiter.accepted_directive to recovery_qualification_owner.accepted_directive;
    connection int24 : PortConnection connect fault_registry.fault_summary to recovery_qualification_owner.fault_summary;
    connection int25 : PortConnection connect recovery_qualification_owner.recovery_facts to eligibility_decision_owner.recovery_facts;
    connection int26 : PortConnection connect request_lifecycle_owner.request_phase to eligibility_decision_owner.request_phase;
    connection int27 : PortConnection connect eligibility_decision_owner.eligibility_decision to permission_release_ledger.eligibility_decision;
    connection int28 : PortConnection connect permission_release_ledger.release_feedback to request_lifecycle_owner.release_feedback;
    connection int29 : PortConnection connect eligibility_decision_owner.eligibility_decision to status_composer.eligibility_decision;
    connection int30 : PortConnection connect fault_registry.fault_summary to status_composer.fault_summary;
    connection int31 : PortConnection connect recovery_qualification_owner.recovery_phase to status_composer.recovery_phase;
    connection int32 : PortConnection connect request_lifecycle_owner.request_phase to status_composer.request_phase;
    connection int33 : PortConnection connect permission_release_ledger.sortie_directive to sortie_directive;
    connection int34 : PortConnection connect status_composer.eligibility_status to eligibility_status;
    connection int35 : PortConnection connect request_lifecycle_owner.request_phase to permission_release_ledger.request_phase;

  }

  part def ObservationSortieEligibilitySupervisorSystem :> System {
    port energy_evidence : DataPort { in :>> type : EnergyEvidence; }
    port navigation_evidence : DataPort { in :>> type : NavigationEvidenceRecord; }
    port communication_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port observation_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port obstacle_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port propulsion_evidence : DataPort { in :>> type : PropulsionEvidence; }
    port operator_event : DataPort { in :>> type : OperatorEvent; }
    port sortie_eligibility_directive : DataPort { out :>> type : SortieDirective; }
    port eligibility_status : DataPort { out :>> type : EligibilityStatus; }

    part eligibility_supervisor_process : EligibilitySupervisorProcess;

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
  part observation_sortie_eligibility_supervisor : ObservationSortieEligibilitySupervisorSystem;
}
