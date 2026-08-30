// #Sireum

package equiv_shared_0.EIT_Image_Availability_Coordinator

import org.sireum._
import equiv_shared_0._

object Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification {
  // BEGIN FUNCTIONS
  @strictpure def qualify_acquisition(value: EIT_Image_Availability_Coordinator.Acquisition_Sample): EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type = if (value.status == Input_Status.Invalid) Qualified_Acquisition.InvalidAcquisition else if (value.token == Acquisition_Token.NoAcquisition) Qualified_Acquisition.NoAdmittedAcquisition else if (value.token == Acquisition_Token.AcquisitionA) Qualified_Acquisition.AdmittedA else Qualified_Acquisition.AdmittedB
  // END FUNCTIONS
}
