// #Sireum

package equiv_shared_0.EIT_Image_Availability_Coordinator

import org.sireum._
import equiv_shared_0._

object Doctor_Publication_image_availability_process_doctor_publication {
  // BEGIN FUNCTIONS
  @strictpure def delivery_for(resolution: EIT_Image_Availability_Coordinator.Image_Resolution): EIT_Image_Availability_Coordinator.Image_Delivery.Type = if (resolution.next_image_state == Image_State.ReadyA) Image_Delivery.DeliverImageA else if (resolution.next_image_state == Image_State.ReadyB) Image_Delivery.DeliverImageB else Image_Delivery.Withheld

  @strictpure def status_for(resolution: EIT_Image_Availability_Coordinator.Image_Resolution): EIT_Image_Availability_Coordinator.Availability_Status.Type = if (resolution.disposition == Resolution_Disposition.InputFaultDisposition) Availability_Status.InputFault else if (resolution.disposition == Resolution_Disposition.RecoveryDisposition) Availability_Status.RecoveryPending else if (resolution.disposition == Resolution_Disposition.GenerationStarted |
          resolution.disposition == Resolution_Disposition.GenerationWaiting) Availability_Status.GenerationPending else if (resolution.disposition == Resolution_Disposition.GenerationCompleted |
          resolution.disposition == Resolution_Disposition.ExistingImageRetained |
          resolution.disposition == Resolution_Disposition.AvailableRetained) Availability_Status.ImageAvailable else if (resolution.disposition == Resolution_Disposition.AcquisitionRequired) Availability_Status.UpstreamAcquisitionRequired else if (resolution.disposition == Resolution_Disposition.GenerationFailure) Availability_Status.GenerationFailedStatus else Availability_Status.NoImageAvailable
  // END FUNCTIONS
}
