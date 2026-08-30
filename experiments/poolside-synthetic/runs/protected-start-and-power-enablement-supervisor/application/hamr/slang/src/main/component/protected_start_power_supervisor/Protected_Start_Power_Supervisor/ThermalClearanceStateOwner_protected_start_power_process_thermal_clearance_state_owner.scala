// #Sireum

package protected_start_power_supervisor.Protected_Start_Power_Supervisor

import org.sireum._
import protected_start_power_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner {

  // BEGIN STATE VARS
  var thermalMemory: Protected_Start_Power_Supervisor.ThermalState.Type = Protected_Start_Power_Supervisor.ThermalState.Blocked
  // END STATE VARS

  def initialise(api: ThermalClearanceStateOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_thermal_state_facts(Protected_Start_Power_Supervisor.ThermalStateFacts.example())
    api.put_thermal_fault(Base_Types.Boolean_example())
  }

  def timeTriggered(api: ThermalClearanceStateOwner_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        thermalMemory
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee THERMAL_OUTPUT_COHERENCE
        //   thermalState tracks thermalMemory and thermalClear iff thermalMemory is Clear
        api.thermal_state_facts.thermalState == thermalMemory &
          api.thermal_state_facts.thermalClear == (thermalMemory == ThermalState.Clear),
        // case THERMAL_BLOCK_CURRENT_FAULT
        //   InvalidEvidence or OverLimit forces Blocked with thermal fault
        (api.qualified_temperature == QualifiedTemperature.InvalidEvidence |
          api.qualified_temperature == QualifiedTemperature.OverLimit) ___>: (thermalMemory == ThermalState.Blocked &
          api.thermal_state_facts.thermalClear == F &
          api.thermal_fault == T),
        // case THERMAL_ELEVATED_RESET_BLOCKED
        //   Elevated forces Blocked without thermal fault
        (api.qualified_temperature == QualifiedTemperature.Elevated) ___>: (thermalMemory == ThermalState.Blocked &
          api.thermal_state_facts.thermalClear == F &
          api.thermal_fault == F),
        // case THERMAL_FIRST_NOMINAL
        //   Nominal from Blocked moves to Confirming without thermal fault
        (api.qualified_temperature == QualifiedTemperature.Nominal &
          In(thermalMemory) == ThermalState.Blocked) ___>: (thermalMemory == ThermalState.Confirming &
          api.thermal_state_facts.thermalClear == F &
          api.thermal_fault == F),
        // case THERMAL_SECOND_NOMINAL
        //   Nominal from Confirming moves to Clear
        (api.qualified_temperature == QualifiedTemperature.Nominal &
          In(thermalMemory) == ThermalState.Confirming) ___>: (thermalMemory == ThermalState.Clear &
          api.thermal_state_facts.thermalClear == T &
          api.thermal_fault == F),
        // case THERMAL_CLEAR_RETENTION
        //   Nominal from Clear retains Clear
        (api.qualified_temperature == QualifiedTemperature.Nominal &
          In(thermalMemory) == ThermalState.Clear) ___>: (thermalMemory == ThermalState.Clear &
          api.thermal_state_facts.thermalClear == T &
          api.thermal_fault == F)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_qualified_temperature: Option[Protected_Start_Power_Supervisor.QualifiedTemperature.Type] = api.get_qualified_temperature()
    api.logInfo(s"Received on data port qualified_temperature: ${apiUsage_qualified_temperature}")
  }

  def finalise(api: ThermalClearanceStateOwner_Operational_Api): Unit = { }
}
