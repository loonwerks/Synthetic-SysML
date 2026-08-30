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

                        
                
                 
                           
                                                                                           
                                                           
                                                                     
                                                                                                      
                                                             
                                                                                                         
                                                                 
             
                     
                           
                                                                                                            
                                                        
                                                                         
                           
                                                                        
                                                                                                   
                                                                 
                           
                                                                                   
                                                                                                      
                                                                      
       
  }

  part def SortieApplicabilityQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    port sortieContext : DataPort { in :>> type : SortieContext; }
    port sortieQualification : DataPort { out :>> type : SortieQualification; }

                        
                
                 
                           
                                                                                                              
                                                                         
                                                                              
                                                                 
                                                                            
                                                               
                                                                                  
                                                                             
                                                               
                                                                             
                                                                     
             
                     
                           
                                                                                           
                                                                      
                                                                                  
                           
                                                                             
                                                              
                                                                                
                           
                                                                                                                      
                                                                   
                     
                                                                               
                                                                        
                                                                                    
                                                                              
       
  }

  part def CameraEvidenceQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port cameraCondition : DataPort { in :>> type : CameraCondition; }
    port captureResult : DataPort { in :>> type : CaptureResult; }
    port cameraEvidence : DataPort { out :>> type : CameraEvidence; }

                        
                
                 
                           
                                                                                                      
                                                                     
                                                               
                                                                                                     
                                                         
                                                                                                         
                                                            
                                                                                                       
                                                         
             
                     
                           
                                                                                                           
                                                                  
                                                                   
                           
                                                                                        
                                                                                                  
                                                             
                           
                                                                                                      
                                                                                                  
                     
                                                                
                                                              
                                                              
                                                           
       
  }

  part def RadioEvidenceQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    port deliveryResult : DataPort { in :>> type : DeliveryResult; }
    port radioEvidence : DataPort { out :>> type : RadioEvidence; }

                        
                
                 
                           
                                                                                                    
                                                                   
                                                             
                                                                                                     
                                                       
                                                                                                         
                                                          
                                                                                                         
                                                         
             
                     
                           
                                                                                                         
                                                                
                                                                 
                           
                                                                                      
                                                                                                  
                                                           
                           
                                                                                                      
                                                                                                  
                     
                                                                  
                                                            
                                                                  
                                                           
       
  }

  part def SessionProposalOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port sortieQualification : DataPort { in :>> type : SortieQualification; }
    port cameraEvidence : DataPort { in :>> type : CameraEvidence; }
    port radioEvidence : DataPort { in :>> type : RadioEvidence; }
    port sessionPhaseInput : DataPort { in :>> type : ObservationSessionState; }
    port sessionProposal : DataPort { out :>> type : SessionProposal; }

                        
             
                     
                           
                                                                                                                                     
                                                                        
                                                                    
                                                                                                                             
                                                              
                                                                                                               
                                                                                                                             
                                                                                                          
                                                                                                         
                                                                
                                                                    
                                                                                                                             
                                                           
                     
                                                                             
                                                                                                                                     
                                                                      
                                                                             
                                                                                                                               
                                                                               
                                                                        
                                                                           
                                                                                                                                     
                                                                    
                                                                           
                                                                                                                               
                                                                               
                                                                      
                                                                            
                                                                                                                                     
                                                                     
                                                                            
                                                                                                                               
                                                                               
                                                                       
                                                                     
                                                                                                                              
                                                                     
                                                                    
                                                                                                                              
                                                                                                                 
                                                                      
                                                                     
                                                                                                                              
                                                                                                                  
                                                                   
                                                                     
                                                                                                                         
                                                            
                                                                                                                              
                                                                   
                                                                    
                           
                                                                                                                              
                                                                        
                                                                        
                                                                                                        
                                                             
                                                                                                                   
                                                                                                                    
                     
                                                                                                                           
                                                                        
                                                                                                                        
                                                            
                                                                            
                                                                      
                                                                                                                       
                                                                         
                                                                                                                       
                                                                         
                                                                                                                    
                                                           
                           
                                                                                                                 
                                                                        
                                                                                                                            
                                                                                                        
                                                                   
       
  }

  part def ObservationIntentArbiter :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port observationIntent : DataPort { in :>> type : ObservationIntent; }
    port sessionProposal : DataPort { in :>> type : SessionProposal; }
    port sessionDecision : DataPort { out :>> type : SessionDecision; }

                        
                
                 
                           
                                                                                                                        
                                                                                
                                                                    
                                                                                                                                      
                                                                      
                                                                                                                                    
                                                                    
                                                                                                                                     
                                                                     
                                                                                                                                    
                                                                    
                                                                                                                                   
                                                                   
                                                                                                                                      
                                                                   
                                                                                                                                    
                                                                        
                                                                                                                                       
                                                                      
                                                                                                                                       
                                                                 
                                                                                                                              
                                                                       
                                                                                                                                   
                                                                     
                                                                                                                                 
                                                                   
                                                                                                                                  
                                                                    
                                                                                                                                 
                                                                   
                                                                                                                                
                                                                  
                                                                         
                                                                                                                       
                                                                                                                      
                                                                                                                      
                                                                                                                        
                                                                    
                                                                                                                    
                                                              
             
                     
                           
                                                                                       
                                                                             
                                                                        
                           
                                                                                                                 
                                                                              
                                                                                                                        
                                                                                                                       
                                                                                                                       
                                                                                                                         
                                                                     
                     
                                                                                                                                     
                                                                                                                                 
                                                                                                                                   
                                                                                                                                 
                                                                                                                               
                                                                                                                                  
                                                                                                                                     
                                                                                                                                      
                                                                                                                                
                           
                                                                                                         
                                                                              
                                                                                                                       
                                                                                                                      
                                                                                                                      
                                                                                                                        
                                                                   
                     
                                                                                                                                
                                                                         
                                                                                                                                     
                                                                       
                                                                                                                                   
                                                                     
                                                                                                                                    
                                                                      
                                                                                                                                   
                                                                     
                                                                                                                                  
                                                                    
                                                                                                                    
                                                                
       
  }

  part def ObservationSessionController :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port sessionDecision : DataPort { in :>> type : SessionDecision; }
    port sessionPhaseOutput : DataPort { out :>> type : ObservationSessionState; }
    port sessionSnapshot : DataPort { out :>> type : SessionSnapshot; }
    port cameraAcquisitionCommand : DataPort { out :>> type : CameraAcquisitionCommand; }
    port radioDeliveryCommand : DataPort { out :>> type : RadioDeliveryCommand; }

                        
           
                         
                                                   
                
                 
                           
                                                                                                                                        
                                                              
                                                                
                                                                        
                                                                          
                                                                                      
                                                                       
                                                                       
                                                              
             
                 
                          
                                                                                      
                                                       
                 
                           
                                                                                                        
                                                                           
                                                                             
                                                                                
                                                                                  
                                                                             
                                                                               
                                                                              
                                                                                
                                                                                
                                                                                  
                                                                       
                                                                               
                                                                            
                                                                                    
                                                                         
                                                                                 
                                                                          
                                                                                  
                                                                            
                                                                                   
                 
                           
                                                                                                               
                                                                            
                                                                               
                                                                            
                                                                           
                 
                           
                                                                                                         
                                                                          
                                                                                
                                                                          
                                                                   
                 
                                
                                                                                                                  
                                                                                                     
                                                                                          
                                                                                
                                                                                        
                                                                                     
                                                                                       
                     
                           
                                                                                                                                           
                     
                                                                     
                                                           
                                                                                           
                                                                              
                                                                             
                                                                        
                                                                                         
                                                                              
                                                                          
                                                                   
                                                                                           
                                                                                   
                                                                            
                                                                        
                                                                                                  
                                                                                              
                                                                          
                                                                        
                                                                                                  
                                                                                    
                                                                           
                                                                        
                                                                                                  
                                                                                            
                                                                          
                                                                        
                                                                                                  
                                                                                         
                                                                         
                                                                        
                                                                                                  
                                                                                           
                                                                         
                                                                     
                                                                                            
                                                                              
                                                                              
                                                                      
                                                                                            
                                                                              
                                                                            
                                                                   
                                                                                           
                                                                              
                                                                       
                                                                     
                                                                                            
                                                                              
                                                                           
                                                           
                                                                                          
                                                                                              
                                                                         
                                                           
                                                                                          
                                                                                    
                                                                          
                                                           
                                                                                          
                                                                                            
                                                                         
                                                           
                                                                                          
                                                                                         
                                                                        
                                                           
                                                                                          
                                                                                          
       
  }

  part def CoordinationOutcomePolicy :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    port sessionSnapshot : DataPort { in :>> type : SessionSnapshot; }
    port operatorCoordinationStatus : DataPort { out :>> type : OperatorCoordinationStatus; }
    port droneControlObservationNotice : DataPort { out :>> type : DroneControlObservationNotice; }

                        
                
                 
                           
                                                                                                                              
                                                                               
                                                                                   
                                                                                    
                                                                                        
                                                                                         
                                                                                     
                                                                                      
                                                                                      
                                                                                       
                                                                                        
                                                                                         
                                                                                               
                                                                                                    
                                                                                             
                                                                                                  
                                                                                               
                                                                                                    
                                                                                                
                                                                                                     
                                                                                               
                                                                                                    
                                                                                                      
                                                                                                           
                                                                                              
                                                                                                   
                                                                                
                                                                                     
                                                                                     
                                                                                          
                                                                                                
                                                                                                     
                                                                                      
                                                                                           
                                                                                              
                                                                                                   
                                                                                           
                                                                                                
                                                                                             
                                                                                                  
                                                                         
                                                                                               
                                                                 
                                                                                     
                                                               
                                                                                               
                                                                                                
                                                                                               
                                                               
                                                                                               
                                                                                      
                                                                                     
                                                               
                                                                                               
                                                                                              
                                                                                             
                                                               
                                                                                               
                                                                                           
                                                                                          
                                                               
                                                                                               
                                                                                             
                                                                                            
                                                               
                                                                                              
                                                                                           
                                                               
                                                                                               
                                                                                             
                                                               
                                                                                                 
                                                                                                                                               
                                                                                                 
                                                                                         
                                                                                                   
                                                                               
                                                                                               
                                                                                                   
                                                                                        
                                                                                  
                                                                               
                                                                                        
                                                                                                    
                                                                                        
                                                                                
                                                                             
                                                                              
                                                                                  
                                                                                                
                                                                                                     
                                                                                        
                                                                            
                                                                                              
                                                                                     
             
                     
                           
                                                                                                                                       
                     
                                                                                 
                                                                                     
                                                                                      
                                                                                          
                                                                                           
                                                                                       
                                                                                        
                                                                                        
                                                                                         
                                                                                          
                                                                                           
                                                                                                 
                                                                                                      
                                                                                               
                                                                                                    
                                                                                                 
                                                                                                      
                                                                                                  
                                                                                                       
                                                                                                 
                                                                                                      
                                                                                                        
                                                                                                             
                                                                                                
                                                                                                     
                                                                                  
                                                                                       
                                                                                       
                                                                                            
                                                                                                  
                                                                                                       
                                                                                        
                                                                                             
                                                                                                
                                                                                                     
                                                                                             
                                                                                                  
                                                                                               
                                                                                                    
                                                                           
                                                                                                 
                                                                   
                                                                                       
                                                                 
                                                                                                 
                                                                                                  
                                                                                                 
                                                                 
                                                                                                 
                                                                                        
                                                                                       
                                                                 
                                                                                                 
                                                                                                
                                                                                               
                                                                 
                                                                                                 
                                                                                             
                                                                                            
                                                                 
                                                                                                 
                                                                                               
                                                                                              
                                                                 
                                                                                                
                                                                                             
                                                                 
                                                                                                 
                                                                                               
                                                                 
                                                                                                   
                                                                                                                                                 
                                                                                                   
                                                                                           
                                                                                                     
                                                                                 
                                                                                                 
                                                                                                     
                                                                                          
                                                                                    
                                                                                 
                                                                                          
                                                                                                      
                                                                                          
                                                                                  
                                                                               
                                                                                
                                                                                    
                                                                                                  
                                                                                                       
                                                                                          
                                                                              
                                                                                                
                                                                                       
       
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
