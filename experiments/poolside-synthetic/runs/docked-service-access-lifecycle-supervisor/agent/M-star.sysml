// Architecture-stage source: approved types, ports, usages, and connections only.
// GUMBO behavior is added only after this retained architecture passes HAMR tipe.

package Docked_Service_Access_Lifecycle_Supervisor {
  private import HAMR::*;

  // Exact boundary domains.
  enum def PilotIntent {
    enum NONE; enum FRESH_DOCK; enum REPEATED_DOCK; enum FRESH_UNDOCK;
    enum REPEATED_UNDOCK; enum FRESH_RESET; enum REPEATED_RESET; enum INVALID;
  }
  enum def BerthObservation {
    enum APPROACH_CLEAR; enum DOCKED_SECURE; enum DEPARTURE_CLEAR;
    enum RELEASED; enum BLOCKED; enum INVALID;
  }
  enum def ShipCondition {
    enum APPROACH_READY; enum SERVICE_READY; enum DEPARTURE_READY;
    enum TRANSIT; enum NOT_READY; enum INVALID;
  }
  enum def ServiceSignal {
    enum QUIESCENT; enum REQUEST; enum ACTIVE; enum COMPLETE; enum FAULT; enum INVALID;
  }
  enum def MovementDirective { enum HOLD; enum PERMIT_DOCK; enum PERMIT_UNDOCK; }
  enum def ServiceAccess { enum LOCKED; enum ENABLED; }
  enum def PilotLifecycleReport {
    enum OUTSIDE_IDLE; enum DOCK_PERMITTED; enum DOCKED_READY; enum SERVICE_GRANTED;
    enum SERVICE_ACTIVE; enum SERVICE_FINISHED; enum UNDOCK_DEFERRED;
    enum UNDOCK_PERMITTED; enum RELEASE_CONFIRMED; enum INHIBITED;
    enum RECOVERY_REQUIRED; enum RESET_COMPLETE;
  }
  enum def StationAccessReport {
    enum NO_ACCESS; enum DOCK_EXPECTED; enum ACCESS_AVAILABLE; enum ACCESS_RESERVED;
    enum ACCESS_OCCUPIED; enum DEPARTURE_EXPECTED; enum ACCESS_INHIBITED;
    enum RECOVERY_REQUIRED;
  }

  // Owner-local finite facts.
  enum def QualifiedIntent {
    enum NO_ACTION; enum DOCK_REQUEST; enum UNDOCK_REQUEST;
    enum RESET_REQUEST; enum INTENT_FAULT;
  }
  enum def DockReadiness {
    enum DOCK_READY; enum SERVICE_READY; enum UNDOCK_READY; enum RELEASE_CONFIRMED;
    enum TEMPORARILY_BLOCKED; enum READINESS_CONFLICT; enum READINESS_FAULT;
  }
  enum def ServiceInterlock {
    enum QUIESCENT; enum SINGLE_DEMAND; enum SINGLE_ACTIVE; enum SINGLE_COMPLETION;
    enum SERVICE_CONFLICT; enum SERVICE_FAULT;
  }
  enum def LifecycleState {
    enum IDLE_OUTSIDE; enum DOCK_CLEARANCE_LATCHED; enum DOCKED_ACCESS_LOCKED;
    enum SERVICE_ACCESS_GRANTED; enum SERVICE_IN_PROGRESS;
    enum UNDOCK_CLEARANCE_LATCHED; enum RECOVERY_REQUIRED;
  }
  enum def OperationalAssessment {
    enum OUTSIDE_STABLE; enum DOCK_ELIGIBLE; enum DOCK_WAITING; enum DOCK_CONFIRMED;
    enum DOCKED_QUIESCENT; enum SERVICE_DEMAND_READY; enum SERVICE_GRANT_PENDING;
    enum SERVICE_OCCUPIED; enum SERVICE_RELEASED; enum SERVICE_WITHDRAWN;
    enum UNDOCK_ELIGIBLE; enum UNDOCK_WAITING; enum RELEASE_CONFIRMED;
    enum RECOVERY_CLEARABLE; enum TEMPORARILY_BLOCKED;
    enum ASSESSMENT_CONFLICT; enum ASSESSMENT_FAULT;
  }
  enum def AdmittedDirective {
    enum ENTER_RECOVERY_FAULT; enum ENTER_RECOVERY_CONFLICT; enum RESET_RECOVERY;
    enum HOLD_RECOVERY; enum FINISH_SERVICE_DEFER_UNDOCK; enum FINISH_SERVICE;
    enum DEFER_UNDOCK; enum HOLD_ACTIVE_SERVICE; enum START_SERVICE;
    enum HOLD_SERVICE_GRANT; enum WITHDRAW_SERVICE_GRANT; enum CONFIRM_RELEASE;
    enum HOLD_UNDOCK_CLEARANCE; enum CONFIRM_DOCK; enum HOLD_DOCK_CLEARANCE;
    enum AUTHORIZE_UNDOCK; enum GRANT_SERVICE_ACCESS; enum AUTHORIZE_DOCK;
    enum INHIBIT_ACTION; enum HOLD_STABLE;
  }
  enum def MovementProposal { enum HOLD_MOVEMENT; enum AUTHORIZE_DOCK; enum AUTHORIZE_UNDOCK; }
  enum def AccessProposal { enum LOCK_ACCESS; enum ENABLE_ACCESS; }
  enum def LifecycleResult {
    enum NONE; enum DOCK_ACCEPTED; enum DOCK_CONFIRMED; enum SERVICE_GRANTED;
    enum SERVICE_RUNNING; enum SERVICE_FINISHED; enum UNDOCK_DEFERRED;
    enum UNDOCK_ACCEPTED; enum RELEASED; enum INHIBITED;
    enum RECOVERY_LATCHED; enum RESET_COMPLETE;
  }
  enum def SnapshotLifecycleState {
    enum IDLE_OUTSIDE; enum DOCK_CLEARANCE_LATCHED; enum DOCKED_ACCESS_LOCKED;
    enum SERVICE_ACCESS_GRANTED; enum SERVICE_IN_PROGRESS;
    enum UNDOCK_CLEARANCE_LATCHED; enum RECOVERY_REQUIRED;
  }

  // Every record field inspected by GUMBO is represented as an attribute.
  part def ControlProposal :> Data {
    attribute movement : MovementProposal;
    attribute access : AccessProposal;
  }
  part def LifecycleSnapshot :> Data {
    attribute next_state : SnapshotLifecycleState;
    attribute result : LifecycleResult;
  }
  part def GatedControl :> Data {
    attribute movement : MovementDirective;
    attribute access : ServiceAccess;
  }

  part def IntentQualifier :> Thread {
    port pilotIntent : DataPort { in :>> type : PilotIntent; }
    port qualifiedIntent : DataPort { out :>> type : QualifiedIntent; }

                        
                
                           
                                      
                                                       
             
                     
                            
                              
                                                      
                                                                      
                            
                                 
                                                         
                                                                      
                            
                                   
                                                           
                                                                        
                            
                                  
                                                          
                                                                       
                            
                                
                                                    
                                                             
                                                               
                                                             
                                                                   
       
  }

  part def DockReadinessQualifier :> Thread {
    port berthObservation : DataPort { in :>> type : BerthObservation; }
    port shipCondition : DataPort { in :>> type : ShipCondition; }
    port monitorReadiness : DataPort { out :>> type : DockReadiness; }
    port gateReadiness : DataPort { out :>> type : DockReadiness; }

                        
                
                           
                                         
                                                             
                                                         
             
                          
                                               
                                            
                     
                            
                                 
                                                                 
                                                          
                                                                        
                            
                              
                                                                 
                                                           
                                                                        
                                                                 
                                                                   
                            
                                 
                                                                 
                                                           
                                                                       
                                                                
                                                                      
                            
                                
                                                                 
                                                           
                                                                         
                                                                  
                                                                     
                            
                                  
                                                                 
                                                           
                                                                  
                                                          
                                                                          
                            
                                 
                                                                 
                                                           
                                                                             
                                                                        
                                                                            
                                                                       
                                                                              
                                                                         
                                                                       
                                                                 
                                                                  
                                                              
                                                                            
                            
                                       
                                                                 
                                                           
                                                                             
                                                                        
                                                                            
                                                                       
                                                                              
                                                                         
                                                                       
                                                                 
                                                                 
                                                            
                                                                           
       
  }

  part def ServiceInterlockQualifier :> Thread {
    port repairSignal : DataPort { in :>> type : ServiceSignal; }
    port resupplySignal : DataPort { in :>> type : ServiceSignal; }
    port monitorInterlock : DataPort { out :>> type : ServiceInterlock; }
    port gateInterlock : DataPort { out :>> type : ServiceInterlock; }

                        
                
                           
                                         
                                                              
                                                          
             
                          
                                               
                                            
                     
                            
                               
                                                        
                                                          
                                                          
                                                           
                                                                         
                            
                                   
                                                            
                                                             
                                                                     
                            
                                       
                                                           
                                                                
                                                             
                                                             
                                                                         
                            
                                       
                                                          
                                                                
                                                             
                                                            
                                                                         
                            
                                           
                                                            
                                                                
                                                             
                                                              
                                                                             
                            
                                  
                                                        
                                                          
                                                          
                                                            
                                                                 
                                                                    
                                                               
                                                                    
                                                                 
                                                                  
                                                              
                                                                    
                                                                 
                                                                 
                                                                
                                                                    
                                                                 
                                                                  
                                                                            
       
  }

  part def LifecycleConsistencyMonitor :> Thread {
    port dockReadiness : DataPort { in :>> type : DockReadiness; }
    port serviceInterlock : DataPort { in :>> type : ServiceInterlock; }
    port lifecyclePrestate : DataPort { in :>> type : LifecycleState; }
    port operationalAssessment : DataPort { out :>> type : OperationalAssessment; }

                        
                
                           
                                          
                                                                          
             
                          
                                            
                                                            
                                                                 
                                                                              
                                                            
                                                                 
                                                               
                                                                    
                                                                                 
                                                            
                                                                
                                                               
                                                                    
                                                                
                                                                                 
                                                             
                                                              
                                                            
                                                                            
                                                             
                                                       
                                                            
                                                                           
                                                                       
                                                       
                                                            
                                                                          
                                                                       
                                                          
                                                            
                                                                            
                                                                     
                                                          
                                                            
                                                                              
                                                                     
                                                          
                                                                
                                                                                  
                                                                     
                                                         
                                                            
                                                                             
                                                                       
                                                          
                                                                
                                                                                   
                                                                       
                                                          
                                                                
                                                                              
                                                                       
                                                          
                                                             
                                                                      
                                                                               
                                                                    
                                                          
                                                                
                                                                              
                                                                    
                                                          
                                                                    
                                                                              
                                                                         
                                                         
                                                            
                                                                            
                                                                         
                                                              
                                                            
                                                                               
                                                                  
                                                              
                                                            
                                                                                
                                                             
                                                                 
                                                                
                                                                    
                                                                  
                                                                   
                                                                   
                                                                  
                                                                   
                                                            
                                                                  
                                                                             
                                                            
                                                                  
                                                                             
                                                               
                                                                  
                                                                           
                                                               
                                                                  
                                                                           
                                                               
                                                                      
                                                                           
                                                              
                                                                  
                                                                             
                                                               
                                                                      
                                                                      
                                                                  
                                                                            
                                                                          
                                                               
                                                                      
                                                                            
                                                                               
                                                               
                                                                     
                                                                  
                                                                        
                                                                   
                                                                   
                                                                                
       
  }

  part def PriorityArbiter :> Thread {
    port qualifiedIntent : DataPort { in :>> type : QualifiedIntent; }
    port operationalAssessment : DataPort { in :>> type : OperationalAssessment; }
    port lifecyclePrestate : DataPort { in :>> type : LifecycleState; }
    port admittedDirective : DataPort { out :>> type : AdmittedDirective; }

                        
                
                           
                                       
                                                             
             
                     
                           
                                            
                                                                    
                                                                                   
                                                                                  
                           
                                               
                                                                    
                                                                                    
                                                                                      
                                                                                     
                           
                                      
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                     
                                                                                     
                                                                            
                           
                                     
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                          
                                                                                           
                                                                           
                           
                                                   
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                            
                                                                                    
                                                                     
                                                                                         
                           
                                      
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                            
                                                                                    
                                                                     
                                                                            
                           
                                    
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                            
                                                                                    
                                                                     
                                                                          
                           
                                           
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                            
                                                                                    
                                                                
                                                                                 
                           
                                     
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                               
                                                                                   
                                                                           
                           
                                          
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                               
                                                                                         
                                                                
                                                                                
                           
                                              
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                               
                                                                                    
                                                                                    
                           
                                       
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                                 
                                                                                    
                                                                             
                           
                                             
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                                 
                                                                                     
                                                                
                                                                                   
                           
                                    
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                               
                                                                                 
                                                                          
                           
                                           
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                               
                                                                                  
                                                                
                                                                                 
                           
                                        
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                             
                                                                      
                                                                                  
                                                                              
                           
                                            
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                             
                                                                                       
                                                                                  
                           
                                      
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                     
                                                                    
                                                                                
                                                                            
                           
                                      
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                     
                                                                       
                                                                       
                                                                                 
                                                                                          
                                                                                 
                                                                                         
                                                                            
                                                                                    
                                                                                          
                                                                                    
                                                                                           
                                                                                      
                                                                                           
                                                                                    
                                                                                        
                                                                                  
                                                                           
                                                                                         
                                                                                  
                                                                                              
                                                                          
                                                                         
                                                                                      
                                                                            
                           
                                   
                                                                 
                                                                                    
                                                                                       
                                                                          
                                                                            
                                                                                    
                                                                                          
                                                                                    
                                                                                               
                                                                                    
                                                                                           
                                                                                      
                                                                                           
                                                                                       
                                                                                    
                                                                                        
                                                                                     
                                                                                  
                                                                                             
                                                                         
       
  }

  part def LifecycleController :> Thread {
    port admittedDirective : DataPort { in :>> type : AdmittedDirective; }
    port monitorPrestate : DataPort { out :>> type : LifecycleState; }
    port arbiterPrestate : DataPort { out :>> type : LifecycleState; }
    port controlProposal : DataPort { out :>> type : ControlProposal; }
    port lifecycleSnapshot : DataPort { out :>> type : LifecycleSnapshot; }

                        
           
                              
                                        
                
                                 
                           
                                         
                                                          
                                                          
                                                          
                                                                      
                                                                
                                                                               
                                                           
             
                                 
                          
                                       
                                                  
                                                 
                          
                                                  
                                                              
                                                                                   
                                                                        
                                                                                             
                                                                      
                                                                                           
                                                                        
                                                                                             
                                                                     
                                                                                          
                                                                          
                                                                                               
                                                                   
                                                                                         
                                                                        
                                                                          
                                                                    
                                                                          
                                                                            
                                                                    
                                                                       
                                                                     
                                                                         
                                                                      
                                                             
                                                                     
                                                                   
                                                                         
                                                                    
                     
                           
                             
                                                                               
                                                                           
                                                                                   
                           
                             
                                                                                  
                                                                           
                                                                                   
                           
                             
                                                                         
                                                                      
                                                                                 
                           
                             
                                                                        
                                                                           
                                                                                   
                           
                             
                                                                                      
                                                                              
                                                                                  
                           
                             
                                                                         
                                                                              
                                                                                   
                           
                             
                                                                       
                                                                             
                                                                                  
                           
                             
                                                                              
                                                                             
                                                                       
                           
                             
                                                                        
                                                                             
                                                                                  
                           
                             
                                                                             
                                                                                
                                                                                  
                           
                             
                                                                                 
                                                                              
                                                                            
                           
                             
                                                                          
                                                                      
                                                                           
                           
                             
                                                                                
                                                                                  
                                                                       
                           
                             
                                                                       
                                                                              
                                                                                 
                           
                             
                                                                              
                                                                                
                                                                       
                           
                             
                                                                           
                                                                                  
                                                                                  
                           
                             
                                                                               
                                                                                
                                                                                  
                           
                             
                                                                         
                                                                                
                                                                                
                           
                             
                                                                         
                                                              
                                                                            
                           
                             
                                                                      
                                                              
                                                                       
       
  }

  part def MovementAndAccessSafetyGate :> Thread {
    port controlProposal : DataPort { in :>> type : ControlProposal; }
    port dockReadiness : DataPort { in :>> type : DockReadiness; }
    port serviceInterlock : DataPort { in :>> type : ServiceInterlock; }
    port gatedControl : DataPort { out :>> type : GatedControl; }
    port movementDirective : DataPort { out :>> type : MovementDirective; }
    port serviceAccess : DataPort { out :>> type : ServiceAccess; }

                        
                
                           
                                    
                                                       
                                                 
                                                           
                                                      
             
                          
                                
                                                                          
                                                        
                                                              
                                                                  
                                                                            
                                                          
                                                              
                                                                    
                                                                               
                                                             
                                                                   
                                                                                 
                                                               
                                                                    
                                                           
                          
                              
                                                                     
                                                           
                                                                  
                                                                    
                                                      
                                                                          
                                                                
                                                                       
                                                                          
                                                     
                           
                                          
                                                      
                                                
                                                            
                                                       
       
  }

  part def LifecycleReporter :> Thread {
    port lifecycleSnapshot : DataPort { in :>> type : LifecycleSnapshot; }
    port gatedControl : DataPort { in :>> type : GatedControl; }
    port pilotReport : DataPort { out :>> type : PilotLifecycleReport; }
    port stationReport : DataPort { out :>> type : StationAccessReport; }

                        
                
                           
                                      
                                                            
                                                         
             
                     
                            
                               
                                                                                
                                                                             
                                                                             
                            
                            
                                                                              
                                                                          
                                                                     
                            
                              
                                                                        
                                                                             
                                                                     
                            
                                    
                                                                              
                                                                          
                                                                          
                                                                         
                            
                                                 
                                                                              
                                                                          
                                                                     
                                                                            
                            
                                     
                                                                              
                                                                        
                                                                            
                            
                                      
                                                                                
                                                                
                                                                           
                                                                           
                            
                                               
                                                                                
                                                                
                                                                     
                                                                            
                            
                                      
                                                                                
                                                                
                                                                          
                                                                           
                            
                                                 
                                                                                
                                                                
                                                                     
                                                                            
                            
                                       
                                                                                
                                                                            
                                                                            
                                   
                                               
                                                                                
                                                                
                                                                           
                                                                           
                                   
                                               
                                                                                
                                                                 
                                                                                               
                                                                           
                                                                            
                                   
                                                 
                                                                                
                                                                 
                                                                                               
                                                                           
                                                                            
                            
                                      
                                                                                
                                                                            
                                                                            
                                                                              
                            
                                                   
                                                                                
                                                                            
                                                                     
                                                                            
                            
                                         
                                                                          
                                                                 
                                                                                                 
                                                                     
                                                                           
                            
                                         
                                                                          
                                                                 
                                                                                              
                                                                     
                                                                           
                            
                                              
                                                                          
                                                                          
                                                                     
                                                                         
                            
                                                   
                                                                          
                                                                            
                                                                     
                                                                              
                            
                                       
                                                                          
                                                                 
                                                                    
                                                                                               
                                                                     
                                                                            
                            
                                      
                                                                          
                                                                 
                                                                    
                                                                                               
                                                                     
                                                                            
                            
                                   
                                                                     
                                                                                       
                                                                        
                                                                     
                            
                                          
                                                                     
                                                                                                  
                                                                          
                                                                          
                                                                         
                            
                                                     
                                                                     
                                                                                                  
                                                                          
                                                                     
                                                                            
                            
                                  
                                                                     
                                                                                               
                                                                        
                                                                            
                            
                                   
                                                                     
                                                                                                  
                                                                
                                                                           
                                                                           
                            
                                              
                                                                     
                                                                                                  
                                                                
                                                                     
                                                                            
                            
                                  
                                                                     
                                                                                               
                                                                
                                                                          
                                                                           
                            
                                             
                                                                     
                                                                                               
                                                                
                                                                     
                                                                            
                            
                                            
                                                                     
                                                                                                    
                                                                            
                                                                            
                                                                              
                            
                                                       
                                                                     
                                                                                                    
                                                                            
                                                                     
                                                                            
                            
                                    
                                                                     
                                                                                            
                                                                             
                                                                             
       
  }

  part def DockedServiceSupervisorProcess :> Process {
    port pilotIntent : DataPort { in :>> type : PilotIntent; }
    port berthObservation : DataPort { in :>> type : BerthObservation; }
    port shipCondition : DataPort { in :>> type : ShipCondition; }
    port repairSignal : DataPort { in :>> type : ServiceSignal; }
    port resupplySignal : DataPort { in :>> type : ServiceSignal; }
    port movementDirective : DataPort { out :>> type : MovementDirective; }
    port serviceAccess : DataPort { out :>> type : ServiceAccess; }
    port pilotReport : DataPort { out :>> type : PilotLifecycleReport; }
    port stationReport : DataPort { out :>> type : StationAccessReport; }

    // Eight ordered, responsibility-bearing usages.
    part intentQualifier : IntentQualifier;
    part dockReadinessQualifier : DockReadinessQualifier;
    part serviceInterlockQualifier : ServiceInterlockQualifier;
    part lifecycleConsistencyMonitor : LifecycleConsistencyMonitor;
    part priorityArbiter : PriorityArbiter;
    part lifecycleController : LifecycleController;
    part movementAndAccessSafetyGate : MovementAndAccessSafetyGate;
    part lifecycleReporter : LifecycleReporter;

    // Five boundary-input deliveries.
    connection int01 : PortConnection connect pilotIntent to intentQualifier.pilotIntent;
    connection int02 : PortConnection connect berthObservation to dockReadinessQualifier.berthObservation;
    connection int03 : PortConnection connect shipCondition to dockReadinessQualifier.shipCondition;
    connection int04 : PortConnection connect repairSignal to serviceInterlockQualifier.repairSignal;
    connection int05 : PortConnection connect resupplySignal to serviceInterlockQualifier.resupplySignal;

    // Twelve owner-to-owner fact deliveries.
    connection int06 : PortConnection connect intentQualifier.qualifiedIntent to priorityArbiter.qualifiedIntent;
    connection int07 : PortConnection connect dockReadinessQualifier.monitorReadiness to lifecycleConsistencyMonitor.dockReadiness;
    connection int08 : PortConnection connect serviceInterlockQualifier.monitorInterlock to lifecycleConsistencyMonitor.serviceInterlock;
    connection int09 : PortConnection connect lifecycleController.monitorPrestate to lifecycleConsistencyMonitor.lifecyclePrestate;
    connection int10 : PortConnection connect lifecycleConsistencyMonitor.operationalAssessment to priorityArbiter.operationalAssessment;
    connection int11 : PortConnection connect lifecycleController.arbiterPrestate to priorityArbiter.lifecyclePrestate;
    connection int12 : PortConnection connect priorityArbiter.admittedDirective to lifecycleController.admittedDirective;
    connection int13 : PortConnection connect lifecycleController.controlProposal to movementAndAccessSafetyGate.controlProposal;
    connection int14 : PortConnection connect dockReadinessQualifier.gateReadiness to movementAndAccessSafetyGate.dockReadiness;
    connection int15 : PortConnection connect serviceInterlockQualifier.gateInterlock to movementAndAccessSafetyGate.serviceInterlock;
    connection int16 : PortConnection connect lifecycleController.lifecycleSnapshot to lifecycleReporter.lifecycleSnapshot;
    connection int17 : PortConnection connect movementAndAccessSafetyGate.gatedControl to lifecycleReporter.gatedControl;

    // Four boundary-output deliveries.
    connection int18 : PortConnection connect movementAndAccessSafetyGate.movementDirective to movementDirective;
    connection int19 : PortConnection connect movementAndAccessSafetyGate.serviceAccess to serviceAccess;
    connection int20 : PortConnection connect lifecycleReporter.pilotReport to pilotReport;
    connection int21 : PortConnection connect lifecycleReporter.stationReport to stationReport;
  }

  part def DockedServiceAccessLifecycleSupervisorSystem :> System {
    port pilotIntent : DataPort { in :>> type : PilotIntent; }
    port berthObservation : DataPort { in :>> type : BerthObservation; }
    port shipCondition : DataPort { in :>> type : ShipCondition; }
    port repairSignal : DataPort { in :>> type : ServiceSignal; }
    port resupplySignal : DataPort { in :>> type : ServiceSignal; }
    port movementDirective : DataPort { out :>> type : MovementDirective; }
    port serviceAccess : DataPort { out :>> type : ServiceAccess; }
    port pilotReport : DataPort { out :>> type : PilotLifecycleReport; }
    port stationReport : DataPort { out :>> type : StationAccessReport; }

    part supervisorProcess : DockedServiceSupervisorProcess;

    connection support01 : PortConnection connect pilotIntent to supervisorProcess.pilotIntent;
    connection support02 : PortConnection connect berthObservation to supervisorProcess.berthObservation;
    connection support03 : PortConnection connect shipCondition to supervisorProcess.shipCondition;
    connection support04 : PortConnection connect repairSignal to supervisorProcess.repairSignal;
    connection support05 : PortConnection connect resupplySignal to supervisorProcess.resupplySignal;
    connection support18 : PortConnection connect supervisorProcess.movementDirective to movementDirective;
    connection support19 : PortConnection connect supervisorProcess.serviceAccess to serviceAccess;
    connection support20 : PortConnection connect supervisorProcess.pilotReport to pilotReport;
    connection support21 : PortConnection connect supervisorProcess.stationReport to stationReport;
  }

  part dockedServiceAccessLifecycleSupervisor : DockedServiceAccessLifecycleSupervisorSystem;
}
