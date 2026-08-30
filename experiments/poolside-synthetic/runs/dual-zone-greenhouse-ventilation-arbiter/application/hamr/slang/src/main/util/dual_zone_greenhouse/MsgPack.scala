// #Sireum
// @formatter:off

// This file is auto-generated from Sensor_Validity.scala, Contention_Preference.scala, Ventilation_Eligibility.scala, Sensor_Fault_Indication.scala, Fan_Command.scala, Temperature_Celsius.scala, Upper_Temperature_Limit.scala, Base_Types.scala, Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_Containers.scala, Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_Containers.scala, Operator_Configuration_Intake_i_control_process_operator_configuration_intake_Containers.scala, Zone_A_Local_Decision_i_control_process_zone_a_local_decision_Containers.scala, Zone_B_Local_Decision_i_control_process_zone_b_local_decision_Containers.scala, Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_Containers.scala, Boundary_Output_Delivery_i_control_process_boundary_output_delivery_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package dual_zone_greenhouse

import org.sireum._

object MsgPack {

  object Constants {

    val Dual_Zone_GreenhouseSensor_Validity_Payload: Z = -32

    val Dual_Zone_GreenhouseContention_Preference_Payload: Z = -31

    val Dual_Zone_GreenhouseVentilation_Eligibility_Payload: Z = -30

    val Dual_Zone_GreenhouseSensor_Fault_Indication_Payload: Z = -29

    val Dual_Zone_GreenhouseFan_Command_Payload: Z = -28

    val Dual_Zone_GreenhouseTemperature_Celsius: Z = -27

    val Dual_Zone_GreenhouseTemperature_Celsius_Payload: Z = -26

    val Dual_Zone_GreenhouseUpper_Temperature_Limit: Z = -25

    val Dual_Zone_GreenhouseUpper_Temperature_Limit_Payload: Z = -24

    val Base_TypesBoolean_Payload: Z = -23

    val Base_TypesInteger_Payload: Z = -22

    val Base_TypesInteger_8_Payload: Z = -21

    val Base_TypesInteger_16_Payload: Z = -20

    val Base_TypesInteger_32_Payload: Z = -19

    val Base_TypesInteger_64_Payload: Z = -18

    val Base_TypesUnsigned_8_Payload: Z = -17

    val Base_TypesUnsigned_16_Payload: Z = -16

    val Base_TypesUnsigned_32_Payload: Z = -15

    val Base_TypesUnsigned_64_Payload: Z = -14

    val Base_TypesFloat_Payload: Z = -13

    val Base_TypesFloat_32_Payload: Z = -12

    val Base_TypesFloat_64_Payload: Z = -11

    val Base_TypesCharacter_Payload: Z = -10

    val Base_TypesString_Payload: Z = -9

    val Base_TypesBits_Payload: Z = -8

    val Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P: Z = -7

    val Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS: Z = -6

    val Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P: Z = -5

    val Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS: Z = -4

    val Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P: Z = -3

    val Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS: Z = -2

    val Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P: Z = -1

    val Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS: Z = 0

    val Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P: Z = 1

    val Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS: Z = 2

    val Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P: Z = 3

    val Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS: Z = 4

    val Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P: Z = 5

    val Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS: Z = 6

    val Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P: Z = 7

    val Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS: Z = 8

    val Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P: Z = 9

    val Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS: Z = 10

    val Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P: Z = 11

    val Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS: Z = 12

    val Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P: Z = 13

    val Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS: Z = 14

    val Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P: Z = 15

    val Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS: Z = 16

    val Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P: Z = 17

    val Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS: Z = 18

    val Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P: Z = 19

    val Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS: Z = 20

    val utilEmptyContainer: Z = 21

    val _artEmpty: Z = 22

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeDual_Zone_GreenhouseSensor_ValidityType(o: Dual_Zone_Greenhouse.Sensor_Validity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDual_Zone_GreenhouseSensor_Validity_Payload(o: Dual_Zone_Greenhouse.Sensor_Validity_Payload): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseSensor_Validity_Payload)
      writeDual_Zone_GreenhouseSensor_ValidityType(o.value)
    }

