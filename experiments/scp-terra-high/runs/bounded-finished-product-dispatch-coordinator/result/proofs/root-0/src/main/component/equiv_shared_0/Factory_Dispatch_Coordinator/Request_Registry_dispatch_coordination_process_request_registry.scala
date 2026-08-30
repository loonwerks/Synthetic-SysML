// #Sireum

package equiv_shared_0.Factory_Dispatch_Coordinator

import org.sireum._
import equiv_shared_0._

object Request_Registry_dispatch_coordination_process_request_registry {
  // BEGIN FUNCTIONS
  @strictpure def arrival_request(value: Factory_Dispatch_Coordinator.Arrival_Fact.Type): Factory_Dispatch_Coordinator.Request_Value.Type = if (value == Arrival_Fact.Valid_R1_AngleA_One) Request_Value.R1_AngleA_One else if (value == Arrival_Fact.Valid_R1_AngleA_Two) Request_Value.R1_AngleA_Two else if (value == Arrival_Fact.Valid_R1_AngleB_One) Request_Value.R1_AngleB_One else if (value == Arrival_Fact.Valid_R1_AngleB_Two) Request_Value.R1_AngleB_Two else if (value == Arrival_Fact.Valid_R2_AngleA_One) Request_Value.R2_AngleA_One else if (value == Arrival_Fact.Valid_R2_AngleA_Two) Request_Value.R2_AngleA_Two else if (value == Arrival_Fact.Valid_R2_AngleB_One) Request_Value.R2_AngleB_One else if (value == Arrival_Fact.Valid_R2_AngleB_Two) Request_Value.R2_AngleB_Two else Request_Value.No_Request

  @strictpure def arrival_is_valid(value: Factory_Dispatch_Coordinator.Arrival_Fact.Type): Base_Types.Boolean = value != Arrival_Fact.No_Arrival_Fact &
    value != Arrival_Fact.Invalid_Arrival

  @strictpure def result_request(value: Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type): Factory_Dispatch_Coordinator.Request_Value.Type = if (value == Shipment_Result_Sample.Valid_R1_Succeeded |
        value == Shipment_Result_Sample.Valid_R1_Failed |
        value == Shipment_Result_Sample.Invalid_R1_Succeeded |
        value == Shipment_Result_Sample.Invalid_R1_Failed) Request_Value.R1_AngleA_One else if (value == Shipment_Result_Sample.Valid_R2_Succeeded |
          value == Shipment_Result_Sample.Valid_R2_Failed |
          value == Shipment_Result_Sample.Invalid_R2_Succeeded |
          value == Shipment_Result_Sample.Invalid_R2_Failed) Request_Value.R2_AngleA_One else Request_Value.No_Request

  @strictpure def result_is_invalid(value: Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type): Base_Types.Boolean = value == Shipment_Result_Sample.Invalid_R1_Succeeded |
    value == Shipment_Result_Sample.Invalid_R1_Failed |
    value == Shipment_Result_Sample.Invalid_R2_Succeeded |
    value == Shipment_Result_Sample.Invalid_R2_Failed

  @strictpure def result_is_valid_success(value: Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type): Base_Types.Boolean = value == Shipment_Result_Sample.Valid_R1_Succeeded |
    value == Shipment_Result_Sample.Valid_R2_Succeeded

  @strictpure def result_is_valid_failure(value: Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type): Base_Types.Boolean = value == Shipment_Result_Sample.Valid_R1_Failed |
    value == Shipment_Result_Sample.Valid_R2_Failed

  @strictpure def result_is_valid_present(value: Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type): Base_Types.Boolean = result_is_valid_success(value) | result_is_valid_failure(value)

  @strictpure def active_request_of(value: Factory_Dispatch_Coordinator.Active_Slot.Type): Factory_Dispatch_Coordinator.Request_Value.Type = if (value == Active_Slot.Pending_R1_AngleA_One |
        value == Active_Slot.Submitted_R1_AngleA_One) Request_Value.R1_AngleA_One else if (value == Active_Slot.Pending_R1_AngleA_Two |
          value == Active_Slot.Submitted_R1_AngleA_Two) Request_Value.R1_AngleA_Two else if (value == Active_Slot.Pending_R1_AngleB_One |
          value == Active_Slot.Submitted_R1_AngleB_One) Request_Value.R1_AngleB_One else if (value == Active_Slot.Pending_R1_AngleB_Two |
          value == Active_Slot.Submitted_R1_AngleB_Two) Request_Value.R1_AngleB_Two else if (value == Active_Slot.Pending_R2_AngleA_One |
          value == Active_Slot.Submitted_R2_AngleA_One) Request_Value.R2_AngleA_One else if (value == Active_Slot.Pending_R2_AngleA_Two |
          value == Active_Slot.Submitted_R2_AngleA_Two) Request_Value.R2_AngleA_Two else if (value == Active_Slot.Pending_R2_AngleB_One |
          value == Active_Slot.Submitted_R2_AngleB_One) Request_Value.R2_AngleB_One else if (value == Active_Slot.Pending_R2_AngleB_Two |
          value == Active_Slot.Submitted_R2_AngleB_Two) Request_Value.R2_AngleB_Two else Request_Value.No_Request

