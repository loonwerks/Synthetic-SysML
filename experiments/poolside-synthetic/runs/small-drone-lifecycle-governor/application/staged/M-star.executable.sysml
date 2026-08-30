package Drone_Lifecycle_Governor {

  private import HAMR::*;

  enum def Lifecycle_Event {
    enum No_Request;
    enum Switch_On;
    enum Switch_Off;
    enum Begin_Charge;
    enum End_Charge;
    enum Activate;
    enum Deactivate;
    enum Begin_Flight;
    enum End_Flight;
  }

  enum def Input_Status {
    enum Valid;
    enum Invalid;
  }

  enum def Battery_Indication {
    enum Adequate;
    enum Low;
  }

  enum def Power_Permission {
    enum Disabled;
    enum Standby_Enabled;
    enum Operational_Enabled;
  }

  enum def Lifecycle_Phase {
    enum Off;
    enum Standby;
    enum Charging;
    enum Ready;
    enum Flying;
  }

  enum def Attention_Status {
    enum None;
    enum Low_Battery;
    enum Input_Fault;
    enum Recovery_Awaiting_Neutral;
  }

  enum def Qualified_Request {
    enum Invalid_Request;
    enum No_Request;
    enum Switch_On;
    enum Switch_Off;
    enum Begin_Charge;
    enum End_Charge;
    enum Activate;
    enum Deactivate;
    enum Begin_Flight;
    enum End_Flight;
  }

  enum def Battery_Assessment_Value {
    enum Invalid_Battery;
    enum Adequate_Battery;
    enum Low_Battery;
  }

  part def Lifecycle_Request_Sample :> Data {
    attribute request_event : Lifecycle_Event;
    attribute status : Input_Status;
  }

  part def Battery_Sample :> Data {
    attribute indication : Battery_Indication;
    attribute status : Input_Status;
  }

  part def Lifecycle_Actuation :> Data {
    attribute power : Power_Permission;
    attribute charging_permitted : Base_Types::Boolean;
    attribute flight_permitted : Base_Types::Boolean;
  }

  part def Decision_Disposition :> Data {
    attribute input_fault_detected : Base_Types::Boolean;
    attribute recovery_pending : Base_Types::Boolean;
  }

  part def Request_Qualification :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port raw_request : DataPort { in :>> type : Lifecycle_Request_Sample; }
    port qualified_request : DataPort { out :>> type : Qualified_Request; }

                        
                
                         
                                                                                                             
                                                                 

             
                     
                               
                                                                                                  
                                                              
                                                                             
                               
                                                                                  
                                                                                                                
                                                                        
                               
                                                                                
                                                                                                               
                                                                       
                               
                                                                                  
                                                                                                                
                                                                        
                               
                                                                                      
                                                                                                                  
                                                                          
                               
                                                                                  
                                                                                                                
                                                                        
                               
                                                                              
                                                                                                              
                                                                      
                               
                                                                                  
                                                                                                                
                                                                        
                               
                                                                                      
                                                                                                                  
                                                                          
                               
                                                                                  
                                                                                                                
                                                                        
       
  }

  part def Battery_Assessment :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port raw_battery : DataPort { in :>> type : Battery_Sample; }
    port battery_assessment : DataPort { out :>> type : Battery_Assessment_Value; }

                        
                
                         
                                                                                                            
                                                                         

             
                     
                                
                                                                                                  
                                                              
                                                                                     
                                
                                                                                       
                                                                                                                    
                                                                                      
                                
                                                                        
                                                                                                               
                                                                                 
       
  }

  part def Lifecycle_Decision_Owner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port qualified_request : DataPort { in :>> type : Qualified_Request; }
    port battery_assessment : DataPort { in :>> type : Battery_Assessment_Value; }
    port selected_phase : DataPort { out :>> type : Lifecycle_Phase; }
    port decision_disposition : DataPort { out :>> type : Decision_Disposition; }
    port phase_report : DataPort { out :>> type : Lifecycle_Phase; }

                        
                        
           
                                       
                                               

                
                         
                                                                                                                                             
                                                
                                  
                                                 
                                               
                                                          
                                                     

             
                          
                                                                                              
                                                                          
                                           
                                         

                     
                           
                                                                                                                  
                                                                           
                                                                                  
                                                            
                                              
                                                             
                                                           
                                                                      
                                                                 

                           
                                                                                                                      
                                                                           
                                                                                   
                                               
                                                                     
                                                            
                                              
                                                             
                                                           
                                                                      
                                                                 

                           
                                                                                                                 
                                                                           
                                                                                   
                                               
                                                                     
                                                            
                                              
                                                             
                                                           
                                                                      
                                                                 

                           
                                                                                               
                                                                           
                                                                                   
                                               
                                                                     
                                                            
                                              
                                                             
                                                           
                                                                      
                                                                 

                           
                                                                  
                                                                           
                                                                                   
                                               
                                                             
                                                                    
                                                                
                                              
                                                                 
                                                               
                                                                      
                                                                 

                           
                                                                                            
                                                                           
                                                                                   
                                               
                                                                 
                                                                        
                                                                              
                                                                 
                                              
                                                                  
                                                                
                                                                      
                                                                 

                           
                                                                                             
                                                                           
                                                                                   
                                               
                                                                  
                                                                      
                                                                                   
                                                                
                                              
                                                                 
                                                               
                                                                      
                                                                 

                           
                                                                                      
                                                                           
                                                                                   
                                               
                                                                 
                                                                    
                                                                                   
                                                              
                                              
                                                               
                                                             
                                                                      
                                                                 

                           
                                                                                             
                                                                           
                                                                                   
                                               
                                                               
                                                                        
                                                                                   
                                                               
                                              
                                                                
                                                              
                                                                      
                                                                 

                           
                                                                                               
                                                                           
                                                                                   
                                               
                                                                
                                                                     
                                                              
                                              
                                                               
                                                             
                                                                      
                                                                 

                           
                                                                      
                                                                           
                                                                                   
                                               
                                                               
                                                                     
                                                                
                                              
                                                                 
                                                               
                                                                      
                                                                 

                           
                                                                                               
                                                                           
                                                                                   
                                               
                                                                      
                                                                                                                      
                                                                                                                                                                                          
                                                                                                                                                                                              
                                                                                                                                                                                           
                                                                                                                                                                                             
                                                                                                                          
                                                                                                                        
                                                          
                                              
                                                           
                                                         
                                                                      
                                                                 
       
  }

  part def Controlled_Outcome_Derivation :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port selected_phase : DataPort { in :>> type : Lifecycle_Phase; }
    port lifecycle_actuation : DataPort { out :>> type : Lifecycle_Actuation; }

                        
                
                         
                                                                                                 
                                                                  
                                                       
                                                    

             
                     
                           
                                                                     
                                                         
                                                                                                                                                                       
                           
                                                                      
                                                             
                                                                                                                                                                              
                           
                                                                                         
                                                              
                                                                                                                                                                                  
                           
                                                                                            
                                                           
                                                                                                                                                                                  
                           
                                                                                   
                                                            
                                                                                                                                                                                  
       
  }

  part def Attention_Derivation :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port decision_disposition : DataPort { in :>> type : Decision_Disposition; }
    port battery_assessment : DataPort { in :>> type : Battery_Assessment_Value; }
    port attention_status : DataPort { out :>> type : Attention_Status; }

                        
                
                         
                                                                               
                                                    

             
                     
                               
                                                                                 
                                                                  
                                                                       
                               
                                                                                    
                                                                                                               
                                                                                     
                               
                                                                                                         
                                                                                                                                                                            
                                                                       
                               
                                                                                                
                                                                                                                                                                            
                                                                
       
  }

  part def Governor_Process :> Process {
    part request_qualification : Request_Qualification;
    part battery_assessment : Battery_Assessment;
    part lifecycle_decision_owner : Lifecycle_Decision_Owner;
    part controlled_outcome_derivation : Controlled_Outcome_Derivation;
    part attention_derivation : Attention_Derivation;

    port lifecycle_request : DataPort { in :>> type : Lifecycle_Request_Sample; }
    port battery_sample : DataPort { in :>> type : Battery_Sample; }
    port lifecycle_actuation : DataPort { out :>> type : Lifecycle_Actuation; }
    port attention_status : DataPort { out :>> type : Attention_Status; }
    port phase_report : DataPort { out :>> type : Lifecycle_Phase; }

    connection support_request_to_qualifier : PortConnection
      connect lifecycle_request to request_qualification.raw_request;
    connection qualified_request_to_owner : PortConnection
      connect request_qualification.qualified_request to lifecycle_decision_owner.qualified_request;

    connection support_battery_to_assessment : PortConnection
      connect battery_sample to battery_assessment.raw_battery;
    connection assessed_battery_to_owner : PortConnection
      connect battery_assessment.battery_assessment to lifecycle_decision_owner.battery_assessment;

    connection selected_phase_to_outcome : PortConnection
      connect lifecycle_decision_owner.selected_phase to controlled_outcome_derivation.selected_phase;
    connection disposition_to_attention : PortConnection
      connect lifecycle_decision_owner.decision_disposition to attention_derivation.decision_disposition;
    connection assessed_battery_to_attention : PortConnection
      connect battery_assessment.battery_assessment to attention_derivation.battery_assessment;

    connection support_actuation_to_process_boundary : PortConnection
      connect controlled_outcome_derivation.lifecycle_actuation to lifecycle_actuation;
    connection support_attention_to_process_boundary : PortConnection
      connect attention_derivation.attention_status to attention_status;
    connection support_phase_to_process_boundary : PortConnection
      connect lifecycle_decision_owner.phase_report to phase_report;
  }

  part def Drone_Lifecycle_Governor_System :> System {
    part governor_process : Governor_Process;

    port lifecycle_request : DataPort { in :>> type : Lifecycle_Request_Sample; }
    port battery_sample : DataPort { in :>> type : Battery_Sample; }
    port lifecycle_actuation : DataPort { out :>> type : Lifecycle_Actuation; }
    port commanded_phase_report : DataPort { out :>> type : Lifecycle_Phase; }
    port attention_status : DataPort { out :>> type : Attention_Status; }

    connection support_boundary_request : PortConnection
      connect lifecycle_request to governor_process.lifecycle_request;
    connection support_boundary_battery : PortConnection
      connect battery_sample to governor_process.battery_sample;
    connection support_boundary_actuation : PortConnection
      connect governor_process.lifecycle_actuation to lifecycle_actuation;
    connection support_boundary_attention : PortConnection
      connect governor_process.attention_status to attention_status;
    connection support_boundary_phase : PortConnection
      connect governor_process.phase_report to commanded_phase_report;
  }

  part drone_lifecycle_governor : Drone_Lifecycle_Governor_System;
}
