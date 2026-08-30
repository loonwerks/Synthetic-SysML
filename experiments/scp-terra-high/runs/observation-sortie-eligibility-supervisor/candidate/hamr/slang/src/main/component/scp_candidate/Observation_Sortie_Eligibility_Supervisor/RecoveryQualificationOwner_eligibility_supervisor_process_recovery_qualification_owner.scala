// #Sireum

package scp_candidate.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner {
  var recoveryMemory: RecoveryPhase.Type = RecoveryPhase.Quarantined

  def initialise(api: RecoveryQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recovery_facts(Observation_Sortie_Eligibility_Supervisor.RecoveryFacts.example())
    api.put_recovery_phase(Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Normal)
  }

  def timeTriggered(api: RecoveryQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    api.get_accepted_directive() match {
      case Some(directive) =>
        val carried: CarriedPriority.Type = directive match {
          case PriorityDirective.Inhibit => CarriedPriority.Inhibit
          case PriorityDirective.Cancel => CarriedPriority.Cancel
          case PriorityDirective.Recover => CarriedPriority.Recover
          case PriorityDirective.Submit => CarriedPriority.Submit
          case _ => CarriedPriority.Hold
        }
        val gate: RecoveryGate.Type = if (recoveryMemory == RecoveryPhase.Normal) RecoveryGate.Open else RecoveryGate.Closed
        api.put_recovery_facts(RecoveryFacts(recoveryMemory, gate, carried))
        api.put_recovery_phase(recoveryMemory)
    }
  }

  def finalise(api: RecoveryQualificationOwner_Operational_Api): Unit = { }
}