  @strictpure def completed_request_of(value: Factory_Dispatch_Coordinator.Completion_Slot.Type): Factory_Dispatch_Coordinator.Request_Value.Type = if (value == Completion_Slot.Completed_R1_AngleA_One) Request_Value.R1_AngleA_One else if (value == Completion_Slot.Completed_R1_AngleA_Two) Request_Value.R1_AngleA_Two else if (value == Completion_Slot.Completed_R1_AngleB_One) Request_Value.R1_AngleB_One else if (value == Completion_Slot.Completed_R1_AngleB_Two) Request_Value.R1_AngleB_Two else if (value == Completion_Slot.Completed_R2_AngleA_One) Request_Value.R2_AngleA_One else if (value == Completion_Slot.Completed_R2_AngleA_Two) Request_Value.R2_AngleA_Two else if (value == Completion_Slot.Completed_R2_AngleB_One) Request_Value.R2_AngleB_One else if (value == Completion_Slot.Completed_R2_AngleB_Two) Request_Value.R2_AngleB_Two else Request_Value.No_Request

  @strictpure def active_is_submitted(value: Factory_Dispatch_Coordinator.Active_Slot.Type): Base_Types.Boolean = value == Active_Slot.Submitted_R1_AngleA_One |
    value == Active_Slot.Submitted_R1_AngleA_Two |
    value == Active_Slot.Submitted_R1_AngleB_One |
    value == Active_Slot.Submitted_R1_AngleB_Two |
    value == Active_Slot.Submitted_R2_AngleA_One |
    value == Active_Slot.Submitted_R2_AngleA_Two |
    value == Active_Slot.Submitted_R2_AngleB_One |
    value == Active_Slot.Submitted_R2_AngleB_Two

  @strictpure def active_is_pending(value: Factory_Dispatch_Coordinator.Active_Slot.Type): Base_Types.Boolean = value != Active_Slot.Empty &
    !(active_is_submitted(value))

  @strictpure def same_id(left: Factory_Dispatch_Coordinator.Request_Value.Type, right: Factory_Dispatch_Coordinator.Request_Value.Type): Base_Types.Boolean = left != Request_Value.No_Request &
    right != Request_Value.No_Request &
    ((left == Request_Value.R1_AngleA_One |
      left == Request_Value.R1_AngleA_Two |
      left == Request_Value.R1_AngleB_One |
      left == Request_Value.R1_AngleB_Two) &
      (right == Request_Value.R1_AngleA_One |
        right == Request_Value.R1_AngleA_Two |
        right == Request_Value.R1_AngleB_One |
        right == Request_Value.R1_AngleB_Two) |
      (left == Request_Value.R2_AngleA_One |
        left == Request_Value.R2_AngleA_Two |
        left == Request_Value.R2_AngleB_One |
        left == Request_Value.R2_AngleB_Two) &
        (right == Request_Value.R2_AngleA_One |
          right == Request_Value.R2_AngleA_Two |
          right == Request_Value.R2_AngleB_One |
          right == Request_Value.R2_AngleB_Two))

  @strictpure def invariant_holds(a: Factory_Dispatch_Coordinator.Active_Slot.Type, c: Factory_Dispatch_Coordinator.Completion_Slot.Type): Base_Types.Boolean = a == Active_Slot.Empty |
    !(same_id(active_request_of(a), completed_request_of(c)))

  @strictpure def pending_slot(value: Factory_Dispatch_Coordinator.Request_Value.Type): Factory_Dispatch_Coordinator.Active_Slot.Type = if (value == Request_Value.R1_AngleA_One) Active_Slot.Pending_R1_AngleA_One else if (value == Request_Value.R1_AngleA_Two) Active_Slot.Pending_R1_AngleA_Two else if (value == Request_Value.R1_AngleB_One) Active_Slot.Pending_R1_AngleB_One else if (value == Request_Value.R1_AngleB_Two) Active_Slot.Pending_R1_AngleB_Two else if (value == Request_Value.R2_AngleA_One) Active_Slot.Pending_R2_AngleA_One else if (value == Request_Value.R2_AngleA_Two) Active_Slot.Pending_R2_AngleA_Two else if (value == Request_Value.R2_AngleB_One) Active_Slot.Pending_R2_AngleB_One else Active_Slot.Pending_R2_AngleB_Two

