// #Sireum

package cabin_air_treatment_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

AirCareSelection.scala

RequestValidity.scala

RequestIntent.scala

CabinAirQuality.scala

AirQualityValidity.scala

AirAssessment.scala

CabinHumidity.scala

HumidityValidity.scala

HumidityAssessment.scala

StatusValidity.scala

FilterPathStatus.scala

DryingPathStatus.scala

TreatmentReadiness.scala

ReadinessContext.scala

AirProposal.scala

HumidityProposal.scala

RecoveryMemory.scala

AirTreatmentCommand.scala

StatusMode.scala

StatusReason.scala

TreatmentEquipmentStatus.scala

AirCareSupervisorStatus.scala

Base_Types.scala

AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_Containers.scala

AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_Containers.scala

HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_Containers.scala

TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_Containers.scala

FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_Containers.scala

HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_Containers.scala

ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_Containers.scala

AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_Containers.scala

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

@datatype class Config_Cabin_Air_Treatment_SupervisorAirAssessmentType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirAssessment.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirAssessment_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirAssessment_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCareSelectionType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirCareSelection.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCareSelection_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirCareSelection_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCareSupervisorStatus(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirProposalType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirProposal.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirProposal_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirProposal_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirQualityValidityType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirQualityValidity.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirQualityValidity_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirQualityValidity_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirTreatmentCommandType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.AirTreatmentCommand_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorCabinAirQualityType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.CabinAirQuality.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorCabinAirQuality_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.CabinAirQuality_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorCabinHumidityType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.CabinHumidity.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorCabinHumidity_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.CabinHumidity_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorDryingPathStatusType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.DryingPathStatus.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorDryingPathStatus_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.DryingPathStatus_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorFilterPathStatusType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.FilterPathStatus.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorFilterPathStatus_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.FilterPathStatus_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityAssessmentType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.HumidityAssessment.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityAssessment_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.HumidityAssessment_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityProposalType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.HumidityProposal.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityProposal_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.HumidityProposal_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityValidityType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.HumidityValidity.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorHumidityValidity_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.HumidityValidity_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorReadinessContextType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.ReadinessContext.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorReadinessContext_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.ReadinessContext_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorRecoveryMemoryType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorRecoveryMemory_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.RecoveryMemory_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorRequestIntentType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.RequestIntent.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorRequestIntent_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.RequestIntent_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorRequestValidityType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.RequestValidity.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorRequestValidity_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.RequestValidity_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorStatusModeType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.StatusMode.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorStatusMode_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.StatusMode_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorStatusReasonType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.StatusReason.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorStatusReason_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.StatusReason_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorStatusValidityType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.StatusValidity.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorStatusValidity_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.StatusValidity_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorTreatmentEquipmentStatus(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorTreatmentReadinessType(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorTreatmentReadiness_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.TreatmentReadiness_Payload => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


