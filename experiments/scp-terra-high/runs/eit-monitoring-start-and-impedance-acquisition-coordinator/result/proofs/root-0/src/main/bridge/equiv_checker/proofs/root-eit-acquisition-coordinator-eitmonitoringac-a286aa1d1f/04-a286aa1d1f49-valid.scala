// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a286aa1d1f49_4_Valid {
  @pure def check(
      acquisitionevidence: equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidence.Type,
      impedancedelivery: equiv_shared_0.EIT_Acquisition_Coordinator.ImpedanceDelivery.Type,
      monitoringresolution: equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringResolution): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_GumboX.inititialize_IEP_Post(impedancedelivery))) ___>: (T)) & T))
  }
}
