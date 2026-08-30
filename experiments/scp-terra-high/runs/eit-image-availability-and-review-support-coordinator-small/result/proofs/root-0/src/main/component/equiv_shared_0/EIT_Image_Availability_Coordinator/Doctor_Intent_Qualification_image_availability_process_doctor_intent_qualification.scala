// #Sireum

package equiv_shared_0.EIT_Image_Availability_Coordinator

import org.sireum._
import equiv_shared_0._

object Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification {
  // BEGIN FUNCTIONS
  @strictpure def qualify_intent(value: EIT_Image_Availability_Coordinator.Review_Intent_Sample): EIT_Image_Availability_Coordinator.Qualified_Intent.Type = if (value.status == Input_Status.Invalid) Qualified_Intent.InvalidIntent else if (value.intent == Review_Intent.NoIntent) Qualified_Intent.NeutralIntent else if (value.intent == Review_Intent.RequestImage) Qualified_Intent.FreshImageRequest else Qualified_Intent.ReleaseIntent
  // END FUNCTIONS
}
