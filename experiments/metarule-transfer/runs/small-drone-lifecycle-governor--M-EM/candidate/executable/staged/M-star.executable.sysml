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

    language "GUMBO" /*{
                
                                            
                                                                 

      compute
        compute_cases
          case REQUEST_INVALID:
            assume raw_request.status == Input_Status.Invalid;
            guarantee qualified_request == Qualified_Request.Invalid_Request;

          case REQUEST_NO_REQUEST:
            assume raw_request.status == Input_Status.Valid &
              raw_request.request_event == Lifecycle_Event.No_Request;
            guarantee qualified_request == Qualified_Request.No_Request;

          case REQUEST_SWITCH_ON:
            assume raw_request.status == Input_Status.Valid &
              raw_request.request_event == Lifecycle_Event.Switch_On;
            guarantee qualified_request == Qualified_Request.Switch_On;

          case REQUEST_SWITCH_OFF:
            assume raw_request.status == Input_Status.Valid &
              raw_request.request_event == Lifecycle_Event.Switch_Off;
            guarantee qualified_request == Qualified_Request.Switch_Off;

          case REQUEST_BEGIN_CHARGE:
            assume raw_request.status == Input_Status.Valid &
              raw_request.request_event == Lifecycle_Event.Begin_Charge;
            guarantee qualified_request == Qualified_Request.Begin_Charge;

          case REQUEST_END_CHARGE:
            assume raw_request.status == Input_Status.Valid &
              raw_request.request_event == Lifecycle_Event.End_Charge;
            guarantee qualified_request == Qualified_Request.End_Charge;

          case REQUEST_ACTIVATE:
            assume raw_request.status == Input_Status.Valid &
              raw_request.request_event == Lifecycle_Event.Activate;
            guarantee qualified_request == Qualified_Request.Activate;

          case REQUEST_DEACTIVATE:
            assume raw_request.status == Input_Status.Valid &
              raw_request.request_event == Lifecycle_Event.Deactivate;
            guarantee qualified_request == Qualified_Request.Deactivate;

          case REQUEST_BEGIN_FLIGHT:
            assume raw_request.status == Input_Status.Valid &
              raw_request.request_event == Lifecycle_Event.Begin_Flight;
            guarantee qualified_request == Qualified_Request.Begin_Flight;

          case REQUEST_END_FLIGHT:
            assume raw_request.status == Input_Status.Valid &
              raw_request.request_event == Lifecycle_Event.End_Flight;
            guarantee qualified_request == Qualified_Request.End_Flight;
    }*/

                        
                
                         
                                                                                                             
                                                                 

             
                     
                               
                                                                                                  
                                                              
                                                                             
                               
                                                                                  
                                                                                                                
                                                                        
                               
                                                                                
                                                                                                               
                                                                       
                               
                                                                                  
                                                                                                                
                                                                        
                               
                                                                                      
                                                                                                                  
                                                                          
                               
                                                                                  
                                                                                                                
                                                                        
                               
                                                                              
                                                                                                              
                                                                      
                               
                                                                                  
                                                                                                                
                                                                        
                               
                                                                                      
                                                                                                                  
                                                                          
                               
                                                                                  
                                                                                                                
                                                                        
       
  }

  part def Battery_Assessment :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port raw_battery : DataPort { in :>> type : Battery_Sample; }
    port battery_assessment : DataPort { out :>> type : Battery_Assessment_Value; }

    language "GUMBO" /*{
                
                                            
                                                                         

      compute
        compute_cases
          case BATTERY_INVALID:
            assume raw_battery.status == Input_Status.Invalid;
            guarantee battery_assessment == Battery_Assessment_Value.Invalid_Battery;

          case BATTERY_ADEQUATE:
            assume raw_battery.status == Input_Status.Valid &
              raw_battery.indication == Battery_Indication.Adequate;
            guarantee battery_assessment == Battery_Assessment_Value.Adequate_Battery;

          case BATTERY_LOW:
            assume raw_battery.status == Input_Status.Valid &
              raw_battery.indication == Battery_Indication.Low;
            guarantee battery_assessment == Battery_Assessment_Value.Low_Battery;
    }*/

                        
                
                         
                                                                                                            
                                                                         

             
                     
                                
                                                                                                  
                                                              
                                                                                     
                                
                                                                                       
                                                                                                                    
                                                                                      
                                
                                                                        
                                                                                                               
                                                                                 
       
  }

  part def Lifecycle_Decision_Owner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port qualified_request : DataPort { in :>> type : Qualified_Request; }
    port battery_assessment : DataPort { in :>> type : Battery_Assessment_Value; }
    port selected_phase : DataPort { out :>> type : Lifecycle_Phase; }
    port decision_disposition : DataPort { out :>> type : Decision_Disposition; }
    port phase_report : DataPort { out :>> type : Lifecycle_Phase; }

    language "GUMBO" /*{
      state
        current_phase: Lifecycle_Phase;
        recovery_required: Base_Types::Boolean;

                
                                                  
                                                
                                  
                                                 
                                               
                                                          
                                                     

      compute
        guarantee RECOVERY_IMPLIES_OFF:
          recovery_required implies
            (current_phase == Lifecycle_Phase.Off &
             selected_phase == current_phase &
             phase_report == selected_phase);

        compute_cases
          case CASE_01_INVALID_INPUT:
            assume qualified_request == Qualified_Request.Invalid_Request |
              battery_assessment == Battery_Assessment_Value.Invalid_Battery;
            guarantee current_phase == Lifecycle_Phase.Off &
              recovery_required == T &
              selected_phase == Lifecycle_Phase.Off &
              phase_report == Lifecycle_Phase.Off &
              decision_disposition.input_fault_detected == T &
              decision_disposition.recovery_pending == T;

          case CASE_02_RECOVERY_BLOCKS_REPLAY:
            assume qualified_request != Qualified_Request.Invalid_Request &
              battery_assessment != Battery_Assessment_Value.Invalid_Battery &
              recovery_required == T &
              qualified_request != Qualified_Request.No_Request;
            guarantee current_phase == Lifecycle_Phase.Off &
              recovery_required == T &
              selected_phase == Lifecycle_Phase.Off &
              phase_report == Lifecycle_Phase.Off &
              decision_disposition.input_fault_detected == F &
              decision_disposition.recovery_pending == T;

          case CASE_03_NEUTRAL_CLEARS_RECOVERY:
            assume qualified_request != Qualified_Request.Invalid_Request &
              battery_assessment != Battery_Assessment_Value.Invalid_Battery &
              recovery_required == T &
              qualified_request == Qualified_Request.No_Request;
            guarantee current_phase == Lifecycle_Phase.Off &
              recovery_required == F &
              selected_phase == Lifecycle_Phase.Off &
              phase_report == Lifecycle_Phase.Off &
              decision_disposition.input_fault_detected == F &
              decision_disposition.recovery_pending == F;

          case CASE_04_SWITCH_OFF:
            assume qualified_request != Qualified_Request.Invalid_Request &
              battery_assessment != Battery_Assessment_Value.Invalid_Battery &
              recovery_required == F &
              qualified_request == Qualified_Request.Switch_Off;
            guarantee current_phase == Lifecycle_Phase.Off &
              recovery_required == F &
              selected_phase == Lifecycle_Phase.Off &
              phase_report == Lifecycle_Phase.Off &
              decision_disposition.input_fault_detected == F &
              decision_disposition.recovery_pending == F;

          case CASE_05_SWITCH_ON:
            assume qualified_request != Qualified_Request.Invalid_Request &
              battery_assessment != Battery_Assessment_Value.Invalid_Battery &
              recovery_required == F &
              current_phase == Lifecycle_Phase.Off &
              qualified_request == Qualified_Request.Switch_On;
            guarantee current_phase == Lifecycle_Phase.Standby &
              recovery_required == F &
              selected_phase == Lifecycle_Phase.Standby &
              phase_report == Lifecycle_Phase.Standby &
              decision_disposition.input_fault_detected == F &
              decision_disposition.recovery_pending == F;

          case CASE_06_BEGIN_CHARGE:
            assume qualified_request != Qualified_Request.Invalid_Request &
              battery_assessment != Battery_Assessment_Value.Invalid_Battery &
              recovery_required == F &
              current_phase == Lifecycle_Phase.Standby &
              qualified_request == Qualified_Request.Begin_Charge &
              battery_assessment == Battery_Assessment_Value.Low_Battery;
            guarantee current_phase == Lifecycle_Phase.Charging &
              recovery_required == F &
              selected_phase == Lifecycle_Phase.Charging &
              phase_report == Lifecycle_Phase.Charging &
              decision_disposition.input_fault_detected == F &
              decision_disposition.recovery_pending == F;

          case CASE_07_END_CHARGE:
            assume qualified_request != Qualified_Request.Invalid_Request &
              battery_assessment != Battery_Assessment_Value.Invalid_Battery &
              recovery_required == F &
              current_phase == Lifecycle_Phase.Charging &
              qualified_request == Qualified_Request.End_Charge &
              battery_assessment == Battery_Assessment_Value.Adequate_Battery;
            guarantee current_phase == Lifecycle_Phase.Standby &
              recovery_required == F &
              selected_phase == Lifecycle_Phase.Standby &
              phase_report == Lifecycle_Phase.Standby &
              decision_disposition.input_fault_detected == F &
              decision_disposition.recovery_pending == F;

          case CASE_08_ACTIVATE:
            assume qualified_request != Qualified_Request.Invalid_Request &
              battery_assessment != Battery_Assessment_Value.Invalid_Battery &
              recovery_required == F &
              current_phase == Lifecycle_Phase.Standby &
              qualified_request == Qualified_Request.Activate &
              battery_assessment == Battery_Assessment_Value.Adequate_Battery;
            guarantee current_phase == Lifecycle_Phase.Ready &
              recovery_required == F &
              selected_phase == Lifecycle_Phase.Ready &
              phase_report == Lifecycle_Phase.Ready &
              decision_disposition.input_fault_detected == F &
              decision_disposition.recovery_pending == F;

          case CASE_09_BEGIN_FLIGHT:
            assume qualified_request != Qualified_Request.Invalid_Request &
              battery_assessment != Battery_Assessment_Value.Invalid_Battery &
              recovery_required == F &
              current_phase == Lifecycle_Phase.Ready &
              qualified_request == Qualified_Request.Begin_Flight &
              battery_assessment == Battery_Assessment_Value.Adequate_Battery;
            guarantee current_phase == Lifecycle_Phase.Flying &
              recovery_required == F &
              selected_phase == Lifecycle_Phase.Flying &
              phase_report == Lifecycle_Phase.Flying &
              decision_disposition.input_fault_detected == F &
              decision_disposition.recovery_pending == F;

          case CASE_10_END_FLIGHT:
            assume qualified_request != Qualified_Request.Invalid_Request &
              battery_assessment != Battery_Assessment_Value.Invalid_Battery &
              recovery_required == F &
              current_phase == Lifecycle_Phase.Flying &
              qualified_request == Qualified_Request.End_Flight;
            guarantee current_phase == Lifecycle_Phase.Ready &
              recovery_required == F &
              selected_phase == Lifecycle_Phase.Ready &
              phase_report == Lifecycle_Phase.Ready &
              decision_disposition.input_fault_detected == F &
              decision_disposition.recovery_pending == F;

          case CASE_11_DEACTIVATE:
            assume qualified_request != Qualified_Request.Invalid_Request &
              battery_assessment != Battery_Assessment_Value.Invalid_Battery &
              recovery_required == F &
              current_phase == Lifecycle_Phase.Ready &
              qualified_request == Qualified_Request.Deactivate;
            guarantee current_phase == Lifecycle_Phase.Standby &
              recovery_required == F &
              selected_phase == Lifecycle_Phase.Standby &
              phase_report == Lifecycle_Phase.Standby &
              decision_disposition.input_fault_detected == F &
              decision_disposition.recovery_pending == F;

          case CASE_12_HOLD:
            assume qualified_request != Qualified_Request.Invalid_Request &
              battery_assessment != Battery_Assessment_Value.Invalid_Battery &
              recovery_required == F &
              qualified_request != Qualified_Request.Switch_Off &
              not (current_phase == Lifecycle_Phase.Off &
                qualified_request == Qualified_Request.Switch_On) &
              not (current_phase == Lifecycle_Phase.Standby &
                qualified_request == Qualified_Request.Begin_Charge &
                battery_assessment == Battery_Assessment_Value.Low_Battery) &
              not (current_phase == Lifecycle_Phase.Charging &
                qualified_request == Qualified_Request.End_Charge &
                battery_assessment == Battery_Assessment_Value.Adequate_Battery) &
              not (current_phase == Lifecycle_Phase.Standby &
                qualified_request == Qualified_Request.Activate &
                battery_assessment == Battery_Assessment_Value.Adequate_Battery) &
              not (current_phase == Lifecycle_Phase.Ready &
                qualified_request == Qualified_Request.Begin_Flight &
                battery_assessment == Battery_Assessment_Value.Adequate_Battery) &
              not (current_phase == Lifecycle_Phase.Flying &
                qualified_request == Qualified_Request.End_Flight) &
              not (current_phase == Lifecycle_Phase.Ready &
                qualified_request == Qualified_Request.Deactivate);
            guarantee recovery_required == F &
              selected_phase == current_phase &
              phase_report == current_phase &
              decision_disposition.input_fault_detected == F &
              decision_disposition.recovery_pending == F;
    }*/

                        
                        
           
                                       
                                               

                
                         
                                                                                                                                             
                                                
                                  
                                                 
                                               
                                                          
                                                     

             
                          
                                                                                              
                                                                          
                                           
                                         

                     
                           
                                                                                                                  
                                                                           
                                                                                  
                                                            
                                              
                                                             
                                                           
                                                                      
                                                                 

                           
                                                                                                                      
                                                                           
                                                                                   
                                               
                                                                     
                                                            
                                              
                                                             
                                                           
                                                                      
                                                                 

                           
                                                                                                                 
                                                                           
                                                                                   
                                               
                                                                     
                                                            
                                              
                                                             
                                                           
                                                                      
                                                                 

                           
                                                                                               
                                                                           
                                                                                   
                                               
                                                                     
                                                            
                                              
                                                             
                                                           
                                                                      
                                                                 

                           
                                                                  
                                                                           
                                                                                   
                                               
                                                             
                                                                    
                                                                
                                              
                                                                 
                                                               
                                                                      
                                                                 

                           
                                                                                            
                                                                           
                                                                                   
                                               
                                                                 
                                                                        
                                                                              
                                                                 
                                              
                                                                  
                                                                
                                                                      
                                                                 

                           
                                                                                             
                                                                           
                                                                                   
                                               
                                                                  
                                                                      
                                                                                   
                                                                
                                              
                                                                 
                                                               
                                                                      
                                                                 

                           
                                                                                      
                                                                           
                                                                                   
                                               
                                                                 
                                                                    
                                                                                   
                                                              
                                              
                                                               
                                                             
                                                                      
                                                                 

                           
                                                                                             
                                                                           
                                                                                   
                                               
                                                               
                                                                        
                                                                                   
                                                               
                                              
                                                                
                                                              
                                                                      
                                                                 

                           
                                                                                               
                                                                           
                                                                                   
                                               
                                                                
                                                                     
                                                              
                                              
                                                               
                                                             
                                                                      
                                                                 

                           
                                                                      
                                                                           
                                                                                   
                                               
                                                               
                                                                     
                                                                
                                              
                                                                 
                                                               
                                                                      
                                                                 

                           
                                                                                               
                                                                           
                                                                                   
                                               
                                                                      
                                                                                                                      
                                                                                                                                                                                          
                                                                                                                                                                                              
                                                                                                                                                                                           
                                                                                                                                                                                             
                                                                                                                          
                                                                                                                        
                                                          
                                              
                                                           
                                                         
                                                                      
                                                                 
       
  }

  part def Controlled_Outcome_Derivation :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port selected_phase : DataPort { in :>> type : Lifecycle_Phase; }
    port lifecycle_actuation : DataPort { out :>> type : Lifecycle_Actuation; }

    language "GUMBO" /*{
                
                                             
                                                                  
                                                       
                                                    

      compute
        compute_cases
          case ACTUATION_OFF:
            assume selected_phase == Lifecycle_Phase.Off;
            guarantee lifecycle_actuation.power == Power_Permission.Disabled &
              lifecycle_actuation.charging_permitted == F &
              lifecycle_actuation.flight_permitted == F;

          case ACTUATION_STANDBY:
            assume selected_phase == Lifecycle_Phase.Standby;
            guarantee lifecycle_actuation.power == Power_Permission.Standby_Enabled &
              lifecycle_actuation.charging_permitted == F &
              lifecycle_actuation.flight_permitted == F;

          case ACTUATION_CHARGING:
            assume selected_phase == Lifecycle_Phase.Charging;
            guarantee lifecycle_actuation.power == Power_Permission.Operational_Enabled &
              lifecycle_actuation.charging_permitted == T &
              lifecycle_actuation.flight_permitted == F;

          case ACTUATION_READY:
            assume selected_phase == Lifecycle_Phase.Ready;
            guarantee lifecycle_actuation.power == Power_Permission.Operational_Enabled &
              lifecycle_actuation.charging_permitted == F &
              lifecycle_actuation.flight_permitted == F;

          case ACTUATION_FLYING:
            assume selected_phase == Lifecycle_Phase.Flying;
            guarantee lifecycle_actuation.power == Power_Permission.Operational_Enabled &
              lifecycle_actuation.charging_permitted == F &
              lifecycle_actuation.flight_permitted == T;
    }*/

                        
                
                         
                                                                                                 
                                                                  
                                                       
                                                    

             
                     
                           
                                                                     
                                                         
                                                                                                                                                                       
                           
                                                                      
                                                             
                                                                                                                                                                              
                           
                                                                                         
                                                              
                                                                                                                                                                                  
                           
                                                                                            
                                                           
                                                                                                                                                                                  
                           
                                                                                   
                                                            
                                                                                                                                                                                  
       
  }

  part def Attention_Derivation :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port decision_disposition : DataPort { in :>> type : Decision_Disposition; }
    port battery_assessment : DataPort { in :>> type : Battery_Assessment_Value; }
    port attention_status : DataPort { out :>> type : Attention_Status; }

    language "GUMBO" /*{
                
                                         
                                                    

      compute
        compute_cases
          case ATTENTION_INPUT_FAULT:
            assume decision_disposition.input_fault_detected == T;
            guarantee attention_status == Attention_Status.Input_Fault;

          case ATTENTION_RECOVERY:
            assume decision_disposition.input_fault_detected == F &
              decision_disposition.recovery_pending == T;
            guarantee attention_status == Attention_Status.Recovery_Awaiting_Neutral;

          case ATTENTION_LOW_BATTERY:
            assume decision_disposition.input_fault_detected == F &
              decision_disposition.recovery_pending == F &
              battery_assessment == Battery_Assessment_Value.Low_Battery;
            guarantee attention_status == Attention_Status.Low_Battery;

          case ATTENTION_NONE:
            assume decision_disposition.input_fault_detected == F &
              decision_disposition.recovery_pending == F &
              battery_assessment != Battery_Assessment_Value.Low_Battery;
            guarantee attention_status == Attention_Status.None;
    }*/

                        
                
                         
                                                                               
                                                    

             
                     
                               
                                                                                 
                                                                  
                                                                       
                               
                                                                                    
                                                                                                               
                                                                                     
                               
                                                                                                         
                                                                                                                                                                            
                                                                       
                               
                                                                                                
                                                                                                                                                                            
                                                                
       
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
