package Vehicle_Temperature_Health_Supervisor {

  private import HAMR::*;

  // @trace MON-01
  enum def TemperatureRelation {
    enum AtOrBelowMaximum;
    enum AboveMaximum;
  }

  // @trace MON-01
  enum def InputStatus {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-02
  enum def MaintenanceTiming {
    enum NotDue;
    enum Due;
  }

  // @trace MON-03
  enum def ReturnIndication {
    enum NoRequest;
    enum FreshRequest;
  }

  // @trace PART-01
  enum def TemperatureAssessment {
    enum InvalidTemperature;
    enum NominalTemperature;
    enum OverTemperature;
  }

  // @trace PART-02
  enum def MaintenanceAssessment {
    enum InvalidMaintenance;
    enum MaintenanceClear;
    enum MaintenanceDue;
  }

  // @trace PART-03
  enum def RecoveryProposal {
    enum InvalidRecoveryEvidence;
    enum NotRequested;
    enum BlockedByMaintenance;
    enum BlockedByTemperature;
    enum EligibleRecovery;
  }

  // @trace CTRL-01
  enum def VehicleHealthMode {
    enum Operational;
    enum TemperatureDegraded;
    enum MaintenanceHold;
    enum Unavailable;
  }

  // @trace CTRL-02
  enum def ElectricalPowerDisposition {
    enum Enable;
    enum Withhold;
  }

  // @trace CTRL-03
  enum def RecoveryGuidance {
    enum None;
    enum ClearActiveCondition;
    enum SubmitFreshReturnRequest;
    enum RepairInputEvidence;
  }

  // @trace PART-04
  enum def DecisionReason {
    enum InvalidEvidence;
    enum MaintenanceActive;
    enum TemperatureActive;
    enum NormalRetained;
    enum RecoveryNotRequired;
    enum FreshRecoveryRequired;
    enum RecoveryAccepted;
  }

  // Inspected record members are attributes, not nested structural parts.
  // @trace MON-01
  part def TemperatureSample :> Data {
    // @trace MON-01
    attribute relation : TemperatureRelation;
    // @trace MON-01
    attribute status : InputStatus;
  }

  // @trace MON-02
  part def MaintenanceSample :> Data {
    // @trace MON-02
    attribute timing : MaintenanceTiming;
    // @trace MON-02
    attribute status : InputStatus;
  }

  // @trace MON-03
  part def ReturnSample :> Data {
    // @trace MON-03
    attribute indication : ReturnIndication;
    // @trace MON-03
    attribute status : InputStatus;
  }

  // @trace PART-04
  part def HealthDecision :> Data {
    // @trace STATE-01
    attribute nextMode : VehicleHealthMode;
    // @trace PART-04
    attribute reason : DecisionReason;
  }

  // @trace PART-01
  part def TemperatureEvidenceQualification :> Thread {
    // @trace INT-01
    port rawTemperature : DataPort { in :>> type : TemperatureSample; }
    // @trace INT-04
    port assessmentForRecovery : DataPort { out :>> type : TemperatureAssessment; }
    // @trace INT-06
    port assessmentForArbitration : DataPort { out :>> type : TemperatureAssessment; }

    language "GUMBO" /*{
      functions
        // @trace QUAL-TEMP-01
        def qualifyTemperature(sample: TemperatureSample): TemperatureAssessment :=
          if (sample.status == InputStatus.Invalid)? TemperatureAssessment.InvalidTemperature
          else if (sample.relation == TemperatureRelation.AtOrBelowMaximum)? TemperatureAssessment.NominalTemperature
          else TemperatureAssessment.OverTemperature;

      initialize
        // @trace INIT-01
        guarantee INITIAL_TEMPERATURE_UNTRUSTED "Both temperature facts initialize invalid until qualification":
          assessmentForRecovery == TemperatureAssessment.InvalidTemperature &
          assessmentForArbitration == TemperatureAssessment.InvalidTemperature;

      compute
        // @trace LOCAL-CONTRACT-01
        guarantee TEMPERATURE_FANOUT_PRESERVES_FACT "Both distinct consumers receive the one owner-local temperature fact":
          assessmentForRecovery == assessmentForArbitration;

        compute_cases
          // @trace QUAL-TEMP-01
          case TEMPERATURE_INVALID "Invalid status makes the relation irrelevant and derives InvalidTemperature":
            assume rawTemperature.status == InputStatus.Invalid;
            guarantee assessmentForRecovery == qualifyTemperature(rawTemperature) &
                      assessmentForArbitration == qualifyTemperature(rawTemperature);
          // @trace QUAL-TEMP-01
          case TEMPERATURE_NOMINAL "A valid at-or-below relation derives NominalTemperature":
            assume rawTemperature.status == InputStatus.Valid &
                   rawTemperature.relation == TemperatureRelation.AtOrBelowMaximum;
            guarantee assessmentForRecovery == qualifyTemperature(rawTemperature) &
                      assessmentForArbitration == qualifyTemperature(rawTemperature);
          // @trace QUAL-TEMP-01
          case TEMPERATURE_OVER "A valid above-maximum relation derives OverTemperature":
            assume rawTemperature.status == InputStatus.Valid &
                   rawTemperature.relation == TemperatureRelation.AboveMaximum;
            guarantee assessmentForRecovery == qualifyTemperature(rawTemperature) &
                      assessmentForArbitration == qualifyTemperature(rawTemperature);
    }*/
  }

  // @trace PART-02
  part def MaintenanceEvidenceQualification :> Thread {
    // @trace INT-02
    port rawMaintenance : DataPort { in :>> type : MaintenanceSample; }
    // @trace INT-05
    port assessmentForRecovery : DataPort { out :>> type : MaintenanceAssessment; }
    // @trace INT-07
    port assessmentForArbitration : DataPort { out :>> type : MaintenanceAssessment; }

    language "GUMBO" /*{
      functions
        // @trace QUAL-MAINT-01
        def qualifyMaintenance(sample: MaintenanceSample): MaintenanceAssessment :=
          if (sample.status == InputStatus.Invalid)? MaintenanceAssessment.InvalidMaintenance
          else if (sample.timing == MaintenanceTiming.NotDue)? MaintenanceAssessment.MaintenanceClear
          else MaintenanceAssessment.MaintenanceDue;

      initialize
        // @trace INIT-01
        guarantee INITIAL_MAINTENANCE_UNTRUSTED "Both maintenance facts initialize invalid until qualification":
          assessmentForRecovery == MaintenanceAssessment.InvalidMaintenance &
          assessmentForArbitration == MaintenanceAssessment.InvalidMaintenance;

      compute
        // @trace LOCAL-CONTRACT-01
        guarantee MAINTENANCE_FANOUT_PRESERVES_FACT "Both distinct consumers receive the one owner-local maintenance fact":
          assessmentForRecovery == assessmentForArbitration;

        compute_cases
          // @trace QUAL-MAINT-01
          case MAINTENANCE_INVALID "Invalid status makes timing irrelevant and derives InvalidMaintenance":
            assume rawMaintenance.status == InputStatus.Invalid;
            guarantee assessmentForRecovery == qualifyMaintenance(rawMaintenance) &
                      assessmentForArbitration == qualifyMaintenance(rawMaintenance);
          // @trace QUAL-MAINT-01
          case MAINTENANCE_CLEAR "Valid NotDue derives MaintenanceClear":
            assume rawMaintenance.status == InputStatus.Valid &
                   rawMaintenance.timing == MaintenanceTiming.NotDue;
            guarantee assessmentForRecovery == qualifyMaintenance(rawMaintenance) &
                      assessmentForArbitration == qualifyMaintenance(rawMaintenance);
          // @trace QUAL-MAINT-01
          case MAINTENANCE_DUE "Valid Due derives MaintenanceDue":
            assume rawMaintenance.status == InputStatus.Valid &
                   rawMaintenance.timing == MaintenanceTiming.Due;
            guarantee assessmentForRecovery == qualifyMaintenance(rawMaintenance) &
                      assessmentForArbitration == qualifyMaintenance(rawMaintenance);
    }*/
  }

  // @trace PART-03
  part def RecoveryApplicability :> Thread {
    // @trace INT-03
    port rawReturn : DataPort { in :>> type : ReturnSample; }
    // @trace INT-04
    port temperatureAssessment : DataPort { in :>> type : TemperatureAssessment; }
    // @trace INT-05
    port maintenanceAssessment : DataPort { in :>> type : MaintenanceAssessment; }
    // @trace INT-08
    port proposalForArbitration : DataPort { out :>> type : RecoveryProposal; }
    // @trace INT-09
    port proposalForOutcomes : DataPort { out :>> type : RecoveryProposal; }

    language "GUMBO" /*{
      functions
        // @trace QUAL-REC-01
        def classifyRecovery(sample: ReturnSample,
                             temperature: TemperatureAssessment,
                             maintenance: MaintenanceAssessment): RecoveryProposal :=
          if (sample.status == InputStatus.Invalid |
              temperature == TemperatureAssessment.InvalidTemperature |
              maintenance == MaintenanceAssessment.InvalidMaintenance)? RecoveryProposal.InvalidRecoveryEvidence
          else if (sample.indication == ReturnIndication.NoRequest)? RecoveryProposal.NotRequested
          else if (maintenance == MaintenanceAssessment.MaintenanceDue)? RecoveryProposal.BlockedByMaintenance
          else if (temperature == TemperatureAssessment.OverTemperature)? RecoveryProposal.BlockedByTemperature
          else RecoveryProposal.EligibleRecovery;

      initialize
        // @trace INIT-01
        guarantee INITIAL_RECOVERY_UNTRUSTED "Both proposal deliveries initialize invalid":
          proposalForArbitration == RecoveryProposal.InvalidRecoveryEvidence &
          proposalForOutcomes == RecoveryProposal.InvalidRecoveryEvidence;

      compute
        // @trace LOCAL-CONTRACT-01
        guarantee RECOVERY_FANOUT_PRESERVES_FACT "Both distinct consumers receive the one owner-local recovery proposal":
          proposalForArbitration == proposalForOutcomes;

        compute_cases
          // @trace QUAL-REC-01
          case RECOVERY_INVALID "Invalid return status or either invalid assessment derives InvalidRecoveryEvidence":
            assume rawReturn.status == InputStatus.Invalid |
                   temperatureAssessment == TemperatureAssessment.InvalidTemperature |
                   maintenanceAssessment == MaintenanceAssessment.InvalidMaintenance;
            guarantee proposalForArbitration == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment) &
                      proposalForOutcomes == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment);
          // @trace QUAL-REC-01
          case RECOVERY_NOT_REQUESTED "Valid evidence with NoRequest derives NotRequested before active-condition tests":
            assume rawReturn.status == InputStatus.Valid &
                   temperatureAssessment != TemperatureAssessment.InvalidTemperature &
                   maintenanceAssessment != MaintenanceAssessment.InvalidMaintenance &
                   rawReturn.indication == ReturnIndication.NoRequest;
            guarantee proposalForArbitration == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment) &
                      proposalForOutcomes == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment);
          // @trace QUAL-REC-01
          case RECOVERY_BLOCKED_MAINTENANCE "A fresh request with valid maintenance due is blocked by maintenance":
            assume rawReturn.status == InputStatus.Valid &
                   temperatureAssessment != TemperatureAssessment.InvalidTemperature &
                   maintenanceAssessment == MaintenanceAssessment.MaintenanceDue &
                   rawReturn.indication == ReturnIndication.FreshRequest;
            guarantee proposalForArbitration == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment) &
                      proposalForOutcomes == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment);
          // @trace QUAL-REC-01
          case RECOVERY_BLOCKED_TEMPERATURE "A fresh request with maintenance clear and over-temperature is blocked by temperature":
            assume rawReturn.status == InputStatus.Valid &
                   temperatureAssessment == TemperatureAssessment.OverTemperature &
                   maintenanceAssessment == MaintenanceAssessment.MaintenanceClear &
                   rawReturn.indication == ReturnIndication.FreshRequest;
            guarantee proposalForArbitration == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment) &
                      proposalForOutcomes == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment);
          // @trace QUAL-REC-01
          case RECOVERY_ELIGIBLE "A fresh request with nominal temperature and maintenance clear is eligible":
            assume rawReturn.status == InputStatus.Valid &
                   temperatureAssessment == TemperatureAssessment.NominalTemperature &
                   maintenanceAssessment == MaintenanceAssessment.MaintenanceClear &
                   rawReturn.indication == ReturnIndication.FreshRequest;
            guarantee proposalForArbitration == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment) &
                      proposalForOutcomes == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment);
    }*/
  }

  // @trace PART-04
  part def HealthModeArbitration :> Thread {
    // @trace INT-06
    port temperatureAssessment : DataPort { in :>> type : TemperatureAssessment; }
    // @trace INT-07
    port maintenanceAssessment : DataPort { in :>> type : MaintenanceAssessment; }
    // @trace INT-08
    port recoveryProposal : DataPort { in :>> type : RecoveryProposal; }
    // @trace INT-10
    port healthDecision : DataPort { out :>> type : HealthDecision; }

    language "GUMBO" /*{
      state
        // @trace STATE-01
        healthState: VehicleHealthMode;

      functions
        // @trace CONSIST-01
        def proposalConsistent(temperature: TemperatureAssessment,
                               maintenance: MaintenanceAssessment,
                               proposal: RecoveryProposal): Base_Types::Boolean :=
          proposal == RecoveryProposal.InvalidRecoveryEvidence |
          (proposal == RecoveryProposal.NotRequested &
           temperature != TemperatureAssessment.InvalidTemperature &
           maintenance != MaintenanceAssessment.InvalidMaintenance) |
          (proposal == RecoveryProposal.BlockedByMaintenance &
           temperature != TemperatureAssessment.InvalidTemperature &
           maintenance == MaintenanceAssessment.MaintenanceDue) |
          (proposal == RecoveryProposal.BlockedByTemperature &
           temperature == TemperatureAssessment.OverTemperature &
           maintenance == MaintenanceAssessment.MaintenanceClear) |
          (proposal == RecoveryProposal.EligibleRecovery &
           temperature == TemperatureAssessment.NominalTemperature &
           maintenance == MaintenanceAssessment.MaintenanceClear);

      initialize
        // @trace INIT-01
        guarantee INITIAL_OWNER_HOLD "The sole state owner initializes unavailable with a complete invalid-evidence decision":
          healthState == VehicleHealthMode.Unavailable &
          healthDecision.nextMode == VehicleHealthMode.Unavailable &
          healthDecision.reason == DecisionReason.InvalidEvidence;

      compute
        // @trace STATE-AUDIT-01
        guarantee COMMITTED_DECISION_MATCHES_STATE "The published next mode is the sole committed next state":
          healthDecision.nextMode == healthState;

        // @trace PRIORITY-01
        compute_cases
          // @trace CASE-01
          case CASE_01_INVALID_OR_MALFORMED "Invalid or producer-inconsistent evidence has highest priority":
            assume temperatureAssessment == TemperatureAssessment.InvalidTemperature |
                   maintenanceAssessment == MaintenanceAssessment.InvalidMaintenance |
                   recoveryProposal == RecoveryProposal.InvalidRecoveryEvidence |
                   not proposalConsistent(temperatureAssessment, maintenanceAssessment, recoveryProposal);
            guarantee healthState == VehicleHealthMode.Unavailable &
                      healthDecision.nextMode == VehicleHealthMode.Unavailable &
                      healthDecision.reason == DecisionReason.InvalidEvidence;

          // @trace CASE-02
          case CASE_02_MAINTENANCE_PRIORITY "Consistent maintenance due outranks temperature and recovery":
            assume temperatureAssessment != TemperatureAssessment.InvalidTemperature &
                   maintenanceAssessment == MaintenanceAssessment.MaintenanceDue &
                   recoveryProposal != RecoveryProposal.InvalidRecoveryEvidence &
                   proposalConsistent(temperatureAssessment, maintenanceAssessment, recoveryProposal);
            guarantee healthState == VehicleHealthMode.MaintenanceHold &
                      healthDecision.nextMode == VehicleHealthMode.MaintenanceHold &
                      healthDecision.reason == DecisionReason.MaintenanceActive;

          // @trace CASE-03
          case CASE_03_TEMPERATURE_PRIORITY "Consistent over-temperature with maintenance clear selects degraded mode":
            assume temperatureAssessment == TemperatureAssessment.OverTemperature &
                   maintenanceAssessment == MaintenanceAssessment.MaintenanceClear &
                   recoveryProposal != RecoveryProposal.InvalidRecoveryEvidence &
                   proposalConsistent(temperatureAssessment, maintenanceAssessment, recoveryProposal);
            guarantee healthState == VehicleHealthMode.TemperatureDegraded &
                      healthDecision.nextMode == VehicleHealthMode.TemperatureDegraded &
                      healthDecision.reason == DecisionReason.TemperatureActive;

          // @trace CASE-04
          case CASE_04_OPERATIONAL_RETAINED "Operational clear evidence with no request retains normal operation":
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature &
                   maintenanceAssessment == MaintenanceAssessment.MaintenanceClear &
                   recoveryProposal == RecoveryProposal.NotRequested &
                   In(healthState) == VehicleHealthMode.Operational;
            guarantee healthState == VehicleHealthMode.Operational &
                      healthDecision.nextMode == VehicleHealthMode.Operational &
                      healthDecision.reason == DecisionReason.NormalRetained;

          // @trace CASE-05
          case CASE_05_RECOVERY_NOT_REQUIRED "A spurious eligible fresh event while operational is consumed":
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature &
                   maintenanceAssessment == MaintenanceAssessment.MaintenanceClear &
                   recoveryProposal == RecoveryProposal.EligibleRecovery &
                   In(healthState) == VehicleHealthMode.Operational;
            guarantee healthState == VehicleHealthMode.Operational &
                      healthDecision.nextMode == VehicleHealthMode.Operational &
                      healthDecision.reason == DecisionReason.RecoveryNotRequired;

          // @trace CASE-06
          case CASE_06_UNAVAILABLE_RETAINS "Clearing evidence without a fresh request retains unavailable":
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature &
                   maintenanceAssessment == MaintenanceAssessment.MaintenanceClear &
                   recoveryProposal == RecoveryProposal.NotRequested &
                   In(healthState) == VehicleHealthMode.Unavailable;
            guarantee healthState == VehicleHealthMode.Unavailable &
                      healthDecision.nextMode == VehicleHealthMode.Unavailable &
                      healthDecision.reason == DecisionReason.FreshRecoveryRequired;

          // @trace CASE-07
          case CASE_07_UNAVAILABLE_RECOVERS "A later eligible fresh request recovers unavailable":
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature &
                   maintenanceAssessment == MaintenanceAssessment.MaintenanceClear &
                   recoveryProposal == RecoveryProposal.EligibleRecovery &
                   In(healthState) == VehicleHealthMode.Unavailable;
            guarantee healthState == VehicleHealthMode.Operational &
                      healthDecision.nextMode == VehicleHealthMode.Operational &
                      healthDecision.reason == DecisionReason.RecoveryAccepted;

          // @trace CASE-08
          case CASE_08_MAINTENANCE_RETAINS "Clearing evidence without a fresh request retains maintenance hold":
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature &
                   maintenanceAssessment == MaintenanceAssessment.MaintenanceClear &
                   recoveryProposal == RecoveryProposal.NotRequested &
                   In(healthState) == VehicleHealthMode.MaintenanceHold;
            guarantee healthState == VehicleHealthMode.MaintenanceHold &
                      healthDecision.nextMode == VehicleHealthMode.MaintenanceHold &
                      healthDecision.reason == DecisionReason.FreshRecoveryRequired;

          // @trace CASE-09
          case CASE_09_MAINTENANCE_RECOVERS "A later eligible fresh request recovers maintenance hold":
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature &
                   maintenanceAssessment == MaintenanceAssessment.MaintenanceClear &
                   recoveryProposal == RecoveryProposal.EligibleRecovery &
                   In(healthState) == VehicleHealthMode.MaintenanceHold;
            guarantee healthState == VehicleHealthMode.Operational &
                      healthDecision.nextMode == VehicleHealthMode.Operational &
                      healthDecision.reason == DecisionReason.RecoveryAccepted;

          // @trace CASE-10
          case CASE_10_TEMPERATURE_RETAINS "Clearing evidence without a fresh request retains temperature degradation":
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature &
                   maintenanceAssessment == MaintenanceAssessment.MaintenanceClear &
                   recoveryProposal == RecoveryProposal.NotRequested &
                   In(healthState) == VehicleHealthMode.TemperatureDegraded;
            guarantee healthState == VehicleHealthMode.TemperatureDegraded &
                      healthDecision.nextMode == VehicleHealthMode.TemperatureDegraded &
                      healthDecision.reason == DecisionReason.FreshRecoveryRequired;

          // @trace CASE-11
          case CASE_11_TEMPERATURE_RECOVERS "A later eligible fresh request recovers temperature degradation":
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature &
                   maintenanceAssessment == MaintenanceAssessment.MaintenanceClear &
                   recoveryProposal == RecoveryProposal.EligibleRecovery &
                   In(healthState) == VehicleHealthMode.TemperatureDegraded;
            guarantee healthState == VehicleHealthMode.Operational &
                      healthDecision.nextMode == VehicleHealthMode.Operational &
                      healthDecision.reason == DecisionReason.RecoveryAccepted;
    }*/
  }

  // @trace PART-05
  part def BoundaryOutcomeDerivation :> Thread {
    // @trace INT-10
    port healthDecision : DataPort { in :>> type : HealthDecision; }
    // @trace INT-09
    port recoveryProposal : DataPort { in :>> type : RecoveryProposal; }
    // @trace INT-11
    port vehicleHealthMode : DataPort { out :>> type : VehicleHealthMode; }
    // @trace INT-12
    port powerDisposition : DataPort { out :>> type : ElectricalPowerDisposition; }
    // @trace INT-13
    port recoveryGuidance : DataPort { out :>> type : RecoveryGuidance; }

    language "GUMBO" /*{
      functions
        // @trace OUT-01
        def acceptedProducerPair(decision: HealthDecision,
                                 proposal: RecoveryProposal): Base_Types::Boolean :=
          (decision.nextMode == VehicleHealthMode.Unavailable &
           decision.reason == DecisionReason.InvalidEvidence) |
          (decision.nextMode == VehicleHealthMode.MaintenanceHold &
           decision.reason == DecisionReason.MaintenanceActive &
           (proposal == RecoveryProposal.NotRequested |
            proposal == RecoveryProposal.BlockedByMaintenance)) |
          (decision.nextMode == VehicleHealthMode.TemperatureDegraded &
           decision.reason == DecisionReason.TemperatureActive &
           (proposal == RecoveryProposal.NotRequested |
            proposal == RecoveryProposal.BlockedByTemperature)) |
          (decision.nextMode == VehicleHealthMode.Operational &
           decision.reason == DecisionReason.NormalRetained &
           proposal == RecoveryProposal.NotRequested) |
          (decision.nextMode == VehicleHealthMode.Operational &
           decision.reason == DecisionReason.RecoveryNotRequired &
           proposal == RecoveryProposal.EligibleRecovery) |
          (decision.nextMode == VehicleHealthMode.Operational &
           decision.reason == DecisionReason.RecoveryAccepted &
           proposal == RecoveryProposal.EligibleRecovery) |
          (decision.nextMode != VehicleHealthMode.Operational &
           decision.reason == DecisionReason.FreshRecoveryRequired &
           proposal == RecoveryProposal.NotRequested);

        // @trace OUT-01
        def selectedMode(decision: HealthDecision,
                         proposal: RecoveryProposal): VehicleHealthMode :=
          if (acceptedProducerPair(decision, proposal))? decision.nextMode
          else VehicleHealthMode.Unavailable;

        // @trace OUT-01
        def selectedPower(decision: HealthDecision,
                          proposal: RecoveryProposal): ElectricalPowerDisposition :=
          if (acceptedProducerPair(decision, proposal) &
              decision.nextMode == VehicleHealthMode.Operational)? ElectricalPowerDisposition.Enable
          else ElectricalPowerDisposition.Withhold;

        // @trace OUT-01
        def selectedGuidance(decision: HealthDecision,
                             proposal: RecoveryProposal): RecoveryGuidance :=
          if (not acceptedProducerPair(decision, proposal))? RecoveryGuidance.RepairInputEvidence
          else if (decision.reason == DecisionReason.InvalidEvidence)? RecoveryGuidance.RepairInputEvidence
          else if (decision.reason == DecisionReason.MaintenanceActive |
                   decision.reason == DecisionReason.TemperatureActive)? RecoveryGuidance.ClearActiveCondition
          else if (decision.reason == DecisionReason.FreshRecoveryRequired)? RecoveryGuidance.SubmitFreshReturnRequest
          else RecoveryGuidance.None;

      initialize
        // @trace INIT-01
        guarantee INITIAL_BOUNDARY_HOLD "Boundary outputs initialize to the approved logical hold":
          vehicleHealthMode == VehicleHealthMode.Unavailable &
          powerDisposition == ElectricalPowerDisposition.Withhold &
          recoveryGuidance == RecoveryGuidance.SubmitFreshReturnRequest;

      compute
        // @trace OUT-01
        guarantee DEFENSIVE_OUTCOME_CLASSIFICATION "Every decision/proposal pair selects all three outputs or fails closed":
          vehicleHealthMode == selectedMode(healthDecision, recoveryProposal) &
          powerDisposition == selectedPower(healthDecision, recoveryProposal) &
          recoveryGuidance == selectedGuidance(healthDecision, recoveryProposal);
    }*/
  }

  // @generated-support SUPPORT-01 behavior-free containment and boundary routing
  part def VehicleHealthSupervisionProcess :> Process {
    // @trace PART-01
    part temperatureQualification : TemperatureEvidenceQualification;
    // @trace PART-02
    part maintenanceQualification : MaintenanceEvidenceQualification;
    // @trace PART-03
    part recoveryApplicability : RecoveryApplicability;
    // @trace PART-04
    part healthModeArbitration : HealthModeArbitration;
    // @trace PART-05
    part boundaryOutcomeDerivation : BoundaryOutcomeDerivation;

    // @generated-support inbound Process boundary for INT-01
    port temperatureSample : DataPort { in :>> type : TemperatureSample; }
    // @generated-support inbound Process boundary for INT-02
    port maintenanceSample : DataPort { in :>> type : MaintenanceSample; }
    // @generated-support inbound Process boundary for INT-03
    port returnSample : DataPort { in :>> type : ReturnSample; }
    // @generated-support outbound Process boundary for INT-11
    port vehicleHealthMode : DataPort { out :>> type : VehicleHealthMode; }
    // @generated-support outbound Process boundary for INT-12
    port powerDisposition : DataPort { out :>> type : ElectricalPowerDisposition; }
    // @generated-support outbound Process boundary for INT-13
    port recoveryGuidance : DataPort { out :>> type : RecoveryGuidance; }

    // @generated-support Process-to-Thread refinement hop for INT-01
    connection supportTemperatureInput : PortConnection
      connect temperatureSample to temperatureQualification.rawTemperature;
    // @generated-support Process-to-Thread refinement hop for INT-02
    connection supportMaintenanceInput : PortConnection
      connect maintenanceSample to maintenanceQualification.rawMaintenance;
    // @generated-support Process-to-Thread refinement hop for INT-03
    connection supportReturnInput : PortConnection
      connect returnSample to recoveryApplicability.rawReturn;

    // @trace INT-04
    connection temperatureToRecovery : PortConnection
      connect temperatureQualification.assessmentForRecovery to recoveryApplicability.temperatureAssessment;
    // @trace INT-05
    connection maintenanceToRecovery : PortConnection
      connect maintenanceQualification.assessmentForRecovery to recoveryApplicability.maintenanceAssessment;
    // @trace INT-06
    connection temperatureToArbitration : PortConnection
      connect temperatureQualification.assessmentForArbitration to healthModeArbitration.temperatureAssessment;
    // @trace INT-07
    connection maintenanceToArbitration : PortConnection
      connect maintenanceQualification.assessmentForArbitration to healthModeArbitration.maintenanceAssessment;
    // @trace INT-08
    connection proposalToArbitration : PortConnection
      connect recoveryApplicability.proposalForArbitration to healthModeArbitration.recoveryProposal;
    // @trace INT-09
    connection proposalToOutcomes : PortConnection
      connect recoveryApplicability.proposalForOutcomes to boundaryOutcomeDerivation.recoveryProposal;
    // @trace INT-10
    connection decisionToOutcomes : PortConnection
      connect healthModeArbitration.healthDecision to boundaryOutcomeDerivation.healthDecision;

    // @generated-support Thread-to-Process refinement hop for INT-11
    connection supportHealthModeOutput : PortConnection
      connect boundaryOutcomeDerivation.vehicleHealthMode to vehicleHealthMode;
    // @generated-support Thread-to-Process refinement hop for INT-12
    connection supportPowerOutput : PortConnection
      connect boundaryOutcomeDerivation.powerDisposition to powerDisposition;
    // @generated-support Thread-to-Process refinement hop for INT-13
    connection supportGuidanceOutput : PortConnection
      connect boundaryOutcomeDerivation.recoveryGuidance to recoveryGuidance;
  }

  // @trace BOUND-01
  part def VehicleTemperatureHealthSupervisorSystem :> System {
    // @generated-support SUPPORT-01 sole behavior-free Process usage
    part supervisionProcess : VehicleHealthSupervisionProcess;

    // @trace MON-01
    port temperatureSample : DataPort { in :>> type : TemperatureSample; }
    // @trace MON-02
    port maintenanceSample : DataPort { in :>> type : MaintenanceSample; }
    // @trace MON-03
    port returnSample : DataPort { in :>> type : ReturnSample; }
    // @trace CTRL-01
    port vehicleHealthMode : DataPort { out :>> type : VehicleHealthMode; }
    // @trace CTRL-02
    port powerDisposition : DataPort { out :>> type : ElectricalPowerDisposition; }
    // @trace CTRL-03
    port recoveryGuidance : DataPort { out :>> type : RecoveryGuidance; }

    // @generated-support root-to-Process route for INT-01
    connection supportBoundaryTemperature : PortConnection
      connect temperatureSample to supervisionProcess.temperatureSample;
    // @generated-support root-to-Process route for INT-02
    connection supportBoundaryMaintenance : PortConnection
      connect maintenanceSample to supervisionProcess.maintenanceSample;
    // @generated-support root-to-Process route for INT-03
    connection supportBoundaryReturn : PortConnection
      connect returnSample to supervisionProcess.returnSample;
    // @generated-support Process-to-root route for INT-11
    connection supportBoundaryHealthMode : PortConnection
      connect supervisionProcess.vehicleHealthMode to vehicleHealthMode;
    // @generated-support Process-to-root route for INT-12
    connection supportBoundaryPower : PortConnection
      connect supervisionProcess.powerDisposition to powerDisposition;
    // @generated-support Process-to-root route for INT-13
    connection supportBoundaryGuidance : PortConnection
      connect supervisionProcess.recoveryGuidance to recoveryGuidance;
  }

  // @trace STRUCT-01
  part vehicleTemperatureHealthSupervisor : VehicleTemperatureHealthSupervisorSystem;
}
