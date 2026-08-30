// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ImageEventQualification_coordination_image_event_qualification {

  def initialise(api: ImageEventQualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee init
        api.imageFacts == ImageFacts.NO_IMAGE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_imageFacts(EIT_Image_Availability_Coordinator.ImageFacts.NO_IMAGE)
  }

  def finalise(api: ImageEventQualification_Operational_Api): Unit = { }
  def timeTriggered(api: ImageEventQualification_Operational_Api): Unit = { }
}
