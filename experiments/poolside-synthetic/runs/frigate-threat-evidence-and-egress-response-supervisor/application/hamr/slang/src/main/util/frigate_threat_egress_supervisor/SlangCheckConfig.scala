// #Sireum

package frigate_threat_egress_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

EvidenceBand.scala

ObservationValidity.scala

EvidenceAssessment.scala

PilotDisposition.scala

SnapshotPreEpisodeState.scala

SnapshotNextEpisodeState.scala

SnapshotEvidenceAssessment.scala

SnapshotPilotDisposition.scala

ThreatReport.scala

DefenseAvailability.scala

CapacitorSupport.scala

DefenseQualification.scala

EgressRouteObservation.scala

EgressQualification.scala

ResponseAuthorization.scala

ResponseDirective.scala

EgressProgress.scala

SnapshotPreEgressState.scala

SnapshotNextEgressState.scala

SnapshotResponseDirective.scala

SnapshotDefenseCommand.scala

SnapshotEgressCommand.scala

DefenseCommand.scala

EgressCommand.scala

ResponseStatus.scala

ThreatObservation.scala

EpisodeSnapshot.scala

DefenseSupportObservation.scala

ResponseSnapshot.scala

Base_Types.scala

ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_Containers.scala

ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_Containers.scala

ThreatReportPolicy_threatResponseProcess_threatReportPolicy_Containers.scala

DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_Containers.scala

EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_Containers.scala

ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_Containers.scala

ResponseStateController_threatResponseProcess_responseStateController_Containers.scala

ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_Containers.scala

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

@datatype class Config_Frigate_Threat_Egress_SupervisorCapacitorSupportType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.CapacitorSupport.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorCapacitorSupport_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorDefenseAvailabilityType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.DefenseAvailability.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorDefenseAvailability_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorDefenseCommandType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.DefenseCommand.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorDefenseCommand_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorDefenseQualificationType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.DefenseQualification.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorDefenseQualification_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorDefenseSupportObservation(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.DefenseSupportObservation => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEgressCommandType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EgressCommand.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEgressCommand_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EgressCommand_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEgressProgressType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EgressProgress.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEgressProgress_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EgressProgress_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEgressQualificationType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EgressQualification.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEgressQualification_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EgressQualification_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEgressRouteObservationType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EgressRouteObservation.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEpisodeSnapshot(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEvidenceAssessmentType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEvidenceBandType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EvidenceBand.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorEvidenceBand_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorObservationValidityType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ObservationValidity.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorObservationValidity_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorPilotDispositionType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.PilotDisposition.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorPilotDisposition_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseAuthorizationType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseAuthorization.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseAuthorization_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseDirectiveType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseDirective.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseDirective_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseSnapshot(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseSnapshot => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseSnapshot_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseStatusType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseStatus.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseStatus_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotDefenseCommandType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotEgressCommandType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotNextEgressStateType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotPilotDispositionType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotPreEgressStateType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotResponseDirectiveType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatObservation(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatObservation => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatObservation_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatReportType(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatReport.Type => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatReport_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatReport_Payload => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


