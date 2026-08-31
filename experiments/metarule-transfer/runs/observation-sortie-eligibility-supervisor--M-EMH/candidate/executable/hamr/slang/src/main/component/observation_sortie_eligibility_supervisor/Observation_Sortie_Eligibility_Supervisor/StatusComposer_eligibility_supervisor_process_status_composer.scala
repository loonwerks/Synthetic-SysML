// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object StatusComposer_eligibility_supervisor_process_status_composer {

  def initialise(api: StatusComposer_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_eligibility_status(Observation_Sortie_Eligibility_Supervisor.EligibilityStatus.example())
  }

  def timeTriggered(api: StatusComposer_Operational_Api): Unit = {
    // example api usage

    val apiUsage_eligibility_decision: Option[Observation_Sortie_Eligibility_Supervisor.EligibilityDecision] = api.get_eligibility_decision()
    api.logInfo(s"Received on data port eligibility_decision: ${apiUsage_eligibility_decision}")
    val apiUsage_fault_summary: Option[Observation_Sortie_Eligibility_Supervisor.FaultSummary] = api.get_fault_summary()
    api.logInfo(s"Received on data port fault_summary: ${apiUsage_fault_summary}")
    val apiUsage_recovery_phase: Option[Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type] = api.get_recovery_phase()
    api.logInfo(s"Received on data port recovery_phase: ${apiUsage_recovery_phase}")
    val apiUsage_request_phase: Option[Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type] = api.get_request_phase()
    api.logInfo(s"Received on data port request_phase: ${apiUsage_request_phase}")
  }

  def finalise(api: StatusComposer_Operational_Api): Unit = { }
}
