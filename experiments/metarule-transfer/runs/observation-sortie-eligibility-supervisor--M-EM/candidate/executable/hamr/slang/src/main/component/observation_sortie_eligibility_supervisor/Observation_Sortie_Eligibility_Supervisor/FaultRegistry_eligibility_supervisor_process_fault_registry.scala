// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultRegistry_eligibility_supervisor_process_fault_registry {

  def initialise(api: FaultRegistry_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_fault_summary(Observation_Sortie_Eligibility_Supervisor.FaultSummary(
      Observation_Sortie_Eligibility_Supervisor.FaultState.Clear,
      Observation_Sortie_Eligibility_Supervisor.EquipmentCause.None))
  }

  def timeTriggered(api: FaultRegistry_Operational_Api): Unit = {
    Contract(Modifies(api))
    val energy: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment = api.get_energy_assessment().get
    val propulsion: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment = api.get_propulsion_assessment().get
    val navigation: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment = api.get_navigation_assessment().get
    val obstacle: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment = api.get_obstacle_assessment().get
    val observation: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment = api.get_observation_assessment().get
    val communication: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment = api.get_communication_assessment().get
    val result: Observation_Sortie_Eligibility_Supervisor.FaultSummary =
      if (!energy.ready) {
          Observation_Sortie_Eligibility_Supervisor.FaultSummary(Observation_Sortie_Eligibility_Supervisor.FaultState.Active, Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Energy)
        } else if (!propulsion.ready) {
          Observation_Sortie_Eligibility_Supervisor.FaultSummary(Observation_Sortie_Eligibility_Supervisor.FaultState.Active, Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Propulsion)
        } else if (!navigation.ready) {
          Observation_Sortie_Eligibility_Supervisor.FaultSummary(Observation_Sortie_Eligibility_Supervisor.FaultState.Active, Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Navigation)
        } else if (!obstacle.ready) {
          Observation_Sortie_Eligibility_Supervisor.FaultSummary(Observation_Sortie_Eligibility_Supervisor.FaultState.Active, Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Obstacle)
        } else if (!observation.ready) {
          Observation_Sortie_Eligibility_Supervisor.FaultSummary(Observation_Sortie_Eligibility_Supervisor.FaultState.Active, Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Observation)
        } else if (!communication.ready) {
          Observation_Sortie_Eligibility_Supervisor.FaultSummary(Observation_Sortie_Eligibility_Supervisor.FaultState.Active, Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Communication)
      } else {
        Observation_Sortie_Eligibility_Supervisor.FaultSummary(Observation_Sortie_Eligibility_Supervisor.FaultState.Clear, Observation_Sortie_Eligibility_Supervisor.EquipmentCause.None)
      }
    api.put_fault_summary(result)
  }

  def finalise(api: FaultRegistry_Operational_Api): Unit = { }
}
