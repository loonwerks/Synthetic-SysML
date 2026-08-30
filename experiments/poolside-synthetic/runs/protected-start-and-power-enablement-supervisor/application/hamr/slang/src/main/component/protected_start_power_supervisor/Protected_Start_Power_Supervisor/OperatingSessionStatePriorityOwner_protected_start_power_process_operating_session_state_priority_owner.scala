// #Sireum

package protected_start_power_supervisor.Protected_Start_Power_Supervisor

import org.sireum._
import protected_start_power_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner {

  def initialise(api: OperatingSessionStatePriorityOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_session_decision_facts(Protected_Start_Power_Supervisor.SessionDecisionFacts.example())
  }

  def timeTriggered(api: OperatingSessionStatePriorityOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_qualified_command_facts: Option[Protected_Start_Power_Supervisor.QualifiedCommandFacts] = api.get_qualified_command_facts()
    api.logInfo(s"Received on data port qualified_command_facts: ${apiUsage_qualified_command_facts}")
    val apiUsage_readiness_facts: Option[Protected_Start_Power_Supervisor.ReadinessFacts] = api.get_readiness_facts()
    api.logInfo(s"Received on data port readiness_facts: ${apiUsage_readiness_facts}")
    val apiUsage_exact_fault_summary: Option[Protected_Start_Power_Supervisor.ExactFaultSummary] = api.get_exact_fault_summary()
    api.logInfo(s"Received on data port exact_fault_summary: ${apiUsage_exact_fault_summary}")
    val apiUsage_recovery_permit_fact: Option[Protected_Start_Power_Supervisor.RecoveryPermitFact] = api.get_recovery_permit_fact()
    api.logInfo(s"Received on data port recovery_permit_fact: ${apiUsage_recovery_permit_fact}")
  }

  def finalise(api: OperatingSessionStatePriorityOwner_Operational_Api): Unit = { }
}
