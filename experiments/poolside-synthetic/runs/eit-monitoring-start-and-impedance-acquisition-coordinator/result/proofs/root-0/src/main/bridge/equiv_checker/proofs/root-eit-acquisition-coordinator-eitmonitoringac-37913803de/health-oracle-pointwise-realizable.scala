// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_37913803de8d_Oracle_Pointwise_Realizable {
  @pure def check(
      calibrationsample: equiv_shared_0.EIT_Acquisition_Coordinator.CalibrationSample,
      impedancesample: equiv_shared_0.EIT_Acquisition_Coordinator.ImpedanceSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_GumboX.compute_CEP_Post(calibrationsample, impedancesample, equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidence.InvalidAcquisitionEvidence)) |
        (equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_GumboX.compute_CEP_Post(calibrationsample, impedancesample, equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidence.CalibrationAbsent)) |
        (equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_GumboX.compute_CEP_Post(calibrationsample, impedancesample, equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidence.ReadyNoToken)) |
        (equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_GumboX.compute_CEP_Post(calibrationsample, impedancesample, equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidence.ReadyTokenOne)) |
        (equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_GumboX.compute_CEP_Post(calibrationsample, impedancesample, equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidence.ReadyTokenTwo)))))
  }
}
