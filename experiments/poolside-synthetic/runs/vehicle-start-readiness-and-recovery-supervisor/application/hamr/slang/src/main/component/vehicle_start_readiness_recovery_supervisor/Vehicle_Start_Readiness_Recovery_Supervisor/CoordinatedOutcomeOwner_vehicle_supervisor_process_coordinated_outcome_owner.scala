// #Sireum

package vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import vehicle_start_readiness_recovery_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner {

  def initialise(api: CoordinatedOutcomeOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_control_frame(Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame.example())
  }

  def timeTriggered(api: CoordinatedOutcomeOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_authorization: Option[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts] = api.get_authorization()
    api.logInfo(s"Received on data port authorization: ${apiUsage_authorization}")
    val apiUsage_applied_lifecycle: Option[Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot] = api.get_applied_lifecycle()
    api.logInfo(s"Received on data port applied_lifecycle: ${apiUsage_applied_lifecycle}")
  }

  def finalise(api: CoordinatedOutcomeOwner_Operational_Api): Unit = { }
}
