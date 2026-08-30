// Retained architecture checkpoint: types, ports, usages, and connections only.
// GUMBO behavior is intentionally absent from this stage.

package Vehicle_Start_Readiness_Recovery_Supervisor {
  private import HAMR::*;

  enum def BrakeObservation { enum Pressed; enum Released; enum Invalid; }
  enum def ThermalCondition { enum Normal; enum OverMaximum; enum Invalid; }
  enum def MaintenanceCondition { enum NotDue; enum Due; enum Invalid; }
  enum def HealthQualification { enum Ready; enum NotReady; enum Invalid; }
  enum def PowerObservation { enum Available; enum Unavailable; enum Invalid; }
  enum def SelfTestObservation { enum NoEvent; enum FreshPass; enum FreshFail; enum Invalid; }
  enum def RequestDisposition { enum OffDominant; enum ReturnCandidate; enum StartCandidate; enum None; }
  enum def StartDecision { enum OffPriority; enum NoStart; enum DenyInvalid; enum DenyNotReady; enum BeginStartTest; }
  enum def CommittedTestCycle {
    enum Idle; enum AwaitingStart; enum AwaitingRecovery; enum StartPassed;
    enum RecoveryPassed; enum Failed; enum Invalid;
  }
  enum def CycleAssessment {
    enum Idle; enum AwaitingStart; enum AwaitingRecovery; enum StartPassed;
    enum RecoveryPassed; enum Failed; enum Invalid;
  }
  enum def LifecycleMode { enum Off; enum Starting; enum On; enum Degraded; }
  enum def LifecyclePreMode { enum Off; enum Starting; enum On; enum Degraded; }
  enum def TestCycleDirective { enum None; enum BeginStart; enum BeginRecovery; enum Clear; }
  enum def LifecycleDirectiveSnapshot { enum None; enum BeginStart; enum BeginRecovery; enum Clear; }
  enum def LifecycleReason {
    enum Ordinary; enum QualificationInvalid; enum QualificationNotReady;
    enum RecoveryAwaiting; enum RecoveryCompleted;
  }
  enum def StartEnable { enum Inhibit; enum Permit; }
  enum def ParkingBrakeCommand { enum Apply; enum Release; }
  enum def PowerDisposition { enum Isolate; enum TestOnly; enum Enable; }
  enum def SelfTestCommand { enum None; enum Initiate; }
  enum def SupervisoryStatus {
    enum Idle; enum RequestConflict; enum StartBlockedInvalid; enum StartBlockedNotReady;
    enum Testing; enum Operating; enum Degraded; enum RecoveryTesting;
    enum RecoveredAwaitFreshStart;
  }
  enum def ControlLifecycleMode { enum Off; enum Starting; enum On; enum Degraded; }

  // Every record member later inspected by GUMBO is an attribute.
  part def RequestLevels :> Data {
    attribute start : Base_Types::Boolean;
    attribute off : Base_Types::Boolean;
    attribute returnLevel : Base_Types::Boolean;
  }
  part def BrakeFacts :> Data {
    attribute evidenceTrusted : Base_Types::Boolean;
    attribute readyForAdmission : Base_Types::Boolean;
  }
  part def HealthObservation :> Data {
    attribute thermal : ThermalCondition;
    attribute maintenance : MaintenanceCondition;
  }
  part def PowerFacts :> Data {
    attribute evidenceTrusted : Base_Types::Boolean;
    attribute availableForSupervision : Base_Types::Boolean;
  }
  part def RequestFacts :> Data {
    attribute offActive : Base_Types::Boolean;
    attribute freshReturn : Base_Types::Boolean;
    attribute freshStart : Base_Types::Boolean;
    attribute conflict : Base_Types::Boolean;
    attribute disposition : RequestDisposition;
  }
  part def StartAuthorizationFacts :> Data {
    attribute decision : StartDecision;
    attribute conflict : Base_Types::Boolean;
  }
  part def AppliedLifecycleSnapshot :> Data {
    attribute cycleDirective : LifecycleDirectiveSnapshot;
    // Tool-required one-to-one pre-state projection authorized by CONSTR-04.
    attribute preModeSnapshot : LifecyclePreMode;
    attribute nextMode : LifecycleMode;
    attribute reason : LifecycleReason;
  }
  part def ControlFrame :> Data {
    attribute startEnable : StartEnable;
    attribute parkingBrake : ParkingBrakeCommand;
    attribute powerDisposition : PowerDisposition;
    attribute selfTestCommand : SelfTestCommand;
    // Tool-required one-to-one boundary projection authorized by CONSTR-04.
    attribute lifecycleMode : ControlLifecycleMode;
    attribute status : SupervisoryStatus;
  }

  part def RequestPriorityOwner :> Thread {
    port request_levels : DataPort { in :>> type : RequestLevels; }
    port request_to_authorization : DataPort { out :>> type : RequestFacts; }
    port request_to_lifecycle : DataPort { out :>> type : RequestFacts; }

                        
           
                          
                                           
                          
                                         
                          
                                            
                
                                                            
                          
                                          
                                                                       
                                                   
                                                     
                                                    
                                                  
                                                                           
                                               
                                                 
                                                
                                              
                                                                      
             
                                                            
                         
                                              
                                                                    
                                                  
                                                                    
                                                 
                                                             
                                               
                                                                                          
                                                                                         
                                                                                             
                                                
                                                                                     
                                                                                           
                                                                                         
                                                                                               
                                                 
                                                                                        
                                                                                               
                                                     
                                                                               
                                                                                
                                                                                    
                                                                                  
                                                                              
                                                                                    
                                                                                     
                                                       
       
  }

  part def BrakeQualificationOwner :> Thread {
    port brake_observation : DataPort { in :>> type : BrakeObservation; }
    port brake_to_authorization : DataPort { out :>> type : BrakeFacts; }
    port brake_to_lifecycle : DataPort { out :>> type : BrakeFacts; }

                        
                
                        
                                           
                                                       
                                                         
                                                   
                                                    
             
                         
                                        
                                                           
                                                    
                                                       
                                                            
                                                    
                                                            
                                                           
                                                         
                                                             
                                                                                        
                                                                                           
       
  }

  part def HealthQualificationOwner :> Thread {
    port health_observation : DataPort { in :>> type : HealthObservation; }
    port health_to_authorization : DataPort { out :>> type : HealthQualification; }
    port health_to_lifecycle : DataPort { out :>> type : HealthQualification; }

                        
                
                        
                                                    
                                                                  
                                                             
             
                         
                                                  
                                                                     
                                                                              
                                                                     
                                                                    
                                                                            
                                                                         
                                                                          
                                                                      
                                                                   
                                                                           
                                                                    
                                                         
       
  }

  part def PowerQualificationOwner :> Thread {
    port power_observation : DataPort { in :>> type : PowerObservation; }
    port power_to_authorization : DataPort { out :>> type : PowerFacts; }
    port power_to_lifecycle : DataPort { out :>> type : PowerFacts; }

                        
                
                        
                                           
                                                       
                                                               
                                                   
                                                          
             
                         
                                        
                                                             
                                                    
                                                             
                                                               
                                                    
                                                                  
                                                           
                                                         
                                                                   
                                                                                        
                                                       
                                                           
       
  }

  part def SelfTestCycleOwner :> Thread {
    port self_test_observation : DataPort { in :>> type : SelfTestObservation; }
    port test_cycle_directive : DataPort { in :>> type : TestCycleDirective; }
    port cycle_assessment : DataPort { out :>> type : CycleAssessment; }

                        
           
                          
                                               
                
                                    
                          
                                     
                                                         
                                                   
             
                                    
                          
                                              
                                                                        
                                                                  
                                                                
                                                                        
                                                                    
                                                              
                                                                        
                                                                    
                                                         
                                                                        
                                                                  
                                                          
                                                                           
                                                                  
                                                                   
                                                                           
                                                                    
                                                                 
                                                                           
                                                                    
                                                         
                                                                           
                                                                  
                                                          
                                                                       
                                                                           
                                                                  
                                                          
                                                               
                                                       
                                                                      
                                                                  
                                                              
                                                                         
                                                                  
                                                                 
                                                                 
                                                         
                                                                  
                                                          
                          
                                                 
                                                              
                                                            
                                                                   
                                                                     
                                                                      
                                                                        
                                                             
                                                        
                                                              
                                                                 
                                                                       
                                                                    
                                                                          
                                                               
                                                                     
                                                                  
                                                                        
                                                          
                                                                
                                                           
                                                                   
       
  }

  part def StartAuthorizationOwner :> Thread {
    port request_facts : DataPort { in :>> type : RequestFacts; }
    port brake_facts : DataPort { in :>> type : BrakeFacts; }
    port health_qualification : DataPort { in :>> type : HealthQualification; }
    port power_facts : DataPort { in :>> type : PowerFacts; }
    port authorization_to_lifecycle : DataPort { out :>> type : StartAuthorizationFacts; }
    port authorization_to_outcome : DataPort { out :>> type : StartAuthorizationFacts; }

                        
                
                        
                                                   
                                                                        
                                                    
                                                                      
                                                 
             
                         
                                                      
                                                                         
                                                                                    
                                                                                   
                     
                           
                                    
                                                                               
                                                                                       
                           
                                              
                                                                                    
                                                                   
                                                                                   
                           
                                    
                                                                                   
                                                 
                                                                    
                                                 
                                                                                       
                           
                                      
                                                                                   
                                                                         
                                                                   
                                                   
                                                                     
                                                         
                                                                                        
                           
                                        
                                                                                   
                                                                           
                                                                 
                                                                                
                                                                                          
       
  }

  part def LifecycleRecoveryOwner :> Thread {
    port request_facts : DataPort { in :>> type : RequestFacts; }
    port brake_facts : DataPort { in :>> type : BrakeFacts; }
    port health_qualification : DataPort { in :>> type : HealthQualification; }
    port power_facts : DataPort { in :>> type : PowerFacts; }
    port cycle_assessment : DataPort { in :>> type : CycleAssessment; }
    port authorization : DataPort { in :>> type : StartAuthorizationFacts; }
    port test_cycle_directive : DataPort { out :>> type : TestCycleDirective; }
    port applied_lifecycle : DataPort { out :>> type : AppliedLifecycleSnapshot; }

                        
           
                          
                                           
                
                                     
                        
                                         
                                                    
                                                           
                                                                     
                                                           
                                                                
                                                                              
             
                                     
                         
                                              
                                                          
                                                                        
                                                               
                                                                             
                                                         
                                                                       
                                                               
                                                                              
                                                             
                                                             
                                                                                  
                                                                   
                                                                                        
                                                                      
                                                                                           
                                                              
                                                                                   
                     
                           
                                   
                                                                 
                                                                     
                                                                     
                                                                     
                                                                   
                           
                                  
                                                                 
                                                                     
                                                                
                                                               
                                                                   
                           
                                    
                                                                      
                                      
                                                                
                                                                
                                                                   
                           
                                                   
                                                                      
                                            
                                                 
                                                   
                                                                  
                                                 
                                                         
                                                                     
                                                                
                                                   
                                                                      
                                                    
                                                                                   
                                             
                                                                     
                                             
                                                                                    
                           
                                          
                                                                      
                                            
                                                                           
                                                                 
                                                                                 
                                                           
                                                            
                                                                     
                                                                
                                                                   
                           
                                     
                                                                      
                                            
                                                                           
                                                                 
                                                                                 
                                                         
                                                                  
                                                                     
                                                                   
                                                                     
                                                               
                                                                   
                           
                                  
                                                                      
                                            
                                                                           
                                                                 
                                                                                 
                                                              
                                                               
                                                               
                                                                   
                           
                              
                                                                
                                      
                                                                
                                                                
                                                                   
                           
                                            
                                                                
                                            
                                                                  
                                                 
                                                         
                                                                
                                                                     
                                                                
                                                                   
                           
                                 
                                                                
                                            
                                                                 
                                                                                 
                                                              
                                                               
                                                               
                                                                   
                           
                                    
                                                                      
                                      
                                                                
                                                                
                                                                   
                           
                                                  
                                                                      
                                            
                                                 
                                                   
                                                                  
                                                 
                                                         
                                                                     
                                                                
                                                                   
                           
                                      
                                                                      
                                            
                                                                           
                                                                 
                                                                                 
                                        
                                                                     
                                                                        
                                                                   
                           
                                         
                                                                      
                                            
                                                                           
                                                                 
                                                                                 
                                              
                                                                 
                                                                
                                                                
                                                                            
                           
                                     
                                                                      
                                            
                                                                           
                                                                 
                                                                                 
                                              
                                                                 
                                                                     
                                                               
                                                                      
                                                                               
                                                                      
                                                                       
       
  }

  part def CoordinatedOutcomeOwner :> Thread {
    port authorization : DataPort { in :>> type : StartAuthorizationFacts; }
    port applied_lifecycle : DataPort { in :>> type : AppliedLifecycleSnapshot; }
    port control_frame : DataPort { out :>> type : ControlFrame; }

                        
                
                        
                                             
                                                            
                                                                   
                                                                      
                                                                 
                                                                   
                                                         
             
                        
                                                
                                                                  
                                                              
                                                                     
                                                                         
                                                                                         
                                                                          
                                                                                         
                                                                       
                                                                          
                                                                
                                                            
                                                             
                                                                       
                                                                       
                                                                   
                                                                    
                                                                  
                                                                 
                                                            
                        
                                         
                                                                  
                                                              
                                                                     
                                                                        
                                                                                            
                                                                          
                                                                                            
                                                                       
                                                                          
                                                                                             
                                                                              
                                                                          
                                                                                            
                                                                            
                                                                     
                                                                 
                        
                                    
                                                             
                                                              
                                                                     
                                                                        
                                                                   
                                                                     
                                                                             
                                                                                   
                                                                             
                                                                   
                                                                              
                                                                             
                                                                   
                                                                    
                                                                               
                                                                             
                                                                   
                                                                    
                                      
                                                                          
                                                                             
                                                                   
                                                                    
                                           
                                                                 
                                                            
                        
                                          
                                                              
                                                                       
                                                                   
                                                                            
                                                             
                                                                      
                                                                   
                                                                              
                                                             
                                                                       
                                                                       
                                                                     
                                                              
                                                                     
                                                                       
                                                                     
       
  }

  part def VehicleSupervisorProcess :> Process {
    port request_levels : DataPort { in :>> type : RequestLevels; }
    port brake_observation : DataPort { in :>> type : BrakeObservation; }
    port health_observation : DataPort { in :>> type : HealthObservation; }
    port power_observation : DataPort { in :>> type : PowerObservation; }
    port self_test_observation : DataPort { in :>> type : SelfTestObservation; }
    port control_frame : DataPort { out :>> type : ControlFrame; }

    part request_priority_owner : RequestPriorityOwner;
    part brake_qualification_owner : BrakeQualificationOwner;
    part health_qualification_owner : HealthQualificationOwner;
    part power_qualification_owner : PowerQualificationOwner;
    part self_test_cycle_owner : SelfTestCycleOwner;
    part start_authorization_owner : StartAuthorizationOwner;
    part lifecycle_recovery_owner : LifecycleRecoveryOwner;
    part coordinated_outcome_owner : CoordinatedOutcomeOwner;

    connection int01 : PortConnection connect request_levels to request_priority_owner.request_levels;
    connection int02 : PortConnection connect brake_observation to brake_qualification_owner.brake_observation;
    connection int03 : PortConnection connect health_observation to health_qualification_owner.health_observation;
    connection int04 : PortConnection connect power_observation to power_qualification_owner.power_observation;
    connection int05 : PortConnection connect self_test_observation to self_test_cycle_owner.self_test_observation;
    connection int06 : PortConnection connect request_priority_owner.request_to_authorization to start_authorization_owner.request_facts;
    connection int07 : PortConnection connect request_priority_owner.request_to_lifecycle to lifecycle_recovery_owner.request_facts;
    connection int08 : PortConnection connect brake_qualification_owner.brake_to_authorization to start_authorization_owner.brake_facts;
    connection int09 : PortConnection connect brake_qualification_owner.brake_to_lifecycle to lifecycle_recovery_owner.brake_facts;
    connection int10 : PortConnection connect health_qualification_owner.health_to_authorization to start_authorization_owner.health_qualification;
    connection int11 : PortConnection connect health_qualification_owner.health_to_lifecycle to lifecycle_recovery_owner.health_qualification;
    connection int12 : PortConnection connect power_qualification_owner.power_to_authorization to start_authorization_owner.power_facts;
    connection int13 : PortConnection connect power_qualification_owner.power_to_lifecycle to lifecycle_recovery_owner.power_facts;
    connection int14 : PortConnection connect self_test_cycle_owner.cycle_assessment to lifecycle_recovery_owner.cycle_assessment;
    connection int15 : PortConnection connect start_authorization_owner.authorization_to_lifecycle to lifecycle_recovery_owner.authorization;
    connection int16 : PortConnection connect start_authorization_owner.authorization_to_outcome to coordinated_outcome_owner.authorization;
    connection int17 : PortConnection connect lifecycle_recovery_owner.test_cycle_directive to self_test_cycle_owner.test_cycle_directive;
    connection int18 : PortConnection connect lifecycle_recovery_owner.applied_lifecycle to coordinated_outcome_owner.applied_lifecycle;
    connection int19 : PortConnection connect coordinated_outcome_owner.control_frame to control_frame;
  }

  part def VehicleStartReadinessRecoverySupervisorSystem :> System {
    port request_levels : DataPort { in :>> type : RequestLevels; }
    port brake_observation : DataPort { in :>> type : BrakeObservation; }
    port health_observation : DataPort { in :>> type : HealthObservation; }
    port power_observation : DataPort { in :>> type : PowerObservation; }
    port self_test_observation : DataPort { in :>> type : SelfTestObservation; }
    port control_frame : DataPort { out :>> type : ControlFrame; }

    part vehicle_supervisor_process : VehicleSupervisorProcess;

    connection support01 : PortConnection connect request_levels to vehicle_supervisor_process.request_levels;
    connection support02 : PortConnection connect brake_observation to vehicle_supervisor_process.brake_observation;
    connection support03 : PortConnection connect health_observation to vehicle_supervisor_process.health_observation;
    connection support04 : PortConnection connect power_observation to vehicle_supervisor_process.power_observation;
    connection support05 : PortConnection connect self_test_observation to vehicle_supervisor_process.self_test_observation;
    connection support06 : PortConnection connect vehicle_supervisor_process.control_frame to control_frame;
  }

  part vehicle_start_readiness_recovery_supervisor : VehicleStartReadinessRecoverySupervisorSystem;
}
