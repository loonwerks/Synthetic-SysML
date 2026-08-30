// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_37913803de8d_2_Valid {
  @pure def check(
      acquisitionevidence: equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidence.Type,
      calibrationsample: equiv_shared_0.EIT_Acquisition_Coordinator.CalibrationSample,
      impedancesample: equiv_shared_0.EIT_Acquisition_Coordinator.ImpedanceSample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_GumboX.compute_CEP_Post(calibrationsample, impedancesample, acquisitionevidence))) & T))
  }
}
