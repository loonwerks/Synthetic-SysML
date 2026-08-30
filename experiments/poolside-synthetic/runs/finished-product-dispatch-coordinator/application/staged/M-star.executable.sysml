package Factory_Dispatch_Coordinator {

  private import HAMR::*;

  enum def Request_Id { enum None; enum R1; enum R2; enum R3; enum R4; enum R5; enum R6; enum R7; enum R8; }
  enum def Product_Id { enum None; enum P1; enum P2; enum P3; enum P4; }
  enum def Dispatch_Amount { enum A0; enum A1; enum A2; enum A3; enum A4; }
  enum def Inventory_Amount { enum A0; enum A1; enum A2; enum A3; enum A4; }
  enum def Inventory_Product_Id { enum None; enum P1; enum P2; enum P3; enum P4; }
  enum def Request_Freshness { enum Fresh; enum Repeated; }
  enum def Observation_Validity { enum Valid; enum Invalid; }
  enum def Dock_Disposition { enum Ready; enum Occupied; enum Unavailable; }
  enum def Dispatch_Attempt { enum FreshAttempt; enum RetryAttempt; }
  enum def Outcome_Result { enum NoReport; enum InProgress; enum Completed; enum Failed; }
  enum def Admission_Assessment { enum NoRequest; enum Malformed; enum Repeated; enum AdmissibleFresh; }
  enum def Fresh_Inventory_Assessment { enum NotApplicable; enum Sufficient; enum Insufficient; enum Unknown; }
  enum def Recovery_Inventory_Assessment { enum NotApplicable; enum Sufficient; enum Insufficient; enum Unknown; }
  enum def Dock_Assessment { enum Ready; enum Blocked; enum Unknown; }
  enum def Dispatch_Lifecycle { enum Idle; enum ActiveFresh; enum RecoveryPending; enum ActiveRetry; enum TerminalCompleted; enum TerminalFailed; }
  enum def Outcome_Plan { enum Preserve; enum Completed; enum RetryEligible; enum Abort; }
  enum def Confirmation_Outcome_Class { enum Preserve; enum Completed; enum RetryEligible; enum Abort; }
  enum def Confirmation_Request_Id { enum None; enum R1; enum R2; enum R3; enum R4; enum R5; enum R6; enum R7; enum R8; }
  enum def Context_Request_Id { enum None; enum R1; enum R2; enum R3; enum R4; enum R5; enum R6; enum R7; enum R8; }
  enum def Context_Attempt { enum FreshAttempt; enum RetryAttempt; }
  enum def Capacity_Request_Id { enum None; enum R1; enum R2; enum R3; enum R4; enum R5; enum R6; enum R7; enum R8; }
  enum def Capacity_Product_Id { enum None; enum P1; enum P2; enum P3; enum P4; }
  enum def Capacity_Amount { enum A0; enum A1; enum A2; enum A3; enum A4; }
  enum def Candidate_Request_Id { enum None; enum R1; enum R2; enum R3; enum R4; enum R5; enum R6; enum R7; enum R8; }
  enum def Candidate_Product_Id { enum None; enum P1; enum P2; enum P3; enum P4; }
  enum def Candidate_Amount { enum A0; enum A1; enum A2; enum A3; enum A4; }
  enum def Candidate_Lifecycle { enum Idle; enum ActiveFresh; enum RecoveryPending; enum ActiveRetry; enum TerminalCompleted; enum TerminalFailed; }
  enum def Selected_Intent { enum None; enum FreshIntent; enum RecoveryIntent; }
  enum def Dispatch_Decision_Kind { enum None; enum Reject; enum WaitInventory; enum WaitDock; enum Busy; enum ReleaseFresh; enum ReleaseRetry; enum ResetIdle; }
  enum def Decision_Reason { enum Idle; enum Rejected; enum WaitingInventory; enum WaitingDock; enum Busy; enum Released; enum TerminalReset; }
  enum def Instruction_Kind { enum NoInstruction; enum ReleaseFresh; enum ReleaseRetry; enum Cancel; }
  enum def Confirmation_Kind { enum None; enum Shipped; enum DispatchFailed; }
  enum def Dispatch_Status { enum Idle; enum Rejected; enum WaitingInventory; enum WaitingDock; enum Busy; enum Released; enum Recovering; enum Completed; enum Failed; }

  // Contract-visible Data members are attributes by LOCAL-02.
  part def Raw_Dispatch_Request :> Data {
    attribute request_id : Request_Id;
    attribute product_id : Product_Id;
    attribute amount : Dispatch_Amount;
    attribute freshness : Request_Freshness;
  }

  part def Dispatch_Inventory_Snapshot :> Data {
    attribute qty : Inventory_Amount;
    attribute validity : Observation_Validity;
    attribute pid : Inventory_Product_Id;
  }

  part def Dock_Snapshot :> Data {
    attribute validity : Observation_Validity;
    attribute disposition : Dock_Disposition;
  }

  part def Execution_Outcome :> Data {
    attribute request_id : Request_Id;
    attribute attempt : Dispatch_Attempt;
    attribute result : Outcome_Result;
  }

  part def Qualified_Request_Fact :> Data {
    attribute assessment : Admission_Assessment;
    attribute request_id : Request_Id;
    attribute product_id : Product_Id;
    attribute amount : Dispatch_Amount;
    attribute freshness : Request_Freshness;
  }

  part def Active_Execution_Context :> Data {
    attribute lifecycle : Dispatch_Lifecycle;
    attribute active_request_id : Context_Request_Id;
    attribute active_attempt : Context_Attempt;
  }

  part def Recovery_Qualification_Context :> Data {
    attribute lifecycle : Dispatch_Lifecycle;
    attribute stored_request_id : Capacity_Request_Id;
    attribute stored_product_id : Capacity_Product_Id;
    attribute stored_amount : Capacity_Amount;
  }

  part def Candidate_Inventory_Readiness :> Data {
    attribute fresh_assessment : Fresh_Inventory_Assessment;
    attribute recovery_assessment : Recovery_Inventory_Assessment;
    attribute recovery_request_id : Candidate_Request_Id;
    attribute recovery_product_id : Candidate_Product_Id;
    attribute recovery_amount : Candidate_Amount;
    attribute lifecycle_capacity : Candidate_Lifecycle;
  }

  part def Dispatch_Decision :> Data {
    attribute kind : Dispatch_Decision_Kind;
    attribute request_id : Request_Id;
    attribute product_id : Product_Id;
    attribute amount : Dispatch_Amount;
  }

  part def Confirmation_Context :> Data {
    attribute classification : Confirmation_Outcome_Class;
    attribute confirmation_request_id : Confirmation_Request_Id;
  }

  part def Shipment_Instruction :> Data {
    attribute kind : Instruction_Kind;
    attribute request_id : Request_Id;
    attribute product_id : Product_Id;
    attribute amount : Dispatch_Amount;
  }

  part def Shipping_Confirmation :> Data {
    attribute kind : Confirmation_Kind;
    attribute request_id : Request_Id;
  }

  part def Request_Qualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port request : DataPort { in :>> type : Raw_Dispatch_Request; }
    port inventory_request_fact : DataPort { out :>> type : Qualified_Request_Fact; }
    port priority_admission : DataPort { out :>> type : Admission_Assessment; }
    port arbiter_request_fact : DataPort { out :>> type : Qualified_Request_Fact; }

    language "GUMBO" /*{
            
                                                    
                                                                           
                                                            
                                                            
                                                           
                                                                   
                                                            
                                                                         
                                                          
                                                          
                                                         
                                                                

  compute
    guarantee REQUEST_FACT_AGREEMENT "publish request facts":
      inventory_request_fact.assessment == priority_admission &
      arbiter_request_fact.assessment == priority_admission &
      inventory_request_fact.request_id == request.request_id &
      inventory_request_fact.product_id == request.product_id &
      inventory_request_fact.amount == request.amount &
      inventory_request_fact.freshness == request.freshness &
      arbiter_request_fact.request_id == request.request_id &
      arbiter_request_fact.product_id == request.product_id &
      arbiter_request_fact.amount == request.amount &
      arbiter_request_fact.freshness == request.freshness;
    compute_cases
      case REQUEST_NONE "no request":
        assume request.request_id == Request_Id.None & request.product_id == Product_Id.None & request.amount == Dispatch_Amount.A0;
        guarantee priority_admission == Admission_Assessment.NoRequest;
      case REQUEST_MALFORMED:
        assume (not (request.request_id == Request_Id.None & request.product_id == Product_Id.None & request.amount == Dispatch_Amount.A0)) &
               (request.request_id == Request_Id.None | request.product_id == Product_Id.None | request.amount == Dispatch_Amount.A0);
        guarantee priority_admission == Admission_Assessment.Malformed;
      case REQUEST_REPEATED:
        assume request.request_id != Request_Id.None & request.product_id != Product_Id.None & request.amount != Dispatch_Amount.A0 & request.freshness == Request_Freshness.Repeated;
        guarantee priority_admission == Admission_Assessment.Repeated;
      case REQUEST_ADMISSIBLE:
        assume request.request_id != Request_Id.None & request.product_id != Product_Id.None & request.amount != Dispatch_Amount.A0 & request.freshness == Request_Freshness.Fresh;
        guarantee priority_admission == Admission_Assessment.AdmissibleFresh;
}*/

                        
                
                        
                                                                                              
                                                                               
                                                                
                                                                
                                                               
                                                                       
                                                                
                                                                             
                                                              
                                                              
                                                             
                                                                    

             
                        
                                                                                                                                
                                                                   
                                                                 
                                                                   
                                                                   
                                                           
                                                                 
                                                                 
                                                                 
                                                         
                                                              

                     
                            
                                                                             
                                                          
                                                          
                                                        
                                                                           
                            
                                                                                                                   
                                                               
                                                               
                                                               
                                                           
                                                           
                                                          
                                                                           
                            
                                                                                         
                                                          
                                                          
                                                         
                                                                   
                                                                          
                            
                                                                                    
                                                          
                                                          
                                                         
                                                                
                                                                                 
       
  }

  part def Inventory_Qualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port inventory_snapshot : DataPort { in :>> type : Dispatch_Inventory_Snapshot; }
    port request_fact : DataPort { in :>> type : Qualified_Request_Fact; }
    port recovery_context : DataPort { in :>> type : Recovery_Qualification_Context; }
    port candidate_readiness : DataPort { out :>> type : Candidate_Inventory_Readiness; }

    language "GUMBO" /*{
            
                                                            
                                                                                        
                                                                                           
                                                                            
                                                                            
                                                                  
                                                                         

  compute
    guarantee FRESH_INVENTORY_CLASSIFIED "classify fresh inventory":
      true;
    guarantee RECOVERY_INVENTORY_CLASSIFIED "classify recovery inventory":
      true;
    guarantee RECOVERY_CONTEXT_ROUTED "route recovery context":
      true;
}*/

                        
               
                          
                                                                                                           
                                          
                                                                               
                                           
                                                                                                                      
                                           
                                                                                   
                                                                              
                          
                                                                                                        
                                                                               
                                           
                                                                                   
                                           
                                                                                                                      
                                                                              
                        
                                                                                                                        
                                                                                               
                                                                                               
                                                                                               
                                                                                              
                          
                                                                                                                    
                                          
                                                                               
                                           
                                                                                                                      
                                           
                                                                                   
                                                                              
                          
                                                                                                                 
                                                                               
                                           
                                                                                   
                                           
                                                                                                                      
                                                                              
                        
                                                                                                                                       
                                                                                                     
                                                                                                     
                                                                                                     
                                                                                                    
                          
                                                                                                                            
                                                       
                                              
                                                   
                                                 
                          
                                                                                                                              
                                                       
                                              
                                                   
                                              
                          
                                                                                                                         
                                                         
                                              
                                                      
                        
                                                                                                                                 
                                                                                                                
                                                                                              
                                                                                                  
                                                  
                        
                                                                                                                                                  
                                                                       
                                                                     
                                                                     
                                                                                                       
                                                                
                                                                               
                                                                                                                       
                                                                
                                                                               
                                                                                                                      
                                                     
                        
                                                                                  
                                                                       
                                                                            
                                                                            
                                                                            
                                                                            
                                                                            
                                                                            
                                                                            
                                         
                        
                                                                                  
                                                                       
                                                                            
                                                                            
                                                                            
                                         
                        
                                                                         
                                                               
                                                                    
                                                                    
                                                                    
                                   
                        
                                                                                  
                                                                                       
                                                                                                    
                                                                                            
                                                                                                        
                                                                                                  
                                        

                
                        
                                                                                                                                             
                                                                                            
                                                                                                  
                                                                                
                                                                                
                                                                      
                                                                             

             
                        
                                                                                                                               
                                                                                                          
                        
                                                                                                                                    
                                                                                                                    
                        
                                                                                                                           
                                                                                                            
                                                                                                            
                                                                                                   
                                                                                                    
       
  }

  part def Dock_Qualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port dock_snapshot : DataPort { in :>> type : Dock_Snapshot; }
    port assessment : DataPort { out :>> type : Dock_Assessment; }

    language "GUMBO" /*{
            
                                                      
                                            

  compute
    compute_cases
      case DOCK_READY "dock ready":
        assume dock_snapshot.validity == Observation_Validity.Valid & dock_snapshot.disposition == Dock_Disposition.Ready;
        guarantee assessment == Dock_Assessment.Ready;
      case DOCK_BLOCKED "dock blocked":
        assume dock_snapshot.validity == Observation_Validity.Valid & dock_snapshot.disposition != Dock_Disposition.Ready;
        guarantee assessment == Dock_Assessment.Blocked;
      case DOCK_UNKNOWN "dock unknown":
        assume dock_snapshot.validity == Observation_Validity.Invalid;
        guarantee assessment == Dock_Assessment.Unknown;
}*/

                        
                
                        
                                                                                         
                                                

             
                     
                            
                                                             
                                                                         
                                                                       
                                                          
                            
                                                                              
                                                                         
                                                                       
                                                            
                            
                                                                        
                                                                          
                                                            
       
  }

  part def Outcome_Recovery_Classifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port execution_outcome : DataPort { in :>> type : Execution_Outcome; }
    port execution_context : DataPort { in :>> type : Active_Execution_Context; }
    port recovery_plan : DataPort { out :>> type : Outcome_Plan; }
    port transition_plan : DataPort { out :>> type : Outcome_Plan; }
    port confirmation_context : DataPort { out :>> type : Confirmation_Context; }

    language "GUMBO" /*{
  state
    stored_transition_plan: Outcome_Plan;

            
                                                   
                                              
                                                       
                                                                                  
                                                                                   

  compute
    modifies stored_transition_plan;
    guarantee CLASSIFIER_PUBLICATIONS_AGREE "publish outcomes":
      recovery_plan == stored_transition_plan &
      confirmation_context.classification == Confirmation_Outcome_Class.Preserve &
      confirmation_context.confirmation_request_id == Confirmation_Request_Id.None;
    compute_cases
      case RECOVERY_REMAINS_ELIGIBLE:
        assume execution_context.lifecycle == Dispatch_Lifecycle.RecoveryPending;
        guarantee stored_transition_plan == Outcome_Plan.RetryEligible;
      case MATCHING_COMPLETION:
        assume true;
        guarantee stored_transition_plan == Outcome_Plan.Completed;
      case MATCHING_FRESH_FAILURE:
        assume true;
        guarantee stored_transition_plan == Outcome_Plan.RetryEligible;
      case MATCHING_RETRY_FAILURE:
        assume true;
        guarantee stored_transition_plan == Outcome_Plan.Abort;
      case OUTCOME_PRESERVED:
        assume true;
        guarantee stored_transition_plan == Outcome_Plan.Preserve;
}*/

                        
               
                        
                                                                                  
                                                                                  
                                                                                         
                                                                                                 
                                                
                        
                                                                                  
                                                                         
                                                                              
                                                                              
                                                                              
                                                                              
                                                                              
                                                                              
                                                                              
                                            
                        
                                                                                             
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                   
                        
                                                                                                
                                                                                           
                                                                                          

                
                        
                                                                                                                    
                                                  
                                                    
                                                                                      
                                                                                       

             
                        
                                                                                                        
                                            
                                                                                      
                                                                                                               

                     
                            
                                                                                                                       
                                                                                     
                                                                    
                            
                                                                                                               
                                                                                   
                                                                                    
                                                                                   
                                                                                                    
                                                                                              
                                                                        
                                                                
                            
                                                                                                                
                                                                                  
                                                                                   
                                                                                                    
                                                                               
                                                                     
                                                                    
                            
                                                                                                         
                                                                                  
                                                                                   
                                                                                                    
                                                                               
                                                                     
                                                            
                            
                                                                                                           
                                                                                      
                                                                                         
                                                                                          
                                                                                         
                                                                                                          
                                                                                                    
                                                                                
                                                                                        
                                                                                         
                                                                                                          
                                                                                     
                                                                             
                                                                                        
                                                                                         
                                                                                                          
                                                                                     
                                                                             
                                                               
       
  }

  part def Dispatch_Priority_Resolver :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port admission : DataPort { in :>> type : Admission_Assessment; }
    port recovery_plan : DataPort { in :>> type : Outcome_Plan; }
    port selected_intent : DataPort { out :>> type : Selected_Intent; }

    language "GUMBO" /*{
            
                                                      
                                              

  compute
    compute_cases
      case RECOVERY_OUTRANKS_FRESH:
        assume recovery_plan == Outcome_Plan.RetryEligible;
        guarantee selected_intent == Selected_Intent.RecoveryIntent;
      case FRESH_SELECTED:
        assume recovery_plan != Outcome_Plan.RetryEligible & admission == Admission_Assessment.AdmissibleFresh;
        guarantee selected_intent == Selected_Intent.FreshIntent;
      case NO_INTENT_SELECTED:
        assume recovery_plan != Outcome_Plan.RetryEligible & admission != Admission_Assessment.AdmissibleFresh;
        guarantee selected_intent == Selected_Intent.None;
}*/

                        
                
                        
                                                                                             
                                                  

             
                     
                            
                                                                                                                 
                                                               
                                                                        
                            
                                                                                                    
                                                                
                                                                     
                                                                     
                            
                                                                                 
                                                                
                                                                     
                                                              
       
  }

  part def Release_Arbiter :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port request_fact : DataPort { in :>> type : Qualified_Request_Fact; }
    port candidate_readiness : DataPort { in :>> type : Candidate_Inventory_Readiness; }
    port dock_assessment : DataPort { in :>> type : Dock_Assessment; }
    port selected_intent : DataPort { in :>> type : Selected_Intent; }
    port dispatch_decision : DataPort { out :>> type : Dispatch_Decision; }
    port decision_reason : DataPort { out :>> type : Decision_Reason; }

    language "GUMBO" /*{
            
                                                        
                                                             
                                                       
                                                       
                                                      
                                              

  compute
    compute_cases
      case RESET_COMPLETED:
        assume candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.TerminalCompleted;
        guarantee dispatch_decision.kind == Dispatch_Decision_Kind.ResetIdle &
                dispatch_decision.request_id == Request_Id.None &
                dispatch_decision.product_id == Product_Id.None &
                dispatch_decision.amount == Dispatch_Amount.A0 &
                decision_reason == Decision_Reason.TerminalReset;
      case RESET_FAILED:
        assume candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.TerminalFailed;
        guarantee dispatch_decision.kind == Dispatch_Decision_Kind.ResetIdle &
                dispatch_decision.request_id == Request_Id.None &
                dispatch_decision.product_id == Product_Id.None &
                dispatch_decision.amount == Dispatch_Amount.A0 &
                decision_reason == Decision_Reason.TerminalReset;
      case PROTECTED_ACTIVE_BUSY:
        assume (candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.ActiveFresh | candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.ActiveRetry) &
               request_fact.assessment != Admission_Assessment.NoRequest;
        guarantee dispatch_decision.kind == Dispatch_Decision_Kind.Busy &
                decision_reason == Decision_Reason.Busy;
      case ACTIVE_NO_REQUEST_PRESERVED:
        assume (candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.ActiveFresh | candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.ActiveRetry) &
               request_fact.assessment == Admission_Assessment.NoRequest;
        guarantee dispatch_decision.kind == Dispatch_Decision_Kind.None &
                dispatch_decision.request_id == Request_Id.None &
                dispatch_decision.product_id == Product_Id.None &
                dispatch_decision.amount == Dispatch_Amount.A0 &
                decision_reason == Decision_Reason.Released;
      case REJECT_MALFORMED:
        assume candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
               request_fact.assessment == Admission_Assessment.Malformed;
        guarantee dispatch_decision.kind == Dispatch_Decision_Kind.Reject &
                dispatch_decision.request_id == Request_Id.None &
                dispatch_decision.product_id == Product_Id.None &
                dispatch_decision.amount == Dispatch_Amount.A0 &
                decision_reason == Decision_Reason.Rejected;
      case REJECT_REPEATED:
        assume candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
               request_fact.assessment == Admission_Assessment.Repeated;
        guarantee dispatch_decision.kind == Dispatch_Decision_Kind.Reject &
                dispatch_decision.request_id == Request_Id.None &
                dispatch_decision.product_id == Product_Id.None &
                dispatch_decision.amount == Dispatch_Amount.A0 &
                decision_reason == Decision_Reason.Rejected;
      case WAIT_FOR_INVENTORY:
        assume (candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
                selected_intent == Selected_Intent.FreshIntent &
                candidate_readiness.fresh_assessment != Fresh_Inventory_Assessment.Sufficient) |
               (candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.RecoveryPending &
                selected_intent == Selected_Intent.RecoveryIntent &
                candidate_readiness.recovery_assessment != Recovery_Inventory_Assessment.Sufficient);
        guarantee dispatch_decision.kind == Dispatch_Decision_Kind.WaitInventory &
                decision_reason == Decision_Reason.WaitingInventory;
      case WAIT_FOR_DOCK:
        assume ((candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
                selected_intent == Selected_Intent.FreshIntent &
                candidate_readiness.fresh_assessment == Fresh_Inventory_Assessment.Sufficient) |
               (candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.RecoveryPending &
                selected_intent == Selected_Intent.RecoveryIntent &
                candidate_readiness.recovery_assessment == Recovery_Inventory_Assessment.Sufficient)) &
               dock_assessment != Dock_Assessment.Ready;
        guarantee dispatch_decision.kind == Dispatch_Decision_Kind.WaitDock &
                decision_reason == Decision_Reason.WaitingDock;
      case RELEASE_FRESH:
        assume candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
               selected_intent == Selected_Intent.FreshIntent &
               candidate_readiness.fresh_assessment == Fresh_Inventory_Assessment.Sufficient &
               dock_assessment == Dock_Assessment.Ready;
        guarantee dispatch_decision.kind == Dispatch_Decision_Kind.ReleaseFresh &
                dispatch_decision.request_id == request_fact.request_id &
                dispatch_decision.product_id == request_fact.product_id &
                dispatch_decision.amount == request_fact.amount &
                decision_reason == Decision_Reason.Released;
      case RELEASE_RETRY:
        assume candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.RecoveryPending &
               selected_intent == Selected_Intent.RecoveryIntent &
               candidate_readiness.recovery_assessment == Recovery_Inventory_Assessment.Sufficient &
               dock_assessment == Dock_Assessment.Ready;
        guarantee dispatch_decision.kind == Dispatch_Decision_Kind.ReleaseRetry &
                decision_reason == Decision_Reason.Released;
      case ARBITER_IDLE:
        assume candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
               selected_intent == Selected_Intent.None &
               request_fact.assessment != Admission_Assessment.Malformed &
               request_fact.assessment != Admission_Assessment.Repeated;
        guarantee dispatch_decision.kind == Dispatch_Decision_Kind.None &
                dispatch_decision.request_id == Request_Id.None &
                dispatch_decision.product_id == Product_Id.None &
                dispatch_decision.amount == Dispatch_Amount.A0 &
                decision_reason == Decision_Reason.Idle;
}*/

                        
               
                        
                                                                        
                                                              
                                                                   
                                                                   
                                                                   
                                                                   
                                                                   
                                                                   
                                                                   
                               
                        
                                                                        
                                                              
                                                                   
                                                                   
                                                                   
                               
                        
                                                                        
                                                               
                                                                    
                                                                    
                                                                    
                                  

                
                        
                                                                                                   
                                                                 
                                                           
                                                           
                                                          
                                                  

             
                     
                            
                                                                                                                     
                                                                                                   
                                                                                  
                                                                       
                                                                       
                                                                      
                                                                       
                            
                                                                                                               
                                                                                                
                                                                                  
                                                                       
                                                                       
                                                                      
                                                                       
                            
                                                                                                    
                                                                                               
                                                                                                
                                                                             
                                                                             
                                                                                                                 
                                                                                                                 
                                                                                                        
                                                              
                            
                                                                                                       
                                                                                               
                                                                                                
                                                                             
                                                                             
                                                                       
                                                                       
                                                                      
                                                                  
                            
                                                                                        
                                                                                       
                                                                             
                                                                               
                                                                       
                                                                       
                                                                      
                                                                  
                            
                                                                                      
                                                                                       
                                                                            
                                                                               
                                                                       
                                                                       
                                                                      
                                                                  
                            
                                                                                                                   
                                                                                        
                                                                    
                                                                                                    
                                                                                                   
                                                                       
                                                                                                         
                                                                                      
                                                                          
                            
                                                                                     
                                                                                         
                                                                     
                                                                                                     
                                                                                                    
                                                                        
                                                                                                            
                                                            
                                                                                 
                                                                     
                            
                                                                                                
                                                                                       
                                                                   
                                                                                                  
                                                            
                                                                                     
                                                                               
                                                                               
                                                                       
                                                                  
                            
                                                                                                            
                                                                                                  
                                                                      
                                                                                                        
                                                            
                                                                                     
                                                                                                                 
                                                                                                                 
                                                                                                        
                                                                  
                            
                                                                                                     
                                                                                       
                                                            
                                                                              
                                                                            
                                                                             
                                                                       
                                                                       
                                                                      
                                                              
       
  }

  part def Commitment_Tracker :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port outcome_plan : DataPort { in :>> type : Outcome_Plan; }
    port dispatch_decision : DataPort { in :>> type : Dispatch_Decision; }
    port execution_context : DataPort { out :>> type : Active_Execution_Context; }
    port recovery_context : DataPort { out :>> type : Recovery_Qualification_Context; }
    port shipment_instruction : DataPort { out :>> type : Shipment_Instruction; }
    port lifecycle_snapshot : DataPort { out :>> type : Dispatch_Lifecycle; }

    language "GUMBO" /*{
  state
    lifecycle: Dispatch_Lifecycle;
    active_request_id: Request_Id;
    active_product_id: Product_Id;
    active_amount: Dispatch_Amount;
    active_attempt: Dispatch_Attempt;
    shipment_instruction_kind: Instruction_Kind;
    shipment_instruction_request_id: Request_Id;
    shipment_instruction_product_id: Product_Id;
    shipment_instruction_amount: Dispatch_Amount;

            
                                                                                            
                                                                                                                                      
                                                    
                                            
                                            
                                            
                                           
                                                       
                                                              
                                                                      
                                                                        
                                                             
                                                                      
                                                                      
                                                            
                                                                   
                                                          
                                                          
                                                         
                                                    

  compute
    guarantee PRESTATE_EXECUTION_CONTEXT "prestate execution context":
      execution_context.lifecycle == lifecycle &
      execution_context.active_request_id == Context_Request_Id.None &
      execution_context.active_attempt == Context_Attempt.FreshAttempt;
    guarantee PRESTATE_RECOVERY_CONTEXT "prestate recovery context":
      recovery_context.lifecycle == lifecycle &
      recovery_context.stored_request_id == Capacity_Request_Id.None &
      recovery_context.stored_product_id == Capacity_Product_Id.None &
      recovery_context.stored_amount == Capacity_Amount.A0;
    guarantee POSTSTATE_LIFECYCLE_PUBLICATION "publish lifecycle snapshot":
      lifecycle_snapshot == lifecycle;
    compute_cases
      case TRACK_FRESH_RELEASE:
        assume In(lifecycle) == Dispatch_Lifecycle.Idle & dispatch_decision.kind == Dispatch_Decision_Kind.ReleaseFresh;
        guarantee lifecycle == Dispatch_Lifecycle.ActiveFresh &
                active_request_id == dispatch_decision.request_id &
                active_product_id == dispatch_decision.product_id &
                active_amount == dispatch_decision.amount &
                active_attempt == Dispatch_Attempt.FreshAttempt &
                shipment_instruction.kind == Instruction_Kind.ReleaseFresh &
                shipment_instruction.request_id == dispatch_decision.request_id &
                shipment_instruction.product_id == dispatch_decision.product_id &
                shipment_instruction.amount == dispatch_decision.amount;
      case TRACK_COMPLETION:
        assume (In(lifecycle) == Dispatch_Lifecycle.ActiveFresh | In(lifecycle) == Dispatch_Lifecycle.ActiveRetry) &
               outcome_plan == Outcome_Plan.Completed;
        guarantee lifecycle == Dispatch_Lifecycle.TerminalCompleted &
                active_request_id == In(active_request_id) &
                active_product_id == In(active_product_id) &
                active_amount == In(active_amount) &
                active_attempt == In(active_attempt) &
                shipment_instruction.kind == Instruction_Kind.NoInstruction &
                shipment_instruction.request_id == Request_Id.None &
                shipment_instruction.product_id == Product_Id.None &
                shipment_instruction.amount == Dispatch_Amount.A0;
      case TRACK_FIRST_FAILURE:
        assume In(lifecycle) == Dispatch_Lifecycle.ActiveFresh & outcome_plan == Outcome_Plan.RetryEligible;
        guarantee lifecycle == Dispatch_Lifecycle.RecoveryPending &
                active_request_id == In(active_request_id) &
                active_product_id == In(active_product_id) &
                active_amount == In(active_amount) &
                active_attempt == Dispatch_Attempt.FreshAttempt &
                shipment_instruction.kind == Instruction_Kind.NoInstruction &
                shipment_instruction.request_id == Request_Id.None &
                shipment_instruction.product_id == Product_Id.None &
                shipment_instruction.amount == Dispatch_Amount.A0;
      case TRACK_RETRY_RELEASE:
        assume In(lifecycle) == Dispatch_Lifecycle.RecoveryPending & dispatch_decision.kind == Dispatch_Decision_Kind.ReleaseRetry;
        guarantee lifecycle == Dispatch_Lifecycle.ActiveRetry &
                active_request_id == In(active_request_id) &
                active_product_id == In(active_product_id) &
                active_amount == In(active_amount) &
                active_attempt == Dispatch_Attempt.RetryAttempt &
                shipment_instruction.kind == Instruction_Kind.ReleaseRetry &
                shipment_instruction.request_id == In(active_request_id) &
                shipment_instruction.product_id == In(active_product_id) &
                shipment_instruction.amount == In(active_amount);
      case TRACK_RETRY_ABORT:
        assume In(lifecycle) == Dispatch_Lifecycle.ActiveRetry & outcome_plan == Outcome_Plan.Abort;
        guarantee lifecycle == Dispatch_Lifecycle.TerminalFailed &
                active_request_id == In(active_request_id) &
                active_product_id == In(active_product_id) &
                active_amount == In(active_amount) &
                active_attempt == Dispatch_Attempt.RetryAttempt &
                shipment_instruction.kind == Instruction_Kind.Cancel &
                shipment_instruction.request_id == In(active_request_id) &
                shipment_instruction.product_id == In(active_product_id) &
                shipment_instruction.amount == In(active_amount);
      case TRACK_ACTIVE_PRESERVATION:
        assume (In(lifecycle) == Dispatch_Lifecycle.ActiveFresh | In(lifecycle) == Dispatch_Lifecycle.ActiveRetry) &
               outcome_plan == Outcome_Plan.Preserve;
        guarantee lifecycle == In(lifecycle) &
                active_request_id == In(active_request_id) &
                active_product_id == In(active_product_id) &
                active_amount == In(active_amount) &
                active_attempt == In(active_attempt) &
                shipment_instruction.kind == Instruction_Kind.NoInstruction &
                shipment_instruction.request_id == Request_Id.None &
                shipment_instruction.product_id == Product_Id.None &
                shipment_instruction.amount == Dispatch_Amount.A0;
      case TRACK_WAIT_INVENTORY:
        assume (In(lifecycle) == Dispatch_Lifecycle.Idle | In(lifecycle) == Dispatch_Lifecycle.RecoveryPending) &
               dispatch_decision.kind == Dispatch_Decision_Kind.WaitInventory;
        guarantee lifecycle == In(lifecycle) &
                active_request_id == In(active_request_id) &
                active_product_id == In(active_product_id) &
                active_amount == In(active_amount) &
                active_attempt == In(active_attempt) &
                shipment_instruction.kind == Instruction_Kind.NoInstruction &
                shipment_instruction.request_id == Request_Id.None &
                shipment_instruction.product_id == Product_Id.None &
                shipment_instruction.amount == Dispatch_Amount.A0;
      case TRACK_WAIT_DOCK:
        assume (In(lifecycle) == Dispatch_Lifecycle.Idle | In(lifecycle) == Dispatch_Lifecycle.RecoveryPending) &
               dispatch_decision.kind == Dispatch_Decision_Kind.WaitDock;
        guarantee lifecycle == In(lifecycle) &
                active_request_id == In(active_request_id) &
                active_product_id == In(active_product_id) &
                active_amount == In(active_amount) &
                active_attempt == In(active_attempt) &
                shipment_instruction.kind == Instruction_Kind.NoInstruction &
                shipment_instruction.request_id == Request_Id.None &
                shipment_instruction.product_id == Product_Id.None &
                shipment_instruction.amount == Dispatch_Amount.A0;
      case TRACK_IDLE:
        assume In(lifecycle) == Dispatch_Lifecycle.Idle &
               dispatch_decision.kind != Dispatch_Decision_Kind.ReleaseFresh &
               dispatch_decision.kind != Dispatch_Decision_Kind.WaitInventory &
               dispatch_decision.kind != Dispatch_Decision_Kind.WaitDock;
        guarantee lifecycle == Dispatch_Lifecycle.Idle &
                active_request_id == Request_Id.None &
                active_product_id == Product_Id.None &
                active_amount == Dispatch_Amount.A0 &
                active_attempt == Dispatch_Attempt.FreshAttempt &
                shipment_instruction.kind == Instruction_Kind.NoInstruction &
                shipment_instruction.request_id == Request_Id.None &
                shipment_instruction.product_id == Product_Id.None &
                shipment_instruction.amount == Dispatch_Amount.A0;
      case TRACK_TERMINAL_RESET:
        assume (In(lifecycle) == Dispatch_Lifecycle.TerminalCompleted | In(lifecycle) == Dispatch_Lifecycle.TerminalFailed) &
               dispatch_decision.kind == Dispatch_Decision_Kind.ResetIdle;
        guarantee lifecycle == Dispatch_Lifecycle.Idle &
                active_request_id == Request_Id.None &
                active_product_id == Product_Id.None &
                active_amount == Dispatch_Amount.A0 &
                active_attempt == Dispatch_Attempt.FreshAttempt &
                shipment_instruction.kind == Instruction_Kind.NoInstruction &
                shipment_instruction.request_id == Request_Id.None &
                shipment_instruction.product_id == Product_Id.None &
                shipment_instruction.amount == Dispatch_Amount.A0;
}*/

                        
                      
           
                        
                                      
                         
                                      
                         
                                      
                         
                                       
                        
                                         

               
                        
                                                                
                                                            
                                                                 
                                                                 
                                                                 
                                                                 
                                                                 
                                                                 
                                                                 
                                       
                        
                                                                        
                                                                                   
                                            
                        
                                                                  
                                                             
                                                                  
                                                                  
                                                                  
                                                                  
                                                                  
                                                                  
                                                                  
                                        
                        
                                                                          
                                                             
                                                                  
                                                                  
                                                                  
                                        
                        
                                                                         
                                                              
                                                                   
                                                                   
                                                                   
                                  
                
                        
                                                                                                                     
                                                
                                                
                                                
                                               
                                                           
                                                                  
                                                                          
                                                                            
                                                                 
                                                                          
                                                                          
                                                                
                                                                       
                                                              
                                                              
                                                             
                                                        

             
                        
                                                                                                                        
                                                        
                                                                                    
                                                                                  
                        
                                                                                                                                 
                                                       
                                                                                    
                                                                                            
                                                                                 
                        
                                                                                                                
                                          

                     
                            
                                                                                          
                                                             
                                                                                 
                                                                   
                                                                         
                                                                         
                                                                 
                                                                       
                                                                                  
                                                                                       
                                                                                       
                                                                              
                            
                                                                                                                                 
                                                                     
                                                                      
                                                          
                                                                         
                                                                  
                                                                  
                                                          
                                                            
                                                                                   
                                                                          
                                                                          
                                                                        
                            
                                                                                                               
                                                                    
                                                              
                                                                       
                                                                  
                                                                  
                                                          
                                                                       
                                                                                   
                                                                          
                                                                          
                                                                        
                            
                                                                                                             
                                                                        
                                                                                 
                                                                   
                                                                  
                                                                  
                                                          
                                                                       
                                                                                  
                                                                                
                                                                                
                                                                       
                            
                                                                                                                     
                                                                    
                                                      
                                                                      
                                                                  
                                                                  
                                                          
                                                                       
                                                                            
                                                                                
                                                                                
                                                                       
                            
                                                                                                 
                                                                     
                                                                      
                                                         
                                                  
                                                                  
                                                                  
                                                          
                                                            
                                                                                   
                                                                          
                                                                          
                                                                        
                            
                                                                                                                       
                                                              
                                                                          
                                                                                  
                                                  
                                                                  
                                                                  
                                                          
                                                            
                                                                                   
                                                                          
                                                                          
                                                                        
                            
                                                                                                                 
                                                              
                                                                          
                                                                             
                                                  
                                                                  
                                                                  
                                                          
                                                            
                                                                                   
                                                                          
                                                                          
                                                                        
                            
                                                                                                 
                                                             
                                                                                  
                                                                                   
                                                                             
                                                            
                                                            
                                                            
                                                           
                                                                       
                                                                                   
                                                                          
                                                                          
                                                                        
                          
                                                                                                                      
                                                                           
                                                                         
                                                                              
                                                            
                                                            
                                                            
                                                           
                                                                       
                                                                                   
                                                                          
                                                                          
                                                                        
       
  }

  part def Confirmation_Determiner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port confirmation_context : DataPort { in :>> type : Confirmation_Context; }
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }

    language "GUMBO" /*{
            
                                                   
                                                            
                                                          

  compute
    compute_cases
      case CONFIRMATION_SUPPRESS_PRESERVE:
        assume confirmation_context.classification == Confirmation_Outcome_Class.Preserve;
        guarantee shipping_confirmation.kind == Confirmation_Kind.None &
                shipping_confirmation.request_id == Request_Id.None;
      case CONFIRMATION_SUPPRESS_RECOVERY:
        assume confirmation_context.classification == Confirmation_Outcome_Class.RetryEligible;
        guarantee shipping_confirmation.kind == Confirmation_Kind.None &
                shipping_confirmation.request_id == Request_Id.None;
      case CONFIRMATION_SHIPPED:
        assume confirmation_context.classification == Confirmation_Outcome_Class.Completed;
        guarantee shipping_confirmation.kind == Confirmation_Kind.Shipped &
                shipping_confirmation.request_id == Request_Id.None;
      case CONFIRMATION_FAILED:
        assume confirmation_context.classification == Confirmation_Outcome_Class.Abort;
        guarantee shipping_confirmation.kind == Confirmation_Kind.DispatchFailed &
                shipping_confirmation.request_id == Request_Id.None;
}*/

                        
               
                        
                                                                     
                                                                 
                                                                      
                                                                      
                                                                      
                                                                      
                                                                      
                                                                      
                                                                      
                               

                
                        
                                                                                            
                                                                
                                                              

             
                     
                            
                                                                                                        
                                                                                              
                                                                            
                                                                          
                            
                                                                                                            
                                                                                                   
                                                                            
                                                                          
                            
                                                                                                                    
                                                                                               
                                                                               
                                                                                                                   
                            
                                                                                                  
                                                                                           
                                                                                      
                                                                                                                   
       
  }

  part def Status_Determiner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port decision_reason : DataPort { in :>> type : Decision_Reason; }
    port lifecycle_snapshot : DataPort { in :>> type : Dispatch_Lifecycle; }
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }

    language "GUMBO" /*{
            
                                             
                                              

  compute
    compute_cases
      case STATUS_COMPLETED:
        assume lifecycle_snapshot == Dispatch_Lifecycle.TerminalCompleted;
        guarantee dispatch_status == Dispatch_Status.Completed;
      case STATUS_FAILED:
        assume lifecycle_snapshot == Dispatch_Lifecycle.TerminalFailed;
        guarantee dispatch_status == Dispatch_Status.Failed;
      case STATUS_RECOVERING:
        assume lifecycle_snapshot == Dispatch_Lifecycle.RecoveryPending;
        guarantee dispatch_status == Dispatch_Status.Recovering;
      case STATUS_BUSY:
        assume (lifecycle_snapshot == Dispatch_Lifecycle.ActiveFresh | lifecycle_snapshot == Dispatch_Lifecycle.ActiveRetry) &
               decision_reason == Decision_Reason.Busy;
        guarantee dispatch_status == Dispatch_Status.Busy;
      case STATUS_RELEASED:
        assume (lifecycle_snapshot == Dispatch_Lifecycle.ActiveFresh | lifecycle_snapshot == Dispatch_Lifecycle.ActiveRetry) &
               decision_reason != Decision_Reason.Busy;
        guarantee dispatch_status == Dispatch_Status.Released;
      case STATUS_TERMINAL_RESET:
        assume lifecycle_snapshot == Dispatch_Lifecycle.Idle &
               decision_reason == Decision_Reason.TerminalReset;
        guarantee dispatch_status == Dispatch_Status.Idle;
      case STATUS_WAIT_INVENTORY:
        assume lifecycle_snapshot == Dispatch_Lifecycle.Idle &
               decision_reason == Decision_Reason.WaitingInventory;
        guarantee dispatch_status == Dispatch_Status.WaitingInventory;
      case STATUS_WAIT_DOCK:
        assume lifecycle_snapshot == Dispatch_Lifecycle.Idle &
               decision_reason == Decision_Reason.WaitingDock;
        guarantee dispatch_status == Dispatch_Status.WaitingDock;
      case STATUS_REJECTED:
        assume lifecycle_snapshot == Dispatch_Lifecycle.Idle &
               decision_reason == Decision_Reason.Rejected;
        guarantee dispatch_status == Dispatch_Status.Rejected;
      case STATUS_IDLE:
        assume lifecycle_snapshot == Dispatch_Lifecycle.Idle &
               decision_reason != Decision_Reason.WaitingInventory &
               decision_reason != Decision_Reason.WaitingDock &
               decision_reason != Decision_Reason.Rejected &
               decision_reason != Decision_Reason.TerminalReset;
        guarantee dispatch_status == Dispatch_Status.Idle;
}*/

                        
                
                        
                                                                  
                                                  

             
                     
                            
                                                                                    
                                                                              
                                                                   
                            
                                                                              
                                                                           
                                                                
                            
                                                                                                   
                                                                            
                                                                    
                            
                                                                                                            
                                                                          
                                                                           
                                                           
                                                              
                            
                                                                                              
                                                                          
                                                                           
                                                           
                                                                  
                          
                                                                                                                                    
                                                                  
                                                                    
                                                              
                            
                                                                                                               
                                                                  
                                                                       
                                                                          
                            
                                                                                           
                                                                  
                                                                  
                                                                     
                            
                                                                          
                                                                  
                                                               
                                                                  
                            
                                                                      
                                                                  
                                                                        
                                                                   
                                                                
                                                                    
                                                              
       
  }

  part def Dispatch_Coordinator_Process :> Process {
    part request_qualifier : Request_Qualifier;
    part inventory_qualifier : Inventory_Qualifier;
    part dock_qualifier : Dock_Qualifier;
    part outcome_recovery_classifier : Outcome_Recovery_Classifier;
    part dispatch_priority_resolver : Dispatch_Priority_Resolver;
    part release_arbiter : Release_Arbiter;
    part commitment_tracker : Commitment_Tracker;
    part confirmation_determiner : Confirmation_Determiner;
    part status_determiner : Status_Determiner;

    port request : DataPort { in :>> type : Raw_Dispatch_Request; }
    port inventory_snapshot : DataPort { in :>> type : Dispatch_Inventory_Snapshot; }
    port dock_snapshot : DataPort { in :>> type : Dock_Snapshot; }
    port execution_outcome : DataPort { in :>> type : Execution_Outcome; }
    port shipment_instruction : DataPort { out :>> type : Shipment_Instruction; }
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }

    connection int_01_request : PortConnection connect request to request_qualifier.request;
    connection int_02_inventory : PortConnection connect inventory_snapshot to inventory_qualifier.inventory_snapshot;
    connection int_03_dock : PortConnection connect dock_snapshot to dock_qualifier.dock_snapshot;
    connection int_04_outcome : PortConnection connect execution_outcome to outcome_recovery_classifier.execution_outcome;
    connection int_05_request_inventory : PortConnection connect request_qualifier.inventory_request_fact to inventory_qualifier.request_fact;
    connection int_06_request_priority : PortConnection connect request_qualifier.priority_admission to dispatch_priority_resolver.admission;
    connection int_07_request_arbiter : PortConnection connect request_qualifier.arbiter_request_fact to release_arbiter.request_fact;
    connection int_08_inventory_arbiter : PortConnection connect inventory_qualifier.candidate_readiness to release_arbiter.candidate_readiness;
    connection int_09_dock_arbiter : PortConnection connect dock_qualifier.assessment to release_arbiter.dock_assessment;
    connection int_10_tracker_classifier : PortConnection connect commitment_tracker.execution_context to outcome_recovery_classifier.execution_context;
    connection int_11_classifier_priority : PortConnection connect outcome_recovery_classifier.recovery_plan to dispatch_priority_resolver.recovery_plan;
    connection int_12_classifier_tracker : PortConnection connect outcome_recovery_classifier.transition_plan to commitment_tracker.outcome_plan;
    connection int_13_priority_arbiter : PortConnection connect dispatch_priority_resolver.selected_intent to release_arbiter.selected_intent;
    connection int_14_tracker_inventory : PortConnection connect commitment_tracker.recovery_context to inventory_qualifier.recovery_context;
    connection int_15_arbiter_tracker : PortConnection connect release_arbiter.dispatch_decision to commitment_tracker.dispatch_decision;
    connection int_16_instruction : PortConnection connect commitment_tracker.shipment_instruction to shipment_instruction;
    connection int_17_classifier_confirmation : PortConnection connect outcome_recovery_classifier.confirmation_context to confirmation_determiner.confirmation_context;
    connection int_18_confirmation : PortConnection connect confirmation_determiner.shipping_confirmation to shipping_confirmation;
    connection int_19_arbiter_status : PortConnection connect release_arbiter.decision_reason to status_determiner.decision_reason;
    connection int_20_tracker_status : PortConnection connect commitment_tracker.lifecycle_snapshot to status_determiner.lifecycle_snapshot;
    connection int_21_status : PortConnection connect status_determiner.dispatch_status to dispatch_status;
  }

  part def Finished_Product_Dispatch_Coordinator_System :> System {
    part dispatch_coordinator_process : Dispatch_Coordinator_Process;

    port request : DataPort { in :>> type : Raw_Dispatch_Request; }
    port inventory_snapshot : DataPort { in :>> type : Dispatch_Inventory_Snapshot; }
    port dock_snapshot : DataPort { in :>> type : Dock_Snapshot; }
    port execution_outcome : DataPort { in :>> type : Execution_Outcome; }
    port shipment_instruction : DataPort { out :>> type : Shipment_Instruction; }
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }

    connection support_request : PortConnection connect request to dispatch_coordinator_process.request;
    connection support_inventory : PortConnection connect inventory_snapshot to dispatch_coordinator_process.inventory_snapshot;
    connection support_dock : PortConnection connect dock_snapshot to dispatch_coordinator_process.dock_snapshot;
    connection support_outcome : PortConnection connect execution_outcome to dispatch_coordinator_process.execution_outcome;
    connection support_instruction : PortConnection connect dispatch_coordinator_process.shipment_instruction to shipment_instruction;
    connection support_confirmation : PortConnection connect dispatch_coordinator_process.shipping_confirmation to shipping_confirmation;
    connection support_status : PortConnection connect dispatch_coordinator_process.dispatch_status to dispatch_status;
  }

  part finished_product_dispatch_coordinator : Finished_Product_Dispatch_Coordinator_System;
}
