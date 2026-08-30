package Factory_Dispatch_Coordinator {

  private import HAMR::*;

  // @trace MON-01
  enum def Dispatch_Request_Event {
    enum No_Request;
    enum Request_Shipment;
  }

  // @trace MON-01
  enum def Input_Status {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-02
  enum def Product_Availability {
    enum Unavailable;
    enum Available;
  }

  // @trace MON-03
  enum def Dispatch_Outcome {
    enum No_Report;
    enum Shipment_Accepted;
  }

  // @trace CTRL-01
  enum def Shipment_Release_Command {
    enum Hold;
    enum Release;
  }

  // @trace CTRL-02
  enum def Dispatch_Status {
    enum Idle;
    enum Waiting_Product;
    enum Release_Issued;
    enum Shipment_Acknowledged;
    enum Unexpected_Outcome;
    enum Input_Fault;
    enum Recovery_Awaiting_Neutral;
  }

  // @trace CTRL-03
  enum def Shipping_Confirmation {
    enum Not_Issued;
    enum Issued;
  }

  // @trace PART-01
  enum def Qualified_Request {
    enum Invalid_Request;
    enum No_Qualified_Request;
    enum Qualified_Shipment_Request;
  }

  // @trace PART-02
  enum def Availability_Assessment_Value {
    enum Invalid_Availability;
    enum Product_Unavailable;
    enum Product_Available;
  }

  // @trace PART-03
  enum def Qualified_Outcome {
    enum Invalid_Outcome;
    enum No_Qualified_Report;
    enum Qualified_Shipment_Accepted;
  }

  // @trace STATE-01
  enum def Dispatch_Phase {
    enum Idle;
    enum Awaiting_Product;
    enum Release_Outstanding;
  }

  // @trace PART-04
  enum def Dispatch_Disposition {
    enum Input_Fault;
    enum Recovery_Blocked;
    enum Recovery_Cleared;
    enum Shipment_Acknowledged;
    enum Unexpected_Outcome;
    enum Release_From_Idle;
    enum Queue_For_Product;
    enum Release_From_Queue;
    enum Hold_Position;
  }

  // Every member below is an attribute because GUMBO inspects it.
  // @trace MON-01
  part def Dispatch_Request_Sample :> Data {
    // @trace MON-01
    attribute 'event' : Dispatch_Request_Event;
    // @trace MON-01
    attribute status : Input_Status;
  }

  // @trace MON-02
  part def Product_Availability_Sample :> Data {
    // @trace MON-02
    attribute availability : Product_Availability;
    // @trace MON-02
    attribute status : Input_Status;
  }

  // @trace MON-03
  part def Dispatch_Outcome_Sample :> Data {
    // @trace MON-03
    attribute outcome : Dispatch_Outcome;
    // @trace MON-03
    attribute status : Input_Status;
  }

  // @trace PART-04
  part def Dispatch_Resolution :> Data {
    // @trace STATE-01
    attribute next_phase : Dispatch_Phase;
    // @trace STATE-01
    attribute next_recovery_required : Base_Types::Boolean;
    // @trace PART-04
    attribute disposition : Dispatch_Disposition;
  }

  // @trace PART-01
  part def Request_Qualification :> Thread {
    // @trace INT-01
    port raw_request : DataPort { in :>> type : Dispatch_Request_Sample; }
    // @trace INT-02
    port qualified_request : DataPort { out :>> type : Qualified_Request; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_REQUEST_INVALID "The request fact starts untrusted until a sample is qualified":
          qualified_request == Qualified_Request.Invalid_Request;

      compute
        compute_cases
          // @trace QUAL-REQ-01
          case REQUEST_INVALID "Either invalid-status raw request derives Invalid_Request":
            assume raw_request.status == Input_Status.Invalid;
            guarantee qualified_request == Qualified_Request.Invalid_Request;
          // @trace QUAL-REQ-01
          case REQUEST_NEUTRAL "A valid No_Request derives No_Qualified_Request":
            assume raw_request.status == Input_Status.Valid &
                   raw_request.'event' == Dispatch_Request_Event.No_Request;
            guarantee qualified_request == Qualified_Request.No_Qualified_Request;
          // @trace QUAL-REQ-01
          case REQUEST_SHIPMENT "A valid Request_Shipment derives Qualified_Shipment_Request":
            assume raw_request.status == Input_Status.Valid &
                   raw_request.'event' == Dispatch_Request_Event.Request_Shipment;
            guarantee qualified_request == Qualified_Request.Qualified_Shipment_Request;
    }*/
  }

  // @trace PART-02
  part def Availability_Assessment :> Thread {
    // @trace INT-03
    port raw_availability : DataPort { in :>> type : Product_Availability_Sample; }
    // @trace INT-04
    port availability_assessment : DataPort { out :>> type : Availability_Assessment_Value; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_AVAILABILITY_INVALID "The availability fact starts untrusted until a sample is assessed":
          availability_assessment == Availability_Assessment_Value.Invalid_Availability;

      compute
        compute_cases
          // @trace QUAL-AVL-01
          case AVAILABILITY_INVALID "Either invalid-status raw availability derives Invalid_Availability":
            assume raw_availability.status == Input_Status.Invalid;
            guarantee availability_assessment == Availability_Assessment_Value.Invalid_Availability;
          // @trace QUAL-AVL-01
          case PRODUCT_UNAVAILABLE "Valid Unavailable derives Product_Unavailable":
            assume raw_availability.status == Input_Status.Valid &
                   raw_availability.availability == Product_Availability.Unavailable;
            guarantee availability_assessment == Availability_Assessment_Value.Product_Unavailable;
          // @trace QUAL-AVL-01
          case PRODUCT_AVAILABLE "Valid Available derives Product_Available":
            assume raw_availability.status == Input_Status.Valid &
                   raw_availability.availability == Product_Availability.Available;
            guarantee availability_assessment == Availability_Assessment_Value.Product_Available;
    }*/
  }

  // @trace PART-03
  part def Outcome_Qualification :> Thread {
    // @trace INT-05
    port raw_outcome : DataPort { in :>> type : Dispatch_Outcome_Sample; }
    // @trace INT-06
    port qualified_outcome : DataPort { out :>> type : Qualified_Outcome; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_OUTCOME_INVALID "The outcome fact starts untrusted until a sample is qualified":
          qualified_outcome == Qualified_Outcome.Invalid_Outcome;

      compute
        compute_cases
          // @trace QUAL-OUT-01
          case OUTCOME_INVALID "Either invalid-status raw outcome derives Invalid_Outcome":
            assume raw_outcome.status == Input_Status.Invalid;
            guarantee qualified_outcome == Qualified_Outcome.Invalid_Outcome;
          // @trace QUAL-OUT-01
          case OUTCOME_NEUTRAL "A valid No_Report derives No_Qualified_Report":
            assume raw_outcome.status == Input_Status.Valid &
                   raw_outcome.outcome == Dispatch_Outcome.No_Report;
            guarantee qualified_outcome == Qualified_Outcome.No_Qualified_Report;
          // @trace QUAL-OUT-01
          case OUTCOME_ACCEPTED "A valid Shipment_Accepted derives Qualified_Shipment_Accepted":
            assume raw_outcome.status == Input_Status.Valid &
                   raw_outcome.outcome == Dispatch_Outcome.Shipment_Accepted;
            guarantee qualified_outcome == Qualified_Outcome.Qualified_Shipment_Accepted;
    }*/
  }

  // @trace PART-04
  part def Dispatch_Decision_Owner :> Thread {
    // @trace INT-02
    port qualified_request : DataPort { in :>> type : Qualified_Request; }
    // @trace INT-04
    port availability_assessment : DataPort { in :>> type : Availability_Assessment_Value; }
    // @trace INT-06
    port qualified_outcome : DataPort { in :>> type : Qualified_Outcome; }
    // @trace INT-07
    port release_resolution : DataPort { out :>> type : Dispatch_Resolution; }
    // @trace INT-08
    port notice_resolution : DataPort { out :>> type : Dispatch_Resolution; }

    // @trace OWNER-01
    language "GUMBO" /*{
      // @trace STATE-01
      state
        current_phase: Dispatch_Phase;
        recovery_required: Base_Types::Boolean;

      initialize
        // @trace INIT-01
        guarantee INITIAL_OWNER_STATE_AND_RESOLUTION "The sole owner initializes safe state and complete hold resolutions":
          current_phase == Dispatch_Phase.Idle &
          recovery_required == F &
          release_resolution.next_phase == Dispatch_Phase.Idle &
          release_resolution.next_recovery_required == F &
          release_resolution.disposition == Dispatch_Disposition.Hold_Position &
          notice_resolution.next_phase == Dispatch_Phase.Idle &
          notice_resolution.next_recovery_required == F &
          notice_resolution.disposition == Dispatch_Disposition.Hold_Position;

      compute
        // @trace INVAR-01
        guarantee OWNER_STATE_AND_RESOLUTIONS_AGREE "Recovery implies Idle and both published resolutions carry the complete selected post-state":
          '->:'(recovery_required, current_phase == Dispatch_Phase.Idle) &
          release_resolution.next_phase == current_phase &
          release_resolution.next_recovery_required == recovery_required &
          notice_resolution.next_phase == current_phase &
          notice_resolution.next_recovery_required == recovery_required &
          release_resolution.disposition == notice_resolution.disposition;

        compute_cases
          // @trace CASE-01
          case CASE_01_INPUT_FAULT "Any invalid qualified input has top priority and enters recovery":
            assume qualified_request == Qualified_Request.Invalid_Request |
                   availability_assessment == Availability_Assessment_Value.Invalid_Availability |
                   qualified_outcome == Qualified_Outcome.Invalid_Outcome;
            guarantee current_phase == Dispatch_Phase.Idle &
                      recovery_required == T &
                      release_resolution.next_phase == Dispatch_Phase.Idle &
                      release_resolution.next_recovery_required == T &
                      release_resolution.disposition == Dispatch_Disposition.Input_Fault &
                      notice_resolution.next_phase == Dispatch_Phase.Idle &
                      notice_resolution.next_recovery_required == T &
                      notice_resolution.disposition == Dispatch_Disposition.Input_Fault;

          // @trace CASE-02
          case CASE_02_RECOVERY_BLOCKED "A valid nonneutral request or outcome cannot be replayed during recovery":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   availability_assessment != Availability_Assessment_Value.Invalid_Availability &
                   qualified_outcome != Qualified_Outcome.Invalid_Outcome &
                   In(recovery_required) == T &
                   (qualified_request != Qualified_Request.No_Qualified_Request |
                    qualified_outcome != Qualified_Outcome.No_Qualified_Report);
            guarantee current_phase == Dispatch_Phase.Idle &
                      recovery_required == T &
                      release_resolution.next_phase == Dispatch_Phase.Idle &
                      release_resolution.next_recovery_required == T &
                      release_resolution.disposition == Dispatch_Disposition.Recovery_Blocked &
                      notice_resolution.next_phase == Dispatch_Phase.Idle &
                      notice_resolution.next_recovery_required == T &
                      notice_resolution.disposition == Dispatch_Disposition.Recovery_Blocked;

          // @trace CASE-03
          case CASE_03_RECOVERY_CLEARED "Valid neutral request and outcome clear recovery without dispatch":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   availability_assessment != Availability_Assessment_Value.Invalid_Availability &
                   qualified_outcome != Qualified_Outcome.Invalid_Outcome &
                   In(recovery_required) == T &
                   qualified_request == Qualified_Request.No_Qualified_Request &
                   qualified_outcome == Qualified_Outcome.No_Qualified_Report;
            guarantee current_phase == Dispatch_Phase.Idle &
                      recovery_required == F &
                      release_resolution.next_phase == Dispatch_Phase.Idle &
                      release_resolution.next_recovery_required == F &
                      release_resolution.disposition == Dispatch_Disposition.Recovery_Cleared &
                      notice_resolution.next_phase == Dispatch_Phase.Idle &
                      notice_resolution.next_recovery_required == F &
                      notice_resolution.disposition == Dispatch_Disposition.Recovery_Cleared;

          // @trace CASE-04
          case CASE_04_EXPECTED_ACCEPTANCE "Acceptance while release is outstanding acknowledges shipment before a simultaneous request":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   availability_assessment != Availability_Assessment_Value.Invalid_Availability &
                   qualified_outcome != Qualified_Outcome.Invalid_Outcome &
                   In(recovery_required) == F &
                   In(current_phase) == Dispatch_Phase.Release_Outstanding &
                   qualified_outcome == Qualified_Outcome.Qualified_Shipment_Accepted;
            guarantee current_phase == Dispatch_Phase.Idle &
                      recovery_required == F &
                      release_resolution.next_phase == Dispatch_Phase.Idle &
                      release_resolution.next_recovery_required == F &
                      release_resolution.disposition == Dispatch_Disposition.Shipment_Acknowledged &
                      notice_resolution.next_phase == Dispatch_Phase.Idle &
                      notice_resolution.next_recovery_required == F &
                      notice_resolution.disposition == Dispatch_Disposition.Shipment_Acknowledged;

          // @trace CASE-05
          case CASE_05_UNEXPECTED_ACCEPTANCE "Acceptance in Idle or Awaiting_Product is unexpected and preserves phase":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   availability_assessment != Availability_Assessment_Value.Invalid_Availability &
                   qualified_outcome != Qualified_Outcome.Invalid_Outcome &
                   In(recovery_required) == F &
                   In(current_phase) != Dispatch_Phase.Release_Outstanding &
                   qualified_outcome == Qualified_Outcome.Qualified_Shipment_Accepted;
            guarantee current_phase == In(current_phase) &
                      recovery_required == F &
                      release_resolution.next_phase == In(current_phase) &
                      release_resolution.next_recovery_required == F &
                      release_resolution.disposition == Dispatch_Disposition.Unexpected_Outcome &
                      notice_resolution.next_phase == In(current_phase) &
                      notice_resolution.next_recovery_required == F &
                      notice_resolution.disposition == Dispatch_Disposition.Unexpected_Outcome;

          // @trace CASE-06
          case CASE_06_RELEASE_FROM_IDLE "A fresh available request in Idle issues one release":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   availability_assessment != Availability_Assessment_Value.Invalid_Availability &
                   qualified_outcome == Qualified_Outcome.No_Qualified_Report &
                   In(recovery_required) == F &
                   In(current_phase) == Dispatch_Phase.Idle &
                   qualified_request == Qualified_Request.Qualified_Shipment_Request &
                   availability_assessment == Availability_Assessment_Value.Product_Available;
            guarantee current_phase == Dispatch_Phase.Release_Outstanding &
                      recovery_required == F &
                      release_resolution.next_phase == Dispatch_Phase.Release_Outstanding &
                      release_resolution.next_recovery_required == F &
                      release_resolution.disposition == Dispatch_Disposition.Release_From_Idle &
                      notice_resolution.next_phase == Dispatch_Phase.Release_Outstanding &
                      notice_resolution.next_recovery_required == F &
                      notice_resolution.disposition == Dispatch_Disposition.Release_From_Idle;

          // @trace CASE-07
          case CASE_07_QUEUE_FOR_PRODUCT "A fresh unavailable request in Idle waits for product":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   availability_assessment != Availability_Assessment_Value.Invalid_Availability &
                   qualified_outcome == Qualified_Outcome.No_Qualified_Report &
                   In(recovery_required) == F &
                   In(current_phase) == Dispatch_Phase.Idle &
                   qualified_request == Qualified_Request.Qualified_Shipment_Request &
                   availability_assessment == Availability_Assessment_Value.Product_Unavailable;
            guarantee current_phase == Dispatch_Phase.Awaiting_Product &
                      recovery_required == F &
                      release_resolution.next_phase == Dispatch_Phase.Awaiting_Product &
                      release_resolution.next_recovery_required == F &
                      release_resolution.disposition == Dispatch_Disposition.Queue_For_Product &
                      notice_resolution.next_phase == Dispatch_Phase.Awaiting_Product &
                      notice_resolution.next_recovery_required == F &
                      notice_resolution.disposition == Dispatch_Disposition.Queue_For_Product;

          // @trace CASE-08
          case CASE_08_RELEASE_FROM_QUEUE "Availability of queued product issues one release without another request":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   availability_assessment == Availability_Assessment_Value.Product_Available &
                   qualified_outcome == Qualified_Outcome.No_Qualified_Report &
                   In(recovery_required) == F &
                   In(current_phase) == Dispatch_Phase.Awaiting_Product;
            guarantee current_phase == Dispatch_Phase.Release_Outstanding &
                      recovery_required == F &
                      release_resolution.next_phase == Dispatch_Phase.Release_Outstanding &
                      release_resolution.next_recovery_required == F &
                      release_resolution.disposition == Dispatch_Disposition.Release_From_Queue &
                      notice_resolution.next_phase == Dispatch_Phase.Release_Outstanding &
                      notice_resolution.next_recovery_required == F &
                      notice_resolution.disposition == Dispatch_Disposition.Release_From_Queue;

          // @trace CASE-09
          case CASE_09_HOLD_POSITION "Every remaining valid nonrecovery snapshot preserves phase":
            assume qualified_request != Qualified_Request.Invalid_Request &
                   availability_assessment != Availability_Assessment_Value.Invalid_Availability &
                   qualified_outcome == Qualified_Outcome.No_Qualified_Report &
                   In(recovery_required) == F &
                   not (In(current_phase) == Dispatch_Phase.Idle &
                        qualified_request == Qualified_Request.Qualified_Shipment_Request &
                        availability_assessment == Availability_Assessment_Value.Product_Available) &
                   not (In(current_phase) == Dispatch_Phase.Idle &
                        qualified_request == Qualified_Request.Qualified_Shipment_Request &
                        availability_assessment == Availability_Assessment_Value.Product_Unavailable) &
                   not (In(current_phase) == Dispatch_Phase.Awaiting_Product &
                        availability_assessment == Availability_Assessment_Value.Product_Available);
            guarantee current_phase == In(current_phase) &
                      recovery_required == F &
                      release_resolution.next_phase == In(current_phase) &
                      release_resolution.next_recovery_required == F &
                      release_resolution.disposition == Dispatch_Disposition.Hold_Position &
                      notice_resolution.next_phase == In(current_phase) &
                      notice_resolution.next_recovery_required == F &
                      notice_resolution.disposition == Dispatch_Disposition.Hold_Position;
    }*/
  }

  // @trace PART-05
  part def Release_Command_Derivation :> Thread {
    // @trace INT-07
    port dispatch_resolution : DataPort { in :>> type : Dispatch_Resolution; }
    // @trace INT-09
    port shipment_release_command : DataPort { out :>> type : Shipment_Release_Command; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_RELEASE_HOLD "Release command initializes to Hold":
          shipment_release_command == Shipment_Release_Command.Hold;

      compute
        compute_cases
          // @trace PART-05
          case RELEASE_COMMAND "Only either release disposition derives Release":
            assume dispatch_resolution.disposition == Dispatch_Disposition.Release_From_Idle |
                   dispatch_resolution.disposition == Dispatch_Disposition.Release_From_Queue;
            guarantee shipment_release_command == Shipment_Release_Command.Release;
          // @trace PART-05
          case HOLD_COMMAND "The other seven dispositions derive Hold":
            assume dispatch_resolution.disposition != Dispatch_Disposition.Release_From_Idle &
                   dispatch_resolution.disposition != Dispatch_Disposition.Release_From_Queue;
            guarantee shipment_release_command == Shipment_Release_Command.Hold;
    }*/
  }

  // @trace PART-06
  part def Dispatch_Notice_Derivation :> Thread {
    // @trace INT-08
    port dispatch_resolution : DataPort { in :>> type : Dispatch_Resolution; }
    // @trace INT-10
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }
    // @trace INT-11
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_NOTICE_SAFE "Notice outputs initialize to Idle and Not_Issued":
          dispatch_status == Dispatch_Status.Idle &
          shipping_confirmation == Shipping_Confirmation.Not_Issued;

      compute
        compute_cases
          // @trace NOTICE-01
          case NOTICE_INPUT_FAULT "Input_Fault reports the fault without confirmation":
            assume dispatch_resolution.disposition == Dispatch_Disposition.Input_Fault;
            guarantee dispatch_status == Dispatch_Status.Input_Fault & shipping_confirmation == Shipping_Confirmation.Not_Issued;
          // @trace NOTICE-01
          case NOTICE_RECOVERY_BLOCKED "Recovery_Blocked reports awaiting neutral without confirmation":
            assume dispatch_resolution.disposition == Dispatch_Disposition.Recovery_Blocked;
            guarantee dispatch_status == Dispatch_Status.Recovery_Awaiting_Neutral & shipping_confirmation == Shipping_Confirmation.Not_Issued;
          // @trace NOTICE-01
          case NOTICE_RECOVERY_CLEARED "Recovery_Cleared returns the notice to Idle":
            assume dispatch_resolution.disposition == Dispatch_Disposition.Recovery_Cleared;
            guarantee dispatch_status == Dispatch_Status.Idle & shipping_confirmation == Shipping_Confirmation.Not_Issued;
          // @trace NOTICE-01
          case NOTICE_ACKNOWLEDGED "Shipment_Acknowledged alone issues logical confirmation":
            assume dispatch_resolution.disposition == Dispatch_Disposition.Shipment_Acknowledged;
            guarantee dispatch_status == Dispatch_Status.Shipment_Acknowledged & shipping_confirmation == Shipping_Confirmation.Issued;
          // @trace NOTICE-01
          case NOTICE_UNEXPECTED "Unexpected_Outcome reports no confirmation":
            assume dispatch_resolution.disposition == Dispatch_Disposition.Unexpected_Outcome;
            guarantee dispatch_status == Dispatch_Status.Unexpected_Outcome & shipping_confirmation == Shipping_Confirmation.Not_Issued;
          // @trace NOTICE-01
          case NOTICE_RELEASE_ISSUED "Either release disposition reports Release_Issued":
            assume dispatch_resolution.disposition == Dispatch_Disposition.Release_From_Idle |
                   dispatch_resolution.disposition == Dispatch_Disposition.Release_From_Queue;
            guarantee dispatch_status == Dispatch_Status.Release_Issued & shipping_confirmation == Shipping_Confirmation.Not_Issued;
          // @trace NOTICE-01
          case NOTICE_WAITING_PRODUCT "Queue_For_Product reports Waiting_Product":
            assume dispatch_resolution.disposition == Dispatch_Disposition.Queue_For_Product;
            guarantee dispatch_status == Dispatch_Status.Waiting_Product & shipping_confirmation == Shipping_Confirmation.Not_Issued;
          // @trace NOTICE-01
          case NOTICE_HOLD_IDLE "Holding Idle reports Idle":
            assume dispatch_resolution.disposition == Dispatch_Disposition.Hold_Position &
                   dispatch_resolution.next_phase == Dispatch_Phase.Idle;
            guarantee dispatch_status == Dispatch_Status.Idle & shipping_confirmation == Shipping_Confirmation.Not_Issued;
          // @trace NOTICE-01
          case NOTICE_HOLD_AWAITING "Holding Awaiting_Product reports Waiting_Product":
            assume dispatch_resolution.disposition == Dispatch_Disposition.Hold_Position &
                   dispatch_resolution.next_phase == Dispatch_Phase.Awaiting_Product;
            guarantee dispatch_status == Dispatch_Status.Waiting_Product & shipping_confirmation == Shipping_Confirmation.Not_Issued;
          // @trace NOTICE-01
          case NOTICE_HOLD_OUTSTANDING "Holding Release_Outstanding reports Release_Issued":
            assume dispatch_resolution.disposition == Dispatch_Disposition.Hold_Position &
                   dispatch_resolution.next_phase == Dispatch_Phase.Release_Outstanding;
            guarantee dispatch_status == Dispatch_Status.Release_Issued & shipping_confirmation == Shipping_Confirmation.Not_Issued;
    }*/
  }

  // @generated-support SUPPORT-01 behavior-free containment and boundary delegation only
  part def Dispatch_Coordination_Process :> Process {
    // @trace PART-01
    part request_qualification : Request_Qualification;
    // @trace PART-02
    part availability_assessment : Availability_Assessment;
    // @trace PART-03
    part outcome_qualification : Outcome_Qualification;
    // @trace PART-04
    part dispatch_decision_owner : Dispatch_Decision_Owner;
    // @trace PART-05
    part release_command_derivation : Release_Command_Derivation;
    // @trace PART-06
    part dispatch_notice_derivation : Dispatch_Notice_Derivation;

    // @generated-support inbound Process boundary port for INT-01
    port dispatch_request : DataPort { in :>> type : Dispatch_Request_Sample; }
    // @generated-support inbound Process boundary port for INT-03
    port product_availability : DataPort { in :>> type : Product_Availability_Sample; }
    // @generated-support inbound Process boundary port for INT-05
    port dispatch_outcome : DataPort { in :>> type : Dispatch_Outcome_Sample; }
    // @generated-support outbound Process boundary port for INT-09
    port shipment_release_command : DataPort { out :>> type : Shipment_Release_Command; }
    // @generated-support outbound Process boundary port for INT-10
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }
    // @generated-support outbound Process boundary port for INT-11
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }

    // @generated-support inbound refinement hop for INT-01
    connection support_request_to_qualifier : PortConnection
      connect dispatch_request to request_qualification.raw_request;
    // @trace INT-02
    connection qualified_request_to_owner : PortConnection
      connect request_qualification.qualified_request to dispatch_decision_owner.qualified_request;
    // @generated-support inbound refinement hop for INT-03
    connection support_availability_to_assessment : PortConnection
      connect product_availability to availability_assessment.raw_availability;
    // @trace INT-04
    connection assessed_availability_to_owner : PortConnection
      connect availability_assessment.availability_assessment to dispatch_decision_owner.availability_assessment;
    // @generated-support inbound refinement hop for INT-05
    connection support_outcome_to_qualifier : PortConnection
      connect dispatch_outcome to outcome_qualification.raw_outcome;
    // @trace INT-06
    connection qualified_outcome_to_owner : PortConnection
      connect outcome_qualification.qualified_outcome to dispatch_decision_owner.qualified_outcome;
    // @trace INT-07
    connection resolution_to_release_derivation : PortConnection
      connect dispatch_decision_owner.release_resolution to release_command_derivation.dispatch_resolution;
    // @trace INT-08
    connection resolution_to_notice_derivation : PortConnection
      connect dispatch_decision_owner.notice_resolution to dispatch_notice_derivation.dispatch_resolution;
    // @generated-support outbound refinement hop for INT-09
    connection support_release_to_process_boundary : PortConnection
      connect release_command_derivation.shipment_release_command to shipment_release_command;
    // @generated-support outbound refinement hop for INT-10
    connection support_status_to_process_boundary : PortConnection
      connect dispatch_notice_derivation.dispatch_status to dispatch_status;
    // @generated-support outbound refinement hop for INT-11
    connection support_confirmation_to_process_boundary : PortConnection
      connect dispatch_notice_derivation.shipping_confirmation to shipping_confirmation;
  }

  // @trace BOUND-01
  part def Finished_Product_Dispatch_Coordinator_System :> System {
    // @generated-support SUPPORT-01 sole behavior-free Process usage
    part dispatch_coordination_process : Dispatch_Coordination_Process;

    // @trace MON-01
    port dispatch_request : DataPort { in :>> type : Dispatch_Request_Sample; }
    // @trace MON-02
    port product_availability : DataPort { in :>> type : Product_Availability_Sample; }
    // @trace MON-03
    port dispatch_outcome : DataPort { in :>> type : Dispatch_Outcome_Sample; }
    // @trace CTRL-01
    port shipment_release_command : DataPort { out :>> type : Shipment_Release_Command; }
    // @trace CTRL-02
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }
    // @trace CTRL-03
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }

    // @generated-support root-to-Process route for INT-01
    connection support_boundary_request : PortConnection
      connect dispatch_request to dispatch_coordination_process.dispatch_request;
    // @generated-support root-to-Process route for INT-03
    connection support_boundary_availability : PortConnection
      connect product_availability to dispatch_coordination_process.product_availability;
    // @generated-support root-to-Process route for INT-05
    connection support_boundary_outcome : PortConnection
      connect dispatch_outcome to dispatch_coordination_process.dispatch_outcome;
    // @generated-support Process-to-root route for INT-09
    connection support_boundary_release : PortConnection
      connect dispatch_coordination_process.shipment_release_command to shipment_release_command;
    // @generated-support Process-to-root route for INT-10
    connection support_boundary_status : PortConnection
      connect dispatch_coordination_process.dispatch_status to dispatch_status;
    // @generated-support Process-to-root route for INT-11
    connection support_boundary_confirmation : PortConnection
      connect dispatch_coordination_process.shipping_confirmation to shipping_confirmation;
  }

  // @trace STRUCT-01
  part finished_product_dispatch_coordinator : Finished_Product_Dispatch_Coordinator_System;
}
