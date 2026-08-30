// Canonical final source for immutable run 20260813T234357Z-eit-acquisition-hard-r1-a1.
// The behavior-free checkpoint and its diagnostics are retained under validation/architecture-stage/.

package EIT_Acquisition_Supervisor {
  private import HAMR::*;

  enum def DoctorSignal { enum NONE; enum START; enum STOP; enum ACK_IMAGE; enum INVALID_INTENT; enum INVALID_STATUS; }
  enum def PreparationObservation { enum READY; enum NOT_APPLIED; enum CALIBRATION_NOT_PERFORMED; enum CALIBRATION_FAILED; enum INVALID_BELT_STATUS; enum INVALID_CALIBRATION_STATUS; }
  enum def EquipmentObservation { enum READY; enum NOT_READY; enum BUSY; enum FAULTED; enum INVALID_HEALTH_STATUS; enum INVALID_AVAILABILITY_STATUS; }
  enum def BatchSignal { enum NONE; enum COMPLETE; enum INCOMPLETE; enum CORRUPT; enum INVALID_BATCH_KIND; enum INVALID_BATCH_STATUS; }
  enum def ImageFeedback { enum NONE; enum GENERATED; enum FAILED; enum INVALID_RESULT; enum INVALID_STATUS; }
  enum def RecoveryEvent { enum NONE; enum RESET; enum VERIFY_OK; enum INVALID_RESET; enum INVALID_STATUS; }
  enum def RequestClass { enum NO_REQUEST; enum START_REQUEST; enum STOP_REQUEST; enum IMAGE_ACK; }
  enum def PreparationFacts { enum READY; enum NOT_READY; enum FAILED; enum INPUT_FAULT; }
  enum def EquipmentFacts { enum READY; enum NOT_READY; enum BUSY; enum FAILED; enum INPUT_FAULT; }
  enum def BatchFacts { enum NO_BATCH; enum USABLE; enum INCOMPLETE; enum FAILED; enum INPUT_FAULT; }
  enum def ImageResultFacts { enum NO_RESULT; enum AVAILABLE; enum FAILED; enum INPUT_FAULT; }
  enum def DominantFault { enum NONE; enum RECOVERY_INPUT; enum REQUEST_INPUT; enum PREPARATION_INPUT; enum EQUIPMENT_INPUT; enum BATCH_INPUT; enum IMAGE_INPUT; enum PREPARATION_FAILURE; enum EQUIPMENT_FAILURE; enum BATCH_FAILURE; enum IMAGE_FAILURE; }
  enum def SessionState { enum IDLE; enum MONITORING; enum RECOVERY; }
  enum def CycleState { enum DORMANT; enum READY; enum COLLECTING; enum BATCH_READY; enum RECOVERY; }
  enum def ImageState { enum EMPTY; enum AWAITING_IMAGE; enum AVAILABLE; enum RECOVERY; }
  enum def RecoveryState { enum HEALTHY; enum LATCHED; enum VERIFYING; }
  enum def RecoveryGate { enum OPEN; enum CLOSED; }
  enum def RecoveryCause { enum NONE; enum LOCAL_FAULT; enum RECOVERY_INPUT_FAULT; enum LATCHED; enum VERIFYING; }
  enum def StartFeasibility { enum FEASIBLE; enum NOT_FEASIBLE; }
  enum def Proposal { enum PROPOSED; enum NOT_PROPOSED; }
  enum def SelectedAction { enum EMERGENCY_HOLD; enum STOP; enum START; enum RELEASE_IMAGE; enum GENERATE_IMAGE; enum COLLECT; enum HOLD; }
  enum def SelectedCause { enum FAULT_OR_RECOVERY; enum DOCTOR_STOP; enum DOCTOR_START; enum IMAGE_AVAILABLE; enum USABLE_BATCH; enum READY_TO_COLLECT; enum NO_ELIGIBLE_WORK; }
  enum def AcquisitionCommand { enum NO_COMMAND; enum REQUEST_START; enum REQUEST_COLLECTION; enum REQUEST_STOP; }
  enum def ImageCommand { enum NO_COMMAND; enum REQUEST_GENERATION; }
  enum def PublicMode { enum IDLE; enum STARTING; enum MONITORING; enum COLLECTING; enum IMAGING; enum IMAGE_AVAILABLE; enum RECOVERY; enum FAULT; }
  enum def ImageDisposition { enum WITHHELD; enum AVAILABLE_FOR_ANALYSIS; }

  // Every inspected Data member is an attribute rather than a nested part.
  part def RequestFactsRecord :> Data {
    attribute requestClass : RequestClass;
    attribute requestFault : Base_Types::Boolean;
  }
  part def FaultSummary :> Data {
    attribute faultPresent : Base_Types::Boolean;
    attribute dominantFault : DominantFault;
    attribute multipleFaults : Base_Types::Boolean;
  }
  part def RecoveryFrame :> Data {
    attribute dominantFault : DominantFault;
    attribute recoveryState : RecoveryState;
    attribute recoveryGate : RecoveryGate;
    attribute recoveryCause : RecoveryCause;
    attribute effectiveFaultPresent : Base_Types::Boolean;
    attribute effectiveMultipleFaults : Base_Types::Boolean;
  }
  part def SessionFrame :> Data {
    attribute sessionState : SessionState;
    attribute startAdmitted : Base_Types::Boolean;
    attribute stopAdmitted : Base_Types::Boolean;
  }
  part def CycleFrame :> Data {
    attribute cycleState : CycleState;
    attribute batchReady : Base_Types::Boolean;
  }
  part def ImageFrame :> Data {
    attribute imageState : ImageState;
    attribute generateProposal : Base_Types::Boolean;
  }
  part def DecisionFrame :> Data {
    attribute selectedAction : SelectedAction;
    attribute selectedCause : SelectedCause;
    attribute sessionState : SessionState;
    attribute cycleState : CycleState;
    attribute imageState : ImageState;
    attribute recoveryState : RecoveryState;
    attribute imageAvailable : Base_Types::Boolean;
    attribute effectiveFaultPresent : Base_Types::Boolean;
    attribute dominantFault : DominantFault;
    attribute multipleFaults : Base_Types::Boolean;
    attribute recoveryGate : RecoveryGate;
  }
  part def ControlFrame :> Data {
    attribute acquisitionCommand : AcquisitionCommand;
    attribute imageCommand : ImageCommand;
  }
  part def StatusFrame :> Data {
    attribute publicMode : PublicMode;
    attribute selectedCause : SelectedCause;
    attribute sessionState : SessionState;
    attribute cycleState : CycleState;
    attribute imageState : ImageState;
    attribute recoveryState : RecoveryState;
    attribute imageDisposition : ImageDisposition;
    attribute dominantFault : DominantFault;
    attribute multipleFaults : Base_Types::Boolean;
  }

  part def DoctorRequestQualification :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port doctor_signal : DataPort { in :>> type : DoctorSignal; }
    port request_facts : DataPort { out :>> type : RequestFactsRecord; }
                        
                
                             
                                        
                                                                                                  
             
                             
                                              
                                                                                                                                           
                                                                                                                                               
                                                                                                                                             
                                                                                                                                               
                                                                                                           
                                                                                                 
       
  }

  part def PreparationAssessment :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port preparation_observation : DataPort { in :>> type : PreparationObservation; }
    port preparation_facts : DataPort { out :>> type : PreparationFacts; }
                        
                
                             
                                                                                               
             
                             
                                               
                                                                                                                    
                                                                            
                                                                                                                                              
                                                                                                                                  
                                                                                    
                                                                                                                                                 
       
  }

  part def EquipmentAssessment :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port equipment_observation : DataPort { in :>> type : EquipmentObservation; }
    port equipment_facts : DataPort { out :>> type : EquipmentFacts; }
                        
                
                             
                                                                                         
             
                             
                                             
                                                                                                            
                                                                                                                    
                                                                                                          
                                                                                                               
                                                                                  
                                                                                                                                          
       
  }

  part def BatchAssessment :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port batch_signal : DataPort { in :>> type : BatchSignal; }
    port batch_facts : DataPort { out :>> type : BatchFacts; }
                        
                
                             
                                                                          
             
                             
                                         
                                                                                    
                                                                                      
                                                                                            
                                                                                     
                                                                                                                 
                                                    
       
  }

  part def ImageResultAssessment :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port image_feedback : DataPort { in :>> type : ImageFeedback; }
    port image_result_facts : DataPort { out :>> type : ImageResultFacts; }
                        
                
                             
                                                                                        
             
                             
                                                
                                                                                                      
                                                                                                           
                                                                                                     
                                                                                                               
                                                                 
       
  }

  part def FaultComposition :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port request_facts : DataPort { in :>> type : RequestFactsRecord; }
    port preparation_facts : DataPort { in :>> type : PreparationFacts; }
    port equipment_facts : DataPort { in :>> type : EquipmentFacts; }
    port batch_facts : DataPort { in :>> type : BatchFacts; }
    port image_result_facts : DataPort { in :>> type : ImageResultFacts; }
    port fault_summary : DataPort { out :>> type : FaultSummary; }
                        
                
                             
                                        
                                                                                               
                                            
             
                              
                                       
                                       
                                         
                                                                
                                                            
                                                    
                                                                 
                                                           
                                                       
                                               
                                                            
                              
                                           
                                         
                                          
                                                                                                                  
                                                                                                           
                                                                                                        
                                                                                                   
                                                                 
                                                                                                      
                                                                                                                  
                                                                                            
                                                                
                                                             
                                                                                                           
                                                                                                        
                                                                                                   
                                                     
                                                                                                                  
                                                                                            
                                                                
                                                                  
                                                                                                        
                                                                                                   
                                                            
                                                                                            
                                                                
                                                        
                                                                                                   
                                                                                                 
                              
                                                
                                                                                                      
                                                                                                 
                                                                             
                                                                                                 
                                                                                                                           
                                                                                                 
                                                                                                   
                                                                       
                                                                                                 
                                                                                                   
                                                                                                                            
                                                                                                 
                                                                                                   
                                                                                                               
                                                                               
                                                                                                 
                                                                                                   
                                                                                                               
                                                                                                                        
                                                                                                 
                                                                                                   
                                                                                                               
                                                                                         
                                                                         
                                                                                                 
                                                                                                   
                                                                                                               
                                                                                         
                                                                                                                         
                                                                                                  
       
  }

  part def SessionControl :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port request_facts : DataPort { in :>> type : RequestFactsRecord; }
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    port start_feasibility : DataPort { in :>> type : StartFeasibility; }
    port session_frame : DataPort { out :>> type : SessionFrame; }
                        
           
                         
                                    
                
                               
                             
                                  
                                                                                                
                                                                             
             
                               
                         
                                                                                   
                     
                           
                                       
                                                                      
                                                              
                                                                                 
                           
                                        
                                                                     
                                                         
                                                          
                                                                                 
                           
                                  
                                                                     
                                                      
                                                             
                                                                
                                                                            
                           
                                     
                                                                     
                                                      
                                                             
                                                          
                                                                                 
                           
                                       
                                                                     
                                                            
                                                                      
                                                          
                                                                            
                           
                                          
                                                                     
                                                            
                                                                      
                                                                
                                                                                 
       
  }

  part def AcquisitionCycleControl :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port equipment_facts : DataPort { in :>> type : EquipmentFacts; }
    port batch_facts : DataPort { in :>> type : BatchFacts; }
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    port cycle_frame : DataPort { out :>> type : CycleFrame; }
                        
           
                         
                                
                
                             
                             
                                
                                                                                            
                                      
             
                             
                         
                                                                           
                     
                           
                                       
                                                                      
                                                                                       
                           
                                        
                                                                                                             
                                                                                      
                           
                                    
                                                                                                              
                                               
                                                                                     
                           
                                      
                                                                                                              
                                                                                        
                                                                                         
                           
                                       
                                                                                                              
                                                                                         
                                                                                    
                           
                                         
                                                                                                              
                                                                                         
                                                      
                                                                                      
       
  }

  part def ImageAvailabilityControl :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port request_facts : DataPort { in :>> type : RequestFactsRecord; }
    port batch_facts : DataPort { in :>> type : BatchFacts; }
    port image_result_facts : DataPort { in :>> type : ImageResultFacts; }
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    port image_frame : DataPort { out :>> type : ImageFrame; }
                        
           
                         
                                
                
                             
                             
                                
                                                                                        
                                            
             
                             
                         
                                                                           
                     
                           
                                       
                                                                      
                                                                                             
                           
                                        
                                                                                                             
                                                                                          
                           
                                        
                                                                                                              
                                                               
                                                                                              
                           
                                 
                                                                                                              
                                                                
                                                                   
                                                                                          
                           
                                    
                                                                                                              
                                                                
                                                                                                      
                                                                                              
                           
                                     
                                                                                                              
                                                                
                                                                                                      
                                                      
                                                                                               
       
  }

  part def RecoveryControl :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port recovery_event : DataPort { in :>> type : RecoveryEvent; }
    port fault_summary : DataPort { in :>> type : FaultSummary; }
    port recovery_frame : DataPort { out :>> type : RecoveryFrame; }
                        
           
                         
                                      
                
                                
                             
                                   
                                                                                                           
                                                                                                                 
                                                     
                                                              
                                                      
             
                                
                         
                                                
                                                          
                                                                                                         
                                                                                                           
                          
                                              
                                                 
                                                                                         
                                                              
                                                   
                                           
                                                                                                                
                                            
                                                                                                              
                                                                           
                                                                                                            
                                                                          
                          
                                                
                                                                                                              
                                                                                 
                                                                                                            
                                                                                                     
                                                                                                 
                                                                    
                                                                                                   
                                                                      
                                                                                                 
                                                                 
                     
                           
                                       
                                               
                                                                                                             
                                                              
                           
                                       
                                                                                                    
                                                                                                           
                                                              
                           
                                          
                                                                                                    
                                                                                                            
                                                    
                                                                
                           
                                            
                                                                                                    
                                                                                                              
                                                        
                                                              
                           
                                      
                                                                                                    
                                                              
                                                                                                      
                                                                                                            
                                                           
       
  }

  part def StartFeasibilityOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port request_facts : DataPort { in :>> type : RequestFactsRecord; }
    port preparation_facts : DataPort { in :>> type : PreparationFacts; }
    port equipment_facts : DataPort { in :>> type : EquipmentFacts; }
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    port start_feasibility : DataPort { out :>> type : StartFeasibility; }
                        
                
                             
                                                                                                 
             
                              
                                             
                                                                      
                                                                                                   
                                                                                                                
                                                                       
                                                                                                    
                                                                
                                                                 
       
  }

  part def CollectionFeasibilityOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    port session_frame : DataPort { in :>> type : SessionFrame; }
    port cycle_frame : DataPort { in :>> type : CycleFrame; }
    port collection_proposal : DataPort { out :>> type : Proposal; }
                        
                
                             
                                                                                                
             
                                
                                                  
                                                              
                                                                                                                
                                                       
                                                               
                                                                                                                  
                                                           
       
  }

  part def ImageReleaseFeasibilityOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    port session_frame : DataPort { in :>> type : SessionFrame; }
    port image_frame : DataPort { in :>> type : ImageFrame; }
    port release_proposal : DataPort { out :>> type : Proposal; }
                        
                
                             
                                                                                          
             
                                
                                                     
                                                              
                                                                                                                    
                                                    
                                                               
                                                                                                                      
                                                        
       
  }

  part def SupervisoryArbitration :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    port session_frame : DataPort { in :>> type : SessionFrame; }
    port cycle_frame : DataPort { in :>> type : CycleFrame; }
    port image_frame : DataPort { in :>> type : ImageFrame; }
    port collection_proposal : DataPort { in :>> type : Proposal; }
    port release_proposal : DataPort { in :>> type : Proposal; }
    port decision_frame : DataPort { out :>> type : DecisionFrame; }
                        
                
                             
                                         
                                                                
                                                                          
                                                                                                              
                                                                                                                 
                                                                                          
                                                                                                   
                                                           
             
                         
                                            
                                                                     
                                                               
                                                               
                                                                        
                                                                                             
                                                                                        
                                                                        
                                                                                   
                                                                     
                     
                           
                                      
                                                                      
                                                                                      
                                                                              
                           
                                     
                                                                                                 
                                                                            
                                                                        
                           
                                      
                                                                                                       
                                          
                                                                             
                                                                         
                           
                                        
                                                                                                       
                                                                                       
                                                                                     
                                                                            
                           
                                           
                                                                                                       
                                                                                            
                                           
                                                                                      
                                                                         
                           
                                           
                                                                                                       
                                                                                            
                                                                                           
                                                                               
                                                                             
                           
                                        
                                                                                                       
                                                                                            
                                                                                               
                                                                            
                                                                             
       
  }

  part def PublicationComposition :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port decision_frame : DataPort { in :>> type : DecisionFrame; }
    port control_frame : DataPort { out :>> type : ControlFrame; }
    port status_frame : DataPort { out :>> type : StatusFrame; }
                        
                
                             
                                         
                                                                             
                                                                                                              
                                                                        
                                                                                                          
                                                                                                             
                                                                      
                                                                                              
             
                             
                                           
                                                                             
                                                                    
                                                                                 
                                                                    
                                                                   
                                                                                  
                                                                    
                                                                     
                                                                                       
                                                                    
                                                                            
                                                                               
                                                                            
                                                                            
                                                                    
                                                                               
                                                                    
                         
                                          
                                                                      
                                                                    
                                                                
                                                                
                                                                      
                                                                      
                                                                        
                                                                           
                                                                                       
                                                                           
                                                                          
                                                                            
                                                                                                 
                                                                            
                                                                                                         
                                                                                                                
                                                                                                                     
                                                                                                                                    
                                                                                                                             
                                                                                                                         
                                                                  
                                                                                                                          
                                                                                                                      
       
  }

  part def EITAcquisitionProcess :> Process {
    port doctor_signal : DataPort { in :>> type : DoctorSignal; }
    port preparation_observation : DataPort { in :>> type : PreparationObservation; }
    port equipment_observation : DataPort { in :>> type : EquipmentObservation; }
    port batch_signal : DataPort { in :>> type : BatchSignal; }
    port image_feedback : DataPort { in :>> type : ImageFeedback; }
    port recovery_event : DataPort { in :>> type : RecoveryEvent; }
    port control_frame : DataPort { out :>> type : ControlFrame; }
    port status_frame : DataPort { out :>> type : StatusFrame; }

    part doctor_request_qualification : DoctorRequestQualification;
    part preparation_assessment : PreparationAssessment;
    part equipment_assessment : EquipmentAssessment;
    part batch_assessment : BatchAssessment;
    part image_result_assessment : ImageResultAssessment;
    part fault_composition : FaultComposition;
    part session_control : SessionControl;
    part acquisition_cycle_control : AcquisitionCycleControl;
    part image_availability_control : ImageAvailabilityControl;
    part recovery_control : RecoveryControl;
    part start_feasibility : StartFeasibilityOwner;
    part collection_feasibility : CollectionFeasibilityOwner;
    part image_release_feasibility : ImageReleaseFeasibilityOwner;
    part supervisory_arbitration : SupervisoryArbitration;
    part publication_composition : PublicationComposition;

    // Eight behavior-free Process-boundary connections.
    connection support01 : PortConnection connect doctor_signal to doctor_request_qualification.doctor_signal;
    connection support02 : PortConnection connect preparation_observation to preparation_assessment.preparation_observation;
    connection support03 : PortConnection connect equipment_observation to equipment_assessment.equipment_observation;
    connection support04 : PortConnection connect batch_signal to batch_assessment.batch_signal;
    connection support05 : PortConnection connect image_feedback to image_result_assessment.image_feedback;
    connection support06 : PortConnection connect recovery_event to recovery_control.recovery_event;
    connection support07 : PortConnection connect publication_composition.control_frame to control_frame;
    connection support08 : PortConnection connect publication_composition.status_frame to status_frame;

    connection int01 : PortConnection connect doctor_request_qualification.request_facts to fault_composition.request_facts;
    connection int02 : PortConnection connect doctor_request_qualification.request_facts to start_feasibility.request_facts;
    connection int03 : PortConnection connect doctor_request_qualification.request_facts to session_control.request_facts;
    connection int04 : PortConnection connect doctor_request_qualification.request_facts to image_availability_control.request_facts;
    connection int05 : PortConnection connect preparation_assessment.preparation_facts to fault_composition.preparation_facts;
    connection int06 : PortConnection connect preparation_assessment.preparation_facts to start_feasibility.preparation_facts;
    connection int07 : PortConnection connect equipment_assessment.equipment_facts to fault_composition.equipment_facts;
    connection int08 : PortConnection connect equipment_assessment.equipment_facts to start_feasibility.equipment_facts;
    connection int09 : PortConnection connect equipment_assessment.equipment_facts to acquisition_cycle_control.equipment_facts;
    connection int10 : PortConnection connect batch_assessment.batch_facts to fault_composition.batch_facts;
    connection int11 : PortConnection connect batch_assessment.batch_facts to acquisition_cycle_control.batch_facts;
    connection int12 : PortConnection connect batch_assessment.batch_facts to image_availability_control.batch_facts;
    connection int13 : PortConnection connect image_result_assessment.image_result_facts to fault_composition.image_result_facts;
    connection int14 : PortConnection connect image_result_assessment.image_result_facts to image_availability_control.image_result_facts;
    connection int15 : PortConnection connect fault_composition.fault_summary to recovery_control.fault_summary;
    connection int16 : PortConnection connect recovery_control.recovery_frame to session_control.recovery_frame;
    connection int17 : PortConnection connect recovery_control.recovery_frame to acquisition_cycle_control.recovery_frame;
    connection int18 : PortConnection connect recovery_control.recovery_frame to image_availability_control.recovery_frame;
    connection int19 : PortConnection connect recovery_control.recovery_frame to start_feasibility.recovery_frame;
    connection int20 : PortConnection connect recovery_control.recovery_frame to collection_feasibility.recovery_frame;
    connection int21 : PortConnection connect recovery_control.recovery_frame to image_release_feasibility.recovery_frame;
    connection int22 : PortConnection connect recovery_control.recovery_frame to supervisory_arbitration.recovery_frame;
    connection int23 : PortConnection connect start_feasibility.start_feasibility to session_control.start_feasibility;
    connection int24 : PortConnection connect session_control.session_frame to collection_feasibility.session_frame;
    connection int25 : PortConnection connect session_control.session_frame to image_release_feasibility.session_frame;
    connection int26 : PortConnection connect session_control.session_frame to supervisory_arbitration.session_frame;
    connection int27 : PortConnection connect acquisition_cycle_control.cycle_frame to collection_feasibility.cycle_frame;
    connection int28 : PortConnection connect acquisition_cycle_control.cycle_frame to supervisory_arbitration.cycle_frame;
    connection int29 : PortConnection connect image_availability_control.image_frame to image_release_feasibility.image_frame;
    connection int30 : PortConnection connect image_availability_control.image_frame to supervisory_arbitration.image_frame;
    connection int31 : PortConnection connect collection_feasibility.collection_proposal to supervisory_arbitration.collection_proposal;
    connection int32 : PortConnection connect image_release_feasibility.release_proposal to supervisory_arbitration.release_proposal;
    connection int33 : PortConnection connect supervisory_arbitration.decision_frame to publication_composition.decision_frame;
  }

  part def EITAcquisitionSupervisorSystem :> System {
    port doctor_signal : DataPort { in :>> type : DoctorSignal; }
    port preparation_observation : DataPort { in :>> type : PreparationObservation; }
    port equipment_observation : DataPort { in :>> type : EquipmentObservation; }
    port batch_signal : DataPort { in :>> type : BatchSignal; }
    port image_feedback : DataPort { in :>> type : ImageFeedback; }
    port recovery_event : DataPort { in :>> type : RecoveryEvent; }
    port control_frame : DataPort { out :>> type : ControlFrame; }
    port status_frame : DataPort { out :>> type : StatusFrame; }

    part acquisition_process : EITAcquisitionProcess;
    connection support09 : PortConnection connect doctor_signal to acquisition_process.doctor_signal;
    connection support10 : PortConnection connect preparation_observation to acquisition_process.preparation_observation;
    connection support11 : PortConnection connect equipment_observation to acquisition_process.equipment_observation;
    connection support12 : PortConnection connect batch_signal to acquisition_process.batch_signal;
    connection support13 : PortConnection connect image_feedback to acquisition_process.image_feedback;
    connection support14 : PortConnection connect recovery_event to acquisition_process.recovery_event;
    connection support15 : PortConnection connect acquisition_process.control_frame to control_frame;
    connection support16 : PortConnection connect acquisition_process.status_frame to status_frame;
  }

  part eit_acquisition_supervisor : EITAcquisitionSupervisorSystem;
}
