// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a7bd0fd69e99_3_Valid {
  @pure def check(
      observationintent: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.Type,
      sessiondecision: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type,
      sessionproposal: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
