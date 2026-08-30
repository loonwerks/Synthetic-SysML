// #Sireum

package scp_candidate.Factory_Material_Continuity_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RecoverySupervisor_material_continuity_process_recovery_supervisor {

  def initialise(api: RecoverySupervisor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_gate_to_demand(Factory_Material_Continuity_Coordinator.RecoveryGate.OPEN)
    api.put_gate_to_supply(Factory_Material_Continuity_Coordinator.RecoveryGate.OPEN)
    api.put_gate_to_urgent(Factory_Material_Continuity_Coordinator.RecoveryGate.OPEN)
    api.put_gate_to_routine(Factory_Material_Continuity_Coordinator.RecoveryGate.OPEN)
    api.put_gate_to_replenishment(Factory_Material_Continuity_Coordinator.RecoveryGate.OPEN)
    api.put_emergency_state(Factory_Material_Continuity_Coordinator.EmergencyState.INACTIVE)
    api.put_recovery_state(Factory_Material_Continuity_Coordinator.RecoveryState.HEALTHY)
  }

  def timeTriggered(api: RecoverySupervisor_Operational_Api): Unit = { }

  def finalise(api: RecoverySupervisor_Operational_Api): Unit = { }
}
