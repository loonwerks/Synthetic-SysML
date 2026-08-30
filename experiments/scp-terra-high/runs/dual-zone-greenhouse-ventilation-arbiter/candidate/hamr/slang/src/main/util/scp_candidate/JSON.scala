// #Sireum
// @formatter:off

// This file is auto-generated from Sensor_Validity.scala, Contention_Preference.scala, Ventilation_Eligibility.scala, Sensor_Fault_Indication.scala, Fan_Command.scala, Temperature_Celsius.scala, Upper_Temperature_Limit.scala, Base_Types.scala, Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_Containers.scala, Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_Containers.scala, Operator_Configuration_Intake_i_control_process_operator_configuration_intake_Containers.scala, Zone_A_Local_Decision_i_control_process_zone_a_local_decision_Containers.scala, Zone_B_Local_Decision_i_control_process_zone_b_local_decision_Containers.scala, Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_Containers.scala, Boundary_Output_Delivery_i_control_process_boundary_output_delivery_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printDual_Zone_GreenhouseSensor_ValidityType(o: Dual_Zone_Greenhouse.Sensor_Validity.Type): ST = {
      val value: String = o match {
        case Dual_Zone_Greenhouse.Sensor_Validity.Valid => "Valid"
        case Dual_Zone_Greenhouse.Sensor_Validity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Dual_Zone_Greenhouse.Sensor_Validity")),
        ("value", printString(value))
      ))
    }

    @pure def printDual_Zone_GreenhouseSensor_Validity_Payload(o: Dual_Zone_Greenhouse.Sensor_Validity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Sensor_Validity_Payload""""),
        ("value", printDual_Zone_GreenhouseSensor_ValidityType(o.value))
      ))
    }

    @pure def printDual_Zone_GreenhouseContention_PreferenceType(o: Dual_Zone_Greenhouse.Contention_Preference.Type): ST = {
      val value: String = o match {
        case Dual_Zone_Greenhouse.Contention_Preference.Prefer_A => "Prefer_A"
        case Dual_Zone_Greenhouse.Contention_Preference.Prefer_B => "Prefer_B"
      }
      return printObject(ISZ(
        ("type", printString("Dual_Zone_Greenhouse.Contention_Preference")),
        ("value", printString(value))
      ))
    }

    @pure def printDual_Zone_GreenhouseContention_Preference_Payload(o: Dual_Zone_Greenhouse.Contention_Preference_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Contention_Preference_Payload""""),
        ("value", printDual_Zone_GreenhouseContention_PreferenceType(o.value))
      ))
    }

    @pure def printDual_Zone_GreenhouseVentilation_EligibilityType(o: Dual_Zone_Greenhouse.Ventilation_Eligibility.Type): ST = {
      val value: String = o match {
        case Dual_Zone_Greenhouse.Ventilation_Eligibility.Eligible => "Eligible"
        case Dual_Zone_Greenhouse.Ventilation_Eligibility.Ineligible => "Ineligible"
      }
      return printObject(ISZ(
        ("type", printString("Dual_Zone_Greenhouse.Ventilation_Eligibility")),
        ("value", printString(value))
      ))
    }

    @pure def printDual_Zone_GreenhouseVentilation_Eligibility_Payload(o: Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload""""),
        ("value", printDual_Zone_GreenhouseVentilation_EligibilityType(o.value))
      ))
    }

    @pure def printDual_Zone_GreenhouseSensor_Fault_IndicationType(o: Dual_Zone_Greenhouse.Sensor_Fault_Indication.Type): ST = {
      val value: String = o match {
        case Dual_Zone_Greenhouse.Sensor_Fault_Indication.Clear => "Clear"
        case Dual_Zone_Greenhouse.Sensor_Fault_Indication.Asserted => "Asserted"
      }
      return printObject(ISZ(
        ("type", printString("Dual_Zone_Greenhouse.Sensor_Fault_Indication")),
        ("value", printString(value))
      ))
    }

    @pure def printDual_Zone_GreenhouseSensor_Fault_Indication_Payload(o: Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload""""),
        ("value", printDual_Zone_GreenhouseSensor_Fault_IndicationType(o.value))
      ))
    }

    @pure def printDual_Zone_GreenhouseFan_CommandType(o: Dual_Zone_Greenhouse.Fan_Command.Type): ST = {
      val value: String = o match {
        case Dual_Zone_Greenhouse.Fan_Command.On => "On"
        case Dual_Zone_Greenhouse.Fan_Command.Off => "Off"
      }
      return printObject(ISZ(
        ("type", printString("Dual_Zone_Greenhouse.Fan_Command")),
        ("value", printString(value))
      ))
    }

    @pure def printDual_Zone_GreenhouseFan_Command_Payload(o: Dual_Zone_Greenhouse.Fan_Command_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Fan_Command_Payload""""),
        ("value", printDual_Zone_GreenhouseFan_CommandType(o.value))
      ))
    }

    @pure def printDual_Zone_GreenhouseTemperature_Celsius(o: Dual_Zone_Greenhouse.Temperature_Celsius): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Temperature_Celsius""""),
        ("degrees_celsius", printS32(o.degrees_celsius))
      ))
    }

    @pure def printDual_Zone_GreenhouseTemperature_Celsius_Payload(o: Dual_Zone_Greenhouse.Temperature_Celsius_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Temperature_Celsius_Payload""""),
        ("value", printDual_Zone_GreenhouseTemperature_Celsius(o.value))
      ))
    }

    @pure def printDual_Zone_GreenhouseUpper_Temperature_Limit(o: Dual_Zone_Greenhouse.Upper_Temperature_Limit): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Upper_Temperature_Limit""""),
        ("degrees_celsius", printS32(o.degrees_celsius))
      ))
    }

    @pure def printDual_Zone_GreenhouseUpper_Temperature_Limit_Payload(o: Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload""""),
        ("value", printDual_Zone_GreenhouseUpper_Temperature_Limit(o.value))
      ))
    }

    @pure def printBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Boolean_Payload""""),
        ("value", printB(o.value))
      ))
    }

    @pure def printBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_Payload""""),
        ("value", printZ(o.value))
      ))
    }

    @pure def printBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_8_Payload""""),
        ("value", printS8(o.value))
      ))
    }

    @pure def printBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_16_Payload""""),
        ("value", printS16(o.value))
      ))
    }

    @pure def printBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_32_Payload""""),
        ("value", printS32(o.value))
      ))
    }

    @pure def printBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_64_Payload""""),
        ("value", printS64(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_8_Payload""""),
        ("value", printU8(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_16_Payload""""),
        ("value", printU16(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_32_Payload""""),
        ("value", printU32(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_64_Payload""""),
        ("value", printU64(o.value))
      ))
    }

    @pure def printBase_TypesFloat_Payload(o: Base_Types.Float_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_Payload""""),
        ("value", printR(o.value))
      ))
    }

    @pure def printBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_32_Payload""""),
        ("value", printF32(o.value))
      ))
    }

    @pure def printBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_64_Payload""""),
        ("value", printF64(o.value))
      ))
    }

    @pure def printBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Character_Payload""""),
        ("value", printC(o.value))
      ))
    }

    @pure def printBase_TypesString_Payload(o: Base_Types.String_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.String_Payload""""),
        ("value", printString(o.value))
      ))
    }

    @pure def printBase_TypesBits_Payload(o: Base_Types.Bits_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Bits_Payload""""),
        ("value", printISZ(T, o.value, printB _))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container): ST = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P => return printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS => return printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(o)
      }
    }

    @pure def printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P""""),
        ("api_temperature_in", printDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_in)),
        ("api_validity_in", printDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_in))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS""""),
        ("api_temperature_in", printDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_in)),
        ("api_validity_in", printDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_in))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container): ST = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P => return printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS => return printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(o)
      }
    }

    @pure def printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P""""),
        ("api_temperature_out", printDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_out)),
        ("api_validity_out", printDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_out))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS""""),
        ("api_temperature_out", printDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_out)),
        ("api_validity_out", printDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_out))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container): ST = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P => return printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS => return printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(o)
      }
    }

    @pure def printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P""""),
        ("api_temperature_in", printDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_in)),
        ("api_validity_in", printDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_in))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS""""),
        ("api_temperature_in", printDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_in)),
        ("api_validity_in", printDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_in))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container): ST = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P => return printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS => return printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(o)
      }
    }

    @pure def printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P""""),
        ("api_temperature_out", printDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_out)),
        ("api_validity_out", printDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_out))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS""""),
        ("api_temperature_out", printDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_out)),
        ("api_validity_out", printDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_out))
      ))
    }

    @pure def printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container): ST = {
      o match {
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P => return printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS => return printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(o)
      }
    }

    @pure def printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P""""),
        ("api_preference_in", printDual_Zone_GreenhouseContention_PreferenceType(o.api_preference_in)),
        ("api_upper_limit_in", printDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit_in))
      ))
    }

    @pure def printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS""""),
        ("api_preference_in", printDual_Zone_GreenhouseContention_PreferenceType(o.api_preference_in)),
        ("api_upper_limit_in", printDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit_in))
      ))
    }

    @pure def printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container): ST = {
      o match {
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P => return printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS => return printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(o)
      }
    }

    @pure def printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P""""),
        ("api_preference_out", printDual_Zone_GreenhouseContention_PreferenceType(o.api_preference_out)),
        ("api_upper_limit_for_a", printDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit_for_a)),
        ("api_upper_limit_for_b", printDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit_for_b))
      ))
    }

    @pure def printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS""""),
        ("api_preference_out", printDual_Zone_GreenhouseContention_PreferenceType(o.api_preference_out)),
        ("api_upper_limit_for_a", printDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit_for_a)),
        ("api_upper_limit_for_b", printDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit_for_b))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container): ST = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P => return printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS => return printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(o)
      }
    }

    @pure def printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P""""),
        ("api_temperature", printDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature)),
        ("api_upper_limit", printDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit)),
        ("api_validity", printDual_Zone_GreenhouseSensor_ValidityType(o.api_validity))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS""""),
        ("api_temperature", printDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature)),
        ("api_upper_limit", printDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit)),
        ("api_validity", printDual_Zone_GreenhouseSensor_ValidityType(o.api_validity))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container): ST = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P => return printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS => return printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(o)
      }
    }

    @pure def printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P""""),
        ("api_eligibility", printDual_Zone_GreenhouseVentilation_EligibilityType(o.api_eligibility)),
        ("api_sensor_fault", printDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_sensor_fault))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS""""),
        ("api_eligibility", printDual_Zone_GreenhouseVentilation_EligibilityType(o.api_eligibility)),
        ("api_sensor_fault", printDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_sensor_fault))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container): ST = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P => return printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS => return printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(o)
      }
    }

    @pure def printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P""""),
        ("api_temperature", printDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature)),
        ("api_upper_limit", printDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit)),
        ("api_validity", printDual_Zone_GreenhouseSensor_ValidityType(o.api_validity))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS""""),
        ("api_temperature", printDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature)),
        ("api_upper_limit", printDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit)),
        ("api_validity", printDual_Zone_GreenhouseSensor_ValidityType(o.api_validity))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container): ST = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P => return printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS => return printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(o)
      }
    }

    @pure def printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P""""),
        ("api_eligibility", printDual_Zone_GreenhouseVentilation_EligibilityType(o.api_eligibility)),
        ("api_sensor_fault", printDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_sensor_fault))
      ))
    }

    @pure def printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS""""),
        ("api_eligibility", printDual_Zone_GreenhouseVentilation_EligibilityType(o.api_eligibility)),
        ("api_sensor_fault", printDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_sensor_fault))
      ))
    }

    @pure def printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container): ST = {
      o match {
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P => return printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS => return printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(o)
      }
    }

    @pure def printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P""""),
        ("api_preference", printDual_Zone_GreenhouseContention_PreferenceType(o.api_preference)),
        ("api_zone_a_eligibility", printDual_Zone_GreenhouseVentilation_EligibilityType(o.api_zone_a_eligibility)),
        ("api_zone_b_eligibility", printDual_Zone_GreenhouseVentilation_EligibilityType(o.api_zone_b_eligibility))
      ))
    }

    @pure def printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS""""),
        ("api_preference", printDual_Zone_GreenhouseContention_PreferenceType(o.api_preference)),
        ("api_zone_a_eligibility", printDual_Zone_GreenhouseVentilation_EligibilityType(o.api_zone_a_eligibility)),
        ("api_zone_b_eligibility", printDual_Zone_GreenhouseVentilation_EligibilityType(o.api_zone_b_eligibility))
      ))
    }

    @pure def printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container): ST = {
      o match {
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P => return printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS => return printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(o)
      }
    }

    @pure def printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P""""),
        ("api_zone_a_fan_command", printDual_Zone_GreenhouseFan_CommandType(o.api_zone_a_fan_command)),
        ("api_zone_b_fan_command", printDual_Zone_GreenhouseFan_CommandType(o.api_zone_b_fan_command))
      ))
    }

    @pure def printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS""""),
        ("api_zone_a_fan_command", printDual_Zone_GreenhouseFan_CommandType(o.api_zone_a_fan_command)),
        ("api_zone_b_fan_command", printDual_Zone_GreenhouseFan_CommandType(o.api_zone_b_fan_command))
      ))
    }

    @pure def printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container): ST = {
      o match {
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P => return printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS => return printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(o)
      }
    }

    @pure def printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P""""),
        ("api_zone_a_fan_command_in", printDual_Zone_GreenhouseFan_CommandType(o.api_zone_a_fan_command_in)),
        ("api_zone_a_sensor_fault_in", printDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_a_sensor_fault_in)),
        ("api_zone_b_fan_command_in", printDual_Zone_GreenhouseFan_CommandType(o.api_zone_b_fan_command_in)),
        ("api_zone_b_sensor_fault_in", printDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_b_sensor_fault_in))
      ))
    }

    @pure def printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS""""),
        ("api_zone_a_fan_command_in", printDual_Zone_GreenhouseFan_CommandType(o.api_zone_a_fan_command_in)),
        ("api_zone_a_sensor_fault_in", printDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_a_sensor_fault_in)),
        ("api_zone_b_fan_command_in", printDual_Zone_GreenhouseFan_CommandType(o.api_zone_b_fan_command_in)),
        ("api_zone_b_sensor_fault_in", printDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_b_sensor_fault_in))
      ))
    }

    @pure def printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container): ST = {
      o match {
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P => return printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS => return printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(o)
      }
    }

    @pure def printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P""""),
        ("api_zone_a_fan_command_out", printDual_Zone_GreenhouseFan_CommandType(o.api_zone_a_fan_command_out)),
        ("api_zone_a_sensor_fault_out", printDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_a_sensor_fault_out)),
        ("api_zone_b_fan_command_out", printDual_Zone_GreenhouseFan_CommandType(o.api_zone_b_fan_command_out)),
        ("api_zone_b_sensor_fault_out", printDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_b_sensor_fault_out))
      ))
    }

    @pure def printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS""""),
        ("api_zone_a_fan_command_out", printDual_Zone_GreenhouseFan_CommandType(o.api_zone_a_fan_command_out)),
        ("api_zone_a_sensor_fault_out", printDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_a_sensor_fault_out)),
        ("api_zone_b_fan_command_out", printDual_Zone_GreenhouseFan_CommandType(o.api_zone_b_fan_command_out)),
        ("api_zone_b_sensor_fault_out", printDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_b_sensor_fault_out))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_zone_a_sensor_intake_postInit => "Dual_Zone_Greenhouse_Root_Instance_control_process_zone_a_sensor_intake_postInit"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_zone_a_sensor_intake_preCompute => "Dual_Zone_Greenhouse_Root_Instance_control_process_zone_a_sensor_intake_preCompute"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_zone_a_sensor_intake_postCompute => "Dual_Zone_Greenhouse_Root_Instance_control_process_zone_a_sensor_intake_postCompute"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_zone_b_sensor_intake_postInit => "Dual_Zone_Greenhouse_Root_Instance_control_process_zone_b_sensor_intake_postInit"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_zone_b_sensor_intake_preCompute => "Dual_Zone_Greenhouse_Root_Instance_control_process_zone_b_sensor_intake_preCompute"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_zone_b_sensor_intake_postCompute => "Dual_Zone_Greenhouse_Root_Instance_control_process_zone_b_sensor_intake_postCompute"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_operator_configuration_intake_postInit => "Dual_Zone_Greenhouse_Root_Instance_control_process_operator_configuration_intake_postInit"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_operator_configuration_intake_preCompute => "Dual_Zone_Greenhouse_Root_Instance_control_process_operator_configuration_intake_preCompute"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_operator_configuration_intake_postCompute => "Dual_Zone_Greenhouse_Root_Instance_control_process_operator_configuration_intake_postCompute"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_zone_a_local_decision_postInit => "Dual_Zone_Greenhouse_Root_Instance_control_process_zone_a_local_decision_postInit"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_zone_a_local_decision_preCompute => "Dual_Zone_Greenhouse_Root_Instance_control_process_zone_a_local_decision_preCompute"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_zone_a_local_decision_postCompute => "Dual_Zone_Greenhouse_Root_Instance_control_process_zone_a_local_decision_postCompute"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_zone_b_local_decision_postInit => "Dual_Zone_Greenhouse_Root_Instance_control_process_zone_b_local_decision_postInit"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_zone_b_local_decision_preCompute => "Dual_Zone_Greenhouse_Root_Instance_control_process_zone_b_local_decision_preCompute"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_zone_b_local_decision_postCompute => "Dual_Zone_Greenhouse_Root_Instance_control_process_zone_b_local_decision_postCompute"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_shared_capacity_arbiter_postInit => "Dual_Zone_Greenhouse_Root_Instance_control_process_shared_capacity_arbiter_postInit"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_shared_capacity_arbiter_preCompute => "Dual_Zone_Greenhouse_Root_Instance_control_process_shared_capacity_arbiter_preCompute"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_shared_capacity_arbiter_postCompute => "Dual_Zone_Greenhouse_Root_Instance_control_process_shared_capacity_arbiter_postCompute"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_boundary_output_delivery_postInit => "Dual_Zone_Greenhouse_Root_Instance_control_process_boundary_output_delivery_postInit"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_boundary_output_delivery_preCompute => "Dual_Zone_Greenhouse_Root_Instance_control_process_boundary_output_delivery_preCompute"
        case runtimemonitor.ObservationKind.Dual_Zone_Greenhouse_Root_Instance_control_process_boundary_output_delivery_postCompute => "Dual_Zone_Greenhouse_Root_Instance_control_process_boundary_output_delivery_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P => return printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P => return printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS => return printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS => return printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P => return printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P => return printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS => return printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS => return printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P => return printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P => return printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS => return printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS => return printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P => return printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P => return printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS => return printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS => return printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P => return printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS => return printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P => return printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS => return printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P => return printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS => return printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P => return printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS => return printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P => return printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS => return printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P => return printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS => return printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(o)
      }
    }

    @pure def printutilEmptyContainer(o: util.EmptyContainer): ST = {
      return printObject(ISZ(
        ("type", st""""util.EmptyContainer"""")
      ))
    }

    @pure def print_artDataContent(o: art.DataContent): ST = {
      o match {
        case o: art.Empty => return print_artEmpty(o)
        case o: Base_Types.Boolean_Payload => return printBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => return printBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => return printBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => return printBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => return printBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => return printBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => return printBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => return printBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => return printBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => return printBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => return printBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => return printBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => return printBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => return printBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => return printBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => return printBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Dual_Zone_Greenhouse.Fan_Command_Payload => return printDual_Zone_GreenhouseFan_Command_Payload(o)
        case o: Dual_Zone_Greenhouse.Sensor_Validity_Payload => return printDual_Zone_GreenhouseSensor_Validity_Payload(o)
        case o: Dual_Zone_Greenhouse.Temperature_Celsius_Payload => return printDual_Zone_GreenhouseTemperature_Celsius_Payload(o)
        case o: Dual_Zone_Greenhouse.Contention_Preference_Payload => return printDual_Zone_GreenhouseContention_Preference_Payload(o)
        case o: Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload => return printDual_Zone_GreenhouseSensor_Fault_Indication_Payload(o)
        case o: Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload => return printDual_Zone_GreenhouseVentilation_Eligibility_Payload(o)
        case o: Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload => return printDual_Zone_GreenhouseUpper_Temperature_Limit_Payload(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P => return printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P => return printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS => return printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS => return printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P => return printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P => return printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS => return printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS => return printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P => return printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P => return printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS => return printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS => return printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P => return printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P => return printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS => return printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS => return printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P => return printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS => return printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P => return printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS => return printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P => return printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS => return printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P => return printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS => return printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P => return printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS => return printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P => return printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS => return printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(o)
      }
    }

    @pure def print_artEmpty(o: art.Empty): ST = {
      return printObject(ISZ(
        ("type", st""""art.Empty"""")
      ))
    }

  }

  @record class Parser(val input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parseDual_Zone_GreenhouseSensor_ValidityType(): Dual_Zone_Greenhouse.Sensor_Validity.Type = {
      val r = parseDual_Zone_GreenhouseSensor_ValidityT(F)
      return r
    }

    def parseDual_Zone_GreenhouseSensor_ValidityT(typeParsed: B): Dual_Zone_Greenhouse.Sensor_Validity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Sensor_Validity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Dual_Zone_Greenhouse.Sensor_Validity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Dual_Zone_Greenhouse.Sensor_Validity.")
          return Dual_Zone_Greenhouse.Sensor_Validity.byOrdinal(0).get
      }
    }

    def parseDual_Zone_GreenhouseSensor_Validity_Payload(): Dual_Zone_Greenhouse.Sensor_Validity_Payload = {
      val r = parseDual_Zone_GreenhouseSensor_Validity_PayloadT(F)
      return r
    }

    def parseDual_Zone_GreenhouseSensor_Validity_PayloadT(typeParsed: B): Dual_Zone_Greenhouse.Sensor_Validity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Sensor_Validity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDual_Zone_GreenhouseSensor_ValidityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Sensor_Validity_Payload(value)
    }

    def parseDual_Zone_GreenhouseContention_PreferenceType(): Dual_Zone_Greenhouse.Contention_Preference.Type = {
      val r = parseDual_Zone_GreenhouseContention_PreferenceT(F)
      return r
    }

    def parseDual_Zone_GreenhouseContention_PreferenceT(typeParsed: B): Dual_Zone_Greenhouse.Contention_Preference.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Contention_Preference")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Dual_Zone_Greenhouse.Contention_Preference.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Dual_Zone_Greenhouse.Contention_Preference.")
          return Dual_Zone_Greenhouse.Contention_Preference.byOrdinal(0).get
      }
    }

    def parseDual_Zone_GreenhouseContention_Preference_Payload(): Dual_Zone_Greenhouse.Contention_Preference_Payload = {
      val r = parseDual_Zone_GreenhouseContention_Preference_PayloadT(F)
      return r
    }

    def parseDual_Zone_GreenhouseContention_Preference_PayloadT(typeParsed: B): Dual_Zone_Greenhouse.Contention_Preference_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Contention_Preference_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDual_Zone_GreenhouseContention_PreferenceType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Contention_Preference_Payload(value)
    }

    def parseDual_Zone_GreenhouseVentilation_EligibilityType(): Dual_Zone_Greenhouse.Ventilation_Eligibility.Type = {
      val r = parseDual_Zone_GreenhouseVentilation_EligibilityT(F)
      return r
    }

    def parseDual_Zone_GreenhouseVentilation_EligibilityT(typeParsed: B): Dual_Zone_Greenhouse.Ventilation_Eligibility.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Ventilation_Eligibility")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Dual_Zone_Greenhouse.Ventilation_Eligibility.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Dual_Zone_Greenhouse.Ventilation_Eligibility.")
          return Dual_Zone_Greenhouse.Ventilation_Eligibility.byOrdinal(0).get
      }
    }

    def parseDual_Zone_GreenhouseVentilation_Eligibility_Payload(): Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload = {
      val r = parseDual_Zone_GreenhouseVentilation_Eligibility_PayloadT(F)
      return r
    }

    def parseDual_Zone_GreenhouseVentilation_Eligibility_PayloadT(typeParsed: B): Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDual_Zone_GreenhouseVentilation_EligibilityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload(value)
    }

    def parseDual_Zone_GreenhouseSensor_Fault_IndicationType(): Dual_Zone_Greenhouse.Sensor_Fault_Indication.Type = {
      val r = parseDual_Zone_GreenhouseSensor_Fault_IndicationT(F)
      return r
    }

    def parseDual_Zone_GreenhouseSensor_Fault_IndicationT(typeParsed: B): Dual_Zone_Greenhouse.Sensor_Fault_Indication.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Sensor_Fault_Indication")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Dual_Zone_Greenhouse.Sensor_Fault_Indication.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Dual_Zone_Greenhouse.Sensor_Fault_Indication.")
          return Dual_Zone_Greenhouse.Sensor_Fault_Indication.byOrdinal(0).get
      }
    }

    def parseDual_Zone_GreenhouseSensor_Fault_Indication_Payload(): Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload = {
      val r = parseDual_Zone_GreenhouseSensor_Fault_Indication_PayloadT(F)
      return r
    }

    def parseDual_Zone_GreenhouseSensor_Fault_Indication_PayloadT(typeParsed: B): Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDual_Zone_GreenhouseSensor_Fault_IndicationType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload(value)
    }

    def parseDual_Zone_GreenhouseFan_CommandType(): Dual_Zone_Greenhouse.Fan_Command.Type = {
      val r = parseDual_Zone_GreenhouseFan_CommandT(F)
      return r
    }

    def parseDual_Zone_GreenhouseFan_CommandT(typeParsed: B): Dual_Zone_Greenhouse.Fan_Command.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Fan_Command")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Dual_Zone_Greenhouse.Fan_Command.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Dual_Zone_Greenhouse.Fan_Command.")
          return Dual_Zone_Greenhouse.Fan_Command.byOrdinal(0).get
      }
    }

    def parseDual_Zone_GreenhouseFan_Command_Payload(): Dual_Zone_Greenhouse.Fan_Command_Payload = {
      val r = parseDual_Zone_GreenhouseFan_Command_PayloadT(F)
      return r
    }

    def parseDual_Zone_GreenhouseFan_Command_PayloadT(typeParsed: B): Dual_Zone_Greenhouse.Fan_Command_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Fan_Command_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDual_Zone_GreenhouseFan_CommandType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Fan_Command_Payload(value)
    }

    def parseDual_Zone_GreenhouseTemperature_Celsius(): Dual_Zone_Greenhouse.Temperature_Celsius = {
      val r = parseDual_Zone_GreenhouseTemperature_CelsiusT(F)
      return r
    }

    def parseDual_Zone_GreenhouseTemperature_CelsiusT(typeParsed: B): Dual_Zone_Greenhouse.Temperature_Celsius = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Temperature_Celsius")
      }
      parser.parseObjectKey("degrees_celsius")
      val degrees_celsius = parser.parseS32()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Temperature_Celsius(degrees_celsius)
    }

    def parseDual_Zone_GreenhouseTemperature_Celsius_Payload(): Dual_Zone_Greenhouse.Temperature_Celsius_Payload = {
      val r = parseDual_Zone_GreenhouseTemperature_Celsius_PayloadT(F)
      return r
    }

    def parseDual_Zone_GreenhouseTemperature_Celsius_PayloadT(typeParsed: B): Dual_Zone_Greenhouse.Temperature_Celsius_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Temperature_Celsius_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDual_Zone_GreenhouseTemperature_Celsius()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Temperature_Celsius_Payload(value)
    }

    def parseDual_Zone_GreenhouseUpper_Temperature_Limit(): Dual_Zone_Greenhouse.Upper_Temperature_Limit = {
      val r = parseDual_Zone_GreenhouseUpper_Temperature_LimitT(F)
      return r
    }

    def parseDual_Zone_GreenhouseUpper_Temperature_LimitT(typeParsed: B): Dual_Zone_Greenhouse.Upper_Temperature_Limit = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Upper_Temperature_Limit")
      }
      parser.parseObjectKey("degrees_celsius")
      val degrees_celsius = parser.parseS32()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Upper_Temperature_Limit(degrees_celsius)
    }

    def parseDual_Zone_GreenhouseUpper_Temperature_Limit_Payload(): Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload = {
      val r = parseDual_Zone_GreenhouseUpper_Temperature_Limit_PayloadT(F)
      return r
    }

    def parseDual_Zone_GreenhouseUpper_Temperature_Limit_PayloadT(typeParsed: B): Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDual_Zone_GreenhouseUpper_Temperature_Limit()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload(value)
    }

    def parseBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = parseBase_TypesBoolean_PayloadT(F)
      return r
    }

    def parseBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Boolean_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseB()
      parser.parseObjectNext()
      return Base_Types.Boolean_Payload(value)
    }

    def parseBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = parseBase_TypesInteger_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseZ()
      parser.parseObjectNext()
      return Base_Types.Integer_Payload(value)
    }

    def parseBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = parseBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS8()
      parser.parseObjectNext()
      return Base_Types.Integer_8_Payload(value)
    }

    def parseBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = parseBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS16()
      parser.parseObjectNext()
      return Base_Types.Integer_16_Payload(value)
    }

    def parseBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = parseBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS32()
      parser.parseObjectNext()
      return Base_Types.Integer_32_Payload(value)
    }

    def parseBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = parseBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS64()
      parser.parseObjectNext()
      return Base_Types.Integer_64_Payload(value)
    }

    def parseBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = parseBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU8()
      parser.parseObjectNext()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def parseBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = parseBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU16()
      parser.parseObjectNext()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def parseBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = parseBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU32()
      parser.parseObjectNext()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def parseBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = parseBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU64()
      parser.parseObjectNext()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def parseBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = parseBase_TypesFloat_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseR()
      parser.parseObjectNext()
      return Base_Types.Float_Payload(value)
    }

    def parseBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = parseBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      return Base_Types.Float_32_Payload(value)
    }

    def parseBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = parseBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF64()
      parser.parseObjectNext()
      return Base_Types.Float_64_Payload(value)
    }

    def parseBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = parseBase_TypesCharacter_PayloadT(F)
      return r
    }

    def parseBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Character_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseC()
      parser.parseObjectNext()
      return Base_Types.Character_Payload(value)
    }

    def parseBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = parseBase_TypesString_PayloadT(F)
      return r
    }

    def parseBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.String_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      return Base_Types.String_Payload(value)
    }

    def parseBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = parseBase_TypesBits_PayloadT(F)
      return r
    }

    def parseBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Bits_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseISZ(parser.parseB _)
      parser.parseObjectNext()
      return Base_Types.Bits_Payload(value)
    }

    def parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container(): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P", "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS"))
      t.native match {
        case "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P" => val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PST(T); return r
      }
    }

    def parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P = {
      val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PT(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P")
      }
      parser.parseObjectKey("api_temperature_in")
      val api_temperature_in = parseDual_Zone_GreenhouseTemperature_Celsius()
      parser.parseObjectNext()
      parser.parseObjectKey("api_validity_in")
      val api_validity_in = parseDual_Zone_GreenhouseSensor_ValidityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(api_temperature_in, api_validity_in)
    }

    def parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS = {
      val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PST(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS")
      }
      parser.parseObjectKey("api_temperature_in")
      val api_temperature_in = parseDual_Zone_GreenhouseTemperature_Celsius()
      parser.parseObjectNext()
      parser.parseObjectKey("api_validity_in")
      val api_validity_in = parseDual_Zone_GreenhouseSensor_ValidityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(api_temperature_in, api_validity_in)
    }

    def parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container(): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P", "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS"))
      t.native match {
        case "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P" => val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PST(T); return r
      }
    }

    def parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P = {
      val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PT(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P")
      }
      parser.parseObjectKey("api_temperature_out")
      val api_temperature_out = parseDual_Zone_GreenhouseTemperature_Celsius()
      parser.parseObjectNext()
      parser.parseObjectKey("api_validity_out")
      val api_validity_out = parseDual_Zone_GreenhouseSensor_ValidityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(api_temperature_out, api_validity_out)
    }

    def parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS = {
      val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PST(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS")
      }
      parser.parseObjectKey("api_temperature_out")
      val api_temperature_out = parseDual_Zone_GreenhouseTemperature_Celsius()
      parser.parseObjectNext()
      parser.parseObjectKey("api_validity_out")
      val api_validity_out = parseDual_Zone_GreenhouseSensor_ValidityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(api_temperature_out, api_validity_out)
    }

    def parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container(): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P", "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS"))
      t.native match {
        case "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P" => val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PST(T); return r
      }
    }

    def parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P = {
      val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PT(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P")
      }
      parser.parseObjectKey("api_temperature_in")
      val api_temperature_in = parseDual_Zone_GreenhouseTemperature_Celsius()
      parser.parseObjectNext()
      parser.parseObjectKey("api_validity_in")
      val api_validity_in = parseDual_Zone_GreenhouseSensor_ValidityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(api_temperature_in, api_validity_in)
    }

    def parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS = {
      val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PST(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS")
      }
      parser.parseObjectKey("api_temperature_in")
      val api_temperature_in = parseDual_Zone_GreenhouseTemperature_Celsius()
      parser.parseObjectNext()
      parser.parseObjectKey("api_validity_in")
      val api_validity_in = parseDual_Zone_GreenhouseSensor_ValidityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(api_temperature_in, api_validity_in)
    }

    def parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container(): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P", "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS"))
      t.native match {
        case "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P" => val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PST(T); return r
      }
    }

    def parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P = {
      val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PT(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P")
      }
      parser.parseObjectKey("api_temperature_out")
      val api_temperature_out = parseDual_Zone_GreenhouseTemperature_Celsius()
      parser.parseObjectNext()
      parser.parseObjectKey("api_validity_out")
      val api_validity_out = parseDual_Zone_GreenhouseSensor_ValidityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(api_temperature_out, api_validity_out)
    }

    def parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS = {
      val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PST(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS")
      }
      parser.parseObjectKey("api_temperature_out")
      val api_temperature_out = parseDual_Zone_GreenhouseTemperature_Celsius()
      parser.parseObjectNext()
      parser.parseObjectKey("api_validity_out")
      val api_validity_out = parseDual_Zone_GreenhouseSensor_ValidityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(api_temperature_out, api_validity_out)
    }

    def parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container(): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P", "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS"))
      t.native match {
        case "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P" => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PST(T); return r
      }
    }

    def parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P = {
      val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PT(F)
      return r
    }

    def parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P")
      }
      parser.parseObjectKey("api_preference_in")
      val api_preference_in = parseDual_Zone_GreenhouseContention_PreferenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_limit_in")
      val api_upper_limit_in = parseDual_Zone_GreenhouseUpper_Temperature_Limit()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(api_preference_in, api_upper_limit_in)
    }

    def parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS = {
      val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PST(F)
      return r
    }

    def parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS")
      }
      parser.parseObjectKey("api_preference_in")
      val api_preference_in = parseDual_Zone_GreenhouseContention_PreferenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_limit_in")
      val api_upper_limit_in = parseDual_Zone_GreenhouseUpper_Temperature_Limit()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(api_preference_in, api_upper_limit_in)
    }

    def parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container(): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P", "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS"))
      t.native match {
        case "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P" => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(T); return r
      }
    }

    def parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P = {
      val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PT(F)
      return r
    }

    def parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P")
      }
      parser.parseObjectKey("api_preference_out")
      val api_preference_out = parseDual_Zone_GreenhouseContention_PreferenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_limit_for_a")
      val api_upper_limit_for_a = parseDual_Zone_GreenhouseUpper_Temperature_Limit()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_limit_for_b")
      val api_upper_limit_for_b = parseDual_Zone_GreenhouseUpper_Temperature_Limit()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(api_preference_out, api_upper_limit_for_a, api_upper_limit_for_b)
    }

    def parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS = {
      val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(F)
      return r
    }

    def parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS")
      }
      parser.parseObjectKey("api_preference_out")
      val api_preference_out = parseDual_Zone_GreenhouseContention_PreferenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_limit_for_a")
      val api_upper_limit_for_a = parseDual_Zone_GreenhouseUpper_Temperature_Limit()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_limit_for_b")
      val api_upper_limit_for_b = parseDual_Zone_GreenhouseUpper_Temperature_Limit()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(api_preference_out, api_upper_limit_for_a, api_upper_limit_for_b)
    }

    def parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container(): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P", "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS"))
      t.native match {
        case "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P" => val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PST(T); return r
      }
    }

    def parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P = {
      val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PT(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P")
      }
      parser.parseObjectKey("api_temperature")
      val api_temperature = parseDual_Zone_GreenhouseTemperature_Celsius()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_limit")
      val api_upper_limit = parseDual_Zone_GreenhouseUpper_Temperature_Limit()
      parser.parseObjectNext()
      parser.parseObjectKey("api_validity")
      val api_validity = parseDual_Zone_GreenhouseSensor_ValidityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(api_temperature, api_upper_limit, api_validity)
    }

    def parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS = {
      val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PST(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS")
      }
      parser.parseObjectKey("api_temperature")
      val api_temperature = parseDual_Zone_GreenhouseTemperature_Celsius()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_limit")
      val api_upper_limit = parseDual_Zone_GreenhouseUpper_Temperature_Limit()
      parser.parseObjectNext()
      parser.parseObjectKey("api_validity")
      val api_validity = parseDual_Zone_GreenhouseSensor_ValidityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(api_temperature, api_upper_limit, api_validity)
    }

    def parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container(): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P", "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS"))
      t.native match {
        case "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P" => val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PST(T); return r
      }
    }

    def parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P = {
      val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PT(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P")
      }
      parser.parseObjectKey("api_eligibility")
      val api_eligibility = parseDual_Zone_GreenhouseVentilation_EligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sensor_fault")
      val api_sensor_fault = parseDual_Zone_GreenhouseSensor_Fault_IndicationType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(api_eligibility, api_sensor_fault)
    }

    def parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS = {
      val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PST(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS")
      }
      parser.parseObjectKey("api_eligibility")
      val api_eligibility = parseDual_Zone_GreenhouseVentilation_EligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sensor_fault")
      val api_sensor_fault = parseDual_Zone_GreenhouseSensor_Fault_IndicationType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(api_eligibility, api_sensor_fault)
    }

    def parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container(): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P", "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS"))
      t.native match {
        case "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P" => val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PST(T); return r
      }
    }

    def parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P = {
      val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PT(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P")
      }
      parser.parseObjectKey("api_temperature")
      val api_temperature = parseDual_Zone_GreenhouseTemperature_Celsius()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_limit")
      val api_upper_limit = parseDual_Zone_GreenhouseUpper_Temperature_Limit()
      parser.parseObjectNext()
      parser.parseObjectKey("api_validity")
      val api_validity = parseDual_Zone_GreenhouseSensor_ValidityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(api_temperature, api_upper_limit, api_validity)
    }

    def parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS = {
      val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PST(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS")
      }
      parser.parseObjectKey("api_temperature")
      val api_temperature = parseDual_Zone_GreenhouseTemperature_Celsius()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_limit")
      val api_upper_limit = parseDual_Zone_GreenhouseUpper_Temperature_Limit()
      parser.parseObjectNext()
      parser.parseObjectKey("api_validity")
      val api_validity = parseDual_Zone_GreenhouseSensor_ValidityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(api_temperature, api_upper_limit, api_validity)
    }

    def parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container(): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P", "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS"))
      t.native match {
        case "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P" => val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PST(T); return r
      }
    }

    def parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P = {
      val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PT(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P")
      }
      parser.parseObjectKey("api_eligibility")
      val api_eligibility = parseDual_Zone_GreenhouseVentilation_EligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sensor_fault")
      val api_sensor_fault = parseDual_Zone_GreenhouseSensor_Fault_IndicationType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(api_eligibility, api_sensor_fault)
    }

    def parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS = {
      val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PST(F)
      return r
    }

    def parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS")
      }
      parser.parseObjectKey("api_eligibility")
      val api_eligibility = parseDual_Zone_GreenhouseVentilation_EligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sensor_fault")
      val api_sensor_fault = parseDual_Zone_GreenhouseSensor_Fault_IndicationType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(api_eligibility, api_sensor_fault)
    }

    def parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container(): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P", "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS"))
      t.native match {
        case "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P" => val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PST(T); return r
      }
    }

    def parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P = {
      val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PT(F)
      return r
    }

    def parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_preference")
      val api_preference = parseDual_Zone_GreenhouseContention_PreferenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_a_eligibility")
      val api_zone_a_eligibility = parseDual_Zone_GreenhouseVentilation_EligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_b_eligibility")
      val api_zone_b_eligibility = parseDual_Zone_GreenhouseVentilation_EligibilityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(api_preference, api_zone_a_eligibility, api_zone_b_eligibility)
    }

    def parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS = {
      val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PST(F)
      return r
    }

    def parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_preference")
      val api_preference = parseDual_Zone_GreenhouseContention_PreferenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_a_eligibility")
      val api_zone_a_eligibility = parseDual_Zone_GreenhouseVentilation_EligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_b_eligibility")
      val api_zone_b_eligibility = parseDual_Zone_GreenhouseVentilation_EligibilityType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(api_preference, api_zone_a_eligibility, api_zone_b_eligibility)
    }

    def parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container(): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P", "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS"))
      t.native match {
        case "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P" => val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PST(T); return r
      }
    }

    def parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P = {
      val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PT(F)
      return r
    }

    def parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_zone_a_fan_command")
      val api_zone_a_fan_command = parseDual_Zone_GreenhouseFan_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_b_fan_command")
      val api_zone_b_fan_command = parseDual_Zone_GreenhouseFan_CommandType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(api_zone_a_fan_command, api_zone_b_fan_command)
    }

    def parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS = {
      val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PST(F)
      return r
    }

    def parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_zone_a_fan_command")
      val api_zone_a_fan_command = parseDual_Zone_GreenhouseFan_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_b_fan_command")
      val api_zone_b_fan_command = parseDual_Zone_GreenhouseFan_CommandType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(api_zone_a_fan_command, api_zone_b_fan_command)
    }

    def parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container(): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P", "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS"))
      t.native match {
        case "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P" => val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PST(T); return r
      }
    }

    def parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P = {
      val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PT(F)
      return r
    }

    def parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P")
      }
      parser.parseObjectKey("api_zone_a_fan_command_in")
      val api_zone_a_fan_command_in = parseDual_Zone_GreenhouseFan_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_a_sensor_fault_in")
      val api_zone_a_sensor_fault_in = parseDual_Zone_GreenhouseSensor_Fault_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_b_fan_command_in")
      val api_zone_b_fan_command_in = parseDual_Zone_GreenhouseFan_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_b_sensor_fault_in")
      val api_zone_b_sensor_fault_in = parseDual_Zone_GreenhouseSensor_Fault_IndicationType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(api_zone_a_fan_command_in, api_zone_a_sensor_fault_in, api_zone_b_fan_command_in, api_zone_b_sensor_fault_in)
    }

    def parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS = {
      val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PST(F)
      return r
    }

    def parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS")
      }
      parser.parseObjectKey("api_zone_a_fan_command_in")
      val api_zone_a_fan_command_in = parseDual_Zone_GreenhouseFan_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_a_sensor_fault_in")
      val api_zone_a_sensor_fault_in = parseDual_Zone_GreenhouseSensor_Fault_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_b_fan_command_in")
      val api_zone_b_fan_command_in = parseDual_Zone_GreenhouseFan_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_b_sensor_fault_in")
      val api_zone_b_sensor_fault_in = parseDual_Zone_GreenhouseSensor_Fault_IndicationType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(api_zone_a_fan_command_in, api_zone_a_sensor_fault_in, api_zone_b_fan_command_in, api_zone_b_sensor_fault_in)
    }

    def parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container(): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P", "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS"))
      t.native match {
        case "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P" => val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PST(T); return r
      }
    }

    def parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P = {
      val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PT(F)
      return r
    }

    def parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P")
      }
      parser.parseObjectKey("api_zone_a_fan_command_out")
      val api_zone_a_fan_command_out = parseDual_Zone_GreenhouseFan_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_a_sensor_fault_out")
      val api_zone_a_sensor_fault_out = parseDual_Zone_GreenhouseSensor_Fault_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_b_fan_command_out")
      val api_zone_b_fan_command_out = parseDual_Zone_GreenhouseFan_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_b_sensor_fault_out")
      val api_zone_b_sensor_fault_out = parseDual_Zone_GreenhouseSensor_Fault_IndicationType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(api_zone_a_fan_command_out, api_zone_a_sensor_fault_out, api_zone_b_fan_command_out, api_zone_b_sensor_fault_out)
    }

    def parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS = {
      val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PST(F)
      return r
    }

    def parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS")
      }
      parser.parseObjectKey("api_zone_a_fan_command_out")
      val api_zone_a_fan_command_out = parseDual_Zone_GreenhouseFan_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_a_sensor_fault_out")
      val api_zone_a_sensor_fault_out = parseDual_Zone_GreenhouseSensor_Fault_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_b_fan_command_out")
      val api_zone_b_fan_command_out = parseDual_Zone_GreenhouseFan_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_zone_b_sensor_fault_out")
      val api_zone_b_sensor_fault_out = parseDual_Zone_GreenhouseSensor_Fault_IndicationType()
      parser.parseObjectNext()
      return Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(api_zone_a_fan_command_out, api_zone_a_sensor_fault_out, api_zone_b_fan_command_out, api_zone_b_sensor_fault_out)
    }

    def parseruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = parseruntimemonitorObservationKindT(F)
      return r
    }

    def parseruntimemonitorObservationKindT(typeParsed: B): runtimemonitor.ObservationKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("runtimemonitor.ObservationKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      runtimemonitor.ObservationKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for runtimemonitor.ObservationKind.")
          return runtimemonitor.ObservationKind.byOrdinal(0).get
      }
    }

    def parseutilContainer(): util.Container = {
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P", "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P", "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS", "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS", "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P", "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P", "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS", "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS", "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P", "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P", "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS", "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS", "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P", "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P", "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS", "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS", "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P", "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS", "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P", "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS", "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P", "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS", "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P", "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS", "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P", "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS", "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P", "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P" => val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P" => val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P" => val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P" => val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P" => val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P" => val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P" => val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P" => val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P" => val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P" => val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P" => val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P" => val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P" => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P" => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(T); return r
      }
    }

    def parseutilEmptyContainer(): util.EmptyContainer = {
      val r = parseutilEmptyContainerT(F)
      return r
    }

    def parseutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        parser.parseObjectType("util.EmptyContainer")
      }
      return util.EmptyContainer()
    }

    def parse_artDataContent(): art.DataContent = {
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Dual_Zone_Greenhouse.Fan_Command_Payload", "Dual_Zone_Greenhouse.Sensor_Validity_Payload", "Dual_Zone_Greenhouse.Temperature_Celsius_Payload", "Dual_Zone_Greenhouse.Contention_Preference_Payload", "Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload", "Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload", "Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload", "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P", "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P", "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS", "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS", "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P", "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P", "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS", "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS", "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P", "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P", "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS", "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS", "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P", "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P", "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS", "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS", "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P", "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS", "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P", "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS", "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P", "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS", "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P", "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS", "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P", "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS", "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P", "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS"))
      t.native match {
        case "art.Empty" => val r = parse_artEmptyT(T); return r
        case "Base_Types.Boolean_Payload" => val r = parseBase_TypesBoolean_PayloadT(T); return r
        case "Base_Types.Integer_Payload" => val r = parseBase_TypesInteger_PayloadT(T); return r
        case "Base_Types.Integer_8_Payload" => val r = parseBase_TypesInteger_8_PayloadT(T); return r
        case "Base_Types.Integer_16_Payload" => val r = parseBase_TypesInteger_16_PayloadT(T); return r
        case "Base_Types.Integer_32_Payload" => val r = parseBase_TypesInteger_32_PayloadT(T); return r
        case "Base_Types.Integer_64_Payload" => val r = parseBase_TypesInteger_64_PayloadT(T); return r
        case "Base_Types.Unsigned_8_Payload" => val r = parseBase_TypesUnsigned_8_PayloadT(T); return r
        case "Base_Types.Unsigned_16_Payload" => val r = parseBase_TypesUnsigned_16_PayloadT(T); return r
        case "Base_Types.Unsigned_32_Payload" => val r = parseBase_TypesUnsigned_32_PayloadT(T); return r
        case "Base_Types.Unsigned_64_Payload" => val r = parseBase_TypesUnsigned_64_PayloadT(T); return r
        case "Base_Types.Float_Payload" => val r = parseBase_TypesFloat_PayloadT(T); return r
        case "Base_Types.Float_32_Payload" => val r = parseBase_TypesFloat_32_PayloadT(T); return r
        case "Base_Types.Float_64_Payload" => val r = parseBase_TypesFloat_64_PayloadT(T); return r
        case "Base_Types.Character_Payload" => val r = parseBase_TypesCharacter_PayloadT(T); return r
        case "Base_Types.String_Payload" => val r = parseBase_TypesString_PayloadT(T); return r
        case "Base_Types.Bits_Payload" => val r = parseBase_TypesBits_PayloadT(T); return r
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Dual_Zone_Greenhouse.Fan_Command_Payload" => val r = parseDual_Zone_GreenhouseFan_Command_PayloadT(T); return r
        case "Dual_Zone_Greenhouse.Sensor_Validity_Payload" => val r = parseDual_Zone_GreenhouseSensor_Validity_PayloadT(T); return r
        case "Dual_Zone_Greenhouse.Temperature_Celsius_Payload" => val r = parseDual_Zone_GreenhouseTemperature_Celsius_PayloadT(T); return r
        case "Dual_Zone_Greenhouse.Contention_Preference_Payload" => val r = parseDual_Zone_GreenhouseContention_Preference_PayloadT(T); return r
        case "Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload" => val r = parseDual_Zone_GreenhouseSensor_Fault_Indication_PayloadT(T); return r
        case "Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload" => val r = parseDual_Zone_GreenhouseVentilation_Eligibility_PayloadT(T); return r
        case "Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload" => val r = parseDual_Zone_GreenhouseUpper_Temperature_Limit_PayloadT(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P" => val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P" => val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P" => val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P" => val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P" => val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P" => val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P" => val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P" => val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P" => val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P" => val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P" => val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P" => val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P" => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS" => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PST(T); return r
        case "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P" => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PT(T); return r
        case "Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS" => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(T); return r
        case _ => val r = parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(T); return r
      }
    }

    def parse_artEmpty(): art.Empty = {
      val r = parse_artEmptyT(F)
      return r
    }

    def parse_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        parser.parseObjectType("art.Empty")
      }
      return art.Empty()
    }

    def eof(): B = {
      val r = parser.eof()
      return r
    }

  }

  def to[T](s: String, f: Parser => T): Either[T, Json.ErrorMsg] = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    parser.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromDual_Zone_GreenhouseSensor_Validity_Payload(o: Dual_Zone_Greenhouse.Sensor_Validity_Payload, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseSensor_Validity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseSensor_Validity_Payload(s: String): Either[Dual_Zone_Greenhouse.Sensor_Validity_Payload, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseSensor_Validity_Payload(parser: Parser): Dual_Zone_Greenhouse.Sensor_Validity_Payload = {
      val r = parser.parseDual_Zone_GreenhouseSensor_Validity_Payload()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseSensor_Validity_Payload _)
    return r
  }

  def fromDual_Zone_GreenhouseContention_Preference_Payload(o: Dual_Zone_Greenhouse.Contention_Preference_Payload, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseContention_Preference_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseContention_Preference_Payload(s: String): Either[Dual_Zone_Greenhouse.Contention_Preference_Payload, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseContention_Preference_Payload(parser: Parser): Dual_Zone_Greenhouse.Contention_Preference_Payload = {
      val r = parser.parseDual_Zone_GreenhouseContention_Preference_Payload()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseContention_Preference_Payload _)
    return r
  }

  def fromDual_Zone_GreenhouseVentilation_Eligibility_Payload(o: Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseVentilation_Eligibility_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseVentilation_Eligibility_Payload(s: String): Either[Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseVentilation_Eligibility_Payload(parser: Parser): Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload = {
      val r = parser.parseDual_Zone_GreenhouseVentilation_Eligibility_Payload()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseVentilation_Eligibility_Payload _)
    return r
  }

  def fromDual_Zone_GreenhouseSensor_Fault_Indication_Payload(o: Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseSensor_Fault_Indication_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseSensor_Fault_Indication_Payload(s: String): Either[Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseSensor_Fault_Indication_Payload(parser: Parser): Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload = {
      val r = parser.parseDual_Zone_GreenhouseSensor_Fault_Indication_Payload()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseSensor_Fault_Indication_Payload _)
    return r
  }

  def fromDual_Zone_GreenhouseFan_Command_Payload(o: Dual_Zone_Greenhouse.Fan_Command_Payload, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseFan_Command_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseFan_Command_Payload(s: String): Either[Dual_Zone_Greenhouse.Fan_Command_Payload, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseFan_Command_Payload(parser: Parser): Dual_Zone_Greenhouse.Fan_Command_Payload = {
      val r = parser.parseDual_Zone_GreenhouseFan_Command_Payload()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseFan_Command_Payload _)
    return r
  }

  def fromDual_Zone_GreenhouseTemperature_Celsius(o: Dual_Zone_Greenhouse.Temperature_Celsius, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseTemperature_Celsius(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseTemperature_Celsius(s: String): Either[Dual_Zone_Greenhouse.Temperature_Celsius, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseTemperature_Celsius(parser: Parser): Dual_Zone_Greenhouse.Temperature_Celsius = {
      val r = parser.parseDual_Zone_GreenhouseTemperature_Celsius()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseTemperature_Celsius _)
    return r
  }

  def fromDual_Zone_GreenhouseTemperature_Celsius_Payload(o: Dual_Zone_Greenhouse.Temperature_Celsius_Payload, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseTemperature_Celsius_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseTemperature_Celsius_Payload(s: String): Either[Dual_Zone_Greenhouse.Temperature_Celsius_Payload, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseTemperature_Celsius_Payload(parser: Parser): Dual_Zone_Greenhouse.Temperature_Celsius_Payload = {
      val r = parser.parseDual_Zone_GreenhouseTemperature_Celsius_Payload()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseTemperature_Celsius_Payload _)
    return r
  }

  def fromDual_Zone_GreenhouseUpper_Temperature_Limit(o: Dual_Zone_Greenhouse.Upper_Temperature_Limit, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseUpper_Temperature_Limit(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseUpper_Temperature_Limit(s: String): Either[Dual_Zone_Greenhouse.Upper_Temperature_Limit, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseUpper_Temperature_Limit(parser: Parser): Dual_Zone_Greenhouse.Upper_Temperature_Limit = {
      val r = parser.parseDual_Zone_GreenhouseUpper_Temperature_Limit()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseUpper_Temperature_Limit _)
    return r
  }

  def fromDual_Zone_GreenhouseUpper_Temperature_Limit_Payload(o: Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseUpper_Temperature_Limit_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseUpper_Temperature_Limit_Payload(s: String): Either[Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseUpper_Temperature_Limit_Payload(parser: Parser): Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload = {
      val r = parser.parseDual_Zone_GreenhouseUpper_Temperature_Limit_Payload()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseUpper_Temperature_Limit_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBoolean_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBoolean_Payload(s: String): Either[Base_Types.Boolean_Payload, Json.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(parser: Parser): Base_Types.Boolean_Payload = {
      val r = parser.parseBase_TypesBoolean_Payload()
      return r
    }
    val r = to(s, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_Payload(s: String): Either[Base_Types.Integer_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_Payload(parser: Parser): Base_Types.Integer_Payload = {
      val r = parser.parseBase_TypesInteger_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_8_Payload(s: String): Either[Base_Types.Integer_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(parser: Parser): Base_Types.Integer_8_Payload = {
      val r = parser.parseBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_16_Payload(s: String): Either[Base_Types.Integer_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(parser: Parser): Base_Types.Integer_16_Payload = {
      val r = parser.parseBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_32_Payload(s: String): Either[Base_Types.Integer_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(parser: Parser): Base_Types.Integer_32_Payload = {
      val r = parser.parseBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_64_Payload(s: String): Either[Base_Types.Integer_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(parser: Parser): Base_Types.Integer_64_Payload = {
      val r = parser.parseBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_8_Payload(s: String): Either[Base_Types.Unsigned_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(parser: Parser): Base_Types.Unsigned_8_Payload = {
      val r = parser.parseBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_16_Payload(s: String): Either[Base_Types.Unsigned_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(parser: Parser): Base_Types.Unsigned_16_Payload = {
      val r = parser.parseBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_32_Payload(s: String): Either[Base_Types.Unsigned_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(parser: Parser): Base_Types.Unsigned_32_Payload = {
      val r = parser.parseBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_64_Payload(s: String): Either[Base_Types.Unsigned_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(parser: Parser): Base_Types.Unsigned_64_Payload = {
      val r = parser.parseBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_Payload(s: String): Either[Base_Types.Float_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_Payload(parser: Parser): Base_Types.Float_Payload = {
      val r = parser.parseBase_TypesFloat_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_32_Payload(s: String): Either[Base_Types.Float_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(parser: Parser): Base_Types.Float_32_Payload = {
      val r = parser.parseBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_64_Payload(s: String): Either[Base_Types.Float_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(parser: Parser): Base_Types.Float_64_Payload = {
      val r = parser.parseBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesCharacter_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesCharacter_Payload(s: String): Either[Base_Types.Character_Payload, Json.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(parser: Parser): Base_Types.Character_Payload = {
      val r = parser.parseBase_TypesCharacter_Payload()
      return r
    }
    val r = to(s, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesString_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesString_Payload(s: String): Either[Base_Types.String_Payload, Json.ErrorMsg] = {
    def fBase_TypesString_Payload(parser: Parser): Base_Types.String_Payload = {
      val r = parser.parseBase_TypesString_Payload()
      return r
    }
    val r = to(s, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBits_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBits_Payload(s: String): Either[Base_Types.Bits_Payload, Json.ErrorMsg] = {
    def fBase_TypesBits_Payload(parser: Parser): Base_Types.Bits_Payload = {
      val r = parser.parseBase_TypesBits_Payload()
      return r
    }
    val r = to(s, fBase_TypesBits_Payload _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container(s: String): Either[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container(parser: Parser): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container = {
      val r = parser.parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(s: String): Either[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(parser: Parser): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P = {
      val r = parser.parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(s: String): Either[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(parser: Parser): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS = {
      val r = parser.parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container(s: String): Either[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container(parser: Parser): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container = {
      val r = parser.parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(s: String): Either[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(parser: Parser): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P = {
      val r = parser.parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(s: String): Either[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(parser: Parser): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS = {
      val r = parser.parseDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container(s: String): Either[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container(parser: Parser): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container = {
      val r = parser.parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(s: String): Either[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(parser: Parser): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P = {
      val r = parser.parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(s: String): Either[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(parser: Parser): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS = {
      val r = parser.parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container(s: String): Either[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container(parser: Parser): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container = {
      val r = parser.parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(s: String): Either[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(parser: Parser): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P = {
      val r = parser.parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(s: String): Either[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(parser: Parser): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS = {
      val r = parser.parseDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container(s: String): Either[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container(parser: Parser): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container = {
      val r = parser.parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(s: String): Either[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(parser: Parser): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P = {
      val r = parser.parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(s: String): Either[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(parser: Parser): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS = {
      val r = parser.parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container(s: String): Either[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container(parser: Parser): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container = {
      val r = parser.parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(s: String): Either[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(parser: Parser): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P = {
      val r = parser.parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(s: String): Either[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(parser: Parser): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS = {
      val r = parser.parseDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container(s: String): Either[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container(parser: Parser): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container = {
      val r = parser.parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(s: String): Either[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(parser: Parser): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P = {
      val r = parser.parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(s: String): Either[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(parser: Parser): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS = {
      val r = parser.parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container(s: String): Either[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container(parser: Parser): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container = {
      val r = parser.parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(s: String): Either[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(parser: Parser): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P = {
      val r = parser.parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(s: String): Either[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(parser: Parser): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS = {
      val r = parser.parseDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container(s: String): Either[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container(parser: Parser): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container = {
      val r = parser.parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(s: String): Either[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(parser: Parser): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P = {
      val r = parser.parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(s: String): Either[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(parser: Parser): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS = {
      val r = parser.parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container(s: String): Either[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container(parser: Parser): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container = {
      val r = parser.parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(s: String): Either[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(parser: Parser): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P = {
      val r = parser.parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(s: String): Either[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(parser: Parser): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS = {
      val r = parser.parseDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container(s: String): Either[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container(parser: Parser): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container = {
      val r = parser.parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(s: String): Either[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(parser: Parser): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P = {
      val r = parser.parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(s: String): Either[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(parser: Parser): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS = {
      val r = parser.parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container(s: String): Either[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container(parser: Parser): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container = {
      val r = parser.parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(s: String): Either[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(parser: Parser): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P = {
      val r = parser.parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(s: String): Either[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(parser: Parser): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS = {
      val r = parser.parseDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container(s: String): Either[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container(parser: Parser): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container = {
      val r = parser.parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(s: String): Either[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(parser: Parser): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P = {
      val r = parser.parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(s: String): Either[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(parser: Parser): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS = {
      val r = parser.parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container(s: String): Either[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container(parser: Parser): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container = {
      val r = parser.parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(s: String): Either[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(parser: Parser): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P = {
      val r = parser.parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(s: String): Either[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS, Json.ErrorMsg] = {
    def fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(parser: Parser): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS = {
      val r = parser.parseDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS()
      return r
    }
    val r = to(s, fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, isCompact: B): String = {
    val st = Printer.printutilContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilContainer(s: String): Either[util.Container, Json.ErrorMsg] = {
    def futilContainer(parser: Parser): util.Container = {
      val r = parser.parseutilContainer()
      return r
    }
    val r = to(s, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, isCompact: B): String = {
    val st = Printer.printutilEmptyContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilEmptyContainer(s: String): Either[util.EmptyContainer, Json.ErrorMsg] = {
    def futilEmptyContainer(parser: Parser): util.EmptyContainer = {
      val r = parser.parseutilEmptyContainer()
      return r
    }
    val r = to(s, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, isCompact: B): String = {
    val st = Printer.print_artDataContent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artDataContent(s: String): Either[art.DataContent, Json.ErrorMsg] = {
    def f_artDataContent(parser: Parser): art.DataContent = {
      val r = parser.parse_artDataContent()
      return r
    }
    val r = to(s, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, isCompact: B): String = {
    val st = Printer.print_artEmpty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artEmpty(s: String): Either[art.Empty, Json.ErrorMsg] = {
    def f_artEmpty(parser: Parser): art.Empty = {
      val r = parser.parse_artEmpty()
      return r
    }
    val r = to(s, f_artEmpty _)
    return r
  }

}