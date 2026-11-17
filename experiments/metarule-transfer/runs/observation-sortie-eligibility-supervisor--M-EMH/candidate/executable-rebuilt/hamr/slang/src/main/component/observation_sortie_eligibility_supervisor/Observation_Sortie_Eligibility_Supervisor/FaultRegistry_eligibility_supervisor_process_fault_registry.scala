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
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case FAULT_ENERGY
        (!(api.energy_assessment.ready)) ___>: (api.fault_summary.faultState == FaultState.Active &
          api.fault_summary.primaryCause == EquipmentCause.Energy),
        // case FAULT_PROPULSION
        (api.energy_assessment.ready & !(api.propulsion_assessment.ready)) ___>: (api.fault_summary.faultState == FaultState.Active &
          api.fault_summary.primaryCause == EquipmentCause.Propulsion),
        // case FAULT_NAVIGATION
        (api.energy_assessment.ready & api.propulsion_assessment.ready &
          !(api.navigation_assessment.ready)) ___>: (api.fault_summary.faultState == FaultState.Active &
          api.fault_summary.primaryCause == EquipmentCause.Navigation),
        // case FAULT_OBSTACLE
        (api.energy_assessment.ready & api.propulsion_assessment.ready &
          api.navigation_assessment.ready &
          !(api.obstacle_assessment.ready)) ___>: (api.fault_summary.faultState == FaultState.Active &
          api.fault_summary.primaryCause == EquipmentCause.Obstacle),
        // case FAULT_OBSERVATION
        (api.energy_assessment.ready & api.propulsion_assessment.ready &
          api.navigation_assessment.ready &
          api.obstacle_assessment.ready &
          !(api.observation_assessment.ready)) ___>: (api.fault_summary.faultState == FaultState.Active &
          api.fault_summary.primaryCause == EquipmentCause.Observation),
        // case FAULT_COMMUNICATION
        (api.energy_assessment.ready & api.propulsion_assessment.ready &
          api.navigation_assessment.ready &
          api.obstacle_assessment.ready &
          api.observation_assessment.ready &
          !(api.communication_assessment.ready)) ___>: (api.fault_summary.faultState == FaultState.Active &
          api.fault_summary.primaryCause == EquipmentCause.Communication),
        // case FAULT_CLEAR
        (api.energy_assessment.ready & api.propulsion_assessment.ready &
          api.navigation_assessment.ready &
          api.obstacle_assessment.ready &
          api.observation_assessment.ready &
          api.communication_assessment.ready) ___>: (api.fault_summary.faultState == FaultState.Clear &
          api.fault_summary.primaryCause == EquipmentCause.None)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val energy = api.get_energy_assessment().get
    val navigation = api.get_navigation_assessment().get
    val communication = api.get_communication_assessment().get
    val observation = api.get_observation_assessment().get
    val obstacle = api.get_obstacle_assessment().get
    val propulsion = api.get_propulsion_assessment().get
    val result: FaultSummary =
      if (!energy.ready) FaultSummary(FaultState.Active, EquipmentCause.Energy)
      else if (!propulsion.ready) FaultSummary(FaultState.Active, EquipmentCause.Propulsion)
      else if (!navigation.ready) FaultSummary(FaultState.Active, EquipmentCause.Navigation)
      else if (!obstacle.ready) FaultSummary(FaultState.Active, EquipmentCause.Obstacle)
      else if (!observation.ready) FaultSummary(FaultState.Active, EquipmentCause.Observation)
      else if (!communication.ready) FaultSummary(FaultState.Active, EquipmentCause.Communication)
      else FaultSummary(FaultState.Clear, EquipmentCause.None)
    api.put_fault_summary(result)
  }

  def finalise(api: FaultRegistry_Operational_Api): Unit = { }
}
