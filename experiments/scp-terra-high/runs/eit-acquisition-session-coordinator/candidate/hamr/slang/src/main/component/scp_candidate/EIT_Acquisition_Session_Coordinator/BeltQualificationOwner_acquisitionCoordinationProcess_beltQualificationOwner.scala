// #Sireum

package scp_candidate.EIT_Acquisition_Session_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner {

  def initialise(api: BeltQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api),
      Ensures(T /*
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_BELT_ASSESSMENT
        (api.beltObservation == BeltObservation.BELT_OBSERVATION_INVALID ___>:
           api.beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE &&
             !(api.beltAssessment.qualified)) &&
          (api.beltObservation == BeltObservation.BELT_NOT_APPLIED ___>:
            api.beltAssessment.beltCategory == BeltQualification.BELT_ABSENT &&
              !(api.beltAssessment.qualified)) &&
          (api.beltObservation == BeltObservation.BELT_APPLIED ___>:
            api.beltAssessment.beltCategory == BeltQualification.BELT_PRESENT &&
              api.beltAssessment.qualified)
        // END INITIALIZES ENSURES
      */)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_beltAssessment(EIT_Acquisition_Session_Coordinator.BeltAssessment.example())
  }

  def timeTriggered(api: BeltQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_beltObservation() match {
      case Some(BeltObservation.BELT_APPLIED) =>
        api.put_beltAssessment(BeltAssessment(BeltQualification.BELT_PRESENT, T))
      case Some(BeltObservation.BELT_NOT_APPLIED) =>
        api.put_beltAssessment(BeltAssessment(BeltQualification.BELT_ABSENT, F))
      case _ => api.put_beltAssessment(BeltAssessment(BeltQualification.BELT_UNAVAILABLE, F))
    }
  }

  def finalise(api: BeltQualificationOwner_Operational_Api): Unit = { }
}
