// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DoctorEventQualification_coordination_doctor_event_qualification {

  def initialise(api: DoctorEventQualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee init
        api.reviewFacts == ReviewFacts.NO_REVIEW_EVENT
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_reviewFacts(EIT_Image_Availability_Coordinator.ReviewFacts.NO_REVIEW_EVENT)
  }

  def finalise(api: DoctorEventQualification_Operational_Api): Unit = { }
  def timeTriggered(api: DoctorEventQualification_Operational_Api): Unit = { }
}
