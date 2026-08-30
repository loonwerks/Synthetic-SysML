// #Sireum

package observation_sortie_eligibility_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

EnergyQuality.scala

Validity.scala

Freshness.scala

EnergyCause.scala

GpsCondition.scala

InertialCondition.scala

BarometricCondition.scala

NavigationCause.scala

EquipmentCondition.scala

SingleEquipmentCause.scala

Engine1Condition.scala

Engine2Condition.scala

Engine3Condition.scala

Engine4Condition.scala

Confirmation.scala

PropulsionCause.scala

OperatorEvent.scala

PriorityDirective.scala

ReleaseFeedback.scala

RequestPhase.scala

FaultState.scala

EquipmentCause.scala

RecoveryPhase.scala

RecoveryGate.scala

CarriedPriority.scala

SortieDirective.scala

EligibilityReason.scala

StatusRequestPhase.scala

StatusFaultState.scala

StatusRecoveryPhase.scala

StatusDecision.scala

LimitingCause.scala

EnergyEvidence.scala

EnergyAssessment.scala

NavigationEvidenceRecord.scala

NavigationAssessment.scala

EquipmentEvidence.scala

SingleEquipmentAssessment.scala

PropulsionEvidence.scala

PropulsionAssessment.scala

FaultSummary.scala

RecoveryFacts.scala

EligibilityDecision.scala

EligibilityStatus.scala

Base_Types.scala

EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_Containers.scala

NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_Containers.scala

CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_Containers.scala

ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_Containers.scala

ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_Containers.scala

PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_Containers.scala

RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_Containers.scala

FaultRegistry_eligibility_supervisor_process_fault_registry_Containers.scala

PriorityArbiter_eligibility_supervisor_process_priority_arbiter_Containers.scala

RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_Containers.scala

EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_Containers.scala

PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_Containers.scala

StatusComposer_eligibility_supervisor_process_status_composer_Containers.scala

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

@datatype class Config_Observation_Sortie_Eligibility_SupervisorBarometricConditionType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.BarometricCondition.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorCarriedPriorityType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorConfirmationType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.Confirmation.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorConfirmation_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEligibilityDecision(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEligibilityReasonType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEligibilityStatus(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EligibilityStatus => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEnergyAssessment(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEnergyCauseType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EnergyCause.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEnergyCause_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEnergyEvidence(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EnergyEvidence => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEnergyQualityType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEngine1ConditionType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.Engine1Condition.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEngine2ConditionType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.Engine2Condition.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEngine3ConditionType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.Engine3Condition.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEngine4ConditionType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.Engine4Condition.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEquipmentCauseType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEquipmentConditionType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEquipmentEvidence(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorFaultStateType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.FaultState.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorFaultState_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.FaultState_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorFaultSummary(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.FaultSummary => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorFaultSummary_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorFreshnessType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.Freshness.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorFreshness_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.Freshness_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorGpsConditionType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.GpsCondition.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorGpsCondition_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorInertialConditionType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.InertialCondition.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorInertialCondition_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorLimitingCauseType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.LimitingCause.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorLimitingCause_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorNavigationAssessment(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorNavigationCauseType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.NavigationCause.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorNavigationCause_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorOperatorEventType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPriorityDirectiveType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPropulsionAssessment(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPropulsionCauseType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPropulsionEvidence(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRecoveryFacts(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RecoveryFacts => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRecoveryGateType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRecoveryPhaseType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorReleaseFeedbackType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRequestPhaseType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorRequestPhase_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorSingleEquipmentCauseType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorSortieDirectiveType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.SortieDirective.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorSortieDirective_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_DataTypeId.Type], filter: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorStatusDecisionType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.StatusDecision.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorStatusDecision_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorStatusFaultStateType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorStatusRequestPhaseType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorValidityType(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.Validity.Type => B) {}

@datatype class Config_Observation_Sortie_Eligibility_SupervisorValidity_Payload(attempts: Z, verbose: B, filter: Observation_Sortie_Eligibility_Supervisor.Validity_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


