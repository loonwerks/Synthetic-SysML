// #Sireum

package scp_candidate.Protected_Start_Power_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner {

  def initialise(api: SupervisoryStatusNoticeOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_supervisory_status(status(
      Protected_Start_Power_Supervisor.ReadinessFacts(F, F),
      Protected_Start_Power_Supervisor.ExactFaultSummary(F, F, F, F, F, F, F),
      Protected_Start_Power_Supervisor.RearmStateFacts(Protected_Start_Power_Supervisor.RearmState.Blocked),
      Protected_Start_Power_Supervisor.SessionDecisionFacts(Protected_Start_Power_Supervisor.Session.Off,
        Protected_Start_Power_Supervisor.SessionCause.NoApplicableRequest)))
  }

  def timeTriggered(api: SupervisoryStatusNoticeOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_readiness_facts(), api.get_exact_fault_summary(), api.get_rearm_state_facts(),
      api.get_session_decision_facts()) match {
      case (Some(readiness), Some(faults), Some(rearm), Some(session)) =>
        api.put_supervisory_status(status(readiness, faults, rearm, session))
    }
  }

  def status(readiness: Protected_Start_Power_Supervisor.ReadinessFacts,
             faults: Protected_Start_Power_Supervisor.ExactFaultSummary,
             rearm: Protected_Start_Power_Supervisor.RearmStateFacts,
             session: Protected_Start_Power_Supervisor.SessionDecisionFacts): Protected_Start_Power_Supervisor.SupervisoryStatus = {
    var notice: Protected_Start_Power_Supervisor.Notice.Type = Protected_Start_Power_Supervisor.Notice.Off
    if (faults.anyFault) {
      notice = Protected_Start_Power_Supervisor.Notice.FaultAttention
    } else if (session.session == Protected_Start_Power_Supervisor.Session.Degraded) {
      if (rearm.rearmState == Protected_Start_Power_Supervisor.RearmState.Confirming) {
        notice = Protected_Start_Power_Supervisor.Notice.RecoveryConfirming
      } else {
        notice = Protected_Start_Power_Supervisor.Notice.RecoveryRequired
      }
    } else if (session.session == Protected_Start_Power_Supervisor.Session.Maintenance) {
      notice = Protected_Start_Power_Supervisor.Notice.Maintenance
    } else if (session.session == Protected_Start_Power_Supervisor.Session.Arming) {
      notice = Protected_Start_Power_Supervisor.Notice.Starting
    } else if (session.session == Protected_Start_Power_Supervisor.Session.On) {
      notice = Protected_Start_Power_Supervisor.Notice.Enabled
    }
    return Protected_Start_Power_Supervisor.SupervisoryStatus(
      session.session, readiness.startReady, readiness.sustainReady, rearm.rearmState, notice,
      faults.commandFault, faults.pedalFault, faults.thermalFault, faults.supplyFault,
      faults.parkingBrakeFault, faults.selfTestFault, faults.anyFault)
  }

  def finalise(api: SupervisoryStatusNoticeOwner_Operational_Api): Unit = { }
}
