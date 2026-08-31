package Observation_Acquisition_Radio_Delivery_Coordinator {
  private import HAMR::*;

  enum def ObservationIntent {
    enum NO_REQUEST;
    enum START_OBSERVATION;
    enum CANCEL_OBSERVATION;
  }

  enum def BatteryCapacityBand {
    enum LOW;
    enum USABLE;
  }

  enum def BatteryCheck {
    enum INVALID;
    enum VALID;
  }

  enum def SortieContext {
    enum OUTSIDE_OBSERVATION_POSITION;
    enum AT_OBSERVATION_POSITION;
  }

  enum def CameraCondition {
    enum UNAVAILABLE;
    enum READY;
  }

  enum def CaptureResult {
    enum NONE;
    enum CAPTURED;
    enum FAILED;
  }

  enum def RadioCondition {
    enum UNAVAILABLE;
    enum READY;
  }

  enum def DeliveryResult {
    enum NONE;
    enum ACCEPTED;
    enum REJECTED;
  }

  enum def CameraAcquisitionCommand {
    enum HOLD;
    enum ACQUIRE;
  }

  enum def RadioDeliveryCommand {
    enum HOLD;
    enum SEND_OBSERVATION;
  }

  enum def DroneControlObservationNotice {
    enum IDLE;
    enum OBSERVATION_ACTIVE;
    enum OBSERVATION_BLOCKED;
    enum DELIVERY_REPORTED;
  }

  enum def BatteryAssessment {
    enum UNAVAILABLE;
    enum LOW;
    enum ADEQUATE;
  }

  enum def SortieQualification {
    enum BLOCKED_EVIDENCE;
    enum BLOCKED_ENERGY;
    enum BLOCKED_CONTEXT;
    enum ELIGIBLE;
  }

  enum def CameraEvidence {
    enum UNAVAILABLE;
    enum READY;
    enum CAPTURED;
    enum FAILED;
  }

  enum def RadioEvidence {
    enum UNAVAILABLE;
    enum READY;
    enum ACCEPTED;
    enum REJECTED;
  }

  enum def ObservationSessionState {
    enum IDLE;
    enum ACQUIRING;
    enum QUEUED;
    enum SENDING;
    enum SUSPENDED;
  }

  enum def SessionProposal {
    enum BLOCK_EVIDENCE;
    enum BLOCK_ENERGY;
    enum BLOCK_CONTEXT;
    enum BLOCK_CAMERA;
    enum BLOCK_RADIO;
    enum RECOVER_EVIDENCE;
    enum RECOVER_ENERGY;
    enum RECOVER_CONTEXT;
    enum RECOVER_CAMERA;
    enum RECOVER_RADIO;
    enum STARTABLE;
    enum HOLD;
    enum CAPTURE_COMPLETE;
    enum BEGIN_DELIVERY;
    enum DELIVERY_COMPLETE;
    enum DELIVERY_REJECTED;
  }

  enum def SessionDecision {
    enum NO_CHANGE;
    enum BEGIN_ACQUISITION;
    enum CANCEL_TO_IDLE;
    enum SUSPEND_EVIDENCE;
    enum SUSPEND_ENERGY;
    enum SUSPEND_CONTEXT;
    enum SUSPEND_CAMERA;
    enum SUSPEND_RADIO;
    enum QUEUE_CAPTURE;
    enum BEGIN_TRANSMISSION;
    enum COMPLETE_TO_IDLE;
    enum RETRY_QUEUE;
    enum REJECT_EVIDENCE;
    enum REJECT_ENERGY;
    enum REJECT_CONTEXT;
    enum REJECT_CAMERA;
    enum REJECT_RADIO;
  }

  enum def CoordinationDisposition {
    enum NO_CHANGE;
    enum STARTED;
    enum CANCELLED;
    enum PROGRESSED;
    enum COMPLETED;
    enum RECOVERY_APPLIED;
    enum REJECTED;
  }

  enum def CoordinationReason {
    enum NONE;
    enum CANCELLED;
    enum EVIDENCE_UNAVAILABLE;
    enum ENERGY_LOW;
    enum CONTEXT_INELIGIBLE;
    enum CAMERA_UNUSABLE;
    enum RADIO_UNAVAILABLE;
  }

  enum def OperatorAdvisory {
    enum NONE;
    enum EVIDENCE_UNAVAILABLE;
    enum ENERGY_LOW;
    enum CONTEXT_INELIGIBLE;
    enum CAMERA_UNUSABLE;
    enum RADIO_UNAVAILABLE;
    enum REQUEST_REJECTED;
    enum DELIVERY_COMPLETED;
  }

  enum def SnapshotPreSessionState {
    enum IDLE;
    enum ACQUIRING;
    enum QUEUED;
    enum SENDING;
    enum SUSPENDED;
  }

  enum def SnapshotNextSessionState {
    enum IDLE;
    enum ACQUIRING;
    enum QUEUED;
    enum SENDING;
    enum SUSPENDED;
  }

  enum def SnapshotCoordinationDisposition {
    enum NO_CHANGE;
    enum STARTED;
    enum CANCELLED;
    enum PROGRESSED;
    enum COMPLETED;
    enum RECOVERY_APPLIED;
    enum REJECTED;
  }

  enum def SnapshotCoordinationReason {
    enum NONE;
    enum CANCELLED;
    enum EVIDENCE_UNAVAILABLE;
    enum ENERGY_LOW;
    enum CONTEXT_INELIGIBLE;
    enum CAMERA_UNUSABLE;
    enum RADIO_UNAVAILABLE;
  }

  enum def StatusSessionState {
    enum IDLE;
    enum ACQUIRING;
    enum QUEUED;
    enum SENDING;
    enum SUSPENDED;
  }

  enum def StatusCoordinationDisposition {
    enum NO_CHANGE;
    enum STARTED;
    enum CANCELLED;
    enum PROGRESSED;
    enum COMPLETED;
    enum RECOVERY_APPLIED;
    enum REJECTED;
  }

  enum def StatusCoordinationReason {
    enum NONE;
    enum CANCELLED;
    enum EVIDENCE_UNAVAILABLE;
    enum ENERGY_LOW;
    enum CONTEXT_INELIGIBLE;
    enum CAMERA_UNUSABLE;
    enum RADIO_UNAVAILABLE;
  }

  part def SessionSnapshot :> Data {
    attribute preSession : SnapshotPreSessionState;
    attribute nextSession : SnapshotNextSessionState;
    attribute disposition : SnapshotCoordinationDisposition;
    attribute reason : SnapshotCoordinationReason;
  }

  part def OperatorCoordinationStatus :> Data {
    attribute nextSession : StatusSessionState;
    attribute batteryAssessment : BatteryAssessment;
    attribute disposition : StatusCoordinationDisposition;
    attribute reason : StatusCoordinationReason;
    attribute advisory : OperatorAdvisory;
  }

  part def BatteryEvidenceQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port batteryAssessment : DataPort { out :>> type : BatteryAssessment; }

    language "GUMBO" /*{
                
                                          
                                                       
                                                                 
                                                                                                  
                                                         
                                                                                                     
                                                             

      compute
        compute_cases
          case CASE_01_INVALID_EVIDENCE:
            assume batteryCheck == BatteryCheck.INVALID;
            guarantee batteryAssessment == BatteryAssessment.UNAVAILABLE;
          case CASE_02_VALID_LOW:
            assume batteryCheck == BatteryCheck.VALID & batteryCapacity == BatteryCapacityBand.LOW;
            guarantee batteryAssessment == BatteryAssessment.LOW;
          case CASE_03_VALID_USABLE:
            assume batteryCheck == BatteryCheck.VALID & batteryCapacity == BatteryCapacityBand.USABLE;
            guarantee batteryAssessment == BatteryAssessment.ADEQUATE;
    }*/

                        
                
                 
                           
                                                                                           
                                                           
                                                                     
                                                                                                      
                                                             
                                                                                                         
                                                                 
             
                     
                           
                                                                                                            
                                                        
                                                                         
                           
                                                                        
                                                                                                   
                                                                 
                           
                                                                                   
                                                                                                      
                                                                      
       
  }

  part def SortieApplicabilityQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    port sortieContext : DataPort { in :>> type : SortieContext; }
    port sortieQualification : DataPort { out :>> type : SortieQualification; }

    language "GUMBO" /*{
                
                                            
                                                                                                                                    
                                                                                                                          
                                                                                                                                                                                              
                                                                                                                                                                                 
      compute
        compute_cases
          case CASE_04_EVIDENCE_BLOCK:
            assume batteryAssessment == BatteryAssessment.UNAVAILABLE;
            guarantee sortieQualification == SortieQualification.BLOCKED_EVIDENCE;
          case CASE_05_ENERGY_BLOCK:
            assume batteryAssessment == BatteryAssessment.LOW;
            guarantee sortieQualification == SortieQualification.BLOCKED_ENERGY;
          case CASE_06_CONTEXT_APPLICABILITY:
            assume batteryAssessment == BatteryAssessment.ADEQUATE;
            guarantee
              (sortieContext == SortieContext.AT_OBSERVATION_POSITION implies sortieQualification == SortieQualification.ELIGIBLE) &
              (sortieContext == SortieContext.OUTSIDE_OBSERVATION_POSITION implies sortieQualification == SortieQualification.BLOCKED_CONTEXT);
    }*/

                        
                
                 
                           
                                                                                                              
                                                                         
                                                                              
                                                                 
                                                                            
                                                               
                                                                                  
                                                                             
                                                               
                                                                             
                                                                     
             
                     
                           
                                                                                           
                                                                      
                                                                                  
                           
                                                                             
                                                              
                                                                                
                           
                                                                                                                      
                                                                   
                     
                                                                               
                                                                        
                                                                                    
                                                                              
       
  }

  part def CameraEvidenceQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port cameraCondition : DataPort { in :>> type : CameraCondition; }
    port captureResult : DataPort { in :>> type : CaptureResult; }
    port cameraEvidence : DataPort { out :>> type : CameraEvidence; }

    language "GUMBO" /*{
                
                                       
                                                                                                                 
                                                                                                                                           
                                                                                                                                                  
                                                                                                                                             
      compute
        compute_cases
          case CASE_07_CAMERA_UNAVAILABLE:
            assume cameraCondition == CameraCondition.UNAVAILABLE;
            guarantee cameraEvidence == CameraEvidence.UNAVAILABLE;
          case CASE_08_CAMERA_READY:
            assume cameraCondition == CameraCondition.READY & captureResult == CaptureResult.NONE;
            guarantee cameraEvidence == CameraEvidence.READY;
          case CASE_09_CAMERA_RESULT:
            assume cameraCondition == CameraCondition.READY & captureResult != CaptureResult.NONE;
            guarantee
              (captureResult == CaptureResult.CAPTURED implies cameraEvidence == CameraEvidence.CAPTURED) &
              (captureResult == CaptureResult.FAILED implies cameraEvidence == CameraEvidence.FAILED);
    }*/

                        
                
                 
                           
                                                                                                      
                                                                     
                                                               
                                                                                                     
                                                         
                                                                                                         
                                                            
                                                                                                       
                                                         
             
                     
                           
                                                                                                           
                                                                  
                                                                   
                           
                                                                                        
                                                                                                  
                                                             
                           
                                                                                                      
                                                                                                  
                     
                                                                
                                                              
                                                              
                                                           
       
  }

  part def RadioEvidenceQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    port deliveryResult : DataPort { in :>> type : DeliveryResult; }
    port radioEvidence : DataPort { out :>> type : RadioEvidence; }

    language "GUMBO" /*{
                
                                      
                                                                                                             
                                                                                                                                         
                                                                                                                                                
                                                                                                                                               
      compute
        compute_cases
          case CASE_10_RADIO_UNAVAILABLE:
            assume radioCondition == RadioCondition.UNAVAILABLE;
            guarantee radioEvidence == RadioEvidence.UNAVAILABLE;
          case CASE_11_RADIO_READY:
            assume radioCondition == RadioCondition.READY & deliveryResult == DeliveryResult.NONE;
            guarantee radioEvidence == RadioEvidence.READY;
          case CASE_12_RADIO_RESULT:
            assume radioCondition == RadioCondition.READY & deliveryResult != DeliveryResult.NONE;
            guarantee
              (deliveryResult == DeliveryResult.ACCEPTED implies radioEvidence == RadioEvidence.ACCEPTED) &
              (deliveryResult == DeliveryResult.REJECTED implies radioEvidence == RadioEvidence.REJECTED);
    }*/

                        
                
                 
                           
                                                                                                    
                                                                   
                                                             
                                                                                                     
                                                       
                                                                                                         
                                                          
                                                                                                         
                                                         
             
                     
                           
                                                                                                         
                                                                
                                                                 
                           
                                                                                      
                                                                                                  
                                                           
                           
                                                                                                      
                                                                                                  
                     
                                                                  
                                                            
                                                                  
                                                           
       
  }

  part def SessionProposalOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port sortieQualification : DataPort { in :>> type : SortieQualification; }
    port cameraEvidence : DataPort { in :>> type : CameraEvidence; }
    port radioEvidence : DataPort { in :>> type : RadioEvidence; }
    port sessionPhaseInput : DataPort { in :>> type : ObservationSessionState; }
    port sessionProposal : DataPort { out :>> type : SessionProposal; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CASE_13_PHASE_APPLICABLE_BLOCKER:
            assume
              sortieQualification != SortieQualification.ELIGIBLE |
              (sortieQualification == SortieQualification.ELIGIBLE &
                (sessionPhaseInput == ObservationSessionState.IDLE | sessionPhaseInput == ObservationSessionState.SUSPENDED) &
                (cameraEvidence == CameraEvidence.UNAVAILABLE | radioEvidence == RadioEvidence.UNAVAILABLE)) |
              (sortieQualification == SortieQualification.ELIGIBLE & sessionPhaseInput == ObservationSessionState.ACQUIRING &
                (cameraEvidence == CameraEvidence.UNAVAILABLE | cameraEvidence == CameraEvidence.FAILED | radioEvidence == RadioEvidence.UNAVAILABLE)) |
              (sortieQualification == SortieQualification.ELIGIBLE &
                (sessionPhaseInput == ObservationSessionState.QUEUED | sessionPhaseInput == ObservationSessionState.SENDING) &
                radioEvidence == RadioEvidence.UNAVAILABLE);
            guarantee
              (sortieQualification == SortieQualification.BLOCKED_EVIDENCE &
                (sessionPhaseInput == ObservationSessionState.IDLE | sessionPhaseInput == ObservationSessionState.SUSPENDED) implies sessionProposal == SessionProposal.BLOCK_EVIDENCE) &
              (sortieQualification == SortieQualification.BLOCKED_EVIDENCE &
                (sessionPhaseInput == ObservationSessionState.ACQUIRING | sessionPhaseInput == ObservationSessionState.QUEUED | sessionPhaseInput == ObservationSessionState.SENDING) implies sessionProposal == SessionProposal.RECOVER_EVIDENCE) &
              (sortieQualification == SortieQualification.BLOCKED_ENERGY &
                (sessionPhaseInput == ObservationSessionState.IDLE | sessionPhaseInput == ObservationSessionState.SUSPENDED) implies sessionProposal == SessionProposal.BLOCK_ENERGY) &
              (sortieQualification == SortieQualification.BLOCKED_ENERGY &
                (sessionPhaseInput == ObservationSessionState.ACQUIRING | sessionPhaseInput == ObservationSessionState.QUEUED | sessionPhaseInput == ObservationSessionState.SENDING) implies sessionProposal == SessionProposal.RECOVER_ENERGY) &
              (sortieQualification == SortieQualification.BLOCKED_CONTEXT &
                (sessionPhaseInput == ObservationSessionState.IDLE | sessionPhaseInput == ObservationSessionState.SUSPENDED) implies sessionProposal == SessionProposal.BLOCK_CONTEXT) &
              (sortieQualification == SortieQualification.BLOCKED_CONTEXT &
                (sessionPhaseInput == ObservationSessionState.ACQUIRING | sessionPhaseInput == ObservationSessionState.QUEUED | sessionPhaseInput == ObservationSessionState.SENDING) implies sessionProposal == SessionProposal.RECOVER_CONTEXT) &
              (sortieQualification == SortieQualification.ELIGIBLE &
                (sessionPhaseInput == ObservationSessionState.IDLE | sessionPhaseInput == ObservationSessionState.SUSPENDED) &
                cameraEvidence == CameraEvidence.UNAVAILABLE implies sessionProposal == SessionProposal.BLOCK_CAMERA) &
              (sortieQualification == SortieQualification.ELIGIBLE & sessionPhaseInput == ObservationSessionState.ACQUIRING &
                (cameraEvidence == CameraEvidence.UNAVAILABLE | cameraEvidence == CameraEvidence.FAILED) implies sessionProposal == SessionProposal.RECOVER_CAMERA) &
              (sortieQualification == SortieQualification.ELIGIBLE &
                (sessionPhaseInput == ObservationSessionState.IDLE | sessionPhaseInput == ObservationSessionState.SUSPENDED) &
                cameraEvidence != CameraEvidence.UNAVAILABLE & radioEvidence == RadioEvidence.UNAVAILABLE implies sessionProposal == SessionProposal.BLOCK_RADIO) &
              (sortieQualification == SortieQualification.ELIGIBLE &
                ((sessionPhaseInput == ObservationSessionState.ACQUIRING & cameraEvidence != CameraEvidence.UNAVAILABLE & cameraEvidence != CameraEvidence.FAILED) |
                  sessionPhaseInput == ObservationSessionState.QUEUED | sessionPhaseInput == ObservationSessionState.SENDING) &
                radioEvidence == RadioEvidence.UNAVAILABLE implies sessionProposal == SessionProposal.RECOVER_RADIO);
          case CASE_14_AUTOMATIC_PROGRESS:
            assume sortieQualification == SortieQualification.ELIGIBLE &
              ((sessionPhaseInput == ObservationSessionState.ACQUIRING & cameraEvidence != CameraEvidence.UNAVAILABLE & cameraEvidence != CameraEvidence.FAILED & radioEvidence != RadioEvidence.UNAVAILABLE) |
               (sessionPhaseInput == ObservationSessionState.QUEUED & radioEvidence != RadioEvidence.UNAVAILABLE) |
               (sessionPhaseInput == ObservationSessionState.SENDING & radioEvidence != RadioEvidence.UNAVAILABLE));
            guarantee
              (sessionPhaseInput == ObservationSessionState.ACQUIRING & cameraEvidence == CameraEvidence.CAPTURED implies sessionProposal == SessionProposal.CAPTURE_COMPLETE) &
              (sessionPhaseInput == ObservationSessionState.ACQUIRING & cameraEvidence == CameraEvidence.READY implies sessionProposal == SessionProposal.HOLD) &
              (sessionPhaseInput == ObservationSessionState.QUEUED implies sessionProposal == SessionProposal.BEGIN_DELIVERY) &
              (sessionPhaseInput == ObservationSessionState.SENDING & radioEvidence == RadioEvidence.ACCEPTED implies sessionProposal == SessionProposal.DELIVERY_COMPLETE) &
              (sessionPhaseInput == ObservationSessionState.SENDING & radioEvidence == RadioEvidence.REJECTED implies sessionProposal == SessionProposal.DELIVERY_REJECTED) &
              (sessionPhaseInput == ObservationSessionState.SENDING & radioEvidence == RadioEvidence.READY implies sessionProposal == SessionProposal.HOLD);
          case CASE_15_NONACTIVE_STARTABLE:
            assume sortieQualification == SortieQualification.ELIGIBLE &
              (sessionPhaseInput == ObservationSessionState.IDLE | sessionPhaseInput == ObservationSessionState.SUSPENDED) &
              cameraEvidence != CameraEvidence.UNAVAILABLE & radioEvidence != RadioEvidence.UNAVAILABLE;
            guarantee sessionProposal == SessionProposal.STARTABLE;
    }*/

                        
             
                     
                           
                                                                                                                                     
                                                                        
                                                                    
                                                                                                                             
                                                              
                                                                                                               
                                                                                                                             
                                                                                                          
                                                                                                         
                                                                
                                                                    
                                                                                                                             
                                                           
                     
                                                                             
                                                                                                                                     
                                                                      
                                                                             
                                                                                                                               
                                                                               
                                                                        
                                                                           
                                                                                                                                     
                                                                    
                                                                           
                                                                                                                               
                                                                               
                                                                      
                                                                            
                                                                                                                                     
                                                                     
                                                                            
                                                                                                                               
                                                                               
                                                                       
                                                                     
                                                                                                                              
                                                                     
                                                                    
                                                                                                                              
                                                                                                                 
                                                                      
                                                                     
                                                                                                                              
                                                                                                                  
                                                                   
                                                                     
                                                                                                                         
                                                            
                                                                                                                              
                                                                   
                                                                    
                           
                                                                                                                              
                                                                        
                                                                        
                                                                                                        
                                                             
                                                                                                                   
                                                                                                                    
                     
                                                                                                                           
                                                                        
                                                                                                                        
                                                            
                                                                            
                                                                      
                                                                                                                       
                                                                         
                                                                                                                       
                                                                         
                                                                                                                    
                                                           
                           
                                                                                                                 
                                                                        
                                                                                                                            
                                                                                                        
                                                                   
       
  }

  part def ObservationIntentArbiter :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port observationIntent : DataPort { in :>> type : ObservationIntent; }
    port sessionProposal : DataPort { in :>> type : SessionProposal; }
    port sessionDecision : DataPort { out :>> type : SessionDecision; }

    language "GUMBO" /*{
                
                                   
                                                                                                                                 
                                                                                                                                                                                         
                                                                                                                                                                                     
                                                                                                                                                                                       
                                                                                                                                                                                     
                                                                                                                                                                                   
                                                                                                                                                                                      
                                                                                                                                                                                         
                                                                                                                                                                                          
                                                                                                                                                                                     
                                                                                                                                                                                  
                                                                                                                                                                                     
                                                                                                                                                                                 
                                                                                                                                                                                   
                                                                                                                                                                                 
                                                                                                                                                                              
      compute
        compute_cases
          case CASE_16_CANCEL_PRIORITY:
            assume observationIntent == ObservationIntent.CANCEL_OBSERVATION;
            guarantee sessionDecision == SessionDecision.CANCEL_TO_IDLE;
          case CASE_17_RECOVERY_OR_PROGRESS:
            assume observationIntent != ObservationIntent.CANCEL_OBSERVATION &
              (sessionProposal == SessionProposal.RECOVER_EVIDENCE | sessionProposal == SessionProposal.RECOVER_ENERGY |
               sessionProposal == SessionProposal.RECOVER_CONTEXT | sessionProposal == SessionProposal.RECOVER_CAMERA |
               sessionProposal == SessionProposal.RECOVER_RADIO | sessionProposal == SessionProposal.CAPTURE_COMPLETE |
               sessionProposal == SessionProposal.BEGIN_DELIVERY | sessionProposal == SessionProposal.DELIVERY_COMPLETE |
               sessionProposal == SessionProposal.DELIVERY_REJECTED);
            guarantee
              (sessionProposal == SessionProposal.RECOVER_EVIDENCE implies sessionDecision == SessionDecision.SUSPEND_EVIDENCE) &
              (sessionProposal == SessionProposal.RECOVER_ENERGY implies sessionDecision == SessionDecision.SUSPEND_ENERGY) &
              (sessionProposal == SessionProposal.RECOVER_CONTEXT implies sessionDecision == SessionDecision.SUSPEND_CONTEXT) &
              (sessionProposal == SessionProposal.RECOVER_CAMERA implies sessionDecision == SessionDecision.SUSPEND_CAMERA) &
              (sessionProposal == SessionProposal.RECOVER_RADIO implies sessionDecision == SessionDecision.SUSPEND_RADIO) &
              (sessionProposal == SessionProposal.CAPTURE_COMPLETE implies sessionDecision == SessionDecision.QUEUE_CAPTURE) &
              (sessionProposal == SessionProposal.BEGIN_DELIVERY implies sessionDecision == SessionDecision.BEGIN_TRANSMISSION) &
              (sessionProposal == SessionProposal.DELIVERY_COMPLETE implies sessionDecision == SessionDecision.COMPLETE_TO_IDLE) &
              (sessionProposal == SessionProposal.DELIVERY_REJECTED implies sessionDecision == SessionDecision.RETRY_QUEUE);
          case CASE_18_FRESH_START_REJECTION_OR_HOLD:
            assume observationIntent != ObservationIntent.CANCEL_OBSERVATION &
              sessionProposal != SessionProposal.RECOVER_EVIDENCE & sessionProposal != SessionProposal.RECOVER_ENERGY &
              sessionProposal != SessionProposal.RECOVER_CONTEXT & sessionProposal != SessionProposal.RECOVER_CAMERA &
              sessionProposal != SessionProposal.RECOVER_RADIO & sessionProposal != SessionProposal.CAPTURE_COMPLETE &
              sessionProposal != SessionProposal.BEGIN_DELIVERY & sessionProposal != SessionProposal.DELIVERY_COMPLETE &
              sessionProposal != SessionProposal.DELIVERY_REJECTED;
            guarantee
              (observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.STARTABLE implies sessionDecision == SessionDecision.BEGIN_ACQUISITION) &
              (observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.BLOCK_EVIDENCE implies sessionDecision == SessionDecision.REJECT_EVIDENCE) &
              (observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.BLOCK_ENERGY implies sessionDecision == SessionDecision.REJECT_ENERGY) &
              (observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.BLOCK_CONTEXT implies sessionDecision == SessionDecision.REJECT_CONTEXT) &
              (observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.BLOCK_CAMERA implies sessionDecision == SessionDecision.REJECT_CAMERA) &
              (observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.BLOCK_RADIO implies sessionDecision == SessionDecision.REJECT_RADIO) &
              ((observationIntent == ObservationIntent.NO_REQUEST | sessionProposal == SessionProposal.HOLD) implies sessionDecision == SessionDecision.NO_CHANGE);
    }*/

                        
                
                 
                           
                                                                                                                        
                                                                                
                                                                    
                                                                                                                                      
                                                                      
                                                                                                                                    
                                                                    
                                                                                                                                     
                                                                     
                                                                                                                                    
                                                                    
                                                                                                                                   
                                                                   
                                                                                                                                      
                                                                   
                                                                                                                                    
                                                                        
                                                                                                                                       
                                                                      
                                                                                                                                       
                                                                 
                                                                                                                              
                                                                       
                                                                                                                                   
                                                                     
                                                                                                                                 
                                                                   
                                                                                                                                  
                                                                    
                                                                                                                                 
                                                                   
                                                                                                                                
                                                                  
                                                                         
                                                                                                                       
                                                                                                                      
                                                                                                                      
                                                                                                                        
                                                                    
                                                                                                                    
                                                              
             
                     
                           
                                                                                       
                                                                             
                                                                        
                           
                                                                                                                 
                                                                              
                                                                                                                        
                                                                                                                       
                                                                                                                       
                                                                                                                         
                                                                     
                     
                                                                                                                                     
                                                                                                                                 
                                                                                                                                   
                                                                                                                                 
                                                                                                                               
                                                                                                                                  
                                                                                                                                     
                                                                                                                                      
                                                                                                                                
                           
                                                                                                         
                                                                              
                                                                                                                       
                                                                                                                      
                                                                                                                      
                                                                                                                        
                                                                   
                     
                                                                                                                                
                                                                         
                                                                                                                                     
                                                                       
                                                                                                                                   
                                                                     
                                                                                                                                    
                                                                      
                                                                                                                                   
                                                                     
                                                                                                                                  
                                                                    
                                                                                                                    
                                                                
       
  }

  part def ObservationSessionController :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port sessionDecision : DataPort { in :>> type : SessionDecision; }
    port sessionPhaseOutput : DataPort { out :>> type : ObservationSessionState; }
    port sessionSnapshot : DataPort { out :>> type : SessionSnapshot; }
    port cameraAcquisitionCommand : DataPort { out :>> type : CameraAcquisitionCommand; }
    port radioDeliveryCommand : DataPort { out :>> type : RadioDeliveryCommand; }

    language "GUMBO" /*{
      state
        committedSession: ObservationSessionState;

                
                                                     
                                                            
                                                              
                                                                      
                                                                        
                                                                                    
                                                                     
                                                                     
                                                            

      compute
        guarantee PUBLISH_PRE_SESSION:
          sessionPhaseOutput == committedSession;
        guarantee COMPLETE_SNAPSHOT:
          (committedSession == ObservationSessionState.IDLE implies
            sessionSnapshot.preSession == SnapshotPreSessionState.IDLE & sessionSnapshot.nextSession == SnapshotNextSessionState.IDLE) &
          (committedSession == ObservationSessionState.ACQUIRING implies
            sessionSnapshot.preSession == SnapshotPreSessionState.ACQUIRING & sessionSnapshot.nextSession == SnapshotNextSessionState.ACQUIRING) &
          (committedSession == ObservationSessionState.QUEUED implies
            sessionSnapshot.preSession == SnapshotPreSessionState.QUEUED & sessionSnapshot.nextSession == SnapshotNextSessionState.QUEUED) &
          (committedSession == ObservationSessionState.SENDING implies
            sessionSnapshot.preSession == SnapshotPreSessionState.SENDING & sessionSnapshot.nextSession == SnapshotNextSessionState.SENDING) &
          (committedSession == ObservationSessionState.SUSPENDED implies
            sessionSnapshot.preSession == SnapshotPreSessionState.SUSPENDED & sessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED);
        guarantee CAMERA_COMMAND_FROM_NEXT_STATE:
          (committedSession == ObservationSessionState.ACQUIRING implies cameraAcquisitionCommand == CameraAcquisitionCommand.ACQUIRE) &
          (committedSession != ObservationSessionState.ACQUIRING implies cameraAcquisitionCommand == CameraAcquisitionCommand.HOLD);
        guarantee RADIO_COMMAND_FROM_NEXT_STATE:
          (committedSession == ObservationSessionState.SENDING implies radioDeliveryCommand == RadioDeliveryCommand.SEND_OBSERVATION) &
          (committedSession != ObservationSessionState.SENDING implies radioDeliveryCommand == RadioDeliveryCommand.HOLD);
        guarantee RECOVERY_REASON_PRESERVATION:
          sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED implies
            (sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE |
             sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW |
             sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE |
             sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE |
             sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE);
        compute_cases
          case CASE_19_TOTAL_STATE_COMMAND_RESULT:
            assume T;
            guarantee
              (sessionDecision == SessionDecision.NO_CHANGE implies
                sessionSnapshot.disposition == SnapshotCoordinationDisposition.NO_CHANGE &
                sessionSnapshot.reason == SnapshotCoordinationReason.NONE) &
              (sessionDecision == SessionDecision.BEGIN_ACQUISITION implies
                committedSession == ObservationSessionState.ACQUIRING &
                sessionSnapshot.disposition == SnapshotCoordinationDisposition.STARTED &
                sessionSnapshot.reason == SnapshotCoordinationReason.NONE) &
              (sessionDecision == SessionDecision.CANCEL_TO_IDLE implies
                committedSession == ObservationSessionState.IDLE &
                sessionSnapshot.disposition == SnapshotCoordinationDisposition.CANCELLED &
                sessionSnapshot.reason == SnapshotCoordinationReason.CANCELLED) &
              (sessionDecision == SessionDecision.SUSPEND_EVIDENCE implies committedSession == ObservationSessionState.SUSPENDED & sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED & sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) &
              (sessionDecision == SessionDecision.SUSPEND_ENERGY implies committedSession == ObservationSessionState.SUSPENDED & sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED & sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW) &
              (sessionDecision == SessionDecision.SUSPEND_CONTEXT implies committedSession == ObservationSessionState.SUSPENDED & sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED & sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE) &
              (sessionDecision == SessionDecision.SUSPEND_CAMERA implies committedSession == ObservationSessionState.SUSPENDED & sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED & sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE) &
              (sessionDecision == SessionDecision.SUSPEND_RADIO implies committedSession == ObservationSessionState.SUSPENDED & sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED & sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE) &
              (sessionDecision == SessionDecision.QUEUE_CAPTURE implies committedSession == ObservationSessionState.QUEUED & sessionSnapshot.disposition == SnapshotCoordinationDisposition.PROGRESSED & sessionSnapshot.reason == SnapshotCoordinationReason.NONE) &
              (sessionDecision == SessionDecision.BEGIN_TRANSMISSION implies committedSession == ObservationSessionState.SENDING & sessionSnapshot.disposition == SnapshotCoordinationDisposition.PROGRESSED & sessionSnapshot.reason == SnapshotCoordinationReason.NONE) &
              (sessionDecision == SessionDecision.COMPLETE_TO_IDLE implies committedSession == ObservationSessionState.IDLE & sessionSnapshot.disposition == SnapshotCoordinationDisposition.COMPLETED & sessionSnapshot.reason == SnapshotCoordinationReason.NONE) &
              (sessionDecision == SessionDecision.RETRY_QUEUE implies committedSession == ObservationSessionState.QUEUED & sessionSnapshot.disposition == SnapshotCoordinationDisposition.PROGRESSED & sessionSnapshot.reason == SnapshotCoordinationReason.NONE) &
              (sessionDecision == SessionDecision.REJECT_EVIDENCE implies sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED & sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) &
              (sessionDecision == SessionDecision.REJECT_ENERGY implies sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED & sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW) &
              (sessionDecision == SessionDecision.REJECT_CONTEXT implies sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED & sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE) &
              (sessionDecision == SessionDecision.REJECT_CAMERA implies sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED & sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE) &
              (sessionDecision == SessionDecision.REJECT_RADIO implies sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED & sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE);
    }*/

                        
           
                         
                                                   
                
                 
                           
                                                                                                                                        
                                                              
                                                                
                                                                        
                                                                          
                                                                                      
                                                                       
                                                                       
                                                              
             
                 
                          
                                                                                      
                                                       
                 
                           
                                                                                                        
                                                                           
                                                                             
                                                                                
                                                                                  
                                                                             
                                                                               
                                                                              
                                                                                
                                                                                
                                                                                  
                                                                       
                                                                               
                                                                            
                                                                                    
                                                                         
                                                                                 
                                                                          
                                                                                  
                                                                            
                                                                                   
                 
                           
                                                                                                               
                                                                            
                                                                               
                                                                            
                                                                           
                 
                           
                                                                                                         
                                                                          
                                                                                
                                                                          
                                                                   
                 
                                
                                                                                                                  
                                                                                                     
                                                                                          
                                                                                
                                                                                        
                                                                                     
                                                                                       
                     
                           
                                                                                                                                           
                     
                                                                     
                                                           
                                                                                           
                                                                              
                                                                             
                                                                        
                                                                                         
                                                                              
                                                                          
                                                                   
                                                                                           
                                                                                   
                                                                            
                                                                        
                                                                                                  
                                                                                              
                                                                          
                                                                        
                                                                                                  
                                                                                    
                                                                           
                                                                        
                                                                                                  
                                                                                            
                                                                          
                                                                        
                                                                                                  
                                                                                         
                                                                         
                                                                        
                                                                                                  
                                                                                           
                                                                         
                                                                     
                                                                                            
                                                                              
                                                                              
                                                                      
                                                                                            
                                                                              
                                                                            
                                                                   
                                                                                           
                                                                              
                                                                       
                                                                     
                                                                                            
                                                                              
                                                                           
                                                           
                                                                                          
                                                                                              
                                                                         
                                                           
                                                                                          
                                                                                    
                                                                          
                                                           
                                                                                          
                                                                                            
                                                                         
                                                           
                                                                                          
                                                                                         
                                                                        
                                                           
                                                                                          
                                                                                          
       
  }

  part def CoordinationOutcomePolicy :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    port sessionSnapshot : DataPort { in :>> type : SessionSnapshot; }
    port operatorCoordinationStatus : DataPort { out :>> type : OperatorCoordinationStatus; }
    port droneControlObservationNotice : DataPort { out :>> type : DroneControlObservationNotice; }

    language "GUMBO" /*{
                
                                             
                                                                            

      compute
        compute_cases
          case CASE_20_RECIPIENT_SPECIFIC_OUTCOMES:
            assume T;
            guarantee
              operatorCoordinationStatus.batteryAssessment == batteryAssessment &
              (sessionSnapshot.nextSession == SnapshotNextSessionState.IDLE implies operatorCoordinationStatus.nextSession == StatusSessionState.IDLE) &
              (sessionSnapshot.nextSession == SnapshotNextSessionState.ACQUIRING implies operatorCoordinationStatus.nextSession == StatusSessionState.ACQUIRING) &
              (sessionSnapshot.nextSession == SnapshotNextSessionState.QUEUED implies operatorCoordinationStatus.nextSession == StatusSessionState.QUEUED) &
              (sessionSnapshot.nextSession == SnapshotNextSessionState.SENDING implies operatorCoordinationStatus.nextSession == StatusSessionState.SENDING) &
              (sessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED implies operatorCoordinationStatus.nextSession == StatusSessionState.SUSPENDED) &
              (sessionSnapshot.disposition == SnapshotCoordinationDisposition.NO_CHANGE implies operatorCoordinationStatus.disposition == StatusCoordinationDisposition.NO_CHANGE) &
              (sessionSnapshot.disposition == SnapshotCoordinationDisposition.STARTED implies operatorCoordinationStatus.disposition == StatusCoordinationDisposition.STARTED) &
              (sessionSnapshot.disposition == SnapshotCoordinationDisposition.CANCELLED implies operatorCoordinationStatus.disposition == StatusCoordinationDisposition.CANCELLED) &
              (sessionSnapshot.disposition == SnapshotCoordinationDisposition.PROGRESSED implies operatorCoordinationStatus.disposition == StatusCoordinationDisposition.PROGRESSED) &
              (sessionSnapshot.disposition == SnapshotCoordinationDisposition.COMPLETED implies operatorCoordinationStatus.disposition == StatusCoordinationDisposition.COMPLETED) &
              (sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED implies operatorCoordinationStatus.disposition == StatusCoordinationDisposition.RECOVERY_APPLIED) &
              (sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED implies operatorCoordinationStatus.disposition == StatusCoordinationDisposition.REJECTED) &
              (sessionSnapshot.reason == SnapshotCoordinationReason.NONE implies operatorCoordinationStatus.reason == StatusCoordinationReason.NONE) &
              (sessionSnapshot.reason == SnapshotCoordinationReason.CANCELLED implies operatorCoordinationStatus.reason == StatusCoordinationReason.CANCELLED) &
              (sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE implies operatorCoordinationStatus.reason == StatusCoordinationReason.EVIDENCE_UNAVAILABLE) &
              (sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW implies operatorCoordinationStatus.reason == StatusCoordinationReason.ENERGY_LOW) &
              (sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE implies operatorCoordinationStatus.reason == StatusCoordinationReason.CONTEXT_INELIGIBLE) &
              (sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE implies operatorCoordinationStatus.reason == StatusCoordinationReason.CAMERA_UNUSABLE) &
              (sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE implies operatorCoordinationStatus.reason == StatusCoordinationReason.RADIO_UNAVAILABLE) &
              (batteryAssessment == BatteryAssessment.UNAVAILABLE implies operatorCoordinationStatus.advisory == OperatorAdvisory.EVIDENCE_UNAVAILABLE) &
              (batteryAssessment == BatteryAssessment.LOW implies operatorCoordinationStatus.advisory == OperatorAdvisory.ENERGY_LOW) &
              (batteryAssessment == BatteryAssessment.ADEQUATE & sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED & sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE implies operatorCoordinationStatus.advisory == OperatorAdvisory.EVIDENCE_UNAVAILABLE) &
              (batteryAssessment == BatteryAssessment.ADEQUATE & sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED & sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW implies operatorCoordinationStatus.advisory == OperatorAdvisory.ENERGY_LOW) &
              (batteryAssessment == BatteryAssessment.ADEQUATE & sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED & sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE implies operatorCoordinationStatus.advisory == OperatorAdvisory.CONTEXT_INELIGIBLE) &
              (batteryAssessment == BatteryAssessment.ADEQUATE & sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED & sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE implies operatorCoordinationStatus.advisory == OperatorAdvisory.CAMERA_UNUSABLE) &
              (batteryAssessment == BatteryAssessment.ADEQUATE & sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED & sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE implies operatorCoordinationStatus.advisory == OperatorAdvisory.RADIO_UNAVAILABLE) &
              (batteryAssessment == BatteryAssessment.ADEQUATE & sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED implies operatorCoordinationStatus.advisory == OperatorAdvisory.REQUEST_REJECTED) &
              (batteryAssessment == BatteryAssessment.ADEQUATE & sessionSnapshot.disposition == SnapshotCoordinationDisposition.COMPLETED implies operatorCoordinationStatus.advisory == OperatorAdvisory.DELIVERY_COMPLETED) &
              (batteryAssessment == BatteryAssessment.ADEQUATE &
                ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                  (sessionSnapshot.reason == SnapshotCoordinationReason.NONE | sessionSnapshot.reason == SnapshotCoordinationReason.CANCELLED)) |
                 (sessionSnapshot.disposition != SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                  sessionSnapshot.disposition != SnapshotCoordinationDisposition.REJECTED &
                  sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED)) implies operatorCoordinationStatus.advisory == OperatorAdvisory.NONE) &
              (sessionSnapshot.disposition == SnapshotCoordinationDisposition.COMPLETED implies droneControlObservationNotice == DroneControlObservationNotice.DELIVERY_REPORTED) &
              (sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED &
                (sessionSnapshot.nextSession == SnapshotNextSessionState.ACQUIRING | sessionSnapshot.nextSession == SnapshotNextSessionState.QUEUED | sessionSnapshot.nextSession == SnapshotNextSessionState.SENDING) implies droneControlObservationNotice == DroneControlObservationNotice.OBSERVATION_ACTIVE) &
              (sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED &
                sessionSnapshot.nextSession != SnapshotNextSessionState.ACQUIRING & sessionSnapshot.nextSession != SnapshotNextSessionState.QUEUED &
                sessionSnapshot.nextSession != SnapshotNextSessionState.SENDING &
                (sessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED | sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED) implies droneControlObservationNotice == DroneControlObservationNotice.OBSERVATION_BLOCKED) &
              (sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED &
                sessionSnapshot.nextSession == SnapshotNextSessionState.IDLE &
                sessionSnapshot.disposition != SnapshotCoordinationDisposition.REJECTED implies droneControlObservationNotice == DroneControlObservationNotice.IDLE);
    }*/

                        
                
                 
                           
                                                                                                                              
                                                                               
                                                                                   
                                                                                    
                                                                                        
                                                                                         
                                                                                     
                                                                                      
                                                                                      
                                                                                       
                                                                                        
                                                                                         
                                                                                               
                                                                                                    
                                                                                             
                                                                                                  
                                                                                               
                                                                                                    
                                                                                                
                                                                                                     
                                                                                               
                                                                                                    
                                                                                                      
                                                                                                           
                                                                                              
                                                                                                   
                                                                                
                                                                                     
                                                                                     
                                                                                          
                                                                                                
                                                                                                     
                                                                                      
                                                                                           
                                                                                              
                                                                                                   
                                                                                           
                                                                                                
                                                                                             
                                                                                                  
                                                                         
                                                                                               
                                                                 
                                                                                     
                                                               
                                                                                               
                                                                                                
                                                                                               
                                                               
                                                                                               
                                                                                      
                                                                                     
                                                               
                                                                                               
                                                                                              
                                                                                             
                                                               
                                                                                               
                                                                                           
                                                                                          
                                                               
                                                                                               
                                                                                             
                                                                                            
                                                               
                                                                                              
                                                                                           
                                                               
                                                                                               
                                                                                             
                                                               
                                                                                                 
                                                                                                                                               
                                                                                                 
                                                                                         
                                                                                                   
                                                                               
                                                                                               
                                                                                                   
                                                                                        
                                                                                  
                                                                               
                                                                                        
                                                                                                    
                                                                                        
                                                                                
                                                                             
                                                                              
                                                                                  
                                                                                                
                                                                                                     
                                                                                        
                                                                            
                                                                                              
                                                                                     
             
                     
                           
                                                                                                                                       
                     
                                                                                 
                                                                                     
                                                                                      
                                                                                          
                                                                                           
                                                                                       
                                                                                        
                                                                                        
                                                                                         
                                                                                          
                                                                                           
                                                                                                 
                                                                                                      
                                                                                               
                                                                                                    
                                                                                                 
                                                                                                      
                                                                                                  
                                                                                                       
                                                                                                 
                                                                                                      
                                                                                                        
                                                                                                             
                                                                                                
                                                                                                     
                                                                                  
                                                                                       
                                                                                       
                                                                                            
                                                                                                  
                                                                                                       
                                                                                        
                                                                                             
                                                                                                
                                                                                                     
                                                                                             
                                                                                                  
                                                                                               
                                                                                                    
                                                                           
                                                                                                 
                                                                   
                                                                                       
                                                                 
                                                                                                 
                                                                                                  
                                                                                                 
                                                                 
                                                                                                 
                                                                                        
                                                                                       
                                                                 
                                                                                                 
                                                                                                
                                                                                               
                                                                 
                                                                                                 
                                                                                             
                                                                                            
                                                                 
                                                                                                 
                                                                                               
                                                                                              
                                                                 
                                                                                                
                                                                                             
                                                                 
                                                                                                 
                                                                                               
                                                                 
                                                                                                   
                                                                                                                                                 
                                                                                                   
                                                                                           
                                                                                                     
                                                                                 
                                                                                                 
                                                                                                     
                                                                                          
                                                                                    
                                                                                 
                                                                                          
                                                                                                      
                                                                                          
                                                                                  
                                                                               
                                                                                
                                                                                    
                                                                                                  
                                                                                                       
                                                                                          
                                                                              
                                                                                                
                                                                                       
       
  }

  part def CoordinatorProcess :> Process {
    port observationIntent : DataPort { in :>> type : ObservationIntent; }
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port sortieContext : DataPort { in :>> type : SortieContext; }
    port cameraCondition : DataPort { in :>> type : CameraCondition; }
    port captureResult : DataPort { in :>> type : CaptureResult; }
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    port deliveryResult : DataPort { in :>> type : DeliveryResult; }
    port cameraAcquisitionCommand : DataPort { out :>> type : CameraAcquisitionCommand; }
    port radioDeliveryCommand : DataPort { out :>> type : RadioDeliveryCommand; }
    port operatorCoordinationStatus : DataPort { out :>> type : OperatorCoordinationStatus; }
    port droneControlObservationNotice : DataPort { out :>> type : DroneControlObservationNotice; }

    part batteryEvidenceQualifier : BatteryEvidenceQualifier;
    part sortieApplicabilityQualifier : SortieApplicabilityQualifier;
    part cameraEvidenceQualifier : CameraEvidenceQualifier;
    part radioEvidenceQualifier : RadioEvidenceQualifier;
    part sessionProposalOwner : SessionProposalOwner;
    part observationIntentArbiter : ObservationIntentArbiter;
    part observationSessionController : ObservationSessionController;
    part coordinationOutcomePolicy : CoordinationOutcomePolicy;

    connection int01 : PortConnection connect batteryCapacity to batteryEvidenceQualifier.batteryCapacity;
    connection int02 : PortConnection connect batteryCheck to batteryEvidenceQualifier.batteryCheck;
    connection int03 : PortConnection connect sortieContext to sortieApplicabilityQualifier.sortieContext;
    connection int04 : PortConnection connect cameraCondition to cameraEvidenceQualifier.cameraCondition;
    connection int05 : PortConnection connect captureResult to cameraEvidenceQualifier.captureResult;
    connection int06 : PortConnection connect radioCondition to radioEvidenceQualifier.radioCondition;
    connection int07 : PortConnection connect deliveryResult to radioEvidenceQualifier.deliveryResult;
    connection int08 : PortConnection connect observationIntent to observationIntentArbiter.observationIntent;
    connection int09 : PortConnection connect batteryEvidenceQualifier.batteryAssessment to sortieApplicabilityQualifier.batteryAssessment;
    connection int10 : PortConnection connect batteryEvidenceQualifier.batteryAssessment to coordinationOutcomePolicy.batteryAssessment;
    connection int11 : PortConnection connect sortieApplicabilityQualifier.sortieQualification to sessionProposalOwner.sortieQualification;
    connection int12 : PortConnection connect cameraEvidenceQualifier.cameraEvidence to sessionProposalOwner.cameraEvidence;
    connection int13 : PortConnection connect radioEvidenceQualifier.radioEvidence to sessionProposalOwner.radioEvidence;
    connection int14 : PortConnection connect observationSessionController.sessionPhaseOutput to sessionProposalOwner.sessionPhaseInput;
    connection int15 : PortConnection connect sessionProposalOwner.sessionProposal to observationIntentArbiter.sessionProposal;
    connection int16 : PortConnection connect observationIntentArbiter.sessionDecision to observationSessionController.sessionDecision;
    connection int17 : PortConnection connect observationSessionController.sessionSnapshot to coordinationOutcomePolicy.sessionSnapshot;
    connection int18 : PortConnection connect observationSessionController.cameraAcquisitionCommand to cameraAcquisitionCommand;
    connection int19 : PortConnection connect observationSessionController.radioDeliveryCommand to radioDeliveryCommand;
    connection int20 : PortConnection connect coordinationOutcomePolicy.operatorCoordinationStatus to operatorCoordinationStatus;
    connection int21 : PortConnection connect coordinationOutcomePolicy.droneControlObservationNotice to droneControlObservationNotice;
  }

  part def ObservationAcquisitionRadioDeliveryCoordinator :> System {
    port observationIntent : DataPort { in :>> type : ObservationIntent; }
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port sortieContext : DataPort { in :>> type : SortieContext; }
    port cameraCondition : DataPort { in :>> type : CameraCondition; }
    port captureResult : DataPort { in :>> type : CaptureResult; }
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    port deliveryResult : DataPort { in :>> type : DeliveryResult; }
    port cameraAcquisitionCommand : DataPort { out :>> type : CameraAcquisitionCommand; }
    port radioDeliveryCommand : DataPort { out :>> type : RadioDeliveryCommand; }
    port operatorCoordinationStatus : DataPort { out :>> type : OperatorCoordinationStatus; }
    port droneControlObservationNotice : DataPort { out :>> type : DroneControlObservationNotice; }

    part coordinatorProcess : CoordinatorProcess;

    connection supportObservationIntent : PortConnection connect observationIntent to coordinatorProcess.observationIntent;
    connection supportBatteryCapacity : PortConnection connect batteryCapacity to coordinatorProcess.batteryCapacity;
    connection supportBatteryCheck : PortConnection connect batteryCheck to coordinatorProcess.batteryCheck;
    connection supportSortieContext : PortConnection connect sortieContext to coordinatorProcess.sortieContext;
    connection supportCameraCondition : PortConnection connect cameraCondition to coordinatorProcess.cameraCondition;
    connection supportCaptureResult : PortConnection connect captureResult to coordinatorProcess.captureResult;
    connection supportRadioCondition : PortConnection connect radioCondition to coordinatorProcess.radioCondition;
    connection supportDeliveryResult : PortConnection connect deliveryResult to coordinatorProcess.deliveryResult;
    connection supportCameraCommand : PortConnection connect coordinatorProcess.cameraAcquisitionCommand to cameraAcquisitionCommand;
    connection supportRadioCommand : PortConnection connect coordinatorProcess.radioDeliveryCommand to radioDeliveryCommand;
    connection supportOperatorStatus : PortConnection connect coordinatorProcess.operatorCoordinationStatus to operatorCoordinationStatus;
    connection supportDroneNotice : PortConnection connect coordinatorProcess.droneControlObservationNotice to droneControlObservationNotice;
  }

  part observationAcquisitionRadioDeliveryCoordinator : ObservationAcquisitionRadioDeliveryCoordinator;
}
