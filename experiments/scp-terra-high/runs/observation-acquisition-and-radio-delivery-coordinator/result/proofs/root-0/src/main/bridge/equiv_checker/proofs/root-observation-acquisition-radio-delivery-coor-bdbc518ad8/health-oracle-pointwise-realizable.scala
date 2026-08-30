// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_bdbc518ad877_Oracle_Pointwise_Realizable {
  @pure def check(
      deliveryresult: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.Type,
      radiocondition: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_GumboX.compute_CEP_Post(deliveryresult, radiocondition, equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)) |
        (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_GumboX.compute_CEP_Post(deliveryresult, radiocondition, equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.READY)) |
        (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_GumboX.compute_CEP_Post(deliveryresult, radiocondition, equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.ACCEPTED)) |
        (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_GumboX.compute_CEP_Post(deliveryresult, radiocondition, equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.REJECTED)))))
  }
}
