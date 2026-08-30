// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PreparationContextAssessment_coordination_preparation_context_assessment {

  def initialise(api: PreparationContextAssessment_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee init
        api.contextFacts == ContextFacts.NO_CONTEXT
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_contextFacts(EIT_Image_Availability_Coordinator.ContextFacts.NO_CONTEXT)
  }

  def finalise(api: PreparationContextAssessment_Operational_Api): Unit = { }
  def timeTriggered(api: PreparationContextAssessment_Operational_Api): Unit = { }
}
