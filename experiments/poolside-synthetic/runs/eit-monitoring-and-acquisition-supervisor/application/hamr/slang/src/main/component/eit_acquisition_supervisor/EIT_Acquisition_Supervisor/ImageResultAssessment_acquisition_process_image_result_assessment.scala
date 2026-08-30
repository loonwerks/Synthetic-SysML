// #Sireum

package eit_acquisition_supervisor.EIT_Acquisition_Supervisor

import org.sireum._
import eit_acquisition_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ImageResultAssessment_acquisition_process_image_result_assessment {

  def initialise(api: ImageResultAssessment_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_image_result_facts(EIT_Acquisition_Supervisor.ImageResultFacts.NO_RESULT)
  }

  def timeTriggered(api: ImageResultAssessment_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val image_feedback: EIT_Acquisition_Supervisor.ImageFeedback.Type =
      api.get_image_feedback() match {
        case Some(v: EIT_Acquisition_Supervisor.ImageFeedback.Type) => v
        case _ => EIT_Acquisition_Supervisor.ImageFeedback.NONE
      }

    val image_result_facts: EIT_Acquisition_Supervisor.ImageResultFacts.Type = image_feedback match {
      case EIT_Acquisition_Supervisor.ImageFeedback.NONE => EIT_Acquisition_Supervisor.ImageResultFacts.NO_RESULT
      case EIT_Acquisition_Supervisor.ImageFeedback.GENERATED => EIT_Acquisition_Supervisor.ImageResultFacts.AVAILABLE
      case EIT_Acquisition_Supervisor.ImageFeedback.FAILED => EIT_Acquisition_Supervisor.ImageResultFacts.FAILED
      case EIT_Acquisition_Supervisor.ImageFeedback.INVALID_RESULT => EIT_Acquisition_Supervisor.ImageResultFacts.INPUT_FAULT
      case EIT_Acquisition_Supervisor.ImageFeedback.INVALID_STATUS => EIT_Acquisition_Supervisor.ImageResultFacts.INPUT_FAULT
    }

    api.put_image_result_facts(image_result_facts)
  }

  def finalise(api: ImageResultAssessment_Operational_Api): Unit = { }
}
