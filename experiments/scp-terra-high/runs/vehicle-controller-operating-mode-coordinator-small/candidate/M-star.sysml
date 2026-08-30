// Canonical SysML-AADL/GUMBO realization of the approved controller-mode
// coordination baseline.

package Vehicle_Controller_Mode_Coordinator {
  private import HAMR::*;

  enum def InputStatus { enum Valid; enum Invalid; }

  enum def LifecycleEvent {
    enum NoLifecycleEvent; enum Start; enum On; enum Off;
  }

  enum def ConditionEvent {
    enum NoConditionEvent; enum Maintenance; enum Degraded; enum ReturnToNormal;
  }

  enum def ControllerModeDisposition {
    enum Off; enum Starting; enum On; enum Maintenance; enum Degraded;
  }

  enum def CoordinationResult {
    enum Applied; enum Stable; enum Rejected; enum EvidenceFault;
  }

  enum def LifecycleAssessment {
    enum InvalidLifecycle; enum NoLifecycle; enum StartRequested;
    enum OnRequested; enum OffRequested;
  }

  enum def ConditionAssessment {
    enum InvalidCondition; enum NoCondition; enum MaintenanceRequested;
    enum DegradedReported; enum ReturnRequested;
  }

  enum def CoordinationClass {
    enum InvalidEvidence; enum Quiet; enum LifecycleOnly; enum ConditionOnly;
    enum OffDominantConflict; enum ConditionDominantConflict;
    enum RecoveryConflict;
  }

  enum def DecisionReason {
    enum InvalidEvidence; enum OffAccepted; enum DegradedAccepted;
    enum MaintenanceAccepted; enum ConflictingRequestsRejected;
    enum ReturnAccepted; enum ReturnNotApplicable; enum OnAccepted;
    enum StartAccepted; enum NoRequest; enum TransitionRejected;
  }

  // Every record field inspected by GUMBO is declared as an attribute.
  part def LifecycleSample :> Data {
    attribute eventValue : LifecycleEvent;
    attribute status : InputStatus;
  }

  part def ConditionSample :> Data {
    attribute eventValue : ConditionEvent;
    attribute status : InputStatus;
  }

  part def ModeDecision :> Data {
    attribute nextMode : ControllerModeDisposition;
    attribute reason : DecisionReason;
  }

  part def LifecycleIndicationQualification :> Thread {
    port lifecycle_sample : DataPort { in :>> type : LifecycleSample; }
    port assessment_to_compatibility : DataPort { out :>> type : LifecycleAssessment; }
    port assessment_to_arbiter : DataPort { out :>> type : LifecycleAssessment; }

                        
               
                              
                                                                              
                                                                                         
                                                                                                      
                                                                                              
                                                                                        
                                                

                
                         
                                                     
                                                                          
                                                                   

             
                              
                                       
                                                                              
                                                                       
       
  }

  part def ConditionIndicationQualification :> Thread {
    port condition_sample : DataPort { in :>> type : ConditionSample; }
    port assessment_to_compatibility : DataPort { out :>> type : ConditionAssessment; }
    port assessment_to_arbiter : DataPort { out :>> type : ConditionAssessment; }

                        
               
                              
                                                                              
                                                                                         
                                                                                                      
                                                                                                          
                                                                                                   
                                                   

                
                         
                                                     
                                                                          
                                                                   

             
                              
                                       
                                                                              
                                                                       
       
  }

  part def CrossChannelCompatibility :> Thread {
    port lifecycle_assessment : DataPort { in :>> type : LifecycleAssessment; }
    port condition_assessment : DataPort { in :>> type : ConditionAssessment; }
    port coordination_class : DataPort { out :>> type : CoordinationClass; }

                        
               
                           
                                               
                                                                     
                                                            
                                                                                              
                                                            
                                                                                    
                                                            
                                                                                            
                                                            
                                                                                            
                                                                                                   
                                                                
                                                              
                                                                      
                                                                                                               
                                                  

                
                         
                                             
                                                        

             
                           
                                           
                                                                                     
       
  }

  part def ControllerModeArbitration :> Thread {
    port lifecycle_assessment : DataPort { in :>> type : LifecycleAssessment; }
    port condition_assessment : DataPort { in :>> type : ConditionAssessment; }
    port coordination_class : DataPort { in :>> type : CoordinationClass; }
    port mode_decision : DataPort { out :>> type : ModeDecision; }

                        
                        
           
                          
                                                  

               
                            
                                                     
                                                                           
                                                            
                                                                                              
                                                            
                                                                                    
                                                            
                                                                                            
                                                            
                                                                                            
                                                                                                   
                                                                
                                                              
                                                                      
                                                                                                               
                                                  

                            
                                                 
                                                 
                                                                       
                                             

                         
                                                    
                                                    
                                                                          
                                                        
                                                        
                                           

                         
                                                    
                                                    
                                                                          
                                               
                                                   

                         
                                                    
                                                    
                                                                          
                                               
                                               
                                                       

                         
                                                    
                                                    
                                                                          
                                               
                                               
                                               
                                                           

                         
                                                    
                                                    
                                                                          
                                               
                                               
                                               
                                               
                                                     

                         
                                                    
                                                    
                                                  
                                                                                  
                                               
                                               
                                               
                                               
                                               
                                                   
                                                       
                                                          
                                                       

                         
                                                    
                                                    
                                                  
                                                                                  
                                               
                                               
                                               
                                               
                                               
                                                     
                                                   
                                                      

                         
                                                    
                                                    
                                                  
                                                                                  
                                               
                                               
                                               
                                               
                                               
                                                     
                                                     
                                                   
                                                   
                                                       
                                                 

                         
                                                    
                                                    
                                                  
                                                                                  
                                               
                                               
                                               
                                               
                                               
                                                     
                                                     
                                                     
                                                      
                                                   
                                                  
                                                       

                         
                                                    
                                                    
                                                  
                                                                                  
                                               
                                               
                                               
                                               
                                               
                                                     
                                                     
                                                     
                                                     
                                                   
                                                  

                         
                                                    
                                                    
                                                  
                                                                                  
                                               
                                               
                                               
                                               
                                               
                                                     
                                                     
                                                     
                                                     
                                                    

                
                                
                         
                                    
                                                          
                         
                                        
                                                                   
                                                           

             
                                

                        
                                             
                                                   

                             
                     
                           
                                               
                                                                            
                                                     
                                                                            
                                                                                    
                                                                             

                           
                                    
                                                                            
                                                     
                                                                       
                                                                               
                                                                         

                           
                                         
                                                                            
                                                     
                                                                            
                                                                                    
                                                                              

                           
                                            
                                                                            
                                                     
                                                                               
                                                                                       
                                                                                 

                           
                                         
                                                                            
                                                     
                                                            
                                                                    
                                                                                         

                           
                                       
                                                                            
                                                                         
                                                                       
                                                                               
                                                                            

                           
                                             
                                                                            
                                                                         
                                                            
                                                                    
                                                                                 

                           
                                   
                                                                            
                                                                         
                                                                      
                                                                              
                                                                        

                           
                                      
                                                                            
                                                                         
                                                                            
                                                                                    
                                                                           

                           
                                  
                                                                            
                                                                         
                                                            
                                                                    
                                                                       

                           
                                           
                                                                            
                                                                         
                                                            
                                                                    
                                                                                
       
  }

  part def CoordinationFrameDerivation :> Thread {
    port mode_decision : DataPort { in :>> type : ModeDecision; }
    port mode_disposition : DataPort { out :>> type : ControllerModeDisposition; }
    port coordination_result : DataPort { out :>> type : CoordinationResult; }

                        
               
                        
                                                                     
                                                                                         
                                                                                 
                                                                         
                                                                 
                                                                                            
                                          

                
                         
                                     
                                                             
                                                           

             
                        
                                   
                                                      
                                                                  
       
  }

  part def ModeCoordinationProcess :> Process {
    port lifecycle_sample : DataPort { in :>> type : LifecycleSample; }
    port condition_sample : DataPort { in :>> type : ConditionSample; }
    port mode_disposition : DataPort { out :>> type : ControllerModeDisposition; }
    port coordination_result : DataPort { out :>> type : CoordinationResult; }

    part lifecycle_indication_qualification : LifecycleIndicationQualification;
    part condition_indication_qualification : ConditionIndicationQualification;
    part cross_channel_compatibility : CrossChannelCompatibility;
    part controller_mode_arbitration : ControllerModeArbitration;
    part coordination_frame_derivation : CoordinationFrameDerivation;

    connection int01 : PortConnection
      connect lifecycle_sample to lifecycle_indication_qualification.lifecycle_sample;
    connection int02 : PortConnection
      connect condition_sample to condition_indication_qualification.condition_sample;
    connection int03 : PortConnection
      connect lifecycle_indication_qualification.assessment_to_compatibility to cross_channel_compatibility.lifecycle_assessment;
    connection int04 : PortConnection
      connect condition_indication_qualification.assessment_to_compatibility to cross_channel_compatibility.condition_assessment;
    connection int05 : PortConnection
      connect lifecycle_indication_qualification.assessment_to_arbiter to controller_mode_arbitration.lifecycle_assessment;
    connection int06 : PortConnection
      connect condition_indication_qualification.assessment_to_arbiter to controller_mode_arbitration.condition_assessment;
    connection int07 : PortConnection
      connect cross_channel_compatibility.coordination_class to controller_mode_arbitration.coordination_class;
    connection int08 : PortConnection
      connect controller_mode_arbitration.mode_decision to coordination_frame_derivation.mode_decision;
    connection int09 : PortConnection
      connect coordination_frame_derivation.mode_disposition to mode_disposition;
    connection int10 : PortConnection
      connect coordination_frame_derivation.coordination_result to coordination_result;
  }

  part def VehicleControllerModeCoordinatorSystem :> System {
    port lifecycle_sample : DataPort { in :>> type : LifecycleSample; }
    port condition_sample : DataPort { in :>> type : ConditionSample; }
    port mode_disposition : DataPort { out :>> type : ControllerModeDisposition; }
    port coordination_result : DataPort { out :>> type : CoordinationResult; }

    part mode_coordination_process : ModeCoordinationProcess;

    connection support01 : PortConnection
      connect lifecycle_sample to mode_coordination_process.lifecycle_sample;
    connection support02 : PortConnection
      connect condition_sample to mode_coordination_process.condition_sample;
    connection support03 : PortConnection
      connect mode_coordination_process.mode_disposition to mode_disposition;
    connection support04 : PortConnection
      connect mode_coordination_process.coordination_result to coordination_result;
  }

  part vehicle_controller_mode_coordinator : VehicleControllerModeCoordinatorSystem;
}
