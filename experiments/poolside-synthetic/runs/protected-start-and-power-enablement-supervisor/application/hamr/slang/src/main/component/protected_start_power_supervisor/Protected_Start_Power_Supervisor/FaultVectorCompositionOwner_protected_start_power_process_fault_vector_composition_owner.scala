// #Sireum

package protected_start_power_supervisor.Protected_Start_Power_Supervisor

import org.sireum._
import protected_start_power_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner {

  def initialise(api: FaultVectorCompositionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_exact_fault_summary(Protected_Start_Power_Supervisor.ExactFaultSummary.example())
  }

  def timeTriggered(api: FaultVectorCompositionOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee EXACT_FAULT_VECTOR_AND_OR
        //   exact fault summary mirrors each fault and anyFault is their OR
        api.exact_fault_summary.commandFault == api.command_fault &
          api.exact_fault_summary.pedalFault == api.pedal_fault &
          api.exact_fault_summary.thermalFault == api.thermal_fault &
          api.exact_fault_summary.supplyFault == api.supply_fault &
          api.exact_fault_summary.parkingBrakeFault == api.parking_brake_fault &
          api.exact_fault_summary.selfTestFault == api.self_test_fault &
          api.exact_fault_summary.anyFault == (api.command_fault | api.pedal_fault |
            api.thermal_fault |
            api.supply_fault |
            api.parking_brake_fault |
            api.self_test_fault)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_command_fault: Option[Base_Types.Boolean] = api.get_command_fault()
    api.logInfo(s"Received on data port command_fault: ${apiUsage_command_fault}")
    val apiUsage_pedal_fault: Option[Base_Types.Boolean] = api.get_pedal_fault()
    api.logInfo(s"Received on data port pedal_fault: ${apiUsage_pedal_fault}")
    val apiUsage_thermal_fault: Option[Base_Types.Boolean] = api.get_thermal_fault()
    api.logInfo(s"Received on data port thermal_fault: ${apiUsage_thermal_fault}")
    val apiUsage_supply_fault: Option[Base_Types.Boolean] = api.get_supply_fault()
    api.logInfo(s"Received on data port supply_fault: ${apiUsage_supply_fault}")
    val apiUsage_parking_brake_fault: Option[Base_Types.Boolean] = api.get_parking_brake_fault()
    api.logInfo(s"Received on data port parking_brake_fault: ${apiUsage_parking_brake_fault}")
    val apiUsage_self_test_fault: Option[Base_Types.Boolean] = api.get_self_test_fault()
    api.logInfo(s"Received on data port self_test_fault: ${apiUsage_self_test_fault}")
  }

  def finalise(api: FaultVectorCompositionOwner_Operational_Api): Unit = { }
}
