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
    port imageSignal : DataPort { in :>> type : ImageSignal; }
    port imageFacts : DataPort { out :>> type : ImageFacts; }

    language "GUMBO" /*{
      initialize
        guarantee init: imageFacts == ImageFacts::NO_IMAGE;

      compute
        compute_cases
          case qualification:
            guarantee
              (imageSignal == ImageSignal::NONE implies imageFacts == ImageFacts::NO_IMAGE) &
              (imageSignal == ImageSignal::GENERATED implies imageFacts == ImageFacts::NEW_IMAGE) &
              (imageSignal == ImageSignal::REVOKED implies imageFacts == ImageFacts::WITHDRAWAL) &
              (imageSignal == ImageSignal::UPSTREAM_FAILURE implies imageFacts == ImageFacts::REPORTED_FAILURE) &
              ((imageSignal == ImageSignal::INVALID_A | imageSignal == ImageSignal::INVALID_B) implies imageFacts == ImageFacts::INVALID);
    }*/
  }
  part def DoctorEventQualification :> Thread {
    port doctorSignal : DataPort { in :>> type : DoctorSignal; }
    port reviewFacts : DataPort { out :>> type : ReviewFacts; }

    language "GUMBO" /*{
      initialize
        guarantee init: reviewFacts == ReviewFacts::NO_REVIEW_EVENT;
      compute
        compute_cases
          case qualification:
            guarantee
              (doctorSignal == DoctorSignal::NONE implies reviewFacts == ReviewFacts::NO_REVIEW_EVENT) &
              (doctorSignal == DoctorSignal::REQUEST_VIEW implies reviewFacts == ReviewFacts::VIEW_REQUEST) &
              (doctorSignal == DoctorSignal::ACK_VIEW implies reviewFacts == ReviewFacts::VIEW_ACK) &
              (doctorSignal == DoctorSignal::DISMISS_VIEW implies reviewFacts == ReviewFacts::VIEW_DISMISS) &
              ((doctorSignal == DoctorSignal::INVALID_A | doctorSignal == DoctorSignal::INVALID_B) implies reviewFacts == ReviewFacts::INVALID);
    }*/
  }
  part def PreparationContextAssessment :> Thread {
    port preparationContext : DataPort { in :>> type : PreparationContext; }
    port contextFacts : DataPort { out :>> type : ContextFacts; }

    language "GUMBO" /*{
      initialize
        guarantee init: contextFacts == ContextFacts::NO_CONTEXT;
      compute
        compute_cases
          case assessment:
            guarantee
              (preparationContext == PreparationContext::NO_REPORT implies contextFacts == ContextFacts::NO_CONTEXT) &
              ((preparationContext == PreparationContext::BELT_REPORTED | preparationContext == PreparationContext::CALIBRATION_REPORTED) implies contextFacts == ContextFacts::PARTIAL_CONTEXT) &
              (preparationContext == PreparationContext::BELT_AND_CALIBRATION_REPORTED implies contextFacts == ContextFacts::COMPLETE_CONTEXT) &
              (preparationContext == PreparationContext::REPORTED_FAILURE implies contextFacts == ContextFacts::REPORTED_FAILURE) &
              ((preparationContext == PreparationContext::INVALID_A | preparationContext == PreparationContext::INVALID_B) implies contextFacts == ContextFacts::INVALID);
    }*/
  }
  part def AvailabilityServiceAssessment :> Thread {
    port availabilityService : DataPort { in :>> type : ServiceObservation; }
    port serviceFacts : DataPort { out :>> type : ServiceFacts; }

    language "GUMBO" /*{
      initialize
        guarantee init: serviceFacts == ServiceFacts::READY;
      compute
        compute_cases
          case assessment:
            guarantee
              (availabilityService == ServiceObservation::READY implies serviceFacts == ServiceFacts::READY) &
              (availabilityService == ServiceObservation::DEGRADED implies serviceFacts == ServiceFacts::DEGRADED) &
              (availabilityService == ServiceObservation::FAILED implies serviceFacts == ServiceFacts::REPORTED_FAILURE) &
              ((availabilityService == ServiceObservation::INVALID_A | availabilityService == ServiceObservation::INVALID_B) implies serviceFacts == ServiceFacts::INVALID);
    }*/
  }
  part def FaultComposition :> Thread {
    port imageFacts : DataPort { in :>> type : ImageFacts; }
    port reviewFacts : DataPort { in :>> type : ReviewFacts; }
    port contextFacts : DataPort { in :>> type : ContextFacts; }
    port serviceFacts : DataPort { in :>> type : ServiceFacts; }
    port faultSummary : DataPort { out :>> type : FaultSummary; }

    language "TEXT" /*
      initialize
        guarantee init: !faultSummary.faultPresent & faultSummary.dominantFault == DominantFault::NONE & !faultSummary.multipleFaults;
      compute
        compute_cases
          case c1:
            guarantee
              (faultSummary.faultPresent == (imageFacts == ImageFacts::INVALID | reviewFacts == ReviewFacts::INVALID | contextFacts == ContextFacts::INVALID | serviceFacts == ServiceFacts::INVALID | imageFacts == ImageFacts::REPORTED_FAILURE | contextFacts == ContextFacts::REPORTED_FAILURE | serviceFacts == ServiceFacts::REPORTED_FAILURE)) &
              (imageFacts == ImageFacts::INVALID implies faultSummary.dominantFault == DominantFault::IMAGE_INPUT) &
              (imageFacts != ImageFacts::INVALID & reviewFacts == ReviewFacts::INVALID implies faultSummary.dominantFault == DominantFault::DOCTOR_INPUT) &
              (imageFacts != ImageFacts::INVALID & reviewFacts != ReviewFacts::INVALID & contextFacts == ContextFacts::INVALID implies faultSummary.dominantFault == DominantFault::CONTEXT_INPUT) &
              (imageFacts != ImageFacts::INVALID & reviewFacts != ReviewFacts::INVALID & contextFacts != ContextFacts::INVALID & serviceFacts == ServiceFacts::INVALID implies faultSummary.dominantFault == DominantFault::SERVICE_INPUT) &
              (imageFacts != ImageFacts::INVALID & reviewFacts != ReviewFacts::INVALID & contextFacts != ContextFacts::INVALID & serviceFacts != ServiceFacts::INVALID & imageFacts == ImageFacts::REPORTED_FAILURE implies faultSummary.dominantFault == DominantFault::UPSTREAM_REPORTED) &
              (imageFacts != ImageFacts::INVALID & reviewFacts != ReviewFacts::INVALID & contextFacts != ContextFacts::INVALID & serviceFacts != ServiceFacts::INVALID & imageFacts != ImageFacts::REPORTED_FAILURE & contextFacts == ContextFacts::REPORTED_FAILURE implies faultSummary.dominantFault == DominantFault::CONTEXT_REPORTED) &
              (imageFacts != ImageFacts::INVALID & reviewFacts != ReviewFacts::INVALID & contextFacts != ContextFacts::INVALID & serviceFacts != ServiceFacts::INVALID & imageFacts != ImageFacts::REPORTED_FAILURE & contextFacts != ContextFacts::REPORTED_FAILURE & serviceFacts == ServiceFacts::REPORTED_FAILURE implies faultSummary.dominantFault == DominantFault::SERVICE_REPORTED) &
              (!faultSummary.faultPresent implies faultSummary.dominantFault == DominantFault::NONE);
    }*/
                        
                
                 
                               
                                                                           
                                                
                                                              
                                                 
             
                 
                           
                                                                                                                 
                                         
                                                   
                                                     
                                                       
                                                       
                                                            
                                                                
                                                                  
                                           
                                                    
                                                                                                
                                                                                                       
                                                                                                                      
                                                      
                                                                                                  
                                                                                                                
                                                                    
                                                        
                                                                                                       
                                                                                                                      
                                                        
                                                                                                                
                                                                    
                                                             
                                                                                                                      
                                                                                                                     
                 
                                 
                                                                                    
                                                       
                                                                          
                                                                                                
                                                                           
                                                                                         
                                                             
                                                                            
                                                                                         
                                                                                                      
                                                                            
                                                                                         
                                                                                               
                                                                  
                                                                                
                                                                                         
                                                                                               
                                                                                                                    
                                                                               
                                                                                         
                                                                                               
                                                                                                             
                                                                      
                                                                               
                                                         
                                                                  
       
  }
  part def RecoveryControl :> Thread {
    port recoveryEvent : DataPort { in :>> type : RecoveryEvent; }
    port faultSummary : DataPort { in :>> type : FaultSummary; }
    port recoveryFrame : DataPort { out :>> type : RecoveryFrame; }

    language "TEXT" /*
      state
        recovery : RecoveryState;
      initialize
        guarantee init: recovery == RecoveryState::HEALTHY & recoveryFrame.recoveryState == RecoveryState::HEALTHY & recoveryFrame.recoveryOpen & !recoveryFrame.recoveryReleased & !recoveryFrame.effectiveFaultPresent & recoveryFrame.dominantFault == DominantFault::NONE & !recoveryFrame.effectiveMultipleFaults;
      compute
        compute_cases
          case c1:
            guarantee
              ((faultSummary.faultPresent | recoveryEvent == RecoveryEvent::INVALID_A | recoveryEvent == RecoveryEvent::INVALID_B) implies recovery == RecoveryState::LATCHED & recoveryFrame.recoveryState == RecoveryState::LATCHED & !recoveryFrame.recoveryOpen & !recoveryFrame.recoveryReleased & recoveryFrame.effectiveFaultPresent) &
              (!faultSummary.faultPresent & recoveryEvent != RecoveryEvent::INVALID_A & recoveryEvent != RecoveryEvent::INVALID_B & In(recovery) == RecoveryState::HEALTHY implies recovery == RecoveryState::HEALTHY & recoveryFrame.recoveryState == RecoveryState::HEALTHY & recoveryFrame.recoveryOpen & !recoveryFrame.recoveryReleased & !recoveryFrame.effectiveFaultPresent & recoveryFrame.dominantFault == DominantFault::NONE & !recoveryFrame.effectiveMultipleFaults) &
              (!faultSummary.faultPresent & In(recovery) == RecoveryState::LATCHED & recoveryEvent == RecoveryEvent::RESET implies recovery == RecoveryState::VERIFYING & recoveryFrame.recoveryState == RecoveryState::VERIFYING & !recoveryFrame.recoveryOpen & !recoveryFrame.recoveryReleased & !recoveryFrame.effectiveFaultPresent & recoveryFrame.dominantFault == DominantFault::NONE & !recoveryFrame.effectiveMultipleFaults) &
              (!faultSummary.faultPresent & In(recovery) == RecoveryState::VERIFYING & recoveryEvent == RecoveryEvent::VERIFY_OK implies recovery == RecoveryState::ARMED & recoveryFrame.recoveryState == RecoveryState::ARMED & !recoveryFrame.recoveryOpen & !recoveryFrame.recoveryReleased & !recoveryFrame.effectiveFaultPresent & recoveryFrame.dominantFault == DominantFault::NONE & !recoveryFrame.effectiveMultipleFaults) &
              (!faultSummary.faultPresent & In(recovery) == RecoveryState::ARMED & recoveryEvent == RecoveryEvent::RESUME implies recovery == RecoveryState::HEALTHY & recoveryFrame.recoveryState == RecoveryState::HEALTHY & recoveryFrame.recoveryOpen & recoveryFrame.recoveryReleased & !recoveryFrame.effectiveFaultPresent & recoveryFrame.dominantFault == DominantFault::NONE & !recoveryFrame.effectiveMultipleFaults);
    }*/
                        
           
                         
                                 
                
                 
                               
                                                                                             
                                               
                                                                  
                                                
                                                     
                                                          
                                                               
                                                           
             
                     
                           
                                                                                                                            
                                                      
                                                                                                  
                                                         
                                                                    
                                                   
                                                       
                                                           
                                                                                                                
                                                                              
                                                         
                                                                                
                                                                                                                
                                                                            
                                                                                        
                           
                                                                                            
                                                       
                                                                                                   
                                                    
                                                         
                                                                                                         
                                                                                                      
                                                                 
                                                             
                           
                                                                               
                                                                                               
                                                   
                                                           
                                                                                                            
                                                                                                      
                                                                 
                                                             
                           
                                                                                  
                                                                                                 
                                                       
                                                       
                                                                                                        
                                                                                                      
                                                                 
                                                             
                           
                                                                                               
                                                                                             
                                                    
                                                         
                                                                                                         
                                                                                                     
                                                                 
                                                             
                           
                                                                                                        
                                                       
                                                                                                   
                                                     
                                                                                                   
                                                                                                      
                                                                                               
                                                                                              
                                                                                             
                                                            
                                                                 
                                                             
       
  }
  part def EvidenceLifecycle :> Thread {
    port imageFacts : DataPort { in :>> type : ImageFacts; }
    port contextFacts : DataPort { in :>> type : ContextFacts; }
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    port evidenceFrame : DataPort { out :>> type : EvidenceFrame; }

    language "TEXT" /*
      state
        evidence : EvidenceState;
      initialize
        guarantee init: evidence == EvidenceState::EMPTY & evidenceFrame.evidenceState == EvidenceState::EMPTY & !evidenceFrame.contextAccepted;
      compute
        compute_cases
          case c1:
            guarantee
              (!recoveryFrame.recoveryOpen implies evidence == EvidenceState::RECOVERY & evidenceFrame.evidenceState == EvidenceState::RECOVERY & !evidenceFrame.contextAccepted) &
              (recoveryFrame.recoveryOpen & In(evidence) == EvidenceState::RECOVERY implies evidence == EvidenceState::EMPTY & evidenceFrame.evidenceState == EvidenceState::EMPTY & !evidenceFrame.contextAccepted) &
              (recoveryFrame.recoveryOpen & In(evidence) != EvidenceState::RECOVERY & imageFacts == ImageFacts::WITHDRAWAL implies evidence == EvidenceState::EMPTY & evidenceFrame.evidenceState == EvidenceState::EMPTY & !evidenceFrame.contextAccepted) &
              (recoveryFrame.recoveryOpen & In(evidence) != EvidenceState::RECOVERY & imageFacts == ImageFacts::NEW_IMAGE & contextFacts == ContextFacts::COMPLETE_CONTEXT implies evidence == EvidenceState::ACCEPTED & evidenceFrame.evidenceState == EvidenceState::ACCEPTED & evidenceFrame.contextAccepted) &
              (recoveryFrame.recoveryOpen & In(evidence) != EvidenceState::RECOVERY & imageFacts == ImageFacts::NEW_IMAGE & contextFacts != ContextFacts::COMPLETE_CONTEXT implies evidence == EvidenceState::REJECTED & evidenceFrame.evidenceState == EvidenceState::REJECTED & !evidenceFrame.contextAccepted) &
              (recoveryFrame.recoveryOpen & In(evidence) != EvidenceState::RECOVERY & imageFacts != ImageFacts::WITHDRAWAL & imageFacts != ImageFacts::NEW_IMAGE implies evidence == In(evidence) & evidenceFrame.evidenceState == In(evidence) & (evidenceFrame.contextAccepted == (In(evidence) == EvidenceState::ACCEPTED)));
    }*/
                        
           
                         
                                 
                
                 
                               
                                                                    
                                                                                                  
                                                   
             
                     
                           
                                                                                          
                                                       
                                                          
                                                                                                             
                           
                                                                                                                        
                                                                                               
                                                                                                            
                                                     
                           
                                                                            
                                                                                                
                                                  
                                                                                                            
                                                     
                           
                                                                                                                        
                                                                                                
                                                 
                                                                              
                                                                                                             
                                                          
                                                                      
                                                                                                             
                                                          
                           
                                                                                                         
                                                                                                
                                                                                       
                                                                                              
                                                                                          
       
  }
  part def AdmissionDecisionOwner :> Thread {
    port imageFacts : DataPort { in :>> type : ImageFacts; }
    port contextFacts : DataPort { in :>> type : ContextFacts; }
    port serviceFacts : DataPort { in :>> type : ServiceFacts; }
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    port evidenceFrame : DataPort { in :>> type : EvidenceFrame; }
    port admissionFrame : DataPort { out :>> type : AdmissionFrame; }

    language "TEXT" /*
      initialize
        guarantee init: admissionFrame.outcome == AdmissionOutcome::NONE & admissionFrame.admissionReason == AdmissionReason::NO_CANDIDATE;
      compute
        compute_cases
          case c1:
            guarantee
              (!recoveryFrame.recoveryOpen implies admissionFrame.outcome == AdmissionOutcome::NONE & admissionFrame.admissionReason == AdmissionReason::RECOVERY_CLOSED) &
              (recoveryFrame.recoveryOpen & imageFacts != ImageFacts::NEW_IMAGE implies admissionFrame.outcome == AdmissionOutcome::NONE & admissionFrame.admissionReason == AdmissionReason::NO_CANDIDATE) &
              (recoveryFrame.recoveryOpen & imageFacts == ImageFacts::NEW_IMAGE & evidenceFrame.evidenceState == EvidenceState::REJECTED implies admissionFrame.outcome == AdmissionOutcome::REJECT & admissionFrame.admissionReason == AdmissionReason::EVIDENCE_INCOMPLETE) &
              (recoveryFrame.recoveryOpen & imageFacts == ImageFacts::NEW_IMAGE & evidenceFrame.evidenceState == EvidenceState::ACCEPTED & contextFacts == ContextFacts::COMPLETE_CONTEXT & serviceFacts == ServiceFacts::READY implies admissionFrame.outcome == AdmissionOutcome::ADMIT & admissionFrame.admissionReason == AdmissionReason::ELIGIBLE) &
              (recoveryFrame.recoveryOpen & imageFacts == ImageFacts::NEW_IMAGE & evidenceFrame.evidenceState != EvidenceState::REJECTED & evidenceFrame.evidenceState != EvidenceState::ACCEPTED & contextFacts == ContextFacts::COMPLETE_CONTEXT & serviceFacts == ServiceFacts::DEGRADED implies admissionFrame.outcome == AdmissionOutcome::QUARANTINE & admissionFrame.admissionReason == AdmissionReason::SERVICE_DEGRADED);
    }*/
                        
                
                 
                               
                                                                   
                                                             
                                                                           
             
                 
                           
                                                                                                              
                                                          
                                                                
                                                                                    
                                                                                              
                                                                
                                                                                 
                                                                                       
                                                                            
                                                                  
                                                                                        
                                                                                       
                                                                     
                                                                                                         
                                                                 
                                                                             
                                                                                       
                                                                     
                                                                            
                                                                                                         
                                                            
                                                                      
                                                                                     
                                                                                       
                                                                     
                                                                            
                                                                                                         
                                                            
                                                                
                                                                                
       
  }
  part def ArtifactLifecycle :> Thread {
    port imageFacts : DataPort { in :>> type : ImageFacts; }
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    port admissionFrame : DataPort { in :>> type : AdmissionFrame; }
    port reviewFacts : DataPort { in :>> type : ReviewFacts; }
    port artifactFrame : DataPort { out :>> type : ArtifactFrame; }

    language "TEXT" /*
      state
        artifact : ArtifactState;
      initialize
        guarantee init: artifact == ArtifactState::EMPTY & artifactFrame.artifactState == ArtifactState::EMPTY & !artifactFrame.withdrawProposal & !artifactFrame.rejectProposal & !artifactFrame.acceptProposal & !artifactFrame.closureWindow;
      compute
        compute_cases
          case c1:
            guarantee
              (!recoveryFrame.recoveryOpen implies artifact == ArtifactState::RECOVERY & artifactFrame.artifactState == ArtifactState::RECOVERY & !artifactFrame.withdrawProposal & !artifactFrame.rejectProposal & !artifactFrame.acceptProposal & !artifactFrame.closureWindow) &
              (recoveryFrame.recoveryOpen & In(artifact) == ArtifactState::RECOVERY implies artifact == ArtifactState::EMPTY & artifactFrame.artifactState == ArtifactState::EMPTY & !artifactFrame.withdrawProposal & !artifactFrame.rejectProposal & !artifactFrame.acceptProposal & !artifactFrame.closureWindow) &
              (recoveryFrame.recoveryOpen & In(artifact) != ArtifactState::RECOVERY & imageFacts == ImageFacts::WITHDRAWAL implies artifact == ArtifactState::WITHDRAWN & artifactFrame.artifactState == ArtifactState::WITHDRAWN & artifactFrame.withdrawProposal & !artifactFrame.rejectProposal & !artifactFrame.acceptProposal & !artifactFrame.closureWindow) &
              (recoveryFrame.recoveryOpen & In(artifact) != ArtifactState::RECOVERY & imageFacts != ImageFacts::WITHDRAWAL & (admissionFrame.outcome == AdmissionOutcome::REJECT | admissionFrame.outcome == AdmissionOutcome::QUARANTINE) implies artifact == ArtifactState::QUARANTINED & artifactFrame.artifactState == ArtifactState::QUARANTINED & !artifactFrame.withdrawProposal & artifactFrame.rejectProposal & !artifactFrame.acceptProposal & !artifactFrame.closureWindow) &
              (recoveryFrame.recoveryOpen & In(artifact) != ArtifactState::RECOVERY & imageFacts != ImageFacts::WITHDRAWAL & admissionFrame.outcome == AdmissionOutcome::ADMIT & In(artifact) == ArtifactState::STAGED & (reviewFacts == ReviewFacts::VIEW_ACK | reviewFacts == ReviewFacts::VIEW_DISMISS) implies artifact == ArtifactState::EMPTY & artifactFrame.artifactState == ArtifactState::EMPTY & !artifactFrame.withdrawProposal & !artifactFrame.rejectProposal & artifactFrame.acceptProposal & artifactFrame.closureWindow) &
              (recoveryFrame.recoveryOpen & In(artifact) != ArtifactState::RECOVERY & imageFacts != ImageFacts::WITHDRAWAL & admissionFrame.outcome == AdmissionOutcome::ADMIT & !(In(artifact) == ArtifactState::STAGED & (reviewFacts == ReviewFacts::VIEW_ACK | reviewFacts == ReviewFacts::VIEW_DISMISS)) implies artifact == ArtifactState::STAGED & artifactFrame.artifactState == ArtifactState::STAGED & !artifactFrame.withdrawProposal & !artifactFrame.rejectProposal & artifactFrame.acceptProposal & !artifactFrame.closureWindow) &
              (recoveryFrame.recoveryOpen & In(artifact) != ArtifactState::RECOVERY & imageFacts != ImageFacts::WITHDRAWAL & admissionFrame.outcome == AdmissionOutcome::NONE implies artifact == In(artifact) & artifactFrame.artifactState == In(artifact) & !artifactFrame.withdrawProposal & !artifactFrame.rejectProposal & !artifactFrame.acceptProposal & !artifactFrame.closureWindow);
    }*/
                        
           
                         
                                 
                
                 
                               
                                                                      
                                                                                                  
                                                                                             
                                                                                         
             
                     
                           
                                                                                                                   
                                                       
                                                                                                                  
                                                                                               
                                                                                           
                           
                                                                                                                        
                                                                                               
                                                                                                            
                                                                                               
                                                                                           
                           
                                                                                                                      
                                                                                                
                                                  
                                                                                                                    
                                                                                              
                                                                                           
                           
                                                                                                                                   
                                                                                                
                                                   
                                                                    
                                                                        
                                                             
                                                                        
                                                                                              
                                                                                           
                           
                                                                                                                          
                                                                                                
                                                                                                     
                                                                                                       
                                                    
                                                        
                                                                                                            
                                                                                                       
                                                        
                                                            
                                                                                                            
                                                                                                         
                                                        
                           
                                                                                                                       
                                                                                                
                                                                                                    
                                                                                              
                                                                                               
                                                                                           
       
  }
  part def AvailabilityDecisionOwner :> Thread {
    port serviceFacts : DataPort { in :>> type : ServiceFacts; }
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    port evidenceFrame : DataPort { in :>> type : EvidenceFrame; }
    port artifactFrame : DataPort { in :>> type : ArtifactFrame; }
    port availabilityFrame : DataPort { out :>> type : AvailabilityDecisionFrame; }

    language "TEXT" /*
      initialize
        guarantee init: availabilityFrame.decision == AvailabilityDecision::BLOCKED & availabilityFrame.blockReason == BlockReason::RECOVERY_BLOCK;
      compute
        compute_cases
          case c1:
            guarantee
              (!recoveryFrame.recoveryOpen implies availabilityFrame.decision == AvailabilityDecision::BLOCKED & availabilityFrame.blockReason == BlockReason::RECOVERY_BLOCK) &
              (recoveryFrame.recoveryOpen & artifactFrame.artifactState != ArtifactState::STAGED & !artifactFrame.closureWindow implies availabilityFrame.decision == AvailabilityDecision::BLOCKED & availabilityFrame.blockReason == BlockReason::ARTIFACT_NOT_STAGED) &
              (recoveryFrame.recoveryOpen & (artifactFrame.artifactState == ArtifactState::STAGED | artifactFrame.closureWindow) & evidenceFrame.evidenceState != EvidenceState::ACCEPTED implies availabilityFrame.decision == AvailabilityDecision::BLOCKED & availabilityFrame.blockReason == BlockReason::EVIDENCE_NOT_ACCEPTED) &
              (recoveryFrame.recoveryOpen & (artifactFrame.artifactState == ArtifactState::STAGED | artifactFrame.closureWindow) & evidenceFrame.evidenceState == EvidenceState::ACCEPTED & serviceFacts != ServiceFacts::READY implies availabilityFrame.decision == AvailabilityDecision::BLOCKED & availabilityFrame.blockReason == BlockReason::SERVICE_NOT_READY) &
              (recoveryFrame.recoveryOpen & (artifactFrame.artifactState == ArtifactState::STAGED | artifactFrame.closureWindow) & evidenceFrame.evidenceState == EvidenceState::ACCEPTED & serviceFacts == ServiceFacts::READY implies availabilityFrame.decision == AvailabilityDecision::ALLOWED & availabilityFrame.blockReason == BlockReason::NONE);
    }*/
                        
                
                 
                               
                                                                                    
                                                                        
                                                                        
             
                 
                           
                                                                                                                           
                                                          
                                                                           
                                                                              
                                                                                                        
                                                           
                                                                           
                                                                                   
                                                  
                                                                                                               
                                                                            
                                                                           
                                                                                     
                                                  
                                                                                                               
                                                                                                                 
                                                                           
                                                                                 
                                                  
                                                                                                               
                                                                                                                 
                                                                           
                                                                   
       
  }
  part def ReviewLifecycle :> Thread {
    port reviewFacts : DataPort { in :>> type : ReviewFacts; }
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    port availabilityFrame : DataPort { in :>> type : AvailabilityDecisionFrame; }
    port reviewFrame : DataPort { out :>> type : ReviewFrame; }

    language "TEXT" /*
      state
        review : ReviewState;
      initialize
        guarantee init: review == ReviewState::IDLE & reviewFrame.reviewState == ReviewState::IDLE;
      compute
        compute_cases
          case c1:
            guarantee
              (!recoveryFrame.recoveryOpen implies review == ReviewState::RECOVERY & reviewFrame.reviewState == ReviewState::RECOVERY) &
              (recoveryFrame.recoveryOpen & In(review) == ReviewState::RECOVERY implies review == ReviewState::IDLE & reviewFrame.reviewState == ReviewState::IDLE) &
              (recoveryFrame.recoveryOpen & In(review) != ReviewState::RECOVERY & availabilityFrame.decision == AvailabilityDecision::BLOCKED implies review == ReviewState::IDLE & reviewFrame.reviewState == ReviewState::IDLE) &
              (recoveryFrame.recoveryOpen & In(review) != ReviewState::RECOVERY & availabilityFrame.decision == AvailabilityDecision::ALLOWED & reviewFacts == ReviewFacts::VIEW_REQUEST implies review == ReviewState::VIEWING & reviewFrame.reviewState == ReviewState::VIEWING) &
              (recoveryFrame.recoveryOpen & In(review) != ReviewState::RECOVERY & availabilityFrame.decision == AvailabilityDecision::ALLOWED & (reviewFacts == ReviewFacts::VIEW_ACK | reviewFacts == ReviewFacts::VIEW_DISMISS) implies review == ReviewState::ACKNOWLEDGED & reviewFrame.reviewState == ReviewState::ACKNOWLEDGED) &
              (recoveryFrame.recoveryOpen & In(review) != ReviewState::RECOVERY & availabilityFrame.decision == AvailabilityDecision::ALLOWED & reviewFacts == ReviewFacts::NO_REVIEW_EVENT & In(review) == ReviewState::VIEWING implies review == ReviewState::VIEWING & reviewFrame.reviewState == ReviewState::VIEWING) &
              (recoveryFrame.recoveryOpen & In(review) != ReviewState::RECOVERY & availabilityFrame.decision == AvailabilityDecision::ALLOWED & reviewFacts == ReviewFacts::NO_REVIEW_EVENT & In(review) != ReviewState::VIEWING implies review == ReviewState::OFFERED & reviewFrame.reviewState == ReviewState::OFFERED);
    }*/
                        
           
                         
                             
                
                 
                               
                                                
                                                                                     
             
                     
                           
                                                                                        
                                                       
                                                                                                       
                           
                                                                                                                      
                                                                                           
                                                                                               
                           
                                                                                                            
                                                                                            
                                                                         
                                                                                               
                           
                                                                                                      
                                                                                            
                                                                          
                                                      
                                                                                                     
                           
                                                                                                                          
                                                                                            
                                                                          
                                                                                                  
                                                          
                                                                  
                           
                                                                                                                             
                                                                                            
                                                                          
                                                         
                                                                  
                                                                                                   
                                                          
                                                                                                  
       
  }
  part def PresentationDecisionOwner :> Thread {
    port availabilityFrame : DataPort { in :>> type : AvailabilityDecisionFrame; }
    port reviewFrame : DataPort { in :>> type : ReviewFrame; }
    port presentationFrame : DataPort { out :>> type : PresentationFrame; }

    language "TEXT" /*
      initialize
        guarantee init: presentationFrame.proposal == PresentationProposal::NONE;
      compute
        compute_cases
          case c1:
            guarantee
              (availabilityFrame.decision == AvailabilityDecision::BLOCKED implies presentationFrame.proposal == PresentationProposal::NONE) &
              (availabilityFrame.decision == AvailabilityDecision::ALLOWED & reviewFrame.reviewState == ReviewState::ACKNOWLEDGED implies presentationFrame.proposal == PresentationProposal::CLOSE) &
              (availabilityFrame.decision == AvailabilityDecision::ALLOWED & reviewFrame.reviewState == ReviewState::VIEWING implies presentationFrame.proposal == PresentationProposal::OPEN) &
              (availabilityFrame.decision == AvailabilityDecision::ALLOWED & reviewFrame.reviewState == ReviewState::OFFERED implies presentationFrame.proposal == PresentationProposal::OFFER) &
              (availabilityFrame.decision == AvailabilityDecision::ALLOWED & (reviewFrame.reviewState == ReviewState::IDLE | reviewFrame.reviewState == ReviewState::RECOVERY) implies presentationFrame.proposal == PresentationProposal::NONE);
    }*/
                        
                
                 
                               
                                                                        
                                                                    
             
                 
                           
                                                                                                            
                                                                                 
                                                                          
                                                                          
                                                                          
                                                                           
                                                                          
                                                                     
                                                                          
                                                                          
                                                                     
                                                                           
                                                                          
                                                              
                                                                          
                                                                         
       
  }
  part def AvailabilityArbitration :> Thread {
    port recoveryFrame : DataPort { in :>> type : RecoveryFrame; }
    port admissionFrame : DataPort { in :>> type : AdmissionFrame; }
    port artifactFrame : DataPort { in :>> type : ArtifactFrame; }
    port presentationFrame : DataPort { in :>> type : PresentationFrame; }
    port evidenceFrame : DataPort { in :>> type : EvidenceFrame; }
    port availabilityFrame : DataPort { in :>> type : AvailabilityDecisionFrame; }
    port reviewFrame : DataPort { in :>> type : ReviewFrame; }
    port decisionFrame : DataPort { out :>> type : DecisionFrame; }

    language "TEXT" /*
      initialize
        guarantee init: decisionFrame.selectedAction == SelectedAction::HOLD & decisionFrame.selectedReason == SelectedReason::NO_ELIGIBLE_WORK & decisionFrame.recoveryState == RecoveryState::HEALTHY & decisionFrame.recoveryOpen & !decisionFrame.recoveryReleased & !decisionFrame.effectiveFaultPresent & decisionFrame.dominantFault == DominantFault::NONE & !decisionFrame.effectiveMultipleFaults & decisionFrame.evidenceState == EvidenceState::EMPTY & decisionFrame.artifactState == ArtifactState::EMPTY & decisionFrame.reviewState == ReviewState::IDLE & !decisionFrame.availabilityAllowed;
      compute
        compute_cases
          case c1:
            guarantee
              (decisionFrame.recoveryState == recoveryFrame.recoveryState & (decisionFrame.recoveryOpen == recoveryFrame.recoveryOpen) & (decisionFrame.recoveryReleased == recoveryFrame.recoveryReleased) & (decisionFrame.effectiveFaultPresent == recoveryFrame.effectiveFaultPresent) & decisionFrame.dominantFault == recoveryFrame.dominantFault & (decisionFrame.effectiveMultipleFaults == recoveryFrame.effectiveMultipleFaults) & decisionFrame.evidenceState == evidenceFrame.evidenceState & decisionFrame.artifactState == artifactFrame.artifactState & decisionFrame.reviewState == reviewFrame.reviewState & (decisionFrame.availabilityAllowed == (availabilityFrame.decision == AvailabilityDecision::ALLOWED))) &
              ((recoveryFrame.effectiveFaultPresent | !recoveryFrame.recoveryOpen) implies decisionFrame.selectedAction == SelectedAction::SAFE_WITHHOLD & decisionFrame.selectedReason == SelectedReason::FAULT_OR_RECOVERY) &
              (!recoveryFrame.effectiveFaultPresent & recoveryFrame.recoveryOpen & artifactFrame.withdrawProposal implies decisionFrame.selectedAction == SelectedAction::WITHDRAW & decisionFrame.selectedReason == SelectedReason::UPSTREAM_WITHDRAWAL) &
              (!recoveryFrame.effectiveFaultPresent & recoveryFrame.recoveryOpen & !artifactFrame.withdrawProposal & artifactFrame.rejectProposal & admissionFrame.outcome == AdmissionOutcome::QUARANTINE implies decisionFrame.selectedAction == SelectedAction::REJECT & decisionFrame.selectedReason == SelectedReason::SERVICE_QUARANTINE) &
              (!recoveryFrame.effectiveFaultPresent & recoveryFrame.recoveryOpen & !artifactFrame.withdrawProposal & artifactFrame.rejectProposal & admissionFrame.outcome == AdmissionOutcome::REJECT implies decisionFrame.selectedAction == SelectedAction::REJECT & decisionFrame.selectedReason == SelectedReason::EVIDENCE_REJECTION) &
              (!recoveryFrame.effectiveFaultPresent & recoveryFrame.recoveryOpen & !artifactFrame.withdrawProposal & !artifactFrame.rejectProposal & presentationFrame.proposal == PresentationProposal::CLOSE implies decisionFrame.selectedAction == SelectedAction::CLOSE & decisionFrame.selectedReason == SelectedReason::DOCTOR_CLOSURE) &
              (!recoveryFrame.effectiveFaultPresent & recoveryFrame.recoveryOpen & !artifactFrame.withdrawProposal & !artifactFrame.rejectProposal & presentationFrame.proposal != PresentationProposal::CLOSE & artifactFrame.acceptProposal implies decisionFrame.selectedAction == SelectedAction::ACCEPT & decisionFrame.selectedReason == SelectedReason::NEW_IMAGE_ACCEPTANCE);
    }*/
                        
                
                 
                               
                                                                                    
                                                                 
                                                                             
                                                                                                       
                                                     
                                                          
                                                               
                                                                                                                 
                                                                                                                
                                                       
             
                 
                          
                                                                                                                               
                                                                        
                                                                      
                                                                              
                                                                                        
                                                                        
                                                                                            
                                                                        
                                                                        
                                                                  
                                                 
                                                                            
                     
                           
                                                                                                            
                                                                                                     
                                                                                    
                                                                               
                           
                                                                                         
                                                                                                      
                                                     
                                                                               
                                                                                 
                           
                                                                                                        
                                                                                                      
                                                                                             
                                                                             
                                                                              
                                                                                      
                                                                          
                                                                                     
                           
                                                                                            
                                                                                                      
                                                                                               
                                                                       
                                                                            
                                                                            
                           
                                                                                     
                                                                                                      
                                                                                               
                                                                                                              
                                                                             
                                                                                  
                           
                                                                                                     
                                                                                                      
                                                                                               
                                                     
                                                                          
                                                                           
                                                                                        
                                                                      
                                                                                  
                                                                                 
                                                                       
                                                                              
                           
                                                                       
                                                                                                      
                                                                                               
                                                     
                                                                        
                                                                       
                                                                       
                                                                           
                                                                              
       
  }
  part def PublicationComposition :> Thread {
    port decisionFrame : DataPort { in :>> type : DecisionFrame; }
    port upstreamDisposition : DataPort { out :>> type : UpstreamDisposition; }
    port analysisAvailability : DataPort { out :>> type : AvailabilityFrame; }

    language "TEXT" /*
      initialize
        guarantee init: upstreamDisposition == UpstreamDisposition::NO_ACTION & analysisAvailability.publicMode == PublicMode::IDLE & analysisAvailability.visibility == Visibility::HIDDEN & analysisAvailability.selectedReason == SelectedReason::NO_ELIGIBLE_WORK & analysisAvailability.recoveryState == RecoveryState::HEALTHY & analysisAvailability.evidenceState == EvidenceState::EMPTY & analysisAvailability.artifactState == ArtifactState::EMPTY & analysisAvailability.reviewState == ReviewState::IDLE & !analysisAvailability.faultPresent & analysisAvailability.dominantFault == DominantFault::NONE & !analysisAvailability.multipleFaults;
      compute
        compute_cases
          case c1:
            guarantee
              (decisionFrame.selectedAction == SelectedAction::SAFE_WITHHOLD implies upstreamDisposition == UpstreamDisposition::PAUSE_DELIVERY & analysisAvailability.visibility == Visibility::HIDDEN) &
              (decisionFrame.selectedAction == SelectedAction::WITHDRAW implies upstreamDisposition == UpstreamDisposition::ACK_WITHDRAWN & analysisAvailability.visibility == Visibility::HIDDEN) &
              (decisionFrame.selectedAction == SelectedAction::REJECT implies upstreamDisposition == UpstreamDisposition::REJECT_IMAGE & analysisAvailability.visibility == Visibility::HIDDEN) &
              (decisionFrame.selectedAction == SelectedAction::ACCEPT implies upstreamDisposition == UpstreamDisposition::ACCEPT_IMAGE & analysisAvailability.visibility == Visibility::OFFERED) &
              (decisionFrame.selectedAction == SelectedAction::CLOSE implies upstreamDisposition == UpstreamDisposition::NO_ACTION & analysisAvailability.visibility == Visibility::CLOSED) &
              (decisionFrame.selectedAction == SelectedAction::OPEN implies upstreamDisposition == UpstreamDisposition::NO_ACTION & analysisAvailability.visibility == Visibility::VISIBLE) &
              (decisionFrame.selectedAction == SelectedAction::OFFER implies upstreamDisposition == UpstreamDisposition::NO_ACTION & analysisAvailability.visibility == Visibility::OFFERED) &
              (decisionFrame.selectedAction == SelectedAction::HOLD implies upstreamDisposition == UpstreamDisposition::NO_ACTION & analysisAvailability.visibility == Visibility::HIDDEN) &
              (analysisAvailability.selectedReason == decisionFrame.selectedReason & analysisAvailability.recoveryState == decisionFrame.recoveryState & analysisAvailability.evidenceState == decisionFrame.evidenceState & analysisAvailability.artifactState == decisionFrame.artifactState & analysisAvailability.reviewState == decisionFrame.reviewState & (analysisAvailability.faultPresent == decisionFrame.effectiveFaultPresent) & analysisAvailability.dominantFault == decisionFrame.dominantFault & (analysisAvailability.multipleFaults == decisionFrame.effectiveMultipleFaults));
    }*/
                        
                
                 
                               
                                                                                                         
                                                                  
                                                                
                                                                  
                                                                                    
                                                                         
                                                                       
                                                                       
                                                                  
                                                        
                                                                      
                                                         
             
                 
                           
                                                                                                                 
                                                                                   
                                                                          
                                                                       
                                                                              
                                                                         
                                                                       
                                                                            
                                                                        
                                                                       
                                                                            
                                                                        
                                                                        
                                                                           
                                                                     
                                                                       
                                                                          
                                                                     
                                                                        
                                                                           
                                                                     
                                                                        
                                                                          
                                                                     
                                                                      
                 
                           
                                                                                                                   
                                                                                 
                                                                               
                                                                               
                                                                               
                                                                           
                                                                                      
                                                                               
                                                                                         
                 
                           
                                                                                                                                        
                                                                  
                                                                      
                                                                                                         
                                                                         
                                                                                                 
                                                                               
                                                                            
                                                                                                 
                                                                        
                                                                           
                                                                       
                                                                                                 
                                                                        
                                                                    
                                                                   
                                                                              
                                                                        
                                                                                                 
                                                                        
                                                                    
                                                                
                                                                   
                                                                   
                                                                       
                                                                                
                                                                        
                                                                                                 
                                                                   
                                                                    
                                                                
                                                                   
                                                                
                                                                    
                                                                            
                                                                       
                                                                                                 
                                                                        
                                                                   
                                                                    
                                                                
                                                                   
                                                                
                                                                    
                                                                            
                                                                    
       
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
