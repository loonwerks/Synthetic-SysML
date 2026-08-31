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
      recoveryMemory, Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Closed,
      Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Inhibit))
    api.put_recovery_phase(recoveryMemory)
  }

  def timeTriggered(api: RecoveryQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    var directive: Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type =
      Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Inhibit
    api.get_accepted_directive() match {
      case Some(value) => directive = value
      case _ =>
    }
    var hasFault: B = T
    api.get_fault_summary() match {
      case Some(value) => hasFault = value.faultState == Observation_Sortie_Eligibility_Supervisor.FaultState.Active
      case _ =>
    }
    if (hasFault) {
      recoveryMemory = Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Quarantined
    } else if (recoveryMemory == Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Normal ||
      directive == Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Recover) {
      recoveryMemory = Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Normal
    } else {
      recoveryMemory = Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.AwaitingAck
    }
    var carried: Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Type =
      Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Hold
    directive match {
      case Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Inhibit =>
        carried = Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Inhibit
      case Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Cancel =>
        carried = Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Cancel
      case Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Recover =>
        carried = Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Recover
      case Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Submit =>
        carried = Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Submit
      case _ =>
    }
    val gate: Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Type =
      if (recoveryMemory == Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Normal)
        Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Open
      else Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Closed
    api.put_recovery_facts(Observation_Sortie_Eligibility_Supervisor.RecoveryFacts(recoveryMemory, gate, carried))
    api.put_recovery_phase(recoveryMemory)
  }

  def finalise(api: RecoveryQualificationOwner_Operational_Api): Unit = { }
}
