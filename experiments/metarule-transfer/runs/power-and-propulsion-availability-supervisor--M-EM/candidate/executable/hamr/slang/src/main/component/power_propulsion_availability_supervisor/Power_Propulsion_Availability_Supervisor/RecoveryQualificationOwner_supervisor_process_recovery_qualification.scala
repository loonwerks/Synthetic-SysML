// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryQualificationOwner_supervisor_process_recovery_qualification {

  // BEGIN STATE VARS
  var recoveryMemory: Power_Propulsion_Availability_Supervisor.RecoveryPhase.Type = Power_Propulsion_Availability_Supervisor.RecoveryPhase.NORMAL
  // END STATE VARS

  def initialise(api: RecoveryQualificationOwner_Initialization_Api): Unit = {
    recoveryMemory = RecoveryPhase.AWAITING_ACK
    api.put_recovery_frame(Power_Propulsion_Availability_Supervisor.RecoveryFrame(
      phase = RecoveryPhase.AWAITING_ACK, gate = RecoveryGate.CLOSED))
    api.put_recovery_gate(Power_Propulsion_Availability_Supervisor.RecoveryGate.OPEN)
  }

  def timeTriggered(api: RecoveryQualificationOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee RECOVERY_FRAME_PRESERVATION
        api.recovery_frame.phase == recoveryMemory &
          api.recovery_frame.gate == api.recovery_gate &
          (recoveryMemory == RecoveryPhase.NORMAL &
            api.recovery_gate == RecoveryGate.OPEN |
            recoveryMemory != RecoveryPhase.NORMAL &
              api.recovery_gate == RecoveryGate.CLOSED),
        // case CASE_25_FAULT_QUARANTINE
        (api.fault_action_summary.fault == FaultStatus.ACTIVE) ___>: (recoveryMemory == RecoveryPhase.QUARANTINED),
        // case CASE_26_AWAITING_ACK
        (api.fault_action_summary.fault == FaultStatus.CLEAR &
          (In(recoveryMemory) == RecoveryPhase.QUARANTINED |
            In(recoveryMemory) == RecoveryPhase.AWAITING_ACK &
              api.fault_action_summary.directive != SummaryDirective.RECOVER)) ___>: (recoveryMemory == RecoveryPhase.AWAITING_ACK),
        // case CASE_27_RECOVERY_OPEN
        (api.fault_action_summary.fault == FaultStatus.CLEAR &
          (In(recoveryMemory) == RecoveryPhase.NORMAL |
            In(recoveryMemory) == RecoveryPhase.AWAITING_ACK &
              api.fault_action_summary.directive == SummaryDirective.RECOVER)) ___>: (recoveryMemory == RecoveryPhase.NORMAL)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val previous: RecoveryPhase.Type = recoveryMemory
    val summary: Power_Propulsion_Availability_Supervisor.FaultActionSummary = api.get_fault_action_summary().get
    if (summary.fault == FaultStatus.ACTIVE) {
      recoveryMemory = RecoveryPhase.QUARANTINED
    }
    else if (previous == RecoveryPhase.NORMAL ||
             (previous == RecoveryPhase.AWAITING_ACK &
              summary.directive == SummaryDirective.RECOVER)) {
      recoveryMemory = RecoveryPhase.NORMAL
    } else {
      recoveryMemory = RecoveryPhase.AWAITING_ACK
    }
    val gate: RecoveryGate.Type =
      if (recoveryMemory == RecoveryPhase.NORMAL) RecoveryGate.OPEN else RecoveryGate.CLOSED
    api.put_recovery_frame(Power_Propulsion_Availability_Supervisor.RecoveryFrame(
      phase = recoveryMemory, gate = gate))
    api.put_recovery_gate(gate)
  }

  def finalise(api: RecoveryQualificationOwner_Operational_Api): Unit = { }
}
