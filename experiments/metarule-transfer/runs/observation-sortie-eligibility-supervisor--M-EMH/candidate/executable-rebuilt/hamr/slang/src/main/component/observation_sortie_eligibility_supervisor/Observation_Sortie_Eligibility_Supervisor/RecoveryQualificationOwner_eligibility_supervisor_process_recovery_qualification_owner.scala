// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner {

  // BEGIN STATE VARS
  var recoveryMemory: Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type = Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Normal
  // END STATE VARS

  def initialise(api: RecoveryQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    recoveryMemory = RecoveryPhase.Quarantined
    api.put_recovery_facts(RecoveryFacts(RecoveryPhase.Quarantined, RecoveryGate.Closed, CarriedPriority.Inhibit))
    api.put_recovery_phase(RecoveryPhase.Quarantined)
  }

  def timeTriggered(api: RecoveryQualificationOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, recoveryMemory),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee RECOVERY_FACTS_COHERENT
        api.recovery_facts.phase == recoveryMemory &
          api.recovery_phase == recoveryMemory &
          (api.accepted_directive == PriorityDirective.Inhibit &
            api.recovery_facts.carriedPriority == CarriedPriority.Inhibit |
            api.accepted_directive == PriorityDirective.Cancel &
              api.recovery_facts.carriedPriority == CarriedPriority.Cancel |
            api.accepted_directive == PriorityDirective.Recover &
              api.recovery_facts.carriedPriority == CarriedPriority.Recover |
            api.accepted_directive == PriorityDirective.Submit &
              api.recovery_facts.carriedPriority == CarriedPriority.Submit |
            api.accepted_directive == PriorityDirective.Hold &
              api.recovery_facts.carriedPriority == CarriedPriority.Hold),
        // case RECOVERY_CURRENT_FAULT
        (api.fault_summary.faultState == FaultState.Active) ___>: (recoveryMemory == RecoveryPhase.Quarantined &
          api.recovery_facts.gate == RecoveryGate.Closed),
        // case RECOVERY_OPEN
        (api.fault_summary.faultState == FaultState.Clear &
          api.accepted_directive == PriorityDirective.Recover) ___>: (recoveryMemory == RecoveryPhase.Normal &
          api.recovery_facts.gate == RecoveryGate.Open),
        // case RECOVERY_AWAITING_ACK
        (api.fault_summary.faultState == FaultState.Clear &
          api.accepted_directive != PriorityDirective.Recover &
          In(recoveryMemory) != RecoveryPhase.Normal) ___>: (recoveryMemory == RecoveryPhase.AwaitingAck &
          api.recovery_facts.gate == RecoveryGate.Closed)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val directive = api.get_accepted_directive().get
    val fault = api.get_fault_summary().get
    if (fault.faultState == FaultState.Active) {
      recoveryMemory = RecoveryPhase.Quarantined
    } else if (directive == PriorityDirective.Recover) {
      recoveryMemory = RecoveryPhase.Normal
    } else if (recoveryMemory != RecoveryPhase.Normal) {
      recoveryMemory = RecoveryPhase.AwaitingAck
    }
    val carried: CarriedPriority.Type =
      if (directive == PriorityDirective.Inhibit) CarriedPriority.Inhibit
      else if (directive == PriorityDirective.Cancel) CarriedPriority.Cancel
      else if (directive == PriorityDirective.Recover) CarriedPriority.Recover
      else if (directive == PriorityDirective.Submit) CarriedPriority.Submit
      else CarriedPriority.Hold
    val gate: RecoveryGate.Type =
      if (recoveryMemory == RecoveryPhase.Normal) RecoveryGate.Open else RecoveryGate.Closed
    api.put_recovery_facts(RecoveryFacts(recoveryMemory, gate, carried))
    api.put_recovery_phase(recoveryMemory)
  }

  def finalise(api: RecoveryQualificationOwner_Operational_Api): Unit = { }
}
