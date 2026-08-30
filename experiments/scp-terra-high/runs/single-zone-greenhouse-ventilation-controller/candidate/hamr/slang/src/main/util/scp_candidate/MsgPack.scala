// #Sireum
// @formatter:off

// This file is auto-generated from Temperature_Validity.scala, Fan_Command.scala, Sensor_Fault_Indication.scala, Temperature_Celsius.scala, Upper_Temperature_Limit.scala, Base_Types.scala, Ventilation_Decision_i_control_process_ventilation_decision_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Greenhouse_VentilationTemperature_Validity_Payload: Z = -32

    val Greenhouse_VentilationFan_Command_Payload: Z = -31

    val Greenhouse_VentilationSensor_Fault_Indication_Payload: Z = -30

    val Greenhouse_VentilationTemperature_Celsius: Z = -29

    val Greenhouse_VentilationTemperature_Celsius_Payload: Z = -28

    val Greenhouse_VentilationUpper_Temperature_Limit: Z = -27

    val Greenhouse_VentilationUpper_Temperature_Limit_Payload: Z = -26

    val Base_TypesBoolean_Payload: Z = -25

    val Base_TypesInteger_Payload: Z = -24

    val Base_TypesInteger_8_Payload: Z = -23

    val Base_TypesInteger_16_Payload: Z = -22

    val Base_TypesInteger_32_Payload: Z = -21

    val Base_TypesInteger_64_Payload: Z = -20

    val Base_TypesUnsigned_8_Payload: Z = -19

    val Base_TypesUnsigned_16_Payload: Z = -18

    val Base_TypesUnsigned_32_Payload: Z = -17

    val Base_TypesUnsigned_64_Payload: Z = -16

    val Base_TypesFloat_Payload: Z = -15

    val Base_TypesFloat_32_Payload: Z = -14

    val Base_TypesFloat_64_Payload: Z = -13

    val Base_TypesCharacter_Payload: Z = -12

    val Base_TypesString_Payload: Z = -11

    val Base_TypesBits_Payload: Z = -10

    val Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P: Z = -9

    val Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS: Z = -8

    val Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P: Z = -7

    val Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS: Z = -6

    val utilEmptyContainer: Z = -5

    val _artEmpty: Z = -4

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeGreenhouse_VentilationTemperature_ValidityType(o: Greenhouse_Ventilation.Temperature_Validity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeGreenhouse_VentilationTemperature_Validity_Payload(o: Greenhouse_Ventilation.Temperature_Validity_Payload): Unit = {
      writer.writeZ(Constants.Greenhouse_VentilationTemperature_Validity_Payload)
      writeGreenhouse_VentilationTemperature_ValidityType(o.value)
    }

    def writeGreenhouse_VentilationFan_CommandType(o: Greenhouse_Ventilation.Fan_Command.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeGreenhouse_VentilationFan_Command_Payload(o: Greenhouse_Ventilation.Fan_Command_Payload): Unit = {
      writer.writeZ(Constants.Greenhouse_VentilationFan_Command_Payload)
      writeGreenhouse_VentilationFan_CommandType(o.value)
    }

    def writeGreenhouse_VentilationSensor_Fault_IndicationType(o: Greenhouse_Ventilation.Sensor_Fault_Indication.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeGreenhouse_VentilationSensor_Fault_Indication_Payload(o: Greenhouse_Ventilation.Sensor_Fault_Indication_Payload): Unit = {
      writer.writeZ(Constants.Greenhouse_VentilationSensor_Fault_Indication_Payload)
      writeGreenhouse_VentilationSensor_Fault_IndicationType(o.value)
    }

    def writeGreenhouse_VentilationTemperature_Celsius(o: Greenhouse_Ventilation.Temperature_Celsius): Unit = {
      writer.writeZ(Constants.Greenhouse_VentilationTemperature_Celsius)
      writer.writeS32(o.degrees_celsius)
    }

    def writeGreenhouse_VentilationTemperature_Celsius_Payload(o: Greenhouse_Ventilation.Temperature_Celsius_Payload): Unit = {
      writer.writeZ(Constants.Greenhouse_VentilationTemperature_Celsius_Payload)
      writeGreenhouse_VentilationTemperature_Celsius(o.value)
    }

    def writeGreenhouse_VentilationUpper_Temperature_Limit(o: Greenhouse_Ventilation.Upper_Temperature_Limit): Unit = {
      writer.writeZ(Constants.Greenhouse_VentilationUpper_Temperature_Limit)
      writer.writeS32(o.degrees_celsius)
    }

    def writeGreenhouse_VentilationUpper_Temperature_Limit_Payload(o: Greenhouse_Ventilation.Upper_Temperature_Limit_Payload): Unit = {
      writer.writeZ(Constants.Greenhouse_VentilationUpper_Temperature_Limit_Payload)
      writeGreenhouse_VentilationUpper_Temperature_Limit(o.value)
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

    def writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container): Unit = {
      o match {
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P => writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS => writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(o)
      }
    }

    def writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P)
      writeGreenhouse_VentilationTemperature_Celsius(o.api_temperature)
      writeGreenhouse_VentilationUpper_Temperature_Limit(o.api_upper_limit)
      writeGreenhouse_VentilationTemperature_ValidityType(o.api_validity)
    }

    def writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS)
      writeGreenhouse_VentilationTemperature_Celsius(o.api_temperature)
      writeGreenhouse_VentilationUpper_Temperature_Limit(o.api_upper_limit)
      writeGreenhouse_VentilationTemperature_ValidityType(o.api_validity)
    }

    def writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container): Unit = {
      o match {
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P => writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS => writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(o)
      }
    }

    def writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P)
      writeGreenhouse_VentilationFan_CommandType(o.api_fan_command)
      writeGreenhouse_VentilationSensor_Fault_IndicationType(o.api_sensor_fault)
    }

    def writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS)
      writeGreenhouse_VentilationFan_CommandType(o.api_fan_command)
      writeGreenhouse_VentilationSensor_Fault_IndicationType(o.api_sensor_fault)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P => writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS => writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P => writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS => writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(o)
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
        case o: Greenhouse_Ventilation.Fan_Command_Payload => writeGreenhouse_VentilationFan_Command_Payload(o)
        case o: Greenhouse_Ventilation.Temperature_Celsius_Payload => writeGreenhouse_VentilationTemperature_Celsius_Payload(o)
        case o: Greenhouse_Ventilation.Temperature_Validity_Payload => writeGreenhouse_VentilationTemperature_Validity_Payload(o)
        case o: Greenhouse_Ventilation.Sensor_Fault_Indication_Payload => writeGreenhouse_VentilationSensor_Fault_Indication_Payload(o)
        case o: Greenhouse_Ventilation.Upper_Temperature_Limit_Payload => writeGreenhouse_VentilationUpper_Temperature_Limit_Payload(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P => writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS => writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P => writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS => writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(o)
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

    def readGreenhouse_VentilationTemperature_ValidityType(): Greenhouse_Ventilation.Temperature_Validity.Type = {
      val r = reader.readZ()
      return Greenhouse_Ventilation.Temperature_Validity.byOrdinal(r).get
    }

    def readGreenhouse_VentilationTemperature_Validity_Payload(): Greenhouse_Ventilation.Temperature_Validity_Payload = {
      val r = readGreenhouse_VentilationTemperature_Validity_PayloadT(F)
      return r
    }

    def readGreenhouse_VentilationTemperature_Validity_PayloadT(typeParsed: B): Greenhouse_Ventilation.Temperature_Validity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Greenhouse_VentilationTemperature_Validity_Payload)
      }
      val value = readGreenhouse_VentilationTemperature_ValidityType()
      return Greenhouse_Ventilation.Temperature_Validity_Payload(value)
    }

    def readGreenhouse_VentilationFan_CommandType(): Greenhouse_Ventilation.Fan_Command.Type = {
      val r = reader.readZ()
      return Greenhouse_Ventilation.Fan_Command.byOrdinal(r).get
    }

    def readGreenhouse_VentilationFan_Command_Payload(): Greenhouse_Ventilation.Fan_Command_Payload = {
      val r = readGreenhouse_VentilationFan_Command_PayloadT(F)
      return r
    }

    def readGreenhouse_VentilationFan_Command_PayloadT(typeParsed: B): Greenhouse_Ventilation.Fan_Command_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Greenhouse_VentilationFan_Command_Payload)
      }
      val value = readGreenhouse_VentilationFan_CommandType()
      return Greenhouse_Ventilation.Fan_Command_Payload(value)
    }

    def readGreenhouse_VentilationSensor_Fault_IndicationType(): Greenhouse_Ventilation.Sensor_Fault_Indication.Type = {
      val r = reader.readZ()
      return Greenhouse_Ventilation.Sensor_Fault_Indication.byOrdinal(r).get
    }

    def readGreenhouse_VentilationSensor_Fault_Indication_Payload(): Greenhouse_Ventilation.Sensor_Fault_Indication_Payload = {
      val r = readGreenhouse_VentilationSensor_Fault_Indication_PayloadT(F)
      return r
    }

    def readGreenhouse_VentilationSensor_Fault_Indication_PayloadT(typeParsed: B): Greenhouse_Ventilation.Sensor_Fault_Indication_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Greenhouse_VentilationSensor_Fault_Indication_Payload)
      }
      val value = readGreenhouse_VentilationSensor_Fault_IndicationType()
      return Greenhouse_Ventilation.Sensor_Fault_Indication_Payload(value)
    }

    def readGreenhouse_VentilationTemperature_Celsius(): Greenhouse_Ventilation.Temperature_Celsius = {
      val r = readGreenhouse_VentilationTemperature_CelsiusT(F)
      return r
    }

    def readGreenhouse_VentilationTemperature_CelsiusT(typeParsed: B): Greenhouse_Ventilation.Temperature_Celsius = {
      if (!typeParsed) {
        reader.expectZ(Constants.Greenhouse_VentilationTemperature_Celsius)
      }
      val degrees_celsius = reader.readS32()
      return Greenhouse_Ventilation.Temperature_Celsius(degrees_celsius)
    }

    def readGreenhouse_VentilationTemperature_Celsius_Payload(): Greenhouse_Ventilation.Temperature_Celsius_Payload = {
      val r = readGreenhouse_VentilationTemperature_Celsius_PayloadT(F)
      return r
    }

    def readGreenhouse_VentilationTemperature_Celsius_PayloadT(typeParsed: B): Greenhouse_Ventilation.Temperature_Celsius_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Greenhouse_VentilationTemperature_Celsius_Payload)
      }
      val value = readGreenhouse_VentilationTemperature_Celsius()
      return Greenhouse_Ventilation.Temperature_Celsius_Payload(value)
    }

    def readGreenhouse_VentilationUpper_Temperature_Limit(): Greenhouse_Ventilation.Upper_Temperature_Limit = {
      val r = readGreenhouse_VentilationUpper_Temperature_LimitT(F)
      return r
    }

    def readGreenhouse_VentilationUpper_Temperature_LimitT(typeParsed: B): Greenhouse_Ventilation.Upper_Temperature_Limit = {
      if (!typeParsed) {
        reader.expectZ(Constants.Greenhouse_VentilationUpper_Temperature_Limit)
      }
      val degrees_celsius = reader.readS32()
      return Greenhouse_Ventilation.Upper_Temperature_Limit(degrees_celsius)
    }

    def readGreenhouse_VentilationUpper_Temperature_Limit_Payload(): Greenhouse_Ventilation.Upper_Temperature_Limit_Payload = {
      val r = readGreenhouse_VentilationUpper_Temperature_Limit_PayloadT(F)
      return r
    }

    def readGreenhouse_VentilationUpper_Temperature_Limit_PayloadT(typeParsed: B): Greenhouse_Ventilation.Upper_Temperature_Limit_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Greenhouse_VentilationUpper_Temperature_Limit_Payload)
      }
      val value = readGreenhouse_VentilationUpper_Temperature_Limit()
      return Greenhouse_Ventilation.Upper_Temperature_Limit_Payload(value)
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

    def readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container(): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P => val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PT(T); return r
        case Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS => val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container.")
          val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PST(T)
          return r
      }
    }

    def readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P = {
      val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PT(F)
      return r
    }

    def readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PT(typeParsed: B): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P)
      }
      val api_temperature = readGreenhouse_VentilationTemperature_Celsius()
      val api_upper_limit = readGreenhouse_VentilationUpper_Temperature_Limit()
      val api_validity = readGreenhouse_VentilationTemperature_ValidityType()
      return Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(api_temperature, api_upper_limit, api_validity)
    }

    def readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS = {
      val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PST(F)
      return r
    }

    def readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PST(typeParsed: B): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS)
      }
      val api_temperature = readGreenhouse_VentilationTemperature_Celsius()
      val api_upper_limit = readGreenhouse_VentilationUpper_Temperature_Limit()
      val api_validity = readGreenhouse_VentilationTemperature_ValidityType()
      return Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(api_temperature, api_upper_limit, api_validity)
    }

    def readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container(): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P => val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PT(T); return r
        case Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS => val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container.")
          val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(T)
          return r
      }
    }

    def readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P = {
      val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PT(F)
      return r
    }

    def readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PT(typeParsed: B): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P)
      }
      val api_fan_command = readGreenhouse_VentilationFan_CommandType()
      val api_sensor_fault = readGreenhouse_VentilationSensor_Fault_IndicationType()
      return Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(api_fan_command, api_sensor_fault)
    }

    def readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS = {
      val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(F)
      return r
    }

    def readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(typeParsed: B): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS)
      }
      val api_fan_command = readGreenhouse_VentilationFan_CommandType()
      val api_sensor_fault = readGreenhouse_VentilationSensor_Fault_IndicationType()
      return Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(api_fan_command, api_sensor_fault)
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
        case Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P => val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PT(T); return r
        case Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS => val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PST(T); return r
        case Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P => val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PT(T); return r
        case Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS => val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(T)
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
        case Constants.Greenhouse_VentilationFan_Command_Payload => val r = readGreenhouse_VentilationFan_Command_PayloadT(T); return r
        case Constants.Greenhouse_VentilationTemperature_Celsius_Payload => val r = readGreenhouse_VentilationTemperature_Celsius_PayloadT(T); return r
        case Constants.Greenhouse_VentilationTemperature_Validity_Payload => val r = readGreenhouse_VentilationTemperature_Validity_PayloadT(T); return r
        case Constants.Greenhouse_VentilationSensor_Fault_Indication_Payload => val r = readGreenhouse_VentilationSensor_Fault_Indication_PayloadT(T); return r
        case Constants.Greenhouse_VentilationUpper_Temperature_Limit_Payload => val r = readGreenhouse_VentilationUpper_Temperature_Limit_PayloadT(T); return r
        case Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P => val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PT(T); return r
        case Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS => val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PST(T); return r
        case Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P => val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PT(T); return r
        case Constants.Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS => val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(T)
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

  def fromGreenhouse_VentilationTemperature_Validity_Payload(o: Greenhouse_Ventilation.Temperature_Validity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGreenhouse_VentilationTemperature_Validity_Payload(o)
    return w.result
  }

  def toGreenhouse_VentilationTemperature_Validity_Payload(data: ISZ[U8]): Either[Greenhouse_Ventilation.Temperature_Validity_Payload, MessagePack.ErrorMsg] = {
    def fGreenhouse_VentilationTemperature_Validity_Payload(reader: Reader): Greenhouse_Ventilation.Temperature_Validity_Payload = {
      val r = reader.readGreenhouse_VentilationTemperature_Validity_Payload()
      return r
    }
    val r = to(data, fGreenhouse_VentilationTemperature_Validity_Payload _)
    return r
  }

  def fromGreenhouse_VentilationFan_Command_Payload(o: Greenhouse_Ventilation.Fan_Command_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGreenhouse_VentilationFan_Command_Payload(o)
    return w.result
  }

  def toGreenhouse_VentilationFan_Command_Payload(data: ISZ[U8]): Either[Greenhouse_Ventilation.Fan_Command_Payload, MessagePack.ErrorMsg] = {
    def fGreenhouse_VentilationFan_Command_Payload(reader: Reader): Greenhouse_Ventilation.Fan_Command_Payload = {
      val r = reader.readGreenhouse_VentilationFan_Command_Payload()
      return r
    }
    val r = to(data, fGreenhouse_VentilationFan_Command_Payload _)
    return r
  }

  def fromGreenhouse_VentilationSensor_Fault_Indication_Payload(o: Greenhouse_Ventilation.Sensor_Fault_Indication_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGreenhouse_VentilationSensor_Fault_Indication_Payload(o)
    return w.result
  }

  def toGreenhouse_VentilationSensor_Fault_Indication_Payload(data: ISZ[U8]): Either[Greenhouse_Ventilation.Sensor_Fault_Indication_Payload, MessagePack.ErrorMsg] = {
    def fGreenhouse_VentilationSensor_Fault_Indication_Payload(reader: Reader): Greenhouse_Ventilation.Sensor_Fault_Indication_Payload = {
      val r = reader.readGreenhouse_VentilationSensor_Fault_Indication_Payload()
      return r
    }
    val r = to(data, fGreenhouse_VentilationSensor_Fault_Indication_Payload _)
    return r
  }

  def fromGreenhouse_VentilationTemperature_Celsius(o: Greenhouse_Ventilation.Temperature_Celsius, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGreenhouse_VentilationTemperature_Celsius(o)
    return w.result
  }

  def toGreenhouse_VentilationTemperature_Celsius(data: ISZ[U8]): Either[Greenhouse_Ventilation.Temperature_Celsius, MessagePack.ErrorMsg] = {
    def fGreenhouse_VentilationTemperature_Celsius(reader: Reader): Greenhouse_Ventilation.Temperature_Celsius = {
      val r = reader.readGreenhouse_VentilationTemperature_Celsius()
      return r
    }
    val r = to(data, fGreenhouse_VentilationTemperature_Celsius _)
    return r
  }

  def fromGreenhouse_VentilationTemperature_Celsius_Payload(o: Greenhouse_Ventilation.Temperature_Celsius_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGreenhouse_VentilationTemperature_Celsius_Payload(o)
    return w.result
  }

  def toGreenhouse_VentilationTemperature_Celsius_Payload(data: ISZ[U8]): Either[Greenhouse_Ventilation.Temperature_Celsius_Payload, MessagePack.ErrorMsg] = {
    def fGreenhouse_VentilationTemperature_Celsius_Payload(reader: Reader): Greenhouse_Ventilation.Temperature_Celsius_Payload = {
      val r = reader.readGreenhouse_VentilationTemperature_Celsius_Payload()
      return r
    }
    val r = to(data, fGreenhouse_VentilationTemperature_Celsius_Payload _)
    return r
  }

  def fromGreenhouse_VentilationUpper_Temperature_Limit(o: Greenhouse_Ventilation.Upper_Temperature_Limit, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGreenhouse_VentilationUpper_Temperature_Limit(o)
    return w.result
  }

  def toGreenhouse_VentilationUpper_Temperature_Limit(data: ISZ[U8]): Either[Greenhouse_Ventilation.Upper_Temperature_Limit, MessagePack.ErrorMsg] = {
    def fGreenhouse_VentilationUpper_Temperature_Limit(reader: Reader): Greenhouse_Ventilation.Upper_Temperature_Limit = {
      val r = reader.readGreenhouse_VentilationUpper_Temperature_Limit()
      return r
    }
    val r = to(data, fGreenhouse_VentilationUpper_Temperature_Limit _)
    return r
  }

  def fromGreenhouse_VentilationUpper_Temperature_Limit_Payload(o: Greenhouse_Ventilation.Upper_Temperature_Limit_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGreenhouse_VentilationUpper_Temperature_Limit_Payload(o)
    return w.result
  }

  def toGreenhouse_VentilationUpper_Temperature_Limit_Payload(data: ISZ[U8]): Either[Greenhouse_Ventilation.Upper_Temperature_Limit_Payload, MessagePack.ErrorMsg] = {
    def fGreenhouse_VentilationUpper_Temperature_Limit_Payload(reader: Reader): Greenhouse_Ventilation.Upper_Temperature_Limit_Payload = {
      val r = reader.readGreenhouse_VentilationUpper_Temperature_Limit_Payload()
      return r
    }
    val r = to(data, fGreenhouse_VentilationUpper_Temperature_Limit_Payload _)
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

  def fromGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container(o)
    return w.result
  }

  def toGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container(data: ISZ[U8]): Either[Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container, MessagePack.ErrorMsg] = {
    def fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container(reader: Reader): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container = {
      val r = reader.readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container()
      return r
    }
    val r = to(data, fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container _)
    return r
  }

  def fromGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(o)
    return w.result
  }

  def toGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(data: ISZ[U8]): Either[Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(reader: Reader): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P = {
      val r = reader.readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P()
      return r
    }
    val r = to(data, fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P _)
    return r
  }

  def fromGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(o)
    return w.result
  }

  def toGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(data: ISZ[U8]): Either[Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(reader: Reader): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS = {
      val r = reader.readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS()
      return r
    }
    val r = to(data, fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS _)
    return r
  }

  def fromGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container(o)
    return w.result
  }

  def toGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container(data: ISZ[U8]): Either[Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container, MessagePack.ErrorMsg] = {
    def fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container(reader: Reader): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container = {
      val r = reader.readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container()
      return r
    }
    val r = to(data, fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container _)
    return r
  }

  def fromGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(o)
    return w.result
  }

  def toGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(data: ISZ[U8]): Either[Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(reader: Reader): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P = {
      val r = reader.readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P()
      return r
    }
    val r = to(data, fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P _)
    return r
  }

  def fromGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(o)
    return w.result
  }

  def toGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(data: ISZ[U8]): Either[Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(reader: Reader): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS = {
      val r = reader.readGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS()
      return r
    }
    val r = to(data, fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS _)
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