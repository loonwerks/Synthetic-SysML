// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

DemandSignal.scala

DemandCode.scala

InventoryBand.scala

InventoryBandCode.scala

MaterialEvent.scala

MaterialEventCode.scala

EventClass.scala

MaterialClass.scala

Availability.scala

DemandState.scala

SupplyState.scala

QualifiedEvent.scala

FaultTrigger.scala

RecoveryGate.scala

DemandStateView.scala

DemandStateCode.scala

DemandUpdate.scala

DemandDisposition.scala

RecoveryEvent.scala

EmergencyState.scala

RecoveryState.scala

ProposalState.scala

MaterialAction.scala

DecisionCause.scala

CoordinationMode.scala

SupplyStateCode.scala

RecoveryStateCode.scala

DemandBoundaryFacts.scala

InventoryBoundaryFacts.scala

MaterialReadinessFacts.scala

EventBoundaryFacts.scala

DemandFacts.scala

DemandTransition.scala

Decision.scala

MaterialCoordinationResult.scala

Base_Types.scala

DemandAcquisition_material_continuity_process_demand_acquisition_Containers.scala

InventoryAcquisition_material_continuity_process_inventory_acquisition_Containers.scala

EventAcquisition_material_continuity_process_event_acquisition_Containers.scala

DemandQualification_material_continuity_process_demand_qualification_Containers.scala

MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_Containers.scala

EventCoherence_material_continuity_process_event_coherence_Containers.scala

DemandRegistry_material_continuity_process_demand_registry_Containers.scala

SupplyLifecycle_material_continuity_process_supply_lifecycle_Containers.scala

RecoverySupervisor_material_continuity_process_recovery_supervisor_Containers.scala

UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_Containers.scala

RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_Containers.scala

ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_Containers.scala

MaterialActionArbitration_material_continuity_process_material_action_arbitration_Containers.scala

ResultComposition_material_continuity_process_result_composition_Containers.scala

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

@datatype class Config_Factory_Material_Continuity_CoordinatorAvailabilityType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.Availability.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorAvailability_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.Availability_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorCoordinationModeType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.CoordinationMode.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorCoordinationMode_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.CoordinationMode_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDecision(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.Decision => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDecision_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.Decision_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDecisionCauseType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DecisionCause.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDecisionCause_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DecisionCause_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandBoundaryFacts(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandBoundaryFacts => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandCodeType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandCode.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandCode_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandCode_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandDispositionType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandDisposition.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandDisposition_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandDisposition_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandFacts(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandFacts => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandFacts_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandFacts_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandSignalType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandSignal.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandSignal_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandSignal_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandStateType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandState.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandState_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandState_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandStateCodeType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandStateCode.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandStateCode_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandStateCode_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandStateViewType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandStateView.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandStateView_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandStateView_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandTransition(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandTransition => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandTransition_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandTransition_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandUpdateType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandUpdate.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorDemandUpdate_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.DemandUpdate_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEmergencyStateType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.EmergencyState.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEmergencyState_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.EmergencyState_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventBoundaryFacts(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.EventBoundaryFacts => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventClassType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.EventClass.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventClass_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.EventClass_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorFaultTriggerType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.FaultTrigger.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorFaultTrigger_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.FaultTrigger_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorInventoryBandType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.InventoryBand.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorInventoryBand_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.InventoryBand_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorInventoryBandCodeType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.InventoryBandCode.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorInventoryBandCode_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorInventoryBoundaryFacts(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialActionType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialAction.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialAction_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialAction_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialClassType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialClass.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialClass_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialClass_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialCoordinationResult(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialCoordinationResult => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialEventType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialEvent.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialEvent_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialEvent_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialEventCodeType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialEventCode.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialEventCode_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialReadinessFacts(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorProposalStateType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.ProposalState.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorProposalState_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.ProposalState_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorQualifiedEventType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.QualifiedEvent.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorQualifiedEvent_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRecoveryEventType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RecoveryEvent.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRecoveryEvent_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRecoveryGateType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RecoveryGate.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRecoveryGate_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RecoveryGate_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRecoveryStateType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RecoveryState.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRecoveryState_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RecoveryState_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRecoveryStateCodeType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RecoveryStateCode.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorSupplyStateType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.SupplyState.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorSupplyState_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.SupplyState_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorSupplyStateCodeType(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.SupplyStateCode.Type => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorSupplyStateCode_Payload(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_DataTypeId.Type], filter: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P => B) {}

@datatype class Config_Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


