// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner {

  def initialise(api: EligibilityDecisionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_eligibility_decision(Observation_Sortie_Eligibility_Supervisor.EligibilityDecision(
      Observation_Sortie_Eligibility_Supervisor.SortieDirective.Withhold,
      Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Recovery))
  }

  def timeTriggered(api: EligibilityDecisionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val energy: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment = api.get_energy_assessment().get
    val navigation: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment = api.get_navigation_assessment().get
    val communication: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment = api.get_communication_assessment().get
    val observation: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment = api.get_observation_assessment().get
    val obstacle: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment = api.get_obstacle_assessment().get
    val propulsion: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment = api.get_propulsion_assessment().get
    val recovery: Observation_Sortie_Eligibility_Supervisor.RecoveryFacts = api.get_recovery_facts().get
    val request: Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type = api.get_request_phase().get
    val allReady: B = energy.ready && navigation.ready && communication.ready &&
      observation.ready && obstacle.ready && propulsion.ready
    val result: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision =
      if (!allReady || recovery.carriedPriority == Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Inhibit) {
          Observation_Sortie_Eligibility_Supervisor.EligibilityDecision(
            Observation_Sortie_Eligibility_Supervisor.SortieDirective.Withhold,
            Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Equipment)
        } else if (recovery.gate == Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Closed) {
          Observation_Sortie_Eligibility_Supervisor.EligibilityDecision(
            Observation_Sortie_Eligibility_Supervisor.SortieDirective.Withhold,
            Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Recovery)
        } else if (request != Observation_Sortie_Eligibility_Supervisor.RequestPhase.Pending ||
                   recovery.carriedPriority == Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Cancel) {
          Observation_Sortie_Eligibility_Supervisor.EligibilityDecision(
            Observation_Sortie_Eligibility_Supervisor.SortieDirective.Withhold,
            Observation_Sortie_Eligibility_Supervisor.EligibilityReason.NoRequest)
      } else {
        Observation_Sortie_Eligibility_Supervisor.EligibilityDecision(
          Observation_Sortie_Eligibility_Supervisor.SortieDirective.Permit,
          Observation_Sortie_Eligibility_Supervisor.EligibilityReason.None)
      }
    api.put_eligibility_decision(result)
  }

  def finalise(api: EligibilityDecisionOwner_Operational_Api): Unit = { }
}
