package Vehicle_Mode_Coordinator {

  private import HAMR::*;

  enum def ReportedCondition {
    enum Normal;
    enum Degraded;
    enum Invalid;
  }

  enum def ReportCurrency {
    enum Current;
    enum Stale;
  }

  enum def ConditionAssessment {
    enum CurrentNormal;
    enum CurrentDegraded;
    enum Unusable;
  }

  enum def ControllerMode {
    enum Off;
    enum Starting;
    enum On;
    enum Maintenance;
    enum Degraded;
  }

  enum def RecoveryTarget {
    enum Off;
    enum Starting;
    enum On;
  }

  enum def ParkingBrakeDisposition {
    enum Apply;
    enum Release;
  }

  enum def CoordinationStatus {
    enum IdleOff;
    enum StartingSequence;
    enum Operating;
    enum MaintenanceHandoff;
    enum DegradedCondition;
    enum DegradedInvalid;
    enum RecoveryResumed;
    enum ShutdownDominant;
    enum RequestConflict;
    enum RequestInapplicable;
  }

  enum def SelectedIntent {
    enum SelectOff;
    enum SelectInvalidDegraded;
    enum SelectConditionDegraded;
    enum SelectMaintenance;
    enum SelectReturn;
    enum SelectOn;
    enum SelectStart;
    enum SelectHold;
  }

  enum def QualifiedTransition {
    enum QualifiedStay;
    enum QualifiedGoOff;
    enum QualifiedGoStarting;
    enum QualifiedGoOn;
    enum QualifiedGoMaintenance;
    enum QualifiedGoDegraded;
    enum QualifiedResumeStored;
    enum QualifiedReject;
  }

  enum def TransitionKind {
    enum Stay;
    enum GoOff;
    enum GoStarting;
    enum GoOn;
    enum GoMaintenance;
    enum GoDegraded;
    enum ResumeStored;
    enum Reject;
  }

  part def LifecycleLevels :> Data {
    attribute startLevel : Base_Types::Boolean;
    attribute onLevel : Base_Types::Boolean;
    attribute offLevel : Base_Types::Boolean;
  }

  part def ServiceLevels :> Data {
    attribute maintenanceLevel : Base_Types::Boolean;
    attribute returnNormalLevel : Base_Types::Boolean;
  }

  part def ConditionEvidence :> Data {
    attribute reportedCondition : ReportedCondition;
    attribute reportCurrency : ReportCurrency;
  }

  part def LifecycleFacts :> Data {
    attribute freshStart : Base_Types::Boolean;
    attribute freshOn : Base_Types::Boolean;
    attribute offActive : Base_Types::Boolean;
    attribute lifecycleConflict : Base_Types::Boolean;
  }

  part def ServiceFacts :> Data {
    attribute freshMaintenance : Base_Types::Boolean;
    attribute freshReturn : Base_Types::Boolean;
    attribute serviceConflict : Base_Types::Boolean;
  }

  part def ArbitrationResult :> Data {
    attribute selectedIntent : SelectedIntent;
    attribute priorityConflict : Base_Types::Boolean;
  }

  part def TransitionResolution :> Data {
    attribute nextMode : ControllerMode;
    attribute kind : TransitionKind;
    attribute accepted : Base_Types::Boolean;
  }

  part def CoordinationOutcome :> Data {
    attribute parkingBrake : ParkingBrakeDisposition;
    attribute status : CoordinationStatus;
  }

  part def LifecycleEventOwner :> Thread {
    port lifecycleLevels : DataPort { in :>> type : LifecycleLevels; }
    port lifecycleFacts : DataPort { out :>> type : LifecycleFacts; }

                        
           
                                            
                                         
                                          

                
                                                        
                 
                            
                                                                                                    
                                                                     
                                                                          
                                                                                  

             
                                                        
                          
                                                                                                                  
                                                                                             
                                                                                    
                                                               

                         
                                                                                                     
                                             
                                                                     
                                                                      
                                                                   

                          
                                                                                                
                                                       
                                                 
                                                  
       
  }

  part def ServiceEventOwner :> Thread {
    port serviceLevels : DataPort { in :>> type : ServiceLevels; }
    port serviceFacts : DataPort { out :>> type : ServiceFacts; }

                        
           
                                                  
                                             

                
                                                     
                 
                            
                                                                                                
                                                            
                                                                                
                                              

             
                                                     
                          
                                                                                       
                                          
                                                                            
                                     
                                                                       

                         
                                                                                                   
                                         
                                                                               

                          
                                                                                             
                                                                 
                                                            
       
  }

  part def ConditionAssessmentOwner :> Thread {
    port conditionEvidence : DataPort { in :>> type : ConditionEvidence; }
    port conditionAssessment : DataPort { out :>> type : ConditionAssessment; }

                        
             
                         
                                                                                                                   
                                                                             
                                                                    
                                                                        
                                                                                     
                                                                    
                                                                        
                                                                                      
                                                                           
                                                                        
                                                                                    
                                                                        
       
  }

  part def IntentArbitrationOwner :> Thread {
    port lifecycleFacts : DataPort { in :>> type : LifecycleFacts; }
    port serviceFacts : DataPort { in :>> type : ServiceFacts; }
    port conditionAssessment : DataPort { in :>> type : ConditionAssessment; }
    port arbitrationForQualification : DataPort { out :>> type : ArbitrationResult; }
    port arbitrationForPublication : DataPort { out :>> type : ArbitrationResult; }

                        
               
                                 
                                  
                                  
                                  
                                  
                                  
                                  
                                                           
                                           
                                       
                                   
                               
                           
                    

             
                        
                                                                                                               
                                                         
                                                                              
                                  
                                        
                                                                   
                                                                          
                                             
                                        
                                      
                                            
                                                       
                                                         

                        
                                                                                                       
                                                     
                                                       

                     
                           
                                                                      
                                            
                                                                                             

                           
                                                                                  
                                                 
                                                                  
                                                                                                         

                           
                                                                                                 
                                                 
                                                                         
                                                                                                           

                           
                                                                                       
                                                 
                                                                        
                                            
                                                                                                     

                           
                                                                                        
                                                 
                                                                        
                                                                           
                                                                                                

                           
                                                                                              
                                                 
                                                                        
                                                                                
                                     
                                                                                            

                           
                                                                                            
                                                 
                                                                        
                                                                                
                                                                     
                                                                                               

                           
                                                        
                                                 
                                                                        
                                                                                
                                                                         
                                                                                              
       
  }

  part def TransitionQualificationOwner :> Thread {
    port arbitrationResult : DataPort { in :>> type : ArbitrationResult; }
    port currentMode : DataPort { in :>> type : ControllerMode; }
    port qualifiedTransition : DataPort { out :>> type : QualifiedTransition; }

                        
             
                     
                           
                                                                                     
                                                                                
                                                                                

                           
                                                                                                              
                                                                                             
                                                                                         
                                                                                     

                           
                                                                                                       
                                                                                         
                                                     
                                                                                        

                           
                                                                                     
                                                                                         
                                                     
                                                                                 

                           
                                                                                    
                                                                                    
                                                     
                                                                                       

                           
                                                                                    
                                                                                    
                                                        
                                                                                

                           
                                                                                                   
                                                                                    
                                                  
                                                       
                                                 
                                                                                 

                           
                                                                           
                                                                                
                                                     
                                                                               

                           
                                                                                 
                                                                                
                                                     
                                                                                 

                           
                                                                            
                                                                                   
                                                
                                                                                     

                           
                                                                                  
                                                                                   
                                                
                                                                                 

                           
                                                                              
                                                                                 
                                                                               
       
  }

  part def ModeTransitionApplicationOwner :> Thread {
    port storedRecoveryTarget : DataPort { in :>> type : RecoveryTarget; }
    port qualifiedTransition : DataPort { in :>> type : QualifiedTransition; }
    port modeForQualification : DataPort { out :>> type : ControllerMode; }
    port modeForRecovery : DataPort { out :>> type : ControllerMode; }
    port resolutionForRecovery : DataPort { out :>> type : TransitionResolution; }
    port resolutionForPublication : DataPort { out :>> type : TransitionResolution; }
    port appliedNextMode : DataPort { out :>> type : ControllerMode; }

                        
           
                                        

                
                                
                 
                            
                                                                                                        
                                                  
                                                        
                                                   
                                                                  
                                                               
                                            
                                                                     
                                                                  
                                               
                                                  

             
                                
                          
                                                                                                              
                                                      
                                                

                          
                                                                                                        
                                                                             
                                                                   
                                                                
                                               
                                                                               
                                                                   
                                                                  
                                                  

                          
                                                                                                   
                                                                              
                                                                   
                                                                                                    
                                                                                   
                                                                        
                                                                                                         
                                                                             
                                                                  
                                                                                                   
                                                                                      
                                                                           
                                                                                                            
                                                                                   
                                                                        
                                                                                                        

                          
                                                                                                                           
                                                                                    
                                                                  
                                                                         
                                                                       
                                                                              
                                                                 
                                                                        
                                                                        
                                             

                        
                                                                                                          
                                                                               
                                                                       
                                                                              

                         
                                                                                                                  
                                                            
                                                            
       
  }

  part def CoordinationPublicationOwner :> Thread {
    port arbitrationResult : DataPort { in :>> type : ArbitrationResult; }
    port appliedResolution : DataPort { in :>> type : TransitionResolution; }
    port coordinationOutcome : DataPort { out :>> type : CoordinationOutcome; }

                        
                
                 
                          
                                                                                                                 
                                                                               
                                                                     

             
                        
                                                                                              
                                                                                   
                                                               

                        
                                                                                                                   
                                                                                 
                                                                           
                                                   
                                                                                    
                                                                                
                                                       
                                                                
                                                                                
                                                                                
                                                       
                                                              
                                                                      
                                                                                
                                                                                
                                                       
                                                              
                                                                    
                                                                                         
                                                                                  
                                                                                 
                                                        
                                                               
                                                                     
                                                                                           
                                                                                 
                                                        
                                                               
                                                                     
                                                                                        
                                                                                          
                                                      
                                                                        
                                                                                
                                                                                
                                                       
                                                              
                                                                    
                                                                                       
                                                                                         
                                                   
                                                                        
                                                     
                                                              
                                                                    
                                                                                       
                                                                                         
                                                                 
                                                                                 
                                                     
                                                              
                                                                    
                                                                                       
                                                                                         
                                                                      
                                                                          
                                                     
                                                              
                                                                    
                                                                                       
                                                                                         
                                                                
                                                                                   
                                                     
                                                              
                                                                    
                                                                                       
                                                                                         
                                                                        
       
  }

  part def RecoveryTargetOwner :> Thread {
    port currentMode : DataPort { in :>> type : ControllerMode; }
    port appliedResolution : DataPort { in :>> type : TransitionResolution; }
    port storedRecoveryTarget : DataPort { out :>> type : RecoveryTarget; }

                        
           
                                        

                
                                
                 
                            
                                                                                                  
                                                  
                                                       

             
                                
                        
                                                                                                                  
                                                     

                          
                                                                                                                                 
                                                    
                                                                          
                                                            
                                              
                                                                          
                                                      
                                                
                                                         
                                                                          
                                                       
                                                    
                                                                          
                                                       
                                                    
                                                                          
                                                       
                                                    
                                                                          
                                                      
       
  }

  part def VehicleModeCoordinationProcess :> Process {
    port lifecycleLevels : DataPort { in :>> type : LifecycleLevels; }
    port serviceLevels : DataPort { in :>> type : ServiceLevels; }
    port conditionEvidence : DataPort { in :>> type : ConditionEvidence; }
    port controllerMode : DataPort { out :>> type : ControllerMode; }
    port coordinationOutcome : DataPort { out :>> type : CoordinationOutcome; }

    part lifecycleEventOwner : LifecycleEventOwner;
    part serviceEventOwner : ServiceEventOwner;
    part conditionAssessmentOwner : ConditionAssessmentOwner;
    part intentArbitrationOwner : IntentArbitrationOwner;
    part coordinationPublicationOwner : CoordinationPublicationOwner;
    part recoveryTargetOwner : RecoveryTargetOwner;
    part transitionQualificationOwner : TransitionQualificationOwner;
    part modeTransitionApplicationOwner : ModeTransitionApplicationOwner;

    connection int01 : PortConnection connect lifecycleLevels to lifecycleEventOwner.lifecycleLevels;
    connection int02 : PortConnection connect serviceLevels to serviceEventOwner.serviceLevels;
    connection int03 : PortConnection connect conditionEvidence to conditionAssessmentOwner.conditionEvidence;
    connection int04 : PortConnection connect lifecycleEventOwner.lifecycleFacts to intentArbitrationOwner.lifecycleFacts;
    connection int05 : PortConnection connect serviceEventOwner.serviceFacts to intentArbitrationOwner.serviceFacts;
    connection int06 : PortConnection connect conditionAssessmentOwner.conditionAssessment to intentArbitrationOwner.conditionAssessment;
    connection int07 : PortConnection connect intentArbitrationOwner.arbitrationForQualification to transitionQualificationOwner.arbitrationResult;
    connection int08 : PortConnection connect modeTransitionApplicationOwner.modeForQualification to transitionQualificationOwner.currentMode;
    connection int09 : PortConnection connect recoveryTargetOwner.storedRecoveryTarget to modeTransitionApplicationOwner.storedRecoveryTarget;
    connection int10 : PortConnection connect transitionQualificationOwner.qualifiedTransition to modeTransitionApplicationOwner.qualifiedTransition;
    connection int11 : PortConnection connect modeTransitionApplicationOwner.modeForRecovery to recoveryTargetOwner.currentMode;
    connection int12 : PortConnection connect modeTransitionApplicationOwner.resolutionForRecovery to recoveryTargetOwner.appliedResolution;
    connection int13 : PortConnection connect modeTransitionApplicationOwner.resolutionForPublication to coordinationPublicationOwner.appliedResolution;
    connection int14 : PortConnection connect intentArbitrationOwner.arbitrationForPublication to coordinationPublicationOwner.arbitrationResult;
    connection int15 : PortConnection connect modeTransitionApplicationOwner.appliedNextMode to controllerMode;
    connection int16 : PortConnection connect coordinationPublicationOwner.coordinationOutcome to coordinationOutcome;
  }

  part def VehicleControllerOperatingModeCoordinator :> System {
    port lifecycleLevels : DataPort { in :>> type : LifecycleLevels; }
    port serviceLevels : DataPort { in :>> type : ServiceLevels; }
    port conditionEvidence : DataPort { in :>> type : ConditionEvidence; }
    port controllerMode : DataPort { out :>> type : ControllerMode; }
    port coordinationOutcome : DataPort { out :>> type : CoordinationOutcome; }

    part vehicleModeCoordinationProcess : VehicleModeCoordinationProcess;

    connection supportInt01 : PortConnection connect lifecycleLevels to vehicleModeCoordinationProcess.lifecycleLevels;
    connection supportInt02 : PortConnection connect serviceLevels to vehicleModeCoordinationProcess.serviceLevels;
    connection supportInt03 : PortConnection connect conditionEvidence to vehicleModeCoordinationProcess.conditionEvidence;
    connection supportInt15 : PortConnection connect vehicleModeCoordinationProcess.controllerMode to controllerMode;
    connection supportInt16 : PortConnection connect vehicleModeCoordinationProcess.coordinationOutcome to coordinationOutcome;
  }

  part vehicleControllerOperatingModeCoordinator : VehicleControllerOperatingModeCoordinator;
}
