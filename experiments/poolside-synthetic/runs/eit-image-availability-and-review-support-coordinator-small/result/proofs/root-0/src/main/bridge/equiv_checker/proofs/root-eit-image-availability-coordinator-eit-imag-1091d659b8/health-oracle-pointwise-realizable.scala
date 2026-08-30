// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_1091d659b8f5_Oracle_Pointwise_Realizable {
  @pure def check(
      acquisition_sample: equiv_shared_0.EIT_Image_Availability_Coordinator.Acquisition_Sample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_GumboX.compute_CEP_Post(acquisition_sample, equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Acquisition.InvalidAcquisition)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_GumboX.compute_CEP_Post(acquisition_sample, equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Acquisition.NoAdmittedAcquisition)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_GumboX.compute_CEP_Post(acquisition_sample, equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Acquisition.AdmittedA)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_GumboX.compute_CEP_Post(acquisition_sample, equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Acquisition.AdmittedB)))))
  }
}
