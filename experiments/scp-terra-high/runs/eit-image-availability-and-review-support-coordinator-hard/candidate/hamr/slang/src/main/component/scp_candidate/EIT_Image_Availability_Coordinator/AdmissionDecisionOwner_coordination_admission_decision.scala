// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AdmissionDecisionOwner_coordination_admission_decision {

  def initialise(api: AdmissionDecisionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_admissionFrame(EIT_Image_Availability_Coordinator.AdmissionFrame.example())
  }

  def finalise(api: AdmissionDecisionOwner_Operational_Api): Unit = { }
  def timeTriggered(api: AdmissionDecisionOwner_Operational_Api): Unit = { Contract(Modifies(api)) }
}
