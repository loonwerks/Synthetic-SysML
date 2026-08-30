// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

LifecycleEvent.scala

InputStatus.scala

LifecycleAssessment.scala

ConditionEvent.scala

ConditionAssessment.scala

CoordinationClass.scala

ControllerModeDisposition.scala

DecisionReason.scala

CoordinationResult.scala

LifecycleSample.scala

ConditionSample.scala

ModeDecision.scala

Base_Types.scala

LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_Containers.scala

ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_Containers.scala

CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_Containers.scala

ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_Containers.scala

CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_Containers.scala

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

@datatype class Config_Vehicle_Controller_Mode_CoordinatorConditionAssessmentType(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorConditionEventType(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ConditionEvent.Type => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorConditionEvent_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorConditionSample(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ConditionSample => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorConditionSample_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorControllerModeDispositionType(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCoordinationClassType(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCoordinationResultType(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.CoordinationResult.Type => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorDecisionReasonType(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.DecisionReason.Type => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorDecisionReason_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorInputStatusType(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.InputStatus.Type => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorInputStatus_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.InputStatus_Payload => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorLifecycleEventType(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.LifecycleEvent.Type => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorLifecycleSample(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.LifecycleSample => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorModeDecision(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ModeDecision => B) {}

@datatype class Config_Vehicle_Controller_Mode_CoordinatorModeDecision_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


