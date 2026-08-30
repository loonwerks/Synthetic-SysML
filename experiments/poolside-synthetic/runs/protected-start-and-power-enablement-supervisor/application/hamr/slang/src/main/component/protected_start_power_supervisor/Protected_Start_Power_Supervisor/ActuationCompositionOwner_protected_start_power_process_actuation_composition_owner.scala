// #Sireum

package protected_start_power_supervisor.Protected_Start_Power_Supervisor

import org.sireum._
import protected_start_power_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner {

  def initialise(api: ActuationCompositionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_actuation_disposition(Protected_Start_Power_Supervisor.ActuationDisposition.example())
  }

  def timeTriggered(api: ActuationCompositionOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_session_decision_facts: Option[Protected_Start_Power_Supervisor.SessionDecisionFacts] = api.get_session_decision_facts()
    api.logInfo(s"Received on data port session_decision_facts: ${apiUsage_session_decision_facts}")
    val apiUsage_exact_fault_summary: Option[Protected_Start_Power_Supervisor.ExactFaultSummary] = api.get_exact_fault_summary()
    api.logInfo(s"Received on data port exact_fault_summary: ${apiUsage_exact_fault_summary}")
  }

  def finalise(api: ActuationCompositionOwner_Operational_Api): Unit = { }
}
