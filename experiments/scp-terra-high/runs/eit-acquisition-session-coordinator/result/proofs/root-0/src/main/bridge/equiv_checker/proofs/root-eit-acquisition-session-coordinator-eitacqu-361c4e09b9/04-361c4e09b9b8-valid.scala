// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_361c4e09b9b8_4_Valid {
  @pure def check(
      acquisitionobservation: equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionObservation.Type,
      beltassessment: equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltAssessment,
      calibrationqualification: equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationQualification.Type,
      eligibilityenvelope: equiv_shared_0.EIT_Acquisition_Session_Coordinator.EligibilityEnvelope,
      monitoringstate: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringState.Type,
      preparationstate: equiv_shared_0.EIT_Acquisition_Session_Coordinator.PreparationState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_GumboX.compute_CEP_Post(acquisitionobservation, beltassessment, calibrationqualification, monitoringstate, preparationstate, eligibilityenvelope))) ___>: (equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_Candidate_GumboX.compute_CEP_Post(acquisitionobservation, beltassessment, calibrationqualification, monitoringstate, preparationstate, eligibilityenvelope))) & T))
  }
}
