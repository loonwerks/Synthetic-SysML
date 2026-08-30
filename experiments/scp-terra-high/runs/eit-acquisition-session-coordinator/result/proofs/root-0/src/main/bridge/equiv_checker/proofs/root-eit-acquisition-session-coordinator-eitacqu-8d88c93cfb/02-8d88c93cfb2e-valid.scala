// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8d88c93cfb2e_2_Valid {
  @pure def check(
      acquisitionobservation: equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionObservation.Type,
      beltassessment: equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltAssessment,
      calibrationqualification: equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationQualification.Type,
      eligibilityenvelope: equiv_shared_0.EIT_Acquisition_Session_Coordinator.EligibilityEnvelope,
      monitoringstate: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringState.Type,
      preparationstate: equiv_shared_0.EIT_Acquisition_Session_Coordinator.PreparationState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_GumboX.inititialize_IEP_Post(acquisitionobservation, beltassessment, calibrationqualification, preparationstate, eligibilityenvelope))) & T))
  }
}
