// #Sireum

package vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import vehicle_start_readiness_recovery_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner {

  def initialise(api: SelfTestCycleOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_cycle_assessment(Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Idle)
  }

  def timeTriggered(api: SelfTestCycleOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_self_test_observation: Option[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.Type] = api.get_self_test_observation()
    api.logInfo(s"Received on data port self_test_observation: ${apiUsage_self_test_observation}")
    val apiUsage_test_cycle_directive: Option[Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.Type] = api.get_test_cycle_directive()
    api.logInfo(s"Received on data port test_cycle_directive: ${apiUsage_test_cycle_directive}")
  }

  def finalise(api: SelfTestCycleOwner_Operational_Api): Unit = { }
}
