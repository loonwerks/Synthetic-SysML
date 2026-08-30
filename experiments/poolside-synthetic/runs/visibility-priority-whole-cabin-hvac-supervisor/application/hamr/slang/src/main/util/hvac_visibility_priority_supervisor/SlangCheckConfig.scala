// #Sireum

package hvac_visibility_priority_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Validity.scala

Arrival.scala

EnableIntent.scala

DefrostIntent.scala

ThermalBand.scala

FanIntent.scala

RequestClass.scala

CabinBand.scala

ThermalNeed.scala

ThermalObservationValidity.scala

GlazingCondition.scala

VisibilityNeed.scala

VisibilityCriticality.scala

HumidityCondition.scala

HumidityNeed.scala

AirCondition.scala

AirNeed.scala

InterfaceState.scala

Budget.scala

ElectricalTier.scala

ElectricalCause.scala

ElectricalCriticality.scala

Availability.scala

WasteHeatEligibility.scala

BlowerReadiness.scala

ThermalReadiness.scala

ClearingReadiness.scala

AirTreatmentReadiness.scala

EquipmentCriticality.scala

ThermalBlowerAvailability.scala

ThermalEquipmentAvailability.scala

VisibilityBlowerAvailability.scala

ClearingAvailability.scala

AirTreatmentAvailability.scala

RecoveryState.scala

RecoveryEvent.scala

RecoveryCause.scala

Service.scala

HeatSource.scala

ThermalProposalAvailability.scala

ThermalDegradation.scala

VisibilityProposalAvailability.scala

ProposalUrgency.scala

CabinAirProposalAvailability.scala

HumidityDegradation.scala

AirDegradation.scala

SelectionCause.scala

SelectionMode.scala

Authorization.scala

ArbitrationMode.scala

ArbitrationCause.scala

NoncriticalCause.scala

Intensity.scala

EnergyTier.scala

CandidateCause.scala

RecoveryAcknowledgment.scala

SupervisorMode.scala

StatusCause.scala

UserClimateRequest.scala

QualifiedTarget.scala

QualifiedRequest.scala

CabinThermalObservation.scala

ThermalAssessment.scala

GlazingObservation.scala

HumidityObservation.scala

AirQualityObservation.scala

ElectricalAvailability.scala

ElectricalEligibility.scala

WasteHeatAvailability.scala

EquipmentReadiness.scala

ThermalPathReadiness.scala

VisibilityPathReadiness.scala

AirPathReadiness.scala

RecoveryReport.scala

ThermalProposal.scala

VisibilityProposal.scala

CabinAirProposal.scala

SelectedIntent.scala

ArbitrationStatus.scala

CabinActuationPlan.scala

SupervisorStatus.scala

CandidatePlan.scala

Base_Types.scala

RequestQualifier_supervision_requestQualifier_Containers.scala

ThermalNeedAssessor_supervision_thermalNeedAssessor_Containers.scala

VisibilityNeedAssessor_supervision_visibilityNeedAssessor_Containers.scala

HumidityNeedAssessor_supervision_humidityNeedAssessor_Containers.scala

AirQualityNeedAssessor_supervision_airQualityNeedAssessor_Containers.scala

ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_Containers.scala

WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_Containers.scala

EquipmentFaultAssessor_supervision_equipmentFaultAssessor_Containers.scala

PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_Containers.scala

ThermalServiceProposer_supervision_thermalServiceProposer_Containers.scala

VisibilityServiceProposer_supervision_visibilityServiceProposer_Containers.scala

CabinAirServiceProposer_supervision_cabinAirServiceProposer_Containers.scala

EnergySafePlanComposer_supervision_energySafePlanComposer_Containers.scala

CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_Containers.scala

AtomicResultPublisher_supervision_atomicResultPublisher_Containers.scala

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

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirConditionType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirCondition.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirCondition_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirCondition_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirDegradationType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirDegradation.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirDegradation_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirNeedType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirNeed.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirNeed_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirNeed_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirPathReadiness(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirPathReadiness => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirQualityObservation(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirQualityObservation => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirTreatmentReadinessType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorArbitrationCauseType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ArbitrationCause.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorArbitrationModeType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorArbitrationStatus(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ArbitrationStatus => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorArrivalType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.Arrival.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorArrival_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.Arrival_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAuthorizationType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.Authorization.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAuthorization_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.Authorization_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAvailabilityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.Availability.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorAvailability_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.Availability_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorBlowerReadinessType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.BlowerReadiness.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorBudgetType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.Budget.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorBudget_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.Budget_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinActuationPlan(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CabinActuationPlan => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinAirProposal(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CabinAirProposal => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinBandType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CabinBand.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinBand_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CabinBand_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinThermalObservation(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CabinThermalObservation => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCandidateCauseType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CandidateCause.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCandidateCause_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCandidatePlan(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CandidatePlan => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorClearingAvailabilityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ClearingAvailability.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorClearingReadinessType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ClearingReadiness.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorDefrostIntentType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.DefrostIntent.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalAvailability(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ElectricalAvailability => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalCauseType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ElectricalCause.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalCause_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalCriticalityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalEligibility(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ElectricalEligibility => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalTierType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ElectricalTier.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorElectricalTier_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEnableIntentType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EnableIntent.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEnableIntent_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEnergyTierType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EnergyTier.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEnergyTier_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEquipmentReadiness(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EquipmentReadiness => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorFanIntentType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.FanIntent.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorFanIntent_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.FanIntent_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorGlazingConditionType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.GlazingCondition.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorGlazingObservation(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.GlazingObservation => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHeatSourceType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.HeatSource.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHeatSource_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.HeatSource_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHumidityConditionType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.HumidityCondition.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHumidityDegradationType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.HumidityDegradation.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHumidityNeedType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.HumidityNeed.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHumidityObservation(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.HumidityObservation => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorIntensityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.Intensity.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorIntensity_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.Intensity_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorInterfaceStateType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.InterfaceState.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorInterfaceState_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorNoncriticalCauseType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.NoncriticalCause.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorProposalUrgencyType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorQualifiedRequest(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.QualifiedRequest => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorQualifiedTarget(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.QualifiedTarget => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRecoveryCauseType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RecoveryCause.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRecoveryEventType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RecoveryEvent.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRecoveryReport(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RecoveryReport => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRecoveryStateType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RecoveryState.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRecoveryState_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRequestClassType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RequestClass.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRequestClass_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RequestClass_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorSelectedIntent(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.SelectedIntent => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorSelectionCauseType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.SelectionCause.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorSelectionCause_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorSelectionModeType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.SelectionMode.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorSelectionMode_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorServiceType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.Service.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorService_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.Service_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorStatusCauseType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.StatusCause.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorStatusCause_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.StatusCause_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorSupervisorModeType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.SupervisorMode.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorSupervisorStatus(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.SupervisorStatus => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalAssessment(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalAssessment => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalBandType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalBand.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalBand_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalDegradationType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalDegradation.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalNeedType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalNeed.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalNeed_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalObservationValidityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalPathReadiness(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalProposal(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalProposal => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalProposal_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalReadinessType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalReadiness.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorUserClimateRequest(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.UserClimateRequest => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorValidityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.Validity.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorValidity_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.Validity_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityNeedType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityProposal(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityProposal => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorWasteHeatAvailability(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Type => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_DataTypeId.Type], filter: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P => B) {}

@datatype class Config_HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


