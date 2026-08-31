// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner {
  var recoveryMemory: Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type =
    Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Quarantined

  def initialise(api: RecoveryQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    recoveryMemory = Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Quarantined
    api.put_recovery_facts(Observation_Sortie_Eligibility_Supervisor.RecoveryFacts(
      Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Quarantined,
      Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Closed,
      Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Inhibit))
    api.put_recovery_phase(Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Quarantined)
  }

  def timeTriggered(api: RecoveryQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    val directive: Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type = api.get_accepted_directive().get
    val summary: Observation_Sortie_Eligibility_Supervisor.FaultSummary = api.get_fault_summary().get
    if (summary.faultState == Observation_Sortie_Eligibility_Supervisor.FaultState.Active) {
      recoveryMemory = Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Quarantined
    } else if (recoveryMemory == Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Normal ||
               directive == Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Recover) {
      recoveryMemory = Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Normal
    } else {
      recoveryMemory = Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.AwaitingAck
    }
    val carried: Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Type = directive match {
      case Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Inhibit => Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Inhibit
      case Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Cancel => Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Cancel
      case Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Recover => Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Recover
      case Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Submit => Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Submit
      case _ => Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Hold
    }
    val gate: Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Type =
      if (recoveryMemory == Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Normal) Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Open
      else Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Closed
    api.put_recovery_facts(Observation_Sortie_Eligibility_Supervisor.RecoveryFacts(recoveryMemory, gate, carried))
    api.put_recovery_phase(recoveryMemory)
  }

  def finalise(api: RecoveryQualificationOwner_Operational_Api): Unit = { }
}
