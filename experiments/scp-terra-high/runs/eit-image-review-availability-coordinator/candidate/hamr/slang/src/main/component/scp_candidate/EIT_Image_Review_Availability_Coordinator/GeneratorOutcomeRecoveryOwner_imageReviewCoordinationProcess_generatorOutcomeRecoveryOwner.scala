// #Sireum

package scp_candidate.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner {

  def initialise(api: GeneratorOutcomeRecoveryOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_generatorProposal(EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord(
      EIT_Image_Review_Availability_Coordinator.GeneratorProposal.NO_GENERATOR_PROPOSAL,
      EIT_Image_Review_Availability_Coordinator.ProposalCondition.NO_PROPOSAL_CONDITION))
  }

  def timeTriggered(api: GeneratorOutcomeRecoveryOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val feedback: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment = api.get_feedbackAssessment().get
    val p: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord = feedback.condition match {
      case EIT_Image_Review_Availability_Coordinator.FeedbackCondition.MATCHED_IMAGE_A =>
        EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord(EIT_Image_Review_Availability_Coordinator.GeneratorProposal.ACCEPT_IMAGE_A, EIT_Image_Review_Availability_Coordinator.ProposalCondition.MATCHED_COMPLETION)
      case EIT_Image_Review_Availability_Coordinator.FeedbackCondition.MATCHED_IMAGE_B =>
        EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord(EIT_Image_Review_Availability_Coordinator.GeneratorProposal.ACCEPT_IMAGE_B, EIT_Image_Review_Availability_Coordinator.ProposalCondition.MATCHED_COMPLETION)
      case EIT_Image_Review_Availability_Coordinator.FeedbackCondition.FEEDBACK_FAULT =>
        EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord(EIT_Image_Review_Availability_Coordinator.GeneratorProposal.BLOCK_GENERATION, EIT_Image_Review_Availability_Coordinator.ProposalCondition.FEEDBACK_REJECTED)
      case _ =>
        (api.get_recoveryRequest().get, api.get_generationPreState().get) match {
          case (EIT_Image_Review_Availability_Coordinator.RecoveryRequest.RESET_GENERATION_WORKFLOW, EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATION_BLOCKED) =>
            EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord(EIT_Image_Review_Availability_Coordinator.GeneratorProposal.CLEAR_GENERATION_BLOCK, EIT_Image_Review_Availability_Coordinator.ProposalCondition.RESET_APPLICABLE)
          case (EIT_Image_Review_Availability_Coordinator.RecoveryRequest.RESET_GENERATION_WORKFLOW, _) =>
            EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord(EIT_Image_Review_Availability_Coordinator.GeneratorProposal.NO_GENERATOR_PROPOSAL, EIT_Image_Review_Availability_Coordinator.ProposalCondition.RESET_INAPPLICABLE)
          case _ =>
            EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord(EIT_Image_Review_Availability_Coordinator.GeneratorProposal.NO_GENERATOR_PROPOSAL, EIT_Image_Review_Availability_Coordinator.ProposalCondition.NO_PROPOSAL_CONDITION)
        }
    }
    api.put_generatorProposal(p)
  }

  def finalise(api: GeneratorOutcomeRecoveryOwner_Operational_Api): Unit = { }
}
