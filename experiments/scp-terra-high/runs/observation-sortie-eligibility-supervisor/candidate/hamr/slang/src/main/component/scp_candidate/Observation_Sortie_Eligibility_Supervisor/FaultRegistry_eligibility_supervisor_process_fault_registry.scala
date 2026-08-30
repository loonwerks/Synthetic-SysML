// #Sireum

package scp_candidate.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object FaultRegistry_eligibility_supervisor_process_fault_registry {

  def initialise(api: FaultRegistry_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_fault_summary(Observation_Sortie_Eligibility_Supervisor.FaultSummary.example())
  }

  def timeTriggered(api: FaultRegistry_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_fault_summary(FaultSummary(FaultState.Active, EquipmentCause.Energy))
  }

  def finalise(api: FaultRegistry_Operational_Api): Unit = { }
}
