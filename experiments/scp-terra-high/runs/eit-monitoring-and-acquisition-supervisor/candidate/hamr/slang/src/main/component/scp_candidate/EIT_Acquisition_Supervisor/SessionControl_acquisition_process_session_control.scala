// #Sireum

package scp_candidate.EIT_Acquisition_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object SessionControl_acquisition_process_session_control {
  var sessionMemory: EIT_Acquisition_Supervisor.SessionState.Type = EIT_Acquisition_Supervisor.SessionState.IDLE

  def initialise(api: SessionControl_Initialization_Api): Unit = {
    Contract(Modifies(api, sessionMemory))
    sessionMemory = EIT_Acquisition_Supervisor.SessionState.IDLE
    api.put_session_frame(EIT_Acquisition_Supervisor.SessionFrame(sessionMemory, F, F))
  }

  def timeTriggered(api: SessionControl_Operational_Api): Unit = {
    Contract(Modifies(api, sessionMemory))
    val request: EIT_Acquisition_Supervisor.RequestFactsRecord = api.get_request_facts().get
    val recovery: EIT_Acquisition_Supervisor.RecoveryFrame = api.get_recovery_frame().get
    val start: EIT_Acquisition_Supervisor.StartFeasibility.Type = api.get_start_feasibility().get
    var startAdmitted: B = F
    var stopAdmitted: B = F
    if (recovery.recoveryGate == EIT_Acquisition_Supervisor.RecoveryGate.CLOSED) {
      sessionMemory = EIT_Acquisition_Supervisor.SessionState.RECOVERY
    } else if (sessionMemory == EIT_Acquisition_Supervisor.SessionState.RECOVERY) {
      sessionMemory = EIT_Acquisition_Supervisor.SessionState.IDLE
    } else if (sessionMemory == EIT_Acquisition_Supervisor.SessionState.IDLE && start == EIT_Acquisition_Supervisor.StartFeasibility.FEASIBLE) {
      sessionMemory = EIT_Acquisition_Supervisor.SessionState.MONITORING
      startAdmitted = T
    } else if (sessionMemory == EIT_Acquisition_Supervisor.SessionState.MONITORING && request.requestClass == EIT_Acquisition_Supervisor.RequestClass.STOP_REQUEST) {
      sessionMemory = EIT_Acquisition_Supervisor.SessionState.IDLE
      stopAdmitted = T
    }
    api.put_session_frame(EIT_Acquisition_Supervisor.SessionFrame(sessionMemory, startAdmitted, stopAdmitted))
  }

  def finalise(api: SessionControl_Operational_Api): Unit = { }
}
