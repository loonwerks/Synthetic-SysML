// #Sireum

package scp_candidate.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object StatusComposer_eligibility_supervisor_process_status_composer {

  def initialise(api: StatusComposer_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_eligibility_status(Observation_Sortie_Eligibility_Supervisor.EligibilityStatus.example())
  }

  def timeTriggered(api: StatusComposer_Operational_Api): Unit = {
    Contract(Modifies(api))
    val status: EligibilityStatus = EligibilityStatus(
      StatusRequestPhase.Idle, StatusFaultState.Clear, StatusRecoveryPhase.Quarantined,
      StatusDecision.Withhold, LimitingCause.Recovery)
    api.put_eligibility_status(status)
  }

  def finalise(api: StatusComposer_Operational_Api): Unit = { }
}
