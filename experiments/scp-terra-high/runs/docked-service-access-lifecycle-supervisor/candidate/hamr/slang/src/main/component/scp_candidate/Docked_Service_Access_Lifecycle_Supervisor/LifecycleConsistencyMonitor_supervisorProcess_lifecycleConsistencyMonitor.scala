// #Sireum

package scp_candidate.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor {

  def initialise(api: LifecycleConsistencyMonitor_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee ASSESSMENT_INITIAL_SAFE
        api.operationalAssessment == OperationalAssessment.ASSESSMENT_FAULT
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_operationalAssessment(Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.ASSESSMENT_FAULT)
  }

  def timeTriggered(api: LifecycleConsistencyMonitor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: OperationalAssessment.Type = OperationalAssessment.ASSESSMENT_FAULT
    api.put_operationalAssessment(assessment)
  }

  def finalise(api: LifecycleConsistencyMonitor_Operational_Api): Unit = { }
}
