// #Sireum
package scp_candidate.Factory_Dispatch_Coordinator
import org.sireum._
import scp_candidate._

object Request_Registry_dispatch_coordination_process_request_registry {
  var active: Request_Value.Type = Request_Value.No_Request
  var submitted: B = F
  var lastCompleted: Request_Value.Type = Request_Value.No_Request

  def initialise(api: Request_Registry_Initialization_Api): Unit = {
    Contract(Modifies(active, submitted, lastCompleted, api))
    active = Request_Value.No_Request
    submitted = F
    lastCompleted = Request_Value.No_Request
    api.put_pending_request(Pending_Request_View.No_Pending_Request)
    api.put_dispatch_candidate(Dispatch_Candidate(Request_Value.No_Request, F, F))
    api.put_registry_outcome(Registry_Outcome.No_Registry_Notice)
  }
  def timeTriggered(api: Request_Registry_Operational_Api): Unit = {
    Contract(Modifies(active, submitted, lastCompleted, api))
    val arrival: Arrival_Fact.Type = api.get_arrival_fact().get
    val result: Shipment_Result_Sample.Type = api.get_shipment_result().get
    val instruction: Registry_Instruction.Type = api.get_registry_instruction().get
    var eventActive: Request_Value.Type = active
    var eventSubmitted: B = submitted
    var blocked: B = F
    var hold: B = F
    var outcome: Registry_Outcome.Type = Registry_Outcome.No_Registry_Notice
    if (invalidEvent(arrival, result)) {
      outcome = Registry_Outcome.Invalid_Event
      blocked = T
    } else if (validResult(result)) {
      if (submitted && sameId(resultRequest(result), active)) {
        if (success(result)) {
          outcome = Registry_Outcome.Shipment_Confirmed
          lastCompleted = active
          eventActive = Request_Value.No_Request
          eventSubmitted = F
        } else {
          outcome = Registry_Outcome.Shipment_Failed_Retry_Pending
          eventSubmitted = F
          hold = T
        }
      } else {
        outcome = Registry_Outcome.Stale_Result
      }
    } else {
      val request: Request_Value.Type = arrivalRequest(arrival)
      if (request != Request_Value.No_Request) {
        if (request == active || request == lastCompleted) {
          outcome = Registry_Outcome.Duplicate_Acknowledged
        } else if (sameId(request, active) || sameId(request, lastCompleted)) {
          outcome = Registry_Outcome.Identifier_Conflict
          blocked = T
        } else if (active == Request_Value.No_Request) {
          outcome = Registry_Outcome.Request_Accepted
          eventActive = request
          eventSubmitted = F
        } else {
          outcome = Registry_Outcome.Busy
        }
      }
    }
    api.put_pending_request(pendingView(eventActive, eventSubmitted))
    api.put_dispatch_candidate(Dispatch_Candidate(eventActive, blocked, hold))
    api.put_registry_outcome(outcome)
    active = eventActive
    submitted = eventSubmitted
    if (instructionRequest(instruction) == active) { submitted = T }
  }
  def arrivalRequest(value: Arrival_Fact.Type): Request_Value.Type = {
    value match {
      case Arrival_Fact.Valid_R1_AngleA_One => return Request_Value.R1_AngleA_One
      case Arrival_Fact.Valid_R1_AngleA_Two => return Request_Value.R1_AngleA_Two
      case Arrival_Fact.Valid_R1_AngleB_One => return Request_Value.R1_AngleB_One
      case Arrival_Fact.Valid_R1_AngleB_Two => return Request_Value.R1_AngleB_Two
      case Arrival_Fact.Valid_R2_AngleA_One => return Request_Value.R2_AngleA_One
      case Arrival_Fact.Valid_R2_AngleA_Two => return Request_Value.R2_AngleA_Two
      case Arrival_Fact.Valid_R2_AngleB_One => return Request_Value.R2_AngleB_One
      case Arrival_Fact.Valid_R2_AngleB_Two => return Request_Value.R2_AngleB_Two
      case _ => return Request_Value.No_Request
    }
  }
  def resultRequest(value: Shipment_Result_Sample.Type): Request_Value.Type = {
    value match {
      case Shipment_Result_Sample.Valid_R1_Succeeded => return Request_Value.R1_AngleA_One
      case Shipment_Result_Sample.Valid_R1_Failed => return Request_Value.R1_AngleA_One
      case Shipment_Result_Sample.Valid_R2_Succeeded => return Request_Value.R2_AngleA_One
      case Shipment_Result_Sample.Valid_R2_Failed => return Request_Value.R2_AngleA_One
      case _ => return Request_Value.No_Request
    }
  }
  def invalidEvent(arrival: Arrival_Fact.Type, result: Shipment_Result_Sample.Type): B = {
    return arrival == Arrival_Fact.Invalid_Arrival || result == Shipment_Result_Sample.Invalid_R1_Succeeded || result == Shipment_Result_Sample.Invalid_R1_Failed ||
      result == Shipment_Result_Sample.Invalid_R2_Succeeded || result == Shipment_Result_Sample.Invalid_R2_Failed ||
      (arrival != Arrival_Fact.No_Arrival_Fact && result != Shipment_Result_Sample.No_Result)
  }
  def validResult(value: Shipment_Result_Sample.Type): B = {
    return value == Shipment_Result_Sample.Valid_R1_Succeeded || value == Shipment_Result_Sample.Valid_R1_Failed ||
      value == Shipment_Result_Sample.Valid_R2_Succeeded || value == Shipment_Result_Sample.Valid_R2_Failed
  }
  def success(value: Shipment_Result_Sample.Type): B = {
    return value == Shipment_Result_Sample.Valid_R1_Succeeded || value == Shipment_Result_Sample.Valid_R2_Succeeded
  }
  def sameId(left: Request_Value.Type, right: Request_Value.Type): B = {
    return (isR1(left) && isR1(right)) || (isR2(left) && isR2(right))
  }
  def isR1(value: Request_Value.Type): B = {
    return value == Request_Value.R1_AngleA_One || value == Request_Value.R1_AngleA_Two || value == Request_Value.R1_AngleB_One || value == Request_Value.R1_AngleB_Two
  }
  def isR2(value: Request_Value.Type): B = {
    return value == Request_Value.R2_AngleA_One || value == Request_Value.R2_AngleA_Two || value == Request_Value.R2_AngleB_One || value == Request_Value.R2_AngleB_Two
  }
  def pendingView(value: Request_Value.Type, isSubmitted: B): Pending_Request_View.Type = {
    if (isSubmitted) { return Pending_Request_View.No_Pending_Request }
    value match {
      case Request_Value.R1_AngleA_One => return Pending_Request_View.Pending_R1_AngleA_One
      case Request_Value.R1_AngleA_Two => return Pending_Request_View.Pending_R1_AngleA_Two
      case Request_Value.R1_AngleB_One => return Pending_Request_View.Pending_R1_AngleB_One
      case Request_Value.R1_AngleB_Two => return Pending_Request_View.Pending_R1_AngleB_Two
      case Request_Value.R2_AngleA_One => return Pending_Request_View.Pending_R2_AngleA_One
      case Request_Value.R2_AngleA_Two => return Pending_Request_View.Pending_R2_AngleA_Two
      case Request_Value.R2_AngleB_One => return Pending_Request_View.Pending_R2_AngleB_One
      case Request_Value.R2_AngleB_Two => return Pending_Request_View.Pending_R2_AngleB_Two
      case _ => return Pending_Request_View.No_Pending_Request
    }
  }
  def instructionRequest(value: Registry_Instruction.Type): Request_Value.Type = {
    value match {
      case Registry_Instruction.Mark_Submitted_R1_AngleA_One => return Request_Value.R1_AngleA_One
      case Registry_Instruction.Mark_Submitted_R1_AngleA_Two => return Request_Value.R1_AngleA_Two
      case Registry_Instruction.Mark_Submitted_R1_AngleB_One => return Request_Value.R1_AngleB_One
      case Registry_Instruction.Mark_Submitted_R1_AngleB_Two => return Request_Value.R1_AngleB_Two
      case Registry_Instruction.Mark_Submitted_R2_AngleA_One => return Request_Value.R2_AngleA_One
      case Registry_Instruction.Mark_Submitted_R2_AngleA_Two => return Request_Value.R2_AngleA_Two
      case Registry_Instruction.Mark_Submitted_R2_AngleB_One => return Request_Value.R2_AngleB_One
      case Registry_Instruction.Mark_Submitted_R2_AngleB_Two => return Request_Value.R2_AngleB_Two
      case _ => return Request_Value.No_Request
    }
  }
  def finalise(api: Request_Registry_Operational_Api): Unit = { }
}
