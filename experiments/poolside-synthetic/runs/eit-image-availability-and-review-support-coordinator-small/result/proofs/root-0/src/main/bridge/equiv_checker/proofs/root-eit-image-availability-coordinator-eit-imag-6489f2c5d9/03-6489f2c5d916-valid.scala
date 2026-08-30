// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6489f2c5d916_3_Valid {
  @pure def check(
      generation_result_sample: equiv_shared_0.EIT_Image_Availability_Coordinator.Generation_Result_Sample,
      qualified_generation_result: equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
