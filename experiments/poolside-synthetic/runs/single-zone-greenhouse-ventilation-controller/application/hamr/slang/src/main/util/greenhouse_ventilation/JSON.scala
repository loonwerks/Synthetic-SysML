// #Sireum
// @formatter:off

// This file is auto-generated from Temperature_Validity.scala, Fan_Command.scala, Sensor_Fault_Indication.scala, Temperature_Celsius.scala, Upper_Temperature_Limit.scala, Base_Types.scala, Ventilation_Decision_i_control_process_ventilation_decision_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package greenhouse_ventilation

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printGreenhouse_VentilationTemperature_ValidityType(o: Greenhouse_Ventilation.Temperature_Validity.Type): ST = {
      val value: String = o match {
        case Greenhouse_Ventilation.Temperature_Validity.Valid => "Valid"
        case Greenhouse_Ventilation.Temperature_Validity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Greenhouse_Ventilation.Temperature_Validity")),
        ("value", printString(value))
      ))
    }

    @pure def printGreenhouse_VentilationTemperature_Validity_Payload(o: Greenhouse_Ventilation.Temperature_Validity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Greenhouse_Ventilation.Temperature_Validity_Payload""""),
        ("value", printGreenhouse_VentilationTemperature_ValidityType(o.value))
      ))
    }

    @pure def printGreenhouse_VentilationFan_CommandType(o: Greenhouse_Ventilation.Fan_Command.Type): ST = {
      val value: String = o match {
        case Greenhouse_Ventilation.Fan_Command.On => "On"
        case Greenhouse_Ventilation.Fan_Command.Off => "Off"
      }
      return printObject(ISZ(
        ("type", printString("Greenhouse_Ventilation.Fan_Command")),
        ("value", printString(value))
      ))
    }

    @pure def printGreenhouse_VentilationFan_Command_Payload(o: Greenhouse_Ventilation.Fan_Command_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Greenhouse_Ventilation.Fan_Command_Payload""""),
        ("value", printGreenhouse_VentilationFan_CommandType(o.value))
      ))
    }

    @pure def printGreenhouse_VentilationSensor_Fault_IndicationType(o: Greenhouse_Ventilation.Sensor_Fault_Indication.Type): ST = {
      val value: String = o match {
        case Greenhouse_Ventilation.Sensor_Fault_Indication.Clear => "Clear"
        case Greenhouse_Ventilation.Sensor_Fault_Indication.Asserted => "Asserted"
      }
      return printObject(ISZ(
        ("type", printString("Greenhouse_Ventilation.Sensor_Fault_Indication")),
        ("value", printString(value))
      ))
    }

    @pure def printGreenhouse_VentilationSensor_Fault_Indication_Payload(o: Greenhouse_Ventilation.Sensor_Fault_Indication_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Greenhouse_Ventilation.Sensor_Fault_Indication_Payload""""),
        ("value", printGreenhouse_VentilationSensor_Fault_IndicationType(o.value))
      ))
    }

    @pure def printGreenhouse_VentilationTemperature_Celsius(o: Greenhouse_Ventilation.Temperature_Celsius): ST = {
      return printObject(ISZ(
        ("type", st""""Greenhouse_Ventilation.Temperature_Celsius""""),
        ("degrees_celsius", printS32(o.degrees_celsius))
      ))
    }

    @pure def printGreenhouse_VentilationTemperature_Celsius_Payload(o: Greenhouse_Ventilation.Temperature_Celsius_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Greenhouse_Ventilation.Temperature_Celsius_Payload""""),
        ("value", printGreenhouse_VentilationTemperature_Celsius(o.value))
      ))
    }

    @pure def printGreenhouse_VentilationUpper_Temperature_Limit(o: Greenhouse_Ventilation.Upper_Temperature_Limit): ST = {
      return printObject(ISZ(
        ("type", st""""Greenhouse_Ventilation.Upper_Temperature_Limit""""),
        ("degrees_celsius", printS32(o.degrees_celsius))
      ))
    }

    @pure def printGreenhouse_VentilationUpper_Temperature_Limit_Payload(o: Greenhouse_Ventilation.Upper_Temperature_Limit_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Greenhouse_Ventilation.Upper_Temperature_Limit_Payload""""),
        ("value", printGreenhouse_VentilationUpper_Temperature_Limit(o.value))
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

    @pure def printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container): ST = {
      o match {
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P => return printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS => return printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(o)
      }
    }

    @pure def printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P""""),
        ("api_temperature", printGreenhouse_VentilationTemperature_Celsius(o.api_temperature)),
        ("api_upper_limit", printGreenhouse_VentilationUpper_Temperature_Limit(o.api_upper_limit)),
        ("api_validity", printGreenhouse_VentilationTemperature_ValidityType(o.api_validity))
      ))
    }

    @pure def printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS""""),
        ("api_temperature", printGreenhouse_VentilationTemperature_Celsius(o.api_temperature)),
        ("api_upper_limit", printGreenhouse_VentilationUpper_Temperature_Limit(o.api_upper_limit)),
        ("api_validity", printGreenhouse_VentilationTemperature_ValidityType(o.api_validity))
      ))
    }

    @pure def printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container): ST = {
      o match {
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P => return printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS => return printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(o)
      }
    }

    @pure def printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P""""),
        ("api_fan_command", printGreenhouse_VentilationFan_CommandType(o.api_fan_command)),
        ("api_sensor_fault", printGreenhouse_VentilationSensor_Fault_IndicationType(o.api_sensor_fault))
      ))
    }

    @pure def printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS""""),
        ("api_fan_command", printGreenhouse_VentilationFan_CommandType(o.api_fan_command)),
        ("api_sensor_fault", printGreenhouse_VentilationSensor_Fault_IndicationType(o.api_sensor_fault))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.Greenhouse_Ventilation_Root_Instance_control_process_ventilation_decision_postInit => "Greenhouse_Ventilation_Root_Instance_control_process_ventilation_decision_postInit"
        case runtimemonitor.ObservationKind.Greenhouse_Ventilation_Root_Instance_control_process_ventilation_decision_preCompute => "Greenhouse_Ventilation_Root_Instance_control_process_ventilation_decision_preCompute"
        case runtimemonitor.ObservationKind.Greenhouse_Ventilation_Root_Instance_control_process_ventilation_decision_postCompute => "Greenhouse_Ventilation_Root_Instance_control_process_ventilation_decision_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P => return printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS => return printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P => return printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS => return printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(o)
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
        case o: Greenhouse_Ventilation.Fan_Command_Payload => return printGreenhouse_VentilationFan_Command_Payload(o)
        case o: Greenhouse_Ventilation.Temperature_Celsius_Payload => return printGreenhouse_VentilationTemperature_Celsius_Payload(o)
        case o: Greenhouse_Ventilation.Temperature_Validity_Payload => return printGreenhouse_VentilationTemperature_Validity_Payload(o)
        case o: Greenhouse_Ventilation.Sensor_Fault_Indication_Payload => return printGreenhouse_VentilationSensor_Fault_Indication_Payload(o)
        case o: Greenhouse_Ventilation.Upper_Temperature_Limit_Payload => return printGreenhouse_VentilationUpper_Temperature_Limit_Payload(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P => return printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS => return printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P => return printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(o)
        case o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS => return printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(o)
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

    def parseGreenhouse_VentilationTemperature_ValidityType(): Greenhouse_Ventilation.Temperature_Validity.Type = {
      val r = parseGreenhouse_VentilationTemperature_ValidityT(F)
      return r
    }

    def parseGreenhouse_VentilationTemperature_ValidityT(typeParsed: B): Greenhouse_Ventilation.Temperature_Validity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Greenhouse_Ventilation.Temperature_Validity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Greenhouse_Ventilation.Temperature_Validity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Greenhouse_Ventilation.Temperature_Validity.")
          return Greenhouse_Ventilation.Temperature_Validity.byOrdinal(0).get
      }
    }

    def parseGreenhouse_VentilationTemperature_Validity_Payload(): Greenhouse_Ventilation.Temperature_Validity_Payload = {
      val r = parseGreenhouse_VentilationTemperature_Validity_PayloadT(F)
      return r
    }

    def parseGreenhouse_VentilationTemperature_Validity_PayloadT(typeParsed: B): Greenhouse_Ventilation.Temperature_Validity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Greenhouse_Ventilation.Temperature_Validity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseGreenhouse_VentilationTemperature_ValidityType()
      parser.parseObjectNext()
      return Greenhouse_Ventilation.Temperature_Validity_Payload(value)
    }

    def parseGreenhouse_VentilationFan_CommandType(): Greenhouse_Ventilation.Fan_Command.Type = {
      val r = parseGreenhouse_VentilationFan_CommandT(F)
      return r
    }

    def parseGreenhouse_VentilationFan_CommandT(typeParsed: B): Greenhouse_Ventilation.Fan_Command.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Greenhouse_Ventilation.Fan_Command")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Greenhouse_Ventilation.Fan_Command.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Greenhouse_Ventilation.Fan_Command.")
          return Greenhouse_Ventilation.Fan_Command.byOrdinal(0).get
      }
    }

    def parseGreenhouse_VentilationFan_Command_Payload(): Greenhouse_Ventilation.Fan_Command_Payload = {
      val r = parseGreenhouse_VentilationFan_Command_PayloadT(F)
      return r
    }

    def parseGreenhouse_VentilationFan_Command_PayloadT(typeParsed: B): Greenhouse_Ventilation.Fan_Command_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Greenhouse_Ventilation.Fan_Command_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseGreenhouse_VentilationFan_CommandType()
      parser.parseObjectNext()
      return Greenhouse_Ventilation.Fan_Command_Payload(value)
    }

    def parseGreenhouse_VentilationSensor_Fault_IndicationType(): Greenhouse_Ventilation.Sensor_Fault_Indication.Type = {
      val r = parseGreenhouse_VentilationSensor_Fault_IndicationT(F)
      return r
    }

    def parseGreenhouse_VentilationSensor_Fault_IndicationT(typeParsed: B): Greenhouse_Ventilation.Sensor_Fault_Indication.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Greenhouse_Ventilation.Sensor_Fault_Indication")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Greenhouse_Ventilation.Sensor_Fault_Indication.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Greenhouse_Ventilation.Sensor_Fault_Indication.")
          return Greenhouse_Ventilation.Sensor_Fault_Indication.byOrdinal(0).get
      }
    }

    def parseGreenhouse_VentilationSensor_Fault_Indication_Payload(): Greenhouse_Ventilation.Sensor_Fault_Indication_Payload = {
      val r = parseGreenhouse_VentilationSensor_Fault_Indication_PayloadT(F)
      return r
    }

    def parseGreenhouse_VentilationSensor_Fault_Indication_PayloadT(typeParsed: B): Greenhouse_Ventilation.Sensor_Fault_Indication_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Greenhouse_Ventilation.Sensor_Fault_Indication_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseGreenhouse_VentilationSensor_Fault_IndicationType()
      parser.parseObjectNext()
      return Greenhouse_Ventilation.Sensor_Fault_Indication_Payload(value)
    }

    def parseGreenhouse_VentilationTemperature_Celsius(): Greenhouse_Ventilation.Temperature_Celsius = {
      val r = parseGreenhouse_VentilationTemperature_CelsiusT(F)
      return r
    }

    def parseGreenhouse_VentilationTemperature_CelsiusT(typeParsed: B): Greenhouse_Ventilation.Temperature_Celsius = {
      if (!typeParsed) {
        parser.parseObjectType("Greenhouse_Ventilation.Temperature_Celsius")
      }
      parser.parseObjectKey("degrees_celsius")
      val degrees_celsius = parser.parseS32()
      parser.parseObjectNext()
      return Greenhouse_Ventilation.Temperature_Celsius(degrees_celsius)
    }

    def parseGreenhouse_VentilationTemperature_Celsius_Payload(): Greenhouse_Ventilation.Temperature_Celsius_Payload = {
      val r = parseGreenhouse_VentilationTemperature_Celsius_PayloadT(F)
      return r
    }

    def parseGreenhouse_VentilationTemperature_Celsius_PayloadT(typeParsed: B): Greenhouse_Ventilation.Temperature_Celsius_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Greenhouse_Ventilation.Temperature_Celsius_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseGreenhouse_VentilationTemperature_Celsius()
      parser.parseObjectNext()
      return Greenhouse_Ventilation.Temperature_Celsius_Payload(value)
    }

    def parseGreenhouse_VentilationUpper_Temperature_Limit(): Greenhouse_Ventilation.Upper_Temperature_Limit = {
      val r = parseGreenhouse_VentilationUpper_Temperature_LimitT(F)
      return r
    }

    def parseGreenhouse_VentilationUpper_Temperature_LimitT(typeParsed: B): Greenhouse_Ventilation.Upper_Temperature_Limit = {
      if (!typeParsed) {
        parser.parseObjectType("Greenhouse_Ventilation.Upper_Temperature_Limit")
      }
      parser.parseObjectKey("degrees_celsius")
      val degrees_celsius = parser.parseS32()
      parser.parseObjectNext()
      return Greenhouse_Ventilation.Upper_Temperature_Limit(degrees_celsius)
    }

    def parseGreenhouse_VentilationUpper_Temperature_Limit_Payload(): Greenhouse_Ventilation.Upper_Temperature_Limit_Payload = {
      val r = parseGreenhouse_VentilationUpper_Temperature_Limit_PayloadT(F)
      return r
    }

    def parseGreenhouse_VentilationUpper_Temperature_Limit_PayloadT(typeParsed: B): Greenhouse_Ventilation.Upper_Temperature_Limit_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Greenhouse_Ventilation.Upper_Temperature_Limit_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseGreenhouse_VentilationUpper_Temperature_Limit()
      parser.parseObjectNext()
      return Greenhouse_Ventilation.Upper_Temperature_Limit_Payload(value)
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

    def parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container(): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P", "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS"))
      t.native match {
        case "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P" => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PT(T); return r
        case "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS" => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PST(T); return r
        case _ => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PST(T); return r
      }
    }

    def parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P = {
      val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PT(F)
      return r
    }

    def parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PT(typeParsed: B): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P")
      }
      parser.parseObjectKey("api_temperature")
      val api_temperature = parseGreenhouse_VentilationTemperature_Celsius()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_limit")
      val api_upper_limit = parseGreenhouse_VentilationUpper_Temperature_Limit()
      parser.parseObjectNext()
      parser.parseObjectKey("api_validity")
      val api_validity = parseGreenhouse_VentilationTemperature_ValidityType()
      parser.parseObjectNext()
      return Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(api_temperature, api_upper_limit, api_validity)
    }

    def parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS = {
      val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PST(F)
      return r
    }

    def parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PST(typeParsed: B): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS")
      }
      parser.parseObjectKey("api_temperature")
      val api_temperature = parseGreenhouse_VentilationTemperature_Celsius()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upper_limit")
      val api_upper_limit = parseGreenhouse_VentilationUpper_Temperature_Limit()
      parser.parseObjectNext()
      parser.parseObjectKey("api_validity")
      val api_validity = parseGreenhouse_VentilationTemperature_ValidityType()
      parser.parseObjectNext()
      return Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(api_temperature, api_upper_limit, api_validity)
    }

    def parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container(): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P", "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS"))
      t.native match {
        case "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P" => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PT(T); return r
        case "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS" => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(T); return r
        case _ => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(T); return r
      }
    }

    def parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P = {
      val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PT(F)
      return r
    }

    def parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PT(typeParsed: B): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P")
      }
      parser.parseObjectKey("api_fan_command")
      val api_fan_command = parseGreenhouse_VentilationFan_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sensor_fault")
      val api_sensor_fault = parseGreenhouse_VentilationSensor_Fault_IndicationType()
      parser.parseObjectNext()
      return Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(api_fan_command, api_sensor_fault)
    }

    def parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS = {
      val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(F)
      return r
    }

    def parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(typeParsed: B): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS")
      }
      parser.parseObjectKey("api_fan_command")
      val api_fan_command = parseGreenhouse_VentilationFan_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sensor_fault")
      val api_sensor_fault = parseGreenhouse_VentilationSensor_Fault_IndicationType()
      parser.parseObjectNext()
      return Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(api_fan_command, api_sensor_fault)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P", "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS", "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P", "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P" => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PT(T); return r
        case "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS" => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PST(T); return r
        case "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P" => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PT(T); return r
        case "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS" => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(T); return r
        case _ => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Greenhouse_Ventilation.Fan_Command_Payload", "Greenhouse_Ventilation.Temperature_Celsius_Payload", "Greenhouse_Ventilation.Temperature_Validity_Payload", "Greenhouse_Ventilation.Sensor_Fault_Indication_Payload", "Greenhouse_Ventilation.Upper_Temperature_Limit_Payload", "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P", "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS", "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P", "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS"))
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
        case "Greenhouse_Ventilation.Fan_Command_Payload" => val r = parseGreenhouse_VentilationFan_Command_PayloadT(T); return r
        case "Greenhouse_Ventilation.Temperature_Celsius_Payload" => val r = parseGreenhouse_VentilationTemperature_Celsius_PayloadT(T); return r
        case "Greenhouse_Ventilation.Temperature_Validity_Payload" => val r = parseGreenhouse_VentilationTemperature_Validity_PayloadT(T); return r
        case "Greenhouse_Ventilation.Sensor_Fault_Indication_Payload" => val r = parseGreenhouse_VentilationSensor_Fault_Indication_PayloadT(T); return r
        case "Greenhouse_Ventilation.Upper_Temperature_Limit_Payload" => val r = parseGreenhouse_VentilationUpper_Temperature_Limit_PayloadT(T); return r
        case "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P" => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PT(T); return r
        case "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS" => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PST(T); return r
        case "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P" => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PT(T); return r
        case "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS" => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(T); return r
        case _ => val r = parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PST(T); return r
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

  def fromGreenhouse_VentilationTemperature_Validity_Payload(o: Greenhouse_Ventilation.Temperature_Validity_Payload, isCompact: B): String = {
    val st = Printer.printGreenhouse_VentilationTemperature_Validity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGreenhouse_VentilationTemperature_Validity_Payload(s: String): Either[Greenhouse_Ventilation.Temperature_Validity_Payload, Json.ErrorMsg] = {
    def fGreenhouse_VentilationTemperature_Validity_Payload(parser: Parser): Greenhouse_Ventilation.Temperature_Validity_Payload = {
      val r = parser.parseGreenhouse_VentilationTemperature_Validity_Payload()
      return r
    }
    val r = to(s, fGreenhouse_VentilationTemperature_Validity_Payload _)
    return r
  }

  def fromGreenhouse_VentilationFan_Command_Payload(o: Greenhouse_Ventilation.Fan_Command_Payload, isCompact: B): String = {
    val st = Printer.printGreenhouse_VentilationFan_Command_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGreenhouse_VentilationFan_Command_Payload(s: String): Either[Greenhouse_Ventilation.Fan_Command_Payload, Json.ErrorMsg] = {
    def fGreenhouse_VentilationFan_Command_Payload(parser: Parser): Greenhouse_Ventilation.Fan_Command_Payload = {
      val r = parser.parseGreenhouse_VentilationFan_Command_Payload()
      return r
    }
    val r = to(s, fGreenhouse_VentilationFan_Command_Payload _)
    return r
  }

  def fromGreenhouse_VentilationSensor_Fault_Indication_Payload(o: Greenhouse_Ventilation.Sensor_Fault_Indication_Payload, isCompact: B): String = {
    val st = Printer.printGreenhouse_VentilationSensor_Fault_Indication_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGreenhouse_VentilationSensor_Fault_Indication_Payload(s: String): Either[Greenhouse_Ventilation.Sensor_Fault_Indication_Payload, Json.ErrorMsg] = {
    def fGreenhouse_VentilationSensor_Fault_Indication_Payload(parser: Parser): Greenhouse_Ventilation.Sensor_Fault_Indication_Payload = {
      val r = parser.parseGreenhouse_VentilationSensor_Fault_Indication_Payload()
      return r
    }
    val r = to(s, fGreenhouse_VentilationSensor_Fault_Indication_Payload _)
    return r
  }

  def fromGreenhouse_VentilationTemperature_Celsius(o: Greenhouse_Ventilation.Temperature_Celsius, isCompact: B): String = {
    val st = Printer.printGreenhouse_VentilationTemperature_Celsius(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGreenhouse_VentilationTemperature_Celsius(s: String): Either[Greenhouse_Ventilation.Temperature_Celsius, Json.ErrorMsg] = {
    def fGreenhouse_VentilationTemperature_Celsius(parser: Parser): Greenhouse_Ventilation.Temperature_Celsius = {
      val r = parser.parseGreenhouse_VentilationTemperature_Celsius()
      return r
    }
    val r = to(s, fGreenhouse_VentilationTemperature_Celsius _)
    return r
  }

  def fromGreenhouse_VentilationTemperature_Celsius_Payload(o: Greenhouse_Ventilation.Temperature_Celsius_Payload, isCompact: B): String = {
    val st = Printer.printGreenhouse_VentilationTemperature_Celsius_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGreenhouse_VentilationTemperature_Celsius_Payload(s: String): Either[Greenhouse_Ventilation.Temperature_Celsius_Payload, Json.ErrorMsg] = {
    def fGreenhouse_VentilationTemperature_Celsius_Payload(parser: Parser): Greenhouse_Ventilation.Temperature_Celsius_Payload = {
      val r = parser.parseGreenhouse_VentilationTemperature_Celsius_Payload()
      return r
    }
    val r = to(s, fGreenhouse_VentilationTemperature_Celsius_Payload _)
    return r
  }

  def fromGreenhouse_VentilationUpper_Temperature_Limit(o: Greenhouse_Ventilation.Upper_Temperature_Limit, isCompact: B): String = {
    val st = Printer.printGreenhouse_VentilationUpper_Temperature_Limit(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGreenhouse_VentilationUpper_Temperature_Limit(s: String): Either[Greenhouse_Ventilation.Upper_Temperature_Limit, Json.ErrorMsg] = {
    def fGreenhouse_VentilationUpper_Temperature_Limit(parser: Parser): Greenhouse_Ventilation.Upper_Temperature_Limit = {
      val r = parser.parseGreenhouse_VentilationUpper_Temperature_Limit()
      return r
    }
    val r = to(s, fGreenhouse_VentilationUpper_Temperature_Limit _)
    return r
  }

  def fromGreenhouse_VentilationUpper_Temperature_Limit_Payload(o: Greenhouse_Ventilation.Upper_Temperature_Limit_Payload, isCompact: B): String = {
    val st = Printer.printGreenhouse_VentilationUpper_Temperature_Limit_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGreenhouse_VentilationUpper_Temperature_Limit_Payload(s: String): Either[Greenhouse_Ventilation.Upper_Temperature_Limit_Payload, Json.ErrorMsg] = {
    def fGreenhouse_VentilationUpper_Temperature_Limit_Payload(parser: Parser): Greenhouse_Ventilation.Upper_Temperature_Limit_Payload = {
      val r = parser.parseGreenhouse_VentilationUpper_Temperature_Limit_Payload()
      return r
    }
    val r = to(s, fGreenhouse_VentilationUpper_Temperature_Limit_Payload _)
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

  def fromGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container, isCompact: B): String = {
    val st = Printer.printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container(s: String): Either[Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container, Json.ErrorMsg] = {
    def fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container(parser: Parser): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container = {
      val r = parser.parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container()
      return r
    }
    val r = to(s, fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container _)
    return r
  }

  def fromGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(s: String): Either[Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P, Json.ErrorMsg] = {
    def fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(parser: Parser): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P = {
      val r = parser.parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P()
      return r
    }
    val r = to(s, fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P _)
    return r
  }

  def fromGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(s: String): Either[Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS, Json.ErrorMsg] = {
    def fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(parser: Parser): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS = {
      val r = parser.parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS()
      return r
    }
    val r = to(s, fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS _)
    return r
  }

  def fromGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container, isCompact: B): String = {
    val st = Printer.printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container(s: String): Either[Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container, Json.ErrorMsg] = {
    def fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container(parser: Parser): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container = {
      val r = parser.parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container()
      return r
    }
    val r = to(s, fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container _)
    return r
  }

  def fromGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(s: String): Either[Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P, Json.ErrorMsg] = {
    def fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(parser: Parser): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P = {
      val r = parser.parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P()
      return r
    }
    val r = to(s, fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P _)
    return r
  }

  def fromGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(o: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(s: String): Either[Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS, Json.ErrorMsg] = {
    def fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(parser: Parser): Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS = {
      val r = parser.parseGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS()
      return r
    }
    val r = to(s, fGreenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS _)
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