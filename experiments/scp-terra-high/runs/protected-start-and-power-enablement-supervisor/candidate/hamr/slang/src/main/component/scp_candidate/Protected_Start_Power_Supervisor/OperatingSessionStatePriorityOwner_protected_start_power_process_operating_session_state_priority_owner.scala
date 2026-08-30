// #Sireum

package scp_candidate.Protected_Start_Power_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner {
  var sessionMemory: Protected_Start_Power_Supervisor.Session.Type = Protected_Start_Power_Supervisor.Session.Off

  def initialise(api: OperatingSessionStatePriorityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, sessionMemory))
    sessionMemory = Protected_Start_Power_Supervisor.Session.Off
    api.put_session_decision_facts(Protected_Start_Power_Supervisor.SessionDecisionFacts(
      sessionMemory, Protected_Start_Power_Supervisor.SessionCause.NoApplicableRequest))
  }

  def timeTriggered(api: OperatingSessionStatePriorityOwner_Operational_Api): Unit = {
    Contract(Modifies(api, sessionMemory))
    (api.get_qualified_command_facts(), api.get_readiness_facts(), api.get_exact_fault_summary(),
      api.get_recovery_permit_fact()) match {
      case (Some(command), Some(readiness), Some(faults), Some(recovery)) =>
        val old = sessionMemory
        val cause: Protected_Start_Power_Supervisor.SessionCause.Type =
          if (faults.anyFault) {
            sessionMemory = Protected_Start_Power_Supervisor.Session.Degraded
            Protected_Start_Power_Supervisor.SessionCause.CurrentFault
          } else if (old == Protected_Start_Power_Supervisor.Session.Degraded && recovery.recoveryPermit) {
            sessionMemory = Protected_Start_Power_Supervisor.Session.Off
            Protected_Start_Power_Supervisor.SessionCause.FreshRecoveryAccepted
          } else if (old == Protected_Start_Power_Supervisor.Session.Degraded) {
            Protected_Start_Power_Supervisor.SessionCause.RecoveryPending
          } else if (command.command == Protected_Start_Power_Supervisor.Command.Off) {
            sessionMemory = Protected_Start_Power_Supervisor.Session.Off
            Protected_Start_Power_Supervisor.SessionCause.OffAccepted
          } else if (command.command == Protected_Start_Power_Supervisor.Command.EnterMaintenance) {
            sessionMemory = Protected_Start_Power_Supervisor.Session.Maintenance
            Protected_Start_Power_Supervisor.SessionCause.MaintenanceAccepted
          } else if ((old == Protected_Start_Power_Supervisor.Session.Off ||
            old == Protected_Start_Power_Supervisor.Session.Maintenance) &&
            command.command == Protected_Start_Power_Supervisor.Command.Start) {
            if (readiness.startReady) {
              sessionMemory = Protected_Start_Power_Supervisor.Session.Arming
              Protected_Start_Power_Supervisor.SessionCause.StartAccepted
            } else {
              Protected_Start_Power_Supervisor.SessionCause.StartRejected
            }
          } else if (old == Protected_Start_Power_Supervisor.Session.Arming) {
            if (readiness.sustainReady) {
              sessionMemory = Protected_Start_Power_Supervisor.Session.On
              Protected_Start_Power_Supervisor.SessionCause.EnableCompleted
            } else {
              sessionMemory = Protected_Start_Power_Supervisor.Session.Off
              Protected_Start_Power_Supervisor.SessionCause.EnableAborted
            }
          } else if (old == Protected_Start_Power_Supervisor.Session.On) {
            if (readiness.sustainReady) {
              Protected_Start_Power_Supervisor.SessionCause.OnSustained
            } else {
              sessionMemory = Protected_Start_Power_Supervisor.Session.Degraded
              Protected_Start_Power_Supervisor.SessionCause.ReadinessWithdrawn
            }
          } else {
            Protected_Start_Power_Supervisor.SessionCause.NoApplicableRequest
          }
        api.put_session_decision_facts(Protected_Start_Power_Supervisor.SessionDecisionFacts(sessionMemory, cause))
    }
  }

  def finalise(api: OperatingSessionStatePriorityOwner_Operational_Api): Unit = { }
}
