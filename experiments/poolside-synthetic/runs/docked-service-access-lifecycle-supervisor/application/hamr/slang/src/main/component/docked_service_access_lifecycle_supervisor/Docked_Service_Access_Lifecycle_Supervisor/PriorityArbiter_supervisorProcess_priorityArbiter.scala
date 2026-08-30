// #Sireum

package docked_service_access_lifecycle_supervisor.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import docked_service_access_lifecycle_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PriorityArbiter_supervisorProcess_priorityArbiter {

  def initialise(api: PriorityArbiter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_admittedDirective(Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.ENTER_RECOVERY_FAULT)
  }

  def timeTriggered(api: PriorityArbiter_Operational_Api): Unit = {
    // example api usage

    val apiUsage_qualifiedIntent: Option[Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.Type] = api.get_qualifiedIntent()
    api.logInfo(s"Received on data port qualifiedIntent: ${apiUsage_qualifiedIntent}")
    val apiUsage_operationalAssessment: Option[Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.Type] = api.get_operationalAssessment()
    api.logInfo(s"Received on data port operationalAssessment: ${apiUsage_operationalAssessment}")
    val apiUsage_lifecyclePrestate: Option[Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type] = api.get_lifecyclePrestate()
    api.logInfo(s"Received on data port lifecyclePrestate: ${apiUsage_lifecyclePrestate}")
  }

  def finalise(api: PriorityArbiter_Operational_Api): Unit = { }
}
