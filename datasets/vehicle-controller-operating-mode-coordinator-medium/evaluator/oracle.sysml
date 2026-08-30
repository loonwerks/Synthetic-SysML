package Vehicle_Mode_Coordinator {

  private import HAMR::*;

  // @trace TYPE-03
  enum def ReportedCondition {
    enum Normal;
    enum Degraded;
    enum Invalid;
  }

  // @trace TYPE-03
  enum def ReportCurrency {
    enum Current;
    enum Stale;
  }

  // @trace TYPE-04
  enum def ConditionAssessment {
    enum CurrentNormal;
    enum CurrentDegraded;
    enum Unusable;
  }

  // @trace TYPE-05
  enum def ControllerMode {
    enum Off;
    enum Starting;
    enum On;
    enum Maintenance;
    enum Degraded;
  }

  // @trace TYPE-05
  enum def RecoveryTarget {
    enum Off;
    enum Starting;
    enum On;
  }

  // @trace TYPE-06
  enum def ParkingBrakeDisposition {
    enum Apply;
    enum Release;
  }

  // @trace TYPE-06
  enum def CoordinationStatus {
    enum IdleOff;
    enum StartingSequence;
    enum Operating;
    enum MaintenanceHandoff;
    enum DegradedCondition;
    enum DegradedInvalid;
    enum RecoveryResumed;
    enum ShutdownDominant;
    enum RequestConflict;
    enum RequestInapplicable;
  }

  // @trace TYPE-07
  enum def SelectedIntent {
    enum SelectOff;
    enum SelectInvalidDegraded;
    enum SelectConditionDegraded;
    enum SelectMaintenance;
    enum SelectReturn;
    enum SelectOn;
    enum SelectStart;
    enum SelectHold;
  }

  // @trace TYPE-07
  enum def QualifiedTransition {
    enum QualifiedStay;
    enum QualifiedGoOff;
    enum QualifiedGoStarting;
    enum QualifiedGoOn;
    enum QualifiedGoMaintenance;
    enum QualifiedGoDegraded;
    enum QualifiedResumeStored;
    enum QualifiedReject;
  }

  // @trace TYPE-07
  enum def TransitionKind {
    enum Stay;
    enum GoOff;
    enum GoStarting;
    enum GoOn;
    enum GoMaintenance;
    enum GoDegraded;
    enum ResumeStored;
    enum Reject;
  }

  // @trace TYPE-01
  part def LifecycleLevels :> Data {
    attribute startLevel : Base_Types::Boolean;
    attribute onLevel : Base_Types::Boolean;
    attribute offLevel : Base_Types::Boolean;
  }

  // @trace TYPE-02
  part def ServiceLevels :> Data {
    attribute maintenanceLevel : Base_Types::Boolean;
    attribute returnNormalLevel : Base_Types::Boolean;
  }

  // @trace TYPE-03
  part def ConditionEvidence :> Data {
    attribute reportedCondition : ReportedCondition;
    attribute reportCurrency : ReportCurrency;
  }

  // @trace INT-04
  part def LifecycleFacts :> Data {
    attribute freshStart : Base_Types::Boolean;
    attribute freshOn : Base_Types::Boolean;
    attribute offActive : Base_Types::Boolean;
    attribute lifecycleConflict : Base_Types::Boolean;
  }

  // @trace INT-05
  part def ServiceFacts :> Data {
    attribute freshMaintenance : Base_Types::Boolean;
    attribute freshReturn : Base_Types::Boolean;
    attribute serviceConflict : Base_Types::Boolean;
  }

  // @trace INT-07
  part def ArbitrationResult :> Data {
    attribute selectedIntent : SelectedIntent;
    attribute priorityConflict : Base_Types::Boolean;
  }

  // @trace TYPE-07
  part def TransitionResolution :> Data {
    attribute nextMode : ControllerMode;
    attribute kind : TransitionKind;
    attribute accepted : Base_Types::Boolean;
  }

  // @trace TYPE-06
  part def CoordinationOutcome :> Data {
    attribute parkingBrake : ParkingBrakeDisposition;
    attribute status : CoordinationStatus;
  }

  // @trace PART-01
  part def LifecycleEventOwner :> Thread {
    // @trace INT-01
    port lifecycleLevels : DataPort { in :>> type : LifecycleLevels; }
    // @trace INT-04
    port lifecycleFacts : DataPort { out :>> type : LifecycleFacts; }

    language "GUMBO" /*{
      state
        previousStart : Base_Types::Boolean;
        previousOn : Base_Types::Boolean;
        previousOff : Base_Types::Boolean;

      initialize
        modifies previousStart, previousOn, previousOff;
        guarantee
          // @trace STATE-01
          INITIAL_LIFECYCLE_HISTORY "Lifecycle history and its published facts initialize inactive":
            previousStart == F & previousOn == F & previousOff == F &
            lifecycleFacts.freshStart == F & lifecycleFacts.freshOn == F &
            lifecycleFacts.offActive == F & lifecycleFacts.lifecycleConflict == F;

      compute
        modifies previousStart, previousOn, previousOff;
        // @trace STATE-01
        guarantee LIFECYCLE_RISING_EDGES "This owner alone derives rising edges and the level-sensitive off fact":
          lifecycleFacts.freshStart == (lifecycleLevels.startLevel & not In(previousStart)) &
          lifecycleFacts.freshOn == (lifecycleLevels.onLevel & not In(previousOn)) &
          lifecycleFacts.offActive == lifecycleLevels.offLevel;

        // @trace PART-01
        guarantee LIFECYCLE_CONFLICT "At least two asserted lifecycle levels form a source conflict":
          lifecycleFacts.lifecycleConflict ==
            ((lifecycleLevels.startLevel & lifecycleLevels.onLevel) |
             (lifecycleLevels.startLevel & lifecycleLevels.offLevel) |
             (lifecycleLevels.onLevel & lifecycleLevels.offLevel));

        // @trace STATE-01
        guarantee STORE_LIFECYCLE_LEVELS "All current lifecycle levels become the next history":
          previousStart == lifecycleLevels.startLevel &
          previousOn == lifecycleLevels.onLevel &
          previousOff == lifecycleLevels.offLevel;
    }*/
  }

  // @trace PART-02
  part def ServiceEventOwner :> Thread {
    // @trace INT-02
    port serviceLevels : DataPort { in :>> type : ServiceLevels; }
    // @trace INT-05
    port serviceFacts : DataPort { out :>> type : ServiceFacts; }

    language "GUMBO" /*{
      state
        previousMaintenance : Base_Types::Boolean;
        previousReturn : Base_Types::Boolean;

      initialize
        modifies previousMaintenance, previousReturn;
        guarantee
          // @trace STATE-02
          INITIAL_SERVICE_HISTORY "Service history and its published facts initialize inactive":
            previousMaintenance == F & previousReturn == F &
            serviceFacts.freshMaintenance == F & serviceFacts.freshReturn == F &
            serviceFacts.serviceConflict == F;

      compute
        modifies previousMaintenance, previousReturn;
        // @trace STATE-02
        guarantee SERVICE_RISING_EDGES "This owner alone derives service rising edges":
          serviceFacts.freshMaintenance ==
            (serviceLevels.maintenanceLevel & not In(previousMaintenance)) &
          serviceFacts.freshReturn ==
            (serviceLevels.returnNormalLevel & not In(previousReturn));

        // @trace PART-02
        guarantee SERVICE_CONFLICT "Simultaneously asserted service levels form a source conflict":
          serviceFacts.serviceConflict ==
            (serviceLevels.maintenanceLevel & serviceLevels.returnNormalLevel);

        // @trace STATE-02
        guarantee STORE_SERVICE_LEVELS "Both current service levels become the next history":
          previousMaintenance == serviceLevels.maintenanceLevel &
          previousReturn == serviceLevels.returnNormalLevel;
    }*/
  }

  // @trace PART-03
  part def ConditionAssessmentOwner :> Thread {
    // @trace INT-03
    port conditionEvidence : DataPort { in :>> type : ConditionEvidence; }
    // @trace INT-06
    port conditionAssessment : DataPort { out :>> type : ConditionAssessment; }

    language "GUMBO" /*{
      compute
        // @trace TYPE-04
        guarantee CONDITION_QUALIFICATION "Currency and reported condition jointly derive the complete assessment":
          ((conditionEvidence.reportCurrency == ReportCurrency.Stale) implies
            (conditionAssessment == ConditionAssessment.Unusable)) &
          ((conditionEvidence.reportCurrency == ReportCurrency.Current &
            conditionEvidence.reportedCondition == ReportedCondition.Invalid) implies
            (conditionAssessment == ConditionAssessment.Unusable)) &
          ((conditionEvidence.reportCurrency == ReportCurrency.Current &
            conditionEvidence.reportedCondition == ReportedCondition.Degraded) implies
            (conditionAssessment == ConditionAssessment.CurrentDegraded)) &
          ((conditionEvidence.reportCurrency == ReportCurrency.Current &
            conditionEvidence.reportedCondition == ReportedCondition.Normal) implies
            (conditionAssessment == ConditionAssessment.CurrentNormal));
    }*/
  }

  // @trace PART-04
  part def IntentArbitrationOwner :> Thread {
    // @trace INT-04
    port lifecycleFacts : DataPort { in :>> type : LifecycleFacts; }
    // @trace INT-05
    port serviceFacts : DataPort { in :>> type : ServiceFacts; }
    // @trace INT-06
    port conditionAssessment : DataPort { in :>> type : ConditionAssessment; }
    // @trace INT-07
    port arbitrationForQualification : DataPort { out :>> type : ArbitrationResult; }
    // @trace INT-14
    port arbitrationForPublication : DataPort { out :>> type : ArbitrationResult; }

    language "GUMBO" /*{
      functions
        def atLeastTwoCandidates(
          a : Base_Types::Boolean,
          b : Base_Types::Boolean,
          c : Base_Types::Boolean,
          d : Base_Types::Boolean,
          e : Base_Types::Boolean,
          f : Base_Types::Boolean,
          g : Base_Types::Boolean) : Base_Types::Boolean :=
            (a & (b | c | d | e | f | g)) |
            (b & (c | d | e | f | g)) |
            (c & (d | e | f | g)) |
            (d & (e | f | g)) |
            (e & (f | g)) |
            (f & g);

      compute
        // @trace POL-02
        guarantee PRIORITY_CONFLICT "Independent owner facts or any two priority candidates expose a conflict":
          arbitrationForQualification.priorityConflict ==
            (lifecycleFacts.lifecycleConflict | serviceFacts.serviceConflict |
             atLeastTwoCandidates(
               lifecycleFacts.offActive,
               conditionAssessment == ConditionAssessment.Unusable,
               conditionAssessment == ConditionAssessment.CurrentDegraded,
               serviceFacts.freshMaintenance,
               serviceFacts.freshReturn,
               lifecycleFacts.freshOn,
               lifecycleFacts.freshStart)) &
          arbitrationForPublication.priorityConflict ==
            arbitrationForQualification.priorityConflict;

        // @trace INT-14
        guarantee PUBLISH_ARBITRATION "Publication receives the same locally derived arbitration fact":
          arbitrationForPublication.selectedIntent ==
            arbitrationForQualification.selectedIntent;

        compute_cases
          // @trace CASE-01
          case CASE_01_OFF "Level-sensitive off has highest priority":
            assume lifecycleFacts.offActive;
            guarantee arbitrationForQualification.selectedIntent == SelectedIntent.SelectOff;

          // @trace CASE-02
          case CASE_02_UNUSABLE "Unusable evidence wins whenever off is inactive":
            assume not lifecycleFacts.offActive &
              conditionAssessment == ConditionAssessment.Unusable;
            guarantee arbitrationForQualification.selectedIntent == SelectedIntent.SelectInvalidDegraded;

          // @trace CASE-03
          case CASE_03_DEGRADED "Current degraded evidence wins below off and unusable evidence":
            assume not lifecycleFacts.offActive &
              conditionAssessment == ConditionAssessment.CurrentDegraded;
            guarantee arbitrationForQualification.selectedIntent == SelectedIntent.SelectConditionDegraded;

          // @trace CASE-04
          case CASE_04_MAINTENANCE "Fresh maintenance wins below condition priorities":
            assume not lifecycleFacts.offActive &
              conditionAssessment == ConditionAssessment.CurrentNormal &
              serviceFacts.freshMaintenance;
            guarantee arbitrationForQualification.selectedIntent == SelectedIntent.SelectMaintenance;

          // @trace CASE-05
          case CASE_05_RETURN "Fresh return wins when all higher candidates are absent":
            assume not lifecycleFacts.offActive &
              conditionAssessment == ConditionAssessment.CurrentNormal &
              not serviceFacts.freshMaintenance & serviceFacts.freshReturn;
            guarantee arbitrationForQualification.selectedIntent == SelectedIntent.SelectReturn;

          // @trace CASE-06
          case CASE_06_ON "Fresh on wins over fresh start after higher candidates are absent":
            assume not lifecycleFacts.offActive &
              conditionAssessment == ConditionAssessment.CurrentNormal &
              not serviceFacts.freshMaintenance & not serviceFacts.freshReturn &
              lifecycleFacts.freshOn;
            guarantee arbitrationForQualification.selectedIntent == SelectedIntent.SelectOn;

          // @trace CASE-07
          case CASE_07_START "Fresh start wins only after every higher candidate is absent":
            assume not lifecycleFacts.offActive &
              conditionAssessment == ConditionAssessment.CurrentNormal &
              not serviceFacts.freshMaintenance & not serviceFacts.freshReturn &
              not lifecycleFacts.freshOn & lifecycleFacts.freshStart;
            guarantee arbitrationForQualification.selectedIntent == SelectedIntent.SelectStart;

          // @trace CASE-08
          case CASE_08_HOLD "No candidate selects hold":
            assume not lifecycleFacts.offActive &
              conditionAssessment == ConditionAssessment.CurrentNormal &
              not serviceFacts.freshMaintenance & not serviceFacts.freshReturn &
              not lifecycleFacts.freshOn & not lifecycleFacts.freshStart;
            guarantee arbitrationForQualification.selectedIntent == SelectedIntent.SelectHold;
    }*/
  }

  // @trace PART-06
  part def TransitionQualificationOwner :> Thread {
    // @trace INT-07
    port arbitrationResult : DataPort { in :>> type : ArbitrationResult; }
    // @trace INT-08
    port currentMode : DataPort { in :>> type : ControllerMode; }
    // @trace INT-10
    port qualifiedTransition : DataPort { out :>> type : QualifiedTransition; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace CASE-09
          case CASE_09_OFF "Off intent qualifies a go-off directive from every mode":
            assume arbitrationResult.selectedIntent == SelectedIntent.SelectOff;
            guarantee qualifiedTransition == QualifiedTransition.QualifiedGoOff;

          // @trace CASE-10
          case CASE_10_FORCED_DEGRADED "Either condition intent qualifies forced degradation from every mode":
            assume arbitrationResult.selectedIntent == SelectedIntent.SelectInvalidDegraded |
              arbitrationResult.selectedIntent == SelectedIntent.SelectConditionDegraded;
            guarantee qualifiedTransition == QualifiedTransition.QualifiedGoDegraded;

          // @trace CASE-11
          case CASE_11_MAINTENANCE_APPLICABLE "Maintenance is applicable from every non-degraded mode":
            assume arbitrationResult.selectedIntent == SelectedIntent.SelectMaintenance &
              currentMode != ControllerMode.Degraded;
            guarantee qualifiedTransition == QualifiedTransition.QualifiedGoMaintenance;

          // @trace CASE-12
          case CASE_12_MAINTENANCE_REJECTED "Maintenance is rejected while degraded":
            assume arbitrationResult.selectedIntent == SelectedIntent.SelectMaintenance &
              currentMode == ControllerMode.Degraded;
            guarantee qualifiedTransition == QualifiedTransition.QualifiedReject;

          // @trace CASE-13
          case CASE_13_RESUME "Return from degraded qualifies stored-target resume":
            assume arbitrationResult.selectedIntent == SelectedIntent.SelectReturn &
              currentMode == ControllerMode.Degraded;
            guarantee qualifiedTransition == QualifiedTransition.QualifiedResumeStored;

          // @trace CASE-14
          case CASE_14_LEAVE_MAINTENANCE "Return from maintenance qualifies go-off":
            assume arbitrationResult.selectedIntent == SelectedIntent.SelectReturn &
              currentMode == ControllerMode.Maintenance;
            guarantee qualifiedTransition == QualifiedTransition.QualifiedGoOff;

          // @trace CASE-15
          case CASE_15_RETURN_REJECTED "Return is rejected outside degraded and maintenance modes":
            assume arbitrationResult.selectedIntent == SelectedIntent.SelectReturn &
              (currentMode == ControllerMode.Off |
               currentMode == ControllerMode.Starting |
               currentMode == ControllerMode.On);
            guarantee qualifiedTransition == QualifiedTransition.QualifiedReject;

          // @trace CASE-16
          case CASE_16_ON_APPLICABLE "On is applicable only from Starting":
            assume arbitrationResult.selectedIntent == SelectedIntent.SelectOn &
              currentMode == ControllerMode.Starting;
            guarantee qualifiedTransition == QualifiedTransition.QualifiedGoOn;

          // @trace CASE-17
          case CASE_17_ON_REJECTED "On is rejected from every non-Starting mode":
            assume arbitrationResult.selectedIntent == SelectedIntent.SelectOn &
              currentMode != ControllerMode.Starting;
            guarantee qualifiedTransition == QualifiedTransition.QualifiedReject;

          // @trace CASE-18
          case CASE_18_START_APPLICABLE "Start is applicable only from Off":
            assume arbitrationResult.selectedIntent == SelectedIntent.SelectStart &
              currentMode == ControllerMode.Off;
            guarantee qualifiedTransition == QualifiedTransition.QualifiedGoStarting;

          // @trace CASE-19
          case CASE_19_START_REJECTED "Start is rejected from every non-Off mode":
            assume arbitrationResult.selectedIntent == SelectedIntent.SelectStart &
              currentMode != ControllerMode.Off;
            guarantee qualifiedTransition == QualifiedTransition.QualifiedReject;

          // @trace CASE-20
          case CASE_20_HOLD "Hold is accepted and preserves the current mode":
            assume arbitrationResult.selectedIntent == SelectedIntent.SelectHold;
            guarantee qualifiedTransition == QualifiedTransition.QualifiedStay;
    }*/
  }

  // @trace PART-07
  part def ModeTransitionApplicationOwner :> Thread {
    // @trace INT-09
    port storedRecoveryTarget : DataPort { in :>> type : RecoveryTarget; }
    // @trace INT-10
    port qualifiedTransition : DataPort { in :>> type : QualifiedTransition; }
    // @trace INT-08
    port modeForQualification : DataPort { out :>> type : ControllerMode; }
    // @trace INT-11
    port modeForRecovery : DataPort { out :>> type : ControllerMode; }
    // @trace INT-12
    port resolutionForRecovery : DataPort { out :>> type : TransitionResolution; }
    // @trace INT-13
    port resolutionForPublication : DataPort { out :>> type : TransitionResolution; }
    // @trace INT-15
    port appliedNextMode : DataPort { out :>> type : ControllerMode; }

    language "GUMBO" /*{
      state
        controllerMode : ControllerMode;

      initialize
        modifies controllerMode;
        guarantee
          // @trace STATE-04
          INITIAL_CONTROLLER_MODE "The sole mode state and all safe application outputs initialize Off":
            controllerMode == ControllerMode.Off &
            modeForQualification == ControllerMode.Off &
            modeForRecovery == ControllerMode.Off &
            resolutionForRecovery.nextMode == ControllerMode.Off &
            resolutionForRecovery.kind == TransitionKind.Stay &
            resolutionForRecovery.accepted &
            resolutionForPublication.nextMode == ControllerMode.Off &
            resolutionForPublication.kind == TransitionKind.Stay &
            resolutionForPublication.accepted &
            appliedNextMode == ControllerMode.Off;

      compute
        modifies controllerMode;
        // @trace STATE-04
        guarantee PUBLISH_PRE_MODE "Qualification and recovery consume this owner's same pre-evaluation mode":
          modeForQualification == In(controllerMode) &
          modeForRecovery == In(controllerMode);

        // @trace APPLY-01
        guarantee APPLY_STAY_OR_REJECT "Stay and reject preserve current mode with distinct acceptance":
          ((qualifiedTransition == QualifiedTransition.QualifiedStay) implies
            (resolutionForRecovery.nextMode == In(controllerMode) &
             resolutionForRecovery.kind == TransitionKind.Stay &
             resolutionForRecovery.accepted)) &
          ((qualifiedTransition == QualifiedTransition.QualifiedReject) implies
            (resolutionForRecovery.nextMode == In(controllerMode) &
             resolutionForRecovery.kind == TransitionKind.Reject &
             not resolutionForRecovery.accepted));

        // @trace APPLY-02
        guarantee APPLY_GO_DIRECTIVES "Each go directive applies its named constant mode and kind":
          ((qualifiedTransition == QualifiedTransition.QualifiedGoOff) implies
            (resolutionForRecovery.nextMode == ControllerMode.Off &
             resolutionForRecovery.kind == TransitionKind.GoOff & resolutionForRecovery.accepted)) &
          ((qualifiedTransition == QualifiedTransition.QualifiedGoStarting) implies
            (resolutionForRecovery.nextMode == ControllerMode.Starting &
             resolutionForRecovery.kind == TransitionKind.GoStarting & resolutionForRecovery.accepted)) &
          ((qualifiedTransition == QualifiedTransition.QualifiedGoOn) implies
            (resolutionForRecovery.nextMode == ControllerMode.On &
             resolutionForRecovery.kind == TransitionKind.GoOn & resolutionForRecovery.accepted)) &
          ((qualifiedTransition == QualifiedTransition.QualifiedGoMaintenance) implies
            (resolutionForRecovery.nextMode == ControllerMode.Maintenance &
             resolutionForRecovery.kind == TransitionKind.GoMaintenance & resolutionForRecovery.accepted)) &
          ((qualifiedTransition == QualifiedTransition.QualifiedGoDegraded) implies
            (resolutionForRecovery.nextMode == ControllerMode.Degraded &
             resolutionForRecovery.kind == TransitionKind.GoDegraded & resolutionForRecovery.accepted));

        // @trace APPLY-02
        guarantee APPLY_STORED_RESUME "Resume consumes the approved recovery interaction rather than recomputing a target":
          (qualifiedTransition == QualifiedTransition.QualifiedResumeStored) implies
            (((storedRecoveryTarget == RecoveryTarget.Off) implies
                (resolutionForRecovery.nextMode == ControllerMode.Off)) &
             ((storedRecoveryTarget == RecoveryTarget.Starting) implies
                (resolutionForRecovery.nextMode == ControllerMode.Starting)) &
             ((storedRecoveryTarget == RecoveryTarget.On) implies
                (resolutionForRecovery.nextMode == ControllerMode.On)) &
             resolutionForRecovery.kind == TransitionKind.ResumeStored &
             resolutionForRecovery.accepted);

        // @trace INT-13
        guarantee PUBLISH_APPLIED_RESOLUTION "Both consumers receive the same locally applied resolution":
          resolutionForPublication.nextMode == resolutionForRecovery.nextMode &
          resolutionForPublication.kind == resolutionForRecovery.kind &
          resolutionForPublication.accepted == resolutionForRecovery.accepted;

        // @trace CTRL-01
        guarantee COMMIT_AND_DELIVER_MODE "The sole state commit and root-bound mode equal the applied next mode":
          controllerMode == resolutionForRecovery.nextMode &
          appliedNextMode == resolutionForRecovery.nextMode;
    }*/
  }

  // @trace PART-08
  part def CoordinationPublicationOwner :> Thread {
    // @trace INT-14
    port arbitrationResult : DataPort { in :>> type : ArbitrationResult; }
    // @trace INT-13
    port appliedResolution : DataPort { in :>> type : TransitionResolution; }
    // @trace INT-16
    port coordinationOutcome : DataPort { out :>> type : CoordinationOutcome; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace POL-07
          INITIAL_COORDINATION_OUTCOME "The safe initialized coordination outcome applies the brake in idle Off":
            coordinationOutcome.parkingBrake == ParkingBrakeDisposition.Apply &
            coordinationOutcome.status == CoordinationStatus.IdleOff;

      compute
        // @trace POL-05
        guarantee PARKING_BRAKE_COHERENCE "Release is equivalent to the applied next mode On":
          ((coordinationOutcome.parkingBrake == ParkingBrakeDisposition.Release) ==
            (appliedResolution.nextMode == ControllerMode.On));

        // @trace POL-06
        guarantee STATUS_PRECEDENCE "Status is a total ordered diagnostic over arbitration and the applied result":
          ((coordinationOutcome.status == CoordinationStatus.ShutdownDominant) ==
            (arbitrationResult.selectedIntent == SelectedIntent.SelectOff &
             arbitrationResult.priorityConflict)) &
          ((coordinationOutcome.status == CoordinationStatus.RequestInapplicable) ==
            (not (arbitrationResult.selectedIntent == SelectedIntent.SelectOff &
                  arbitrationResult.priorityConflict) &
             appliedResolution.kind == TransitionKind.Reject)) &
          ((coordinationOutcome.status == CoordinationStatus.RecoveryResumed) ==
            (not (arbitrationResult.selectedIntent == SelectedIntent.SelectOff &
                  arbitrationResult.priorityConflict) &
             appliedResolution.kind != TransitionKind.Reject &
             appliedResolution.kind == TransitionKind.ResumeStored)) &
          ((coordinationOutcome.status == CoordinationStatus.DegradedInvalid) ==
            (not (arbitrationResult.selectedIntent == SelectedIntent.SelectOff &
                  arbitrationResult.priorityConflict) &
             appliedResolution.kind != TransitionKind.Reject &
             appliedResolution.kind != TransitionKind.ResumeStored &
             arbitrationResult.selectedIntent == SelectedIntent.SelectInvalidDegraded)) &
          ((coordinationOutcome.status == CoordinationStatus.DegradedCondition) ==
            ((not (arbitrationResult.selectedIntent == SelectedIntent.SelectOff &
                   arbitrationResult.priorityConflict) &
              appliedResolution.kind != TransitionKind.Reject &
              appliedResolution.kind != TransitionKind.ResumeStored &
              arbitrationResult.selectedIntent == SelectedIntent.SelectConditionDegraded) |
             (not (arbitrationResult.selectedIntent == SelectedIntent.SelectOff &
                   arbitrationResult.priorityConflict) &
              appliedResolution.kind != TransitionKind.Reject &
              appliedResolution.kind != TransitionKind.ResumeStored &
              arbitrationResult.selectedIntent != SelectedIntent.SelectInvalidDegraded &
              arbitrationResult.selectedIntent != SelectedIntent.SelectConditionDegraded &
              not arbitrationResult.priorityConflict &
              appliedResolution.nextMode == ControllerMode.Degraded))) &
          ((coordinationOutcome.status == CoordinationStatus.RequestConflict) ==
            (not (arbitrationResult.selectedIntent == SelectedIntent.SelectOff &
                  arbitrationResult.priorityConflict) &
             appliedResolution.kind != TransitionKind.Reject &
             appliedResolution.kind != TransitionKind.ResumeStored &
             arbitrationResult.selectedIntent != SelectedIntent.SelectInvalidDegraded &
             arbitrationResult.selectedIntent != SelectedIntent.SelectConditionDegraded &
             arbitrationResult.priorityConflict)) &
          ((coordinationOutcome.status == CoordinationStatus.IdleOff) ==
            (not arbitrationResult.priorityConflict &
             appliedResolution.kind != TransitionKind.Reject &
             appliedResolution.kind != TransitionKind.ResumeStored &
             arbitrationResult.selectedIntent != SelectedIntent.SelectInvalidDegraded &
             arbitrationResult.selectedIntent != SelectedIntent.SelectConditionDegraded &
             appliedResolution.nextMode == ControllerMode.Off)) &
          ((coordinationOutcome.status == CoordinationStatus.StartingSequence) ==
            (not arbitrationResult.priorityConflict &
             appliedResolution.kind != TransitionKind.Reject &
             appliedResolution.kind != TransitionKind.ResumeStored &
             arbitrationResult.selectedIntent != SelectedIntent.SelectInvalidDegraded &
             arbitrationResult.selectedIntent != SelectedIntent.SelectConditionDegraded &
             appliedResolution.nextMode == ControllerMode.Starting)) &
          ((coordinationOutcome.status == CoordinationStatus.Operating) ==
            (not arbitrationResult.priorityConflict &
             appliedResolution.kind != TransitionKind.Reject &
             appliedResolution.kind != TransitionKind.ResumeStored &
             arbitrationResult.selectedIntent != SelectedIntent.SelectInvalidDegraded &
             arbitrationResult.selectedIntent != SelectedIntent.SelectConditionDegraded &
             appliedResolution.nextMode == ControllerMode.On)) &
          ((coordinationOutcome.status == CoordinationStatus.MaintenanceHandoff) ==
            (not arbitrationResult.priorityConflict &
             appliedResolution.kind != TransitionKind.Reject &
             appliedResolution.kind != TransitionKind.ResumeStored &
             arbitrationResult.selectedIntent != SelectedIntent.SelectInvalidDegraded &
             arbitrationResult.selectedIntent != SelectedIntent.SelectConditionDegraded &
             appliedResolution.nextMode == ControllerMode.Maintenance));
    }*/
  }

  // @trace PART-05
  part def RecoveryTargetOwner :> Thread {
    // @trace INT-11
    port currentMode : DataPort { in :>> type : ControllerMode; }
    // @trace INT-12
    port appliedResolution : DataPort { in :>> type : TransitionResolution; }
    // @trace INT-09
    port storedRecoveryTarget : DataPort { out :>> type : RecoveryTarget; }

    language "GUMBO" /*{
      state
        recoveryTarget : RecoveryTarget;

      initialize
        modifies recoveryTarget;
        guarantee
          // @trace STATE-03
          INITIAL_RECOVERY_TARGET "Recovery memory and its published pre-state initialize to Off":
            recoveryTarget == RecoveryTarget.Off &
            storedRecoveryTarget == RecoveryTarget.Off;

      compute
        modifies recoveryTarget;
        // @trace INT-09
        guarantee PUBLISH_PRE_UPDATE_TARGET "Transition application consumes only this owner's pre-update target":
          storedRecoveryTarget == In(recoveryTarget);

        // @trace STATE-03
        guarantee UPDATE_RECOVERY_TARGET "Entry captures or maps the interrupted mode; degradation preserves it; exit resets it":
          ((currentMode == ControllerMode.Starting &
            appliedResolution.nextMode == ControllerMode.Degraded) implies
              (recoveryTarget == RecoveryTarget.Starting)) &
          ((currentMode == ControllerMode.On &
            appliedResolution.nextMode == ControllerMode.Degraded) implies
              (recoveryTarget == RecoveryTarget.On)) &
          (((currentMode == ControllerMode.Off |
             currentMode == ControllerMode.Maintenance) &
            appliedResolution.nextMode == ControllerMode.Degraded) implies
              (recoveryTarget == RecoveryTarget.Off)) &
          ((currentMode == ControllerMode.Degraded &
            appliedResolution.nextMode == ControllerMode.Degraded) implies
              (recoveryTarget == In(recoveryTarget))) &
          ((currentMode == ControllerMode.Degraded &
            appliedResolution.nextMode != ControllerMode.Degraded) implies
              (recoveryTarget == RecoveryTarget.Off)) &
          ((currentMode != ControllerMode.Degraded &
            appliedResolution.nextMode != ControllerMode.Degraded) implies
              (recoveryTarget == In(recoveryTarget)));
    }*/
  }

  // @generated-support SUPPORT-01: sole behavior-free containment for the approved eight owners.
  part def VehicleModeCoordinationProcess :> Process {
    // @trace INT-01
    port lifecycleLevels : DataPort { in :>> type : LifecycleLevels; }
    // @trace INT-02
    port serviceLevels : DataPort { in :>> type : ServiceLevels; }
    // @trace INT-03
    port conditionEvidence : DataPort { in :>> type : ConditionEvidence; }
    // @trace INT-15
    port controllerMode : DataPort { out :>> type : ControllerMode; }
    // @trace INT-16
    port coordinationOutcome : DataPort { out :>> type : CoordinationOutcome; }

    // @trace PART-01
    part lifecycleEventOwner : LifecycleEventOwner;
    // @trace PART-02
    part serviceEventOwner : ServiceEventOwner;
    // @trace PART-03
    part conditionAssessmentOwner : ConditionAssessmentOwner;
    // @trace PART-04
    part intentArbitrationOwner : IntentArbitrationOwner;
    // @trace PART-08
    part coordinationPublicationOwner : CoordinationPublicationOwner;
    // @trace PART-05
    part recoveryTargetOwner : RecoveryTargetOwner;
    // @trace PART-06
    part transitionQualificationOwner : TransitionQualificationOwner;
    // @trace PART-07
    part modeTransitionApplicationOwner : ModeTransitionApplicationOwner;

    // @trace INT-01
    connection int01 : PortConnection connect lifecycleLevels to lifecycleEventOwner.lifecycleLevels;
    // @trace INT-02
    connection int02 : PortConnection connect serviceLevels to serviceEventOwner.serviceLevels;
    // @trace INT-03
    connection int03 : PortConnection connect conditionEvidence to conditionAssessmentOwner.conditionEvidence;
    // @trace INT-04
    connection int04 : PortConnection connect lifecycleEventOwner.lifecycleFacts to intentArbitrationOwner.lifecycleFacts;
    // @trace INT-05
    connection int05 : PortConnection connect serviceEventOwner.serviceFacts to intentArbitrationOwner.serviceFacts;
    // @trace INT-06
    connection int06 : PortConnection connect conditionAssessmentOwner.conditionAssessment to intentArbitrationOwner.conditionAssessment;
    // @trace INT-07
    connection int07 : PortConnection connect intentArbitrationOwner.arbitrationForQualification to transitionQualificationOwner.arbitrationResult;
    // @trace INT-08
    connection int08 : PortConnection connect modeTransitionApplicationOwner.modeForQualification to transitionQualificationOwner.currentMode;
    // @trace INT-09
    connection int09 : PortConnection connect recoveryTargetOwner.storedRecoveryTarget to modeTransitionApplicationOwner.storedRecoveryTarget;
    // @trace INT-10
    connection int10 : PortConnection connect transitionQualificationOwner.qualifiedTransition to modeTransitionApplicationOwner.qualifiedTransition;
    // @trace INT-11
    connection int11 : PortConnection connect modeTransitionApplicationOwner.modeForRecovery to recoveryTargetOwner.currentMode;
    // @trace INT-12
    connection int12 : PortConnection connect modeTransitionApplicationOwner.resolutionForRecovery to recoveryTargetOwner.appliedResolution;
    // @trace INT-13
    connection int13 : PortConnection connect modeTransitionApplicationOwner.resolutionForPublication to coordinationPublicationOwner.appliedResolution;
    // @trace INT-14
    connection int14 : PortConnection connect intentArbitrationOwner.arbitrationForPublication to coordinationPublicationOwner.arbitrationResult;
    // @trace INT-15
    connection int15 : PortConnection connect modeTransitionApplicationOwner.appliedNextMode to controllerMode;
    // @trace INT-16
    connection int16 : PortConnection connect coordinationPublicationOwner.coordinationOutcome to coordinationOutcome;
  }

  // @trace BOUND-01
  part def VehicleControllerOperatingModeCoordinator :> System {
    // @trace MON-01
    port lifecycleLevels : DataPort { in :>> type : LifecycleLevels; }
    // @trace MON-02
    port serviceLevels : DataPort { in :>> type : ServiceLevels; }
    // @trace MON-03
    port conditionEvidence : DataPort { in :>> type : ConditionEvidence; }
    // @trace CTRL-01
    port controllerMode : DataPort { out :>> type : ControllerMode; }
    // @trace CTRL-02
    port coordinationOutcome : DataPort { out :>> type : CoordinationOutcome; }

    // @generated-support SUPPORT-01: sole behavior-free Process usage required by the approved mapping.
    part vehicleModeCoordinationProcess : VehicleModeCoordinationProcess;

    // @generated-support SUPPORT-02: System-to-Process delegation refining INT-01 without semantic credit.
    // @trace INT-01
    connection supportInt01 : PortConnection connect lifecycleLevels to vehicleModeCoordinationProcess.lifecycleLevels;
    // @generated-support SUPPORT-02: System-to-Process delegation refining INT-02 without semantic credit.
    // @trace INT-02
    connection supportInt02 : PortConnection connect serviceLevels to vehicleModeCoordinationProcess.serviceLevels;
    // @generated-support SUPPORT-02: System-to-Process delegation refining INT-03 without semantic credit.
    // @trace INT-03
    connection supportInt03 : PortConnection connect conditionEvidence to vehicleModeCoordinationProcess.conditionEvidence;
    // @generated-support SUPPORT-02: Process-to-System delegation refining INT-15 without semantic credit.
    // @trace INT-15
    connection supportInt15 : PortConnection connect vehicleModeCoordinationProcess.controllerMode to controllerMode;
    // @generated-support SUPPORT-02: Process-to-System delegation refining INT-16 without semantic credit.
    // @trace INT-16
    connection supportInt16 : PortConnection connect vehicleModeCoordinationProcess.coordinationOutcome to coordinationOutcome;
  }

  // @trace STRUCT-01
  part vehicleControllerOperatingModeCoordinator : VehicleControllerOperatingModeCoordinator;
}
