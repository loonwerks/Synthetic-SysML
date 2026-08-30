package Dual_Zone_Greenhouse {

  private import HAMR::*;

  // @trace MON-01 MON-02 ASM-01 ASM-02 REP-01
  part def Temperature_Celsius :> Data {
    // @trace MON-01 MON-02 ASM-01 ASM-02 REP-01
    part degrees_celsius : Base_Types::Integer_32;

    language "GUMBO" /*{
      invariants
        // @trace MON-01 MON-02 ASM-01 ASM-02 REP-01
        inv REPRESENTABLE_TEMPERATURE_RANGE "Integer-valued pilot temperatures are from -20 through 60 degrees Celsius, inclusive":
          -20 [s32] <= degrees_celsius & degrees_celsius <= 60 [s32];
    }*/
  }

  // @trace MON-03 ASM-03 REP-01
  part def Upper_Temperature_Limit :> Data {
    // @trace MON-03 ASM-03 REP-01
    part degrees_celsius : Base_Types::Integer_32;

    language "GUMBO" /*{
      invariants
        // @trace MON-03 ASM-03 REP-01
        inv SELECTABLE_UPPER_LIMIT_RANGE "The integer-valued pilot upper limit is from 10 through 35 degrees Celsius, inclusive":
          10 [s32] <= degrees_celsius & degrees_celsius <= 35 [s32];
    }*/
  }

  // @trace MON-01 MON-02 ASM-01 ASM-02 REP-01
  enum def Sensor_Validity {
    enum Valid;
    enum Invalid;
  }

  // @trace MON-04 ASM-04 REP-01
  enum def Contention_Preference {
    enum Prefer_A;
    enum Prefer_B;
  }

  // @trace POL-01 INT-08 INT-09 REP-01
  enum def Ventilation_Eligibility {
    enum Eligible;
    enum Ineligible;
  }

  // @trace CTRL-01 CTRL-02 CON-01 REP-01
  enum def Fan_Command {
    enum On;
    enum Off;
  }

  // @trace CTRL-03 CTRL-04 FAULT-01 FAULT-02 FAULT-03 FAULT-04 FAULT-05 REP-01
  enum def Sensor_Fault_Indication {
    enum Clear;
    enum Asserted;
  }

  // @trace PART-01 MON-01
  part def Zone_A_Sensor_Intake_i :> Thread {
    // @trace PART-01 MON-01 CTX-01
    port temperature_in : DataPort { in :>> type : Temperature_Celsius; }
    // @trace PART-01 MON-01 CTX-01
    port validity_in : DataPort { in :>> type : Sensor_Validity; }
    // @trace PART-01 INT-01 MON-01
    port temperature_out : DataPort { out :>> type : Temperature_Celsius; }
    // @trace PART-01 INT-02 MON-01
    port validity_out : DataPort { out :>> type : Sensor_Validity; }

    language "GUMBO" /*{
      compute
        // @trace PART-01 MON-01 INT-01
        guarantee PART_01_PRESERVE_TEMPERATURE "Zone A intake preserves the supplied temperature value":
          temperature_out.degrees_celsius == temperature_in.degrees_celsius;
        // @trace PART-01 MON-01 INT-02
        guarantee PART_01_PRESERVE_VALIDITY "Zone A intake preserves the supplied validity status":
          validity_out == validity_in;
    }*/
  }

  // @trace PART-02 MON-02
  part def Zone_B_Sensor_Intake_i :> Thread {
    // @trace PART-02 MON-02 CTX-02
    port temperature_in : DataPort { in :>> type : Temperature_Celsius; }
    // @trace PART-02 MON-02 CTX-02
    port validity_in : DataPort { in :>> type : Sensor_Validity; }
    // @trace PART-02 INT-03 MON-02
    port temperature_out : DataPort { out :>> type : Temperature_Celsius; }
    // @trace PART-02 INT-04 MON-02
    port validity_out : DataPort { out :>> type : Sensor_Validity; }

    language "GUMBO" /*{
      compute
        // @trace PART-02 MON-02 INT-03
        guarantee PART_02_PRESERVE_TEMPERATURE "Zone B intake preserves the supplied temperature value":
          temperature_out.degrees_celsius == temperature_in.degrees_celsius;
        // @trace PART-02 MON-02 INT-04
        guarantee PART_02_PRESERVE_VALIDITY "Zone B intake preserves the supplied validity status":
          validity_out == validity_in;
    }*/
  }

  // @trace PART-03 MON-03 MON-04
  part def Operator_Configuration_Intake_i :> Thread {
    // @trace PART-03 MON-03 CTX-03
    port upper_limit_in : DataPort { in :>> type : Upper_Temperature_Limit; }
    // @trace PART-03 MON-04 CTX-03
    port preference_in : DataPort { in :>> type : Contention_Preference; }
    // @trace PART-03 INT-05 MON-03
    port upper_limit_for_a : DataPort { out :>> type : Upper_Temperature_Limit; }
    // @trace PART-03 INT-06 MON-03
    port upper_limit_for_b : DataPort { out :>> type : Upper_Temperature_Limit; }
    // @trace PART-03 INT-07 MON-04
    port preference_out : DataPort { out :>> type : Contention_Preference; }

    language "GUMBO" /*{
      compute
        // @trace PART-03 MON-03 INT-05
        guarantee PART_03_PRESERVE_LIMIT_FOR_A "Configuration intake preserves the shared limit supplied to Zone A":
          upper_limit_for_a.degrees_celsius == upper_limit_in.degrees_celsius;
        // @trace PART-03 MON-03 INT-06
        guarantee PART_03_PRESERVE_LIMIT_FOR_B "Configuration intake preserves the shared limit supplied to Zone B":
          upper_limit_for_b.degrees_celsius == upper_limit_in.degrees_celsius;
        // @trace PART-03 MON-04 INT-07
        guarantee PART_03_PRESERVE_PREFERENCE "Configuration intake preserves the contention preference":
          preference_out == preference_in;
    }*/
  }

  // @trace PART-04 POL-01 GOAL-01 GOAL-03 RISK-01
  part def Zone_A_Local_Decision_i :> Thread {
    // @trace PART-04 INT-01 MON-01 POL-01
    port temperature : DataPort { in :>> type : Temperature_Celsius; }
    // @trace PART-04 INT-02 MON-01 POL-01
    port validity : DataPort { in :>> type : Sensor_Validity; }
    // @trace PART-04 INT-05 MON-03 POL-01
    port upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    // @trace PART-04 INT-08 POL-01
    port eligibility : DataPort { out :>> type : Ventilation_Eligibility; }
    // @trace PART-04 INT-10 CTRL-03 FAULT-01 FAULT-02 FAULT-03 FAULT-04 FAULT-05
    port sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace PART-04 POL-01 BEH-02 BEH-04 BEH-05 FAULT-05
          case PART_04_VALID_ABOVE "A valid Zone A temperature above the shared limit is eligible and fault-clear":
            assume validity == Sensor_Validity.Valid &
              temperature.degrees_celsius > upper_limit.degrees_celsius;
            guarantee eligibility == Ventilation_Eligibility.Eligible &
              sensor_fault == Sensor_Fault_Indication.Clear;

          // @trace PART-04 POL-01 BEH-01 BEH-03 FAULT-04
          case PART_04_VALID_AT_OR_BELOW "A valid Zone A temperature at or below the shared limit is ineligible and fault-clear":
            assume validity == Sensor_Validity.Valid &
              temperature.degrees_celsius <= upper_limit.degrees_celsius;
            guarantee eligibility == Ventilation_Eligibility.Ineligible &
              sensor_fault == Sensor_Fault_Indication.Clear;

          // @trace PART-04 POL-01 RISK-01 FAULT-01 FAULT-02 FAULT-03
          case PART_04_INVALID "An invalid Zone A input is ineligible and fault-asserted independent of temperature and limit":
            assume validity == Sensor_Validity.Invalid;
            guarantee eligibility == Ventilation_Eligibility.Ineligible &
              sensor_fault == Sensor_Fault_Indication.Asserted;
    }*/
  }

  // @trace PART-05 POL-01 GOAL-01 GOAL-03 RISK-01
  part def Zone_B_Local_Decision_i :> Thread {
    // @trace PART-05 INT-03 MON-02 POL-01
    port temperature : DataPort { in :>> type : Temperature_Celsius; }
    // @trace PART-05 INT-04 MON-02 POL-01
    port validity : DataPort { in :>> type : Sensor_Validity; }
    // @trace PART-05 INT-06 MON-03 POL-01
    port upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    // @trace PART-05 INT-09 POL-01
    port eligibility : DataPort { out :>> type : Ventilation_Eligibility; }
    // @trace PART-05 INT-11 CTRL-04 FAULT-01 FAULT-02 FAULT-03 FAULT-04 FAULT-05
    port sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace PART-05 POL-01 BEH-03 BEH-04 BEH-05 FAULT-03
          case PART_05_VALID_ABOVE "A valid Zone B temperature above the shared limit is eligible and fault-clear":
            assume validity == Sensor_Validity.Valid &
              temperature.degrees_celsius > upper_limit.degrees_celsius;
            guarantee eligibility == Ventilation_Eligibility.Eligible &
              sensor_fault == Sensor_Fault_Indication.Clear;

          // @trace PART-05 POL-01 BEH-01 BEH-02 FAULT-02
          case PART_05_VALID_AT_OR_BELOW "A valid Zone B temperature at or below the shared limit is ineligible and fault-clear":
            assume validity == Sensor_Validity.Valid &
              temperature.degrees_celsius <= upper_limit.degrees_celsius;
            guarantee eligibility == Ventilation_Eligibility.Ineligible &
              sensor_fault == Sensor_Fault_Indication.Clear;

          // @trace PART-05 POL-01 RISK-01 FAULT-01 FAULT-04 FAULT-05
          case PART_05_INVALID "An invalid Zone B input is ineligible and fault-asserted independent of temperature and limit":
            assume validity == Sensor_Validity.Invalid;
            guarantee eligibility == Ventilation_Eligibility.Ineligible &
              sensor_fault == Sensor_Fault_Indication.Asserted;
    }*/
  }

  // @trace PART-06 POL-02 CON-01 GOAL-02
  part def Shared_Capacity_Arbiter_i :> Thread {
    // @trace PART-06 INT-08 POL-02 CON-01
    port zone_a_eligibility : DataPort { in :>> type : Ventilation_Eligibility; }
    // @trace PART-06 INT-09 POL-02 CON-01
    port zone_b_eligibility : DataPort { in :>> type : Ventilation_Eligibility; }
    // @trace PART-06 INT-07 MON-04 POL-02
    port preference : DataPort { in :>> type : Contention_Preference; }
    // @trace PART-06 INT-12 CTRL-01 POL-02 CON-01
    port zone_a_fan_command : DataPort { out :>> type : Fan_Command; }
    // @trace PART-06 INT-13 CTRL-02 POL-02 CON-01
    port zone_b_fan_command : DataPort { out :>> type : Fan_Command; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace PART-06 POL-02 CON-01 BEH-01 FAULT-01 FAULT-02 FAULT-04
          case PART_06_NEITHER_ELIGIBLE "When neither zone is eligible, both fans are off independent of preference":
            assume zone_a_eligibility == Ventilation_Eligibility.Ineligible &
              zone_b_eligibility == Ventilation_Eligibility.Ineligible;
            guarantee zone_a_fan_command == Fan_Command.Off &
              zone_b_fan_command == Fan_Command.Off;

          // @trace PART-06 POL-02 CON-01 BEH-02 FAULT-05
          case PART_06_A_ONLY "When only Zone A is eligible, only the Zone A fan is on independent of preference":
            assume zone_a_eligibility == Ventilation_Eligibility.Eligible &
              zone_b_eligibility == Ventilation_Eligibility.Ineligible;
            guarantee zone_a_fan_command == Fan_Command.On &
              zone_b_fan_command == Fan_Command.Off;

          // @trace PART-06 POL-02 CON-01 BEH-03 FAULT-03
          case PART_06_B_ONLY "When only Zone B is eligible, only the Zone B fan is on independent of preference":
            assume zone_a_eligibility == Ventilation_Eligibility.Ineligible &
              zone_b_eligibility == Ventilation_Eligibility.Eligible;
            guarantee zone_a_fan_command == Fan_Command.Off &
              zone_b_fan_command == Fan_Command.On;

          // @trace PART-06 POL-02 CON-01 BEH-04
          case PART_06_BOTH_PREFER_A "When both zones are eligible and A is preferred, only the Zone A fan is on":
            assume zone_a_eligibility == Ventilation_Eligibility.Eligible &
              zone_b_eligibility == Ventilation_Eligibility.Eligible &
              preference == Contention_Preference.Prefer_A;
            guarantee zone_a_fan_command == Fan_Command.On &
              zone_b_fan_command == Fan_Command.Off;

          // @trace PART-06 POL-02 CON-01 BEH-05
          case PART_06_BOTH_PREFER_B "When both zones are eligible and B is preferred, only the Zone B fan is on":
            assume zone_a_eligibility == Ventilation_Eligibility.Eligible &
              zone_b_eligibility == Ventilation_Eligibility.Eligible &
              preference == Contention_Preference.Prefer_B;
            guarantee zone_a_fan_command == Fan_Command.Off &
              zone_b_fan_command == Fan_Command.On;
    }*/
  }

  // @trace PART-07 CTRL-01 CTRL-02 CTRL-03 CTRL-04
  part def Boundary_Output_Delivery_i :> Thread {
    // @trace PART-07 INT-12 CTRL-01
    port zone_a_fan_command_in : DataPort { in :>> type : Fan_Command; }
    // @trace PART-07 INT-13 CTRL-02
    port zone_b_fan_command_in : DataPort { in :>> type : Fan_Command; }
    // @trace PART-07 INT-10 CTRL-03
    port zone_a_sensor_fault_in : DataPort { in :>> type : Sensor_Fault_Indication; }
    // @trace PART-07 INT-11 CTRL-04
    port zone_b_sensor_fault_in : DataPort { in :>> type : Sensor_Fault_Indication; }
    // @trace PART-07 CTRL-01 CTX-04
    port zone_a_fan_command_out : DataPort { out :>> type : Fan_Command; }
    // @trace PART-07 CTRL-02 CTX-05
    port zone_b_fan_command_out : DataPort { out :>> type : Fan_Command; }
    // @trace PART-07 CTRL-03 CTX-06
    port zone_a_sensor_fault_out : DataPort { out :>> type : Sensor_Fault_Indication; }
    // @trace PART-07 CTRL-04 CTX-06
    port zone_b_sensor_fault_out : DataPort { out :>> type : Sensor_Fault_Indication; }

    language "GUMBO" /*{
      compute
        // @trace PART-07 INT-12 CTRL-01
        guarantee PART_07_PRESERVE_A_FAN_COMMAND "Output delivery preserves the Zone A fan command":
          zone_a_fan_command_out == zone_a_fan_command_in;
        // @trace PART-07 INT-13 CTRL-02
        guarantee PART_07_PRESERVE_B_FAN_COMMAND "Output delivery preserves the Zone B fan command":
          zone_b_fan_command_out == zone_b_fan_command_in;
        // @trace PART-07 INT-10 CTRL-03
        guarantee PART_07_PRESERVE_A_SENSOR_FAULT "Output delivery preserves the Zone A sensor-fault indication":
          zone_a_sensor_fault_out == zone_a_sensor_fault_in;
        // @trace PART-07 INT-11 CTRL-04
        guarantee PART_07_PRESERVE_B_SENSOR_FAULT "Output delivery preserves the Zone B sensor-fault indication":
          zone_b_sensor_fault_out == zone_b_sensor_fault_in;
    }*/
  }

  // @generated-support legal HAMR containment and boundary routing for PART-01 through PART-07
  part def Control_Process_i :> Process {
    // @generated-support root boundary route for MON-01 CTX-01
    // @trace MON-01 CTX-01
    port zone_a_temperature : DataPort { in :>> type : Temperature_Celsius; }
    // @generated-support root boundary route for MON-01 CTX-01
    // @trace MON-01 CTX-01
    port zone_a_validity : DataPort { in :>> type : Sensor_Validity; }
    // @generated-support root boundary route for MON-02 CTX-02
    // @trace MON-02 CTX-02
    port zone_b_temperature : DataPort { in :>> type : Temperature_Celsius; }
    // @generated-support root boundary route for MON-02 CTX-02
    // @trace MON-02 CTX-02
    port zone_b_validity : DataPort { in :>> type : Sensor_Validity; }
    // @generated-support root boundary route for MON-03 CTX-03
    // @trace MON-03 CTX-03
    port upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    // @generated-support root boundary route for MON-04 CTX-03
    // @trace MON-04 CTX-03
    port preference : DataPort { in :>> type : Contention_Preference; }
    // @generated-support root boundary route for CTRL-01 CTX-04
    // @trace CTRL-01 CTX-04
    port zone_a_fan_command : DataPort { out :>> type : Fan_Command; }
    // @generated-support root boundary route for CTRL-02 CTX-05
    // @trace CTRL-02 CTX-05
    port zone_b_fan_command : DataPort { out :>> type : Fan_Command; }
    // @generated-support root boundary route for CTRL-03 CTX-06
    // @trace CTRL-03 CTX-06
    port zone_a_sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }
    // @generated-support root boundary route for CTRL-04 CTX-06
    // @trace CTRL-04 CTX-06
    port zone_b_sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }

    // @trace PART-01 MON-01
    part zone_a_sensor_intake : Zone_A_Sensor_Intake_i;
    // @trace PART-02 MON-02
    part zone_b_sensor_intake : Zone_B_Sensor_Intake_i;
    // @trace PART-03 MON-03 MON-04
    part operator_configuration_intake : Operator_Configuration_Intake_i;
    // @trace PART-04 POL-01
    part zone_a_local_decision : Zone_A_Local_Decision_i;
    // @trace PART-05 POL-01
    part zone_b_local_decision : Zone_B_Local_Decision_i;
    // @trace PART-06 POL-02 CON-01
    part shared_capacity_arbiter : Shared_Capacity_Arbiter_i;
    // @trace PART-07 CTRL-01 CTRL-02 CTRL-03 CTRL-04
    part boundary_output_delivery : Boundary_Output_Delivery_i;

    // @generated-support Process boundary route to PART-01 for MON-01
    // @trace MON-01 PART-01
    connection support_a_temperature_to_intake : PortConnection
      connect zone_a_temperature to zone_a_sensor_intake.temperature_in;
    // @generated-support Process boundary route to PART-01 for MON-01
    // @trace MON-01 PART-01
    connection support_a_validity_to_intake : PortConnection
      connect zone_a_validity to zone_a_sensor_intake.validity_in;
    // @generated-support Process boundary route to PART-02 for MON-02
    // @trace MON-02 PART-02
    connection support_b_temperature_to_intake : PortConnection
      connect zone_b_temperature to zone_b_sensor_intake.temperature_in;
    // @generated-support Process boundary route to PART-02 for MON-02
    // @trace MON-02 PART-02
    connection support_b_validity_to_intake : PortConnection
      connect zone_b_validity to zone_b_sensor_intake.validity_in;
    // @generated-support Process boundary route to PART-03 for MON-03
    // @trace MON-03 PART-03
    connection support_limit_to_configuration : PortConnection
      connect upper_limit to operator_configuration_intake.upper_limit_in;
    // @generated-support Process boundary route to PART-03 for MON-04
    // @trace MON-04 PART-03
    connection support_preference_to_configuration : PortConnection
      connect preference to operator_configuration_intake.preference_in;

    // @trace INT-01 PART-01 PART-04 MON-01 POL-01
    connection int_01_a_temperature : PortConnection
      connect zone_a_sensor_intake.temperature_out to zone_a_local_decision.temperature;
    // @trace INT-02 PART-01 PART-04 MON-01 POL-01
    connection int_02_a_validity : PortConnection
      connect zone_a_sensor_intake.validity_out to zone_a_local_decision.validity;
    // @trace INT-03 PART-02 PART-05 MON-02 POL-01
    connection int_03_b_temperature : PortConnection
      connect zone_b_sensor_intake.temperature_out to zone_b_local_decision.temperature;
    // @trace INT-04 PART-02 PART-05 MON-02 POL-01
    connection int_04_b_validity : PortConnection
      connect zone_b_sensor_intake.validity_out to zone_b_local_decision.validity;
    // @trace INT-05 PART-03 PART-04 MON-03 POL-01
    connection int_05_limit_to_a : PortConnection
      connect operator_configuration_intake.upper_limit_for_a to zone_a_local_decision.upper_limit;
    // @trace INT-06 PART-03 PART-05 MON-03 POL-01
    connection int_06_limit_to_b : PortConnection
      connect operator_configuration_intake.upper_limit_for_b to zone_b_local_decision.upper_limit;
    // @trace INT-07 PART-03 PART-06 MON-04 POL-02
    connection int_07_preference_to_arbiter : PortConnection
      connect operator_configuration_intake.preference_out to shared_capacity_arbiter.preference;
    // @trace INT-08 PART-04 PART-06 POL-01 POL-02
    connection int_08_a_eligibility : PortConnection
      connect zone_a_local_decision.eligibility to shared_capacity_arbiter.zone_a_eligibility;
    // @trace INT-09 PART-05 PART-06 POL-01 POL-02
    connection int_09_b_eligibility : PortConnection
      connect zone_b_local_decision.eligibility to shared_capacity_arbiter.zone_b_eligibility;
    // @trace INT-10 PART-04 PART-07 CTRL-03
    connection int_10_a_fault : PortConnection
      connect zone_a_local_decision.sensor_fault to boundary_output_delivery.zone_a_sensor_fault_in;
    // @trace INT-11 PART-05 PART-07 CTRL-04
    connection int_11_b_fault : PortConnection
      connect zone_b_local_decision.sensor_fault to boundary_output_delivery.zone_b_sensor_fault_in;
    // @trace INT-12 PART-06 PART-07 CTRL-01 CON-01
    connection int_12_a_fan_command : PortConnection
      connect shared_capacity_arbiter.zone_a_fan_command to boundary_output_delivery.zone_a_fan_command_in;
    // @trace INT-13 PART-06 PART-07 CTRL-02 CON-01
    connection int_13_b_fan_command : PortConnection
      connect shared_capacity_arbiter.zone_b_fan_command to boundary_output_delivery.zone_b_fan_command_in;

    // @generated-support Process boundary route from PART-07 for CTRL-01
    // @trace PART-07 CTRL-01 CTX-04
    connection support_a_fan_to_boundary : PortConnection
      connect boundary_output_delivery.zone_a_fan_command_out to zone_a_fan_command;
    // @generated-support Process boundary route from PART-07 for CTRL-02
    // @trace PART-07 CTRL-02 CTX-05
    connection support_b_fan_to_boundary : PortConnection
      connect boundary_output_delivery.zone_b_fan_command_out to zone_b_fan_command;
    // @generated-support Process boundary route from PART-07 for CTRL-03
    // @trace PART-07 CTRL-03 CTX-06
    connection support_a_fault_to_boundary : PortConnection
      connect boundary_output_delivery.zone_a_sensor_fault_out to zone_a_sensor_fault;
    // @generated-support Process boundary route from PART-07 for CTRL-04
    // @trace PART-07 CTRL-04 CTX-06
    connection support_b_fault_to_boundary : PortConnection
      connect boundary_output_delivery.zone_b_sensor_fault_out to zone_b_sensor_fault;
  }

  // @trace GOAL-01 GOAL-02 GOAL-03 CTX-01 CTX-02 CTX-03 CTX-04 CTX-05 CTX-06
  part def Dual_Zone_Greenhouse_Root :> System {
    // @trace MON-01 CTX-01 ASM-01
    port zone_a_temperature : DataPort { in :>> type : Temperature_Celsius; }
    // @trace MON-01 CTX-01 ASM-01
    port zone_a_validity : DataPort { in :>> type : Sensor_Validity; }
    // @trace MON-02 CTX-02 ASM-02
    port zone_b_temperature : DataPort { in :>> type : Temperature_Celsius; }
    // @trace MON-02 CTX-02 ASM-02
    port zone_b_validity : DataPort { in :>> type : Sensor_Validity; }
    // @trace MON-03 CTX-03 ASM-03
    port upper_limit : DataPort { in :>> type : Upper_Temperature_Limit; }
    // @trace MON-04 CTX-03 ASM-04
    port preference : DataPort { in :>> type : Contention_Preference; }
    // @trace CTRL-01 CTX-04 GOAL-02
    port zone_a_fan_command : DataPort { out :>> type : Fan_Command; }
    // @trace CTRL-02 CTX-05 GOAL-02
    port zone_b_fan_command : DataPort { out :>> type : Fan_Command; }
    // @trace CTRL-03 CTX-06 GOAL-03
    port zone_a_sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }
    // @trace CTRL-04 CTX-06 GOAL-03
    port zone_b_sensor_fault : DataPort { out :>> type : Sensor_Fault_Indication; }

    // @generated-support legal HAMR containment and boundary routing for PART-01 through PART-07
    part control_process : Control_Process_i;

    // @generated-support root-to-Process route for MON-01 CTX-01
    // @trace MON-01 CTX-01
    connection boundary_a_temperature : PortConnection
      connect zone_a_temperature to control_process.zone_a_temperature;
    // @generated-support root-to-Process route for MON-01 CTX-01
    // @trace MON-01 CTX-01
    connection boundary_a_validity : PortConnection
      connect zone_a_validity to control_process.zone_a_validity;
    // @generated-support root-to-Process route for MON-02 CTX-02
    // @trace MON-02 CTX-02
    connection boundary_b_temperature : PortConnection
      connect zone_b_temperature to control_process.zone_b_temperature;
    // @generated-support root-to-Process route for MON-02 CTX-02
    // @trace MON-02 CTX-02
    connection boundary_b_validity : PortConnection
      connect zone_b_validity to control_process.zone_b_validity;
    // @generated-support root-to-Process route for MON-03 CTX-03
    // @trace MON-03 CTX-03
    connection boundary_upper_limit : PortConnection
      connect upper_limit to control_process.upper_limit;
    // @generated-support root-to-Process route for MON-04 CTX-03
    // @trace MON-04 CTX-03
    connection boundary_preference : PortConnection
      connect preference to control_process.preference;
    // @generated-support Process-to-root route for CTRL-01 CTX-04
    // @trace CTRL-01 CTX-04
    connection boundary_a_fan_command : PortConnection
      connect control_process.zone_a_fan_command to zone_a_fan_command;
    // @generated-support Process-to-root route for CTRL-02 CTX-05
    // @trace CTRL-02 CTX-05
    connection boundary_b_fan_command : PortConnection
      connect control_process.zone_b_fan_command to zone_b_fan_command;
    // @generated-support Process-to-root route for CTRL-03 CTX-06
    // @trace CTRL-03 CTX-06
    connection boundary_a_sensor_fault : PortConnection
      connect control_process.zone_a_sensor_fault to zone_a_sensor_fault;
    // @generated-support Process-to-root route for CTRL-04 CTX-06
    // @trace CTRL-04 CTX-06
    connection boundary_b_sensor_fault : PortConnection
      connect control_process.zone_b_sensor_fault to zone_b_sensor_fault;
  }

  // @trace GOAL-01 GOAL-02 GOAL-03
  part dual_zone_greenhouse : Dual_Zone_Greenhouse_Root;
}
