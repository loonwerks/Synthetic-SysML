// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f32ec5269731_3_Valid {
  @pure def check(
      availability_assessment: equiv_shared_0.Factory_Dispatch_Coordinator.Availability_Assessment_Value.Type,
      raw_availability: equiv_shared_0.Factory_Dispatch_Coordinator.Product_Availability_Sample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
