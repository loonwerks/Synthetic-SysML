package Factory_Dispatch_Coordinator {

  private import HAMR::*;

  // @trace MON-01
  enum def Request_Arrival_Sample {
    enum No_Arrival;
    enum Invalid_R1_AngleA_One;
    enum Invalid_R1_AngleA_Two;
    enum Invalid_R1_AngleB_One;
    enum Invalid_R1_AngleB_Two;
    enum Invalid_R2_AngleA_One;
    enum Invalid_R2_AngleA_Two;
    enum Invalid_R2_AngleB_One;
    enum Invalid_R2_AngleB_Two;
    enum Valid_R1_AngleA_One;
    enum Valid_R1_AngleA_Two;
    enum Valid_R1_AngleB_One;
    enum Valid_R1_AngleB_Two;
    enum Valid_R2_AngleA_One;
    enum Valid_R2_AngleA_Two;
    enum Valid_R2_AngleB_One;
    enum Valid_R2_AngleB_Two;
  }

  // @trace MON-02
  enum def Angle_A_Stock_Band {
    enum Zero;
    enum One;
    enum Two_Or_More;
  }

  // @trace MON-02
  enum def Angle_B_Stock_Band {
    enum Zero;
    enum One;
    enum Two_Or_More;
  }

  // @trace MON-03
  enum def Dispatch_Readiness {
    enum Ready;
    enum Not_Ready;
  }

  // @trace MON-01
  enum def Input_Status {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-04
  enum def Shipment_Result_Sample {
    enum No_Result;
    enum Invalid_R1_Succeeded;
    enum Invalid_R1_Failed;
    enum Invalid_R2_Succeeded;
    enum Invalid_R2_Failed;
    enum Valid_R1_Succeeded;
    enum Valid_R1_Failed;
    enum Valid_R2_Succeeded;
    enum Valid_R2_Failed;
  }

  // @trace STATE-01
  enum def Request_Value {
    enum No_Request;
    enum R1_AngleA_One;
    enum R1_AngleA_Two;
    enum R1_AngleB_One;
    enum R1_AngleB_Two;
    enum R2_AngleA_One;
    enum R2_AngleA_Two;
    enum R2_AngleB_One;
    enum R2_AngleB_Two;
  }

  // @trace PART-01
  enum def Arrival_Fact {
    enum No_Arrival_Fact;
    enum Invalid_Arrival;
    enum Valid_R1_AngleA_One;
    enum Valid_R1_AngleA_Two;
    enum Valid_R1_AngleB_One;
    enum Valid_R1_AngleB_Two;
    enum Valid_R2_AngleA_One;
    enum Valid_R2_AngleA_Two;
    enum Valid_R2_AngleB_One;
    enum Valid_R2_AngleB_Two;
  }

  // @trace STATE-01
  enum def Active_Slot {
    enum Empty;
    enum Pending_R1_AngleA_One;
    enum Pending_R1_AngleA_Two;
    enum Pending_R1_AngleB_One;
    enum Pending_R1_AngleB_Two;
    enum Pending_R2_AngleA_One;
    enum Pending_R2_AngleA_Two;
    enum Pending_R2_AngleB_One;
    enum Pending_R2_AngleB_Two;
    enum Submitted_R1_AngleA_One;
    enum Submitted_R1_AngleA_Two;
    enum Submitted_R1_AngleB_One;
    enum Submitted_R1_AngleB_Two;
    enum Submitted_R2_AngleA_One;
    enum Submitted_R2_AngleA_Two;
    enum Submitted_R2_AngleB_One;
    enum Submitted_R2_AngleB_Two;
  }

  // @trace STATE-02
  enum def Completion_Slot {
    enum No_Completion;
    enum Completed_R1_AngleA_One;
    enum Completed_R1_AngleA_Two;
    enum Completed_R1_AngleB_One;
    enum Completed_R1_AngleB_Two;
    enum Completed_R2_AngleA_One;
    enum Completed_R2_AngleA_Two;
    enum Completed_R2_AngleB_One;
    enum Completed_R2_AngleB_Two;
  }

  // @trace PART-02
  enum def Pending_Request_View {
    enum No_Pending_Request;
    enum Pending_R1_AngleA_One;
    enum Pending_R1_AngleA_Two;
    enum Pending_R1_AngleB_One;
    enum Pending_R1_AngleB_Two;
    enum Pending_R2_AngleA_One;
    enum Pending_R2_AngleA_Two;
    enum Pending_R2_AngleB_One;
    enum Pending_R2_AngleB_Two;
  }

  // @trace TYPE-01
  enum def Registry_Outcome {
    enum No_Registry_Notice;
    enum Invalid_Event;
    enum Shipment_Confirmed;
    enum Shipment_Failed_Retry_Pending;
    enum Stale_Result;
    enum Duplicate_Acknowledged;
    enum Identifier_Conflict;
    enum Request_Accepted;
    enum Busy;
  }

  // @trace PART-03
  enum def Inventory_Finding {
    enum No_Demand;
    enum Invalid_Inventory;
    enum Sufficient;
    enum Insufficient;
  }

  // @trace TYPE-02
  enum def Dispatch_Disposition {
    enum No_Dispatch_Demand;
    enum Event_Blocked;
    enum Recovery_Held;
    enum Inventory_Invalid;
    enum Readiness_Invalid;
    enum Waiting_Stock;
    enum Waiting_Dispatch;
    enum Release_Issued;
  }

  // @trace INT-09
  enum def Registry_Instruction {
    enum No_State_Instruction;
    enum Mark_Submitted_R1_AngleA_One;
    enum Mark_Submitted_R1_AngleA_Two;
    enum Mark_Submitted_R1_AngleB_One;
    enum Mark_Submitted_R1_AngleB_Two;
    enum Mark_Submitted_R2_AngleA_One;
    enum Mark_Submitted_R2_AngleA_Two;
    enum Mark_Submitted_R2_AngleB_One;
    enum Mark_Submitted_R2_AngleB_Two;
  }

  // @trace CTRL-01
  enum def Shipment_Release_Directive {
    enum No_Release;
    enum Release_R1_AngleA_One;
    enum Release_R1_AngleA_Two;
    enum Release_R1_AngleB_One;
    enum Release_R1_AngleB_Two;
    enum Release_R2_AngleA_One;
    enum Release_R2_AngleA_Two;
    enum Release_R2_AngleB_One;
    enum Release_R2_AngleB_Two;
  }

  // @trace CTRL-02
  enum def Customer_Dispatch_Notice {
    enum None;
    enum Invalid_Event;
    enum Request_Accepted;
    enum Duplicate_Acknowledged;
    enum Identifier_Conflict;
    enum Busy;
    enum Stale_Result;
    enum Inventory_Evidence_Invalid;
    enum Readiness_Evidence_Invalid;
    enum Waiting_For_Stock;
    enum Waiting_For_Dispatch;
    enum Release_Issued;
    enum Shipment_Confirmed;
    enum Shipment_Failed_Retry_Pending;
  }

  // Every field inspected by GUMBO is represented as an attribute.
  // @trace MON-02
  part def Inventory_Sample :> Data {
    // @trace MON-02
    attribute stock_band_angle_a : Angle_A_Stock_Band;
    // @trace MON-02
    attribute stock_band_angle_b : Angle_B_Stock_Band;
    // @trace MON-02
    attribute status : Input_Status;
  }

  // @trace MON-03
  part def Dispatch_Readiness_Sample :> Data {
    // @trace MON-03
    attribute readiness : Dispatch_Readiness;
    // @trace MON-03
    attribute status : Input_Status;
  }

  // @trace PART-02
  part def Dispatch_Candidate :> Data {
    // @trace INT-06
    attribute request : Request_Value;
    // @trace PART-02
    attribute event_blocked : Base_Types::Boolean;
    // @trace RECOVERY-01
    attribute recovery_hold : Base_Types::Boolean;
  }

  // @trace PART-01
  part def Request_Qualification :> Thread {
    // @trace INT-01
    port request_arrival : DataPort { in :>> type : Request_Arrival_Sample; }
    // @trace INT-02
    port arrival_fact : DataPort { out :>> type : Arrival_Fact; }

    language "GUMBO" /*{
      functions
        // @trace QUAL-01
        def qualify(value: Request_Arrival_Sample): Arrival_Fact :=
          if (value == Request_Arrival_Sample.No_Arrival)? Arrival_Fact.No_Arrival_Fact
          else if (value == Request_Arrival_Sample.Invalid_R1_AngleA_One |
                   value == Request_Arrival_Sample.Invalid_R1_AngleA_Two |
                   value == Request_Arrival_Sample.Invalid_R1_AngleB_One |
                   value == Request_Arrival_Sample.Invalid_R1_AngleB_Two |
                   value == Request_Arrival_Sample.Invalid_R2_AngleA_One |
                   value == Request_Arrival_Sample.Invalid_R2_AngleA_Two |
                   value == Request_Arrival_Sample.Invalid_R2_AngleB_One |
                   value == Request_Arrival_Sample.Invalid_R2_AngleB_Two)? Arrival_Fact.Invalid_Arrival
          else if (value == Request_Arrival_Sample.Valid_R1_AngleA_One)? Arrival_Fact.Valid_R1_AngleA_One
          else if (value == Request_Arrival_Sample.Valid_R1_AngleA_Two)? Arrival_Fact.Valid_R1_AngleA_Two
          else if (value == Request_Arrival_Sample.Valid_R1_AngleB_One)? Arrival_Fact.Valid_R1_AngleB_One
          else if (value == Request_Arrival_Sample.Valid_R1_AngleB_Two)? Arrival_Fact.Valid_R1_AngleB_Two
          else if (value == Request_Arrival_Sample.Valid_R2_AngleA_One)? Arrival_Fact.Valid_R2_AngleA_One
          else if (value == Request_Arrival_Sample.Valid_R2_AngleA_Two)? Arrival_Fact.Valid_R2_AngleA_Two
          else if (value == Request_Arrival_Sample.Valid_R2_AngleB_One)? Arrival_Fact.Valid_R2_AngleB_One
          else Arrival_Fact.Valid_R2_AngleB_Two;

      initialize
        // @trace INIT-01
        guarantee INITIAL_QUALIFICATION_SAFE "Qualification initializes without a request":
          arrival_fact == Arrival_Fact.No_Arrival_Fact;

      compute
        compute_cases
          // @trace QUAL-01
          case QUAL_NO_ARRIVAL "NoArrival derives the no-arrival fact":
            assume request_arrival == Request_Arrival_Sample.No_Arrival;
            guarantee arrival_fact == qualify(request_arrival);
          // @trace QUAL-01
          case QUAL_INVALID_ARRIVAL "Every present invalid-status arrival derives InvalidArrival":
            assume request_arrival == Request_Arrival_Sample.Invalid_R1_AngleA_One |
                   request_arrival == Request_Arrival_Sample.Invalid_R1_AngleA_Two |
                   request_arrival == Request_Arrival_Sample.Invalid_R1_AngleB_One |
                   request_arrival == Request_Arrival_Sample.Invalid_R1_AngleB_Two |
                   request_arrival == Request_Arrival_Sample.Invalid_R2_AngleA_One |
                   request_arrival == Request_Arrival_Sample.Invalid_R2_AngleA_Two |
                   request_arrival == Request_Arrival_Sample.Invalid_R2_AngleB_One |
                   request_arrival == Request_Arrival_Sample.Invalid_R2_AngleB_Two;
            guarantee arrival_fact == qualify(request_arrival);
          // @trace QUAL-01
          case QUAL_VALID_ARRIVAL "Every present valid-status arrival derives its exact valid request fact":
            assume request_arrival == Request_Arrival_Sample.Valid_R1_AngleA_One |
                   request_arrival == Request_Arrival_Sample.Valid_R1_AngleA_Two |
                   request_arrival == Request_Arrival_Sample.Valid_R1_AngleB_One |
                   request_arrival == Request_Arrival_Sample.Valid_R1_AngleB_Two |
                   request_arrival == Request_Arrival_Sample.Valid_R2_AngleA_One |
                   request_arrival == Request_Arrival_Sample.Valid_R2_AngleA_Two |
                   request_arrival == Request_Arrival_Sample.Valid_R2_AngleB_One |
                   request_arrival == Request_Arrival_Sample.Valid_R2_AngleB_Two;
            guarantee arrival_fact == qualify(request_arrival);
    }*/
  }

  // @trace PART-02
  part def Request_Registry :> Thread {
    // @trace INT-02
    port arrival_fact : DataPort { in :>> type : Arrival_Fact; }
    // @trace INT-03
    port shipment_result : DataPort { in :>> type : Shipment_Result_Sample; }
    // @trace INT-09
    port registry_instruction : DataPort { in :>> type : Registry_Instruction; }
    // @trace INT-04
    port pending_request : DataPort { out :>> type : Pending_Request_View; }
    // @trace INT-06
    port dispatch_candidate : DataPort { out :>> type : Dispatch_Candidate; }
    // @trace INT-11
    port registry_outcome : DataPort { out :>> type : Registry_Outcome; }

    language "GUMBO" /*{
      // @trace OWNER-01
      state
        // @trace STATE-01
        active: Active_Slot;
        // @trace STATE-02
        last_completed: Completion_Slot;

      functions
        // @trace FRESH-01
        def arrival_request(value: Arrival_Fact): Request_Value :=
          if (value == Arrival_Fact.Valid_R1_AngleA_One)? Request_Value.R1_AngleA_One
          else if (value == Arrival_Fact.Valid_R1_AngleA_Two)? Request_Value.R1_AngleA_Two
          else if (value == Arrival_Fact.Valid_R1_AngleB_One)? Request_Value.R1_AngleB_One
          else if (value == Arrival_Fact.Valid_R1_AngleB_Two)? Request_Value.R1_AngleB_Two
          else if (value == Arrival_Fact.Valid_R2_AngleA_One)? Request_Value.R2_AngleA_One
          else if (value == Arrival_Fact.Valid_R2_AngleA_Two)? Request_Value.R2_AngleA_Two
          else if (value == Arrival_Fact.Valid_R2_AngleB_One)? Request_Value.R2_AngleB_One
          else if (value == Arrival_Fact.Valid_R2_AngleB_Two)? Request_Value.R2_AngleB_Two
          else Request_Value.No_Request;
        // @trace FRESH-01
        def arrival_is_valid(value: Arrival_Fact): Base_Types::Boolean :=
          value != Arrival_Fact.No_Arrival_Fact & value != Arrival_Fact.Invalid_Arrival;
        // @trace MON-04
        def result_request(value: Shipment_Result_Sample): Request_Value :=
          if (value == Shipment_Result_Sample.Valid_R1_Succeeded |
              value == Shipment_Result_Sample.Valid_R1_Failed |
              value == Shipment_Result_Sample.Invalid_R1_Succeeded |
              value == Shipment_Result_Sample.Invalid_R1_Failed)? Request_Value.R1_AngleA_One
          else if (value == Shipment_Result_Sample.Valid_R2_Succeeded |
                   value == Shipment_Result_Sample.Valid_R2_Failed |
                   value == Shipment_Result_Sample.Invalid_R2_Succeeded |
                   value == Shipment_Result_Sample.Invalid_R2_Failed)? Request_Value.R2_AngleA_One
          else Request_Value.No_Request;
        // @trace MON-04
        def result_is_invalid(value: Shipment_Result_Sample): Base_Types::Boolean :=
          value == Shipment_Result_Sample.Invalid_R1_Succeeded |
          value == Shipment_Result_Sample.Invalid_R1_Failed |
          value == Shipment_Result_Sample.Invalid_R2_Succeeded |
          value == Shipment_Result_Sample.Invalid_R2_Failed;
        // @trace MON-04
        def result_is_valid_success(value: Shipment_Result_Sample): Base_Types::Boolean :=
          value == Shipment_Result_Sample.Valid_R1_Succeeded |
          value == Shipment_Result_Sample.Valid_R2_Succeeded;
        // @trace MON-04
        def result_is_valid_failure(value: Shipment_Result_Sample): Base_Types::Boolean :=
          value == Shipment_Result_Sample.Valid_R1_Failed |
          value == Shipment_Result_Sample.Valid_R2_Failed;
        // @trace MON-04
        def result_is_valid_present(value: Shipment_Result_Sample): Base_Types::Boolean :=
          result_is_valid_success(value) | result_is_valid_failure(value);
        // @trace STATE-01
        def active_request_of(value: Active_Slot): Request_Value :=
          if (value == Active_Slot.Pending_R1_AngleA_One | value == Active_Slot.Submitted_R1_AngleA_One)? Request_Value.R1_AngleA_One
          else if (value == Active_Slot.Pending_R1_AngleA_Two | value == Active_Slot.Submitted_R1_AngleA_Two)? Request_Value.R1_AngleA_Two
          else if (value == Active_Slot.Pending_R1_AngleB_One | value == Active_Slot.Submitted_R1_AngleB_One)? Request_Value.R1_AngleB_One
          else if (value == Active_Slot.Pending_R1_AngleB_Two | value == Active_Slot.Submitted_R1_AngleB_Two)? Request_Value.R1_AngleB_Two
          else if (value == Active_Slot.Pending_R2_AngleA_One | value == Active_Slot.Submitted_R2_AngleA_One)? Request_Value.R2_AngleA_One
          else if (value == Active_Slot.Pending_R2_AngleA_Two | value == Active_Slot.Submitted_R2_AngleA_Two)? Request_Value.R2_AngleA_Two
          else if (value == Active_Slot.Pending_R2_AngleB_One | value == Active_Slot.Submitted_R2_AngleB_One)? Request_Value.R2_AngleB_One
          else if (value == Active_Slot.Pending_R2_AngleB_Two | value == Active_Slot.Submitted_R2_AngleB_Two)? Request_Value.R2_AngleB_Two
          else Request_Value.No_Request;
        // @trace STATE-02
        def completed_request_of(value: Completion_Slot): Request_Value :=
          if (value == Completion_Slot.Completed_R1_AngleA_One)? Request_Value.R1_AngleA_One
          else if (value == Completion_Slot.Completed_R1_AngleA_Two)? Request_Value.R1_AngleA_Two
          else if (value == Completion_Slot.Completed_R1_AngleB_One)? Request_Value.R1_AngleB_One
          else if (value == Completion_Slot.Completed_R1_AngleB_Two)? Request_Value.R1_AngleB_Two
          else if (value == Completion_Slot.Completed_R2_AngleA_One)? Request_Value.R2_AngleA_One
          else if (value == Completion_Slot.Completed_R2_AngleA_Two)? Request_Value.R2_AngleA_Two
          else if (value == Completion_Slot.Completed_R2_AngleB_One)? Request_Value.R2_AngleB_One
          else if (value == Completion_Slot.Completed_R2_AngleB_Two)? Request_Value.R2_AngleB_Two
          else Request_Value.No_Request;
        // @trace STATE-01
        def active_is_submitted(value: Active_Slot): Base_Types::Boolean :=
          value == Active_Slot.Submitted_R1_AngleA_One |
          value == Active_Slot.Submitted_R1_AngleA_Two |
          value == Active_Slot.Submitted_R1_AngleB_One |
          value == Active_Slot.Submitted_R1_AngleB_Two |
          value == Active_Slot.Submitted_R2_AngleA_One |
          value == Active_Slot.Submitted_R2_AngleA_Two |
          value == Active_Slot.Submitted_R2_AngleB_One |
          value == Active_Slot.Submitted_R2_AngleB_Two;
        // @trace STATE-01
        def active_is_pending(value: Active_Slot): Base_Types::Boolean :=
          value != Active_Slot.Empty & not active_is_submitted(value);
        // @trace FRESH-01
        def same_id(left: Request_Value, right: Request_Value): Base_Types::Boolean :=
          (left != Request_Value.No_Request & right != Request_Value.No_Request) &
          (((left == Request_Value.R1_AngleA_One | left == Request_Value.R1_AngleA_Two |
             left == Request_Value.R1_AngleB_One | left == Request_Value.R1_AngleB_Two) &
            (right == Request_Value.R1_AngleA_One | right == Request_Value.R1_AngleA_Two |
             right == Request_Value.R1_AngleB_One | right == Request_Value.R1_AngleB_Two)) |
           ((left == Request_Value.R2_AngleA_One | left == Request_Value.R2_AngleA_Two |
             left == Request_Value.R2_AngleB_One | left == Request_Value.R2_AngleB_Two) &
            (right == Request_Value.R2_AngleA_One | right == Request_Value.R2_AngleA_Two |
             right == Request_Value.R2_AngleB_One | right == Request_Value.R2_AngleB_Two)));
        // @trace INVAR-01
        def invariant_holds(a: Active_Slot, c: Completion_Slot): Base_Types::Boolean :=
          a == Active_Slot.Empty | not same_id(active_request_of(a), completed_request_of(c));
        // @trace STATE-01
        def pending_slot(value: Request_Value): Active_Slot :=
          if (value == Request_Value.R1_AngleA_One)? Active_Slot.Pending_R1_AngleA_One
          else if (value == Request_Value.R1_AngleA_Two)? Active_Slot.Pending_R1_AngleA_Two
          else if (value == Request_Value.R1_AngleB_One)? Active_Slot.Pending_R1_AngleB_One
          else if (value == Request_Value.R1_AngleB_Two)? Active_Slot.Pending_R1_AngleB_Two
          else if (value == Request_Value.R2_AngleA_One)? Active_Slot.Pending_R2_AngleA_One
          else if (value == Request_Value.R2_AngleA_Two)? Active_Slot.Pending_R2_AngleA_Two
          else if (value == Request_Value.R2_AngleB_One)? Active_Slot.Pending_R2_AngleB_One
          else Active_Slot.Pending_R2_AngleB_Two;
        // @trace STATE-02
        def completed_slot(value: Request_Value): Completion_Slot :=
          if (value == Request_Value.R1_AngleA_One)? Completion_Slot.Completed_R1_AngleA_One
          else if (value == Request_Value.R1_AngleA_Two)? Completion_Slot.Completed_R1_AngleA_Two
          else if (value == Request_Value.R1_AngleB_One)? Completion_Slot.Completed_R1_AngleB_One
          else if (value == Request_Value.R1_AngleB_Two)? Completion_Slot.Completed_R1_AngleB_Two
          else if (value == Request_Value.R2_AngleA_One)? Completion_Slot.Completed_R2_AngleA_One
          else if (value == Request_Value.R2_AngleA_Two)? Completion_Slot.Completed_R2_AngleA_Two
          else if (value == Request_Value.R2_AngleB_One)? Completion_Slot.Completed_R2_AngleB_One
          else Completion_Slot.Completed_R2_AngleB_Two;
        // @trace CASE-01
        def invalid_event(a: Arrival_Fact, r: Shipment_Result_Sample): Base_Types::Boolean :=
          a == Arrival_Fact.Invalid_Arrival | result_is_invalid(r) |
          (arrival_is_valid(a) & result_is_valid_present(r));
        // @trace CASE-06
        def exact_duplicate(a: Arrival_Fact, active_pre: Active_Slot, completed_pre: Completion_Slot): Base_Types::Boolean :=
          arrival_is_valid(a) &
          (arrival_request(a) == active_request_of(active_pre) |
           arrival_request(a) == completed_request_of(completed_pre));
        // @trace CASE-07
        def identifier_conflict(a: Arrival_Fact, active_pre: Active_Slot, completed_pre: Completion_Slot): Base_Types::Boolean :=
          arrival_is_valid(a) & not exact_duplicate(a, active_pre, completed_pre) &
          (same_id(arrival_request(a), active_request_of(active_pre)) |
           same_id(arrival_request(a), completed_request_of(completed_pre)));
        // @trace PRIORITY-01
        def event_active(a: Arrival_Fact, r: Shipment_Result_Sample, active_pre: Active_Slot, completed_pre: Completion_Slot): Active_Slot :=
          if (invalid_event(a, r))? active_pre
          else if (result_is_valid_success(r) & active_is_submitted(active_pre) & same_id(result_request(r), active_request_of(active_pre)))? Active_Slot.Empty
          else if (result_is_valid_failure(r) & active_is_submitted(active_pre) & same_id(result_request(r), active_request_of(active_pre)))? pending_slot(active_request_of(active_pre))
          else if (result_is_valid_present(r))? active_pre
          else if (a == Arrival_Fact.No_Arrival_Fact)? active_pre
          else if (exact_duplicate(a, active_pre, completed_pre))? active_pre
          else if (identifier_conflict(a, active_pre, completed_pre))? active_pre
          else if (active_pre == Active_Slot.Empty)? pending_slot(arrival_request(a))
          else active_pre;
        // @trace PRIORITY-01
        def event_completion(a: Arrival_Fact, r: Shipment_Result_Sample, active_pre: Active_Slot, completed_pre: Completion_Slot): Completion_Slot :=
          if (not invalid_event(a, r) & result_is_valid_success(r) & active_is_submitted(active_pre) & same_id(result_request(r), active_request_of(active_pre)))?
            completed_slot(active_request_of(active_pre))
          else completed_pre;
        // @trace PRIORITY-01
        def event_outcome(a: Arrival_Fact, r: Shipment_Result_Sample, active_pre: Active_Slot, completed_pre: Completion_Slot): Registry_Outcome :=
          if (invalid_event(a, r))? Registry_Outcome.Invalid_Event
          else if (result_is_valid_success(r) & active_is_submitted(active_pre) & same_id(result_request(r), active_request_of(active_pre)))? Registry_Outcome.Shipment_Confirmed
          else if (result_is_valid_failure(r) & active_is_submitted(active_pre) & same_id(result_request(r), active_request_of(active_pre)))? Registry_Outcome.Shipment_Failed_Retry_Pending
          else if (result_is_valid_present(r))? Registry_Outcome.Stale_Result
          else if (a == Arrival_Fact.No_Arrival_Fact)? Registry_Outcome.No_Registry_Notice
          else if (exact_duplicate(a, active_pre, completed_pre))? Registry_Outcome.Duplicate_Acknowledged
          else if (identifier_conflict(a, active_pre, completed_pre))? Registry_Outcome.Identifier_Conflict
          else if (active_pre == Active_Slot.Empty)? Registry_Outcome.Request_Accepted
          else Registry_Outcome.Busy;
        // @trace RECOVERY-01
        def event_recovery_hold(a: Arrival_Fact, r: Shipment_Result_Sample, active_pre: Active_Slot): Base_Types::Boolean :=
          not invalid_event(a, r) & result_is_valid_failure(r) & active_is_submitted(active_pre) &
          same_id(result_request(r), active_request_of(active_pre));
        // @trace PART-02
        def event_blocked(a: Arrival_Fact, r: Shipment_Result_Sample, active_pre: Active_Slot, completed_pre: Completion_Slot): Base_Types::Boolean :=
          invalid_event(a, r) |
          (not result_is_valid_present(r) & identifier_conflict(a, active_pre, completed_pre));
        // @trace INT-04
        def pending_view(value: Active_Slot): Pending_Request_View :=
          if (value == Active_Slot.Pending_R1_AngleA_One)? Pending_Request_View.Pending_R1_AngleA_One
          else if (value == Active_Slot.Pending_R1_AngleA_Two)? Pending_Request_View.Pending_R1_AngleA_Two
          else if (value == Active_Slot.Pending_R1_AngleB_One)? Pending_Request_View.Pending_R1_AngleB_One
          else if (value == Active_Slot.Pending_R1_AngleB_Two)? Pending_Request_View.Pending_R1_AngleB_Two
          else if (value == Active_Slot.Pending_R2_AngleA_One)? Pending_Request_View.Pending_R2_AngleA_One
          else if (value == Active_Slot.Pending_R2_AngleA_Two)? Pending_Request_View.Pending_R2_AngleA_Two
          else if (value == Active_Slot.Pending_R2_AngleB_One)? Pending_Request_View.Pending_R2_AngleB_One
          else if (value == Active_Slot.Pending_R2_AngleB_Two)? Pending_Request_View.Pending_R2_AngleB_Two
          else Pending_Request_View.No_Pending_Request;
        // @trace INT-06
        def candidate_request(value: Active_Slot): Request_Value :=
          if (active_is_pending(value))? active_request_of(value) else Request_Value.No_Request;
        // @trace COHERENCE-01
        def committed_active(provisional: Active_Slot, instruction: Registry_Instruction): Active_Slot :=
          if (instruction == Registry_Instruction.Mark_Submitted_R1_AngleA_One)? Active_Slot.Submitted_R1_AngleA_One
          else if (instruction == Registry_Instruction.Mark_Submitted_R1_AngleA_Two)? Active_Slot.Submitted_R1_AngleA_Two
          else if (instruction == Registry_Instruction.Mark_Submitted_R1_AngleB_One)? Active_Slot.Submitted_R1_AngleB_One
          else if (instruction == Registry_Instruction.Mark_Submitted_R1_AngleB_Two)? Active_Slot.Submitted_R1_AngleB_Two
          else if (instruction == Registry_Instruction.Mark_Submitted_R2_AngleA_One)? Active_Slot.Submitted_R2_AngleA_One
          else if (instruction == Registry_Instruction.Mark_Submitted_R2_AngleA_Two)? Active_Slot.Submitted_R2_AngleA_Two
          else if (instruction == Registry_Instruction.Mark_Submitted_R2_AngleB_One)? Active_Slot.Submitted_R2_AngleB_One
          else if (instruction == Registry_Instruction.Mark_Submitted_R2_AngleB_Two)? Active_Slot.Submitted_R2_AngleB_Two
          else provisional;

      initialize
        // @trace INIT-01
        guarantee INITIAL_REGISTRY_SAFE "The sole state owner starts empty with no completion and neutral outputs":
          active == Active_Slot.Empty &
          last_completed == Completion_Slot.No_Completion &
          pending_request == Pending_Request_View.No_Pending_Request &
          dispatch_candidate.request == Request_Value.No_Request &
          dispatch_candidate.event_blocked == F &
          dispatch_candidate.recovery_hold == F &
          registry_outcome == Registry_Outcome.No_Registry_Notice;

      compute
        // @trace PART-02
        guarantee REGISTRY_LOCAL_DERIVATION "Registry outputs and committed state derive from its assigned facts, pre-state, and same-request instruction":
          registry_outcome == event_outcome(arrival_fact, shipment_result, In(active), In(last_completed)) &
          pending_request == pending_view(event_active(arrival_fact, shipment_result, In(active), In(last_completed))) &
          dispatch_candidate.request == candidate_request(event_active(arrival_fact, shipment_result, In(active), In(last_completed))) &
          dispatch_candidate.event_blocked == event_blocked(arrival_fact, shipment_result, In(active), In(last_completed)) &
          dispatch_candidate.recovery_hold == event_recovery_hold(arrival_fact, shipment_result, In(active)) &
          active == committed_active(event_active(arrival_fact, shipment_result, In(active), In(last_completed)), registry_instruction) &
          last_completed == event_completion(arrival_fact, shipment_result, In(active), In(last_completed));
        // @trace INVAR-01
        guarantee REGISTRY_STATE_INVARIANT "An active and cached request never share an identifier":
          invariant_holds(active, last_completed);

        compute_cases
          // @trace CASE-01
          case CASE_01_INVALID_OR_SIMULTANEOUS "Invalid or simultaneous present events preserve the provisional state and block dispatch":
            assume invalid_event(arrival_fact, shipment_result);
            guarantee registry_outcome == Registry_Outcome.Invalid_Event &
                      dispatch_candidate.event_blocked == T &
                      dispatch_candidate.recovery_hold == F &
                      pending_request == pending_view(In(active));
          // @trace CASE-02
          case CASE_02_MATCHING_SUCCESS "A matching success clears submitted work and updates the completion cache":
            assume not invalid_event(arrival_fact, shipment_result) &
                   result_is_valid_success(shipment_result) & active_is_submitted(In(active)) &
                   same_id(result_request(shipment_result), active_request_of(In(active)));
            guarantee registry_outcome == Registry_Outcome.Shipment_Confirmed &
                      active == Active_Slot.Empty &
                      last_completed == completed_slot(active_request_of(In(active))) &
                      dispatch_candidate.request == Request_Value.No_Request;
          // @trace CASE-03
          case CASE_03_MATCHING_FAILURE "A matching failure returns submitted work to pending and asserts the one-evaluation recovery hold":
            assume not invalid_event(arrival_fact, shipment_result) &
                   result_is_valid_failure(shipment_result) & active_is_submitted(In(active)) &
                   same_id(result_request(shipment_result), active_request_of(In(active)));
            guarantee registry_outcome == Registry_Outcome.Shipment_Failed_Retry_Pending &
                      active == pending_slot(active_request_of(In(active))) &
                      last_completed == In(last_completed) &
                      dispatch_candidate.recovery_hold == T;
          // @trace CASE-04
          case CASE_04_STALE_RESULT "Any remaining valid present result preserves state and is stale":
            assume not invalid_event(arrival_fact, shipment_result) & result_is_valid_present(shipment_result) &
                   not (active_is_submitted(In(active)) & same_id(result_request(shipment_result), active_request_of(In(active))));
            guarantee registry_outcome == Registry_Outcome.Stale_Result &
                      active == In(active) & last_completed == In(last_completed);
          // @trace CASE-05
          case CASE_05_NO_EVENT "No arrival and no result preserve provisional state with neutral event facts":
            assume arrival_fact == Arrival_Fact.No_Arrival_Fact & shipment_result == Shipment_Result_Sample.No_Result;
            guarantee registry_outcome == Registry_Outcome.No_Registry_Notice &
                      pending_request == pending_view(In(active)) &
                      dispatch_candidate.event_blocked == F & dispatch_candidate.recovery_hold == F;
          // @trace CASE-06
          case CASE_06_EXACT_DUPLICATE "An exact active or cached request is acknowledged without creating work":
            assume shipment_result == Shipment_Result_Sample.No_Result & exact_duplicate(arrival_fact, In(active), In(last_completed));
            guarantee registry_outcome == Registry_Outcome.Duplicate_Acknowledged &
                      pending_request == pending_view(In(active)) &
                      dispatch_candidate.event_blocked == F;
          // @trace CASE-07
          case CASE_07_IDENTIFIER_CONFLICT "A retained identifier with a different payload preserves state and blocks release":
            assume shipment_result == Shipment_Result_Sample.No_Result & identifier_conflict(arrival_fact, In(active), In(last_completed));
            guarantee registry_outcome == Registry_Outcome.Identifier_Conflict &
                      active == In(active) & last_completed == In(last_completed) &
                      dispatch_candidate.event_blocked == T & dispatch_candidate.recovery_hold == F;
          // @trace CASE-08
          case CASE_08_ACCEPT_FRESH "A fresh valid arrival with empty active capacity becomes the dispatch candidate":
            assume shipment_result == Shipment_Result_Sample.No_Result & arrival_is_valid(arrival_fact) &
                   not exact_duplicate(arrival_fact, In(active), In(last_completed)) &
                   not identifier_conflict(arrival_fact, In(active), In(last_completed)) &
                   In(active) == Active_Slot.Empty;
            guarantee registry_outcome == Registry_Outcome.Request_Accepted &
                      pending_request == pending_view(pending_slot(arrival_request(arrival_fact))) &
                      dispatch_candidate.request == arrival_request(arrival_fact);
          // @trace CASE-09
          case CASE_09_BUSY "A fresh valid arrival while active is occupied is nonpreemptively rejected":
            assume shipment_result == Shipment_Result_Sample.No_Result & arrival_is_valid(arrival_fact) &
                   not exact_duplicate(arrival_fact, In(active), In(last_completed)) &
                   not identifier_conflict(arrival_fact, In(active), In(last_completed)) &
                   In(active) != Active_Slot.Empty;
            guarantee registry_outcome == Registry_Outcome.Busy &
                      pending_request == pending_view(In(active)) &
                      dispatch_candidate.request == candidate_request(In(active));
    }*/
  }

  // @trace PART-03
  part def Inventory_Assessment :> Thread {
    // @trace INT-04
    port pending_request : DataPort { in :>> type : Pending_Request_View; }
    // @trace INT-05
    port inventory_evidence : DataPort { in :>> type : Inventory_Sample; }
    // @trace INT-07
    port inventory_finding : DataPort { out :>> type : Inventory_Finding; }

    language "GUMBO" /*{
      functions
        // @trace STOCK-01
        def is_angle_a(value: Pending_Request_View): Base_Types::Boolean :=
          value == Pending_Request_View.Pending_R1_AngleA_One |
          value == Pending_Request_View.Pending_R1_AngleA_Two |
          value == Pending_Request_View.Pending_R2_AngleA_One |
          value == Pending_Request_View.Pending_R2_AngleA_Two;
        // @trace STOCK-01
        def amount_is_one(value: Pending_Request_View): Base_Types::Boolean :=
          value == Pending_Request_View.Pending_R1_AngleA_One |
          value == Pending_Request_View.Pending_R1_AngleB_One |
          value == Pending_Request_View.Pending_R2_AngleA_One |
          value == Pending_Request_View.Pending_R2_AngleB_One;
        // @trace STOCK-01
        def stock_is_sufficient(value: Pending_Request_View, angle_a: Angle_A_Stock_Band, angle_b: Angle_B_Stock_Band): Base_Types::Boolean :=
          (is_angle_a(value) &
           ((amount_is_one(value) & angle_a != Angle_A_Stock_Band.Zero) |
            (not amount_is_one(value) & angle_a == Angle_A_Stock_Band.Two_Or_More))) |
          (not is_angle_a(value) &
           ((amount_is_one(value) & angle_b != Angle_B_Stock_Band.Zero) |
            (not amount_is_one(value) & angle_b == Angle_B_Stock_Band.Two_Or_More)));

      initialize
        // @trace INIT-01
        guarantee INITIAL_INVENTORY_NO_DEMAND "Inventory assessment initializes without demand":
          inventory_finding == Inventory_Finding.No_Demand;

      compute
        compute_cases
          // @trace STOCK-01
          case STOCK_NO_DEMAND "No pending request makes inventory inapplicable":
            assume pending_request == Pending_Request_View.No_Pending_Request;
            guarantee inventory_finding == Inventory_Finding.No_Demand;
          // @trace RISK-02
          case STOCK_INVALID "Invalid relevant inventory evidence is identified":
            assume pending_request != Pending_Request_View.No_Pending_Request &
                   inventory_evidence.status == Input_Status.Invalid;
            guarantee inventory_finding == Inventory_Finding.Invalid_Inventory;
          // @trace STOCK-01
          case STOCK_SUFFICIENT "The selected product band meets the requested amount threshold":
            assume pending_request != Pending_Request_View.No_Pending_Request &
                   inventory_evidence.status == Input_Status.Valid &
                   stock_is_sufficient(pending_request, inventory_evidence.stock_band_angle_a, inventory_evidence.stock_band_angle_b);
            guarantee inventory_finding == Inventory_Finding.Sufficient;
          // @trace STOCK-01
          case STOCK_INSUFFICIENT "The selected product band is below the requested amount threshold":
            assume pending_request != Pending_Request_View.No_Pending_Request &
                   inventory_evidence.status == Input_Status.Valid &
                   not stock_is_sufficient(pending_request, inventory_evidence.stock_band_angle_a, inventory_evidence.stock_band_angle_b);
            guarantee inventory_finding == Inventory_Finding.Insufficient;
    }*/
  }

  // @trace PART-04
  part def Dispatch_Arbiter :> Thread {
    // @trace INT-06
    port dispatch_candidate : DataPort { in :>> type : Dispatch_Candidate; }
    // @trace INT-07
    port inventory_finding : DataPort { in :>> type : Inventory_Finding; }
    // @trace INT-08
    port readiness_sample : DataPort { in :>> type : Dispatch_Readiness_Sample; }
    // @trace INT-09
    port registry_instruction : DataPort { out :>> type : Registry_Instruction; }
    // @trace INT-10
    port shipment_release : DataPort { out :>> type : Shipment_Release_Directive; }
    // @trace INT-12
    port dispatch_disposition : DataPort { out :>> type : Dispatch_Disposition; }

    language "GUMBO" /*{
      functions
        // @trace COHERENCE-01
        def release_for(value: Request_Value): Shipment_Release_Directive :=
          if (value == Request_Value.R1_AngleA_One)? Shipment_Release_Directive.Release_R1_AngleA_One
          else if (value == Request_Value.R1_AngleA_Two)? Shipment_Release_Directive.Release_R1_AngleA_Two
          else if (value == Request_Value.R1_AngleB_One)? Shipment_Release_Directive.Release_R1_AngleB_One
          else if (value == Request_Value.R1_AngleB_Two)? Shipment_Release_Directive.Release_R1_AngleB_Two
          else if (value == Request_Value.R2_AngleA_One)? Shipment_Release_Directive.Release_R2_AngleA_One
          else if (value == Request_Value.R2_AngleA_Two)? Shipment_Release_Directive.Release_R2_AngleA_Two
          else if (value == Request_Value.R2_AngleB_One)? Shipment_Release_Directive.Release_R2_AngleB_One
          else Shipment_Release_Directive.Release_R2_AngleB_Two;
        // @trace COHERENCE-01
        def instruction_for(value: Request_Value): Registry_Instruction :=
          if (value == Request_Value.R1_AngleA_One)? Registry_Instruction.Mark_Submitted_R1_AngleA_One
          else if (value == Request_Value.R1_AngleA_Two)? Registry_Instruction.Mark_Submitted_R1_AngleA_Two
          else if (value == Request_Value.R1_AngleB_One)? Registry_Instruction.Mark_Submitted_R1_AngleB_One
          else if (value == Request_Value.R1_AngleB_Two)? Registry_Instruction.Mark_Submitted_R1_AngleB_Two
          else if (value == Request_Value.R2_AngleA_One)? Registry_Instruction.Mark_Submitted_R2_AngleA_One
          else if (value == Request_Value.R2_AngleA_Two)? Registry_Instruction.Mark_Submitted_R2_AngleA_Two
          else if (value == Request_Value.R2_AngleB_One)? Registry_Instruction.Mark_Submitted_R2_AngleB_One
          else Registry_Instruction.Mark_Submitted_R2_AngleB_Two;
        // @trace PRIORITY-02
        def release_eligible(candidate: Dispatch_Candidate, finding: Inventory_Finding, readiness: Dispatch_Readiness_Sample): Base_Types::Boolean :=
          candidate.request != Request_Value.No_Request &
          candidate.event_blocked == F & candidate.recovery_hold == F &
          finding == Inventory_Finding.Sufficient &
          readiness.status == Input_Status.Valid &
          readiness.readiness == Dispatch_Readiness.Ready;
        // @trace PRIORITY-02
        def blocker_disposition(candidate: Dispatch_Candidate, finding: Inventory_Finding, readiness: Dispatch_Readiness_Sample): Dispatch_Disposition :=
          if (candidate.event_blocked == T)? Dispatch_Disposition.Event_Blocked
          else if (candidate.recovery_hold == T)? Dispatch_Disposition.Recovery_Held
          else if (finding == Inventory_Finding.Invalid_Inventory)? Dispatch_Disposition.Inventory_Invalid
          else if (readiness.status == Input_Status.Invalid)? Dispatch_Disposition.Readiness_Invalid
          else if (finding == Inventory_Finding.Insufficient)? Dispatch_Disposition.Waiting_Stock
          else Dispatch_Disposition.Waiting_Dispatch;

      initialize
        // @trace INIT-01
        guarantee INITIAL_ARBITER_SAFE "The principal decision owner initializes all outputs to no action":
          registry_instruction == Registry_Instruction.No_State_Instruction &
          shipment_release == Shipment_Release_Directive.No_Release &
          dispatch_disposition == Dispatch_Disposition.No_Dispatch_Demand;

      compute
        compute_cases
          // @trace CASE-10
          case CASE_10_NO_DISPATCH_DEMAND "No pending candidate emits no release and no state instruction":
            assume dispatch_candidate.request == Request_Value.No_Request;
            guarantee shipment_release == Shipment_Release_Directive.No_Release &
                      registry_instruction == Registry_Instruction.No_State_Instruction &
                      dispatch_disposition == Dispatch_Disposition.No_Dispatch_Demand;
          // @trace CASE-11
          case CASE_11_FIRST_BLOCKER "A pending candidate with any priority blocker emits no action and the first disposition":
            assume dispatch_candidate.request != Request_Value.No_Request &
                   not release_eligible(dispatch_candidate, inventory_finding, readiness_sample);
            guarantee shipment_release == Shipment_Release_Directive.No_Release &
                      registry_instruction == Registry_Instruction.No_State_Instruction &
                      dispatch_disposition == blocker_disposition(dispatch_candidate, inventory_finding, readiness_sample);
          // @trace CASE-12
          case CASE_12_AUTHORIZE "An unblocked pending candidate with sufficient valid stock and valid readiness emits matching release and instruction":
            assume release_eligible(dispatch_candidate, inventory_finding, readiness_sample);
            guarantee shipment_release == release_for(dispatch_candidate.request) &
                      registry_instruction == instruction_for(dispatch_candidate.request) &
                      dispatch_disposition == Dispatch_Disposition.Release_Issued;
    }*/
  }

  // @trace PART-05
  part def Customer_Notice_Synthesis :> Thread {
    // @trace INT-11
    port registry_outcome : DataPort { in :>> type : Registry_Outcome; }
    // @trace INT-12
    port dispatch_disposition : DataPort { in :>> type : Dispatch_Disposition; }
    // @trace INT-13
    port customer_notice : DataPort { out :>> type : Customer_Dispatch_Notice; }

    language "GUMBO" /*{
      functions
        // @trace NOTICE-01
        def notice_for(registry: Registry_Outcome, dispatch: Dispatch_Disposition): Customer_Dispatch_Notice :=
          if (registry == Registry_Outcome.Invalid_Event)? Customer_Dispatch_Notice.Invalid_Event
          else if (registry == Registry_Outcome.Identifier_Conflict)? Customer_Dispatch_Notice.Identifier_Conflict
          else if (registry == Registry_Outcome.Stale_Result)? Customer_Dispatch_Notice.Stale_Result
          else if (registry == Registry_Outcome.Busy)? Customer_Dispatch_Notice.Busy
          else if (registry == Registry_Outcome.Shipment_Failed_Retry_Pending)? Customer_Dispatch_Notice.Shipment_Failed_Retry_Pending
          else if (registry == Registry_Outcome.Duplicate_Acknowledged)? Customer_Dispatch_Notice.Duplicate_Acknowledged
          else if (dispatch == Dispatch_Disposition.Inventory_Invalid)? Customer_Dispatch_Notice.Inventory_Evidence_Invalid
          else if (dispatch == Dispatch_Disposition.Readiness_Invalid)? Customer_Dispatch_Notice.Readiness_Evidence_Invalid
          else if (dispatch == Dispatch_Disposition.Waiting_Stock)? Customer_Dispatch_Notice.Waiting_For_Stock
          else if (dispatch == Dispatch_Disposition.Waiting_Dispatch)? Customer_Dispatch_Notice.Waiting_For_Dispatch
          else if (dispatch == Dispatch_Disposition.Release_Issued)? Customer_Dispatch_Notice.Release_Issued
          else if (registry == Registry_Outcome.Shipment_Confirmed)? Customer_Dispatch_Notice.Shipment_Confirmed
          else if (registry == Registry_Outcome.Request_Accepted)? Customer_Dispatch_Notice.Request_Accepted
          else Customer_Dispatch_Notice.None;

      initialize
        // @trace INIT-01
        guarantee INITIAL_NOTICE_NONE "Customer notice initializes to None":
          customer_notice == Customer_Dispatch_Notice.None;

      compute
        // @trace NOTICE-01
        guarantee NOTICE_PRIORITY_RESOLUTION "The notice owner resolves registry and dispatch facts in the approved order":
          customer_notice == notice_for(registry_outcome, dispatch_disposition);
    }*/
  }

  // @generated-support SUPPORT-01 behavior-free containment and boundary delegation only
  part def Dispatch_Coordination_Process :> Process {
    // @trace PART-01
    part request_qualification : Request_Qualification;
    // @trace PART-02
    part request_registry : Request_Registry;
    // @trace PART-03
    part inventory_assessment : Inventory_Assessment;
    // @trace PART-04
    part dispatch_arbiter : Dispatch_Arbiter;
    // @trace PART-05
    part customer_notice_synthesis : Customer_Notice_Synthesis;

    // @generated-support INT-01 inbound Process boundary port
    port request_arrival : DataPort { in :>> type : Request_Arrival_Sample; }
    // @generated-support INT-03 inbound Process boundary port
    port shipment_result : DataPort { in :>> type : Shipment_Result_Sample; }
    // @generated-support INT-05 inbound Process boundary port
    port inventory_evidence : DataPort { in :>> type : Inventory_Sample; }
    // @generated-support INT-08 inbound Process boundary port
    port readiness_sample : DataPort { in :>> type : Dispatch_Readiness_Sample; }
    // @generated-support INT-10 outbound Process boundary port
    port shipment_release : DataPort { out :>> type : Shipment_Release_Directive; }
    // @generated-support INT-13 outbound Process boundary port
    port customer_notice : DataPort { out :>> type : Customer_Dispatch_Notice; }

    // @generated-support INT-01 Process-to-Thread delegation
    connection support_arrival_to_qualification : PortConnection
      connect request_arrival to request_qualification.request_arrival;
    // @trace INT-02
    connection qualified_arrival_to_registry : PortConnection
      connect request_qualification.arrival_fact to request_registry.arrival_fact;
    // @generated-support INT-03 Process-to-Thread delegation
    connection support_result_to_registry : PortConnection
      connect shipment_result to request_registry.shipment_result;
    // @trace INT-04
    connection pending_request_to_inventory : PortConnection
      connect request_registry.pending_request to inventory_assessment.pending_request;
    // @generated-support INT-05 Process-to-Thread delegation
    connection support_inventory_to_assessment : PortConnection
      connect inventory_evidence to inventory_assessment.inventory_evidence;
    // @trace INT-06
    connection candidate_to_arbiter : PortConnection
      connect request_registry.dispatch_candidate to dispatch_arbiter.dispatch_candidate;
    // @trace INT-07
    connection inventory_finding_to_arbiter : PortConnection
      connect inventory_assessment.inventory_finding to dispatch_arbiter.inventory_finding;
    // @generated-support INT-08 Process-to-Thread delegation
    connection support_readiness_to_arbiter : PortConnection
      connect readiness_sample to dispatch_arbiter.readiness_sample;
    // @trace INT-09
    connection arbiter_instruction_to_registry : PortConnection
      connect dispatch_arbiter.registry_instruction to request_registry.registry_instruction;
    // @generated-support INT-10 Thread-to-Process delegation
    connection support_release_to_process : PortConnection
      connect dispatch_arbiter.shipment_release to shipment_release;
    // @trace INT-11
    connection registry_outcome_to_notice : PortConnection
      connect request_registry.registry_outcome to customer_notice_synthesis.registry_outcome;
    // @trace INT-12
    connection disposition_to_notice : PortConnection
      connect dispatch_arbiter.dispatch_disposition to customer_notice_synthesis.dispatch_disposition;
    // @generated-support INT-13 Thread-to-Process delegation
    connection support_notice_to_process : PortConnection
      connect customer_notice_synthesis.customer_notice to customer_notice;
  }

  // @trace BOUND-01
  part def Finished_Product_Dispatch_Coordinator_System :> System {
    // @generated-support SUPPORT-01 sole behavior-free Process usage
    part dispatch_coordination_process : Dispatch_Coordination_Process;

    // @trace MON-01
    port request_arrival : DataPort { in :>> type : Request_Arrival_Sample; }
    // @trace MON-04
    port shipment_result : DataPort { in :>> type : Shipment_Result_Sample; }
    // @trace MON-02
    port inventory_evidence : DataPort { in :>> type : Inventory_Sample; }
    // @trace MON-03
    port readiness_sample : DataPort { in :>> type : Dispatch_Readiness_Sample; }
    // @trace CTRL-01
    port shipment_release : DataPort { out :>> type : Shipment_Release_Directive; }
    // @trace CTRL-02
    port customer_notice : DataPort { out :>> type : Customer_Dispatch_Notice; }

    // @generated-support INT-01 System-to-Process delegation
    connection support_boundary_arrival : PortConnection
      connect request_arrival to dispatch_coordination_process.request_arrival;
    // @generated-support INT-03 System-to-Process delegation
    connection support_boundary_result : PortConnection
      connect shipment_result to dispatch_coordination_process.shipment_result;
    // @generated-support INT-05 System-to-Process delegation
    connection support_boundary_inventory : PortConnection
      connect inventory_evidence to dispatch_coordination_process.inventory_evidence;
    // @generated-support INT-08 System-to-Process delegation
    connection support_boundary_readiness : PortConnection
      connect readiness_sample to dispatch_coordination_process.readiness_sample;
    // @generated-support INT-10 Process-to-System delegation
    connection support_boundary_release : PortConnection
      connect dispatch_coordination_process.shipment_release to shipment_release;
    // @generated-support INT-13 Process-to-System delegation
    connection support_boundary_notice : PortConnection
      connect dispatch_coordination_process.customer_notice to customer_notice;
  }

  // @trace STRUCT-01
  part finished_product_dispatch_coordinator : Finished_Product_Dispatch_Coordinator_System;
}
