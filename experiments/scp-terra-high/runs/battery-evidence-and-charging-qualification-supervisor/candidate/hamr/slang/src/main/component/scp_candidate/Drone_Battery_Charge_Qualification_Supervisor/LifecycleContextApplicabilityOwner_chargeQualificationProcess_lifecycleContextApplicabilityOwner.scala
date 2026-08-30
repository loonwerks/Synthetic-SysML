// #Sireum

package scp_candidate.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner {

  def initialise(api: LifecycleContextApplicabilityOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_LIFECYCLE_FACTS
        api.factsToEligibility.chargeContextAllowed == F &&
          api.factsToEligibility.airborneContext == F &&
          api.factsToEligibility.contextValid == F &&
          api.factsToEligibility.contextFault == T &&
          api.factsToAdvisory.chargeContextAllowed == F &&
          api.factsToAdvisory.airborneContext == F &&
          api.factsToAdvisory.contextValid == F &&
          api.factsToAdvisory.contextFault == T &&
          api.faultToAggregation == T
        // END INITIALIZES ENSURES
      )
    )
    val f: LifecycleFacts = LifecycleFacts(F, F, F, T)
    api.put_factsToEligibility(f)
    api.put_factsToAdvisory(f)
    api.put_faultToAggregation(T)
  }

  def timeTriggered(api: LifecycleContextApplicabilityOwner_Operational_Api): Unit = { }

  def finalise(api: LifecycleContextApplicabilityOwner_Operational_Api): Unit = { }
}
