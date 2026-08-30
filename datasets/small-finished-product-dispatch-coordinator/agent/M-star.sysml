package Factory_Dispatch_Coordinator {

  private import HAMR::*;

  enum def Dispatch_Request_Event {
    enum No_Request;
    enum Request_Shipment;
  }

  enum def Input_Status {
    enum Valid;
    enum Invalid;
  }

  enum def Product_Availability {
    enum Unavailable;
    enum Available;
  }

  enum def Dispatch_Outcome {
    enum No_Report;
    enum Shipment_Accepted;
  }

  enum def Shipment_Release_Command {
    enum Hold;
    enum Release;
  }

  enum def Dispatch_Status {
    enum Idle;
    enum Waiting_Product;
    enum Release_Issued;
    enum Shipment_Acknowledged;
    enum Unexpected_Outcome;
    enum Input_Fault;
    enum Recovery_Awaiting_Neutral;
  }

  enum def Shipping_Confirmation {
    enum Not_Issued;
    enum Issued;
  }

  enum def Qualified_Request {
    enum Invalid_Request;
    enum No_Qualified_Request;
    enum Qualified_Shipment_Request;
  }

  enum def Availability_Assessment_Value {
    enum Invalid_Availability;
    enum Product_Unavailable;
    enum Product_Available;
  }

  enum def Qualified_Outcome {
    enum Invalid_Outcome;
    enum No_Qualified_Report;
    enum Qualified_Shipment_Accepted;
  }

  enum def Dispatch_Phase {
    enum Idle;
    enum Awaiting_Product;
    enum Release_Outstanding;
  }

  enum def Dispatch_Disposition {
    enum Input_Fault;
    enum Recovery_Blocked;
    enum Recovery_Cleared;
    enum Shipment_Acknowledged;
    enum Unexpected_Outcome;
    enum Release_From_Idle;
    enum Queue_For_Product;
    enum Release_From_Queue;
    enum Hold_Position;
  }

  // Every member below is an attribute because GUMBO inspects it.
  part def Dispatch_Request_Sample :> Data {
    attribute 'event' : Dispatch_Request_Event;
    attribute status : Input_Status;
  }

  part def Product_Availability_Sample :> Data {
    attribute availability : Product_Availability;
    attribute status : Input_Status;
  }

  part def Dispatch_Outcome_Sample :> Data {
    attribute outcome : Dispatch_Outcome;
    attribute status : Input_Status;
  }

  part def Dispatch_Resolution :> Data {
    attribute next_phase : Dispatch_Phase;
    attribute next_recovery_required : Base_Types::Boolean;
    attribute disposition : Dispatch_Disposition;
  }

  part def Request_Qualification :> Thread {
    port raw_request : DataPort { in :>> type : Dispatch_Request_Sample; }
    port qualified_request : DataPort { out :>> type : Qualified_Request; }

                        
                
                         
                                                                                                          
                                                                 

             
                     
                               
                                                                                           
                                                              
                                                                             
                               
                                                                                 
                                                             
                                                                            
                                                                                  
                               
                                                                                              
                                                             
                                                                                  
                                                                                        
       
  }

  part def Availability_Assessment :> Thread {
    port raw_availability : DataPort { in :>> type : Product_Availability_Sample; }
    port availability_assessment : DataPort { out :>> type : Availability_Assessment_Value; }

                        
                
                         
                                                                                                                   
                                                                                        

             
                     
                               
                                                                                                          
                                                                   
                                                                                                    
                               
                                                                                   
                                                                  
                                                                                     
                                                                                                   
                               
                                                                             
                                                                  
                                                                                   
                                                                                                 
       
  }

  part def Outcome_Qualification :> Thread {
    port raw_outcome : DataPort { in :>> type : Dispatch_Outcome_Sample; }
    port qualified_outcome : DataPort { out :>> type : Qualified_Outcome; }

                        
                
                         
                                                                                                          
                                                                 

             
                     
                               
                                                                                           
                                                              
                                                                             
                               
                                                                               
                                                             
                                                                     
                                                                                 
                               
                                                                                                
                                                             
                                                                             
                                                                                         
       
  }

  part def Dispatch_Decision_Owner :> Thread {
    port qualified_request : DataPort { in :>> type : Qualified_Request; }
    port availability_assessment : DataPort { in :>> type : Availability_Assessment_Value; }
    port qualified_outcome : DataPort { in :>> type : Qualified_Outcome; }
    port release_resolution : DataPort { out :>> type : Dispatch_Resolution; }
    port notice_resolution : DataPort { out :>> type : Dispatch_Resolution; }

                        
                        
           
                                      
                                               

                
                         
                                                                                                                           
                                                
                                  
                                                                
                                                          
                                                                                
                                                               
                                                         
                                                                              

             
                          
                                                                                                                                                  
                                                                          
                                                          
                                                                          
                                                         
                                                                         
                                                                          

                     
                           
                                                                                                      
                                                                           
                                                                                                  
                                                                          
                                                            
                                              
                                                                            
                                                                      
                                                                                          
                                                                           
                                                                     
                                                                                        

                           
                                                                                                                   
                                                                           
                                                                                                  
                                                                           
                                               
                                                                                 
                                                                                
                                                            
                                              
                                                                            
                                                                      
                                                                                               
                                                                           
                                                                     
                                                                                             

                           
                                                                                                            
                                                                           
                                                                                                  
                                                                           
                                               
                                                                                
                                                                              
                                                            
                                              
                                                                            
                                                                      
                                                                                               
                                                                           
                                                                     
                                                                                             

                           
                                                                                                                                         
                                                                           
                                                                                                  
                                                                           
                                               
                                                                            
                                                                                      
                                                            
                                              
                                                                            
                                                                      
                                                                                                    
                                                                           
                                                                     
                                                                                                  

                           
                                                                                                                        
                                                                           
                                                                                                  
                                                                           
                                               
                                                                            
                                                                                      
                                                          
                                              
                                                                          
                                                                      
                                                                                                 
                                                                         
                                                                     
                                                                                               

                           
                                                                                                
                                                                           
                                                                                                  
                                                                               
                                               
                                                             
                                                                                      
                                                                                              
                                                                           
                                              
                                                                                           
                                                                      
                                                                                                
                                                                                          
                                                                     
                                                                                              

                           
                                                                                                 
                                                                           
                                                                                                  
                                                                               
                                               
                                                             
                                                                                      
                                                                                                
                                                                        
                                              
                                                                                        
                                                                      
                                                                                                
                                                                                       
                                                                     
                                                                                              

                           
                                                                                                                      
                                                                           
                                                                                               
                                                                               
                                               
                                                                        
                                                                           
                                              
                                                                                           
                                                                      
                                                                                                 
                                                                                          
                                                                     
                                                                                               

                           
                                                                                                  
                                                                           
                                                                                                  
                                                                               
                                               
                                                                  
                                                                                           
                                                                                                     
                                                                  
                                                                                           
                                                                                                       
                                                                              
                                                                                                    
                                                          
                                              
                                                                          
                                                                      
                                                                                            
                                                                         
                                                                     
                                                                                          
       
  }

  part def Release_Command_Derivation :> Thread {
    port dispatch_resolution : DataPort { in :>> type : Dispatch_Resolution; }
    port shipment_release_command : DataPort { out :>> type : Shipment_Release_Command; }

                        
                
                         
                                                                             
                                                                    

             
                     
                           
                                                                                 
                                                                                              
                                                                                              
                                                                                   
                           
                                                                       
                                                                                              
                                                                                              
                                                                                
       
  }

  part def Dispatch_Notice_Derivation :> Thread {
    port dispatch_resolution : DataPort { in :>> type : Dispatch_Resolution; }
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }

                        
                
                         
                                                                                         
                                                   
                                                                    

             
                     
                             
                                                                                       
                                                                                       
                                                                                                                                 
                             
                                                                                                        
                                                                                            
                                                                                                                                               
                             
                                                                                     
                                                                                            
                                                                                                                          
                             
                                                                                             
                                                                                                 
                                                                                                                                       
                             
                                                                              
                                                                                              
                                                                                                                                        
                             
                                                                                         
                                                                                              
                                                                                              
                                                                                                                                    
                             
                                                                                  
                                                                                             
                                                                                                                                     
                             
                                                            
                                                                                          
                                                                         
                                                                                                                          
                             
                                                                                       
                                                                                          
                                                                                     
                                                                                                                                     
                             
                                                                                            
                                                                                          
                                                                                        
                                                                                                                                    
       
  }

  part def Dispatch_Coordination_Process :> Process {
    part request_qualification : Request_Qualification;
    part availability_assessment : Availability_Assessment;
    part outcome_qualification : Outcome_Qualification;
    part dispatch_decision_owner : Dispatch_Decision_Owner;
    part release_command_derivation : Release_Command_Derivation;
    part dispatch_notice_derivation : Dispatch_Notice_Derivation;

    port dispatch_request : DataPort { in :>> type : Dispatch_Request_Sample; }
    port product_availability : DataPort { in :>> type : Product_Availability_Sample; }
    port dispatch_outcome : DataPort { in :>> type : Dispatch_Outcome_Sample; }
    port shipment_release_command : DataPort { out :>> type : Shipment_Release_Command; }
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }

    connection support_request_to_qualifier : PortConnection
      connect dispatch_request to request_qualification.raw_request;
    connection qualified_request_to_owner : PortConnection
      connect request_qualification.qualified_request to dispatch_decision_owner.qualified_request;
    connection support_availability_to_assessment : PortConnection
      connect product_availability to availability_assessment.raw_availability;
    connection assessed_availability_to_owner : PortConnection
      connect availability_assessment.availability_assessment to dispatch_decision_owner.availability_assessment;
    connection support_outcome_to_qualifier : PortConnection
      connect dispatch_outcome to outcome_qualification.raw_outcome;
    connection qualified_outcome_to_owner : PortConnection
      connect outcome_qualification.qualified_outcome to dispatch_decision_owner.qualified_outcome;
    connection resolution_to_release_derivation : PortConnection
      connect dispatch_decision_owner.release_resolution to release_command_derivation.dispatch_resolution;
    connection resolution_to_notice_derivation : PortConnection
      connect dispatch_decision_owner.notice_resolution to dispatch_notice_derivation.dispatch_resolution;
    connection support_release_to_process_boundary : PortConnection
      connect release_command_derivation.shipment_release_command to shipment_release_command;
    connection support_status_to_process_boundary : PortConnection
      connect dispatch_notice_derivation.dispatch_status to dispatch_status;
    connection support_confirmation_to_process_boundary : PortConnection
      connect dispatch_notice_derivation.shipping_confirmation to shipping_confirmation;
  }

  part def Finished_Product_Dispatch_Coordinator_System :> System {
    part dispatch_coordination_process : Dispatch_Coordination_Process;

    port dispatch_request : DataPort { in :>> type : Dispatch_Request_Sample; }
    port product_availability : DataPort { in :>> type : Product_Availability_Sample; }
    port dispatch_outcome : DataPort { in :>> type : Dispatch_Outcome_Sample; }
    port shipment_release_command : DataPort { out :>> type : Shipment_Release_Command; }
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }

    connection support_boundary_request : PortConnection
      connect dispatch_request to dispatch_coordination_process.dispatch_request;
    connection support_boundary_availability : PortConnection
      connect product_availability to dispatch_coordination_process.product_availability;
    connection support_boundary_outcome : PortConnection
      connect dispatch_outcome to dispatch_coordination_process.dispatch_outcome;
    connection support_boundary_release : PortConnection
      connect dispatch_coordination_process.shipment_release_command to shipment_release_command;
    connection support_boundary_status : PortConnection
      connect dispatch_coordination_process.dispatch_status to dispatch_status;
    connection support_boundary_confirmation : PortConnection
      connect dispatch_coordination_process.shipping_confirmation to shipping_confirmation;
  }

  part finished_product_dispatch_coordinator : Finished_Product_Dispatch_Coordinator_System;
}
