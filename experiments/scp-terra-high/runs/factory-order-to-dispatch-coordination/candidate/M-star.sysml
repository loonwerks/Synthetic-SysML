package Factory_Dispatch_Coordinator {

  private import HAMR::*;

  interface def BoundaryExposure {
    end outer : DataPort;
    end inner : ~DataPort;
  }

  enum def FreshRequest {
    enum NONE;
    enum INVALID;
    enum VALID_STANDARD;
    enum VALID_EXPEDITE;
  }

  enum def MaterialBand {
    enum INVALID;
    enum SHORT;
    enum READY;
  }

  enum def ProductBand {
    enum INVALID;
    enum ABSENT;
    enum AVAILABLE;
  }

  enum def ExecutionOutcome {
    enum NONE;
    enum QUOTE_OK;
    enum MATERIAL_OK;
    enum PRODUCTION_OK;
    enum DISPATCH_OK;
    enum FAILED;
  }

  enum def RecoveryEvent {
    enum NONE;
    enum RESET;
    enum VERIFY_OK;
  }

  enum def DispatchAction {
    enum HOLD;
    enum ISSUE_QUOTE;
    enum ORDER_MATERIAL;
    enum RELEASE_PRODUCTION;
    enum RELEASE_DISPATCH;
  }

  enum def SelectedCause {
    enum FAULT_OR_RECOVERY;
    enum DISPATCH_PRIORITY;
    enum PRODUCTION_PRIORITY;
    enum PROCUREMENT_PRIORITY;
    enum QUOTE_AVAILABLE;
    enum NO_ELIGIBLE_WORK;
  }

  enum def Mode {
    enum HOLDING;
    enum QUOTING;
    enum PROCURING;
    enum PRODUCING;
    enum DISPATCHING;
    enum FAULT;
  }

  enum def OrderState {
    enum IDLE;
    enum OPEN;
  }

  enum def RecoveryState {
    enum HEALTHY;
    enum LATCHED;
    enum RECOVERING;
  }

  enum def RequestDisposition {
    enum NO_REQUEST;
    enum REJECTED;
    enum QUOTED;
    enum DEFERRED;
  }

  enum def OutcomeEventClass {
    enum NO_EVENT;
    enum FAILURE;
    enum SUCCESS;
  }

  enum def QualifiedOutcome {
    enum NO_PROGRESS;
    enum QUOTE_ACCEPTED;
    enum MATERIAL_CONFIRMED;
    enum PRODUCTION_COMPLETED;
    enum DISPATCH_COMPLETED;
    enum FAULT;
  }

  enum def RecoveryGate {
    enum OPEN;
    enum CLOSED;
  }

  enum def EmergencyState {
    enum INACTIVE;
    enum ACTIVE;
  }

  enum def ProposalState {
    enum NOT_PROPOSED;
    enum PROPOSED;
  }

  enum def OrderStatusValue {
    enum IDLE;
    enum OPEN;
  }

  enum def RecoveryStatusValue {
    enum HEALTHY;
    enum LATCHED;
    enum RECOVERING;
  }

  enum def PublishedAction {
    enum HOLD;
    enum ISSUE_QUOTE;
    enum ORDER_MATERIAL;
    enum RELEASE_PRODUCTION;
    enum RELEASE_DISPATCH;
  }

  enum def PublishedOrderState {
    enum IDLE;
    enum OPEN;
  }

  enum def PublishedRecoveryState {
    enum HEALTHY;
    enum LATCHED;
    enum RECOVERING;
  }

  // All record fields inspected by GUMBO are attributes.
  part def InventorySnapshot :> Data {
    attribute material_band : MaterialBand;
    attribute product_band : ProductBand;
  }

  part def CapabilitySnapshot :> Data {
    attribute supplier_available : Base_Types::Boolean;
    attribute production_available : Base_Types::Boolean;
    attribute dispatch_available : Base_Types::Boolean;
  }

  part def RequestBoundaryFacts :> Data {
    attribute fresh_request : FreshRequest;
    attribute request_present : Base_Types::Boolean;
  }

  part def MaterialBoundaryFacts :> Data {
    attribute material_band : MaterialBand;
    attribute material_usable : Base_Types::Boolean;
  }

  part def ProductBoundaryFacts :> Data {
    attribute product_band : ProductBand;
    attribute product_usable : Base_Types::Boolean;
  }

  part def OutcomeBoundaryFacts :> Data {
    attribute execution_outcome : ExecutionOutcome;
    attribute event_class : OutcomeEventClass;
  }

  part def RequestFacts :> Data {
    attribute fresh_request : FreshRequest;
    attribute request_present : Base_Types::Boolean;
    attribute request_valid : Base_Types::Boolean;
    attribute request_expedited : Base_Types::Boolean;
  }

  part def StockFacts :> Data {
    attribute material_band : MaterialBand;
    attribute material_usable : Base_Types::Boolean;
    attribute material_shortage : Base_Types::Boolean;
    attribute material_ready : Base_Types::Boolean;
    attribute product_band : ProductBand;
    attribute product_usable : Base_Types::Boolean;
    attribute product_available : Base_Types::Boolean;
  }

  part def DispatchStatusRecord :> Data {
    attribute order_phase : OrderStatusValue;
    attribute recovery_phase : RecoveryStatusValue;
    attribute mode : Mode;
    attribute selected_cause : SelectedCause;
  }

  part def DispatchPublicResult :> Data {
    attribute selected_cause : SelectedCause;
    attribute mode : Mode;
    attribute published_order : PublishedOrderState;
    attribute published_recovery : PublishedRecoveryState;
    attribute request_disposition : RequestDisposition;
    attribute published_action : PublishedAction;
  }

  part def CustomerRequestAcquisition :> Thread {
    port fresh_request : DataPort { in :>> type : FreshRequest; }
    port request_boundary_facts : DataPort { out :>> type : RequestBoundaryFacts; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_REQUEST_BOUNDARY:
          request_boundary_facts.fresh_request == FreshRequest.NONE and
          request_boundary_facts.request_present == false;
      compute
        guarantee PRESERVE_REQUEST_VALUE:
          request_boundary_facts.fresh_request == fresh_request;
        guarantee CLASSIFY_REQUEST_PRESENCE:
          request_boundary_facts.request_present == (fresh_request != FreshRequest.NONE);
    }*/
  }

  part def InventoryAcquisition :> Thread {
    port inventory_snapshot : DataPort { in :>> type : InventorySnapshot; }
    port material_boundary_facts : DataPort { out :>> type : MaterialBoundaryFacts; }
    port product_boundary_facts : DataPort { out :>> type : ProductBoundaryFacts; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_INVENTORY_BOUNDARY:
          material_boundary_facts.material_band == MaterialBand.INVALID and
          material_boundary_facts.material_usable == false and
          product_boundary_facts.product_band == ProductBand.INVALID and
          product_boundary_facts.product_usable == false;
      compute
        guarantee PRESERVE_INVENTORY_BANDS:
          material_boundary_facts.material_band == inventory_snapshot.material_band and
          product_boundary_facts.product_band == inventory_snapshot.product_band;
        guarantee CLASSIFY_MATERIAL_USABILITY:
          material_boundary_facts.material_usable == (inventory_snapshot.material_band != MaterialBand.INVALID);
        guarantee CLASSIFY_PRODUCT_USABILITY:
          product_boundary_facts.product_usable == (inventory_snapshot.product_band != ProductBand.INVALID);
    }*/
  }

  part def CapabilityAcquisition :> Thread {
    port capability_snapshot : DataPort { in :>> type : CapabilitySnapshot; }
    port supplier_available : DataPort { out :>> type : Base_Types::Boolean; }
    port production_available : DataPort { out :>> type : Base_Types::Boolean; }
    port dispatch_available : DataPort { out :>> type : Base_Types::Boolean; }
  }

  part def ExecutionOutcomeAcquisition :> Thread {
    port execution_outcome : DataPort { in :>> type : ExecutionOutcome; }
    port outcome_boundary_facts : DataPort { out :>> type : OutcomeBoundaryFacts; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_OUTCOME_BOUNDARY:
          outcome_boundary_facts.execution_outcome == ExecutionOutcome.NONE and
          outcome_boundary_facts.event_class == OutcomeEventClass.NO_EVENT;
      compute
        compute_cases
          case CLASSIFY_NO_EVENT:
            assume execution_outcome == ExecutionOutcome.NONE;
            guarantee outcome_boundary_facts.execution_outcome == execution_outcome and
              outcome_boundary_facts.event_class == OutcomeEventClass.NO_EVENT;
          case CLASSIFY_FAILURE:
            assume execution_outcome == ExecutionOutcome.FAILED;
            guarantee outcome_boundary_facts.execution_outcome == execution_outcome and
              outcome_boundary_facts.event_class == OutcomeEventClass.FAILURE;
          case CLASSIFY_SUCCESS:
            assume execution_outcome != ExecutionOutcome.NONE and execution_outcome != ExecutionOutcome.FAILED;
            guarantee outcome_boundary_facts.execution_outcome == execution_outcome and
              outcome_boundary_facts.event_class == OutcomeEventClass.SUCCESS;
    }*/
  }

  part def RequestQualification :> Thread {
    port request_boundary_facts : DataPort { in :>> type : RequestBoundaryFacts; }
    port request_facts : DataPort { out :>> type : RequestFacts; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_REQUEST_FACTS:
          request_facts.fresh_request == FreshRequest.NONE and
          request_facts.request_present == false and
          request_facts.request_valid == false and
          request_facts.request_expedited == false;
      compute
        guarantee PRESERVE_RECEIVED_REQUEST_FACTS:
          request_facts.fresh_request == request_boundary_facts.fresh_request and
          request_facts.request_present == request_boundary_facts.request_present;
        guarantee CLASSIFY_VALID_REQUEST:
          request_facts.request_valid ==
            (request_boundary_facts.fresh_request == FreshRequest.VALID_STANDARD or
             request_boundary_facts.fresh_request == FreshRequest.VALID_EXPEDITE);
        guarantee CLASSIFY_EXPEDITED_REQUEST:
          request_facts.request_expedited ==
            (request_boundary_facts.fresh_request == FreshRequest.VALID_EXPEDITE);
    }*/
  }

  part def StockAssessment :> Thread {
    port material_boundary_facts : DataPort { in :>> type : MaterialBoundaryFacts; }
    port product_boundary_facts : DataPort { in :>> type : ProductBoundaryFacts; }
    port stock_facts : DataPort { out :>> type : StockFacts; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_STOCK_FACTS:
          stock_facts.material_band == MaterialBand.INVALID and
          stock_facts.material_usable == false and
          stock_facts.material_shortage == false and
          stock_facts.material_ready == false and
          stock_facts.product_band == ProductBand.INVALID and
          stock_facts.product_usable == false and
          stock_facts.product_available == false;
      compute
        guarantee PRESERVE_RECEIVED_STOCK_FACTS:
          stock_facts.material_band == material_boundary_facts.material_band and
          stock_facts.material_usable == material_boundary_facts.material_usable and
          stock_facts.product_band == product_boundary_facts.product_band and
          stock_facts.product_usable == product_boundary_facts.product_usable;
        guarantee DERIVE_MATERIAL_SHORTAGE:
          stock_facts.material_shortage ==
            (material_boundary_facts.material_usable and
             material_boundary_facts.material_band == MaterialBand.SHORT);
        guarantee DERIVE_MATERIAL_READINESS:
          stock_facts.material_ready ==
            (material_boundary_facts.material_usable and
             material_boundary_facts.material_band == MaterialBand.READY);
        guarantee DERIVE_PRODUCT_AVAILABILITY:
          stock_facts.product_available ==
            (product_boundary_facts.product_usable and
             product_boundary_facts.product_band == ProductBand.AVAILABLE);
    }*/
  }

  part def OutcomeQualification :> Thread {
    port outcome_boundary_facts : DataPort { in :>> type : OutcomeBoundaryFacts; }
    port prior_order_state : DataPort { in :>> type : OrderState; }
    port qualified_outcome : DataPort { out :>> type : QualifiedOutcome; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_QUALIFIED_OUTCOME:
          qualified_outcome == QualifiedOutcome.NO_PROGRESS;
      compute
        compute_cases
          case CASE_01_NO_PROGRESS:
            assume outcome_boundary_facts.event_class == OutcomeEventClass.NO_EVENT and
              outcome_boundary_facts.execution_outcome == ExecutionOutcome.NONE;
            guarantee qualified_outcome == QualifiedOutcome.NO_PROGRESS;
          case CASE_02_FAILURE_OR_PHASE_FAULT:
            assume outcome_boundary_facts.event_class == OutcomeEventClass.FAILURE or
              (outcome_boundary_facts.event_class == OutcomeEventClass.SUCCESS and
               ((outcome_boundary_facts.execution_outcome == ExecutionOutcome.QUOTE_OK and
                 prior_order_state != OrderState.IDLE) or
                ((outcome_boundary_facts.execution_outcome == ExecutionOutcome.MATERIAL_OK or
                  outcome_boundary_facts.execution_outcome == ExecutionOutcome.PRODUCTION_OK or
                  outcome_boundary_facts.execution_outcome == ExecutionOutcome.DISPATCH_OK) and
                 prior_order_state != OrderState.OPEN)));
            guarantee qualified_outcome == QualifiedOutcome.FAULT;
          case CASE_03_QUOTE_ACCEPTED:
            assume outcome_boundary_facts.event_class == OutcomeEventClass.SUCCESS and
              outcome_boundary_facts.execution_outcome == ExecutionOutcome.QUOTE_OK and
              prior_order_state == OrderState.IDLE;
            guarantee qualified_outcome == QualifiedOutcome.QUOTE_ACCEPTED;
          case CASE_04_MATERIAL_CONFIRMED:
            assume outcome_boundary_facts.event_class == OutcomeEventClass.SUCCESS and
              outcome_boundary_facts.execution_outcome == ExecutionOutcome.MATERIAL_OK and
              prior_order_state == OrderState.OPEN;
            guarantee qualified_outcome == QualifiedOutcome.MATERIAL_CONFIRMED;
          case CASE_05_PRODUCTION_COMPLETED:
            assume outcome_boundary_facts.event_class == OutcomeEventClass.SUCCESS and
              outcome_boundary_facts.execution_outcome == ExecutionOutcome.PRODUCTION_OK and
              prior_order_state == OrderState.OPEN;
            guarantee qualified_outcome == QualifiedOutcome.PRODUCTION_COMPLETED;
          case CASE_06_DISPATCH_COMPLETED:
            assume outcome_boundary_facts.event_class == OutcomeEventClass.SUCCESS and
              outcome_boundary_facts.execution_outcome == ExecutionOutcome.DISPATCH_OK and
              prior_order_state == OrderState.OPEN;
            guarantee qualified_outcome == QualifiedOutcome.DISPATCH_COMPLETED;
    }*/
  }

  part def RecoveryControl :> Thread {
    port qualified_outcome : DataPort { in :>> type : QualifiedOutcome; }
    port recovery_event : DataPort { in :>> type : RecoveryEvent; }
    port recovery_gate : DataPort { out :>> type : RecoveryGate; }
    port emergency_state : DataPort { out :>> type : EmergencyState; }
    port recovery_state : DataPort { out :>> type : RecoveryState; }

    language "GUMBO" /*{
      state
        retained_recovery : RecoveryState;
      initialize
        guarantee INITIAL_RECOVERY_HEALTHY:
          retained_recovery == RecoveryState.HEALTHY and
          recovery_state == RecoveryState.HEALTHY and
          recovery_gate == RecoveryGate.OPEN and
          emergency_state == EmergencyState.INACTIVE;
      compute
        guarantee RECOVERY_OUTPUTS_AGREE:
          recovery_state == retained_recovery and
          ((retained_recovery == RecoveryState.HEALTHY and
            recovery_gate == RecoveryGate.OPEN and emergency_state == EmergencyState.INACTIVE) or
           (retained_recovery != RecoveryState.HEALTHY and
            recovery_gate == RecoveryGate.CLOSED and emergency_state == EmergencyState.ACTIVE));
        compute_cases
          case CASE_07_FAULT_LATCHES:
            assume qualified_outcome == QualifiedOutcome.FAULT;
            guarantee retained_recovery == RecoveryState.LATCHED and
              recovery_state == RecoveryState.LATCHED and recovery_gate == RecoveryGate.CLOSED and
              emergency_state == EmergencyState.ACTIVE;
          case CASE_08_HEALTHY_REMAINS_HEALTHY:
            assume qualified_outcome != QualifiedOutcome.FAULT and
              In(retained_recovery) == RecoveryState.HEALTHY;
            guarantee retained_recovery == RecoveryState.HEALTHY and
              recovery_state == RecoveryState.HEALTHY and recovery_gate == RecoveryGate.OPEN and
              emergency_state == EmergencyState.INACTIVE;
          case CASE_09_RESET_ENTERS_RECOVERING:
            assume qualified_outcome != QualifiedOutcome.FAULT and
              In(retained_recovery) == RecoveryState.LATCHED and
              recovery_event == RecoveryEvent.RESET;
            guarantee retained_recovery == RecoveryState.RECOVERING and
              recovery_state == RecoveryState.RECOVERING and recovery_gate == RecoveryGate.CLOSED and
              emergency_state == EmergencyState.ACTIVE;
          case CASE_10_LATCHED_STUTTERS:
            assume qualified_outcome != QualifiedOutcome.FAULT and
              In(retained_recovery) == RecoveryState.LATCHED and
              recovery_event != RecoveryEvent.RESET;
            guarantee retained_recovery == RecoveryState.LATCHED and
              recovery_state == RecoveryState.LATCHED and recovery_gate == RecoveryGate.CLOSED and
              emergency_state == EmergencyState.ACTIVE;
          case CASE_11_VERIFY_RELEASES:
            assume qualified_outcome != QualifiedOutcome.FAULT and
              In(retained_recovery) == RecoveryState.RECOVERING and
              recovery_event == RecoveryEvent.VERIFY_OK;
            guarantee retained_recovery == RecoveryState.HEALTHY and
              recovery_state == RecoveryState.HEALTHY and recovery_gate == RecoveryGate.OPEN and
              emergency_state == EmergencyState.INACTIVE;
          case CASE_12_RECOVERING_STUTTERS:
            assume qualified_outcome != QualifiedOutcome.FAULT and
              In(retained_recovery) == RecoveryState.RECOVERING and
              recovery_event != RecoveryEvent.VERIFY_OK;
            guarantee retained_recovery == RecoveryState.RECOVERING and
              recovery_state == RecoveryState.RECOVERING and recovery_gate == RecoveryGate.CLOSED and
              emergency_state == EmergencyState.ACTIVE;
    }*/
  }

  part def OrderLifecycle :> Thread {
    port qualified_outcome : DataPort { in :>> type : QualifiedOutcome; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port prior_order_state : DataPort { out :>> type : OrderState; }
    port order_state : DataPort { out :>> type : OrderState; }

    language "GUMBO" /*{
      state
        retained_order : OrderState;
      initialize
        guarantee INITIAL_ORDER_IDLE:
          retained_order == OrderState.IDLE and prior_order_state == OrderState.IDLE and
          order_state == OrderState.IDLE;
      compute
        guarantee DISTINCT_PRIOR_AND_CURRENT_PORTS:
          prior_order_state == In(retained_order) and order_state == retained_order;
        compute_cases
          case CASE_01_OPEN_GATE_NO_PROGRESS:
            assume recovery_gate == RecoveryGate.OPEN and
              qualified_outcome == QualifiedOutcome.NO_PROGRESS;
            guarantee retained_order == In(retained_order) and order_state == In(retained_order);
          case CASE_02_CLOSED_GATE_FREEZE:
            assume recovery_gate == RecoveryGate.CLOSED;
            guarantee retained_order == In(retained_order) and order_state == In(retained_order);
          case CASE_03_QUOTE_OPENS_ORDER:
            assume recovery_gate == RecoveryGate.OPEN and
              qualified_outcome == QualifiedOutcome.QUOTE_ACCEPTED;
            guarantee retained_order == OrderState.OPEN and order_state == OrderState.OPEN;
          case CASE_04_MATERIAL_RETAINS_OPEN:
            assume recovery_gate == RecoveryGate.OPEN and
              qualified_outcome == QualifiedOutcome.MATERIAL_CONFIRMED;
            guarantee retained_order == OrderState.OPEN and order_state == OrderState.OPEN;
          case CASE_05_PRODUCTION_RETAINS_OPEN:
            assume recovery_gate == RecoveryGate.OPEN and
              qualified_outcome == QualifiedOutcome.PRODUCTION_COMPLETED;
            guarantee retained_order == OrderState.OPEN and order_state == OrderState.OPEN;
          case CASE_06_DISPATCH_CLOSES_ORDER:
            assume recovery_gate == RecoveryGate.OPEN and
              qualified_outcome == QualifiedOutcome.DISPATCH_COMPLETED;
            guarantee retained_order == OrderState.IDLE and order_state == OrderState.IDLE;
    }*/
  }

  part def QuotationEligibility :> Thread {
    port request_facts : DataPort { in :>> type : RequestFacts; }
    port order_state : DataPort { in :>> type : OrderState; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port proposal : DataPort { out :>> type : ProposalState; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_QUOTATION_NOT_PROPOSED: proposal == ProposalState.NOT_PROPOSED;
      compute
        compute_cases
          case CASE_13_QUOTATION_PROPOSED:
            assume recovery_gate == RecoveryGate.OPEN and order_state == OrderState.IDLE and
              request_facts.request_valid;
            guarantee proposal == ProposalState.PROPOSED;
          case CASE_14_QUOTATION_NOT_PROPOSED:
            assume recovery_gate != RecoveryGate.OPEN or order_state != OrderState.IDLE or
              request_facts.request_valid == false;
            guarantee proposal == ProposalState.NOT_PROPOSED;
    }*/
  }

  part def ProcurementEligibility :> Thread {
    port stock_facts : DataPort { in :>> type : StockFacts; }
    port supplier_available : DataPort { in :>> type : Base_Types::Boolean; }
    port order_state : DataPort { in :>> type : OrderState; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port proposal : DataPort { out :>> type : ProposalState; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_PROCUREMENT_NOT_PROPOSED: proposal == ProposalState.NOT_PROPOSED;
      compute
        compute_cases
          case CASE_15_PROCUREMENT_PROPOSED:
            assume recovery_gate == RecoveryGate.OPEN and order_state == OrderState.OPEN and
              stock_facts.material_usable and stock_facts.material_shortage and supplier_available;
            guarantee proposal == ProposalState.PROPOSED;
          case CASE_16_PROCUREMENT_NOT_PROPOSED:
            assume recovery_gate != RecoveryGate.OPEN or order_state != OrderState.OPEN or
              stock_facts.material_usable == false or stock_facts.material_shortage == false or
              supplier_available == false;
            guarantee proposal == ProposalState.NOT_PROPOSED;
    }*/
  }

  part def ProductionEligibility :> Thread {
    port stock_facts : DataPort { in :>> type : StockFacts; }
    port production_available : DataPort { in :>> type : Base_Types::Boolean; }
    port order_state : DataPort { in :>> type : OrderState; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port proposal : DataPort { out :>> type : ProposalState; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_PRODUCTION_NOT_PROPOSED: proposal == ProposalState.NOT_PROPOSED;
      compute
        compute_cases
          case CASE_17_PRODUCTION_PROPOSED:
            assume recovery_gate == RecoveryGate.OPEN and order_state == OrderState.OPEN and
              stock_facts.material_usable and stock_facts.material_ready and production_available;
            guarantee proposal == ProposalState.PROPOSED;
          case CASE_18_PRODUCTION_NOT_PROPOSED:
            assume recovery_gate != RecoveryGate.OPEN or order_state != OrderState.OPEN or
              stock_facts.material_usable == false or stock_facts.material_ready == false or
              production_available == false;
            guarantee proposal == ProposalState.NOT_PROPOSED;
    }*/
  }

  part def DispatchEligibility :> Thread {
    port stock_facts : DataPort { in :>> type : StockFacts; }
    port dispatch_available : DataPort { in :>> type : Base_Types::Boolean; }
    port order_state : DataPort { in :>> type : OrderState; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port proposal : DataPort { out :>> type : ProposalState; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_DISPATCH_NOT_PROPOSED: proposal == ProposalState.NOT_PROPOSED;
      compute
        compute_cases
          case CASE_19_DISPATCH_PROPOSED:
            assume recovery_gate == RecoveryGate.OPEN and order_state == OrderState.OPEN and
              stock_facts.product_usable and stock_facts.product_available and dispatch_available;
            guarantee proposal == ProposalState.PROPOSED;
          case CASE_20_DISPATCH_NOT_PROPOSED:
            assume recovery_gate != RecoveryGate.OPEN or order_state != OrderState.OPEN or
              stock_facts.product_usable == false or stock_facts.product_available == false or
              dispatch_available == false;
            guarantee proposal == ProposalState.NOT_PROPOSED;
    }*/
  }

  part def ActionArbitration :> Thread {
    port emergency_state : DataPort { in :>> type : EmergencyState; }
    port quotation_proposal : DataPort { in :>> type : ProposalState; }
    port procurement_proposal : DataPort { in :>> type : ProposalState; }
    port production_proposal : DataPort { in :>> type : ProposalState; }
    port dispatch_proposal : DataPort { in :>> type : ProposalState; }
    port selected_action : DataPort { out :>> type : DispatchAction; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_ACTION_HOLD: selected_action == DispatchAction.HOLD;
      compute
        compute_cases
          case CASE_21_EMERGENCY_HOLD:
            assume emergency_state == EmergencyState.ACTIVE;
            guarantee selected_action == DispatchAction.HOLD;
          case CASE_22_DISPATCH_PRIORITY:
            assume emergency_state == EmergencyState.INACTIVE and
              dispatch_proposal == ProposalState.PROPOSED;
            guarantee selected_action == DispatchAction.RELEASE_DISPATCH;
          case CASE_23_PRODUCTION_PRIORITY:
            assume emergency_state == EmergencyState.INACTIVE and
              dispatch_proposal != ProposalState.PROPOSED and
              production_proposal == ProposalState.PROPOSED;
            guarantee selected_action == DispatchAction.RELEASE_PRODUCTION;
          case CASE_24_PROCUREMENT_PRIORITY:
            assume emergency_state == EmergencyState.INACTIVE and
              dispatch_proposal != ProposalState.PROPOSED and
              production_proposal != ProposalState.PROPOSED and
              procurement_proposal == ProposalState.PROPOSED;
            guarantee selected_action == DispatchAction.ORDER_MATERIAL;
          case CASE_25_QUOTATION_PRIORITY:
            assume emergency_state == EmergencyState.INACTIVE and
              dispatch_proposal != ProposalState.PROPOSED and
              production_proposal != ProposalState.PROPOSED and
              procurement_proposal != ProposalState.PROPOSED and
              quotation_proposal == ProposalState.PROPOSED;
            guarantee selected_action == DispatchAction.ISSUE_QUOTE;
          case CASE_26_NO_ELIGIBLE_WORK:
            assume emergency_state == EmergencyState.INACTIVE and
              dispatch_proposal != ProposalState.PROPOSED and
              production_proposal != ProposalState.PROPOSED and
              procurement_proposal != ProposalState.PROPOSED and
              quotation_proposal != ProposalState.PROPOSED;
            guarantee selected_action == DispatchAction.HOLD;
    }*/
  }

  part def StatusDerivation :> Thread {
    port selected_action : DataPort { in :>> type : DispatchAction; }
    port order_state : DataPort { in :>> type : OrderState; }
    port recovery_state : DataPort { in :>> type : RecoveryState; }
    port status_record : DataPort { out :>> type : DispatchStatusRecord; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_STATUS_MODE: status_record.mode == Mode.HOLDING;
        guarantee INITIAL_STATUS_CAUSE: status_record.selected_cause == SelectedCause.NO_ELIGIBLE_WORK;
        guarantee INITIAL_STATUS_ORDER: status_record.order_phase == OrderStatusValue.IDLE;
        guarantee INITIAL_STATUS_RECOVERY: status_record.recovery_phase == RecoveryStatusValue.HEALTHY;
      compute
        guarantee MAP_STATUS_ORDER:
          (status_record.order_phase == OrderStatusValue.IDLE and order_state == OrderState.IDLE) or
          (status_record.order_phase == OrderStatusValue.OPEN and order_state == OrderState.OPEN);
        guarantee MAP_STATUS_RECOVERY:
          (status_record.recovery_phase == RecoveryStatusValue.HEALTHY and recovery_state == RecoveryState.HEALTHY) or
          (status_record.recovery_phase == RecoveryStatusValue.LATCHED and recovery_state == RecoveryState.LATCHED) or
          (status_record.recovery_phase == RecoveryStatusValue.RECOVERING and recovery_state == RecoveryState.RECOVERING);
        compute_cases
          case STATUS_FAULT_OR_RECOVERY:
            assume recovery_state != RecoveryState.HEALTHY;
            guarantee status_record.mode == Mode.FAULT and
              status_record.selected_cause == SelectedCause.FAULT_OR_RECOVERY;
          case STATUS_QUOTING:
            assume recovery_state == RecoveryState.HEALTHY and
              selected_action == DispatchAction.ISSUE_QUOTE;
            guarantee status_record.mode == Mode.QUOTING and
              status_record.selected_cause == SelectedCause.QUOTE_AVAILABLE;
          case STATUS_PROCURING:
            assume recovery_state == RecoveryState.HEALTHY and
              selected_action == DispatchAction.ORDER_MATERIAL;
            guarantee status_record.mode == Mode.PROCURING and
              status_record.selected_cause == SelectedCause.PROCUREMENT_PRIORITY;
          case STATUS_PRODUCING:
            assume recovery_state == RecoveryState.HEALTHY and
              selected_action == DispatchAction.RELEASE_PRODUCTION;
            guarantee status_record.mode == Mode.PRODUCING and
              status_record.selected_cause == SelectedCause.PRODUCTION_PRIORITY;
          case STATUS_DISPATCHING:
            assume recovery_state == RecoveryState.HEALTHY and
              selected_action == DispatchAction.RELEASE_DISPATCH;
            guarantee status_record.mode == Mode.DISPATCHING and
              status_record.selected_cause == SelectedCause.DISPATCH_PRIORITY;
          case STATUS_HOLDING:
            assume recovery_state == RecoveryState.HEALTHY and
              selected_action == DispatchAction.HOLD;
            guarantee status_record.mode == Mode.HOLDING and
              status_record.selected_cause == SelectedCause.NO_ELIGIBLE_WORK;
    }*/
  }

  part def PublicComposition :> Thread {
    port request_facts : DataPort { in :>> type : RequestFacts; }
    port selected_action : DataPort { in :>> type : DispatchAction; }
    port status_record : DataPort { in :>> type : DispatchStatusRecord; }
    port public_result : DataPort { out :>> type : DispatchPublicResult; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_PUBLIC_ACTION: public_result.published_action == PublishedAction.HOLD;
        guarantee INITIAL_PUBLIC_CAUSE: public_result.selected_cause == SelectedCause.NO_ELIGIBLE_WORK;
        guarantee INITIAL_PUBLIC_MODE: public_result.mode == Mode.HOLDING;
        guarantee INITIAL_PUBLIC_ORDER: public_result.published_order == PublishedOrderState.IDLE;
        guarantee INITIAL_PUBLIC_RECOVERY: public_result.published_recovery == PublishedRecoveryState.HEALTHY;
        guarantee INITIAL_PUBLIC_DISPOSITION: public_result.request_disposition == RequestDisposition.NO_REQUEST;
      compute
        guarantee COMPOSE_PUBLIC_ACTION:
          (public_result.published_action == PublishedAction.HOLD and selected_action == DispatchAction.HOLD) or
          (public_result.published_action == PublishedAction.ISSUE_QUOTE and selected_action == DispatchAction.ISSUE_QUOTE) or
          (public_result.published_action == PublishedAction.ORDER_MATERIAL and selected_action == DispatchAction.ORDER_MATERIAL) or
          (public_result.published_action == PublishedAction.RELEASE_PRODUCTION and selected_action == DispatchAction.RELEASE_PRODUCTION) or
          (public_result.published_action == PublishedAction.RELEASE_DISPATCH and selected_action == DispatchAction.RELEASE_DISPATCH);
        guarantee COMPOSE_PUBLIC_CAUSE:
          public_result.selected_cause == status_record.selected_cause;
        guarantee COMPOSE_PUBLIC_MODE: public_result.mode == status_record.mode;
        guarantee COMPOSE_PUBLIC_ORDER:
          (public_result.published_order == PublishedOrderState.IDLE and
           status_record.order_phase == OrderStatusValue.IDLE) or
          (public_result.published_order == PublishedOrderState.OPEN and
           status_record.order_phase == OrderStatusValue.OPEN);
        guarantee COMPOSE_PUBLIC_RECOVERY:
          (public_result.published_recovery == PublishedRecoveryState.HEALTHY and
           status_record.recovery_phase == RecoveryStatusValue.HEALTHY) or
          (public_result.published_recovery == PublishedRecoveryState.LATCHED and
           status_record.recovery_phase == RecoveryStatusValue.LATCHED) or
          (public_result.published_recovery == PublishedRecoveryState.RECOVERING and
           status_record.recovery_phase == RecoveryStatusValue.RECOVERING);
        compute_cases
          case CASE_27_NO_REQUEST:
            assume request_facts.fresh_request == FreshRequest.NONE;
            guarantee public_result.request_disposition == RequestDisposition.NO_REQUEST;
          case CASE_28_INVALID_REQUEST:
            assume request_facts.fresh_request == FreshRequest.INVALID;
            guarantee public_result.request_disposition == RequestDisposition.REJECTED;
          case CASE_29_QUOTED:
            assume request_facts.request_valid and selected_action == DispatchAction.ISSUE_QUOTE;
            guarantee public_result.request_disposition == RequestDisposition.QUOTED;
          case CASE_30_DEFERRED:
            assume request_facts.request_valid and selected_action != DispatchAction.ISSUE_QUOTE;
            guarantee public_result.request_disposition == RequestDisposition.DEFERRED;
    }*/
  }

  part def FactoryDispatchCoordinatorProcess :> Process {
    port freshRequest : DataPort { in :>> type : FreshRequest; }
    port inventorySnapshot : DataPort { in :>> type : InventorySnapshot; }
    port capabilitySnapshot : DataPort { in :>> type : CapabilitySnapshot; }
    port executionOutcome : DataPort { in :>> type : ExecutionOutcome; }
    port recoveryEvent : DataPort { in :>> type : RecoveryEvent; }
    port publicResult : DataPort { out :>> type : DispatchPublicResult; }

    part customer_request_acquisition : CustomerRequestAcquisition;
    part inventory_acquisition : InventoryAcquisition;
    part capability_acquisition : CapabilityAcquisition;
    part execution_outcome_acquisition : ExecutionOutcomeAcquisition;
    part request_qualification : RequestQualification;
    part stock_assessment : StockAssessment;
    part outcome_qualification : OutcomeQualification;
    part recovery_control : RecoveryControl;
    part order_lifecycle : OrderLifecycle;
    part quotation_eligibility : QuotationEligibility;
    part procurement_eligibility : ProcurementEligibility;
    part production_eligibility : ProductionEligibility;
    part dispatch_eligibility : DispatchEligibility;
    part action_arbitration : ActionArbitration;
    part status_derivation : StatusDerivation;
    part public_composition : PublicComposition;

    connection boundary_fresh_request : PortConnection connect freshRequest to customer_request_acquisition.fresh_request;
    connection boundary_inventory_snapshot : PortConnection connect inventorySnapshot to inventory_acquisition.inventory_snapshot;
    connection boundary_capability_snapshot : PortConnection connect capabilitySnapshot to capability_acquisition.capability_snapshot;
    connection boundary_execution_outcome : PortConnection connect executionOutcome to execution_outcome_acquisition.execution_outcome;
    connection boundary_recovery_event : PortConnection connect recoveryEvent to recovery_control.recovery_event;
    connection boundary_public_result : PortConnection connect public_composition.public_result to publicResult;

    connection request_boundary_to_qualification : PortConnection connect customer_request_acquisition.request_boundary_facts to request_qualification.request_boundary_facts;
    connection material_boundary_to_stock : PortConnection connect inventory_acquisition.material_boundary_facts to stock_assessment.material_boundary_facts;
    connection product_boundary_to_stock : PortConnection connect inventory_acquisition.product_boundary_facts to stock_assessment.product_boundary_facts;
    connection supplier_availability_route : PortConnection connect capability_acquisition.supplier_available to procurement_eligibility.supplier_available;
    connection production_availability_route : PortConnection connect capability_acquisition.production_available to production_eligibility.production_available;
    connection dispatch_availability_route : PortConnection connect capability_acquisition.dispatch_available to dispatch_eligibility.dispatch_available;
    connection outcome_boundary_to_qualification : PortConnection connect execution_outcome_acquisition.outcome_boundary_facts to outcome_qualification.outcome_boundary_facts;
    connection request_facts_to_quotation : PortConnection connect request_qualification.request_facts to quotation_eligibility.request_facts;
    connection request_facts_to_composition : PortConnection connect request_qualification.request_facts to public_composition.request_facts;
    connection stock_facts_to_procurement : PortConnection connect stock_assessment.stock_facts to procurement_eligibility.stock_facts;
    connection stock_facts_to_production : PortConnection connect stock_assessment.stock_facts to production_eligibility.stock_facts;
    connection stock_facts_to_dispatch : PortConnection connect stock_assessment.stock_facts to dispatch_eligibility.stock_facts;
    connection qualified_outcome_to_recovery : PortConnection connect outcome_qualification.qualified_outcome to recovery_control.qualified_outcome;
    connection qualified_outcome_to_lifecycle : PortConnection connect outcome_qualification.qualified_outcome to order_lifecycle.qualified_outcome;
    connection recovery_gate_to_lifecycle : PortConnection connect recovery_control.recovery_gate to order_lifecycle.recovery_gate;
    connection recovery_gate_to_quotation : PortConnection connect recovery_control.recovery_gate to quotation_eligibility.recovery_gate;
    connection recovery_gate_to_procurement : PortConnection connect recovery_control.recovery_gate to procurement_eligibility.recovery_gate;
    connection recovery_gate_to_production : PortConnection connect recovery_control.recovery_gate to production_eligibility.recovery_gate;
    connection recovery_gate_to_dispatch : PortConnection connect recovery_control.recovery_gate to dispatch_eligibility.recovery_gate;
    connection emergency_to_arbitration : PortConnection connect recovery_control.emergency_state to action_arbitration.emergency_state;
    connection recovery_state_to_status : PortConnection connect recovery_control.recovery_state to status_derivation.recovery_state;
    connection prior_order_to_outcome : PortConnection connect order_lifecycle.prior_order_state to outcome_qualification.prior_order_state;
    connection current_order_to_quotation : PortConnection connect order_lifecycle.order_state to quotation_eligibility.order_state;
    connection current_order_to_procurement : PortConnection connect order_lifecycle.order_state to procurement_eligibility.order_state;
    connection current_order_to_production : PortConnection connect order_lifecycle.order_state to production_eligibility.order_state;
    connection current_order_to_dispatch : PortConnection connect order_lifecycle.order_state to dispatch_eligibility.order_state;
    connection current_order_to_status : PortConnection connect order_lifecycle.order_state to status_derivation.order_state;
    connection quotation_proposal_to_arbitration : PortConnection connect quotation_eligibility.proposal to action_arbitration.quotation_proposal;
    connection procurement_proposal_to_arbitration : PortConnection connect procurement_eligibility.proposal to action_arbitration.procurement_proposal;
    connection production_proposal_to_arbitration : PortConnection connect production_eligibility.proposal to action_arbitration.production_proposal;
    connection dispatch_proposal_to_arbitration : PortConnection connect dispatch_eligibility.proposal to action_arbitration.dispatch_proposal;
    connection selected_action_to_status : PortConnection connect action_arbitration.selected_action to status_derivation.selected_action;
    connection status_to_composition : PortConnection connect status_derivation.status_record to public_composition.status_record;
    connection selected_action_to_composition : PortConnection connect action_arbitration.selected_action to public_composition.selected_action;
  }

  part def FactoryDispatchCoordinatorSystem :> System {
    port freshRequest : DataPort { in :>> type : FreshRequest; }
    port inventorySnapshot : DataPort { in :>> type : InventorySnapshot; }
    port capabilitySnapshot : DataPort { in :>> type : CapabilitySnapshot; }
    port executionOutcome : DataPort { in :>> type : ExecutionOutcome; }
    port recoveryEvent : DataPort { in :>> type : RecoveryEvent; }
    port publicResult : DataPort { out :>> type : DispatchPublicResult; }

    part coordinator_process : FactoryDispatchCoordinatorProcess;

    interface expose_fresh_request : BoundaryExposure connect
      outer ::> freshRequest to inner ::> coordinator_process.fresh_request;
    interface expose_inventory_snapshot : BoundaryExposure connect
      outer ::> inventorySnapshot to inner ::> coordinator_process.inventorySnapshot;
    interface expose_capability_snapshot : BoundaryExposure connect
      outer ::> capabilitySnapshot to inner ::> coordinator_process.capabilitySnapshot;
    interface expose_execution_outcome : BoundaryExposure connect
      outer ::> executionOutcome to inner ::> coordinator_process.execution_outcome;
    interface expose_recovery_event : BoundaryExposure connect
      outer ::> recoveryEvent to inner ::> coordinator_process.recoveryEvent;
    interface expose_public_result : BoundaryExposure connect
      outer ::> coordinator_process.publicResult to inner ::> publicResult;
  }

  part factory_dispatch_coordinator : FactoryDispatchCoordinatorSystem;
}
