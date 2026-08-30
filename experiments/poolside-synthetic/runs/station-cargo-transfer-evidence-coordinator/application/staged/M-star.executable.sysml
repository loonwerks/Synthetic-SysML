package Mining_Cargo_Transfer_Evidence_Coordinator {
  private import HAMR::*;

  enum def TransferRequest { enum NONE; enum INVALID; enum START_A; enum START_B; enum CANCEL_A; enum CANCEL_B; }
  enum def DockContext { enum INVALID; enum IN_GRID; enum ON_WARP; enum DOCKED_WITHHELD; enum DOCKED_READY; }
  enum def ShipReport { enum NONE; enum INVALID; enum ACCEPTED_A; enum ACCEPTED_B; enum MOVING_A; enum MOVING_B; enum COMPLETE_A; enum COMPLETE_B; enum FAILED_A; enum FAILED_B; }
  enum def WarehouseReport { enum NONE; enum INVALID; enum PENDING_A; enum PENDING_B; enum STORED_A; enum STORED_B; enum REJECTED_A; enum REJECTED_B; }
  enum def ControlEvent { enum NONE; enum EMERGENCY_STOP; enum RESET; enum VERIFY_OK; }

  enum def Correlation { enum NONE; enum A; enum B; }
  enum def TransferAction { enum HOLD; enum BEGIN_TRANSFER; enum CONTINUE_TRANSFER; enum REQUEST_WAREHOUSE_VERIFY; enum CANCEL_TRANSFER; }
  enum def DecisionCause { enum FAULT_OR_RECOVERY; enum CANCEL_REQUEST; enum WAREHOUSE_CONFIRMATION; enum SHIP_PROGRESS; enum NEW_TRANSFER; enum NO_ELIGIBLE_ACTION; }
  enum def CoordinationMode { enum HOLDING; enum COMMANDING_SHIP; enum VERIFYING_WAREHOUSE; enum FAULT; }
  enum def RequestDisposition { enum NO_REQUEST; enum ACCEPTED; enum DUPLICATE; enum REJECTED; enum DEFERRED; enum CANCEL_ACCEPTED; }
  enum def TransferOutcome { enum NONE; enum ACTIVE; enum COMPLETED; enum CANCELLED; enum RECOVERY_REQUIRED; }
  enum def RequestLedger { enum NO_HISTORY; enum A_LAST; enum B_LAST; }
  enum def SessionState { enum IDLE; enum AWAIT_SHIP_A; enum AWAIT_SHIP_B; enum TRANSFERRING_A; enum TRANSFERRING_B; enum AWAIT_WAREHOUSE_A; enum AWAIT_WAREHOUSE_B; }
  enum def ShipEvidenceState { enum CLEAR; enum ACKNOWLEDGED; enum MOVING; enum COMPLETE; }
  enum def WarehouseEvidenceState { enum CLEAR; enum PENDING; }
  enum def RecoveryState { enum HEALTHY; enum LATCHED; enum RECOVERING; }

  enum def RequestKind { enum NONE; enum START; enum CANCEL; enum INVALID; }
  enum def DockReason { enum READY; enum NOT_DOCKED; enum PERMISSION_WITHHELD; enum INVALID_CONTEXT; }
  enum def ShipReportClass { enum NO_EVENT; enum ACCEPTED; enum MOVING; enum COMPLETE; enum FAILED; enum INVALID; }
  enum def ShipReportValue { enum NONE; enum INVALID; enum ACCEPTED_A; enum ACCEPTED_B; enum MOVING_A; enum MOVING_B; enum COMPLETE_A; enum COMPLETE_B; enum FAILED_A; enum FAILED_B; }
  enum def WarehouseReportClass { enum NO_EVENT; enum PENDING; enum STORED; enum REJECTED; enum INVALID; }
  enum def WarehouseReportValue { enum NONE; enum INVALID; enum PENDING_A; enum PENDING_B; enum STORED_A; enum STORED_B; enum REJECTED_A; enum REJECTED_B; }

  part def RequestFacts :> Data {
    attribute kind : RequestKind;
    attribute correlation : Correlation;
    attribute requestValidity : Base_Types::Boolean;
    attribute present : Base_Types::Boolean;
  }
  part def DockFacts :> Data {
    attribute usable : Base_Types::Boolean;
    attribute docked : Base_Types::Boolean;
    attribute permissionGranted : Base_Types::Boolean;
    attribute startReady : Base_Types::Boolean;
    attribute reason : DockReason;
  }
  part def ShipReportFacts :> Data {
    attribute reportClass : ShipReportClass;
    attribute correlation : Correlation;
    attribute usable : Base_Types::Boolean;
    attribute shipValue : ShipReportValue;
  }
  part def WarehouseReportFacts :> Data {
    attribute reportClass : WarehouseReportClass;
    attribute correlation : Correlation;
    attribute usable : Base_Types::Boolean;
    attribute warehouseValue : WarehouseReportValue;
  }

  part def AdmissionDecision :> Data {
    attribute kind : RequestKind;
    attribute correlation : Correlation;
    attribute disposition : RequestDisposition;
    attribute updateLedger : RequestLedger;
  }
  part def SessionView :> Data {
    attribute session : SessionState;
    attribute correlation : Correlation;
  }
  enum def ProgressClass { enum NONE; enum SHIP_ACCEPTED; enum SHIP_MOVING; enum SHIP_COMPLETE; enum WAREHOUSE_PENDING; enum WAREHOUSE_STORED; }
  enum def FaultTrigger { enum CLEAR; enum TRIGGERED; }
  enum def RecoveryIntent { enum RETAIN; enum LATCH; enum BEGIN_RECOVERY; enum OPEN_RECOVERY; }
  enum def OrdinaryInhibition { enum OPEN; enum INHIBITED; }
  part def CoordinationFrame :> Data {
    attribute progress : ProgressClass;
    attribute correlation : Correlation;
    attribute faultTrigger : FaultTrigger;
    attribute recoveryIntent : RecoveryIntent;
    attribute inhibitOrdinary : OrdinaryInhibition;
    attribute outcomePulse : TransferOutcome;
  }
  part def RecoveryTransition :> Data {
    attribute faultTrigger : FaultTrigger;
    attribute recoveryIntent : RecoveryIntent;
  }
  part def CoordinationGuard :> Data {
    attribute faultTrigger : FaultTrigger;
    attribute inhibitOrdinary : OrdinaryInhibition;
  }
  enum def ShipUpdate { enum FREEZE; enum RETAIN; enum ACKNOWLEDGE; enum MARK_MOVING; enum MARK_COMPLETE; enum CLEAR; }
  enum def WarehouseUpdate { enum FREEZE; enum RETAIN; enum MARK_PENDING; enum CLEAR; }
  enum def PriorityKind { enum FAULT_OR_RECOVERY; enum COMPLETION; enum ORDINARY; }
  part def PriorityDirective :> Data {
    attribute kind : PriorityKind;
    attribute correlation : Correlation;
  }
  enum def ProposalKind { enum NONE; enum START; enum CANCEL; enum SHIP_PROGRESS; enum WAREHOUSE_VERIFY; }
  part def ActionProposal :> Data {
    attribute kind : ProposalKind;
    attribute actionValue : TransferAction;
    attribute correlation : Correlation;
  }
  enum def DecisionOutcomeValue { enum NONE; enum ACTIVE; enum COMPLETED; enum CANCELLED; enum RECOVERY_REQUIRED; }
  part def TransferDecision :> Data {
    attribute actionValue : TransferAction;
    attribute cause : DecisionCause;
    attribute correlation : Correlation;
    attribute outcomeValue : DecisionOutcomeValue;
  }
  enum def PublicRequestDisposition { enum NO_REQUEST; enum ACCEPTED; enum DUPLICATE; enum REJECTED; enum DEFERRED; enum CANCEL_ACCEPTED; }
  enum def PublicTransferOutcome { enum NONE; enum ACTIVE; enum COMPLETED; enum CANCELLED; enum RECOVERY_REQUIRED; }
  part def TransferCoordinationResult :> Data {
    attribute actionValue : TransferAction;
    attribute cause : DecisionCause;
    attribute mode : CoordinationMode;
    attribute correlation : Correlation;
    attribute requestDisposition : PublicRequestDisposition;
    attribute outcomeValue : PublicTransferOutcome;
  }

  part def RequestAcquisition :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port transfer_request : DataPort { in :>> type : TransferRequest; }
    port request_facts : DataPort { out :>> type : RequestFacts; }

                        
                
                 
                               
                                                                                  
                                                    
                                                           
                                                
                                       
             
                     
                           
                                                               
                                                            
                                                                                                              
                                                                              
                           
                                                                                                         
                                                                                                              
                                                                                                          
                                                                                       
                                                                                                                  
                                                            
                                                                                                                    
                                                             
                                                                                                                   
                                                               
                                                                                                                   
                                                              
                           
                                                                             
                                                               
                                                                                                                 
                                                                              
       
  }
  part def DockContextAssessment :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port dock_context : DataPort { in :>> type : DockContext; }
    port dock_facts : DataPort { out :>> type : DockFacts; }

                        
                
                 
                               
                                                                         
                                                             
                                                                            
                                                            
             
                     
                           
                                                                              
                                                            
                                                                       
                                                                              
                                                    
                           
                                                                                                
                                                                                              
                                                          
                                                                           
                                                                    
                                                                             
                                                                        
                                                                                                  
                                                                             
                                                              
                           
                                                                                           
                                                       
                                                                       
                                                                              
                                                              
       
  }
  part def ShipReportAcquisition :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port ship_report : DataPort { in :>> type : ShipReport; }
    port ship_report_facts : DataPort { out :>> type : ShipReportFacts; }

                        
                
                 
                               
                                                                           
                                                                       
                                                                                               
                                                                
             
                     
                           
                                                                           
                                                  
                                                                                 
                                                                                                 
                                                                  
                           
                                                                                                      
                                                                                                
                                                                                       
                                                                                          
                                                     
                                                                                                                            
                                                                                                                            
                                                                                                                        
                                                                                                                        
                                                                                                                            
                                                                                                                            
                                                                                                    
                                                                              
                                                                                                
                                                                            
                                                                                                    
                                                                              
                                                                                           
                                                                                                                 
                                                                                           
                                                                                                                
                           
                                                                                                           
                                                                                           
                                                 
                                                     
                                                                                                                      
                                                                                                                        
                                                                                                                        
                                                          
                                                                                                                                 
                                                           
                                                                                                                             
                                                           
                                                                                                                            
       
  }
  part def WarehouseReportAcquisition :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port warehouse_report : DataPort { in :>> type : WarehouseReport; }
    port warehouse_report_facts : DataPort { out :>> type : WarehouseReportFacts; }

                        
                
                 
                               
                                                                                     
                                                                                 
                                                                                                         
                                                                               
             
                     
                           
                                                                                     
                                                            
                                                                                           
                                                                                                           
                                                                                 
                           
                                                                                                                
                                                                                                                  
                                                                                                          
                                                          
                                                                                                                                                   
                                                                                                                                                   
                                                                                                                                                 
                                                                                                                                                 
                                                                                                                      
                                                                                       
                                                                                                                    
                                                                                      
                                                                                                                     
                                                                        
                                                                                                                     
                                                                       
                           
                                                                                                                       
                                                                                                                 
                                                             
                                                          
                                                                                                                                               
                                                                                                                                                     
                                                                                                                                                     
                                                                    
                                                                                                                                                
                                                                       
                                                                                                                                              
                                                                       
                                                                                                                                             
       
  }
  part def RequestAdmission :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port request_facts : DataPort { in :>> type : RequestFacts; }
    port dock_facts : DataPort { in :>> type : DockFacts; }
    port prior_session_view : DataPort { in :>> type : SessionView; }
    port coordination_guard : DataPort { in :>> type : CoordinationGuard; }
    port admission_decision : DataPort { out :>> type : AdmissionDecision; }
    port request_disposition : DataPort { out :>> type : RequestDisposition; }

                        
           
                         
                                      
                
                 
                               
                                                                                   
                                                       
                                                                                                              
                                                                             
                                                                         
                                                                 
             
                     
                           
                                                                                                     
                                              
                                                                                                        
                                                                  
                                                                               
                                                                    
                                                                   
                           
                                                                                                         
                                                                                   
                                                                                                           
                                                                                                                                  
                                                                                                                        
                           
                                                                                                       
                                                                                                 
                                                                             
                                                                                            
                                                                                                         
                                                                                                         
                                                                    
                                                                           
                                                                             
                                                                  
                                                                   
                                                                                                                    
                                                                   
                                                                                                                   
                           
                                                                                              
                                                                                                 
                                                                             
                                                                                                         
                                                                                                         
                                                                                                         
                                                                           
                                                                              
                                                                                                                         
                           
                                                                                                   
                                                                                                 
                                                                             
                                                                                            
                                                                                                         
                                                                                                         
                                                                                                         
                                                                           
                                                                             
                                                                                                                        
                           
                                                                                                    
                                                                                    
                                                                                     
                                                                                                                         
                                                                 
                                                                                                           
                                                                                                             
                                                                                                          
                                                                           
                                                                             
                                                                                                                        
                           
                                                                                                      
                                                                                                  
                                                                             
                                                            
                                                                          
                                                                            
                                                                                 
                                                            
                                                                          
                                                                            
                                                                                 
                                                                                                          
                                                                           
                                                                                    
                                                                    
                                                                        
                           
                                                                                          
                                                                                                  
                                                                             
                                                                
                                                            
                                                                          
                                                                            
                                                                                 
                                                            
                                                                          
                                                                            
                                                                                 
                                                                                                          
                                                                           
                                                                             
                                                                                                                        
       
  }
  part def EvidenceCoherence :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port ship_report_facts : DataPort { in :>> type : ShipReportFacts; }
    port warehouse_report_facts : DataPort { in :>> type : WarehouseReportFacts; }
    port control_event : DataPort { in :>> type : ControlEvent; }
    port prior_recovery_state : DataPort { in :>> type : RecoveryState; }
    port prior_session_view : DataPort { in :>> type : SessionView; }
    port prior_ship_evidence : DataPort { in :>> type : ShipEvidenceState; }
    port prior_warehouse_evidence : DataPort { in :>> type : WarehouseEvidenceState; }
    port recovery_transition : DataPort { out :>> type : RecoveryTransition; }
    port coordination_guard : DataPort { out :>> type : CoordinationGuard; }
    port coordination_frame : DataPort { out :>> type : CoordinationFrame; }
    port ship_update : DataPort { out :>> type : ShipUpdate; }
    port warehouse_update : DataPort { out :>> type : WarehouseUpdate; }
    port priority_directive : DataPort { out :>> type : PriorityDirective; }

                        
                
                 
                               
                                                                                           
                                                                                                                                  
                                                                                                                                   
                                                                                                                    
                                                                                                                                
                                                                                                                                     
                                                                                           
                                                                                                                  
             
                     
                           
                                                                                                                                                 
                                                                 
                                             
                                                  
                                                                          
                                                                                     
                                                                
                                                                
                                                                            
                                                                         
                                                                          
                                                                                                                          
                                                                            
                                                                           
                                                                            
                                                                                                                           
                                                                            
                                                                              
                                                                               
                                                                   
                                                                          
                                                                                 
                                                                 
                                                                              
                                                                                
                                                                                    
                                                                                      
                                                                               
                                                                                 
                                                                                  
                                                                          
                                                                         
                                                                                  
                                                                 
                                                                                
                                                                         
                                                                         
                                                                                  
                                                                                    
                                                                                             
                                                                         
                                                                               
                           
                                                                                                                     
                                                                 
                                                                                  
                                                                          
                                                                                     
                                                                     
                                                                                                                                
                                                                                                                                      
                                                                                                                            
                                                                              
                                                                                                                                          
                                                                                                                             
                                                                              
                                                                                                                                                
                                                                     
                                                                            
                                                                                   
                                                                   
                                                                                
                                                                                  
                                                                                      
                                                                                        
                                                                                 
                                                                                     
                                                                                                   
                                                                              
                                                                     
                                                                                  
                                                                 
                                                                                
                                                                     
                                                                                  
                                                                                    
                                                                                             
                                                                         
                                                                                
                                                                                                            
                                                                                      
                                                                                       
                                                                                                                   
                                                                                     
                                                                                      
                                                                                                            
                                                                                                                      
                                                                              
                                                                               
                           
                                                                                                                 
                                                                                                       
                                                                                   
                                                                                                         
                                                                               
                                                                        
                                                                        
                                                                          
                                                                           
                                                                         
                                                                                
                                                                 
                                                                          
                                                                           
                                                                                  
                                                                        
                                                                    
                                                                       
                                                                                                                                            
                                                                                                                                     
                                                                                                                                       
                                                                          
                                                                                                                                       
                                                                                                             
                                                                               
                                                                                  
                                                                                                                       
                                                                                
                                                                                                                     
                                                                                  
                                                                                                                        
                           
                                                                                                                                         
                                                                                                       
                                                                                                              
                                                                                     
                                                                                                                    
                                                                             
                                                                                                                                       
                                                                                                                            
                                                                             
                                                                                                                                           
                                                                                                                             
                                                                             
                                                                                                                                                 
                                                                        
                                                                                     
                                                                                      
                                                                               
                                                                                
                                                                    
                                                                                                                                            
                                                                                                                                     
                                                                                                                                  
                                                                             
                                                                                            
                                                                                                                                       
                                                                                                             
                                                                                                                
                                                                                     
                                                                                           
                                                                                 
                                                                                       
                                                                                                             
                                                                                                                      
                                                                                         
                                                                                          
                                                                                
                                                                                       
                                                                                                                 
                                                                                                                 
                                                                                        
       
  }
  part def TransferSession :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    port coordination_frame : DataPort { in :>> type : CoordinationFrame; }
    port prior_session_view : DataPort { out :>> type : SessionView; }

                        
           
                         
                                    
                
                 
                               
                                                                                      
                                                                                                 
                                                               
             
                 
                           
                                                                                                                                        
                                                            
                                                            
                                                                     
                                                                                                               
                                                                         
                                                                  
                                                                                                               
                                                                         
                                                                  
                                                                                         
                                                   
                                                                             
                                                                                           
                                                    
                                                                             
                                                                             
                                                                      
                                                            
                                                                             
                                                                             
                                                                      
                                                            
                                                                             
                                                                                    
                                                                             
                                                                           
                                                                          
                                                                      
                                                              
                                                                             
                                                                                    
                                                                             
                                                                           
                                                                          
                                                                      
                                                              
                                                                             
                                                                                    
                                                                             
                                                                          
                                                                      
                                                                 
                                                                             
                                                                                    
                                                                             
                                                                          
                                                                      
                                                                 
                                                                             
                                                                                    
                                                                             
                                                                                    
                                                    
                                                                             
                                                                                    
                                                                             
                                                                          
                                                                        
                                                                          
                                                                                    
                                                  
       
  }
  part def ShipEvidenceLifecycle :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port ship_update : DataPort { in :>> type : ShipUpdate; }
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    port prior_ship_evidence : DataPort { out :>> type : ShipEvidenceState; }

                        
           
                         
                                              
                
                 
                               
                                                               
                                                                                                          
             
                 
                           
                                                                                                                               
                                                          
                                                                                                       
                                                
                                                                                     
                                                                                      
                                                               
                                                
                                                                                    
                                                                             
                                                            
                                                                      
                                                
                                                                                    
                                                                             
                                                            
                                                                
                                                
                                                                                    
                                                                             
                                                              
                                                                  
                                                
                                                                                    
                                                                             
                                                      
                                                               
                                                
                                                                                    
                                                                                    
                                                            
       
  }
  part def WarehouseEvidenceLifecycle :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port warehouse_update : DataPort { in :>> type : WarehouseUpdate; }
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    port prior_warehouse_evidence : DataPort { out :>> type : WarehouseEvidenceState; }

                        
           
                         
                                                        
                
                 
                               
                                                                         
                                                                    
                                                                     
             
                 
                           
                                                                                                                                         
                                                                    
                                                                 
                                                                       
                                                          
                                                                                     
                                                                                      
                                                                         
                                                          
                                                                                    
                                                                             
                                                                       
                                                                           
                                                          
                                                                                    
                                                                             
                                                                
                                                                         
                                                          
                                                                                    
                                                                                    
                                                                      
       
  }
  part def RecoverySupervisor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port recovery_transition : DataPort { in :>> type : RecoveryTransition; }
    port prior_recovery_state : DataPort { out :>> type : RecoveryState; }

                        
           
                         
                                      
                
                 
                               
                                                       
                                                                                                   
             
                 
                           
                                                                                                        
                                                       
                                                                          
                                                                                 
                                                         
                                                                      
                                                                                   
                                                                 
                                                            
                                                                      
                                                                                  
                                                                    
                                                         
                                                                      
                                                                                         
                                                              
                                                                                     
                                                                         
                                                    
       
  }
  part def RequestActionEligibility :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    port request_proposal : DataPort { out :>> type : ActionProposal; }

                        
                
                 
                               
                                                                                   
                                                                                                              
                                                             
             
                 
                           
                                                                                                            
                                                                                    
                                                            
                                                                              
                                                                                 
                                                                                           
                                                             
                                                                               
                                                                                 
                                                                             
                                                                                           
                                                           
                                                                    
                                                                  
       
  }
  part def ShipProgressEligibility :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port prior_session_view : DataPort { in :>> type : SessionView; }
    port prior_ship_evidence : DataPort { in :>> type : ShipEvidenceState; }
    port ship_proposal : DataPort { out :>> type : ActionProposal; }

                        
                
                 
                               
                                                                             
                                                                                                        
                                                          
             
                 
                           
                                                                                                   
                                                                         
                                                                          
                                                                
                                                                         
                                                                           
                                                                            
                                                                       
                                                                          
                                                                 
                                                                              
                                                                              
                                                                              
                                                                           
                                                                 
                                                                          
                                                                            
                                                                             
                                                                        
                                                                           
                                                        
                                                                 
                                                                
       
  }
  part def WarehouseVerificationEligibility :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port prior_session_view : DataPort { in :>> type : SessionView; }
    port prior_ship_evidence : DataPort { in :>> type : ShipEvidenceState; }
    port prior_warehouse_evidence : DataPort { in :>> type : WarehouseEvidenceState; }
    port warehouse_proposal : DataPort { out :>> type : ActionProposal; }

                        
                
                 
                               
                                                                                       
                                                          
                                                                   
                                                               
             
                 
                           
                                                                                                                
                                                                             
                                                                              
                                                                 
                                                                         
                                                                                   
                                                                         
                                                                                          
                                                                                   
                                                                                  
                                                                               
                                                                  
                                                                          
                                                                                    
                                                             
                                                                      
                                                                     
       
  }
  part def TransferActionArbitration :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port request_proposal : DataPort { in :>> type : ActionProposal; }
    port ship_proposal : DataPort { in :>> type : ActionProposal; }
    port warehouse_proposal : DataPort { in :>> type : ActionProposal; }
    port priority_directive : DataPort { in :>> type : PriorityDirective; }
    port transfer_decision : DataPort { out :>> type : TransferDecision; }

                        
                
                 
                               
                                                                                   
                                                                  
                                                                         
                                                               
                                                                        
             
                 
                           
                                                                                                               
                                                                                
                                                                     
                                                                           
                                                                                
                                                                                           
                                                                         
                                                                     
                                                                                
                                                                                
                                                                                   
                                                                
                                                                   
                                                                                
                                                                        
                                                                              
                                                                                   
                                                                
                                                            
                                                                               
                                                                                         
                                                                                
                                                                                
                                                                                
                                                                
                                                            
                                                                        
                                                                       
                                                                                  
                                                                       
                                                                           
                                                                                
                                                                
                                                            
                                                                        
                                                                
                                                                  
                                                                               
                                                                      
                                                                              
                                                                                
                                                                
                                                            
                                                                        
                                                                
                                                                  
                                                                     
                                                                            
                                                                  
                                                                             
       
  }
  part def ResultComposition :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port transfer_decision : DataPort { in :>> type : TransferDecision; }
    port request_disposition : DataPort { in :>> type : RequestDisposition; }
    port transfer_result : DataPort { out :>> type : TransferCoordinationResult; }

                        
                
                 
                               
                                                                                             
                                                                
                                                                       
                                                              
                                                             
                                                                                       
                                                                       
             
                 
                           
                                                                                                                   
                                                                          
                                                              
                                                                          
                                                                           
                                                                                            
                                                                         
                                                                                          
                                                                          
                                                                                           
                                                                         
                                                                                          
                                                                         
                                                                                          
                                                                                
                                                                                                 
                                                                                  
                                                                             
                                                                                    
                                                                               
                                                                                       
                                                                                  
                                                                                       
                                                                                  
                                                                                               
                                                                                          
                                                                                 
                                                                 
                                                                          
                                                                           
                                                                   
                                                                              
                                                                                 
                                                                                      
                                                                           
                                                                                               
                                                                              
       
  }

  part def CargoCoordinationProcess :> Process {
    port transferRequest : DataPort { in :>> type : TransferRequest; }
    port dockContext : DataPort { in :>> type : DockContext; }
    port shipReport : DataPort { in :>> type : ShipReport; }
    port warehouseReport : DataPort { in :>> type : WarehouseReport; }
    port controlEvent : DataPort { in :>> type : ControlEvent; }
    port transferResult : DataPort { out :>> type : TransferCoordinationResult; }

    part request_acquisition : RequestAcquisition;
    part dock_context_assessment : DockContextAssessment;
    part ship_report_acquisition : ShipReportAcquisition;
    part warehouse_report_acquisition : WarehouseReportAcquisition;
    part request_admission : RequestAdmission;
    part evidence_coherence : EvidenceCoherence;
    part transfer_session : TransferSession;
    part ship_evidence_lifecycle : ShipEvidenceLifecycle;
    part warehouse_evidence_lifecycle : WarehouseEvidenceLifecycle;
    part recovery_supervisor : RecoverySupervisor;
    part request_action_eligibility : RequestActionEligibility;
    part ship_progress_eligibility : ShipProgressEligibility;
    part warehouse_verification_eligibility : WarehouseVerificationEligibility;
    part transfer_action_arbitration : TransferActionArbitration;
    part result_composition : ResultComposition;

    connection int01 : PortConnection connect transferRequest to request_acquisition.transfer_request;
    connection int02 : PortConnection connect dockContext to dock_context_assessment.dock_context;
    connection int03 : PortConnection connect shipReport to ship_report_acquisition.ship_report;
    connection int04 : PortConnection connect warehouseReport to warehouse_report_acquisition.warehouse_report;
    connection int05 : PortConnection connect controlEvent to evidence_coherence.control_event;
    connection int06 : PortConnection connect result_composition.transfer_result to transferResult;
    connection int07 : PortConnection connect request_acquisition.request_facts to request_admission.request_facts;
    connection int08 : PortConnection connect dock_context_assessment.dock_facts to request_admission.dock_facts;
    connection int09 : PortConnection connect ship_report_acquisition.ship_report_facts to evidence_coherence.ship_report_facts;
    connection int10 : PortConnection connect warehouse_report_acquisition.warehouse_report_facts to evidence_coherence.warehouse_report_facts;
    connection int11 : PortConnection connect transfer_session.prior_session_view to request_admission.prior_session_view;
    connection int12 : PortConnection connect recovery_supervisor.prior_recovery_state to evidence_coherence.prior_recovery_state;
    connection int13 : PortConnection connect transfer_session.prior_session_view to evidence_coherence.prior_session_view;
    connection int14 : PortConnection connect ship_evidence_lifecycle.prior_ship_evidence to evidence_coherence.prior_ship_evidence;
    connection int15 : PortConnection connect warehouse_evidence_lifecycle.prior_warehouse_evidence to evidence_coherence.prior_warehouse_evidence;
    connection int16 : PortConnection connect evidence_coherence.recovery_transition to recovery_supervisor.recovery_transition;
    connection int17 : PortConnection connect evidence_coherence.coordination_guard to request_admission.coordination_guard;
    connection int18 : PortConnection connect request_admission.admission_decision to transfer_session.admission_decision;
    connection int19 : PortConnection connect request_admission.admission_decision to request_action_eligibility.admission_decision;
    connection int20 : PortConnection connect evidence_coherence.coordination_frame to transfer_session.coordination_frame;
    connection int21 : PortConnection connect evidence_coherence.ship_update to ship_evidence_lifecycle.ship_update;
    connection int22 : PortConnection connect evidence_coherence.warehouse_update to warehouse_evidence_lifecycle.warehouse_update;
    connection int23 : PortConnection connect transfer_session.prior_session_view to ship_progress_eligibility.prior_session_view;
    connection int24 : PortConnection connect ship_evidence_lifecycle.prior_ship_evidence to ship_progress_eligibility.prior_ship_evidence;
    connection int25 : PortConnection connect transfer_session.prior_session_view to warehouse_verification_eligibility.prior_session_view;
    connection int26 : PortConnection connect ship_evidence_lifecycle.prior_ship_evidence to warehouse_verification_eligibility.prior_ship_evidence;
    connection int27 : PortConnection connect warehouse_evidence_lifecycle.prior_warehouse_evidence to warehouse_verification_eligibility.prior_warehouse_evidence;
    connection int28 : PortConnection connect request_action_eligibility.request_proposal to transfer_action_arbitration.request_proposal;
    connection int29 : PortConnection connect ship_progress_eligibility.ship_proposal to transfer_action_arbitration.ship_proposal;
    connection int30 : PortConnection connect warehouse_verification_eligibility.warehouse_proposal to transfer_action_arbitration.warehouse_proposal;
    connection int31 : PortConnection connect evidence_coherence.priority_directive to transfer_action_arbitration.priority_directive;
    connection int32 : PortConnection connect transfer_action_arbitration.transfer_decision to result_composition.transfer_decision;
    connection int33 : PortConnection connect request_admission.request_disposition to result_composition.request_disposition;
    connection int34 : PortConnection connect request_admission.admission_decision to ship_evidence_lifecycle.admission_decision;
    connection int35 : PortConnection connect request_admission.admission_decision to warehouse_evidence_lifecycle.admission_decision;
  }

  part def StationCargoTransferEvidenceCoordinator :> System {
    port transferRequest : DataPort { in :>> type : TransferRequest; }
    port dockContext : DataPort { in :>> type : DockContext; }
    port shipReport : DataPort { in :>> type : ShipReport; }
    port warehouseReport : DataPort { in :>> type : WarehouseReport; }
    port controlEvent : DataPort { in :>> type : ControlEvent; }
    port transferResult : DataPort { out :>> type : TransferCoordinationResult; }

    part cargo_coordination_process : CargoCoordinationProcess;
    connection supportTransferRequest : PortConnection connect transferRequest to cargo_coordination_process.transferRequest;
    connection supportDockContext : PortConnection connect dockContext to cargo_coordination_process.dockContext;
    connection supportShipReport : PortConnection connect shipReport to cargo_coordination_process.shipReport;
    connection supportWarehouseReport : PortConnection connect warehouseReport to cargo_coordination_process.warehouseReport;
    connection supportControlEvent : PortConnection connect controlEvent to cargo_coordination_process.controlEvent;
    connection supportTransferResult : PortConnection connect cargo_coordination_process.transferResult to transferResult;
  }

  part station_cargo_transfer_evidence_coordinator : StationCargoTransferEvidenceCoordinator;
}
