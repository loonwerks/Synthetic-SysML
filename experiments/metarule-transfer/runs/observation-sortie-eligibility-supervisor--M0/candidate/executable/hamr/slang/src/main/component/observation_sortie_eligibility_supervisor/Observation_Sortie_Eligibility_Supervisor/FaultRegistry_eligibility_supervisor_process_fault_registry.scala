// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultRegistry_eligibility_supervisor_process_fault_registry {

  def initialise(api: FaultRegistry_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_fault_summary(FaultSummary(FaultState.Clear, EquipmentCause.None))
  }

  def timeTriggered(api: FaultRegistry_Operational_Api): Unit = {
    Contract(Modifies(api))
    val energyReady: B = api.get_energy_assessment() match { case Some(value) => value.ready; case _ => F }
    val propulsionReady: B = api.get_propulsion_assessment() match { case Some(value) => value.ready; case _ => F }
    val navigationReady: B = api.get_navigation_assessment() match { case Some(value) => value.ready; case _ => F }
    val obstacleReady: B = api.get_obstacle_assessment() match { case Some(value) => value.ready; case _ => F }
    val observationReady: B = api.get_observation_assessment() match { case Some(value) => value.ready; case _ => F }
    val communicationReady: B = api.get_communication_assessment() match { case Some(value) => value.ready; case _ => F }
    val summary: FaultSummary =
      if (!energyReady) FaultSummary(FaultState.Active, EquipmentCause.Energy)
      else if (!propulsionReady) FaultSummary(FaultState.Active, EquipmentCause.Propulsion)
      else if (!navigationReady) FaultSummary(FaultState.Active, EquipmentCause.Navigation)
      else if (!obstacleReady) FaultSummary(FaultState.Active, EquipmentCause.Obstacle)
      else if (!observationReady) FaultSummary(FaultState.Active, EquipmentCause.Observation)
      else if (!communicationReady) FaultSummary(FaultState.Active, EquipmentCause.Communication)
      else FaultSummary(FaultState.Clear, EquipmentCause.None)
    api.put_fault_summary(summary)
  }

  def finalise(api: FaultRegistry_Operational_Api): Unit = { }
}
