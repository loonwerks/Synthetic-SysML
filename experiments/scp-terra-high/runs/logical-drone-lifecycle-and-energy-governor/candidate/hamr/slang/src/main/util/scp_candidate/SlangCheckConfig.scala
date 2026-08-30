// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

LifecycleRequest.scala

ExactRequestCode.scala

RequestFamily.scala

BatteryBand.scala

EvidenceValidity.scala

ChargerReport.scala

BatteryConfidence.scala

NavigationReport.scala

FlightControlReport.scala

HomeValue.scala

TouchdownValue.scala

AirborneRequestProposal.scala

LifecycleCase.scala

SourceLifecyclePhase.scala

LifecyclePhase.scala

PublishedPhase.scala

RequestResult.scala

BatteryNotice.scala

ChargePermission.scala

FlightIntent.scala

LaunchPermission.scala

PropulsionPermission.scala

AirborneClassifiedRequest.scala

LifecycleClassifiedRequest.scala

BatteryReportValue.scala

BatteryEvidence.scala

ChargerFacts.scala

ChargeEligibility.scala

HomeFacts.scala

TouchdownFacts.scala

HazardProposal.scala

FaultVector.scala

BatteryStateFacts.scala

HomeReportValue.scala

TouchdownReportValue.scala

LifecycleResolution.scala

PilotStatus.scala

FlightControlOutputs.scala

Base_Types.scala

RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_Containers.scala

BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_Containers.scala

ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_Containers.scala

ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_Containers.scala

FlightReadinessOwner_governorProcess_flightReadinessOwner_Containers.scala

HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_Containers.scala

TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_Containers.scala

BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_Containers.scala

AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_Containers.scala

AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_Containers.scala

FaultAggregationOwner_governorProcess_faultAggregationOwner_Containers.scala

LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_Containers.scala

OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_Containers.scala

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

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneRequestProposalType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryBandType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryBand.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryBand_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryBand_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryConfidenceType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryEvidence(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryEvidence => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryNoticeType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryNotice.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryNotice_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryReportValue(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryReportValue => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryStateFacts(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryStateFacts => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargeEligibility(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargeEligibility => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargeEligibility_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargePermissionType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargePermission.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargePermission_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargePermission_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargerFacts(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargerFacts => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargerFacts_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargerReportType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargerReport.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorChargerReport_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ChargerReport_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorEvidenceValidityType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.EvidenceValidity.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorExactRequestCodeType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ExactRequestCode.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorExactRequestCode_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFaultVector(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FaultVector => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFaultVector_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FaultVector_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFlightControlOutputs(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FlightControlOutputs => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFlightControlReportType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FlightControlReport.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFlightControlReport_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFlightIntentType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FlightIntent.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFlightIntent_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FlightIntent_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorHazardProposal(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.HazardProposal => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorHazardProposal_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.HazardProposal_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorHomeFacts(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.HomeFacts => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorHomeFacts_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.HomeFacts_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorHomeReportValue(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.HomeReportValue => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorHomeReportValue_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorHomeValueType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.HomeValue.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorHomeValue_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.HomeValue_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLaunchPermissionType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LaunchPermission.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLaunchPermission_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecycleCaseType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LifecycleCase.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecycleCase_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecyclePhaseType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecycleRequestType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LifecycleRequest.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecycleResolution(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LifecycleResolution => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorNavigationReportType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.NavigationReport.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorNavigationReport_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.NavigationReport_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorPilotStatus(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.PilotStatus => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorPilotStatus_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.PilotStatus_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorPropulsionPermissionType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.PropulsionPermission.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorPublishedPhaseType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.PublishedPhase.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorPublishedPhase_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorRequestFamilyType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.RequestFamily.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorRequestFamily_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.RequestFamily_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorRequestResultType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.RequestResult.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorRequestResult_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.RequestResult_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorSourceLifecyclePhaseType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorTouchdownFacts(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.TouchdownFacts => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorTouchdownReportValue(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.TouchdownReportValue => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorTouchdownValueType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.TouchdownValue.Type => B) {}

@datatype class Config_Drone_Lifecycle_Energy_GovernorTouchdownValue_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


