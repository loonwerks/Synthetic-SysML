// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryQualificationOwner_supervisor_process_recovery_qualification {
  var recoveryMemory: RecoveryPhase.Type = RecoveryPhase.AWAITING_ACK

  def initialise(api: RecoveryQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    recoveryMemory = RecoveryPhase.AWAITING_ACK
    api.put_recovery_frame(RecoveryFrame(RecoveryPhase.AWAITING_ACK, RecoveryGate.CLOSED))
    api.put_recovery_gate(RecoveryGate.CLOSED)
  }

  def timeTriggered(api: RecoveryQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    api.get_fault_action_summary() match {
      case Some(summary) if summary.fault == FaultStatus.ACTIVE =>
        recoveryMemory = RecoveryPhase.QUARANTINED
      case Some(summary) if recoveryMemory == RecoveryPhase.QUARANTINED ||
        (recoveryMemory == RecoveryPhase.AWAITING_ACK &&
          summary.directive != SummaryDirective.RECOVER) =>
        recoveryMemory = RecoveryPhase.AWAITING_ACK
      case Some(_) =>
        recoveryMemory = RecoveryPhase.NORMAL
      case _ =>
        recoveryMemory = RecoveryPhase.AWAITING_ACK
    }
    val gate: RecoveryGate.Type =
      if (recoveryMemory == RecoveryPhase.NORMAL) RecoveryGate.OPEN else RecoveryGate.CLOSED
    api.put_recovery_frame(RecoveryFrame(recoveryMemory, gate))
    api.put_recovery_gate(gate)
  }

  def finalise(api: RecoveryQualificationOwner_Operational_Api): Unit = { }
}
