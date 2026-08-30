package Greenhouse_Ventilation {

  private import HAMR::*;

  // @trace MON-01 ASM-01
  part def Temperature_Celsius :> Data {
    // @trace MON-01 ASM-01
    part degrees_celsius : Base_Types::Integer_32;

    language "GUMBO" /*{
      invariants
        // @trace MON-01 ASM-01
        inv REPRESENTABLE_TEMPERATURE_RANGE "A temperature value is representable from -20 through 60 degrees Celsius, inclusive":
          -20 [s32] <= degrees_celsius & degrees_celsius <= 60 [s32];
    }*/
  }

  // @trace MON-01 FAULT-01
  enum def Temperature_Validity {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-01 ASM-01
  part def Temperature_Input :> Data {
    // @trace MON-01 ASM-01
    part temperature : Temperature_Celsius;
    // @trace MON-01 FAULT-01
    attribute validity : Temperature_Validity;
  }

  // @trace MON-02 ASM-02
  part def Upper_Temperature_Limit :> Data {
    // @trace MON-02 ASM-02
    part degrees_celsius : Base_Types::Integer_32;

    language "GUMBO" /*{
      invariants
        // @trace MON-02 ASM-02
        inv SELECTABLE_UPPER_LIMIT_RANGE "An operator-selected upper limit is from 10 through 35 degrees Celsius, inclusive":
          10 [s32] <= degrees_celsius & degrees_celsius <= 35 [s32];
    }*/
  }

  // @trace CTRL-01 BEH-01 BEH-02 FAULT-01
  enum def Fan_Command {
    enum On;
    enum Off;
  }

  // @trace CTRL-02 FAULT-01
  enum def Sensor_Fault_Indication {
    enum Clear;
    enum Asserted;
  }

  // @trace PART-01 MON-01
  part def Measurement_Intake_i :> System {
    // @trace MON-01 CTX-01
    port temperature_input : DataPort { in :>> type : Temperature_Input; }
    // @trace MON-01 INT-01
    port temperature : DataPort { out :>> type : Temperature_Celsius; }
    // @trace MON-01 INT-02 FAULT-01
    port validity : DataPort { out :>> type : Temperature_Validity; }
  }

  // @trace PART-02 MON-02
  part def Operator_Configuration_i :> System {
    // @trace MON-02 CTX-02
    port selected_upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    // @trace MON-02 INT-03 ASM-02
    port upper_limit : DataPort { out :>> type : Upper_Temperature_Limit; }
  }

  // @trace PART-03 BEH-01 BEH-02 FAULT-01
  part def Ventilation_Decision_i :> Thread {
    // @trace MON-01 INT-01 BEH-01 BEH-02
    port temperature : DataPort { in :>> type : Temperature_Celsius; }
    // @trace MON-01 INT-02 FAULT-01
    port validity : DataPort { in :>> type : Temperature_Validity; }
    // @trace MON-02 INT-03 BEH-01 BEH-02
    port upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    // @trace CTRL-01 INT-04 BEH-01 BEH-02 FAULT-01
    port fan_command : DataPort { out :>> type : Fan_Command; }
    // @trace CTRL-02 INT-05 FAULT-01
    port sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace BEH-01 CTRL-01 CTRL-02
          case BEH_01_VALID_ABOVE "A valid temperature above the selected limit commands ventilation on and clears the sensor-fault indication":
            assume validity == Temperature_Validity.Valid &
              temperature.degrees_celsius > upper_limit.degrees_celsius;
            guarantee fan_command == Fan_Command.On &
              sensor_fault == Sensor_Fault_Indication.Clear;

          // @trace BEH-02 CTRL-01 CTRL-02
          case BEH_02_VALID_AT_OR_BELOW "A valid temperature at or below the selected limit commands ventilation off and clears the sensor-fault indication":
            assume validity == Temperature_Validity.Valid &
              temperature.degrees_celsius <= upper_limit.degrees_celsius;
            guarantee fan_command == Fan_Command.Off &
              sensor_fault == Sensor_Fault_Indication.Clear;

          // @trace FAULT-01 CTRL-01 CTRL-02 RISK-01
          case FAULT_01_INVALID "An invalid temperature commands ventilation off and asserts the sensor-fault indication":
            assume validity == Temperature_Validity.Invalid;
            guarantee fan_command == Fan_Command.Off &
              sensor_fault == Sensor_Fault_Indication.Asserted;
    }*/
  }

  // @generated-support legal HAMR containment for PART-03 decision thread
  // @trace PART-03 BEH-01 BEH-02 FAULT-01
  part def Control_Process_i :> Process {
    // @generated-support legal HAMR containment for PART-03 decision thread
    // @trace INT-01 MON-01 BEH-01 BEH-02
    port temperature : DataPort { in :>> type : Temperature_Celsius; }
    // @generated-support legal HAMR containment for PART-03 decision thread
    // @trace INT-02 MON-01 FAULT-01
    port validity : DataPort { in :>> type : Temperature_Validity; }
    // @generated-support legal HAMR containment for PART-03 decision thread
    // @trace INT-03 MON-02 BEH-01 BEH-02
    port upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    // @generated-support legal HAMR containment for PART-03 decision thread
    // @trace INT-04 CTRL-01 BEH-01 BEH-02 FAULT-01
    port fan_command : DataPort { out :>> type : Fan_Command; }
    // @generated-support legal HAMR containment for PART-03 decision thread
    // @trace INT-05 CTRL-02 FAULT-01
    port sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }

    // @generated-support legal HAMR containment for PART-03 decision thread
    // @trace PART-03 BEH-01 BEH-02 FAULT-01
    part ventilation_decision : Ventilation_Decision_i;

    // @generated-support legal HAMR containment for PART-03 decision thread
    // @trace INT-01 MON-01 BEH-01 BEH-02
    connection temperature_to_thread : PortConnection
      connect temperature to ventilation_decision.temperature;
    // @generated-support legal HAMR containment for PART-03 decision thread
    // @trace INT-02 MON-01 FAULT-01
    connection validity_to_thread : PortConnection
      connect validity to ventilation_decision.validity;
    // @generated-support legal HAMR containment for PART-03 decision thread
    // @trace INT-03 MON-02 BEH-01 BEH-02
    connection limit_to_thread : PortConnection
      connect upper_limit to ventilation_decision.upper_limit;
    // @generated-support legal HAMR containment for PART-03 decision thread
    // @trace INT-04 CTRL-01 BEH-01 BEH-02 FAULT-01
    connection fan_command_from_thread : PortConnection
      connect ventilation_decision.fan_command to fan_command;
    // @generated-support legal HAMR containment for PART-03 decision thread
    // @trace INT-05 CTRL-02 FAULT-01
    connection fault_from_thread : PortConnection
      connect ventilation_decision.sensor_fault to sensor_fault;
  }

  // @trace PART-04 CTRL-01
  part def Fan_Command_Delivery_i :> System {
    // @trace CTRL-01 INT-04 BEH-01 BEH-02 FAULT-01
    port fan_command : DataPort { in :>> type : Fan_Command; }
    // @trace CTRL-01 CTX-03
    port delivered_fan_command : DataPort { out :>> type : Fan_Command; }
  }

  // @trace PART-05 CTRL-02
  part def Fault_Reporting_i :> System {
    // @trace CTRL-02 INT-05 FAULT-01
    port sensor_fault : DataPort { in :>> type : Sensor_Fault_Indication; }
    // @trace CTRL-02 CTX-04
    port reported_sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }
  }

  // @trace GOAL-01 GOAL-02 CTX-01 CTX-02 CTX-03 CTX-04
  part def Greenhouse_Ventilation_Root :> System {
    // @trace MON-01 CTX-01 ASM-01
    port temperature_input : DataPort { in :>> type : Temperature_Input; }
    // @trace MON-02 CTX-02 ASM-02
    port selected_upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    // @trace CTRL-01 CTX-03 GOAL-01 GOAL-02
    port fan_command : DataPort { out :>> type : Fan_Command; }
    // @trace CTRL-02 CTX-04 GOAL-02
    port sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }

    // @trace PART-01 MON-01
    part measurement_intake : Measurement_Intake_i;
    // @trace PART-02 MON-02
    part operator_configuration : Operator_Configuration_i;
    // @generated-support legal HAMR containment for PART-03 decision thread
    // @trace PART-03 BEH-01 BEH-02 FAULT-01
    part control_process : Control_Process_i;
    // @trace PART-04 CTRL-01
    part fan_delivery : Fan_Command_Delivery_i;
    // @trace PART-05 CTRL-02
    part fault_reporting : Fault_Reporting_i;

    // @trace MON-01 CTX-01 PART-01
    connection boundary_temperature_to_intake : PortConnection
      connect temperature_input to measurement_intake.temperature_input;
    // @trace MON-02 CTX-02 PART-02
    connection boundary_limit_to_configuration : PortConnection
      connect selected_upper_limit to operator_configuration.selected_upper_limit;

    // @trace INT-01 MON-01 BEH-01 BEH-02
    connection temperature_to_decision : PortConnection
      connect measurement_intake.temperature to control_process.temperature;
    // @trace INT-02 MON-01 FAULT-01
    connection validity_to_decision : PortConnection
      connect measurement_intake.validity to control_process.validity;
    // @trace INT-03 MON-02 BEH-01 BEH-02
    connection limit_to_decision : PortConnection
      connect operator_configuration.upper_limit to control_process.upper_limit;
    // @trace INT-04 CTRL-01 BEH-01 BEH-02 FAULT-01
    connection fan_command_to_delivery : PortConnection
      connect control_process.fan_command to fan_delivery.fan_command;
    // @trace INT-05 CTRL-02 FAULT-01
    connection fault_to_reporting : PortConnection
      connect control_process.sensor_fault to fault_reporting.sensor_fault;

    // @trace CTRL-01 CTX-03 PART-04
    connection delivery_to_boundary_fan : PortConnection
      connect fan_delivery.delivered_fan_command to fan_command;
    // @trace CTRL-02 CTX-04 PART-05
    connection reporting_to_boundary_fault : PortConnection
      connect fault_reporting.reported_sensor_fault to sensor_fault;
  }

  // @trace GOAL-01 GOAL-02
  part greenhouse_ventilation : Greenhouse_Ventilation_Root;
}
