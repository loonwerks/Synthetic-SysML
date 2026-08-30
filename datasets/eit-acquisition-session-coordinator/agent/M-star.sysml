package EIT_Acquisition_Session_Coordinator {
  private import HAMR::*;

  enum def DoctorRequest {
    enum NO_DOCTOR_REQUEST;
    enum START_MONITORING;
    enum STOP_MONITORING;
  }

  enum def TechnicianRequest {
    enum NO_TECHNICIAN_REQUEST;
    enum CONFIRM_BELT;
    enum RECORD_CALIBRATION;
    enum RESET_PREPARATION;
  }

  enum def BeltObservation {
    enum BELT_OBSERVATION_INVALID;
    enum BELT_NOT_APPLIED;
    enum BELT_APPLIED;
  }

  enum def CalibrationObservation {
    enum CALIBRATION_OBSERVATION_INVALID;
    enum CALIBRATION_NOT_AVAILABLE;
    enum CALIBRATION_FAILED;
    enum CALIBRATION_PASSED;
  }

  enum def AcquisitionObservation {
    enum ACQUISITION_AVAILABLE;
    enum ACQUISITION_FAULT;
  }

  enum def ImpedanceFrameObservation {
    enum NO_FRAME;
    enum INVALID_FRAME;
    enum FRAME_A;
    enum FRAME_B;
  }

  enum def AcquisitionCommand {
    enum DO_NOT_COLLECT;
    enum COLLECT;
  }

  enum def FrameDelivery {
    enum NO_DELIVERY;
    enum DELIVER_FRAME_A;
    enum DELIVER_FRAME_B;
  }

  enum def BeltQualification {
    enum BELT_UNAVAILABLE;
    enum BELT_ABSENT;
    enum BELT_PRESENT;
  }

  part def BeltAssessment :> Data {
    attribute beltCategory : BeltQualification;
    attribute qualified : Boolean;
  }

  enum def CalibrationQualification {
    enum CALIBRATION_BLOCKED;
    enum NOT_CALIBRATED;
    enum CALIBRATED;
  }

  enum def PreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }

  enum def MonitoringState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }

  enum def EligibilityCondition {
    enum BELT_UNAVAILABLE_CONDITION;
    enum BELT_ABSENT_CONDITION;
    enum CALIBRATION_NOT_READY_CONDITION;
    enum ACQUISITION_FAULT_CONDITION;
    enum ACQUISITION_READY;
  }

  enum def RecoveryProposal {
    enum NO_RECOVERY;
    enum RESET_PREPARATION_RECOVERY;
    enum HOLD_MONITORING_RECOVERY;
  }

  enum def EffectiveIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }

  enum def RequestDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }

  enum def SessionNotice {
    enum NONE;
    enum BELT_OBSERVATION_UNAVAILABLE;
    enum BELT_NOT_CONFIRMED;
    enum CALIBRATION_NOT_READY;
    enum ACQUISITION_UNAVAILABLE;
    enum MONITORING_HELD_NOTICE;
    enum INAPPLICABLE_REQUEST;
    enum WAITING_FOR_FRAME;
    enum FRAME_REJECTED;
  }

  enum def EligibilityEnvelopeCondition {
    enum BELT_UNAVAILABLE_CONDITION;
    enum BELT_ABSENT_CONDITION;
    enum CALIBRATION_NOT_READY_CONDITION;
    enum ACQUISITION_FAULT_CONDITION;
    enum ACQUISITION_READY;
  }
  enum def EligibilityEnvelopeRecovery {
    enum NO_RECOVERY;
    enum RESET_PREPARATION_RECOVERY;
    enum HOLD_MONITORING_RECOVERY;
  }
  enum def EligibilityEnvelopePreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def EligibilityEnvelopeMonitoringState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  part def EligibilityEnvelope :> Data {
    attribute condition : EligibilityEnvelopeCondition;
    attribute recovery : EligibilityEnvelopeRecovery;
    attribute beltQualified : Boolean;
    attribute calibrationQualified : Boolean;
    attribute preparationState : EligibilityEnvelopePreparationState;
    attribute monitoringState : EligibilityEnvelopeMonitoringState;
  }

  enum def ArbitrationDecisionEffectiveIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }
  enum def ArbitrationDecisionDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  part def ArbitrationDecision :> Data {
    attribute effectiveIntent : ArbitrationDecisionEffectiveIntent;
    attribute disposition : ArbitrationDecisionDisposition;
  }

  enum def PreparationDecisionPreState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def PreparationDecisionNextState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def PreparationDecisionIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }
  enum def PreparationDecisionDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  part def PreparationDecisionSnapshot :> Data {
    attribute preState : PreparationDecisionPreState;
    attribute nextState : PreparationDecisionNextState;
    attribute effectiveIntent : PreparationDecisionIntent;
    attribute disposition : PreparationDecisionDisposition;
  }

  enum def MonitoringDecisionPreState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  enum def MonitoringDecisionNextState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  enum def MonitoringDecisionIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }
  enum def MonitoringDecisionDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  enum def MonitoringDecisionNotice {
    enum NONE;
    enum BELT_OBSERVATION_UNAVAILABLE;
    enum BELT_NOT_CONFIRMED;
    enum CALIBRATION_NOT_READY;
    enum ACQUISITION_UNAVAILABLE;
    enum MONITORING_HELD_NOTICE;
    enum INAPPLICABLE_REQUEST;
    enum WAITING_FOR_FRAME;
    enum FRAME_REJECTED;
  }
  enum def MonitoringDecisionPreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  part def MonitoringDecisionSnapshot :> Data {
    attribute preState : MonitoringDecisionPreState;
    attribute nextState : MonitoringDecisionNextState;
    attribute effectiveIntent : MonitoringDecisionIntent;
    attribute disposition : MonitoringDecisionDisposition;
    attribute notice : MonitoringDecisionNotice;
    attribute preparationState : MonitoringDecisionPreparationState;
  }

  enum def SessionStatusPreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def SessionStatusMonitoringState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  enum def SessionStatusDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  enum def SessionStatusNotice {
    enum NONE;
    enum BELT_OBSERVATION_UNAVAILABLE;
    enum BELT_NOT_CONFIRMED;
    enum CALIBRATION_NOT_READY;
    enum ACQUISITION_UNAVAILABLE;
    enum MONITORING_HELD_NOTICE;
    enum INAPPLICABLE_REQUEST;
    enum WAITING_FOR_FRAME;
    enum FRAME_REJECTED;
  }
  part def SessionStatus :> Data {
    attribute preparationState : SessionStatusPreparationState;
    attribute monitoringState : SessionStatusMonitoringState;
    attribute disposition : SessionStatusDisposition;
    attribute notice : SessionStatusNotice;
  }

  part def BeltQualificationOwner :> Thread {
    port beltObservation : DataPort { in :>> type : BeltObservation; }
    port beltAssessment : DataPort { out :>> type : BeltAssessment; }

                        
                
                 
                           
                                                                                                                
                                                                                  
                                                                                                                    
                                                                          
                                                                                                               
                                                                      
                                                                                                               
             
                     
                           
                                                                                         
                                                                               
                                                                                         
                                            
                           
                                                                                         
                                                                       
                                                                                    
                                            
                           
                                                                                      
                                                                   
                                                                                     
                                            
       
  }

  part def CalibrationQualificationOwner :> Thread {
    port calibrationObservation : DataPort { in :>> type : CalibrationObservation; }
    port beltAssessment : DataPort { in :>> type : BeltAssessment; }
    port calibrationQualification : DataPort { out :>> type : CalibrationQualification; }

                        
                
                 
                           
                                                                                                                
                                                    
                                                                                           
                                                                                                                          
                                                                                      
                                                                                                                          
                                                                                 
             
                     
                           
                                                                                                                        
                                                 
                                                                                               
                           
                                                                                                               
                                                  
                                                                                  
                                                                                          
                           
                                                                                                  
                                                  
                                                                                  
                                                                                      
       
  }

  part def AcquisitionEligibilityOwner :> Thread {
    port acquisitionObservation : DataPort { in :>> type : AcquisitionObservation; }
    port beltAssessment : DataPort { in :>> type : BeltAssessment; }
    port calibrationQualification : DataPort { in :>> type : CalibrationQualification; }
    port preparationState : DataPort { in :>> type : PreparationState; }
    port monitoringState : DataPort { in :>> type : MonitoringState; }
    port eligibilityEnvelope : DataPort { out :>> type : EligibilityEnvelope; }

                        
                
                 
                           
                                                                                                                                       
                                                                                                                        
                                                                                                         
                                                                                                         
                                                                                                                   
                                                                                                    
                                                                                                         
                                             
                                                                            
                                                                                        
                                                                                                              
                                                         
                                                                                                               
                                                                           
                                                                                         
                                                                                                          
                                                                                                         
                                                                                                               
                                                                           
                                                                                             
                                                                                                
                                                                                        
                                                                                                        
             
                 
                           
                                                                                                                              
                                                                      
                                                                                                         
                                                                          
                                                                                                             
                                                                                  
                                                                                                                     
                                                                             
                                                                                                                
                                                                           
                                                                                                              
                                                                         
                                                                                                           
                 
                           
                                                                                                                          
                                                                                      
                                                                
                                                                                      
                                                               
                     
                           
                                                                                                                  
                                                                                      
                                            
                                                                                                                
                                                                                                      
                                                                        
                                                                                                           
                                                                                                                               
                                                                                                         
                                                                                                                               
                                                                                           
                           
                                                                                                                            
                                                                                 
                                            
                                                                                                           
                                                                                                      
                                                                        
                                                                                                           
                                                                                                                               
                                                                                                         
                                                                                                                               
                                                                                           
                           
                                                                                                                                
                                                  
                                                                            
                                                                                
                                                                                                                     
                                                      
                                                                             
                                                                                        
                                                                                                           
                                                                              
                                                                                   
                                                                             
                                                                                                         
                                                                              
                                                                                   
                                                                             
                                                                                           
                           
                                                                                                                           
                                                  
                                                                               
                                                                           
                                                                                 
                                                                                                                 
                                                                                                      
                                                                             
                                                                                                         
                                                                             
                                                                                           
                           
                                                                                                                     
                                                  
                                                                               
                                                                           
                                                                                     
                                                                                                       
                                                                                       
                                                                                                     
       
  }

  part def RequestArbiter :> Thread {
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    port technicianRequest : DataPort { in :>> type : TechnicianRequest; }
    port eligibilityEnvelope : DataPort { in :>> type : EligibilityEnvelope; }
    port arbitrationDecision : DataPort { out :>> type : ArbitrationDecision; }

                        
                
                 
                           
                                                                                                                     
                                                                     
                                                                                                        
                                                              
                                                                                                             
                                                                                                                     
                                                              
                                                                                                           
                                                                                                                  
             
                     
                           
                                                                                                         
                                                                  
                                                                                                             
                                                                                          
                                                                                       
                                                                                                
                                                                                         
                                                                                     
                                                                                              
                           
                                                                                                          
                                                                   
                                                                                      
                     
                                                                                                               
                                                                                                                       
                                                                                                             
                                                                                                                     
                                                                  
                                                                                       
                                                                                                
                                                                 
                                                                                     
                                                                                                      
                           
                                                                                                                                                                    
                                                                   
                                                                                       
                                                                           
                     
                                                                                 
                                                                                                                     
                                                                           
                                                                                                   
                                                                           
                                                                                                    
                                                                     
                                                        
                                                                                                                           
                                                                                                                
                                                                           
                                                                                                   
                                                                           
                                                                                                    
                                                                           
                                                                                                        
                                                                                                               
                                                                                                                      
                                                                           
                                                                                                   
                                                                           
                                                                                                    
                                                                      
                                                          
                                                                                                                        
                                                                            
                                                                                                          
                                                                                                                   
                                                                                                      
                                                                                              
                           
                                                                                                                                                  
                                                                   
                                                                                       
                                                                           
                     
                                                                 
                                                                                                        
                                                                                                                    
                                                                                               
                                                                 
                                                                                                        
                                                                                                      
                                                                                               
                                                                         
                                                                                                      
                                                                                                            
       
  }

  part def PreparationStateGovernor :> Thread {
    port arbitrationDecision : DataPort { in :>> type : ArbitrationDecision; }
    port preparationState : DataPort { out :>> type : PreparationState; }
    port preparationDecision : DataPort { out :>> type : PreparationDecisionSnapshot; }

                        
           
                          
                                                     
                
                 
                           
                                                                                                        
                                                                      
                                                             
                                                                                    
                                                                                      
                                                                                        
                                                                                                     
             
                 
                          
                                                                                                          
                                                              
                 
                           
                                                                                                                             
                                                                                   
                                                                                         
                                                                                       
                                                                                             
                                                                                               
                                                                                                     
                                                                               
                                                                                           
                                                                                   
                                                                                               
                                                                                           
                                                                                                       
                                                                                                          
                                                                                             
                                                                                                            
                                                                                               
                                                                                                                         
                                                                                                            
                                                                                                                       
                                                                                                          
                                                                                                                    
                                                                                                       
                                                                                                                          
                                                                                                             
                                                                                                                        
                                                                                                           
                                                                                                               
                                                                                                           
                                                                                                 
                                                                                             
                                                                                                 
                                                                                             
                                                                                                         
                                                                                                     
                                                                                                  
                                                                                             
                     
                           
                                                                                                                                      
                                                                                                                       
                                                                                                     
                                                                                                                
                                                                                                                 
                                                                                                  
                     
                                                                                                                           
                                                                             
                                                                                                                           
                                                                              
                           
                                                                                                                                   
                                                                                                                  
                                                                                                                  
                     
                                                                                                                      
                                                                                 
                                                                                                                            
                                                                                        
       
  }

  part def MonitoringStateGovernor :> Thread {
    port preparationDecision : DataPort { in :>> type : PreparationDecisionSnapshot; }
    port arbitrationDecision : DataPort { in :>> type : ArbitrationDecision; }
    port eligibilityEnvelope : DataPort { in :>> type : EligibilityEnvelope; }
    port monitoringState : DataPort { out :>> type : MonitoringState; }
    port monitoringDecision : DataPort { out :>> type : MonitoringDecisionSnapshot; }

                        
           
                          
                                                   
                
                 
                           
                                                                                                    
                                                                             
                                                                    
                                                                                           
                                                                                             
                                                                                      
                                                                                                    
                                                                        
                                                                                                 
             
                 
                          
                                                                                                         
                                                            
                 
                           
                                                                                                                        
                                                                                          
                                                                                                
                                                                                        
                                                                                              
                                                                                      
                                                                                            
                                                                                      
                                                                                                  
                                                                                    
                                                                                                
                                                                                  
                                                                                              
                                                                                               
                                                                                                       
                                                                                                   
                                                                                                           
                                                                                                           
                                                                                                                  
                 
                           
                                                                                                                                                  
                                                                                                          
                                                                                           
                                                                                                            
                                                                                             
                                                                                                                         
                                                                                                          
                                                                                                                       
                                                                                                        
                                                                                                                    
                                                                                                     
                                                                                                                          
                                                                                                           
                                                                                                                        
                                                                                                         
                                                                                                               
                                                                                                         
                                                                                                 
                                                                                           
                                                                                                 
                                                                                           
                                                                                                         
                                                                                                   
                                                                                                  
                                                                                           
                     
                           
                                                                                                                                                          
                     
                                                                                                              
                                                                                    
                                                                                                       
                                                                                   
                                                                                                                     
                                                                                                                           
                                                                                
                                                                                                       
                                                                                                                   
                                                                                                        
                                                                                  
                                                                                                       
                                                                                        
                                                                                                                          
                                                                                                                          
                                                                                                                        
                                                                                                              
                                                                             
                                                                                                                     
                                                                                                                   
                                                                                              
                                                                                                                 
                                                                                                       
                                                                                                                     
                                                                                                                   
                                                                                              
                                                                                                            
                                                                                             
                                                                                                                     
                                                                                                                   
                                                                                              
                                                                                                                      
                                                                                                
                                                                                                                     
                                                                                                                   
                                                                                              
                                                                                                                  
                                                                                                  
                                                                                            
                                                                                                        
                                                                                               
                                                                                                                    
                                                                                                                  
                                                                                            
                                                                                    
                                                                                                 
                                                                                                                    
                                                                                                                  
                                                                                            
                                                                                    
                                                                              
       
  }

  part def AcquisitionCommandPolicy :> Thread {
    port monitoringDecision : DataPort { in :>> type : MonitoringDecisionSnapshot; }
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }

                        
                
                 
                           
                                                                                         
                                                                    
             
                     
                           
                                                                                                                                       
                     
                                                                                                      
                                                                     
                                                                                                      
                                                                           
       
  }

  part def SessionPublicationPolicy :> Thread {
    port impedanceFrame : DataPort { in :>> type : ImpedanceFrameObservation; }
    port monitoringDecision : DataPort { in :>> type : MonitoringDecisionSnapshot; }
    port frameDelivery : DataPort { out :>> type : FrameDelivery; }
    port sessionStatus : DataPort { out :>> type : SessionStatus; }

                        
                
                 
                           
                                                                                                            
                                                        
                                                                                        
                                                                                               
                                                                                          
                                                             
             
                 
                           
                                                                                                                            
                                                                                                           
                                                                                             
                                                                                                               
                                                                                                 
                                                                                                                       
                                                                                                         
                                                                                                      
                                                                                                    
                                                                                                    
                                                                                                  
                                                                                                  
                                                                                                
                                                                                                             
                                                                                               
                                                                                               
                                                                                 
                                                                                               
                                                                                 
                                                                                                       
                                                                                         
                                                                                                
                                                                                 
                     
                           
                                                                                                                                                   
                     
                                                                                               
                                                                            
                                                                   
                                                                                               
                                                                            
                                                                   
                                                                                               
                                                                      
                                                                                  
                                                               
                                                                                                           
                                                                                             
                                                                                                 
                                                                                   
                                                                                                    
                                                                                      
                                                                                                      
                                                                                        
                                                                                                     
                                                                                       
                                                                                                   
                                                                                     
                                                                            
                                                                                               
                                                                                  
                                                                               
                                                                            
                                                                                               
                                                                             
                                                                                  
                                                                            
                                                                                                
                                                                      
                                                                              
                                                                    
       
  }

  part def AcquisitionCoordinationProcess :> Process {
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    port technicianRequest : DataPort { in :>> type : TechnicianRequest; }
    port beltObservation : DataPort { in :>> type : BeltObservation; }
    port calibrationObservation : DataPort { in :>> type : CalibrationObservation; }
    port acquisitionObservation : DataPort { in :>> type : AcquisitionObservation; }
    port impedanceFrame : DataPort { in :>> type : ImpedanceFrameObservation; }
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    port frameDelivery : DataPort { out :>> type : FrameDelivery; }
    port sessionStatus : DataPort { out :>> type : SessionStatus; }

    part beltQualificationOwner : BeltQualificationOwner;
    part calibrationQualificationOwner : CalibrationQualificationOwner;
    part acquisitionEligibilityOwner : AcquisitionEligibilityOwner;
    part requestArbiter : RequestArbiter;
    part preparationStateGovernor : PreparationStateGovernor;
    part monitoringStateGovernor : MonitoringStateGovernor;
    part acquisitionCommandPolicy : AcquisitionCommandPolicy;
    part sessionPublicationPolicy : SessionPublicationPolicy;

    connection int01 : PortConnection connect doctorRequest to requestArbiter.doctorRequest;
    connection int02 : PortConnection connect technicianRequest to requestArbiter.technicianRequest;
    connection int03 : PortConnection connect beltObservation to beltQualificationOwner.beltObservation;
    connection int04 : PortConnection connect calibrationObservation to calibrationQualificationOwner.calibrationObservation;
    connection int05 : PortConnection connect acquisitionObservation to acquisitionEligibilityOwner.acquisitionObservation;
    connection int06 : PortConnection connect impedanceFrame to sessionPublicationPolicy.impedanceFrame;
    connection int07 : PortConnection connect beltQualificationOwner.beltAssessment to calibrationQualificationOwner.beltAssessment;
    connection int08 : PortConnection connect beltQualificationOwner.beltAssessment to acquisitionEligibilityOwner.beltAssessment;
    connection int09 : PortConnection connect calibrationQualificationOwner.calibrationQualification to acquisitionEligibilityOwner.calibrationQualification;
    connection int10 : PortConnection connect preparationStateGovernor.preparationState to acquisitionEligibilityOwner.preparationState;
    connection int11 : PortConnection connect monitoringStateGovernor.monitoringState to acquisitionEligibilityOwner.monitoringState;
    connection int12 : PortConnection connect acquisitionEligibilityOwner.eligibilityEnvelope to requestArbiter.eligibilityEnvelope;
    connection int13 : PortConnection connect requestArbiter.arbitrationDecision to preparationStateGovernor.arbitrationDecision;
    connection int14 : PortConnection connect preparationStateGovernor.preparationDecision to monitoringStateGovernor.preparationDecision;
    connection int15 : PortConnection connect requestArbiter.arbitrationDecision to monitoringStateGovernor.arbitrationDecision;
    connection int16 : PortConnection connect acquisitionEligibilityOwner.eligibilityEnvelope to monitoringStateGovernor.eligibilityEnvelope;
    connection int17 : PortConnection connect monitoringStateGovernor.monitoringDecision to acquisitionCommandPolicy.monitoringDecision;
    connection int18 : PortConnection connect monitoringStateGovernor.monitoringDecision to sessionPublicationPolicy.monitoringDecision;
    connection int19 : PortConnection connect acquisitionCommandPolicy.acquisitionCommand to acquisitionCommand;
    connection int20 : PortConnection connect sessionPublicationPolicy.frameDelivery to frameDelivery;
    connection int21 : PortConnection connect sessionPublicationPolicy.sessionStatus to sessionStatus;
  }

  part def EITAcquisitionSessionCoordinator :> System {
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    port technicianRequest : DataPort { in :>> type : TechnicianRequest; }
    port beltObservation : DataPort { in :>> type : BeltObservation; }
    port calibrationObservation : DataPort { in :>> type : CalibrationObservation; }
    port acquisitionObservation : DataPort { in :>> type : AcquisitionObservation; }
    port impedanceFrame : DataPort { in :>> type : ImpedanceFrameObservation; }
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    port frameDelivery : DataPort { out :>> type : FrameDelivery; }
    port sessionStatus : DataPort { out :>> type : SessionStatus; }

    part acquisitionCoordinationProcess : AcquisitionCoordinationProcess;

    connection supportDoctorRequest : PortConnection connect doctorRequest to acquisitionCoordinationProcess.doctorRequest;
    connection supportTechnicianRequest : PortConnection connect technicianRequest to acquisitionCoordinationProcess.technicianRequest;
    connection supportBeltObservation : PortConnection connect beltObservation to acquisitionCoordinationProcess.beltObservation;
    connection supportCalibrationObservation : PortConnection connect calibrationObservation to acquisitionCoordinationProcess.calibrationObservation;
    connection supportAcquisitionObservation : PortConnection connect acquisitionObservation to acquisitionCoordinationProcess.acquisitionObservation;
    connection supportImpedanceFrame : PortConnection connect impedanceFrame to acquisitionCoordinationProcess.impedanceFrame;
    connection supportAcquisitionCommand : PortConnection connect acquisitionCoordinationProcess.acquisitionCommand to acquisitionCommand;
    connection supportFrameDelivery : PortConnection connect acquisitionCoordinationProcess.frameDelivery to frameDelivery;
    connection supportSessionStatus : PortConnection connect acquisitionCoordinationProcess.sessionStatus to sessionStatus;
  }

  part eitAcquisitionSessionCoordinator : EITAcquisitionSessionCoordinator;
}
