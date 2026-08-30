package Dual_Zone_Greenhouse {

  private import HAMR::*;

  part def Temperature_Celsius :> Data {
    part degrees_celsius : Base_Types::Integer_32;

    language "GUMBO" /*{
      invariants
        inv REPRESENTABLE_TEMPERATURE_RANGE "degrees celsius between -20 and 60 inclusive":
          degrees_celsius >= -20[s32] & degrees_celsius <= 60[s32];
    }*/

                        
                
                                                    
                                                                                                                                   
                                                                     
       
  }

  part def Upper_Temperature_Limit :> Data {
    part degrees_celsius : Base_Types::Integer_32;

    language "GUMBO" /*{
      invariants
        inv SELECTABLE_UPPER_LIMIT_RANGE "degrees celsius between 10 and 35 inclusive":
          degrees_celsius >= 10[s32] & degrees_celsius <= 35[s32];
    }*/

                        
                
                                      
                                                                                                                                 
                                                                    
       
  }

  enum def Sensor_Validity {
    enum Valid;
    enum Invalid;
  }

  enum def Contention_Preference {
    enum Prefer_A;
    enum Prefer_B;
  }

  enum def Ventilation_Eligibility {
    enum Eligible;
    enum Ineligible;
  }

  enum def Fan_Command {
    enum On;
    enum Off;
  }

  enum def Sensor_Fault_Indication {
    enum Clear;
    enum Asserted;
  }

  part def Zone_A_Sensor_Intake_i :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port temperature_in : DataPort { in :>> type : Temperature_Celsius; }
    port validity_in : DataPort { in :>> type : Sensor_Validity; }
    port temperature_out : DataPort { out :>> type : Temperature_Celsius; }
    port validity_out : DataPort { out :>> type : Sensor_Validity; }
    language "GUMBO" /*{
      compute
        guarantee PART_01_PRESERVE_TEMPERATURE "temperature out equals temperature in":
          temperature_out == temperature_in;
        guarantee PART_01_PRESERVE_VALIDITY "validity out equals validity in":
          validity_out == validity_in;
    }*/

                        
             
                                       
                                                                                                        
                                                                            
                                       
                                                                                                   
                                      
       
  }

  part def Zone_B_Sensor_Intake_i :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port temperature_in : DataPort { in :>> type : Temperature_Celsius; }
    port validity_in : DataPort { in :>> type : Sensor_Validity; }
    port temperature_out : DataPort { out :>> type : Temperature_Celsius; }
    port validity_out : DataPort { out :>> type : Sensor_Validity; }
    language "GUMBO" /*{
      compute
        guarantee PART_02_PRESERVE_TEMPERATURE "temperature out equals temperature in":
          temperature_out == temperature_in;
        guarantee PART_02_PRESERVE_VALIDITY "validity out equals validity in":
          validity_out == validity_in;
    }*/

                        
             
                                       
                                                                                                        
                                                                            
                                       
                                                                                                   
                                      
       
  }

  part def Operator_Configuration_Intake_i :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port upper_limit_in : DataPort { in :>> type : Upper_Temperature_Limit; }
    port preference_in : DataPort { in :>> type : Contention_Preference; }
    port upper_limit_for_a : DataPort { out :>> type : Upper_Temperature_Limit; }
    port upper_limit_for_b : DataPort { out :>> type : Upper_Temperature_Limit; }
    port preference_out : DataPort { out :>> type : Contention_Preference; }
    language "GUMBO" /*{
      compute
        guarantee PART_03_PRESERVE_LIMIT_FOR_A "upper limit for a equals upper limit in":
          upper_limit_for_a == upper_limit_in;
        guarantee PART_03_PRESERVE_LIMIT_FOR_B "upper limit for b equals upper limit in":
          upper_limit_for_b == upper_limit_in;
        guarantee PART_03_PRESERVE_PREFERENCE "preference out equals preference in":
          preference_out == preference_in;
    }*/

                        
             
                                       
                                                                                                                    
                                                                              
                                       
                                                                                                                    
                                                                              
                                       
                                                                                                         
                                          
       
  }

  part def Zone_A_Local_Decision_i :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port temperature : DataPort { in :>> type : Temperature_Celsius; }
    port validity : DataPort { in :>> type : Sensor_Validity; }
    port upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    port eligibility : DataPort { out :>> type : Ventilation_Eligibility; }
    port sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }
    language "GUMBO" /*{
      compute
        compute_cases
          case PART_04_VALID_ABOVE "if valid and temperature exceeds upper limit, eligible and clear":
            assume validity == Sensor_Validity.Valid & temperature.degrees_celsius > upper_limit.degrees_celsius;
            guarantee eligibility == Ventilation_Eligibility.Eligible & sensor_fault == Sensor_Fault_Indication.Clear;
          case PART_04_VALID_AT_OR_BELOW "if valid and temperature at or below upper limit, ineligible and clear":
            assume validity == Sensor_Validity.Valid & temperature.degrees_celsius <= upper_limit.degrees_celsius;
            guarantee eligibility == Ventilation_Eligibility.Ineligible & sensor_fault == Sensor_Fault_Indication.Clear;
          case PART_04_INVALID "if invalid, ineligible and asserted":
            assume validity == Sensor_Validity.Invalid;
            guarantee eligibility == Ventilation_Eligibility.Ineligible & sensor_fault == Sensor_Fault_Indication.Asserted;
    }*/

                        
             
                     
                                                                
                                                                                                                   
                                                      
                                                                        
                                                                       
                                                            

                                                         
                                                                                                                                 
                                                      
                                                                         
                                                                         
                                                            

                                                                     
                                                                                                                               
                                                       
                                                                         
                                                               
       
  }

  part def Zone_B_Local_Decision_i :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port temperature : DataPort { in :>> type : Temperature_Celsius; }
    port validity : DataPort { in :>> type : Sensor_Validity; }
    port upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    port eligibility : DataPort { out :>> type : Ventilation_Eligibility; }
    port sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }
    language "GUMBO" /*{
      compute
        compute_cases
          case PART_05_VALID_ABOVE "if valid and temperature exceeds upper limit, eligible and clear":
            assume validity == Sensor_Validity.Valid & temperature.degrees_celsius > upper_limit.degrees_celsius;
            guarantee eligibility == Ventilation_Eligibility.Eligible & sensor_fault == Sensor_Fault_Indication.Clear;
          case PART_05_VALID_AT_OR_BELOW "if valid and temperature at or below upper limit, ineligible and clear":
            assume validity == Sensor_Validity.Valid & temperature.degrees_celsius <= upper_limit.degrees_celsius;
            guarantee eligibility == Ventilation_Eligibility.Ineligible & sensor_fault == Sensor_Fault_Indication.Clear;
          case PART_05_INVALID "if invalid, ineligible and asserted":
            assume validity == Sensor_Validity.Invalid;
            guarantee eligibility == Ventilation_Eligibility.Ineligible & sensor_fault == Sensor_Fault_Indication.Asserted;
    }*/

                        
             
                     
                                                                
                                                                                                                   
                                                      
                                                                        
                                                                       
                                                            

                                                         
                                                                                                                                 
                                                      
                                                                         
                                                                         
                                                            

                                                                     
                                                                                                                               
                                                       
                                                                         
                                                               
       
  }

  part def Shared_Capacity_Arbiter_i :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port zone_a_eligibility : DataPort { in :>> type : Ventilation_Eligibility; }
    port zone_b_eligibility : DataPort { in :>> type : Ventilation_Eligibility; }
    port preference : DataPort { in :>> type : Contention_Preference; }
    port zone_a_fan_command : DataPort { out :>> type : Fan_Command; }
    port zone_b_fan_command : DataPort { out :>> type : Fan_Command; }
    language "GUMBO" /*{
      compute
        compute_cases
          case PART_06_NEITHER_ELIGIBLE "if neither zone eligible, both fans off":
            assume zone_a_eligibility == Ventilation_Eligibility.Ineligible & zone_b_eligibility == Ventilation_Eligibility.Ineligible;
            guarantee zone_a_fan_command == Fan_Command.Off & zone_b_fan_command == Fan_Command.Off;
          case PART_06_A_ONLY "if only zone a eligible, fan a on fan b off":
            assume zone_a_eligibility == Ventilation_Eligibility.Eligible & zone_b_eligibility == Ventilation_Eligibility.Ineligible;
            guarantee zone_a_fan_command == Fan_Command.On & zone_b_fan_command == Fan_Command.Off;
          case PART_06_B_ONLY "if only zone b eligible, fan a off fan b on":
            assume zone_a_eligibility == Ventilation_Eligibility.Ineligible & zone_b_eligibility == Ventilation_Eligibility.Eligible;
            guarantee zone_a_fan_command == Fan_Command.Off & zone_b_fan_command == Fan_Command.On;
          case PART_06_BOTH_PREFER_A "if both eligible and prefer a, fan a on fan b off":
            assume zone_a_eligibility == Ventilation_Eligibility.Eligible & zone_b_eligibility == Ventilation_Eligibility.Eligible & preference == Contention_Preference.Prefer_A;
            guarantee zone_a_fan_command == Fan_Command.On & zone_b_fan_command == Fan_Command.Off;
          case PART_06_BOTH_PREFER_B "if both eligible and prefer b, fan a off fan b on":
            assume zone_a_eligibility == Ventilation_Eligibility.Eligible & zone_b_eligibility == Ventilation_Eligibility.Eligible & preference == Contention_Preference.Prefer_B;
            guarantee zone_a_fan_command == Fan_Command.Off & zone_b_fan_command == Fan_Command.On;
    }*/

                        
             
                     
                                                                           
                                                                                                                     
                                                                             
                                                                       
                                                             
                                                    

                                                         
                                                                                                                  
                                                                           
                                                                       
                                                            
                                                    

                                                         
                                                                                                                  
                                                                             
                                                                     
                                                             
                                                   

                                                
                                                                                                                  
                                                                           
                                                                      
                                                           
                                                            
                                                    

                                                
                                                                                                                  
                                                                           
                                                                      
                                                           
                                                             
                                                   
       
  }

  part def Boundary_Output_Delivery_i :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port zone_a_fan_command_in : DataPort { in :>> type : Fan_Command; }
    port zone_b_fan_command_in : DataPort { in :>> type : Fan_Command; }
    port zone_a_sensor_fault_in : DataPort { in :>> type : Sensor_Fault_Indication; }
    port zone_b_sensor_fault_in : DataPort { in :>> type : Sensor_Fault_Indication; }
    port zone_a_fan_command_out : DataPort { out :>> type : Fan_Command; }
    port zone_b_fan_command_out : DataPort { out :>> type : Fan_Command; }
    port zone_a_sensor_fault_out : DataPort { out :>> type : Sensor_Fault_Indication; }
    port zone_b_sensor_fault_out : DataPort { out :>> type : Sensor_Fault_Indication; }
    language "GUMBO" /*{
      compute
        guarantee PART_07_PRESERVE_A_FAN_COMMAND "zone a fan command out equals zone a fan command in":
          zone_a_fan_command_out == zone_a_fan_command_in;
        guarantee PART_07_PRESERVE_B_FAN_COMMAND "zone b fan command out equals zone b fan command in":
          zone_b_fan_command_out == zone_b_fan_command_in;
        guarantee PART_07_PRESERVE_A_SENSOR_FAULT "zone a sensor fault out equals zone a sensor fault in":
          zone_a_sensor_fault_out == zone_a_sensor_fault_in;
        guarantee PART_07_PRESERVE_B_SENSOR_FAULT "zone b sensor fault out equals zone b sensor fault in":
          zone_b_sensor_fault_out == zone_b_sensor_fault_in;
    }*/

                        
             
                                        
                                                                                                    
                                                          
                                        
                                                                                                    
                                                          
                                        
                                                                                                                 
                                                            
                                        
                                                                                                                 
                                                            
       
  }

  part def Control_Process_i :> Process {
    port zone_a_temperature : DataPort { in :>> type : Temperature_Celsius; }
    port zone_a_validity : DataPort { in :>> type : Sensor_Validity; }
    port zone_b_temperature : DataPort { in :>> type : Temperature_Celsius; }
    port zone_b_validity : DataPort { in :>> type : Sensor_Validity; }
    port upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    port preference : DataPort { in :>> type : Contention_Preference; }
    port zone_a_fan_command : DataPort { out :>> type : Fan_Command; }
    port zone_b_fan_command : DataPort { out :>> type : Fan_Command; }
    port zone_a_sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }
    port zone_b_sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }

    part zone_a_sensor_intake : Zone_A_Sensor_Intake_i;
    part zone_b_sensor_intake : Zone_B_Sensor_Intake_i;
    part operator_configuration_intake : Operator_Configuration_Intake_i;
    part zone_a_local_decision : Zone_A_Local_Decision_i;
    part zone_b_local_decision : Zone_B_Local_Decision_i;
    part shared_capacity_arbiter : Shared_Capacity_Arbiter_i;
    part boundary_output_delivery : Boundary_Output_Delivery_i;

    connection support_a_temperature_to_intake : PortConnection
      connect zone_a_temperature to zone_a_sensor_intake.temperature_in;
    connection support_a_validity_to_intake : PortConnection
      connect zone_a_validity to zone_a_sensor_intake.validity_in;
    connection support_b_temperature_to_intake : PortConnection
      connect zone_b_temperature to zone_b_sensor_intake.temperature_in;
    connection support_b_validity_to_intake : PortConnection
      connect zone_b_validity to zone_b_sensor_intake.validity_in;
    connection support_limit_to_configuration : PortConnection
      connect upper_limit to operator_configuration_intake.upper_limit_in;
    connection support_preference_to_configuration : PortConnection
      connect preference to operator_configuration_intake.preference_in;

    connection int_01_a_temperature : PortConnection
      connect zone_a_sensor_intake.temperature_out to zone_a_local_decision.temperature;
    connection int_02_a_validity : PortConnection
      connect zone_a_sensor_intake.validity_out to zone_a_local_decision.validity;
    connection int_03_b_temperature : PortConnection
      connect zone_b_sensor_intake.temperature_out to zone_b_local_decision.temperature;
    connection int_04_b_validity : PortConnection
      connect zone_b_sensor_intake.validity_out to zone_b_local_decision.validity;
    connection int_05_limit_to_a : PortConnection
      connect operator_configuration_intake.upper_limit_for_a to zone_a_local_decision.upper_limit;
    connection int_06_limit_to_b : PortConnection
      connect operator_configuration_intake.upper_limit_for_b to zone_b_local_decision.upper_limit;
    connection int_07_preference_to_arbiter : PortConnection
      connect operator_configuration_intake.preference_out to shared_capacity_arbiter.preference;
    connection int_08_a_eligibility : PortConnection
      connect zone_a_local_decision.eligibility to shared_capacity_arbiter.zone_a_eligibility;
    connection int_09_b_eligibility : PortConnection
      connect zone_b_local_decision.eligibility to shared_capacity_arbiter.zone_b_eligibility;
    connection int_10_a_fault : PortConnection
      connect zone_a_local_decision.sensor_fault to boundary_output_delivery.zone_a_sensor_fault_in;
    connection int_11_b_fault : PortConnection
      connect zone_b_local_decision.sensor_fault to boundary_output_delivery.zone_b_sensor_fault_in;
    connection int_12_a_fan_command : PortConnection
      connect shared_capacity_arbiter.zone_a_fan_command to boundary_output_delivery.zone_a_fan_command_in;
    connection int_13_b_fan_command : PortConnection
      connect shared_capacity_arbiter.zone_b_fan_command to boundary_output_delivery.zone_b_fan_command_in;

    connection support_a_fan_to_boundary : PortConnection
      connect boundary_output_delivery.zone_a_fan_command_out to zone_a_fan_command;
    connection support_b_fan_to_boundary : PortConnection
      connect boundary_output_delivery.zone_b_fan_command_out to zone_b_fan_command;
    connection support_a_fault_to_boundary : PortConnection
      connect boundary_output_delivery.zone_a_sensor_fault_out to zone_a_sensor_fault;
    connection support_b_fault_to_boundary : PortConnection
      connect boundary_output_delivery.zone_b_sensor_fault_out to zone_b_sensor_fault;
  }

  part def Dual_Zone_Greenhouse_Root :> System {
    port zone_a_temperature : DataPort { in :>> type : Temperature_Celsius; }
    port zone_a_validity : DataPort { in :>> type : Sensor_Validity; }
    port zone_b_temperature : DataPort { in :>> type : Temperature_Celsius; }
    port zone_b_validity : DataPort { in :>> type : Sensor_Validity; }
    port upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    port preference : DataPort { in :>> type : Contention_Preference; }
    port zone_a_fan_command : DataPort { out :>> type : Fan_Command; }
    port zone_b_fan_command : DataPort { out :>> type : Fan_Command; }
    port zone_a_sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }
    port zone_b_sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }

    part control_process : Control_Process_i;

    connection boundary_a_temperature : PortConnection
      connect zone_a_temperature to control_process.zone_a_temperature;
    connection boundary_a_validity : PortConnection
      connect zone_a_validity to control_process.zone_a_validity;
    connection boundary_b_temperature : PortConnection
      connect zone_b_temperature to control_process.zone_b_temperature;
    connection boundary_b_validity : PortConnection
      connect zone_b_validity to control_process.zone_b_validity;
    connection boundary_upper_limit : PortConnection
      connect upper_limit to control_process.upper_limit;
    connection boundary_preference : PortConnection
      connect preference to control_process.preference;
    connection boundary_a_fan_command : PortConnection
      connect control_process.zone_a_fan_command to zone_a_fan_command;
    connection boundary_b_fan_command : PortConnection
      connect control_process.zone_b_fan_command to zone_b_fan_command;
    connection boundary_a_sensor_fault : PortConnection
      connect control_process.zone_a_sensor_fault to zone_a_sensor_fault;
    connection boundary_b_sensor_fault : PortConnection
      connect control_process.zone_b_sensor_fault to zone_b_sensor_fault;
  }

  part dual_zone_greenhouse : Dual_Zone_Greenhouse_Root;
}
