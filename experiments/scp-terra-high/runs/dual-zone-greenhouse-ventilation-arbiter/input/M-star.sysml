package Dual_Zone_Greenhouse {

  private import HAMR::*;

  part def Temperature_Celsius :> Data {
    part degrees_celsius : Base_Types::Integer_32;

                        
                
                                                    
                                                                                                                                   
                                                                     
       
  }

  part def Upper_Temperature_Limit :> Data {
    part degrees_celsius : Base_Types::Integer_32;

                        
                
                                      
                                                                                                                                 
                                                                    
       
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
    port temperature_in : DataPort { in :>> type : Temperature_Celsius; }
    port validity_in : DataPort { in :>> type : Sensor_Validity; }
    port temperature_out : DataPort { out :>> type : Temperature_Celsius; }
    port validity_out : DataPort { out :>> type : Sensor_Validity; }

                        
             
                                       
                                                                                                        
                                                                            
                                       
                                                                                                   
                                      
       
  }

  part def Zone_B_Sensor_Intake_i :> Thread {
    port temperature_in : DataPort { in :>> type : Temperature_Celsius; }
    port validity_in : DataPort { in :>> type : Sensor_Validity; }
    port temperature_out : DataPort { out :>> type : Temperature_Celsius; }
    port validity_out : DataPort { out :>> type : Sensor_Validity; }

                        
             
                                       
                                                                                                        
                                                                            
                                       
                                                                                                   
                                      
       
  }

  part def Operator_Configuration_Intake_i :> Thread {
    port upper_limit_in : DataPort { in :>> type : Upper_Temperature_Limit; }
    port preference_in : DataPort { in :>> type : Contention_Preference; }
    port upper_limit_for_a : DataPort { out :>> type : Upper_Temperature_Limit; }
    port upper_limit_for_b : DataPort { out :>> type : Upper_Temperature_Limit; }
    port preference_out : DataPort { out :>> type : Contention_Preference; }

                        
             
                                       
                                                                                                                    
                                                                              
                                       
                                                                                                                    
                                                                              
                                       
                                                                                                         
                                          
       
  }

  part def Zone_A_Local_Decision_i :> Thread {
    port temperature : DataPort { in :>> type : Temperature_Celsius; }
    port validity : DataPort { in :>> type : Sensor_Validity; }
    port upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    port eligibility : DataPort { out :>> type : Ventilation_Eligibility; }
    port sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }

                        
             
                     
                                                                
                                                                                                                   
                                                      
                                                                        
                                                                       
                                                            

                                                         
                                                                                                                                 
                                                      
                                                                         
                                                                         
                                                            

                                                                     
                                                                                                                               
                                                       
                                                                         
                                                               
       
  }

  part def Zone_B_Local_Decision_i :> Thread {
    port temperature : DataPort { in :>> type : Temperature_Celsius; }
    port validity : DataPort { in :>> type : Sensor_Validity; }
    port upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    port eligibility : DataPort { out :>> type : Ventilation_Eligibility; }
    port sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }

                        
             
                     
                                                                
                                                                                                                   
                                                      
                                                                        
                                                                       
                                                            

                                                         
                                                                                                                                 
                                                      
                                                                         
                                                                         
                                                            

                                                                     
                                                                                                                               
                                                       
                                                                         
                                                               
       
  }

  part def Shared_Capacity_Arbiter_i :> Thread {
    port zone_a_eligibility : DataPort { in :>> type : Ventilation_Eligibility; }
    port zone_b_eligibility : DataPort { in :>> type : Ventilation_Eligibility; }
    port preference : DataPort { in :>> type : Contention_Preference; }
    port zone_a_fan_command : DataPort { out :>> type : Fan_Command; }
    port zone_b_fan_command : DataPort { out :>> type : Fan_Command; }

                        
             
                     
                                                                           
                                                                                                                     
                                                                             
                                                                       
                                                             
                                                    

                                                         
                                                                                                                  
                                                                           
                                                                       
                                                            
                                                    

                                                         
                                                                                                                  
                                                                             
                                                                     
                                                             
                                                   

                                                
                                                                                                                  
                                                                           
                                                                      
                                                           
                                                            
                                                    

                                                
                                                                                                                  
                                                                           
                                                                      
                                                           
                                                             
                                                   
       
  }

  part def Boundary_Output_Delivery_i :> Thread {
    port zone_a_fan_command_in : DataPort { in :>> type : Fan_Command; }
    port zone_b_fan_command_in : DataPort { in :>> type : Fan_Command; }
    port zone_a_sensor_fault_in : DataPort { in :>> type : Sensor_Fault_Indication; }
    port zone_b_sensor_fault_in : DataPort { in :>> type : Sensor_Fault_Indication; }
    port zone_a_fan_command_out : DataPort { out :>> type : Fan_Command; }
    port zone_b_fan_command_out : DataPort { out :>> type : Fan_Command; }
    port zone_a_sensor_fault_out : DataPort { out :>> type : Sensor_Fault_Indication; }
    port zone_b_sensor_fault_out : DataPort { out :>> type : Sensor_Fault_Indication; }

                        
             
                                        
                                                                                                    
                                                          
                                        
                                                                                                    
                                                          
                                        
                                                                                                                 
                                                            
                                        
                                                                                                                 
                                                            
       
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
