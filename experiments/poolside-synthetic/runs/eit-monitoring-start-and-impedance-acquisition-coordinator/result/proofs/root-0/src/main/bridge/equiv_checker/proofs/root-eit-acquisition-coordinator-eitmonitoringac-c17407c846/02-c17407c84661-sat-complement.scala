// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c17407c84661_2_Complement {
  @pure def check(
      acquisitionevidence: equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidence.Type,
      impedancedelivery: equiv_shared_0.EIT_Acquisition_Coordinator.ImpedanceDelivery.Type,
      monitoringresolution: equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringResolution): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_GumboX.compute_CEP_Post(acquisitionevidence, monitoringresolution, impedancedelivery))) & T)))
  }
}
