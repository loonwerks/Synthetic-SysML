// #Sireum

package docked_service_access_lifecycle_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

PilotIntent.scala

QualifiedIntent.scala

BerthObservation.scala

ShipCondition.scala

DockReadiness.scala

ServiceSignal.scala

ServiceInterlock.scala

LifecycleState.scala

OperationalAssessment.scala

AdmittedDirective.scala

MovementProposal.scala

AccessProposal.scala

SnapshotLifecycleState.scala

LifecycleResult.scala

MovementDirective.scala

ServiceAccess.scala

PilotLifecycleReport.scala

StationAccessReport.scala

ControlProposal.scala

LifecycleSnapshot.scala

GatedControl.scala

Base_Types.scala

IntentQualifier_supervisorProcess_intentQualifier_Containers.scala

DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_Containers.scala

ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_Containers.scala

LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_Containers.scala

PriorityArbiter_supervisorProcess_priorityArbiter_Containers.scala

LifecycleController_supervisorProcess_lifecycleController_Containers.scala

MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_Containers.scala

LifecycleReporter_supervisorProcess_lifecycleReporter_Containers.scala

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

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorAccessProposalType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.AccessProposal.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorBerthObservationType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorControlProposal(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.ControlProposal => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorDockReadinessType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorGatedControl(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.GatedControl => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleResultType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleStateType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorMovementDirectiveType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorMovementProposalType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.MovementProposal.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorPilotIntentType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorServiceAccessType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorServiceInterlockType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_DataTypeId.Type], filter: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorServiceSignalType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorShipConditionType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorStationAccessReportType(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.Type => B) {}

@datatype class Config_Docked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(attempts: Z, verbose: B, filter: Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


