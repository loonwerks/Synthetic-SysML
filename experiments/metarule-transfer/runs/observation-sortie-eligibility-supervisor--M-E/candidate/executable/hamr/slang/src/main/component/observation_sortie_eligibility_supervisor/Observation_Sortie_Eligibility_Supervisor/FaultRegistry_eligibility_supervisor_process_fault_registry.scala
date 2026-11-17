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
    val energy: Option[Observation_Sortie_Eligibility_Supervisor.EnergyAssessment] = api.get_energy_assessment()
    val navigation: Option[Observation_Sortie_Eligibility_Supervisor.NavigationAssessment] = api.get_navigation_assessment()
    val communication: Option[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment] = api.get_communication_assessment()
    val observation: Option[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment] = api.get_observation_assessment()
    val obstacle: Option[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment] = api.get_obstacle_assessment()
    val propulsion: Option[Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment] = api.get_propulsion_assessment()
    val result: Observation_Sortie_Eligibility_Supervisor.FaultSummary =
      if (energy.isEmpty || !energy.get.ready)
        Observation_Sortie_Eligibility_Supervisor.FaultSummary(
          Observation_Sortie_Eligibility_Supervisor.FaultState.Active,
          Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Energy)
      else if (propulsion.isEmpty || !propulsion.get.ready)
        Observation_Sortie_Eligibility_Supervisor.FaultSummary(
          Observation_Sortie_Eligibility_Supervisor.FaultState.Active,
          Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Propulsion)
      else if (navigation.isEmpty || !navigation.get.ready)
        Observation_Sortie_Eligibility_Supervisor.FaultSummary(
          Observation_Sortie_Eligibility_Supervisor.FaultState.Active,
          Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Navigation)
      else if (obstacle.isEmpty || !obstacle.get.ready)
        Observation_Sortie_Eligibility_Supervisor.FaultSummary(
          Observation_Sortie_Eligibility_Supervisor.FaultState.Active,
          Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Obstacle)
      else if (observation.isEmpty || !observation.get.ready)
        Observation_Sortie_Eligibility_Supervisor.FaultSummary(
          Observation_Sortie_Eligibility_Supervisor.FaultState.Active,
          Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Observation)
      else if (communication.isEmpty || !communication.get.ready)
        Observation_Sortie_Eligibility_Supervisor.FaultSummary(
          Observation_Sortie_Eligibility_Supervisor.FaultState.Active,
          Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Communication)
      else
        Observation_Sortie_Eligibility_Supervisor.FaultSummary(
          Observation_Sortie_Eligibility_Supervisor.FaultState.Clear,
          Observation_Sortie_Eligibility_Supervisor.EquipmentCause.None)
    api.put_fault_summary(result)
  }

  def finalise(api: FaultRegistry_Operational_Api): Unit = { }
}
