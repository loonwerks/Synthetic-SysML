// #Sireum

package observation_acquisition_radio_delivery_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

BatteryCapacityBand.scala

BatteryCheck.scala

BatteryAssessment.scala

SortieContext.scala

SortieQualification.scala

CameraCondition.scala

CaptureResult.scala

CameraEvidence.scala

RadioCondition.scala

DeliveryResult.scala

RadioEvidence.scala

ObservationSessionState.scala

SessionProposal.scala

ObservationIntent.scala

SessionDecision.scala

SnapshotPreSessionState.scala

SnapshotNextSessionState.scala

SnapshotCoordinationDisposition.scala

SnapshotCoordinationReason.scala

CameraAcquisitionCommand.scala

RadioDeliveryCommand.scala

StatusSessionState.scala

StatusCoordinationDisposition.scala

StatusCoordinationReason.scala

OperatorAdvisory.scala

DroneControlObservationNotice.scala

SessionSnapshot.scala

OperatorCoordinationStatus.scala

Base_Types.scala

BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_Containers.scala

SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_Containers.scala

CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_Containers.scala

RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_Containers.scala

SessionProposalOwner_coordinatorProcess_sessionProposalOwner_Containers.scala

ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_Containers.scala

ObservationSessionController_coordinatorProcess_observationSessionController_Containers.scala

CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_Containers.scala

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

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_DataTypeId.Type], filter: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSortieContextType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateType(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.Type => B) {}

@datatype class Config_Observation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(attempts: Z, verbose: B, filter: Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