  @strictpure def completed_slot(value: Factory_Dispatch_Coordinator.Request_Value.Type): Factory_Dispatch_Coordinator.Completion_Slot.Type = if (value == Request_Value.R1_AngleA_One) Completion_Slot.Completed_R1_AngleA_One else if (value == Request_Value.R1_AngleA_Two) Completion_Slot.Completed_R1_AngleA_Two else if (value == Request_Value.R1_AngleB_One) Completion_Slot.Completed_R1_AngleB_One else if (value == Request_Value.R1_AngleB_Two) Completion_Slot.Completed_R1_AngleB_Two else if (value == Request_Value.R2_AngleA_One) Completion_Slot.Completed_R2_AngleA_One else if (value == Request_Value.R2_AngleA_Two) Completion_Slot.Completed_R2_AngleA_Two else if (value == Request_Value.R2_AngleB_One) Completion_Slot.Completed_R2_AngleB_One else Completion_Slot.Completed_R2_AngleB_Two

  @strictpure def invalid_event(a: Factory_Dispatch_Coordinator.Arrival_Fact.Type, r: Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type): Base_Types.Boolean = a == Arrival_Fact.Invalid_Arrival |
    result_is_invalid(r) |
    arrival_is_valid(a) & result_is_valid_present(r)

  @strictpure def exact_duplicate(a: Factory_Dispatch_Coordinator.Arrival_Fact.Type, active_pre: Factory_Dispatch_Coordinator.Active_Slot.Type, completed_pre: Factory_Dispatch_Coordinator.Completion_Slot.Type): Base_Types.Boolean = arrival_is_valid(a) &
    (arrival_request(a) == active_request_of(active_pre) |
      arrival_request(a) == completed_request_of(completed_pre))

  @strictpure def identifier_conflict(a: Factory_Dispatch_Coordinator.Arrival_Fact.Type, active_pre: Factory_Dispatch_Coordinator.Active_Slot.Type, completed_pre: Factory_Dispatch_Coordinator.Completion_Slot.Type): Base_Types.Boolean = arrival_is_valid(a) & !(exact_duplicate(a, active_pre, completed_pre)) &
    (same_id(arrival_request(a), active_request_of(active_pre)) | same_id(arrival_request(a), completed_request_of(completed_pre)))

  @strictpure def event_active(a: Factory_Dispatch_Coordinator.Arrival_Fact.Type, r: Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type, active_pre: Factory_Dispatch_Coordinator.Active_Slot.Type, completed_pre: Factory_Dispatch_Coordinator.Completion_Slot.Type): Factory_Dispatch_Coordinator.Active_Slot.Type = if (invalid_event(a, r)) active_pre else if (result_is_valid_success(r) & active_is_submitted(active_pre) &
          same_id(result_request(r), active_request_of(active_pre))) Active_Slot.Empty else if (result_is_valid_failure(r) & active_is_submitted(active_pre) &
          same_id(result_request(r), active_request_of(active_pre))) pending_slot(active_request_of(active_pre)) else if (result_is_valid_present(r)) active_pre else if (a == Arrival_Fact.No_Arrival_Fact) active_pre else if (exact_duplicate(a, active_pre, completed_pre)) active_pre else if (identifier_conflict(a, active_pre, completed_pre)) active_pre else if (active_pre == Active_Slot.Empty) pending_slot(arrival_request(a)) else active_pre

  @strictpure def event_completion(a: Factory_Dispatch_Coordinator.Arrival_Fact.Type, r: Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type, active_pre: Factory_Dispatch_Coordinator.Active_Slot.Type, completed_pre: Factory_Dispatch_Coordinator.Completion_Slot.Type): Factory_Dispatch_Coordinator.Completion_Slot.Type = if (!(invalid_event(a, r)) & result_is_valid_success(r) &
        active_is_submitted(active_pre) &
        same_id(result_request(r), active_request_of(active_pre))) completed_slot(active_request_of(active_pre)) else completed_pre

