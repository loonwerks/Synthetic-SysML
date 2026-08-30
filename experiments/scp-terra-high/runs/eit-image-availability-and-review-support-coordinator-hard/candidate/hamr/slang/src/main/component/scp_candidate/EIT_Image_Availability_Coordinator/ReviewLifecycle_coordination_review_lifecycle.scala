// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ReviewLifecycle_coordination_review_lifecycle {

  def initialise(api: ReviewLifecycle_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_reviewFrame(EIT_Image_Availability_Coordinator.ReviewFrame.example())
  }

  def finalise(api: ReviewLifecycle_Operational_Api): Unit = { }
  def timeTriggered(api: ReviewLifecycle_Operational_Api): Unit = { Contract(Modifies(api)) }
}
