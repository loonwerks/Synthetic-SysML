// #Sireum

package cabin_air_care_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

AirCarePreference.scala

PreferenceValidity.scala

AirCareIntent.scala

CabinAirQuality.scala

AirQualityValidity.scala

AirAssessment.scala

CabinHumidityBand.scala

HumidityValidity.scala

HumidityAssessment.scala

MeasurementConfidence.scala

AirTreatmentDirective.scala

AirCareStatus.scala

ConfidenceMode.scala

Base_Types.scala

PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_Containers.scala

AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_Containers.scala

HumidityAssessor_airCareSupervisionProcess_humidityAssessor_Containers.scala

ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_Containers.scala

AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_Containers.scala

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

@datatype class Config_Cabin_Air_Care_SupervisorAirAssessmentType(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirAssessment.Type => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirAssessment_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirAssessment_Payload => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirCareIntentType(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirCareIntent.Type => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirCareIntent_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirCareIntent_Payload => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirCarePreferenceType(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirCarePreference.Type => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirCarePreference_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirCarePreference_Payload => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirCareStatusType(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirCareStatus.Type => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirCareStatus_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirCareStatus_Payload => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirQualityValidityType(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirQualityValidity.Type => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirQualityValidity_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirQualityValidity_Payload => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirTreatmentDirectiveType(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirTreatmentDirective.Type => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorAirTreatmentDirective_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorCabinAirQualityType(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.CabinAirQuality.Type => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorCabinAirQuality_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.CabinAirQuality_Payload => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorCabinHumidityBandType(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.CabinHumidityBand.Type => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorCabinHumidityBand_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorConfidenceModeType(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.ConfidenceMode.Type => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorConfidenceMode_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.ConfidenceMode_Payload => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorHumidityAssessmentType(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.HumidityAssessment.Type => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorHumidityAssessment_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.HumidityAssessment_Payload => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorHumidityValidityType(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.HumidityValidity.Type => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorHumidityValidity_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.HumidityValidity_Payload => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorMeasurementConfidenceType(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.MeasurementConfidence.Type => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorMeasurementConfidence_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorPreferenceValidityType(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.PreferenceValidity.Type => B) {}

@datatype class Config_Cabin_Air_Care_SupervisorPreferenceValidity_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Care_Supervisor.PreferenceValidity_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


