// #Sireum

package mining_cargo_transfer_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

OffloadRequestEvent.scala

InputStatus.scala

QualifiedRequest.scala

DockingObservation.scala

DockingAssessment.scala

ShipTransferProgress.scala

QualifiedShipProgress.scala

WarehouseReceiptEvidence.scala

QualifiedWarehouseEvidence.scala

TransferPhase.scala

TransferDisposition.scala

CargoTransferCommand.scala

TransferSupervisorStatus.scala

TransferVerificationFinding.scala

OffloadRequestSample.scala

DockingSample.scala

ShipTransferSample.scala

WarehouseReceiptSample.scala

TransferResolution.scala

Base_Types.scala

RequestQualification_supervisionProcess_requestQualification_Containers.scala

DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_Containers.scala

ShipProgressQualification_supervisionProcess_shipProgressQualification_Containers.scala

WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_Containers.scala

TransferDecisionOwner_supervisionProcess_transferDecisionOwner_Containers.scala

TransferCommandDerivation_supervisionProcess_transferCommandDerivation_Containers.scala

TransferReportDerivation_supervisionProcess_transferReportDerivation_Containers.scala

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

@datatype class Config_Mining_Cargo_Transfer_SupervisorCargoTransferCommandType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorDockingAssessmentType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorDockingAssessment_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorDockingObservationType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.DockingObservation.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorDockingObservation_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorDockingSample(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.DockingSample => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorDockingSample_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.DockingSample_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorInputStatusType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.InputStatus.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorInputStatus_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.InputStatus_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorOffloadRequestEventType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorOffloadRequestSample(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorQualifiedRequestType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorQualifiedShipProgressType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorShipTransferProgressType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorShipTransferSample(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.ShipTransferSample => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorShipTransferSample_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferDispositionType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferDisposition.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferDisposition_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferPhaseType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferPhase_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferResolution(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferResolution => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferResolution_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferSupervisorStatusType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferVerificationFindingType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorWarehouseReceiptSample(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample => B) {}

@datatype class Config_Mining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


