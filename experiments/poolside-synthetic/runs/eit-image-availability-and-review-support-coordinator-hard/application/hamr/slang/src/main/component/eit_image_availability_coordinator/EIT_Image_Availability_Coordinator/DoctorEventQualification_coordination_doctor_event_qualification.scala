// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object DoctorEventQualification_coordination_doctor_event_qualification {

  def initialise(api: DoctorEventQualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_reviewFacts(EIT_Image_Availability_Coordinator.ReviewFacts.NO_REVIEW_EVENT)
  }

  def timeTriggered(api: DoctorEventQualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_doctorSignal: Option[EIT_Image_Availability_Coordinator.DoctorSignal.Type] = api.get_doctorSignal()
    api.logInfo(s"Received on data port doctorSignal: ${apiUsage_doctorSignal}")
  }

  def finalise(api: DoctorEventQualification_Operational_Api): Unit = { }
}
