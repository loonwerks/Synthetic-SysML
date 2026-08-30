// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cf062147e0c4_2_Complement {
  @pure def check(
      observationintent: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.Type,
      sessiondecision: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type,
      sessionproposal: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_GumboX.inititialize_IEP_Post(observationintent, sessionproposal, sessiondecision))) & T)))
  }
}
