// #Sireum
package scp_candidate.Factory_Dispatch_Coordinator
import org.sireum._
import scp_candidate._

object Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter {
  def initialise(api: Dispatch_Arbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_registry_instruction(Registry_Instruction.No_State_Instruction)
    api.put_shipment_release(Shipment_Release_Directive.No_Release)
    api.put_dispatch_disposition(Dispatch_Disposition.No_Dispatch_Demand)
  }
  def timeTriggered(api: Dispatch_Arbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    val candidate: Dispatch_Candidate = api.get_dispatch_candidate().get
    val finding: Inventory_Finding.Type = api.get_inventory_finding().get
    val readiness: Dispatch_Readiness_Sample = api.get_readiness_sample().get
    if (eligible(candidate, finding, readiness)) {
      api.put_registry_instruction(instructionFor(candidate.request))
      api.put_shipment_release(releaseFor(candidate.request))
      api.put_dispatch_disposition(Dispatch_Disposition.Release_Issued)
    } else {
      api.put_registry_instruction(Registry_Instruction.No_State_Instruction)
      api.put_shipment_release(Shipment_Release_Directive.No_Release)
      api.put_dispatch_disposition(blockerFor(candidate, finding, readiness))
    }
  }
  def eligible(candidate: Dispatch_Candidate, finding: Inventory_Finding.Type, readiness: Dispatch_Readiness_Sample): B = {
    return candidate.request != Request_Value.No_Request && !candidate.event_blocked && !candidate.recovery_hold &&
      finding == Inventory_Finding.Sufficient && readiness.status == Input_Status.Valid && readiness.readiness == Dispatch_Readiness.Ready
  }
  def blockerFor(candidate: Dispatch_Candidate, finding: Inventory_Finding.Type, readiness: Dispatch_Readiness_Sample): Dispatch_Disposition.Type = {
    if (candidate.request == Request_Value.No_Request) { return Dispatch_Disposition.No_Dispatch_Demand }
    if (candidate.event_blocked) { return Dispatch_Disposition.Event_Blocked }
    if (candidate.recovery_hold) { return Dispatch_Disposition.Recovery_Held }
    if (finding == Inventory_Finding.Invalid_Inventory) { return Dispatch_Disposition.Inventory_Invalid }
    if (readiness.status == Input_Status.Invalid) { return Dispatch_Disposition.Readiness_Invalid }
    if (finding == Inventory_Finding.Insufficient) { return Dispatch_Disposition.Waiting_Stock }
    return Dispatch_Disposition.Waiting_Dispatch
  }
  def releaseFor(value: Request_Value.Type): Shipment_Release_Directive.Type = {
    value match {
      case Request_Value.R1_AngleA_One => return Shipment_Release_Directive.Release_R1_AngleA_One
      case Request_Value.R1_AngleA_Two => return Shipment_Release_Directive.Release_R1_AngleA_Two
      case Request_Value.R1_AngleB_One => return Shipment_Release_Directive.Release_R1_AngleB_One
      case Request_Value.R1_AngleB_Two => return Shipment_Release_Directive.Release_R1_AngleB_Two
      case Request_Value.R2_AngleA_One => return Shipment_Release_Directive.Release_R2_AngleA_One
      case Request_Value.R2_AngleA_Two => return Shipment_Release_Directive.Release_R2_AngleA_Two
      case Request_Value.R2_AngleB_One => return Shipment_Release_Directive.Release_R2_AngleB_One
      case Request_Value.R2_AngleB_Two => return Shipment_Release_Directive.Release_R2_AngleB_Two
      case _ => return Shipment_Release_Directive.No_Release
    }
  }
  def instructionFor(value: Request_Value.Type): Registry_Instruction.Type = {
    value match {
      case Request_Value.R1_AngleA_One => return Registry_Instruction.Mark_Submitted_R1_AngleA_One
      case Request_Value.R1_AngleA_Two => return Registry_Instruction.Mark_Submitted_R1_AngleA_Two
      case Request_Value.R1_AngleB_One => return Registry_Instruction.Mark_Submitted_R1_AngleB_One
      case Request_Value.R1_AngleB_Two => return Registry_Instruction.Mark_Submitted_R1_AngleB_Two
      case Request_Value.R2_AngleA_One => return Registry_Instruction.Mark_Submitted_R2_AngleA_One
      case Request_Value.R2_AngleA_Two => return Registry_Instruction.Mark_Submitted_R2_AngleA_Two
      case Request_Value.R2_AngleB_One => return Registry_Instruction.Mark_Submitted_R2_AngleB_One
      case Request_Value.R2_AngleB_Two => return Registry_Instruction.Mark_Submitted_R2_AngleB_Two
      case _ => return Registry_Instruction.No_State_Instruction
    }
  }
  def finalise(api: Dispatch_Arbiter_Operational_Api): Unit = { }
}
