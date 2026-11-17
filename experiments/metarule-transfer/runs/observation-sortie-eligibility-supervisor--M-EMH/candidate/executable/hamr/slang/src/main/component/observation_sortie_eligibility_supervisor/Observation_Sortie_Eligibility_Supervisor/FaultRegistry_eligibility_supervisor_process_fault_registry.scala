// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultRegistry_eligibility_supervisor_process_fault_registry {

  def initialise(api: FaultRegistry_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_fault_summary(Observation_Sortie_Eligibility_Supervisor.FaultSummary.example())
  }

  def timeTriggered(api: FaultRegistry_Operational_Api): Unit = {
    // example api usage

    val apiUsage_energy_assessment: Option[Observation_Sortie_Eligibility_Supervisor.EnergyAssessment] = api.get_energy_assessment()
    api.logInfo(s"Received on data port energy_assessment: ${apiUsage_energy_assessment}")
    val apiUsage_navigation_assessment: Option[Observation_Sortie_Eligibility_Supervisor.NavigationAssessment] = api.get_navigation_assessment()
    api.logInfo(s"Received on data port navigation_assessment: ${apiUsage_navigation_assessment}")
    val apiUsage_communication_assessment: Option[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment] = api.get_communication_assessment()
    api.logInfo(s"Received on data port communication_assessment: ${apiUsage_communication_assessment}")
    val apiUsage_observation_assessment: Option[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment] = api.get_observation_assessment()
    api.logInfo(s"Received on data port observation_assessment: ${apiUsage_observation_assessment}")
    val apiUsage_obstacle_assessment: Option[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment] = api.get_obstacle_assessment()
    api.logInfo(s"Received on data port obstacle_assessment: ${apiUsage_obstacle_assessment}")
    val apiUsage_propulsion_assessment: Option[Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment] = api.get_propulsion_assessment()
    api.logInfo(s"Received on data port propulsion_assessment: ${apiUsage_propulsion_assessment}")
  }

  def finalise(api: FaultRegistry_Operational_Api): Unit = { }
}
