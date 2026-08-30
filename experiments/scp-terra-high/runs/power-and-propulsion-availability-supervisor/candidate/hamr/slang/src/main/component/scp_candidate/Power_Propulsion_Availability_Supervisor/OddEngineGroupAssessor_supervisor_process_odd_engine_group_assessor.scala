// #Sireum

package scp_candidate.Power_Propulsion_Availability_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor {

  def initialise(api: OddEngineGroupAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api), Ensures(
      // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_ODD_GROUP_NOT_READY
        api.odd_engine_assessment == EnginePairAssessment.NOT_READY_INVALID
        // END INITIALIZES ENSURES
    ))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_odd_engine_assessment(Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_INVALID)
  }

  def timeTriggered(api: OddEngineGroupAssessor_Operational_Api): Unit = { }
  def finalise(api: OddEngineGroupAssessor_Operational_Api): Unit = { }
}
