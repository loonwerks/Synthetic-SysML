// #Sireum

package equiv_shared_0.Factory_Dispatch_Coordinator

import org.sireum._
import equiv_shared_0._

object Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter {
  // BEGIN FUNCTIONS
  @strictpure def release_for(value: Factory_Dispatch_Coordinator.Request_Value.Type): Factory_Dispatch_Coordinator.Shipment_Release_Directive.Type = if (value == Request_Value.R1_AngleA_One) Shipment_Release_Directive.Release_R1_AngleA_One else if (value == Request_Value.R1_AngleA_Two) Shipment_Release_Directive.Release_R1_AngleA_Two else if (value == Request_Value.R1_AngleB_One) Shipment_Release_Directive.Release_R1_AngleB_One else if (value == Request_Value.R1_AngleB_Two) Shipment_Release_Directive.Release_R1_AngleB_Two else if (value == Request_Value.R2_AngleA_One) Shipment_Release_Directive.Release_R2_AngleA_One else if (value == Request_Value.R2_AngleA_Two) Shipment_Release_Directive.Release_R2_AngleA_Two else if (value == Request_Value.R2_AngleB_One) Shipment_Release_Directive.Release_R2_AngleB_One else Shipment_Release_Directive.Release_R2_AngleB_Two

  @strictpure def instruction_for(value: Factory_Dispatch_Coordinator.Request_Value.Type): Factory_Dispatch_Coordinator.Registry_Instruction.Type = if (value == Request_Value.R1_AngleA_One) Registry_Instruction.Mark_Submitted_R1_AngleA_One else if (value == Request_Value.R1_AngleA_Two) Registry_Instruction.Mark_Submitted_R1_AngleA_Two else if (value == Request_Value.R1_AngleB_One) Registry_Instruction.Mark_Submitted_R1_AngleB_One else if (value == Request_Value.R1_AngleB_Two) Registry_Instruction.Mark_Submitted_R1_AngleB_Two else if (value == Request_Value.R2_AngleA_One) Registry_Instruction.Mark_Submitted_R2_AngleA_One else if (value == Request_Value.R2_AngleA_Two) Registry_Instruction.Mark_Submitted_R2_AngleA_Two else if (value == Request_Value.R2_AngleB_One) Registry_Instruction.Mark_Submitted_R2_AngleB_One else Registry_Instruction.Mark_Submitted_R2_AngleB_Two

  @strictpure def release_eligible(candidate: Factory_Dispatch_Coordinator.Dispatch_Candidate, finding: Factory_Dispatch_Coordinator.Inventory_Finding.Type, readiness: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample): Base_Types.Boolean = candidate.request != Request_Value.No_Request &
    candidate.event_blocked == F &
    candidate.recovery_hold == F &
    finding == Inventory_Finding.Sufficient &
    readiness.status == Input_Status.Valid &
    readiness.readiness == Dispatch_Readiness.Ready

  @strictpure def blocker_disposition(candidate: Factory_Dispatch_Coordinator.Dispatch_Candidate, finding: Factory_Dispatch_Coordinator.Inventory_Finding.Type, readiness: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample): Factory_Dispatch_Coordinator.Dispatch_Disposition.Type = if (candidate.event_blocked == T) Dispatch_Disposition.Event_Blocked else if (candidate.recovery_hold == T) Dispatch_Disposition.Recovery_Held else if (finding == Inventory_Finding.Invalid_Inventory) Dispatch_Disposition.Inventory_Invalid else if (readiness.status == Input_Status.Invalid) Dispatch_Disposition.Readiness_Invalid else if (finding == Inventory_Finding.Insufficient) Dispatch_Disposition.Waiting_Stock else Dispatch_Disposition.Waiting_Dispatch
  // END FUNCTIONS
}
