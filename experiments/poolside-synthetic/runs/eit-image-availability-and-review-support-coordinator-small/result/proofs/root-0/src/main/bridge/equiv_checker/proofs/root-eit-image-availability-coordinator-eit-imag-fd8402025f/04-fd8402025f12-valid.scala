// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fd8402025f12_4_Valid {
  @pure def check(
      acquisition_sample: equiv_shared_0.EIT_Image_Availability_Coordinator.Acquisition_Sample,
      qualified_acquisition: equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_GumboX.inititialize_IEP_Post(qualified_acquisition))) ___>: (T)) & T))
  }
}
