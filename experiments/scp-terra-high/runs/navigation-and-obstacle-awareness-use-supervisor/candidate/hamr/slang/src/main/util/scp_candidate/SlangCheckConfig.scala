// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

NavigationEvidence.scala

EvidenceAssessment.scala

ObstacleEvidence.scala

ObstacleAssessment.scala

NavigationBasis.scala

MotionContext.scala

AwarenessCondition.scala

ConstraintProposal.scala

SupervisionEvent.scala

RecoveryPhase.scala

AcceptedAction.scala

NavigationUseDirective.scala

ObstacleAwarenessNotice.scala

SupervisionStatus.scala

Base_Types.scala

GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_Containers.scala

InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_Containers.scala

BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_Containers.scala

ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_Containers.scala

NavigationBasisOwner_supervisorProcess_navigationBasisOwner_Containers.scala

AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_Containers.scala

ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_Containers.scala

EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_Containers.scala

RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_Containers.scala

SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_Containers.scala

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

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.Type => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.Type => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorMotionContextType(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.Type => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.Type => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.Type => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.Type => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.Type => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_DataTypeId.Type], filter: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.Type => B) {}

@datatype class Config_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(attempts: Z, verbose: B, filter: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


