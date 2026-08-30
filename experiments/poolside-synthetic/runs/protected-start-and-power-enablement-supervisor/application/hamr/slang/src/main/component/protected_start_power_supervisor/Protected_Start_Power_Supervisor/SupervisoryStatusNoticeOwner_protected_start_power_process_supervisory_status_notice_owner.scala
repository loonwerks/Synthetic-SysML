// #Sireum

package protected_start_power_supervisor.Protected_Start_Power_Supervisor

import org.sireum._
import protected_start_power_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner {

  def initialise(api: SupervisoryStatusNoticeOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_supervisory_status(Protected_Start_Power_Supervisor.SupervisoryStatus.example())
  }

  def timeTriggered(api: SupervisoryStatusNoticeOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_readiness_facts: Option[Protected_Start_Power_Supervisor.ReadinessFacts] = api.get_readiness_facts()
    api.logInfo(s"Received on data port readiness_facts: ${apiUsage_readiness_facts}")
    val apiUsage_exact_fault_summary: Option[Protected_Start_Power_Supervisor.ExactFaultSummary] = api.get_exact_fault_summary()
    api.logInfo(s"Received on data port exact_fault_summary: ${apiUsage_exact_fault_summary}")
    val apiUsage_rearm_state_facts: Option[Protected_Start_Power_Supervisor.RearmStateFacts] = api.get_rearm_state_facts()
    api.logInfo(s"Received on data port rearm_state_facts: ${apiUsage_rearm_state_facts}")
    val apiUsage_session_decision_facts: Option[Protected_Start_Power_Supervisor.SessionDecisionFacts] = api.get_session_decision_facts()
    api.logInfo(s"Received on data port session_decision_facts: ${apiUsage_session_decision_facts}")
  }

  def finalise(api: SupervisoryStatusNoticeOwner_Operational_Api): Unit = { }
}
