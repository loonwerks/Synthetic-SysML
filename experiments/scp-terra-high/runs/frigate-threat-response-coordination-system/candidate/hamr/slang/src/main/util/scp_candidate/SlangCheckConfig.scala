// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

ContactSignature.scala

ContactSignatureStatus.scala

ContactIdentity.scala

IdentityStatus.scala

QualifiedThreat.scala

DefenseAvailability.scala

DefenseAvailabilityStatus.scala

DroneReadiness.scala

DroneReadinessStatus.scala

DefenseCondition.scala

DestinationStatus.scala

DestinationEvidenceStatus.scala

WarpProgress.scala

WarpProgressStatus.scala

RetreatCondition.scala

ResponseRequestValue.scala

RequestStatus.scala

DefenseActivation.scala

RetreatNavigationCommand.scala

ResponseDisposition.scala

AcknowledgmentValue.scala

AcknowledgmentStatus.scala

ReportPriority.scala

ResponseCommitment.scala

ContactEvidence.scala

IdentificationEvidence.scala

DefenseEvidence.scala

RetreatNavigationEvidence.scala

ResponseRequest.scala

ResponseRecord.scala

ReportAcknowledgment.scala

ThreatReport.scala

Base_Types.scala

ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_Containers.scala

DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_Containers.scala

RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_Containers.scala

PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_Containers.scala

ThreatReportComposer_threatResponseProcess_threatReportComposer_Containers.scala

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

@datatype class Config_Frigate_Threat_Response_CoordinatorAcknowledgmentStatusType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorAcknowledgmentValueType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.AcknowledgmentValue.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorContactEvidence(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ContactEvidence => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorContactEvidence_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ContactEvidence_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorContactIdentityType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ContactIdentity.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorContactIdentity_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ContactIdentity_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorContactSignatureType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ContactSignature.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorContactSignature_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ContactSignature_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorContactSignatureStatusType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ContactSignatureStatus.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseActivationType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseActivation.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseActivation_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseActivation_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseAvailabilityType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseAvailability.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseAvailability_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseAvailabilityStatusType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseConditionType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseCondition.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseCondition_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseCondition_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseEvidence(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseEvidence => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseEvidence_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDestinationEvidenceStatusType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDestinationStatusType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DestinationStatus.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDestinationStatus_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DestinationStatus_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDroneReadinessType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DroneReadiness.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDroneReadiness_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DroneReadiness_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDroneReadinessStatusType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DroneReadinessStatus.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorIdentificationEvidence(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.IdentificationEvidence => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorIdentityStatusType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.IdentityStatus.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorIdentityStatus_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.IdentityStatus_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorQualifiedThreatType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.QualifiedThreat.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorQualifiedThreat_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorReportAcknowledgment(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ReportAcknowledgment => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorReportPriorityType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ReportPriority.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorReportPriority_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ReportPriority_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRequestStatusType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.RequestStatus.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRequestStatus_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.RequestStatus_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseCommitmentType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseCommitment.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseCommitment_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseCommitment_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseDispositionType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseDisposition.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseDisposition_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseRecord(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseRecord => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseRecord_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseRecord_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseRequest(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseRequest => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseRequest_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseRequest_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseRequestValueType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseRequestValue.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseRequestValue_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRetreatConditionType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.RetreatCondition.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRetreatCondition_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.RetreatCondition_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRetreatNavigationCommandType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRetreatNavigationEvidence(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatReport(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatReport => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatReport_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatReport_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorWarpProgressType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.WarpProgress.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorWarpProgress_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.WarpProgress_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorWarpProgressStatusType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.WarpProgressStatus.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


