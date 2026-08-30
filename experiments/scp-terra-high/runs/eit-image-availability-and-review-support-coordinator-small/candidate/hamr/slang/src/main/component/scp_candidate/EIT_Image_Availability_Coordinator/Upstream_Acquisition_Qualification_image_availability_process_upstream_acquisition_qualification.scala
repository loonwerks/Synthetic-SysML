// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification {

  def initialise(api: Upstream_Acquisition_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_qualified_acquisition(EIT_Image_Availability_Coordinator.Qualified_Acquisition.InvalidAcquisition)
  }

  def timeTriggered(api: Upstream_Acquisition_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val Some(value) = api.get_acquisition_sample()
    val qualified: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type =
      if (value.status == EIT_Image_Availability_Coordinator.Input_Status.Invalid) {
        EIT_Image_Availability_Coordinator.Qualified_Acquisition.InvalidAcquisition
      } else if (value.token == EIT_Image_Availability_Coordinator.Acquisition_Token.NoAcquisition) {
        EIT_Image_Availability_Coordinator.Qualified_Acquisition.NoAdmittedAcquisition
      } else if (value.token == EIT_Image_Availability_Coordinator.Acquisition_Token.AcquisitionA) {
        EIT_Image_Availability_Coordinator.Qualified_Acquisition.AdmittedA
      } else {
        EIT_Image_Availability_Coordinator.Qualified_Acquisition.AdmittedB
      }
    api.put_qualified_acquisition(qualified)
  }

  def finalise(api: Upstream_Acquisition_Qualification_Operational_Api): Unit = { }
}
