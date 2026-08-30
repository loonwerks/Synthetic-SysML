// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

MonitoringRequest.scala

InputStatus.scala

QualifiedRequest.scala

CalibrationState.scala

ImpedanceToken.scala

AcquisitionEvidence.scala

AcquisitionCommand.scala

SessionMode.scala

RecoveryPhase.scala

MonitoringDisposition.scala

ImpedanceDelivery.scala

MonitoringStatus.scala

MonitoringRequestSample.scala

CalibrationSample.scala

ImpedanceSample.scala

MonitoringResolution.scala

Base_Types.scala

RequestQualification_coordinationProcess_requestQualification_Containers.scala

AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_Containers.scala

MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_Containers.scala

ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_Containers.scala

DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_Containers.scala

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

@datatype class Config_EIT_Acquisition_CoordinatorAcquisitionCommandType(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.AcquisitionCommand.Type => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorAcquisitionCommand_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.AcquisitionCommand_Payload => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorAcquisitionEvidenceType(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.AcquisitionEvidence.Type => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorCalibrationSample(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.CalibrationSample => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorCalibrationSample_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.CalibrationSample_Payload => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorCalibrationStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.CalibrationState.Type => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorCalibrationState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.CalibrationState_Payload => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorImpedanceDeliveryType(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.ImpedanceDelivery.Type => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorImpedanceDelivery_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorImpedanceSample(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.ImpedanceSample => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorImpedanceSample_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.ImpedanceSample_Payload => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorImpedanceTokenType(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.ImpedanceToken.Type => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorImpedanceToken_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.ImpedanceToken_Payload => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorInputStatusType(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.InputStatus.Type => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorInputStatus_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.InputStatus_Payload => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringDispositionType(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.MonitoringDisposition.Type => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringDisposition_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.MonitoringDisposition_Payload => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringRequestType(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.MonitoringRequest.Type => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringRequest_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.MonitoringRequest_Payload => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringRequestSample(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.MonitoringRequestSample => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringResolution(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.MonitoringResolution => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringResolution_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.MonitoringResolution_Payload => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringStatusType(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.MonitoringStatus.Type => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorMonitoringStatus_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.MonitoringStatus_Payload => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorQualifiedRequestType(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.QualifiedRequest.Type => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorQualifiedRequest_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.QualifiedRequest_Payload => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorRecoveryPhaseType(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.RecoveryPhase.Type => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorRecoveryPhase_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.RecoveryPhase_Payload => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorSessionModeType(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.SessionMode.Type => B) {}

@datatype class Config_EIT_Acquisition_CoordinatorSessionMode_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Coordinator.SessionMode_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


