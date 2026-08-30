package Station_Cargo_Transfer_Verification_Supervisor {

  private import HAMR::*;

  // Boundary value domains.
  enum def TransferRequest {
    enum None; enum FreshStart; enum RepeatedStart; enum FreshCancel;
    enum RepeatedCancel; enum FreshReset; enum RepeatedReset; enum Invalid;
  }
  enum def CargoState { enum Present; enum Empty; enum Invalid; }
  enum def DockServiceCondition {
    enum TransferAvailable; enum UndockPriority; enum ServiceHold;
    enum Undocked; enum Invalid;
  }
  enum def ShipTransferEvidence { enum Idle; enum Active; enum Complete; enum Failed; enum Invalid; }
  enum def WarehouseReceiptEvidence {
    enum NoReceipt; enum MatchingReceipt; enum ConflictingReceipt; enum Invalid;
  }
  enum def ShipCommand { enum Hold; enum BeginOffload; enum StopOffload; }
  enum def WarehouseQuery { enum NoQuery; enum RequestReceipt; }
  enum def PilotTransferReport {
    enum Idle; enum Started; enum InProgress; enum Verified; enum Cancelled;
    enum Inhibited; enum RecoveryRequired; enum ResetComplete;
  }
  enum def StationTransferReport {
    enum Idle; enum OffloadActive; enum VerificationPending; enum Verified;
    enum Stopped; enum RecoveryRequired; enum ResetComplete;
  }

  // Owner-local finite facts.
  enum def QualifiedRequest {
    enum NoNewRequest; enum StartCandidate; enum RejectEmpty;
    enum CancelCandidate; enum ResetCandidate; enum InputFault;
  }
  enum def ServiceEligibility { enum Ready; enum PreemptUndock; enum Ineligible; enum ServiceFault; }
  enum def SessionState {
    enum Idle; enum Commanding; enum AwaitingEvidence; enum Verified;
    enum StoppedByCancel; enum StoppedByUndock; enum StoppedByService;
    enum RecoveryRequired;
  }
  enum def AdmittedDirective {
    enum Hold; enum Begin; enum Cancel; enum PreemptUndock; enum PreemptService;
    enum EnterRecovery; enum Reset; enum RejectEmpty; enum RejectIneligible;
  }
  enum def SessionExpectation { enum None; enum ActiveTransfer; enum RecoveryCheck; }
  enum def ShipFinding { enum Neutral; enum RecoveryNeutral; enum NotComplete; enum Complete; enum Fault; }
  enum def WarehouseFinding { enum Neutral; enum RecoveryNeutral; enum Missing; enum Match; enum Fault; }
  enum def VerificationDisposition {
    enum Neutral; enum Awaiting; enum Verified; enum RecoveryRequired; enum RecoveryClearable;
  }
  enum def CommandProposal { enum HoldNoQuery; enum BeginWithQuery; enum HoldWithQuery; enum StopNoQuery; }
  enum def SessionResult {
    enum None; enum Started; enum Waiting; enum Verified; enum Cancelled;
    enum Inhibited; enum RecoveryRequired; enum ResetComplete;
  }
  // Generated wire encodings are bijective support and receive no owner credit.
  enum def SnapshotSessionState {
    enum Idle; enum Commanding; enum AwaitingEvidence; enum Verified;
    enum StoppedByCancel; enum StoppedByUndock; enum StoppedByService;
    enum RecoveryRequired;
  }
  enum def SnapshotSessionResult {
    enum None; enum Started; enum Waiting; enum Verified; enum Cancelled;
    enum Inhibited; enum RecoveryRequired; enum ResetComplete;
  }

  // Both members are GUMBO-visible attributes in the final refinement.
  part def SessionSnapshot :> Data {
    attribute next_state : SnapshotSessionState;
    attribute session_result : SnapshotSessionResult;
  }

  part def RequestQualifier :> Thread {
    port transferRequest : DataPort { in :>> type : TransferRequest; }
    port cargoState : DataPort { in :>> type : CargoState; }
    port qualifiedRequest : DataPort { out :>> type : QualifiedRequest; }

    language "GUMBO" /*{
      initialize
        guarantee REQUEST_INITIAL: qualifiedRequest == QualifiedRequest.NoNewRequest;

      compute
        compute_cases
          case REQUEST_INPUT_FAULT:
            assume transferRequest == TransferRequest.Invalid or cargoState == CargoState.Invalid;
            guarantee qualifiedRequest == QualifiedRequest.InputFault;
          case REQUEST_START_CANDIDATE:
            assume transferRequest == TransferRequest.FreshStart and cargoState == CargoState.Present;
            guarantee qualifiedRequest == QualifiedRequest.StartCandidate;
          case REQUEST_EMPTY_REJECTION:
            assume transferRequest == TransferRequest.FreshStart and cargoState == CargoState.Empty;
            guarantee qualifiedRequest == QualifiedRequest.RejectEmpty;
          case REQUEST_CANCEL_CANDIDATE:
            assume transferRequest == TransferRequest.FreshCancel and cargoState != CargoState.Invalid;
            guarantee qualifiedRequest == QualifiedRequest.CancelCandidate;
          case REQUEST_RESET_CANDIDATE:
            assume transferRequest == TransferRequest.FreshReset and cargoState != CargoState.Invalid;
            guarantee qualifiedRequest == QualifiedRequest.ResetCandidate;
          case REQUEST_NO_NEW:
            assume cargoState != CargoState.Invalid and
                   transferRequest != TransferRequest.Invalid and
                   transferRequest != TransferRequest.FreshStart and
                   transferRequest != TransferRequest.FreshCancel and
                   transferRequest != TransferRequest.FreshReset;
            guarantee qualifiedRequest == QualifiedRequest.NoNewRequest;
    }*/

             
                     
                           
                                                                                         
                                                               
                                                    
                                                                      
                           
                                                                                        
                                                                  
                                                    
                                                                          
                           
                                                                                    
                                                                  
                                                  
                                                                       
                            
                                                                                     
                                                                   
                                                    
                                                                           
                            
                                                                                   
                                                                  
                                                    
                                                                          
                           
                                                                                
                                                     
                                                               
                                                                  
                                                                   
                                                                 
                                                                        
       
  }

  part def ServiceReadinessQualifier :> Thread {
    port serviceCondition : DataPort { in :>> type : DockServiceCondition; }
    port serviceEligibility : DataPort { out :>> type : ServiceEligibility; }
    port gateEligibility : DataPort { out :>> type : ServiceEligibility; }

    language "GUMBO" /*{
      initialize
        guarantee SERVICE_INITIAL:
          serviceEligibility == ServiceEligibility.Ineligible and
          gateEligibility == ServiceEligibility.Ineligible;

      compute
        compute_cases
          case SERVICE_READY:
            assume serviceCondition == DockServiceCondition.TransferAvailable;
            guarantee serviceEligibility == ServiceEligibility.Ready and
                      gateEligibility == ServiceEligibility.Ready;
          case SERVICE_UNDOCK_PREEMPTION:
            assume serviceCondition == DockServiceCondition.UndockPriority;
            guarantee serviceEligibility == ServiceEligibility.PreemptUndock and
                      gateEligibility == ServiceEligibility.PreemptUndock;
          case SERVICE_INELIGIBLE:
            assume serviceCondition == DockServiceCondition.ServiceHold or
                   serviceCondition == DockServiceCondition.Undocked;
            guarantee serviceEligibility == ServiceEligibility.Ineligible and
                      gateEligibility == ServiceEligibility.Ineligible;
          case SERVICE_FAULT:
            assume serviceCondition == DockServiceCondition.Invalid;
            guarantee serviceEligibility == ServiceEligibility.ServiceFault and
                      gateEligibility == ServiceEligibility.ServiceFault;
    }*/
                        
                
                           
                                                                                  
                                                               
                                                           

             
                     
                            
                                                                                          
                                                                              
                                                                      
                                                                  
                                   
                                                                                                
                                                                           
                                                                              
                                                                          
                            
                                                                                     
                                                                         
                                                                     
                                                                           
                                                                       
                           
                                                                             
                                                                    
                                                                             
                                                                         
       
  }

  part def PriorityArbiter :> Thread {
    port qualifiedRequest : DataPort { in :>> type : QualifiedRequest; }
    port serviceEligibility : DataPort { in :>> type : ServiceEligibility; }
    port sessionPrestate : DataPort { in :>> type : SessionState; }
    port admittedDirective : DataPort { out :>> type : AdmittedDirective; }

    language "GUMBO" /*{
      initialize
        guarantee ARBITER_INITIAL: admittedDirective == AdmittedDirective.Hold;
      compute
        compute_cases
          case ARBITER_FAULT:
            assume qualifiedRequest == QualifiedRequest.InputFault or serviceEligibility == ServiceEligibility.ServiceFault;
            guarantee admittedDirective == AdmittedDirective.EnterRecovery;
          case ARBITER_ACTIVE_UNDOCK:
            assume qualifiedRequest != QualifiedRequest.InputFault and serviceEligibility == ServiceEligibility.PreemptUndock and
                   (sessionPrestate == SessionState.Commanding or sessionPrestate == SessionState.AwaitingEvidence);
            guarantee admittedDirective == AdmittedDirective.PreemptUndock;
          case ARBITER_ACTIVE_SERVICE_STOP:
            assume qualifiedRequest != QualifiedRequest.InputFault and serviceEligibility == ServiceEligibility.Ineligible and
                   (sessionPrestate == SessionState.Commanding or sessionPrestate == SessionState.AwaitingEvidence);
            guarantee admittedDirective == AdmittedDirective.PreemptService;
          case ARBITER_ACTIVE_CANCEL:
            assume qualifiedRequest == QualifiedRequest.CancelCandidate and serviceEligibility == ServiceEligibility.Ready and
                   (sessionPrestate == SessionState.Commanding or sessionPrestate == SessionState.AwaitingEvidence);
            guarantee admittedDirective == AdmittedDirective.Cancel;
          case ARBITER_ACTIVE_HOLD:
            assume qualifiedRequest != QualifiedRequest.InputFault and serviceEligibility == ServiceEligibility.Ready and
                   qualifiedRequest != QualifiedRequest.CancelCandidate and
                   (sessionPrestate == SessionState.Commanding or sessionPrestate == SessionState.AwaitingEvidence);
            guarantee admittedDirective == AdmittedDirective.Hold;
          case ARBITER_IDLE_UNDOCK:
            assume qualifiedRequest != QualifiedRequest.InputFault and serviceEligibility == ServiceEligibility.PreemptUndock and
                   sessionPrestate == SessionState.Idle and
                   (qualifiedRequest == QualifiedRequest.StartCandidate or qualifiedRequest == QualifiedRequest.RejectEmpty or qualifiedRequest == QualifiedRequest.CancelCandidate);
            guarantee admittedDirective == AdmittedDirective.PreemptUndock;
          case ARBITER_IDLE_INELIGIBLE:
            assume qualifiedRequest != QualifiedRequest.InputFault and serviceEligibility == ServiceEligibility.Ineligible and
                   sessionPrestate == SessionState.Idle and
                   (qualifiedRequest == QualifiedRequest.StartCandidate or qualifiedRequest == QualifiedRequest.RejectEmpty or qualifiedRequest == QualifiedRequest.CancelCandidate);
            guarantee admittedDirective == AdmittedDirective.RejectIneligible;
          case ARBITER_IDLE_NONACTIONABLE_SERVICE:
            assume qualifiedRequest != QualifiedRequest.InputFault and serviceEligibility != ServiceEligibility.Ready and
                   serviceEligibility != ServiceEligibility.ServiceFault and sessionPrestate == SessionState.Idle and
                   qualifiedRequest != QualifiedRequest.StartCandidate and qualifiedRequest != QualifiedRequest.RejectEmpty and qualifiedRequest != QualifiedRequest.CancelCandidate;
            guarantee admittedDirective == AdmittedDirective.Hold;
          case ARBITER_IDLE_BEGIN:
            assume qualifiedRequest == QualifiedRequest.StartCandidate and serviceEligibility == ServiceEligibility.Ready and sessionPrestate == SessionState.Idle;
            guarantee admittedDirective == AdmittedDirective.Begin;
          case ARBITER_IDLE_EMPTY:
            assume qualifiedRequest == QualifiedRequest.RejectEmpty and serviceEligibility == ServiceEligibility.Ready and sessionPrestate == SessionState.Idle;
            guarantee admittedDirective == AdmittedDirective.RejectEmpty;
          case ARBITER_IDLE_CANCEL:
            assume qualifiedRequest == QualifiedRequest.CancelCandidate and serviceEligibility == ServiceEligibility.Ready and sessionPrestate == SessionState.Idle;
            guarantee admittedDirective == AdmittedDirective.Cancel;
          case ARBITER_IDLE_HOLD:
            assume serviceEligibility == ServiceEligibility.Ready and sessionPrestate == SessionState.Idle and
                   qualifiedRequest != QualifiedRequest.InputFault and qualifiedRequest != QualifiedRequest.StartCandidate and
                   qualifiedRequest != QualifiedRequest.RejectEmpty and qualifiedRequest != QualifiedRequest.CancelCandidate;
            guarantee admittedDirective == AdmittedDirective.Hold;
          case ARBITER_LATCH_RESET:
            assume qualifiedRequest == QualifiedRequest.ResetCandidate and serviceEligibility == ServiceEligibility.Ready and
                   sessionPrestate != SessionState.Idle and sessionPrestate != SessionState.Commanding and sessionPrestate != SessionState.AwaitingEvidence;
            guarantee admittedDirective == AdmittedDirective.Reset;
          case ARBITER_LATCH_BLOCKED_RESET:
            assume qualifiedRequest == QualifiedRequest.ResetCandidate and serviceEligibility != ServiceEligibility.Ready and
                   serviceEligibility != ServiceEligibility.ServiceFault and sessionPrestate != SessionState.Idle and
                   sessionPrestate != SessionState.Commanding and sessionPrestate != SessionState.AwaitingEvidence;
            guarantee admittedDirective == AdmittedDirective.RejectIneligible;
          case ARBITER_LATCH_HOLD:
            assume qualifiedRequest != QualifiedRequest.InputFault and serviceEligibility != ServiceEligibility.ServiceFault and
                   sessionPrestate != SessionState.Idle and sessionPrestate != SessionState.Commanding and
                   sessionPrestate != SessionState.AwaitingEvidence and qualifiedRequest != QualifiedRequest.ResetCandidate;
            guarantee admittedDirective == AdmittedDirective.Hold;
    }*/
                        
                
                           
                                                                             
                                                      

             
                     
                                
                                                                                               
                                                                    
                                                                         
                                                                           
                           
                                                                                  
                                                                    
                                                                           
                                                                
                                                                      
                                                                           
                           
                                                                                        
                                                                    
                                                                        
                                                                
                                                                      
                                                                            
                           
                                                                                                    
                                                                         
                                                                   
                                                                
                                                                      
                                                                    
                            
                                                                                             
                                                                    
                                                                   
                                                                         
                                                                
                                                                      
                                                                  
                           
                                                                                         
                                                                    
                                                                           
                                                         
                                                                         
                                                                      
                                                                          
                                                                           
                           
                                                                                                  
                                                                    
                                                                        
                                                         
                                                                         
                                                                      
                                                                          
                                                                              
                            
                                                                                                                
                                                                    
                                                                   
                                                                          
                                                         
                                                                        
                                                                     
                                                                        
                                                                  
                           
                                                                                     
                                                                        
                                                                   
                                                        
                                                                   
                            
                                                                                       
                                                                     
                                                                   
                                                        
                                                                         
                           
                                                                                              
                                                                         
                                                                   
                                                        
                                                                    
                           
                                                                           
                                                                   
                                                         
                                                                    
                                                                        
                                                                     
                                                                        
                                                                  
                            
                                                                                       
                                                                        
                                                                   
                                                         
                                                               
                                                                    
                                                                   
                           
                                                                                                    
                                                                        
                                                                   
                                                                          
                                                         
                                                               
                                                                    
                                                                              
                           
                                                                                                     
                                                                    
                                                                          
                                                         
                                                               
                                                                     
                                                                       
                                                                  
       
  }

  part def SessionController :> Thread {
    port admittedDirective : DataPort { in :>> type : AdmittedDirective; }
    port verificationDisposition : DataPort { in :>> type : VerificationDisposition; }
    port sessionPrestate : DataPort { out :>> type : SessionState; }
    port shipExpectation : DataPort { out :>> type : SessionExpectation; }
    port warehouseExpectation : DataPort { out :>> type : SessionExpectation; }
    port commandProposal : DataPort { out :>> type : CommandProposal; }
    port sessionSnapshot : DataPort { out :>> type : SessionSnapshot; }

    language "GUMBO" /*{
      state
        sessionState: SessionState;

      initialize
        guarantee SESSION_INITIAL:
          sessionState == SessionState.Idle and
          sessionPrestate == SessionState.Idle and
          shipExpectation == SessionExpectation.None and
          warehouseExpectation == SessionExpectation.None and
          commandProposal == CommandProposal.HoldNoQuery and
          sessionSnapshot.next_state == SnapshotSessionState.Idle and
          sessionSnapshot.session_result == SnapshotSessionResult.None;
    }*/
                        
           
                              
                                    

               
                         
                                                                        
                                                                                
                                                                                                 
                                                                                 
                                                                                               
                                                                                               
                                                                                                 
                                                                                                 
                                         

                
                           
                                                                                                        
                                             
                                                
                                                      
                                                           
                                                          
                                                                   
                                                                       

             
                        
                                                                                                      
                                              
                          
                                                                                                                              
                                                          
                                                                       
                                                                     
                                                                            
                                                                       
                                                                    
                                                                           
                                                          
                                                                
                                                                       
                                                           
                                                                  
                         
                                                                                      
                                                                     

                     
                            
                                                                                                      
                                                                 
                                                                        
                                                                          
                                                                                         
                                                                     
                                                                      
                                                                                               
                            
                                                                                                                
                                                                
                                                                      
                                                                          
                                                                                         
                                                                     
                                                                      
                                                                                               
                            
                                                                                                                           
                                                                 
                                                                        
                                                                         
                                                                                        
                                                                                
                                                                                          
                                                                     
                                                                      
                                                                                               
                            
                                                                                                                               
                                                                
                                                                      
                                                                         
                                                                                        
                                                                          
                                                                                  
                                                                                   
                                                                                     
                                                                          
                                                                                   
                                                                                   
                                                                                              
                                                                     
                                                                      
                                                                                               
                           
                                                                                           
                                                                 
                                                                        
                                                                         
                                                                                        
                                                                               
                                                                                        
                                                                    
                                                                      
                                                                                        
                           
                                                                                      
                                                                 
                                                                        
                                                                          
                                                                                        
                                                                               
                                                                                        
                                                                     
                                                                      
                                                                                        
                           
                                                                                            
                                                                 
                                                                        
                                                                  
                                                                                        
                                                                               
                                                                                        
                                                                    
                                                                      
                                                                                        
                           
                                                                                                                        
                                                                 
                                                                        
                                                                         
                                                                         
                                                                          
                                                                  
                                                                               
                                                             
                                                                      
                                                                                       
                           
                                                                                                           
                                                                 
                                                                        
                                                                         
                                                                         
                                                                          
                                                                  
                                                                               
                                                                     
                                                                        
                                                                                      
                           
                                                                                               
                                                                      
                                                                 
                                                                                        
                                                         
                                                                      
                                                                                            
                           
                                                                                                   
                                                                      
                                                                            
                                                                                        
                                                                     
                                                                      
                                                                                   
                           
                                                                                             
                                                                      
                                                                         
                                                                 
                                                                            
                                                                                        
                                                                     
                                                                      
                                                                                   
                           
                                                                                                
                                                               
                                                                      
                                                                      
                                                                        
                                                                 
                                                                              
                                                         
                                                                      
                                                                                            
                           
                                                                                    
                                                               
                                                                      
                                                                      
                                                                        
                                                                         
                                                                 
                                                                              
                                                        
                                                                      
                                                                                   
                           
                                                                                             
                                                          
                                                                 
                                                                              
                                                               
                                                                         
                                                                                      
                           
                                                                                              
                                                          
                                                                  
                                                                              
                                                         
                                                                      
                                                                                        
                           
                                                                                         
                                                          
                                                                        
                                                                             
                                                                          
                                                                            
                                                                              
                                                         
                                                                      
                                                                                        
                           
                                                                                     
                                                          
                                                                         
                                                                 
                                                                  
                                                                       
                                                                            
                                                                         
                                                                          
                                                                              
                                                         
                                                                      
                                                                                   
       
  }

  part def ShipEvidenceQualifier :> Thread {
    port transferEvidence : DataPort { in :>> type : ShipTransferEvidence; }
    port sessionExpectation : DataPort { in :>> type : SessionExpectation; }
    port shipFinding : DataPort { out :>> type : ShipFinding; }

    language "GUMBO" /*{
      initialize
        guarantee SHIP_FINDING_INITIAL: shipFinding == ShipFinding.Neutral;
      compute
        compute_cases
          case SHIP_ACTIVE_FAULT:
            assume sessionExpectation == SessionExpectation.ActiveTransfer and
                   (transferEvidence == ShipTransferEvidence.Failed or transferEvidence == ShipTransferEvidence.Invalid);
            guarantee shipFinding == ShipFinding.Fault;
          case SHIP_OTHER_EXPLICIT_FAULT:
            assume sessionExpectation != SessionExpectation.ActiveTransfer and
                   (transferEvidence == ShipTransferEvidence.Failed or transferEvidence == ShipTransferEvidence.Invalid);
            guarantee shipFinding == ShipFinding.Fault;
          case SHIP_ACTIVE_NOT_COMPLETE:
            assume sessionExpectation == SessionExpectation.ActiveTransfer and
                   (transferEvidence == ShipTransferEvidence.Idle or transferEvidence == ShipTransferEvidence.Active);
            guarantee shipFinding == ShipFinding.NotComplete;
          case SHIP_ACTIVE_COMPLETE:
            assume sessionExpectation == SessionExpectation.ActiveTransfer and transferEvidence == ShipTransferEvidence.Complete;
            guarantee shipFinding == ShipFinding.Complete;
          case SHIP_NONE_NEUTRAL:
            assume sessionExpectation == SessionExpectation.None and transferEvidence == ShipTransferEvidence.Idle;
            guarantee shipFinding == ShipFinding.Neutral;
          case SHIP_NONE_UNEXPECTED:
            assume sessionExpectation == SessionExpectation.None and
                   (transferEvidence == ShipTransferEvidence.Active or transferEvidence == ShipTransferEvidence.Complete);
            guarantee shipFinding == ShipFinding.Fault;
          case SHIP_RECOVERY_NEUTRAL:
            assume sessionExpectation == SessionExpectation.RecoveryCheck and transferEvidence == ShipTransferEvidence.Idle;
            guarantee shipFinding == ShipFinding.RecoveryNeutral;
          case SHIP_RECOVERY_UNEXPECTED:
            assume sessionExpectation == SessionExpectation.RecoveryCheck and
                   (transferEvidence == ShipTransferEvidence.Active or transferEvidence == ShipTransferEvidence.Complete);
            guarantee shipFinding == ShipFinding.Fault;
    }*/
                        
                
                           
                                                                           
                                             

             
                     
                           
                                                                                                      
                                                                            
                                                                     
                                                                      
                                                       
                            
                                                                                                               
                                                                            
                                                                     
                                                                      
                                                       
                            
                                                                                                     
                                                                            
                                                                   
                                                                     
                                                             
                            
                                                                                               
                                                                            
                                                                     
                                                          
                            
                                                                                         
                                                                  
                                                                 
                                                         
                           
                                                                                               
                                                                  
                                                                     
                                                                       
                                                       
                            
                                                                                            
                                                                           
                                                                 
                                                                 
                           
                                                                                            
                                                                           
                                                                     
                                                                       
                                                       
       
  }

  part def WarehouseEvidenceQualifier :> Thread {
    port receiptEvidence : DataPort { in :>> type : WarehouseReceiptEvidence; }
    port sessionExpectation : DataPort { in :>> type : SessionExpectation; }
    port warehouseFinding : DataPort { out :>> type : WarehouseFinding; }

    language "GUMBO" /*{
      initialize
        guarantee WAREHOUSE_FINDING_INITIAL: warehouseFinding == WarehouseFinding.Neutral;
      compute
        compute_cases
          case WAREHOUSE_ACTIVE_FAULT:
            assume sessionExpectation == SessionExpectation.ActiveTransfer and
                   (receiptEvidence == WarehouseReceiptEvidence.ConflictingReceipt or receiptEvidence == WarehouseReceiptEvidence.Invalid);
            guarantee warehouseFinding == WarehouseFinding.Fault;
          case WAREHOUSE_OTHER_EXPLICIT_FAULT:
            assume sessionExpectation != SessionExpectation.ActiveTransfer and
                   (receiptEvidence == WarehouseReceiptEvidence.ConflictingReceipt or receiptEvidence == WarehouseReceiptEvidence.Invalid);
            guarantee warehouseFinding == WarehouseFinding.Fault;
          case WAREHOUSE_ACTIVE_MISSING:
            assume sessionExpectation == SessionExpectation.ActiveTransfer and receiptEvidence == WarehouseReceiptEvidence.NoReceipt;
            guarantee warehouseFinding == WarehouseFinding.Missing;
          case WAREHOUSE_ACTIVE_MATCH:
            assume sessionExpectation == SessionExpectation.ActiveTransfer and receiptEvidence == WarehouseReceiptEvidence.MatchingReceipt;
            guarantee warehouseFinding == WarehouseFinding.Match;
          case WAREHOUSE_NONE_NEUTRAL:
            assume sessionExpectation == SessionExpectation.None and receiptEvidence == WarehouseReceiptEvidence.NoReceipt;
            guarantee warehouseFinding == WarehouseFinding.Neutral;
          case WAREHOUSE_NONE_UNEXPECTED:
            assume sessionExpectation == SessionExpectation.None and receiptEvidence == WarehouseReceiptEvidence.MatchingReceipt;
            guarantee warehouseFinding == WarehouseFinding.Fault;
          case WAREHOUSE_RECOVERY_NEUTRAL:
            assume sessionExpectation == SessionExpectation.RecoveryCheck and receiptEvidence == WarehouseReceiptEvidence.NoReceipt;
            guarantee warehouseFinding == WarehouseFinding.RecoveryNeutral;
          case WAREHOUSE_RECOVERY_UNEXPECTED:
            assume sessionExpectation == SessionExpectation.RecoveryCheck and receiptEvidence == WarehouseReceiptEvidence.MatchingReceipt;
            guarantee warehouseFinding == WarehouseFinding.Fault;
    }*/
                        
                
                           
                                                                                     
                                                       

             
                     
                           
                                                                                                           
                                                                            
                                                                                    
                                                                         
                                                                 
                            
                                                                                                          
                                                                            
                                                                                    
                                                                         
                                                                 
                           
                                                                                                               
                                                                            
                                                                         
                                                                   
                            
                                                                                             
                                                                            
                                                                               
                                                                 
                            
                                                                                           
                                                                  
                                                                         
                                                                   
                           
                                                                                          
                                                                  
                                                                               
                                                                 
                            
                                                                                                   
                                                                           
                                                                         
                                                                           
                           
                                                                                             
                                                                           
                                                                               
                                                                 
       
  }

  part def CompletionReconciler :> Thread {
    port shipFinding : DataPort { in :>> type : ShipFinding; }
    port warehouseFinding : DataPort { in :>> type : WarehouseFinding; }
    port verificationDisposition : DataPort { out :>> type : VerificationDisposition; }

    language "GUMBO" /*{
      initialize
        guarantee RECONCILER_INITIAL: verificationDisposition == VerificationDisposition.Neutral;
      compute
        compute_cases
          case RECONCILE_FAULT:
            assume shipFinding == ShipFinding.Fault or warehouseFinding == WarehouseFinding.Fault;
            guarantee verificationDisposition == VerificationDisposition.RecoveryRequired;
          case RECONCILE_RECOVERY_CLEARABLE:
            assume shipFinding == ShipFinding.RecoveryNeutral and warehouseFinding == WarehouseFinding.RecoveryNeutral;
            guarantee verificationDisposition == VerificationDisposition.RecoveryClearable;
          case RECONCILE_VERIFIED:
            assume shipFinding == ShipFinding.Complete and warehouseFinding == WarehouseFinding.Match;
            guarantee verificationDisposition == VerificationDisposition.Verified;
          case RECONCILE_MISSING:
            assume shipFinding == ShipFinding.NotComplete and warehouseFinding == WarehouseFinding.Missing;
            guarantee verificationDisposition == VerificationDisposition.Awaiting;
          case RECONCILE_OTHER_PARTIAL:
            assume (shipFinding == ShipFinding.Complete and warehouseFinding == WarehouseFinding.Missing) or
                   (shipFinding == ShipFinding.NotComplete and warehouseFinding == WarehouseFinding.Match);
            guarantee verificationDisposition == VerificationDisposition.Awaiting;
          case RECONCILE_NEUTRAL:
            assume shipFinding == ShipFinding.Neutral and warehouseFinding == WarehouseFinding.Neutral;
            guarantee verificationDisposition == VerificationDisposition.Neutral;
          case RECONCILE_INCONSISTENT:
            assume shipFinding != ShipFinding.Fault and warehouseFinding != WarehouseFinding.Fault and
                   not (shipFinding == ShipFinding.RecoveryNeutral and warehouseFinding == WarehouseFinding.RecoveryNeutral) and
                   not (shipFinding == ShipFinding.Complete and warehouseFinding == WarehouseFinding.Match) and
                   not (shipFinding == ShipFinding.NotComplete and warehouseFinding == WarehouseFinding.Missing) and
                   not (shipFinding == ShipFinding.Complete and warehouseFinding == WarehouseFinding.Missing) and
                   not (shipFinding == ShipFinding.NotComplete and warehouseFinding == WarehouseFinding.Match) and
                   not (shipFinding == ShipFinding.Neutral and warehouseFinding == WarehouseFinding.Neutral);
            guarantee verificationDisposition == VerificationDisposition.RecoveryRequired;
    }*/
                        
                
                           
                                                                                     
                                                                     

             
                     
                           
                                                                                   
                                                     
                                                              
                                                                                          
                           
                                                                                                               
                                                               
                                                                        
                                                                                           
                           
                                                                                                 
                                                        
                                                              
                                                                                  
                           
                                                                                                    
                                                           
                                                                
                                                                                  
                           
                                                                                                          
                                                          
                                                                    
                                                             
                                                                  
                                                                                  
                            
                                                                                               
                                                       
                                                                
                                                                                 
                            
                                                                                                         
                                                     
                                                               
                                                                    
                                                                            
                                                             
                                                                  
                                                                
                                                                    
                                                             
                                                                    
                                                                
                                                                  
                                                            
                                                                   
                                                                                          
       
  }

  part def CommandSafetyGate :> Thread {
    port commandProposal : DataPort { in :>> type : CommandProposal; }
    port serviceEligibility : DataPort { in :>> type : ServiceEligibility; }
    port shipCommand : DataPort { out :>> type : ShipCommand; }
    port receiptQuery : DataPort { out :>> type : WarehouseQuery; }

    language "GUMBO" /*{
      initialize
        guarantee COMMAND_GATE_INITIAL: shipCommand == ShipCommand.Hold and receiptQuery == WarehouseQuery.NoQuery;
      compute
        compute_cases
          case COMMAND_STOP_PRESERVED:
            assume commandProposal == CommandProposal.StopNoQuery;
            guarantee shipCommand == ShipCommand.StopOffload and receiptQuery == WarehouseQuery.NoQuery;
          case COMMAND_BEGIN_READY:
            assume commandProposal == CommandProposal.BeginWithQuery and serviceEligibility == ServiceEligibility.Ready;
            guarantee shipCommand == ShipCommand.BeginOffload and receiptQuery == WarehouseQuery.RequestReceipt;
          case COMMAND_QUERY_READY:
            assume commandProposal == CommandProposal.HoldWithQuery and serviceEligibility == ServiceEligibility.Ready;
            guarantee shipCommand == ShipCommand.Hold and receiptQuery == WarehouseQuery.RequestReceipt;
          case COMMAND_SUPPRESSED:
            assume commandProposal != CommandProposal.StopNoQuery and
                   not ((commandProposal == CommandProposal.BeginWithQuery or commandProposal == CommandProposal.HoldWithQuery) and serviceEligibility == ServiceEligibility.Ready);
            guarantee shipCommand == ShipCommand.Hold and receiptQuery == WarehouseQuery.NoQuery;
    }*/
                        
                
                           
                                                                                         
                                           
                                                 

             
                     
                            
                                                                                                    
                                                                  
                                                              
                                                             
                           
                                                                                                     
                                                                      
                                                                  
                                                               
                                                                    
                            
                                                                                  
                                                                     
                                                                  
                                                       
                                                                    
                                   
                                                                                                 
                                                                   
                                                                            
                                                                         
                                                                     
                                                       
                                                             
       
  }

  part def OutcomeReporter :> Thread {
    port sessionSnapshot : DataPort { in :>> type : SessionSnapshot; }
    port pilotReport : DataPort { out :>> type : PilotTransferReport; }
    port stationReport : DataPort { out :>> type : StationTransferReport; }

    language "GUMBO" /*{
      initialize
        guarantee REPORT_INITIAL: pilotReport == PilotTransferReport.Idle and stationReport == StationTransferReport.Idle;
      compute
        compute_cases
          case REPORT_RESET_COMPLETE:
            assume sessionSnapshot.next_state == SnapshotSessionState.Idle and sessionSnapshot.session_result == SnapshotSessionResult.ResetComplete;
            guarantee pilotReport == PilotTransferReport.ResetComplete and stationReport == StationTransferReport.ResetComplete;
          case REPORT_IDLE_CANCELLED:
            assume sessionSnapshot.next_state == SnapshotSessionState.Idle and sessionSnapshot.session_result == SnapshotSessionResult.Cancelled;
            guarantee pilotReport == PilotTransferReport.Cancelled and stationReport == StationTransferReport.Idle;
          case REPORT_IDLE_INHIBITED:
            assume sessionSnapshot.next_state == SnapshotSessionState.Idle and sessionSnapshot.session_result == SnapshotSessionResult.Inhibited;
            guarantee pilotReport == PilotTransferReport.Inhibited and stationReport == StationTransferReport.Idle;
          case REPORT_IDLE:
            assume sessionSnapshot.next_state == SnapshotSessionState.Idle and sessionSnapshot.session_result != SnapshotSessionResult.ResetComplete and
                   sessionSnapshot.session_result != SnapshotSessionResult.Cancelled and sessionSnapshot.session_result != SnapshotSessionResult.Inhibited;
            guarantee pilotReport == PilotTransferReport.Idle and stationReport == StationTransferReport.Idle;
          case REPORT_STARTED:
            assume sessionSnapshot.next_state == SnapshotSessionState.Commanding and sessionSnapshot.session_result == SnapshotSessionResult.Started;
            guarantee pilotReport == PilotTransferReport.Started and stationReport == StationTransferReport.OffloadActive;
          case REPORT_COMMANDING_PROGRESS:
            assume sessionSnapshot.next_state == SnapshotSessionState.Commanding and sessionSnapshot.session_result != SnapshotSessionResult.Started;
            guarantee pilotReport == PilotTransferReport.InProgress and stationReport == StationTransferReport.OffloadActive;
          case REPORT_AWAITING:
            assume sessionSnapshot.next_state == SnapshotSessionState.AwaitingEvidence;
            guarantee pilotReport == PilotTransferReport.InProgress and stationReport == StationTransferReport.VerificationPending;
          case REPORT_VERIFIED:
            assume sessionSnapshot.next_state == SnapshotSessionState.Verified;
            guarantee pilotReport == PilotTransferReport.Verified and stationReport == StationTransferReport.Verified;
          case REPORT_CANCEL_STOP:
            assume sessionSnapshot.next_state == SnapshotSessionState.StoppedByCancel;
            guarantee pilotReport == PilotTransferReport.Cancelled and stationReport == StationTransferReport.Stopped;
          case REPORT_SERVICE_STOP:
            assume sessionSnapshot.next_state == SnapshotSessionState.StoppedByUndock or sessionSnapshot.next_state == SnapshotSessionState.StoppedByService;
            guarantee pilotReport == PilotTransferReport.Inhibited and stationReport == StationTransferReport.Stopped;
          case REPORT_RECOVERY:
            assume sessionSnapshot.next_state == SnapshotSessionState.RecoveryRequired;
            guarantee pilotReport == PilotTransferReport.RecoveryRequired and stationReport == StationTransferReport.RecoveryRequired;
    }*/
                        
                
                           
                                                                            
                                                   
                                                      

             
                     
                           
                                                                                       
                                                                            
                                                                                         
                                                                        
                                                                           
                           
                                                                                              
                                                                            
                                                                                     
                                                                    
                                                                  
                           
                                                                                                                 
                                                                            
                                                                                     
                                                                    
                                                                  
                           
                                                                                  
                                                                            
                                                                                          
                                                                                      
                                                                                     
                                                               
                                                                  
                           
                                                                                               
                                                                                  
                                                                                   
                                                                  
                                                                           
                            
                                                                                                     
                                                                                  
                                                                                   
                                                                     
                                                                           
                           
                                                                                           
                                                                                       
                                                                     
                                                                                 
                           
                                                                                             
                                                                               
                                                                   
                                                                      
                           
                                                                                     
                                                                                      
                                                                    
                                                                     
                           
                                                                                           
                                                                                       
                                                                                       
                                                                    
                                                                     
                           
                                                                                        
                                                                                       
                                                                           
                                                                              
       
  }

  part def CargoTransferSupervisorProcess :> Process {
    part requestQualifier : RequestQualifier;
    part serviceReadinessQualifier : ServiceReadinessQualifier;
    part priorityArbiter : PriorityArbiter;
    part sessionController : SessionController;
    part shipEvidenceQualifier : ShipEvidenceQualifier;
    part warehouseEvidenceQualifier : WarehouseEvidenceQualifier;
    part completionReconciler : CompletionReconciler;
    part commandSafetyGate : CommandSafetyGate;
    part outcomeReporter : OutcomeReporter;

    port transferRequest : DataPort { in :>> type : TransferRequest; }
    port cargoState : DataPort { in :>> type : CargoState; }
    port serviceCondition : DataPort { in :>> type : DockServiceCondition; }
    port transferEvidence : DataPort { in :>> type : ShipTransferEvidence; }
    port receiptEvidence : DataPort { in :>> type : WarehouseReceiptEvidence; }
    port shipCommand : DataPort { out :>> type : ShipCommand; }
    port receiptQuery : DataPort { out :>> type : WarehouseQuery; }
    port pilotReport : DataPort { out :>> type : PilotTransferReport; }
    port stationReport : DataPort { out :>> type : StationTransferReport; }

    connection int01 : PortConnection connect transferRequest to requestQualifier.transferRequest;
    connection int02 : PortConnection connect cargoState to requestQualifier.cargoState;
    connection int03 : PortConnection connect serviceCondition to serviceReadinessQualifier.serviceCondition;
    connection int04 : PortConnection connect transferEvidence to shipEvidenceQualifier.transferEvidence;
    connection int05 : PortConnection connect receiptEvidence to warehouseEvidenceQualifier.receiptEvidence;
    connection int06 : PortConnection connect requestQualifier.qualifiedRequest to priorityArbiter.qualifiedRequest;
    connection int07 : PortConnection connect serviceReadinessQualifier.serviceEligibility to priorityArbiter.serviceEligibility;
    connection int08 : PortConnection connect sessionController.sessionPrestate to priorityArbiter.sessionPrestate;
    connection int09 : PortConnection connect priorityArbiter.admittedDirective to sessionController.admittedDirective;
    connection int10 : PortConnection connect sessionController.shipExpectation to shipEvidenceQualifier.sessionExpectation;
    connection int11 : PortConnection connect sessionController.warehouseExpectation to warehouseEvidenceQualifier.sessionExpectation;
    connection int12 : PortConnection connect shipEvidenceQualifier.shipFinding to completionReconciler.shipFinding;
    connection int13 : PortConnection connect warehouseEvidenceQualifier.warehouseFinding to completionReconciler.warehouseFinding;
    connection int14 : PortConnection connect completionReconciler.verificationDisposition to sessionController.verificationDisposition;
    connection int15 : PortConnection connect sessionController.commandProposal to commandSafetyGate.commandProposal;
    connection int16 : PortConnection connect serviceReadinessQualifier.gateEligibility to commandSafetyGate.serviceEligibility;
    connection int17 : PortConnection connect sessionController.sessionSnapshot to outcomeReporter.sessionSnapshot;
    connection int18 : PortConnection connect commandSafetyGate.shipCommand to shipCommand;
    connection int19 : PortConnection connect commandSafetyGate.receiptQuery to receiptQuery;
    connection int20 : PortConnection connect outcomeReporter.pilotReport to pilotReport;
    connection int21 : PortConnection connect outcomeReporter.stationReport to stationReport;
  }

  part def StationCargoTransferVerificationSystem :> System {
    part supervisorProcess : CargoTransferSupervisorProcess;

    port transferRequest : DataPort { in :>> type : TransferRequest; }
    port cargoState : DataPort { in :>> type : CargoState; }
    port serviceCondition : DataPort { in :>> type : DockServiceCondition; }
    port transferEvidence : DataPort { in :>> type : ShipTransferEvidence; }
    port receiptEvidence : DataPort { in :>> type : WarehouseReceiptEvidence; }
    port shipCommand : DataPort { out :>> type : ShipCommand; }
    port receiptQuery : DataPort { out :>> type : WarehouseQuery; }
    port pilotReport : DataPort { out :>> type : PilotTransferReport; }
    port stationReport : DataPort { out :>> type : StationTransferReport; }

    connection supportInt01 : PortConnection connect transferRequest to supervisorProcess.transferRequest;
    connection supportInt02 : PortConnection connect cargoState to supervisorProcess.cargoState;
    connection supportInt03 : PortConnection connect serviceCondition to supervisorProcess.serviceCondition;
    connection supportInt04 : PortConnection connect transferEvidence to supervisorProcess.transferEvidence;
    connection supportInt05 : PortConnection connect receiptEvidence to supervisorProcess.receiptEvidence;
    connection supportInt18 : PortConnection connect supervisorProcess.shipCommand to shipCommand;
    connection supportInt19 : PortConnection connect supervisorProcess.receiptQuery to receiptQuery;
    connection supportInt20 : PortConnection connect supervisorProcess.pilotReport to pilotReport;
    connection supportInt21 : PortConnection connect supervisorProcess.stationReport to stationReport;
  }

  part stationCargoTransferVerificationSupervisor : StationCargoTransferVerificationSystem;
}
