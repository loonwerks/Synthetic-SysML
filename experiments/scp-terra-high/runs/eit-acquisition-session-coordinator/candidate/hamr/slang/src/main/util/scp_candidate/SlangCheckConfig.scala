// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

BeltObservation.scala

BeltQualification.scala

CalibrationObservation.scala

CalibrationQualification.scala

AcquisitionObservation.scala

PreparationState.scala

MonitoringState.scala

EligibilityEnvelopeCondition.scala

EligibilityEnvelopeRecovery.scala

EligibilityEnvelopePreparationState.scala

EligibilityEnvelopeMonitoringState.scala

DoctorRequest.scala

TechnicianRequest.scala

ArbitrationDecisionEffectiveIntent.scala

ArbitrationDecisionDisposition.scala

PreparationDecisionPreState.scala

PreparationDecisionNextState.scala

PreparationDecisionIntent.scala

PreparationDecisionDisposition.scala

MonitoringDecisionPreState.scala

MonitoringDecisionNextState.scala

MonitoringDecisionIntent.scala

MonitoringDecisionDisposition.scala

MonitoringDecisionNotice.scala

MonitoringDecisionPreparationState.scala

AcquisitionCommand.scala

ImpedanceFrameObservation.scala

FrameDelivery.scala

SessionStatusPreparationState.scala

SessionStatusMonitoringState.scala

SessionStatusDisposition.scala

SessionStatusNotice.scala

BeltAssessment.scala

EligibilityEnvelope.scala

ArbitrationDecision.scala

PreparationDecisionSnapshot.scala

MonitoringDecisionSnapshot.scala

SessionStatus.scala

Base_Types.scala

BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_Containers.scala

CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_Containers.scala

AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_Containers.scala

RequestArbiter_acquisitionCoordinationProcess_requestArbiter_Containers.scala

PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_Containers.scala

MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_Containers.scala

AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_Containers.scala

SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_Containers.scala

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

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionCommandType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.AcquisitionCommand.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionObservationType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.AcquisitionObservation.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorArbitrationDecision(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.ArbitrationDecision => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorBeltAssessment(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.BeltAssessment => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorBeltObservationType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.BeltObservation.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorBeltObservation_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.BeltObservation_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorBeltQualificationType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.BeltQualification.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorBeltQualification_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.BeltQualification_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorCalibrationObservationType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.CalibrationObservation.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorCalibrationQualificationType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.CalibrationQualification.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorDoctorRequestType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.DoctorRequest.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorEligibilityEnvelope(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.EligibilityEnvelope => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorFrameDeliveryType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.FrameDelivery.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringState.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringState_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationDecisionIntentType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationState.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationState_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionStatus(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.SessionStatus => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionStatus_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.SessionStatus_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionStatusDispositionType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionStatusNoticeType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.SessionStatusNotice.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorTechnicianRequestType(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.TechnicianRequest.Type => B) {}

@datatype class Config_EIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