  @strictpure def event_outcome(a: Factory_Dispatch_Coordinator.Arrival_Fact.Type, r: Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type, active_pre: Factory_Dispatch_Coordinator.Active_Slot.Type, completed_pre: Factory_Dispatch_Coordinator.Completion_Slot.Type): Factory_Dispatch_Coordinator.Registry_Outcome.Type = if (invalid_event(a, r)) Registry_Outcome.Invalid_Event else if (result_is_valid_success(r) & active_is_submitted(active_pre) &
          same_id(result_request(r), active_request_of(active_pre))) Registry_Outcome.Shipment_Confirmed else if (result_is_valid_failure(r) & active_is_submitted(active_pre) &
          same_id(result_request(r), active_request_of(active_pre))) Registry_Outcome.Shipment_Failed_Retry_Pending else if (result_is_valid_present(r)) Registry_Outcome.Stale_Result else if (a == Arrival_Fact.No_Arrival_Fact) Registry_Outcome.No_Registry_Notice else if (exact_duplicate(a, active_pre, completed_pre)) Registry_Outcome.Duplicate_Acknowledged else if (identifier_conflict(a, active_pre, completed_pre)) Registry_Outcome.Identifier_Conflict else if (active_pre == Active_Slot.Empty) Registry_Outcome.Request_Accepted else Registry_Outcome.Busy

  @strictpure def event_recovery_hold(a: Factory_Dispatch_Coordinator.Arrival_Fact.Type, r: Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type, active_pre: Factory_Dispatch_Coordinator.Active_Slot.Type): Base_Types.Boolean = !(invalid_event(a, r)) & result_is_valid_failure(r) &
    active_is_submitted(active_pre) &
    same_id(result_request(r), active_request_of(active_pre))

  @strictpure def event_blocked(a: Factory_Dispatch_Coordinator.Arrival_Fact.Type, r: Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type, active_pre: Factory_Dispatch_Coordinator.Active_Slot.Type, completed_pre: Factory_Dispatch_Coordinator.Completion_Slot.Type): Base_Types.Boolean = invalid_event(a, r) |
    !(result_is_valid_present(r)) & identifier_conflict(a, active_pre, completed_pre)

  @strictpure def pending_view(value: Factory_Dispatch_Coordinator.Active_Slot.Type): Factory_Dispatch_Coordinator.Pending_Request_View.Type = if (value == Active_Slot.Pending_R1_AngleA_One) Pending_Request_View.Pending_R1_AngleA_One else if (value == Active_Slot.Pending_R1_AngleA_Two) Pending_Request_View.Pending_R1_AngleA_Two else if (value == Active_Slot.Pending_R1_AngleB_One) Pending_Request_View.Pending_R1_AngleB_One else if (value == Active_Slot.Pending_R1_AngleB_Two) Pending_Request_View.Pending_R1_AngleB_Two else if (value == Active_Slot.Pending_R2_AngleA_One) Pending_Request_View.Pending_R2_AngleA_One else if (value == Active_Slot.Pending_R2_AngleA_Two) Pending_Request_View.Pending_R2_AngleA_Two else if (value == Active_Slot.Pending_R2_AngleB_One) Pending_Request_View.Pending_R2_AngleB_One else if (value == Active_Slot.Pending_R2_AngleB_Two) Pending_Request_View.Pending_R2_AngleB_Two else Pending_Request_View.No_Pending_Request

  @strictpure def candidate_request(value: Factory_Dispatch_Coordinator.Active_Slot.Type): Factory_Dispatch_Coordinator.Request_Value.Type = if (active_is_pending(value)) active_request_of(value) else Request_Value.No_Request

  @strictpure def committed_active(provisional: Factory_Dispatch_Coordinator.Active_Slot.Type, instruction: Factory_Dispatch_Coordinator.Registry_Instruction.Type): Factory_Dispatch_Coordinator.Active_Slot.Type = if (instruction == Registry_Instruction.Mark_Submitted_R1_AngleA_One) Active_Slot.Submitted_R1_AngleA_One else if (instruction == Registry_Instruction.Mark_Submitted_R1_AngleA_Two) Active_Slot.Submitted_R1_AngleA_Two else if (instruction == Registry_Instruction.Mark_Submitted_R1_AngleB_One) Active_Slot.Submitted_R1_AngleB_One else if (instruction == Registry_Instruction.Mark_Submitted_R1_AngleB_Two) Active_Slot.Submitted_R1_AngleB_Two else if (instruction == Registry_Instruction.Mark_Submitted_R2_AngleA_One) Active_Slot.Submitted_R2_AngleA_One else if (instruction == Registry_Instruction.Mark_Submitted_R2_AngleA_Two) Active_Slot.Submitted_R2_AngleA_Two else if (instruction == Registry_Instruction.Mark_Submitted_R2_AngleB_One) Active_Slot.Submitted_R2_AngleB_One else if (instruction == Registry_Instruction.Mark_Submitted_R2_AngleB_Two) Active_Slot.Submitted_R2_AngleB_Two else provisional
  // END FUNCTIONS
}
