// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_a286aa1d1f49_Oracle_Pointwise_Realizable {
  @pure def check(
      acquisitionevidence: equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidence.Type,
      monitoringresolution: equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringResolution): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Coordinator.ImpedanceDelivery.Withheld)) |
        (equiv_shared_0.EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Coordinator.ImpedanceDelivery.NoTokenAvailable)) |
        (equiv_shared_0.EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Coordinator.ImpedanceDelivery.DeliverTokenOne)) |
        (equiv_shared_0.EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_GumboX.inititialize_IEP_Post(equiv_shared_0.EIT_Acquisition_Coordinator.ImpedanceDelivery.DeliverTokenTwo)))))
  }
}
