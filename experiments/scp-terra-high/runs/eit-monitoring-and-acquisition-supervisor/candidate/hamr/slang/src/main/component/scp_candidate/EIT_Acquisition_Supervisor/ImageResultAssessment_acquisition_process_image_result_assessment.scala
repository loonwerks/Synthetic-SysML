// #Sireum

package scp_candidate.EIT_Acquisition_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ImageResultAssessment_acquisition_process_image_result_assessment {

  def initialise(api: ImageResultAssessment_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_image_result_facts(EIT_Acquisition_Supervisor.ImageResultFacts.NO_RESULT)
  }

  def timeTriggered(api: ImageResultAssessment_Operational_Api): Unit = {
    Contract(Modifies(api))
    val feedback: EIT_Acquisition_Supervisor.ImageFeedback.Type = api.get_image_feedback().get
    var facts: EIT_Acquisition_Supervisor.ImageResultFacts.Type = EIT_Acquisition_Supervisor.ImageResultFacts.INPUT_FAULT
    if (feedback == EIT_Acquisition_Supervisor.ImageFeedback.GENERATED) {
      facts = EIT_Acquisition_Supervisor.ImageResultFacts.AVAILABLE
    } else if (feedback == EIT_Acquisition_Supervisor.ImageFeedback.FAILED) {
      facts = EIT_Acquisition_Supervisor.ImageResultFacts.FAILED
    } else if (feedback == EIT_Acquisition_Supervisor.ImageFeedback.NONE) {
      facts = EIT_Acquisition_Supervisor.ImageResultFacts.NO_RESULT
    }
    api.put_image_result_facts(facts)
  }

  def finalise(api: ImageResultAssessment_Operational_Api): Unit = { }
}