    def writeDual_Zone_GreenhouseContention_PreferenceType(o: Dual_Zone_Greenhouse.Contention_Preference.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDual_Zone_GreenhouseContention_Preference_Payload(o: Dual_Zone_Greenhouse.Contention_Preference_Payload): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseContention_Preference_Payload)
      writeDual_Zone_GreenhouseContention_PreferenceType(o.value)
    }

    def writeDual_Zone_GreenhouseVentilation_EligibilityType(o: Dual_Zone_Greenhouse.Ventilation_Eligibility.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDual_Zone_GreenhouseVentilation_Eligibility_Payload(o: Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseVentilation_Eligibility_Payload)
      writeDual_Zone_GreenhouseVentilation_EligibilityType(o.value)
    }

    def writeDual_Zone_GreenhouseSensor_Fault_IndicationType(o: Dual_Zone_Greenhouse.Sensor_Fault_Indication.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDual_Zone_GreenhouseSensor_Fault_Indication_Payload(o: Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseSensor_Fault_Indication_Payload)
      writeDual_Zone_GreenhouseSensor_Fault_IndicationType(o.value)
    }

    def writeDual_Zone_GreenhouseFan_CommandType(o: Dual_Zone_Greenhouse.Fan_Command.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDual_Zone_GreenhouseFan_Command_Payload(o: Dual_Zone_Greenhouse.Fan_Command_Payload): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseFan_Command_Payload)
      writeDual_Zone_GreenhouseFan_CommandType(o.value)
    }

    def writeDual_Zone_GreenhouseTemperature_Celsius(o: Dual_Zone_Greenhouse.Temperature_Celsius): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseTemperature_Celsius)
      writer.writeS32(o.degrees_celsius)
    }

    def writeDual_Zone_GreenhouseTemperature_Celsius_Payload(o: Dual_Zone_Greenhouse.Temperature_Celsius_Payload): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseTemperature_Celsius_Payload)
      writeDual_Zone_GreenhouseTemperature_Celsius(o.value)
    }

    def writeDual_Zone_GreenhouseUpper_Temperature_Limit(o: Dual_Zone_Greenhouse.Upper_Temperature_Limit): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseUpper_Temperature_Limit)
      writer.writeS32(o.degrees_celsius)
    }

    def writeDual_Zone_GreenhouseUpper_Temperature_Limit_Payload(o: Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseUpper_Temperature_Limit_Payload)
      writeDual_Zone_GreenhouseUpper_Temperature_Limit(o.value)
    }

    def writeBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBoolean_Payload)
      writer.writeB(o.value)
    }

    def writeBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_Payload)
      writer.writeZ(o.value)
    }

    def writeBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_8_Payload)
      writer.writeS8(o.value)
    }

    def writeBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_16_Payload)
      writer.writeS16(o.value)
    }

    def writeBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_32_Payload)
      writer.writeS32(o.value)
    }

    def writeBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_64_Payload)
      writer.writeS64(o.value)
    }

    def writeBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_8_Payload)
      writer.writeU8(o.value)
    }

    def writeBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_16_Payload)
      writer.writeU16(o.value)
    }

    def writeBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_32_Payload)
      writer.writeU32(o.value)
    }

    def writeBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_64_Payload)
      writer.writeU64(o.value)
    }

    def writeBase_TypesFloat_Payload(o: Base_Types.Float_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_Payload)
      writer.writeR(o.value)
    }

    def writeBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_32_Payload)
      writer.writeF32(o.value)
    }

    def writeBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_64_Payload)
      writer.writeF64(o.value)
    }

    def writeBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesCharacter_Payload)
      writer.writeC(o.value)
    }

    def writeBase_TypesString_Payload(o: Base_Types.String_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesString_Payload)
      writer.writeString(o.value)
    }

    def writeBase_TypesBits_Payload(o: Base_Types.Bits_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBits_Payload)
      writer.writeISZ(o.value, writer.writeB _)
    }

    def writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container): Unit = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P => writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS => writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(o)
      }
    }

    def writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P)
      writeDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_in)
      writeDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_in)
    }

    def writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS)
      writeDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_in)
      writeDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_in)
    }

    def writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container): Unit = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P => writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS => writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(o)
      }
    }

    def writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P)
      writeDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_out)
      writeDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_out)
    }

    def writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS)
      writeDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_out)
      writeDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_out)
    }

    def writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container): Unit = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P => writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS => writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(o)
      }
    }

    def writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P)
      writeDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_in)
      writeDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_in)
    }

    def writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS)
      writeDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_in)
      writeDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_in)
    }

    def writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container): Unit = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P => writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS => writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(o)
      }
    }

    def writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P)
      writeDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_out)
      writeDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_out)
    }

    def writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS)
      writeDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature_out)
      writeDual_Zone_GreenhouseSensor_ValidityType(o.api_validity_out)
    }

    def writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container): Unit = {
      o match {
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P => writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS => writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(o)
      }
    }

    def writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P)
      writeDual_Zone_GreenhouseContention_PreferenceType(o.api_preference_in)
      writeDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit_in)
    }

    def writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS)
      writeDual_Zone_GreenhouseContention_PreferenceType(o.api_preference_in)
      writeDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit_in)
    }

    def writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container): Unit = {
      o match {
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P => writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS => writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(o)
      }
    }

    def writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P)
      writeDual_Zone_GreenhouseContention_PreferenceType(o.api_preference_out)
      writeDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit_for_a)
      writeDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit_for_b)
    }

    def writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS)
      writeDual_Zone_GreenhouseContention_PreferenceType(o.api_preference_out)
      writeDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit_for_a)
      writeDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit_for_b)
    }

    def writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container): Unit = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P => writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS => writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(o)
      }
    }

    def writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P)
      writeDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature)
      writeDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit)
      writeDual_Zone_GreenhouseSensor_ValidityType(o.api_validity)
    }

    def writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS)
      writeDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature)
      writeDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit)
      writeDual_Zone_GreenhouseSensor_ValidityType(o.api_validity)
    }

    def writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container): Unit = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P => writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS => writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(o)
      }
    }

    def writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P)
      writeDual_Zone_GreenhouseVentilation_EligibilityType(o.api_eligibility)
      writeDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_sensor_fault)
    }

    def writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS)
      writeDual_Zone_GreenhouseVentilation_EligibilityType(o.api_eligibility)
      writeDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_sensor_fault)
    }

    def writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container): Unit = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P => writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS => writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(o)
      }
    }

    def writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P)
      writeDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature)
      writeDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit)
      writeDual_Zone_GreenhouseSensor_ValidityType(o.api_validity)
    }

    def writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS)
      writeDual_Zone_GreenhouseTemperature_Celsius(o.api_temperature)
      writeDual_Zone_GreenhouseUpper_Temperature_Limit(o.api_upper_limit)
      writeDual_Zone_GreenhouseSensor_ValidityType(o.api_validity)
    }

    def writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container): Unit = {
      o match {
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P => writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS => writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(o)
      }
    }

    def writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P)
      writeDual_Zone_GreenhouseVentilation_EligibilityType(o.api_eligibility)
      writeDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_sensor_fault)
    }

    def writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS)
      writeDual_Zone_GreenhouseVentilation_EligibilityType(o.api_eligibility)
      writeDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_sensor_fault)
    }

    def writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container): Unit = {
      o match {
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P => writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS => writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(o)
      }
    }

    def writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P)
      writeDual_Zone_GreenhouseContention_PreferenceType(o.api_preference)
      writeDual_Zone_GreenhouseVentilation_EligibilityType(o.api_zone_a_eligibility)
      writeDual_Zone_GreenhouseVentilation_EligibilityType(o.api_zone_b_eligibility)
    }

    def writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS)
      writeDual_Zone_GreenhouseContention_PreferenceType(o.api_preference)
      writeDual_Zone_GreenhouseVentilation_EligibilityType(o.api_zone_a_eligibility)
      writeDual_Zone_GreenhouseVentilation_EligibilityType(o.api_zone_b_eligibility)
    }

    def writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container): Unit = {
      o match {
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P => writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS => writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(o)
      }
    }

    def writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P)
      writeDual_Zone_GreenhouseFan_CommandType(o.api_zone_a_fan_command)
      writeDual_Zone_GreenhouseFan_CommandType(o.api_zone_b_fan_command)
    }

    def writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS)
      writeDual_Zone_GreenhouseFan_CommandType(o.api_zone_a_fan_command)
      writeDual_Zone_GreenhouseFan_CommandType(o.api_zone_b_fan_command)
    }

    def writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container): Unit = {
      o match {
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P => writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS => writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(o)
      }
    }

    def writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P)
      writeDual_Zone_GreenhouseFan_CommandType(o.api_zone_a_fan_command_in)
      writeDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_a_sensor_fault_in)
      writeDual_Zone_GreenhouseFan_CommandType(o.api_zone_b_fan_command_in)
      writeDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_b_sensor_fault_in)
    }

    def writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS)
      writeDual_Zone_GreenhouseFan_CommandType(o.api_zone_a_fan_command_in)
      writeDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_a_sensor_fault_in)
      writeDual_Zone_GreenhouseFan_CommandType(o.api_zone_b_fan_command_in)
      writeDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_b_sensor_fault_in)
    }

    def writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container): Unit = {
      o match {
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P => writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS => writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(o)
      }
    }

    def writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P)
      writeDual_Zone_GreenhouseFan_CommandType(o.api_zone_a_fan_command_out)
      writeDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_a_sensor_fault_out)
      writeDual_Zone_GreenhouseFan_CommandType(o.api_zone_b_fan_command_out)
      writeDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_b_sensor_fault_out)
    }

    def writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS)
      writeDual_Zone_GreenhouseFan_CommandType(o.api_zone_a_fan_command_out)
      writeDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_a_sensor_fault_out)
      writeDual_Zone_GreenhouseFan_CommandType(o.api_zone_b_fan_command_out)
      writeDual_Zone_GreenhouseSensor_Fault_IndicationType(o.api_zone_b_sensor_fault_out)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P => writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P => writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS => writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS => writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P => writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P => writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS => writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS => writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P => writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P => writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS => writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS => writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P => writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P => writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS => writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS => writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P => writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS => writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P => writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS => writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P => writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS => writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P => writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS => writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P => writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS => writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P => writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS => writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(o)
      }
    }

    def writeutilEmptyContainer(o: util.EmptyContainer): Unit = {
      writer.writeZ(Constants.utilEmptyContainer)
    }

    def write_artDataContent(o: art.DataContent): Unit = {
      o match {
        case o: art.Empty => write_artEmpty(o)
        case o: Base_Types.Boolean_Payload => writeBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => writeBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => writeBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => writeBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => writeBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => writeBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => writeBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => writeBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => writeBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => writeBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => writeBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => writeBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => writeBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => writeBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => writeBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => writeBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Dual_Zone_Greenhouse.Fan_Command_Payload => writeDual_Zone_GreenhouseFan_Command_Payload(o)
        case o: Dual_Zone_Greenhouse.Sensor_Validity_Payload => writeDual_Zone_GreenhouseSensor_Validity_Payload(o)
        case o: Dual_Zone_Greenhouse.Temperature_Celsius_Payload => writeDual_Zone_GreenhouseTemperature_Celsius_Payload(o)
        case o: Dual_Zone_Greenhouse.Contention_Preference_Payload => writeDual_Zone_GreenhouseContention_Preference_Payload(o)
        case o: Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload => writeDual_Zone_GreenhouseSensor_Fault_Indication_Payload(o)
        case o: Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload => writeDual_Zone_GreenhouseVentilation_Eligibility_Payload(o)
        case o: Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload => writeDual_Zone_GreenhouseUpper_Temperature_Limit_Payload(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P => writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P => writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS => writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS => writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P => writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P => writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS => writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS => writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P => writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P => writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS => writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS => writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P => writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P => writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS => writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS => writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P => writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS => writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P => writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS => writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P => writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS => writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P => writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS => writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P => writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS => writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P => writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(o)
        case o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS => writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(o)
      }
    }

    def write_artEmpty(o: art.Empty): Unit = {
      writer.writeZ(Constants._artEmpty)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readDual_Zone_GreenhouseSensor_ValidityType(): Dual_Zone_Greenhouse.Sensor_Validity.Type = {
      val r = reader.readZ()
      return Dual_Zone_Greenhouse.Sensor_Validity.byOrdinal(r).get
    }

    def readDual_Zone_GreenhouseSensor_Validity_Payload(): Dual_Zone_Greenhouse.Sensor_Validity_Payload = {
      val r = readDual_Zone_GreenhouseSensor_Validity_PayloadT(F)
      return r
    }

    def readDual_Zone_GreenhouseSensor_Validity_PayloadT(typeParsed: B): Dual_Zone_Greenhouse.Sensor_Validity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseSensor_Validity_Payload)
      }
      val value = readDual_Zone_GreenhouseSensor_ValidityType()
      return Dual_Zone_Greenhouse.Sensor_Validity_Payload(value)
    }

    def readDual_Zone_GreenhouseContention_PreferenceType(): Dual_Zone_Greenhouse.Contention_Preference.Type = {
      val r = reader.readZ()
      return Dual_Zone_Greenhouse.Contention_Preference.byOrdinal(r).get
    }

    def readDual_Zone_GreenhouseContention_Preference_Payload(): Dual_Zone_Greenhouse.Contention_Preference_Payload = {
      val r = readDual_Zone_GreenhouseContention_Preference_PayloadT(F)
      return r
    }

    def readDual_Zone_GreenhouseContention_Preference_PayloadT(typeParsed: B): Dual_Zone_Greenhouse.Contention_Preference_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseContention_Preference_Payload)
      }
      val value = readDual_Zone_GreenhouseContention_PreferenceType()
      return Dual_Zone_Greenhouse.Contention_Preference_Payload(value)
    }

    def readDual_Zone_GreenhouseVentilation_EligibilityType(): Dual_Zone_Greenhouse.Ventilation_Eligibility.Type = {
      val r = reader.readZ()
      return Dual_Zone_Greenhouse.Ventilation_Eligibility.byOrdinal(r).get
    }

    def readDual_Zone_GreenhouseVentilation_Eligibility_Payload(): Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload = {
      val r = readDual_Zone_GreenhouseVentilation_Eligibility_PayloadT(F)
      return r
    }

    def readDual_Zone_GreenhouseVentilation_Eligibility_PayloadT(typeParsed: B): Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseVentilation_Eligibility_Payload)
      }
      val value = readDual_Zone_GreenhouseVentilation_EligibilityType()
      return Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload(value)
    }

    def readDual_Zone_GreenhouseSensor_Fault_IndicationType(): Dual_Zone_Greenhouse.Sensor_Fault_Indication.Type = {
      val r = reader.readZ()
      return Dual_Zone_Greenhouse.Sensor_Fault_Indication.byOrdinal(r).get
    }

    def readDual_Zone_GreenhouseSensor_Fault_Indication_Payload(): Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload = {
      val r = readDual_Zone_GreenhouseSensor_Fault_Indication_PayloadT(F)
      return r
    }

    def readDual_Zone_GreenhouseSensor_Fault_Indication_PayloadT(typeParsed: B): Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseSensor_Fault_Indication_Payload)
      }
      val value = readDual_Zone_GreenhouseSensor_Fault_IndicationType()
      return Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload(value)
    }

    def readDual_Zone_GreenhouseFan_CommandType(): Dual_Zone_Greenhouse.Fan_Command.Type = {
      val r = reader.readZ()
      return Dual_Zone_Greenhouse.Fan_Command.byOrdinal(r).get
    }

    def readDual_Zone_GreenhouseFan_Command_Payload(): Dual_Zone_Greenhouse.Fan_Command_Payload = {
      val r = readDual_Zone_GreenhouseFan_Command_PayloadT(F)
      return r
    }

    def readDual_Zone_GreenhouseFan_Command_PayloadT(typeParsed: B): Dual_Zone_Greenhouse.Fan_Command_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseFan_Command_Payload)
      }
      val value = readDual_Zone_GreenhouseFan_CommandType()
      return Dual_Zone_Greenhouse.Fan_Command_Payload(value)
    }

    def readDual_Zone_GreenhouseTemperature_Celsius(): Dual_Zone_Greenhouse.Temperature_Celsius = {
      val r = readDual_Zone_GreenhouseTemperature_CelsiusT(F)
      return r
    }

    def readDual_Zone_GreenhouseTemperature_CelsiusT(typeParsed: B): Dual_Zone_Greenhouse.Temperature_Celsius = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseTemperature_Celsius)
      }
      val degrees_celsius = reader.readS32()
      return Dual_Zone_Greenhouse.Temperature_Celsius(degrees_celsius)
    }

    def readDual_Zone_GreenhouseTemperature_Celsius_Payload(): Dual_Zone_Greenhouse.Temperature_Celsius_Payload = {
      val r = readDual_Zone_GreenhouseTemperature_Celsius_PayloadT(F)
      return r
    }

    def readDual_Zone_GreenhouseTemperature_Celsius_PayloadT(typeParsed: B): Dual_Zone_Greenhouse.Temperature_Celsius_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseTemperature_Celsius_Payload)
      }
      val value = readDual_Zone_GreenhouseTemperature_Celsius()
      return Dual_Zone_Greenhouse.Temperature_Celsius_Payload(value)
    }

    def readDual_Zone_GreenhouseUpper_Temperature_Limit(): Dual_Zone_Greenhouse.Upper_Temperature_Limit = {
      val r = readDual_Zone_GreenhouseUpper_Temperature_LimitT(F)
      return r
    }

    def readDual_Zone_GreenhouseUpper_Temperature_LimitT(typeParsed: B): Dual_Zone_Greenhouse.Upper_Temperature_Limit = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseUpper_Temperature_Limit)
      }
      val degrees_celsius = reader.readS32()
      return Dual_Zone_Greenhouse.Upper_Temperature_Limit(degrees_celsius)
    }

    def readDual_Zone_GreenhouseUpper_Temperature_Limit_Payload(): Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload = {
      val r = readDual_Zone_GreenhouseUpper_Temperature_Limit_PayloadT(F)
      return r
    }

    def readDual_Zone_GreenhouseUpper_Temperature_Limit_PayloadT(typeParsed: B): Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseUpper_Temperature_Limit_Payload)
      }
      val value = readDual_Zone_GreenhouseUpper_Temperature_Limit()
      return Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload(value)
    }

    def readBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = readBase_TypesBoolean_PayloadT(F)
      return r
    }

    def readBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBoolean_Payload)
      }
      val value = reader.readB()
      return Base_Types.Boolean_Payload(value)
    }

    def readBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = readBase_TypesInteger_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_Payload)
      }
      val value = reader.readZ()
      return Base_Types.Integer_Payload(value)
    }

    def readBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = readBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_8_Payload)
      }
      val value = reader.readS8()
      return Base_Types.Integer_8_Payload(value)
    }

    def readBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = readBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_16_Payload)
      }
      val value = reader.readS16()
      return Base_Types.Integer_16_Payload(value)
    }

    def readBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = readBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_32_Payload)
      }
      val value = reader.readS32()
      return Base_Types.Integer_32_Payload(value)
    }

    def readBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = readBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_64_Payload)
      }
      val value = reader.readS64()
      return Base_Types.Integer_64_Payload(value)
    }

    def readBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = readBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_8_Payload)
      }
      val value = reader.readU8()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def readBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = readBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_16_Payload)
      }
      val value = reader.readU16()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def readBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = readBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_32_Payload)
      }
      val value = reader.readU32()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def readBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = readBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_64_Payload)
      }
      val value = reader.readU64()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def readBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = readBase_TypesFloat_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_Payload)
      }
      val value = reader.readR()
      return Base_Types.Float_Payload(value)
    }

    def readBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = readBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_32_Payload)
      }
      val value = reader.readF32()
      return Base_Types.Float_32_Payload(value)
    }

    def readBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = readBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_64_Payload)
      }
      val value = reader.readF64()
      return Base_Types.Float_64_Payload(value)
    }

    def readBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = readBase_TypesCharacter_PayloadT(F)
      return r
    }

    def readBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesCharacter_Payload)
      }
      val value = reader.readC()
      return Base_Types.Character_Payload(value)
    }

    def readBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = readBase_TypesString_PayloadT(F)
      return r
    }

    def readBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesString_Payload)
      }
      val value = reader.readString()
      return Base_Types.String_Payload(value)
    }

    def readBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = readBase_TypesBits_PayloadT(F)
      return r
    }

    def readBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBits_Payload)
      }
      val value = reader.readISZ(reader.readB _)
      return Base_Types.Bits_Payload(value)
    }

    def readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container(): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P => val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS => val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container.")
          val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PST(T)
          return r
      }
    }

    def readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P = {
      val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PT(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P)
      }
      val api_temperature_in = readDual_Zone_GreenhouseTemperature_Celsius()
      val api_validity_in = readDual_Zone_GreenhouseSensor_ValidityType()
      return Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(api_temperature_in, api_validity_in)
    }

    def readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS = {
      val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PST(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS)
      }
      val api_temperature_in = readDual_Zone_GreenhouseTemperature_Celsius()
      val api_validity_in = readDual_Zone_GreenhouseSensor_ValidityType()
      return Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(api_temperature_in, api_validity_in)
    }

    def readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container(): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P => val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS => val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container.")
          val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PST(T)
          return r
      }
    }

    def readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P = {
      val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PT(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P)
      }
      val api_temperature_out = readDual_Zone_GreenhouseTemperature_Celsius()
      val api_validity_out = readDual_Zone_GreenhouseSensor_ValidityType()
      return Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(api_temperature_out, api_validity_out)
    }

    def readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS = {
      val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PST(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS)
      }
      val api_temperature_out = readDual_Zone_GreenhouseTemperature_Celsius()
      val api_validity_out = readDual_Zone_GreenhouseSensor_ValidityType()
      return Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(api_temperature_out, api_validity_out)
    }

    def readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container(): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P => val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS => val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container.")
          val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PST(T)
          return r
      }
    }

    def readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P = {
      val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PT(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P)
      }
      val api_temperature_in = readDual_Zone_GreenhouseTemperature_Celsius()
      val api_validity_in = readDual_Zone_GreenhouseSensor_ValidityType()
      return Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(api_temperature_in, api_validity_in)
    }

    def readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS = {
      val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PST(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS)
      }
      val api_temperature_in = readDual_Zone_GreenhouseTemperature_Celsius()
      val api_validity_in = readDual_Zone_GreenhouseSensor_ValidityType()
      return Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(api_temperature_in, api_validity_in)
    }

    def readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container(): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P => val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS => val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container.")
          val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PST(T)
          return r
      }
    }

    def readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P = {
      val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PT(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P)
      }
      val api_temperature_out = readDual_Zone_GreenhouseTemperature_Celsius()
      val api_validity_out = readDual_Zone_GreenhouseSensor_ValidityType()
      return Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(api_temperature_out, api_validity_out)
    }

    def readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS = {
      val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PST(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS)
      }
      val api_temperature_out = readDual_Zone_GreenhouseTemperature_Celsius()
      val api_validity_out = readDual_Zone_GreenhouseSensor_ValidityType()
      return Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(api_temperature_out, api_validity_out)
    }

    def readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container(): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P => val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS => val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container.")
          val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PST(T)
          return r
      }
    }

    def readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P = {
      val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PT(F)
      return r
    }

    def readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P)
      }
      val api_preference_in = readDual_Zone_GreenhouseContention_PreferenceType()
      val api_upper_limit_in = readDual_Zone_GreenhouseUpper_Temperature_Limit()
      return Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(api_preference_in, api_upper_limit_in)
    }

    def readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS = {
      val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PST(F)
      return r
    }

    def readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS)
      }
      val api_preference_in = readDual_Zone_GreenhouseContention_PreferenceType()
      val api_upper_limit_in = readDual_Zone_GreenhouseUpper_Temperature_Limit()
      return Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(api_preference_in, api_upper_limit_in)
    }

    def readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container(): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P => val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS => val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container.")
          val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(T)
          return r
      }
    }

    def readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P = {
      val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PT(F)
      return r
    }

    def readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P)
      }
      val api_preference_out = readDual_Zone_GreenhouseContention_PreferenceType()
      val api_upper_limit_for_a = readDual_Zone_GreenhouseUpper_Temperature_Limit()
      val api_upper_limit_for_b = readDual_Zone_GreenhouseUpper_Temperature_Limit()
      return Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(api_preference_out, api_upper_limit_for_a, api_upper_limit_for_b)
    }

    def readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS = {
      val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(F)
      return r
    }

    def readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS)
      }
      val api_preference_out = readDual_Zone_GreenhouseContention_PreferenceType()
      val api_upper_limit_for_a = readDual_Zone_GreenhouseUpper_Temperature_Limit()
      val api_upper_limit_for_b = readDual_Zone_GreenhouseUpper_Temperature_Limit()
      return Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(api_preference_out, api_upper_limit_for_a, api_upper_limit_for_b)
    }

    def readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container(): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P => val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS => val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container.")
          val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PST(T)
          return r
      }
    }

    def readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P = {
      val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PT(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P)
      }
      val api_temperature = readDual_Zone_GreenhouseTemperature_Celsius()
      val api_upper_limit = readDual_Zone_GreenhouseUpper_Temperature_Limit()
      val api_validity = readDual_Zone_GreenhouseSensor_ValidityType()
      return Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(api_temperature, api_upper_limit, api_validity)
    }

    def readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS = {
      val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PST(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS)
      }
      val api_temperature = readDual_Zone_GreenhouseTemperature_Celsius()
      val api_upper_limit = readDual_Zone_GreenhouseUpper_Temperature_Limit()
      val api_validity = readDual_Zone_GreenhouseSensor_ValidityType()
      return Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(api_temperature, api_upper_limit, api_validity)
    }

    def readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container(): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P => val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS => val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container.")
          val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PST(T)
          return r
      }
    }

    def readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P = {
      val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PT(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P)
      }
      val api_eligibility = readDual_Zone_GreenhouseVentilation_EligibilityType()
      val api_sensor_fault = readDual_Zone_GreenhouseSensor_Fault_IndicationType()
      return Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(api_eligibility, api_sensor_fault)
    }

    def readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS = {
      val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PST(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS)
      }
      val api_eligibility = readDual_Zone_GreenhouseVentilation_EligibilityType()
      val api_sensor_fault = readDual_Zone_GreenhouseSensor_Fault_IndicationType()
      return Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(api_eligibility, api_sensor_fault)
    }

    def readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container(): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P => val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS => val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container.")
          val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PST(T)
          return r
      }
    }

    def readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P = {
      val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PT(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P)
      }
      val api_temperature = readDual_Zone_GreenhouseTemperature_Celsius()
      val api_upper_limit = readDual_Zone_GreenhouseUpper_Temperature_Limit()
      val api_validity = readDual_Zone_GreenhouseSensor_ValidityType()
      return Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(api_temperature, api_upper_limit, api_validity)
    }

    def readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS = {
      val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PST(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS)
      }
      val api_temperature = readDual_Zone_GreenhouseTemperature_Celsius()
      val api_upper_limit = readDual_Zone_GreenhouseUpper_Temperature_Limit()
      val api_validity = readDual_Zone_GreenhouseSensor_ValidityType()
      return Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(api_temperature, api_upper_limit, api_validity)
    }

    def readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container(): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P => val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS => val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container.")
          val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PST(T)
          return r
      }
    }

    def readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P = {
      val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PT(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P)
      }
      val api_eligibility = readDual_Zone_GreenhouseVentilation_EligibilityType()
      val api_sensor_fault = readDual_Zone_GreenhouseSensor_Fault_IndicationType()
      return Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(api_eligibility, api_sensor_fault)
    }

    def readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS = {
      val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PST(F)
      return r
    }

    def readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS)
      }
      val api_eligibility = readDual_Zone_GreenhouseVentilation_EligibilityType()
      val api_sensor_fault = readDual_Zone_GreenhouseSensor_Fault_IndicationType()
      return Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(api_eligibility, api_sensor_fault)
    }

    def readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container(): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P => val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS => val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container.")
          val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P = {
      val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PT(F)
      return r
    }

    def readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P)
      }
      val api_preference = readDual_Zone_GreenhouseContention_PreferenceType()
      val api_zone_a_eligibility = readDual_Zone_GreenhouseVentilation_EligibilityType()
      val api_zone_b_eligibility = readDual_Zone_GreenhouseVentilation_EligibilityType()
      return Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(api_preference, api_zone_a_eligibility, api_zone_b_eligibility)
    }

    def readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS = {
      val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PST(F)
      return r
    }

    def readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS)
      }
      val api_preference = readDual_Zone_GreenhouseContention_PreferenceType()
      val api_zone_a_eligibility = readDual_Zone_GreenhouseVentilation_EligibilityType()
      val api_zone_b_eligibility = readDual_Zone_GreenhouseVentilation_EligibilityType()
      return Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(api_preference, api_zone_a_eligibility, api_zone_b_eligibility)
    }

    def readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container(): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P => val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS => val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container.")
          val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P = {
      val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PT(F)
      return r
    }

    def readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P)
      }
      val api_zone_a_fan_command = readDual_Zone_GreenhouseFan_CommandType()
      val api_zone_b_fan_command = readDual_Zone_GreenhouseFan_CommandType()
      return Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(api_zone_a_fan_command, api_zone_b_fan_command)
    }

    def readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS = {
      val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PST(F)
      return r
    }

    def readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS)
      }
      val api_zone_a_fan_command = readDual_Zone_GreenhouseFan_CommandType()
      val api_zone_b_fan_command = readDual_Zone_GreenhouseFan_CommandType()
      return Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(api_zone_a_fan_command, api_zone_b_fan_command)
    }

    def readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container(): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P => val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS => val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container.")
          val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PST(T)
          return r
      }
    }

    def readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P = {
      val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PT(F)
      return r
    }

    def readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P)
      }
      val api_zone_a_fan_command_in = readDual_Zone_GreenhouseFan_CommandType()
      val api_zone_a_sensor_fault_in = readDual_Zone_GreenhouseSensor_Fault_IndicationType()
      val api_zone_b_fan_command_in = readDual_Zone_GreenhouseFan_CommandType()
      val api_zone_b_sensor_fault_in = readDual_Zone_GreenhouseSensor_Fault_IndicationType()
      return Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(api_zone_a_fan_command_in, api_zone_a_sensor_fault_in, api_zone_b_fan_command_in, api_zone_b_sensor_fault_in)
    }

    def readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS = {
      val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PST(F)
      return r
    }

    def readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS)
      }
      val api_zone_a_fan_command_in = readDual_Zone_GreenhouseFan_CommandType()
      val api_zone_a_sensor_fault_in = readDual_Zone_GreenhouseSensor_Fault_IndicationType()
      val api_zone_b_fan_command_in = readDual_Zone_GreenhouseFan_CommandType()
      val api_zone_b_sensor_fault_in = readDual_Zone_GreenhouseSensor_Fault_IndicationType()
      return Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(api_zone_a_fan_command_in, api_zone_a_sensor_fault_in, api_zone_b_fan_command_in, api_zone_b_sensor_fault_in)
    }

    def readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container(): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P => val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS => val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container.")
          val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PST(T)
          return r
      }
    }

    def readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P = {
      val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PT(F)
      return r
    }

    def readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PT(typeParsed: B): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P)
      }
      val api_zone_a_fan_command_out = readDual_Zone_GreenhouseFan_CommandType()
      val api_zone_a_sensor_fault_out = readDual_Zone_GreenhouseSensor_Fault_IndicationType()
      val api_zone_b_fan_command_out = readDual_Zone_GreenhouseFan_CommandType()
      val api_zone_b_sensor_fault_out = readDual_Zone_GreenhouseSensor_Fault_IndicationType()
      return Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(api_zone_a_fan_command_out, api_zone_a_sensor_fault_out, api_zone_b_fan_command_out, api_zone_b_sensor_fault_out)
    }

    def readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS = {
      val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PST(F)
      return r
    }

    def readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PST(typeParsed: B): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS)
      }
      val api_zone_a_fan_command_out = readDual_Zone_GreenhouseFan_CommandType()
      val api_zone_a_sensor_fault_out = readDual_Zone_GreenhouseSensor_Fault_IndicationType()
      val api_zone_b_fan_command_out = readDual_Zone_GreenhouseFan_CommandType()
      val api_zone_b_sensor_fault_out = readDual_Zone_GreenhouseSensor_Fault_IndicationType()
      return Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(api_zone_a_fan_command_out, api_zone_a_sensor_fault_out, api_zone_b_fan_command_out, api_zone_b_sensor_fault_out)
    }

    def readruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = reader.readZ()
      return runtimemonitor.ObservationKind.byOrdinal(r).get
    }

    def readutilContainer(): util.Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P => val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P => val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS => val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS => val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P => val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P => val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS => val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS => val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P => val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P => val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS => val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS => val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P => val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P => val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS => val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS => val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P => val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS => val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P => val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS => val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P => val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS => val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P => val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS => val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P => val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS => val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P => val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS => val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(T)
          return r
      }
    }

    def readutilEmptyContainer(): util.EmptyContainer = {
      val r = readutilEmptyContainerT(F)
      return r
    }

    def readutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        reader.expectZ(Constants.utilEmptyContainer)
      }
      return util.EmptyContainer()
    }

    def read_artDataContent(): art.DataContent = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._artEmpty => val r = read_artEmptyT(T); return r
        case Constants.Base_TypesBoolean_Payload => val r = readBase_TypesBoolean_PayloadT(T); return r
        case Constants.Base_TypesInteger_Payload => val r = readBase_TypesInteger_PayloadT(T); return r
        case Constants.Base_TypesInteger_8_Payload => val r = readBase_TypesInteger_8_PayloadT(T); return r
        case Constants.Base_TypesInteger_16_Payload => val r = readBase_TypesInteger_16_PayloadT(T); return r
        case Constants.Base_TypesInteger_32_Payload => val r = readBase_TypesInteger_32_PayloadT(T); return r
        case Constants.Base_TypesInteger_64_Payload => val r = readBase_TypesInteger_64_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_8_Payload => val r = readBase_TypesUnsigned_8_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_16_Payload => val r = readBase_TypesUnsigned_16_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_32_Payload => val r = readBase_TypesUnsigned_32_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_64_Payload => val r = readBase_TypesUnsigned_64_PayloadT(T); return r
        case Constants.Base_TypesFloat_Payload => val r = readBase_TypesFloat_PayloadT(T); return r
        case Constants.Base_TypesFloat_32_Payload => val r = readBase_TypesFloat_32_PayloadT(T); return r
        case Constants.Base_TypesFloat_64_Payload => val r = readBase_TypesFloat_64_PayloadT(T); return r
        case Constants.Base_TypesCharacter_Payload => val r = readBase_TypesCharacter_PayloadT(T); return r
        case Constants.Base_TypesString_Payload => val r = readBase_TypesString_PayloadT(T); return r
        case Constants.Base_TypesBits_Payload => val r = readBase_TypesBits_PayloadT(T); return r
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Dual_Zone_GreenhouseFan_Command_Payload => val r = readDual_Zone_GreenhouseFan_Command_PayloadT(T); return r
        case Constants.Dual_Zone_GreenhouseSensor_Validity_Payload => val r = readDual_Zone_GreenhouseSensor_Validity_PayloadT(T); return r
        case Constants.Dual_Zone_GreenhouseTemperature_Celsius_Payload => val r = readDual_Zone_GreenhouseTemperature_Celsius_PayloadT(T); return r
        case Constants.Dual_Zone_GreenhouseContention_Preference_Payload => val r = readDual_Zone_GreenhouseContention_Preference_PayloadT(T); return r
        case Constants.Dual_Zone_GreenhouseSensor_Fault_Indication_Payload => val r = readDual_Zone_GreenhouseSensor_Fault_Indication_PayloadT(T); return r
        case Constants.Dual_Zone_GreenhouseVentilation_Eligibility_Payload => val r = readDual_Zone_GreenhouseVentilation_Eligibility_PayloadT(T); return r
        case Constants.Dual_Zone_GreenhouseUpper_Temperature_Limit_Payload => val r = readDual_Zone_GreenhouseUpper_Temperature_Limit_PayloadT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P => val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P => val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS => val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS => val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P => val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P => val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS => val r = readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS => val r = readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P => val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P => val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS => val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS => val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P => val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P => val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS => val r = readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS => val r = readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P => val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS => val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P => val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS => val r = readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P => val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS => val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P => val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS => val r = readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P => val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS => val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PST(T); return r
        case Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P => val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PT(T); return r
        case Constants.Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS => val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PST(T)
          return r
      }
    }

    def read_artEmpty(): art.Empty = {
      val r = read_artEmptyT(F)
      return r
    }

    def read_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        reader.expectZ(Constants._artEmpty)
      }
      return art.Empty()
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromDual_Zone_GreenhouseSensor_Validity_Payload(o: Dual_Zone_Greenhouse.Sensor_Validity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseSensor_Validity_Payload(o)
    return w.result
  }

  def toDual_Zone_GreenhouseSensor_Validity_Payload(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Sensor_Validity_Payload, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseSensor_Validity_Payload(reader: Reader): Dual_Zone_Greenhouse.Sensor_Validity_Payload = {
      val r = reader.readDual_Zone_GreenhouseSensor_Validity_Payload()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseSensor_Validity_Payload _)
    return r
  }

  def fromDual_Zone_GreenhouseContention_Preference_Payload(o: Dual_Zone_Greenhouse.Contention_Preference_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseContention_Preference_Payload(o)
    return w.result
  }

  def toDual_Zone_GreenhouseContention_Preference_Payload(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Contention_Preference_Payload, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseContention_Preference_Payload(reader: Reader): Dual_Zone_Greenhouse.Contention_Preference_Payload = {
      val r = reader.readDual_Zone_GreenhouseContention_Preference_Payload()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseContention_Preference_Payload _)
    return r
  }

  def fromDual_Zone_GreenhouseVentilation_Eligibility_Payload(o: Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseVentilation_Eligibility_Payload(o)
    return w.result
  }

  def toDual_Zone_GreenhouseVentilation_Eligibility_Payload(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseVentilation_Eligibility_Payload(reader: Reader): Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload = {
      val r = reader.readDual_Zone_GreenhouseVentilation_Eligibility_Payload()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseVentilation_Eligibility_Payload _)
    return r
  }

  def fromDual_Zone_GreenhouseSensor_Fault_Indication_Payload(o: Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseSensor_Fault_Indication_Payload(o)
    return w.result
  }

  def toDual_Zone_GreenhouseSensor_Fault_Indication_Payload(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseSensor_Fault_Indication_Payload(reader: Reader): Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload = {
      val r = reader.readDual_Zone_GreenhouseSensor_Fault_Indication_Payload()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseSensor_Fault_Indication_Payload _)
    return r
  }

  def fromDual_Zone_GreenhouseFan_Command_Payload(o: Dual_Zone_Greenhouse.Fan_Command_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseFan_Command_Payload(o)
    return w.result
  }

  def toDual_Zone_GreenhouseFan_Command_Payload(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Fan_Command_Payload, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseFan_Command_Payload(reader: Reader): Dual_Zone_Greenhouse.Fan_Command_Payload = {
      val r = reader.readDual_Zone_GreenhouseFan_Command_Payload()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseFan_Command_Payload _)
    return r
  }

  def fromDual_Zone_GreenhouseTemperature_Celsius(o: Dual_Zone_Greenhouse.Temperature_Celsius, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseTemperature_Celsius(o)
    return w.result
  }

  def toDual_Zone_GreenhouseTemperature_Celsius(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Temperature_Celsius, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseTemperature_Celsius(reader: Reader): Dual_Zone_Greenhouse.Temperature_Celsius = {
      val r = reader.readDual_Zone_GreenhouseTemperature_Celsius()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseTemperature_Celsius _)
    return r
  }

  def fromDual_Zone_GreenhouseTemperature_Celsius_Payload(o: Dual_Zone_Greenhouse.Temperature_Celsius_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseTemperature_Celsius_Payload(o)
    return w.result
  }

  def toDual_Zone_GreenhouseTemperature_Celsius_Payload(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Temperature_Celsius_Payload, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseTemperature_Celsius_Payload(reader: Reader): Dual_Zone_Greenhouse.Temperature_Celsius_Payload = {
      val r = reader.readDual_Zone_GreenhouseTemperature_Celsius_Payload()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseTemperature_Celsius_Payload _)
    return r
  }

  def fromDual_Zone_GreenhouseUpper_Temperature_Limit(o: Dual_Zone_Greenhouse.Upper_Temperature_Limit, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseUpper_Temperature_Limit(o)
    return w.result
  }

  def toDual_Zone_GreenhouseUpper_Temperature_Limit(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Upper_Temperature_Limit, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseUpper_Temperature_Limit(reader: Reader): Dual_Zone_Greenhouse.Upper_Temperature_Limit = {
      val r = reader.readDual_Zone_GreenhouseUpper_Temperature_Limit()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseUpper_Temperature_Limit _)
    return r
  }

  def fromDual_Zone_GreenhouseUpper_Temperature_Limit_Payload(o: Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseUpper_Temperature_Limit_Payload(o)
    return w.result
  }

  def toDual_Zone_GreenhouseUpper_Temperature_Limit_Payload(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseUpper_Temperature_Limit_Payload(reader: Reader): Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload = {
      val r = reader.readDual_Zone_GreenhouseUpper_Temperature_Limit_Payload()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseUpper_Temperature_Limit_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBoolean_Payload(o)
    return w.result
  }

  def toBase_TypesBoolean_Payload(data: ISZ[U8]): Either[Base_Types.Boolean_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(reader: Reader): Base_Types.Boolean_Payload = {
      val r = reader.readBase_TypesBoolean_Payload()
      return r
    }
    val r = to(data, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_Payload(data: ISZ[U8]): Either[Base_Types.Integer_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_Payload(reader: Reader): Base_Types.Integer_Payload = {
      val r = reader.readBase_TypesInteger_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_8_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_8_Payload(data: ISZ[U8]): Either[Base_Types.Integer_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(reader: Reader): Base_Types.Integer_8_Payload = {
      val r = reader.readBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_16_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_16_Payload(data: ISZ[U8]): Either[Base_Types.Integer_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(reader: Reader): Base_Types.Integer_16_Payload = {
      val r = reader.readBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_32_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_32_Payload(data: ISZ[U8]): Either[Base_Types.Integer_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(reader: Reader): Base_Types.Integer_32_Payload = {
      val r = reader.readBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_64_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_64_Payload(data: ISZ[U8]): Either[Base_Types.Integer_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(reader: Reader): Base_Types.Integer_64_Payload = {
      val r = reader.readBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_8_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_8_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(reader: Reader): Base_Types.Unsigned_8_Payload = {
      val r = reader.readBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_16_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_16_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(reader: Reader): Base_Types.Unsigned_16_Payload = {
      val r = reader.readBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_32_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_32_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(reader: Reader): Base_Types.Unsigned_32_Payload = {
      val r = reader.readBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_64_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_64_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(reader: Reader): Base_Types.Unsigned_64_Payload = {
      val r = reader.readBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_Payload(data: ISZ[U8]): Either[Base_Types.Float_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_Payload(reader: Reader): Base_Types.Float_Payload = {
      val r = reader.readBase_TypesFloat_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_32_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_32_Payload(data: ISZ[U8]): Either[Base_Types.Float_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(reader: Reader): Base_Types.Float_32_Payload = {
      val r = reader.readBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_64_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_64_Payload(data: ISZ[U8]): Either[Base_Types.Float_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(reader: Reader): Base_Types.Float_64_Payload = {
      val r = reader.readBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesCharacter_Payload(o)
    return w.result
  }

  def toBase_TypesCharacter_Payload(data: ISZ[U8]): Either[Base_Types.Character_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(reader: Reader): Base_Types.Character_Payload = {
      val r = reader.readBase_TypesCharacter_Payload()
      return r
    }
    val r = to(data, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesString_Payload(o)
    return w.result
  }

  def toBase_TypesString_Payload(data: ISZ[U8]): Either[Base_Types.String_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesString_Payload(reader: Reader): Base_Types.String_Payload = {
      val r = reader.readBase_TypesString_Payload()
      return r
    }
    val r = to(data, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBits_Payload(o)
    return w.result
  }

  def toBase_TypesBits_Payload(data: ISZ[U8]): Either[Base_Types.Bits_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBits_Payload(reader: Reader): Base_Types.Bits_Payload = {
      val r = reader.readBase_TypesBits_Payload()
      return r
    }
    val r = to(data, fBase_TypesBits_Payload _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container(reader: Reader): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container = {
      val r = reader.readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(reader: Reader): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P = {
      val r = reader.readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(reader: Reader): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS = {
      val r = reader.readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container(reader: Reader): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container = {
      val r = reader.readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(reader: Reader): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P = {
      val r = reader.readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(reader: Reader): Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS = {
      val r = reader.readDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container(reader: Reader): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container = {
      val r = reader.readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(reader: Reader): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P = {
      val r = reader.readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(reader: Reader): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS = {
      val r = reader.readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container(reader: Reader): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container = {
      val r = reader.readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(reader: Reader): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P = {
      val r = reader.readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(reader: Reader): Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS = {
      val r = reader.readDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container(o)
    return w.result
  }

  def toDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container(reader: Reader): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container = {
      val r = reader.readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(o)
    return w.result
  }

  def toDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(reader: Reader): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P = {
      val r = reader.readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(o)
    return w.result
  }

  def toDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(reader: Reader): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS = {
      val r = reader.readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container(o)
    return w.result
  }

  def toDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container(reader: Reader): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container = {
      val r = reader.readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(o)
    return w.result
  }

  def toDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(reader: Reader): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P = {
      val r = reader.readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(o: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(o)
    return w.result
  }

  def toDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(reader: Reader): Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS = {
      val r = reader.readDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container(reader: Reader): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container = {
      val r = reader.readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(reader: Reader): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P = {
      val r = reader.readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(reader: Reader): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS = {
      val r = reader.readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container(reader: Reader): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container = {
      val r = reader.readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(reader: Reader): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P = {
      val r = reader.readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(reader: Reader): Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS = {
      val r = reader.readDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container(reader: Reader): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container = {
      val r = reader.readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(reader: Reader): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P = {
      val r = reader.readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(reader: Reader): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS = {
      val r = reader.readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container(reader: Reader): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container = {
      val r = reader.readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(reader: Reader): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P = {
      val r = reader.readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(o: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(o)
    return w.result
  }

  def toDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(reader: Reader): Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS = {
      val r = reader.readDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container(o)
    return w.result
  }

  def toDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container(reader: Reader): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container = {
      val r = reader.readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(o)
    return w.result
  }

  def toDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(reader: Reader): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P = {
      val r = reader.readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(o)
    return w.result
  }

  def toDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(reader: Reader): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS = {
      val r = reader.readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container(o)
    return w.result
  }

  def toDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container(reader: Reader): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container = {
      val r = reader.readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(o)
    return w.result
  }

  def toDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(reader: Reader): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P = {
      val r = reader.readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(o: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(o)
    return w.result
  }

  def toDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(reader: Reader): Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS = {
      val r = reader.readDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container(o)
    return w.result
  }

  def toDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container(reader: Reader): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container = {
      val r = reader.readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(o)
    return w.result
  }

  def toDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(reader: Reader): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P = {
      val r = reader.readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(o)
    return w.result
  }

  def toDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(reader: Reader): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS = {
      val r = reader.readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS _)
    return r
  }

  def fromDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container(o)
    return w.result
  }

  def toDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container(reader: Reader): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container = {
      val r = reader.readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container _)
    return r
  }

  def fromDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(o)
    return w.result
  }

  def toDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(reader: Reader): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P = {
      val r = reader.readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P _)
    return r
  }

  def fromDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(o: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(o)
    return w.result
  }

  def toDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(data: ISZ[U8]): Either[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(reader: Reader): Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS = {
      val r = reader.readDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS()
      return r
    }
    val r = to(data, fDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilContainer(o)
    return w.result
  }

  def toutilContainer(data: ISZ[U8]): Either[util.Container, MessagePack.ErrorMsg] = {
    def futilContainer(reader: Reader): util.Container = {
      val r = reader.readutilContainer()
      return r
    }
    val r = to(data, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilEmptyContainer(o)
    return w.result
  }

  def toutilEmptyContainer(data: ISZ[U8]): Either[util.EmptyContainer, MessagePack.ErrorMsg] = {
    def futilEmptyContainer(reader: Reader): util.EmptyContainer = {
      val r = reader.readutilEmptyContainer()
      return r
    }
    val r = to(data, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artDataContent(o)
    return w.result
  }

  def to_artDataContent(data: ISZ[U8]): Either[art.DataContent, MessagePack.ErrorMsg] = {
    def f_artDataContent(reader: Reader): art.DataContent = {
      val r = reader.read_artDataContent()
      return r
    }
    val r = to(data, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artEmpty(o)
    return w.result
  }

  def to_artEmpty(data: ISZ[U8]): Either[art.Empty, MessagePack.ErrorMsg] = {
    def f_artEmpty(reader: Reader): art.Empty = {
      val r = reader.read_artEmpty()
      return r
    }
    val r = to(data, f_artEmpty _)
    return r
  }

}