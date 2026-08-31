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
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ELIGIBILITY_EQUIPMENT_WITHHOLD
        (!(api.energy_assessment.ready) | !(api.navigation_assessment.ready) |
          !(api.communication_assessment.ready) |
          !(api.observation_assessment.ready) |
          !(api.obstacle_assessment.ready) |
          !(api.propulsion_assessment.ready) |
          api.recovery_facts.carriedPriority == CarriedPriority.Inhibit) ___>: (api.eligibility_decision.directive == SortieDirective.Withhold &
          api.eligibility_decision.reason == EligibilityReason.Equipment),
        // case ELIGIBILITY_RECOVERY_WITHHOLD
        (api.energy_assessment.ready & api.navigation_assessment.ready &
          api.communication_assessment.ready &
          api.observation_assessment.ready &
          api.obstacle_assessment.ready &
          api.propulsion_assessment.ready &
          api.recovery_facts.carriedPriority != CarriedPriority.Inhibit &
          api.recovery_facts.gate == RecoveryGate.Closed) ___>: (api.eligibility_decision.directive == SortieDirective.Withhold &
          api.eligibility_decision.reason == EligibilityReason.Recovery),
        // case ELIGIBILITY_NO_REQUEST_WITHHOLD
        (api.energy_assessment.ready & api.navigation_assessment.ready &
          api.communication_assessment.ready &
          api.observation_assessment.ready &
          api.obstacle_assessment.ready &
          api.propulsion_assessment.ready &
          api.recovery_facts.carriedPriority != CarriedPriority.Inhibit &
          api.recovery_facts.gate == RecoveryGate.Open &
          (api.request_phase != RequestPhase.Pending |
            api.recovery_facts.carriedPriority == CarriedPriority.Cancel)) ___>: (api.eligibility_decision.directive == SortieDirective.Withhold &
          api.eligibility_decision.reason == EligibilityReason.NoRequest),
        // case ELIGIBILITY_PERMIT
        (api.request_phase == RequestPhase.Pending &
          api.recovery_facts.gate == RecoveryGate.Open &
          api.energy_assessment.ready &
          api.navigation_assessment.ready &
          api.communication_assessment.ready &
          api.observation_assessment.ready &
          api.obstacle_assessment.ready &
          api.propulsion_assessment.ready &
          (api.recovery_facts.carriedPriority == CarriedPriority.Hold |
            api.recovery_facts.carriedPriority == CarriedPriority.Submit |
            api.recovery_facts.carriedPriority == CarriedPriority.Recover)) ___>: (api.eligibility_decision.directive == SortieDirective.Permit &
          api.eligibility_decision.reason == EligibilityReason.None)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val energy = api.get_energy_assessment().get
    val navigation = api.get_navigation_assessment().get
    val communication = api.get_communication_assessment().get
    val observation = api.get_observation_assessment().get
    val obstacle = api.get_obstacle_assessment().get
    val propulsion = api.get_propulsion_assessment().get
    val recovery = api.get_recovery_facts().get
    val request = api.get_request_phase().get
    val decision: EligibilityDecision =
      if (!energy.ready | !navigation.ready | !communication.ready | !observation.ready |
          !obstacle.ready | !propulsion.ready | recovery.carriedPriority == CarriedPriority.Inhibit)
        EligibilityDecision(SortieDirective.Withhold, EligibilityReason.Equipment)
      else if (recovery.gate == RecoveryGate.Closed)
        EligibilityDecision(SortieDirective.Withhold, EligibilityReason.Recovery)
      else if (request != RequestPhase.Pending | recovery.carriedPriority == CarriedPriority.Cancel)
        EligibilityDecision(SortieDirective.Withhold, EligibilityReason.NoRequest)
      else EligibilityDecision(SortieDirective.Permit, EligibilityReason.None)
    api.put_eligibility_decision(decision)
  }

  def finalise(api: EligibilityDecisionOwner_Operational_Api): Unit = { }
}
