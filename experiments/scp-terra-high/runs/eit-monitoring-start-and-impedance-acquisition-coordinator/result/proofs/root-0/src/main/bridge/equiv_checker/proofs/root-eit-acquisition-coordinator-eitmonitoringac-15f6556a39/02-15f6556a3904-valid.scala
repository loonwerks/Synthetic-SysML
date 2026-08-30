// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_15f6556a3904_2_Valid {
  @pure def check(
      acquisitionevidence: equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidence.Type,
      monitoringresolution: equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringResolution,
      monitoringstatus: equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_GumboX.compute_CEP_Post(acquisitionevidence, monitoringresolution, monitoringstatus))) & T))
  }
}
