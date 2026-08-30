// @trace SCOPE-IN-01
package EIT_Image_Review_Availability_Coordinator {
  private import HAMR::*;

  // @trace MON-01
  enum def BatchEvent {
    enum NO_BATCH_EVENT;
    enum INVALID_BATCH_EVENT;
    enum BATCH_A_AVAILABLE;
    enum BATCH_B_AVAILABLE;
  }

  // @trace MON-02
  enum def GeneratorFeedback {
    enum NO_GENERATOR_FEEDBACK;
    enum GENERATION_FAILED;
    enum IMAGE_A_GENERATED;
    enum IMAGE_B_GENERATED;
  }

  // @trace MON-03
  enum def ViewerObservation {
    enum VIEWER_OBSERVATION_INVALID;
    enum VIEWER_UNAVAILABLE;
    enum VIEWER_AVAILABLE;
  }

  // @trace MON-04
  enum def DoctorRequest {
    enum NO_DOCTOR_REQUEST;
    enum OPEN_AVAILABLE_IMAGE;
    enum CLOSE_REVIEW;
  }

  // @trace MON-05
  enum def RecoveryRequest {
    enum NO_RECOVERY_REQUEST;
    enum RESET_GENERATION_WORKFLOW;
  }

  // @trace CTRL-01
  enum def GenerationCommand {
    enum NO_GENERATION_COMMAND;
    enum GENERATE_FROM_BATCH_A;
    enum GENERATE_FROM_BATCH_B;
  }

  // @trace CTRL-02
  enum def ReviewAvailability {
    enum NO_IMAGE_AVAILABLE;
    enum IMAGE_A_AVAILABLE_FOR_REVIEW;
    enum IMAGE_B_AVAILABLE_FOR_REVIEW;
  }

  // @trace TYPE-01
  enum def BatchCategory {
    enum NO_BATCH;
    enum INVALID_BATCH;
    enum USABLE_BATCH_A;
    enum USABLE_BATCH_B;
  }

  // @trace TYPE-02
  part def BatchAssessment :> Data {
    // @trace TYPE-02
    attribute batchCategory : BatchCategory;
    // @trace TYPE-02
    attribute usable : Boolean;
  }

  // @trace TYPE-03
  enum def GenerationState {
    enum GENERATION_EMPTY;
    enum GENERATING_A;
    enum GENERATING_B;
    enum IMAGE_READY_A;
    enum IMAGE_READY_B;
    enum GENERATION_BLOCKED;
  }

  // @trace TYPE-04
  enum def ReviewState {
    enum REVIEW_CLOSED;
    enum REVIEWING_A;
    enum REVIEWING_B;
  }

  // @trace TYPE-05
  enum def FeedbackCondition {
    enum NO_RESULT;
    enum MATCHED_IMAGE_A;
    enum MATCHED_IMAGE_B;
    enum FEEDBACK_FAULT;
  }

  // @trace TYPE-05
  part def FeedbackAssessment :> Data {
    // @trace TYPE-05
    attribute condition : FeedbackCondition;
    // @trace TYPE-05
    attribute matched : Boolean;
  }

  // @trace TYPE-06
  enum def ViewerCondition {
    enum REVIEW_ACCESS_UNAVAILABLE;
    enum REVIEW_ACCESS_AVAILABLE;
  }

  // @trace TYPE-06
  part def ViewerAssessment :> Data {
    // @trace TYPE-06
    attribute condition : ViewerCondition;
    // @trace TYPE-06
    attribute accessible : Boolean;
  }

  // @trace TYPE-07
  enum def GeneratorProposal {
    enum NO_GENERATOR_PROPOSAL;
    enum BLOCK_GENERATION;
    enum ACCEPT_IMAGE_A;
    enum ACCEPT_IMAGE_B;
    enum CLEAR_GENERATION_BLOCK;
  }

  // @trace TYPE-07
  enum def ProposalCondition {
    enum NO_PROPOSAL_CONDITION;
    enum MATCHED_COMPLETION;
    enum FEEDBACK_REJECTED;
    enum RESET_APPLICABLE;
    enum RESET_INAPPLICABLE;
  }

  // @trace TYPE-07
  part def GeneratorProposalRecord :> Data {
    // @trace TYPE-07
    attribute proposal : GeneratorProposal;
    // @trace TYPE-07
    attribute condition : ProposalCondition;
  }

  // @trace TYPE-08
  enum def WorkflowAction {
    enum NO_WORKFLOW_ACTION;
    enum BLOCK_ACTION;
    enum ACCEPT_IMAGE_A_ACTION;
    enum ACCEPT_IMAGE_B_ACTION;
    enum CLEAR_BLOCK_ACTION;
    enum START_BATCH_A_ACTION;
    enum START_BATCH_B_ACTION;
    enum OPEN_IMAGE_A_ACTION;
    enum OPEN_IMAGE_B_ACTION;
    enum CLOSE_REVIEW_ACTION;
  }

  // @trace TYPE-09
  enum def RequestDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum PREEMPTED;
    enum RECOVERY_APPLIED;
  }

  // @trace TYPE-10
  enum def DecisionNotice {
    enum NO_DECISION_NOTICE;
    enum INVALID_BATCH_NOTICE;
    enum GENERATOR_BUSY_NOTICE;
    enum FEEDBACK_FAULT_NOTICE;
    enum RESET_REJECTED_NOTICE;
    enum RESET_CLEARED_NOTICE;
    enum VIEWER_UNAVAILABLE_NOTICE;
    enum NO_IMAGE_READY_NOTICE;
    enum IMAGE_REPLACED_NOTICE;
    enum IMAGE_OPENED_NOTICE;
    enum IMAGE_CLOSED_NOTICE;
    enum REQUEST_PREEMPTED_NOTICE;
  }

  // @trace TYPE-11
  part def WorkflowDecision :> Data {
    // @trace TYPE-11
    attribute selectedAction : WorkflowAction;
    // @trace TYPE-11
    attribute disposition : RequestDisposition;
    // @trace TYPE-11
    attribute notice : DecisionNotice;
  }

  // @trace TYPE-12
  enum def GenerationPreStateSnapshot {
    enum GENERATION_EMPTY;
    enum GENERATING_A;
    enum GENERATING_B;
    enum IMAGE_READY_A;
    enum IMAGE_READY_B;
    enum GENERATION_BLOCKED;
  }

  // @trace TYPE-12
  enum def GenerationDecisionNextState {
    enum GENERATION_EMPTY;
    enum GENERATING_A;
    enum GENERATING_B;
    enum IMAGE_READY_A;
    enum IMAGE_READY_B;
    enum GENERATION_BLOCKED;
  }

  // @trace TYPE-12
  part def GenerationDecisionSnapshot :> Data {
    // @trace TYPE-12
    attribute preState : GenerationPreStateSnapshot;
    // @trace TYPE-12
    attribute nextState : GenerationDecisionNextState;
    // @trace TYPE-12
    attribute selectedAction : WorkflowAction;
    // @trace TYPE-12
    attribute disposition : RequestDisposition;
    // @trace TYPE-12
    attribute notice : DecisionNotice;
  }

  // @trace TYPE-12
  enum def ReviewPreStateSnapshot {
    enum REVIEW_CLOSED;
    enum REVIEWING_A;
    enum REVIEWING_B;
  }

  // @trace TYPE-12
  enum def ReviewDecisionNextState {
    enum REVIEW_CLOSED;
    enum REVIEWING_A;
    enum REVIEWING_B;
  }

  // @trace TYPE-12
  part def ReviewDecisionSnapshot :> Data {
    // @trace TYPE-12
    attribute preState : ReviewPreStateSnapshot;
    // @trace TYPE-12
    attribute nextState : ReviewDecisionNextState;
  }

  // @trace TYPE-13
  enum def PublicNotice {
    enum NONE;
    enum WAITING_FOR_GENERATOR;
    enum IMAGE_READY;
    enum IMAGE_AVAILABLE;
    enum INVALID_BATCH;
    enum GENERATOR_BUSY;
    enum FEEDBACK_FAULT;
    enum RECOVERY_REQUIRED;
    enum RESET_REJECTED;
    enum RESET_CLEARED;
    enum VIEWER_UNAVAILABLE;
    enum NO_IMAGE_READY;
    enum IMAGE_REPLACED;
    enum REQUEST_PREEMPTED;
  }

  // @trace TYPE-13
  enum def WorkflowStatusGenerationState {
    enum GENERATION_EMPTY;
    enum GENERATING_A;
    enum GENERATING_B;
    enum IMAGE_READY_A;
    enum IMAGE_READY_B;
    enum GENERATION_BLOCKED;
  }

  // @trace TYPE-13
  enum def WorkflowStatusReviewState {
    enum REVIEW_CLOSED;
    enum REVIEWING_A;
    enum REVIEWING_B;
  }

  // @trace TYPE-13
  enum def WorkflowStatusDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum PREEMPTED;
    enum RECOVERY_APPLIED;
  }

  // @trace CTRL-03
  part def WorkflowStatus :> Data {
    // @trace TYPE-13
    attribute generationState : WorkflowStatusGenerationState;
    // @trace TYPE-13
    attribute reviewState : WorkflowStatusReviewState;
    // @trace TYPE-13
    attribute disposition : WorkflowStatusDisposition;
    // @trace TYPE-13
    attribute notice : PublicNotice;
  }

  // @trace PART-01
  part def BatchQualificationOwner :> Thread {
    // @trace INT-01
    port batchEvent : DataPort { in :>> type : BatchEvent; }
    // @trace INT-10
    port batchAssessment : DataPort { out :>> type : BatchAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_BATCH_ASSESSMENT "Batch qualification initializes to the safe no-event assessment":
            batchAssessment.batchCategory == BatchCategory.NO_BATCH &
            batchAssessment.usable == F;
      compute
        compute_cases
          // @trace CASE-01
          case CASE_01_NO_OR_INVALID_BATCH "No event and invalid event are both unusable while retaining their reason":
            assume batchEvent == BatchEvent.NO_BATCH_EVENT |
              batchEvent == BatchEvent.INVALID_BATCH_EVENT;
            guarantee
              ((batchEvent == BatchEvent.NO_BATCH_EVENT) implies
                (batchAssessment.batchCategory == BatchCategory.NO_BATCH & batchAssessment.usable == F)) &
              ((batchEvent == BatchEvent.INVALID_BATCH_EVENT) implies
                (batchAssessment.batchCategory == BatchCategory.INVALID_BATCH & batchAssessment.usable == F));
          // @trace CASE-02
          case CASE_02_BATCH_A_USABLE "The opaque A event is usable and keeps correlation A":
            assume batchEvent == BatchEvent.BATCH_A_AVAILABLE;
            guarantee batchAssessment.batchCategory == BatchCategory.USABLE_BATCH_A &
              batchAssessment.usable == T;
          // @trace CASE-03
          case CASE_03_BATCH_B_USABLE "The opaque B event is usable and keeps correlation B":
            assume batchEvent == BatchEvent.BATCH_B_AVAILABLE;
            guarantee batchAssessment.batchCategory == BatchCategory.USABLE_BATCH_B &
              batchAssessment.usable == T;
    }*/
  }

  // @trace PART-02
  part def GeneratorFeedbackQualificationOwner :> Thread {
    // @trace INT-02
    port generatorFeedback : DataPort { in :>> type : GeneratorFeedback; }
    // @trace INT-06
    port generationPreState : DataPort { in :>> type : GenerationState; }
    // @trace INT-11
    port feedbackAssessment : DataPort { out :>> type : FeedbackAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_FEEDBACK_ASSESSMENT "Feedback qualification initializes with no accepted result":
            feedbackAssessment.condition == FeedbackCondition.NO_RESULT &
            feedbackAssessment.matched == F;
      compute
        compute_cases
          // @trace CASE-04
          case CASE_04_NO_GENERATOR_RESULT "Absent feedback is not a completion or fault":
            assume generatorFeedback == GeneratorFeedback.NO_GENERATOR_FEEDBACK;
            guarantee feedbackAssessment.condition == FeedbackCondition.NO_RESULT &
              feedbackAssessment.matched == F;
          // @trace CASE-05
          case CASE_05_EXACT_MATCHED_RESULT "Only the current generating slot's matching token is accepted":
            assume
              (generatorFeedback == GeneratorFeedback.IMAGE_A_GENERATED &
               generationPreState == GenerationState.GENERATING_A) |
              (generatorFeedback == GeneratorFeedback.IMAGE_B_GENERATED &
               generationPreState == GenerationState.GENERATING_B);
            guarantee
              ((generatorFeedback == GeneratorFeedback.IMAGE_A_GENERATED) implies
                (feedbackAssessment.condition == FeedbackCondition.MATCHED_IMAGE_A & feedbackAssessment.matched == T)) &
              ((generatorFeedback == GeneratorFeedback.IMAGE_B_GENERATED) implies
                (feedbackAssessment.condition == FeedbackCondition.MATCHED_IMAGE_B & feedbackAssessment.matched == T));
          // @trace CASE-06
          case CASE_06_FAILED_MISMATCHED_OR_UNEXPECTED "Every other nonempty feedback is a fault":
            assume generatorFeedback != GeneratorFeedback.NO_GENERATOR_FEEDBACK &
              not (generatorFeedback == GeneratorFeedback.IMAGE_A_GENERATED &
                   generationPreState == GenerationState.GENERATING_A) &
              not (generatorFeedback == GeneratorFeedback.IMAGE_B_GENERATED &
                   generationPreState == GenerationState.GENERATING_B);
            guarantee feedbackAssessment.condition == FeedbackCondition.FEEDBACK_FAULT &
              feedbackAssessment.matched == F;
    }*/
  }

  // @trace PART-03
  part def ReviewAccessQualificationOwner :> Thread {
    // @trace INT-03
    port viewerObservation : DataPort { in :>> type : ViewerObservation; }
    // @trace INT-12
    port viewerAssessment : DataPort { out :>> type : ViewerAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_VIEWER_ASSESSMENT "Viewer qualification initializes unavailable":
            viewerAssessment.condition == ViewerCondition.REVIEW_ACCESS_UNAVAILABLE &
            viewerAssessment.accessible == F;
      compute
        compute_cases
          // @trace CASE-07
          case CASE_07_VIEWER_AVAILABLE "A currently available access surface is accessible":
            assume viewerObservation == ViewerObservation.VIEWER_AVAILABLE;
            guarantee viewerAssessment.condition == ViewerCondition.REVIEW_ACCESS_AVAILABLE &
              viewerAssessment.accessible == T;
          // @trace CASE-08
          case CASE_08_VIEWER_NOT_ACCESSIBLE "Invalid and unavailable observations collapse to inaccessible":
            assume viewerObservation == ViewerObservation.VIEWER_OBSERVATION_INVALID |
              viewerObservation == ViewerObservation.VIEWER_UNAVAILABLE;
            guarantee viewerAssessment.condition == ViewerCondition.REVIEW_ACCESS_UNAVAILABLE &
              viewerAssessment.accessible == F;
    }*/
  }

  // @trace PART-04
  part def GeneratorOutcomeRecoveryOwner :> Thread {
    // @trace INT-05
    port recoveryRequest : DataPort { in :>> type : RecoveryRequest; }
    // @trace INT-07
    port generationPreState : DataPort { in :>> type : GenerationState; }
    // @trace INT-11
    port feedbackAssessment : DataPort { in :>> type : FeedbackAssessment; }
    // @trace INT-13
    port generatorProposal : DataPort { out :>> type : GeneratorProposalRecord; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_GENERATOR_PROPOSAL "Generator outcome and recovery initialize with no proposal":
            generatorProposal.proposal == GeneratorProposal.NO_GENERATOR_PROPOSAL &
            generatorProposal.condition == ProposalCondition.NO_PROPOSAL_CONDITION;
      compute
        compute_cases
          // @trace CASE-09
          case CASE_09_CURRENT_FEEDBACK_PROPOSAL "A current matched result proposes acceptance and a current fault proposes blocking before reset":
            assume feedbackAssessment.condition != FeedbackCondition.NO_RESULT;
            guarantee
              ((feedbackAssessment.condition == FeedbackCondition.MATCHED_IMAGE_A) implies
                (generatorProposal.proposal == GeneratorProposal.ACCEPT_IMAGE_A &
                 generatorProposal.condition == ProposalCondition.MATCHED_COMPLETION)) &
              ((feedbackAssessment.condition == FeedbackCondition.MATCHED_IMAGE_B) implies
                (generatorProposal.proposal == GeneratorProposal.ACCEPT_IMAGE_B &
                 generatorProposal.condition == ProposalCondition.MATCHED_COMPLETION)) &
              ((feedbackAssessment.condition == FeedbackCondition.FEEDBACK_FAULT) implies
                (generatorProposal.proposal == GeneratorProposal.BLOCK_GENERATION &
                 generatorProposal.condition == ProposalCondition.FEEDBACK_REJECTED));
          // @trace CASE-10
          case CASE_10_NO_RESULT_RESET_POLICY "Without feedback, reset clears only a blocked slot and is otherwise explicitly inapplicable":
            assume feedbackAssessment.condition == FeedbackCondition.NO_RESULT;
            guarantee
              ((recoveryRequest == RecoveryRequest.RESET_GENERATION_WORKFLOW &
                generationPreState == GenerationState.GENERATION_BLOCKED) implies
                (generatorProposal.proposal == GeneratorProposal.CLEAR_GENERATION_BLOCK &
                 generatorProposal.condition == ProposalCondition.RESET_APPLICABLE)) &
              ((recoveryRequest == RecoveryRequest.RESET_GENERATION_WORKFLOW &
                generationPreState != GenerationState.GENERATION_BLOCKED) implies
                (generatorProposal.proposal == GeneratorProposal.NO_GENERATOR_PROPOSAL &
                 generatorProposal.condition == ProposalCondition.RESET_INAPPLICABLE)) &
              ((recoveryRequest == RecoveryRequest.NO_RECOVERY_REQUEST) implies
                (generatorProposal.proposal == GeneratorProposal.NO_GENERATOR_PROPOSAL &
                 generatorProposal.condition == ProposalCondition.NO_PROPOSAL_CONDITION));
    }*/
  }

  // @trace PART-05
  part def AvailabilityWorkflowArbiter :> Thread {
    // @trace INT-04
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    // @trace INT-08
    port generationPreState : DataPort { in :>> type : GenerationState; }
    // @trace INT-09
    port reviewPreState : DataPort { in :>> type : ReviewState; }
    // @trace INT-10
    port batchAssessment : DataPort { in :>> type : BatchAssessment; }
    // @trace INT-12
    port viewerAssessment : DataPort { in :>> type : ViewerAssessment; }
    // @trace INT-13
    port generatorProposal : DataPort { in :>> type : GeneratorProposalRecord; }
    // @trace INT-14
    port workflowDecision : DataPort { out :>> type : WorkflowDecision; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_WORKFLOW_DECISION "Workflow arbitration initializes with no action, disposition, or notice":
            workflowDecision.selectedAction == WorkflowAction.NO_WORKFLOW_ACTION &
            workflowDecision.disposition == RequestDisposition.NO_REQUEST_DISPOSITION &
            workflowDecision.notice == DecisionNotice.NO_DECISION_NOTICE;
      compute
        compute_cases
          // @trace CASE-11
          case CASE_11_GENERATOR_AND_RECOVERY_PRIORITY "Generator outcomes, applicable clear, and reset rejection precede Doctor and batch work":
            assume generatorProposal.proposal != GeneratorProposal.NO_GENERATOR_PROPOSAL |
              generatorProposal.condition == ProposalCondition.RESET_INAPPLICABLE;
            guarantee
              ((generatorProposal.proposal == GeneratorProposal.BLOCK_GENERATION) implies
                (workflowDecision.selectedAction == WorkflowAction.BLOCK_ACTION &
                 workflowDecision.notice == DecisionNotice.FEEDBACK_FAULT_NOTICE &
                 (((doctorRequest != DoctorRequest.NO_DOCTOR_REQUEST | batchAssessment.usable == T)) implies
                    (workflowDecision.disposition == RequestDisposition.PREEMPTED)) &
                 ((doctorRequest == DoctorRequest.NO_DOCTOR_REQUEST & batchAssessment.usable == F) implies
                    (workflowDecision.disposition == RequestDisposition.RECOVERY_APPLIED)))) &
              ((generatorProposal.proposal == GeneratorProposal.ACCEPT_IMAGE_A) implies
                (workflowDecision.selectedAction == WorkflowAction.ACCEPT_IMAGE_A_ACTION &
                 (((doctorRequest != DoctorRequest.NO_DOCTOR_REQUEST | batchAssessment.usable == T)) implies
                    (workflowDecision.disposition == RequestDisposition.PREEMPTED &
                     workflowDecision.notice == DecisionNotice.REQUEST_PREEMPTED_NOTICE)) &
                 ((doctorRequest == DoctorRequest.NO_DOCTOR_REQUEST & batchAssessment.usable == F) implies
                    (workflowDecision.disposition == RequestDisposition.ACCEPTED &
                     workflowDecision.notice == DecisionNotice.NO_DECISION_NOTICE)))) &
              ((generatorProposal.proposal == GeneratorProposal.ACCEPT_IMAGE_B) implies
                (workflowDecision.selectedAction == WorkflowAction.ACCEPT_IMAGE_B_ACTION &
                 (((doctorRequest != DoctorRequest.NO_DOCTOR_REQUEST | batchAssessment.usable == T)) implies
                    (workflowDecision.disposition == RequestDisposition.PREEMPTED &
                     workflowDecision.notice == DecisionNotice.REQUEST_PREEMPTED_NOTICE)) &
                 ((doctorRequest == DoctorRequest.NO_DOCTOR_REQUEST & batchAssessment.usable == F) implies
                    (workflowDecision.disposition == RequestDisposition.ACCEPTED &
                     workflowDecision.notice == DecisionNotice.NO_DECISION_NOTICE)))) &
              ((generatorProposal.proposal == GeneratorProposal.CLEAR_GENERATION_BLOCK) implies
                (workflowDecision.selectedAction == WorkflowAction.CLEAR_BLOCK_ACTION &
                 workflowDecision.notice == DecisionNotice.RESET_CLEARED_NOTICE &
                 (((doctorRequest != DoctorRequest.NO_DOCTOR_REQUEST | batchAssessment.usable == T)) implies
                    (workflowDecision.disposition == RequestDisposition.PREEMPTED)) &
                 ((doctorRequest == DoctorRequest.NO_DOCTOR_REQUEST & batchAssessment.usable == F) implies
                    (workflowDecision.disposition == RequestDisposition.RECOVERY_APPLIED)))) &
              ((generatorProposal.proposal == GeneratorProposal.NO_GENERATOR_PROPOSAL &
                generatorProposal.condition == ProposalCondition.RESET_INAPPLICABLE) implies
                (workflowDecision.selectedAction == WorkflowAction.NO_WORKFLOW_ACTION &
                 workflowDecision.disposition == RequestDisposition.REJECTED &
                 workflowDecision.notice == DecisionNotice.RESET_REJECTED_NOTICE));
          // @trace CASE-12
          case CASE_12_DOCTOR_CLOSE_PRIORITY "A fresh close consumes an active review before any batch, otherwise it is rejected":
            assume generatorProposal.proposal == GeneratorProposal.NO_GENERATOR_PROPOSAL &
              generatorProposal.condition != ProposalCondition.RESET_INAPPLICABLE &
              doctorRequest == DoctorRequest.CLOSE_REVIEW;
            guarantee
              (((reviewPreState == ReviewState.REVIEWING_A | reviewPreState == ReviewState.REVIEWING_B) &
                batchAssessment.usable == T) implies
                (workflowDecision.selectedAction == WorkflowAction.CLOSE_REVIEW_ACTION &
                 workflowDecision.disposition == RequestDisposition.PREEMPTED &
                 workflowDecision.notice == DecisionNotice.REQUEST_PREEMPTED_NOTICE)) &
              (((reviewPreState == ReviewState.REVIEWING_A | reviewPreState == ReviewState.REVIEWING_B) &
                batchAssessment.usable == F) implies
                (workflowDecision.selectedAction == WorkflowAction.CLOSE_REVIEW_ACTION &
                 workflowDecision.disposition == RequestDisposition.ACCEPTED &
                 workflowDecision.notice == DecisionNotice.IMAGE_CLOSED_NOTICE)) &
              ((reviewPreState == ReviewState.REVIEW_CLOSED) implies
                (workflowDecision.selectedAction == WorkflowAction.NO_WORKFLOW_ACTION &
                 workflowDecision.disposition == RequestDisposition.REJECTED &
                 workflowDecision.notice == DecisionNotice.NO_IMAGE_READY_NOTICE));
          // @trace CASE-13
          case CASE_13_DOCTOR_OPEN_PRIORITY "An applicable open selects the matching ready token and defeats a simultaneous newer batch":
            assume generatorProposal.proposal == GeneratorProposal.NO_GENERATOR_PROPOSAL &
              generatorProposal.condition != ProposalCondition.RESET_INAPPLICABLE &
              doctorRequest == DoctorRequest.OPEN_AVAILABLE_IMAGE;
            guarantee
              ((generationPreState == GenerationState.IMAGE_READY_A &
                reviewPreState == ReviewState.REVIEW_CLOSED & viewerAssessment.accessible == T &
                batchAssessment.usable == T) implies
                (workflowDecision.selectedAction == WorkflowAction.OPEN_IMAGE_A_ACTION &
                 workflowDecision.disposition == RequestDisposition.PREEMPTED &
                 workflowDecision.notice == DecisionNotice.REQUEST_PREEMPTED_NOTICE)) &
              ((generationPreState == GenerationState.IMAGE_READY_B &
                reviewPreState == ReviewState.REVIEW_CLOSED & viewerAssessment.accessible == T &
                batchAssessment.usable == T) implies
                (workflowDecision.selectedAction == WorkflowAction.OPEN_IMAGE_B_ACTION &
                 workflowDecision.disposition == RequestDisposition.PREEMPTED &
                 workflowDecision.notice == DecisionNotice.REQUEST_PREEMPTED_NOTICE)) &
              ((generationPreState == GenerationState.IMAGE_READY_A &
                reviewPreState == ReviewState.REVIEW_CLOSED & viewerAssessment.accessible == T &
                batchAssessment.usable == F) implies
                (workflowDecision.selectedAction == WorkflowAction.OPEN_IMAGE_A_ACTION &
                 workflowDecision.disposition == RequestDisposition.ACCEPTED &
                 workflowDecision.notice == DecisionNotice.IMAGE_OPENED_NOTICE)) &
              ((generationPreState == GenerationState.IMAGE_READY_B &
                reviewPreState == ReviewState.REVIEW_CLOSED & viewerAssessment.accessible == T &
                batchAssessment.usable == F) implies
                (workflowDecision.selectedAction == WorkflowAction.OPEN_IMAGE_B_ACTION &
                 workflowDecision.disposition == RequestDisposition.ACCEPTED &
                 workflowDecision.notice == DecisionNotice.IMAGE_OPENED_NOTICE)) &
              ((viewerAssessment.accessible == F) implies
                (workflowDecision.selectedAction == WorkflowAction.NO_WORKFLOW_ACTION &
                 workflowDecision.disposition == RequestDisposition.REJECTED &
                 workflowDecision.notice == DecisionNotice.VIEWER_UNAVAILABLE_NOTICE)) &
              ((viewerAssessment.accessible == T &
                not (generationPreState == GenerationState.IMAGE_READY_A & reviewPreState == ReviewState.REVIEW_CLOSED) &
                not (generationPreState == GenerationState.IMAGE_READY_B & reviewPreState == ReviewState.REVIEW_CLOSED)) implies
                (workflowDecision.selectedAction == WorkflowAction.NO_WORKFLOW_ACTION &
                 workflowDecision.disposition == RequestDisposition.REJECTED &
                 workflowDecision.notice == DecisionNotice.NO_IMAGE_READY_NOTICE));
          // @trace CASE-14
          case CASE_14_BATCH_OR_IDLE_POLICY "Without higher work, a usable fresh batch starts or replaces only a closed available slot":
            assume generatorProposal.proposal == GeneratorProposal.NO_GENERATOR_PROPOSAL &
              generatorProposal.condition != ProposalCondition.RESET_INAPPLICABLE &
              doctorRequest == DoctorRequest.NO_DOCTOR_REQUEST;
            guarantee
              ((batchAssessment.batchCategory == BatchCategory.NO_BATCH) implies
                (workflowDecision.selectedAction == WorkflowAction.NO_WORKFLOW_ACTION &
                 workflowDecision.disposition == RequestDisposition.NO_REQUEST_DISPOSITION &
                 workflowDecision.notice == DecisionNotice.NO_DECISION_NOTICE)) &
              ((batchAssessment.batchCategory == BatchCategory.INVALID_BATCH) implies
                (workflowDecision.selectedAction == WorkflowAction.NO_WORKFLOW_ACTION &
                 workflowDecision.disposition == RequestDisposition.REJECTED &
                 workflowDecision.notice == DecisionNotice.INVALID_BATCH_NOTICE)) &
              ((batchAssessment.usable == T & reviewPreState == ReviewState.REVIEW_CLOSED &
                generationPreState == GenerationState.GENERATION_EMPTY &
                batchAssessment.batchCategory == BatchCategory.USABLE_BATCH_A) implies
                (workflowDecision.selectedAction == WorkflowAction.START_BATCH_A_ACTION &
                 workflowDecision.disposition == RequestDisposition.ACCEPTED &
                 workflowDecision.notice == DecisionNotice.NO_DECISION_NOTICE)) &
              ((batchAssessment.usable == T & reviewPreState == ReviewState.REVIEW_CLOSED &
                generationPreState == GenerationState.GENERATION_EMPTY &
                batchAssessment.batchCategory == BatchCategory.USABLE_BATCH_B) implies
                (workflowDecision.selectedAction == WorkflowAction.START_BATCH_B_ACTION &
                 workflowDecision.disposition == RequestDisposition.ACCEPTED &
                 workflowDecision.notice == DecisionNotice.NO_DECISION_NOTICE)) &
              ((batchAssessment.usable == T & reviewPreState == ReviewState.REVIEW_CLOSED &
                (generationPreState == GenerationState.IMAGE_READY_A | generationPreState == GenerationState.IMAGE_READY_B) &
                batchAssessment.batchCategory == BatchCategory.USABLE_BATCH_A) implies
                (workflowDecision.selectedAction == WorkflowAction.START_BATCH_A_ACTION &
                 workflowDecision.disposition == RequestDisposition.ACCEPTED &
                 workflowDecision.notice == DecisionNotice.IMAGE_REPLACED_NOTICE)) &
              ((batchAssessment.usable == T & reviewPreState == ReviewState.REVIEW_CLOSED &
                (generationPreState == GenerationState.IMAGE_READY_A | generationPreState == GenerationState.IMAGE_READY_B) &
                batchAssessment.batchCategory == BatchCategory.USABLE_BATCH_B) implies
                (workflowDecision.selectedAction == WorkflowAction.START_BATCH_B_ACTION &
                 workflowDecision.disposition == RequestDisposition.ACCEPTED &
                 workflowDecision.notice == DecisionNotice.IMAGE_REPLACED_NOTICE)) &
              ((batchAssessment.usable == T &
                not (reviewPreState == ReviewState.REVIEW_CLOSED &
                     (generationPreState == GenerationState.GENERATION_EMPTY |
                      generationPreState == GenerationState.IMAGE_READY_A |
                      generationPreState == GenerationState.IMAGE_READY_B))) implies
                (workflowDecision.selectedAction == WorkflowAction.NO_WORKFLOW_ACTION &
                 workflowDecision.disposition == RequestDisposition.REJECTED &
                 workflowDecision.notice == DecisionNotice.GENERATOR_BUSY_NOTICE));
    }*/
  }

  // @trace PART-06
  part def GenerationSlotStateGovernor :> Thread {
    // @trace INT-14
    port workflowDecision : DataPort { in :>> type : WorkflowDecision; }
    // @trace INT-06
    port generationPreState : DataPort { out :>> type : GenerationState; }
    // @trace INT-16
    port generationDecision : DataPort { out :>> type : GenerationDecisionSnapshot; }

    language "GUMBO" /*{
      state
        // @trace OWNER-06
        committedGenerationState : GenerationState;
      initialize
        guarantee
          // @trace INIT-01
          INIT_GENERATION_SLOT "The sole generation slot and its published views initialize empty":
            committedGenerationState == GenerationState.GENERATION_EMPTY &
            generationPreState == GenerationState.GENERATION_EMPTY &
            generationDecision.preState == GenerationPreStateSnapshot.GENERATION_EMPTY &
            generationDecision.nextState == GenerationDecisionNextState.GENERATION_EMPTY &
            generationDecision.selectedAction == WorkflowAction.NO_WORKFLOW_ACTION &
            generationDecision.disposition == RequestDisposition.NO_REQUEST_DISPOSITION &
            generationDecision.notice == DecisionNotice.NO_DECISION_NOTICE;
      compute
        guarantee
          // @trace INT-06
          PUBLISH_GENERATION_PRE_STATE "Only the generation governor publishes its committed pre-evaluation state":
            generationPreState == In(committedGenerationState);
        guarantee
          // @trace TYPE-12
          PROJECT_GENERATION_SNAPSHOT "The snapshot carries the sole owner's pre-state, post-state, and selected decision":
            ((In(committedGenerationState) == GenerationState.GENERATION_EMPTY) implies
              (generationDecision.preState == GenerationPreStateSnapshot.GENERATION_EMPTY)) &
            ((In(committedGenerationState) == GenerationState.GENERATING_A) implies
              (generationDecision.preState == GenerationPreStateSnapshot.GENERATING_A)) &
            ((In(committedGenerationState) == GenerationState.GENERATING_B) implies
              (generationDecision.preState == GenerationPreStateSnapshot.GENERATING_B)) &
            ((In(committedGenerationState) == GenerationState.IMAGE_READY_A) implies
              (generationDecision.preState == GenerationPreStateSnapshot.IMAGE_READY_A)) &
            ((In(committedGenerationState) == GenerationState.IMAGE_READY_B) implies
              (generationDecision.preState == GenerationPreStateSnapshot.IMAGE_READY_B)) &
            ((In(committedGenerationState) == GenerationState.GENERATION_BLOCKED) implies
              (generationDecision.preState == GenerationPreStateSnapshot.GENERATION_BLOCKED)) &
            ((committedGenerationState == GenerationState.GENERATION_EMPTY) implies
              (generationDecision.nextState == GenerationDecisionNextState.GENERATION_EMPTY)) &
            ((committedGenerationState == GenerationState.GENERATING_A) implies
              (generationDecision.nextState == GenerationDecisionNextState.GENERATING_A)) &
            ((committedGenerationState == GenerationState.GENERATING_B) implies
              (generationDecision.nextState == GenerationDecisionNextState.GENERATING_B)) &
            ((committedGenerationState == GenerationState.IMAGE_READY_A) implies
              (generationDecision.nextState == GenerationDecisionNextState.IMAGE_READY_A)) &
            ((committedGenerationState == GenerationState.IMAGE_READY_B) implies
              (generationDecision.nextState == GenerationDecisionNextState.IMAGE_READY_B)) &
            ((committedGenerationState == GenerationState.GENERATION_BLOCKED) implies
              (generationDecision.nextState == GenerationDecisionNextState.GENERATION_BLOCKED)) &
            generationDecision.selectedAction == workflowDecision.selectedAction &
            generationDecision.disposition == workflowDecision.disposition &
            generationDecision.notice == workflowDecision.notice;
        compute_cases
          // @trace CASE-15
          case CASE_15_GENERATION_MUTATION "Start, completion, blocking, clear, and close actions select the exact next generation state":
            assume workflowDecision.selectedAction == WorkflowAction.START_BATCH_A_ACTION |
              workflowDecision.selectedAction == WorkflowAction.START_BATCH_B_ACTION |
              workflowDecision.selectedAction == WorkflowAction.ACCEPT_IMAGE_A_ACTION |
              workflowDecision.selectedAction == WorkflowAction.ACCEPT_IMAGE_B_ACTION |
              workflowDecision.selectedAction == WorkflowAction.BLOCK_ACTION |
              workflowDecision.selectedAction == WorkflowAction.CLEAR_BLOCK_ACTION |
              workflowDecision.selectedAction == WorkflowAction.CLOSE_REVIEW_ACTION;
            guarantee
              ((workflowDecision.selectedAction == WorkflowAction.START_BATCH_A_ACTION) implies
                (committedGenerationState == GenerationState.GENERATING_A)) &
              ((workflowDecision.selectedAction == WorkflowAction.START_BATCH_B_ACTION) implies
                (committedGenerationState == GenerationState.GENERATING_B)) &
              ((workflowDecision.selectedAction == WorkflowAction.ACCEPT_IMAGE_A_ACTION) implies
                (committedGenerationState == GenerationState.IMAGE_READY_A)) &
              ((workflowDecision.selectedAction == WorkflowAction.ACCEPT_IMAGE_B_ACTION) implies
                (committedGenerationState == GenerationState.IMAGE_READY_B)) &
              ((workflowDecision.selectedAction == WorkflowAction.BLOCK_ACTION) implies
                (committedGenerationState == GenerationState.GENERATION_BLOCKED)) &
              ((workflowDecision.selectedAction == WorkflowAction.CLEAR_BLOCK_ACTION) implies
                (committedGenerationState == GenerationState.GENERATION_EMPTY)) &
              ((workflowDecision.selectedAction == WorkflowAction.CLOSE_REVIEW_ACTION) implies
                (committedGenerationState == GenerationState.GENERATION_EMPTY));
          // @trace CASE-16
          case CASE_16_GENERATION_RETENTION "Open and no-action decisions retain the generation slot":
            assume workflowDecision.selectedAction == WorkflowAction.NO_WORKFLOW_ACTION |
              workflowDecision.selectedAction == WorkflowAction.OPEN_IMAGE_A_ACTION |
              workflowDecision.selectedAction == WorkflowAction.OPEN_IMAGE_B_ACTION;
            guarantee committedGenerationState == In(committedGenerationState);
    }*/
  }

  // @trace PART-07
  part def ReviewSessionStateGovernor :> Thread {
    // @trace INT-15
    port workflowDecision : DataPort { in :>> type : WorkflowDecision; }
    // @trace INT-09
    port reviewPreState : DataPort { out :>> type : ReviewState; }
    // @trace INT-18
    port reviewDecision : DataPort { out :>> type : ReviewDecisionSnapshot; }

    language "GUMBO" /*{
      state
        // @trace OWNER-06
        committedReviewState : ReviewState;
      initialize
        guarantee
          // @trace INIT-01
          INIT_REVIEW_SESSION "The sole review session and its published views initialize closed":
            committedReviewState == ReviewState.REVIEW_CLOSED &
            reviewPreState == ReviewState.REVIEW_CLOSED &
            reviewDecision.preState == ReviewPreStateSnapshot.REVIEW_CLOSED &
            reviewDecision.nextState == ReviewDecisionNextState.REVIEW_CLOSED;
      compute
        guarantee
          // @trace INT-09
          PUBLISH_REVIEW_PRE_STATE "Only the review governor publishes its committed pre-evaluation state":
            reviewPreState == In(committedReviewState);
        guarantee
          // @trace TYPE-12
          PROJECT_REVIEW_SNAPSHOT "The review snapshot carries the sole owner's pre-state and post-state":
            ((In(committedReviewState) == ReviewState.REVIEW_CLOSED) implies
              (reviewDecision.preState == ReviewPreStateSnapshot.REVIEW_CLOSED)) &
            ((In(committedReviewState) == ReviewState.REVIEWING_A) implies
              (reviewDecision.preState == ReviewPreStateSnapshot.REVIEWING_A)) &
            ((In(committedReviewState) == ReviewState.REVIEWING_B) implies
              (reviewDecision.preState == ReviewPreStateSnapshot.REVIEWING_B)) &
            ((committedReviewState == ReviewState.REVIEW_CLOSED) implies
              (reviewDecision.nextState == ReviewDecisionNextState.REVIEW_CLOSED)) &
            ((committedReviewState == ReviewState.REVIEWING_A) implies
              (reviewDecision.nextState == ReviewDecisionNextState.REVIEWING_A)) &
            ((committedReviewState == ReviewState.REVIEWING_B) implies
              (reviewDecision.nextState == ReviewDecisionNextState.REVIEWING_B));
        compute_cases
          // @trace CASE-17
          case CASE_17_REVIEW_MUTATION "Matching open actions start review and work-changing actions close review":
            assume workflowDecision.selectedAction == WorkflowAction.OPEN_IMAGE_A_ACTION |
              workflowDecision.selectedAction == WorkflowAction.OPEN_IMAGE_B_ACTION |
              workflowDecision.selectedAction == WorkflowAction.CLOSE_REVIEW_ACTION |
              workflowDecision.selectedAction == WorkflowAction.BLOCK_ACTION |
              workflowDecision.selectedAction == WorkflowAction.CLEAR_BLOCK_ACTION |
              workflowDecision.selectedAction == WorkflowAction.START_BATCH_A_ACTION |
              workflowDecision.selectedAction == WorkflowAction.START_BATCH_B_ACTION;
            guarantee
              ((workflowDecision.selectedAction == WorkflowAction.OPEN_IMAGE_A_ACTION) implies
                (committedReviewState == ReviewState.REVIEWING_A)) &
              ((workflowDecision.selectedAction == WorkflowAction.OPEN_IMAGE_B_ACTION) implies
                (committedReviewState == ReviewState.REVIEWING_B)) &
              ((workflowDecision.selectedAction == WorkflowAction.CLOSE_REVIEW_ACTION |
                workflowDecision.selectedAction == WorkflowAction.BLOCK_ACTION |
                workflowDecision.selectedAction == WorkflowAction.CLEAR_BLOCK_ACTION |
                workflowDecision.selectedAction == WorkflowAction.START_BATCH_A_ACTION |
                workflowDecision.selectedAction == WorkflowAction.START_BATCH_B_ACTION) implies
                (committedReviewState == ReviewState.REVIEW_CLOSED));
          // @trace CASE-18
          case CASE_18_REVIEW_RETENTION "Completion and no-action decisions retain the review session":
            assume workflowDecision.selectedAction == WorkflowAction.NO_WORKFLOW_ACTION |
              workflowDecision.selectedAction == WorkflowAction.ACCEPT_IMAGE_A_ACTION |
              workflowDecision.selectedAction == WorkflowAction.ACCEPT_IMAGE_B_ACTION;
            guarantee committedReviewState == In(committedReviewState);
    }*/
  }

  // @trace PART-08
  part def GenerationCommandPolicy :> Thread {
    // @trace INT-16
    port generationDecision : DataPort { in :>> type : GenerationDecisionSnapshot; }
    // @trace INT-19
    port generationCommand : DataPort { out :>> type : GenerationCommand; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_GENERATION_COMMAND "The logical generator command initializes suppressed":
            generationCommand == GenerationCommand.NO_GENERATION_COMMAND;
      compute
        compute_cases
          // @trace CASE-19
          case CASE_19_COMMITTED_STATE_COMMAND "Only a committed generating state requests its correlated batch":
            guarantee
              ((generationDecision.nextState == GenerationDecisionNextState.GENERATING_A) implies
                (generationCommand == GenerationCommand.GENERATE_FROM_BATCH_A)) &
              ((generationDecision.nextState == GenerationDecisionNextState.GENERATING_B) implies
                (generationCommand == GenerationCommand.GENERATE_FROM_BATCH_B)) &
              ((generationDecision.nextState != GenerationDecisionNextState.GENERATING_A &
                generationDecision.nextState != GenerationDecisionNextState.GENERATING_B) implies
                (generationCommand == GenerationCommand.NO_GENERATION_COMMAND));
    }*/
  }

  // @trace PART-09
  part def AvailabilityPublicationPolicy :> Thread {
    // @trace INT-17
    port generationDecision : DataPort { in :>> type : GenerationDecisionSnapshot; }
    // @trace INT-18
    port reviewDecision : DataPort { in :>> type : ReviewDecisionSnapshot; }
    // @trace INT-20
    port reviewAvailability : DataPort { out :>> type : ReviewAvailability; }
    // @trace INT-21
    port workflowStatus : DataPort { out :>> type : WorkflowStatus; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_PUBLICATION "Review exposure and status initialize to empty, closed, and quiet":
            reviewAvailability == ReviewAvailability.NO_IMAGE_AVAILABLE &
            workflowStatus.generationState == WorkflowStatusGenerationState.GENERATION_EMPTY &
            workflowStatus.reviewState == WorkflowStatusReviewState.REVIEW_CLOSED &
            workflowStatus.disposition == WorkflowStatusDisposition.NO_REQUEST_DISPOSITION &
            workflowStatus.notice == PublicNotice.NONE;
      compute
        compute_cases
          // @trace CASE-20
          case CASE_20_COORDINATED_PUBLICATION "Committed state pairs determine matched availability while decision notice has declared public precedence":
            guarantee
              ((generationDecision.nextState == GenerationDecisionNextState.IMAGE_READY_A &
                reviewDecision.nextState == ReviewDecisionNextState.REVIEWING_A) implies
                (reviewAvailability == ReviewAvailability.IMAGE_A_AVAILABLE_FOR_REVIEW)) &
              ((generationDecision.nextState == GenerationDecisionNextState.IMAGE_READY_B &
                reviewDecision.nextState == ReviewDecisionNextState.REVIEWING_B) implies
                (reviewAvailability == ReviewAvailability.IMAGE_B_AVAILABLE_FOR_REVIEW)) &
              ((not (generationDecision.nextState == GenerationDecisionNextState.IMAGE_READY_A &
                     reviewDecision.nextState == ReviewDecisionNextState.REVIEWING_A) &
                not (generationDecision.nextState == GenerationDecisionNextState.IMAGE_READY_B &
                     reviewDecision.nextState == ReviewDecisionNextState.REVIEWING_B)) implies
                (reviewAvailability == ReviewAvailability.NO_IMAGE_AVAILABLE)) &
              ((generationDecision.nextState == GenerationDecisionNextState.GENERATION_EMPTY) implies
                (workflowStatus.generationState == WorkflowStatusGenerationState.GENERATION_EMPTY)) &
              ((generationDecision.nextState == GenerationDecisionNextState.GENERATING_A) implies
                (workflowStatus.generationState == WorkflowStatusGenerationState.GENERATING_A)) &
              ((generationDecision.nextState == GenerationDecisionNextState.GENERATING_B) implies
                (workflowStatus.generationState == WorkflowStatusGenerationState.GENERATING_B)) &
              ((generationDecision.nextState == GenerationDecisionNextState.IMAGE_READY_A) implies
                (workflowStatus.generationState == WorkflowStatusGenerationState.IMAGE_READY_A)) &
              ((generationDecision.nextState == GenerationDecisionNextState.IMAGE_READY_B) implies
                (workflowStatus.generationState == WorkflowStatusGenerationState.IMAGE_READY_B)) &
              ((generationDecision.nextState == GenerationDecisionNextState.GENERATION_BLOCKED) implies
                (workflowStatus.generationState == WorkflowStatusGenerationState.GENERATION_BLOCKED)) &
              ((reviewDecision.nextState == ReviewDecisionNextState.REVIEW_CLOSED) implies
                (workflowStatus.reviewState == WorkflowStatusReviewState.REVIEW_CLOSED)) &
              ((reviewDecision.nextState == ReviewDecisionNextState.REVIEWING_A) implies
                (workflowStatus.reviewState == WorkflowStatusReviewState.REVIEWING_A)) &
              ((reviewDecision.nextState == ReviewDecisionNextState.REVIEWING_B) implies
                (workflowStatus.reviewState == WorkflowStatusReviewState.REVIEWING_B)) &
              ((generationDecision.disposition == RequestDisposition.NO_REQUEST_DISPOSITION) implies
                (workflowStatus.disposition == WorkflowStatusDisposition.NO_REQUEST_DISPOSITION)) &
              ((generationDecision.disposition == RequestDisposition.ACCEPTED) implies
                (workflowStatus.disposition == WorkflowStatusDisposition.ACCEPTED)) &
              ((generationDecision.disposition == RequestDisposition.REJECTED) implies
                (workflowStatus.disposition == WorkflowStatusDisposition.REJECTED)) &
              ((generationDecision.disposition == RequestDisposition.PREEMPTED) implies
                (workflowStatus.disposition == WorkflowStatusDisposition.PREEMPTED)) &
              ((generationDecision.disposition == RequestDisposition.RECOVERY_APPLIED) implies
                (workflowStatus.disposition == WorkflowStatusDisposition.RECOVERY_APPLIED)) &
              ((generationDecision.notice == DecisionNotice.INVALID_BATCH_NOTICE) implies
                (workflowStatus.notice == PublicNotice.INVALID_BATCH)) &
              ((generationDecision.notice == DecisionNotice.GENERATOR_BUSY_NOTICE) implies
                (workflowStatus.notice == PublicNotice.GENERATOR_BUSY)) &
              ((generationDecision.notice == DecisionNotice.FEEDBACK_FAULT_NOTICE) implies
                (workflowStatus.notice == PublicNotice.FEEDBACK_FAULT)) &
              ((generationDecision.notice == DecisionNotice.RESET_REJECTED_NOTICE) implies
                (workflowStatus.notice == PublicNotice.RESET_REJECTED)) &
              ((generationDecision.notice == DecisionNotice.RESET_CLEARED_NOTICE) implies
                (workflowStatus.notice == PublicNotice.RESET_CLEARED)) &
              ((generationDecision.notice == DecisionNotice.VIEWER_UNAVAILABLE_NOTICE) implies
                (workflowStatus.notice == PublicNotice.VIEWER_UNAVAILABLE)) &
              ((generationDecision.notice == DecisionNotice.NO_IMAGE_READY_NOTICE) implies
                (workflowStatus.notice == PublicNotice.NO_IMAGE_READY)) &
              ((generationDecision.notice == DecisionNotice.IMAGE_REPLACED_NOTICE) implies
                (workflowStatus.notice == PublicNotice.IMAGE_REPLACED)) &
              ((generationDecision.notice == DecisionNotice.REQUEST_PREEMPTED_NOTICE) implies
                (workflowStatus.notice == PublicNotice.REQUEST_PREEMPTED)) &
              (((generationDecision.notice == DecisionNotice.NO_DECISION_NOTICE |
                 generationDecision.notice == DecisionNotice.IMAGE_OPENED_NOTICE |
                 generationDecision.notice == DecisionNotice.IMAGE_CLOSED_NOTICE) &
                generationDecision.nextState == GenerationDecisionNextState.GENERATION_BLOCKED) implies
                (workflowStatus.notice == PublicNotice.RECOVERY_REQUIRED)) &
              (((generationDecision.notice == DecisionNotice.NO_DECISION_NOTICE |
                 generationDecision.notice == DecisionNotice.IMAGE_OPENED_NOTICE |
                 generationDecision.notice == DecisionNotice.IMAGE_CLOSED_NOTICE) &
                (generationDecision.nextState == GenerationDecisionNextState.GENERATING_A |
                 generationDecision.nextState == GenerationDecisionNextState.GENERATING_B)) implies
                (workflowStatus.notice == PublicNotice.WAITING_FOR_GENERATOR)) &
              (((generationDecision.notice == DecisionNotice.NO_DECISION_NOTICE |
                 generationDecision.notice == DecisionNotice.IMAGE_OPENED_NOTICE |
                 generationDecision.notice == DecisionNotice.IMAGE_CLOSED_NOTICE) &
                ((generationDecision.nextState == GenerationDecisionNextState.IMAGE_READY_A &
                  reviewDecision.nextState == ReviewDecisionNextState.REVIEWING_A) |
                 (generationDecision.nextState == GenerationDecisionNextState.IMAGE_READY_B &
                  reviewDecision.nextState == ReviewDecisionNextState.REVIEWING_B))) implies
                (workflowStatus.notice == PublicNotice.IMAGE_AVAILABLE)) &
              (((generationDecision.notice == DecisionNotice.NO_DECISION_NOTICE |
                 generationDecision.notice == DecisionNotice.IMAGE_OPENED_NOTICE |
                 generationDecision.notice == DecisionNotice.IMAGE_CLOSED_NOTICE) &
                ((generationDecision.nextState == GenerationDecisionNextState.IMAGE_READY_A &
                  reviewDecision.nextState == ReviewDecisionNextState.REVIEW_CLOSED) |
                 (generationDecision.nextState == GenerationDecisionNextState.IMAGE_READY_B &
                  reviewDecision.nextState == ReviewDecisionNextState.REVIEW_CLOSED))) implies
                (workflowStatus.notice == PublicNotice.IMAGE_READY)) &
              (((generationDecision.notice == DecisionNotice.NO_DECISION_NOTICE |
                 generationDecision.notice == DecisionNotice.IMAGE_OPENED_NOTICE |
                 generationDecision.notice == DecisionNotice.IMAGE_CLOSED_NOTICE) &
                generationDecision.nextState != GenerationDecisionNextState.GENERATION_BLOCKED &
                generationDecision.nextState != GenerationDecisionNextState.GENERATING_A &
                generationDecision.nextState != GenerationDecisionNextState.GENERATING_B &
                not (generationDecision.nextState == GenerationDecisionNextState.IMAGE_READY_A &
                     (reviewDecision.nextState == ReviewDecisionNextState.REVIEW_CLOSED |
                      reviewDecision.nextState == ReviewDecisionNextState.REVIEWING_A)) &
                not (generationDecision.nextState == GenerationDecisionNextState.IMAGE_READY_B &
                     (reviewDecision.nextState == ReviewDecisionNextState.REVIEW_CLOSED |
                      reviewDecision.nextState == ReviewDecisionNextState.REVIEWING_B))) implies
                (workflowStatus.notice == PublicNotice.NONE));
    }*/
  }

  // @generated-support behavior-free containment required by SUPPORT-01
  part def ImageReviewCoordinationProcess :> Process {
    // @generated-support root-to-Process route for MON-01
    port batchEvent : DataPort { in :>> type : BatchEvent; }
    // @generated-support root-to-Process route for MON-02
    port generatorFeedback : DataPort { in :>> type : GeneratorFeedback; }
    // @generated-support root-to-Process route for MON-03
    port viewerObservation : DataPort { in :>> type : ViewerObservation; }
    // @generated-support root-to-Process route for MON-04
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    // @generated-support root-to-Process route for MON-05
    port recoveryRequest : DataPort { in :>> type : RecoveryRequest; }
    // @generated-support Process-to-root route for CTRL-01
    port generationCommand : DataPort { out :>> type : GenerationCommand; }
    // @generated-support Process-to-root route for CTRL-02
    port reviewAvailability : DataPort { out :>> type : ReviewAvailability; }
    // @generated-support Process-to-root route for CTRL-03
    port workflowStatus : DataPort { out :>> type : WorkflowStatus; }

    // @trace PART-01
    part batchQualificationOwner : BatchQualificationOwner;
    // @trace PART-02
    part generatorFeedbackQualificationOwner : GeneratorFeedbackQualificationOwner;
    // @trace PART-03
    part reviewAccessQualificationOwner : ReviewAccessQualificationOwner;
    // @trace PART-04
    part generatorOutcomeRecoveryOwner : GeneratorOutcomeRecoveryOwner;
    // @trace PART-05
    part availabilityWorkflowArbiter : AvailabilityWorkflowArbiter;
    // @trace PART-06
    part generationSlotStateGovernor : GenerationSlotStateGovernor;
    // @trace PART-07
    part reviewSessionStateGovernor : ReviewSessionStateGovernor;
    // @trace PART-08
    part generationCommandPolicy : GenerationCommandPolicy;
    // @trace PART-09
    part availabilityPublicationPolicy : AvailabilityPublicationPolicy;

    // @trace INT-01
    connection int01 : PortConnection connect batchEvent to batchQualificationOwner.batchEvent;
    // @trace INT-02
    connection int02 : PortConnection connect generatorFeedback to generatorFeedbackQualificationOwner.generatorFeedback;
    // @trace INT-03
    connection int03 : PortConnection connect viewerObservation to reviewAccessQualificationOwner.viewerObservation;
    // @trace INT-04
    connection int04 : PortConnection connect doctorRequest to availabilityWorkflowArbiter.doctorRequest;
    // @trace INT-05
    connection int05 : PortConnection connect recoveryRequest to generatorOutcomeRecoveryOwner.recoveryRequest;
    // @trace INT-06
    connection int06 : PortConnection connect generationSlotStateGovernor.generationPreState to generatorFeedbackQualificationOwner.generationPreState;
    // @trace INT-07
    connection int07 : PortConnection connect generationSlotStateGovernor.generationPreState to generatorOutcomeRecoveryOwner.generationPreState;
    // @trace INT-08
    connection int08 : PortConnection connect generationSlotStateGovernor.generationPreState to availabilityWorkflowArbiter.generationPreState;
    // @trace INT-09
    connection int09 : PortConnection connect reviewSessionStateGovernor.reviewPreState to availabilityWorkflowArbiter.reviewPreState;
    // @trace INT-10
    connection int10 : PortConnection connect batchQualificationOwner.batchAssessment to availabilityWorkflowArbiter.batchAssessment;
    // @trace INT-11
    connection int11 : PortConnection connect generatorFeedbackQualificationOwner.feedbackAssessment to generatorOutcomeRecoveryOwner.feedbackAssessment;
    // @trace INT-12
    connection int12 : PortConnection connect reviewAccessQualificationOwner.viewerAssessment to availabilityWorkflowArbiter.viewerAssessment;
    // @trace INT-13
    connection int13 : PortConnection connect generatorOutcomeRecoveryOwner.generatorProposal to availabilityWorkflowArbiter.generatorProposal;
    // @trace INT-14
    connection int14 : PortConnection connect availabilityWorkflowArbiter.workflowDecision to generationSlotStateGovernor.workflowDecision;
    // @trace INT-15
    connection int15 : PortConnection connect availabilityWorkflowArbiter.workflowDecision to reviewSessionStateGovernor.workflowDecision;
    // @trace INT-16
    connection int16 : PortConnection connect generationSlotStateGovernor.generationDecision to generationCommandPolicy.generationDecision;
    // @trace INT-17
    connection int17 : PortConnection connect generationSlotStateGovernor.generationDecision to availabilityPublicationPolicy.generationDecision;
    // @trace INT-18
    connection int18 : PortConnection connect reviewSessionStateGovernor.reviewDecision to availabilityPublicationPolicy.reviewDecision;
    // @trace INT-19
    connection int19 : PortConnection connect generationCommandPolicy.generationCommand to generationCommand;
    // @trace INT-20
    connection int20 : PortConnection connect availabilityPublicationPolicy.reviewAvailability to reviewAvailability;
    // @trace INT-21
    connection int21 : PortConnection connect availabilityPublicationPolicy.workflowStatus to workflowStatus;
  }

  // @trace SCOPE-IN-01
  part def EITImageReviewAvailabilityCoordinator :> System {
    // @trace MON-01
    port batchEvent : DataPort { in :>> type : BatchEvent; }
    // @trace MON-02
    port generatorFeedback : DataPort { in :>> type : GeneratorFeedback; }
    // @trace MON-03
    port viewerObservation : DataPort { in :>> type : ViewerObservation; }
    // @trace MON-04
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    // @trace MON-05
    port recoveryRequest : DataPort { in :>> type : RecoveryRequest; }
    // @trace CTRL-01
    port generationCommand : DataPort { out :>> type : GenerationCommand; }
    // @trace CTRL-02
    port reviewAvailability : DataPort { out :>> type : ReviewAvailability; }
    // @trace CTRL-03
    port workflowStatus : DataPort { out :>> type : WorkflowStatus; }

    // @generated-support behavior-free containment usage required by SUPPORT-01
    part imageReviewCoordinationProcess : ImageReviewCoordinationProcess;

    // @generated-support support route for MON-01
    connection supportBatchEvent : PortConnection connect batchEvent to imageReviewCoordinationProcess.batchEvent;
    // @generated-support support route for MON-02
    connection supportGeneratorFeedback : PortConnection connect generatorFeedback to imageReviewCoordinationProcess.generatorFeedback;
    // @generated-support support route for MON-03
    connection supportViewerObservation : PortConnection connect viewerObservation to imageReviewCoordinationProcess.viewerObservation;
    // @generated-support support route for MON-04
    connection supportDoctorRequest : PortConnection connect doctorRequest to imageReviewCoordinationProcess.doctorRequest;
    // @generated-support support route for MON-05
    connection supportRecoveryRequest : PortConnection connect recoveryRequest to imageReviewCoordinationProcess.recoveryRequest;
    // @generated-support support route for CTRL-01
    connection supportGenerationCommand : PortConnection connect imageReviewCoordinationProcess.generationCommand to generationCommand;
    // @generated-support support route for CTRL-02
    connection supportReviewAvailability : PortConnection connect imageReviewCoordinationProcess.reviewAvailability to reviewAvailability;
    // @generated-support support route for CTRL-03
    connection supportWorkflowStatus : PortConnection connect imageReviewCoordinationProcess.workflowStatus to workflowStatus;
  }

  // @trace SCOPE-IN-01
  part eitImageReviewAvailabilityCoordinator : EITImageReviewAvailabilityCoordinator;
}
