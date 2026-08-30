// #Sireum

package vehicle_start_readiness_recovery_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

RequestDisposition.scala

BrakeObservation.scala

ThermalCondition.scala

MaintenanceCondition.scala

HealthQualification.scala

PowerObservation.scala

SelfTestObservation.scala

TestCycleDirective.scala

CycleAssessment.scala

StartDecision.scala

LifecycleDirectiveSnapshot.scala

LifecyclePreMode.scala

LifecycleMode.scala

LifecycleReason.scala

StartEnable.scala

ParkingBrakeCommand.scala

PowerDisposition.scala

SelfTestCommand.scala

ControlLifecycleMode.scala

SupervisoryStatus.scala

RequestLevels.scala

BrakeFacts.scala

PowerFacts.scala

RequestFacts.scala

HealthObservation.scala

StartAuthorizationFacts.scala

AppliedLifecycleSnapshot.scala

ControlFrame.scala

Base_Types.scala

RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_Containers.scala

BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_Containers.scala

HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_Containers.scala

PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_Containers.scala

SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_Containers.scala

StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_Containers.scala

LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_Containers.scala

CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_Containers.scala

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

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorControlFrame(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorHealthObservation(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorPowerDispositionType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorPowerFacts(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorPowerObservationType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorRequestDispositionType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorRequestFacts(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorRequestLevels(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_DataTypeId.Type], filter: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorStartDecisionType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorStartEnableType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorThermalConditionType(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition.Type => B) {}

@datatype class Config_Vehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(attempts: Z, verbose: B, filter: Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


