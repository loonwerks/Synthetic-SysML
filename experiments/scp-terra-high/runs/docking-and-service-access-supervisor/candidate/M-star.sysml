// Canonical final source: approved architecture plus owner-local GUMBO contracts.
// The exact pre-contract checkpoint is retained under validation/architecture-stage/.

package Docking_Access_Supervisor {
  private import HAMR::*;

  // Exact finite boundary domains.
  enum def AccessRequest {
    enum NONE; enum INVALID; enum DOCK_A; enum DOCK_B;
    enum ACCESS_A; enum ACCESS_B; enum UNDOCK_A; enum UNDOCK_B;
  }
  enum def VesselStatus {
    enum INVALID; enum ON_WARP; enum IN_GRID; enum DOCKED_A; enum DOCKED_B;
    enum DEPARTED_A; enum DEPARTED_B;
  }
  enum def StationReport {
    enum NONE; enum INVALID; enum AVAILABLE; enum CLEAR_A; enum CLEAR_B;
    enum SECURED_A; enum SECURED_B; enum DENIED; enum RELEASED_A; enum RELEASED_B;
  }
  enum def ServiceActivity { enum INVALID; enum QUIESCENT; enum ACTIVE; }
  enum def ControlEvent { enum NONE; enum EMERGENCY_STOP; enum RESET; enum VERIFY_CLEAR; enum VERIFY_DOCKED; }

  // Public and retained policy domains.
  enum def Correlation { enum NONE; enum A; enum B; }
  enum def SupervisoryAction {
    enum HOLD; enum REQUEST_DOCK_CLEARANCE; enum AUTHORIZE_DOCK_APPROACH;
    enum OPEN_SERVICE_ACCESS; enum CLOSE_SERVICE_ACCESS; enum REQUEST_UNDOCK_RELEASE;
    enum AUTHORIZE_UNDOCK; enum REVOKE_SERVICE_ACCESS;
  }
  enum def DecisionCause {
    enum FAULT_OR_RECOVERY; enum DEPARTURE_CONFIRMATION; enum UNDOCK_SEQUENCE;
    enum DOCKING_PROGRESS; enum ACCESS_REQUEST; enum NEW_DOCK_REQUEST;
    enum NO_ELIGIBLE_ACTION;
  }
  enum def PublicMode { enum HOLDING; enum DOCKING; enum ACCESSIBLE; enum UNDOCKING; enum QUARANTINED; }
  enum def RequestDisposition { enum NO_REQUEST; enum ACCEPTED; enum DUPLICATE; enum REJECTED; enum DEFERRED; }
  enum def AccessStatus { enum CLOSED; enum OPEN; enum REVOKED; }
  enum def DockingOutcome {
    enum NONE; enum DOCKING_ACTIVE; enum DOCKED_ACCESS_READY; enum ACCESS_ACTIVE;
    enum UNDOCKING_ACTIVE; enum DEPARTURE_COMPLETE; enum RECOVERY_REQUIRED;
  }
  enum def DecisionContext { enum CLEAR; enum DOCKING; enum DOCKED_CLOSED; enum ACCESS_OPEN; enum UNDOCKING; enum QUARANTINED; }
  enum def RequestLedger { enum NO_HISTORY; enum A_LAST; enum B_LAST; }
  enum def LifecycleState {
    enum CLEAR_IDLE; enum AWAIT_CLEAR_A; enum AWAIT_CLEAR_B; enum AWAIT_DOCK_A;
    enum AWAIT_DOCK_B; enum AWAIT_SECURE_A; enum AWAIT_SECURE_B;
    enum DOCKED_CLOSED_A; enum DOCKED_CLOSED_B; enum ACCESS_OPEN_A;
    enum ACCESS_OPEN_B; enum AWAIT_RELEASE_A; enum AWAIT_RELEASE_B;
    enum AWAIT_DEPART_A; enum AWAIT_DEPART_B; enum DOCKED_REBASE; enum QUARANTINED;
  }
  enum def BerthState { enum UNKNOWN; enum AVAILABLE; enum RESERVED; enum SECURED; enum RELEASED; }
  enum def GateState { enum CLOSED; enum OPEN; }
  enum def RecoveryState { enum HEALTHY; enum LATCHED; enum RECONCILING; }

  // Owner-local classification and directive domains.
  enum def RequestOperation { enum NONE; enum DOCK; enum ACCESS; enum UNDOCK; }
  enum def VesselClass { enum INVALID; enum ON_WARP; enum IN_GRID; enum DOCKED; enum DEPARTED; }
  enum def StationProgress { enum NONE; enum INVALID; enum AVAILABLE; enum CLEAR; enum SECURED; enum DENIED; enum RELEASED; }
  enum def ServiceClass { enum INVALID; enum QUIESCENT; enum ACTIVE; }
  enum def RecoveryIntent { enum RETAIN; enum LATCH; enum RECONCILE; enum OPEN_CLEAR; enum OPEN_DOCKED; }
  enum def LifecycleDirective {
    enum RETAIN; enum QUARANTINE; enum ANCHOR_CLEAR; enum ANCHOR_DOCKED;
    enum CLEARANCE; enum DOCKED; enum SECURED; enum OPEN_ACCESS;
    enum CLOSE_ACCESS; enum RELEASED; enum DEPARTED;
  }
  enum def BerthEvidenceKind {
    enum NO_EVENT; enum DOMINANT_FAULT; enum VERIFIED_CLEAR_ANCHOR;
    enum VERIFIED_DOCKED_ANCHOR; enum STATION_AVAILABLE; enum STATION_CLEARANCE;
    enum STATION_SECURED; enum STATION_RELEASED; enum DEPARTURE_COMPLETION;
  }
  enum def GateDirective { enum RETAIN; enum FORCE_CLOSE; enum OPEN_SAFE; enum ORDERED_CLOSE; }
  enum def PriorityKind { enum ORDINARY; enum REVOKE; enum DEPARTURE_COMPLETE; }

  // Every member below is inspected by GUMBO and is therefore a direct attribute.
  part def RequestFacts :> Data {
    attribute present : Base_Types::Boolean;
    attribute usable : Base_Types::Boolean;
    attribute operation : RequestOperation;
    attribute correlation : Correlation;
    attribute startsAuthorization : Base_Types::Boolean;
  }
  part def VesselFacts :> Data {
    attribute usable : Base_Types::Boolean;
    attribute lifecycleClass : VesselClass;
    attribute approachReady : Base_Types::Boolean;
    attribute docked : Base_Types::Boolean;
    attribute departed : Base_Types::Boolean;
    attribute correlation : Correlation;
  }
  part def StationFacts :> Data {
    attribute present : Base_Types::Boolean;
    attribute usable : Base_Types::Boolean;
    attribute progress : StationProgress;
    attribute available : Base_Types::Boolean;
    attribute denied : Base_Types::Boolean;
    attribute correlation : Correlation;
  }
  part def ServiceFacts :> Data {
    attribute usable : Base_Types::Boolean;
    attribute serviceClass : ServiceClass;
    attribute quiescent : Base_Types::Boolean;
    attribute active : Base_Types::Boolean;
    attribute requestPermitted : Base_Types::Boolean;
  }
  part def PriorLifecycleView :> Data {
    attribute lifecycle : LifecycleState;
    attribute correlation : Correlation;
  }
  part def AdmissionGuard :> Data {
    attribute open : Base_Types::Boolean;
    attribute lifecycle : LifecycleState;
    attribute correlation : Correlation;
    attribute berthAvailable : Base_Types::Boolean;
    attribute gateClosed : Base_Types::Boolean;
    attribute recoveryHealthy : Base_Types::Boolean;
  }
  part def AdmissionDecision :> Data {
    attribute disposition : RequestDisposition;
    attribute operation : RequestOperation;
    attribute correlation : Correlation;
    attribute accepted : Base_Types::Boolean;
    attribute startsAuthorization : Base_Types::Boolean;
  }
  part def RecoveryTransition :> Data {
    attribute intent : RecoveryIntent;
    attribute fault : Base_Types::Boolean;
    attribute verifiedAnchor : Base_Types::Boolean;
  }
  part def CoordinationFrame :> Data {
    attribute directive : LifecycleDirective;
    attribute correlation : Correlation;
    attribute qualified : Base_Types::Boolean;
    attribute decisionContext : DecisionContext;
  }
  part def BerthTransitionEvidence :> Data {
    attribute eventKind : BerthEvidenceKind;
    attribute correlation : Correlation;
    attribute qualified : Base_Types::Boolean;
  }
  part def GateSafetyFrame :> Data {
    attribute directive : GateDirective;
    attribute safeToOpen : Base_Types::Boolean;
    attribute decisionContext : DecisionContext;
  }
  part def PriorityDirective :> Data {
    attribute priority : PriorityKind;
    attribute correlation : Correlation;
    attribute decisionContext : DecisionContext;
  }
  part def DockingProposal :> Data {
    attribute applicable : Base_Types::Boolean;
    attribute proposedAction : SupervisoryAction;
    attribute cause : DecisionCause;
    attribute correlation : Correlation;
    attribute decisionContext : DecisionContext;
  }
  part def AccessProposal :> Data {
    attribute applicable : Base_Types::Boolean;
    attribute proposedAction : SupervisoryAction;
    attribute cause : DecisionCause;
    attribute correlation : Correlation;
    attribute decisionContext : DecisionContext;
  }
  part def UndockingProposal :> Data {
    attribute applicable : Base_Types::Boolean;
    attribute proposedAction : SupervisoryAction;
    attribute cause : DecisionCause;
    attribute correlation : Correlation;
    attribute decisionContext : DecisionContext;
  }
  part def DockingDecisionFrame :> Data {
    attribute proposedAction : SupervisoryAction;
    attribute cause : DecisionCause;
    attribute correlation : Correlation;
    attribute decisionContext : DecisionContext;
  }
  part def DockingAccessResult :> Data {
    attribute proposedAction : SupervisoryAction;
    attribute cause : DecisionCause;
    attribute mode : PublicMode;
    attribute correlation : Correlation;
    attribute disposition : RequestDisposition;
    attribute status : AccessStatus;
    attribute outcome : DockingOutcome;
  }

  part def RequestClassification :> Thread {
    port access_request : DataPort { in :>> type : AccessRequest; }
    port request_facts : DataPort { out :>> type : RequestFacts; }

                        
                
                             
                                             
                                                             
                                                            
                                                         
                                                 
             
                     
                           
                            
                                                        
                                                                         
                                                                
                                                             
                                                     
                           
                              
                                                                                                  
                                                                    
                                                         
                                                          
                                                                  
                                                    
                                                           
                                                            
                                                                    
                                                         
                                                           
                                                            
                                                                    
                                                          
                                                         
                                                           
                                                            
                                                             
                                                         
                                                           
                                                            
                                                             
                           
                               
                                                           
                                                                         
                                                                
                                                             
                                                     
       
  }
  part def VesselStatusAssessment :> Thread {
    port vessel_status : DataPort { in :>> type : VesselStatus; }
    port vessel_readiness : DataPort { out :>> type : VesselFacts; }
    port vessel_facts : DataPort { out :>> type : VesselFacts; }

                        
                
                             
                                            
                                        
                                                                  
                                                                              
                                          
                                                            
                                                          
                                                                          
                                                                        
                                                          
                                                              
                                                                   
             
                         
                                       
                                                          
                                                                          
                                                                        
                                                          
                                                              
                                                                   
                     
                           
                              
                                                         
                                                    
                                                                      
                                                                                  
                                              
                                                               
                           
                               
                                                                                                 
                                               
                                                         
                                                                        
                                                      
                                                         
                                                                        
                                                  
                                                                             
                                                               
                           
                             
                                                           
                                                      
                                                        
                                                       
                                               
                                                         
                                                          
                                                                       
                                                                           
                                                           
                                                            
                                                                         
                                                                            
                                                   
                                                         
                                                            
                                                                
                                                         
                                                            
                                                                
       
  }
  part def StationReportAssessment :> Thread {
    port station_report : DataPort { in :>> type : StationReport; }
    port station_facts : DataPort { out :>> type : StationFacts; }

                        
                
                             
                                             
                                                             
                                                          
                                                                    
                                                        
             
                     
                           
                            
                                                        
                                                                         
                                                              
                                                                        
                                                            
                           
                                 
                                                             
                                                                    
                                                                   
                                                                   
                                                            
                           
                                
                                                            
                                                       
                                                         
                                                         
                                                          
                                                         
                                                                    
                                                                        
                                                          
                                                           
                                                                  
                                                            
                                                             
                                                                    
                                                             
                                                              
                                                                      
                                                          
                                                            
                                                              
                                                             
                                                          
                                                            
                                                              
                                                             
                           
                             
                                                            
                                                     
                                                                         
                                            
                                                           
                                                                   
                                            
                                                          
                                                                  
                                        
                                                            
       
  }
  part def ServiceActivityAssessment :> Thread {
    port service_activity : DataPort { in :>> type : ServiceActivity; }
    port service_readiness : DataPort { out :>> type : ServiceFacts; }
    port service_facts : DataPort { out :>> type : ServiceFacts; }

                        
                
                             
                                             
                                         
                                                                  
                                                                            
                                                   
                                                            
                                                                        
                                                                  
                                                            
                                                                               
             
                         
                                        
                                                            
                                                                        
                                                                  
                                                            
                                                                               
                     
                           
                               
                                                               
                                                     
                                                                      
                                                                                
                                                      
                           
                                 
                                                                 
                                                
                                                                        
                                                                           
                                                 
                           
                              
                                                              
                                                
                                                                     
                                                                           
                                                      
       
  }
  part def RequestAdmission :> Thread {
    port request_facts : DataPort { in :>> type : RequestFacts; }
    port vessel_readiness : DataPort { in :>> type : VesselFacts; }
    port service_readiness : DataPort { in :>> type : ServiceFacts; }
    port admission_guard : DataPort { in :>> type : AdmissionGuard; }
    port lifecycle_admission : DataPort { out :>> type : AdmissionDecision; }
    port gate_admission : DataPort { out :>> type : AdmissionDecision; }
    port docking_admission : DataPort { out :>> type : AdmissionDecision; }
    port access_admission : DataPort { out :>> type : AdmissionDecision; }
    port undocking_admission : DataPort { out :>> type : AdmissionDecision; }
    port request_disposition : DataPort { out :>> type : RequestDisposition; }

                        
           
                               
                                     
                
                               
                             
                                         
                                                     
                                                                            
                                                                  
                                                               
                                             
                                                        
                                                                         
                                                                     
                                                                         
                                                                   
                                                                                         
                                                                            
                                                                        
                                                                            
                                                                      
                                                                                            
                                                                           
                                                                       
                                                                           
                                                                     
                                                                                           
                                                                              
                                                                          
                                                                              
                                                                        
                                                                                              
                                                                 
             
                               
                         
                                              
                                                                         
                                                                     
                                                                         
                                                                   
                                                                                         
                                                                            
                                                                        
                                                                            
                                                                      
                                                                                            
                                                                           
                                                                       
                                                                           
                                                                     
                                                                                           
                                                                              
                                                                          
                                                                              
                                                                        
                                                                                              
                                                                 
                     
                           
                          
                                              
                                                                                        
                                                                      
                                                                   
                                                 
                                                            
                                                 
                           
                               
                                                                     
                                                                                      
                                                                      
                                                                   
                                                 
                                                            
                                                 
                           
                                   
                                         
                                                                
                                    
                                                                      
                                                                               
                                                            
                                                            
                                                            
                                                            
                                                                                      
                                                                      
                                                                            
                                            
                                                       
                                                            
                                                        
                                                            
                                                        
                           
                              
                                         
                                                                                       
                                                            
                                                            
                                                            
                                                            
                                                                                       
                                                                      
                                                                            
                                                 
                                                            
                                                 
                           
                              
                                         
                                                                                       
                                                                      
                                                            
                                                            
                                                            
                                                             
                                                    
                                                    
                                                                                      
                                                                      
                                                                            
                                                 
                                                            
                                                 
                           
                             
                                         
                                                                
                                          
                                                                        
                                                              
                                                              
                                                              
                                                                
                                                                                      
                                                                      
                                                                            
                                                 
                                                            
                                                 
                           
                                
                                         
                                                                 
                     
                                      
                                                                                
                                                                
                                                                                
                                                                 
                                                                             
                                                                
                                                                
                                                                
                                                                   
                                             
                                                                                
                                                                          
                                                                              
                                              
                                                          
                                                                               
                                                                              
                                                                
                                                          
                                                                              
                                                                
                                                          
                                                                             
                                                         
                                           
                                                                                
                                                                        
                                                                              
                                                   
                                                              
                                                     
                                      
                                                                                 
                                                                 
                                                                                 
                                                                 
                                                                               
                                                      
                                                                                
                                                                        
                                                                              
                                                   
                                                              
                                                     
                           
                                
                                         
                                                                 
                     
                                                                    
                                                                             
                                                               
                                                                             
                                                                
                                                                                
                                                                          
                                                                              
                                              
                                                              
                                                     
                                            
                                            
                                                                               
                                                                 
                                                                               
                                                                   
                                                                                
                                                                        
                                                                              
                                                   
                                                              
                                                     
                                                                      
                                                                             
                                                               
                                                                             
                                                                
                                                                                
                                                                        
                                                                              
                                                   
                                                              
                                                      
       
  }
  part def AccessCoherence :> Thread {
    port control_event : DataPort { in :>> type : ControlEvent; }
    port vessel_facts : DataPort { in :>> type : VesselFacts; }
    port station_facts : DataPort { in :>> type : StationFacts; }
    port service_facts : DataPort { in :>> type : ServiceFacts; }
    port prior_lifecycle_view : DataPort { in :>> type : PriorLifecycleView; }
    port prior_berth_state : DataPort { in :>> type : BerthState; }
    port prior_gate_state : DataPort { in :>> type : GateState; }
    port prior_recovery_state : DataPort { in :>> type : RecoveryState; }
    port recovery_transition : DataPort { out :>> type : RecoveryTransition; }
    port admission_guard : DataPort { out :>> type : AdmissionGuard; }
    port lifecycle_frame : DataPort { out :>> type : CoordinationFrame; }
    port berth_transition_evidence : DataPort { out :>> type : BerthTransitionEvidence; }
    port gate_safety_frame : DataPort { out :>> type : GateSafetyFrame; }
    port docking_frame : DataPort { out :>> type : CoordinationFrame; }
    port access_frame : DataPort { out :>> type : CoordinationFrame; }
    port undocking_frame : DataPort { out :>> type : CoordinationFrame; }
    port priority_directive : DataPort { out :>> type : PriorityDirective; }

                        
                
                             
                                         
                                                               
                                          
                                                   
                                     
                                                                  
                                                           
                                          
                                      
                                           
                                                                  
                                                           
                                          
                                                                    
                                                                             
                                                                     
                                                    
                                                               
                                             
                                                                      
                                                                
                                                         
                                        
                                                                  
                                                               
                                                        
                                       
                                                                 
                                                                  
                                                           
                                          
                                                                    
                                                                
                                                              
                                                                      
             
                     
                           
                               
                                                                 
                                                                    
                                                                
                                                                             
                                                              
                                                               
                                                                                
                                                                
                                                                                   
                                                              
                                                                              
                                                              
                                                                             
                                                                                
                                                   
                                                         
                                                                                 
                                                                                    
                                                                                  
                                                                                   
                                                    
                                                                
                                                                               
                                                                                
                                                                  
                                                                              
                                                                              
                                                                                
                                                                                
                                                                                 
                                                                                 
                                                                               
                                                                                
                                                                   
                                                                                 
                                                                                 
                                                                                
                                                                                 
                                      
                                                                                
                                                                                 
                                    
                                                                              
                                                                              
                                                                                
                                                                                
                                                                                 
                                                                                 
                                                                               
                                                                               
                                                                                 
                                                                                 
                                                                                
                                                                                
                                                                                
                                                                                      
                                                                          
                                         
                                                       
                                         
                                                                           
                                                               
                                                   
                                          
                                                    
                                                                          
                                                               
                                         
                                                                              
                                                                                       
                                                                         
                                                   
                                                                        
                                                 
                                                                                
                                                                        
                                                             
                                            
                                                                            
                                                                       
                                                            
                                           
                                                                           
                                                                          
                                                               
                                              
                                                                              
                                                                  
                                                                  
                                                                                
                           
                              
                                                                 
                                                                                 
                                         
                                                             
                                                  
                                                                              
                                              
                                                       
                                         
                                                                           
                                                               
                                                   
                                          
                                                    
                                                                      
                                                               
                                              
                                                                              
                                                                                 
                                                                         
                                                        
                                                                        
                                                 
                                                                                
                                                                    
                                                             
                                            
                                                                            
                                                                   
                                                            
                                           
                                                                           
                                                                      
                                                               
                                              
                                                                              
                                                                  
                                                                  
                                                                                
                           
                                     
                                                                      
                                                          
                                                                  
                                                                   
                                      
                                                                               
                                                                                   
                                         
                                                                           
                                                               
                                                   
                                          
                                                    
                                                                            
                                                               
                                         
                                                                              
                                                                                              
                                                                         
                                                   
                                                                        
                                                 
                                                                                
                                                                    
                                                             
                                            
                                                                            
                                                                   
                                                            
                                           
                                                                           
                                                                      
                                                               
                                              
                                                                              
                                                                  
                                                                  
                                                                                
                           
                                      
                                                                      
                                                           
                                                                                       
                                                                     
                                                            
                                      
                                                                                
                                                                                   
                                         
                                                                           
                                                               
                                                   
                                          
                                                    
                                                                             
                                                               
                                         
                                                                              
                                                                                               
                                                                         
                                                   
                                                                        
                                                 
                                                                                
                                                                    
                                                             
                                            
                                                                            
                                                                   
                                                            
                                           
                                                                           
                                                                      
                                                               
                                              
                                                                              
                                                                  
                                                                  
                                                                                
                           
                                  
                                                                   
                                                   
                                                              
                                                     
                                                                  
                                                           
                                                                   
                                                                    
                                              
                                                                  
                                                            
                                         
                                                                  
                                                                      
                                                             
                                              
                                                            
                                                                                 
                                        
                                                                           
                                              
                                                       
                                         
                                                                           
                                                               
                                                   
                                          
                                                    
                                                                      
                                                               
                                              
                                                                              
                                                                                 
                                                                         
                                                        
                                                                        
                                                 
                                                                                
                                                                    
                                                             
                                            
                                                                            
                                                                   
                                                            
                                           
                                                                           
                                                                      
                                                               
                                              
                                                                              
                                                                  
                                                                  
                                                                                
                           
                                  
                                                                  
                                                  
                                                                                 
                                         
                                                                                
                                                             
                                                                              
                                                              
                                                                               
                                                                            
                                                   
                                                         
                                                                                   
                                                                                      
                                                                               
                                                    
                                                                               
                                                    
                                                                
                                                                               
                                                                                
                                                                  
                                                                              
                                                                              
                                                                                
                                                                                
                                                                                 
                                                                                 
                                                                               
                                                                                
                                                                   
                                                                                 
                                                                                 
                                                                                
                                                                                 
                                           
                                                                                
                                                                                 
                                         
                                                                              
                                                                              
                                                                                
                                                                                
                                                                                 
                                                                                 
                                                                               
                                                                               
                                                                                 
                                                                                 
                                                                                
                                                                                
                                                                                
                                                                                           
                                                                           
                                              
                                                       
                                    
                                                                           
                                                                               
                                               
                                                             
                                                                                    
                                               
                                                                   
                                                                           
                                                                          
                                            
                                     
                                                             
                                                                            
                                                             
                                                                            
                                                                         
                                            
                                                                   
                                          
                                                                                      
                                                                                       
                                                                           
                                              
                                                                                    
                                                                                     
                                                                          
                                                    
                                                                          
                                                                             
                                                                    
                                          
                                                                          
                                                                          
                                            
                                       
                                                                          
                                                                         
                                            
                                                                 
                                          
                                                                   
                                                                    
                                            
                                                                        
                                                                                 
                                                  
                                                                               
                                                                           
                                                                                   
                                                                                   
                                                                                  
                                                                                  
                                                                                    
                                                                                     
                                                                             
                                                                                     
                                                                                     
                                                                                    
                                                                                   
                                                                                   
                                                                                    
                                                                                 
                                                                                     
                                                                                     
                                                                                    
                                                                                     
                                                                               
                                                                              
                                                                                  
                                                                   
                                                                                            
                                                                                    
                                                      
                                                                   
                                                                                          
                                                                                    
                                                      
                                                                    
                                                                                           
                                                                                    
                                                      
                                       
                                                                                               
                                                                                   
                                                      
                                                                     
                                                                                            
                                                                           
                                                      
                                                                 
                                                                   
                                                                    
                                                                     
                                            
                                                                                   
                                                                           
                                                            
                                                                   
                                             
                                                                                      
                                                                                      
                                                                                     
                                                          
                                           
                                                      
                                                                                   
                                                      
                                                                                      
                                                                    
                                                                        
                                                                    
                                                                                
                                                                   
                                                                       
                                       
                                                                                      
                                                                                      
                                                                                     
                                                          
                                           
                                                      
                                                                              
                                                      
                                                                                 
                                                                      
                                                                          
                                          
                                                                                       
                                                                                        
                                                         
                                                                            
                                                                            
                                       
                                                                                
                                                                             
                                            
                                                                      
                                                                                      
                                                                                    
       
  }
  part def DockingLifecycle :> Thread {
    port lifecycle_frame : DataPort { in :>> type : CoordinationFrame; }
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    port prior_lifecycle_view : DataPort { out :>> type : PriorLifecycleView; }

                        
           
                               
                                       
                
                                
                             
                                         
                                                       
                                                                       
                                                               
             
                                
                        
                                              
                                                                
                                                                   
                                                                  
                                                                    
                                                                     
                                                                   
                                                                     
                                                                     
                                                                
                                                                   
                                                                  
                                                                    
                                                                     
                                                                   
                                                                     
                                                                     
                                                                
                                                                
                                                                   
                                                                  
                                                                   
                         
                                                 
                                                                               
                                                             
                                                                                 
                                                            
                                                                                  
                                                               
                                                                        
                                                                          
                                                                           
                                         
                                                                   
                                                                    
                                                               
                                                                        
                                                                          
                                                                           
                                         
                                                                   
                                                                    
                                                               
                                         
                                                                     
                                                                    
                                                               
                                         
                                                                     
                                                                    
                                                               
                                         
                                                                     
                                                                    
                                                                 
                                         
                                                                     
                                                                    
                                                                 
                                              
                                                                       
                                                                 
                                                              
                                              
                                                                       
                                                                 
                                                              
                                              
                                                                    
                                                          
                                                                      
                                                                
                                              
                                                                    
                                                          
                                                                      
                                                                
                                              
                                                                      
                                                                    
                                                                       
                                                                    
                                                                         
                                                          
                                                                           
                                                                 
                                              
                                                                      
                                                                    
                                                                       
                                                                    
                                                                         
                                                          
                                                                           
                                                                 
                                                                      
                                                                 
                                                                
                                                                      
                                                                 
                                                                
                                                                             
                                                            
                                                                    
                                                     
                                                    
       
  }
  part def BerthCommitment :> Thread {
    port berth_transition_evidence : DataPort { in :>> type : BerthTransitionEvidence; }
    port prior_berth_state : DataPort { out :>> type : BerthState; }

                        
           
                               
                               
                
                            
                             
                                     
                                              
                                                    
             
                            
                        
                                          
                                              
                         
                     
                           
                                                                                           
                                                       
                           
                                  
                                                                                                  
                                                         
                           
                                   
                                                                                                   
                                                       
                           
                               
                                                                                               
                                                                                           
                                                        
                           
                             
                                                                                             
                                                   
                                                        
                                                       
                                                       
                           
                              
                                                                                              
                                                                                         
                                                        
                           
                              
                                                                                                  
                                                                                          
                                                         
                           
                            
                                                                                      
                                                        
                                                                                           
                                                        
                                                                                         
                                                                                              
                                                                                          
                                                      
                                                                                              
                                                       
                                                                                         
                                                   
       
  }
  part def ServiceAccessGate :> Thread {
    port gate_safety_frame : DataPort { in :>> type : GateSafetyFrame; }
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    port prior_gate_state : DataPort { out :>> type : GateState; }

                        
           
                               
                             
                
                           
                             
                                    
                                                                               
             
                           
                        
                                         
                                            
                         
                     
                                 
                                                                            
                                                    
                           
                         
                                                                             
                                           
                                                                       
                                           
                                                  
                           
                                  
                                                                             
                                           
                                                                      
                                                    
                           
                           
                                                                             
                                                 
                                                                         
                                                                          
                                                                         
                                                    
                                                 
       
  }
  part def RecoverySupervisor :> Thread {
    port recovery_transition : DataPort { in :>> type : RecoveryTransition; }
    port prior_recovery_state : DataPort { out :>> type : RecoveryState; }

                        
           
                               
                                     
                
                               
                             
                                        
                                                  
                                                        
             
                               
                        
                                             
                                                    
                         
                     
                              
                                                                      
                                                             
                           
                                  
                                                                          
                                                                 
                           
                             
                                                                            
                                                                       
                                                             
                           
                               
                                                                       
                                                         
       
  }
  part def DockingActionEligibility :> Thread {
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    port docking_frame : DataPort { in :>> type : CoordinationFrame; }
    port docking_proposal : DataPort { out :>> type : DockingProposal; }

                        
                
                             
                                                
                                            
                                                                     
                                                                      
                                                            
                                                                    
             
                         
                     
                                      
                                                
                                                                    
                                                   
                                                                                           
                                                                        
                                                                              
                                                                          
                           
                                     
                                                      
                                                                      
                                       
                                                                      
                                                   
                                                                                            
                                                                        
                                                                         
                                                                          
                           
                                   
                                                      
                                                                      
                                             
                                                                        
                                                        
                                                                         
                                                                          
                                                                         
                                                                                
       
  }
  part def AccessActionEligibility :> Thread {
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    port access_frame : DataPort { in :>> type : CoordinationFrame; }
    port access_proposal : DataPort { out :>> type : AccessProposal; }

                        
                
                             
                                               
                                           
                                                                    
                                                                     
                                                           
                                                                   
             
                         
                     
                                   
                                                
                                                                       
                                     
                                                  
                                                                                       
                                                                     
                                                                             
                                                                             
                           
                                    
                                                
                                                                      
                                                  
                                                                                        
                                                                      
                                                                             
                                                                           
                           
                                  
                                                     
                                                                        
                                                                         
                                                                        
                                            
                                                       
                                                                        
                                                                         
                                                                       
                                                                              
       
  }
  part def UndockingActionEligibility :> Thread {
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    port undocking_frame : DataPort { in :>> type : CoordinationFrame; }
    port undocking_proposal : DataPort { out :>> type : UndockingProposal; }

                        
                
                             
                                                  
                                              
                                                                       
                                                                        
                                                              
                                                                      
             
                         
                     
                                       
                                              
                                                                     
                                                     
                                                                                             
                                                                         
                                                                             
                                                                              
                           
                                            
                                              
                                                                       
                                                     
                                                                                       
                                                                         
                                                                             
                                                                              
                           
                                     
                                                   
                                                                       
                                                                         
                                                          
                                                                           
                                                                            
                                                                             
                                                                                    
       
  }
  part def DockingActionArbitration :> Thread {
    port docking_proposal : DataPort { in :>> type : DockingProposal; }
    port access_proposal : DataPort { in :>> type : AccessProposal; }
    port undocking_proposal : DataPort { in :>> type : UndockingProposal; }
    port priority_directive : DataPort { in :>> type : PriorityDirective; }
    port docking_decision : DataPort { out :>> type : DockingDecisionFrame; }

                        
                
                             
                                        
                                                                     
                                                                      
                                                            
                                                                    
             
                         
                     
                                 
                                                                      
                                                                                                  
                                                                         
                                                                
                                                                              
                           
                                           
                                                                                  
                                                                                 
                                                                              
                                                                              
                                                                        
                           
                                     
                                                                         
                                          
                                                                                       
                                                                                         
                                                               
                                                                           
                                                                                  
                           
                                    
                                                                         
                                                
                                                                                          
                                            
                                                                                            
                                                                  
                                                                              
                                                                                     
                           
                                    
                                                                         
                                                
                                                                                          
                                                                                
                                                                                           
                                                                                          
                                                                
                                                                            
                                                                                   
                           
                                  
                                                                         
                                                
                                                                                          
                                                  
                                                 
                                                                                              
                                          
                                                                                      
                                                                                         
                                                               
                                                                           
                                                                                  
                           
                                     
                                                                         
                                                  
                                                
                                                                                          
                                                                                           
                                           
                                                                                          
                                                                                          
                                                                
                                                                            
                                                                                   
                           
                           
                                                                         
                                                                                  
                                                 
                                                                                 
                                                                          
                                                                              
                                                                                     
       
  }
  part def ResultComposition :> Thread {
    port docking_decision : DataPort { in :>> type : DockingDecisionFrame; }
    port request_disposition : DataPort { in :>> type : RequestDisposition; }
    port docking_access_result : DataPort { out :>> type : DockingAccessResult; }

                        
                
                             
                                      
                                                                          
                                                                           
                                                            
                                                                 
                                                                              
                                                               
                                                               
             
                         
                                      
                                                                                   
                                                                 
                                                                             
                                                                   
                         
                     
                                
                                                                              
                                                                                         
                                                                            
                                                                    
                                                                                
                           
                                          
                                                                                  
                                                                        
                                                                   
                                                                                 
                           
                               
                                                                                                
                                                                                           
                                                                        
                                                                   
                                                                             
                           
                                   
                                                                                            
                                                                           
                                                                 
                                                                            
                           
                                 
                                                                                              
                                                                                           
                                                                                    
                                                                          
                                                                   
                                                                               
                           
                                  
                                                                              
                                                                              
                                                                        
                                                                        
                                                                   
                                                                   
                           
                                    
                                                                              
                                                                          
                                                                        
                                                                   
                                                                             
                           
                                   
                                                                              
                                                                                
                                                                        
                                                                   
                                                                                  
                           
                                   
                                                                              
                                                                              
                                                                           
                                                                 
                                                                            
                           
                                      
                                                                              
                                                                            
                                                                          
                                                                   
                                                                               
                           
                                        
                                                                              
                                                                              
                                                                            
                                                                    
                                                                                
       
  }

  // Authorized behavior-free container: 15 semantic usages and 35 semantic edges.
  part def DockingAccessSupervisorProcess :> Process {
    port access_request : DataPort { in :>> type : AccessRequest; }
    port vessel_status : DataPort { in :>> type : VesselStatus; }
    port station_report : DataPort { in :>> type : StationReport; }
    port service_activity : DataPort { in :>> type : ServiceActivity; }
    port control_event : DataPort { in :>> type : ControlEvent; }
    port docking_access_result : DataPort { out :>> type : DockingAccessResult; }

    part request_classification : RequestClassification;
    part vessel_status_assessment : VesselStatusAssessment;
    part station_report_assessment : StationReportAssessment;
    part service_activity_assessment : ServiceActivityAssessment;
    part request_admission : RequestAdmission;
    part access_coherence : AccessCoherence;
    part docking_lifecycle : DockingLifecycle;
    part berth_commitment : BerthCommitment;
    part service_access_gate : ServiceAccessGate;
    part recovery_supervisor : RecoverySupervisor;
    part docking_action_eligibility : DockingActionEligibility;
    part access_action_eligibility : AccessActionEligibility;
    part undocking_action_eligibility : UndockingActionEligibility;
    part docking_action_arbitration : DockingActionArbitration;
    part result_composition : ResultComposition;

    connection int01 : PortConnection connect access_request to request_classification.access_request;
    connection int02 : PortConnection connect vessel_status to vessel_status_assessment.vessel_status;
    connection int03 : PortConnection connect station_report to station_report_assessment.station_report;
    connection int04 : PortConnection connect service_activity to service_activity_assessment.service_activity;
    connection int05 : PortConnection connect control_event to access_coherence.control_event;
    connection int06 : PortConnection connect result_composition.docking_access_result to docking_access_result;
    connection int07 : PortConnection connect request_classification.request_facts to request_admission.request_facts;
    connection int08 : PortConnection connect vessel_status_assessment.vessel_readiness to request_admission.vessel_readiness;
    connection int09 : PortConnection connect service_activity_assessment.service_readiness to request_admission.service_readiness;
    connection int10 : PortConnection connect vessel_status_assessment.vessel_facts to access_coherence.vessel_facts;
    connection int11 : PortConnection connect station_report_assessment.station_facts to access_coherence.station_facts;
    connection int12 : PortConnection connect service_activity_assessment.service_facts to access_coherence.service_facts;
    connection int13 : PortConnection connect docking_lifecycle.prior_lifecycle_view to access_coherence.prior_lifecycle_view;
    connection int14 : PortConnection connect berth_commitment.prior_berth_state to access_coherence.prior_berth_state;
    connection int15 : PortConnection connect service_access_gate.prior_gate_state to access_coherence.prior_gate_state;
    connection int16 : PortConnection connect recovery_supervisor.prior_recovery_state to access_coherence.prior_recovery_state;
    connection int17 : PortConnection connect access_coherence.recovery_transition to recovery_supervisor.recovery_transition;
    connection int18 : PortConnection connect access_coherence.admission_guard to request_admission.admission_guard;
    connection int19 : PortConnection connect access_coherence.lifecycle_frame to docking_lifecycle.lifecycle_frame;
    connection int20 : PortConnection connect access_coherence.berth_transition_evidence to berth_commitment.berth_transition_evidence;
    connection int21 : PortConnection connect access_coherence.gate_safety_frame to service_access_gate.gate_safety_frame;
    connection int22 : PortConnection connect request_admission.lifecycle_admission to docking_lifecycle.admission_decision;
    connection int23 : PortConnection connect request_admission.gate_admission to service_access_gate.admission_decision;
    connection int24 : PortConnection connect request_admission.docking_admission to docking_action_eligibility.admission_decision;
    connection int25 : PortConnection connect request_admission.access_admission to access_action_eligibility.admission_decision;
    connection int26 : PortConnection connect request_admission.undocking_admission to undocking_action_eligibility.admission_decision;
    connection int27 : PortConnection connect access_coherence.docking_frame to docking_action_eligibility.docking_frame;
    connection int28 : PortConnection connect access_coherence.access_frame to access_action_eligibility.access_frame;
    connection int29 : PortConnection connect access_coherence.undocking_frame to undocking_action_eligibility.undocking_frame;
    connection int30 : PortConnection connect docking_action_eligibility.docking_proposal to docking_action_arbitration.docking_proposal;
    connection int31 : PortConnection connect access_action_eligibility.access_proposal to docking_action_arbitration.access_proposal;
    connection int32 : PortConnection connect undocking_action_eligibility.undocking_proposal to docking_action_arbitration.undocking_proposal;
    connection int33 : PortConnection connect access_coherence.priority_directive to docking_action_arbitration.priority_directive;
    connection int34 : PortConnection connect docking_action_arbitration.docking_decision to result_composition.docking_decision;
    connection int35 : PortConnection connect request_admission.request_disposition to result_composition.request_disposition;
  }

  part def DockingAccessSupervisorSystem :> System {
    port access_request : DataPort { in :>> type : AccessRequest; }
    port vessel_status : DataPort { in :>> type : VesselStatus; }
    port station_report : DataPort { in :>> type : StationReport; }
    port service_activity : DataPort { in :>> type : ServiceActivity; }
    port control_event : DataPort { in :>> type : ControlEvent; }
    port docking_access_result : DataPort { out :>> type : DockingAccessResult; }

    part supervisor_process : DockingAccessSupervisorProcess;

    connection support01 : PortConnection connect access_request to supervisor_process.access_request;
    connection support02 : PortConnection connect vessel_status to supervisor_process.vessel_status;
    connection support03 : PortConnection connect station_report to supervisor_process.station_report;
    connection support04 : PortConnection connect service_activity to supervisor_process.service_activity;
    connection support05 : PortConnection connect control_event to supervisor_process.control_event;
    connection support06 : PortConnection connect supervisor_process.docking_access_result to docking_access_result;
  }

  part docking_access_supervisor : DockingAccessSupervisorSystem;
}
