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

                        
                
                           
                                                                                          
                                                            

             
                     
                           
                                                                                         
                                                               
                                                    
                                                                      
                           
                                                                                        
                                                                  
                                                    
                                                                          
                           
                                                                                    
                                                                  
                                                  
                                                                       
                            
                                                                                     
                                                                   
                                                    
                                                                           
                            
                                                                                   
                                                                  
                                                    
                                                                          
                           
                                                                                
                                                     
                                                               
                                                                  
                                                                   
                                                                 
                                                                        
       
  }

  part def ServiceReadinessQualifier :> Thread {
    port serviceCondition : DataPort { in :>> type : DockServiceCondition; }
    port serviceEligibility : DataPort { out :>> type : ServiceEligibility; }
    port gateEligibility : DataPort { out :>> type : ServiceEligibility; }

                        
                
                           
                                                                                  
                                                               
                                                           

             
                     
                            
                                                                                          
                                                                              
                                                                      
                                                                  
                                   
                                                                                                
                                                                           
                                                                              
                                                                          
                            
                                                                                     
                                                                         
                                                                     
                                                                           
                                                                       
                           
                                                                             
                                                                    
                                                                             
                                                                         
       
  }

  part def PriorityArbiter :> Thread {
    port qualifiedRequest : DataPort { in :>> type : QualifiedRequest; }
    port serviceEligibility : DataPort { in :>> type : ServiceEligibility; }
    port sessionPrestate : DataPort { in :>> type : SessionState; }
    port admittedDirective : DataPort { out :>> type : AdmittedDirective; }

                        
                
                           
                                                                             
                                                      

             
                     
                                
                                                                                               
                                                                    
                                                                         
                                                                           
                           
                                                                                  
                                                                    
                                                                           
                                                                
                                                                      
                                                                           
                           
                                                                                        
                                                                    
                                                                        
                                                                
                                                                      
                                                                            
                           
                                                                                                    
                                                                         
                                                                   
                                                                
                                                                      
                                                                    
                            
                                                                                             
                                                                    
                                                                   
                                                                         
                                                                
                                                                      
                                                                  
                           
                                                                                         
                                                                    
                                                                           
                                                         
                                                                         
                                                                      
                                                                          
                                                                           
                           
                                                                                                  
                                                                    
                                                                        
                                                         
                                                                         
                                                                      
                                                                          
                                                                              
                            
                                                                                                                
                                                                    
                                                                   
                                                                          
                                                         
                                                                        
                                                                     
                                                                        
                                                                  
                           
                                                                                     
                                                                        
                                                                   
                                                        
                                                                   
                            
                                                                                       
                                                                     
                                                                   
                                                        
                                                                         
                           
                                                                                              
                                                                         
                                                                   
                                                        
                                                                    
                           
                                                                           
                                                                   
                                                         
                                                                    
                                                                        
                                                                     
                                                                        
                                                                  
                            
                                                                                       
                                                                        
                                                                   
                                                         
                                                               
                                                                    
                                                                   
                           
                                                                                                    
                                                                        
                                                                   
                                                                          
                                                         
                                                               
                                                                    
                                                                              
                           
                                                                                                     
                                                                    
                                                                          
                                                         
                                                               
                                                                     
                                                                       
                                                                  
       
  }

  part def SessionController :> Thread {
    port admittedDirective : DataPort { in :>> type : AdmittedDirective; }
    port verificationDisposition : DataPort { in :>> type : VerificationDisposition; }
    port sessionPrestate : DataPort { out :>> type : SessionState; }
    port shipExpectation : DataPort { out :>> type : SessionExpectation; }
    port warehouseExpectation : DataPort { out :>> type : SessionExpectation; }
    port commandProposal : DataPort { out :>> type : CommandProposal; }
    port sessionSnapshot : DataPort { out :>> type : SessionSnapshot; }

                        
           
                              
                                    

               
                         
                                                                        
                                                                                
                                                                                                 
                                                                                 
                                                                                               
                                                                                               
                                                                                                 
                                                                                                 
                                         

                
                           
                                                                                                        
                                             
                                                
                                                      
                                                           
                                                          
                                                                   
                                                                       

             
                        
                                                                                                      
                                              
                          
                                                                                                                              
                                                          
                                                                       
                                                                     
                                                                            
                                                                       
                                                                    
                                                                           
                                                          
                                                                
                                                                       
                                                           
                                                                  
                         
                                                                                      
                                                                     

                     
                            
                                                                                                      
                                                                 
                                                                        
                                                                          
                                                                                         
                                                                     
                                                                      
                                                                                               
                            
                                                                                                                
                                                                
                                                                      
                                                                          
                                                                                         
                                                                     
                                                                      
                                                                                               
                            
                                                                                                                           
                                                                 
                                                                        
                                                                         
                                                                                        
                                                                                
                                                                                          
                                                                     
                                                                      
                                                                                               
                            
                                                                                                                               
                                                                
                                                                      
                                                                         
                                                                                        
                                                                          
                                                                                  
                                                                                   
                                                                                     
                                                                          
                                                                                   
                                                                                   
                                                                                              
                                                                     
                                                                      
                                                                                               
                           
                                                                                           
                                                                 
                                                                        
                                                                         
                                                                                        
                                                                               
                                                                                        
                                                                    
                                                                      
                                                                                        
                           
                                                                                      
                                                                 
                                                                        
                                                                          
                                                                                        
                                                                               
                                                                                        
                                                                     
                                                                      
                                                                                        
                           
                                                                                            
                                                                 
                                                                        
                                                                  
                                                                                        
                                                                               
                                                                                        
                                                                    
                                                                      
                                                                                        
                           
                                                                                                                        
                                                                 
                                                                        
                                                                         
                                                                         
                                                                          
                                                                  
                                                                               
                                                             
                                                                      
                                                                                       
                           
                                                                                                           
                                                                 
                                                                        
                                                                         
                                                                         
                                                                          
                                                                  
                                                                               
                                                                     
                                                                        
                                                                                      
                           
                                                                                               
                                                                      
                                                                 
                                                                                        
                                                         
                                                                      
                                                                                            
                           
                                                                                                   
                                                                      
                                                                            
                                                                                        
                                                                     
                                                                      
                                                                                   
                           
                                                                                             
                                                                      
                                                                         
                                                                 
                                                                            
                                                                                        
                                                                     
                                                                      
                                                                                   
                           
                                                                                                
                                                               
                                                                      
                                                                      
                                                                        
                                                                 
                                                                              
                                                         
                                                                      
                                                                                            
                           
                                                                                    
                                                               
                                                                      
                                                                      
                                                                        
                                                                         
                                                                 
                                                                              
                                                        
                                                                      
                                                                                   
                           
                                                                                             
                                                          
                                                                 
                                                                              
                                                               
                                                                         
                                                                                      
                           
                                                                                              
                                                          
                                                                  
                                                                              
                                                         
                                                                      
                                                                                        
                           
                                                                                         
                                                          
                                                                        
                                                                             
                                                                          
                                                                            
                                                                              
                                                         
                                                                      
                                                                                        
                           
                                                                                     
                                                          
                                                                         
                                                                 
                                                                  
                                                                       
                                                                            
                                                                         
                                                                          
                                                                              
                                                         
                                                                      
                                                                                   
       
  }

  part def ShipEvidenceQualifier :> Thread {
    port transferEvidence : DataPort { in :>> type : ShipTransferEvidence; }
    port sessionExpectation : DataPort { in :>> type : SessionExpectation; }
    port shipFinding : DataPort { out :>> type : ShipFinding; }

                        
                
                           
                                                                           
                                             

             
                     
                           
                                                                                                      
                                                                            
                                                                     
                                                                      
                                                       
                            
                                                                                                               
                                                                            
                                                                     
                                                                      
                                                       
                            
                                                                                                     
                                                                            
                                                                   
                                                                     
                                                             
                            
                                                                                               
                                                                            
                                                                     
                                                          
                            
                                                                                         
                                                                  
                                                                 
                                                         
                           
                                                                                               
                                                                  
                                                                     
                                                                       
                                                       
                            
                                                                                            
                                                                           
                                                                 
                                                                 
                           
                                                                                            
                                                                           
                                                                     
                                                                       
                                                       
       
  }

  part def WarehouseEvidenceQualifier :> Thread {
    port receiptEvidence : DataPort { in :>> type : WarehouseReceiptEvidence; }
    port sessionExpectation : DataPort { in :>> type : SessionExpectation; }
    port warehouseFinding : DataPort { out :>> type : WarehouseFinding; }

                        
                
                           
                                                                                     
                                                       

             
                     
                           
                                                                                                           
                                                                            
                                                                                    
                                                                         
                                                                 
                            
                                                                                                          
                                                                            
                                                                                    
                                                                         
                                                                 
                           
                                                                                                               
                                                                            
                                                                         
                                                                   
                            
                                                                                             
                                                                            
                                                                               
                                                                 
                            
                                                                                           
                                                                  
                                                                         
                                                                   
                           
                                                                                          
                                                                  
                                                                               
                                                                 
                            
                                                                                                   
                                                                           
                                                                         
                                                                           
                           
                                                                                             
                                                                           
                                                                               
                                                                 
       
  }

  part def CompletionReconciler :> Thread {
    port shipFinding : DataPort { in :>> type : ShipFinding; }
    port warehouseFinding : DataPort { in :>> type : WarehouseFinding; }
    port verificationDisposition : DataPort { out :>> type : VerificationDisposition; }

                        
                
                           
                                                                                     
                                                                     

             
                     
                           
                                                                                   
                                                     
                                                              
                                                                                          
                           
                                                                                                               
                                                               
                                                                        
                                                                                           
                           
                                                                                                 
                                                        
                                                              
                                                                                  
                           
                                                                                                    
                                                           
                                                                
                                                                                  
                           
                                                                                                          
                                                          
                                                                    
                                                             
                                                                  
                                                                                  
                            
                                                                                               
                                                       
                                                                
                                                                                 
                            
                                                                                                         
                                                     
                                                               
                                                                    
                                                                            
                                                             
                                                                  
                                                                
                                                                    
                                                             
                                                                    
                                                                
                                                                  
                                                            
                                                                   
                                                                                          
       
  }

  part def CommandSafetyGate :> Thread {
    port commandProposal : DataPort { in :>> type : CommandProposal; }
    port serviceEligibility : DataPort { in :>> type : ServiceEligibility; }
    port shipCommand : DataPort { out :>> type : ShipCommand; }
    port receiptQuery : DataPort { out :>> type : WarehouseQuery; }

                        
                
                           
                                                                                         
                                           
                                                 

             
                     
                            
                                                                                                    
                                                                  
                                                              
                                                             
                           
                                                                                                     
                                                                      
                                                                  
                                                               
                                                                    
                            
                                                                                  
                                                                     
                                                                  
                                                       
                                                                    
                                   
                                                                                                 
                                                                   
                                                                            
                                                                         
                                                                     
                                                       
                                                             
       
  }

  part def OutcomeReporter :> Thread {
    port sessionSnapshot : DataPort { in :>> type : SessionSnapshot; }
    port pilotReport : DataPort { out :>> type : PilotTransferReport; }
    port stationReport : DataPort { out :>> type : StationTransferReport; }

                        
                
                           
                                                                            
                                                   
                                                      

             
                     
                           
                                                                                       
                                                                            
                                                                                         
                                                                        
                                                                           
                           
                                                                                              
                                                                            
                                                                                     
                                                                    
                                                                  
                           
                                                                                                                 
                                                                            
                                                                                     
                                                                    
                                                                  
                           
                                                                                  
                                                                            
                                                                                          
                                                                                      
                                                                                     
                                                               
                                                                  
                           
                                                                                               
                                                                                  
                                                                                   
                                                                  
                                                                           
                            
                                                                                                     
                                                                                  
                                                                                   
                                                                     
                                                                           
                           
                                                                                           
                                                                                       
                                                                     
                                                                                 
                           
                                                                                             
                                                                               
                                                                   
                                                                      
                           
                                                                                     
                                                                                      
                                                                    
                                                                     
                           
                                                                                           
                                                                                       
                                                                                       
                                                                    
                                                                     
                           
                                                                                        
                                                                                       
                                                                           
                                                                              
       
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
