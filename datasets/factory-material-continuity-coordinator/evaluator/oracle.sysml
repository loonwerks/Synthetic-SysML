// Canonical final source: retained architecture plus approved GUMBO behavior.
// The behavior-free checkpoint is retained separately under validation/architecture-stage/.

// @trace PURPOSE-01
package Factory_Material_Continuity_Coordinator {
  private import HAMR::*;

  // @trace MON-DEM-01
  enum def DemandSignal {
    enum NONE; enum INVALID; enum ARoutine; enum AUrgent;
    enum BRoutine; enum BUrgent;
  }
  // @trace TYPE-FACT-01
  enum def DemandCode {
    enum NONE; enum INVALID; enum ARoutine; enum AUrgent;
    enum BRoutine; enum BUrgent;
  }
  // @trace MON-INV-01
  enum def InventoryBand { enum INVALID; enum EMPTY; enum LOW; enum READY; }
  // @trace TYPE-FACT-01
  enum def InventoryBandCode { enum INVALID; enum EMPTY; enum LOW; enum READY; }
  // @trace MON-SUP-01
  enum def Availability { enum INVALID; enum UNAVAILABLE; enum AVAILABLE; }
  // @trace MON-EVT-01
  enum def MaterialEvent {
    enum NONE; enum OrderAccepted; enum ReceiptOk; enum HandoffOk; enum FAILED;
  }
  // @trace TYPE-EVT-01
  enum def MaterialEventCode {
    enum NONE; enum OrderAccepted; enum ReceiptOk; enum HandoffOk; enum FAILED;
  }
  // @trace MON-REC-01
  enum def RecoveryEvent { enum NONE; enum RESET; enum VerifyOk; }
  // @trace TYPE-ACT-01
  enum def MaterialAction {
    enum HOLD; enum ReleaseUrgentMaterial; enum IssueMaterialOrder;
    enum ReleaseRoutineMaterial;
  }
  // @trace TYPE-CAUSE-01
  enum def DecisionCause {
    enum FaultOrRecovery; enum UrgentDemand; enum ReserveReplenishment;
    enum RoutineDemand; enum NoEligibleWork;
  }
  // @trace TYPE-MODE-01
  enum def CoordinationMode { enum HOLDING; enum RELEASING; enum ORDERING; enum FAULT; }
  // @trace TYPE-DISP-01
  enum def DemandDisposition {
    enum NoRequest; enum REJECTED; enum ACCEPTED; enum RetainedDuplicate; enum DEFERRED;
  }
  // @trace TYPE-STATE-01
  enum def DemandState {
    enum IDLE; enum ARoutineOpen; enum AUrgentOpen;
    enum BRoutineOpen; enum BUrgentOpen;
  }
  // @trace TYPE-STATE-01
  enum def DemandStateView {
    enum IDLE; enum ARoutineOpen; enum AUrgentOpen;
    enum BRoutineOpen; enum BUrgentOpen;
  }
  // @trace TYPE-STATE-01
  enum def DemandStateCode {
    enum IDLE; enum ARoutineOpen; enum AUrgentOpen;
    enum BRoutineOpen; enum BUrgentOpen;
  }
  // @trace TYPE-STATE-01
  enum def DemandUpdate { enum NoChange; enum ACCEPTED; enum CLEARED; enum DUPLICATE; enum BUSY; }
  // @trace TYPE-STATE-01
  enum def SupplyState { enum CLEAR; enum ORDERED; }
  // @trace TYPE-STATE-01
  enum def SupplyStateCode { enum CLEAR; enum ORDERED; }
  // @trace TYPE-STATE-01
  enum def RecoveryState { enum HEALTHY; enum LATCHED; enum RECOVERING; }
  // @trace TYPE-STATE-01
  enum def RecoveryStateCode { enum HEALTHY; enum LATCHED; enum RECOVERING; }
  // @trace TYPE-EVT-01
  enum def EventClass { enum NoEvent; enum FAILURE; enum SUCCESS; }
  // @trace TYPE-EVT-01
  enum def QualifiedEvent {
    enum NoProgress; enum OrderRegistered; enum ReceiptConfirmed;
    enum HandoffConfirmed; enum FAULT;
  }
  // @trace TYPE-GATE-01
  enum def FaultTrigger { enum INACTIVE; enum ACTIVE; }
  // @trace TYPE-GATE-01
  enum def RecoveryGate { enum OPEN; enum CLOSED; }
  // @trace TYPE-GATE-01
  enum def EmergencyState { enum INACTIVE; enum ACTIVE; }
  // @trace TYPE-FACT-01
  enum def MaterialClass { enum NONE; enum A; enum B; }
  // @trace TYPE-DEC-01
  enum def ProposalState { enum NotProposed; enum PROPOSED; }

  // Record members inspected by GUMBO are attributes, never nested parts.
  // @trace TYPE-FACT-01
  part def DemandBoundaryFacts :> Data {
    // @trace PART-01
    attribute present : Base_Types::Boolean;
    // @trace MON-DEM-01
    attribute demandValue : DemandCode;
  }
  // @trace TYPE-FACT-01
  part def DemandFacts :> Data {
    // @trace PART-04
    attribute present : Base_Types::Boolean;
    // @trace PART-04
    attribute valid : Base_Types::Boolean;
    // @trace PART-04
    attribute urgent : Base_Types::Boolean;
    // @trace PART-04
    attribute materialClass : MaterialClass;
    // @trace MON-DEM-01
    attribute demandValue : DemandCode;
  }
  // @trace TYPE-FACT-01
  part def InventoryBoundaryFacts :> Data {
    // @trace MON-INV-01
    attribute band : InventoryBandCode;
    // @trace PART-02
    attribute usable : Base_Types::Boolean;
  }
  // @trace REL-EVT-01
  part def EventBoundaryFacts :> Data {
    // @trace MON-EVT-01
    attribute materialEvent : MaterialEventCode;
    // @trace PART-03
    attribute eventClass : EventClass;
  }
  // @trace TYPE-FACT-01
  part def MaterialReadinessFacts :> Data {
    // @trace MON-INV-01
    attribute band : InventoryBandCode;
    // @trace PART-05
    attribute usable : Base_Types::Boolean;
    // @trace PART-05
    attribute materialAvailable : Base_Types::Boolean;
    // @trace PART-05
    attribute reserveLow : Base_Types::Boolean;
    // @trace PART-05
    attribute replenishmentNeeded : Base_Types::Boolean;
    // @trace PART-05
    attribute productionEvidenceUsable : Base_Types::Boolean;
    // @trace PART-05
    attribute productionAccepting : Base_Types::Boolean;
  }
  // @trace REL-DISP-01
  part def DemandTransition :> Data {
    // @trace TYPE-STATE-01
    attribute demandPhase : DemandStateCode;
    // @trace TYPE-STATE-01
    attribute demandUpdate : DemandUpdate;
    // @trace TYPE-DISP-01
    attribute demandDisposition : DemandDisposition;
  }
  // @trace TYPE-DEC-01
  part def Decision :> Data {
    // @trace TYPE-ACT-01
    attribute actionValue : MaterialAction;
    // @trace TYPE-CAUSE-01
    attribute cause : DecisionCause;
  }
  // @trace CTRL-RES-01
  part def MaterialCoordinationResult :> Data {
    // @trace TYPE-ACT-01
    attribute actionValue : MaterialAction;
    // @trace TYPE-CAUSE-01
    attribute cause : DecisionCause;
    // @trace TYPE-MODE-01
    attribute mode : CoordinationMode;
    // @trace TYPE-STATE-01
    attribute demandPhase : DemandStateCode;
    // @trace TYPE-STATE-01
    attribute supplyPhase : SupplyStateCode;
    // @trace TYPE-STATE-01
    attribute recoveryPhase : RecoveryStateCode;
    // @trace TYPE-DISP-01
    attribute demandDisposition : DemandDisposition;
  }

  // @trace PART-01
  part def DemandAcquisition :> Thread {
    // @trace INT-01
    port demand_signal : DataPort { in :>> type : DemandSignal; }
    // @trace INT-08
    port demand_boundary_facts : DataPort { out :>> type : DemandBoundaryFacts; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_NO_DEMAND:
          demand_boundary_facts.present == F &
          demand_boundary_facts.demandValue == DemandCode.NONE;
      compute
        // @trace REL-DEM-01
        guarantee DEMAND_PRESENCE_CLASSIFICATION:
          (demand_boundary_facts.present == (demand_signal != DemandSignal.NONE)) &
          ((demand_signal == DemandSignal.NONE & demand_boundary_facts.demandValue == DemandCode.NONE) |
           (demand_signal == DemandSignal.INVALID & demand_boundary_facts.demandValue == DemandCode.INVALID) |
           (demand_signal == DemandSignal.ARoutine & demand_boundary_facts.demandValue == DemandCode.ARoutine) |
           (demand_signal == DemandSignal.AUrgent & demand_boundary_facts.demandValue == DemandCode.AUrgent) |
           (demand_signal == DemandSignal.BRoutine & demand_boundary_facts.demandValue == DemandCode.BRoutine) |
           (demand_signal == DemandSignal.BUrgent & demand_boundary_facts.demandValue == DemandCode.BUrgent));
    }*/
  }
  // @trace PART-02
  part def InventoryAcquisition :> Thread {
    // @trace INT-02
    port inventory_band : DataPort { in :>> type : InventoryBand; }
    // @trace INT-09
    port inventory_boundary_facts : DataPort { out :>> type : InventoryBoundaryFacts; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_INVENTORY_UNUSABLE:
          inventory_boundary_facts.band == InventoryBandCode.INVALID &
          inventory_boundary_facts.usable == F;
      compute
        // @trace REL-INV-01
        guarantee INVENTORY_USABILITY_CLASSIFICATION:
          ((inventory_band == InventoryBand.INVALID & inventory_boundary_facts.band == InventoryBandCode.INVALID) |
           (inventory_band == InventoryBand.EMPTY & inventory_boundary_facts.band == InventoryBandCode.EMPTY) |
           (inventory_band == InventoryBand.LOW & inventory_boundary_facts.band == InventoryBandCode.LOW) |
           (inventory_band == InventoryBand.READY & inventory_boundary_facts.band == InventoryBandCode.READY)) &
          (inventory_boundary_facts.usable == (inventory_band != InventoryBand.INVALID));
    }*/
  }
  // @trace PART-03
  part def EventAcquisition :> Thread {
    // @trace INT-03
    port material_event : DataPort { in :>> type : MaterialEvent; }
    // @trace INT-10
    port event_boundary_facts : DataPort { out :>> type : EventBoundaryFacts; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_NO_EVENT:
          event_boundary_facts.materialEvent == MaterialEventCode.NONE &
          event_boundary_facts.eventClass == EventClass.NoEvent;
      compute
        // @trace REL-EVT-01
        guarantee EVENT_CLASSIFICATION:
          ((material_event == MaterialEvent.NONE &
            event_boundary_facts.materialEvent == MaterialEventCode.NONE &
            event_boundary_facts.eventClass == EventClass.NoEvent) |
           (material_event == MaterialEvent.FAILED &
            event_boundary_facts.materialEvent == MaterialEventCode.FAILED &
            event_boundary_facts.eventClass == EventClass.FAILURE) |
           (material_event == MaterialEvent.OrderAccepted &
            event_boundary_facts.materialEvent == MaterialEventCode.OrderAccepted &
            event_boundary_facts.eventClass == EventClass.SUCCESS) |
           (material_event == MaterialEvent.ReceiptOk &
            event_boundary_facts.materialEvent == MaterialEventCode.ReceiptOk &
            event_boundary_facts.eventClass == EventClass.SUCCESS) |
           (material_event == MaterialEvent.HandoffOk &
            event_boundary_facts.materialEvent == MaterialEventCode.HandoffOk &
            event_boundary_facts.eventClass == EventClass.SUCCESS));
    }*/
  }
  // @trace PART-04
  part def DemandQualification :> Thread {
    // @trace INT-08
    port demand_boundary_facts : DataPort { in :>> type : DemandBoundaryFacts; }
    // @trace INT-22
    port demand_facts : DataPort { out :>> type : DemandFacts; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_DEMAND_FACTS_SAFE:
          demand_facts.demandValue == DemandCode.NONE & demand_facts.present == F &
          demand_facts.valid == F & demand_facts.urgent == F &
          demand_facts.materialClass == MaterialClass.NONE;
      compute
        // @trace REL-DEM-01
        guarantee QUALIFIED_DEMAND_FACTS:
          demand_facts.demandValue == demand_boundary_facts.demandValue &
          demand_facts.present == demand_boundary_facts.present &
          (demand_facts.valid ==
            (demand_boundary_facts.demandValue == DemandCode.ARoutine |
             demand_boundary_facts.demandValue == DemandCode.AUrgent |
             demand_boundary_facts.demandValue == DemandCode.BRoutine |
             demand_boundary_facts.demandValue == DemandCode.BUrgent)) &
          (demand_facts.urgent ==
            (demand_boundary_facts.demandValue == DemandCode.AUrgent |
             demand_boundary_facts.demandValue == DemandCode.BUrgent)) &
          (((demand_boundary_facts.demandValue == DemandCode.ARoutine |
             demand_boundary_facts.demandValue == DemandCode.AUrgent) &
            demand_facts.materialClass == MaterialClass.A) |
           ((demand_boundary_facts.demandValue == DemandCode.BRoutine |
             demand_boundary_facts.demandValue == DemandCode.BUrgent) &
            demand_facts.materialClass == MaterialClass.B) |
           ((demand_boundary_facts.demandValue == DemandCode.NONE |
             demand_boundary_facts.demandValue == DemandCode.INVALID) &
            demand_facts.materialClass == MaterialClass.NONE));
    }*/
  }
  // @trace PART-05
  part def MaterialReadinessAssessment :> Thread {
    // @trace INT-09
    port inventory_boundary_facts : DataPort { in :>> type : InventoryBoundaryFacts; }
    // @trace INT-06
    port production_availability : DataPort { in :>> type : Availability; }
    // @trace INT-26
    port readiness_to_urgent : DataPort { out :>> type : MaterialReadinessFacts; }
    // @trace INT-27
    port readiness_to_routine : DataPort { out :>> type : MaterialReadinessFacts; }
    // @trace INT-28
    port readiness_to_replenishment : DataPort { out :>> type : MaterialReadinessFacts; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_READINESS_SAFE:
          readiness_to_urgent.band == InventoryBandCode.INVALID &
          readiness_to_urgent.usable == F &
          readiness_to_urgent.materialAvailable == F &
          readiness_to_urgent.reserveLow == F &
          readiness_to_urgent.replenishmentNeeded == F &
          readiness_to_urgent.productionEvidenceUsable == F &
          readiness_to_urgent.productionAccepting == F &
          readiness_to_routine.band == readiness_to_urgent.band &
          readiness_to_routine.usable == readiness_to_urgent.usable &
          readiness_to_routine.materialAvailable == readiness_to_urgent.materialAvailable &
          readiness_to_routine.reserveLow == readiness_to_urgent.reserveLow &
          readiness_to_routine.replenishmentNeeded == readiness_to_urgent.replenishmentNeeded &
          readiness_to_routine.productionEvidenceUsable == readiness_to_urgent.productionEvidenceUsable &
          readiness_to_routine.productionAccepting == readiness_to_urgent.productionAccepting &
          readiness_to_replenishment.band == readiness_to_urgent.band &
          readiness_to_replenishment.usable == readiness_to_urgent.usable &
          readiness_to_replenishment.materialAvailable == readiness_to_urgent.materialAvailable &
          readiness_to_replenishment.reserveLow == readiness_to_urgent.reserveLow &
          readiness_to_replenishment.replenishmentNeeded == readiness_to_urgent.replenishmentNeeded &
          readiness_to_replenishment.productionEvidenceUsable == readiness_to_urgent.productionEvidenceUsable &
          readiness_to_replenishment.productionAccepting == readiness_to_urgent.productionAccepting;
      compute
        // @trace REL-INV-01
        guarantee MATERIAL_READINESS_DERIVATION:
          readiness_to_urgent.band == inventory_boundary_facts.band &
          readiness_to_urgent.usable == inventory_boundary_facts.usable &
          (readiness_to_urgent.materialAvailable ==
            (inventory_boundary_facts.usable &
             (inventory_boundary_facts.band == InventoryBandCode.LOW |
              inventory_boundary_facts.band == InventoryBandCode.READY))) &
          (readiness_to_urgent.reserveLow ==
            (inventory_boundary_facts.usable &
             inventory_boundary_facts.band == InventoryBandCode.LOW)) &
          (readiness_to_urgent.replenishmentNeeded ==
            (inventory_boundary_facts.usable &
             (inventory_boundary_facts.band == InventoryBandCode.EMPTY |
              inventory_boundary_facts.band == InventoryBandCode.LOW))) &
          (readiness_to_urgent.productionEvidenceUsable ==
            (production_availability != Availability.INVALID)) &
          (readiness_to_urgent.productionAccepting ==
            (production_availability == Availability.AVAILABLE)) &
          readiness_to_routine.band == readiness_to_urgent.band &
          readiness_to_routine.usable == readiness_to_urgent.usable &
          readiness_to_routine.materialAvailable == readiness_to_urgent.materialAvailable &
          readiness_to_routine.reserveLow == readiness_to_urgent.reserveLow &
          readiness_to_routine.replenishmentNeeded == readiness_to_urgent.replenishmentNeeded &
          readiness_to_routine.productionEvidenceUsable == readiness_to_urgent.productionEvidenceUsable &
          readiness_to_routine.productionAccepting == readiness_to_urgent.productionAccepting &
          readiness_to_replenishment.band == readiness_to_urgent.band &
          readiness_to_replenishment.usable == readiness_to_urgent.usable &
          readiness_to_replenishment.materialAvailable == readiness_to_urgent.materialAvailable &
          readiness_to_replenishment.reserveLow == readiness_to_urgent.reserveLow &
          readiness_to_replenishment.replenishmentNeeded == readiness_to_urgent.replenishmentNeeded &
          readiness_to_replenishment.productionEvidenceUsable == readiness_to_urgent.productionEvidenceUsable &
          readiness_to_replenishment.productionAccepting == readiness_to_urgent.productionAccepting;
    }*/
  }
  // @trace PART-06
  part def EventCoherence :> Thread {
    // @trace INT-10
    port event_boundary_facts : DataPort { in :>> type : EventBoundaryFacts; }
    // @trace INT-11
    port prior_demand_state : DataPort { in :>> type : DemandState; }
    // @trace INT-12
    port prior_supply_state : DataPort { in :>> type : SupplyState; }
    // @trace INT-13
    port qualified_event_to_demand : DataPort { out :>> type : QualifiedEvent; }
    // @trace INT-14
    port qualified_event_to_supply : DataPort { out :>> type : QualifiedEvent; }
    // @trace INT-15
    port fault_trigger : DataPort { out :>> type : FaultTrigger; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_EVENT_COHERENCE_SAFE:
          qualified_event_to_demand == QualifiedEvent.NoProgress &
          qualified_event_to_supply == QualifiedEvent.NoProgress &
          fault_trigger == FaultTrigger.INACTIVE;
      compute
        // @trace REL-EVT-01
        guarantee IDENTICAL_QUALIFIED_EVENT_DELIVERY:
          qualified_event_to_demand == qualified_event_to_supply;
        compute_cases
          // @trace CASE-01
          case CASE_01_NO_EVENT:
            assume event_boundary_facts.eventClass == EventClass.NoEvent &
              event_boundary_facts.materialEvent == MaterialEventCode.NONE;
            guarantee qualified_event_to_demand == QualifiedEvent.NoProgress &
              fault_trigger == FaultTrigger.INACTIVE;
          // @trace CASE-02
          case CASE_02_REPORTED_FAILURE:
            assume event_boundary_facts.eventClass == EventClass.FAILURE &
              event_boundary_facts.materialEvent == MaterialEventCode.FAILED;
            guarantee qualified_event_to_demand == QualifiedEvent.FAULT &
              fault_trigger == FaultTrigger.ACTIVE;
          // @trace CASE-03
          case CASE_03_ORDER_REGISTERED:
            assume event_boundary_facts.eventClass == EventClass.SUCCESS &
              event_boundary_facts.materialEvent == MaterialEventCode.OrderAccepted &
              prior_supply_state == SupplyState.CLEAR;
            guarantee qualified_event_to_demand == QualifiedEvent.OrderRegistered &
              fault_trigger == FaultTrigger.INACTIVE;
          // @trace CASE-04
          case CASE_04_RECEIPT_CONFIRMED:
            assume event_boundary_facts.eventClass == EventClass.SUCCESS &
              event_boundary_facts.materialEvent == MaterialEventCode.ReceiptOk &
              prior_supply_state == SupplyState.ORDERED;
            guarantee qualified_event_to_demand == QualifiedEvent.ReceiptConfirmed &
              fault_trigger == FaultTrigger.INACTIVE;
          // @trace CASE-05
          case CASE_05_HANDOFF_CONFIRMED:
            assume event_boundary_facts.eventClass == EventClass.SUCCESS &
              event_boundary_facts.materialEvent == MaterialEventCode.HandoffOk &
              prior_demand_state != DemandState.IDLE;
            guarantee qualified_event_to_demand == QualifiedEvent.HandoffConfirmed &
              fault_trigger == FaultTrigger.INACTIVE;
          // @trace CASE-06
          case CASE_06_INCOHERENT_EVENT:
            assume not
              ((event_boundary_facts.eventClass == EventClass.NoEvent &
                event_boundary_facts.materialEvent == MaterialEventCode.NONE) |
               (event_boundary_facts.eventClass == EventClass.FAILURE &
                event_boundary_facts.materialEvent == MaterialEventCode.FAILED) |
               (event_boundary_facts.eventClass == EventClass.SUCCESS &
                event_boundary_facts.materialEvent == MaterialEventCode.OrderAccepted &
                prior_supply_state == SupplyState.CLEAR) |
               (event_boundary_facts.eventClass == EventClass.SUCCESS &
                event_boundary_facts.materialEvent == MaterialEventCode.ReceiptOk &
                prior_supply_state == SupplyState.ORDERED) |
               (event_boundary_facts.eventClass == EventClass.SUCCESS &
                event_boundary_facts.materialEvent == MaterialEventCode.HandoffOk &
                prior_demand_state != DemandState.IDLE));
            guarantee qualified_event_to_demand == QualifiedEvent.FAULT &
              fault_trigger == FaultTrigger.ACTIVE;
    }*/
  }
  // @trace PART-07
  part def DemandRegistry :> Thread {
    // @trace INT-22
    port demand_facts : DataPort { in :>> type : DemandFacts; }
    // @trace INT-13
    port qualified_event : DataPort { in :>> type : QualifiedEvent; }
    // @trace INT-16
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    // @trace INT-11
    port prior_demand_state : DataPort { out :>> type : DemandState; }
    // @trace INT-23
    port current_state_to_urgent : DataPort { out :>> type : DemandStateView; }
    // @trace INT-24
    port current_state_to_routine : DataPort { out :>> type : DemandStateView; }
    // @trace INT-25
    port demand_transition : DataPort { out :>> type : DemandTransition; }

    language "GUMBO" /*{
      state
        // @trace PART-07
        demandPhaseMemory: DemandState;
      initialize
        modifies demandPhaseMemory;
        // @trace ASM-INIT-01
        guarantee INITIAL_DEMAND_STATE:
          demandPhaseMemory == DemandState.IDLE &
          prior_demand_state == DemandState.IDLE &
          current_state_to_urgent == DemandStateView.IDLE &
          current_state_to_routine == DemandStateView.IDLE &
          demand_transition.demandPhase == DemandStateCode.IDLE &
          demand_transition.demandUpdate == DemandUpdate.NoChange &
          demand_transition.demandDisposition == DemandDisposition.NoRequest;
      compute
        modifies demandPhaseMemory;
        // @trace REL-STATE-01
        guarantee DEMAND_PRIOR_AND_CURRENT_VIEWS:
          prior_demand_state == In(demandPhaseMemory) &
          current_state_to_urgent == current_state_to_routine &
          ((demandPhaseMemory == DemandState.IDLE &
            current_state_to_urgent == DemandStateView.IDLE &
            demand_transition.demandPhase == DemandStateCode.IDLE) |
           (demandPhaseMemory == DemandState.ARoutineOpen &
            current_state_to_urgent == DemandStateView.ARoutineOpen &
            demand_transition.demandPhase == DemandStateCode.ARoutineOpen) |
           (demandPhaseMemory == DemandState.AUrgentOpen &
            current_state_to_urgent == DemandStateView.AUrgentOpen &
            demand_transition.demandPhase == DemandStateCode.AUrgentOpen) |
           (demandPhaseMemory == DemandState.BRoutineOpen &
            current_state_to_urgent == DemandStateView.BRoutineOpen &
            demand_transition.demandPhase == DemandStateCode.BRoutineOpen) |
           (demandPhaseMemory == DemandState.BUrgentOpen &
            current_state_to_urgent == DemandStateView.BUrgentOpen &
            demand_transition.demandPhase == DemandStateCode.BUrgentOpen));
        // @trace REL-DISP-01
        guarantee CURRENT_DEMAND_DISPOSITION:
          ((demand_facts.demandValue == DemandCode.NONE &
            demand_transition.demandDisposition == DemandDisposition.NoRequest) |
           (demand_facts.demandValue == DemandCode.INVALID &
            demand_transition.demandDisposition == DemandDisposition.REJECTED) |
           (demand_facts.valid & demand_transition.demandUpdate == DemandUpdate.ACCEPTED &
            demand_transition.demandDisposition == DemandDisposition.ACCEPTED) |
           (demand_facts.valid & demand_transition.demandUpdate == DemandUpdate.DUPLICATE &
            demand_transition.demandDisposition == DemandDisposition.RetainedDuplicate) |
           (demand_facts.valid &
            demand_transition.demandUpdate != DemandUpdate.ACCEPTED &
            demand_transition.demandUpdate != DemandUpdate.DUPLICATE &
            demand_transition.demandDisposition == DemandDisposition.DEFERRED));
        compute_cases
          // @trace CASE-13
          case CASE_13_CLOSED_GATE_FREEZE:
            assume recovery_gate == RecoveryGate.CLOSED;
            guarantee demandPhaseMemory == In(demandPhaseMemory) &
              demand_transition.demandUpdate == DemandUpdate.NoChange;
          // @trace CASE-14
          case CASE_14_HANDOFF_CLEAR:
            assume recovery_gate == RecoveryGate.OPEN &
              qualified_event == QualifiedEvent.HandoffConfirmed;
            guarantee demandPhaseMemory == DemandState.IDLE &
              demand_transition.demandUpdate == DemandUpdate.CLEARED;
          // @trace CASE-15
          case CASE_15_ACCEPT_IDLE_DEMAND:
            assume recovery_gate == RecoveryGate.OPEN &
              qualified_event != QualifiedEvent.HandoffConfirmed &
              In(demandPhaseMemory) == DemandState.IDLE & demand_facts.valid;
            guarantee demand_transition.demandUpdate == DemandUpdate.ACCEPTED &
              ((demand_facts.demandValue == DemandCode.ARoutine &
                demandPhaseMemory == DemandState.ARoutineOpen) |
               (demand_facts.demandValue == DemandCode.AUrgent &
                demandPhaseMemory == DemandState.AUrgentOpen) |
               (demand_facts.demandValue == DemandCode.BRoutine &
                demandPhaseMemory == DemandState.BRoutineOpen) |
               (demand_facts.demandValue == DemandCode.BUrgent &
                demandPhaseMemory == DemandState.BUrgentOpen));
          // @trace CASE-16
          case CASE_16_RETAIN_OR_CLASSIFY_BUSY:
            assume recovery_gate == RecoveryGate.OPEN &
              qualified_event != QualifiedEvent.HandoffConfirmed &
              (In(demandPhaseMemory) != DemandState.IDLE | demand_facts.valid == F);
            guarantee demandPhaseMemory == In(demandPhaseMemory) &
              (((demand_facts.demandValue == DemandCode.NONE |
                 demand_facts.demandValue == DemandCode.INVALID) &
                demand_transition.demandUpdate == DemandUpdate.NoChange) |
               (demand_facts.valid &
                ((demand_facts.demandValue == DemandCode.ARoutine &
                  In(demandPhaseMemory) == DemandState.ARoutineOpen) |
                 (demand_facts.demandValue == DemandCode.AUrgent &
                  In(demandPhaseMemory) == DemandState.AUrgentOpen) |
                 (demand_facts.demandValue == DemandCode.BRoutine &
                  In(demandPhaseMemory) == DemandState.BRoutineOpen) |
                 (demand_facts.demandValue == DemandCode.BUrgent &
                  In(demandPhaseMemory) == DemandState.BUrgentOpen)) &
                demand_transition.demandUpdate == DemandUpdate.DUPLICATE) |
               (demand_facts.valid &
                not ((demand_facts.demandValue == DemandCode.ARoutine &
                      In(demandPhaseMemory) == DemandState.ARoutineOpen) |
                     (demand_facts.demandValue == DemandCode.AUrgent &
                      In(demandPhaseMemory) == DemandState.AUrgentOpen) |
                     (demand_facts.demandValue == DemandCode.BRoutine &
                      In(demandPhaseMemory) == DemandState.BRoutineOpen) |
                     (demand_facts.demandValue == DemandCode.BUrgent &
                      In(demandPhaseMemory) == DemandState.BUrgentOpen)) &
                demand_transition.demandUpdate == DemandUpdate.BUSY));
    }*/
  }
  // @trace PART-08
  part def SupplyLifecycle :> Thread {
    // @trace INT-14
    port qualified_event : DataPort { in :>> type : QualifiedEvent; }
    // @trace INT-17
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    // @trace INT-12
    port prior_supply_state : DataPort { out :>> type : SupplyState; }
    // @trace INT-29
    port current_state_to_replenishment : DataPort { out :>> type : SupplyState; }
    // @trace INT-30
    port current_state_to_composition : DataPort { out :>> type : SupplyState; }

    language "GUMBO" /*{
      state
        // @trace PART-08
        supplyPhaseMemory: SupplyState;
      initialize
        modifies supplyPhaseMemory;
        // @trace ASM-INIT-01
        guarantee INITIAL_SUPPLY_STATE:
          supplyPhaseMemory == SupplyState.CLEAR &
          prior_supply_state == SupplyState.CLEAR &
          current_state_to_replenishment == SupplyState.CLEAR &
          current_state_to_composition == SupplyState.CLEAR;
      compute
        modifies supplyPhaseMemory;
        // @trace REL-STATE-01
        guarantee SUPPLY_PRIOR_AND_CURRENT_VIEWS:
          prior_supply_state == In(supplyPhaseMemory) &
          current_state_to_replenishment == supplyPhaseMemory &
          current_state_to_composition == supplyPhaseMemory;
        compute_cases
          // @trace CASE-17
          case CASE_17_SUPPLY_PROGRESS:
            assume recovery_gate == RecoveryGate.OPEN &
              (qualified_event == QualifiedEvent.OrderRegistered |
               qualified_event == QualifiedEvent.ReceiptConfirmed);
            guarantee
              ((qualified_event == QualifiedEvent.OrderRegistered &
                supplyPhaseMemory == SupplyState.ORDERED) |
               (qualified_event == QualifiedEvent.ReceiptConfirmed &
                supplyPhaseMemory == SupplyState.CLEAR));
          // @trace CASE-18
          case CASE_18_SUPPLY_STUTTER:
            assume recovery_gate == RecoveryGate.CLOSED |
              (qualified_event != QualifiedEvent.OrderRegistered &
               qualified_event != QualifiedEvent.ReceiptConfirmed);
            guarantee supplyPhaseMemory == In(supplyPhaseMemory);
    }*/
  }
  // @trace PART-09
  part def RecoverySupervisor :> Thread {
    // @trace INT-04
    port recovery_event : DataPort { in :>> type : RecoveryEvent; }
    // @trace INT-15
    port fault_trigger : DataPort { in :>> type : FaultTrigger; }
    // @trace INT-16
    port gate_to_demand : DataPort { out :>> type : RecoveryGate; }
    // @trace INT-17
    port gate_to_supply : DataPort { out :>> type : RecoveryGate; }
    // @trace INT-18
    port gate_to_urgent : DataPort { out :>> type : RecoveryGate; }
    // @trace INT-19
    port gate_to_routine : DataPort { out :>> type : RecoveryGate; }
    // @trace INT-20
    port gate_to_replenishment : DataPort { out :>> type : RecoveryGate; }
    // @trace INT-21
    port emergency_state : DataPort { out :>> type : EmergencyState; }
    // @trace INT-35
    port recovery_state : DataPort { out :>> type : RecoveryState; }

    language "GUMBO" /*{
      state
        // @trace PART-09
        recoveryPhaseMemory: RecoveryState;
      initialize
        modifies recoveryPhaseMemory;
        // @trace ASM-INIT-01
        guarantee INITIAL_RECOVERY_HEALTHY:
          recoveryPhaseMemory == RecoveryState.HEALTHY &
          gate_to_demand == RecoveryGate.OPEN & gate_to_supply == RecoveryGate.OPEN &
          gate_to_urgent == RecoveryGate.OPEN & gate_to_routine == RecoveryGate.OPEN &
          gate_to_replenishment == RecoveryGate.OPEN &
          emergency_state == EmergencyState.INACTIVE &
          recovery_state == RecoveryState.HEALTHY;
      compute
        modifies recoveryPhaseMemory;
        // @trace REL-STATE-01
        guarantee RECOVERY_DERIVED_OUTPUTS:
          recovery_state == recoveryPhaseMemory &
          ((recoveryPhaseMemory == RecoveryState.HEALTHY & gate_to_demand == RecoveryGate.OPEN) |
           (recoveryPhaseMemory != RecoveryState.HEALTHY & gate_to_demand == RecoveryGate.CLOSED)) &
          gate_to_supply == gate_to_demand & gate_to_urgent == gate_to_demand &
          gate_to_routine == gate_to_demand & gate_to_replenishment == gate_to_demand &
          ((recoveryPhaseMemory == RecoveryState.HEALTHY & emergency_state == EmergencyState.INACTIVE) |
           (recoveryPhaseMemory != RecoveryState.HEALTHY & emergency_state == EmergencyState.ACTIVE));
        compute_cases
          // @trace CASE-07
          case CASE_07_FAULT_DOMINATES:
            assume fault_trigger == FaultTrigger.ACTIVE;
            guarantee recoveryPhaseMemory == RecoveryState.LATCHED;
          // @trace CASE-08
          case CASE_08_HEALTHY_STUTTER:
            assume fault_trigger == FaultTrigger.INACTIVE &
              In(recoveryPhaseMemory) == RecoveryState.HEALTHY;
            guarantee recoveryPhaseMemory == RecoveryState.HEALTHY;
          // @trace CASE-09
          case CASE_09_RESET_TO_RECOVERING:
            assume fault_trigger == FaultTrigger.INACTIVE &
              In(recoveryPhaseMemory) == RecoveryState.LATCHED &
              recovery_event == RecoveryEvent.RESET;
            guarantee recoveryPhaseMemory == RecoveryState.RECOVERING;
          // @trace CASE-10
          case CASE_10_LATCHED_RETENTION:
            assume fault_trigger == FaultTrigger.INACTIVE &
              In(recoveryPhaseMemory) == RecoveryState.LATCHED &
              recovery_event != RecoveryEvent.RESET;
            guarantee recoveryPhaseMemory == RecoveryState.LATCHED;
          // @trace CASE-11
          case CASE_11_VERIFICATION_RELEASE:
            assume fault_trigger == FaultTrigger.INACTIVE &
              In(recoveryPhaseMemory) == RecoveryState.RECOVERING &
              recovery_event == RecoveryEvent.VerifyOk;
            guarantee recoveryPhaseMemory == RecoveryState.HEALTHY;
          // @trace CASE-12
          case CASE_12_RECOVERING_RETENTION:
            assume fault_trigger == FaultTrigger.INACTIVE &
              In(recoveryPhaseMemory) == RecoveryState.RECOVERING &
              recovery_event != RecoveryEvent.VerifyOk;
            guarantee recoveryPhaseMemory == RecoveryState.RECOVERING;
    }*/
  }
  // @trace PART-10
  part def UrgentReleaseEligibility :> Thread {
    // @trace INT-23
    port demand_state : DataPort { in :>> type : DemandStateView; }
    // @trace INT-26
    port material_readiness_facts : DataPort { in :>> type : MaterialReadinessFacts; }
    // @trace INT-18
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    // @trace INT-31
    port proposal : DataPort { out :>> type : ProposalState; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_URGENT_NOT_PROPOSED: proposal == ProposalState.NotProposed;
      compute
        compute_cases
          // @trace CASE-19
          case CASE_19_URGENT_PROPOSED:
            assume recovery_gate == RecoveryGate.OPEN &
              (demand_state == DemandStateView.AUrgentOpen |
               demand_state == DemandStateView.BUrgentOpen) &
              material_readiness_facts.materialAvailable &
              material_readiness_facts.productionEvidenceUsable &
              material_readiness_facts.productionAccepting;
            guarantee proposal == ProposalState.PROPOSED;
          // @trace CASE-20
          case CASE_20_URGENT_NOT_PROPOSED:
            assume not
              (recovery_gate == RecoveryGate.OPEN &
               (demand_state == DemandStateView.AUrgentOpen |
                demand_state == DemandStateView.BUrgentOpen) &
               material_readiness_facts.materialAvailable &
               material_readiness_facts.productionEvidenceUsable &
               material_readiness_facts.productionAccepting);
            guarantee proposal == ProposalState.NotProposed;
    }*/
  }
  // @trace PART-11
  part def RoutineReleaseEligibility :> Thread {
    // @trace INT-24
    port demand_state : DataPort { in :>> type : DemandStateView; }
    // @trace INT-27
    port material_readiness_facts : DataPort { in :>> type : MaterialReadinessFacts; }
    // @trace INT-19
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    // @trace INT-32
    port proposal : DataPort { out :>> type : ProposalState; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_ROUTINE_NOT_PROPOSED: proposal == ProposalState.NotProposed;
      compute
        compute_cases
          // @trace CASE-21
          case CASE_21_ROUTINE_PROPOSED:
            assume recovery_gate == RecoveryGate.OPEN &
              (demand_state == DemandStateView.ARoutineOpen |
               demand_state == DemandStateView.BRoutineOpen) &
              material_readiness_facts.materialAvailable &
              material_readiness_facts.productionEvidenceUsable &
              material_readiness_facts.productionAccepting;
            guarantee proposal == ProposalState.PROPOSED;
          // @trace CASE-22
          case CASE_22_ROUTINE_NOT_PROPOSED:
            assume not
              (recovery_gate == RecoveryGate.OPEN &
               (demand_state == DemandStateView.ARoutineOpen |
                demand_state == DemandStateView.BRoutineOpen) &
               material_readiness_facts.materialAvailable &
               material_readiness_facts.productionEvidenceUsable &
               material_readiness_facts.productionAccepting);
            guarantee proposal == ProposalState.NotProposed;
    }*/
  }
  // @trace PART-12
  part def ReplenishmentEligibility :> Thread {
    // @trace INT-28
    port material_readiness_facts : DataPort { in :>> type : MaterialReadinessFacts; }
    // @trace INT-29
    port supply_state : DataPort { in :>> type : SupplyState; }
    // @trace INT-05
    port supplier_availability : DataPort { in :>> type : Availability; }
    // @trace INT-20
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    // @trace INT-33
    port proposal : DataPort { out :>> type : ProposalState; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_REPLENISHMENT_NOT_PROPOSED: proposal == ProposalState.NotProposed;
      compute
        compute_cases
          // @trace CASE-23
          case CASE_23_REPLENISHMENT_PROPOSED:
            assume recovery_gate == RecoveryGate.OPEN &
              material_readiness_facts.replenishmentNeeded &
              supply_state == SupplyState.CLEAR &
              supplier_availability == Availability.AVAILABLE;
            guarantee proposal == ProposalState.PROPOSED;
          // @trace CASE-24
          case CASE_24_REPLENISHMENT_NOT_PROPOSED:
            assume not
              (recovery_gate == RecoveryGate.OPEN &
               material_readiness_facts.replenishmentNeeded &
               supply_state == SupplyState.CLEAR &
               supplier_availability == Availability.AVAILABLE);
            guarantee proposal == ProposalState.NotProposed;
    }*/
  }
  // @trace PART-13
  part def MaterialActionArbitration :> Thread {
    // @trace INT-21
    port emergency_state : DataPort { in :>> type : EmergencyState; }
    // @trace INT-31
    port urgent_proposal : DataPort { in :>> type : ProposalState; }
    // @trace INT-32
    port routine_proposal : DataPort { in :>> type : ProposalState; }
    // @trace INT-33
    port replenishment_proposal : DataPort { in :>> type : ProposalState; }
    // @trace INT-34
    port decision : DataPort { out :>> type : Decision; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_HOLD_DECISION:
          decision.actionValue == MaterialAction.HOLD &
          decision.cause == DecisionCause.NoEligibleWork;
      compute
        compute_cases
          // @trace CASE-25
          case CASE_25_EMERGENCY_HOLD:
            assume emergency_state == EmergencyState.ACTIVE;
            guarantee decision.actionValue == MaterialAction.HOLD &
              decision.cause == DecisionCause.FaultOrRecovery;
          // @trace CASE-26
          case CASE_26_URGENT_PRIORITY:
            assume emergency_state == EmergencyState.INACTIVE &
              urgent_proposal == ProposalState.PROPOSED;
            guarantee decision.actionValue == MaterialAction.ReleaseUrgentMaterial &
              decision.cause == DecisionCause.UrgentDemand;
          // @trace CASE-27
          case CASE_27_REPLENISHMENT_PRIORITY:
            assume emergency_state == EmergencyState.INACTIVE &
              urgent_proposal == ProposalState.NotProposed &
              replenishment_proposal == ProposalState.PROPOSED;
            guarantee decision.actionValue == MaterialAction.IssueMaterialOrder &
              decision.cause == DecisionCause.ReserveReplenishment;
          // @trace CASE-28
          case CASE_28_ROUTINE_PRIORITY:
            assume emergency_state == EmergencyState.INACTIVE &
              urgent_proposal == ProposalState.NotProposed &
              replenishment_proposal == ProposalState.NotProposed &
              routine_proposal == ProposalState.PROPOSED;
            guarantee decision.actionValue == MaterialAction.ReleaseRoutineMaterial &
              decision.cause == DecisionCause.RoutineDemand;
          // @trace CASE-29
          case CASE_29_NO_ELIGIBLE_WORK:
            assume emergency_state == EmergencyState.INACTIVE &
              urgent_proposal == ProposalState.NotProposed &
              replenishment_proposal == ProposalState.NotProposed &
              routine_proposal == ProposalState.NotProposed;
            guarantee decision.actionValue == MaterialAction.HOLD &
              decision.cause == DecisionCause.NoEligibleWork;
    }*/
  }
  // @trace PART-14
  part def ResultComposition :> Thread {
    // @trace INT-25
    port demand_transition : DataPort { in :>> type : DemandTransition; }
    // @trace INT-30
    port supply_state : DataPort { in :>> type : SupplyState; }
    // @trace INT-34
    port decision : DataPort { in :>> type : Decision; }
    // @trace INT-35
    port recovery_state : DataPort { in :>> type : RecoveryState; }
    // @trace INT-07
    port material_coordination_result : DataPort { out :>> type : MaterialCoordinationResult; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_PUBLIC_RESULT_SAFE:
          material_coordination_result.actionValue == MaterialAction.HOLD &
          material_coordination_result.cause == DecisionCause.NoEligibleWork &
          material_coordination_result.mode == CoordinationMode.HOLDING &
          material_coordination_result.demandPhase == DemandStateCode.IDLE &
          material_coordination_result.supplyPhase == SupplyStateCode.CLEAR &
          material_coordination_result.recoveryPhase == RecoveryStateCode.HEALTHY &
          material_coordination_result.demandDisposition == DemandDisposition.NoRequest;
      compute
        // @trace REL-COMP-01
        guarantee ATOMIC_RECEIVED_RESULT_COMPOSITION:
          material_coordination_result.actionValue == decision.actionValue &
          material_coordination_result.cause == decision.cause &
          material_coordination_result.demandPhase == demand_transition.demandPhase &
          ((supply_state == SupplyState.CLEAR &
            material_coordination_result.supplyPhase == SupplyStateCode.CLEAR) |
           (supply_state == SupplyState.ORDERED &
            material_coordination_result.supplyPhase == SupplyStateCode.ORDERED)) &
          ((recovery_state == RecoveryState.HEALTHY &
            material_coordination_result.recoveryPhase == RecoveryStateCode.HEALTHY) |
           (recovery_state == RecoveryState.LATCHED &
            material_coordination_result.recoveryPhase == RecoveryStateCode.LATCHED) |
           (recovery_state == RecoveryState.RECOVERING &
            material_coordination_result.recoveryPhase == RecoveryStateCode.RECOVERING)) &
          material_coordination_result.demandDisposition == demand_transition.demandDisposition &
          ((recovery_state != RecoveryState.HEALTHY &
            material_coordination_result.mode == CoordinationMode.FAULT) |
           (recovery_state == RecoveryState.HEALTHY &
            decision.actionValue == MaterialAction.IssueMaterialOrder &
            material_coordination_result.mode == CoordinationMode.ORDERING) |
           (recovery_state == RecoveryState.HEALTHY &
            (decision.actionValue == MaterialAction.ReleaseUrgentMaterial |
             decision.actionValue == MaterialAction.ReleaseRoutineMaterial) &
            material_coordination_result.mode == CoordinationMode.RELEASING) |
           (recovery_state == RecoveryState.HEALTHY &
            decision.actionValue == MaterialAction.HOLD &
            material_coordination_result.mode == CoordinationMode.HOLDING));
    }*/
  }

  // @generated-support Behavior-free containment and seven transparent boundary delegations.
  part def MaterialContinuityProcess :> Process {
    // @generated-support Transparent Process endpoint for INT-01.
    port demand_signal : DataPort { in :>> type : DemandSignal; }
    // @generated-support Transparent Process endpoint for INT-02.
    port inventory_band : DataPort { in :>> type : InventoryBand; }
    // @generated-support Transparent Process endpoint for INT-05.
    port supplier_availability : DataPort { in :>> type : Availability; }
    // @generated-support Transparent Process endpoint for INT-06.
    port production_availability : DataPort { in :>> type : Availability; }
    // @generated-support Transparent Process endpoint for INT-03.
    port material_event : DataPort { in :>> type : MaterialEvent; }
    // @generated-support Transparent Process endpoint for INT-04.
    port recovery_event : DataPort { in :>> type : RecoveryEvent; }
    // @generated-support Transparent Process endpoint for INT-07.
    port material_coordination_result : DataPort { out :>> type : MaterialCoordinationResult; }

    // @trace PART-01
    part demand_acquisition : DemandAcquisition;
    // @trace PART-02
    part inventory_acquisition : InventoryAcquisition;
    // @trace PART-03
    part event_acquisition : EventAcquisition;
    // @trace PART-04
    part demand_qualification : DemandQualification;
    // @trace PART-05
    part material_readiness_assessment : MaterialReadinessAssessment;
    // @trace PART-06
    part event_coherence : EventCoherence;
    // @trace PART-07
    part demand_registry : DemandRegistry;
    // @trace PART-08
    part supply_lifecycle : SupplyLifecycle;
    // @trace PART-09
    part recovery_supervisor : RecoverySupervisor;
    // @trace PART-10
    part urgent_release_eligibility : UrgentReleaseEligibility;
    // @trace PART-11
    part routine_release_eligibility : RoutineReleaseEligibility;
    // @trace PART-12
    part replenishment_eligibility : ReplenishmentEligibility;
    // @trace PART-13
    part material_action_arbitration : MaterialActionArbitration;
    // @trace PART-14
    part result_composition : ResultComposition;

    // @trace INT-01
    connection int01 : PortConnection connect demand_signal to demand_acquisition.demand_signal;
    // @trace INT-02
    connection int02 : PortConnection connect inventory_band to inventory_acquisition.inventory_band;
    // @trace INT-03
    connection int03 : PortConnection connect material_event to event_acquisition.material_event;
    // @trace INT-04
    connection int04 : PortConnection connect recovery_event to recovery_supervisor.recovery_event;
    // @trace INT-05
    connection int05 : PortConnection connect supplier_availability to replenishment_eligibility.supplier_availability;
    // @trace INT-06
    connection int06 : PortConnection connect production_availability to material_readiness_assessment.production_availability;
    // @trace INT-07
    connection int07 : PortConnection connect result_composition.material_coordination_result to material_coordination_result;
    // @trace INT-08
    connection int08 : PortConnection connect demand_acquisition.demand_boundary_facts to demand_qualification.demand_boundary_facts;
    // @trace INT-09
    connection int09 : PortConnection connect inventory_acquisition.inventory_boundary_facts to material_readiness_assessment.inventory_boundary_facts;
    // @trace INT-10
    connection int10 : PortConnection connect event_acquisition.event_boundary_facts to event_coherence.event_boundary_facts;
    // @trace INT-11
    connection int11 : PortConnection connect demand_registry.prior_demand_state to event_coherence.prior_demand_state;
    // @trace INT-12
    connection int12 : PortConnection connect supply_lifecycle.prior_supply_state to event_coherence.prior_supply_state;
    // @trace INT-13
    connection int13 : PortConnection connect event_coherence.qualified_event_to_demand to demand_registry.qualified_event;
    // @trace INT-14
    connection int14 : PortConnection connect event_coherence.qualified_event_to_supply to supply_lifecycle.qualified_event;
    // @trace INT-15
    connection int15 : PortConnection connect event_coherence.fault_trigger to recovery_supervisor.fault_trigger;
    // @trace INT-16
    connection int16 : PortConnection connect recovery_supervisor.gate_to_demand to demand_registry.recovery_gate;
    // @trace INT-17
    connection int17 : PortConnection connect recovery_supervisor.gate_to_supply to supply_lifecycle.recovery_gate;
    // @trace INT-18
    connection int18 : PortConnection connect recovery_supervisor.gate_to_urgent to urgent_release_eligibility.recovery_gate;
    // @trace INT-19
    connection int19 : PortConnection connect recovery_supervisor.gate_to_routine to routine_release_eligibility.recovery_gate;
    // @trace INT-20
    connection int20 : PortConnection connect recovery_supervisor.gate_to_replenishment to replenishment_eligibility.recovery_gate;
    // @trace INT-21
    connection int21 : PortConnection connect recovery_supervisor.emergency_state to material_action_arbitration.emergency_state;
    // @trace INT-22
    connection int22 : PortConnection connect demand_qualification.demand_facts to demand_registry.demand_facts;
    // @trace INT-23
    connection int23 : PortConnection connect demand_registry.current_state_to_urgent to urgent_release_eligibility.demand_state;
    // @trace INT-24
    connection int24 : PortConnection connect demand_registry.current_state_to_routine to routine_release_eligibility.demand_state;
    // @trace INT-25
    connection int25 : PortConnection connect demand_registry.demand_transition to result_composition.demand_transition;
    // @trace INT-26
    connection int26 : PortConnection connect material_readiness_assessment.readiness_to_urgent to urgent_release_eligibility.material_readiness_facts;
    // @trace INT-27
    connection int27 : PortConnection connect material_readiness_assessment.readiness_to_routine to routine_release_eligibility.material_readiness_facts;
    // @trace INT-28
    connection int28 : PortConnection connect material_readiness_assessment.readiness_to_replenishment to replenishment_eligibility.material_readiness_facts;
    // @trace INT-29
    connection int29 : PortConnection connect supply_lifecycle.current_state_to_replenishment to replenishment_eligibility.supply_state;
    // @trace INT-30
    connection int30 : PortConnection connect supply_lifecycle.current_state_to_composition to result_composition.supply_state;
    // @trace INT-31
    connection int31 : PortConnection connect urgent_release_eligibility.proposal to material_action_arbitration.urgent_proposal;
    // @trace INT-32
    connection int32 : PortConnection connect routine_release_eligibility.proposal to material_action_arbitration.routine_proposal;
    // @trace INT-33
    connection int33 : PortConnection connect replenishment_eligibility.proposal to material_action_arbitration.replenishment_proposal;
    // @trace INT-34
    connection int34 : PortConnection connect material_action_arbitration.decision to result_composition.decision;
    // @trace INT-35
    connection int35 : PortConnection connect recovery_supervisor.recovery_state to result_composition.recovery_state;
  }

  // @trace CTRL-RES-01
  part def FactoryMaterialContinuityCoordinatorSystem :> System {
    // @trace MON-DEM-01
    port demand_signal : DataPort { in :>> type : DemandSignal; }
    // @trace MON-INV-01
    port inventory_band : DataPort { in :>> type : InventoryBand; }
    // @trace MON-SUP-01
    port supplier_availability : DataPort { in :>> type : Availability; }
    // @trace MON-PROD-01
    port production_availability : DataPort { in :>> type : Availability; }
    // @trace MON-EVT-01
    port material_event : DataPort { in :>> type : MaterialEvent; }
    // @trace MON-REC-01
    port recovery_event : DataPort { in :>> type : RecoveryEvent; }
    // @trace CTRL-RES-01
    port material_coordination_result : DataPort { out :>> type : MaterialCoordinationResult; }

    // @generated-support Sole behavior-free container authorized by SUPPORT-01.
    part material_continuity_process : MaterialContinuityProcess;

    // @generated-support INT-01 transparent root-to-Process delegation.
    connection support01 : PortConnection connect demand_signal to material_continuity_process.demand_signal;
    // @generated-support INT-02 transparent root-to-Process delegation.
    connection support02 : PortConnection connect inventory_band to material_continuity_process.inventory_band;
    // @generated-support INT-05 transparent root-to-Process delegation.
    connection support03 : PortConnection connect supplier_availability to material_continuity_process.supplier_availability;
    // @generated-support INT-06 transparent root-to-Process delegation.
    connection support04 : PortConnection connect production_availability to material_continuity_process.production_availability;
    // @generated-support INT-03 transparent root-to-Process delegation.
    connection support05 : PortConnection connect material_event to material_continuity_process.material_event;
    // @generated-support INT-04 transparent root-to-Process delegation.
    connection support06 : PortConnection connect recovery_event to material_continuity_process.recovery_event;
    // @generated-support INT-07 transparent Process-to-root delegation.
    connection support07 : PortConnection connect material_continuity_process.material_coordination_result to material_coordination_result;
  }

  // @trace BOUND-01
  part factory_material_continuity_coordinator : FactoryMaterialContinuityCoordinatorSystem;
}
