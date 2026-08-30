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
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recovery_frame(Power_Propulsion_Availability_Supervisor.RecoveryFrame.example())
    api.put_recovery_gate(Power_Propulsion_Availability_Supervisor.RecoveryGate.OPEN)
  }

  def timeTriggered(api: RecoveryQualificationOwner_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        recoveryMemory
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee RECOVERY_FRAME_PRESERVATION
        //   recovery_frame phase follows recoveryMemory, gate follows recovery_gate
        api.recovery_frame.phase == recoveryMemory &
          api.recovery_frame.gate == api.recovery_gate &
          (recoveryMemory == RecoveryPhase.NORMAL &
            api.recovery_gate == RecoveryGate.OPEN |
            recoveryMemory != RecoveryPhase.NORMAL &
              api.recovery_gate == RecoveryGate.CLOSED),
        // case CASE_25_FAULT_QUARANTINE
        //   If fault action summary fault is ACTIVE
        (api.fault_action_summary.fault == FaultStatus.ACTIVE) ___>: (recoveryMemory == RecoveryPhase.QUARANTINED),
        // case CASE_26_AWAITING_ACK
        //   If fault is CLEAR and recovery is quarantined or awaiting with no RECOVER directive
        (api.fault_action_summary.fault == FaultStatus.CLEAR &
          (In(recoveryMemory) == RecoveryPhase.QUARANTINED |
            In(recoveryMemory) == RecoveryPhase.AWAITING_ACK &
              api.fault_action_summary.directive != SummaryDirective.RECOVER)) ___>: (recoveryMemory == RecoveryPhase.AWAITING_ACK),
        // case CASE_27_RECOVERY_OPEN
        //   If fault is CLEAR and recovery is normal or awaiting with RECOVER directive
        (api.fault_action_summary.fault == FaultStatus.CLEAR &
          (In(recoveryMemory) == RecoveryPhase.NORMAL |
            In(recoveryMemory) == RecoveryPhase.AWAITING_ACK &
              api.fault_action_summary.directive == SummaryDirective.RECOVER)) ___>: (recoveryMemory == RecoveryPhase.NORMAL)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_fault_action_summary: Option[Power_Propulsion_Availability_Supervisor.FaultActionSummary] = api.get_fault_action_summary()
    api.logInfo(s"Received on data port fault_action_summary: ${apiUsage_fault_action_summary}")
  }

  def finalise(api: RecoveryQualificationOwner_Operational_Api): Unit = { }
}
