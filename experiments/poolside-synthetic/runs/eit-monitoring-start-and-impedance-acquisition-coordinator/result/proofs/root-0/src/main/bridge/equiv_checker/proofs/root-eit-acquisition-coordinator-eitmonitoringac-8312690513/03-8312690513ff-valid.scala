// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8312690513ff_3_Valid {
  @pure def check(
      acquisitionevidence: equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidence.Type,
      monitoringresolution: equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringResolution,
      monitoringstatus: equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
