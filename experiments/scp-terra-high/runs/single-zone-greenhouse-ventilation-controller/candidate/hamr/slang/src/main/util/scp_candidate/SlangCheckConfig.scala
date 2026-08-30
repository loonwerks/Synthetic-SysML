// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Temperature_Validity.scala

Fan_Command.scala

Sensor_Fault_Indication.scala

Temperature_Celsius.scala

Upper_Temperature_Limit.scala

Base_Types.scala

Ventilation_Decision_i_control_process_ventilation_decision_Containers.scala

ObservationKind.scala

Container.scala

DataContent.scala

Aux_Types.scala

*/
@datatype class Config_String(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: String => B) {}
@datatype class Config_Z(low: Option[Z], high: Option[Z], attempts: Z, verbose: B, filter: Z => B) {}

@datatype class Config_B(attempts: Z, verbose: B, filter: B => B) {}

@datatype class Config_C(low: Option[C], high: Option[C], attempts: Z, verbose: B, filter: C => B) {}

@datatype class Config_R(low: Option[R], high: Option[R], attempts: Z, verbose: B, filter: R => B) {}

@datatype class Config_F32(low: Option[F32], high: Option[F32], attempts: Z, verbose: B, filter: F32 => B) {}

@datatype class Config_F64(low: Option[F64], high: Option[F64], attempts: Z, verbose: B, filter: F64 => B) {}

@datatype class Config_S8(low: Option[S8], high: Option[S8], attempts: Z, verbose: B, filter: S8 => B) {}

@datatype class Config_S16(low: Option[S16], high: Option[S16], attempts: Z, verbose: B, filter: S16 => B) {}

@datatype class Config_S32(low: Option[S32], high: Option[S32], attempts: Z, verbose: B, filter: S32 => B) {}

@datatype class Config_S64(low: Option[S64], high: Option[S64], attempts: Z, verbose: B, filter: S64 => B) {}

@datatype class Config_U8(low: Option[U8], high: Option[U8], attempts: Z, verbose: B, filter: U8 => B) {}

@datatype class Config_U16(low: Option[U16], high: Option[U16], attempts: Z, verbose: B, filter: U16 => B) {}

@datatype class Config_U32(low: Option[U32], high: Option[U32], attempts: Z, verbose: B, filter: U32 => B) {}

@datatype class Config_U64(low: Option[U64], high: Option[U64], attempts: Z, verbose: B, filter: U64 => B) {}

@datatype class Config__artDataContent(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[_artDataContent_DataTypeId.Type], filter: art.DataContent => B) {}

@datatype class Config__artEmpty(attempts: Z, verbose: B, filter: art.Empty => B) {}

@datatype class Config_Base_TypesBoolean_Payload(attempts: Z, verbose: B, filter: Base_Types.Boolean_Payload => B) {}

@datatype class Config_Base_TypesInteger_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_Payload => B) {}

@datatype class Config_Base_TypesInteger_8_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_8_Payload => B) {}

@datatype class Config_Base_TypesInteger_16_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_16_Payload => B) {}

@datatype class Config_Base_TypesInteger_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_32_Payload => B) {}

@datatype class Config_Base_TypesInteger_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_64_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_8_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_8_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_16_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_16_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_32_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_64_Payload => B) {}

@datatype class Config_Base_TypesFloat_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_Payload => B) {}

@datatype class Config_Base_TypesFloat_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_32_Payload => B) {}

@datatype class Config_Base_TypesFloat_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_64_Payload => B) {}

@datatype class Config_Base_TypesCharacter_Payload(attempts: Z, verbose: B, filter: Base_Types.Character_Payload => B) {}

@datatype class Config_Base_TypesString_Payload(attempts: Z, verbose: B, filter: Base_Types.String_Payload => B) {}

@datatype class Config_ISZB(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: ISZ[B] => B) {}

@datatype class Config_Base_TypesBits_Payload(attempts: Z, verbose: B, filter: Base_Types.Bits_Payload => B) {}

@datatype class Config_Greenhouse_VentilationFan_CommandType(attempts: Z, verbose: B, filter: Greenhouse_Ventilation.Fan_Command.Type => B) {}

@datatype class Config_Greenhouse_VentilationFan_Command_Payload(attempts: Z, verbose: B, filter: Greenhouse_Ventilation.Fan_Command_Payload => B) {}

@datatype class Config_Greenhouse_VentilationSensor_Fault_IndicationType(attempts: Z, verbose: B, filter: Greenhouse_Ventilation.Sensor_Fault_Indication.Type => B) {}

@datatype class Config_Greenhouse_VentilationSensor_Fault_Indication_Payload(attempts: Z, verbose: B, filter: Greenhouse_Ventilation.Sensor_Fault_Indication_Payload => B) {}

@datatype class Config_Greenhouse_VentilationTemperature_Celsius(attempts: Z, verbose: B, filter: Greenhouse_Ventilation.Temperature_Celsius => B) {}

@datatype class Config_Greenhouse_VentilationTemperature_Celsius_Payload(attempts: Z, verbose: B, filter: Greenhouse_Ventilation.Temperature_Celsius_Payload => B) {}

@datatype class Config_Greenhouse_VentilationTemperature_ValidityType(attempts: Z, verbose: B, filter: Greenhouse_Ventilation.Temperature_Validity.Type => B) {}

@datatype class Config_Greenhouse_VentilationTemperature_Validity_Payload(attempts: Z, verbose: B, filter: Greenhouse_Ventilation.Temperature_Validity_Payload => B) {}

@datatype class Config_Greenhouse_VentilationUpper_Temperature_Limit(attempts: Z, verbose: B, filter: Greenhouse_Ventilation.Upper_Temperature_Limit => B) {}

@datatype class Config_Greenhouse_VentilationUpper_Temperature_Limit_Payload(attempts: Z, verbose: B, filter: Greenhouse_Ventilation.Upper_Temperature_Limit_Payload => B) {}

@datatype class Config_Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_DataTypeId.Type], filter: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container => B) {}

@datatype class Config_Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_P(attempts: Z, verbose: B, filter: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_P => B) {}

@datatype class Config_Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS(attempts: Z, verbose: B, filter: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PreState_Container_PS => B) {}

@datatype class Config_Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_DataTypeId.Type], filter: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container => B) {}

@datatype class Config_Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_P(attempts: Z, verbose: B, filter: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_P => B) {}

@datatype class Config_Greenhouse_VentilationVentilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS(attempts: Z, verbose: B, filter: Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


