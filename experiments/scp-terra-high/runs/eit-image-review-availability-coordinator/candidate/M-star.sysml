package EIT_Image_Review_Availability_Coordinator {
  private import HAMR::*;

  enum def BatchEvent {
    enum NO_BATCH_EVENT;
    enum INVALID_BATCH_EVENT;
    enum BATCH_A_AVAILABLE;
    enum BATCH_B_AVAILABLE;
  }

  enum def GeneratorFeedback {
    enum NO_GENERATOR_FEEDBACK;
    enum GENERATION_FAILED;
    enum IMAGE_A_GENERATED;
    enum IMAGE_B_GENERATED;
  }

  enum def ViewerObservation {
    enum VIEWER_OBSERVATION_INVALID;
    enum VIEWER_UNAVAILABLE;
    enum VIEWER_AVAILABLE;
  }

  enum def DoctorRequest {
    enum NO_DOCTOR_REQUEST;
    enum OPEN_AVAILABLE_IMAGE;
    enum CLOSE_REVIEW;
  }

  enum def RecoveryRequest {
    enum NO_RECOVERY_REQUEST;
    enum RESET_GENERATION_WORKFLOW;
  }

  enum def GenerationCommand {
    enum NO_GENERATION_COMMAND;
    enum GENERATE_FROM_BATCH_A;
    enum GENERATE_FROM_BATCH_B;
  }

  enum def ReviewAvailability {
    enum NO_IMAGE_AVAILABLE;
    enum IMAGE_A_AVAILABLE_FOR_REVIEW;
    enum IMAGE_B_AVAILABLE_FOR_REVIEW;
  }

  enum def BatchCategory {
    enum NO_BATCH;
    enum INVALID_BATCH;
    enum USABLE_BATCH_A;
    enum USABLE_BATCH_B;
  }

  part def BatchAssessment :> Data {
    attribute batchCategory : BatchCategory;
    attribute usable : Boolean;
  }

  enum def GenerationState {
    enum GENERATION_EMPTY;
    enum GENERATING_A;
    enum GENERATING_B;
    enum IMAGE_READY_A;
    enum IMAGE_READY_B;
    enum GENERATION_BLOCKED;
  }

  enum def ReviewState {
    enum REVIEW_CLOSED;
    enum REVIEWING_A;
    enum REVIEWING_B;
  }

  enum def FeedbackCondition {
    enum NO_RESULT;
    enum MATCHED_IMAGE_A;
    enum MATCHED_IMAGE_B;
    enum FEEDBACK_FAULT;
  }

  part def FeedbackAssessment :> Data {
    attribute condition : FeedbackCondition;
    attribute matched : Boolean;
  }

  enum def ViewerCondition {
    enum REVIEW_ACCESS_UNAVAILABLE;
    enum REVIEW_ACCESS_AVAILABLE;
  }

  part def ViewerAssessment :> Data {
    attribute condition : ViewerCondition;
    attribute accessible : Boolean;
  }

  enum def GeneratorProposal {
    enum NO_GENERATOR_PROPOSAL;
    enum BLOCK_GENERATION;
    enum ACCEPT_IMAGE_A;
    enum ACCEPT_IMAGE_B;
    enum CLEAR_GENERATION_BLOCK;
  }

  enum def ProposalCondition {
    enum NO_PROPOSAL_CONDITION;
    enum MATCHED_COMPLETION;
    enum FEEDBACK_REJECTED;
    enum RESET_APPLICABLE;
    enum RESET_INAPPLICABLE;
  }

  part def GeneratorProposalRecord :> Data {
    attribute proposal : GeneratorProposal;
    attribute condition : ProposalCondition;
  }

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

  enum def RequestDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum PREEMPTED;
    enum RECOVERY_APPLIED;
  }

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

  part def WorkflowDecision :> Data {
    attribute selectedAction : WorkflowAction;
    attribute disposition : RequestDisposition;
    attribute notice : DecisionNotice;
  }

  enum def GenerationPreStateSnapshot {
    enum GENERATION_EMPTY;
    enum GENERATING_A;
    enum GENERATING_B;
    enum IMAGE_READY_A;
    enum IMAGE_READY_B;
    enum GENERATION_BLOCKED;
  }

  enum def GenerationDecisionNextState {
    enum GENERATION_EMPTY;
    enum GENERATING_A;
    enum GENERATING_B;
    enum IMAGE_READY_A;
    enum IMAGE_READY_B;
    enum GENERATION_BLOCKED;
  }

  part def GenerationDecisionSnapshot :> Data {
    attribute preState : GenerationPreStateSnapshot;
    attribute nextState : GenerationDecisionNextState;
    attribute selectedAction : WorkflowAction;
    attribute disposition : RequestDisposition;
    attribute notice : DecisionNotice;
  }

  enum def ReviewPreStateSnapshot {
    enum REVIEW_CLOSED;
    enum REVIEWING_A;
    enum REVIEWING_B;
  }

  enum def ReviewDecisionNextState {
    enum REVIEW_CLOSED;
    enum REVIEWING_A;
    enum REVIEWING_B;
  }

  part def ReviewDecisionSnapshot :> Data {
    attribute preState : ReviewPreStateSnapshot;
    attribute nextState : ReviewDecisionNextState;
  }

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

  enum def WorkflowStatusGenerationState {
    enum GENERATION_EMPTY;
    enum GENERATING_A;
    enum GENERATING_B;
    enum IMAGE_READY_A;
    enum IMAGE_READY_B;
    enum GENERATION_BLOCKED;
  }

  enum def WorkflowStatusReviewState {
    enum REVIEW_CLOSED;
    enum REVIEWING_A;
    enum REVIEWING_B;
  }

  enum def WorkflowStatusDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum PREEMPTED;
    enum RECOVERY_APPLIED;
  }

  part def WorkflowStatus :> Data {
    attribute generationState : WorkflowStatusGenerationState;
    attribute reviewState : WorkflowStatusReviewState;
    attribute disposition : WorkflowStatusDisposition;
    attribute notice : PublicNotice;
  }

  part def BatchQualificationOwner :> Thread {
    port batchEvent : DataPort { in :>> type : BatchEvent; }
    port batchAssessment : DataPort { out :>> type : BatchAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee init: batchAssessment.batchCategory == BatchCategory.NO_BATCH & not batchAssessment.usable;

      compute
        compute_cases
          case noBatch: assume batchEvent == BatchEvent.NO_BATCH_EVENT; guarantee batchAssessment.batchCategory == BatchCategory.NO_BATCH & not batchAssessment.usable;
          case invalidBatch: assume batchEvent == BatchEvent.INVALID_BATCH_EVENT; guarantee batchAssessment.batchCategory == BatchCategory.INVALID_BATCH & not batchAssessment.usable;
          case batchA: assume batchEvent == BatchEvent.BATCH_A_AVAILABLE; guarantee batchAssessment.batchCategory == BatchCategory.USABLE_BATCH_A & batchAssessment.usable;
          case batchB: assume batchEvent == BatchEvent.BATCH_B_AVAILABLE; guarantee batchAssessment.batchCategory == BatchCategory.USABLE_BATCH_B & batchAssessment.usable;
    }*/
  }

  part def GeneratorFeedbackQualificationOwner :> Thread {
    port generatorFeedback : DataPort { in :>> type : GeneratorFeedback; }
    port generationPreState : DataPort { in :>> type : GenerationState; }
    port feedbackAssessment : DataPort { out :>> type : FeedbackAssessment; }

                        
                
                 
                           
                                                                                                
                                                                         
                                            
             
                     
                           
                                                                                          
                                                                                
                                                                                   
                                              
                           
                                                                                                            
                  
                                                                         
                                                                    
                                                                         
                                                                   
                     
                                                                                 
                                                                                                                        
                                                                                 
                                                                                                                       
                           
                                                                                                  
                                                                                 
                                                                             
                                                                        
                                                                             
                                                                       
                                                                                        
                                              
       
  }

  part def ReviewAccessQualificationOwner :> Thread {
    port viewerObservation : DataPort { in :>> type : ViewerObservation; }
    port viewerAssessment : DataPort { out :>> type : ViewerAssessment; }

                        
                
                 
                           
                                                                                
                                                                                     
                                             
             
                     
                           
                                                                                             
                                                                           
                                                                                             
                                               
                           
                                                                                                             
                                                                                      
                                                                        
                                                                                               
                                               
       
  }

  part def GeneratorOutcomeRecoveryOwner :> Thread {
    port recoveryRequest : DataPort { in :>> type : RecoveryRequest; }
    port generationPreState : DataPort { in :>> type : GenerationState; }
    port feedbackAssessment : DataPort { in :>> type : FeedbackAssessment; }
    port generatorProposal : DataPort { out :>> type : GeneratorProposalRecord; }

                        
                
                 
                           
                                                                                               
                                                                                   
                                                                                   
             
                     
                           
                                                                                                                                                   
                                                                               
                     
                                                                                          
                                                                                 
                                                                                        
                                                                                          
                                                                                 
                                                                                        
                                                                                         
                                                                                   
                                                                                      
                           
                                                                                                                                            
                                                                               
                     
                                                                              
                                                                                 
                                                                                         
                                                                                      
                                                                              
                                                                                 
                                                                                        
                                                                                        
                                                                               
                                                                                        
                                                                                          
       
  }

  part def AvailabilityWorkflowArbiter :> Thread {
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    port generationPreState : DataPort { in :>> type : GenerationState; }
    port reviewPreState : DataPort { in :>> type : ReviewState; }
    port batchAssessment : DataPort { in :>> type : BatchAssessment; }
    port viewerAssessment : DataPort { in :>> type : ViewerAssessment; }
    port generatorProposal : DataPort { in :>> type : GeneratorProposalRecord; }
    port workflowDecision : DataPort { out :>> type : WorkflowDecision; }

                        
                
                 
                           
                                                                                                           
                                                                                  
                                                                                       
                                                                         
             
                     
                           
                                                                                                                                                 
                                                                                          
                                                                                  
                     
                                                                                         
                                                                                 
                                                                                  
                                                                                                            
                                                                                     
                                                                                                          
                                                                                              
                                                                                       
                                                                                          
                                                                                                            
                                                                                   
                                                                                           
                                                                                                          
                                                                                  
                                                                                       
                                                                                       
                                                                                          
                                                                                                            
                                                                                   
                                                                                           
                                                                                                          
                                                                                  
                                                                                       
                                                                                               
                                                                                       
                                                                                 
                                                                                                            
                                                                                     
                                                                                                          
                                                                                              
                                                                                       
                                                                                            
                                                                                       
                                                                              
                                                                                   
                           
                                                                                                                                  
                                                                                          
                                                                                   
                                                          
                     
                                                                                                         
                                                    
                                                                                        
                                                                               
                                                                                       
                                                                                                         
                                                    
                                                                                        
                                                                              
                                                                                  
                                                                    
                                                                                       
                                                                              
                                                                                   
                           
                                                                                                                                         
                                                                                          
                                                                                   
                                                                  
                     
                                                                     
                                                                                                
                                                    
                                                                                        
                                                                               
                                                                                       
                                                                     
                                                                                                
                                                    
                                                                                        
                                                                               
                                                                                       
                                                                     
                                                                                                
                                                    
                                                                                        
                                                                              
                                                                                  
                                                                     
                                                                                                
                                                    
                                                                                        
                                                                              
                                                                                  
                                                         
                                                                                       
                                                                              
                                                                                        
                                                  
                                                                                                                         
                                                                                                                                
                                                                                       
                                                                              
                                                                                   
                           
                                                                                                                                        
                                                                                          
                                                                                   
                                                               
                     
                                                                                
                                                                                       
                                                                                            
                                                                                 
                                                                                     
                                                                                       
                                                                              
                                                                                   
                                                                                           
                                                                        
                                                                                      
                                                                                         
                                                                              
                                                                                 
                                                                                           
                                                                        
                                                                                      
                                                                                         
                                                                              
                                                                                 
                                                                                           
                                                                                                                             
                                                                                      
                                                                                         
                                                                              
                                                                                    
                                                                                           
                                                                                                                             
                                                                                      
                                                                                         
                                                                              
                                                                                    
                                             
                                                                  
                                                                              
                                                                           
                                                                                    
                                                                                       
                                                                              
                                                                                   
       
  }

  part def GenerationSlotStateGovernor :> Thread {
    port workflowDecision : DataPort { in :>> type : WorkflowDecision; }
    port generationPreState : DataPort { out :>> type : GenerationState; }
    port generationDecision : DataPort { out :>> type : GenerationDecisionSnapshot; }

                        
           
                          
                                                   
                
                 
                           
                                                                                                   
                                                                          
                                                                    
                                                                                        
                                                                                          
                                                                                    
                                                                                         
                                                                           
             
                 
                          
                                                                                                                   
                                                               
                 
                           
                                                                                                                           
                                                                                       
                                                                                             
                                                                                   
                                                                                         
                                                                                   
                                                                                         
                                                                                    
                                                                                          
                                                                                    
                                                                                          
                                                                                         
                                                                                               
                                                                                   
                                                                                               
                                                                               
                                                                                           
                                                                               
                                                                                           
                                                                                
                                                                                            
                                                                                
                                                                                            
                                                                                     
                                                                                                 
                                                                                  
                                                                            
                                                                 
                     
                           
                                                                                                                                          
                                                                                           
                                                                                      
                                                                                       
                                                                                       
                                                                              
                                                                                    
                                                                                    
                     
                                                                                               
                                                                             
                                                                                               
                                                                             
                                                                                                
                                                                              
                                                                                                
                                                                              
                                                                                       
                                                                                   
                                                                                             
                                                                                 
                                                                                              
                                                                                
                           
                                                                                                      
                                                                                         
                                                                                     
                                                                                    
                                                                               
       
  }

  part def ReviewSessionStateGovernor :> Thread {
    port workflowDecision : DataPort { in :>> type : WorkflowDecision; }
    port reviewPreState : DataPort { out :>> type : ReviewState; }
    port reviewDecision : DataPort { out :>> type : ReviewDecisionSnapshot; }

                        
           
                          
                                           
                
                 
                           
                                                                                                  
                                                               
                                                         
                                                                             
                                                                              
             
                 
                          
                                                                                                           
                                                       
                 
                           
                                                                                                          
                                                                            
                                                                                  
                                                                          
                                                                                
                                                                          
                                                                                
                                                                        
                                                                                    
                                                                      
                                                                                  
                                                                      
                                                                                 
                     
                           
                                                                                                                   
                                                                                          
                                                                                     
                                                                                     
                                                                              
                                                                                    
                                                                                      
                                                                                     
                     
                                                                                              
                                                                    
                                                                                              
                                                                    
                                                                                       
                                                                                
                                                                                      
                                                                                        
                                                                                               
                                                                     
                           
                                                                                                       
                                                                                         
                                                                                       
                                                                                      
                                                                       
       
  }

  part def GenerationCommandPolicy :> Thread {
    port generationDecision : DataPort { in :>> type : GenerationDecisionSnapshot; }
    port generationCommand : DataPort { out :>> type : GenerationCommand; }

                        
                
                 
                           
                                                                                         
                                                                         
             
                     
                           
                                                                                                                 
                     
                                                                                                 
                                                                                 
                                                                                                 
                                                                                 
                                                                                          
                                                                                                 
                                                                                
       
  }

  part def AvailabilityPublicationPolicy :> Thread {
    port generationDecision : DataPort { in :>> type : GenerationDecisionSnapshot; }
    port reviewDecision : DataPort { in :>> type : ReviewDecisionSnapshot; }
    port reviewAvailability : DataPort { out :>> type : ReviewAvailability; }
    port workflowStatus : DataPort { out :>> type : WorkflowStatus; }

                        
                
                 
                           
                                                                                               
                                                                         
                                                                                              
                                                                                   
                                                                                            
                                                       
             
                     
                           
                                                                                                                                                           
                     
                                                                                           
                                                                                        
                                                                                          
                                                                                           
                                                                                        
                                                                                          
                                                                                                
                                                                                       
                                                                                                
                                                                                              
                                                                                
                                                                                                     
                                                                                                     
                                                                                                 
                                                                                                 
                                                                                                 
                                                                                                 
                                                                                                  
                                                                                                  
                                                                                                  
                                                                                                  
                                                                                                       
                                                                                                       
                                                                                          
                                                                                          
                                                                                        
                                                                                        
                                                                                        
                                                                                        
                                                                                                    
                                                                                                   
                                                                                      
                                                                                     
                                                                                      
                                                                                     
                                                                                       
                                                                                      
                                                                                              
                                                                                             
                                                                                         
                                                                        
                                                                                          
                                                                         
                                                                                          
                                                                         
                                                                                          
                                                                         
                                                                                         
                                                                        
                                                                                              
                                                                             
                                                                                          
                                                                         
                                                                                          
                                                                         
                                                                                             
                                                                            
                                                                                 
                                                                                  
                                                                                   
                                                                                                       
                                                                            
                                                                                 
                                                                                  
                                                                                   
                                                                                           
                                                                                                   
                                                                                
                                                                                 
                                                                                  
                                                                                   
                                                                                             
                                                                                    
                                                                                             
                                                                                            
                                                                          
                                                                                 
                                                                                  
                                                                                   
                                                                                             
                                                                                      
                                                                                             
                                                                                              
                                                                      
                                                                                 
                                                                                  
                                                                                   
                                                                                                
                                                                                          
                                                                                          
                                                                                                
                                                                                         
                                                                                         
                                                                                                
                                                                                         
                                                                                                
                                                              
       
  }

  part def ImageReviewCoordinationProcess :> Process {
    port batchEvent : DataPort { in :>> type : BatchEvent; }
    port generatorFeedback : DataPort { in :>> type : GeneratorFeedback; }
    port viewerObservation : DataPort { in :>> type : ViewerObservation; }
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    port recoveryRequest : DataPort { in :>> type : RecoveryRequest; }
    port generationCommand : DataPort { out :>> type : GenerationCommand; }
    port reviewAvailability : DataPort { out :>> type : ReviewAvailability; }
    port workflowStatus : DataPort { out :>> type : WorkflowStatus; }

    part batchQualificationOwner : BatchQualificationOwner;
    part generatorFeedbackQualificationOwner : GeneratorFeedbackQualificationOwner;
    part reviewAccessQualificationOwner : ReviewAccessQualificationOwner;
    part generatorOutcomeRecoveryOwner : GeneratorOutcomeRecoveryOwner;
    part availabilityWorkflowArbiter : AvailabilityWorkflowArbiter;
    part generationSlotStateGovernor : GenerationSlotStateGovernor;
    part reviewSessionStateGovernor : ReviewSessionStateGovernor;
    part generationCommandPolicy : GenerationCommandPolicy;
    part availabilityPublicationPolicy : AvailabilityPublicationPolicy;

    connection int01 : PortConnection connect batchEvent to batchQualificationOwner.batchEvent;
    connection int02 : PortConnection connect generatorFeedback to generatorFeedbackQualificationOwner.generatorFeedback;
    connection int03 : PortConnection connect viewerObservation to reviewAccessQualificationOwner.viewerObservation;
    connection int04 : PortConnection connect doctorRequest to availabilityWorkflowArbiter.doctorRequest;
    connection int05 : PortConnection connect recoveryRequest to generatorOutcomeRecoveryOwner.recoveryRequest;
    connection int06 : PortConnection connect generationSlotStateGovernor.generationPreState to generatorFeedbackQualificationOwner.generationPreState;
    connection int07 : PortConnection connect generationSlotStateGovernor.generationPreState to generatorOutcomeRecoveryOwner.generationPreState;
    connection int08 : PortConnection connect generationSlotStateGovernor.generationPreState to availabilityWorkflowArbiter.generationPreState;
    connection int09 : PortConnection connect reviewSessionStateGovernor.reviewPreState to availabilityWorkflowArbiter.reviewPreState;
    connection int10 : PortConnection connect batchQualificationOwner.batchAssessment to availabilityWorkflowArbiter.batchAssessment;
    connection int11 : PortConnection connect generatorFeedbackQualificationOwner.feedbackAssessment to generatorOutcomeRecoveryOwner.feedbackAssessment;
    connection int12 : PortConnection connect reviewAccessQualificationOwner.viewerAssessment to availabilityWorkflowArbiter.viewerAssessment;
    connection int13 : PortConnection connect generatorOutcomeRecoveryOwner.generatorProposal to availabilityWorkflowArbiter.generatorProposal;
    connection int14 : PortConnection connect availabilityWorkflowArbiter.workflowDecision to generationSlotStateGovernor.workflowDecision;
    connection int15 : PortConnection connect availabilityWorkflowArbiter.workflowDecision to reviewSessionStateGovernor.workflowDecision;
    connection int16 : PortConnection connect generationSlotStateGovernor.generationDecision to generationCommandPolicy.generationDecision;
    connection int17 : PortConnection connect generationSlotStateGovernor.generationDecision to availabilityPublicationPolicy.generationDecision;
    connection int18 : PortConnection connect reviewSessionStateGovernor.reviewDecision to availabilityPublicationPolicy.reviewDecision;
    connection int19 : PortConnection connect generationCommandPolicy.generationCommand to generationCommand;
    connection int20 : PortConnection connect availabilityPublicationPolicy.reviewAvailability to reviewAvailability;
    connection int21 : PortConnection connect availabilityPublicationPolicy.workflowStatus to workflowStatus;
  }

  part def EITImageReviewAvailabilityCoordinator :> System {
    port batchEvent : DataPort { in :>> type : BatchEvent; }
    port generatorFeedback : DataPort { in :>> type : GeneratorFeedback; }
    port viewerObservation : DataPort { in :>> type : ViewerObservation; }
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    port recoveryRequest : DataPort { in :>> type : RecoveryRequest; }
    port generationCommand : DataPort { out :>> type : GenerationCommand; }
    port reviewAvailability : DataPort { out :>> type : ReviewAvailability; }
    port workflowStatus : DataPort { out :>> type : WorkflowStatus; }

    part imageReviewCoordinationProcess : ImageReviewCoordinationProcess;

    connection supportBatchEvent : PortConnection connect batchEvent to imageReviewCoordinationProcess.batchEvent;
    connection supportGeneratorFeedback : PortConnection connect generatorFeedback to imageReviewCoordinationProcess.generatorFeedback;
    connection supportViewerObservation : PortConnection connect viewerObservation to imageReviewCoordinationProcess.viewerObservation;
    connection supportDoctorRequest : PortConnection connect doctorRequest to imageReviewCoordinationProcess.doctorRequest;
    connection supportRecoveryRequest : PortConnection connect recoveryRequest to imageReviewCoordinationProcess.recoveryRequest;
    connection supportGenerationCommand : PortConnection connect imageReviewCoordinationProcess.generationCommand to generationCommand;
    connection supportReviewAvailability : PortConnection connect imageReviewCoordinationProcess.reviewAvailability to reviewAvailability;
    connection supportWorkflowStatus : PortConnection connect imageReviewCoordinationProcess.workflowStatus to workflowStatus;
  }

  part eitImageReviewAvailabilityCoordinator : EITImageReviewAvailabilityCoordinator;
}
