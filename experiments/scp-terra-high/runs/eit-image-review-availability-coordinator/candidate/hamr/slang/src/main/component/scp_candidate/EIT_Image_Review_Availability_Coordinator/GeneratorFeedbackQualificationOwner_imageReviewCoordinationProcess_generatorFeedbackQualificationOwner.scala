// #Sireum

package scp_candidate.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner {

  def initialise(api: GeneratorFeedbackQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_feedbackAssessment(EIT_Image_Review_Availability_Coordinator.FeedbackAssessment(
      EIT_Image_Review_Availability_Coordinator.FeedbackCondition.NO_RESULT, F))
  }

  def timeTriggered(api: GeneratorFeedbackQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val feedback: EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.Type = api.get_generatorFeedback().get
    val state: EIT_Image_Review_Availability_Coordinator.GenerationState.Type = api.get_generationPreState().get
    val a: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment = feedback match {
      case EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.NO_GENERATOR_FEEDBACK =>
        EIT_Image_Review_Availability_Coordinator.FeedbackAssessment(EIT_Image_Review_Availability_Coordinator.FeedbackCondition.NO_RESULT, F)
      case EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.IMAGE_A_GENERATED
          if state == EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATING_A =>
        EIT_Image_Review_Availability_Coordinator.FeedbackAssessment(EIT_Image_Review_Availability_Coordinator.FeedbackCondition.MATCHED_IMAGE_A, T)
      case EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.IMAGE_B_GENERATED
          if state == EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATING_B =>
        EIT_Image_Review_Availability_Coordinator.FeedbackAssessment(EIT_Image_Review_Availability_Coordinator.FeedbackCondition.MATCHED_IMAGE_B, T)
      case _ =>
        EIT_Image_Review_Availability_Coordinator.FeedbackAssessment(EIT_Image_Review_Availability_Coordinator.FeedbackCondition.FEEDBACK_FAULT, F)
    }
    api.put_feedbackAssessment(a)
  }

  def finalise(api: GeneratorFeedbackQualificationOwner_Operational_Api): Unit = { }
}
