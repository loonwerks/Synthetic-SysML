// #Sireum

package scp_candidate.EIT_Acquisition_Session_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner {

  def initialise(api: AcquisitionEligibilityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api),
      Ensures(T /*
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_ELIGIBILITY_ENVELOPE
        (!(api.beltAssessment.qualified) &&
           api.beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE ___>:
           api.eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_UNAVAILABLE_CONDITION &&
             !(api.eligibilityEnvelope.beltQualified) &&
             !(api.eligibilityEnvelope.calibrationQualified)) &&
          (!(api.beltAssessment.qualified) &&
            api.beltAssessment.beltCategory == BeltQualification.BELT_ABSENT ___>:
            api.eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_ABSENT_CONDITION &&
              !(api.eligibilityEnvelope.beltQualified) &&
              !(api.eligibilityEnvelope.calibrationQualified)) &&
          (api.beltAssessment.qualified &&
            (api.preparationState != PreparationState.PREPARATION_CALIBRATED ||
              api.calibrationQualification != CalibrationQualification.CALIBRATED) ___>:
            api.eligibilityEnvelope.condition == EligibilityEnvelopeCondition.CALIBRATION_NOT_READY_CONDITION &&
              api.eligibilityEnvelope.beltQualified) &&
          (api.beltAssessment.qualified &&
            api.calibrationQualification == CalibrationQualification.CALIBRATED &&
            api.preparationState == PreparationState.PREPARATION_CALIBRATED &&
            api.acquisitionObservation == AcquisitionObservation.ACQUISITION_FAULT ___>:
            api.eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_FAULT_CONDITION &&
              api.eligibilityEnvelope.beltQualified &&
              api.eligibilityEnvelope.calibrationQualified) &&
          (api.beltAssessment.qualified &&
            api.calibrationQualification == CalibrationQualification.CALIBRATED &&
            api.preparationState == PreparationState.PREPARATION_CALIBRATED &&
            api.acquisitionObservation == AcquisitionObservation.ACQUISITION_AVAILABLE ___>:
            api.eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY &&
              api.eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY &&
              api.eligibilityEnvelope.beltQualified &&
              api.eligibilityEnvelope.calibrationQualified)
        // END INITIALIZES ENSURES
      */)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_eligibilityEnvelope(EIT_Acquisition_Session_Coordinator.EligibilityEnvelope.example())
  }

  def timeTriggered(api: AcquisitionEligibilityOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_eligibilityEnvelope(EligibilityEnvelope.example())
  }

  def finalise(api: AcquisitionEligibilityOwner_Operational_Api): Unit = { }
}
