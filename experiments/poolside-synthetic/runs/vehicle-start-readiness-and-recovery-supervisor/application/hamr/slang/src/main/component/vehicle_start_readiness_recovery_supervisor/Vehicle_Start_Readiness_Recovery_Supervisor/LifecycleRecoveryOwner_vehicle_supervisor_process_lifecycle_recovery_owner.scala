// #Sireum

package vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import vehicle_start_readiness_recovery_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner {

  def initialise(api: LifecycleRecoveryOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_test_cycle_directive(Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.None)
    api.put_applied_lifecycle(Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot.example())
  }

  def timeTriggered(api: LifecycleRecoveryOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_request_facts: Option[Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts] = api.get_request_facts()
    api.logInfo(s"Received on data port request_facts: ${apiUsage_request_facts}")
    val apiUsage_brake_facts: Option[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts] = api.get_brake_facts()
    api.logInfo(s"Received on data port brake_facts: ${apiUsage_brake_facts}")
    val apiUsage_health_qualification: Option[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type] = api.get_health_qualification()
    api.logInfo(s"Received on data port health_qualification: ${apiUsage_health_qualification}")
    val apiUsage_power_facts: Option[Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts] = api.get_power_facts()
    api.logInfo(s"Received on data port power_facts: ${apiUsage_power_facts}")
    val apiUsage_cycle_assessment: Option[Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Type] = api.get_cycle_assessment()
    api.logInfo(s"Received on data port cycle_assessment: ${apiUsage_cycle_assessment}")
    val apiUsage_authorization: Option[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts] = api.get_authorization()
    api.logInfo(s"Received on data port authorization: ${apiUsage_authorization}")
  }

  def finalise(api: LifecycleRecoveryOwner_Operational_Api): Unit = { }
}
