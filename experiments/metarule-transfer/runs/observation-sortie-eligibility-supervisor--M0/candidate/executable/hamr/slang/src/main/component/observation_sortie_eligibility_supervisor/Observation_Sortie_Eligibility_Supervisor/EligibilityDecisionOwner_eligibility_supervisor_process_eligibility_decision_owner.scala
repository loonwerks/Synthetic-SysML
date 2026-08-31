// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner {

  def initialise(api: EligibilityDecisionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_eligibility_decision(EligibilityDecision(SortieDirective.Withhold, EligibilityReason.Recovery))
  }

  def timeTriggered(api: EligibilityDecisionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val energyReady: B = api.get_energy_assessment() match { case Some(value) => value.ready; case _ => F }
    val navigationReady: B = api.get_navigation_assessment() match { case Some(value) => value.ready; case _ => F }
    val communicationReady: B = api.get_communication_assessment() match { case Some(value) => value.ready; case _ => F }
    val observationReady: B = api.get_observation_assessment() match { case Some(value) => value.ready; case _ => F }
    val obstacleReady: B = api.get_obstacle_assessment() match { case Some(value) => value.ready; case _ => F }
    val propulsionReady: B = api.get_propulsion_assessment() match { case Some(value) => value.ready; case _ => F }
    val allReady: B = energyReady && navigationReady && communicationReady &&
      observationReady && obstacleReady && propulsionReady
    val recovery: RecoveryFacts = api.get_recovery_facts() match {
      case Some(value) => value
      case _ => RecoveryFacts(RecoveryPhase.Quarantined, RecoveryGate.Closed, CarriedPriority.Inhibit)
    }
    val phase: RequestPhase.Type = api.get_request_phase() match {
      case Some(value) => value
      case _ => RequestPhase.Idle
    }
    val decision: EligibilityDecision =
      if (!allReady || recovery.carriedPriority == CarriedPriority.Inhibit)
        EligibilityDecision(SortieDirective.Withhold, EligibilityReason.Equipment)
      else if (recovery.gate == RecoveryGate.Closed)
        EligibilityDecision(SortieDirective.Withhold, EligibilityReason.Recovery)
      else if (phase != RequestPhase.Pending || recovery.carriedPriority == CarriedPriority.Cancel)
        EligibilityDecision(SortieDirective.Withhold, EligibilityReason.NoRequest)
      else
        EligibilityDecision(SortieDirective.Permit, EligibilityReason.None)
    api.put_eligibility_decision(decision)
  }

  def finalise(api: EligibilityDecisionOwner_Operational_Api): Unit = { }
}
