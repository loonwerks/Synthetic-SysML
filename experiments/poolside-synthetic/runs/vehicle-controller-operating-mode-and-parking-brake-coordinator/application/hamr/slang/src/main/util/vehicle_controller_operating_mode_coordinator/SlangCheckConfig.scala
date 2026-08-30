// #Sireum

package vehicle_controller_operating_mode_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

StartIndicationLevel.scala

OnIndicationLevel.scala

OffIndicationLevel.scala

IndicationLevel.scala

ConflictClass.scala

SelectedIndication.scala

RecoveryDecision.scala

PriorOperatingDemand.scala

OperatingDemand.scala

PriorMaintenanceSession.scala

MaintenanceSession.scala

PriorDegradedEpisode.scala

DegradedEpisode.scala

ControllerMode.scala

TransitionReason.scala

BrakeDemand.scala

PublishedControllerMode.scala

ParkingBrakeCommand.scala

LifecycleIndications.scala

LifecycleEpochFacts.scala

MaintenanceEpochFacts.scala

DegradationEpochFacts.scala

ReturnEpochFacts.scala

MaintenanceIndication.scala

DegradedIndication.scala

ReturnIndication.scala

DemandSnapshot.scala

MaintenanceSnapshot.scala

EpisodeSnapshot.scala

ModeDecision.scala

CoordinationFrame.scala

Base_Types.scala

LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_Containers.scala

MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_Containers.scala

DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_Containers.scala

ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_Containers.scala

ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_Containers.scala

IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_Containers.scala

OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_Containers.scala

MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_Containers.scala

DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_Containers.scala

RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_Containers.scala

ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_Containers.scala

ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_Containers.scala

OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_Containers.scala

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

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorConflictClassType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorControllerModeType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorModeDecision(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_DataTypeId.Type], filter: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorReturnIndication(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorTransitionReasonType(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.Type => B) {}

@datatype class Config_Vehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(attempts: Z, verbose: B, filter: Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


