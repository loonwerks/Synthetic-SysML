// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c17407c84661_3_Valid {
  @pure def check(
      acquisitionevidence: equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidence.Type,
      impedancedelivery: equiv_shared_0.EIT_Acquisition_Coordinator.ImpedanceDelivery.Type,
      monitoringresolution: equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringResolution): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
