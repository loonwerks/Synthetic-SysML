// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bdbc518ad877_3_Valid {
  @pure def check(
      deliveryresult: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.Type,
      radiocondition: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.Type,
      radioevidence: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
