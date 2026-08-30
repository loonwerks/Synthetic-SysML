// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

ReportedCondition.scala

ReportCurrency.scala

ConditionAssessment.scala

SelectedIntent.scala

ControllerMode.scala

TransitionKind.scala

ParkingBrakeDisposition.scala

CoordinationStatus.scala

RecoveryTarget.scala

QualifiedTransition.scala

LifecycleLevels.scala

LifecycleFacts.scala

ServiceLevels.scala

ServiceFacts.scala

ConditionEvidence.scala

ArbitrationResult.scala

TransitionResolution.scala

CoordinationOutcome.scala

Base_Types.scala

LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_Containers.scala

ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_Containers.scala

ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_Containers.scala

IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_Containers.scala

CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_Containers.scala

RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_Containers.scala

TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_Containers.scala

ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_Containers.scala

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

@datatype class Config_Vehicle_Mode_CoordinatorArbitrationResult(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ArbitrationResult => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorArbitrationResult_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ArbitrationResult_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorConditionAssessmentType(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ConditionAssessment.Type => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorConditionAssessment_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ConditionAssessment_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorConditionEvidence(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ConditionEvidence => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorConditionEvidence_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ConditionEvidence_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorControllerModeType(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ControllerMode.Type => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorControllerMode_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ControllerMode_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorCoordinationOutcome(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.CoordinationOutcome => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorCoordinationOutcome_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.CoordinationOutcome_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorCoordinationStatusType(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.CoordinationStatus.Type => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorCoordinationStatus_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.CoordinationStatus_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorLifecycleFacts(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.LifecycleFacts => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorLifecycleFacts_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.LifecycleFacts_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorLifecycleLevels(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.LifecycleLevels => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorLifecycleLevels_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.LifecycleLevels_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorParkingBrakeDispositionType(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ParkingBrakeDisposition.Type => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorQualifiedTransitionType(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.QualifiedTransition.Type => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorQualifiedTransition_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.QualifiedTransition_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorRecoveryTargetType(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.RecoveryTarget.Type => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorRecoveryTarget_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.RecoveryTarget_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorReportCurrencyType(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ReportCurrency.Type => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorReportCurrency_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ReportCurrency_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorReportedConditionType(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ReportedCondition.Type => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorReportedCondition_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ReportedCondition_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorSelectedIntentType(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.SelectedIntent.Type => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorSelectedIntent_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.SelectedIntent_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorServiceFacts(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ServiceFacts => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorServiceFacts_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ServiceFacts_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorServiceLevels(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ServiceLevels => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorServiceLevels_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.ServiceLevels_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorTransitionKindType(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.TransitionKind.Type => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorTransitionKind_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.TransitionKind_Payload => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorTransitionResolution(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.TransitionResolution => B) {}

@datatype class Config_Vehicle_Mode_CoordinatorTransitionResolution_Payload(attempts: Z, verbose: B, filter: Vehicle_Mode_Coordinator.TransitionResolution_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


