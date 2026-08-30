package Factory_Dispatch_Coordinator {

  private import HAMR::*;

  // @generated-support SUPPORT-01 transparent outer boundary exposure
  interface def BoundaryExposure {
    end outer : DataPort;
    end inner : ~DataPort;
  }

  // @trace MON-REQ-01
  enum def FreshRequest {
    enum NONE;
    enum INVALID;
    enum VALID_STANDARD;
    enum VALID_EXPEDITE;
  }

  // @trace MON-INV-01
  enum def MaterialBand {
    enum INVALID;
    enum SHORT;
    enum READY;
  }

  // @trace MON-INV-01
  enum def ProductBand {
    enum INVALID;
    enum ABSENT;
    enum AVAILABLE;
  }

  // @trace MON-OUT-01
  enum def ExecutionOutcome {
    enum NONE;
    enum QUOTE_OK;
    enum MATERIAL_OK;
    enum PRODUCTION_OK;
    enum DISPATCH_OK;
    enum FAILED;
  }

  // @trace MON-REC-01
  enum def RecoveryEvent {
    enum NONE;
    enum RESET;
    enum VERIFY_OK;
  }

  // @trace TYPE-ACT-01
  enum def DispatchAction {
    enum HOLD;
    enum ISSUE_QUOTE;
    enum ORDER_MATERIAL;
    enum RELEASE_PRODUCTION;
    enum RELEASE_DISPATCH;
  }

  // @trace TYPE-CAUSE-01
  enum def SelectedCause {
    enum FAULT_OR_RECOVERY;
    enum DISPATCH_PRIORITY;
    enum PRODUCTION_PRIORITY;
    enum PROCUREMENT_PRIORITY;
    enum QUOTE_AVAILABLE;
    enum NO_ELIGIBLE_WORK;
  }

  // @trace TYPE-MODE-01
  enum def Mode {
    enum HOLDING;
    enum QUOTING;
    enum PROCURING;
    enum PRODUCING;
    enum DISPATCHING;
    enum FAULT;
  }

  // @trace TYPE-STATE-01
  enum def OrderState {
    enum IDLE;
    enum OPEN;
  }

  // @trace TYPE-STATE-01
  enum def RecoveryState {
    enum HEALTHY;
    enum LATCHED;
    enum RECOVERING;
  }

  // @trace TYPE-DISP-01
  enum def RequestDisposition {
    enum NO_REQUEST;
    enum REJECTED;
    enum QUOTED;
    enum DEFERRED;
  }

  // @trace TYPE-BOUND-01
  enum def OutcomeEventClass {
    enum NO_EVENT;
    enum FAILURE;
    enum SUCCESS;
  }

  // @trace PART-07
  enum def QualifiedOutcome {
    enum NO_PROGRESS;
    enum QUOTE_ACCEPTED;
    enum MATERIAL_CONFIRMED;
    enum PRODUCTION_COMPLETED;
    enum DISPATCH_COMPLETED;
    enum FAULT;
  }

  // @trace PART-08
  enum def RecoveryGate {
    enum OPEN;
    enum CLOSED;
  }

  // @trace PART-08
  enum def EmergencyState {
    enum INACTIVE;
    enum ACTIVE;
  }

  // @trace PART-10
  enum def ProposalState {
    enum NOT_PROPOSED;
    enum PROPOSED;
  }

  // @trace TYPE-LOCAL-01
  enum def OrderStatusValue {
    enum IDLE;
    enum OPEN;
  }

  // @trace TYPE-LOCAL-01
  enum def RecoveryStatusValue {
    enum HEALTHY;
    enum LATCHED;
    enum RECOVERING;
  }

  // @trace TYPE-ACT-01
  enum def PublishedAction {
    enum HOLD;
    enum ISSUE_QUOTE;
    enum ORDER_MATERIAL;
    enum RELEASE_PRODUCTION;
    enum RELEASE_DISPATCH;
  }

  // @trace TYPE-STATE-01
  enum def PublishedOrderState {
    enum IDLE;
    enum OPEN;
  }

  // @trace TYPE-STATE-01
  enum def PublishedRecoveryState {
    enum HEALTHY;
    enum LATCHED;
    enum RECOVERING;
  }

  // All record fields inspected by GUMBO are attributes.
  // @trace MON-INV-01
  part def InventorySnapshot :> Data {
    attribute material_band : MaterialBand;
    attribute product_band : ProductBand;
  }

  // @trace MON-CAP-01
  part def CapabilitySnapshot :> Data {
    attribute supplier_available : Base_Types::Boolean;
    attribute production_available : Base_Types::Boolean;
    attribute dispatch_available : Base_Types::Boolean;
  }

  // @trace TYPE-BOUND-01
  part def RequestBoundaryFacts :> Data {
    attribute fresh_request : FreshRequest;
    attribute request_present : Base_Types::Boolean;
  }

  // @trace TYPE-BOUND-01
  part def MaterialBoundaryFacts :> Data {
    attribute material_band : MaterialBand;
    attribute material_usable : Base_Types::Boolean;
  }

  // @trace TYPE-BOUND-01
  part def ProductBoundaryFacts :> Data {
    attribute product_band : ProductBand;
    attribute product_usable : Base_Types::Boolean;
  }

  // @trace TYPE-BOUND-01
  part def OutcomeBoundaryFacts :> Data {
    attribute execution_outcome : ExecutionOutcome;
    attribute event_class : OutcomeEventClass;
  }

  // @trace PART-05
  part def RequestFacts :> Data {
    attribute fresh_request : FreshRequest;
    attribute request_present : Base_Types::Boolean;
    attribute request_valid : Base_Types::Boolean;
    attribute request_expedited : Base_Types::Boolean;
  }

  // @trace PART-06
  part def StockFacts :> Data {
    attribute material_band : MaterialBand;
    attribute material_usable : Base_Types::Boolean;
    attribute material_shortage : Base_Types::Boolean;
    attribute material_ready : Base_Types::Boolean;
    attribute product_band : ProductBand;
    attribute product_usable : Base_Types::Boolean;
    attribute product_available : Base_Types::Boolean;
  }

  // @trace TYPE-LOCAL-01
  part def DispatchStatusRecord :> Data {
    attribute order_phase : OrderStatusValue;
    attribute recovery_phase : RecoveryStatusValue;
    attribute mode : Mode;
    attribute selected_cause : SelectedCause;
  }

  // @trace CTRL-PUB-01
  part def DispatchPublicResult :> Data {
    attribute selected_cause : SelectedCause;
    attribute mode : Mode;
    attribute published_order : PublishedOrderState;
    attribute published_recovery : PublishedRecoveryState;
    attribute request_disposition : RequestDisposition;
    attribute published_action : PublishedAction;
  }

  // @trace PART-01
  part def CustomerRequestAcquisition :> Thread {
    // @trace MON-REQ-01
    port fresh_request : DataPort { in :>> type : FreshRequest; }
    // @trace INT-01
    port request_boundary_facts : DataPort { out :>> type : RequestBoundaryFacts; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_REQUEST_BOUNDARY "Request acquisition initializes to no request and not present":
          request_boundary_facts.fresh_request == FreshRequest.NONE &
          request_boundary_facts.request_present == F;

      compute
        // @trace REL-REQ-01
        guarantee PRESERVE_REQUEST_VALUE "The boundary record preserves the received request enum":
          request_boundary_facts.fresh_request == fresh_request;
        // @trace REL-REQ-01
        guarantee CLASSIFY_REQUEST_PRESENCE "Presence is derived locally as NONE versus present":
          (request_boundary_facts.request_present == T & fresh_request != FreshRequest.NONE) |
          (request_boundary_facts.request_present == F & fresh_request == FreshRequest.NONE);
    }*/
  }

  // @trace PART-02
  part def InventoryAcquisition :> Thread {
    // @trace MON-INV-01
    port inventory_snapshot : DataPort { in :>> type : InventorySnapshot; }
    // @trace INT-02
    port material_boundary_facts : DataPort { out :>> type : MaterialBoundaryFacts; }
    // @trace INT-03
    port product_boundary_facts : DataPort { out :>> type : ProductBoundaryFacts; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_INVENTORY_BOUNDARY "Inventory classifications initialize invalid and unusable":
          material_boundary_facts.material_band == MaterialBand.INVALID &
          material_boundary_facts.material_usable == F &
          product_boundary_facts.product_band == ProductBand.INVALID &
          product_boundary_facts.product_usable == F;

      compute
        // @trace REL-STOCK-01
        guarantee PRESERVE_INVENTORY_BANDS "Boundary facts preserve both received bands":
          material_boundary_facts.material_band == inventory_snapshot.material_band &
          product_boundary_facts.product_band == inventory_snapshot.product_band;
        // @trace REL-STOCK-01
        guarantee CLASSIFY_MATERIAL_USABILITY "Material usability is derived locally from invalid versus usable":
          (material_boundary_facts.material_usable == T & inventory_snapshot.material_band != MaterialBand.INVALID) |
          (material_boundary_facts.material_usable == F & inventory_snapshot.material_band == MaterialBand.INVALID);
        // @trace REL-STOCK-01
        guarantee CLASSIFY_PRODUCT_USABILITY "Product usability is derived locally from invalid versus usable":
          (product_boundary_facts.product_usable == T & inventory_snapshot.product_band != ProductBand.INVALID) |
          (product_boundary_facts.product_usable == F & inventory_snapshot.product_band == ProductBand.INVALID);
    }*/
  }

  // @generated-support PART-03 behavior-free capability splitter
  part def CapabilityAcquisition :> Thread {
    // @generated-support MON-CAP-01 unchanged aggregate input
    port capability_snapshot : DataPort { in :>> type : CapabilitySnapshot; }
    // @generated-support INT-04 unchanged supplier route
    port supplier_available : DataPort { out :>> type : Base_Types::Boolean; }
    // @generated-support INT-05 unchanged production route
    port production_available : DataPort { out :>> type : Base_Types::Boolean; }
    // @generated-support INT-06 unchanged dispatch route
    port dispatch_available : DataPort { out :>> type : Base_Types::Boolean; }
  }

  // @trace PART-04
  part def ExecutionOutcomeAcquisition :> Thread {
    // @trace MON-OUT-01
    port execution_outcome : DataPort { in :>> type : ExecutionOutcome; }
    // @trace INT-07
    port outcome_boundary_facts : DataPort { out :>> type : OutcomeBoundaryFacts; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_OUTCOME_BOUNDARY "Outcome acquisition initializes to the no-event classification":
          outcome_boundary_facts.execution_outcome == ExecutionOutcome.NONE &
          outcome_boundary_facts.event_class == OutcomeEventClass.NO_EVENT;

      compute
        compute_cases
          // @trace REL-OUT-01
          case CLASSIFY_NO_EVENT "NONE is classified locally as NO_EVENT while preserving the tag":
            assume execution_outcome == ExecutionOutcome.NONE;
            guarantee outcome_boundary_facts.execution_outcome == execution_outcome &
                      outcome_boundary_facts.event_class == OutcomeEventClass.NO_EVENT;
          // @trace REL-OUT-01
          case CLASSIFY_FAILURE "FAILED is classified locally as FAILURE while preserving the tag":
            assume execution_outcome == ExecutionOutcome.FAILED;
            guarantee outcome_boundary_facts.execution_outcome == execution_outcome &
                      outcome_boundary_facts.event_class == OutcomeEventClass.FAILURE;
          // @trace REL-OUT-01
          case CLASSIFY_SUCCESS "Every success tag is classified locally as SUCCESS and remains exact":
            assume execution_outcome != ExecutionOutcome.NONE &
                   execution_outcome != ExecutionOutcome.FAILED;
            guarantee outcome_boundary_facts.execution_outcome == execution_outcome &
                      outcome_boundary_facts.event_class == OutcomeEventClass.SUCCESS;
    }*/
  }

  // @trace PART-05
  part def RequestQualification :> Thread {
    // @trace INT-01
    port request_boundary_facts : DataPort { in :>> type : RequestBoundaryFacts; }
    // @trace INT-08
    port request_facts : DataPort { out :>> type : RequestFacts; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_REQUEST_FACTS "Request qualification initializes to no request and no positive classification":
          request_facts.fresh_request == FreshRequest.NONE &
          request_facts.request_present == F &
          request_facts.request_valid == F &
          request_facts.request_expedited == F;

      compute
        // @trace REL-REQ-01
        guarantee PRESERVE_RECEIVED_REQUEST_FACTS "Qualification preserves the received request and presence fact":
          request_facts.fresh_request == request_boundary_facts.fresh_request &
          request_facts.request_present == request_boundary_facts.request_present;
        // @trace REL-REQ-01
        guarantee CLASSIFY_VALID_REQUEST "Validity is derived locally for exactly the two valid request values":
          (request_facts.request_valid == T &
           (request_boundary_facts.fresh_request == FreshRequest.VALID_STANDARD |
            request_boundary_facts.fresh_request == FreshRequest.VALID_EXPEDITE)) |
          (request_facts.request_valid == F &
           request_boundary_facts.fresh_request != FreshRequest.VALID_STANDARD &
           request_boundary_facts.fresh_request != FreshRequest.VALID_EXPEDITE);
        // @trace REL-REQ-01
        guarantee CLASSIFY_EXPEDITED_REQUEST "Expedited service is derived locally only for VALID_EXPEDITE":
          (request_facts.request_expedited == T & request_boundary_facts.fresh_request == FreshRequest.VALID_EXPEDITE) |
          (request_facts.request_expedited == F & request_boundary_facts.fresh_request != FreshRequest.VALID_EXPEDITE);
    }*/
  }

  // @trace PART-06
  part def StockAssessment :> Thread {
    // @trace INT-02
    port material_boundary_facts : DataPort { in :>> type : MaterialBoundaryFacts; }
    // @trace INT-03
    port product_boundary_facts : DataPort { in :>> type : ProductBoundaryFacts; }
    // @trace INT-10
    port stock_facts : DataPort { out :>> type : StockFacts; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_STOCK_FACTS "Stock assessment initializes to invalid unusable and unavailable facts":
          stock_facts.material_band == MaterialBand.INVALID &
          stock_facts.material_usable == F &
          stock_facts.material_shortage == F &
          stock_facts.material_ready == F &
          stock_facts.product_band == ProductBand.INVALID &
          stock_facts.product_usable == F &
          stock_facts.product_available == F;

      compute
        // @trace REL-STOCK-01
        guarantee PRESERVE_RECEIVED_STOCK_FACTS "Assessment preserves both bands and both received usability classifications":
          stock_facts.material_band == material_boundary_facts.material_band &
          stock_facts.material_usable == material_boundary_facts.material_usable &
          stock_facts.product_band == product_boundary_facts.product_band &
          stock_facts.product_usable == product_boundary_facts.product_usable;
        // @trace REL-STOCK-01
        guarantee DERIVE_MATERIAL_SHORTAGE "Shortage requires received usability and the SHORT band":
          (stock_facts.material_shortage == T &
           material_boundary_facts.material_usable == T &
           material_boundary_facts.material_band == MaterialBand.SHORT) |
          (stock_facts.material_shortage == F &
           (material_boundary_facts.material_usable == F |
            material_boundary_facts.material_band != MaterialBand.SHORT));
        // @trace REL-STOCK-01
        guarantee DERIVE_MATERIAL_READINESS "Readiness requires received usability and the READY band":
          (stock_facts.material_ready == T &
           material_boundary_facts.material_usable == T &
           material_boundary_facts.material_band == MaterialBand.READY) |
          (stock_facts.material_ready == F &
           (material_boundary_facts.material_usable == F |
            material_boundary_facts.material_band != MaterialBand.READY));
        // @trace REL-STOCK-01
        guarantee DERIVE_PRODUCT_AVAILABILITY "Availability requires received usability and the AVAILABLE band":
          (stock_facts.product_available == T &
           product_boundary_facts.product_usable == T &
           product_boundary_facts.product_band == ProductBand.AVAILABLE) |
          (stock_facts.product_available == F &
           (product_boundary_facts.product_usable == F |
            product_boundary_facts.product_band != ProductBand.AVAILABLE));
    }*/
  }

  // @trace PART-07
  part def OutcomeQualification :> Thread {
    // @trace INT-07
    port outcome_boundary_facts : DataPort { in :>> type : OutcomeBoundaryFacts; }
    // @trace INT-22
    port prior_order_state : DataPort { in :>> type : OrderState; }
    // @trace INT-13
    port qualified_outcome : DataPort { out :>> type : QualifiedOutcome; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_QUALIFIED_OUTCOME "Outcome qualification initializes to no progress":
          qualified_outcome == QualifiedOutcome.NO_PROGRESS;

      compute
        compute_cases
          // @trace CASE-01
          case CASE_01_NO_PROGRESS "Received NO_EVENT with exact NONE derives NO_PROGRESS":
            assume outcome_boundary_facts.event_class == OutcomeEventClass.NO_EVENT &
                   outcome_boundary_facts.execution_outcome == ExecutionOutcome.NONE;
            guarantee qualified_outcome == QualifiedOutcome.NO_PROGRESS;
          // @trace CASE-02
          case CASE_02_FAILURE_OR_PHASE_FAULT "Failure or a success outside its admitted prior phase derives FAULT":
            assume outcome_boundary_facts.event_class == OutcomeEventClass.FAILURE |
                   (outcome_boundary_facts.event_class == OutcomeEventClass.SUCCESS &
                    ((outcome_boundary_facts.execution_outcome == ExecutionOutcome.QUOTE_OK &
                      prior_order_state != OrderState.IDLE) |
                     ((outcome_boundary_facts.execution_outcome == ExecutionOutcome.MATERIAL_OK |
                       outcome_boundary_facts.execution_outcome == ExecutionOutcome.PRODUCTION_OK |
                       outcome_boundary_facts.execution_outcome == ExecutionOutcome.DISPATCH_OK) &
                      prior_order_state != OrderState.OPEN)));
            guarantee qualified_outcome == QualifiedOutcome.FAULT;
          // @trace CASE-03
          case CASE_03_QUOTE_ACCEPTED "QUOTE_OK in IDLE derives QUOTE_ACCEPTED":
            assume outcome_boundary_facts.event_class == OutcomeEventClass.SUCCESS &
                   outcome_boundary_facts.execution_outcome == ExecutionOutcome.QUOTE_OK &
                   prior_order_state == OrderState.IDLE;
            guarantee qualified_outcome == QualifiedOutcome.QUOTE_ACCEPTED;
          // @trace CASE-04
          case CASE_04_MATERIAL_CONFIRMED "MATERIAL_OK in OPEN derives MATERIAL_CONFIRMED":
            assume outcome_boundary_facts.event_class == OutcomeEventClass.SUCCESS &
                   outcome_boundary_facts.execution_outcome == ExecutionOutcome.MATERIAL_OK &
                   prior_order_state == OrderState.OPEN;
            guarantee qualified_outcome == QualifiedOutcome.MATERIAL_CONFIRMED;
          // @trace CASE-05
          case CASE_05_PRODUCTION_COMPLETED "PRODUCTION_OK in OPEN derives PRODUCTION_COMPLETED":
            assume outcome_boundary_facts.event_class == OutcomeEventClass.SUCCESS &
                   outcome_boundary_facts.execution_outcome == ExecutionOutcome.PRODUCTION_OK &
                   prior_order_state == OrderState.OPEN;
            guarantee qualified_outcome == QualifiedOutcome.PRODUCTION_COMPLETED;
          // @trace CASE-06
          case CASE_06_DISPATCH_COMPLETED "DISPATCH_OK in OPEN derives DISPATCH_COMPLETED":
            assume outcome_boundary_facts.event_class == OutcomeEventClass.SUCCESS &
                   outcome_boundary_facts.execution_outcome == ExecutionOutcome.DISPATCH_OK &
                   prior_order_state == OrderState.OPEN;
            guarantee qualified_outcome == QualifiedOutcome.DISPATCH_COMPLETED;
    }*/
  }

  // @trace PART-08
  part def RecoveryControl :> Thread {
    // @trace INT-13
    port qualified_outcome : DataPort { in :>> type : QualifiedOutcome; }
    // @trace MON-REC-01
    port recovery_event : DataPort { in :>> type : RecoveryEvent; }
    // @trace INT-15
    port recovery_gate : DataPort { out :>> type : RecoveryGate; }
    // @trace INT-20
    port emergency_state : DataPort { out :>> type : EmergencyState; }
    // @trace INT-21
    port recovery_state : DataPort { out :>> type : RecoveryState; }

    language "GUMBO" /*{
      // @trace PART-08
      state
        retained_recovery: RecoveryState;

      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_RECOVERY_HEALTHY "Recovery initializes healthy with an open gate and no emergency":
          retained_recovery == RecoveryState.HEALTHY &
          recovery_state == RecoveryState.HEALTHY &
          recovery_gate == RecoveryGate.OPEN &
          emergency_state == EmergencyState.INACTIVE;

      compute
        // @trace FAULT-02
        guarantee RECOVERY_OUTPUTS_AGREE "Gate and emergency exactly reflect the derived recovery state":
          recovery_state == retained_recovery &
          ((retained_recovery == RecoveryState.HEALTHY &
            recovery_gate == RecoveryGate.OPEN &
            emergency_state == EmergencyState.INACTIVE) |
           (retained_recovery != RecoveryState.HEALTHY &
            recovery_gate == RecoveryGate.CLOSED &
            emergency_state == EmergencyState.ACTIVE));

        compute_cases
          // @trace CASE-07
          case CASE_07_FAULT_LATCHES "A fault dominates every prior state and recovery event":
            assume qualified_outcome == QualifiedOutcome.FAULT;
            guarantee retained_recovery == RecoveryState.LATCHED &
                      recovery_state == RecoveryState.LATCHED &
                      recovery_gate == RecoveryGate.CLOSED &
                      emergency_state == EmergencyState.ACTIVE;
          // @trace CASE-08
          case CASE_08_HEALTHY_REMAINS_HEALTHY "Without fault HEALTHY remains healthy regardless of recovery event":
            assume qualified_outcome != QualifiedOutcome.FAULT &
                   In(retained_recovery) == RecoveryState.HEALTHY;
            guarantee retained_recovery == RecoveryState.HEALTHY &
                      recovery_state == RecoveryState.HEALTHY &
                      recovery_gate == RecoveryGate.OPEN &
                      emergency_state == EmergencyState.INACTIVE;
          // @trace CASE-09
          case CASE_09_RESET_ENTERS_RECOVERING "RESET moves a nonfault LATCHED state to blocked RECOVERING":
            assume qualified_outcome != QualifiedOutcome.FAULT &
                   In(retained_recovery) == RecoveryState.LATCHED &
                   recovery_event == RecoveryEvent.RESET;
            guarantee retained_recovery == RecoveryState.RECOVERING &
                      recovery_state == RecoveryState.RECOVERING &
                      recovery_gate == RecoveryGate.CLOSED &
                      emergency_state == EmergencyState.ACTIVE;
          // @trace CASE-10
          case CASE_10_LATCHED_STUTTERS "Every other nonfault LATCHED input remains blocked":
            assume qualified_outcome != QualifiedOutcome.FAULT &
                   In(retained_recovery) == RecoveryState.LATCHED &
                   recovery_event != RecoveryEvent.RESET;
            guarantee retained_recovery == RecoveryState.LATCHED &
                      recovery_state == RecoveryState.LATCHED &
                      recovery_gate == RecoveryGate.CLOSED &
                      emergency_state == EmergencyState.ACTIVE;
          // @trace CASE-11
          case CASE_11_VERIFY_RELEASES "VERIFY_OK releases a nonfault RECOVERING state to HEALTHY":
            assume qualified_outcome != QualifiedOutcome.FAULT &
                   In(retained_recovery) == RecoveryState.RECOVERING &
                   recovery_event == RecoveryEvent.VERIFY_OK;
            guarantee retained_recovery == RecoveryState.HEALTHY &
                      recovery_state == RecoveryState.HEALTHY &
                      recovery_gate == RecoveryGate.OPEN &
                      emergency_state == EmergencyState.INACTIVE;
          // @trace CASE-12
          case CASE_12_RECOVERING_STUTTERS "Every other nonfault RECOVERING input remains blocked":
            assume qualified_outcome != QualifiedOutcome.FAULT &
                   In(retained_recovery) == RecoveryState.RECOVERING &
                   recovery_event != RecoveryEvent.VERIFY_OK;
            guarantee retained_recovery == RecoveryState.RECOVERING &
                      recovery_state == RecoveryState.RECOVERING &
                      recovery_gate == RecoveryGate.CLOSED &
                      emergency_state == EmergencyState.ACTIVE;
    }*/
  }

  // @trace PART-09
  part def OrderLifecycle :> Thread {
    // @trace INT-14
    port qualified_outcome : DataPort { in :>> type : QualifiedOutcome; }
    // @trace INT-15
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    // @trace INT-22
    port prior_order_state : DataPort { out :>> type : OrderState; }
    // @trace INT-23
    port order_state : DataPort { out :>> type : OrderState; }

    language "GUMBO" /*{
      // @trace PART-09
      state
        retained_order: OrderState;

      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_ORDER_IDLE "Order lifecycle initializes IDLE on both prior and current state ports":
          retained_order == OrderState.IDLE &
          prior_order_state == OrderState.IDLE &
          order_state == OrderState.IDLE;

      compute
        // @trace REL-LIFE-01
        guarantee DISTINCT_PRIOR_AND_CURRENT_PORTS "The prior port exposes In(retained_order) and the current port exposes the selected post-state":
          prior_order_state == In(retained_order) &
          order_state == retained_order;

        compute_cases
          // @trace CASE-01
          case CASE_01_OPEN_GATE_NO_PROGRESS "An open gate with no progress preserves order state":
            assume recovery_gate == RecoveryGate.OPEN &
                   qualified_outcome == QualifiedOutcome.NO_PROGRESS;
            guarantee retained_order == In(retained_order) & order_state == In(retained_order);
          // @trace CASE-02
          case CASE_02_CLOSED_GATE_FREEZE "A closed recovery gate freezes order state for every qualified outcome":
            assume recovery_gate == RecoveryGate.CLOSED;
            guarantee retained_order == In(retained_order) & order_state == In(retained_order);
          // @trace CASE-03
          case CASE_03_QUOTE_OPENS_ORDER "An accepted quote through an open gate moves the order to OPEN":
            assume recovery_gate == RecoveryGate.OPEN &
                   qualified_outcome == QualifiedOutcome.QUOTE_ACCEPTED;
            guarantee retained_order == OrderState.OPEN & order_state == OrderState.OPEN;
          // @trace CASE-04
          case CASE_04_MATERIAL_RETAINS_OPEN "Material confirmation through an open gate retains OPEN":
            assume recovery_gate == RecoveryGate.OPEN &
                   qualified_outcome == QualifiedOutcome.MATERIAL_CONFIRMED;
            guarantee retained_order == OrderState.OPEN & order_state == OrderState.OPEN;
          // @trace CASE-05
          case CASE_05_PRODUCTION_RETAINS_OPEN "Production completion through an open gate retains OPEN":
            assume recovery_gate == RecoveryGate.OPEN &
                   qualified_outcome == QualifiedOutcome.PRODUCTION_COMPLETED;
            guarantee retained_order == OrderState.OPEN & order_state == OrderState.OPEN;
          // @trace CASE-06
          case CASE_06_DISPATCH_CLOSES_ORDER "Dispatch completion through an open gate returns the order to IDLE":
            assume recovery_gate == RecoveryGate.OPEN &
                   qualified_outcome == QualifiedOutcome.DISPATCH_COMPLETED;
            guarantee retained_order == OrderState.IDLE & order_state == OrderState.IDLE;
    }*/
  }

  // @trace PART-10
  part def QuotationEligibility :> Thread {
    // @trace INT-08
    port request_facts : DataPort { in :>> type : RequestFacts; }
    // @trace INT-23
    port order_state : DataPort { in :>> type : OrderState; }
    // @trace INT-16
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    // @trace INT-28
    port proposal : DataPort { out :>> type : ProposalState; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_QUOTATION_NOT_PROPOSED "Quotation starts inhibited": proposal == ProposalState.NOT_PROPOSED;
      compute
        compute_cases
          // @trace CASE-13
          case CASE_13_QUOTATION_PROPOSED "Open gate plus IDLE and a locally valid request proposes quotation":
            assume recovery_gate == RecoveryGate.OPEN &
                   order_state == OrderState.IDLE &
                   request_facts.request_valid == T;
            guarantee proposal == ProposalState.PROPOSED;
          // @trace CASE-14
          case CASE_14_QUOTATION_NOT_PROPOSED "Every other quotation input is inhibited":
            assume recovery_gate != RecoveryGate.OPEN |
                   order_state != OrderState.IDLE |
                   request_facts.request_valid == F;
            guarantee proposal == ProposalState.NOT_PROPOSED;
    }*/
  }

  // @trace PART-11
  part def ProcurementEligibility :> Thread {
    // @trace INT-10
    port stock_facts : DataPort { in :>> type : StockFacts; }
    // @generated-support INT-04 received unchanged availability
    port supplier_available : DataPort { in :>> type : Base_Types::Boolean; }
    // @trace INT-24
    port order_state : DataPort { in :>> type : OrderState; }
    // @trace INT-17
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    // @trace INT-29
    port proposal : DataPort { out :>> type : ProposalState; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_PROCUREMENT_NOT_PROPOSED "Procurement starts inhibited": proposal == ProposalState.NOT_PROPOSED;
      compute
        compute_cases
          // @trace CASE-15
          case CASE_15_PROCUREMENT_PROPOSED "Open order with received usable shortage and Supplier acceptance proposes procurement":
            assume recovery_gate == RecoveryGate.OPEN &
                   order_state == OrderState.OPEN &
                   stock_facts.material_usable == T &
                   stock_facts.material_shortage == T &
                   supplier_available == T;
            guarantee proposal == ProposalState.PROPOSED;
          // @trace CASE-16
          case CASE_16_PROCUREMENT_NOT_PROPOSED "Every other procurement input is inhibited":
            assume recovery_gate != RecoveryGate.OPEN |
                   order_state != OrderState.OPEN |
                   stock_facts.material_usable == F |
                   stock_facts.material_shortage == F |
                   supplier_available == F;
            guarantee proposal == ProposalState.NOT_PROPOSED;
    }*/
  }

  // @trace PART-12
  part def ProductionEligibility :> Thread {
    // @trace INT-11
    port stock_facts : DataPort { in :>> type : StockFacts; }
    // @generated-support INT-05 received unchanged availability
    port production_available : DataPort { in :>> type : Base_Types::Boolean; }
    // @trace INT-25
    port order_state : DataPort { in :>> type : OrderState; }
    // @trace INT-18
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    // @trace INT-30
    port proposal : DataPort { out :>> type : ProposalState; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_PRODUCTION_NOT_PROPOSED "Production starts inhibited": proposal == ProposalState.NOT_PROPOSED;
      compute
        compute_cases
          // @trace CASE-17
          case CASE_17_PRODUCTION_PROPOSED "Open order with received usable readiness and production acceptance proposes production":
            assume recovery_gate == RecoveryGate.OPEN &
                   order_state == OrderState.OPEN &
                   stock_facts.material_usable == T &
                   stock_facts.material_ready == T &
                   production_available == T;
            guarantee proposal == ProposalState.PROPOSED;
          // @trace CASE-18
          case CASE_18_PRODUCTION_NOT_PROPOSED "Every other production input is inhibited":
            assume recovery_gate != RecoveryGate.OPEN |
                   order_state != OrderState.OPEN |
                   stock_facts.material_usable == F |
                   stock_facts.material_ready == F |
                   production_available == F;
            guarantee proposal == ProposalState.NOT_PROPOSED;
    }*/
  }

  // @trace PART-13
  part def DispatchEligibility :> Thread {
    // @trace INT-12
    port stock_facts : DataPort { in :>> type : StockFacts; }
    // @generated-support INT-06 received unchanged availability
    port dispatch_available : DataPort { in :>> type : Base_Types::Boolean; }
    // @trace INT-26
    port order_state : DataPort { in :>> type : OrderState; }
    // @trace INT-19
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    // @trace INT-31
    port proposal : DataPort { out :>> type : ProposalState; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_DISPATCH_NOT_PROPOSED "Dispatch starts inhibited": proposal == ProposalState.NOT_PROPOSED;
      compute
        compute_cases
          // @trace CASE-19
          case CASE_19_DISPATCH_PROPOSED "Open order with received usable product availability and dispatch acceptance proposes dispatch":
            assume recovery_gate == RecoveryGate.OPEN &
                   order_state == OrderState.OPEN &
                   stock_facts.product_usable == T &
                   stock_facts.product_available == T &
                   dispatch_available == T;
            guarantee proposal == ProposalState.PROPOSED;
          // @trace CASE-20
          case CASE_20_DISPATCH_NOT_PROPOSED "Every other dispatch input is inhibited":
            assume recovery_gate != RecoveryGate.OPEN |
                   order_state != OrderState.OPEN |
                   stock_facts.product_usable == F |
                   stock_facts.product_available == F |
                   dispatch_available == F;
            guarantee proposal == ProposalState.NOT_PROPOSED;
    }*/
  }

  // @trace PART-14
  part def ActionArbitration :> Thread {
    // @trace INT-20
    port emergency_state : DataPort { in :>> type : EmergencyState; }
    // @trace INT-28
    port quotation_proposal : DataPort { in :>> type : ProposalState; }
    // @trace INT-29
    port procurement_proposal : DataPort { in :>> type : ProposalState; }
    // @trace INT-30
    port production_proposal : DataPort { in :>> type : ProposalState; }
    // @trace INT-31
    port dispatch_proposal : DataPort { in :>> type : ProposalState; }
    // @trace INT-32
    port selected_action : DataPort { out :>> type : DispatchAction; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_ACTION_HOLD "Arbitration initializes to HOLD": selected_action == DispatchAction.HOLD;
      compute
        compute_cases
          // @trace CASE-21
          case CASE_21_EMERGENCY_HOLD "Active emergency dominates all ordinary proposals":
            assume emergency_state == EmergencyState.ACTIVE;
            guarantee selected_action == DispatchAction.HOLD;
          // @trace CASE-22
          case CASE_22_DISPATCH_PRIORITY "Without emergency dispatch dominates all lower proposals":
            assume emergency_state == EmergencyState.INACTIVE &
                   dispatch_proposal == ProposalState.PROPOSED;
            guarantee selected_action == DispatchAction.RELEASE_DISPATCH;
          // @trace CASE-23
          case CASE_23_PRODUCTION_PRIORITY "Production wins when emergency and dispatch are absent":
            assume emergency_state == EmergencyState.INACTIVE &
                   dispatch_proposal == ProposalState.NOT_PROPOSED &
                   production_proposal == ProposalState.PROPOSED;
            guarantee selected_action == DispatchAction.RELEASE_PRODUCTION;
          // @trace CASE-24
          case CASE_24_PROCUREMENT_PRIORITY "Procurement wins when emergency dispatch and production are absent":
            assume emergency_state == EmergencyState.INACTIVE &
                   dispatch_proposal == ProposalState.NOT_PROPOSED &
                   production_proposal == ProposalState.NOT_PROPOSED &
                   procurement_proposal == ProposalState.PROPOSED;
            guarantee selected_action == DispatchAction.ORDER_MATERIAL;
          // @trace CASE-25
          case CASE_25_QUOTATION_PRIORITY "Quotation wins only when every higher branch is absent":
            assume emergency_state == EmergencyState.INACTIVE &
                   dispatch_proposal == ProposalState.NOT_PROPOSED &
                   production_proposal == ProposalState.NOT_PROPOSED &
                   procurement_proposal == ProposalState.NOT_PROPOSED &
                   quotation_proposal == ProposalState.PROPOSED;
            guarantee selected_action == DispatchAction.ISSUE_QUOTE;
          // @trace CASE-26
          case CASE_26_NO_ELIGIBLE_WORK "No emergency and no proposal derives HOLD":
            assume emergency_state == EmergencyState.INACTIVE &
                   dispatch_proposal == ProposalState.NOT_PROPOSED &
                   production_proposal == ProposalState.NOT_PROPOSED &
                   procurement_proposal == ProposalState.NOT_PROPOSED &
                   quotation_proposal == ProposalState.NOT_PROPOSED;
            guarantee selected_action == DispatchAction.HOLD;
    }*/
  }

  // @trace PART-15
  part def StatusDerivation :> Thread {
    // @trace INT-32
    port selected_action : DataPort { in :>> type : DispatchAction; }
    // @trace INT-27
    port order_state : DataPort { in :>> type : OrderState; }
    // @trace INT-21
    port recovery_state : DataPort { in :>> type : RecoveryState; }
    // @trace INT-33
    port status_record : DataPort { out :>> type : DispatchStatusRecord; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_STATUS_MODE "Status mode initializes to HOLDING":
          status_record.mode == Mode.HOLDING;
        // @trace ASM-INIT-01
        guarantee INITIAL_STATUS_CAUSE "Status cause initializes to NO_ELIGIBLE_WORK":
          status_record.selected_cause == SelectedCause.NO_ELIGIBLE_WORK;
        // @trace ASM-INIT-01
        guarantee INITIAL_STATUS_ORDER "Status order initializes to IDLE":
          status_record.order_phase == OrderStatusValue.IDLE;
        // @trace ASM-INIT-01
        guarantee INITIAL_STATUS_RECOVERY "Status recovery initializes to HEALTHY":
          status_record.recovery_phase == RecoveryStatusValue.HEALTHY;

      compute
        // @trace REL-STAT-01
        guarantee MAP_STATUS_ORDER "Status carries the received current order state":
          (status_record.order_phase == OrderStatusValue.IDLE & order_state == OrderState.IDLE) |
          (status_record.order_phase == OrderStatusValue.OPEN & order_state == OrderState.OPEN);
        // @trace REL-STAT-01
        guarantee MAP_STATUS_RECOVERY "Status carries the received current recovery state":
          (status_record.recovery_phase == RecoveryStatusValue.HEALTHY & recovery_state == RecoveryState.HEALTHY) |
          (status_record.recovery_phase == RecoveryStatusValue.LATCHED & recovery_state == RecoveryState.LATCHED) |
          (status_record.recovery_phase == RecoveryStatusValue.RECOVERING & recovery_state == RecoveryState.RECOVERING);

        compute_cases
          // @trace REL-STAT-01
          case STATUS_FAULT_OR_RECOVERY "Every nonhealthy recovery state dominates action status":
            assume recovery_state != RecoveryState.HEALTHY;
            guarantee status_record.mode == Mode.FAULT &
                      status_record.selected_cause == SelectedCause.FAULT_OR_RECOVERY;
          // @trace REL-STAT-01
          case STATUS_QUOTING "Healthy ISSUE_QUOTE maps to quoting status":
            assume recovery_state == RecoveryState.HEALTHY & selected_action == DispatchAction.ISSUE_QUOTE;
            guarantee status_record.mode == Mode.QUOTING &
                      status_record.selected_cause == SelectedCause.QUOTE_AVAILABLE;
          // @trace REL-STAT-01
          case STATUS_PROCURING "Healthy ORDER_MATERIAL maps to procurement-priority status":
            assume recovery_state == RecoveryState.HEALTHY & selected_action == DispatchAction.ORDER_MATERIAL;
            guarantee status_record.mode == Mode.PROCURING &
                      status_record.selected_cause == SelectedCause.PROCUREMENT_PRIORITY;
          // @trace REL-STAT-01
          case STATUS_PRODUCING "Healthy RELEASE_PRODUCTION maps to production-priority status":
            assume recovery_state == RecoveryState.HEALTHY & selected_action == DispatchAction.RELEASE_PRODUCTION;
            guarantee status_record.mode == Mode.PRODUCING &
                      status_record.selected_cause == SelectedCause.PRODUCTION_PRIORITY;
          // @trace REL-STAT-01
          case STATUS_DISPATCHING "Healthy RELEASE_DISPATCH maps to dispatch-priority status":
            assume recovery_state == RecoveryState.HEALTHY & selected_action == DispatchAction.RELEASE_DISPATCH;
            guarantee status_record.mode == Mode.DISPATCHING &
                      status_record.selected_cause == SelectedCause.DISPATCH_PRIORITY;
          // @trace REL-STAT-01
          case STATUS_HOLDING "Healthy HOLD maps to no-eligible-work status":
            assume recovery_state == RecoveryState.HEALTHY & selected_action == DispatchAction.HOLD;
            guarantee status_record.mode == Mode.HOLDING &
                      status_record.selected_cause == SelectedCause.NO_ELIGIBLE_WORK;
    }*/
  }

  // @trace PART-16
  part def PublicComposition :> Thread {
    // @trace INT-09
    port request_facts : DataPort { in :>> type : RequestFacts; }
    // @trace INT-34
    port selected_action : DataPort { in :>> type : DispatchAction; }
    // @trace INT-33
    port status_record : DataPort { in :>> type : DispatchStatusRecord; }
    // @trace CTRL-PUB-01
    port public_result : DataPort { out :>> type : DispatchPublicResult; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_PUBLIC_ACTION "Public action initializes to HOLD":
          public_result.published_action == PublishedAction.HOLD;
        // @trace ASM-INIT-01
        guarantee INITIAL_PUBLIC_CAUSE "Public cause initializes to NO_ELIGIBLE_WORK":
          public_result.selected_cause == SelectedCause.NO_ELIGIBLE_WORK;
        // @trace ASM-INIT-01
        guarantee INITIAL_PUBLIC_MODE "Public mode initializes to HOLDING":
          public_result.mode == Mode.HOLDING;
        // @trace ASM-INIT-01
        guarantee INITIAL_PUBLIC_ORDER "Public order initializes to IDLE":
          public_result.published_order == PublishedOrderState.IDLE;
        // @trace ASM-INIT-01
        guarantee INITIAL_PUBLIC_RECOVERY "Public recovery initializes to HEALTHY":
          public_result.published_recovery == PublishedRecoveryState.HEALTHY;
        // @trace ASM-INIT-01
        guarantee INITIAL_PUBLIC_DISPOSITION "Public disposition initializes to NO_REQUEST":
          public_result.request_disposition == RequestDisposition.NO_REQUEST;

      compute
        // @trace REL-COMP-01
        guarantee COMPOSE_PUBLIC_ACTION "The public tuple carries the received selected action":
          (public_result.published_action == PublishedAction.HOLD & selected_action == DispatchAction.HOLD) |
          (public_result.published_action == PublishedAction.ISSUE_QUOTE & selected_action == DispatchAction.ISSUE_QUOTE) |
          (public_result.published_action == PublishedAction.ORDER_MATERIAL & selected_action == DispatchAction.ORDER_MATERIAL) |
          (public_result.published_action == PublishedAction.RELEASE_PRODUCTION & selected_action == DispatchAction.RELEASE_PRODUCTION) |
          (public_result.published_action == PublishedAction.RELEASE_DISPATCH & selected_action == DispatchAction.RELEASE_DISPATCH);
        // @trace REL-COMP-01
        guarantee COMPOSE_PUBLIC_CAUSE "The public tuple carries the received status cause":
          public_result.selected_cause == status_record.selected_cause;
        // @trace REL-COMP-01
        guarantee COMPOSE_PUBLIC_MODE "The public tuple carries the received status mode":
          public_result.mode == status_record.mode;
        // @trace REL-COMP-01
        guarantee COMPOSE_PUBLIC_ORDER "The public tuple carries the received status order":
          (public_result.published_order == PublishedOrderState.IDLE & status_record.order_phase == OrderStatusValue.IDLE) |
          (public_result.published_order == PublishedOrderState.OPEN & status_record.order_phase == OrderStatusValue.OPEN);
        // @trace REL-COMP-01
        guarantee COMPOSE_PUBLIC_RECOVERY "The public tuple carries the received status recovery":
          (public_result.published_recovery == PublishedRecoveryState.HEALTHY & status_record.recovery_phase == RecoveryStatusValue.HEALTHY) |
          (public_result.published_recovery == PublishedRecoveryState.LATCHED & status_record.recovery_phase == RecoveryStatusValue.LATCHED) |
          (public_result.published_recovery == PublishedRecoveryState.RECOVERING & status_record.recovery_phase == RecoveryStatusValue.RECOVERING);

        compute_cases
          // @trace CASE-27
          case CASE_27_NO_REQUEST "NONE derives NO_REQUEST without changing the selected action":
            assume request_facts.fresh_request == FreshRequest.NONE;
            guarantee public_result.request_disposition == RequestDisposition.NO_REQUEST;
          // @trace CASE-28
          case CASE_28_INVALID_REQUEST "INVALID derives REJECTED regardless of selected action":
            assume request_facts.fresh_request == FreshRequest.INVALID;
            guarantee public_result.request_disposition == RequestDisposition.REJECTED;
          // @trace CASE-29
          case CASE_29_QUOTED "A locally valid request with ISSUE_QUOTE derives QUOTED":
            assume request_facts.request_valid == T &
                   selected_action == DispatchAction.ISSUE_QUOTE;
            guarantee public_result.request_disposition == RequestDisposition.QUOTED;
          // @trace CASE-30
          case CASE_30_DEFERRED "A locally valid request with any other action derives DEFERRED":
            assume request_facts.request_valid == T &
                   selected_action != DispatchAction.ISSUE_QUOTE;
            guarantee public_result.request_disposition == RequestDisposition.DEFERRED;
    }*/
  }

  // @trace BOUND-01
  part def FactoryDispatchCoordinatorProcess :> Process {
    // @trace MON-REQ-01
    port freshRequest : DataPort { in :>> type : FreshRequest; }
    // @trace MON-INV-01
    port inventorySnapshot : DataPort { in :>> type : InventorySnapshot; }
    // @trace MON-CAP-01
    port capabilitySnapshot : DataPort { in :>> type : CapabilitySnapshot; }
    // @trace MON-OUT-01
    port executionOutcome : DataPort { in :>> type : ExecutionOutcome; }
    // @trace MON-REC-01
    port recoveryEvent : DataPort { in :>> type : RecoveryEvent; }
    // @trace CTRL-PUB-01
    port publicResult : DataPort { out :>> type : DispatchPublicResult; }

    // @trace PART-01
    part customer_request_acquisition : CustomerRequestAcquisition;
    // @trace PART-02
    part inventory_acquisition : InventoryAcquisition;
    // @generated-support PART-03 behavior-free splitter usage
    part capability_acquisition : CapabilityAcquisition;
    // @trace PART-04
    part execution_outcome_acquisition : ExecutionOutcomeAcquisition;
    // @trace PART-05
    part request_qualification : RequestQualification;
    // @trace PART-06
    part stock_assessment : StockAssessment;
    // @trace PART-07
    part outcome_qualification : OutcomeQualification;
    // @trace PART-08
    part recovery_control : RecoveryControl;
    // @trace PART-09
    part order_lifecycle : OrderLifecycle;
    // @trace PART-10
    part quotation_eligibility : QuotationEligibility;
    // @trace PART-11
    part procurement_eligibility : ProcurementEligibility;
    // @trace PART-12
    part production_eligibility : ProductionEligibility;
    // @trace PART-13
    part dispatch_eligibility : DispatchEligibility;
    // @trace PART-14
    part action_arbitration : ActionArbitration;
    // @trace PART-15
    part status_derivation : StatusDerivation;
    // @trace PART-16
    part public_composition : PublicComposition;

    // @generated-support BND-INT-01 root delegation
    connection boundary_fresh_request : PortConnection connect freshRequest to customer_request_acquisition.fresh_request;
    // @generated-support BND-INT-01 root delegation
    connection boundary_inventory_snapshot : PortConnection connect inventorySnapshot to inventory_acquisition.inventory_snapshot;
    // @generated-support BND-INT-01 root delegation
    connection boundary_capability_snapshot : PortConnection connect capabilitySnapshot to capability_acquisition.capability_snapshot;
    // @generated-support BND-INT-01 root delegation
    connection boundary_execution_outcome : PortConnection connect executionOutcome to execution_outcome_acquisition.execution_outcome;
    // @generated-support BND-INT-01 root delegation
    connection boundary_recovery_event : PortConnection connect recoveryEvent to recovery_control.recovery_event;
    // @generated-support BND-INT-01 root delegation
    connection boundary_public_result : PortConnection connect public_composition.public_result to publicResult;

    // @trace INT-01
    connection request_boundary_to_qualification : PortConnection connect customer_request_acquisition.request_boundary_facts to request_qualification.request_boundary_facts;
    // @trace INT-02
    connection material_boundary_to_stock : PortConnection connect inventory_acquisition.material_boundary_facts to stock_assessment.material_boundary_facts;
    // @trace INT-03
    connection product_boundary_to_stock : PortConnection connect inventory_acquisition.product_boundary_facts to stock_assessment.product_boundary_facts;
    // @generated-support INT-04 unchanged splitter route
    connection supplier_availability_route : PortConnection connect capability_acquisition.supplier_available to procurement_eligibility.supplier_available;
    // @generated-support INT-05 unchanged splitter route
    connection production_availability_route : PortConnection connect capability_acquisition.production_available to production_eligibility.production_available;
    // @generated-support INT-06 unchanged splitter route
    connection dispatch_availability_route : PortConnection connect capability_acquisition.dispatch_available to dispatch_eligibility.dispatch_available;
    // @trace INT-07
    connection outcome_boundary_to_qualification : PortConnection connect execution_outcome_acquisition.outcome_boundary_facts to outcome_qualification.outcome_boundary_facts;
    // @trace INT-08
    connection request_facts_to_quotation : PortConnection connect request_qualification.request_facts to quotation_eligibility.request_facts;
    // @trace INT-09
    connection request_facts_to_composition : PortConnection connect request_qualification.request_facts to public_composition.request_facts;
    // @trace INT-10
    connection stock_facts_to_procurement : PortConnection connect stock_assessment.stock_facts to procurement_eligibility.stock_facts;
    // @trace INT-11
    connection stock_facts_to_production : PortConnection connect stock_assessment.stock_facts to production_eligibility.stock_facts;
    // @trace INT-12
    connection stock_facts_to_dispatch : PortConnection connect stock_assessment.stock_facts to dispatch_eligibility.stock_facts;
    // @trace INT-13
    connection qualified_outcome_to_recovery : PortConnection connect outcome_qualification.qualified_outcome to recovery_control.qualified_outcome;
    // @trace INT-14
    connection qualified_outcome_to_lifecycle : PortConnection connect outcome_qualification.qualified_outcome to order_lifecycle.qualified_outcome;
    // @trace INT-15
    connection recovery_gate_to_lifecycle : PortConnection connect recovery_control.recovery_gate to order_lifecycle.recovery_gate;
    // @trace INT-16
    connection recovery_gate_to_quotation : PortConnection connect recovery_control.recovery_gate to quotation_eligibility.recovery_gate;
    // @trace INT-17
    connection recovery_gate_to_procurement : PortConnection connect recovery_control.recovery_gate to procurement_eligibility.recovery_gate;
    // @trace INT-18
    connection recovery_gate_to_production : PortConnection connect recovery_control.recovery_gate to production_eligibility.recovery_gate;
    // @trace INT-19
    connection recovery_gate_to_dispatch : PortConnection connect recovery_control.recovery_gate to dispatch_eligibility.recovery_gate;
    // @trace INT-20
    connection emergency_to_arbitration : PortConnection connect recovery_control.emergency_state to action_arbitration.emergency_state;
    // @trace INT-21
    connection recovery_state_to_status : PortConnection connect recovery_control.recovery_state to status_derivation.recovery_state;
    // @trace INT-22
    connection prior_order_to_outcome : PortConnection connect order_lifecycle.prior_order_state to outcome_qualification.prior_order_state;
    // @trace INT-23
    connection current_order_to_quotation : PortConnection connect order_lifecycle.order_state to quotation_eligibility.order_state;
    // @trace INT-24
    connection current_order_to_procurement : PortConnection connect order_lifecycle.order_state to procurement_eligibility.order_state;
    // @trace INT-25
    connection current_order_to_production : PortConnection connect order_lifecycle.order_state to production_eligibility.order_state;
    // @trace INT-26
    connection current_order_to_dispatch : PortConnection connect order_lifecycle.order_state to dispatch_eligibility.order_state;
    // @trace INT-27
    connection current_order_to_status : PortConnection connect order_lifecycle.order_state to status_derivation.order_state;
    // @trace INT-28
    connection quotation_proposal_to_arbitration : PortConnection connect quotation_eligibility.proposal to action_arbitration.quotation_proposal;
    // @trace INT-29
    connection procurement_proposal_to_arbitration : PortConnection connect procurement_eligibility.proposal to action_arbitration.procurement_proposal;
    // @trace INT-30
    connection production_proposal_to_arbitration : PortConnection connect production_eligibility.proposal to action_arbitration.production_proposal;
    // @trace INT-31
    connection dispatch_proposal_to_arbitration : PortConnection connect dispatch_eligibility.proposal to action_arbitration.dispatch_proposal;
    // @trace INT-32
    connection selected_action_to_status : PortConnection connect action_arbitration.selected_action to status_derivation.selected_action;
    // @trace INT-33
    connection status_to_composition : PortConnection connect status_derivation.status_record to public_composition.status_record;
    // @trace INT-34
    connection selected_action_to_composition : PortConnection connect action_arbitration.selected_action to public_composition.selected_action;
  }

  // @trace BOUND-01
  part def FactoryDispatchCoordinatorSystem :> System {
    // @trace MON-REQ-01
    port freshRequest : DataPort { in :>> type : FreshRequest; }
    // @trace MON-INV-01
    port inventorySnapshot : DataPort { in :>> type : InventorySnapshot; }
    // @trace MON-CAP-01
    port capabilitySnapshot : DataPort { in :>> type : CapabilitySnapshot; }
    // @trace MON-OUT-01
    port executionOutcome : DataPort { in :>> type : ExecutionOutcome; }
    // @trace MON-REC-01
    port recoveryEvent : DataPort { in :>> type : RecoveryEvent; }
    // @trace CTRL-PUB-01
    port publicResult : DataPort { out :>> type : DispatchPublicResult; }

    // @generated-support SUPPORT-01 sole cohesive Process grouping
    part coordinator_process : FactoryDispatchCoordinatorProcess;

    // @generated-support BND-INT-01 transparent outer exposure; counted delegation is inside the Process
    interface expose_fresh_request : BoundaryExposure connect
      outer ::> freshRequest to inner ::> coordinator_process.fresh_request;
    // @generated-support BND-INT-01 transparent outer exposure; counted delegation is inside the Process
    interface expose_inventory_snapshot : BoundaryExposure connect
      outer ::> inventorySnapshot to inner ::> coordinator_process.inventorySnapshot;
    // @generated-support BND-INT-01 transparent outer exposure; counted delegation is inside the Process
    interface expose_capability_snapshot : BoundaryExposure connect
      outer ::> capabilitySnapshot to inner ::> coordinator_process.capabilitySnapshot;
    // @generated-support BND-INT-01 transparent outer exposure; counted delegation is inside the Process
    interface expose_execution_outcome : BoundaryExposure connect
      outer ::> executionOutcome to inner ::> coordinator_process.execution_outcome;
    // @generated-support BND-INT-01 transparent outer exposure; counted delegation is inside the Process
    interface expose_recovery_event : BoundaryExposure connect
      outer ::> recoveryEvent to inner ::> coordinator_process.recoveryEvent;
    // @generated-support BND-INT-01 transparent outer exposure; counted delegation is inside the Process
    interface expose_public_result : BoundaryExposure connect
      outer ::> coordinator_process.publicResult to inner ::> publicResult;
  }

  // @trace BOUND-01
  part factory_dispatch_coordinator : FactoryDispatchCoordinatorSystem;
}
