// #Sireum

package eit_acquisition_supervisor.EIT_Acquisition_Supervisor

import org.sireum._
import eit_acquisition_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryControl_acquisition_process_recovery_control {

  var recoveryMemory: EIT_Acquisition_Supervisor.RecoveryState.Type = EIT_Acquisition_Supervisor.RecoveryState.HEALTHY

  def initialise(api: RecoveryControl_Initialization_Api): Unit = {
    Contract(
      Modifies(recoveryMemory, api)
    )
    recoveryMemory = EIT_Acquisition_Supervisor.RecoveryState.HEALTHY
    api.put_recovery_frame(
      EIT_Acquisition_Supervisor.RecoveryFrame(
        dominantFault = EIT_Acquisition_Supervisor.DominantFault.NONE,
        recoveryState = EIT_Acquisition_Supervisor.RecoveryState.HEALTHY,
        recoveryGate = EIT_Acquisition_Supervisor.RecoveryGate.OPEN,
        recoveryCause = EIT_Acquisition_Supervisor.RecoveryCause.NONE,
        effectiveFaultPresent = F,
        effectiveMultipleFaults = F))
  }

  def timeTriggered(api: RecoveryControl_Operational_Api): Unit = {
    Contract(
      Modifies(recoveryMemory, api)
    )
    val recovery_event: EIT_Acquisition_Supervisor.RecoveryEvent.Type =
      api.get_recovery_event() match {
        case Some(v: EIT_Acquisition_Supervisor.RecoveryEvent.Type) => v
        case _ => EIT_Acquisition_Supervisor.RecoveryEvent.NONE
      }

    val fault_summary: EIT_Acquisition_Supervisor.FaultSummary =
      api.get_fault_summary() match {
        case Some(v: EIT_Acquisition_Supervisor.FaultSummary) => v
        case _ => EIT_Acquisition_Supervisor.FaultSummary.example()
      }

    val effectiveFaultPresent: B =
      fault_summary.faultPresent ||
      recovery_event == EIT_Acquisition_Supervisor.RecoveryEvent.INVALID_RESET ||
      recovery_event == EIT_Acquisition_Supervisor.RecoveryEvent.INVALID_STATUS

    val effectiveMultipleFaults: B =
      fault_summary.multipleFaults ||
      ((recovery_event == EIT_Acquisition_Supervisor.RecoveryEvent.INVALID_RESET ||
        recovery_event == EIT_Acquisition_Supervisor.RecoveryEvent.INVALID_STATUS) &&
       fault_summary.faultPresent)

    val dominantFault: EIT_Acquisition_Supervisor.DominantFault.Type =
      if (recovery_event == EIT_Acquisition_Supervisor.RecoveryEvent.INVALID_RESET ||
          recovery_event == EIT_Acquisition_Supervisor.RecoveryEvent.INVALID_STATUS) {
        EIT_Acquisition_Supervisor.DominantFault.RECOVERY_INPUT
      } else {
        fault_summary.dominantFault
      }

    val newRecoveryMemory: EIT_Acquisition_Supervisor.RecoveryState.Type =
      if (effectiveFaultPresent) {
        EIT_Acquisition_Supervisor.RecoveryState.LATCHED
      } else if (recovery_event == EIT_Acquisition_Supervisor.RecoveryEvent.RESET &&
                 recoveryMemory == EIT_Acquisition_Supervisor.RecoveryState.LATCHED) {
        EIT_Acquisition_Supervisor.RecoveryState.VERIFYING
      } else if (recovery_event == EIT_Acquisition_Supervisor.RecoveryEvent.VERIFY_OK &&
                 recoveryMemory == EIT_Acquisition_Supervisor.RecoveryState.VERIFYING) {
        EIT_Acquisition_Supervisor.RecoveryState.HEALTHY
      } else {
        recoveryMemory
      }

    val recoveryCause: EIT_Acquisition_Supervisor.RecoveryCause.Type =
      if (effectiveFaultPresent) {
        if (recovery_event == EIT_Acquisition_Supervisor.RecoveryEvent.INVALID_RESET ||
            recovery_event == EIT_Acquisition_Supervisor.RecoveryEvent.INVALID_STATUS) {
          EIT_Acquisition_Supervisor.RecoveryCause.RECOVERY_INPUT_FAULT
        } else if (fault_summary.faultPresent) {
          EIT_Acquisition_Supervisor.RecoveryCause.LOCAL_FAULT
        } else {
          EIT_Acquisition_Supervisor.RecoveryCause.NONE
        }
      } else if (newRecoveryMemory == EIT_Acquisition_Supervisor.RecoveryState.LATCHED) {
        EIT_Acquisition_Supervisor.RecoveryCause.LATCHED
      } else if (newRecoveryMemory == EIT_Acquisition_Supervisor.RecoveryState.VERIFYING) {
        EIT_Acquisition_Supervisor.RecoveryCause.VERIFYING
      } else {
        EIT_Acquisition_Supervisor.RecoveryCause.NONE
      }

    val recoveryGate: EIT_Acquisition_Supervisor.RecoveryGate.Type =
      if (newRecoveryMemory == EIT_Acquisition_Supervisor.RecoveryState.HEALTHY) {
        EIT_Acquisition_Supervisor.RecoveryGate.OPEN
      } else {
        EIT_Acquisition_Supervisor.RecoveryGate.CLOSED
      }

    recoveryMemory = newRecoveryMemory

    api.put_recovery_frame(
      EIT_Acquisition_Supervisor.RecoveryFrame(
        dominantFault = dominantFault,
        recoveryState = newRecoveryMemory,
        recoveryGate = recoveryGate,
        recoveryCause = recoveryCause,
        effectiveFaultPresent = effectiveFaultPresent,
        effectiveMultipleFaults = effectiveMultipleFaults))
  }

  def finalise(api: RecoveryControl_Operational_Api): Unit = { }
}
