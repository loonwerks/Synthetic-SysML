// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

TransferRequest.scala

CargoState.scala

QualifiedRequest.scala

DockServiceCondition.scala

ServiceEligibility.scala

SessionState.scala

AdmittedDirective.scala

VerificationDisposition.scala

SessionExpectation.scala

CommandProposal.scala

SnapshotSessionState.scala

SnapshotSessionResult.scala

ShipTransferEvidence.scala

ShipFinding.scala

WarehouseReceiptEvidence.scala

WarehouseFinding.scala

ShipCommand.scala

WarehouseQuery.scala

PilotTransferReport.scala

StationTransferReport.scala

SessionSnapshot.scala

Base_Types.scala

RequestQualifier_supervisorProcess_requestQualifier_Containers.scala

ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_Containers.scala

PriorityArbiter_supervisorProcess_priorityArbiter_Containers.scala

SessionController_supervisorProcess_sessionController_Containers.scala

ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_Containers.scala

WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_Containers.scala

CompletionReconciler_supervisorProcess_completionReconciler_Containers.scala

CommandSafetyGate_supervisorProcess_commandSafetyGate_Containers.scala

OutcomeReporter_supervisorProcess_outcomeReporter_Containers.scala

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

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCargoStateType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.CargoState.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCargoState_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCommandProposalType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorDockServiceConditionType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorPilotTransferReportType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSessionExpectationType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSessionSnapshot(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSessionStateType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSessionState_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorShipCommandType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorShipFindingType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorStationTransferReportType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorTransferRequestType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_DataTypeId.Type], filter: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorWarehouseQueryType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.Type => B) {}

@datatype class Config_Station_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(attempts: Z, verbose: B, filter: Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


