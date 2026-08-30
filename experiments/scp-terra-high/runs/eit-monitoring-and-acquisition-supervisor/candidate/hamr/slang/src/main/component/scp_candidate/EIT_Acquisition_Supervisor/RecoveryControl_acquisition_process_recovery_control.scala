// #Sireum

package scp_candidate.EIT_Acquisition_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryControl_acquisition_process_recovery_control {
  var recoveryMemory: EIT_Acquisition_Supervisor.RecoveryState.Type = EIT_Acquisition_Supervisor.RecoveryState.HEALTHY

  def initialise(api: RecoveryControl_Initialization_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    recoveryMemory = EIT_Acquisition_Supervisor.RecoveryState.HEALTHY
    api.put_recovery_frame(EIT_Acquisition_Supervisor.RecoveryFrame(EIT_Acquisition_Supervisor.DominantFault.NONE, recoveryMemory, EIT_Acquisition_Supervisor.RecoveryGate.OPEN, EIT_Acquisition_Supervisor.RecoveryCause.NONE, F, F))
  }

  def timeTriggered(api: RecoveryControl_Operational_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    val event: EIT_Acquisition_Supervisor.RecoveryEvent.Type = api.get_recovery_event().get
    val summary: EIT_Acquisition_Supervisor.FaultSummary = api.get_fault_summary().get
    val invalid: B = event == EIT_Acquisition_Supervisor.RecoveryEvent.INVALID_RESET ||
      event == EIT_Acquisition_Supervisor.RecoveryEvent.INVALID_STATUS
    val effectiveFault: B = summary.faultPresent || invalid
    if (effectiveFault) {
      recoveryMemory = EIT_Acquisition_Supervisor.RecoveryState.LATCHED
    } else if (recoveryMemory == EIT_Acquisition_Supervisor.RecoveryState.LATCHED && event == EIT_Acquisition_Supervisor.RecoveryEvent.RESET) {
      recoveryMemory = EIT_Acquisition_Supervisor.RecoveryState.VERIFYING
    } else if (recoveryMemory == EIT_Acquisition_Supervisor.RecoveryState.VERIFYING && event == EIT_Acquisition_Supervisor.RecoveryEvent.VERIFY_OK) {
      recoveryMemory = EIT_Acquisition_Supervisor.RecoveryState.HEALTHY
    }
    var cause: EIT_Acquisition_Supervisor.RecoveryCause.Type = EIT_Acquisition_Supervisor.RecoveryCause.NONE
    if (invalid) { cause = EIT_Acquisition_Supervisor.RecoveryCause.RECOVERY_INPUT_FAULT }
    else if (summary.faultPresent) { cause = EIT_Acquisition_Supervisor.RecoveryCause.LOCAL_FAULT }
    else if (recoveryMemory == EIT_Acquisition_Supervisor.RecoveryState.LATCHED) { cause = EIT_Acquisition_Supervisor.RecoveryCause.LATCHED }
    else if (recoveryMemory == EIT_Acquisition_Supervisor.RecoveryState.VERIFYING) { cause = EIT_Acquisition_Supervisor.RecoveryCause.VERIFYING }
    var dominant: EIT_Acquisition_Supervisor.DominantFault.Type = summary.dominantFault
    if (invalid) { dominant = EIT_Acquisition_Supervisor.DominantFault.RECOVERY_INPUT }
    val multiple: B = summary.multipleFaults || (invalid && summary.faultPresent)
    var gate: EIT_Acquisition_Supervisor.RecoveryGate.Type = EIT_Acquisition_Supervisor.RecoveryGate.CLOSED
    if (recoveryMemory == EIT_Acquisition_Supervisor.RecoveryState.HEALTHY) { gate = EIT_Acquisition_Supervisor.RecoveryGate.OPEN }
    api.put_recovery_frame(EIT_Acquisition_Supervisor.RecoveryFrame(dominant, recoveryMemory, gate, cause, effectiveFault, multiple))
  }

  def finalise(api: RecoveryControl_Operational_Api): Unit = { }
}
