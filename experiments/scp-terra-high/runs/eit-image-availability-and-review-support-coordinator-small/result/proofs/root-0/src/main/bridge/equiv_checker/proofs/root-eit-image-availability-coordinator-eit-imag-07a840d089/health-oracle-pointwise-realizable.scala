// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_07a840d0890b_Oracle_Pointwise_Realizable {
  @pure def check(
      generation_result_sample: equiv_shared_0.EIT_Image_Availability_Coordinator.Generation_Result_Sample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_GumboX.compute_CEP_Post(generation_result_sample, equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Generation_Result.InvalidGenerationResult)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_GumboX.compute_CEP_Post(generation_result_sample, equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Generation_Result.PendingResult)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_GumboX.compute_CEP_Post(generation_result_sample, equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Generation_Result.FailedResult)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_GumboX.compute_CEP_Post(generation_result_sample, equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Generation_Result.ReadyResultA)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_GumboX.compute_CEP_Post(generation_result_sample, equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Generation_Result.ReadyResultB)))))
  }
}
