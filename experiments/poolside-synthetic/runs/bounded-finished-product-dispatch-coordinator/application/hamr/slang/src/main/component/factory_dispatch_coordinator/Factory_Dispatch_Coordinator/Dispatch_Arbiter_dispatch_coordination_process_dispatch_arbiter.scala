// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter {

  def initialise(api: Dispatch_Arbiter_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.registry_instruction == Registry_Instruction.No_State_Instruction &
        api.shipment_release == Shipment_Release_Directive.No_Release &
        api.dispatch_disposition == Dispatch_Disposition.No_Dispatch_Demand
      )
    )
    api.put_registry_instruction(Factory_Dispatch_Coordinator.Registry_Instruction.No_State_Instruction)
    api.put_shipment_release(Factory_Dispatch_Coordinator.Shipment_Release_Directive.No_Release)
    api.put_dispatch_disposition(Factory_Dispatch_Coordinator.Dispatch_Disposition.No_Dispatch_Demand)
  }

  def timeTriggered(api: Dispatch_Arbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_10_NO_DISPATCH_DEMAND
        (api.dispatch_candidate.request == Request_Value.No_Request) ___>: (api.shipment_release == Shipment_Release_Directive.No_Release &
          api.registry_instruction == Registry_Instruction.No_State_Instruction &
          api.dispatch_disposition == Dispatch_Disposition.No_Dispatch_Demand)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.put_shipment_release(Shipment_Release_Directive.No_Release)
    api.put_registry_instruction(Registry_Instruction.No_State_Instruction)
    api.put_dispatch_disposition(Dispatch_Disposition.No_Dispatch_Demand)
  }

  def finalise(api: Dispatch_Arbiter_Operational_Api): Unit = { }
}
