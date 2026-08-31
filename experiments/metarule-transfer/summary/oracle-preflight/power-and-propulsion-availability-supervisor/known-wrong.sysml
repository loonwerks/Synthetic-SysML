// Canonical contracted model for immutable run
// 20260814T132656Z-fire-observation-sortie-hard-r2-a1.

// @trace PURPOSE-01
package Power_Propulsion_Availability_Supervisor {
  private import HAMR::*;

  // @trace MON-01
  enum def BatteryQuality { enum LIMITED;
    enum ADEQUATE; enum DEPLETED; enum UNKNOWN; }
  // @trace MON-02
  enum def EvidenceValidity { enum VALID; enum INVALID; }
  // @trace MON-02
  enum def EvidenceFreshness { enum CURRENT; enum STALE; }
  // @trace MON-02
  enum def PowerCondition { enum NOMINAL; enum DEGRADED; enum UNAVAILABLE; enum UNKNOWN; }
  // @trace MON-03
  enum def EnginePositionOneCondition { enum NOMINAL; enum NON_NOMINAL; enum UNAVAILABLE; enum UNKNOWN; }
  // @trace MON-03
  enum def EnginePositionTwoCondition { enum NOMINAL; enum NON_NOMINAL; enum UNAVAILABLE; enum UNKNOWN; }
  // @trace MON-05
  enum def EngineCount { enum FOUR; enum OTHER; enum UNKNOWN; }
  // @trace MON-05
  enum def AlternatingKinds { enum MATCHES_SOURCE; enum DOES_NOT_MATCH; enum UNKNOWN; }
  // @trace MON-06
  enum def ChargerCoupling { enum DISCONNECTED; enum CONNECTED_IDLE; enum CHARGING; enum UNKNOWN; }
  // @trace MON-07
  enum def ControlEvent { enum NONE; enum REQUEST_ENABLE; enum REQUEST_DISABLE; enum ACKNOWLEDGE_RECOVERY; }
  // @trace TYPE-06
  enum def RequestContextEvent { enum NONE; enum REQUEST_ENABLE; enum REQUEST_DISABLE; enum ACKNOWLEDGE_RECOVERY; }
  // @trace MON-08
  enum def ActuationFeedback { enum DISABLED_CONFIRMED; enum ENABLED_CONFIRMED; enum UNKNOWN; }

  // @trace TYPE-01
  enum def AdmissionResult { enum ADMITTED_NONE; enum REJECTED_INVALID; enum REJECTED_STALE; }
  // @trace TYPE-02
  enum def BatteryAssessment { enum READY_NONE; enum NOT_READY_INVALID; enum NOT_READY_STALE; enum NOT_READY_LIMITED; enum NOT_READY_DEPLETED_OR_UNKNOWN; }
  // @trace TYPE-03
  enum def PowerAssessment { enum READY_NONE; enum NOT_READY_INVALID; enum NOT_READY_STALE; enum NOT_READY_CONDITION; }
  // @trace TYPE-03
  enum def EnginePairAssessment { enum READY_NONE; enum NOT_READY_INVALID; enum NOT_READY_STALE; enum NOT_READY_FIRST_POSITION; enum NOT_READY_SECOND_POSITION; }
  // @trace TYPE-03
  enum def ConfigurationAssessment { enum READY_NONE; enum NOT_READY_INVALID; enum NOT_READY_STALE; enum NOT_READY_ENGINE_COUNT; enum NOT_READY_ALTERNATION; }
  // @trace TYPE-03
  enum def ChargingAssessment { enum READY_NONE; enum NOT_READY_INVALID; enum NOT_READY_STALE; enum NOT_READY_CONNECTED_IDLE; enum NOT_READY_CHARGING_OR_UNKNOWN; }
  // @trace TYPE-04
  enum def PropulsionAssessment { enum READY_NONE; enum NOT_READY_ODD_ENGINE_GROUP; enum NOT_READY_EVEN_ENGINE_GROUP; enum NOT_READY_CONFIGURATION; }
  // @trace TYPE-05
  enum def DemandPhase { enum IDLE; enum REQUESTED; enum ACTIVE; }
  // @trace TYPE-05
  enum def PriorityDirective { enum INHIBIT; enum DISABLE; enum RECOVER; enum ENABLE; enum HOLD; }
  // @trace TYPE-06
  enum def SummaryDirective { enum INHIBIT; enum DISABLE; enum RECOVER; enum ENABLE; enum HOLD; }
  // @trace TYPE-05
  enum def RecoveryPhase { enum NORMAL; enum QUARANTINED; enum AWAITING_ACK; }
  // @trace TYPE-05
  enum def RecoveryGate { enum OPEN; enum CLOSED; }
  // @trace TYPE-05
  enum def CommandPhase { enum DISABLED; enum ENABLE_PENDING; enum ENABLED; }
  // @trace TYPE-06
  enum def FaultStatus { enum CLEAR; enum ACTIVE; }
  // @trace TYPE-06
  enum def FaultCause { enum NONE; enum BATTERY; enum POWER_MANAGEMENT; enum ODD_ENGINE_GROUP; enum EVEN_ENGINE_GROUP; enum CONFIGURATION; enum CHARGER; }
  // @trace TYPE-07
  enum def AvailabilityValue { enum UNAVAILABLE; enum AVAILABLE_FOR_ENABLE; }
  // @trace CTRL-02
  enum def AvailabilityCause { enum NONE; enum BATTERY; enum POWER_MANAGEMENT; enum ODD_ENGINE_GROUP; enum EVEN_ENGINE_GROUP; enum CONFIGURATION; enum CHARGER; enum RECOVERY; enum NO_DEMAND; enum OPERATOR_DISABLE; }
  // @trace CTRL-02
  enum def ReportAvailabilityValue { enum UNAVAILABLE; enum AVAILABLE_FOR_ENABLE; }
  // @trace CTRL-02
  enum def ReportAvailabilityCause { enum NONE; enum BATTERY; enum POWER_MANAGEMENT; enum ODD_ENGINE_GROUP; enum EVEN_ENGINE_GROUP; enum CONFIGURATION; enum CHARGER; enum RECOVERY; enum NO_DEMAND; enum OPERATOR_DISABLE; }
  // @trace CTRL-02
  enum def ReportDemandPhase { enum IDLE; enum REQUESTED; enum ACTIVE; }
  // @trace CTRL-02
  enum def ReportRecoveryPhase { enum NORMAL; enum QUARANTINED; enum AWAITING_ACK; }
  // @trace CTRL-01
  enum def PowerCommand { enum DISABLE; enum ENABLE_NEW; enum ENABLE_HOLD; }

  // All record members inspected by GUMBO are direct attributes.
  // @trace MON-01
  part def BatteryObservation :> Data {
    // @trace MON-01
    attribute quality : BatteryQuality;
    // @trace MON-01
    attribute validity : EvidenceValidity;
    // @trace MON-01
    attribute freshness : EvidenceFreshness;
  }
  // @trace MON-02
  part def PowerEvidence :> Data {
    // @trace MON-02
    attribute condition : PowerCondition;
    // @trace MON-02
    attribute validity : EvidenceValidity;
    // @trace MON-02
    attribute freshness : EvidenceFreshness;
  }
  // @trace MON-03
  part def EnginePairEvidence :> Data {
    // @trace MON-03
    attribute positionOneState : EnginePositionOneCondition;
    // @trace MON-03
    attribute positionTwoState : EnginePositionTwoCondition;
    // @trace MON-03
    attribute validity : EvidenceValidity;
    // @trace MON-03
    attribute freshness : EvidenceFreshness;
  }
  // @trace MON-05
  part def ConfigurationEvidence :> Data {
    // @trace MON-05
    attribute engineCount : EngineCount;
    // @trace MON-05
    attribute alternatingKinds : AlternatingKinds;
    // @trace MON-05
    attribute validity : EvidenceValidity;
    // @trace MON-05
    attribute freshness : EvidenceFreshness;
  }
  // @trace MON-06
  part def ChargerEvidence :> Data {
    // @trace MON-06
    attribute coupling : ChargerCoupling;
    // @trace MON-06
    attribute validity : EvidenceValidity;
    // @trace MON-06
    attribute freshness : EvidenceFreshness;
  }
  // @trace TYPE-01
  part def QualifiedBatteryObservation :> Data {
    // @trace TYPE-01
    attribute admission : AdmissionResult;
    // @trace TYPE-01
    attribute quality : BatteryQuality;
  }
  // @trace TYPE-06
  part def RequestContext :> Data {
    // @trace TYPE-06
    attribute demand : DemandPhase;
    // @trace TYPE-06
    attribute candidateEvent : RequestContextEvent;
  }
  // @trace TYPE-06
  part def FaultActionSummary :> Data {
    // @trace TYPE-06
    attribute fault : FaultStatus;
    // @trace TYPE-06
    attribute cause : FaultCause;
    // @trace TYPE-06
    attribute directive : SummaryDirective;
  }
  // @trace TYPE-05
  part def RecoveryFrame :> Data {
    // @trace TYPE-05
    attribute phase : RecoveryPhase;
    // @trace TYPE-05
    attribute gate : RecoveryGate;
  }
  // @trace TYPE-07
  part def AvailabilityDecision :> Data {
    // @trace TYPE-07
    attribute decision : AvailabilityValue;
    // @trace TYPE-07
    attribute cause : AvailabilityCause;
  }
  // @trace CTRL-02
  part def AvailabilityReport :> Data {
    // @trace CTRL-02
    attribute decision : ReportAvailabilityValue;
    // @trace CTRL-02
    attribute cause : ReportAvailabilityCause;
    // @trace CTRL-02
    attribute demand : ReportDemandPhase;
    // @trace CTRL-02
    attribute recovery : ReportRecoveryPhase;
  }

  // @trace PART-01
  part def BatteryObservationAdmissionOwner :> Thread {
    // @trace INT-01
    port battery_observation : DataPort { in :>> type : BatteryObservation; }
    // @trace INT-02
    port qualified_battery : DataPort { out :>> type : QualifiedBatteryObservation; }
    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_ADMISSION_REJECTED:
          qualified_battery.admission == AdmissionResult.REJECTED_INVALID &
          qualified_battery.quality == BatteryQuality.UNKNOWN;
      compute
        compute_cases
          // @trace CASE-01
          case CASE_01_ADMITTED:
            assume battery_observation.validity == EvidenceValidity.VALID &
              battery_observation.freshness == EvidenceFreshness.CURRENT;
            guarantee qualified_battery.admission == AdmissionResult.ADMITTED_NONE &
              qualified_battery.quality == battery_observation.quality;
          // @trace CASE-02
          case CASE_02_REJECTED:
            assume battery_observation.validity == EvidenceValidity.INVALID |
              battery_observation.freshness == EvidenceFreshness.STALE;
            guarantee qualified_battery.quality == battery_observation.quality &
              ((battery_observation.validity == EvidenceValidity.INVALID &
                qualified_battery.admission == AdmissionResult.REJECTED_INVALID) |
               (battery_observation.validity == EvidenceValidity.VALID &
                qualified_battery.admission == AdmissionResult.REJECTED_STALE));
    }*/
  }

  // @trace PART-02
  part def BatteryCapacityAssessmentOwner :> Thread {
    // @trace INT-02
    port qualified_battery : DataPort { in :>> type : QualifiedBatteryObservation; }
    // @trace INT-14
    port battery_assessment : DataPort { out :>> type : BatteryAssessment; }
    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_BATTERY_NOT_READY: battery_assessment == BatteryAssessment.NOT_READY_INVALID;
      compute
        compute_cases
          // @trace CASE-03
          case CASE_03_BATTERY_READY:
            assume qualified_battery.admission == AdmissionResult.ADMITTED_NONE &
              qualified_battery.quality == BatteryQuality.ADEQUATE;
            guarantee battery_assessment == BatteryAssessment.READY_NONE;
          // @trace CASE-04
          case CASE_04_BATTERY_NOT_READY:
            assume qualified_battery.admission != AdmissionResult.ADMITTED_NONE |
              qualified_battery.quality != BatteryQuality.ADEQUATE;
            guarantee
              ((qualified_battery.admission == AdmissionResult.REJECTED_INVALID &
                battery_assessment == BatteryAssessment.NOT_READY_INVALID) |
               (qualified_battery.admission == AdmissionResult.REJECTED_STALE &
                battery_assessment == BatteryAssessment.NOT_READY_STALE) |
               (qualified_battery.admission == AdmissionResult.ADMITTED_NONE &
                qualified_battery.quality == BatteryQuality.LIMITED &
                battery_assessment == BatteryAssessment.NOT_READY_LIMITED) |
               (qualified_battery.admission == AdmissionResult.ADMITTED_NONE &
                (qualified_battery.quality == BatteryQuality.DEPLETED |
                 qualified_battery.quality == BatteryQuality.UNKNOWN) &
                battery_assessment == BatteryAssessment.NOT_READY_DEPLETED_OR_UNKNOWN));
    }*/
  }

  // @trace PART-03
  part def PowerManagementAssessmentOwner :> Thread {
    // @trace INT-03
    port power_evidence : DataPort { in :>> type : PowerEvidence; }
    // @trace INT-15
    port power_assessment : DataPort { out :>> type : PowerAssessment; }
    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_POWER_NOT_READY: power_assessment == PowerAssessment.NOT_READY_INVALID;
      compute
        compute_cases
          // @trace CASE-05
          case CASE_05_POWER_READY:
            assume power_evidence.validity == EvidenceValidity.VALID &
              power_evidence.freshness == EvidenceFreshness.CURRENT &
              power_evidence.condition == PowerCondition.NOMINAL;
            guarantee power_assessment == PowerAssessment.READY_NONE;
          // @trace CASE-06
          case CASE_06_POWER_NOT_READY:
            assume power_evidence.validity == EvidenceValidity.INVALID |
              power_evidence.freshness == EvidenceFreshness.STALE |
              power_evidence.condition != PowerCondition.NOMINAL;
            guarantee
              ((power_evidence.validity == EvidenceValidity.INVALID &
                power_assessment == PowerAssessment.NOT_READY_INVALID) |
               (power_evidence.validity == EvidenceValidity.VALID &
                power_evidence.freshness == EvidenceFreshness.STALE &
                power_assessment == PowerAssessment.NOT_READY_STALE) |
               (power_evidence.validity == EvidenceValidity.VALID &
                power_evidence.freshness == EvidenceFreshness.CURRENT &
                power_evidence.condition != PowerCondition.NOMINAL &
                power_assessment == PowerAssessment.NOT_READY_CONDITION));
    }*/
  }

  // @trace PART-04
  part def OddEngineGroupAssessor :> Thread {
    // @trace INT-04
    port odd_engine_evidence : DataPort { in :>> type : EnginePairEvidence; }
    // @trace INT-07
    port odd_engine_assessment : DataPort { out :>> type : EnginePairAssessment; }
    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_ODD_GROUP_NOT_READY: odd_engine_assessment == EnginePairAssessment.NOT_READY_INVALID;
      compute
        compute_cases
          // @trace CASE-07
          case CASE_07_ODD_GROUP_READY:
            assume odd_engine_evidence.validity == EvidenceValidity.VALID &
              odd_engine_evidence.freshness == EvidenceFreshness.CURRENT &
              odd_engine_evidence.positionOneState == EnginePositionOneCondition.NOMINAL &
              odd_engine_evidence.positionTwoState == EnginePositionTwoCondition.NOMINAL;
            guarantee odd_engine_assessment == EnginePairAssessment.READY_NONE;
          // @trace CASE-08
          case CASE_08_ODD_GROUP_NOT_READY:
            assume odd_engine_evidence.validity == EvidenceValidity.INVALID |
              odd_engine_evidence.freshness == EvidenceFreshness.STALE |
              odd_engine_evidence.positionOneState != EnginePositionOneCondition.NOMINAL |
              odd_engine_evidence.positionTwoState != EnginePositionTwoCondition.NOMINAL;
            guarantee
              ((odd_engine_evidence.validity == EvidenceValidity.INVALID &
                odd_engine_assessment == EnginePairAssessment.NOT_READY_INVALID) |
               (odd_engine_evidence.validity == EvidenceValidity.VALID &
                odd_engine_evidence.freshness == EvidenceFreshness.STALE &
                odd_engine_assessment == EnginePairAssessment.NOT_READY_STALE) |
               (odd_engine_evidence.validity == EvidenceValidity.VALID &
                odd_engine_evidence.freshness == EvidenceFreshness.CURRENT &
                odd_engine_evidence.positionOneState != EnginePositionOneCondition.NOMINAL &
                odd_engine_assessment == EnginePairAssessment.NOT_READY_FIRST_POSITION) |
               (odd_engine_evidence.validity == EvidenceValidity.VALID &
                odd_engine_evidence.freshness == EvidenceFreshness.CURRENT &
                odd_engine_evidence.positionOneState == EnginePositionOneCondition.NOMINAL &
                odd_engine_evidence.positionTwoState != EnginePositionTwoCondition.NOMINAL &
                odd_engine_assessment == EnginePairAssessment.NOT_READY_SECOND_POSITION));
    }*/
  }

  // @trace PART-05
  part def EvenEngineGroupAssessor :> Thread {
    // @trace INT-05
    port even_engine_evidence : DataPort { in :>> type : EnginePairEvidence; }
    // @trace INT-08
    port even_engine_assessment : DataPort { out :>> type : EnginePairAssessment; }
    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_EVEN_GROUP_NOT_READY: even_engine_assessment == EnginePairAssessment.NOT_READY_INVALID;
      compute
        compute_cases
          // @trace CASE-09
          case CASE_09_EVEN_GROUP_READY:
            assume even_engine_evidence.validity == EvidenceValidity.VALID &
              even_engine_evidence.freshness == EvidenceFreshness.CURRENT &
              even_engine_evidence.positionOneState == EnginePositionOneCondition.NOMINAL &
              even_engine_evidence.positionTwoState == EnginePositionTwoCondition.NOMINAL;
            guarantee even_engine_assessment == EnginePairAssessment.READY_NONE;
          // @trace CASE-10
          case CASE_10_EVEN_GROUP_NOT_READY:
            assume even_engine_evidence.validity == EvidenceValidity.INVALID |
              even_engine_evidence.freshness == EvidenceFreshness.STALE |
              even_engine_evidence.positionOneState != EnginePositionOneCondition.NOMINAL |
              even_engine_evidence.positionTwoState != EnginePositionTwoCondition.NOMINAL;
            guarantee
              ((even_engine_evidence.validity == EvidenceValidity.INVALID &
                even_engine_assessment == EnginePairAssessment.NOT_READY_INVALID) |
               (even_engine_evidence.validity == EvidenceValidity.VALID &
                even_engine_evidence.freshness == EvidenceFreshness.STALE &
                even_engine_assessment == EnginePairAssessment.NOT_READY_STALE) |
               (even_engine_evidence.validity == EvidenceValidity.VALID &
                even_engine_evidence.freshness == EvidenceFreshness.CURRENT &
                even_engine_evidence.positionOneState != EnginePositionOneCondition.NOMINAL &
                even_engine_assessment == EnginePairAssessment.NOT_READY_FIRST_POSITION) |
               (even_engine_evidence.validity == EvidenceValidity.VALID &
                even_engine_evidence.freshness == EvidenceFreshness.CURRENT &
                even_engine_evidence.positionOneState == EnginePositionOneCondition.NOMINAL &
                even_engine_evidence.positionTwoState != EnginePositionTwoCondition.NOMINAL &
                even_engine_assessment == EnginePairAssessment.NOT_READY_SECOND_POSITION));
    }*/
  }

  // @trace PART-06
  part def FourEngineConfigurationAssessor :> Thread {
    // @trace INT-06
    port configuration_evidence : DataPort { in :>> type : ConfigurationEvidence; }
    // @trace INT-09
    port configuration_assessment : DataPort { out :>> type : ConfigurationAssessment; }
    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_CONFIGURATION_NOT_READY:
          configuration_assessment == ConfigurationAssessment.NOT_READY_INVALID;
      compute
        compute_cases
          // @trace CASE-11
          case CASE_11_CONFIGURATION_READY:
            assume configuration_evidence.validity == EvidenceValidity.VALID &
              configuration_evidence.freshness == EvidenceFreshness.CURRENT &
              configuration_evidence.engineCount == EngineCount.FOUR &
              configuration_evidence.alternatingKinds == AlternatingKinds.MATCHES_SOURCE;
            guarantee configuration_assessment == ConfigurationAssessment.READY_NONE;
          // @trace CASE-12
          case CASE_12_CONFIGURATION_NOT_READY:
            assume configuration_evidence.validity == EvidenceValidity.INVALID |
              configuration_evidence.freshness == EvidenceFreshness.STALE |
              configuration_evidence.engineCount != EngineCount.FOUR |
              configuration_evidence.alternatingKinds != AlternatingKinds.MATCHES_SOURCE;
            guarantee
              ((configuration_evidence.validity == EvidenceValidity.INVALID &
                configuration_assessment == ConfigurationAssessment.NOT_READY_INVALID) |
               (configuration_evidence.validity == EvidenceValidity.VALID &
                configuration_evidence.freshness == EvidenceFreshness.STALE &
                configuration_assessment == ConfigurationAssessment.NOT_READY_STALE) |
               (configuration_evidence.validity == EvidenceValidity.VALID &
                configuration_evidence.freshness == EvidenceFreshness.CURRENT &
                configuration_evidence.engineCount != EngineCount.FOUR &
                configuration_assessment == ConfigurationAssessment.NOT_READY_ENGINE_COUNT) |
               (configuration_evidence.validity == EvidenceValidity.VALID &
                configuration_evidence.freshness == EvidenceFreshness.CURRENT &
                configuration_evidence.engineCount == EngineCount.FOUR &
                configuration_evidence.alternatingKinds != AlternatingKinds.MATCHES_SOURCE &
                configuration_assessment == ConfigurationAssessment.NOT_READY_ALTERNATION));
    }*/
  }

  // @trace PART-07
  part def PropulsionEvidenceComposer :> Thread {
    // @trace INT-07
    port odd_engine_assessment : DataPort { in :>> type : EnginePairAssessment; }
    // @trace INT-08
    port even_engine_assessment : DataPort { in :>> type : EnginePairAssessment; }
    // @trace INT-09
    port configuration_assessment : DataPort { in :>> type : ConfigurationAssessment; }
    // @trace INT-16
    port propulsion_assessment : DataPort { out :>> type : PropulsionAssessment; }
    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_PROPULSION_NOT_READY:
          propulsion_assessment == PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP;
      compute
        compute_cases
          // @trace CASE-13
          case CASE_13_PROPULSION_READY:
            assume odd_engine_assessment == EnginePairAssessment.READY_NONE &
              even_engine_assessment == EnginePairAssessment.READY_NONE &
              configuration_assessment == ConfigurationAssessment.READY_NONE;
            guarantee propulsion_assessment == PropulsionAssessment.READY_NONE;
          // @trace CASE-14
          case CASE_14_PROPULSION_NOT_READY:
            assume odd_engine_assessment != EnginePairAssessment.READY_NONE |
              even_engine_assessment != EnginePairAssessment.READY_NONE |
              configuration_assessment != ConfigurationAssessment.READY_NONE;
            guarantee
              ((odd_engine_assessment != EnginePairAssessment.READY_NONE &
                propulsion_assessment == PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP) |
               (odd_engine_assessment == EnginePairAssessment.READY_NONE &
                even_engine_assessment != EnginePairAssessment.READY_NONE &
                propulsion_assessment == PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP) |
               (odd_engine_assessment == EnginePairAssessment.READY_NONE &
                even_engine_assessment == EnginePairAssessment.READY_NONE &
                configuration_assessment != ConfigurationAssessment.READY_NONE &
                propulsion_assessment == PropulsionAssessment.NOT_READY_CONFIGURATION));
    }*/
  }

  // @trace PART-08
  part def ChargingInterlockAssessor :> Thread {
    // @trace INT-10
    port charger_evidence : DataPort { in :>> type : ChargerEvidence; }
    // @trace INT-17
    port charging_assessment : DataPort { out :>> type : ChargingAssessment; }
    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_CHARGING_NOT_READY: charging_assessment == ChargingAssessment.NOT_READY_INVALID;
      compute
        compute_cases
          // @trace CASE-15
          case CASE_15_CHARGING_READY:
            assume charger_evidence.validity == EvidenceValidity.VALID &
              charger_evidence.freshness == EvidenceFreshness.CURRENT &
              charger_evidence.coupling == ChargerCoupling.DISCONNECTED;
            guarantee charging_assessment == ChargingAssessment.READY_NONE;
          // @trace CASE-16
          case CASE_16_CHARGING_NOT_READY:
            assume charger_evidence.validity == EvidenceValidity.INVALID |
              charger_evidence.freshness == EvidenceFreshness.STALE |
              charger_evidence.coupling != ChargerCoupling.DISCONNECTED;
            guarantee
              ((charger_evidence.validity == EvidenceValidity.INVALID &
                charging_assessment == ChargingAssessment.NOT_READY_INVALID) |
               (charger_evidence.validity == EvidenceValidity.VALID &
                charger_evidence.freshness == EvidenceFreshness.STALE &
                charging_assessment == ChargingAssessment.NOT_READY_STALE) |
               (charger_evidence.validity == EvidenceValidity.VALID &
                charger_evidence.freshness == EvidenceFreshness.CURRENT &
                charger_evidence.coupling == ChargerCoupling.CONNECTED_IDLE &
                charging_assessment == ChargingAssessment.NOT_READY_CONNECTED_IDLE) |
               (charger_evidence.validity == EvidenceValidity.VALID &
                charger_evidence.freshness == EvidenceFreshness.CURRENT &
                (charger_evidence.coupling == ChargerCoupling.CHARGING |
                 charger_evidence.coupling == ChargerCoupling.UNKNOWN) &
                charging_assessment == ChargingAssessment.NOT_READY_CHARGING_OR_UNKNOWN));
    }*/
  }

  // @trace PART-09
  part def EnableDemandLifecycleOwner :> Thread {
    // @trace INT-11
    port control_event : DataPort { in :>> type : ControlEvent; }
    // @trace INT-12
    port actuation_feedback : DataPort { in :>> type : ActuationFeedback; }
    // @trace INT-18
    port accepted_directive : DataPort { in :>> type : PriorityDirective; }
    // @trace INT-13
    port request_context : DataPort { out :>> type : RequestContext; }
    // @trace INT-25
    port demand_view : DataPort { out :>> type : DemandPhase; }
    language "GUMBO" /*{
      state
        // @trace PART-09
        demandMemory: DemandPhase;
      initialize
        modifies demandMemory;
        // @trace INIT-01
        guarantee INITIAL_DEMAND_IDLE:
          demandMemory == DemandPhase.IDLE & request_context.demand == DemandPhase.IDLE &
          request_context.candidateEvent == RequestContextEvent.NONE & demand_view == DemandPhase.IDLE;
      compute
        modifies demandMemory;
        // @trace QMODEL-02
        guarantee PUBLISH_PRE_STATE_DEMAND:
          request_context.demand == In(demandMemory) & demand_view == In(demandMemory) &
          ((control_event == ControlEvent.NONE &
            request_context.candidateEvent == RequestContextEvent.NONE) |
           (control_event == ControlEvent.REQUEST_ENABLE &
            request_context.candidateEvent == RequestContextEvent.REQUEST_ENABLE) |
           (control_event == ControlEvent.REQUEST_DISABLE &
            request_context.candidateEvent == RequestContextEvent.REQUEST_DISABLE) |
           (control_event == ControlEvent.ACKNOWLEDGE_RECOVERY &
            request_context.candidateEvent == RequestContextEvent.ACKNOWLEDGE_RECOVERY));
        compute_cases
          // @trace CASE-17
          case CASE_17_DEMAND_INVALIDATED:
            assume accepted_directive == PriorityDirective.INHIBIT |
              accepted_directive == PriorityDirective.DISABLE |
              accepted_directive == PriorityDirective.RECOVER;
            guarantee demandMemory == DemandPhase.IDLE;
          // @trace CASE-18
          case CASE_18_DEMAND_ACTIVE:
            assume (accepted_directive == PriorityDirective.ENABLE |
              accepted_directive == PriorityDirective.HOLD) &
              (((In(demandMemory) == DemandPhase.REQUESTED |
                 In(demandMemory) == DemandPhase.ACTIVE) &
                actuation_feedback == ActuationFeedback.ENABLED_CONFIRMED) |
               (In(demandMemory) == DemandPhase.ACTIVE &
                actuation_feedback != ActuationFeedback.DISABLED_CONFIRMED));
            guarantee demandMemory == DemandPhase.ACTIVE;
          // @trace CASE-19
          case CASE_19_DEMAND_REQUESTED_OR_IDLE:
            assume (accepted_directive == PriorityDirective.ENABLE |
              accepted_directive == PriorityDirective.HOLD) &
              (In(demandMemory) == DemandPhase.IDLE |
               (In(demandMemory) == DemandPhase.REQUESTED &
                actuation_feedback != ActuationFeedback.ENABLED_CONFIRMED) |
               (In(demandMemory) == DemandPhase.ACTIVE &
                actuation_feedback == ActuationFeedback.DISABLED_CONFIRMED));
            guarantee
              (((In(demandMemory) != DemandPhase.IDLE |
                 accepted_directive == PriorityDirective.ENABLE) &
                demandMemory == DemandPhase.REQUESTED) |
               (In(demandMemory) == DemandPhase.IDLE &
                accepted_directive == PriorityDirective.HOLD &
                demandMemory == DemandPhase.IDLE));
    }*/
  }

  // @trace PART-10
  part def FaultActionPriorityResolver :> Thread {
    // @trace INT-13
    port request_context : DataPort { in :>> type : RequestContext; }
    // @trace INT-14
    port battery_assessment : DataPort { in :>> type : BatteryAssessment; }
    // @trace INT-15
    port power_assessment : DataPort { in :>> type : PowerAssessment; }
    // @trace INT-16
    port propulsion_assessment : DataPort { in :>> type : PropulsionAssessment; }
    // @trace INT-17
    port charging_assessment : DataPort { in :>> type : ChargingAssessment; }
    // @trace INT-18
    port accepted_directive : DataPort { out :>> type : PriorityDirective; }
    // @trace INT-20
    port fault_action_summary : DataPort { out :>> type : FaultActionSummary; }
    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_PRIORITY_INHIBIT:
          accepted_directive == PriorityDirective.INHIBIT &
          fault_action_summary.fault == FaultStatus.ACTIVE &
          fault_action_summary.cause == FaultCause.CHARGER &
          fault_action_summary.directive == SummaryDirective.INHIBIT;
      compute
        // @trace COMP-03
        guarantee DIRECTIVE_PRESERVATION:
          ((accepted_directive == PriorityDirective.INHIBIT &
            fault_action_summary.directive == SummaryDirective.INHIBIT) |
           (accepted_directive == PriorityDirective.DISABLE &
            fault_action_summary.directive == SummaryDirective.DISABLE) |
           (accepted_directive == PriorityDirective.RECOVER &
            fault_action_summary.directive == SummaryDirective.RECOVER) |
           (accepted_directive == PriorityDirective.ENABLE &
            fault_action_summary.directive == SummaryDirective.ENABLE) |
           (accepted_directive == PriorityDirective.HOLD &
            fault_action_summary.directive == SummaryDirective.HOLD));
        compute_cases
          // @trace CASE-20
          case CASE_20_ACTIVE_FAULT_PRIORITY:
            assume battery_assessment != BatteryAssessment.READY_NONE |
              power_assessment != PowerAssessment.READY_NONE |
              propulsion_assessment != PropulsionAssessment.READY_NONE |
              charging_assessment != ChargingAssessment.READY_NONE;
            guarantee accepted_directive == PriorityDirective.INHIBIT &
              fault_action_summary.fault == FaultStatus.ACTIVE &
              fault_action_summary.directive == SummaryDirective.INHIBIT &
              ((charging_assessment != ChargingAssessment.READY_NONE &
                fault_action_summary.cause == FaultCause.CHARGER) |
               (charging_assessment == ChargingAssessment.READY_NONE &
                power_assessment != PowerAssessment.READY_NONE &
                fault_action_summary.cause == FaultCause.POWER_MANAGEMENT) |
               (charging_assessment == ChargingAssessment.READY_NONE &
                power_assessment == PowerAssessment.READY_NONE &
                battery_assessment != BatteryAssessment.READY_NONE &
                fault_action_summary.cause == FaultCause.BATTERY) |
               (charging_assessment == ChargingAssessment.READY_NONE &
                power_assessment == PowerAssessment.READY_NONE &
                battery_assessment == BatteryAssessment.READY_NONE &
                propulsion_assessment == PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP &
                fault_action_summary.cause == FaultCause.ODD_ENGINE_GROUP) |
               (charging_assessment == ChargingAssessment.READY_NONE &
                power_assessment == PowerAssessment.READY_NONE &
                battery_assessment == BatteryAssessment.READY_NONE &
                propulsion_assessment == PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP &
                fault_action_summary.cause == FaultCause.EVEN_ENGINE_GROUP) |
               (charging_assessment == ChargingAssessment.READY_NONE &
                power_assessment == PowerAssessment.READY_NONE &
                battery_assessment == BatteryAssessment.READY_NONE &
                propulsion_assessment == PropulsionAssessment.NOT_READY_CONFIGURATION &
                fault_action_summary.cause == FaultCause.CONFIGURATION));
          // @trace CASE-21
          case CASE_21_DISABLE_ACCEPTED:
            assume battery_assessment == BatteryAssessment.READY_NONE &
              power_assessment == PowerAssessment.READY_NONE &
              propulsion_assessment == PropulsionAssessment.READY_NONE &
              charging_assessment == ChargingAssessment.READY_NONE &
              request_context.candidateEvent == RequestContextEvent.REQUEST_DISABLE;
            guarantee accepted_directive == PriorityDirective.DISABLE &
              fault_action_summary.fault == FaultStatus.CLEAR &
              fault_action_summary.cause == FaultCause.NONE &
              fault_action_summary.directive == SummaryDirective.DISABLE;
          // @trace CASE-22
          case CASE_22_RECOVERY_ACCEPTED:
            assume battery_assessment == BatteryAssessment.READY_NONE &
              power_assessment == PowerAssessment.READY_NONE &
              propulsion_assessment == PropulsionAssessment.READY_NONE &
              charging_assessment == ChargingAssessment.READY_NONE &
              request_context.candidateEvent == RequestContextEvent.ACKNOWLEDGE_RECOVERY;
            guarantee accepted_directive == PriorityDirective.RECOVER &
              fault_action_summary.fault == FaultStatus.CLEAR &
              fault_action_summary.cause == FaultCause.NONE &
              fault_action_summary.directive == SummaryDirective.RECOVER;
          // @trace CASE-23
          case CASE_23_ENABLE_OR_REPEAT:
            assume battery_assessment == BatteryAssessment.READY_NONE &
              power_assessment == PowerAssessment.READY_NONE &
              propulsion_assessment == PropulsionAssessment.READY_NONE &
              charging_assessment == ChargingAssessment.READY_NONE &
              request_context.candidateEvent == RequestContextEvent.REQUEST_ENABLE;
            guarantee fault_action_summary.fault == FaultStatus.CLEAR &
              fault_action_summary.cause == FaultCause.NONE &
              (((request_context.demand == DemandPhase.IDLE) &
                accepted_directive == PriorityDirective.ENABLE &
                fault_action_summary.directive == SummaryDirective.ENABLE) |
               (request_context.demand != DemandPhase.IDLE &
                accepted_directive == PriorityDirective.HOLD &
                fault_action_summary.directive == SummaryDirective.HOLD));
          // @trace CASE-24
          case CASE_24_HOLD:
            assume battery_assessment == BatteryAssessment.READY_NONE &
              power_assessment == PowerAssessment.READY_NONE &
              propulsion_assessment == PropulsionAssessment.READY_NONE &
              charging_assessment == ChargingAssessment.READY_NONE &
              request_context.candidateEvent == RequestContextEvent.NONE;
            guarantee accepted_directive == PriorityDirective.HOLD &
              fault_action_summary.fault == FaultStatus.CLEAR &
              fault_action_summary.cause == FaultCause.NONE &
              fault_action_summary.directive == SummaryDirective.HOLD;
    }*/
  }

  // @trace PART-11
  part def RecoveryQualificationOwner :> Thread {
    // @trace INT-20
    port fault_action_summary : DataPort { in :>> type : FaultActionSummary; }
    // @trace INT-27
    port recovery_frame : DataPort { out :>> type : RecoveryFrame; }
    // @trace INT-30
    port recovery_gate : DataPort { out :>> type : RecoveryGate; }
    language "GUMBO" /*{
      state
        // @trace PART-11
        recoveryMemory: RecoveryPhase;
      initialize
        modifies recoveryMemory;
        // @trace INIT-01
        guarantee INITIAL_RECOVERY_CLOSED:
          recoveryMemory == RecoveryPhase.AWAITING_ACK &
          recovery_frame.phase == RecoveryPhase.AWAITING_ACK &
          recovery_frame.gate == RecoveryGate.CLOSED & recovery_gate == RecoveryGate.CLOSED;
      compute
        modifies recoveryMemory;
        // @trace QMODEL-02
        guarantee RECOVERY_FRAME_PRESERVATION:
          recovery_frame.phase == recoveryMemory & recovery_frame.gate == recovery_gate &
          ((recoveryMemory == RecoveryPhase.NORMAL & recovery_gate == RecoveryGate.OPEN) |
           (recoveryMemory != RecoveryPhase.NORMAL & recovery_gate == RecoveryGate.CLOSED));
        compute_cases
          // @trace CASE-25
          case CASE_25_FAULT_QUARANTINE:
            assume fault_action_summary.fault == FaultStatus.ACTIVE;
            guarantee recoveryMemory == RecoveryPhase.QUARANTINED;
          // @trace CASE-26
          case CASE_26_AWAITING_ACK:
            assume fault_action_summary.fault == FaultStatus.CLEAR &
              (In(recoveryMemory) == RecoveryPhase.QUARANTINED |
               (In(recoveryMemory) == RecoveryPhase.AWAITING_ACK &
                fault_action_summary.directive != SummaryDirective.RECOVER));
            guarantee recoveryMemory == RecoveryPhase.AWAITING_ACK;
          // @trace CASE-27
          case CASE_27_RECOVERY_OPEN:
            assume fault_action_summary.fault == FaultStatus.CLEAR &
              (In(recoveryMemory) == RecoveryPhase.NORMAL |
               (In(recoveryMemory) == RecoveryPhase.AWAITING_ACK &
                fault_action_summary.directive == SummaryDirective.RECOVER));
            guarantee recoveryMemory == RecoveryPhase.NORMAL;
    }*/
  }

  // @trace PART-12
  part def AvailabilityDecisionOwner :> Thread {
    // @trace INT-21
    port battery_assessment : DataPort { in :>> type : BatteryAssessment; }
    // @trace INT-22
    port power_assessment : DataPort { in :>> type : PowerAssessment; }
    // @trace INT-23
    port propulsion_assessment : DataPort { in :>> type : PropulsionAssessment; }
    // @trace INT-24
    port charging_assessment : DataPort { in :>> type : ChargingAssessment; }
    // @trace INT-25
    port demand_view : DataPort { in :>> type : DemandPhase; }
    // @trace INT-26
    port fault_action_summary : DataPort { in :>> type : FaultActionSummary; }
    // @trace INT-27
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    // @trace INT-28
    port availability_decision : DataPort { out :>> type : AvailabilityDecision; }
    // @trace INT-33
    port availability_report : DataPort { out :>> type : AvailabilityReport; }
    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_AVAILABILITY_UNAVAILABLE:
          availability_decision.decision == AvailabilityValue.UNAVAILABLE &
          availability_decision.cause == AvailabilityCause.RECOVERY &
          availability_report.decision == ReportAvailabilityValue.UNAVAILABLE &
          availability_report.cause == ReportAvailabilityCause.RECOVERY &
          availability_report.demand == ReportDemandPhase.IDLE &
          availability_report.recovery == ReportRecoveryPhase.AWAITING_ACK;
      compute
        // @trace BEH-05
        guarantee REPORT_PRESERVATION:
          ((availability_decision.decision == AvailabilityValue.UNAVAILABLE &
            availability_report.decision == ReportAvailabilityValue.UNAVAILABLE) |
           (availability_decision.decision == AvailabilityValue.AVAILABLE_FOR_ENABLE &
            availability_report.decision == ReportAvailabilityValue.AVAILABLE_FOR_ENABLE)) &
          ((availability_decision.cause == AvailabilityCause.NONE &
            availability_report.cause == ReportAvailabilityCause.NONE) |
           (availability_decision.cause == AvailabilityCause.BATTERY &
            availability_report.cause == ReportAvailabilityCause.BATTERY) |
           (availability_decision.cause == AvailabilityCause.POWER_MANAGEMENT &
            availability_report.cause == ReportAvailabilityCause.POWER_MANAGEMENT) |
           (availability_decision.cause == AvailabilityCause.ODD_ENGINE_GROUP &
            availability_report.cause == ReportAvailabilityCause.ODD_ENGINE_GROUP) |
           (availability_decision.cause == AvailabilityCause.EVEN_ENGINE_GROUP &
            availability_report.cause == ReportAvailabilityCause.EVEN_ENGINE_GROUP) |
           (availability_decision.cause == AvailabilityCause.CONFIGURATION &
            availability_report.cause == ReportAvailabilityCause.CONFIGURATION) |
           (availability_decision.cause == AvailabilityCause.CHARGER &
            availability_report.cause == ReportAvailabilityCause.CHARGER) |
           (availability_decision.cause == AvailabilityCause.RECOVERY &
            availability_report.cause == ReportAvailabilityCause.RECOVERY) |
           (availability_decision.cause == AvailabilityCause.NO_DEMAND &
            availability_report.cause == ReportAvailabilityCause.NO_DEMAND) |
           (availability_decision.cause == AvailabilityCause.OPERATOR_DISABLE &
            availability_report.cause == ReportAvailabilityCause.OPERATOR_DISABLE)) &
          ((demand_view == DemandPhase.IDLE &
            availability_report.demand == ReportDemandPhase.IDLE) |
           (demand_view == DemandPhase.REQUESTED &
            availability_report.demand == ReportDemandPhase.REQUESTED) |
           (demand_view == DemandPhase.ACTIVE &
            availability_report.demand == ReportDemandPhase.ACTIVE)) &
          ((recovery_frame.phase == RecoveryPhase.NORMAL &
            availability_report.recovery == ReportRecoveryPhase.NORMAL) |
           (recovery_frame.phase == RecoveryPhase.QUARANTINED &
            availability_report.recovery == ReportRecoveryPhase.QUARANTINED) |
           (recovery_frame.phase == RecoveryPhase.AWAITING_ACK &
            availability_report.recovery == ReportRecoveryPhase.AWAITING_ACK));
        compute_cases
          // @trace CASE-28
          case CASE_28_AVAILABLE:
            assume battery_assessment == BatteryAssessment.READY_NONE &
              power_assessment == PowerAssessment.READY_NONE &
              propulsion_assessment == PropulsionAssessment.READY_NONE &
              charging_assessment == ChargingAssessment.READY_NONE &
              demand_view != DemandPhase.IDLE &
              fault_action_summary.fault == FaultStatus.CLEAR &
              recovery_frame.phase == RecoveryPhase.NORMAL &
              recovery_frame.gate == RecoveryGate.OPEN &
              (fault_action_summary.directive == SummaryDirective.ENABLE |
               fault_action_summary.directive == SummaryDirective.HOLD);
            guarantee availability_decision.decision == AvailabilityValue.AVAILABLE_FOR_ENABLE &
              availability_decision.cause == AvailabilityCause.NONE;
          // @trace CASE-29
          case CASE_29_UNAVAILABLE_PRIORITY:
            assume battery_assessment != BatteryAssessment.READY_NONE |
              power_assessment != PowerAssessment.READY_NONE |
              propulsion_assessment != PropulsionAssessment.READY_NONE |
              charging_assessment != ChargingAssessment.READY_NONE |
              demand_view == DemandPhase.IDLE |
              fault_action_summary.fault == FaultStatus.ACTIVE |
              recovery_frame.phase != RecoveryPhase.NORMAL |
              recovery_frame.gate == RecoveryGate.CLOSED |
              fault_action_summary.directive == SummaryDirective.INHIBIT |
              fault_action_summary.directive == SummaryDirective.DISABLE |
              fault_action_summary.directive == SummaryDirective.RECOVER;
            guarantee availability_decision.decision == AvailabilityValue.UNAVAILABLE &
              ((charging_assessment != ChargingAssessment.READY_NONE &
                availability_decision.cause == AvailabilityCause.CHARGER) |
               (charging_assessment == ChargingAssessment.READY_NONE &
                power_assessment != PowerAssessment.READY_NONE &
                availability_decision.cause == AvailabilityCause.POWER_MANAGEMENT) |
               (charging_assessment == ChargingAssessment.READY_NONE &
                power_assessment == PowerAssessment.READY_NONE &
                battery_assessment != BatteryAssessment.READY_NONE &
                availability_decision.cause == AvailabilityCause.BATTERY) |
               (charging_assessment == ChargingAssessment.READY_NONE &
                power_assessment == PowerAssessment.READY_NONE &
                battery_assessment == BatteryAssessment.READY_NONE &
                propulsion_assessment == PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP &
                availability_decision.cause == AvailabilityCause.ODD_ENGINE_GROUP) |
               (charging_assessment == ChargingAssessment.READY_NONE &
                power_assessment == PowerAssessment.READY_NONE &
                battery_assessment == BatteryAssessment.READY_NONE &
                propulsion_assessment == PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP &
                availability_decision.cause == AvailabilityCause.EVEN_ENGINE_GROUP) |
               (charging_assessment == ChargingAssessment.READY_NONE &
                power_assessment == PowerAssessment.READY_NONE &
                battery_assessment == BatteryAssessment.READY_NONE &
                propulsion_assessment == PropulsionAssessment.NOT_READY_CONFIGURATION &
                availability_decision.cause == AvailabilityCause.CONFIGURATION) |
               (charging_assessment == ChargingAssessment.READY_NONE &
                power_assessment == PowerAssessment.READY_NONE &
                battery_assessment == BatteryAssessment.READY_NONE &
                propulsion_assessment == PropulsionAssessment.READY_NONE &
                fault_action_summary.fault == FaultStatus.ACTIVE &
                ((fault_action_summary.cause == FaultCause.CHARGER &
                  availability_decision.cause == AvailabilityCause.CHARGER) |
                 (fault_action_summary.cause == FaultCause.POWER_MANAGEMENT &
                  availability_decision.cause == AvailabilityCause.POWER_MANAGEMENT) |
                 (fault_action_summary.cause == FaultCause.BATTERY &
                  availability_decision.cause == AvailabilityCause.BATTERY) |
                 (fault_action_summary.cause == FaultCause.ODD_ENGINE_GROUP &
                  availability_decision.cause == AvailabilityCause.ODD_ENGINE_GROUP) |
                 (fault_action_summary.cause == FaultCause.EVEN_ENGINE_GROUP &
                  availability_decision.cause == AvailabilityCause.EVEN_ENGINE_GROUP) |
                 (fault_action_summary.cause == FaultCause.CONFIGURATION &
                  availability_decision.cause == AvailabilityCause.CONFIGURATION))) |
               (charging_assessment == ChargingAssessment.READY_NONE &
                power_assessment == PowerAssessment.READY_NONE &
                battery_assessment == BatteryAssessment.READY_NONE &
                propulsion_assessment == PropulsionAssessment.READY_NONE &
                fault_action_summary.fault == FaultStatus.CLEAR &
                fault_action_summary.directive == SummaryDirective.DISABLE &
                availability_decision.cause == AvailabilityCause.OPERATOR_DISABLE) |
               (charging_assessment == ChargingAssessment.READY_NONE &
                power_assessment == PowerAssessment.READY_NONE &
                battery_assessment == BatteryAssessment.READY_NONE &
                propulsion_assessment == PropulsionAssessment.READY_NONE &
                fault_action_summary.fault == FaultStatus.CLEAR &
                fault_action_summary.directive != SummaryDirective.DISABLE &
                (recovery_frame.gate == RecoveryGate.CLOSED |
                 fault_action_summary.directive == SummaryDirective.RECOVER) &
                availability_decision.cause == AvailabilityCause.RECOVERY) |
               (charging_assessment == ChargingAssessment.READY_NONE &
                power_assessment == PowerAssessment.READY_NONE &
                battery_assessment == BatteryAssessment.READY_NONE &
                propulsion_assessment == PropulsionAssessment.READY_NONE &
                fault_action_summary.fault == FaultStatus.CLEAR &
                fault_action_summary.directive != SummaryDirective.DISABLE &
                recovery_frame.gate == RecoveryGate.OPEN &
                fault_action_summary.directive != SummaryDirective.RECOVER &
                demand_view == DemandPhase.IDLE &
                availability_decision.cause == AvailabilityCause.NO_DEMAND));
    }*/
  }

  // @trace PART-13
  part def PowerCommandInterlockOwner :> Thread {
    // @trace INT-19
    port actuation_feedback : DataPort { in :>> type : ActuationFeedback; }
    // @trace INT-28
    port availability_decision : DataPort { in :>> type : AvailabilityDecision; }
    // @trace INT-29
    port demand_view : DataPort { in :>> type : DemandPhase; }
    // @trace INT-30
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    // @trace INT-31
    port accepted_directive : DataPort { in :>> type : PriorityDirective; }
    // @trace INT-32
    port power_command : DataPort { out :>> type : PowerCommand; }
    language "GUMBO" /*{
      state
        // @trace PART-13
        commandMemory: CommandPhase;
      initialize
        modifies commandMemory;
        // @trace INIT-01
        guarantee INITIAL_COMMAND_DISABLED:
          commandMemory == CommandPhase.DISABLED & power_command == PowerCommand.DISABLE;
      compute
        modifies commandMemory;
        // @trace BEH-01
        guarantee COMPLETE_COMMAND_INTERLOCK:
          (((availability_decision.decision != AvailabilityValue.AVAILABLE_FOR_ENABLE |
             demand_view == DemandPhase.IDLE | recovery_gate != RecoveryGate.OPEN |
             (accepted_directive != PriorityDirective.ENABLE &
              accepted_directive != PriorityDirective.HOLD)) &
            commandMemory == CommandPhase.DISABLED & power_command == PowerCommand.DISABLE) |
           (availability_decision.decision == AvailabilityValue.AVAILABLE_FOR_ENABLE &
            demand_view != DemandPhase.IDLE & recovery_gate == RecoveryGate.OPEN &
            (accepted_directive == PriorityDirective.ENABLE |
             accepted_directive == PriorityDirective.HOLD) &
            In(commandMemory) == CommandPhase.DISABLED &
            commandMemory == CommandPhase.ENABLE_PENDING & power_command == PowerCommand.ENABLE_NEW) |
           (availability_decision.decision == AvailabilityValue.AVAILABLE_FOR_ENABLE &
            demand_view != DemandPhase.IDLE & recovery_gate == RecoveryGate.OPEN &
            (accepted_directive == PriorityDirective.ENABLE |
             accepted_directive == PriorityDirective.HOLD) &
            In(commandMemory) != CommandPhase.DISABLED & power_command == PowerCommand.ENABLE_HOLD &
            ((actuation_feedback == ActuationFeedback.ENABLED_CONFIRMED &
              commandMemory == CommandPhase.ENABLED) |
             (actuation_feedback == ActuationFeedback.DISABLED_CONFIRMED &
              commandMemory == CommandPhase.ENABLE_PENDING) |
             (actuation_feedback == ActuationFeedback.UNKNOWN &
              commandMemory == In(commandMemory)))));
    }*/
  }

  // @generated-support Behavior-free boundary mapper and semantic containment.
  part def PowerPropulsionSupervisorProcess :> Process {
    // @generated-support Transparent MON-01 Process endpoint.
    port battery_observation : DataPort { in :>> type : BatteryObservation; }
    // @generated-support Transparent MON-02 Process endpoint.
    port power_evidence : DataPort { in :>> type : PowerEvidence; }
    // @generated-support Transparent MON-03 Process endpoint.
    port odd_engine_evidence : DataPort { in :>> type : EnginePairEvidence; }
    // @generated-support Transparent MON-04 Process endpoint.
    port even_engine_evidence : DataPort { in :>> type : EnginePairEvidence; }
    // @generated-support Transparent MON-05 Process endpoint.
    port configuration_evidence : DataPort { in :>> type : ConfigurationEvidence; }
    // @generated-support Transparent MON-06 Process endpoint.
    port charger_evidence : DataPort { in :>> type : ChargerEvidence; }
    // @generated-support Transparent MON-07 Process endpoint.
    port control_event : DataPort { in :>> type : ControlEvent; }
    // @generated-support Transparent MON-08 Process endpoint with two consumers.
    port actuation_feedback : DataPort { in :>> type : ActuationFeedback; }
    // @generated-support Transparent CTRL-01 Process endpoint.
    port power_command : DataPort { out :>> type : PowerCommand; }
    // @generated-support Transparent CTRL-02 Process endpoint.
    port availability_report : DataPort { out :>> type : AvailabilityReport; }

    // @trace PART-01
    part battery_observation_admission : BatteryObservationAdmissionOwner;
    // @trace PART-02
    part battery_capacity_assessment : BatteryCapacityAssessmentOwner;
    // @trace PART-03
    part power_management_assessment : PowerManagementAssessmentOwner;
    // @trace PART-04
    part odd_engine_group_assessor : OddEngineGroupAssessor;
    // @trace PART-05
    part even_engine_group_assessor : EvenEngineGroupAssessor;
    // @trace PART-06
    part four_engine_configuration_assessor : FourEngineConfigurationAssessor;
    // @trace PART-07
    part propulsion_evidence_composer : PropulsionEvidenceComposer;
    // @trace PART-08
    part charging_interlock_assessor : ChargingInterlockAssessor;
    // @trace PART-09
    part enable_demand_lifecycle : EnableDemandLifecycleOwner;
    // @trace PART-10
    part fault_action_priority_resolver : FaultActionPriorityResolver;
    // @trace PART-11
    part recovery_qualification : RecoveryQualificationOwner;
    // @trace PART-12
    part availability_decision_owner : AvailabilityDecisionOwner;
    // @trace PART-13
    part power_command_interlock : PowerCommandInterlockOwner;

    // Eleven generated-support Process-boundary segments.
    // @generated-support Transparent MON-01 delegation to PART-01.
    connection support01 : PortConnection connect battery_observation to battery_observation_admission.battery_observation;
    // @generated-support Transparent MON-02 delegation to PART-03.
    connection support02 : PortConnection connect power_evidence to power_management_assessment.power_evidence;
    // @generated-support Transparent MON-03 delegation to PART-04.
    connection support03 : PortConnection connect odd_engine_evidence to odd_engine_group_assessor.odd_engine_evidence;
    // @generated-support Transparent MON-04 delegation to PART-05.
    connection support04 : PortConnection connect even_engine_evidence to even_engine_group_assessor.even_engine_evidence;
    // @generated-support Transparent MON-05 delegation to PART-06.
    connection support05 : PortConnection connect configuration_evidence to four_engine_configuration_assessor.configuration_evidence;
    // @generated-support Transparent MON-06 delegation to PART-08.
    connection support06 : PortConnection connect charger_evidence to charging_interlock_assessor.charger_evidence;
    // @generated-support Transparent MON-07 delegation to PART-09.
    connection support07 : PortConnection connect control_event to enable_demand_lifecycle.control_event;
    // @generated-support Transparent MON-08 fan-out to PART-09.
    connection support08 : PortConnection connect actuation_feedback to enable_demand_lifecycle.actuation_feedback;
    // @generated-support Transparent MON-08 fan-out to PART-13.
    connection support09 : PortConnection connect actuation_feedback to power_command_interlock.actuation_feedback;
    // @generated-support Transparent CTRL-01 delegation from PART-13.
    connection support10 : PortConnection connect power_command_interlock.power_command to power_command;
    // @generated-support Transparent CTRL-02 delegation from PART-12.
    connection support11 : PortConnection connect availability_decision_owner.availability_report to availability_report;

    // Twenty-two sibling-Thread semantic segments.
    // @trace INT-02
    connection int02 : PortConnection connect battery_observation_admission.qualified_battery to battery_capacity_assessment.qualified_battery;
    // @trace INT-07
    connection int07 : PortConnection connect odd_engine_group_assessor.odd_engine_assessment to propulsion_evidence_composer.odd_engine_assessment;
    // @trace INT-08
    connection int08 : PortConnection connect even_engine_group_assessor.even_engine_assessment to propulsion_evidence_composer.even_engine_assessment;
    // @trace INT-09
    connection int09 : PortConnection connect four_engine_configuration_assessor.configuration_assessment to propulsion_evidence_composer.configuration_assessment;
    // @trace INT-13
    connection int13 : PortConnection connect enable_demand_lifecycle.request_context to fault_action_priority_resolver.request_context;
    // @trace INT-14
    connection int14 : PortConnection connect battery_capacity_assessment.battery_assessment to fault_action_priority_resolver.battery_assessment;
    // @trace INT-15
    connection int15 : PortConnection connect power_management_assessment.power_assessment to fault_action_priority_resolver.power_assessment;
    // @trace INT-16
    connection int16 : PortConnection connect propulsion_evidence_composer.propulsion_assessment to fault_action_priority_resolver.propulsion_assessment;
    // @trace INT-17
    connection int17 : PortConnection connect charging_interlock_assessor.charging_assessment to fault_action_priority_resolver.charging_assessment;
    // @trace INT-18
    connection int18 : PortConnection connect fault_action_priority_resolver.accepted_directive to enable_demand_lifecycle.accepted_directive;
    // @trace INT-20
    connection int20 : PortConnection connect fault_action_priority_resolver.fault_action_summary to recovery_qualification.fault_action_summary;
    // @trace INT-21
    connection int21 : PortConnection connect battery_capacity_assessment.battery_assessment to availability_decision_owner.battery_assessment;
    // @trace INT-22
    connection int22 : PortConnection connect power_management_assessment.power_assessment to availability_decision_owner.power_assessment;
    // @trace INT-23
    connection int23 : PortConnection connect propulsion_evidence_composer.propulsion_assessment to availability_decision_owner.propulsion_assessment;
    // @trace INT-24
    connection int24 : PortConnection connect charging_interlock_assessor.charging_assessment to availability_decision_owner.charging_assessment;
    // @trace INT-25
    connection int25 : PortConnection connect enable_demand_lifecycle.demand_view to availability_decision_owner.demand_view;
    // @trace INT-26
    connection int26 : PortConnection connect fault_action_priority_resolver.fault_action_summary to availability_decision_owner.fault_action_summary;
    // @trace INT-27
    connection int27 : PortConnection connect recovery_qualification.recovery_frame to availability_decision_owner.recovery_frame;
    // @trace INT-28
    connection int28 : PortConnection connect availability_decision_owner.availability_decision to power_command_interlock.availability_decision;
    // @trace INT-29
    connection int29 : PortConnection connect enable_demand_lifecycle.demand_view to power_command_interlock.demand_view;
    // @trace INT-30
    connection int30 : PortConnection connect recovery_qualification.recovery_gate to power_command_interlock.recovery_gate;
    // @trace INT-31
    connection int31 : PortConnection connect fault_action_priority_resolver.accepted_directive to power_command_interlock.accepted_directive;
  }

  // @trace BOUND-01
  part def PowerPropulsionAvailabilitySystem :> System {
    // @trace MON-01
    port battery_observation : DataPort { in :>> type : BatteryObservation; }
    // @trace MON-02
    port power_evidence : DataPort { in :>> type : PowerEvidence; }
    // @trace MON-03
    port odd_engine_evidence : DataPort { in :>> type : EnginePairEvidence; }
    // @trace MON-04
    port even_engine_evidence : DataPort { in :>> type : EnginePairEvidence; }
    // @trace MON-05
    port configuration_evidence : DataPort { in :>> type : ConfigurationEvidence; }
    // @trace MON-06
    port charger_evidence : DataPort { in :>> type : ChargerEvidence; }
    // @trace MON-07
    port control_event : DataPort { in :>> type : ControlEvent; }
    // @trace MON-08
    port actuation_feedback : DataPort { in :>> type : ActuationFeedback; }
    // @trace CTRL-01
    port power_command : DataPort { out :>> type : PowerCommand; }
    // @trace CTRL-02
    port availability_report : DataPort { out :>> type : AvailabilityReport; }

    // @generated-support Sole behavior-free Process usage.
    part supervisor_process : PowerPropulsionSupervisorProcess;
    // @generated-support Transparent MON-01 root delegation.
    connection support12 : PortConnection connect battery_observation to supervisor_process.battery_observation;
    // @generated-support Transparent MON-02 root delegation.
    connection support13 : PortConnection connect power_evidence to supervisor_process.power_evidence;
    // @generated-support Transparent MON-03 root delegation.
    connection support14 : PortConnection connect odd_engine_evidence to supervisor_process.odd_engine_evidence;
    // @generated-support Transparent MON-04 root delegation.
    connection support15 : PortConnection connect even_engine_evidence to supervisor_process.even_engine_evidence;
    // @generated-support Transparent MON-05 root delegation.
    connection support16 : PortConnection connect configuration_evidence to supervisor_process.configuration_evidence;
    // @generated-support Transparent MON-06 root delegation.
    connection support17 : PortConnection connect charger_evidence to supervisor_process.charger_evidence;
    // @generated-support Transparent MON-07 root delegation.
    connection support18 : PortConnection connect control_event to supervisor_process.control_event;
    // @generated-support Transparent MON-08 root delegation.
    connection support19 : PortConnection connect actuation_feedback to supervisor_process.actuation_feedback;
    // @generated-support Transparent CTRL-01 root delegation.
    connection support20 : PortConnection connect supervisor_process.power_command to power_command;
    // @generated-support Transparent CTRL-02 root delegation.
    connection support21 : PortConnection connect supervisor_process.availability_report to availability_report;
  }

  // @trace BOUND-01
  part power_propulsion_availability_supervisor : PowerPropulsionAvailabilitySystem;
}
