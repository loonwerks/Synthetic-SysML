// #Sireum

package scp_candidate.Protected_Start_Power_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner {

  def initialise(api: FaultVectorCompositionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_exact_fault_summary(Protected_Start_Power_Supervisor.ExactFaultSummary(F, F, F, F, F, F, F))
  }

  def timeTriggered(api: FaultVectorCompositionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_command_fault(), api.get_pedal_fault(), api.get_thermal_fault(), api.get_supply_fault(),
      api.get_parking_brake_fault(), api.get_self_test_fault()) match {
      case (Some(command), Some(pedal), Some(thermal), Some(supply), Some(brake), Some(selfTest)) =>
        api.put_exact_fault_summary(Protected_Start_Power_Supervisor.ExactFaultSummary(
          command, pedal, thermal, supply, brake, selfTest,
          command || pedal || thermal || supply || brake || selfTest))
    }
  }

  def finalise(api: FaultVectorCompositionOwner_Operational_Api): Unit = { }
}
