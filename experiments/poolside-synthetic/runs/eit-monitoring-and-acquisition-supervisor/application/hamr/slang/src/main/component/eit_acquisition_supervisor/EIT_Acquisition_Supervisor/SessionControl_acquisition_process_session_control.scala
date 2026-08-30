// #Sireum

package eit_acquisition_supervisor.EIT_Acquisition_Supervisor

import org.sireum._
import eit_acquisition_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object SessionControl_acquisition_process_session_control {

  var sessionMemory: EIT_Acquisition_Supervisor.SessionState.Type = EIT_Acquisition_Supervisor.SessionState.IDLE

  def initialise(api: SessionControl_Initialization_Api): Unit = {
    Contract(
      Modifies(sessionMemory, api)
    )
    sessionMemory = EIT_Acquisition_Supervisor.SessionState.IDLE
    api.put_session_frame(
      EIT_Acquisition_Supervisor.SessionFrame(
        sessionState = EIT_Acquisition_Supervisor.SessionState.IDLE,
        startAdmitted = F,
        stopAdmitted = F))
  }

  def timeTriggered(api: SessionControl_Operational_Api): Unit = {
    Contract(
      Modifies(sessionMemory, api)
    )
    val recovery_frame: EIT_Acquisition_Supervisor.RecoveryFrame =
      api.get_recovery_frame() match {
        case Some(v: EIT_Acquisition_Supervisor.RecoveryFrame) => v
        case _ => EIT_Acquisition_Supervisor.RecoveryFrame.example()
      }

    val request_facts: EIT_Acquisition_Supervisor.RequestFactsRecord =
      api.get_request_facts() match {
        case Some(v: EIT_Acquisition_Supervisor.RequestFactsRecord) => v
        case _ => EIT_Acquisition_Supervisor.RequestFactsRecord.example()
      }

    val start_feasibility: EIT_Acquisition_Supervisor.StartFeasibility.Type =
      api.get_start_feasibility() match {
        case Some(v: EIT_Acquisition_Supervisor.StartFeasibility.Type) => v
        case _ => EIT_Acquisition_Supervisor.StartFeasibility.NOT_FEASIBLE
      }

    val recoveryGate: EIT_Acquisition_Supervisor.RecoveryGate.Type = recovery_frame.recoveryGate

    val (newSessionMemory, startAdmitted, stopAdmitted): (EIT_Acquisition_Supervisor.SessionState.Type, B, B) =
      if (recoveryGate == EIT_Acquisition_Supervisor.RecoveryGate.CLOSED) {
        (EIT_Acquisition_Supervisor.SessionState.RECOVERY, F, F)
      } else if (sessionMemory == EIT_Acquisition_Supervisor.SessionState.RECOVERY) {
        (EIT_Acquisition_Supervisor.SessionState.IDLE, F, F)
      } else if (sessionMemory == EIT_Acquisition_Supervisor.SessionState.IDLE) {
        if (start_feasibility == EIT_Acquisition_Supervisor.StartFeasibility.FEASIBLE) {
          (EIT_Acquisition_Supervisor.SessionState.MONITORING, T, T)
        } else {
          (EIT_Acquisition_Supervisor.SessionState.IDLE, F, F)
        }
      } else if (sessionMemory == EIT_Acquisition_Supervisor.SessionState.MONITORING) {
        if (request_facts.requestClass == EIT_Acquisition_Supervisor.RequestClass.STOP_REQUEST) {
          (EIT_Acquisition_Supervisor.SessionState.IDLE, F, T)
        } else {
          (EIT_Acquisition_Supervisor.SessionState.MONITORING, F, F)
        }
      } else {
        (sessionMemory, F, F)
      }

    sessionMemory = newSessionMemory

    api.put_session_frame(
      EIT_Acquisition_Supervisor.SessionFrame(
        sessionState = newSessionMemory,
        startAdmitted = startAdmitted,
        stopAdmitted = stopAdmitted))
  }

  def finalise(api: SessionControl_Operational_Api): Unit = { }
}
