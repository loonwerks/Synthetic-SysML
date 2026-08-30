// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityServiceAssessment_coordination_availability_service_assessment {

  def initialise(api: AvailabilityServiceAssessment_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee init
        api.serviceFacts == ServiceFacts.READY
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_serviceFacts(EIT_Image_Availability_Coordinator.ServiceFacts.READY)
  }

  def finalise(api: AvailabilityServiceAssessment_Operational_Api): Unit = { }
  def timeTriggered(api: AvailabilityServiceAssessment_Operational_Api): Unit = { }
}
