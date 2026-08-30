// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3215aff672bf_2_Complement {
  @pure def check(
      deliveryresult: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.Type,
      radiocondition: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.Type,
      radioevidence: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_GumboX.inititialize_IEP_Post(deliveryresult, radiocondition, radioevidence))) & T)))
  }
}
