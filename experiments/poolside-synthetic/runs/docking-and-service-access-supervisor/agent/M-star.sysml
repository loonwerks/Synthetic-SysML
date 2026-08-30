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
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_REQUEST_FACTS_SAFE:
          request_facts.present == F() & request_facts.usable == true & request_facts.operation == NONE & request_facts.correlation == NONE & request_facts.startsAuthorization == F();

      compute
        guarantee REQUEST_NONE:
          (access_request == NONE) implies (request_facts.present == F() & request_facts.usable == true & request_facts.operation == NONE & request_facts.correlation == NONE & request_facts.startsAuthorization == F());
        compute_cases
          case REQUEST_USABLE:
            assume access_request != NONE & access_request != INVALID;
            guarantee request_facts.present == true & request_facts.usable == true & ((access_request == DOCK_A | access_request == DOCK_B) & request_facts.operation == DOCK & request_facts.startsAuthorization == true | (access_request == ACCESS_A | access_request == ACCESS_B) & request_facts.operation == ACCESS & request_facts.startsAuthorization == F() | (access_request == UNDOCK_A | access_request == UNDOCK_B) & request_facts.operation == UNDOCK & request_facts.startsAuthorization == F()) & (access_request == DOCK_A | access_request == ACCESS_A | access_request == UNDOCK_A) implies (request_facts.correlation == A) & (access_request == DOCK_B | access_request == ACCESS_B | access_request == UNDOCK_B) implies (request_facts.correlation == B);
          case REQUEST_INVALID:
            assume access_request == INVALID;
            guarantee request_facts.present == true & request_facts.usable == F() & request_facts.operation == NONE & request_facts.correlation == NONE & request_facts.startsAuthorization == F();
    }*/

                

                
                
                             
                                             
                                                             
                                                            
                                                         
                                                 
             
                     
                           
                            
                                                        
                                                                         
                                                                
                                                             
                                                     
                           
                              
                                                                                                  
                                                                    
                                                         
                                                          
                                                                  
                                                    
                                                           
                                                            
                                                                    
                                                         
                                                           
                                                            
                                                                    
                                                          
                                                         
                                                           
                                                            
                                                             
                                                         
                                                           
                                                            
                                                             
                           
                               
                                                           
                                                                         
                                                                
                                                             
                                                     
       
  }
  part def VesselStatusAssessment :> Thread {
    port vessel_status : DataPort { in :>> type : VesselStatus; }
    port vessel_readiness : DataPort { out :>> type : VesselFacts; }
    port vessel_facts : DataPort { out :>> type : VesselFacts; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_VESSEL_FACTS_SAFE:
          vessel_readiness.usable == F() & vessel_readiness.lifecycleClass == INVALID & vessel_readiness.approachReady == F() & vessel_readiness.docked == F() & vessel_readiness.departed == F() & vessel_readiness.correlation == NONE & vessel_facts.usable == F() & vessel_facts.lifecycleClass == INVALID & vessel_facts.approachReady == F() & vessel_facts.docked == F() & vessel_facts.departed == F() & vessel_facts.correlation == NONE;

      compute
        guarantee VESSEL_FACT_DELIVERY:
          vessel_facts.usable == vessel_readiness.usable & vessel_facts.lifecycleClass == vessel_readiness.lifecycleClass & vessel_facts.approachReady == vessel_readiness.approachReady & vessel_facts.docked == vessel_readiness.docked & vessel_facts.departed == vessel_readiness.departed & vessel_facts.correlation == vessel_readiness.correlation;
        compute_cases
          case VESSEL_INVALID:
            assume vessel_status == INVALID;
            guarantee vessel_readiness.usable == F() & vessel_readiness.lifecycleClass == INVALID & vessel_readiness.approachReady == F() & vessel_readiness.docked == F() & vessel_readiness.departed == F() & vessel_readiness.correlation == NONE;
          case VESSEL_UNTAGGED:
            assume vessel_status == ON_WARP | vessel_status == IN_GRID;
            guarantee vessel_readiness.usable == true & ((vessel_status == ON_WARP & vessel_readiness.lifecycleClass == ON_WARP & vessel_readiness.approachReady == F()) | (vessel_status == IN_GRID & vessel_readiness.lifecycleClass == IN_GRID & vessel_readiness.approachReady == true)) & vessel_readiness.docked == F() & vessel_readiness.departed == F() & vessel_readiness.correlation == NONE;
          case VESSEL_TAGGED:
            assume vessel_status == DOCKED_A | vessel_status == DOCKED_B | vessel_status == DEPARTED_A | vessel_status == DEPARTED_B;
            guarantee vessel_readiness.usable == true & ((vessel_status == DOCKED_A | vessel_status == DOCKED_B) & vessel_readiness.lifecycleClass == DOCKED & vessel_readiness.docked == true & vessel_readiness.departed == F() | (vessel_status == DEPARTED_A | vessel_status == DEPARTED_B) & vessel_readiness.lifecycleClass == DEPARTED & vessel_readiness.docked == F() & vessel_readiness.departed == true) & vessel_readiness.approachReady == F() & ((vessel_status == DOCKED_A | vessel_status == DEPARTED_A) implies (vessel_readiness.correlation == A) & (vessel_status == DOCKED_B | vessel_status == DEPARTED_B) implies (vessel_readiness.correlation == B));
    }*/

                      
                
                             
                                            
                                        
                                                                  
                                                                              
                                          
                                                            
                                                          
                                                                          
                                                                        
                                                          
                                                              
                                                                   
             
                         
                                       
                                                          
                                                                          
                                                                        
                                                          
                                                              
                                                                   
                     
                           
                              
                                                         
                                                    
                                                                      
                                                                                  
                                              
                                                               
                           
                               
                                                                                                 
                                               
                                                         
                                                                        
                                                      
                                                         
                                                                        
                                                  
                                                                             
                                                               
                           
                             
                                                           
                                                      
                                                        
                                                       
                                               
                                                         
                                                          
                                                                       
                                                                           
                                                           
                                                            
                                                                         
                                                                            
                                                   
                                                         
                                                            
                                                                
                                                         
                                                            
                                                                
       
  }
  part def StationReportAssessment :> Thread {
    port station_report : DataPort { in :>> type : StationReport; }
    port station_facts : DataPort { out :>> type : StationFacts; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_STATION_FACTS_SAFE:
          station_facts.present == F() & station_facts.usable == true & station_facts.progress == NONE & station_facts.available == F() & station_facts.denied == F() & station_facts.correlation == NONE;

      compute
        compute_cases
          case STATION_NONE:
            assume station_report == NONE;
            guarantee station_facts.present == F() & station_facts.usable == true & station_facts.progress == NONE & station_facts.available == F() & station_facts.denied == F() & station_facts.correlation == NONE;
          case STATION_AVAILABLE:
            assume station_report == AVAILABLE;
            guarantee station_facts.present == true & station_facts.usable == true & station_facts.progress == AVAILABLE & station_facts.available == true & station_facts.denied == F() & station_facts.correlation == NONE;
          case STATION_PROGRESS:
            assume station_report == CLEAR_A | station_report == CLEAR_B | station_report == SECURED_A | station_report == SECURED_B | station_report == RELEASED_A | station_report == RELEASED_B;
            guarantee station_facts.present == true & station_facts.usable == true & ((station_report == CLEAR_A | station_report == CLEAR_B) & station_facts.progress == CLEAR | (station_report == SECURED_A | station_report == SECURED_B) & station_facts.progress == SECURED | (station_report == RELEASED_A | station_report == RELEASED_B) & station_facts.progress == RELEASED) & ((station_report == CLEAR_A | station_report == SECURED_A | station_report == RELEASED_A) implies (station_facts.correlation == A) & (station_report == CLEAR_B | station_report == SECURED_B | station_report == RELEASED_B) implies (station_facts.correlation == B));
          case STATION_FAULT:
            assume station_report == INVALID | station_report == DENIED;
            guarantee station_facts.present == true & ((station_report == INVALID & station_facts.progress == INVALID & station_facts.denied == F()) | (station_report == DENIED & station_facts.progress == DENIED & station_facts.denied == true)) & station_facts.correlation == NONE;
    }*/

                
                
                             
                                            
                                                             
                                                           
                
                             
                                             
                                                             
                                                          
                                                                    
                                                        
             
                     
                           
                            
                                                        
                                                                         
                                                              
                                                                        
                                                            
                           
                                 
                                                             
                                                                    
                                                                   
                                                                   
                                                            
                           
                                
                                                            
                                                       
                                                         
                                                         
                                                          
                                                         
                                                                    
                                                                        
                                                          
                                                           
                                                                  
                                                            
                                                             
                                                                    
                                                             
                                                              
                                                                      
                                                          
                                                            
                                                              
                                                             
                                                          
                                                            
                                                              
                                                             
                           
                             
                                                            
                                                     
                                                                         
                                            
                                                           
                                                                   
                                            
                                                          
                                                                  
                                        
                                                            
       
  }
  part def ServiceActivityAssessment :> Thread {
    port service_activity : DataPort { in :>> type : ServiceActivity; }
    port service_readiness : DataPort { out :>> type : ServiceFacts; }
    port service_facts : DataPort { out :>> type : ServiceFacts; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_SERVICE_FACTS_SAFE:
          service_readiness.usable == F() & service_readiness.serviceClass == INVALID & service_readiness.quiescent == F() & service_readiness.active == F() & service_readiness.requestPermitted == F() & service_facts.usable == F() & service_facts.serviceClass == INVALID & service_facts.quiescent == F() & service_facts.active == F() & service_facts.requestPermitted == F();

      compute
        guarantee SERVICE_FACT_DELIVERY:
          service_facts.usable == service_readiness.usable & service_facts.serviceClass == service_readiness.serviceClass & service_facts.quiescent == service_readiness.quiescent & service_facts.active == service_readiness.active & service_facts.requestPermitted == service_readiness.requestPermitted;
        compute_cases
          case SERVICE_INVALID:
            assume service_activity == INVALID;
            guarantee service_readiness.usable == F() & service_readiness.serviceClass == INVALID & service_readiness.quiescent == F() & service_readiness.active == F() & service_readiness.requestPermitted == F();
          case SERVICE_QUIESCENT:
            assume service_activity == QUIESCENT;
            guarantee service_readiness.usable == true & service_readiness.serviceClass == QUIESCENT & service_readiness.quiescent == true & service_readiness.active == F() & service_readiness.requestPermitted == true;
          case SERVICE_ACTIVE:
            assume service_activity == ACTIVE;
            guarantee service_readiness.usable == true & service_readiness.serviceClass == ACTIVE & service_readiness.quiescent == F() & service_readiness.active == true & service_readiness.requestPermitted == F();
    }*/

                        
                
                             
                                             
                                         
                                                                  
                                                                            
                                                   
                                                            
                                                                        
                                                                  
                                                            
                                                                               
             
                         
                                        
                                                            
                                                                        
                                                                  
                                                            
                                                                               
                     
                           
                               
                                                               
                                                     
                                                                      
                                                                                
                                                      
                           
                                 
                                                                 
                                                
                                                                        
                                                                           
                                                 
                           
                              
                                                              
                                                
                                                                     
                                                                           
                                                      
       
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
    language "GUMBO" /*{
      state requestLedger: RequestLedger;

      initialize
        modifies requestLedger;
        guarantee INITIAL_REQUEST_LEDGER:
          requestLedger == NO_HISTORY & lifecycle_admission.disposition == NO_REQUEST & lifecycle_admission.operation == NONE & lifecycle_admission.correlation == NONE & lifecycle_admission.accepted == F() & lifecycle_admission.startsAuthorization == F() & gate_admission.disposition == lifecycle_admission.disposition & gate_admission.operation == lifecycle_admission.operation & gate_admission.correlation == lifecycle_admission.correlation & gate_admission.accepted == lifecycle_admission.accepted & gate_admission.startsAuthorization == lifecycle_admission.startsAuthorization & docking_admission.disposition == lifecycle_admission.disposition & docking_admission.operation == lifecycle_admission.operation & docking_admission.correlation == lifecycle_admission.correlation & docking_admission.accepted == lifecycle_admission.accepted & docking_admission.startsAuthorization == lifecycle_admission.startsAuthorization & access_admission.disposition == lifecycle_admission.disposition & access_admission.operation == lifecycle_admission.operation & access_admission.correlation == lifecycle_admission.correlation & access_admission.accepted == lifecycle_admission.accepted & access_admission.startsAuthorization == lifecycle_admission.startsAuthorization & undocking_admission.disposition == lifecycle_admission.disposition & undocking_admission.operation == lifecycle_admission.operation & undocking_admission.correlation == lifecycle_admission.correlation & undocking_admission.accepted == lifecycle_admission.accepted & undocking_admission.startsAuthorization == lifecycle_admission.startsAuthorization & request_disposition == lifecycle_admission.disposition;

      compute
        modifies requestLedger;
        guarantee ADMISSION_DECISION_DELIVERY:
          gate_admission.disposition == lifecycle_admission.disposition & gate_admission.operation == lifecycle_admission.operation & gate_admission.correlation == lifecycle_admission.correlation & gate_admission.accepted == lifecycle_admission.accepted & gate_admission.startsAuthorization == lifecycle_admission.startsAuthorization & docking_admission.disposition == lifecycle_admission.disposition & docking_admission.operation == lifecycle_admission.operation & docking_admission.correlation == lifecycle_admission.correlation & docking_admission.accepted == lifecycle_admission.accepted & docking_admission.startsAuthorization == lifecycle_admission.startsAuthorization & access_admission.disposition == lifecycle_admission.disposition & access_admission.operation == lifecycle_admission.operation & access_admission.correlation == lifecycle_admission.correlation & access_admission.accepted == lifecycle_admission.accepted & access_admission.startsAuthorization == lifecycle_admission.startsAuthorization & undocking_admission.disposition == lifecycle_admission.disposition & undocking_admission.operation == lifecycle_admission.operation & undocking_admission.correlation == lifecycle_admission.correlation & undocking_admission.accepted == lifecycle_admission.accepted & undocking_admission.startsAuthorization == lifecycle_admission.startsAuthorization & request_disposition == lifecycle_admission.disposition;
        compute_cases
          case NO_REQUEST:
            assume request_facts.present == F();
            guarantee lifecycle_admission.disposition == NO_REQUEST & lifecycle_admission.operation == NONE & lifecycle_admission.correlation == NONE & lifecycle_admission.accepted == F() & lifecycle_admission.startsAuthorization == F() & requestLedger == In(requestLedger);
          case INVALID_REQUEST:
            assume request_facts.present == true & request_facts.usable == F();
            guarantee lifecycle_admission.disposition == REJECTED & lifecycle_admission.operation == NONE & lifecycle_admission.correlation == request_facts.correlation & lifecycle_admission.accepted == F() & lifecycle_admission.startsAuthorization == F() & requestLedger == In(requestLedger);
          case FRESH_DOCK_ACCEPTED:
            assume request_facts.usable == true & request_facts.operation == DOCK & admission_guard.open == true & admission_guard.lifecycle == CLEAR_IDLE & admission_guard.berthAvailable == true & vessel_readiness.approachReady == true & ((request_facts.correlation == A & In(requestLedger) != A_LAST) | (request_facts.correlation == B & In(requestLedger) != B_LAST));
            guarantee lifecycle_admission.disposition == ACCEPTED & lifecycle_admission.operation == DOCK & lifecycle_admission.correlation == request_facts.correlation & lifecycle_admission.accepted == true & lifecycle_admission.startsAuthorization == true & ((request_facts.correlation == A & requestLedger == A_LAST) | (request_facts.correlation == B & requestLedger == B_LAST));
          case DUPLICATE_DOCK:
            assume request_facts.usable == true & request_facts.operation == DOCK & admission_guard.open == true & ((request_facts.correlation == A & In(requestLedger) == A_LAST) | (request_facts.correlation == B & In(requestLedger) == B_LAST));
            guarantee lifecycle_admission.disposition == DUPLICATE & lifecycle_admission.operation == NONE & lifecycle_admission.correlation == request_facts.correlation & lifecycle_admission.accepted == F() & lifecycle_admission.startsAuthorization == F() & requestLedger == In(requestLedger);
          case DOCK_NOT_READY:
            assume request_facts.usable == true & request_facts.operation == DOCK & admission_guard.open == true & admission_guard.lifecycle == CLEAR_IDLE & ((request_facts.correlation == A & In(requestLedger) != A_LAST) | (request_facts.correlation == B & In(requestLedger) != B_LAST)) & (vessel_readiness.approachReady == F() | admission_guard.berthAvailable == F());
            guarantee lifecycle_admission.disposition == REJECTED & lifecycle_admission.operation == NONE & lifecycle_admission.correlation == request_facts.correlation & lifecycle_admission.accepted == F() & lifecycle_admission.startsAuthorization == F() & requestLedger == In(requestLedger);
          case DOCK_DEFERRED:
            assume request_facts.usable == true & request_facts.operation == DOCK & (admission_guard.open == F() | (admission_guard.lifecycle != CLEAR_IDLE & ((request_facts.correlation == A & In(requestLedger) != A_LAST) | (request_facts.correlation == B & In(requestLedger) != B_LAST))));
            guarantee lifecycle_admission.disposition == DEFERRED & lifecycle_admission.operation == NONE & lifecycle_admission.correlation == request_facts.correlation & lifecycle_admission.accepted == F() & lifecycle_admission.startsAuthorization == F() & requestLedger == In(requestLedger);
          case ACCESS_PARTITION:
            assume request_facts.usable == true & request_facts.operation == ACCESS;
            guarantee (admission_guard.open == true & ((admission_guard.lifecycle == DOCKED_CLOSED_A & request_facts.correlation == A) | (admission_guard.lifecycle == DOCKED_CLOSED_B & request_facts.correlation == B) | (admission_guard.lifecycle == DOCKED_REBASE & ((request_facts.correlation == A & In(requestLedger) != A_LAST) | (request_facts.correlation == B & In(requestLedger) != B_LAST)))) & service_readiness.quiescent == true & lifecycle_admission.disposition == ACCEPTED & lifecycle_admission.operation == ACCESS & lifecycle_admission.correlation == request_facts.correlation & lifecycle_admission.accepted == true & (lifecycle_admission.startsAuthorization == true & admission_guard.lifecycle == DOCKED_REBASE | lifecycle_admission.startsAuthorization == F() & admission_guard.lifecycle != DOCKED_REBASE) & ((admission_guard.lifecycle == DOCKED_REBASE & request_facts.correlation == A & requestLedger == A_LAST) | (admission_guard.lifecycle == DOCKED_REBASE & request_facts.correlation == B & requestLedger == B_LAST) | (admission_guard.lifecycle != DOCKED_REBASE & requestLedger == In(requestLedger)))) | (admission_guard.open == F() & lifecycle_admission.disposition == DEFERRED & lifecycle_admission.operation == NONE & lifecycle_admission.correlation == request_facts.correlation & lifecycle_admission.accepted == F() & lifecycle_admission.startsAuthorization == F() & requestLedger == In(requestLedger)) | (admission_guard.open == true & ((admission_guard.lifecycle != DOCKED_CLOSED_A & request_facts.correlation != A) | (admission_guard.lifecycle != DOCKED_CLOSED_B & request_facts.correlation != B) | admission_guard.lifecycle != DOCKED_REBASE) & service_readiness.quiescent == F() & (lifecycle_admission.disposition == DEFERRED | lifecycle_admission.disposition == REJECTED) & lifecycle_admission.operation == NONE & lifecycle_admission.correlation == request_facts.correlation & lifecycle_admission.accepted == F() & lifecycle_admission.startsAuthorization == F() & requestLedger == In(requestLedger));
          case UNDOCK_PARTITION:
            assume request_facts.usable == true & request_facts.operation == UNDOCK;
            guarantee (admission_guard.open == true & service_readiness.quiescent == true & ((admission_guard.lifecycle == ACCESS_OPEN_A & request_facts.correlation == A) | (admission_guard.lifecycle == ACCESS_OPEN_B & request_facts.correlation == B)) & lifecycle_admission.disposition == ACCEPTED & lifecycle_admission.operation == UNDOCK & lifecycle_admission.correlation == request_facts.correlation & lifecycle_admission.accepted == true & lifecycle_admission.startsAuthorization == F() & requestLedger == In(requestLedger)) | (admission_guard.open == F() & lifecycle_admission.disposition == DEFERRED & lifecycle_admission.operation == NONE & lifecycle_admission.correlation == request_facts.correlation & lifecycle_admission.accepted == F() & lifecycle_admission.startsAuthorization == F() & requestLedger == In(requestLedger)) | (admission_guard.open == true & service_readiness.active == true & ((admission_guard.lifecycle == ACCESS_OPEN_A & request_facts.correlation == A) | (admission_guard.lifecycle == ACCESS_OPEN_B & request_facts.correlation == B)) & lifecycle_admission.disposition == DEFERRED & lifecycle_admission.operation == NONE & lifecycle_admission.correlation == request_facts.correlation & lifecycle_admission.accepted == F() & lifecycle_admission.startsAuthorization == F() & requestLedger == In(requestLedger)) | (admission_guard.open == true & service_readiness.active == F() & ((admission_guard.lifecycle != ACCESS_OPEN_A & request_facts.correlation != A) | (admission_guard.lifecycle != ACCESS_OPEN_B & request_facts.correlation != B)) & lifecycle_admission.disposition == REJECTED & lifecycle_admission.operation == NONE & lifecycle_admission.correlation == request_facts.correlation & lifecycle_admission.accepted == F() & lifecycle_admission.startsAuthorization == F() & requestLedger == In(requestLedger));
    }*/
                        
           
                               
                                     
                
                               
                             
                                         
                                                     
                                                                            
                                                                  
                                                               
                                             
                                                        
                                                                         
                                                                     
                                                                         
                                                                   
                                                                                         
                                                                            
                                                                        
                                                                            
                                                                      
                                                                                            
                                                                           
                                                                       
                                                                           
                                                                     
                                                                                           
                                                                              
                                                                          
                                                                              
                                                                        
                                                                                              
                                                                 
             
                               
                         
                                              
                                                                         
                                                                     
                                                                         
                                                                   
                                                                                         
                                                                            
                                                                        
                                                                            
                                                                      
                                                                                            
                                                                           
                                                                       
                                                                           
                                                                     
                                                                                           
                                                                              
                                                                          
                                                                              
                                                                        
                                                                                              
                                                                 
                     
                           
                          
                                              
                                                                                        
                                                                      
                                                                   
                                                 
                                                            
                                                 
                           
                               
                                                                     
                                                                                      
                                                                      
                                                                   
                                                 
                                                            
                                                 
                           
                                   
                                         
                                                                
                                    
                                                                      
                                                                               
                                                            
                                                            
                                                            
                                                            
                                                                                      
                                                                      
                                                                            
                                            
                                                       
                                                            
                                                        
                                                            
                                                        
                           
                              
                                         
                                                                                       
                                                            
                                                            
                                                            
                                                            
                                                                                       
                                                                      
                                                                            
                                                 
                                                            
                                                 
                           
                              
                                         
                                                                                       
                                                                      
                                                            
                                                            
                                                            
                                                             
                                                    
                                                    
                                                                                      
                                                                      
                                                                            
                                                 
                                                            
                                                 
                           
                             
                                         
                                                                
                                          
                                                                        
                                                              
                                                              
                                                              
                                                                
                                                                                      
                                                                      
                                                                            
                                                 
                                                            
                                                 
                           
                                
                                         
                                                                 
                     
                                      
                                                                                
                                                                
                                                                                
                                                                 
                                                                             
                                                                
                                                                
                                                                
                                                                   
                                             
                                                                                
                                                                          
                                                                              
                                              
                                                          
                                                                               
                                                                              
                                                                
                                                          
                                                                              
                                                                
                                                          
                                                                             
                                                         
                                           
                                                                                
                                                                        
                                                                              
                                                   
                                                              
                                                     
                                      
                                                                                 
                                                                 
                                                                                 
                                                                 
                                                                               
                                                      
                                                                                
                                                                        
                                                                              
                                                   
                                                              
                                                     
                           
                                
                                         
                                                                 
                     
                                                                    
                                                                             
                                                               
                                                                             
                                                                
                                                                                
                                                                          
                                                                              
                                              
                                                              
                                                     
                                            
                                            
                                                                               
                                                                 
                                                                               
                                                                   
                                                                                
                                                                        
                                                                              
                                                   
                                                              
                                                     
                                                                      
                                                                             
                                                               
                                                                             
                                                                
                                                                                
                                                                        
                                                                              
                                                   
                                                              
                                                      
       
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
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_COHERENCE_SAFE:
          recovery_transition.intent == RETAIN & recovery_transition.fault == F() & recovery_transition.verifiedAnchor == F() & admission_guard.open == F() & admission_guard.lifecycle == CLEAR_IDLE & admission_guard.correlation == NONE & admission_guard.berthAvailable == true & admission_guard.gateClosed == true & admission_guard.recoveryHealthy == true & lifecycle_frame.directive == RETAIN & lifecycle_frame.correlation == NONE & lifecycle_frame.qualified == F() & lifecycle_frame.decisionContext == CLEAR & berth_transition_evidence.eventKind == NO_EVENT & berth_transition_evidence.correlation == NONE & berth_transition_evidence.qualified == F() & gate_safety_frame.directive == RETAIN & gate_safety_frame.safeToOpen == F() & gate_safety_frame.decisionContext == CLEAR & docking_frame.directive == RETAIN & docking_frame.correlation == NONE & docking_frame.qualified == F() & docking_frame.decisionContext == CLEAR & access_frame.directive == RETAIN & access_frame.correlation == NONE & access_frame.qualified == F() & access_frame.decisionContext == CLEAR & undocking_frame.directive == RETAIN & undocking_frame.correlation == NONE & undocking_frame.qualified == F() & undocking_frame.decisionContext == CLEAR & priority_directive.priority == ORDINARY & priority_directive.correlation == NONE & priority_directive.decisionContext == CLEAR;

      compute
        compute_cases
          case COHERENCE_FAULT:
            assume (control_event == EMERGENCY_STOP | vessel_facts.usable == F() | station_facts.usable == F() | service_facts.usable == F() | station_facts.denied == true | (service_facts.active == true & prior_gate_state == CLOSED) | (prior_recovery_state != HEALTHY & ((vessel_facts.correlation != NONE & vessel_facts.correlation != prior_lifecycle_view.correlation) | (station_facts.correlation != NONE & station_facts.correlation != prior_lifecycle_view.correlation))) | (prior_recovery_state != HEALTHY & prior_lifecycle_view.lifecycle == QUARANTINED) | (prior_recovery_state == HEALTHY & prior_lifecycle_view.lifecycle != QUARANTINED & prior_lifecycle_view.lifecycle != DOCKED_REBASE) | (prior_gate_state == OPEN & (prior_berth_state != SECURED | (prior_lifecycle_view.lifecycle != ACCESS_OPEN_A & prior_lifecycle_view.lifecycle != ACCESS_OPEN_B))) | ((prior_lifecycle_view.lifecycle == ACCESS_OPEN_A | prior_lifecycle_view.lifecycle == ACCESS_OPEN_B) & prior_gate_state != OPEN) | (station_facts.progress == CLEAR & prior_lifecycle_view.lifecycle != AWAIT_CLEAR_A & prior_lifecycle_view.lifecycle != AWAIT_CLEAR_B) | (station_facts.progress == SECURED & prior_lifecycle_view.lifecycle != AWAIT_DOCK_A & prior_lifecycle_view.lifecycle != AWAIT_DOCK_B & prior_lifecycle_view.lifecycle != AWAIT_SECURE_A & prior_lifecycle_view.lifecycle != AWAIT_SECURE_B & prior_lifecycle_view.lifecycle != DOCKED_CLOSED_A & prior_lifecycle_view.lifecycle != DOCKED_CLOSED_B & prior_lifecycle_view.lifecycle != ACCESS_OPEN_A & prior_lifecycle_view.lifecycle != ACCESS_OPEN_B) | (station_facts.progress == RELEASED & prior_lifecycle_view.lifecycle != AWAIT_RELEASE_A & prior_lifecycle_view.lifecycle != AWAIT_RELEASE_B & prior_lifecycle_view.lifecycle != AWAIT_DEPART_A & prior_lifecycle_view.lifecycle != AWAIT_DEPART_B) | (vessel_facts.departed == true & prior_lifecycle_view.lifecycle != AWAIT_DEPART_A & prior_lifecycle_view.lifecycle != AWAIT_DEPART_B) | (vessel_facts.docked == true & prior_lifecycle_view.lifecycle != AWAIT_DOCK_A & prior_lifecycle_view.lifecycle != AWAIT_DOCK_B & prior_lifecycle_view.lifecycle != AWAIT_SECURE_A & prior_lifecycle_view.lifecycle != AWAIT_SECURE_B & prior_lifecycle_view.lifecycle != DOCKED_CLOSED_A & prior_lifecycle_view.lifecycle != DOCKED_CLOSED_B & prior_lifecycle_view.lifecycle != ACCESS_OPEN_A & prior_lifecycle_view.lifecycle != ACCESS_OPEN_B & prior_lifecycle_view.lifecycle != AWAIT_RELEASE_A & prior_lifecycle_view.lifecycle != AWAIT_RELEASE_B & prior_lifecycle_view.lifecycle != AWAIT_DEPART_A & prior_lifecycle_view.lifecycle != AWAIT_DEPART_B & prior_lifecycle_view.lifecycle != DOCKED_REBASE) | (vessel_facts.docked == true & station_facts.progress == CLEAR));
            guarantee recovery_transition.intent == LATCH & recovery_transition.fault == true & recovery_transition.verifiedAnchor == F() & admission_guard.open == F() & admission_guard.lifecycle == prior_lifecycle_view.lifecycle & admission_guard.correlation == NONE & admission_guard.berthAvailable == F() & admission_guard.gateClosed == true & admission_guard.recoveryHealthy == F() & lifecycle_frame.directive == QUARANTINE & lifecycle_frame.correlation == NONE & lifecycle_frame.qualified == true & lifecycle_frame.decisionContext == QUARANTINED & berth_transition_evidence.eventKind == DOMINANT_FAULT & berth_transition_evidence.correlation == NONE & berth_transition_evidence.qualified == true & gate_safety_frame.directive == FORCE_CLOSE & gate_safety_frame.safeToOpen == F() & gate_safety_frame.decisionContext == QUARANTINED & docking_frame.directive == QUARANTINE & docking_frame.correlation == NONE & docking_frame.qualified == F() & docking_frame.decisionContext == QUARANTINED & access_frame.directive == QUARANTINE & access_frame.correlation == NONE & access_frame.qualified == F() & access_frame.decisionContext == QUARANTINED & undocking_frame.directive == QUARANTINE & undocking_frame.correlation == NONE & undocking_frame.qualified == F() & undocking_frame.decisionContext == QUARANTINED & priority_directive.priority == REVOKE & priority_directive.correlation == NONE & priority_directive.decisionContext == QUARANTINED;
          case RECOVERY_RESET:
            assume control_event != EMERGENCY_STOP & vessel_facts.usable == true & station_facts.usable == true & service_facts.usable == true & station_facts.denied == F() & prior_recovery_state == LATCHED & control_event == RESET;
            guarantee recovery_transition.intent == RECONCILE & recovery_transition.fault == F() & recovery_transition.verifiedAnchor == F() & admission_guard.open == F() & admission_guard.lifecycle == prior_lifecycle_view.lifecycle & admission_guard.correlation == NONE & admission_guard.berthAvailable == F() & admission_guard.gateClosed == true & admission_guard.recoveryHealthy == F() & lifecycle_frame.directive == RETAIN & lifecycle_frame.correlation == NONE & lifecycle_frame.qualified == F() & lifecycle_frame.decisionContext == QUARANTINED & berth_transition_evidence.eventKind == NO_EVENT & berth_transition_evidence.correlation == NONE & berth_transition_evidence.qualified == F() & gate_safety_frame.directive == FORCE_CLOSE & gate_safety_frame.safeToOpen == F() & gate_safety_frame.decisionContext == QUARANTINED & docking_frame.directive == RETAIN & docking_frame.correlation == NONE & docking_frame.qualified == F() & docking_frame.decisionContext == QUARANTINED & access_frame.directive == RETAIN & access_frame.correlation == NONE & access_frame.qualified == F() & access_frame.decisionContext == QUARANTINED & undocking_frame.directive == RETAIN & undocking_frame.correlation == NONE & undocking_frame.qualified == F() & undocking_frame.decisionContext == QUARANTINED & priority_directive.priority == REVOKE & priority_directive.correlation == NONE & priority_directive.decisionContext == QUARANTINED;
          case RECOVERY_CLEAR_ANCHOR:
            assume prior_recovery_state == RECONCILING & control_event == VERIFY_CLEAR & vessel_facts.lifecycleClass == IN_GRID & station_facts.progress == AVAILABLE & service_facts.quiescent == true;
            guarantee recovery_transition.intent == OPEN_CLEAR & recovery_transition.fault == F() & recovery_transition.verifiedAnchor == true & admission_guard.open == F() & admission_guard.lifecycle == prior_lifecycle_view.lifecycle & admission_guard.correlation == NONE & admission_guard.berthAvailable == F() & admission_guard.gateClosed == true & admission_guard.recoveryHealthy == F() & lifecycle_frame.directive == ANCHOR_CLEAR & lifecycle_frame.correlation == NONE & lifecycle_frame.qualified == true & lifecycle_frame.decisionContext == QUARANTINED & berth_transition_evidence.eventKind == VERIFIED_CLEAR_ANCHOR & berth_transition_evidence.correlation == NONE & berth_transition_evidence.qualified == true & gate_safety_frame.directive == FORCE_CLOSE & gate_safety_frame.safeToOpen == F() & gate_safety_frame.decisionContext == QUARANTINED & docking_frame.directive == RETAIN & docking_frame.correlation == NONE & docking_frame.qualified == F() & docking_frame.decisionContext == QUARANTINED & access_frame.directive == RETAIN & access_frame.correlation == NONE & access_frame.qualified == F() & access_frame.decisionContext == QUARANTINED & undocking_frame.directive == RETAIN & undocking_frame.correlation == NONE & undocking_frame.qualified == F() & undocking_frame.decisionContext == QUARANTINED & priority_directive.priority == REVOKE & priority_directive.correlation == NONE & priority_directive.decisionContext == QUARANTINED;
          case RECOVERY_DOCKED_ANCHOR:
            assume prior_recovery_state == RECONCILING & control_event == VERIFY_DOCKED & vessel_facts.docked == true & station_facts.progress == SECURED & vessel_facts.correlation == station_facts.correlation & vessel_facts.correlation != NONE & service_facts.quiescent == true;
            guarantee recovery_transition.intent == OPEN_DOCKED & recovery_transition.fault == F() & recovery_transition.verifiedAnchor == true & admission_guard.open == F() & admission_guard.lifecycle == prior_lifecycle_view.lifecycle & admission_guard.correlation == NONE & admission_guard.berthAvailable == F() & admission_guard.gateClosed == true & admission_guard.recoveryHealthy == F() & lifecycle_frame.directive == ANCHOR_DOCKED & lifecycle_frame.correlation == NONE & lifecycle_frame.qualified == true & lifecycle_frame.decisionContext == QUARANTINED & berth_transition_evidence.eventKind == VERIFIED_DOCKED_ANCHOR & berth_transition_evidence.correlation == NONE & berth_transition_evidence.qualified == true & gate_safety_frame.directive == FORCE_CLOSE & gate_safety_frame.safeToOpen == F() & gate_safety_frame.decisionContext == QUARANTINED & docking_frame.directive == RETAIN & docking_frame.correlation == NONE & docking_frame.qualified == F() & docking_frame.decisionContext == QUARANTINED & access_frame.directive == RETAIN & access_frame.correlation == NONE & access_frame.qualified == F() & access_frame.decisionContext == QUARANTINED & undocking_frame.directive == RETAIN & undocking_frame.correlation == NONE & undocking_frame.qualified == F() & undocking_frame.decisionContext == QUARANTINED & priority_directive.priority == REVOKE & priority_directive.correlation == NONE & priority_directive.decisionContext == QUARANTINED;
          case RECOVERY_INHIBITED:
            assume (prior_recovery_state != HEALTHY | control_event != NONE) & (prior_recovery_state != LATCHED | control_event != RESET) & (prior_recovery_state != RECONCILING | control_event != VERIFY_CLEAR | vessel_facts.lifecycleClass != IN_GRID | station_facts.progress != AVAILABLE | service_facts.quiescent == F()) & (prior_recovery_state != RECONCILING | control_event != VERIFY_DOCKED | vessel_facts.docked == F() | station_facts.progress != SECURED | vessel_facts.correlation != station_facts.correlation | vessel_facts.correlation == NONE | service_facts.quiescent == F()) & control_event != EMERGENCY_STOP & vessel_facts.usable == true & station_facts.usable == true & service_facts.usable == true & station_facts.denied == F();
            guarantee recovery_transition.intent == RETAIN & recovery_transition.fault == F() & recovery_transition.verifiedAnchor == F() & admission_guard.open == F() & admission_guard.lifecycle == prior_lifecycle_view.lifecycle & admission_guard.correlation == NONE & admission_guard.berthAvailable == F() & admission_guard.gateClosed == true & admission_guard.recoveryHealthy == F() & lifecycle_frame.directive == RETAIN & lifecycle_frame.correlation == NONE & lifecycle_frame.qualified == F() & lifecycle_frame.decisionContext == QUARANTINED & berth_transition_evidence.eventKind == NO_EVENT & berth_transition_evidence.correlation == NONE & berth_transition_evidence.qualified == F() & gate_safety_frame.directive == FORCE_CLOSE & gate_safety_frame.safeToOpen == F() & gate_safety_frame.decisionContext == QUARANTINED & docking_frame.directive == RETAIN & docking_frame.correlation == NONE & docking_frame.qualified == F() & docking_frame.decisionContext == QUARANTINED & access_frame.directive == RETAIN & access_frame.correlation == NONE & access_frame.qualified == F() & access_frame.decisionContext == QUARANTINED & undocking_frame.directive == RETAIN & undocking_frame.correlation == NONE & undocking_frame.qualified == F() & undocking_frame.decisionContext == QUARANTINED & priority_directive.priority == REVOKE & priority_directive.correlation == NONE & priority_directive.decisionContext == QUARANTINED;
          case ORDINARY_COHERENCE:
            assume prior_recovery_state == HEALTHY & control_event == NONE & vessel_facts.usable == true & station_facts.usable == true & service_facts.usable == true & station_facts.denied == F() & (service_facts.active == F() | prior_gate_state == OPEN) & (vessel_facts.correlation == NONE | vessel_facts.correlation == prior_lifecycle_view.correlation) & (station_facts.correlation == NONE | station_facts.correlation == prior_lifecycle_view.correlation) & prior_lifecycle_view.lifecycle != QUARANTINED & (prior_gate_state != OPEN | (prior_berth_state == SECURED & (prior_lifecycle_view.lifecycle == ACCESS_OPEN_A | prior_lifecycle_view.lifecycle == ACCESS_OPEN_B))) & ((prior_lifecycle_view.lifecycle != ACCESS_OPEN_A | prior_gate_state == OPEN) & (prior_lifecycle_view.lifecycle != ACCESS_OPEN_B | prior_gate_state == OPEN)) & (station_facts.progress != CLEAR | (prior_lifecycle_view.lifecycle == AWAIT_CLEAR_A | prior_lifecycle_view.lifecycle == AWAIT_CLEAR_B)) & (station_facts.progress != SECURED | (prior_lifecycle_view.lifecycle == AWAIT_DOCK_A | prior_lifecycle_view.lifecycle == AWAIT_DOCK_B | prior_lifecycle_view.lifecycle == AWAIT_SECURE_A | prior_lifecycle_view.lifecycle == AWAIT_SECURE_B | prior_lifecycle_view.lifecycle == DOCKED_CLOSED_A | prior_lifecycle_view.lifecycle == DOCKED_CLOSED_B | prior_lifecycle_view.lifecycle == ACCESS_OPEN_A | prior_lifecycle_view.lifecycle == ACCESS_OPEN_B)) & (station_facts.progress != RELEASED | (prior_lifecycle_view.lifecycle == AWAIT_RELEASE_A | prior_lifecycle_view.lifecycle == AWAIT_RELEASE_B | prior_lifecycle_view.lifecycle == AWAIT_DEPART_A | prior_lifecycle_view.lifecycle == AWAIT_DEPART_B)) & (vessel_facts.departed == F() | (prior_lifecycle_view.lifecycle == AWAIT_DEPART_A | prior_lifecycle_view.lifecycle == AWAIT_DEPART_B)) & (vessel_facts.docked == F() | (prior_lifecycle_view.lifecycle == AWAIT_DOCK_A | prior_lifecycle_view.lifecycle == AWAIT_DOCK_B | prior_lifecycle_view.lifecycle == AWAIT_SECURE_A | prior_lifecycle_view.lifecycle == AWAIT_SECURE_B | prior_lifecycle_view.lifecycle == DOCKED_CLOSED_A | prior_lifecycle_view.lifecycle == DOCKED_CLOSED_B | prior_lifecycle_view.lifecycle == ACCESS_OPEN_A | prior_lifecycle_view.lifecycle == ACCESS_OPEN_B | prior_lifecycle_view.lifecycle == AWAIT_RELEASE_A | prior_lifecycle_view.lifecycle == AWAIT_RELEASE_B | prior_lifecycle_view.lifecycle == AWAIT_DEPART_A | prior_lifecycle_view.lifecycle == AWAIT_DEPART_B | prior_lifecycle_view.lifecycle == DOCKED_REBASE)) & (vessel_facts.docked == F() | station_facts.progress != CLEAR);
            guarantee recovery_transition.intent == RETAIN & recovery_transition.fault == F() & recovery_transition.verifiedAnchor == F() & admission_guard.open == true & admission_guard.lifecycle == prior_lifecycle_view.lifecycle & admission_guard.correlation == prior_lifecycle_view.correlation & (admission_guard.berthAvailable == true) == (prior_berth_state == AVAILABLE) & (admission_guard.gateClosed == true) == (prior_gate_state == CLOSED) & admission_guard.recoveryHealthy == true & ((station_facts.progress == CLEAR & lifecycle_frame.directive == CLEARANCE & lifecycle_frame.correlation == station_facts.correlation & lifecycle_frame.qualified == true) | (vessel_facts.docked == true & (prior_berth_state == SECURED & lifecycle_frame.directive == SECURED | prior_berth_state != SECURED & lifecycle_frame.directive == DOCKED) & lifecycle_frame.correlation == vessel_facts.correlation & lifecycle_frame.qualified == true) | (station_facts.progress == SECURED & vessel_facts.docked == F() & lifecycle_frame.directive == SECURED & lifecycle_frame.correlation == station_facts.correlation & lifecycle_frame.qualified == true) | (station_facts.progress == SECURED & vessel_facts.docked == true & lifecycle_frame.directive == SECURED & lifecycle_frame.correlation == station_facts.correlation & lifecycle_frame.qualified == true) | (station_facts.progress == RELEASED & vessel_facts.docked == F() & lifecycle_frame.directive == RELEASED & lifecycle_frame.correlation == station_facts.correlation & lifecycle_frame.qualified == true) | (vessel_facts.departed == true & lifecycle_frame.directive == DEPARTED & lifecycle_frame.correlation == vessel_facts.correlation & lifecycle_frame.qualified == true) | (station_facts.progress != CLEAR & vessel_facts.docked == F() & station_facts.progress != SECURED & station_facts.progress != RELEASED & vessel_facts.departed == F() & lifecycle_frame.directive == RETAIN & lifecycle_frame.correlation == prior_lifecycle_view.correlation & lifecycle_frame.qualified == F())) & ((prior_lifecycle_view.lifecycle == CLEAR_IDLE & lifecycle_frame.decisionContext == CLEAR) | ((prior_lifecycle_view.lifecycle == AWAIT_CLEAR_A | prior_lifecycle_view.lifecycle == AWAIT_CLEAR_B | prior_lifecycle_view.lifecycle == AWAIT_DOCK_A | prior_lifecycle_view.lifecycle == AWAIT_DOCK_B | prior_lifecycle_view.lifecycle == AWAIT_SECURE_A | prior_lifecycle_view.lifecycle == AWAIT_SECURE_B) & lifecycle_frame.decisionContext == DOCKING) | ((prior_lifecycle_view.lifecycle == DOCKED_CLOSED_A | prior_lifecycle_view.lifecycle == DOCKED_CLOSED_B | prior_lifecycle_view.lifecycle == DOCKED_REBASE) & lifecycle_frame.decisionContext == DOCKED_CLOSED) | ((prior_lifecycle_view.lifecycle == ACCESS_OPEN_A | prior_lifecycle_view.lifecycle == ACCESS_OPEN_B) & lifecycle_frame.decisionContext == ACCESS_OPEN) | ((prior_lifecycle_view.lifecycle == AWAIT_RELEASE_A | prior_lifecycle_view.lifecycle == AWAIT_RELEASE_B | prior_lifecycle_view.lifecycle == AWAIT_DEPART_A | prior_lifecycle_view.lifecycle == AWAIT_DEPART_B) & lifecycle_frame.decisionContext == UNDOCKING) | (prior_lifecycle_view.lifecycle == QUARANTINED & lifecycle_frame.decisionContext == QUARANTINED)) & ((station_facts.progress == CLEAR & berth_transition_evidence.eventKind == STATION_CLEARANCE & berth_transition_evidence.correlation == station_facts.correlation & berth_transition_evidence.qualified == true) | (station_facts.progress == SECURED & berth_transition_evidence.eventKind == STATION_SECURED & berth_transition_evidence.correlation == station_facts.correlation & berth_transition_evidence.qualified == true) | (station_facts.progress == RELEASED & berth_transition_evidence.eventKind == STATION_RELEASED & berth_transition_evidence.correlation == station_facts.correlation & berth_transition_evidence.qualified == true) | (vessel_facts.departed == true & berth_transition_evidence.eventKind == DEPARTURE_COMPLETION & berth_transition_evidence.correlation == vessel_facts.correlation & berth_transition_evidence.qualified == true) | (station_facts.progress == AVAILABLE & berth_transition_evidence.eventKind == STATION_AVAILABLE & berth_transition_evidence.correlation == NONE & berth_transition_evidence.qualified == true) | (station_facts.progress != CLEAR & station_facts.progress != SECURED & station_facts.progress != RELEASED & vessel_facts.departed == F() & berth_transition_evidence.eventKind == NO_EVENT & berth_transition_evidence.correlation == NONE & berth_transition_evidence.qualified == F())) & gate_safety_frame.directive == RETAIN & (gate_safety_frame.safeToOpen == true) == ((prior_lifecycle_view.lifecycle == DOCKED_CLOSED_A | prior_lifecycle_view.lifecycle == DOCKED_CLOSED_B | prior_lifecycle_view.lifecycle == DOCKED_REBASE) & prior_berth_state == SECURED & service_facts.quiescent == true) & ((prior_gate_state == OPEN & gate_safety_frame.decisionContext == ACCESS_OPEN) | (prior_gate_state == CLOSED & gate_safety_frame.decisionContext == DOCKED_CLOSED)) & docking_frame.directive == lifecycle_frame.directive & docking_frame.correlation == lifecycle_frame.correlation & docking_frame.qualified == lifecycle_frame.qualified & docking_frame.decisionContext == lifecycle_frame.decisionContext & access_frame.directive == lifecycle_frame.directive & access_frame.correlation == lifecycle_frame.correlation & (access_frame.qualified == true) == ((prior_lifecycle_view.lifecycle == DOCKED_CLOSED_A | prior_lifecycle_view.lifecycle == DOCKED_CLOSED_B | prior_lifecycle_view.lifecycle == DOCKED_REBASE) & prior_berth_state == SECURED & service_facts.quiescent == true) & ((prior_gate_state == OPEN & access_frame.decisionContext == ACCESS_OPEN) | (prior_gate_state == CLOSED & access_frame.decisionContext == DOCKED_CLOSED)) & undocking_frame.directive == lifecycle_frame.directive & undocking_frame.correlation == lifecycle_frame.correlation & (undocking_frame.qualified == true) == ((prior_lifecycle_view.lifecycle == AWAIT_RELEASE_A | prior_lifecycle_view.lifecycle == AWAIT_RELEASE_B) & prior_gate_state == CLOSED | lifecycle_frame.directive == RELEASED) & undocking_frame.decisionContext == UNDOCKING & ((vessel_facts.departed == true & priority_directive.priority == DEPARTURE_COMPLETE & priority_directive.correlation == vessel_facts.correlation) | (vessel_facts.departed == F() & priority_directive.priority == ORDINARY & priority_directive.correlation == prior_lifecycle_view.correlation)) & priority_directive.decisionContext == lifecycle_frame.decisionContext;
    }*/
                        
                
                             
                                         
                                                               
                                          
                                                   
                                     
                                                                  
                                                           
                                          
                                      
                                           
                                                                  
                                                           
                                          
                                                                    
                                                                             
                                                                     
                                                    
                                                               
                                             
                                                                      
                                                                
                                                         
                                        
                                                                  
                                                               
                                                        
                                       
                                                                 
                                                                  
                                                           
                                          
                                                                    
                                                                
                                                              
                                                                      
             
                     
                           
                               
                                                                 
                                                                    
                                                                
                                                                             
                                                              
                                                               
                                                                                
                                                                
                                                                                   
                                                              
                                                                              
                                                              
                                                                             
                                                                                
                                                   
                                                         
                                                                                 
                                                                                    
                                                                                  
                                                                                   
                                                    
                                                                
                                                                               
                                                                                
                                                                  
                                                                              
                                                                              
                                                                                
                                                                                
                                                                                 
                                                                                 
                                                                               
                                                                                
                                                                   
                                                                                 
                                                                                 
                                                                                
                                                                                 
                                      
                                                                                
                                                                                 
                                    
                                                                              
                                                                              
                                                                                
                                                                                
                                                                                 
                                                                                 
                                                                               
                                                                               
                                                                                 
                                                                                 
                                                                                
                                                                                
                                                                                
                                                                                      
                                                                          
                                         
                                                       
                                         
                                                                           
                                                               
                                                   
                                          
                                                    
                                                                          
                                                               
                                         
                                                                              
                                                                                       
                                                                         
                                                   
                                                                        
                                                 
                                                                                
                                                                        
                                                             
                                            
                                                                            
                                                                       
                                                            
                                           
                                                                           
                                                                          
                                                               
                                              
                                                                              
                                                                  
                                                                  
                                                                                
                           
                              
                                                                 
                                                                                 
                                         
                                                             
                                                  
                                                                              
                                              
                                                       
                                         
                                                                           
                                                               
                                                   
                                          
                                                    
                                                                      
                                                               
                                              
                                                                              
                                                                                 
                                                                         
                                                        
                                                                        
                                                 
                                                                                
                                                                    
                                                             
                                            
                                                                            
                                                                   
                                                            
                                           
                                                                           
                                                                      
                                                               
                                              
                                                                              
                                                                  
                                                                  
                                                                                
                           
                                     
                                                                      
                                                          
                                                                  
                                                                   
                                      
                                                                               
                                                                                   
                                         
                                                                           
                                                               
                                                   
                                          
                                                    
                                                                            
                                                               
                                         
                                                                              
                                                                                              
                                                                         
                                                   
                                                                        
                                                 
                                                                                
                                                                    
                                                             
                                            
                                                                            
                                                                   
                                                            
                                           
                                                                           
                                                                      
                                                               
                                              
                                                                              
                                                                  
                                                                  
                                                                                
                           
                                      
                                                                      
                                                           
                                                                                       
                                                                     
                                                            
                                      
                                                                                
                                                                                   
                                         
                                                                           
                                                               
                                                   
                                          
                                                    
                                                                             
                                                               
                                         
                                                                              
                                                                                               
                                                                         
                                                   
                                                                        
                                                 
                                                                                
                                                                    
                                                             
                                            
                                                                            
                                                                   
                                                            
                                           
                                                                           
                                                                      
                                                               
                                              
                                                                              
                                                                  
                                                                  
                                                                                
                           
                                  
                                                                   
                                                   
                                                              
                                                     
                                                                  
                                                           
                                                                   
                                                                    
                                              
                                                                  
                                                            
                                         
                                                                  
                                                                      
                                                             
                                              
                                                            
                                                                                 
                                        
                                                                           
                                              
                                                       
                                         
                                                                           
                                                               
                                                   
                                          
                                                    
                                                                      
                                                               
                                              
                                                                              
                                                                                 
                                                                         
                                                        
                                                                        
                                                 
                                                                                
                                                                    
                                                             
                                            
                                                                            
                                                                   
                                                            
                                           
                                                                           
                                                                      
                                                               
                                              
                                                                              
                                                                  
                                                                  
                                                                                
                           
                                  
                                                                  
                                                  
                                                                                 
                                         
                                                                                
                                                             
                                                                              
                                                              
                                                                               
                                                                            
                                                   
                                                         
                                                                                   
                                                                                      
                                                                               
                                                    
                                                                               
                                                    
                                                                
                                                                               
                                                                                
                                                                  
                                                                              
                                                                              
                                                                                
                                                                                
                                                                                 
                                                                                 
                                                                               
                                                                                
                                                                   
                                                                                 
                                                                                 
                                                                                
                                                                                 
                                           
                                                                                
                                                                                 
                                         
                                                                              
                                                                              
                                                                                
                                                                                
                                                                                 
                                                                                 
                                                                               
                                                                               
                                                                                 
                                                                                 
                                                                                
                                                                                
                                                                                
                                                                                           
                                                                           
                                              
                                                       
                                    
                                                                           
                                                                               
                                               
                                                             
                                                                                    
                                               
                                                                   
                                                                           
                                                                          
                                            
                                     
                                                             
                                                                            
                                                             
                                                                            
                                                                         
                                            
                                                                   
                                          
                                                                                      
                                                                                       
                                                                           
                                              
                                                                                    
                                                                                     
                                                                          
                                                    
                                                                          
                                                                             
                                                                    
                                          
                                                                          
                                                                          
                                            
                                       
                                                                          
                                                                         
                                            
                                                                 
                                          
                                                                   
                                                                    
                                            
                                                                        
                                                                                 
                                                  
                                                                               
                                                                           
                                                                                   
                                                                                   
                                                                                  
                                                                                  
                                                                                    
                                                                                     
                                                                             
                                                                                     
                                                                                     
                                                                                    
                                                                                   
                                                                                   
                                                                                    
                                                                                 
                                                                                     
                                                                                     
                                                                                    
                                                                                     
                                                                               
                                                                              
                                                                                  
                                                                   
                                                                                            
                                                                                    
                                                      
                                                                   
                                                                                          
                                                                                    
                                                      
                                                                    
                                                                                           
                                                                                    
                                                      
                                       
                                                                                               
                                                                                   
                                                      
                                                                     
                                                                                            
                                                                           
                                                      
                                                                 
                                                                   
                                                                    
                                                                     
                                            
                                                                                   
                                                                           
                                                            
                                                                   
                                             
                                                                                      
                                                                                      
                                                                                     
                                                          
                                           
                                                      
                                                                                   
                                                      
                                                                                      
                                                                    
                                                                        
                                                                    
                                                                                
                                                                   
                                                                       
                                       
                                                                                      
                                                                                      
                                                                                     
                                                          
                                           
                                                      
                                                                              
                                                      
                                                                                 
                                                                      
                                                                          
                                          
                                                                                       
                                                                                        
                                                         
                                                                            
                                                                            
                                       
                                                                                
                                                                             
                                            
                                                                      
                                                                                      
                                                                                    
       
  }
  part def DockingLifecycle :> Thread {
    port lifecycle_frame : DataPort { in :>> type : CoordinationFrame; }
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    port prior_lifecycle_view : DataPort { out :>> type : PriorLifecycleView; }
    language "GUMBO" /*{
      state lifecycleState: LifecycleState;

      initialize
        modifies lifecycleState;
        guarantee INITIAL_LIFECYCLE_SAFE:
          lifecycleState == CLEAR_IDLE & prior_lifecycle_view.lifecycle == CLEAR_IDLE & prior_lifecycle_view.correlation == NONE;

      compute
        modifies lifecycleState;
        guarantee PRIOR_LIFECYCLE_PUBLICATION:
          prior_lifecycle_view.lifecycle == In(lifecycleState) & ((In(lifecycleState) == AWAIT_CLEAR_A | In(lifecycleState) == AWAIT_DOCK_A | In(lifecycleState) == AWAIT_SECURE_A | In(lifecycleState) == DOCKED_CLOSED_A | In(lifecycleState) == ACCESS_OPEN_A | In(lifecycleState) == AWAIT_RELEASE_A | In(lifecycleState) == AWAIT_DEPART_A) implies (prior_lifecycle_view.correlation == A) | (In(lifecycleState) == AWAIT_CLEAR_B | In(lifecycleState) == AWAIT_DOCK_B | In(lifecycleState) == AWAIT_SECURE_B | In(lifecycleState) == DOCKED_CLOSED_B | In(lifecycleState) == ACCESS_OPEN_B | In(lifecycleState) == AWAIT_RELEASE_B | In(lifecycleState) == AWAIT_DEPART_B) implies (prior_lifecycle_view.correlation == B) | (In(lifecycleState) == CLEAR_IDLE | In(lifecycleState) == DOCKED_REBASE | In(lifecycleState) == QUARANTINED) implies (prior_lifecycle_view.correlation == NONE));
        guarantee LIFECYCLE_TRANSITION_PARTITION:
          (lifecycle_frame.directive == QUARANTINE) implies (lifecycleState == QUARANTINED) &
          (lifecycle_frame.directive == ANCHOR_CLEAR) implies (lifecycleState == CLEAR_IDLE) &
          (lifecycle_frame.directive == ANCHOR_DOCKED) implies (lifecycleState == DOCKED_REBASE) &
          ((lifecycle_frame.directive != QUARANTINE & lifecycle_frame.directive != ANCHOR_CLEAR & lifecycle_frame.directive != ANCHOR_DOCKED & admission_decision.accepted == true & admission_decision.operation == DOCK & admission_decision.correlation == A) implies (lifecycleState == AWAIT_CLEAR_A)) &
          ((lifecycle_frame.directive != QUARANTINE & lifecycle_frame.directive != ANCHOR_CLEAR & lifecycle_frame.directive != ANCHOR_DOCKED & admission_decision.accepted == true & admission_decision.operation == DOCK & admission_decision.correlation == B) implies (lifecycleState == AWAIT_CLEAR_B)) &
          ((admission_decision.accepted == true & admission_decision.operation == ACCESS & admission_decision.correlation == A) implies (lifecycleState == ACCESS_OPEN_A)) &
          ((admission_decision.accepted == true & admission_decision.operation == ACCESS & admission_decision.correlation == B) implies (lifecycleState == ACCESS_OPEN_B)) &
          ((admission_decision.accepted == true & admission_decision.operation == UNDOCK & admission_decision.correlation == A) implies (lifecycleState == AWAIT_RELEASE_A)) &
          ((admission_decision.accepted == true & admission_decision.operation == UNDOCK & admission_decision.correlation == B) implies (lifecycleState == AWAIT_RELEASE_B)) &
          ((admission_decision.accepted == F() & lifecycle_frame.directive == CLEARANCE & lifecycle_frame.correlation == A) implies (lifecycleState == AWAIT_DOCK_A)) &
          ((admission_decision.accepted == F() & lifecycle_frame.directive == CLEARANCE & lifecycle_frame.correlation == B) implies (lifecycleState == AWAIT_DOCK_B)) &
          ((admission_decision.accepted == F() & (lifecycle_frame.directive == DOCKED & lifecycle_frame.correlation == A & In(lifecycleState) == AWAIT_DOCK_A) | (lifecycle_frame.directive == SECURED & (In(lifecycleState) == AWAIT_DOCK_A | In(lifecycleState) == AWAIT_SECURE_A))) implies (lifecycleState == AWAIT_SECURE_A)) &
          ((admission_decision.accepted == F() & (lifecycle_frame.directive == DOCKED & lifecycle_frame.correlation == B & In(lifecycleState) == AWAIT_DOCK_B) | (lifecycle_frame.directive == SECURED & (In(lifecycleState) == AWAIT_DOCK_B | In(lifecycleState) == AWAIT_SECURE_B))) implies (lifecycleState == AWAIT_SECURE_B)) &
          ((admission_decision.accepted == F() & lifecycle_frame.directive == RELEASED & lifecycle_frame.correlation == A) implies (lifecycleState == AWAIT_DEPART_A)) &
          ((admission_decision.accepted == F() & lifecycle_frame.directive == RELEASED & lifecycle_frame.correlation == B) implies (lifecycleState == AWAIT_DEPART_B)) &
          ((lifecycle_frame.directive == DEPARTED) implies (lifecycleState == CLEAR_IDLE)) &
          ((lifecycle_frame.directive == RETAIN & admission_decision.accepted == F()) implies (lifecycleState == In(lifecycleState)));
    }*/
                        
           
                               
                                       
                
                                
                             
                                         
                                                       
                                                                       
                                                               
             
                                
                        
                                              
                                                                
                                                                   
                                                                  
                                                                    
                                                                     
                                                                   
                                                                     
                                                                     
                                                                
                                                                   
                                                                  
                                                                    
                                                                     
                                                                   
                                                                     
                                                                     
                                                                
                                                                
                                                                   
                                                                  
                                                                   
                         
                                                 
                                                                               
                                                             
                                                                                 
                                                            
                                                                                  
                                                               
                                                                        
                                                                          
                                                                           
                                         
                                                                   
                                                                    
                                                               
                                                                        
                                                                          
                                                                           
                                         
                                                                   
                                                                    
                                                               
                                         
                                                                     
                                                                    
                                                               
                                         
                                                                     
                                                                    
                                                               
                                         
                                                                     
                                                                    
                                                                 
                                         
                                                                     
                                                                    
                                                                 
                                              
                                                                       
                                                                 
                                                              
                                              
                                                                       
                                                                 
                                                              
                                              
                                                                    
                                                          
                                                                      
                                                                
                                              
                                                                    
                                                          
                                                                      
                                                                
                                              
                                                                      
                                                                    
                                                                       
                                                                    
                                                                         
                                                          
                                                                           
                                                                 
                                              
                                                                      
                                                                    
                                                                       
                                                                    
                                                                         
                                                          
                                                                           
                                                                 
                                                                      
                                                                 
                                                                
                                                                      
                                                                 
                                                                
                                                                             
                                                            
                                                                    
                                                     
                                                    
       
  }
  part def BerthCommitment :> Thread {
    port berth_transition_evidence : DataPort { in :>> type : BerthTransitionEvidence; }
    port prior_berth_state : DataPort { out :>> type : BerthState; }
    language "GUMBO" /*{
      state berthState: BerthState;

      initialize
        modifies berthState;
        guarantee INITIAL_BERTH_SAFE:
          berthState == AVAILABLE & prior_berth_state == AVAILABLE;

      compute
        modifies berthState;
        guarantee PRIOR_BERTH_PUBLICATION:
          prior_berth_state == In(berthState);
        compute_cases
          case BERTH_FAULT:
            assume berth_transition_evidence.eventKind == DOMINANT_FAULT;
            guarantee berthState == UNKNOWN;
          case BERTH_CLEAR_ANCHOR:
            assume berth_transition_evidence.eventKind == VERIFIED_CLEAR_ANCHOR;
            guarantee berthState == AVAILABLE;
          case BERTH_DOCKED_ANCHOR:
            assume berth_transition_evidence.eventKind == VERIFIED_DOCKED_ANCHOR;
            guarantee berthState == SECURED;
          case BERTH_CLEARANCE:
            assume berth_transition_evidence.eventKind == STATION_CLEARANCE & berth_transition_evidence.qualified == true & In(berthState) == AVAILABLE;
            guarantee berthState == RESERVED;
          case BERTH_SECURED:
            assume berth_transition_evidence.eventKind == STATION_SECURED & berth_transition_evidence.qualified == true & (In(berthState) == RESERVED | In(berthState) == SECURED);
            guarantee berthState == SECURED;
          case BERTH_RELEASED:
            assume berth_transition_evidence.eventKind == STATION_RELEASED & berth_transition_evidence.qualified == true & In(berthState) == SECURED;
            guarantee berthState == RELEASED;
          case BERTH_DEPARTED:
            assume berth_transition_evidence.eventKind == DEPARTURE_COMPLETION & berth_transition_evidence.qualified == true & In(berthState) == RELEASED;
            guarantee berthState == AVAILABLE;
          case BERTH_RETAIN:
            assume (berth_transition_evidence.eventKind == NO_EVENT | berth_transition_evidence.qualified == F() | (berth_transition_evidence.eventKind == STATION_CLEARANCE & In(berthState) != AVAILABLE) | (berth_transition_evidence.eventKind == STATION_SECURED & In(berthState) != RESERVED & In(berthState) != SECURED) | (berth_transition_evidence.eventKind == STATION_RELEASED & In(berthState) != SECURED) | (berth_transition_evidence.eventKind == DEPARTURE_COMPLETION & In(berthState) != RELEASED) | berth_transition_evidence.eventKind == STATION_AVAILABLE);
            guarantee berthState == In(berthState);
    }*/
           
                               
                               
                
                            
                             
                                     
                                              
                                                    
             
                            
                        
                                          
                                              
                         
                     
                           
                                                                                           
                                                       
                           
                                  
                                                                                                  
                                                         
                           
                                   
                                                                                                   
                                                       
                           
                               
                                                                                               
                                                                                           
                                                        
                           
                             
                                                                                             
                                                   
                                                        
                                                       
                                                       
                           
                              
                                                                                              
                                                                                         
                                                        
                           
                              
                                                                                                  
                                                                                          
                                                         
                           
                            
                                                                                      
                                                        
                                                                                           
                                                        
                                                                                         
                                                                                              
                                                                                          
                                                      
                                                                                              
                                                       
                                                                                         
                                                   
       
  }
  part def ServiceAccessGate :> Thread {
    port gate_safety_frame : DataPort { in :>> type : GateSafetyFrame; }
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    port prior_gate_state : DataPort { out :>> type : GateState; }
    language "GUMBO" /*{
      state gateState: GateState;

      initialize
        modifies gateState;
        guarantee INITIAL_GATE_SAFE:
          gateState == CLOSED & prior_gate_state == CLOSED;

      compute
        modifies gateState;
        guarantee PRIOR_GATE_PUBLICATION:
          prior_gate_state == In(gateState);
        compute_cases
          case GATE_FORCED_CLOSE:
            assume gate_safety_frame.directive == FORCE_CLOSE;
            guarantee gateState == CLOSED;
          case GATE_OPEN:
            assume gate_safety_frame.directive != FORCE_CLOSE & admission_decision.accepted == true & admission_decision.operation == ACCESS & gate_safety_frame.safeToOpen == true;
            guarantee gateState == OPEN;
          case GATE_ORDERED_CLOSE:
            assume gate_safety_frame.directive != FORCE_CLOSE & admission_decision.accepted == true & admission_decision.operation == UNDOCK;
            guarantee gateState == CLOSED;
          case GATE_RETAIN:
            assume gate_safety_frame.directive != FORCE_CLOSE & (admission_decision.accepted == F() | admission_decision.operation != ACCESS & admission_decision.operation != UNDOCK | admission_decision.operation == ACCESS & gate_safety_frame.safeToOpen == F());
            guarantee gateState == In(gateState);
    }*/
                        
           
                               
                             
                
                           
                             
                                    
                                                                               
             
                           
                        
                                         
                                            
                         
                     
                                 
                                                                            
                                                    
                           
                         
                                                                             
                                           
                                                                       
                                           
                                                  
                           
                                  
                                                                             
                                           
                                                                      
                                                    
                           
                           
                                                                             
                                                 
                                                                         
                                                                          
                                                                         
                                                    
                                                 
       
  }
  part def RecoverySupervisor :> Thread {
    port recovery_transition : DataPort { in :>> type : RecoveryTransition; }
    port prior_recovery_state : DataPort { out :>> type : RecoveryState; }
    language "GUMBO" /*{
      state recoveryState: RecoveryState;

      initialize
        modifies recoveryState;
        guarantee INITIAL_RECOVERY_SAFE:
          recoveryState == HEALTHY & prior_recovery_state == HEALTHY;

      compute
        modifies recoveryState;
        guarantee PRIOR_RECOVERY_PUBLICATION:
          prior_recovery_state == In(recoveryState);
        compute_cases
          case RECOVERY_LATCH:
            assume recovery_transition.intent == LATCH;
            guarantee recoveryState == LATCHED;
          case RECOVERY_RECONCILE:
            assume recovery_transition.intent == RECONCILE;
            guarantee recoveryState == RECONCILING;
          case RECOVERY_OPEN:
            assume recovery_transition.intent == OPEN_CLEAR | recovery_transition.intent == OPEN_DOCKED;
            guarantee recoveryState == HEALTHY;
          case RECOVERY_RETAIN:
            assume recovery_transition.intent == RETAIN;
            guarantee recoveryState == In(recoveryState);
    }*/
                        
           
                               
                                     
                
                               
                             
                                        
                                                  
                                                        
             
                               
                        
                                             
                                                    
                         
                     
                              
                                                                      
                                                             
                           
                                  
                                                                          
                                                                 
                           
                             
                                                                            
                                                                       
                                                             
                           
                               
                                                                       
                                                         
       
  }
  part def DockingActionEligibility :> Thread {
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    port docking_frame : DataPort { in :>> type : CoordinationFrame; }
    port docking_proposal : DataPort { out :>> type : DockingProposal; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_DOCKING_PROPOSAL_SAFE:
          docking_proposal.applicable == F() & docking_proposal.proposedAction == HOLD & docking_proposal.cause == NO_ELIGIBLE_ACTION & docking_proposal.correlation == NONE & docking_proposal.decisionContext == CLEAR;

      compute
        compute_cases
          case PROPOSE_DOCK_CLEARANCE:
            assume admission_decision.accepted == true & admission_decision.operation == DOCK;
            guarantee docking_proposal.applicable == true & docking_proposal.proposedAction == REQUEST_DOCK_CLEARANCE & docking_proposal.cause == NEW_DOCK_REQUEST & docking_proposal.correlation == admission_decision.correlation & docking_proposal.decisionContext == DOCKING;
          case PROPOSE_DOCK_APPROACH:
            assume (admission_decision.accepted == F() | admission_decision.operation != DOCK) & docking_frame.qualified == true & docking_frame.directive == CLEARANCE;
            guarantee docking_proposal.applicable == true & docking_proposal.proposedAction == AUTHORIZE_DOCK_APPROACH & docking_proposal.cause == DOCKING_PROGRESS & docking_proposal.correlation == docking_frame.correlation & docking_proposal.decisionContext == DOCKING;
          case NO_DOCKING_PROPOSAL:
            assume (admission_decision.accepted == F() | admission_decision.operation != DOCK) & (docking_frame.qualified == F() | docking_frame.directive != CLEARANCE);
            guarantee docking_proposal.applicable == F() & docking_proposal.proposedAction == HOLD & docking_proposal.cause == NO_ELIGIBLE_ACTION & docking_proposal.correlation == docking_frame.correlation & docking_proposal.decisionContext == docking_frame.decisionContext;
    }*/
                        
                
                             
                                                
                                            
                                                                     
                                                                      
                                                            
                                                                    
             
                         
                     
                                      
                                                
                                                                    
                                                   
                                                                                           
                                                                        
                                                                              
                                                                          
                           
                                     
                                                      
                                                                      
                                       
                                                                      
                                                   
                                                                                            
                                                                        
                                                                         
                                                                          
                           
                                   
                                                      
                                                                      
                                             
                                                                        
                                                        
                                                                         
                                                                          
                                                                         
                                                                                
       
  }
  part def AccessActionEligibility :> Thread {
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    port access_frame : DataPort { in :>> type : CoordinationFrame; }
    port access_proposal : DataPort { out :>> type : AccessProposal; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_ACCESS_PROPOSAL_SAFE:
          access_proposal.applicable == F() & access_proposal.proposedAction == HOLD & access_proposal.cause == NO_ELIGIBLE_ACTION & access_proposal.correlation == NONE & access_proposal.decisionContext == CLEAR;

      compute
        compute_cases
          case PROPOSE_ACCESS_OPEN:
            assume admission_decision.accepted == true & admission_decision.operation == ACCESS & access_frame.qualified == true;
            guarantee access_proposal.applicable == true & access_proposal.proposedAction == OPEN_SERVICE_ACCESS & access_proposal.cause == ACCESS_REQUEST & access_proposal.correlation == admission_decision.correlation & access_proposal.decisionContext == ACCESS_OPEN;
          case PROPOSE_ACCESS_CLOSE:
            assume admission_decision.accepted == true & admission_decision.operation == UNDOCK;
            guarantee access_proposal.applicable == true & access_proposal.proposedAction == CLOSE_SERVICE_ACCESS & access_proposal.cause == UNDOCK_SEQUENCE & access_proposal.correlation == admission_decision.correlation & access_proposal.decisionContext == UNDOCKING;
          case NO_ACCESS_PROPOSAL:
            assume (admission_decision.accepted == F() | admission_decision.operation != ACCESS | access_frame.qualified == F()) & (admission_decision.accepted == F() | admission_decision.operation != UNDOCK);
            guarantee access_proposal.applicable == F() & access_proposal.proposedAction == HOLD & access_proposal.cause == NO_ELIGIBLE_ACTION & access_proposal.correlation == access_frame.correlation & access_proposal.decisionContext == access_frame.decisionContext;
    }*/
                        
                
                             
                                               
                                           
                                                                    
                                                                     
                                                           
                                                                   
             
                         
                     
                                   
                                                
                                                                       
                                     
                                                  
                                                                                       
                                                                     
                                                                             
                                                                             
                           
                                    
                                                
                                                                      
                                                  
                                                                                        
                                                                      
                                                                             
                                                                           
                           
                                  
                                                     
                                                                        
                                                                         
                                                                        
                                            
                                                       
                                                                        
                                                                         
                                                                       
                                                                              
       
  }
  part def UndockingActionEligibility :> Thread {
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    port undocking_frame : DataPort { in :>> type : CoordinationFrame; }
    port undocking_proposal : DataPort { out :>> type : UndockingProposal; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_UNDOCKING_PROPOSAL_SAFE:
          undocking_proposal.applicable == F() & undocking_proposal.proposedAction == HOLD & undocking_proposal.cause == NO_ELIGIBLE_ACTION & undocking_proposal.correlation == NONE & undocking_proposal.decisionContext == CLEAR;

      compute
        compute_cases
          case PROPOSE_RELEASE_REQUEST:
            assume undocking_frame.qualified == true & undocking_frame.directive == RETAIN;
            guarantee undocking_proposal.applicable == true & undocking_proposal.proposedAction == REQUEST_UNDOCK_RELEASE & undocking_proposal.cause == UNDOCK_SEQUENCE & undocking_proposal.correlation == undocking_frame.correlation & undocking_proposal.decisionContext == UNDOCKING;
          case PROPOSE_UNDOCK_AUTHORIZATION:
            assume undocking_frame.qualified == true & undocking_frame.directive == RELEASED;
            guarantee undocking_proposal.applicable == true & undocking_proposal.proposedAction == AUTHORIZE_UNDOCK & undocking_proposal.cause == UNDOCK_SEQUENCE & undocking_proposal.correlation == undocking_frame.correlation & undocking_proposal.decisionContext == UNDOCKING;
          case NO_UNDOCKING_PROPOSAL:
            assume undocking_frame.qualified == F() | undocking_frame.directive != RETAIN & undocking_frame.directive != RELEASED;
            guarantee undocking_proposal.applicable == F() & undocking_proposal.proposedAction == HOLD & undocking_proposal.cause == NO_ELIGIBLE_ACTION & undocking_proposal.correlation == undocking_frame.correlation & undocking_proposal.decisionContext == undocking_frame.decisionContext;
    }*/
                        
                
                             
                                                  
                                              
                                                                       
                                                                        
                                                              
                                                                      
             
                         
                     
                                       
                                              
                                                                     
                                                     
                                                                                             
                                                                         
                                                                             
                                                                              
                           
                                            
                                              
                                                                       
                                                     
                                                                                       
                                                                         
                                                                             
                                                                              
                           
                                     
                                                   
                                                                       
                                                                         
                                                          
                                                                           
                                                                            
                                                                             
                                                                                    
       
  }
  part def DockingActionArbitration :> Thread {
    port docking_proposal : DataPort { in :>> type : DockingProposal; }
    port access_proposal : DataPort { in :>> type : AccessProposal; }
    port undocking_proposal : DataPort { in :>> type : UndockingProposal; }
    port priority_directive : DataPort { in :>> type : PriorityDirective; }
    port docking_decision : DataPort { out :>> type : DockingDecisionFrame; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_DECISION_SAFE:
          docking_decision.proposedAction == HOLD & docking_decision.cause == NO_ELIGIBLE_ACTION & docking_decision.correlation == NONE & docking_decision.decisionContext == CLEAR;

      compute
        compute_cases
          case SELECT_REVOCATION:
            assume priority_directive.priority == REVOKE;
            guarantee docking_decision.proposedAction == REVOKE_SERVICE_ACCESS & docking_decision.cause == FAULT_OR_RECOVERY & docking_decision.correlation == NONE & docking_decision.decisionContext == QUARANTINED;
          case SELECT_DEPARTURE_COMPLETION:
            assume priority_directive.priority == DEPARTURE_COMPLETE;
            guarantee docking_decision.proposedAction == HOLD & docking_decision.cause == DEPARTURE_CONFIRMATION & docking_decision.correlation == priority_directive.correlation & docking_decision.decisionContext == CLEAR;
          case SELECT_ACCESS_CLOSURE:
            assume priority_directive.priority == ORDINARY & access_proposal.applicable == true & access_proposal.proposedAction == CLOSE_SERVICE_ACCESS;
            guarantee docking_decision.proposedAction == access_proposal.proposedAction & docking_decision.cause == access_proposal.cause & docking_decision.correlation == access_proposal.correlation & docking_decision.decisionContext == access_proposal.decisionContext;
          case SELECT_UNDOCK_ACTION:
            assume priority_directive.priority == ORDINARY & (access_proposal.applicable == F() | access_proposal.proposedAction != CLOSE_SERVICE_ACCESS) & undocking_proposal.applicable == true;
            guarantee docking_decision.proposedAction == undocking_proposal.proposedAction & docking_decision.cause == undocking_proposal.cause & docking_decision.correlation == undocking_proposal.correlation & docking_decision.decisionContext == undocking_proposal.decisionContext;
          case SELECT_DOCK_APPROACH:
            assume priority_directive.priority == ORDINARY & (access_proposal.applicable == F() | access_proposal.proposedAction != CLOSE_SERVICE_ACCESS) & undocking_proposal.applicable == F() & docking_proposal.applicable == true & docking_proposal.proposedAction == AUTHORIZE_DOCK_APPROACH;
            guarantee docking_decision.proposedAction == docking_proposal.proposedAction & docking_decision.cause == docking_proposal.cause & docking_decision.correlation == docking_proposal.correlation & docking_decision.decisionContext == docking_proposal.decisionContext;
          case SELECT_ACCESS_OPEN:
            assume priority_directive.priority == ORDINARY & (access_proposal.applicable == F() | access_proposal.proposedAction != CLOSE_SERVICE_ACCESS) & undocking_proposal.applicable == F() & (docking_proposal.applicable == F() | docking_proposal.proposedAction != AUTHORIZE_DOCK_APPROACH) & access_proposal.applicable == true & access_proposal.proposedAction == OPEN_SERVICE_ACCESS;
            guarantee docking_decision.proposedAction == access_proposal.proposedAction & docking_decision.cause == access_proposal.cause & docking_decision.correlation == access_proposal.correlation & docking_decision.decisionContext == access_proposal.decisionContext;
          case SELECT_DOCK_CLEARANCE:
            assume priority_directive.priority == ORDINARY & undocking_proposal.applicable == F() & (access_proposal.applicable == F() | access_proposal.proposedAction != CLOSE_SERVICE_ACCESS & access_proposal.proposedAction != OPEN_SERVICE_ACCESS) & docking_proposal.applicable == true & docking_proposal.proposedAction == REQUEST_DOCK_CLEARANCE;
            guarantee docking_decision.proposedAction == docking_proposal.proposedAction & docking_decision.cause == docking_proposal.cause & docking_decision.correlation == docking_proposal.correlation & docking_decision.decisionContext == docking_proposal.decisionContext;
          case SELECT_HOLD:
            assume priority_directive.priority == ORDINARY & docking_proposal.applicable == F() & access_proposal.applicable == F() & undocking_proposal.applicable == F();
            guarantee docking_decision.proposedAction == HOLD & docking_decision.cause == NO_ELIGIBLE_ACTION & docking_decision.correlation == priority_directive.correlation & docking_decision.decisionContext == priority_directive.decisionContext;
    }*/
                        
                
                             
                                        
                                                                     
                                                                      
                                                            
                                                                    
             
                         
                     
                                 
                                                                      
                                                                                                  
                                                                         
                                                                
                                                                              
                           
                                           
                                                                                  
                                                                                 
                                                                              
                                                                              
                                                                        
                           
                                     
                                                                         
                                          
                                                                                       
                                                                                         
                                                               
                                                                           
                                                                                  
                           
                                    
                                                                         
                                                
                                                                                          
                                            
                                                                                            
                                                                  
                                                                              
                                                                                     
                           
                                    
                                                                         
                                                
                                                                                          
                                                                                
                                                                                           
                                                                                          
                                                                
                                                                            
                                                                                   
                           
                                  
                                                                         
                                                
                                                                                          
                                                  
                                                 
                                                                                              
                                          
                                                                                      
                                                                                         
                                                               
                                                                           
                                                                                  
                           
                                     
                                                                         
                                                  
                                                
                                                                                          
                                                                                           
                                           
                                                                                          
                                                                                          
                                                                
                                                                            
                                                                                   
                           
                           
                                                                         
                                                                                  
                                                 
                                                                                 
                                                                          
                                                                              
                                                                                     
       
  }
  part def ResultComposition :> Thread {
    port docking_decision : DataPort { in :>> type : DockingDecisionFrame; }
    port request_disposition : DataPort { in :>> type : RequestDisposition; }
    port docking_access_result : DataPort { out :>> type : DockingAccessResult; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_RESULT_SAFE:
          docking_access_result.proposedAction == HOLD & docking_access_result.cause == NO_ELIGIBLE_ACTION & docking_access_result.mode == HOLDING & docking_access_result.correlation == NONE & docking_access_result.disposition == NO_REQUEST & docking_access_result.status == CLOSED & docking_access_result.outcome == NONE;

      compute
        guarantee RESULT_OWNER_FIELDS:
          docking_access_result.proposedAction == docking_decision.proposedAction & docking_access_result.cause == docking_decision.cause & docking_access_result.correlation == docking_decision.correlation & docking_access_result.disposition == request_disposition;
        compute_cases
          case COMPOSE_RECOVERY:
            assume docking_decision.cause == FAULT_OR_RECOVERY | docking_decision.proposedAction == REVOKE_SERVICE_ACCESS;
            guarantee docking_access_result.mode == QUARANTINED & docking_access_result.status == REVOKED & docking_access_result.outcome == RECOVERY_REQUIRED;
          case COMPOSE_DEPARTURE_COMPLETE:
            assume docking_decision.cause == DEPARTURE_CONFIRMATION;
            guarantee docking_access_result.mode == HOLDING & docking_access_result.status == CLOSED & docking_access_result.outcome == DEPARTURE_COMPLETE;
          case COMPOSE_DOCKING:
            assume docking_decision.proposedAction == REQUEST_DOCK_CLEARANCE | docking_decision.proposedAction == AUTHORIZE_DOCK_APPROACH;
            guarantee docking_access_result.mode == DOCKING & docking_access_result.status == CLOSED & docking_access_result.outcome == DOCKING_ACTIVE;
          case COMPOSE_ACCESS_OPEN:
            assume docking_decision.proposedAction == OPEN_SERVICE_ACCESS;
            guarantee docking_access_result.mode == ACCESSIBLE & docking_access_result.status == OPEN & docking_access_result.outcome == ACCESS_ACTIVE;
          case COMPOSE_UNDOCKING:
            assume docking_decision.proposedAction == CLOSE_SERVICE_ACCESS | docking_decision.proposedAction == REQUEST_UNDOCK_RELEASE | docking_decision.proposedAction == AUTHORIZE_UNDOCK;
            guarantee docking_access_result.mode == UNDOCKING & docking_access_result.status == CLOSED & docking_access_result.outcome == UNDOCKING_ACTIVE;
          case COMPOSE_HOLD_CLEAR:
            assume docking_decision.proposedAction == HOLD & docking_decision.cause != DEPARTURE_CONFIRMATION & docking_decision.decisionContext == CLEAR;
            guarantee docking_access_result.mode == HOLDING & docking_access_result.status == CLOSED & docking_access_result.outcome == NONE;
          case COMPOSE_HOLD_DOCKING:
            assume docking_decision.proposedAction == HOLD & docking_decision.decisionContext == DOCKING;
            guarantee docking_access_result.mode == DOCKING & docking_access_result.status == CLOSED & docking_access_result.outcome == DOCKING_ACTIVE;
          case COMPOSE_HOLD_DOCKED:
            assume docking_decision.proposedAction == HOLD & docking_decision.decisionContext == DOCKED_CLOSED;
            guarantee docking_access_result.mode == HOLDING & docking_access_result.status == CLOSED & docking_access_result.outcome == DOCKED_ACCESS_READY;
          case COMPOSE_HOLD_ACCESS:
            assume docking_decision.proposedAction == HOLD & docking_decision.decisionContext == ACCESS_OPEN;
            guarantee docking_access_result.mode == ACCESSIBLE & docking_access_result.status == OPEN & docking_access_result.outcome == ACCESS_ACTIVE;
          case COMPOSE_HOLD_UNDOCKING:
            assume docking_decision.proposedAction == HOLD & docking_decision.decisionContext == UNDOCKING;
            guarantee docking_access_result.mode == UNDOCKING & docking_access_result.status == CLOSED & docking_access_result.outcome == UNDOCKING_ACTIVE;
          case COMPOSE_HOLD_QUARANTINED:
            assume docking_decision.proposedAction == HOLD & docking_decision.decisionContext == QUARANTINED;
            guarantee docking_access_result.mode == QUARANTINED & docking_access_result.status == REVOKED & docking_access_result.outcome == RECOVERY_REQUIRED;
    }*/
                        
                
                             
                                      
                                                                          
                                                                           
                                                            
                                                                 
                                                                              
                                                               
                                                               
             
                         
                                      
                                                                                   
                                                                 
                                                                             
                                                                   
                         
                     
                                
                                                                              
                                                                                         
                                                                            
                                                                    
                                                                                
                           
                                          
                                                                                  
                                                                        
                                                                   
                                                                                 
                           
                               
                                                                                                
                                                                                           
                                                                        
                                                                   
                                                                             
                           
                                   
                                                                                            
                                                                           
                                                                 
                                                                            
                           
                                 
                                                                                              
                                                                                           
                                                                                    
                                                                          
                                                                   
                                                                               
                           
                                  
                                                                              
                                                                              
                                                                        
                                                                        
                                                                   
                                                                   
                           
                                    
                                                                              
                                                                          
                                                                        
                                                                   
                                                                             
                           
                                   
                                                                              
                                                                                
                                                                        
                                                                   
                                                                                  
                           
                                   
                                                                              
                                                                              
                                                                           
                                                                 
                                                                            
                           
                                      
                                                                              
                                                                            
                                                                          
                                                                   
                                                                               
                           
                                        
                                                                              
                                                                              
                                                                            
                                                                    
                                                                                
       
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
