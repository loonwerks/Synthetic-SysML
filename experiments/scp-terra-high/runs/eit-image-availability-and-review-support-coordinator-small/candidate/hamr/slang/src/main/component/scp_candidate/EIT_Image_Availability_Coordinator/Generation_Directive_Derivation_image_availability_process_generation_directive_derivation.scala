// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Generation_Directive_Derivation_image_availability_process_generation_directive_derivation {

  def initialise(api: Generation_Directive_Derivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_generation_directive(EIT_Image_Availability_Coordinator.Generation_Directive.HoldGeneration)
  }

  def timeTriggered(api: Generation_Directive_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val directive: EIT_Image_Availability_Coordinator.Generation_Directive.Type =
      (api.get_image_resolution(), api.get_qualified_acquisition()) match {
      case (Some(resolution), Some(acquisition))
          if resolution.disposition == EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationStarted &&
            acquisition == EIT_Image_Availability_Coordinator.Qualified_Acquisition.AdmittedA =>
        EIT_Image_Availability_Coordinator.Generation_Directive.GenerateFromA
      case (Some(resolution), Some(acquisition))
          if resolution.disposition == EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationStarted &&
            acquisition == EIT_Image_Availability_Coordinator.Qualified_Acquisition.AdmittedB =>
        EIT_Image_Availability_Coordinator.Generation_Directive.GenerateFromB
      case _ => EIT_Image_Availability_Coordinator.Generation_Directive.HoldGeneration
    }
    api.put_generation_directive(directive)
  }

  def finalise(api: Generation_Directive_Derivation_Operational_Api): Unit = { }
}
