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
    val energy: Option[Observation_Sortie_Eligibility_Supervisor.EnergyAssessment] = api.get_energy_assessment()
    val navigation: Option[Observation_Sortie_Eligibility_Supervisor.NavigationAssessment] = api.get_navigation_assessment()
    val communication: Option[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment] = api.get_communication_assessment()
    val observation: Option[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment] = api.get_observation_assessment()
    val obstacle: Option[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment] = api.get_obstacle_assessment()
    val propulsion: Option[Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment] = api.get_propulsion_assessment()
    val facts: Option[Observation_Sortie_Eligibility_Supervisor.RecoveryFacts] = api.get_recovery_facts()
    val phase: Option[Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type] = api.get_request_phase()
    val allReady: B = !energy.isEmpty && energy.get.ready && !navigation.isEmpty && navigation.get.ready &&
      !communication.isEmpty && communication.get.ready && !observation.isEmpty && observation.get.ready &&
      !obstacle.isEmpty && obstacle.get.ready && !propulsion.isEmpty && propulsion.get.ready
    val equipmentBlocked: B = !allReady || facts.isEmpty ||
      facts.get.carriedPriority == Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Inhibit
    val recoveryBlocked: B = facts.isEmpty ||
      facts.get.gate == Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Closed
    val eligible: B = allReady && !equipmentBlocked && !recoveryBlocked && !phase.isEmpty &&
      phase.get == Observation_Sortie_Eligibility_Supervisor.RequestPhase.Pending &&
      facts.get.carriedPriority != Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Cancel
    val decision: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision =
      if (eligible) Observation_Sortie_Eligibility_Supervisor.EligibilityDecision(
        Observation_Sortie_Eligibility_Supervisor.SortieDirective.Permit,
        Observation_Sortie_Eligibility_Supervisor.EligibilityReason.None)
      else if (equipmentBlocked) Observation_Sortie_Eligibility_Supervisor.EligibilityDecision(
        Observation_Sortie_Eligibility_Supervisor.SortieDirective.Withhold,
        Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Equipment)
      else if (recoveryBlocked) Observation_Sortie_Eligibility_Supervisor.EligibilityDecision(
        Observation_Sortie_Eligibility_Supervisor.SortieDirective.Withhold,
        Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Recovery)
      else Observation_Sortie_Eligibility_Supervisor.EligibilityDecision(
        Observation_Sortie_Eligibility_Supervisor.SortieDirective.Withhold,
        Observation_Sortie_Eligibility_Supervisor.EligibilityReason.NoRequest)
    api.put_eligibility_decision(decision)
  }

  def finalise(api: EligibilityDecisionOwner_Operational_Api): Unit = { }
}
