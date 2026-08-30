package Mining_Threat_Retreat_Supervisor {

  private import HAMR::*;

  enum def Threat_Value {
    enum Clear;
    enum Suspect;
    enum Hostile;
  }

  enum def Cargo_Band {
    enum Partial;
    enum Near_Full;
    enum Full;
  }

  enum def Capacitor_Band {
    enum Critical;
    enum Reserve;
    enum Ready;
  }

  enum def Operator_Request {
    enum Idle;
    enum Mine;
    enum Retreat;
  }

  enum def Mining_Availability {
    enum Available;
    enum Unavailable;
  }

  enum def Defense_Availability {
    enum Available;
    enum Unavailable;
  }

  enum def Retreat_Availability {
    enum Available;
    enum Unavailable;
  }

  enum def Service_Progress {
    enum Away;
    enum At_Station;
    enum Docked_Loaded;
    enum Offload_Confirmed;
    enum Resupply_Confirmed;
  }

  enum def Threat_Status {
    enum Valid;
    enum Invalid;
  }

  enum def Cargo_Status {
    enum Valid;
    enum Invalid;
  }

  enum def Capacitor_Status {
    enum Valid;
    enum Invalid;
  }

  enum def Request_Status {
    enum Valid;
    enum Invalid;
  }

  enum def Mining_Availability_Status {
    enum Valid;
    enum Invalid;
  }

  enum def Defense_Availability_Status {
    enum Valid;
    enum Invalid;
  }

  enum def Retreat_Availability_Status {
    enum Valid;
    enum Invalid;
  }

  enum def Service_Progress_Status {
    enum Valid;
    enum Invalid;
  }

  enum def Mining_Command {
    enum Stop;
    enum Mine;
  }

  enum def Defense_Command {
    enum Stand_Down;
    enum Engage;
  }

  enum def Movement_Service_Command {
    enum Hold;
    enum Retreat;
    enum Dock;
    enum Offload;
    enum Resupply;
    enum Acknowledge_Ready;
  }

  enum def Operational_Phase {
    enum Idle;
    enum Mining;
    enum Defending;
    enum Retreating;
    enum Servicing;
    enum Fault_Hold;
  }

  enum def Input_Fault {
    enum Clear;
    enum Asserted;
  }

  part def Threat_Observation :> Data {
    attribute threat : Threat_Value;
    attribute threat_status : Threat_Status;
  }

  part def Cargo_Observation :> Data {
    attribute cargo_band : Cargo_Band;
    attribute cargo_status : Cargo_Status;
  }

  part def Capacitor_Observation :> Data {
    attribute capacitor_band : Capacitor_Band;
    attribute capacitor_status : Capacitor_Status;
  }

  part def Request_Observation :> Data {
    attribute operator_request : Operator_Request;
    attribute request_status : Request_Status;
  }

  part def Mining_Availability_Observation :> Data {
    attribute mining_available : Mining_Availability;
    attribute mining_availability_status : Mining_Availability_Status;
  }

  part def Defense_Availability_Observation :> Data {
    attribute defense_available : Defense_Availability;
    attribute defense_availability_status : Defense_Availability_Status;
  }

  part def Retreat_Availability_Observation :> Data {
    attribute retreat_available : Retreat_Availability;
    attribute retreat_availability_status : Retreat_Availability_Status;
  }

  part def Service_Progress_Observation :> Data {
    attribute service_progress : Service_Progress;
    attribute service_progress_status : Service_Progress_Status;
  }

  part def Threat_Qualification :> Thread {
    port raw_threat : DataPort { in :>> type : Threat_Observation; }
    port qualified_threat : DataPort { out :>> type : Threat_Observation; }

                        
             
                                                                           
                                                                                                            
                                         
       
  }

  part def Resource_Qualification :> Thread {
    port raw_cargo : DataPort { in :>> type : Cargo_Observation; }
    port qualified_cargo : DataPort { out :>> type : Cargo_Observation; }
    port raw_capacitor : DataPort { in :>> type : Capacitor_Observation; }
    port qualified_capacitor : DataPort { out :>> type : Capacitor_Observation; }

                        
             
                                                                                         
                                                                                                                        
                                        
                                               
       
  }

  part def Request_Availability_Qualification :> Thread {
    port raw_request : DataPort { in :>> type : Request_Observation; }
    port qualified_request : DataPort { out :>> type : Request_Observation; }
    port raw_mining_availability : DataPort { in :>> type : Mining_Availability_Observation; }
    port qualified_mining_availability : DataPort { out :>> type : Mining_Availability_Observation; }
    port raw_defense_availability : DataPort { in :>> type : Defense_Availability_Observation; }
    port qualified_defense_availability : DataPort { out :>> type : Defense_Availability_Observation; }
    port raw_retreat_availability : DataPort { in :>> type : Retreat_Availability_Observation; }
    port qualified_retreat_availability : DataPort { out :>> type : Retreat_Availability_Observation; }

                        
             
                                                                                                                     
                                                                                                                                           
                                            
                                                                    
                                                                      
                                                                     
       
  }

  part def Principal_Decision_Owner :> Thread {
    port threat_input : DataPort { in :>> type : Threat_Observation; }
    port cargo_input : DataPort { in :>> type : Cargo_Observation; }
    port capacitor_input : DataPort { in :>> type : Capacitor_Observation; }
    port request_input : DataPort { in :>> type : Request_Observation; }
    port mining_availability_input : DataPort { in :>> type : Mining_Availability_Observation; }
    port defense_availability_input : DataPort { in :>> type : Defense_Availability_Observation; }
    port retreat_availability_input : DataPort { in :>> type : Retreat_Availability_Observation; }
    port service_progress_input : DataPort { in :>> type : Service_Progress_Observation; }
    port mining_decision : DataPort { out :>> type : Mining_Command; }
    port defense_decision : DataPort { out :>> type : Defense_Command; }
    port movement_service_decision : DataPort { out :>> type : Movement_Service_Command; }
    port phase_decision : DataPort { out :>> type : Operational_Phase; }
    port fault_decision : DataPort { out :>> type : Input_Fault; }

                        
                                                        
           
                                         

                
                                                   
                                                                                                               
                                                  

             
                                                
                     
                                                                   
                                                                                                                                                 
                  
                                                                    
                                                                 
                                                                             
                                                                       
                                                                                                           
                                                                                                              
                                                                                                              
                                                                                                   
                                                              
                                                                 
                                                                   
                                                                                                           
                                                                                             
                     
                                                      
                                                              
                                                                             
                                                              
                                                      
                                                            

                                                                   
                                                                                                                   
                  
                                                                    
                                                                 
                                                                             
                                                                       
                                                                                                           
                                                                                                              
                                                                                                              
                                                                                                   
                   
                                                                
                                                                   
                                                                     
                                                                                                             
                                                                                              
                
                     
                                                      
                                                              
                                                                          
                                                              
                                                      
                                                            

                                                                          
                                                                                                                             
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                                                
                                                                                              
                                                                  
                                                                  
                                                                           
                                                          
                                                                          
                                                             
                                                                                                   
                     
                                                      
                                                              
                                                                             
                                                              
                                                   
                                                            

                                                                           
                                                                                                                                                
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                                                
                                                                                                
                                                                  
                                                                  
                                                                           
                                                          
                                                                          
                                                             
                                                                                                   
                     
                                                      
                                                              
                                                                          
                                                              
                                                   
                                                            

                                                          
                                                                                                           
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                                                      
                                                                  
                                                                  
                     
                                                      
                                                              
                                                                          
                                                              
                                                   
                                                            

                                                                   
                                                                                                                         
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                                                         
                                                                  
                                                                 
                                                                  
                     
                                                      
                                                              
                                                                             
                                                             
                                                   
                                                           

                                                          
                                                                                                                             
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                                                             
                                                                 
                                                                  
                     
                                                      
                                                              
                                                                              
                                                             
                                                   
                                                           

                                                          
                                                                                                                                          
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                                                              
                                                                 
                                                                  
                     
                                                      
                                                              
                                                                                       
                                                        
                                                   
                                                      

                                                                          
                                                                                                                                            
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                            
                                                              
                                                                  
                                                                                
                                                           
                                                                          
                                                         
                                                                         
                                                                                             
                     
                                                      
                                                          
                                                                          
                                                             
                                                   
                                                           

                                                                  
                                                                                                                                            
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                            
                                                              
                                                                  
                                                                                
                                                         
                                                                       
                                                            
                                                                         
                                                                        
                                                                                          
                     
                                                      
                                                              
                                                                          
                                                          
                                                   
                                                        

                                                                                                  
                                                                                                                                                     
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                            
                                                              
                                                                  
                                                                                
                   
                                                                            
                                                           
                                                                           
                                                              
                                                                                                  
                 
                                                           
                   
                                                           
                                                                         
                                                              
                                                                           
                                                                          
                                                                                           
                
                     
                                                      
                                                              
                                                                          
                                                        
                                                   
                                                      
       
  }

  part def Mining_Command_Delivery :> Thread {
    port mining_in : DataPort { in :>> type : Mining_Command; }
    port mining_out : DataPort { out :>> type : Mining_Command; }

                        
             
                                                                            
                                                                                                                     
                                  
       
  }

  part def Defense_Command_Delivery :> Thread {
    port defense_in : DataPort { in :>> type : Defense_Command; }
    port defense_out : DataPort { out :>> type : Defense_Command; }

                        
             
                                                                            
                                                                                                                       
                                    
       
  }

  part def Movement_Service_Command_Delivery :> Thread {
    port movement_service_in : DataPort { in :>> type : Movement_Service_Command; }
    port movement_service_out : DataPort { out :>> type : Movement_Service_Command; }

                        
             
                                                                            
                                                                                                                                             
                                                      
       
  }

  part def Supervisor_Process :> Process {
    part threat_qualification : Threat_Qualification;
    part resource_qualification : Resource_Qualification;
    part request_availability_qualification : Request_Availability_Qualification;
    part principal_decision_owner : Principal_Decision_Owner;
    part mining_command_delivery : Mining_Command_Delivery;
    part defense_command_delivery : Defense_Command_Delivery;
    part movement_service_command_delivery : Movement_Service_Command_Delivery;

    port threat_observation : DataPort { in :>> type : Threat_Observation; }
    port cargo_observation : DataPort { in :>> type : Cargo_Observation; }
    port capacitor_observation : DataPort { in :>> type : Capacitor_Observation; }
    port request_observation : DataPort { in :>> type : Request_Observation; }
    port mining_availability_observation : DataPort { in :>> type : Mining_Availability_Observation; }
    port defense_availability_observation : DataPort { in :>> type : Defense_Availability_Observation; }
    port retreat_availability_observation : DataPort { in :>> type : Retreat_Availability_Observation; }
    port service_progress_observation : DataPort { in :>> type : Service_Progress_Observation; }
    port mining_command : DataPort { out :>> type : Mining_Command; }
    port defense_command : DataPort { out :>> type : Defense_Command; }
    port movement_service_command : DataPort { out :>> type : Movement_Service_Command; }
    port phase_report : DataPort { out :>> type : Operational_Phase; }
    port input_fault : DataPort { out :>> type : Input_Fault; }

    connection route_threat_to_qualifier : PortConnection
      connect threat_observation to threat_qualification.raw_threat;
    connection qualified_threat_to_owner : PortConnection
      connect threat_qualification.qualified_threat to principal_decision_owner.threat_input;

    connection route_cargo_to_qualifier : PortConnection
      connect cargo_observation to resource_qualification.raw_cargo;
    connection qualified_cargo_to_owner : PortConnection
      connect resource_qualification.qualified_cargo to principal_decision_owner.cargo_input;

    connection route_capacitor_to_qualifier : PortConnection
      connect capacitor_observation to resource_qualification.raw_capacitor;
    connection qualified_capacitor_to_owner : PortConnection
      connect resource_qualification.qualified_capacitor to principal_decision_owner.capacitor_input;

    connection route_request_to_qualifier : PortConnection
      connect request_observation to request_availability_qualification.raw_request;
    connection qualified_request_to_owner : PortConnection
      connect request_availability_qualification.qualified_request to principal_decision_owner.request_input;

    connection route_mining_availability_to_qualifier : PortConnection
      connect mining_availability_observation to request_availability_qualification.raw_mining_availability;
    connection qualified_mining_availability_to_owner : PortConnection
      connect request_availability_qualification.qualified_mining_availability to principal_decision_owner.mining_availability_input;

    connection route_defense_availability_to_qualifier : PortConnection
      connect defense_availability_observation to request_availability_qualification.raw_defense_availability;
    connection qualified_defense_availability_to_owner : PortConnection
      connect request_availability_qualification.qualified_defense_availability to principal_decision_owner.defense_availability_input;

    connection route_retreat_availability_to_qualifier : PortConnection
      connect retreat_availability_observation to request_availability_qualification.raw_retreat_availability;
    connection qualified_retreat_availability_to_owner : PortConnection
      connect request_availability_qualification.qualified_retreat_availability to principal_decision_owner.retreat_availability_input;

    connection service_progress_to_owner : PortConnection
      connect service_progress_observation to principal_decision_owner.service_progress_input;

    connection mining_decision_to_delivery : PortConnection
      connect principal_decision_owner.mining_decision to mining_command_delivery.mining_in;
    connection mining_delivery_to_boundary : PortConnection
      connect mining_command_delivery.mining_out to mining_command;

    connection defense_decision_to_delivery : PortConnection
      connect principal_decision_owner.defense_decision to defense_command_delivery.defense_in;
    connection defense_delivery_to_boundary : PortConnection
      connect defense_command_delivery.defense_out to defense_command;

    connection movement_service_decision_to_delivery : PortConnection
      connect principal_decision_owner.movement_service_decision to movement_service_command_delivery.movement_service_in;
    connection movement_service_delivery_to_boundary : PortConnection
      connect movement_service_command_delivery.movement_service_out to movement_service_command;

    connection phase_decision_to_boundary : PortConnection
      connect principal_decision_owner.phase_decision to phase_report;
    connection fault_decision_to_boundary : PortConnection
      connect principal_decision_owner.fault_decision to input_fault;
  }

  part def Mining_Threat_Retreat_System :> System {
    part supervisor_process : Supervisor_Process;

    port threat_observation : DataPort { in :>> type : Threat_Observation; }
    port cargo_observation : DataPort { in :>> type : Cargo_Observation; }
    port capacitor_observation : DataPort { in :>> type : Capacitor_Observation; }
    port request_observation : DataPort { in :>> type : Request_Observation; }
    port mining_availability_observation : DataPort { in :>> type : Mining_Availability_Observation; }
    port defense_availability_observation : DataPort { in :>> type : Defense_Availability_Observation; }
    port retreat_availability_observation : DataPort { in :>> type : Retreat_Availability_Observation; }
    port service_progress_observation : DataPort { in :>> type : Service_Progress_Observation; }
    port mining_command : DataPort { out :>> type : Mining_Command; }
    port defense_command : DataPort { out :>> type : Defense_Command; }
    port movement_service_command : DataPort { out :>> type : Movement_Service_Command; }
    port phase_report : DataPort { out :>> type : Operational_Phase; }
    port input_fault : DataPort { out :>> type : Input_Fault; }

    connection boundary_threat : PortConnection
      connect threat_observation to supervisor_process.threat_observation;
    connection boundary_cargo : PortConnection
      connect cargo_observation to supervisor_process.cargo_observation;
    connection boundary_capacitor : PortConnection
      connect capacitor_observation to supervisor_process.capacitor_observation;
    connection boundary_request : PortConnection
      connect request_observation to supervisor_process.request_observation;
    connection boundary_mining_availability : PortConnection
      connect mining_availability_observation to supervisor_process.mining_availability_observation;
    connection boundary_defense_availability : PortConnection
      connect defense_availability_observation to supervisor_process.defense_availability_observation;
    connection boundary_retreat_availability : PortConnection
      connect retreat_availability_observation to supervisor_process.retreat_availability_observation;
    connection boundary_service_progress : PortConnection
      connect service_progress_observation to supervisor_process.service_progress_observation;
    connection boundary_mining_command : PortConnection
      connect supervisor_process.mining_command to mining_command;
    connection boundary_defense_command : PortConnection
      connect supervisor_process.defense_command to defense_command;
    connection boundary_movement_service_command : PortConnection
      connect supervisor_process.movement_service_command to movement_service_command;
    connection boundary_phase_report : PortConnection
      connect supervisor_process.phase_report to phase_report;
    connection boundary_input_fault : PortConnection
      connect supervisor_process.input_fault to input_fault;
  }

  part mining_threat_retreat_supervisor : Mining_Threat_Retreat_System;
}
