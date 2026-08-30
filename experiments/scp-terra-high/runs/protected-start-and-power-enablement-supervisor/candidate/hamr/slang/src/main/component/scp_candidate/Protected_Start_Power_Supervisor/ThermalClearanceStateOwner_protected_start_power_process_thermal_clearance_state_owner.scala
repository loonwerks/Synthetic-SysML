// #Sireum

package scp_candidate.Protected_Start_Power_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner {
  var thermalMemory: Protected_Start_Power_Supervisor.ThermalState.Type = Protected_Start_Power_Supervisor.ThermalState.Blocked

  def initialise(api: ThermalClearanceStateOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, thermalMemory))
    thermalMemory = Protected_Start_Power_Supervisor.ThermalState.Blocked
    api.put_thermal_state_facts(Protected_Start_Power_Supervisor.ThermalStateFacts(thermalMemory, F))
    api.put_thermal_fault(F)
  }

  def timeTriggered(api: ThermalClearanceStateOwner_Operational_Api): Unit = {
    Contract(Modifies(api, thermalMemory))
    api.get_qualified_temperature() match {
      case Some(temperature) =>
        val fault = temperature == Protected_Start_Power_Supervisor.QualifiedTemperature.InvalidEvidence ||
          temperature == Protected_Start_Power_Supervisor.QualifiedTemperature.OverLimit
        if (fault || temperature == Protected_Start_Power_Supervisor.QualifiedTemperature.Elevated) {
          thermalMemory = Protected_Start_Power_Supervisor.ThermalState.Blocked
        } else if (thermalMemory == Protected_Start_Power_Supervisor.ThermalState.Blocked) {
          thermalMemory = Protected_Start_Power_Supervisor.ThermalState.Confirming
        } else {
          thermalMemory = Protected_Start_Power_Supervisor.ThermalState.Clear
        }
        api.put_thermal_state_facts(Protected_Start_Power_Supervisor.ThermalStateFacts(
          thermalMemory, thermalMemory == Protected_Start_Power_Supervisor.ThermalState.Clear))
        api.put_thermal_fault(fault)
    }
  }

  def finalise(api: ThermalClearanceStateOwner_Operational_Api): Unit = { }
}
