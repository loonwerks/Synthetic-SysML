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
    port request : DataPort { in :>> type : Raw_Dispatch_Request; }
    port inventory_request_fact : DataPort { out :>> type : Qualified_Request_Fact; }
    port priority_admission : DataPort { out :>> type : Admission_Assessment; }
    port arbiter_request_fact : DataPort { out :>> type : Qualified_Request_Fact; }

                        
                
                        
                                                                                              
                                                                               
                                                                
                                                                
                                                               
                                                                       
                                                                
                                                                             
                                                              
                                                              
                                                             
                                                                    

             
                        
                                                                                                                                
                                                                   
                                                                 
                                                                   
                                                                   
                                                           
                                                                 
                                                                 
                                                                 
                                                         
                                                              

                     
                            
                                                                             
                                                          
                                                          
                                                        
                                                                           
                            
                                                                                                                   
                                                               
                                                               
                                                               
                                                           
                                                           
                                                          
                                                                           
                            
                                                                                         
                                                          
                                                          
                                                         
                                                                   
                                                                          
                            
                                                                                    
                                                          
                                                          
                                                         
                                                                
                                                                                 
       
  }

  part def Inventory_Qualifier :> Thread {
    port inventory_snapshot : DataPort { in :>> type : Dispatch_Inventory_Snapshot; }
    port request_fact : DataPort { in :>> type : Qualified_Request_Fact; }
    port recovery_context : DataPort { in :>> type : Recovery_Qualification_Context; }
    port candidate_readiness : DataPort { out :>> type : Candidate_Inventory_Readiness; }

                        
               
                          
                                                                                                           
                                          
                                                                               
                                           
                                                                                                                      
                                           
                                                                                   
                                                                              
                          
                                                                                                        
                                                                               
                                           
                                                                                   
                                           
                                                                                                                      
                                                                              
                        
                                                                                                                        
                                                                                               
                                                                                               
                                                                                               
                                                                                              
                          
                                                                                                                    
                                          
                                                                               
                                           
                                                                                                                      
                                           
                                                                                   
                                                                              
                          
                                                                                                                 
                                                                               
                                           
                                                                                   
                                           
                                                                                                                      
                                                                              
                        
                                                                                                                                       
                                                                                                     
                                                                                                     
                                                                                                     
                                                                                                    
                          
                                                                                                                            
                                                       
                                              
                                                   
                                                 
                          
                                                                                                                              
                                                       
                                              
                                                   
                                              
                          
                                                                                                                         
                                                         
                                              
                                                      
                        
                                                                                                                                 
                                                                                                                
                                                                                              
                                                                                                  
                                                  
                        
                                                                                                                                                  
                                                                       
                                                                     
                                                                     
                                                                                                       
                                                                
                                                                               
                                                                                                                       
                                                                
                                                                               
                                                                                                                      
                                                     
                        
                                                                                  
                                                                       
                                                                            
                                                                            
                                                                            
                                                                            
                                                                            
                                                                            
                                                                            
                                         
                        
                                                                                  
                                                                       
                                                                            
                                                                            
                                                                            
                                         
                        
                                                                         
                                                               
                                                                    
                                                                    
                                                                    
                                   
                        
                                                                                  
                                                                                       
                                                                                                    
                                                                                            
                                                                                                        
                                                                                                  
                                        

                
                        
                                                                                                                                             
                                                                                            
                                                                                                  
                                                                                
                                                                                
                                                                      
                                                                             

             
                        
                                                                                                                               
                                                                                                          
                        
                                                                                                                                    
                                                                                                                    
                        
                                                                                                                           
                                                                                                            
                                                                                                            
                                                                                                   
                                                                                                    
       
  }

  part def Dock_Qualifier :> Thread {
    port dock_snapshot : DataPort { in :>> type : Dock_Snapshot; }
    port assessment : DataPort { out :>> type : Dock_Assessment; }

                        
                
                        
                                                                                         
                                                

             
                     
                            
                                                             
                                                                         
                                                                       
                                                          
                            
                                                                              
                                                                         
                                                                       
                                                            
                            
                                                                        
                                                                          
                                                            
       
  }

  part def Outcome_Recovery_Classifier :> Thread {
    port execution_outcome : DataPort { in :>> type : Execution_Outcome; }
    port execution_context : DataPort { in :>> type : Active_Execution_Context; }
    port recovery_plan : DataPort { out :>> type : Outcome_Plan; }
    port transition_plan : DataPort { out :>> type : Outcome_Plan; }
    port confirmation_context : DataPort { out :>> type : Confirmation_Context; }

                        
               
                        
                                                                                  
                                                                                  
                                                                                         
                                                                                                 
                                                
                        
                                                                                  
                                                                         
                                                                              
                                                                              
                                                                              
                                                                              
                                                                              
                                                                              
                                                                              
                                            
                        
                                                                                             
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                   
                        
                                                                                                
                                                                                           
                                                                                          

                
                        
                                                                                                                    
                                                  
                                                    
                                                                                      
                                                                                       

             
                        
                                                                                                        
                                            
                                                                                      
                                                                                                               

                     
                            
                                                                                                                       
                                                                                     
                                                                    
                            
                                                                                                               
                                                                                   
                                                                                    
                                                                                   
                                                                                                    
                                                                                              
                                                                        
                                                                
                            
                                                                                                                
                                                                                  
                                                                                   
                                                                                                    
                                                                               
                                                                     
                                                                    
                            
                                                                                                         
                                                                                  
                                                                                   
                                                                                                    
                                                                               
                                                                     
                                                            
                            
                                                                                                           
                                                                                      
                                                                                         
                                                                                          
                                                                                         
                                                                                                          
                                                                                                    
                                                                                
                                                                                        
                                                                                         
                                                                                                          
                                                                                     
                                                                             
                                                                                        
                                                                                         
                                                                                                          
                                                                                     
                                                                             
                                                               
       
  }

  part def Dispatch_Priority_Resolver :> Thread {
    port admission : DataPort { in :>> type : Admission_Assessment; }
    port recovery_plan : DataPort { in :>> type : Outcome_Plan; }
    port selected_intent : DataPort { out :>> type : Selected_Intent; }

                        
                
                        
                                                                                             
                                                  

             
                     
                            
                                                                                                                 
                                                               
                                                                        
                            
                                                                                                    
                                                                
                                                                     
                                                                     
                            
                                                                                 
                                                                
                                                                     
                                                              
       
  }

  part def Release_Arbiter :> Thread {
    port request_fact : DataPort { in :>> type : Qualified_Request_Fact; }
    port candidate_readiness : DataPort { in :>> type : Candidate_Inventory_Readiness; }
    port dock_assessment : DataPort { in :>> type : Dock_Assessment; }
    port selected_intent : DataPort { in :>> type : Selected_Intent; }
    port dispatch_decision : DataPort { out :>> type : Dispatch_Decision; }
    port decision_reason : DataPort { out :>> type : Decision_Reason; }

                        
               
                        
                                                                        
                                                              
                                                                   
                                                                   
                                                                   
                                                                   
                                                                   
                                                                   
                                                                   
                               
                        
                                                                        
                                                              
                                                                   
                                                                   
                                                                   
                               
                        
                                                                        
                                                               
                                                                    
                                                                    
                                                                    
                                  

                
                        
                                                                                                   
                                                                 
                                                           
                                                           
                                                          
                                                  

             
                     
                            
                                                                                                                     
                                                                                                   
                                                                                  
                                                                       
                                                                       
                                                                      
                                                                       
                            
                                                                                                               
                                                                                                
                                                                                  
                                                                       
                                                                       
                                                                      
                                                                       
                            
                                                                                                    
                                                                                               
                                                                                                
                                                                             
                                                                             
                                                                                                                 
                                                                                                                 
                                                                                                        
                                                              
                            
                                                                                                       
                                                                                               
                                                                                                
                                                                             
                                                                             
                                                                       
                                                                       
                                                                      
                                                                  
                            
                                                                                        
                                                                                       
                                                                             
                                                                               
                                                                       
                                                                       
                                                                      
                                                                  
                            
                                                                                      
                                                                                       
                                                                            
                                                                               
                                                                       
                                                                       
                                                                      
                                                                  
                            
                                                                                                                   
                                                                                        
                                                                    
                                                                                                    
                                                                                                   
                                                                       
                                                                                                         
                                                                                      
                                                                          
                            
                                                                                     
                                                                                         
                                                                     
                                                                                                     
                                                                                                    
                                                                        
                                                                                                            
                                                            
                                                                                 
                                                                     
                            
                                                                                                
                                                                                       
                                                                   
                                                                                                  
                                                            
                                                                                     
                                                                               
                                                                               
                                                                       
                                                                  
                            
                                                                                                            
                                                                                                  
                                                                      
                                                                                                        
                                                            
                                                                                     
                                                                                                                 
                                                                                                                 
                                                                                                        
                                                                  
                            
                                                                                                     
                                                                                       
                                                            
                                                                              
                                                                            
                                                                             
                                                                       
                                                                       
                                                                      
                                                              
       
  }

  part def Commitment_Tracker :> Thread {
    port outcome_plan : DataPort { in :>> type : Outcome_Plan; }
    port dispatch_decision : DataPort { in :>> type : Dispatch_Decision; }
    port execution_context : DataPort { out :>> type : Active_Execution_Context; }
    port recovery_context : DataPort { out :>> type : Recovery_Qualification_Context; }
    port shipment_instruction : DataPort { out :>> type : Shipment_Instruction; }
    port lifecycle_snapshot : DataPort { out :>> type : Dispatch_Lifecycle; }

                        
                      
           
                        
                                      
                         
                                      
                         
                                      
                         
                                       
                        
                                         

               
                        
                                                                
                                                            
                                                                 
                                                                 
                                                                 
                                                                 
                                                                 
                                                                 
                                                                 
                                       
                        
                                                                        
                                                                                   
                                            
                        
                                                                  
                                                             
                                                                  
                                                                  
                                                                  
                                                                  
                                                                  
                                                                  
                                                                  
                                        
                        
                                                                          
                                                             
                                                                  
                                                                  
                                                                  
                                        
                        
                                                                         
                                                              
                                                                   
                                                                   
                                                                   
                                  
                
                        
                                                                                                                     
                                                
                                                
                                                
                                               
                                                           
                                                                  
                                                                          
                                                                            
                                                                 
                                                                          
                                                                          
                                                                
                                                                       
                                                              
                                                              
                                                             
                                                        

             
                        
                                                                                                                        
                                                        
                                                                                    
                                                                                  
                        
                                                                                                                                 
                                                       
                                                                                    
                                                                                            
                                                                                 
                        
                                                                                                                
                                          

                     
                            
                                                                                          
                                                             
                                                                                 
                                                                   
                                                                         
                                                                         
                                                                 
                                                                       
                                                                                  
                                                                                       
                                                                                       
                                                                              
                            
                                                                                                                                 
                                                                     
                                                                      
                                                          
                                                                         
                                                                  
                                                                  
                                                          
                                                            
                                                                                   
                                                                          
                                                                          
                                                                        
                            
                                                                                                               
                                                                    
                                                              
                                                                       
                                                                  
                                                                  
                                                          
                                                                       
                                                                                   
                                                                          
                                                                          
                                                                        
                            
                                                                                                             
                                                                        
                                                                                 
                                                                   
                                                                  
                                                                  
                                                          
                                                                       
                                                                                  
                                                                                
                                                                                
                                                                       
                            
                                                                                                                     
                                                                    
                                                      
                                                                      
                                                                  
                                                                  
                                                          
                                                                       
                                                                            
                                                                                
                                                                                
                                                                       
                            
                                                                                                 
                                                                     
                                                                      
                                                         
                                                  
                                                                  
                                                                  
                                                          
                                                            
                                                                                   
                                                                          
                                                                          
                                                                        
                            
                                                                                                                       
                                                              
                                                                          
                                                                                  
                                                  
                                                                  
                                                                  
                                                          
                                                            
                                                                                   
                                                                          
                                                                          
                                                                        
                            
                                                                                                                 
                                                              
                                                                          
                                                                             
                                                  
                                                                  
                                                                  
                                                          
                                                            
                                                                                   
                                                                          
                                                                          
                                                                        
                            
                                                                                                 
                                                             
                                                                                  
                                                                                   
                                                                             
                                                            
                                                            
                                                            
                                                           
                                                                       
                                                                                   
                                                                          
                                                                          
                                                                        
                          
                                                                                                                      
                                                                           
                                                                         
                                                                              
                                                            
                                                            
                                                            
                                                           
                                                                       
                                                                                   
                                                                          
                                                                          
                                                                        
       
  }

  part def Confirmation_Determiner :> Thread {
    port confirmation_context : DataPort { in :>> type : Confirmation_Context; }
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }

                        
               
                        
                                                                     
                                                                 
                                                                      
                                                                      
                                                                      
                                                                      
                                                                      
                                                                      
                                                                      
                               

                
                        
                                                                                            
                                                                
                                                              

             
                     
                            
                                                                                                        
                                                                                              
                                                                            
                                                                          
                            
                                                                                                            
                                                                                                   
                                                                            
                                                                          
                            
                                                                                                                    
                                                                                               
                                                                               
                                                                                                                   
                            
                                                                                                  
                                                                                           
                                                                                      
                                                                                                                   
       
  }

  part def Status_Determiner :> Thread {
    port decision_reason : DataPort { in :>> type : Decision_Reason; }
    port lifecycle_snapshot : DataPort { in :>> type : Dispatch_Lifecycle; }
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }

                        
                
                        
                                                                  
                                                  

             
                     
                            
                                                                                    
                                                                              
                                                                   
                            
                                                                              
                                                                           
                                                                
                            
                                                                                                   
                                                                            
                                                                    
                            
                                                                                                            
                                                                          
                                                                           
                                                           
                                                              
                            
                                                                                              
                                                                          
                                                                           
                                                           
                                                                  
                          
                                                                                                                                    
                                                                  
                                                                    
                                                              
                            
                                                                                                               
                                                                  
                                                                       
                                                                          
                            
                                                                                           
                                                                  
                                                                  
                                                                     
                            
                                                                          
                                                                  
                                                               
                                                                  
                            
                                                                      
                                                                  
                                                                        
                                                                   
                                                                
                                                                    
                                                              
       
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
