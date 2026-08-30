// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AtomicResultPublisher_supervision_atomicResultPublisher {

  def initialise(api: AtomicResultPublisher_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_actuationPlan(HVAC_Visibility_Priority_Supervisor.CabinActuationPlan.example())
    api.put_supervisorStatus(HVAC_Visibility_Priority_Supervisor.SupervisorStatus.example())
  }

  def timeTriggered(api: AtomicResultPublisher_Operational_Api): Unit = {
    // example api usage

    val apiUsage_candidatePlan: Option[HVAC_Visibility_Priority_Supervisor.CandidatePlan] = api.get_candidatePlan()
    api.logInfo(s"Received on data port candidatePlan: ${apiUsage_candidatePlan}")
    val apiUsage_arbitrationStatus: Option[HVAC_Visibility_Priority_Supervisor.ArbitrationStatus] = api.get_arbitrationStatus()
    api.logInfo(s"Received on data port arbitrationStatus: ${apiUsage_arbitrationStatus}")
    val apiUsage_recoveryReport: Option[HVAC_Visibility_Priority_Supervisor.RecoveryReport] = api.get_recoveryReport()
    api.logInfo(s"Received on data port recoveryReport: ${apiUsage_recoveryReport}")
  }

  def finalise(api: AtomicResultPublisher_Operational_Api): Unit = { }
}
