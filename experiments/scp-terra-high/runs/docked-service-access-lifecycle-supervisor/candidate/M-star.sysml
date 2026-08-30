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

    language "GUMBO" /*{
      initialize
        guarantee INTENT_INITIAL_SAFE: qualifiedIntent == QualifiedIntent.NO_ACTION;

      compute
        guarantee INTENT_INVALID:
          pilotIntent == PilotIntent.INVALID implies
            qualifiedIntent == QualifiedIntent.INTENT_FAULT;
        guarantee INTENT_FRESH_DOCK:
          pilotIntent == PilotIntent.FRESH_DOCK implies
            qualifiedIntent == QualifiedIntent.DOCK_REQUEST;
        guarantee INTENT_FRESH_UNDOCK:
          pilotIntent == PilotIntent.FRESH_UNDOCK implies
            qualifiedIntent == QualifiedIntent.UNDOCK_REQUEST;
        guarantee INTENT_FRESH_RESET:
          pilotIntent == PilotIntent.FRESH_RESET implies
            qualifiedIntent == QualifiedIntent.RESET_REQUEST;
        guarantee INTENT_NO_ACTION:
          (pilotIntent == PilotIntent.NONE or
           pilotIntent == PilotIntent.REPEATED_DOCK or
           pilotIntent == PilotIntent.REPEATED_UNDOCK or
           pilotIntent == PilotIntent.REPEATED_RESET) implies
            qualifiedIntent == QualifiedIntent.NO_ACTION;
    }*/
                        
                
                           
                                      
                                                       
             
                     
                            
                              
                                                      
                                                                      
                            
                                 
                                                         
                                                                      
                            
                                   
                                                           
                                                                        
                            
                                  
                                                          
                                                                       
                            
                                
                                                    
                                                             
                                                               
                                                             
                                                                   
       
  }

  part def DockReadinessQualifier :> Thread {
    port berthObservation : DataPort { in :>> type : BerthObservation; }
    port shipCondition : DataPort { in :>> type : ShipCondition; }
    port monitorReadiness : DataPort { out :>> type : DockReadiness; }
    port gateReadiness : DataPort { out :>> type : DockReadiness; }

    language "GUMBO" /*{
      initialize
        guarantee READINESS_INITIAL_SAFE:
          monitorReadiness == DockReadiness.READINESS_FAULT and
          gateReadiness == DockReadiness.READINESS_FAULT;
      compute
        guarantee READINESS_CONSUMER_AGREEMENT:
          gateReadiness == monitorReadiness;
        guarantee READINESS_INVALID:
          (berthObservation == BerthObservation.INVALID or shipCondition == ShipCondition.INVALID) implies
            monitorReadiness == DockReadiness.READINESS_FAULT;
        guarantee READINESS_DOCK:
          (berthObservation == BerthObservation.APPROACH_CLEAR and
           shipCondition == ShipCondition.APPROACH_READY) implies
            monitorReadiness == DockReadiness.DOCK_READY;
        guarantee READINESS_SERVICE:
          (berthObservation == BerthObservation.DOCKED_SECURE and
           shipCondition == ShipCondition.SERVICE_READY) implies
            monitorReadiness == DockReadiness.SERVICE_READY;
        guarantee READINESS_UNDOCK:
          (berthObservation == BerthObservation.DEPARTURE_CLEAR and
           shipCondition == ShipCondition.DEPARTURE_READY) implies
            monitorReadiness == DockReadiness.UNDOCK_READY;
        guarantee READINESS_RELEASED:
          (berthObservation == BerthObservation.RELEASED and
           shipCondition == ShipCondition.TRANSIT) implies
            monitorReadiness == DockReadiness.RELEASE_CONFIRMED;
        guarantee READINESS_BLOCKED:
          (berthObservation != BerthObservation.INVALID and
           shipCondition != ShipCondition.INVALID and
           berthObservation != BerthObservation.APPROACH_CLEAR and
           berthObservation != BerthObservation.DOCKED_SECURE and
           berthObservation != BerthObservation.DEPARTURE_CLEAR and
           berthObservation != BerthObservation.RELEASED and
           (berthObservation == BerthObservation.BLOCKED or
            shipCondition == ShipCondition.NOT_READY)) implies
            monitorReadiness == DockReadiness.TEMPORARILY_BLOCKED;
    }*/
                        
                
                           
                                         
                                                             
                                                         
             
                          
                                               
                                            
                     
                            
                                 
                                                                 
                                                          
                                                                        
                            
                              
                                                                 
                                                           
                                                                        
                                                                 
                                                                   
                            
                                 
                                                                 
                                                           
                                                                       
                                                                
                                                                      
                            
                                
                                                                 
                                                           
                                                                         
                                                                  
                                                                     
                            
                                  
                                                                 
                                                           
                                                                  
                                                          
                                                                          
                            
                                 
                                                                 
                                                           
                                                                             
                                                                        
                                                                            
                                                                       
                                                                              
                                                                         
                                                                       
                                                                 
                                                                  
                                                              
                                                                            
                            
                                       
                                                                 
                                                           
                                                                             
                                                                        
                                                                            
                                                                       
                                                                              
                                                                         
                                                                       
                                                                 
                                                                 
                                                            
                                                                           
       
  }

  part def ServiceInterlockQualifier :> Thread {
    port repairSignal : DataPort { in :>> type : ServiceSignal; }
    port resupplySignal : DataPort { in :>> type : ServiceSignal; }
    port monitorInterlock : DataPort { out :>> type : ServiceInterlock; }
    port gateInterlock : DataPort { out :>> type : ServiceInterlock; }

    language "GUMBO" /*{
      initialize
        guarantee INTERLOCK_INITIAL_SAFE:
          monitorInterlock == ServiceInterlock.SERVICE_FAULT and
          gateInterlock == ServiceInterlock.SERVICE_FAULT;
      compute
        guarantee INTERLOCK_CONSUMER_AGREEMENT: gateInterlock == monitorInterlock;
        guarantee INTERLOCK_FAULT:
          (repairSignal == ServiceSignal.FAULT or repairSignal == ServiceSignal.INVALID or
           resupplySignal == ServiceSignal.FAULT or resupplySignal == ServiceSignal.INVALID) implies
            monitorInterlock == ServiceInterlock.SERVICE_FAULT;
        guarantee INTERLOCK_QUIESCENT:
          (repairSignal == ServiceSignal.QUIESCENT and resupplySignal == ServiceSignal.QUIESCENT) implies
            monitorInterlock == ServiceInterlock.QUIESCENT;
        guarantee INTERLOCK_SINGLE_DEMAND:
          ((repairSignal == ServiceSignal.REQUEST and resupplySignal == ServiceSignal.QUIESCENT) or
           (repairSignal == ServiceSignal.QUIESCENT and resupplySignal == ServiceSignal.REQUEST)) implies
            monitorInterlock == ServiceInterlock.SINGLE_DEMAND;
        guarantee INTERLOCK_SINGLE_ACTIVE:
          ((repairSignal == ServiceSignal.ACTIVE and resupplySignal == ServiceSignal.QUIESCENT) or
           (repairSignal == ServiceSignal.QUIESCENT and resupplySignal == ServiceSignal.ACTIVE)) implies
            monitorInterlock == ServiceInterlock.SINGLE_ACTIVE;
        guarantee INTERLOCK_SINGLE_COMPLETION:
          ((repairSignal == ServiceSignal.COMPLETE and resupplySignal == ServiceSignal.QUIESCENT) or
           (repairSignal == ServiceSignal.QUIESCENT and resupplySignal == ServiceSignal.COMPLETE)) implies
            monitorInterlock == ServiceInterlock.SINGLE_COMPLETION;
    }*/
                        
                
                           
                                         
                                                              
                                                          
             
                          
                                               
                                            
                     
                            
                               
                                                        
                                                          
                                                          
                                                           
                                                                         
                            
                                   
                                                            
                                                             
                                                                     
                            
                                       
                                                           
                                                                
                                                             
                                                             
                                                                         
                            
                                       
                                                          
                                                                
                                                             
                                                            
                                                                         
                            
                                           
                                                            
                                                                
                                                             
                                                              
                                                                             
                            
                                  
                                                        
                                                          
                                                          
                                                            
                                                                 
                                                                    
                                                               
                                                                    
                                                                 
                                                                  
                                                              
                                                                    
                                                                 
                                                                 
                                                                
                                                                    
                                                                 
                                                                  
                                                                            
       
  }

  part def LifecycleConsistencyMonitor :> Thread {
    port dockReadiness : DataPort { in :>> type : DockReadiness; }
    port serviceInterlock : DataPort { in :>> type : ServiceInterlock; }
    port lifecyclePrestate : DataPort { in :>> type : LifecycleState; }
    port operationalAssessment : DataPort { out :>> type : OperationalAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee ASSESSMENT_INITIAL_SAFE:
          operationalAssessment == OperationalAssessment.ASSESSMENT_FAULT;
      compute
        guarantee ASSESSMENT_FAULT:
          (dockReadiness == DockReadiness.READINESS_FAULT or
           serviceInterlock == ServiceInterlock.SERVICE_FAULT) implies
            operationalAssessment == OperationalAssessment.ASSESSMENT_FAULT;
        guarantee ASSESSMENT_CONFLICT:
          (dockReadiness != DockReadiness.READINESS_FAULT and
           serviceInterlock != ServiceInterlock.SERVICE_FAULT and
           (dockReadiness == DockReadiness.READINESS_CONFLICT or
            serviceInterlock == ServiceInterlock.SERVICE_CONFLICT)) implies
            operationalAssessment == OperationalAssessment.ASSESSMENT_CONFLICT;
        guarantee ASSESSMENT_BLOCKED:
          (dockReadiness != DockReadiness.READINESS_FAULT and
           serviceInterlock != ServiceInterlock.SERVICE_FAULT and
           dockReadiness != DockReadiness.READINESS_CONFLICT and
           serviceInterlock != ServiceInterlock.SERVICE_CONFLICT and
           dockReadiness == DockReadiness.TEMPORARILY_BLOCKED) implies
            operationalAssessment == OperationalAssessment.TEMPORARILY_BLOCKED;
        guarantee ASSESSMENT_DOCK_ELIGIBLE:
          (lifecyclePrestate == LifecycleState.IDLE_OUTSIDE and
           dockReadiness == DockReadiness.DOCK_READY and
           serviceInterlock == ServiceInterlock.QUIESCENT) implies
            operationalAssessment == OperationalAssessment.DOCK_ELIGIBLE;
        guarantee ASSESSMENT_SERVICE_DEMAND:
          (lifecyclePrestate == LifecycleState.DOCKED_ACCESS_LOCKED and
           dockReadiness == DockReadiness.SERVICE_READY and
           serviceInterlock == ServiceInterlock.SINGLE_DEMAND) implies
            operationalAssessment == OperationalAssessment.SERVICE_DEMAND_READY;
        guarantee ASSESSMENT_UNDOCK_ELIGIBLE:
          (lifecyclePrestate == LifecycleState.DOCKED_ACCESS_LOCKED and
           dockReadiness == DockReadiness.UNDOCK_READY and
           serviceInterlock == ServiceInterlock.QUIESCENT) implies
            operationalAssessment == OperationalAssessment.UNDOCK_ELIGIBLE;
        guarantee ASSESSMENT_RECOVERY_CLEARABLE:
          (lifecyclePrestate == LifecycleState.RECOVERY_REQUIRED and
           dockReadiness == DockReadiness.RELEASE_CONFIRMED and
           serviceInterlock == ServiceInterlock.QUIESCENT) implies
            operationalAssessment == OperationalAssessment.RECOVERY_CLEARABLE;
    }*/
                        
                
                           
                                          
                                                                          
             
                          
                                            
                                                            
                                                                 
                                                                              
                                                            
                                                                 
                                                               
                                                                    
                                                                                 
                                                            
                                                                
                                                               
                                                                    
                                                                
                                                                                 
                                                             
                                                              
                                                            
                                                                            
                                                             
                                                       
                                                            
                                                                           
                                                                       
                                                       
                                                            
                                                                          
                                                                       
                                                          
                                                            
                                                                            
                                                                     
                                                          
                                                            
                                                                              
                                                                     
                                                          
                                                                
                                                                                  
                                                                     
                                                         
                                                            
                                                                             
                                                                       
                                                          
                                                                
                                                                                   
                                                                       
                                                          
                                                                
                                                                              
                                                                       
                                                          
                                                             
                                                                      
                                                                               
                                                                    
                                                          
                                                                
                                                                              
                                                                    
                                                          
                                                                    
                                                                              
                                                                         
                                                         
                                                            
                                                                            
                                                                         
                                                              
                                                            
                                                                               
                                                                  
                                                              
                                                            
                                                                                
                                                             
                                                                 
                                                                
                                                                    
                                                                  
                                                                   
                                                                   
                                                                  
                                                                   
                                                            
                                                                  
                                                                             
                                                            
                                                                  
                                                                             
                                                               
                                                                  
                                                                           
                                                               
                                                                  
                                                                           
                                                               
                                                                      
                                                                           
                                                              
                                                                  
                                                                             
                                                               
                                                                      
                                                                      
                                                                  
                                                                            
                                                                          
                                                               
                                                                      
                                                                            
                                                                               
                                                               
                                                                     
                                                                  
                                                                        
                                                                   
                                                                   
                                                                                
       
  }

  part def PriorityArbiter :> Thread {
    port qualifiedIntent : DataPort { in :>> type : QualifiedIntent; }
    port operationalAssessment : DataPort { in :>> type : OperationalAssessment; }
    port lifecyclePrestate : DataPort { in :>> type : LifecycleState; }
    port admittedDirective : DataPort { out :>> type : AdmittedDirective; }

    language "GUMBO" /*{
      initialize
        guarantee ARBITER_INITIAL_SAFE: admittedDirective == AdmittedDirective.HOLD_STABLE;
      compute
        guarantee CASE_01_ENTER_RECOVERY_FAULT:
          (qualifiedIntent == QualifiedIntent.INTENT_FAULT or
           operationalAssessment == OperationalAssessment.ASSESSMENT_FAULT) implies
            admittedDirective == AdmittedDirective.ENTER_RECOVERY_FAULT;
        guarantee CASE_02_ENTER_RECOVERY_CONFLICT:
          (qualifiedIntent != QualifiedIntent.INTENT_FAULT and
           operationalAssessment != OperationalAssessment.ASSESSMENT_FAULT and
           operationalAssessment == OperationalAssessment.ASSESSMENT_CONFLICT) implies
            admittedDirective == AdmittedDirective.ENTER_RECOVERY_CONFLICT;
        guarantee CASE_03_RESET_RECOVERY:
          (lifecyclePrestate == LifecycleState.RECOVERY_REQUIRED and
           qualifiedIntent == QualifiedIntent.RESET_REQUEST and
           operationalAssessment == OperationalAssessment.RECOVERY_CLEARABLE) implies
            admittedDirective == AdmittedDirective.RESET_RECOVERY;
        guarantee CASE_05_FINISH_SERVICE_DEFER_UNDOCK:
          (lifecyclePrestate == LifecycleState.SERVICE_IN_PROGRESS and
           operationalAssessment == OperationalAssessment.SERVICE_RELEASED and
           qualifiedIntent == QualifiedIntent.UNDOCK_REQUEST) implies
            admittedDirective == AdmittedDirective.FINISH_SERVICE_DEFER_UNDOCK;
        guarantee CASE_06_FINISH_SERVICE:
          (lifecyclePrestate == LifecycleState.SERVICE_IN_PROGRESS and
           operationalAssessment == OperationalAssessment.SERVICE_RELEASED and
           qualifiedIntent != QualifiedIntent.UNDOCK_REQUEST) implies
            admittedDirective == AdmittedDirective.FINISH_SERVICE;
        guarantee CASE_07_DEFER_UNDOCK:
          (lifecyclePrestate == LifecycleState.SERVICE_IN_PROGRESS and
           operationalAssessment == OperationalAssessment.SERVICE_OCCUPIED and
           qualifiedIntent == QualifiedIntent.UNDOCK_REQUEST) implies
            admittedDirective == AdmittedDirective.DEFER_UNDOCK;
        guarantee CASE_09_START_SERVICE:
          (lifecyclePrestate == LifecycleState.SERVICE_ACCESS_GRANTED and
           operationalAssessment == OperationalAssessment.SERVICE_OCCUPIED) implies
            admittedDirective == AdmittedDirective.START_SERVICE;
        guarantee CASE_11_WITHDRAW_SERVICE_GRANT:
          (lifecyclePrestate == LifecycleState.SERVICE_ACCESS_GRANTED and
           operationalAssessment == OperationalAssessment.SERVICE_WITHDRAWN) implies
            admittedDirective == AdmittedDirective.WITHDRAW_SERVICE_GRANT;
        guarantee CASE_12_CONFIRM_RELEASE:
          (lifecyclePrestate == LifecycleState.UNDOCK_CLEARANCE_LATCHED and
           operationalAssessment == OperationalAssessment.RELEASE_CONFIRMED) implies
            admittedDirective == AdmittedDirective.CONFIRM_RELEASE;
        guarantee CASE_14_CONFIRM_DOCK:
          (lifecyclePrestate == LifecycleState.DOCK_CLEARANCE_LATCHED and
           operationalAssessment == OperationalAssessment.DOCK_CONFIRMED) implies
            admittedDirective == AdmittedDirective.CONFIRM_DOCK;
        guarantee CASE_16_AUTHORIZE_UNDOCK:
          (lifecyclePrestate == LifecycleState.DOCKED_ACCESS_LOCKED and
           qualifiedIntent == QualifiedIntent.UNDOCK_REQUEST and
           operationalAssessment == OperationalAssessment.UNDOCK_ELIGIBLE) implies
            admittedDirective == AdmittedDirective.AUTHORIZE_UNDOCK;
        guarantee CASE_17_GRANT_SERVICE_ACCESS:
          (lifecyclePrestate == LifecycleState.DOCKED_ACCESS_LOCKED and
           operationalAssessment == OperationalAssessment.SERVICE_DEMAND_READY) implies
            admittedDirective == AdmittedDirective.GRANT_SERVICE_ACCESS;
        guarantee CASE_18_AUTHORIZE_DOCK:
          (lifecyclePrestate == LifecycleState.IDLE_OUTSIDE and
           qualifiedIntent == QualifiedIntent.DOCK_REQUEST and
           operationalAssessment == OperationalAssessment.DOCK_ELIGIBLE) implies
            admittedDirective == AdmittedDirective.AUTHORIZE_DOCK;
    }*/
                        
                
                           
                                       
                                                             
             
                     
                           
                                            
                                                                    
                                                                                   
                                                                                  
                           
                                               
                                                                    
                                                                                    
                                                                                      
                                                                                     
                           
                                      
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                     
                                                                                     
                                                                            
                           
                                     
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                          
                                                                                           
                                                                           
                           
                                                   
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                            
                                                                                    
                                                                     
                                                                                         
                           
                                      
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                            
                                                                                    
                                                                     
                                                                            
                           
                                    
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                            
                                                                                    
                                                                     
                                                                          
                           
                                           
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                            
                                                                                    
                                                                
                                                                                 
                           
                                     
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                               
                                                                                   
                                                                           
                           
                                          
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                               
                                                                                         
                                                                
                                                                                
                           
                                              
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                               
                                                                                    
                                                                                    
                           
                                       
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                                 
                                                                                    
                                                                             
                           
                                             
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                                 
                                                                                     
                                                                
                                                                                   
                           
                                    
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                               
                                                                                 
                                                                          
                           
                                           
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                               
                                                                                  
                                                                
                                                                                 
                           
                                        
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                             
                                                                      
                                                                                  
                                                                              
                           
                                            
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                             
                                                                                       
                                                                                  
                           
                                      
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                     
                                                                    
                                                                                
                                                                            
                           
                                      
                                                                    
                                                                                    
                                                                                       
                                                                          
                                                                     
                                                                       
                                                                       
                                                                                 
                                                                                          
                                                                                 
                                                                                         
                                                                            
                                                                                    
                                                                                          
                                                                                    
                                                                                           
                                                                                      
                                                                                           
                                                                                    
                                                                                        
                                                                                  
                                                                           
                                                                                         
                                                                                  
                                                                                              
                                                                          
                                                                         
                                                                                      
                                                                            
                           
                                   
                                                                 
                                                                                    
                                                                                       
                                                                          
                                                                            
                                                                                    
                                                                                          
                                                                                    
                                                                                               
                                                                                    
                                                                                           
                                                                                      
                                                                                           
                                                                                       
                                                                                    
                                                                                        
                                                                                     
                                                                                  
                                                                                             
                                                                         
       
  }

  part def LifecycleController :> Thread {
    port admittedDirective : DataPort { in :>> type : AdmittedDirective; }
    port monitorPrestate : DataPort { out :>> type : LifecycleState; }
    port arbiterPrestate : DataPort { out :>> type : LifecycleState; }
    port controlProposal : DataPort { out :>> type : ControlProposal; }
    port lifecycleSnapshot : DataPort { out :>> type : LifecycleSnapshot; }

    language "GUMBO" /*{
      state
        lifecycleMemory: LifecycleState;
      initialize
        guarantee LIFECYCLE_INITIAL_SAFE:
          lifecycleMemory == LifecycleState.IDLE_OUTSIDE and
          monitorPrestate == LifecycleState.IDLE_OUTSIDE and
          arbiterPrestate == LifecycleState.IDLE_OUTSIDE and
          controlProposal.movement == MovementProposal.HOLD_MOVEMENT and
          controlProposal.access == AccessProposal.LOCK_ACCESS and
          lifecycleSnapshot.next_state == SnapshotLifecycleState.IDLE_OUTSIDE and
          lifecycleSnapshot.result == LifecycleResult.NONE;
      compute
        guarantee PRESTATE_PUBLICATION:
          monitorPrestate == In(lifecycleMemory) and arbiterPrestate == In(lifecycleMemory);
        guarantee APPLY_RECOVERY_FAULT:
          admittedDirective == AdmittedDirective.ENTER_RECOVERY_FAULT implies
            lifecycleMemory == LifecycleState.RECOVERY_REQUIRED and
            lifecycleSnapshot.result == LifecycleResult.RECOVERY_LATCHED;
        guarantee APPLY_RECOVERY_CONFLICT:
          admittedDirective == AdmittedDirective.ENTER_RECOVERY_CONFLICT implies
            lifecycleMemory == LifecycleState.RECOVERY_REQUIRED and
            lifecycleSnapshot.result == LifecycleResult.RECOVERY_LATCHED;
        guarantee APPLY_RESET:
          admittedDirective == AdmittedDirective.RESET_RECOVERY implies
            lifecycleMemory == LifecycleState.IDLE_OUTSIDE and
            lifecycleSnapshot.result == LifecycleResult.RESET_COMPLETE;
        guarantee APPLY_AUTHORIZE_DOCK:
          admittedDirective == AdmittedDirective.AUTHORIZE_DOCK implies
            lifecycleMemory == LifecycleState.DOCK_CLEARANCE_LATCHED and
            lifecycleSnapshot.result == LifecycleResult.DOCK_ACCEPTED;
        guarantee APPLY_CONFIRM_DOCK:
          admittedDirective == AdmittedDirective.CONFIRM_DOCK implies
            lifecycleMemory == LifecycleState.DOCKED_ACCESS_LOCKED and
            lifecycleSnapshot.result == LifecycleResult.DOCK_CONFIRMED;
        guarantee APPLY_GRANT_ACCESS:
          admittedDirective == AdmittedDirective.GRANT_SERVICE_ACCESS implies
            lifecycleMemory == LifecycleState.SERVICE_ACCESS_GRANTED and
            lifecycleSnapshot.result == LifecycleResult.SERVICE_GRANTED;
        guarantee APPLY_START_SERVICE:
          admittedDirective == AdmittedDirective.START_SERVICE implies
            lifecycleMemory == LifecycleState.SERVICE_IN_PROGRESS and
            lifecycleSnapshot.result == LifecycleResult.SERVICE_RUNNING;
        guarantee APPLY_FINISH_SERVICE:
          admittedDirective == AdmittedDirective.FINISH_SERVICE implies
            lifecycleMemory == LifecycleState.DOCKED_ACCESS_LOCKED and
            lifecycleSnapshot.result == LifecycleResult.SERVICE_FINISHED;
        guarantee APPLY_AUTHORIZE_UNDOCK:
          admittedDirective == AdmittedDirective.AUTHORIZE_UNDOCK implies
            lifecycleMemory == LifecycleState.UNDOCK_CLEARANCE_LATCHED and
            lifecycleSnapshot.result == LifecycleResult.UNDOCK_ACCEPTED;
        guarantee APPLY_CONFIRM_RELEASE:
          admittedDirective == AdmittedDirective.CONFIRM_RELEASE implies
            lifecycleMemory == LifecycleState.IDLE_OUTSIDE and
            lifecycleSnapshot.result == LifecycleResult.RELEASED;
    }*/
                        
           
                              
                                        
                
                                 
                           
                                         
                                                          
                                                          
                                                          
                                                                      
                                                                
                                                                               
                                                           
             
                                 
                          
                                       
                                                  
                                                 
                          
                                                  
                                                              
                                                                                   
                                                                        
                                                                                             
                                                                      
                                                                                           
                                                                        
                                                                                             
                                                                     
                                                                                          
                                                                          
                                                                                               
                                                                   
                                                                                         
                                                                        
                                                                          
                                                                    
                                                                          
                                                                            
                                                                    
                                                                       
                                                                     
                                                                         
                                                                      
                                                             
                                                                     
                                                                   
                                                                         
                                                                    
                     
                           
                             
                                                                               
                                                                           
                                                                                   
                           
                             
                                                                                  
                                                                           
                                                                                   
                           
                             
                                                                         
                                                                      
                                                                                 
                           
                             
                                                                        
                                                                           
                                                                                   
                           
                             
                                                                                      
                                                                              
                                                                                  
                           
                             
                                                                         
                                                                              
                                                                                   
                           
                             
                                                                       
                                                                             
                                                                                  
                           
                             
                                                                              
                                                                             
                                                                       
                           
                             
                                                                        
                                                                             
                                                                                  
                           
                             
                                                                             
                                                                                
                                                                                  
                           
                             
                                                                                 
                                                                              
                                                                            
                           
                             
                                                                          
                                                                      
                                                                           
                           
                             
                                                                                
                                                                                  
                                                                       
                           
                             
                                                                       
                                                                              
                                                                                 
                           
                             
                                                                              
                                                                                
                                                                       
                           
                             
                                                                           
                                                                                  
                                                                                  
                           
                             
                                                                               
                                                                                
                                                                                  
                           
                             
                                                                         
                                                                                
                                                                                
                           
                             
                                                                         
                                                              
                                                                            
                           
                             
                                                                      
                                                              
                                                                       
       
  }

  part def MovementAndAccessSafetyGate :> Thread {
    port controlProposal : DataPort { in :>> type : ControlProposal; }
    port dockReadiness : DataPort { in :>> type : DockReadiness; }
    port serviceInterlock : DataPort { in :>> type : ServiceInterlock; }
    port gatedControl : DataPort { out :>> type : GatedControl; }
    port movementDirective : DataPort { out :>> type : MovementDirective; }
    port serviceAccess : DataPort { out :>> type : ServiceAccess; }

    language "GUMBO" /*{
      initialize
        guarantee GATE_INITIAL_SAFE:
          movementDirective == MovementDirective.HOLD and
          serviceAccess == ServiceAccess.LOCKED and
          gatedControl.movement == MovementDirective.HOLD and
          gatedControl.access == ServiceAccess.LOCKED;
      compute
        guarantee MOVEMENT_DOCK:
          (controlProposal.movement == MovementProposal.AUTHORIZE_DOCK and
           dockReadiness == DockReadiness.DOCK_READY and
           serviceInterlock == ServiceInterlock.QUIESCENT) implies
            movementDirective == MovementDirective.PERMIT_DOCK;
        guarantee MOVEMENT_UNDOCK:
          (controlProposal.movement == MovementProposal.AUTHORIZE_UNDOCK and
           dockReadiness == DockReadiness.UNDOCK_READY and
           serviceInterlock == ServiceInterlock.QUIESCENT) implies
            movementDirective == MovementDirective.PERMIT_UNDOCK;
        guarantee ACCESS_ENABLE:
          (controlProposal.access == AccessProposal.ENABLE_ACCESS and
           dockReadiness == DockReadiness.SERVICE_READY and
           (serviceInterlock == ServiceInterlock.SINGLE_DEMAND or
            serviceInterlock == ServiceInterlock.SINGLE_ACTIVE)) implies
            serviceAccess == ServiceAccess.ENABLED;
        guarantee GATED_CONTROL_COHERENCE:
          gatedControl.movement == movementDirective and
          gatedControl.access == serviceAccess and
          not (movementDirective != MovementDirective.HOLD and serviceAccess == ServiceAccess.ENABLED);
    }*/
                        
                
                           
                                    
                                                       
                                                 
                                                           
                                                      
             
                          
                                
                                                                          
                                                        
                                                              
                                                                  
                                                                            
                                                          
                                                              
                                                                    
                                                                               
                                                             
                                                                   
                                                                                 
                                                               
                                                                    
                                                           
                          
                              
                                                                     
                                                           
                                                                  
                                                                    
                                                      
                                                                          
                                                                
                                                                       
                                                                          
                                                     
                           
                                          
                                                      
                                                
                                                            
                                                       
       
  }

  part def LifecycleReporter :> Thread {
    port lifecycleSnapshot : DataPort { in :>> type : LifecycleSnapshot; }
    port gatedControl : DataPort { in :>> type : GatedControl; }
    port pilotReport : DataPort { out :>> type : PilotLifecycleReport; }
    port stationReport : DataPort { out :>> type : StationAccessReport; }

    language "GUMBO" /*{
      initialize
        guarantee REPORT_INITIAL_SAFE:
          pilotReport == PilotLifecycleReport.OUTSIDE_IDLE and
          stationReport == StationAccessReport.NO_ACCESS;
      compute
        guarantee REPORT_RECOVERY:
          lifecycleSnapshot.result == LifecycleResult.RECOVERY_LATCHED implies
            pilotReport == PilotLifecycleReport.RECOVERY_REQUIRED and
            stationReport == StationAccessReport.RECOVERY_REQUIRED;
        guarantee REPORT_RESET:
          lifecycleSnapshot.result == LifecycleResult.RESET_COMPLETE implies
            pilotReport == PilotLifecycleReport.RESET_COMPLETE and
            stationReport == StationAccessReport.NO_ACCESS;
        guarantee REPORT_RELEASE:
          lifecycleSnapshot.result == LifecycleResult.RELEASED implies
            pilotReport == PilotLifecycleReport.RELEASE_CONFIRMED and
            stationReport == StationAccessReport.NO_ACCESS;
        guarantee REPORT_DOCK_ACCEPTED:
          (lifecycleSnapshot.result == LifecycleResult.DOCK_ACCEPTED and
           gatedControl.movement == MovementDirective.PERMIT_DOCK) implies
            pilotReport == PilotLifecycleReport.DOCK_PERMITTED and
            stationReport == StationAccessReport.DOCK_EXPECTED;
        guarantee REPORT_DOCK_CONFIRMED:
          lifecycleSnapshot.result == LifecycleResult.DOCK_CONFIRMED implies
            pilotReport == PilotLifecycleReport.DOCKED_READY and
            stationReport == StationAccessReport.ACCESS_AVAILABLE;
        guarantee REPORT_SERVICE_GRANTED:
          (lifecycleSnapshot.result == LifecycleResult.SERVICE_GRANTED and
           gatedControl.access == ServiceAccess.ENABLED) implies
            pilotReport == PilotLifecycleReport.SERVICE_GRANTED and
            stationReport == StationAccessReport.ACCESS_RESERVED;
        guarantee REPORT_SERVICE_RUNNING:
          (lifecycleSnapshot.result == LifecycleResult.SERVICE_RUNNING and
           gatedControl.access == ServiceAccess.ENABLED) implies
            pilotReport == PilotLifecycleReport.SERVICE_ACTIVE and
            stationReport == StationAccessReport.ACCESS_OCCUPIED;
        guarantee REPORT_SERVICE_FINISHED:
          lifecycleSnapshot.result == LifecycleResult.SERVICE_FINISHED implies
            pilotReport == PilotLifecycleReport.SERVICE_FINISHED and
            stationReport == StationAccessReport.ACCESS_AVAILABLE;
        guarantee REPORT_UNDOCK_DEFERRED:
          lifecycleSnapshot.result == LifecycleResult.UNDOCK_DEFERRED implies
            pilotReport == PilotLifecycleReport.UNDOCK_DEFERRED;
        guarantee REPORT_UNDOCK_ACCEPTED:
          (lifecycleSnapshot.result == LifecycleResult.UNDOCK_ACCEPTED and
           gatedControl.movement == MovementDirective.PERMIT_UNDOCK) implies
            pilotReport == PilotLifecycleReport.UNDOCK_PERMITTED and
            stationReport == StationAccessReport.DEPARTURE_EXPECTED;
        guarantee REPORT_NONE_RECOVERY:
          (lifecycleSnapshot.result == LifecycleResult.NONE and
           lifecycleSnapshot.next_state == SnapshotLifecycleState.RECOVERY_REQUIRED) implies
            pilotReport == PilotLifecycleReport.RECOVERY_REQUIRED and
            stationReport == StationAccessReport.RECOVERY_REQUIRED;
    }*/
                        
                
                           
                                      
                                                            
                                                         
             
                     
                            
                               
                                                                                
                                                                             
                                                                             
                            
                            
                                                                              
                                                                          
                                                                     
                            
                              
                                                                        
                                                                             
                                                                     
                            
                                    
                                                                              
                                                                          
                                                                          
                                                                         
                            
                                                 
                                                                              
                                                                          
                                                                     
                                                                            
                            
                                     
                                                                              
                                                                        
                                                                            
                            
                                      
                                                                                
                                                                
                                                                           
                                                                           
                            
                                               
                                                                                
                                                                
                                                                     
                                                                            
                            
                                      
                                                                                
                                                                
                                                                          
                                                                           
                            
                                                 
                                                                                
                                                                
                                                                     
                                                                            
                            
                                       
                                                                                
                                                                            
                                                                            
                                   
                                               
                                                                                
                                                                
                                                                           
                                                                           
                                   
                                               
                                                                                
                                                                 
                                                                                               
                                                                           
                                                                            
                                   
                                                 
                                                                                
                                                                 
                                                                                               
                                                                           
                                                                            
                            
                                      
                                                                                
                                                                            
                                                                            
                                                                              
                            
                                                   
                                                                                
                                                                            
                                                                     
                                                                            
                            
                                         
                                                                          
                                                                 
                                                                                                 
                                                                     
                                                                           
                            
                                         
                                                                          
                                                                 
                                                                                              
                                                                     
                                                                           
                            
                                              
                                                                          
                                                                          
                                                                     
                                                                         
                            
                                                   
                                                                          
                                                                            
                                                                     
                                                                              
                            
                                       
                                                                          
                                                                 
                                                                    
                                                                                               
                                                                     
                                                                            
                            
                                      
                                                                          
                                                                 
                                                                    
                                                                                               
                                                                     
                                                                            
                            
                                   
                                                                     
                                                                                       
                                                                        
                                                                     
                            
                                          
                                                                     
                                                                                                  
                                                                          
                                                                          
                                                                         
                            
                                                     
                                                                     
                                                                                                  
                                                                          
                                                                     
                                                                            
                            
                                  
                                                                     
                                                                                               
                                                                        
                                                                            
                            
                                   
                                                                     
                                                                                                  
                                                                
                                                                           
                                                                           
                            
                                              
                                                                     
                                                                                                  
                                                                
                                                                     
                                                                            
                            
                                  
                                                                     
                                                                                               
                                                                
                                                                          
                                                                           
                            
                                             
                                                                     
                                                                                               
                                                                
                                                                     
                                                                            
                            
                                            
                                                                     
                                                                                                    
                                                                            
                                                                            
                                                                              
                            
                                                       
                                                                     
                                                                                                    
                                                                            
                                                                     
                                                                            
                            
                                    
                                                                     
                                                                                            
                                                                             
                                                                             
       
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
