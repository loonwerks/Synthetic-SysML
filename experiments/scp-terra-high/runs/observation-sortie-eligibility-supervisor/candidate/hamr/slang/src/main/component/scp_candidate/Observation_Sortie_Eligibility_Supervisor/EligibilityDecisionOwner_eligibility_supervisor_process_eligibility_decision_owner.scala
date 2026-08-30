// #Sireum

package scp_candidate.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner {

  def initialise(api: EligibilityDecisionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_eligibility_decision(Observation_Sortie_Eligibility_Supervisor.EligibilityDecision.example())
  }

  def timeTriggered(api: EligibilityDecisionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_eligibility_decision(EligibilityDecision(SortieDirective.Withhold, EligibilityReason.Recovery))
  }

  def finalise(api: EligibilityDecisionOwner_Operational_Api): Unit = { }
}
