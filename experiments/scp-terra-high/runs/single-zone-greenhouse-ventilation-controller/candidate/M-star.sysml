package Greenhouse_Ventilation {

  private import HAMR::*;

  part def Temperature_Celsius :> Data {
    part degrees_celsius : Base_Types::Integer_32;

                        
                
                               
                                                                                                                                  
                                                                     
       
  }

  enum def Temperature_Validity {
    enum Valid;
    enum Invalid;
  }

  part def Temperature_Input :> Data {
    part temperature : Temperature_Celsius;
    attribute validity : Temperature_Validity;
  }

  part def Upper_Temperature_Limit :> Data {
    part degrees_celsius : Base_Types::Integer_32;

                        
                
                               
                                                                                                                             
                                                                    
       
  }

  enum def Fan_Command {
    enum On;
    enum Off;
  }

  enum def Sensor_Fault_Indication {
    enum Clear;
    enum Asserted;
  }

  part def Measurement_Intake_i :> System {
    port temperature_input : DataPort { in :>> type : Temperature_Input; }
    port temperature : DataPort { out :>> type : Temperature_Celsius; }
    port validity : DataPort { out :>> type : Temperature_Validity; }
  }

  part def Operator_Configuration_i :> System {
    port selected_upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    port upper_limit : DataPort { out :>> type : Upper_Temperature_Limit; }
  }

  part def Ventilation_Decision_i :> Thread {
    port temperature : DataPort { in :>> type : Temperature_Celsius; }
    port validity : DataPort { in :>> type : Temperature_Validity; }
    port upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    port fan_command : DataPort { out :>> type : Fan_Command; }
    port sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }

    language "GUMBO" /*{
      compute
        compute_cases
          case BEH_01_VALID_ABOVE:
            assume validity == Temperature_Validity.Valid and
              temperature.degrees_celsius > upper_limit.degrees_celsius;
            guarantee fan_command == Fan_Command.On and
              sensor_fault == Sensor_Fault_Indication.Clear;

          case BEH_02_VALID_AT_OR_BELOW:
            assume validity == Temperature_Validity.Valid and
              temperature.degrees_celsius <= upper_limit.degrees_celsius;
            guarantee fan_command == Fan_Command.Off and
              sensor_fault == Sensor_Fault_Indication.Clear;

          case FAULT_01_INVALID:
            assume validity == Temperature_Validity.Invalid;
            guarantee fan_command == Fan_Command.Off and
              sensor_fault == Sensor_Fault_Indication.Asserted;
    }*/
       
  }

  part def Control_Process_i :> Process {
    port temperature : DataPort { in :>> type : Temperature_Celsius; }
    port validity : DataPort { in :>> type : Temperature_Validity; }
    port upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    port fan_command : DataPort { out :>> type : Fan_Command; }
    port sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }

    part ventilation_decision : Ventilation_Decision_i;

    connection temperature_to_thread : PortConnection
      connect temperature to ventilation_decision.temperature;
    connection validity_to_thread : PortConnection
      connect validity to ventilation_decision.validity;
    connection limit_to_thread : PortConnection
      connect upper_limit to ventilation_decision.upper_limit;
    connection fan_command_from_thread : PortConnection
      connect ventilation_decision.fan_command to fan_command;
    connection fault_from_thread : PortConnection
      connect ventilation_decision.sensor_fault to sensor_fault;
  }

  part def Fan_Command_Delivery_i :> System {
    port fan_command : DataPort { in :>> type : Fan_Command; }
    port delivered_fan_command : DataPort { out :>> type : Fan_Command; }
  }

  part def Fault_Reporting_i :> System {
    port sensor_fault : DataPort { in :>> type : Sensor_Fault_Indication; }
    port reported_sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }
  }

  part def Greenhouse_Ventilation_Root :> System {
    port temperature_input : DataPort { in :>> type : Temperature_Input; }
    port selected_upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    port fan_command : DataPort { out :>> type : Fan_Command; }
    port sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }

    part measurement_intake : Measurement_Intake_i;
    part operator_configuration : Operator_Configuration_i;
    part control_process : Control_Process_i;
    part fan_delivery : Fan_Command_Delivery_i;
    part fault_reporting : Fault_Reporting_i;

    connection boundary_temperature_to_intake : PortConnection
      connect temperature_input to measurement_intake.temperature_input;
    connection boundary_limit_to_configuration : PortConnection
      connect selected_upper_limit to operator_configuration.selected_upper_limit;

    connection temperature_to_decision : PortConnection
      connect measurement_intake.temperature to control_process.temperature;
    connection validity_to_decision : PortConnection
      connect measurement_intake.validity to control_process.validity;
    connection limit_to_decision : PortConnection
      connect operator_configuration.upper_limit to control_process.upper_limit;
    connection fan_command_to_delivery : PortConnection
      connect control_process.fan_command to fan_delivery.fan_command;
    connection fault_to_reporting : PortConnection
      connect control_process.sensor_fault to fault_reporting.sensor_fault;

    connection delivery_to_boundary_fan : PortConnection
      connect fan_delivery.delivered_fan_command to fan_command;
    connection reporting_to_boundary_fault : PortConnection
      connect fault_reporting.reported_sensor_fault to sensor_fault;
  }

  part greenhouse_ventilation : Greenhouse_Ventilation_Root;
}
