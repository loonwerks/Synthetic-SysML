// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner {

  def initialise(api: RecoveryQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recovery_facts(Observation_Sortie_Eligibility_Supervisor.RecoveryFacts.example())
    api.put_recovery_phase(Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Normal)
  }

  def timeTriggered(api: RecoveryQualificationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_accepted_directive: Option[Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type] = api.get_accepted_directive()
    api.logInfo(s"Received on data port accepted_directive: ${apiUsage_accepted_directive}")
    val apiUsage_fault_summary: Option[Observation_Sortie_Eligibility_Supervisor.FaultSummary] = api.get_fault_summary()
    api.logInfo(s"Received on data port fault_summary: ${apiUsage_fault_summary}")
  }

  def finalise(api: RecoveryQualificationOwner_Operational_Api): Unit = { }
}
