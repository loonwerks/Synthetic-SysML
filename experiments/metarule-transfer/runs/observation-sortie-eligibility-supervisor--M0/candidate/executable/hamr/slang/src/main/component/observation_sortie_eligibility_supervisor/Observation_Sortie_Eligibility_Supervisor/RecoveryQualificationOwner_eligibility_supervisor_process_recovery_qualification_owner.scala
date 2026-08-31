// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner {
  var recoveryMemory: RecoveryPhase.Type = RecoveryPhase.Quarantined

  def initialise(api: RecoveryQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    recoveryMemory = RecoveryPhase.Quarantined
    api.put_recovery_facts(RecoveryFacts(RecoveryPhase.Quarantined, RecoveryGate.Closed, CarriedPriority.Inhibit))
    api.put_recovery_phase(RecoveryPhase.Quarantined)
  }

  def timeTriggered(api: RecoveryQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    val directive: PriorityDirective.Type = api.get_accepted_directive() match {
      case Some(value) => value
      case _ => PriorityDirective.Inhibit
    }
    val carried: CarriedPriority.Type = directive match {
      case PriorityDirective.Cancel => CarriedPriority.Cancel
      case PriorityDirective.Recover => CarriedPriority.Recover
      case PriorityDirective.Submit => CarriedPriority.Submit
      case PriorityDirective.Hold => CarriedPriority.Hold
      case _ => CarriedPriority.Inhibit
    }
    val next: RecoveryPhase.Type = api.get_fault_summary() match {
      case Some(summary) if summary.faultState == FaultState.Active => RecoveryPhase.Quarantined
      case Some(_) if recoveryMemory == RecoveryPhase.Normal || directive == PriorityDirective.Recover => RecoveryPhase.Normal
      case _ => RecoveryPhase.AwaitingAck
    }
    recoveryMemory = next
    val gate: RecoveryGate.Type = if (next == RecoveryPhase.Normal) RecoveryGate.Open else RecoveryGate.Closed
    api.put_recovery_facts(RecoveryFacts(next, gate, carried))
    api.put_recovery_phase(next)
  }

  def finalise(api: RecoveryQualificationOwner_Operational_Api): Unit = { }
}
