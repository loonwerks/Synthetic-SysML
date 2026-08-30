// #Sireum

package equiv_shared_0.EIT_Image_Availability_Coordinator

import org.sireum._
import equiv_shared_0._

object Generation_Result_Qualification_image_availability_process_generation_result_qualification {
  // BEGIN FUNCTIONS
  @strictpure def qualify_result(value: EIT_Image_Availability_Coordinator.Generation_Result_Sample): EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type = if (value.status == Input_Status.Invalid) Qualified_Generation_Result.InvalidGenerationResult else if (value.result == Generation_Result.NoResult) Qualified_Generation_Result.PendingResult else if (value.result == Generation_Result.GenerationFailed) Qualified_Generation_Result.FailedResult else if (value.result == Generation_Result.ImageA) Qualified_Generation_Result.ReadyResultA else Qualified_Generation_Result.ReadyResultB
  // END FUNCTIONS
}
