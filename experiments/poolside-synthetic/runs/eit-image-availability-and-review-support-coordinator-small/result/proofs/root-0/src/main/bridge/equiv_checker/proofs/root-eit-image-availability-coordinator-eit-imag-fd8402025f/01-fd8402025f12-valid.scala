// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fd8402025f12_1_Valid {
  @pure def check(
      acquisition_sample: equiv_shared_0.EIT_Image_Availability_Coordinator.Acquisition_Sample,
      qualified_acquisition: equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
