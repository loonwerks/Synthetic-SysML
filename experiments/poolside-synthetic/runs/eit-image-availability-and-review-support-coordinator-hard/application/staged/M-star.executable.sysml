// Retained architecture checkpoint: approved allocation and typed flows, without GUMBO behavior.
package EIT_Image_Availability_Coordinator {
  private import HAMR::*;

  // Finite boundary vocabulary.
  enum def ImageSignal {
    enum NONE; enum GENERATED; enum REVOKED; enum UPSTREAM_FAILURE; enum INVALID_A; enum INVALID_B;
  }
  enum def DoctorSignal {
    enum NONE; enum REQUEST_VIEW; enum ACK_VIEW; enum DISMISS_VIEW; enum INVALID_A; enum INVALID_B;
  }
  enum def PreparationContext {
    enum NO_REPORT; enum BELT_REPORTED; enum CALIBRATION_REPORTED;
    enum BELT_AND_CALIBRATION_REPORTED; enum REPORTED_FAILURE; enum INVALID_A; enum INVALID_B;
  }
  enum def ServiceObservation { enum READY; enum DEGRADED; enum FAILED; enum INVALID_A; enum INVALID_B; }
  enum def RecoveryEvent { enum NONE; enum RESET; enum VERIFY_OK; enum RESUME; enum INVALID_A; enum INVALID_B; }

  // Qualified facts.
  enum def ImageFacts { enum NO_IMAGE; enum NEW_IMAGE; enum WITHDRAWAL; enum REPORTED_FAILURE; enum INVALID; }
  enum def ReviewFacts { enum NO_REVIEW_EVENT; enum VIEW_REQUEST; enum VIEW_ACK; enum VIEW_DISMISS; enum INVALID; }
  enum def ContextFacts { enum NO_CONTEXT; enum PARTIAL_CONTEXT; enum COMPLETE_CONTEXT; enum REPORTED_FAILURE; enum INVALID; }
  enum def ServiceFacts { enum READY; enum DEGRADED; enum REPORTED_FAILURE; enum INVALID; }

  // Fault, state, decision, and publication vocabulary.
  enum def DominantFault {
    enum RECOVERY_INPUT; enum IMAGE_INPUT; enum DOCTOR_INPUT; enum CONTEXT_INPUT; enum SERVICE_INPUT;
    enum UPSTREAM_REPORTED; enum CONTEXT_REPORTED; enum SERVICE_REPORTED; enum NONE;
  }
  enum def RecoveryState { enum HEALTHY; enum LATCHED; enum VERIFYING; enum ARMED; }
  enum def EvidenceState { enum EMPTY; enum ACCEPTED; enum REJECTED; enum RECOVERY; }
  enum def ArtifactState { enum EMPTY; enum STAGED; enum QUARANTINED; enum WITHDRAWN; enum RECOVERY; }
  enum def ReviewState { enum IDLE; enum OFFERED; enum VIEWING; enum ACKNOWLEDGED; enum RECOVERY; }
  enum def AdmissionOutcome { enum NONE; enum ADMIT; enum QUARANTINE; enum REJECT; }
  enum def AdmissionReason {
    enum NO_CANDIDATE; enum ELIGIBLE; enum EVIDENCE_INCOMPLETE; enum SERVICE_DEGRADED; enum RECOVERY_CLOSED;
  }
  enum def AvailabilityDecision { enum BLOCKED; enum ALLOWED; }
  enum def BlockReason {
    enum RECOVERY_BLOCK; enum ARTIFACT_NOT_STAGED; enum EVIDENCE_NOT_ACCEPTED; enum SERVICE_NOT_READY; enum NONE;
  }
  enum def PresentationProposal { enum NONE; enum CLOSE; enum OPEN; enum OFFER; }
  enum def SelectedAction { enum SAFE_WITHHOLD; enum WITHDRAW; enum REJECT; enum CLOSE; enum ACCEPT; enum OPEN; enum OFFER; enum HOLD; }
  enum def SelectedReason {
    enum FAULT_OR_RECOVERY; enum UPSTREAM_WITHDRAWAL; enum EVIDENCE_REJECTION; enum SERVICE_QUARANTINE;
    enum DOCTOR_CLOSURE; enum NEW_IMAGE_ACCEPTANCE; enum DOCTOR_OPENING; enum IMAGE_OFFER; enum NO_ELIGIBLE_WORK;
  }
  enum def UpstreamDisposition { enum NO_ACTION; enum ACCEPT_IMAGE; enum REJECT_IMAGE; enum ACK_WITHDRAWN; enum PAUSE_DELIVERY; }
  enum def Visibility { enum HIDDEN; enum OFFERED; enum VISIBLE; enum CLOSED; }
  enum def PublicMode { enum RECOVERY; enum FAULT; enum QUARANTINED; enum STAGED; enum OFFERED; enum VIEWING; enum CLOSED; enum IDLE; }

  // Flat interaction and boundary records. Every GUMBO-inspected field is an attribute.
  part def FaultSummary :> Data {
    attribute faultPresent : Base_Types::Boolean;
    attribute dominantFault : DominantFault;
    attribute multipleFaults : Base_Types::Boolean;
  }
  part def RecoveryFrame :> Data {
    attribute recoveryState : RecoveryState;
    attribute recoveryOpen : Base_Types::Boolean;
    attribute recoveryReleased : Base_Types::Boolean;
    attribute effectiveFaultPresent : Base_Types::Boolean;
    attribute dominantFault : DominantFault;
    attribute effectiveMultipleFaults : Base_Types::Boolean;
  }
  part def EvidenceFrame :> Data {
    attribute evidenceState : EvidenceState;
    attribute contextAccepted : Base_Types::Boolean;
  }
  part def AdmissionFrame :> Data {
    attribute outcome : AdmissionOutcome;
    attribute admissionReason : AdmissionReason;
  }
  part def ArtifactFrame :> Data {
    attribute artifactState : ArtifactState;
    attribute withdrawProposal : Base_Types::Boolean;
    attribute rejectProposal : Base_Types::Boolean;
    attribute acceptProposal : Base_Types::Boolean;
    attribute closureWindow : Base_Types::Boolean;
  }
  part def AvailabilityDecisionFrame :> Data {
    attribute decision : AvailabilityDecision;
    attribute blockReason : BlockReason;
  }
  part def ReviewFrame :> Data { attribute reviewState : ReviewState; }
  part def PresentationFrame :> Data { attribute proposal : PresentationProposal; }
  part def DecisionFrame :> Data {
    attribute availabilityAllowed : Base_Types::Boolean;
    attribute selectedAction : SelectedAction;
    attribute selectedReason : SelectedReason;
    attribute recoveryState : RecoveryState;
    attribute recoveryOpen : Base_Types::Boolean;
    attribute recoveryReleased : Base_Types::Boolean;
    attribute effectiveFaultPresent : Base_Types::Boolean;
    attribute dominantFault : DominantFault;
    attribute effectiveMultipleFaults : Base_Types::Boolean;
    attribute evidenceState : EvidenceState;
    attribute artifactState : ArtifactState;
    attribute reviewState : ReviewState;
  }
  part def AvailabilityFrame :> Data {
    attribute publicMode : PublicMode;
    attribute visibility : Visibility;
    attribute selectedReason : SelectedReason;
    attribute recoveryState : RecoveryState;
    attribute evidenceState : EvidenceState;
    attribute artifactState : ArtifactState;
    attribute reviewState : ReviewState;
    attribute faultPresent : Base_Types::Boolean;
    attribute dominantFault : DominantFault;
    attribute multipleFaults : Base_Types::Boolean;
  }

  // Responsibility-bearing semantic Threads.
  part def ImageEventQualification :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port imageSignal : DataPort { in :>> type : ImageSignal; }
    port imageFacts : DataPort { out :>> type : ImageFacts; }

                        
                
                 
                               
                                                                                 
                                              
             
                 
                           
                                                                                                                  
                                                                                             
                                                                                                   
                                                                                                  
                                                                                                                 
                                                                                                      
                                                  
       
  }
  part def DoctorEventQualification :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port doctorSignal : DataPort { in :>> type : DoctorSignal; }
    port reviewFacts : DataPort { out :>> type : ReviewFacts; }

                        
                
                 
                               
                                                                                    
                                                       
             
                 
                           
                                                                                                                 
                                                                                                        
                                                                                                             
                                                                                                     
                                                                                                             
                                                                                                          
                                                    
       
  }
  part def PreparationContextAssessment :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port preparationContext : DataPort { in :>> type : PreparationContext; }
    port contextFacts : DataPort { out :>> type : ContextFacts; }

                        
                
                 
                               
                                                                              
                                                    
             
                 
                           
                                                                                                                      
                                                                         
                                                          
                                                                        
                                                                                      
                                                               
                                                                                             
                                                                
                                                                                
                                                                
                                                                    
                                                                           
                                                      
       
  }
  part def AvailabilityServiceAssessment :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port availabilityService : DataPort { in :>> type : ServiceObservation; }
    port serviceFacts : DataPort { out :>> type : ServiceFacts; }

                        
                
                 
                               
                                                                       
                                               
             
                 
                           
                                                                                                                      
                                                                                                              
                                                                                                                    
                                                                                                                          
                                                                     
                                                                                                                     
       
  }
  part def FaultComposition :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port imageFacts : DataPort { in :>> type : ImageFacts; }
    port reviewFacts : DataPort { in :>> type : ReviewFacts; }
    port contextFacts : DataPort { in :>> type : ContextFacts; }
    port serviceFacts : DataPort { in :>> type : ServiceFacts; }
    port faultSummary : DataPort { out :>> type : FaultSummary; }

                        
                
                 
                               
                                                                           
                                                
                                                              
                                                 
             
                 
                           
                                                                                                                 
                                         
                                                   
                                                     
                                                       
                                                       
                                                            
                                                                
                                                                  
                                           
                                                    
                                                                                                
                                                                                                       
                                                                                                                      
                                                      
                                                                                                  
                                                                                                                
                                                                    
                                                        
                                                                                                       
                                                                                                                      
                                                        
                                                                                                                
                                                                    
                                                             
                                                                                                                      
                                                                                                                     
                 
                                 
                                                                                    
                                                       
                                                                          
                                                                                                
                                                                           
                                                                                         
                                                             
                                                                            
                                                                                         
                                                                                                      
                                                                            
                                                                                         
                                                                                               
                                                                  
                                                                                
                                                                                         
                                                                                               
                                                                                                                    
                                                                               
                                                                                         
                                                                                               
                                                                                                             
                                                                      
                                                                               
                                                         
                                                                  
       
  }
  part def RecoveryControl :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port recoveryEvent : DataPort { in :>> type : RecoveryEvent; }
    port faultSummary : DataPort { in :>> type : FaultSummary; }
    port recoveryFrame : DataPort { out :>> type : RecoveryFrame; }

                        
           
                         
                                 
                
                 
                               
                                                                                             
                                               
                                                                  
                                                
                                                     
                                                          
                                                               
                                                           
             
                     
                           
                                                                                                                            
                                                      
                                                                                                  
                                                         
                                                                    
                                                   
                                                       
                                                           
                                                                                                                
                                                                              
                                                         
                                                                                
                                                                                                                
                                                                            
                                                                                        
                           
                                                                                            
                                                       
                                                                                                   
                                                    
                                                         
                                                                                                         
                                                                                                      
                                                                 
                                                             
                           
                                                                               
                                                                                               
                                                   
                                                           
                                                                                                            
                                                                                                      
                                                                 
                                                             
                           
                                                                                  
                                                                                                 
                                                       
                                                       
                                                                                                        
                                                                                                      
                                                                 
                                                             
                           
                                                                                               
                                                                                             
                                                    
                                                         
                                                                                                         
                                                                                                     
                                                                 
                                                             
                           
                                                                                                        
                                                       
                                                                                                   
                                                     
                                                                                                   
                                                                                                      
                                                                                               
                                                                                              
                                                                                             
                                                            
                                                                 
                                                             
       
  }
  part def EvidenceLifecycle :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port imageFacts : DataPort { in :>> type : ImageFacts; }
    port contextFacts : DataPort { in :>> type : ContextFacts; }
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    port evidenceFrame : DataPort { out :>> type : EvidenceFrame; }

                        
           
                         
                                 
                
                 
                               
                                                                    
                                                                                                  
                                                   
             
                     
                           
                                                                                          
                                                       
                                                          
                                                                                                             
                           
                                                                                                                        
                                                                                               
                                                                                                            
                                                     
                           
                                                                            
                                                                                                
                                                  
                                                                                                            
                                                     
                           
                                                                                                                        
                                                                                                
                                                 
                                                                              
                                                                                                             
                                                          
                                                                      
                                                                                                             
                                                          
                           
                                                                                                         
                                                                                                
                                                                                       
                                                                                              
                                                                                          
       
  }
  part def AdmissionDecisionOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port imageFacts : DataPort { in :>> type : ImageFacts; }
    port contextFacts : DataPort { in :>> type : ContextFacts; }
    port serviceFacts : DataPort { in :>> type : ServiceFacts; }
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    port evidenceFrame : DataPort { in :>> type : EvidenceFrame; }
    port admissionFrame : DataPort { out :>> type : AdmissionFrame; }

                        
                
                 
                               
                                                                   
                                                             
                                                                           
             
                 
                           
                                                                                                              
                                                          
                                                                
                                                                                    
                                                                                              
                                                                
                                                                                 
                                                                                       
                                                                            
                                                                  
                                                                                        
                                                                                       
                                                                     
                                                                                                         
                                                                 
                                                                             
                                                                                       
                                                                     
                                                                            
                                                                                                         
                                                            
                                                                      
                                                                                     
                                                                                       
                                                                     
                                                                            
                                                                                                         
                                                            
                                                                
                                                                                
       
  }
  part def ArtifactLifecycle :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port imageFacts : DataPort { in :>> type : ImageFacts; }
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    port admissionFrame : DataPort { in :>> type : AdmissionFrame; }
    port reviewFacts : DataPort { in :>> type : ReviewFacts; }
    port artifactFrame : DataPort { out :>> type : ArtifactFrame; }

                        
           
                         
                                 
                
                 
                               
                                                                      
                                                                                                  
                                                                                             
                                                                                         
             
                     
                           
                                                                                                                   
                                                       
                                                                                                                  
                                                                                               
                                                                                           
                           
                                                                                                                        
                                                                                               
                                                                                                            
                                                                                               
                                                                                           
                           
                                                                                                                      
                                                                                                
                                                  
                                                                                                                    
                                                                                              
                                                                                           
                           
                                                                                                                                   
                                                                                                
                                                   
                                                                    
                                                                        
                                                             
                                                                        
                                                                                              
                                                                                           
                           
                                                                                                                          
                                                                                                
                                                                                                     
                                                                                                       
                                                    
                                                        
                                                                                                            
                                                                                                       
                                                        
                                                            
                                                                                                            
                                                                                                         
                                                        
                           
                                                                                                                       
                                                                                                
                                                                                                    
                                                                                              
                                                                                               
                                                                                           
       
  }
  part def AvailabilityDecisionOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port serviceFacts : DataPort { in :>> type : ServiceFacts; }
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    port evidenceFrame : DataPort { in :>> type : EvidenceFrame; }
    port artifactFrame : DataPort { in :>> type : ArtifactFrame; }
    port availabilityFrame : DataPort { out :>> type : AvailabilityDecisionFrame; }

                        
                
                 
                               
                                                                                    
                                                                        
                                                                        
             
                 
                           
                                                                                                                           
                                                          
                                                                           
                                                                              
                                                                                                        
                                                           
                                                                           
                                                                                   
                                                  
                                                                                                               
                                                                            
                                                                           
                                                                                     
                                                  
                                                                                                               
                                                                                                                 
                                                                           
                                                                                 
                                                  
                                                                                                               
                                                                                                                 
                                                                           
                                                                   
       
  }
  part def ReviewLifecycle :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port reviewFacts : DataPort { in :>> type : ReviewFacts; }
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    port availabilityFrame : DataPort { in :>> type : AvailabilityDecisionFrame; }
    port reviewFrame : DataPort { out :>> type : ReviewFrame; }

                        
           
                         
                             
                
                 
                               
                                                
                                                                                     
             
                     
                           
                                                                                        
                                                       
                                                                                                       
                           
                                                                                                                      
                                                                                           
                                                                                               
                           
                                                                                                            
                                                                                            
                                                                         
                                                                                               
                           
                                                                                                      
                                                                                            
                                                                          
                                                      
                                                                                                     
                           
                                                                                                                          
                                                                                            
                                                                          
                                                                                                  
                                                          
                                                                  
                           
                                                                                                                             
                                                                                            
                                                                          
                                                         
                                                                  
                                                                                                   
                                                          
                                                                                                  
       
  }
  part def PresentationDecisionOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port availabilityFrame : DataPort { in :>> type : AvailabilityDecisionFrame; }
    port reviewFrame : DataPort { in :>> type : ReviewFrame; }
    port presentationFrame : DataPort { out :>> type : PresentationFrame; }

                        
                
                 
                               
                                                                        
                                                                    
             
                 
                           
                                                                                                            
                                                                                 
                                                                          
                                                                          
                                                                          
                                                                           
                                                                          
                                                                     
                                                                          
                                                                          
                                                                     
                                                                           
                                                                          
                                                              
                                                                          
                                                                         
       
  }
  part def AvailabilityArbitration :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    port admissionFrame : DataPort { in :>> type : AdmissionFrame; }
    port artifactFrame : DataPort { in :>> type : ArtifactFrame; }
    port presentationFrame : DataPort { in :>> type : PresentationFrame; }
    port evidenceFrame : DataPort { in :>> type : EvidenceFrame; }
    port availabilityFrame : DataPort { in :>> type : AvailabilityDecisionFrame; }
    port reviewFrame : DataPort { in :>> type : ReviewFrame; }
    port decisionFrame : DataPort { out :>> type : DecisionFrame; }

                        
                
                 
                               
                                                                                    
                                                                 
                                                                             
                                                                                                       
                                                     
                                                          
                                                               
                                                                                                                 
                                                                                                                
                                                       
             
                 
                          
                                                                                                                               
                                                                        
                                                                      
                                                                              
                                                                                        
                                                                        
                                                                                            
                                                                        
                                                                        
                                                                  
                                                 
                                                                            
                     
                           
                                                                                                            
                                                                                                     
                                                                                    
                                                                               
                           
                                                                                         
                                                                                                      
                                                     
                                                                               
                                                                                 
                           
                                                                                                        
                                                                                                      
                                                                                             
                                                                             
                                                                              
                                                                                      
                                                                          
                                                                                     
                           
                                                                                            
                                                                                                      
                                                                                               
                                                                       
                                                                            
                                                                            
                           
                                                                                     
                                                                                                      
                                                                                               
                                                                                                              
                                                                             
                                                                                  
                           
                                                                                                     
                                                                                                      
                                                                                               
                                                     
                                                                          
                                                                           
                                                                                        
                                                                      
                                                                                  
                                                                                 
                                                                       
                                                                              
                           
                                                                       
                                                                                                      
                                                                                               
                                                     
                                                                        
                                                                       
                                                                       
                                                                           
                                                                              
       
  }
  part def PublicationComposition :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port decisionFrame : DataPort { in :>> type : DecisionFrame; }
    port upstreamDisposition : DataPort { out :>> type : UpstreamDisposition; }
    port analysisAvailability : DataPort { out :>> type : AvailabilityFrame; }

                        
                
                 
                               
                                                                                                         
                                                                  
                                                                
                                                                  
                                                                                    
                                                                         
                                                                       
                                                                       
                                                                  
                                                        
                                                                      
                                                         
             
                 
                           
                                                                                                                 
                                                                                   
                                                                          
                                                                       
                                                                              
                                                                         
                                                                       
                                                                            
                                                                        
                                                                       
                                                                            
                                                                        
                                                                        
                                                                           
                                                                     
                                                                       
                                                                          
                                                                     
                                                                        
                                                                           
                                                                     
                                                                        
                                                                          
                                                                     
                                                                      
                 
                           
                                                                                                                   
                                                                                 
                                                                               
                                                                               
                                                                               
                                                                           
                                                                                      
                                                                               
                                                                                         
                 
                           
                                                                                                                                        
                                                                  
                                                                      
                                                                                                         
                                                                         
                                                                                                 
                                                                               
                                                                            
                                                                                                 
                                                                        
                                                                           
                                                                       
                                                                                                 
                                                                        
                                                                    
                                                                   
                                                                              
                                                                        
                                                                                                 
                                                                        
                                                                    
                                                                
                                                                   
                                                                   
                                                                       
                                                                                
                                                                        
                                                                                                 
                                                                   
                                                                    
                                                                
                                                                   
                                                                
                                                                    
                                                                            
                                                                       
                                                                                                 
                                                                        
                                                                   
                                                                    
                                                                
                                                                   
                                                                
                                                                    
                                                                            
                                                                    
       
  }

  part def EITAvailabilityProcess :> Process {
    port imageSignal : DataPort { in :>> type : ImageSignal; }
    port doctorSignal : DataPort { in :>> type : DoctorSignal; }
    port preparationContext : DataPort { in :>> type : PreparationContext; }
    port availabilityService : DataPort { in :>> type : ServiceObservation; }
    port recoveryEvent : DataPort { in :>> type : RecoveryEvent; }
    port upstreamDisposition : DataPort { out :>> type : UpstreamDisposition; }
    port analysisAvailability : DataPort { out :>> type : AvailabilityFrame; }

    part image_event_qualification : ImageEventQualification;
    part doctor_event_qualification : DoctorEventQualification;
    part preparation_context_assessment : PreparationContextAssessment;
    part availability_service_assessment : AvailabilityServiceAssessment;
    part fault_composition : FaultComposition;
    part recovery_control : RecoveryControl;
    part evidence_lifecycle : EvidenceLifecycle;
    part admission_decision : AdmissionDecisionOwner;
    part artifact_lifecycle : ArtifactLifecycle;
    part availability_decision : AvailabilityDecisionOwner;
    part review_lifecycle : ReviewLifecycle;
    part presentation_decision : PresentationDecisionOwner;
    part availability_arbitration : AvailabilityArbitration;
    part publication_composition : PublicationComposition;

    // Boundary support routes (uncredited).
    connection support01 : PortConnection connect imageSignal to image_event_qualification.imageSignal;
    connection support02 : PortConnection connect doctorSignal to doctor_event_qualification.doctorSignal;
    connection support03 : PortConnection connect preparationContext to preparation_context_assessment.preparationContext;
    connection support04 : PortConnection connect availabilityService to availability_service_assessment.availabilityService;
    connection support05 : PortConnection connect recoveryEvent to recovery_control.recoveryEvent;
    connection support06 : PortConnection connect publication_composition.upstreamDisposition to upstreamDisposition;
    connection support07 : PortConnection connect publication_composition.analysisAvailability to analysisAvailability;

    // Exactly 34 credited cross-usage semantic interactions.
    connection int01 : PortConnection connect image_event_qualification.imageFacts to fault_composition.imageFacts;
    connection int02 : PortConnection connect image_event_qualification.imageFacts to evidence_lifecycle.imageFacts;
    connection int03 : PortConnection connect image_event_qualification.imageFacts to admission_decision.imageFacts;
    connection int04 : PortConnection connect image_event_qualification.imageFacts to artifact_lifecycle.imageFacts;
    connection int05 : PortConnection connect doctor_event_qualification.reviewFacts to fault_composition.reviewFacts;
    connection int06 : PortConnection connect doctor_event_qualification.reviewFacts to review_lifecycle.reviewFacts;
    connection int07 : PortConnection connect preparation_context_assessment.contextFacts to fault_composition.contextFacts;
    connection int08 : PortConnection connect preparation_context_assessment.contextFacts to evidence_lifecycle.contextFacts;
    connection int09 : PortConnection connect preparation_context_assessment.contextFacts to admission_decision.contextFacts;
    connection int10 : PortConnection connect availability_service_assessment.serviceFacts to fault_composition.serviceFacts;
    connection int11 : PortConnection connect availability_service_assessment.serviceFacts to admission_decision.serviceFacts;
    connection int12 : PortConnection connect availability_service_assessment.serviceFacts to availability_decision.serviceFacts;
    connection int13 : PortConnection connect fault_composition.faultSummary to recovery_control.faultSummary;
    connection int14 : PortConnection connect recovery_control.recoveryFrame to evidence_lifecycle.recoveryFrame;
    connection int15 : PortConnection connect recovery_control.recoveryFrame to admission_decision.recoveryFrame;
    connection int16 : PortConnection connect recovery_control.recoveryFrame to artifact_lifecycle.recoveryFrame;
    connection int17 : PortConnection connect recovery_control.recoveryFrame to availability_decision.recoveryFrame;
    connection int18 : PortConnection connect recovery_control.recoveryFrame to review_lifecycle.recoveryFrame;
    connection int19 : PortConnection connect recovery_control.recoveryFrame to availability_arbitration.recoveryFrame;
    connection int20 : PortConnection connect evidence_lifecycle.evidenceFrame to admission_decision.evidenceFrame;
    connection int21 : PortConnection connect evidence_lifecycle.evidenceFrame to availability_decision.evidenceFrame;
    connection int22 : PortConnection connect admission_decision.admissionFrame to artifact_lifecycle.admissionFrame;
    connection int23 : PortConnection connect admission_decision.admissionFrame to availability_arbitration.admissionFrame;
    connection int24 : PortConnection connect artifact_lifecycle.artifactFrame to availability_decision.artifactFrame;
    connection int25 : PortConnection connect artifact_lifecycle.artifactFrame to availability_arbitration.artifactFrame;
    connection int26 : PortConnection connect availability_decision.availabilityFrame to review_lifecycle.availabilityFrame;
    connection int27 : PortConnection connect availability_decision.availabilityFrame to presentation_decision.availabilityFrame;
    connection int28 : PortConnection connect review_lifecycle.reviewFrame to presentation_decision.reviewFrame;
    connection int29 : PortConnection connect presentation_decision.presentationFrame to availability_arbitration.presentationFrame;
    connection int30 : PortConnection connect availability_arbitration.decisionFrame to publication_composition.decisionFrame;
    connection int31 : PortConnection connect evidence_lifecycle.evidenceFrame to availability_arbitration.evidenceFrame;
    connection int32 : PortConnection connect availability_decision.availabilityFrame to availability_arbitration.availabilityFrame;
    connection int33 : PortConnection connect review_lifecycle.reviewFrame to availability_arbitration.reviewFrame;
    connection int34 : PortConnection connect doctor_event_qualification.reviewFacts to artifact_lifecycle.reviewFacts;
  }

  part def EITImageAvailabilitySystem :> System {
    port imageSignal : DataPort { in :>> type : ImageSignal; }
    port doctorSignal : DataPort { in :>> type : DoctorSignal; }
    port preparationContext : DataPort { in :>> type : PreparationContext; }
    port availabilityService : DataPort { in :>> type : ServiceObservation; }
    port recoveryEvent : DataPort { in :>> type : RecoveryEvent; }
    port upstreamDisposition : DataPort { out :>> type : UpstreamDisposition; }
    port analysisAvailability : DataPort { out :>> type : AvailabilityFrame; }

    part coordination : EITAvailabilityProcess;
    connection boundary01 : PortConnection connect imageSignal to coordination.imageSignal;
    connection boundary02 : PortConnection connect doctorSignal to coordination.doctorSignal;
    connection boundary03 : PortConnection connect preparationContext to coordination.preparationContext;
    connection boundary04 : PortConnection connect availabilityService to coordination.availabilityService;
    connection boundary05 : PortConnection connect recoveryEvent to coordination.recoveryEvent;
    connection boundary06 : PortConnection connect coordination.upstreamDisposition to upstreamDisposition;
    connection boundary07 : PortConnection connect coordination.analysisAvailability to analysisAvailability;
  }

  part eit_image_availability_system : EITImageAvailabilitySystem;
}
