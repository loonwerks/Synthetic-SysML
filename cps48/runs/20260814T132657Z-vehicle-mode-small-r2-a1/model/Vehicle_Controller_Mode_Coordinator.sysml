// Canonical SysML-AADL/GUMBO realization of the approved controller-mode
// coordination baseline. Quoted 'event' fields preserve the abstract's exact
// record member while avoiding the SysML event keyword.

// @trace PURPOSE-01
package Vehicle_Controller_Mode_Coordinator {
  private import HAMR::*;

  // @trace MON-01
  enum def InputStatus { enum Valid; enum Invalid; }

  // @trace MON-01
  enum def LifecycleEvent {
    enum NoLifecycleEvent; enum Start; enum On; enum Off;
  }

  // @trace MON-02
  enum def ConditionEvent {
    enum NoConditionEvent; enum Maintenance; enum Degraded; enum ReturnToNormal;
  }

  // @trace CTRL-01
  enum def ControllerModeDisposition {
    enum Off; enum Starting; enum On; enum Maintenance; enum Degraded;
  }

  // @trace CTRL-02
  enum def CoordinationResult {
    enum Applied; enum Stable; enum Rejected; enum EvidenceFault;
  }

  // @trace PART-01
  enum def LifecycleAssessment {
    enum InvalidLifecycle; enum NoLifecycle; enum StartRequested;
    enum OnRequested; enum OffRequested;
  }

  // @trace PART-02
  enum def ConditionAssessment {
    enum InvalidCondition; enum NoCondition; enum MaintenanceRequested;
    enum DegradedReported; enum ReturnRequested;
  }

  // @trace PART-03
  enum def CoordinationClass {
    enum InvalidEvidence; enum Quiet; enum LifecycleOnly; enum ConditionOnly;
    enum OffDominantConflict; enum ConditionDominantConflict;
    enum RecoveryConflict;
  }

  // @trace PART-04
  enum def DecisionReason {
    enum InvalidEvidence; enum OffAccepted; enum DegradedAccepted;
    enum MaintenanceAccepted; enum ConflictingRequestsRejected;
    enum ReturnAccepted; enum ReturnNotApplicable; enum OnAccepted;
    enum StartAccepted; enum NoRequest; enum TransitionRejected;
  }

  // Every record field inspected by GUMBO is declared as an attribute.
  // @trace MON-01
  part def LifecycleSample :> Data {
    attribute 'event' : LifecycleEvent;
    attribute status : InputStatus;
  }

  // @trace MON-02
  part def ConditionSample :> Data {
    attribute 'event' : ConditionEvent;
    attribute status : InputStatus;
  }

  // @trace PART-04
  part def ModeDecision :> Data {
    attribute nextMode : ControllerModeDisposition;
    attribute reason : DecisionReason;
  }

  // @trace PART-01
  part def LifecycleIndicationQualification :> Thread {
    // @trace INT-01
    port lifecycle_sample : DataPort { in :>> type : LifecycleSample; }
    // @trace INT-03
    port assessment_to_compatibility : DataPort { out :>> type : LifecycleAssessment; }
    // @trace INT-05
    port assessment_to_arbiter : DataPort { out :>> type : LifecycleAssessment; }

    language "GUMBO" /*{
      functions
        // @trace QUAL-LIFE-01
        def qualify_lifecycle(sample: LifecycleSample): LifecycleAssessment :=
          if (sample.status == InputStatus.Invalid)? LifecycleAssessment.InvalidLifecycle
          else if (sample.'event' == LifecycleEvent.NoLifecycleEvent)? LifecycleAssessment.NoLifecycle
          else if (sample.'event' == LifecycleEvent.Start)? LifecycleAssessment.StartRequested
          else if (sample.'event' == LifecycleEvent.On)? LifecycleAssessment.OnRequested
          else LifecycleAssessment.OffRequested;

      initialize
        // @trace INIT-01
        guarantee INITIAL_LIFECYCLE_ASSESSMENTS_SAFE:
          assessment_to_compatibility == LifecycleAssessment.NoLifecycle &
          assessment_to_arbiter == LifecycleAssessment.NoLifecycle;

      compute
        // @trace QUAL-LIFE-01
        guarantee QUAL_LIFE_DERIVATION:
          assessment_to_compatibility == qualify_lifecycle(lifecycle_sample) &
          assessment_to_arbiter == qualify_lifecycle(lifecycle_sample);
    }*/
  }

  // @trace PART-02
  part def ConditionIndicationQualification :> Thread {
    // @trace INT-02
    port condition_sample : DataPort { in :>> type : ConditionSample; }
    // @trace INT-04
    port assessment_to_compatibility : DataPort { out :>> type : ConditionAssessment; }
    // @trace INT-06
    port assessment_to_arbiter : DataPort { out :>> type : ConditionAssessment; }

    language "GUMBO" /*{
      functions
        // @trace QUAL-COND-01
        def qualify_condition(sample: ConditionSample): ConditionAssessment :=
          if (sample.status == InputStatus.Invalid)? ConditionAssessment.InvalidCondition
          else if (sample.'event' == ConditionEvent.NoConditionEvent)? ConditionAssessment.NoCondition
          else if (sample.'event' == ConditionEvent.Maintenance)? ConditionAssessment.MaintenanceRequested
          else if (sample.'event' == ConditionEvent.Degraded)? ConditionAssessment.DegradedReported
          else ConditionAssessment.ReturnRequested;

      initialize
        // @trace INIT-01
        guarantee INITIAL_CONDITION_ASSESSMENTS_SAFE:
          assessment_to_compatibility == ConditionAssessment.NoCondition &
          assessment_to_arbiter == ConditionAssessment.NoCondition;

      compute
        // @trace QUAL-COND-01
        guarantee QUAL_COND_DERIVATION:
          assessment_to_compatibility == qualify_condition(condition_sample) &
          assessment_to_arbiter == qualify_condition(condition_sample);
    }*/
  }

  // @trace PART-03
  part def CrossChannelCompatibility :> Thread {
    // @trace INT-03
    port lifecycle_assessment : DataPort { in :>> type : LifecycleAssessment; }
    // @trace INT-04
    port condition_assessment : DataPort { in :>> type : ConditionAssessment; }
    // @trace INT-07
    port coordination_class : DataPort { out :>> type : CoordinationClass; }

    language "GUMBO" /*{
      functions
        // @trace COMPAT-01
        def classify(life: LifecycleAssessment,
                     cond: ConditionAssessment): CoordinationClass :=
          if (life == LifecycleAssessment.InvalidLifecycle |
              cond == ConditionAssessment.InvalidCondition)? CoordinationClass.InvalidEvidence
          else if (life == LifecycleAssessment.NoLifecycle &
                   cond == ConditionAssessment.NoCondition)? CoordinationClass.Quiet
          else if (life != LifecycleAssessment.NoLifecycle &
                   cond == ConditionAssessment.NoCondition)? CoordinationClass.LifecycleOnly
          else if (life == LifecycleAssessment.NoLifecycle &
                   cond != ConditionAssessment.NoCondition)? CoordinationClass.ConditionOnly
          else if (life == LifecycleAssessment.OffRequested)? CoordinationClass.OffDominantConflict
          else if ((life == LifecycleAssessment.StartRequested |
                    life == LifecycleAssessment.OnRequested) &
                   (cond == ConditionAssessment.MaintenanceRequested |
                    cond == ConditionAssessment.DegradedReported))? CoordinationClass.ConditionDominantConflict
          else CoordinationClass.RecoveryConflict;

      initialize
        // @trace INIT-01
        guarantee INITIAL_COMPATIBILITY_SAFE:
          coordination_class == CoordinationClass.Quiet;

      compute
        // @trace COMPAT-01
        guarantee COMPATIBILITY_DERIVATION:
          coordination_class == classify(lifecycle_assessment, condition_assessment);
    }*/
  }

  // @trace PART-04
  part def ControllerModeArbitration :> Thread {
    // @trace INT-05
    port lifecycle_assessment : DataPort { in :>> type : LifecycleAssessment; }
    // @trace INT-06
    port condition_assessment : DataPort { in :>> type : ConditionAssessment; }
    // @trace INT-07
    port coordination_class : DataPort { in :>> type : CoordinationClass; }
    // @trace INT-08
    port mode_decision : DataPort { out :>> type : ModeDecision; }

    language "GUMBO" /*{
      // @trace OWNER-01
      state
        // @trace STATE-01
        controllerMode: ControllerModeDisposition;

      functions
        // @trace CONSIST-01
        def expected_class(life: LifecycleAssessment,
                           cond: ConditionAssessment): CoordinationClass :=
          if (life == LifecycleAssessment.InvalidLifecycle |
              cond == ConditionAssessment.InvalidCondition)? CoordinationClass.InvalidEvidence
          else if (life == LifecycleAssessment.NoLifecycle &
                   cond == ConditionAssessment.NoCondition)? CoordinationClass.Quiet
          else if (life != LifecycleAssessment.NoLifecycle &
                   cond == ConditionAssessment.NoCondition)? CoordinationClass.LifecycleOnly
          else if (life == LifecycleAssessment.NoLifecycle &
                   cond != ConditionAssessment.NoCondition)? CoordinationClass.ConditionOnly
          else if (life == LifecycleAssessment.OffRequested)? CoordinationClass.OffDominantConflict
          else if ((life == LifecycleAssessment.StartRequested |
                    life == LifecycleAssessment.OnRequested) &
                   (cond == ConditionAssessment.MaintenanceRequested |
                    cond == ConditionAssessment.DegradedReported))? CoordinationClass.ConditionDominantConflict
          else CoordinationClass.RecoveryConflict;

        // @trace CONSIST-01
        def consistent(life: LifecycleAssessment,
                       cond: ConditionAssessment,
                       kind: CoordinationClass): Base_Types::Boolean :=
          kind == expected_class(life, cond);

        // @trace CASE-01
        def guard_case_01(life: LifecycleAssessment,
                          cond: ConditionAssessment,
                          kind: CoordinationClass): Base_Types::Boolean :=
          life == LifecycleAssessment.InvalidLifecycle |
          cond == ConditionAssessment.InvalidCondition |
          not consistent(life, cond, kind);

        // @trace CASE-02
        def guard_case_02(life: LifecycleAssessment,
                          cond: ConditionAssessment,
                          kind: CoordinationClass): Base_Types::Boolean :=
          not guard_case_01(life, cond, kind) &
          life == LifecycleAssessment.OffRequested;

        // @trace CASE-03
        def guard_case_03(life: LifecycleAssessment,
                          cond: ConditionAssessment,
                          kind: CoordinationClass): Base_Types::Boolean :=
          not guard_case_01(life, cond, kind) &
          not guard_case_02(life, cond, kind) &
          cond == ConditionAssessment.DegradedReported;

        // @trace CASE-04
        def guard_case_04(life: LifecycleAssessment,
                          cond: ConditionAssessment,
                          kind: CoordinationClass): Base_Types::Boolean :=
          not guard_case_01(life, cond, kind) &
          not guard_case_02(life, cond, kind) &
          not guard_case_03(life, cond, kind) &
          cond == ConditionAssessment.MaintenanceRequested;

        // @trace CASE-05
        def guard_case_05(life: LifecycleAssessment,
                          cond: ConditionAssessment,
                          kind: CoordinationClass): Base_Types::Boolean :=
          not guard_case_01(life, cond, kind) &
          not guard_case_02(life, cond, kind) &
          not guard_case_03(life, cond, kind) &
          not guard_case_04(life, cond, kind) &
          kind == CoordinationClass.RecoveryConflict;

        // @trace CASE-06
        def guard_case_06(life: LifecycleAssessment,
                          cond: ConditionAssessment,
                          kind: CoordinationClass,
                          mode: ControllerModeDisposition): Base_Types::Boolean :=
          not guard_case_01(life, cond, kind) &
          not guard_case_02(life, cond, kind) &
          not guard_case_03(life, cond, kind) &
          not guard_case_04(life, cond, kind) &
          not guard_case_05(life, cond, kind) &
          life == LifecycleAssessment.NoLifecycle &
          cond == ConditionAssessment.ReturnRequested &
          (mode == ControllerModeDisposition.Maintenance |
           mode == ControllerModeDisposition.Degraded);

        // @trace CASE-07
        def guard_case_07(life: LifecycleAssessment,
                          cond: ConditionAssessment,
                          kind: CoordinationClass,
                          mode: ControllerModeDisposition): Base_Types::Boolean :=
          not guard_case_01(life, cond, kind) &
          not guard_case_02(life, cond, kind) &
          not guard_case_03(life, cond, kind) &
          not guard_case_04(life, cond, kind) &
          not guard_case_05(life, cond, kind) &
          not guard_case_06(life, cond, kind, mode) &
          life == LifecycleAssessment.NoLifecycle &
          cond == ConditionAssessment.ReturnRequested;

        // @trace CASE-08
        def guard_case_08(life: LifecycleAssessment,
                          cond: ConditionAssessment,
                          kind: CoordinationClass,
                          mode: ControllerModeDisposition): Base_Types::Boolean :=
          not guard_case_01(life, cond, kind) &
          not guard_case_02(life, cond, kind) &
          not guard_case_03(life, cond, kind) &
          not guard_case_04(life, cond, kind) &
          not guard_case_05(life, cond, kind) &
          not guard_case_06(life, cond, kind, mode) &
          not guard_case_07(life, cond, kind, mode) &
          life == LifecycleAssessment.OnRequested &
          cond == ConditionAssessment.NoCondition &
          (mode == ControllerModeDisposition.Starting |
           mode == ControllerModeDisposition.On);

        // @trace CASE-09
        def guard_case_09(life: LifecycleAssessment,
                          cond: ConditionAssessment,
                          kind: CoordinationClass,
                          mode: ControllerModeDisposition): Base_Types::Boolean :=
          not guard_case_01(life, cond, kind) &
          not guard_case_02(life, cond, kind) &
          not guard_case_03(life, cond, kind) &
          not guard_case_04(life, cond, kind) &
          not guard_case_05(life, cond, kind) &
          not guard_case_06(life, cond, kind, mode) &
          not guard_case_07(life, cond, kind, mode) &
          not guard_case_08(life, cond, kind, mode) &
          life == LifecycleAssessment.StartRequested &
          cond == ConditionAssessment.NoCondition &
          (mode == ControllerModeDisposition.Off |
           mode == ControllerModeDisposition.Starting);

        // @trace CASE-10
        def guard_case_10(life: LifecycleAssessment,
                          cond: ConditionAssessment,
                          kind: CoordinationClass,
                          mode: ControllerModeDisposition): Base_Types::Boolean :=
          not guard_case_01(life, cond, kind) &
          not guard_case_02(life, cond, kind) &
          not guard_case_03(life, cond, kind) &
          not guard_case_04(life, cond, kind) &
          not guard_case_05(life, cond, kind) &
          not guard_case_06(life, cond, kind, mode) &
          not guard_case_07(life, cond, kind, mode) &
          not guard_case_08(life, cond, kind, mode) &
          not guard_case_09(life, cond, kind, mode) &
          life == LifecycleAssessment.NoLifecycle &
          cond == ConditionAssessment.NoCondition;

        // @trace CASE-11
        def guard_case_11(life: LifecycleAssessment,
                          cond: ConditionAssessment,
                          kind: CoordinationClass,
                          mode: ControllerModeDisposition): Base_Types::Boolean :=
          not guard_case_01(life, cond, kind) &
          not guard_case_02(life, cond, kind) &
          not guard_case_03(life, cond, kind) &
          not guard_case_04(life, cond, kind) &
          not guard_case_05(life, cond, kind) &
          not guard_case_06(life, cond, kind, mode) &
          not guard_case_07(life, cond, kind, mode) &
          not guard_case_08(life, cond, kind, mode) &
          not guard_case_09(life, cond, kind, mode) &
          not guard_case_10(life, cond, kind, mode);

      initialize
        modifies controllerMode;
        // @trace INIT-01
        guarantee INITIAL_MODE_SAFE:
          controllerMode == ControllerModeDisposition.Off;
        // @trace INIT-01
        guarantee INITIAL_DECISION_SAFE:
          mode_decision.nextMode == ControllerModeDisposition.Off &
          mode_decision.reason == DecisionReason.NoRequest;

      compute
        modifies controllerMode;

        // @trace SEM-01
        guarantee APPLIED_DECISION_COHERENCE:
          mode_decision.nextMode == controllerMode;

        // @trace PRIORITY-01
        compute_cases
          // @trace CASE-01
          case CASE_01_INVALID_OR_INCONSISTENT:
            assume guard_case_01(lifecycle_assessment, condition_assessment,
                                 coordination_class);
            guarantee controllerMode == ControllerModeDisposition.Degraded &
                      mode_decision.nextMode == ControllerModeDisposition.Degraded &
                      mode_decision.reason == DecisionReason.InvalidEvidence;

          // @trace CASE-02
          case CASE_02_OFF_DOMINANT:
            assume guard_case_02(lifecycle_assessment, condition_assessment,
                                 coordination_class);
            guarantee controllerMode == ControllerModeDisposition.Off &
                      mode_decision.nextMode == ControllerModeDisposition.Off &
                      mode_decision.reason == DecisionReason.OffAccepted;

          // @trace CASE-03
          case CASE_03_DEGRADED_DOMINANT:
            assume guard_case_03(lifecycle_assessment, condition_assessment,
                                 coordination_class);
            guarantee controllerMode == ControllerModeDisposition.Degraded &
                      mode_decision.nextMode == ControllerModeDisposition.Degraded &
                      mode_decision.reason == DecisionReason.DegradedAccepted;

          // @trace CASE-04
          case CASE_04_MAINTENANCE_DOMINANT:
            assume guard_case_04(lifecycle_assessment, condition_assessment,
                                 coordination_class);
            guarantee controllerMode == ControllerModeDisposition.Maintenance &
                      mode_decision.nextMode == ControllerModeDisposition.Maintenance &
                      mode_decision.reason == DecisionReason.MaintenanceAccepted;

          // @trace CASE-05
          case CASE_05_RECOVERY_CONFLICT:
            assume guard_case_05(lifecycle_assessment, condition_assessment,
                                 coordination_class);
            guarantee controllerMode == In(controllerMode) &
                      mode_decision.nextMode == In(controllerMode) &
                      mode_decision.reason == DecisionReason.ConflictingRequestsRejected;

          // @trace CASE-06
          case CASE_06_RETURN_ACCEPTED:
            assume guard_case_06(lifecycle_assessment, condition_assessment,
                                 coordination_class, In(controllerMode));
            guarantee controllerMode == ControllerModeDisposition.Off &
                      mode_decision.nextMode == ControllerModeDisposition.Off &
                      mode_decision.reason == DecisionReason.ReturnAccepted;

          // @trace CASE-07
          case CASE_07_RETURN_NOT_APPLICABLE:
            assume guard_case_07(lifecycle_assessment, condition_assessment,
                                 coordination_class, In(controllerMode));
            guarantee controllerMode == In(controllerMode) &
                      mode_decision.nextMode == In(controllerMode) &
                      mode_decision.reason == DecisionReason.ReturnNotApplicable;

          // @trace CASE-08
          case CASE_08_ON_ACCEPTED:
            assume guard_case_08(lifecycle_assessment, condition_assessment,
                                 coordination_class, In(controllerMode));
            guarantee controllerMode == ControllerModeDisposition.On &
                      mode_decision.nextMode == ControllerModeDisposition.On &
                      mode_decision.reason == DecisionReason.OnAccepted;

          // @trace CASE-09
          case CASE_09_START_ACCEPTED:
            assume guard_case_09(lifecycle_assessment, condition_assessment,
                                 coordination_class, In(controllerMode));
            guarantee controllerMode == ControllerModeDisposition.Starting &
                      mode_decision.nextMode == ControllerModeDisposition.Starting &
                      mode_decision.reason == DecisionReason.StartAccepted;

          // @trace CASE-10
          case CASE_10_NO_REQUEST:
            assume guard_case_10(lifecycle_assessment, condition_assessment,
                                 coordination_class, In(controllerMode));
            guarantee controllerMode == In(controllerMode) &
                      mode_decision.nextMode == In(controllerMode) &
                      mode_decision.reason == DecisionReason.NoRequest;

          // @trace CASE-11
          case CASE_11_TRANSITION_REJECTED:
            assume guard_case_11(lifecycle_assessment, condition_assessment,
                                 coordination_class, In(controllerMode));
            guarantee controllerMode == In(controllerMode) &
                      mode_decision.nextMode == In(controllerMode) &
                      mode_decision.reason == DecisionReason.TransitionRejected;
    }*/
  }

  // @trace PART-05
  part def CoordinationFrameDerivation :> Thread {
    // @trace INT-08
    port mode_decision : DataPort { in :>> type : ModeDecision; }
    // @trace INT-09
    port mode_disposition : DataPort { out :>> type : ControllerModeDisposition; }
    // @trace INT-10
    port coordination_result : DataPort { out :>> type : CoordinationResult; }

    language "GUMBO" /*{
      functions
        // @trace OUT-01
        def result_for(reason: DecisionReason): CoordinationResult :=
          if (reason == DecisionReason.InvalidEvidence)? CoordinationResult.EvidenceFault
          else if (reason == DecisionReason.NoRequest)? CoordinationResult.Stable
          else if (reason == DecisionReason.ConflictingRequestsRejected |
                   reason == DecisionReason.ReturnNotApplicable |
                   reason == DecisionReason.TransitionRejected)? CoordinationResult.Rejected
          else CoordinationResult.Applied;

      initialize
        // @trace INIT-01
        guarantee INITIAL_FRAME_SAFE:
          mode_disposition == ControllerModeDisposition.Off &
          coordination_result == CoordinationResult.Stable;

      compute
        // @trace OUT-01
        guarantee FRAME_DERIVATION:
          mode_disposition == mode_decision.nextMode &
          coordination_result == result_for(mode_decision.reason);
    }*/
  }

  // @generated-support Behavior-free containment and boundary routing support.
  // @trace BOUND-01
  part def ModeCoordinationProcess :> Process {
    // @generated-support Boundary input routing only; @trace MON-01
    port lifecycle_sample : DataPort { in :>> type : LifecycleSample; }
    // @generated-support Boundary input routing only; @trace MON-02
    port condition_sample : DataPort { in :>> type : ConditionSample; }
    // @generated-support Boundary output routing only; @trace CTRL-01
    port mode_disposition : DataPort { out :>> type : ControllerModeDisposition; }
    // @generated-support Boundary output routing only; @trace CTRL-02
    port coordination_result : DataPort { out :>> type : CoordinationResult; }

    // @trace PART-01
    part lifecycle_indication_qualification : LifecycleIndicationQualification;
    // @trace PART-02
    part condition_indication_qualification : ConditionIndicationQualification;
    // @trace PART-03
    part cross_channel_compatibility : CrossChannelCompatibility;
    // @trace PART-04
    part controller_mode_arbitration : ControllerModeArbitration;
    // @trace PART-05
    part coordination_frame_derivation : CoordinationFrameDerivation;

    // @generated-support Boundary-to-Thread routing only; @trace INT-01
    connection int01 : PortConnection
      connect lifecycle_sample to lifecycle_indication_qualification.lifecycle_sample;
    // @generated-support Boundary-to-Thread routing only; @trace INT-02
    connection int02 : PortConnection
      connect condition_sample to condition_indication_qualification.condition_sample;
    // @trace INT-03
    connection int03 : PortConnection
      connect lifecycle_indication_qualification.assessment_to_compatibility to cross_channel_compatibility.lifecycle_assessment;
    // @trace INT-04
    connection int04 : PortConnection
      connect condition_indication_qualification.assessment_to_compatibility to cross_channel_compatibility.condition_assessment;
    // @trace INT-05
    connection int05 : PortConnection
      connect lifecycle_indication_qualification.assessment_to_arbiter to controller_mode_arbitration.lifecycle_assessment;
    // @trace INT-06
    connection int06 : PortConnection
      connect condition_indication_qualification.assessment_to_arbiter to controller_mode_arbitration.condition_assessment;
    // @trace INT-07
    connection int07 : PortConnection
      connect cross_channel_compatibility.coordination_class to controller_mode_arbitration.coordination_class;
    // @trace INT-08
    connection int08 : PortConnection
      connect controller_mode_arbitration.mode_decision to coordination_frame_derivation.mode_decision;
    // @generated-support Thread-to-boundary routing only; @trace INT-09
    connection int09 : PortConnection
      connect coordination_frame_derivation.mode_disposition to mode_disposition;
    // @generated-support Thread-to-boundary routing only; @trace INT-10
    connection int10 : PortConnection
      connect coordination_frame_derivation.coordination_result to coordination_result;
  }

  // @trace BOUND-01
  part def VehicleControllerModeCoordinatorSystem :> System {
    // @trace MON-01
    port lifecycle_sample : DataPort { in :>> type : LifecycleSample; }
    // @trace MON-02
    port condition_sample : DataPort { in :>> type : ConditionSample; }
    // @trace CTRL-01
    port mode_disposition : DataPort { out :>> type : ControllerModeDisposition; }
    // @trace CTRL-02
    port coordination_result : DataPort { out :>> type : CoordinationResult; }

    // @generated-support Sole behavior-free Process authorized by the Designer.
    part mode_coordination_process : ModeCoordinationProcess;

    // @generated-support Transparent root/Process delegation; @trace INT-01
    connection support01 : PortConnection
      connect lifecycle_sample to mode_coordination_process.lifecycle_sample;
    // @generated-support Transparent root/Process delegation; @trace INT-02
    connection support02 : PortConnection
      connect condition_sample to mode_coordination_process.condition_sample;
    // @generated-support Transparent Process/root delegation; @trace INT-09
    connection support03 : PortConnection
      connect mode_coordination_process.mode_disposition to mode_disposition;
    // @generated-support Transparent Process/root delegation; @trace INT-10
    connection support04 : PortConnection
      connect mode_coordination_process.coordination_result to coordination_result;
  }

  // @trace BOUND-01
  part vehicle_controller_mode_coordinator : VehicleControllerModeCoordinatorSystem;
}
