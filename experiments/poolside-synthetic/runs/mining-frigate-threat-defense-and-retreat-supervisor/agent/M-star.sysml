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

    language "GUMBO" /*{
      compute
        guarantee PRESERVE_THREAT "Threat Qualification shall set qualified threat to raw threat":
          qualified_threat == raw_threat;
    }*/

                        
             
                                                                           
                                                                                                            
                                         
       
  }

  part def Resource_Qualification :> Thread {
    port raw_cargo : DataPort { in :>> type : Cargo_Observation; }
    port qualified_cargo : DataPort { out :>> type : Cargo_Observation; }
    port raw_capacitor : DataPort { in :>> type : Capacitor_Observation; }
    port qualified_capacitor : DataPort { out :>> type : Capacitor_Observation; }

    language "GUMBO" /*{
      compute
        guarantee PRESERVE_RESOURCES "Resource Qualification shall set qualified cargo to raw cargo and qualified capacitor to raw capacitor":
          qualified_cargo == raw_cargo & qualified_capacitor == raw_capacitor;
    }*/

                        
             
                                                                                         
                                                                                                                        
                                        
                                               
       
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

    language "GUMBO" /*{
      compute
        guarantee PRESERVE_REQUEST_AND_AVAILABILITY "Request Availability Qualification shall set qualified request to raw request, qualified mining availability to raw mining availability, qualified defense availability to raw defense availability, and qualified retreat availability to raw retreat availability":
          qualified_request == raw_request & qualified_mining_availability == raw_mining_availability & qualified_defense_availability == raw_defense_availability & qualified_retreat_availability == raw_retreat_availability;
    }*/

                        
             
                                                                                                                     
                                                                                                                                           
                                            
                                                                    
                                                                      
                                                                     
       
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

    language "GUMBO" /*{
      state
        current_phase : Operational_Phase;

      initialize
        modifies current_phase;
        guarantee INITIAL_PHASE_IDLE "Principal Decision Owner shall set current phase to Idle":
          current_phase == Operational_Phase.Idle;

      compute
        modifies current_phase;
        compute_cases
          case CASE_01_INVALID_RETREAT "invalid input with valid retreat availability and mining/defending/retreating entry":
            assume ((threat_input.threat_status == Threat_Status.Invalid) | (cargo_input.cargo_status == Cargo_Status.Invalid) | (capacitor_input.capacitor_status == Capacitor_Status.Invalid) | (request_input.request_status == Request_Status.Invalid) | (mining_availability_input.mining_availability_status == Mining_Availability_Status.Invalid) | (defense_availability_input.defense_availability_status == Defense_Availability_Status.Invalid) | (retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Invalid) | (service_progress_input.service_progress_status == Service_Progress_Status.Invalid)) & ((In(current_phase) == Operational_Phase.Mining) | (In(current_phase) == Operational_Phase.Defending) | (In(current_phase) == Operational_Phase.Retreating)) & (retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid) & (retreat_availability_input.retreat_available == Retreat_Availability.Available);
            guarantee mining_decision == Mining_Command.Stop & defense_decision == Defense_Command.Stand_Down & movement_service_decision == Movement_Service_Command.Retreat & phase_decision == Operational_Phase.Retreating & fault_decision == Input_Fault.Asserted & current_phase == Operational_Phase.Retreating;
          case CASE_02_INVALID_HOLD "invalid input otherwise not eligible for valid retreat":
            assume ((threat_input.threat_status == Threat_Status.Invalid) | (cargo_input.cargo_status == Cargo_Status.Invalid) | (capacitor_input.capacitor_status == Capacitor_Status.Invalid) | (request_input.request_status == Request_Status.Invalid) | (mining_availability_input.mining_availability_status == Mining_Availability_Status.Invalid) | (defense_availability_input.defense_availability_status == Defense_Availability_Status.Invalid) | (retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Invalid) | (service_progress_input.service_progress_status == Service_Progress_Status.Invalid)) & not (((In(current_phase) == Operational_Phase.Mining) | (In(current_phase) == Operational_Phase.Defending) | (In(current_phase) == Operational_Phase.Retreating)) & (retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid) & (retreat_availability_input.retreat_available == Retreat_Availability.Available));
            guarantee mining_decision == Mining_Command.Stop & defense_decision == Defense_Command.Stand_Down & movement_service_decision == Movement_Service_Command.Hold & phase_decision == Operational_Phase.Fault_Hold & fault_decision == Input_Fault.Asserted & current_phase == Operational_Phase.Fault_Hold;
          case CASE_03_VALID_RETREAT "all valid, service away, retreat available, and a retreat/force condition holds":
            assume (threat_input.threat_status == Threat_Status.Valid) & (cargo_input.cargo_status == Cargo_Status.Valid) & (capacitor_input.capacitor_status == Capacitor_Status.Valid) & (request_input.request_status == Request_Status.Valid) & (mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid) & (defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid) & (retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid) & (service_progress_input.service_progress_status == Service_Progress_Status.Valid) & (service_progress_input.service_progress == Service_Progress.Away) & (retreat_availability_input.retreat_available == Retreat_Availability.Available) & ((In(current_phase) == Operational_Phase.Retreating) | (In(current_phase) == Operational_Phase.Fault_Hold) | (request_input.operator_request == Operator_Request.Retreat) | (cargo_input.cargo_band == Cargo_Band.Full) | (capacitor_input.capacitor_band == Capacitor_Band.Critical) | ((threat_input.threat == Threat_Value.Hostile) & (defense_availability_input.defense_available == Defense_Availability.Unavailable)));
            guarantee mining_decision == Mining_Command.Stop & defense_decision == Defense_Command.Stand_Down & movement_service_decision == Movement_Service_Command.Retreat & phase_decision == Operational_Phase.Retreating & fault_decision == Input_Fault.Clear & current_phase == Operational_Phase.Retreating;
          case CASE_04_VALID_RETREAT_UNAVAILABLE "all valid, service away, retreat unavailable, and a retreat/force condition holds":
            assume (threat_input.threat_status == Threat_Status.Valid) & (cargo_input.cargo_status == Cargo_Status.Valid) & (capacitor_input.capacitor_status == Capacitor_Status.Valid) & (request_input.request_status == Request_Status.Valid) & (mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid) & (defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid) & (retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid) & (service_progress_input.service_progress_status == Service_Progress_Status.Valid) & (service_progress_input.service_progress == Service_Progress.Away) & (retreat_availability_input.retreat_available == Retreat_Availability.Unavailable) & ((In(current_phase) == Operational_Phase.Retreating) | (In(current_phase) == Operational_Phase.Fault_Hold) | (request_input.operator_request == Operator_Request.Retreat) | (cargo_input.cargo_band == Cargo_Band.Full) | (capacitor_input.capacitor_band == Capacitor_Band.Critical) | ((threat_input.threat == Threat_Value.Hostile) & (defense_availability_input.defense_available == Defense_Availability.Unavailable)));
            guarantee mining_decision == Mining_Command.Stop & defense_decision == Defense_Command.Stand_Down & movement_service_decision == Movement_Service_Command.Hold & phase_decision == Operational_Phase.Fault_Hold & fault_decision == Input_Fault.Clear & current_phase == Operational_Phase.Fault_Hold;
          case CASE_05_DOCK "all valid, service at station, and entry retreating or fault hold":
            assume (threat_input.threat_status == Threat_Status.Valid) & (cargo_input.cargo_status == Cargo_Status.Valid) & (capacitor_input.capacitor_status == Capacitor_Status.Valid) & (request_input.request_status == Request_Status.Valid) & (mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid) & (defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid) & (retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid) & (service_progress_input.service_progress_status == Service_Progress_Status.Valid) & (service_progress_input.service_progress == Service_Progress.At_Station) & ((In(current_phase) == Operational_Phase.Retreating) | (In(current_phase) == Operational_Phase.Fault_Hold));
            guarantee mining_decision == Mining_Command.Stop & defense_decision == Defense_Command.Stand_Down & movement_service_decision == Movement_Service_Command.Dock & phase_decision == Operational_Phase.Retreating & fault_decision == Input_Fault.Clear & current_phase == Operational_Phase.Retreating;
          case CASE_06_OFFLOAD "all valid, service docked loaded, and entry retreating/servicing/fault hold":
            assume (threat_input.threat_status == Threat_Status.Valid) & (cargo_input.cargo_status == Cargo_Status.Valid) & (capacitor_input.capacitor_status == Capacitor_Status.Valid) & (request_input.request_status == Request_Status.Valid) & (mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid) & (defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid) & (retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid) & (service_progress_input.service_progress_status == Service_Progress_Status.Valid) & (service_progress_input.service_progress == Service_Progress.Docked_Loaded) & ((In(current_phase) == Operational_Phase.Retreating) | (In(current_phase) == Operational_Phase.Servicing) | (In(current_phase) == Operational_Phase.Fault_Hold));
            guarantee mining_decision == Mining_Command.Stop & defense_decision == Defense_Command.Stand_Down & movement_service_decision == Movement_Service_Command.Offload & phase_decision == Operational_Phase.Servicing & fault_decision == Input_Fault.Clear & current_phase == Operational_Phase.Servicing;
          case CASE_07_RESUPPLY "all valid, service offload confirmed, and entry servicing or fault hold":
            assume (threat_input.threat_status == Threat_Status.Valid) & (cargo_input.cargo_status == Cargo_Status.Valid) & (capacitor_input.capacitor_status == Capacitor_Status.Valid) & (request_input.request_status == Request_Status.Valid) & (mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid) & (defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid) & (retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid) & (service_progress_input.service_progress_status == Service_Progress_Status.Valid) & (service_progress_input.service_progress == Service_Progress.Offload_Confirmed) & ((In(current_phase) == Operational_Phase.Servicing) | (In(current_phase) == Operational_Phase.Fault_Hold));
            guarantee mining_decision == Mining_Command.Stop & defense_decision == Defense_Command.Stand_Down & movement_service_decision == Movement_Service_Command.Resupply & phase_decision == Operational_Phase.Servicing & fault_decision == Input_Fault.Clear & current_phase == Operational_Phase.Servicing;
          case CASE_08_ACKNOWLEDGE_READY "all valid, service resupply confirmed, and entry servicing or fault hold":
            assume (threat_input.threat_status == Threat_Status.Valid) & (cargo_input.cargo_status == Cargo_Status.Valid) & (capacitor_input.capacitor_status == Capacitor_Status.Valid) & (request_input.request_status == Request_Status.Valid) & (mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid) & (defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid) & (retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid) & (service_progress_input.service_progress_status == Service_Progress_Status.Valid) & (service_progress_input.service_progress == Service_Progress.Resupply_Confirmed) & ((In(current_phase) == Operational_Phase.Servicing) | (In(current_phase) == Operational_Phase.Fault_Hold));
            guarantee mining_decision == Mining_Command.Stop & defense_decision == Defense_Command.Stand_Down & movement_service_decision == Movement_Service_Command.Acknowledge_Ready & phase_decision == Operational_Phase.Idle & fault_decision == Input_Fault.Clear & current_phase == Operational_Phase.Idle;
          case CASE_09_HOSTILE_DEFENSE "all valid, entry idle/mining/defending, service away, hostile, non-retreat, non-full, non-critical, defense available":
            assume (threat_input.threat_status == Threat_Status.Valid) & (cargo_input.cargo_status == Cargo_Status.Valid) & (capacitor_input.capacitor_status == Capacitor_Status.Valid) & (request_input.request_status == Request_Status.Valid) & (mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid) & (defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid) & (retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid) & (service_progress_input.service_progress_status == Service_Progress_Status.Valid) & ((In(current_phase) == Operational_Phase.Idle) | (In(current_phase) == Operational_Phase.Mining) | (In(current_phase) == Operational_Phase.Defending)) & (service_progress_input.service_progress == Service_Progress.Away) & (threat_input.threat == Threat_Value.Hostile) & (request_input.operator_request != Operator_Request.Retreat) & (cargo_input.cargo_band != Cargo_Band.Full) & (capacitor_input.capacitor_band != Capacitor_Band.Critical) & (defense_availability_input.defense_available == Defense_Availability.Available);
            guarantee mining_decision == Mining_Command.Stop & defense_decision == Defense_Command.Engage & movement_service_decision == Movement_Service_Command.Hold & phase_decision == Operational_Phase.Defending & fault_decision == Input_Fault.Clear & current_phase == Operational_Phase.Defending;
          case CASE_10_MINING "all valid, entry idle/mining/defending, service away, clear, mine, partial, non-critical-cap, mining available":
            assume (threat_input.threat_status == Threat_Status.Valid) & (cargo_input.cargo_status == Cargo_Status.Valid) & (capacitor_input.capacitor_status == Capacitor_Status.Valid) & (request_input.request_status == Request_Status.Valid) & (mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid) & (defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid) & (retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid) & (service_progress_input.service_progress_status == Service_Progress_Status.Valid) & ((In(current_phase) == Operational_Phase.Idle) | (In(current_phase) == Operational_Phase.Mining) | (In(current_phase) == Operational_Phase.Defending)) & (service_progress_input.service_progress == Service_Progress.Away) & (threat_input.threat == Threat_Value.Clear) & (request_input.operator_request == Operator_Request.Mine) & (cargo_input.cargo_band == Cargo_Band.Partial) & ((capacitor_input.capacitor_band == Capacitor_Band.Reserve) | (capacitor_input.capacitor_band == Capacitor_Band.Ready)) & (mining_availability_input.mining_available == Mining_Availability.Available);
            guarantee mining_decision == Mining_Command.Mine & defense_decision == Defense_Command.Stand_Down & movement_service_decision == Movement_Service_Command.Hold & phase_decision == Operational_Phase.Mining & fault_decision == Input_Fault.Clear & current_phase == Operational_Phase.Mining;
          case CASE_11_VALID_IDLE_INHIBITION "all valid, entry idle/mining/defending, service away, and no retreat/force condition":
            assume (threat_input.threat_status == Threat_Status.Valid) & (cargo_input.cargo_status == Cargo_Status.Valid) & (capacitor_input.capacitor_status == Capacitor_Status.Valid) & (request_input.request_status == Request_Status.Valid) & (mining_availability_input.mining_availability_status == Mining_Availability_Status.Valid) & (defense_availability_input.defense_availability_status == Defense_Availability_Status.Valid) & (retreat_availability_input.retreat_availability_status == Retreat_Availability_Status.Valid) & (service_progress_input.service_progress_status == Service_Progress_Status.Valid) & ((In(current_phase) == Operational_Phase.Idle) | (In(current_phase) == Operational_Phase.Mining) | (In(current_phase) == Operational_Phase.Defending)) & (service_progress_input.service_progress == Service_Progress.Away) & not ((request_input.operator_request == Operator_Request.Retreat) | (cargo_input.cargo_band == Cargo_Band.Full) | (capacitor_input.capacitor_band == Capacitor_Band.Critical) | ((threat_input.threat == Threat_Value.Hostile) & (defense_availability_input.defense_available == Defense_Availability.Unavailable))) & (threat_input.threat != Threat_Value.Hostile) & not ((threat_input.threat == Threat_Value.Clear) & (request_input.operator_request == Operator_Request.Mine) & (cargo_input.cargo_band == Cargo_Band.Partial) & ((capacitor_input.capacitor_band == Capacitor_Band.Reserve) | (capacitor_input.capacitor_band == Capacitor_Band.Ready)) & (mining_availability_input.mining_available == Mining_Availability.Available));
            guarantee mining_decision == Mining_Command.Stop & defense_decision == Defense_Command.Stand_Down & movement_service_decision == Movement_Service_Command.Hold & phase_decision == Operational_Phase.Idle & fault_decision == Input_Fault.Clear & current_phase == Operational_Phase.Idle;
    }*/

                        
                                                        
           
                                         

                
                                                   
                                                                                                               
                                                  

             
                                                
                     
                                                                   
                                                                                                                                                 
                  
                                                                    
                                                                 
                                                                             
                                                                       
                                                                                                           
                                                                                                              
                                                                                                              
                                                                                                   
                                                              
                                                                 
                                                                   
                                                                                                           
                                                                                             
                     
                                                      
                                                              
                                                                             
                                                              
                                                      
                                                            

                                                                   
                                                                                                                   
                  
                                                                    
                                                                 
                                                                             
                                                                       
                                                                                                           
                                                                                                              
                                                                                                              
                                                                                                   
                   
                                                                
                                                                   
                                                                     
                                                                                                             
                                                                                              
                
                     
                                                      
                                                              
                                                                          
                                                              
                                                      
                                                            

                                                                          
                                                                                                                             
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                                                
                                                                                              
                                                                  
                                                                  
                                                                           
                                                          
                                                                          
                                                             
                                                                                                   
                     
                                                      
                                                              
                                                                             
                                                              
                                                   
                                                            

                                                                           
                                                                                                                                                
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                                                
                                                                                                
                                                                  
                                                                  
                                                                           
                                                          
                                                                          
                                                             
                                                                                                   
                     
                                                      
                                                              
                                                                          
                                                              
                                                   
                                                            

                                                          
                                                                                                           
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                                                      
                                                                  
                                                                  
                     
                                                      
                                                              
                                                                          
                                                              
                                                   
                                                            

                                                                   
                                                                                                                         
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                                                         
                                                                  
                                                                 
                                                                  
                     
                                                      
                                                              
                                                                             
                                                             
                                                   
                                                           

                                                          
                                                                                                                             
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                                                             
                                                                 
                                                                  
                     
                                                      
                                                              
                                                                              
                                                             
                                                   
                                                           

                                                          
                                                                                                                                          
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                                                              
                                                                 
                                                                  
                     
                                                      
                                                              
                                                                                       
                                                        
                                                   
                                                      

                                                                          
                                                                                                                                            
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                            
                                                              
                                                                  
                                                                                
                                                           
                                                                          
                                                         
                                                                         
                                                                                             
                     
                                                      
                                                          
                                                                          
                                                             
                                                   
                                                           

                                                                  
                                                                                                                                            
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                            
                                                              
                                                                  
                                                                                
                                                         
                                                                       
                                                            
                                                                         
                                                                        
                                                                                          
                     
                                                      
                                                              
                                                                          
                                                          
                                                   
                                                        

                                                                                                  
                                                                                                                                                     
                  
                                                                 
                                                              
                                                                          
                                                                    
                                                                                                        
                                                                                                           
                                                                                                           
                                                                                               
                                                            
                                                              
                                                                  
                                                                                
                   
                                                                            
                                                           
                                                                           
                                                              
                                                                                                  
                 
                                                           
                   
                                                           
                                                                         
                                                              
                                                                           
                                                                          
                                                                                           
                
                     
                                                      
                                                              
                                                                          
                                                        
                                                   
                                                      
       
  }

  part def Mining_Command_Delivery :> Thread {
    port mining_in : DataPort { in :>> type : Mining_Command; }
    port mining_out : DataPort { out :>> type : Mining_Command; }

    language "GUMBO" /*{
      compute
        guarantee PRESERVE_MINING_COMMAND "Mining Command Delivery shall set mining out to mining in":
          mining_out == mining_in;
    }*/

                        
             
                                                                            
                                                                                                                     
                                  
       
  }

  part def Defense_Command_Delivery :> Thread {
    port defense_in : DataPort { in :>> type : Defense_Command; }
    port defense_out : DataPort { out :>> type : Defense_Command; }

    language "GUMBO" /*{
      compute
        guarantee PRESERVE_DEFENSE_COMMAND "Defense Command Delivery shall set defense out to defense in":
          defense_out == defense_in;
    }*/

                        
             
                                                                            
                                                                                                                       
                                    
       
  }

  part def Movement_Service_Command_Delivery :> Thread {
    port movement_service_in : DataPort { in :>> type : Movement_Service_Command; }
    port movement_service_out : DataPort { out :>> type : Movement_Service_Command; }

    language "GUMBO" /*{
      compute
        guarantee PRESERVE_MOVEMENT_SERVICE_COMMAND "Movement Service Command Delivery shall set movement service out to movement service in":
          movement_service_out == movement_service_in;
    }*/

                        
             
                                                                            
                                                                                                                                             
                                                      
       
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
