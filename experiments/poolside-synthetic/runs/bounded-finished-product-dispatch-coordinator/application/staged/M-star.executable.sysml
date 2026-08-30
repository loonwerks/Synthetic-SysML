package Factory_Dispatch_Coordinator {

  private import HAMR::*;

  enum def Request_Arrival_Sample {
    enum No_Arrival;
    enum Invalid_R1_AngleA_One;
    enum Invalid_R1_AngleA_Two;
    enum Invalid_R1_AngleB_One;
    enum Invalid_R1_AngleB_Two;
    enum Invalid_R2_AngleA_One;
    enum Invalid_R2_AngleA_Two;
    enum Invalid_R2_AngleB_One;
    enum Invalid_R2_AngleB_Two;
    enum Valid_R1_AngleA_One;
    enum Valid_R1_AngleA_Two;
    enum Valid_R1_AngleB_One;
    enum Valid_R1_AngleB_Two;
    enum Valid_R2_AngleA_One;
    enum Valid_R2_AngleA_Two;
    enum Valid_R2_AngleB_One;
    enum Valid_R2_AngleB_Two;
  }

  enum def Angle_A_Stock_Band {
    enum Zero;
    enum One;
    enum Two_Or_More;
  }

  enum def Angle_B_Stock_Band {
    enum Zero;
    enum One;
    enum Two_Or_More;
  }

  enum def Dispatch_Readiness {
    enum Ready;
    enum Not_Ready;
  }

  enum def Input_Status {
    enum Valid;
    enum Invalid;
  }

  enum def Shipment_Result_Sample {
    enum No_Result;
    enum Invalid_R1_Succeeded;
    enum Invalid_R1_Failed;
    enum Invalid_R2_Succeeded;
    enum Invalid_R2_Failed;
    enum Valid_R1_Succeeded;
    enum Valid_R1_Failed;
    enum Valid_R2_Succeeded;
    enum Valid_R2_Failed;
  }

  enum def Request_Value {
    enum No_Request;
    enum R1_AngleA_One;
    enum R1_AngleA_Two;
    enum R1_AngleB_One;
    enum R1_AngleB_Two;
    enum R2_AngleA_One;
    enum R2_AngleA_Two;
    enum R2_AngleB_One;
    enum R2_AngleB_Two;
  }

  enum def Arrival_Fact {
    enum No_Arrival_Fact;
    enum Invalid_Arrival;
    enum Valid_R1_AngleA_One;
    enum Valid_R1_AngleA_Two;
    enum Valid_R1_AngleB_One;
    enum Valid_R1_AngleB_Two;
    enum Valid_R2_AngleA_One;
    enum Valid_R2_AngleA_Two;
    enum Valid_R2_AngleB_One;
    enum Valid_R2_AngleB_Two;
  }

  enum def Active_Slot {
    enum Empty;
    enum Pending_R1_AngleA_One;
    enum Pending_R1_AngleA_Two;
    enum Pending_R1_AngleB_One;
    enum Pending_R1_AngleB_Two;
    enum Pending_R2_AngleA_One;
    enum Pending_R2_AngleA_Two;
    enum Pending_R2_AngleB_One;
    enum Pending_R2_AngleB_Two;
    enum Submitted_R1_AngleA_One;
    enum Submitted_R1_AngleA_Two;
    enum Submitted_R1_AngleB_One;
    enum Submitted_R1_AngleB_Two;
    enum Submitted_R2_AngleA_One;
    enum Submitted_R2_AngleA_Two;
    enum Submitted_R2_AngleB_One;
    enum Submitted_R2_AngleB_Two;
  }

  enum def Completion_Slot {
    enum No_Completion;
    enum Completed_R1_AngleA_One;
    enum Completed_R1_AngleA_Two;
    enum Completed_R1_AngleB_One;
    enum Completed_R1_AngleB_Two;
    enum Completed_R2_AngleA_One;
    enum Completed_R2_AngleA_Two;
    enum Completed_R2_AngleB_One;
    enum Completed_R2_AngleB_Two;
  }

  enum def Pending_Request_View {
    enum No_Pending_Request;
    enum Pending_R1_AngleA_One;
    enum Pending_R1_AngleA_Two;
    enum Pending_R1_AngleB_One;
    enum Pending_R1_AngleB_Two;
    enum Pending_R2_AngleA_One;
    enum Pending_R2_AngleA_Two;
    enum Pending_R2_AngleB_One;
    enum Pending_R2_AngleB_Two;
  }

  enum def Registry_Outcome {
    enum No_Registry_Notice;
    enum Invalid_Event;
    enum Shipment_Confirmed;
    enum Shipment_Failed_Retry_Pending;
    enum Stale_Result;
    enum Duplicate_Acknowledged;
    enum Identifier_Conflict;
    enum Request_Accepted;
    enum Busy;
  }

  enum def Inventory_Finding {
    enum No_Demand;
    enum Invalid_Inventory;
    enum Sufficient;
    enum Insufficient;
  }

  enum def Dispatch_Disposition {
    enum No_Dispatch_Demand;
    enum Event_Blocked;
    enum Recovery_Held;
    enum Inventory_Invalid;
    enum Readiness_Invalid;
    enum Waiting_Stock;
    enum Waiting_Dispatch;
    enum Release_Issued;
  }

  enum def Registry_Instruction {
    enum No_State_Instruction;
    enum Mark_Submitted_R1_AngleA_One;
    enum Mark_Submitted_R1_AngleA_Two;
    enum Mark_Submitted_R1_AngleB_One;
    enum Mark_Submitted_R1_AngleB_Two;
    enum Mark_Submitted_R2_AngleA_One;
    enum Mark_Submitted_R2_AngleA_Two;
    enum Mark_Submitted_R2_AngleB_One;
    enum Mark_Submitted_R2_AngleB_Two;
  }

  enum def Shipment_Release_Directive {
    enum No_Release;
    enum Release_R1_AngleA_One;
    enum Release_R1_AngleA_Two;
    enum Release_R1_AngleB_One;
    enum Release_R1_AngleB_Two;
    enum Release_R2_AngleA_One;
    enum Release_R2_AngleA_Two;
    enum Release_R2_AngleB_One;
    enum Release_R2_AngleB_Two;
  }

  enum def Customer_Dispatch_Notice {
    enum None;
    enum Invalid_Event;
    enum Request_Accepted;
    enum Duplicate_Acknowledged;
    enum Identifier_Conflict;
    enum Busy;
    enum Stale_Result;
    enum Inventory_Evidence_Invalid;
    enum Readiness_Evidence_Invalid;
    enum Waiting_For_Stock;
    enum Waiting_For_Dispatch;
    enum Release_Issued;
    enum Shipment_Confirmed;
    enum Shipment_Failed_Retry_Pending;
  }

  // Every field inspected by GUMBO is represented as an attribute.
  part def Inventory_Sample :> Data {
    attribute stock_band_angle_a : Angle_A_Stock_Band;
    attribute stock_band_angle_b : Angle_B_Stock_Band;
    attribute status : Input_Status;
  }

  part def Dispatch_Readiness_Sample :> Data {
    attribute readiness : Dispatch_Readiness;
    attribute status : Input_Status;
  }

  part def Dispatch_Candidate :> Data {
    attribute request : Request_Value;
    attribute event_blocked : Base_Types::Boolean;
    attribute recovery_hold : Base_Types::Boolean;
  }

  part def Request_Qualification :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port request_arrival : DataPort { in :>> type : Request_Arrival_Sample; }
    port arrival_fact : DataPort { out :>> type : Arrival_Fact; }

    language "GUMBO" /*{
                
                                             
                                                       

      compute
        compute_cases
          case QUAL_NO_ARRIVAL:
            assume request_arrival == Request_Arrival_Sample.No_Arrival;
            guarantee arrival_fact == Arrival_Fact.No_Arrival_Fact;
          case QUAL_INVALID_ARRIVAL:
            assume request_arrival == Request_Arrival_Sample.Invalid_R1_AngleA_One |
                   request_arrival == Request_Arrival_Sample.Invalid_R1_AngleA_Two |
                   request_arrival == Request_Arrival_Sample.Invalid_R1_AngleB_One |
                   request_arrival == Request_Arrival_Sample.Invalid_R1_AngleB_Two |
                   request_arrival == Request_Arrival_Sample.Invalid_R2_AngleA_One |
                   request_arrival == Request_Arrival_Sample.Invalid_R2_AngleA_Two |
                   request_arrival == Request_Arrival_Sample.Invalid_R2_AngleB_One |
                   request_arrival == Request_Arrival_Sample.Invalid_R2_AngleB_Two;
            guarantee arrival_fact == Arrival_Fact.Invalid_Arrival;
          case QUAL_VALID_ARRIVAL:
            assume request_arrival == Request_Arrival_Sample.Valid_R1_AngleA_One |
                   request_arrival == Request_Arrival_Sample.Valid_R1_AngleA_Two |
                   request_arrival == Request_Arrival_Sample.Valid_R1_AngleB_One |
                   request_arrival == Request_Arrival_Sample.Valid_R1_AngleB_Two |
                   request_arrival == Request_Arrival_Sample.Valid_R2_AngleA_One |
                   request_arrival == Request_Arrival_Sample.Valid_R2_AngleA_Two |
                   request_arrival == Request_Arrival_Sample.Valid_R2_AngleB_One |
                   request_arrival == Request_Arrival_Sample.Valid_R2_AngleB_Two;
            guarantee (request_arrival == Request_Arrival_Sample.Valid_R1_AngleA_One) implies (arrival_fact == Arrival_Fact.Valid_R1_AngleA_One) &
                      (request_arrival == Request_Arrival_Sample.Valid_R1_AngleA_Two) implies (arrival_fact == Arrival_Fact.Valid_R1_AngleA_Two) &
                      (request_arrival == Request_Arrival_Sample.Valid_R1_AngleB_One) implies (arrival_fact == Arrival_Fact.Valid_R1_AngleB_One) &
                      (request_arrival == Request_Arrival_Sample.Valid_R1_AngleB_Two) implies (arrival_fact == Arrival_Fact.Valid_R1_AngleB_Two) &
                      (request_arrival == Request_Arrival_Sample.Valid_R2_AngleA_One) implies (arrival_fact == Arrival_Fact.Valid_R2_AngleA_One) &
                      (request_arrival == Request_Arrival_Sample.Valid_R2_AngleA_Two) implies (arrival_fact == Arrival_Fact.Valid_R2_AngleA_Two) &
                      (request_arrival == Request_Arrival_Sample.Valid_R2_AngleB_One) implies (arrival_fact == Arrival_Fact.Valid_R2_AngleB_One) &
                      (request_arrival == Request_Arrival_Sample.Valid_R2_AngleB_Two) implies (arrival_fact == Arrival_Fact.Valid_R2_AngleB_Two);
    }*/

                        
               
                         
                                                                   
                                                                                       
                                                                          
                                                                          
                                                                          
                                                                          
                                                                          
                                                                          
                                                                          
                                                                                                       
                                                                                                         
                                                                                                         
                                                                                                         
                                                                                                         
                                                                                                         
                                                                                                         
                                                                                                         
                                                

                
                         
                                                                                           
                                                       

             
                     
                           
                                                                       
                                                                        
                                                               
                           
                                                                                                  
                                                                                    
                                                                                    
                                                                                    
                                                                                    
                                                                                    
                                                                                    
                                                                                    
                                                                                   
                                                               
                           
                                                                                                            
                                                                                  
                                                                                  
                                                                                  
                                                                                  
                                                                                  
                                                                                  
                                                                                  
                                                                                 
                                                               
       
  }

  part def Request_Registry :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port arrival_fact : DataPort { in :>> type : Arrival_Fact; }
    port shipment_result : DataPort { in :>> type : Shipment_Result_Sample; }
    port registry_instruction : DataPort { in :>> type : Registry_Instruction; }
    port pending_request : DataPort { out :>> type : Pending_Request_View; }
    port dispatch_candidate : DataPort { out :>> type : Dispatch_Candidate; }
    port registry_outcome : DataPort { out :>> type : Registry_Outcome; }

    language "GUMBO" /*{
      state
        active: Active_Slot;
        last_completed: Completion_Slot;

                
                                        
                                        
                                       
                                                           
                                                                      
                                                                  
                                                     
                                                     
                                                                  

      compute
        modifies active, last_completed;
        guarantee REGISTRY_STATE_INVARIANT:
          (active == Active_Slot.Empty);
    }*/

                        
                        
           
                          
                            
                          
                                        

               
                          
                                                                  
                                                                                     
                                                                                          
                                                                                          
                                                                                          
                                                                                          
                                                                                          
                                                                                          
                                                                                          
                                        
                          
                                                                         
                                                                                        
                        
                                                                           
                                                                  
                                                               
                                                                    
                                                                                             
                                                                       
                                                                    
                                                                         
                                                                                                  
                                        
                        
                                                                                    
                                                                
                                                             
                                                                
                                                            
                        
                                                                                          
                                                              
                                                             
                        
                                                                                          
                                                           
                                                          
                        
                                                                                          
                                                                          
                          
                                                                   
                                                                                                                                     
                                                                                                                                          
                                                                                                                                          
                                                                                                                                          
                                                                                                                                          
                                                                                                                                          
                                                                                                                                          
                                                                                                                                          
                                        
                          
                                                                          
                                                                                            
                                                                                                 
                                                                                                 
                                                                                                 
                                                                                                 
                                                                                                 
                                                                                                 
                                                                                                 
                                        
                          
                                                                           
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                       
                          
                                                                         
                                                                      
                          
                                                                                      
                                                                                  
                                                                                        
                                                                                         
                                                                                          
                                                                                            
                                                                                        
                                                                                         
                                                                                          
                                                                                            
                          
                                                                                       
                                                                                              
                          
                                                              
                                                                                      
                                                                                           
                                                                                           
                                                                                           
                                                                                           
                                                                                           
                                                                                           
                                                 
                          
                                                                    
                                                                                            
                                                                                                 
                                                                                                 
                                                                                                 
                                                                                                 
                                                                                                 
                                                                                                 
                                                       
                         
                                                                                             
                                                                    
                                                             
                         
                                                                                                                             
                               
                                                                
                                                                      
                         
                                                                                                                                 
                                                                                   
                                                                       
                                                                             
                             
                                                                                                                                             
                                              
                                                                                                                                                               
                                                                                                                                                                                         
                                                          
                                                                 
                                                                             
                                                                                 
                                                                                     
                          
                             
                                                                                                                                                     
                                                                                                                                                                  
                                                         
                             
                             
                                                                                                                                                   
                                                                  
                                                                                                                                                                                 
                                                                                                                                                                                            
                                                                             
                                                                                          
                                                                                                          
                                                                                                           
                                                                                      
                                     
                             
                                                                                                                            
                                                                                                  
                                                                    
                         
                                                                                                                                                      
                               
                                                                                               
                        
                                                                     
                                                                                                     
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                          
                                                       
                        
                                                                   
                                                                                                
                              
                                                                                                         
                                                                                                                    
                                                                                                                         
                                                                                                                         
                                                                                                                         
                                                                                                                         
                                                                                                                         
                                                                                                                         
                                                                                                                         
                           

                
                         
                                                                                                                   
                                       
                                                           
                                                                      
                                                                  
                                                 
                                                 
                                                                  

             
                         
                                                                                                                                                           
                                                                                                            
                                                                                                                        
                                                                                                                                        
                                                                                                                            
                                                                                                              
                                                                                                                                         
                                                                                                            
                          
                                                                                                    
                                                  

                     
                           
                                                                                                                                          
                                                                
                                                                          
                                                             
                                                             
                                                                  
                           
                                                                                                                    
                                                                     
                                                                                               
                                                                                           
                                                                               
                                                   
                                                                                       
                                                                             
                           
                                                                                                                                            
                                                                     
                                                                                               
                                                                                           
                                                                                          
                                                                             
                                                            
                                                            
                           
                                                                                                      
                                                                                                                
                                                                                                                                   
                                                                         
                                                                                  
                           
                                                                                                               
                                                                                                                      
                                                                               
                                                                   
                                                                                                    
                           
                                                                                                                 
                                                                                                                                       
                                                                                   
                                                                   
                                                            
                           
                                                                                                                               
                                                                                                                                           
                                                                                
                                                                                   
                                                                                                    
                           
                                                                                                                      
                                                                                                         
                                                                                      
                                                                                          
                                                   
                                                                             
                                                                                                    
                                                                                  
                           
                                                                                                         
                                                                                                         
                                                                                      
                                                                                          
                                                   
                                                                 
                                                                   
                                                                                  
       
  }

  part def Inventory_Assessment :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port pending_request : DataPort { in :>> type : Pending_Request_View; }
    port inventory_evidence : DataPort { in :>> type : Inventory_Sample; }
    port inventory_finding : DataPort { out :>> type : Inventory_Finding; }

    language "GUMBO" /*{
                
                                              
                                                           

      compute
        compute_cases
          case STOCK_NO_DEMAND:
            assume pending_request == Pending_Request_View.No_Pending_Request;
            guarantee inventory_finding == Inventory_Finding.No_Demand;
          case STOCK_INVALID:
            assume pending_request != Pending_Request_View.No_Pending_Request &
                   inventory_evidence.status == Input_Status.Invalid;
            guarantee inventory_finding == Inventory_Finding.Invalid_Inventory;
    }*/

                        
               
                          
                                                                           
                                                               
                                                               
                                                               
                                                              
                          
                                                                              
                                                               
                                                               
                                                               
                                                              
                          
                                                                                                                                              
                              
                                                                         
                                                                                      
                                  
                                                                         
                                                                                     

                
                         
                                                                                                
                                                           

             
                     
                            
                                                                                 
                                                                              
                                                                       
                           
                                                                                 
                                                                               
                                                                     
                                                                               
                            
                                                                                                 
                                                                               
                                                                    
                                                                                                                                      
                                                                        
                            
                                                                                                      
                                                                               
                                                                    
                                                                                                                                          
                                                                          
       
  }

  part def Dispatch_Arbiter :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port dispatch_candidate : DataPort { in :>> type : Dispatch_Candidate; }
    port inventory_finding : DataPort { in :>> type : Inventory_Finding; }
    port readiness_sample : DataPort { in :>> type : Dispatch_Readiness_Sample; }
    port registry_instruction : DataPort { out :>> type : Registry_Instruction; }
    port shipment_release : DataPort { out :>> type : Shipment_Release_Directive; }
    port dispatch_disposition : DataPort { out :>> type : Dispatch_Disposition; }

    language "GUMBO" /*{
                
                                       
                                                                             
                                                                     
                                                                          

      compute
        compute_cases
          case CASE_10_NO_DISPATCH_DEMAND:
            assume dispatch_candidate.request == Request_Value.No_Request;
            guarantee shipment_release == Shipment_Release_Directive.No_Release &
                    registry_instruction == Registry_Instruction.No_State_Instruction &
                    dispatch_disposition == Dispatch_Disposition.No_Dispatch_Demand;
    }*/

                        
               
                              
                                                                            
                                                                                                     
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                          
                                                                
                              
                                                                          
                                                                                                      
                                                                                                           
                                                                                                           
                                                                                                           
                                                                                                           
                                                                                                           
                                                                                                           
                                                                 
                             
                                                                                                                                                     
                                                         
                                                                       
                                                   
                                                  
                                                          
                             
                                                                                                                                                         
                                                                               
                                                                                    
                                                                                                          
                                                                                                    
                                                                                                 
                                                     

                
                         
                                                                                                           
                                                                             
                                                                     
                                                                          

             
                     
                           
                                                                                                           
                                                                          
                                                                                 
                                                                                         
                                                                                      
                           
                                                                                                                               
                                                                           
                                                                                                 
                                                                                 
                                                                                         
                                                                                                                           
                           
                                                                                                                                                         
                                                                                             
                                                                                   
                                                                                           
                                                                                  
       
  }

  part def Customer_Notice_Synthesis :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port registry_outcome : DataPort { in :>> type : Registry_Outcome; }
    port dispatch_disposition : DataPort { in :>> type : Dispatch_Disposition; }
    port customer_notice : DataPort { out :>> type : Customer_Dispatch_Notice; }

    language "GUMBO" /*{
                
                                      
                                                           

      compute
        guarantee NOTICE_PRIORITY_RESOLUTION:
          (registry_outcome == Registry_Outcome.Invalid_Event) implies (customer_notice == Customer_Dispatch_Notice.Invalid_Event) &
          (registry_outcome == Registry_Outcome.Identifier_Conflict) implies (customer_notice == Customer_Dispatch_Notice.Identifier_Conflict) &
          (registry_outcome == Registry_Outcome.Stale_Result) implies (customer_notice == Customer_Dispatch_Notice.Stale_Result) &
          (registry_outcome == Registry_Outcome.Busy) implies (customer_notice == Customer_Dispatch_Notice.Busy) &
          (registry_outcome == Registry_Outcome.Shipment_Failed_Retry_Pending) implies (customer_notice == Customer_Dispatch_Notice.Shipment_Failed_Retry_Pending) &
          (registry_outcome == Registry_Outcome.Duplicate_Acknowledged) implies (customer_notice == Customer_Dispatch_Notice.Duplicate_Acknowledged) &
          (dispatch_disposition == Dispatch_Disposition.Inventory_Invalid) implies (customer_notice == Customer_Dispatch_Notice.Inventory_Evidence_Invalid) &
          (dispatch_disposition == Dispatch_Disposition.Readiness_Invalid) implies (customer_notice == Customer_Dispatch_Notice.Readiness_Evidence_Invalid) &
          (dispatch_disposition == Dispatch_Disposition.Waiting_Stock) implies (customer_notice == Customer_Dispatch_Notice.Waiting_For_Stock) &
          (dispatch_disposition == Dispatch_Disposition.Waiting_Dispatch) implies (customer_notice == Customer_Dispatch_Notice.Waiting_For_Dispatch) &
          (dispatch_disposition == Dispatch_Disposition.Release_Issued) implies (customer_notice == Customer_Dispatch_Notice.Release_Issued) &
          (registry_outcome == Registry_Outcome.Shipment_Confirmed) implies (customer_notice == Customer_Dispatch_Notice.Shipment_Confirmed) &
          (registry_outcome == Registry_Outcome.Request_Accepted) implies (customer_notice == Customer_Dispatch_Notice.Request_Accepted);
    }*/

                        
               
                           
                                                                                                               
                                                                                                 
                                                                                                                  
                                                                                                    
                                                                                    
                                                                                                                                      
                                                                                                                        
                                                                                                                           
                                                                                                                           
                                                                                                              
                                                                                                                    
                                                                                                            
                                                                                                                
                                                                                                            
                                             

                
                         
                                                                            
                                                           

             
                           
                                                                                                                           
                                                                                
       
  }

  part def Dispatch_Coordination_Process :> Process {
    part request_qualification : Request_Qualification;
    part request_registry : Request_Registry;
    part inventory_assessment : Inventory_Assessment;
    part dispatch_arbiter : Dispatch_Arbiter;
    part customer_notice_synthesis : Customer_Notice_Synthesis;

    port request_arrival : DataPort { in :>> type : Request_Arrival_Sample; }
    port shipment_result : DataPort { in :>> type : Shipment_Result_Sample; }
    port inventory_evidence : DataPort { in :>> type : Inventory_Sample; }
    port readiness_sample : DataPort { in :>> type : Dispatch_Readiness_Sample; }
    port shipment_release : DataPort { out :>> type : Shipment_Release_Directive; }
    port customer_notice : DataPort { out :>> type : Customer_Dispatch_Notice; }

    connection support_arrival_to_qualification : PortConnection
      connect request_arrival to request_qualification.request_arrival;
    connection qualified_arrival_to_registry : PortConnection
      connect request_qualification.arrival_fact to request_registry.arrival_fact;
    connection support_result_to_registry : PortConnection
      connect shipment_result to request_registry.shipment_result;
    connection pending_request_to_inventory : PortConnection
      connect request_registry.pending_request to inventory_assessment.pending_request;
    connection support_inventory_to_assessment : PortConnection
      connect inventory_evidence to inventory_assessment.inventory_evidence;
    connection candidate_to_arbiter : PortConnection
      connect request_registry.dispatch_candidate to dispatch_arbiter.dispatch_candidate;
    connection inventory_finding_to_arbiter : PortConnection
      connect inventory_assessment.inventory_finding to dispatch_arbiter.inventory_finding;
    connection support_readiness_to_arbiter : PortConnection
      connect readiness_sample to dispatch_arbiter.readiness_sample;
    connection arbiter_instruction_to_registry : PortConnection
      connect dispatch_arbiter.registry_instruction to request_registry.registry_instruction;
    connection support_release_to_process : PortConnection
      connect dispatch_arbiter.shipment_release to shipment_release;
    connection registry_outcome_to_notice : PortConnection
      connect request_registry.registry_outcome to customer_notice_synthesis.registry_outcome;
    connection disposition_to_notice : PortConnection
      connect dispatch_arbiter.dispatch_disposition to customer_notice_synthesis.dispatch_disposition;
    connection support_notice_to_process : PortConnection
      connect customer_notice_synthesis.customer_notice to customer_notice;
  }

  part def Finished_Product_Dispatch_Coordinator_System :> System {
    part dispatch_coordination_process : Dispatch_Coordination_Process;

    port request_arrival : DataPort { in :>> type : Request_Arrival_Sample; }
    port shipment_result : DataPort { in :>> type : Shipment_Result_Sample; }
    port inventory_evidence : DataPort { in :>> type : Inventory_Sample; }
    port readiness_sample : DataPort { in :>> type : Dispatch_Readiness_Sample; }
    port shipment_release : DataPort { out :>> type : Shipment_Release_Directive; }
    port customer_notice : DataPort { out :>> type : Customer_Dispatch_Notice; }

    connection support_boundary_arrival : PortConnection
      connect request_arrival to dispatch_coordination_process.request_arrival;
    connection support_boundary_result : PortConnection
      connect shipment_result to dispatch_coordination_process.shipment_result;
    connection support_boundary_inventory : PortConnection
      connect inventory_evidence to dispatch_coordination_process.inventory_evidence;
    connection support_boundary_readiness : PortConnection
      connect readiness_sample to dispatch_coordination_process.readiness_sample;
    connection support_boundary_release : PortConnection
      connect dispatch_coordination_process.shipment_release to shipment_release;
    connection support_boundary_notice : PortConnection
      connect dispatch_coordination_process.customer_notice to customer_notice;
  }

  part finished_product_dispatch_coordinator : Finished_Product_Dispatch_Coordinator_System;
}
