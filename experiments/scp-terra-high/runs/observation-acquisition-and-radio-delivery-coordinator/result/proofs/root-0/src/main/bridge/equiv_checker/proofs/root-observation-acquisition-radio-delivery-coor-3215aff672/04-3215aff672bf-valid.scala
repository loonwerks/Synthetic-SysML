// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3215aff672bf_4_Valid {
  @pure def check(
      deliveryresult: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.Type,
      radiocondition: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.Type,
      radioevidence: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_GumboX.inititialize_IEP_Post(deliveryresult, radiocondition, radioevidence))) ___>: (T)) & T))
  }
}
