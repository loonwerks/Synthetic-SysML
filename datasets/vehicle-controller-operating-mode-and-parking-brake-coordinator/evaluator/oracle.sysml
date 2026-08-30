// Canonical SysML/GUMBO realization of approved baseline SA-VEH-HARD-R2-01.
// @trace PURP-01
package Vehicle_Controller_Operating_Mode_Coordinator {
  private import HAMR::*;

  // @trace TYPE-01
  enum def IndicationLevel { enum Clear; enum Asserted; enum Invalid; }
  // @generated-support TYPE-02: one-to-one projections avoid a current-tool
  // same-enum record-feature collision; they add no policy or semantic credit.
  enum def StartIndicationLevel { enum Clear; enum Asserted; enum Invalid; }
  // @generated-support TYPE-02: one-to-one projection with IndicationLevel.
  enum def OnIndicationLevel { enum Clear; enum Asserted; enum Invalid; }
  // @generated-support TYPE-02: one-to-one projection with IndicationLevel.
  enum def OffIndicationLevel { enum Clear; enum Asserted; enum Invalid; }
  // @trace TYPE-04
  enum def ConflictClass { enum InputInvalid; enum MultipleActionable; enum SingleOrNone; }
  // @trace TYPE-05
  enum def SelectedIndication {
    enum InvalidSelected; enum DegradedSelected; enum OffSelected;
    enum MaintenanceSelected; enum ReturnSelected; enum OnSelected;
    enum StartSelected; enum NoneSelected;
  }
  // @trace TYPE-06
  enum def OperatingDemand { enum Dormant; enum Staged; enum RunRequested; }
  // @generated-support TYPE-06: pre-state projection for tool compatibility.
  enum def PriorOperatingDemand { enum Dormant; enum Staged; enum RunRequested; }
  // @trace TYPE-06
  enum def MaintenanceSession { enum Inactive; enum Active; }
  // @generated-support TYPE-06: pre-state projection for tool compatibility.
  enum def PriorMaintenanceSession { enum Inactive; enum Active; }
  // @trace TYPE-06
  enum def DegradedEpisode { enum ClearEpisode; enum Latched; enum ReturnArmed; }
  // @generated-support TYPE-06: pre-state projection for tool compatibility.
  enum def PriorDegradedEpisode { enum ClearEpisode; enum Latched; enum ReturnArmed; }
  // @trace TYPE-06
  enum def RecoveryDecision { enum NotApplicable; enum Arm; enum Confirm; enum Cancel; enum Wait; }
  // @trace TYPE-07
  enum def ControllerMode { enum Off; enum Standby; enum Operating; enum Maintenance; enum Degraded; }
  // @generated-support TYPE-07: published-mode projection avoids a current-tool
  // cross-port enum-feature collision; it adds no decision or semantic credit.
  enum def PublishedControllerMode { enum Off; enum Standby; enum Operating; enum Maintenance; enum Degraded; }
  // @trace TYPE-07
  enum def BrakeDemand { enum RequireApply; enum AllowRelease; }
  // @trace TYPE-07
  enum def ParkingBrakeCommand { enum Apply; enum Release; }
  // @trace PART-11
  enum def TransitionReason {
    enum FaultDominant; enum MaintenanceDominant; enum StartStaged;
    enum RecoveryConfirmed; enum RunRequested; enum DormantDemand;
  }

  // All record fields inspected below are attributes, never nested parts.
  // @trace TYPE-02
  part def LifecycleIndications :> Data {
    attribute startLevel : StartIndicationLevel;
    attribute onLevel : OnIndicationLevel;
    attribute offLevel : OffIndicationLevel;
  }
  // @trace TYPE-03
  part def MaintenanceIndication :> Data { attribute level : IndicationLevel; }
  // @trace TYPE-03
  part def DegradedIndication :> Data { attribute level : IndicationLevel; }
  // @trace TYPE-03
  part def ReturnIndication :> Data { attribute level : IndicationLevel; }
  // @trace PART-01
  part def LifecycleEpochFacts :> Data {
    attribute freshStart : Base_Types::Boolean;
    attribute freshOn : Base_Types::Boolean;
    attribute offActive : Base_Types::Boolean;
    attribute heldStart : Base_Types::Boolean;
    attribute heldOn : Base_Types::Boolean;
    attribute heldOff : Base_Types::Boolean;
    attribute anyInvalid : Base_Types::Boolean;
  }
  // @trace PART-02
  part def MaintenanceEpochFacts :> Data {
    attribute active : Base_Types::Boolean;
    attribute fresh : Base_Types::Boolean;
    attribute cleared : Base_Types::Boolean;
    attribute held : Base_Types::Boolean;
    attribute invalid : Base_Types::Boolean;
  }
  // @trace PART-03
  part def DegradationEpochFacts :> Data {
    attribute active : Base_Types::Boolean;
    attribute fresh : Base_Types::Boolean;
    attribute cleared : Base_Types::Boolean;
    attribute held : Base_Types::Boolean;
    attribute invalid : Base_Types::Boolean;
  }
  // @trace PART-04
  part def ReturnEpochFacts :> Data {
    attribute fresh : Base_Types::Boolean;
    attribute held : Base_Types::Boolean;
    attribute clear : Base_Types::Boolean;
    attribute invalid : Base_Types::Boolean;
  }
  // @trace PART-07
  part def DemandSnapshot :> Data {
    attribute currentDemand : PriorOperatingDemand;
    attribute nextDemand : OperatingDemand;
  }
  // @trace PART-08
  part def MaintenanceSnapshot :> Data {
    attribute currentSession : PriorMaintenanceSession;
    attribute nextSession : MaintenanceSession;
  }
  // @trace PART-09
  part def EpisodeSnapshot :> Data {
    attribute currentEpisode : PriorDegradedEpisode;
    attribute nextEpisode : DegradedEpisode;
  }
  // @trace PART-11
  part def ModeDecision :> Data {
    attribute nextMode : ControllerMode;
    attribute reason : TransitionReason;
  }
  // @trace TYPE-07
  part def CoordinationFrame :> Data {
    attribute mode : PublishedControllerMode;
    attribute parkingBrake : ParkingBrakeCommand;
  }

  // @trace PART-01
  part def LifecycleEpochOwner :> Thread {
    // @trace INT-01
    port lifecycleIndications : DataPort { in :>> type : LifecycleIndications; }
    // @trace INT-05
    port factsToConflict : DataPort { out :>> type : LifecycleEpochFacts; }
    // @trace INT-10
    port factsToPriority : DataPort { out :>> type : LifecycleEpochFacts; }
    language "GUMBO" /*{
      state
        // @trace STATE-01
        previousStart: StartIndicationLevel;
        // @trace STATE-01
        previousOn: OnIndicationLevel;
        // @trace STATE-01
        previousOff: OffIndicationLevel;
      initialize
        modifies previousStart, previousOn, previousOff;
        // @trace STATE-01
        guarantee INITIAL_LIFECYCLE_HISTORY_INVALID:
          previousStart == StartIndicationLevel.Invalid &
          previousOn == OnIndicationLevel.Invalid &
          previousOff == OffIndicationLevel.Invalid &
          factsToConflict.freshStart == F & factsToConflict.freshOn == F &
          factsToConflict.offActive == F & factsToConflict.heldStart == F &
          factsToConflict.heldOn == F & factsToConflict.heldOff == F &
          factsToConflict.anyInvalid == T & factsToPriority == factsToConflict;
      compute
        modifies previousStart, previousOn, previousOff;
        // @trace PART-01
        guarantee LIFECYCLE_EPOCH_DERIVATION:
          (factsToConflict.freshStart ==
            (In(previousStart) == StartIndicationLevel.Clear &
             lifecycleIndications.startLevel == StartIndicationLevel.Asserted)) &
          (factsToConflict.freshOn ==
            (In(previousOn) == OnIndicationLevel.Clear &
             lifecycleIndications.onLevel == OnIndicationLevel.Asserted)) &
          (factsToConflict.offActive ==
            (lifecycleIndications.offLevel == OffIndicationLevel.Asserted)) &
          (factsToConflict.heldStart ==
            (In(previousStart) == StartIndicationLevel.Asserted &
             lifecycleIndications.startLevel == StartIndicationLevel.Asserted)) &
          (factsToConflict.heldOn ==
            (In(previousOn) == OnIndicationLevel.Asserted &
             lifecycleIndications.onLevel == OnIndicationLevel.Asserted)) &
          (factsToConflict.heldOff ==
            (In(previousOff) == OffIndicationLevel.Asserted &
             lifecycleIndications.offLevel == OffIndicationLevel.Asserted)) &
          (factsToConflict.anyInvalid ==
            (lifecycleIndications.startLevel == StartIndicationLevel.Invalid |
             lifecycleIndications.onLevel == OnIndicationLevel.Invalid |
             lifecycleIndications.offLevel == OffIndicationLevel.Invalid)) &
          factsToPriority == factsToConflict &
          previousStart == lifecycleIndications.startLevel &
          previousOn == lifecycleIndications.onLevel &
          previousOff == lifecycleIndications.offLevel;
    }*/
  }

  // @trace PART-02
  part def MaintenanceEpochOwner :> Thread {
    // @trace INT-02
    port maintenanceIndication : DataPort { in :>> type : MaintenanceIndication; }
    // @trace INT-06
    port factsToConflict : DataPort { out :>> type : MaintenanceEpochFacts; }
    // @trace INT-11
    port factsToPriority : DataPort { out :>> type : MaintenanceEpochFacts; }
    // @trace INT-16
    port factsToSession : DataPort { out :>> type : MaintenanceEpochFacts; }
    language "GUMBO" /*{
      state
        // @trace STATE-01
        previousMaintenance: IndicationLevel;
      initialize
        modifies previousMaintenance;
        // @trace STATE-01
        guarantee INITIAL_MAINTENANCE_HISTORY_INVALID:
          previousMaintenance == IndicationLevel.Invalid &
          factsToConflict.active == F & factsToConflict.fresh == F &
          factsToConflict.cleared == F & factsToConflict.held == F &
          factsToConflict.invalid == T &
          factsToPriority == factsToConflict & factsToSession == factsToConflict;
      compute
        modifies previousMaintenance;
        // @trace PART-02
        guarantee MAINTENANCE_EPOCH_DERIVATION:
          (factsToConflict.active ==
            (maintenanceIndication.level == IndicationLevel.Asserted)) &
          (factsToConflict.fresh ==
            (In(previousMaintenance) == IndicationLevel.Clear &
             maintenanceIndication.level == IndicationLevel.Asserted)) &
          (factsToConflict.cleared ==
            (In(previousMaintenance) == IndicationLevel.Asserted &
             maintenanceIndication.level == IndicationLevel.Clear)) &
          (factsToConflict.held ==
            (In(previousMaintenance) == IndicationLevel.Asserted &
             maintenanceIndication.level == IndicationLevel.Asserted)) &
          (factsToConflict.invalid ==
            (maintenanceIndication.level == IndicationLevel.Invalid)) &
          factsToPriority == factsToConflict & factsToSession == factsToConflict &
          previousMaintenance == maintenanceIndication.level;
    }*/
  }

  // @trace PART-03
  part def DegradationEpochOwner :> Thread {
    // @trace INT-03
    port degradedIndication : DataPort { in :>> type : DegradedIndication; }
    // @trace INT-07
    port factsToConflict : DataPort { out :>> type : DegradationEpochFacts; }
    // @trace INT-12
    port factsToPriority : DataPort { out :>> type : DegradationEpochFacts; }
    // @trace INT-17
    port factsToEpisode : DataPort { out :>> type : DegradationEpochFacts; }
    // @trace INT-20
    port factsToRecovery : DataPort { out :>> type : DegradationEpochFacts; }
    language "GUMBO" /*{
      state
        // @trace STATE-01
        previousDegraded: IndicationLevel;
      initialize
        modifies previousDegraded;
        // @trace STATE-01
        guarantee INITIAL_DEGRADATION_HISTORY_INVALID:
          previousDegraded == IndicationLevel.Invalid &
          factsToConflict.active == F & factsToConflict.fresh == F &
          factsToConflict.cleared == F & factsToConflict.held == F &
          factsToConflict.invalid == T & factsToPriority == factsToConflict &
          factsToEpisode == factsToConflict & factsToRecovery == factsToConflict;
      compute
        modifies previousDegraded;
        // @trace PART-03
        guarantee DEGRADATION_EPOCH_DERIVATION:
          (factsToConflict.active ==
            (degradedIndication.level == IndicationLevel.Asserted)) &
          (factsToConflict.fresh ==
            (In(previousDegraded) == IndicationLevel.Clear &
             degradedIndication.level == IndicationLevel.Asserted)) &
          (factsToConflict.cleared ==
            (In(previousDegraded) == IndicationLevel.Asserted &
             degradedIndication.level == IndicationLevel.Clear)) &
          (factsToConflict.held ==
            (In(previousDegraded) == IndicationLevel.Asserted &
             degradedIndication.level == IndicationLevel.Asserted)) &
          (factsToConflict.invalid ==
            (degradedIndication.level == IndicationLevel.Invalid)) &
          factsToPriority == factsToConflict & factsToEpisode == factsToConflict &
          factsToRecovery == factsToConflict &
          previousDegraded == degradedIndication.level;
    }*/
  }

  // @trace PART-04
  part def ReturnEpochOwner :> Thread {
    // @trace INT-04
    port returnIndication : DataPort { in :>> type : ReturnIndication; }
    // @trace INT-08
    port factsToConflict : DataPort { out :>> type : ReturnEpochFacts; }
    // @trace INT-13
    port factsToPriority : DataPort { out :>> type : ReturnEpochFacts; }
    // @trace INT-21
    port factsToRecovery : DataPort { out :>> type : ReturnEpochFacts; }
    language "GUMBO" /*{
      state
        // @trace STATE-01
        previousReturn: IndicationLevel;
      initialize
        modifies previousReturn;
        // @trace STATE-01
        guarantee INITIAL_RETURN_HISTORY_INVALID:
          previousReturn == IndicationLevel.Invalid &
          factsToConflict.fresh == F & factsToConflict.held == F &
          factsToConflict.clear == F & factsToConflict.invalid == T &
          factsToPriority == factsToConflict & factsToRecovery == factsToConflict;
      compute
        modifies previousReturn;
        // @trace PART-04
        guarantee RETURN_EPOCH_DERIVATION:
          (factsToConflict.fresh ==
            (In(previousReturn) == IndicationLevel.Clear &
             returnIndication.level == IndicationLevel.Asserted)) &
          (factsToConflict.held ==
            (In(previousReturn) == IndicationLevel.Asserted &
             returnIndication.level == IndicationLevel.Asserted)) &
          (factsToConflict.clear ==
            (returnIndication.level == IndicationLevel.Clear)) &
          (factsToConflict.invalid ==
            (returnIndication.level == IndicationLevel.Invalid)) &
          factsToPriority == factsToConflict & factsToRecovery == factsToConflict &
          previousReturn == returnIndication.level;
    }*/
  }

  // @trace PART-05
  part def ConflictClassificationOwner :> Thread {
    // @trace INT-05
    port lifecycleFacts : DataPort { in :>> type : LifecycleEpochFacts; }
    // @trace INT-06
    port maintenanceFacts : DataPort { in :>> type : MaintenanceEpochFacts; }
    // @trace INT-07
    port degradationFacts : DataPort { in :>> type : DegradationEpochFacts; }
    // @trace INT-08
    port returnFacts : DataPort { in :>> type : ReturnEpochFacts; }
    // @trace INT-09
    port conflictToPriority : DataPort { out :>> type : ConflictClass; }
    // @trace INT-18
    port conflictToRecovery : DataPort { out :>> type : ConflictClass; }
    language "GUMBO" /*{
      initialize
        // @trace FAULT-01
        guarantee INITIAL_CONFLICT_FAIL_CLOSED:
          conflictToPriority == ConflictClass.InputInvalid &
          conflictToRecovery == conflictToPriority;
      compute
        // @trace POL-02
        guarantee CONFLICT_CARDINALITY_CLASSIFICATION:
          (((lifecycleFacts.anyInvalid | maintenanceFacts.invalid |
             degradationFacts.invalid | returnFacts.invalid) &
            conflictToPriority == ConflictClass.InputInvalid) |
           ((lifecycleFacts.anyInvalid | maintenanceFacts.invalid |
             degradationFacts.invalid | returnFacts.invalid) == F &
            ((degradationFacts.active & lifecycleFacts.offActive) |
             (degradationFacts.active & maintenanceFacts.active) |
             (degradationFacts.active & returnFacts.fresh) |
             (degradationFacts.active & lifecycleFacts.freshOn) |
             (degradationFacts.active & lifecycleFacts.freshStart) |
             (lifecycleFacts.offActive & maintenanceFacts.active) |
             (lifecycleFacts.offActive & returnFacts.fresh) |
             (lifecycleFacts.offActive & lifecycleFacts.freshOn) |
             (lifecycleFacts.offActive & lifecycleFacts.freshStart) |
             (maintenanceFacts.active & returnFacts.fresh) |
             (maintenanceFacts.active & lifecycleFacts.freshOn) |
             (maintenanceFacts.active & lifecycleFacts.freshStart) |
             (returnFacts.fresh & lifecycleFacts.freshOn) |
             (returnFacts.fresh & lifecycleFacts.freshStart) |
             (lifecycleFacts.freshOn & lifecycleFacts.freshStart)) &
            conflictToPriority == ConflictClass.MultipleActionable) |
           ((lifecycleFacts.anyInvalid | maintenanceFacts.invalid |
             degradationFacts.invalid | returnFacts.invalid) == F &
            ((degradationFacts.active & lifecycleFacts.offActive) |
             (degradationFacts.active & maintenanceFacts.active) |
             (degradationFacts.active & returnFacts.fresh) |
             (degradationFacts.active & lifecycleFacts.freshOn) |
             (degradationFacts.active & lifecycleFacts.freshStart) |
             (lifecycleFacts.offActive & maintenanceFacts.active) |
             (lifecycleFacts.offActive & returnFacts.fresh) |
             (lifecycleFacts.offActive & lifecycleFacts.freshOn) |
             (lifecycleFacts.offActive & lifecycleFacts.freshStart) |
             (maintenanceFacts.active & returnFacts.fresh) |
             (maintenanceFacts.active & lifecycleFacts.freshOn) |
             (maintenanceFacts.active & lifecycleFacts.freshStart) |
             (returnFacts.fresh & lifecycleFacts.freshOn) |
             (returnFacts.fresh & lifecycleFacts.freshStart) |
             (lifecycleFacts.freshOn & lifecycleFacts.freshStart)) == F &
            conflictToPriority == ConflictClass.SingleOrNone)) &
          conflictToRecovery == conflictToPriority;
    }*/
  }

  // @trace PART-06
  part def IndicationPriorityOwner :> Thread {
    // @trace INT-09
    port conflictClass : DataPort { in :>> type : ConflictClass; }
    // @trace INT-10
    port lifecycleFacts : DataPort { in :>> type : LifecycleEpochFacts; }
    // @trace INT-11
    port maintenanceFacts : DataPort { in :>> type : MaintenanceEpochFacts; }
    // @trace INT-12
    port degradationFacts : DataPort { in :>> type : DegradationEpochFacts; }
    // @trace INT-13
    port returnFacts : DataPort { in :>> type : ReturnEpochFacts; }
    // @trace INT-14
    port selectionToDemand : DataPort { out :>> type : SelectedIndication; }
    // @trace INT-15
    port selectionToSession : DataPort { out :>> type : SelectedIndication; }
    // @trace INT-19
    port selectionToRecovery : DataPort { out :>> type : SelectedIndication; }
    // @trace INT-28
    port selectionToEpisode : DataPort { out :>> type : SelectedIndication; }
    // @trace INT-32
    port selectionToBrake : DataPort { out :>> type : SelectedIndication; }
    language "GUMBO" /*{
      initialize
        // @trace FAULT-01
        guarantee INITIAL_SELECTION_FAIL_CLOSED:
          selectionToDemand == SelectedIndication.InvalidSelected &
          selectionToSession == selectionToDemand &
          selectionToRecovery == selectionToDemand &
          selectionToEpisode == selectionToDemand &
          selectionToBrake == selectionToDemand;
      compute
        // @trace POL-01
        guarantee SELECTION_FANOUT_COHERENCE:
          selectionToSession == selectionToDemand &
          selectionToRecovery == selectionToDemand &
          selectionToEpisode == selectionToDemand &
          selectionToBrake == selectionToDemand;
        compute_cases
          // @trace CASE-01
          case CASE_01_INPUT_INVALID:
            assume conflictClass == ConflictClass.InputInvalid;
            guarantee selectionToDemand == SelectedIndication.InvalidSelected;
          // @trace CASE-02
          case CASE_02_DEGRADED:
            assume conflictClass != ConflictClass.InputInvalid & degradationFacts.active;
            guarantee selectionToDemand == SelectedIndication.DegradedSelected;
          // @trace CASE-03
          case CASE_03_OFF:
            assume conflictClass != ConflictClass.InputInvalid & degradationFacts.active == F &
              lifecycleFacts.offActive;
            guarantee selectionToDemand == SelectedIndication.OffSelected;
          // @trace CASE-04
          case CASE_04_MAINTENANCE:
            assume conflictClass != ConflictClass.InputInvalid & degradationFacts.active == F &
              lifecycleFacts.offActive == F & maintenanceFacts.active;
            guarantee selectionToDemand == SelectedIndication.MaintenanceSelected;
          // @trace CASE-05
          case CASE_05_RETURN:
            assume conflictClass != ConflictClass.InputInvalid & degradationFacts.active == F &
              lifecycleFacts.offActive == F & maintenanceFacts.active == F & returnFacts.fresh;
            guarantee selectionToDemand == SelectedIndication.ReturnSelected;
          // @trace CASE-06
          case CASE_06_ON:
            assume conflictClass != ConflictClass.InputInvalid & degradationFacts.active == F &
              lifecycleFacts.offActive == F & maintenanceFacts.active == F & returnFacts.fresh == F &
              lifecycleFacts.freshOn;
            guarantee selectionToDemand == SelectedIndication.OnSelected;
          // @trace CASE-07
          case CASE_07_START:
            assume conflictClass != ConflictClass.InputInvalid & degradationFacts.active == F &
              lifecycleFacts.offActive == F & maintenanceFacts.active == F & returnFacts.fresh == F &
              lifecycleFacts.freshOn == F & lifecycleFacts.freshStart;
            guarantee selectionToDemand == SelectedIndication.StartSelected;
          // @trace CASE-08
          case CASE_08_NONE:
            assume conflictClass != ConflictClass.InputInvalid & degradationFacts.active == F &
              lifecycleFacts.offActive == F & maintenanceFacts.active == F & returnFacts.fresh == F &
              lifecycleFacts.freshOn == F & lifecycleFacts.freshStart == F;
            guarantee selectionToDemand == SelectedIndication.NoneSelected;
    }*/
  }

  // @trace PART-07
  part def OperatingDemandOwner :> Thread {
    // @trace INT-14
    port selectedIndication : DataPort { in :>> type : SelectedIndication; }
    // @trace INT-24
    port recoveryDecision : DataPort { in :>> type : RecoveryDecision; }
    // @trace INT-25
    port demandSnapshot : DataPort { out :>> type : DemandSnapshot; }
    language "GUMBO" /*{
      state
        // @trace STATE-02
        demandMemory: OperatingDemand;
      initialize
        modifies demandMemory;
        // @trace STATE-02
        guarantee INITIAL_DEMAND_DORMANT:
          demandMemory == OperatingDemand.Dormant &
          demandSnapshot.currentDemand == PriorOperatingDemand.Dormant &
          demandSnapshot.nextDemand == OperatingDemand.Dormant;
      compute
        modifies demandMemory;
        // @trace PART-07
        guarantee DEMAND_SNAPSHOT_COHERENCE:
          (((In(demandMemory) == OperatingDemand.Dormant) &
            demandSnapshot.currentDemand == PriorOperatingDemand.Dormant) |
           ((In(demandMemory) == OperatingDemand.Staged) &
            demandSnapshot.currentDemand == PriorOperatingDemand.Staged) |
           ((In(demandMemory) == OperatingDemand.RunRequested) &
            demandSnapshot.currentDemand == PriorOperatingDemand.RunRequested)) &
          demandSnapshot.nextDemand == demandMemory;
        compute_cases
          // @trace CASE-09
          case CASE_09_DEMAND_CLEAR:
            assume selectedIndication == SelectedIndication.InvalidSelected |
              selectedIndication == SelectedIndication.DegradedSelected |
              selectedIndication == SelectedIndication.OffSelected;
            guarantee demandMemory == OperatingDemand.Dormant;
          // @trace CASE-10
          case CASE_10_DEMAND_STAGE:
            assume selectedIndication != SelectedIndication.InvalidSelected &
              selectedIndication != SelectedIndication.DegradedSelected &
              selectedIndication != SelectedIndication.OffSelected &
              (recoveryDecision == RecoveryDecision.Confirm |
               (selectedIndication == SelectedIndication.StartSelected &
                In(demandMemory) == OperatingDemand.Dormant));
            guarantee demandMemory == OperatingDemand.Staged;
          // @trace CASE-11
          case CASE_11_DEMAND_RUN:
            assume selectedIndication == SelectedIndication.OnSelected &
              recoveryDecision != RecoveryDecision.Confirm &
              In(demandMemory) == OperatingDemand.Staged;
            guarantee demandMemory == OperatingDemand.RunRequested;
          // @trace CASE-12
          case CASE_12_DEMAND_RETAIN:
            assume selectedIndication != SelectedIndication.InvalidSelected &
              selectedIndication != SelectedIndication.DegradedSelected &
              selectedIndication != SelectedIndication.OffSelected &
              recoveryDecision != RecoveryDecision.Confirm &
              (selectedIndication != SelectedIndication.StartSelected |
               In(demandMemory) != OperatingDemand.Dormant) &
              (selectedIndication != SelectedIndication.OnSelected |
               In(demandMemory) != OperatingDemand.Staged);
            guarantee demandMemory == In(demandMemory);
    }*/
  }

  // @trace PART-08
  part def MaintenanceSessionOwner :> Thread {
    // @trace INT-15
    port selectedIndication : DataPort { in :>> type : SelectedIndication; }
    // @trace INT-16
    port maintenanceFacts : DataPort { in :>> type : MaintenanceEpochFacts; }
    // @trace INT-26
    port maintenanceSnapshot : DataPort { out :>> type : MaintenanceSnapshot; }
    // @trace INT-30
    port snapshotToBrake : DataPort { out :>> type : MaintenanceSnapshot; }
    language "GUMBO" /*{
      state
        // @trace STATE-02
        sessionMemory: MaintenanceSession;
      initialize
        modifies sessionMemory;
        // @trace STATE-02
        guarantee INITIAL_SESSION_INACTIVE:
          sessionMemory == MaintenanceSession.Inactive &
          maintenanceSnapshot.currentSession == PriorMaintenanceSession.Inactive &
          maintenanceSnapshot.nextSession == MaintenanceSession.Inactive &
          snapshotToBrake == maintenanceSnapshot;
      compute
        modifies sessionMemory;
        // @trace PART-08
        guarantee MAINTENANCE_SNAPSHOT_COHERENCE:
          (((In(sessionMemory) == MaintenanceSession.Inactive) &
            maintenanceSnapshot.currentSession == PriorMaintenanceSession.Inactive) |
           ((In(sessionMemory) == MaintenanceSession.Active) &
            maintenanceSnapshot.currentSession == PriorMaintenanceSession.Active)) &
          maintenanceSnapshot.nextSession == sessionMemory &
          snapshotToBrake == maintenanceSnapshot;
        compute_cases
          // @trace CASE-13
          case CASE_13_MAINTENANCE_ENTER:
            assume selectedIndication == SelectedIndication.MaintenanceSelected;
            guarantee sessionMemory == MaintenanceSession.Active;
          // @trace CASE-14
          case CASE_14_MAINTENANCE_EXIT:
            assume selectedIndication != SelectedIndication.MaintenanceSelected &
              ((selectedIndication == SelectedIndication.InvalidSelected |
                selectedIndication == SelectedIndication.DegradedSelected |
                selectedIndication == SelectedIndication.OffSelected) |
               (In(sessionMemory) == MaintenanceSession.Active &
                maintenanceFacts.active == F & maintenanceFacts.invalid == F &
                selectedIndication == SelectedIndication.OnSelected));
            guarantee sessionMemory == MaintenanceSession.Inactive;
          // @trace CASE-15
          case CASE_15_MAINTENANCE_RETAIN:
            assume selectedIndication != SelectedIndication.MaintenanceSelected &
              selectedIndication != SelectedIndication.InvalidSelected &
              selectedIndication != SelectedIndication.DegradedSelected &
              selectedIndication != SelectedIndication.OffSelected &
              (In(sessionMemory) != MaintenanceSession.Active |
               maintenanceFacts.active |
               maintenanceFacts.invalid |
               selectedIndication != SelectedIndication.OnSelected);
            guarantee sessionMemory == In(sessionMemory);
    }*/
  }

  // @trace PART-09
  part def DegradedEpisodeOwner :> Thread {
    // @trace INT-17
    port degradationFacts : DataPort { in :>> type : DegradationEpochFacts; }
    // @trace INT-23
    port recoveryDecision : DataPort { in :>> type : RecoveryDecision; }
    // @trace INT-28
    port selectedIndication : DataPort { in :>> type : SelectedIndication; }
    // @trace INT-22
    port snapshotToRecovery : DataPort { out :>> type : EpisodeSnapshot; }
    // @trace INT-27
    port snapshotToMode : DataPort { out :>> type : EpisodeSnapshot; }
    // @trace INT-31
    port snapshotToBrake : DataPort { out :>> type : EpisodeSnapshot; }
    language "GUMBO" /*{
      state
        // @trace STATE-02
        episodeMemory: DegradedEpisode;
      initialize
        modifies episodeMemory;
        // @trace STATE-02
        guarantee INITIAL_EPISODE_CLEAR:
          episodeMemory == DegradedEpisode.ClearEpisode &
          snapshotToRecovery.currentEpisode == PriorDegradedEpisode.ClearEpisode &
          snapshotToRecovery.nextEpisode == DegradedEpisode.ClearEpisode &
          snapshotToMode == snapshotToRecovery & snapshotToBrake == snapshotToRecovery;
      compute
        modifies episodeMemory;
        // @trace STATE-03
        guarantee EPISODE_SNAPSHOT_PRE_POST_SPLIT:
          (((In(episodeMemory) == DegradedEpisode.ClearEpisode) &
            snapshotToRecovery.currentEpisode == PriorDegradedEpisode.ClearEpisode) |
           ((In(episodeMemory) == DegradedEpisode.Latched) &
            snapshotToRecovery.currentEpisode == PriorDegradedEpisode.Latched) |
           ((In(episodeMemory) == DegradedEpisode.ReturnArmed) &
            snapshotToRecovery.currentEpisode == PriorDegradedEpisode.ReturnArmed)) &
          snapshotToRecovery.nextEpisode == episodeMemory &
          snapshotToMode == snapshotToRecovery & snapshotToBrake == snapshotToRecovery;
        compute_cases
          // @trace CASE-16
          case CASE_16_EPISODE_LATCH:
            assume degradationFacts.active | degradationFacts.invalid |
              selectedIndication == SelectedIndication.InvalidSelected |
              selectedIndication == SelectedIndication.DegradedSelected;
            guarantee episodeMemory == DegradedEpisode.Latched;
          // @trace CASE-17
          case CASE_17_EPISODE_ARM:
            assume degradationFacts.active == F & degradationFacts.invalid == F &
              selectedIndication != SelectedIndication.InvalidSelected &
              selectedIndication != SelectedIndication.DegradedSelected &
              In(episodeMemory) == DegradedEpisode.Latched &
              recoveryDecision == RecoveryDecision.Arm;
            guarantee episodeMemory == DegradedEpisode.ReturnArmed;
          // @trace CASE-18
          case CASE_18_EPISODE_CLEAR:
            assume degradationFacts.active == F & degradationFacts.invalid == F &
              selectedIndication != SelectedIndication.InvalidSelected &
              selectedIndication != SelectedIndication.DegradedSelected &
              In(episodeMemory) == DegradedEpisode.ReturnArmed &
              recoveryDecision == RecoveryDecision.Confirm;
            guarantee episodeMemory == DegradedEpisode.ClearEpisode;
          // @trace CASE-19
          case CASE_19_EPISODE_CANCEL:
            assume degradationFacts.active == F & degradationFacts.invalid == F &
              selectedIndication != SelectedIndication.InvalidSelected &
              selectedIndication != SelectedIndication.DegradedSelected &
              In(episodeMemory) == DegradedEpisode.ReturnArmed &
              recoveryDecision == RecoveryDecision.Cancel;
            guarantee episodeMemory == DegradedEpisode.Latched;
          // @trace CASE-20
          case CASE_20_EPISODE_RETAIN:
            assume degradationFacts.active == F & degradationFacts.invalid == F &
              selectedIndication != SelectedIndication.InvalidSelected &
              selectedIndication != SelectedIndication.DegradedSelected &
              (In(episodeMemory) != DegradedEpisode.Latched |
               recoveryDecision != RecoveryDecision.Arm) &
              (In(episodeMemory) != DegradedEpisode.ReturnArmed |
               recoveryDecision != RecoveryDecision.Confirm) &
              (In(episodeMemory) != DegradedEpisode.ReturnArmed |
               recoveryDecision != RecoveryDecision.Cancel);
            guarantee episodeMemory == In(episodeMemory);
    }*/
  }

  // @trace PART-10
  part def RecoveryEligibilityOwner :> Thread {
    // @trace INT-18
    port conflictClass : DataPort { in :>> type : ConflictClass; }
    // @trace INT-19
    port selectedIndication : DataPort { in :>> type : SelectedIndication; }
    // @trace INT-20
    port degradationFacts : DataPort { in :>> type : DegradationEpochFacts; }
    // @trace INT-21
    port returnFacts : DataPort { in :>> type : ReturnEpochFacts; }
    // @trace INT-22
    port episodeSnapshot : DataPort { in :>> type : EpisodeSnapshot; }
    // @trace INT-23
    port decisionToEpisode : DataPort { out :>> type : RecoveryDecision; }
    // @trace INT-24
    port decisionToDemand : DataPort { out :>> type : RecoveryDecision; }
    // @trace INT-29
    port decisionToMode : DataPort { out :>> type : RecoveryDecision; }
    language "GUMBO" /*{
      initialize
        // @trace STATE-02
        guarantee INITIAL_RECOVERY_NOT_APPLICABLE:
          decisionToEpisode == RecoveryDecision.NotApplicable &
          decisionToDemand == decisionToEpisode & decisionToMode == decisionToEpisode;
      compute
        // @trace POL-06
        guarantee RECOVERY_DECISION_FANOUT:
          decisionToDemand == decisionToEpisode & decisionToMode == decisionToEpisode;
        compute_cases
          // @trace CASE-21
          case CASE_21_RECOVERY_NOT_APPLICABLE:
            assume episodeSnapshot.currentEpisode == PriorDegradedEpisode.ClearEpisode;
            guarantee decisionToEpisode == RecoveryDecision.NotApplicable;
          // @trace CASE-22
          case CASE_22_RECOVERY_ARM:
            assume episodeSnapshot.currentEpisode == PriorDegradedEpisode.Latched &
              degradationFacts.active == F & degradationFacts.invalid == F &
              returnFacts.invalid == F & returnFacts.fresh &
              selectedIndication == SelectedIndication.ReturnSelected &
              conflictClass == ConflictClass.SingleOrNone;
            guarantee decisionToEpisode == RecoveryDecision.Arm;
          // @trace CASE-23
          case CASE_23_RECOVERY_CONFIRM:
            assume episodeSnapshot.currentEpisode == PriorDegradedEpisode.ReturnArmed &
              degradationFacts.active == F & degradationFacts.invalid == F &
              returnFacts.invalid == F & returnFacts.clear &
              selectedIndication == SelectedIndication.NoneSelected &
              conflictClass == ConflictClass.SingleOrNone;
            guarantee decisionToEpisode == RecoveryDecision.Confirm;
          // @trace CASE-24
          case CASE_24_RECOVERY_CANCEL:
            assume episodeSnapshot.currentEpisode == PriorDegradedEpisode.ReturnArmed &
              (degradationFacts.active | degradationFacts.invalid | returnFacts.invalid |
               conflictClass == ConflictClass.MultipleActionable |
               selectedIndication == SelectedIndication.InvalidSelected |
               selectedIndication == SelectedIndication.DegradedSelected |
               selectedIndication == SelectedIndication.OffSelected |
               selectedIndication == SelectedIndication.MaintenanceSelected |
               selectedIndication == SelectedIndication.OnSelected |
               selectedIndication == SelectedIndication.StartSelected);
            guarantee decisionToEpisode == RecoveryDecision.Cancel;
          // @trace CASE-25
          case CASE_25_RECOVERY_WAIT:
            assume episodeSnapshot.currentEpisode != PriorDegradedEpisode.ClearEpisode &
              (episodeSnapshot.currentEpisode != PriorDegradedEpisode.Latched |
               degradationFacts.active | degradationFacts.invalid | returnFacts.invalid |
               returnFacts.fresh == F |
               selectedIndication != SelectedIndication.ReturnSelected |
               conflictClass != ConflictClass.SingleOrNone) &
              (episodeSnapshot.currentEpisode != PriorDegradedEpisode.ReturnArmed |
               degradationFacts.active | degradationFacts.invalid | returnFacts.invalid |
               returnFacts.clear == F |
               selectedIndication != SelectedIndication.NoneSelected |
               conflictClass != ConflictClass.SingleOrNone) &
              (episodeSnapshot.currentEpisode != PriorDegradedEpisode.ReturnArmed |
               (degradationFacts.active | degradationFacts.invalid | returnFacts.invalid |
                conflictClass == ConflictClass.MultipleActionable |
                selectedIndication == SelectedIndication.InvalidSelected |
                selectedIndication == SelectedIndication.DegradedSelected |
                selectedIndication == SelectedIndication.OffSelected |
                selectedIndication == SelectedIndication.MaintenanceSelected |
                selectedIndication == SelectedIndication.OnSelected |
                selectedIndication == SelectedIndication.StartSelected) == F);
            guarantee decisionToEpisode == RecoveryDecision.Wait;
    }*/
  }

  // @trace PART-11
  part def ControllerModeTransitionOwner :> Thread {
    // @trace INT-25
    port demandSnapshot : DataPort { in :>> type : DemandSnapshot; }
    // @trace INT-26
    port maintenanceSnapshot : DataPort { in :>> type : MaintenanceSnapshot; }
    // @trace INT-27
    port episodeSnapshot : DataPort { in :>> type : EpisodeSnapshot; }
    // @trace INT-29
    port recoveryDecision : DataPort { in :>> type : RecoveryDecision; }
    // @trace INT-33
    port modeDecision : DataPort { out :>> type : ModeDecision; }
    language "GUMBO" /*{
      state
        // @trace STATE-02
        modeMemory: ControllerMode;
      initialize
        modifies modeMemory;
        // @trace STATE-02
        guarantee INITIAL_MODE_OFF:
          modeMemory == ControllerMode.Off & modeDecision.nextMode == ControllerMode.Off &
          modeDecision.reason == TransitionReason.DormantDemand;
      compute
        modifies modeMemory;
        // @trace PART-11
        guarantee MODE_OUTPUT_COHERENCE:
          modeDecision.nextMode == modeMemory;
        compute_cases
          // @trace CASE-26
          case CASE_26_MODE_DEGRADED:
            assume episodeSnapshot.nextEpisode != DegradedEpisode.ClearEpisode;
            guarantee modeMemory == ControllerMode.Degraded &
              modeDecision.reason == TransitionReason.FaultDominant;
          // @trace CASE-27
          case CASE_27_MODE_MAINTENANCE:
            assume episodeSnapshot.nextEpisode == DegradedEpisode.ClearEpisode &
              maintenanceSnapshot.nextSession == MaintenanceSession.Active;
            guarantee modeMemory == ControllerMode.Maintenance &
              modeDecision.reason == TransitionReason.MaintenanceDominant;
          // @trace CASE-28
          case CASE_28_MODE_STANDBY:
            assume episodeSnapshot.nextEpisode == DegradedEpisode.ClearEpisode &
              maintenanceSnapshot.nextSession == MaintenanceSession.Inactive &
              demandSnapshot.nextDemand == OperatingDemand.Staged;
            guarantee modeMemory == ControllerMode.Standby &
              ((recoveryDecision == RecoveryDecision.Confirm &
                modeDecision.reason == TransitionReason.RecoveryConfirmed) |
               (recoveryDecision != RecoveryDecision.Confirm &
                modeDecision.reason == TransitionReason.StartStaged));
          // @trace CASE-29
          case CASE_29_MODE_OPERATING:
            assume episodeSnapshot.nextEpisode == DegradedEpisode.ClearEpisode &
              maintenanceSnapshot.nextSession == MaintenanceSession.Inactive &
              demandSnapshot.nextDemand == OperatingDemand.RunRequested;
            guarantee modeMemory == ControllerMode.Operating &
              modeDecision.reason == TransitionReason.RunRequested;
          // @trace CASE-30
          case CASE_30_MODE_OFF:
            assume episodeSnapshot.nextEpisode == DegradedEpisode.ClearEpisode &
              maintenanceSnapshot.nextSession == MaintenanceSession.Inactive &
              demandSnapshot.nextDemand == OperatingDemand.Dormant;
            guarantee modeMemory == ControllerMode.Off &
              modeDecision.reason == TransitionReason.DormantDemand;
    }*/
  }

  // @trace PART-12
  part def ParkingBrakeDemandOwner :> Thread {
    // @trace INT-30
    port maintenanceSnapshot : DataPort { in :>> type : MaintenanceSnapshot; }
    // @trace INT-31
    port episodeSnapshot : DataPort { in :>> type : EpisodeSnapshot; }
    // @trace INT-32
    port selectedIndication : DataPort { in :>> type : SelectedIndication; }
    // @trace INT-34
    port brakeDemand : DataPort { out :>> type : BrakeDemand; }
    language "GUMBO" /*{
      initialize
        // @trace POL-10
        guarantee INITIAL_BRAKE_DEMAND_SAFE:
          brakeDemand == BrakeDemand.RequireApply;
      compute
        // @trace POL-08
        guarantee INDEPENDENT_BRAKE_DEMAND:
          (((maintenanceSnapshot.nextSession == MaintenanceSession.Active |
             episodeSnapshot.nextEpisode != DegradedEpisode.ClearEpisode |
             selectedIndication == SelectedIndication.InvalidSelected |
             selectedIndication == SelectedIndication.DegradedSelected |
             selectedIndication == SelectedIndication.OffSelected |
             selectedIndication == SelectedIndication.MaintenanceSelected) &
            brakeDemand == BrakeDemand.RequireApply) |
           ((maintenanceSnapshot.nextSession != MaintenanceSession.Active &
             episodeSnapshot.nextEpisode == DegradedEpisode.ClearEpisode &
             selectedIndication != SelectedIndication.InvalidSelected &
             selectedIndication != SelectedIndication.DegradedSelected &
             selectedIndication != SelectedIndication.OffSelected &
             selectedIndication != SelectedIndication.MaintenanceSelected) &
            brakeDemand == BrakeDemand.AllowRelease));
    }*/
  }

  // @trace PART-13
  part def OutcomeCoherenceOwner :> Thread {
    // @trace INT-33
    port modeDecision : DataPort { in :>> type : ModeDecision; }
    // @trace INT-34
    port brakeDemand : DataPort { in :>> type : BrakeDemand; }
    // @trace INT-35
    port coordinationFrame : DataPort { out :>> type : CoordinationFrame; }
    language "GUMBO" /*{
      initialize
        // @trace POL-10
        guarantee INITIAL_FRAME_SAFE:
          coordinationFrame.mode == PublishedControllerMode.Off &
          coordinationFrame.parkingBrake == ParkingBrakeCommand.Apply;
      compute
        // @trace POL-09
        guarantee CONSERVATIVE_TWO_INPUT_COMPOSITION:
          (((modeDecision.nextMode == ControllerMode.Off &
             coordinationFrame.mode == PublishedControllerMode.Off) |
            (modeDecision.nextMode == ControllerMode.Standby &
             coordinationFrame.mode == PublishedControllerMode.Standby) |
            (modeDecision.nextMode == ControllerMode.Operating &
             coordinationFrame.mode == PublishedControllerMode.Operating) |
            (modeDecision.nextMode == ControllerMode.Maintenance &
             coordinationFrame.mode == PublishedControllerMode.Maintenance) |
            (modeDecision.nextMode == ControllerMode.Degraded &
             coordinationFrame.mode == PublishedControllerMode.Degraded))) &
          (((modeDecision.nextMode == ControllerMode.Operating &
             brakeDemand == BrakeDemand.AllowRelease) &
            coordinationFrame.parkingBrake == ParkingBrakeCommand.Release) |
           ((modeDecision.nextMode != ControllerMode.Operating |
             brakeDemand == BrakeDemand.RequireApply) &
            coordinationFrame.parkingBrake == ParkingBrakeCommand.Apply));
        // @trace FAULT-04
        guarantee NONOPERATING_RELEASE_EXCLUDED:
          (coordinationFrame.parkingBrake == ParkingBrakeCommand.Release) ==
            (coordinationFrame.mode == PublishedControllerMode.Operating &
             brakeDemand == BrakeDemand.AllowRelease);
    }*/
  }

  // @generated-support CONSTR-01: sole behavior-free Process container.
  part def ModeCoordinationProcess :> Process {
    // @generated-support MON-01: transparent Process boundary endpoint.
    port lifecycleIndications : DataPort { in :>> type : LifecycleIndications; }
    // @generated-support MON-02: transparent Process boundary endpoint.
    port maintenanceIndication : DataPort { in :>> type : MaintenanceIndication; }
    // @generated-support MON-03: transparent Process boundary endpoint.
    port degradedIndication : DataPort { in :>> type : DegradedIndication; }
    // @generated-support MON-04: transparent Process boundary endpoint.
    port returnIndication : DataPort { in :>> type : ReturnIndication; }
    // @generated-support CTRL-01: transparent Process boundary endpoint.
    port coordinationFrame : DataPort { out :>> type : CoordinationFrame; }

    // @trace PART-01
    part lifecycleEpochOwner : LifecycleEpochOwner;
    // @trace PART-02
    part maintenanceEpochOwner : MaintenanceEpochOwner;
    // @trace PART-03
    part degradationEpochOwner : DegradationEpochOwner;
    // @trace PART-04
    part returnEpochOwner : ReturnEpochOwner;
    // @trace PART-05
    part conflictClassificationOwner : ConflictClassificationOwner;
    // @trace PART-06
    part indicationPriorityOwner : IndicationPriorityOwner;
    // @trace PART-07
    part operatingDemandOwner : OperatingDemandOwner;
    // @trace PART-08
    part maintenanceSessionOwner : MaintenanceSessionOwner;
    // @trace PART-09
    part degradedEpisodeOwner : DegradedEpisodeOwner;
    // @trace PART-10
    part recoveryEligibilityOwner : RecoveryEligibilityOwner;
    // @trace PART-11
    part controllerModeTransitionOwner : ControllerModeTransitionOwner;
    // @trace PART-12
    part parkingBrakeDemandOwner : ParkingBrakeDemandOwner;
    // @trace PART-13
    part outcomeCoherenceOwner : OutcomeCoherenceOwner;

    // @trace INT-01
    connection int01 : PortConnection connect lifecycleIndications to lifecycleEpochOwner.lifecycleIndications;
    // @trace INT-02
    connection int02 : PortConnection connect maintenanceIndication to maintenanceEpochOwner.maintenanceIndication;
    // @trace INT-03
    connection int03 : PortConnection connect degradedIndication to degradationEpochOwner.degradedIndication;
    // @trace INT-04
    connection int04 : PortConnection connect returnIndication to returnEpochOwner.returnIndication;
    // @trace INT-05
    connection int05 : PortConnection connect lifecycleEpochOwner.factsToConflict to conflictClassificationOwner.lifecycleFacts;
    // @trace INT-06
    connection int06 : PortConnection connect maintenanceEpochOwner.factsToConflict to conflictClassificationOwner.maintenanceFacts;
    // @trace INT-07
    connection int07 : PortConnection connect degradationEpochOwner.factsToConflict to conflictClassificationOwner.degradationFacts;
    // @trace INT-08
    connection int08 : PortConnection connect returnEpochOwner.factsToConflict to conflictClassificationOwner.returnFacts;
    // @trace INT-09
    connection int09 : PortConnection connect conflictClassificationOwner.conflictToPriority to indicationPriorityOwner.conflictClass;
    // @trace INT-10
    connection int10 : PortConnection connect lifecycleEpochOwner.factsToPriority to indicationPriorityOwner.lifecycleFacts;
    // @trace INT-11
    connection int11 : PortConnection connect maintenanceEpochOwner.factsToPriority to indicationPriorityOwner.maintenanceFacts;
    // @trace INT-12
    connection int12 : PortConnection connect degradationEpochOwner.factsToPriority to indicationPriorityOwner.degradationFacts;
    // @trace INT-13
    connection int13 : PortConnection connect returnEpochOwner.factsToPriority to indicationPriorityOwner.returnFacts;
    // @trace INT-14
    connection int14 : PortConnection connect indicationPriorityOwner.selectionToDemand to operatingDemandOwner.selectedIndication;
    // @trace INT-15
    connection int15 : PortConnection connect indicationPriorityOwner.selectionToSession to maintenanceSessionOwner.selectedIndication;
    // @trace INT-16
    connection int16 : PortConnection connect maintenanceEpochOwner.factsToSession to maintenanceSessionOwner.maintenanceFacts;
    // @trace INT-17
    connection int17 : PortConnection connect degradationEpochOwner.factsToEpisode to degradedEpisodeOwner.degradationFacts;
    // @trace INT-18
    connection int18 : PortConnection connect conflictClassificationOwner.conflictToRecovery to recoveryEligibilityOwner.conflictClass;
    // @trace INT-19
    connection int19 : PortConnection connect indicationPriorityOwner.selectionToRecovery to recoveryEligibilityOwner.selectedIndication;
    // @trace INT-20
    connection int20 : PortConnection connect degradationEpochOwner.factsToRecovery to recoveryEligibilityOwner.degradationFacts;
    // @trace INT-21
    connection int21 : PortConnection connect returnEpochOwner.factsToRecovery to recoveryEligibilityOwner.returnFacts;
    // @trace INT-22
    connection int22 : PortConnection connect degradedEpisodeOwner.snapshotToRecovery to recoveryEligibilityOwner.episodeSnapshot;
    // @trace INT-23
    connection int23 : PortConnection connect recoveryEligibilityOwner.decisionToEpisode to degradedEpisodeOwner.recoveryDecision;
    // @trace INT-24
    connection int24 : PortConnection connect recoveryEligibilityOwner.decisionToDemand to operatingDemandOwner.recoveryDecision;
    // @trace INT-25
    connection int25 : PortConnection connect operatingDemandOwner.demandSnapshot to controllerModeTransitionOwner.demandSnapshot;
    // @trace INT-26
    connection int26 : PortConnection connect maintenanceSessionOwner.maintenanceSnapshot to controllerModeTransitionOwner.maintenanceSnapshot;
    // @trace INT-27
    connection int27 : PortConnection connect degradedEpisodeOwner.snapshotToMode to controllerModeTransitionOwner.episodeSnapshot;
    // @trace INT-28
    connection int28 : PortConnection connect indicationPriorityOwner.selectionToEpisode to degradedEpisodeOwner.selectedIndication;
    // @trace INT-29
    connection int29 : PortConnection connect recoveryEligibilityOwner.decisionToMode to controllerModeTransitionOwner.recoveryDecision;
    // @trace INT-30
    connection int30 : PortConnection connect maintenanceSessionOwner.snapshotToBrake to parkingBrakeDemandOwner.maintenanceSnapshot;
    // @trace INT-31
    connection int31 : PortConnection connect degradedEpisodeOwner.snapshotToBrake to parkingBrakeDemandOwner.episodeSnapshot;
    // @trace INT-32
    connection int32 : PortConnection connect indicationPriorityOwner.selectionToBrake to parkingBrakeDemandOwner.selectedIndication;
    // @trace INT-33
    connection int33 : PortConnection connect controllerModeTransitionOwner.modeDecision to outcomeCoherenceOwner.modeDecision;
    // @trace INT-34
    connection int34 : PortConnection connect parkingBrakeDemandOwner.brakeDemand to outcomeCoherenceOwner.brakeDemand;
    // @trace INT-35
    connection int35 : PortConnection connect outcomeCoherenceOwner.coordinationFrame to coordinationFrame;
  }

  // @trace BOUND-01
  part def VehicleControllerOperatingModeCoordinatorSystem :> System {
    // @trace MON-01
    port lifecycleIndications : DataPort { in :>> type : LifecycleIndications; }
    // @trace MON-02
    port maintenanceIndication : DataPort { in :>> type : MaintenanceIndication; }
    // @trace MON-03
    port degradedIndication : DataPort { in :>> type : DegradedIndication; }
    // @trace MON-04
    port returnIndication : DataPort { in :>> type : ReturnIndication; }
    // @trace CTRL-01
    port coordinationFrame : DataPort { out :>> type : CoordinationFrame; }
    // @generated-support CONSTR-01: approved behavior-free Process usage.
    part modeCoordinationProcess : ModeCoordinationProcess;
    // @generated-support INT-01: transparent root-to-Process delegation.
    connection support01 : PortConnection connect lifecycleIndications to modeCoordinationProcess.lifecycleIndications;
    // @generated-support INT-02: transparent root-to-Process delegation.
    connection support02 : PortConnection connect maintenanceIndication to modeCoordinationProcess.maintenanceIndication;
    // @generated-support INT-03: transparent root-to-Process delegation.
    connection support03 : PortConnection connect degradedIndication to modeCoordinationProcess.degradedIndication;
    // @generated-support INT-04: transparent root-to-Process delegation.
    connection support04 : PortConnection connect returnIndication to modeCoordinationProcess.returnIndication;
    // @generated-support INT-35: transparent Process-to-root delegation.
    connection support05 : PortConnection connect modeCoordinationProcess.coordinationFrame to coordinationFrame;
  }

  // @trace BOUND-01
  part vehicleControllerOperatingModeCoordinator : VehicleControllerOperatingModeCoordinatorSystem;
}
