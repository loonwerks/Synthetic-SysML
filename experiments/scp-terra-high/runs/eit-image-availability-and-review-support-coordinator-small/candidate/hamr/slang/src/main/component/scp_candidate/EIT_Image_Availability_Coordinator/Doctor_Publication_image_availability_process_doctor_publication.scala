// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Doctor_Publication_image_availability_process_doctor_publication {

  def initialise(api: Doctor_Publication_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_image_delivery(EIT_Image_Availability_Coordinator.Image_Delivery.Withheld)
    api.put_availability_status(EIT_Image_Availability_Coordinator.Availability_Status.NoImageAvailable)
  }

  def timeTriggered(api: Doctor_Publication_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val resolution: Option[EIT_Image_Availability_Coordinator.Image_Resolution] = api.get_image_resolution()
    val delivery: EIT_Image_Availability_Coordinator.Image_Delivery.Type = resolution match {
      case Some(value) if value.next_image_state == EIT_Image_Availability_Coordinator.Image_State.ReadyA =>
        EIT_Image_Availability_Coordinator.Image_Delivery.DeliverImageA
      case Some(value) if value.next_image_state == EIT_Image_Availability_Coordinator.Image_State.ReadyB =>
        EIT_Image_Availability_Coordinator.Image_Delivery.DeliverImageB
      case _ => EIT_Image_Availability_Coordinator.Image_Delivery.Withheld
    }
    val status: EIT_Image_Availability_Coordinator.Availability_Status.Type = resolution match {
      case Some(value) if value.disposition == EIT_Image_Availability_Coordinator.Resolution_Disposition.InputFaultDisposition =>
        EIT_Image_Availability_Coordinator.Availability_Status.InputFault
      case Some(value) if value.disposition == EIT_Image_Availability_Coordinator.Resolution_Disposition.RecoveryDisposition =>
        EIT_Image_Availability_Coordinator.Availability_Status.RecoveryPending
      case Some(value) if value.disposition == EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationStarted ||
        value.disposition == EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationWaiting =>
        EIT_Image_Availability_Coordinator.Availability_Status.GenerationPending
      case Some(value) if value.disposition == EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationCompleted ||
        value.disposition == EIT_Image_Availability_Coordinator.Resolution_Disposition.ExistingImageRetained ||
        value.disposition == EIT_Image_Availability_Coordinator.Resolution_Disposition.AvailableRetained =>
        EIT_Image_Availability_Coordinator.Availability_Status.ImageAvailable
      case Some(value) if value.disposition == EIT_Image_Availability_Coordinator.Resolution_Disposition.AcquisitionRequired =>
        EIT_Image_Availability_Coordinator.Availability_Status.UpstreamAcquisitionRequired
      case Some(value) if value.disposition == EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationFailure =>
        EIT_Image_Availability_Coordinator.Availability_Status.GenerationFailedStatus
      case _ => EIT_Image_Availability_Coordinator.Availability_Status.NoImageAvailable
    }
    api.put_image_delivery(delivery)
    api.put_availability_status(status)
  }

  def finalise(api: Doctor_Publication_Operational_Api): Unit = { }
}
