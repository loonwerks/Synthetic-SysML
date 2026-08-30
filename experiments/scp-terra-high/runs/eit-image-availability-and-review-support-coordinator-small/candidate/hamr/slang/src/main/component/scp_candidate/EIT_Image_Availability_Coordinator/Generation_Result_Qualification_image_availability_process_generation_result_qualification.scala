// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Generation_Result_Qualification_image_availability_process_generation_result_qualification {

  def initialise(api: Generation_Result_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_qualified_generation_result(EIT_Image_Availability_Coordinator.Qualified_Generation_Result.InvalidGenerationResult)
  }

  def timeTriggered(api: Generation_Result_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val Some(value) = api.get_generation_result_sample()
    val qualified: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type =
      if (value.status == EIT_Image_Availability_Coordinator.Input_Status.Invalid) {
        EIT_Image_Availability_Coordinator.Qualified_Generation_Result.InvalidGenerationResult
      } else if (value.result == EIT_Image_Availability_Coordinator.Generation_Result.NoResult) {
        EIT_Image_Availability_Coordinator.Qualified_Generation_Result.PendingResult
      } else if (value.result == EIT_Image_Availability_Coordinator.Generation_Result.GenerationFailed) {
        EIT_Image_Availability_Coordinator.Qualified_Generation_Result.FailedResult
      } else if (value.result == EIT_Image_Availability_Coordinator.Generation_Result.ImageA) {
        EIT_Image_Availability_Coordinator.Qualified_Generation_Result.ReadyResultA
      } else {
        EIT_Image_Availability_Coordinator.Qualified_Generation_Result.ReadyResultB
      }
    api.put_qualified_generation_result(qualified)
  }

  def finalise(api: Generation_Result_Qualification_Operational_Api): Unit = { }
}
