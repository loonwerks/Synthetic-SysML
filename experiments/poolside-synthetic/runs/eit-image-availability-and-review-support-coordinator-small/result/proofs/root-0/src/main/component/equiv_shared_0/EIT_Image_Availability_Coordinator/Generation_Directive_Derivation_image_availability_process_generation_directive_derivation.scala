// #Sireum

package equiv_shared_0.EIT_Image_Availability_Coordinator

import org.sireum._
import equiv_shared_0._

object Generation_Directive_Derivation_image_availability_process_generation_directive_derivation {
  // BEGIN FUNCTIONS
  @strictpure def directive_for(resolution: EIT_Image_Availability_Coordinator.Image_Resolution, acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type): EIT_Image_Availability_Coordinator.Generation_Directive.Type = if (resolution.disposition == Resolution_Disposition.GenerationStarted &
        acquisition == Qualified_Acquisition.AdmittedA) Generation_Directive.GenerateFromA else if (resolution.disposition == Resolution_Disposition.GenerationStarted &
          acquisition == Qualified_Acquisition.AdmittedB) Generation_Directive.GenerateFromB else Generation_Directive.HoldGeneration
  // END FUNCTIONS
}
