// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

ImageSignal.scala

ImageFacts.scala

DoctorSignal.scala

ReviewFacts.scala

PreparationContext.scala

ContextFacts.scala

ServiceObservation.scala

ServiceFacts.scala

DominantFault.scala

RecoveryEvent.scala

RecoveryState.scala

EvidenceState.scala

AdmissionOutcome.scala

AdmissionReason.scala

ArtifactState.scala

AvailabilityDecision.scala

BlockReason.scala

ReviewState.scala

PresentationProposal.scala

SelectedAction.scala

SelectedReason.scala

UpstreamDisposition.scala

PublicMode.scala

Visibility.scala

FaultSummary.scala

RecoveryFrame.scala

EvidenceFrame.scala

AdmissionFrame.scala

ArtifactFrame.scala

AvailabilityDecisionFrame.scala

ReviewFrame.scala

PresentationFrame.scala

DecisionFrame.scala

AvailabilityFrame.scala

Base_Types.scala

ImageEventQualification_coordination_image_event_qualification_Containers.scala

DoctorEventQualification_coordination_doctor_event_qualification_Containers.scala

PreparationContextAssessment_coordination_preparation_context_assessment_Containers.scala

AvailabilityServiceAssessment_coordination_availability_service_assessment_Containers.scala

FaultComposition_coordination_fault_composition_Containers.scala

RecoveryControl_coordination_recovery_control_Containers.scala

EvidenceLifecycle_coordination_evidence_lifecycle_Containers.scala

AdmissionDecisionOwner_coordination_admission_decision_Containers.scala

ArtifactLifecycle_coordination_artifact_lifecycle_Containers.scala

AvailabilityDecisionOwner_coordination_availability_decision_Containers.scala

ReviewLifecycle_coordination_review_lifecycle_Containers.scala

PresentationDecisionOwner_coordination_presentation_decision_Containers.scala

AvailabilityArbitration_coordination_availability_arbitration_Containers.scala

PublicationComposition_coordination_publication_composition_Containers.scala

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

@datatype class Config_EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAdmissionFrame(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AdmissionFrame => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAdmissionFrame_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AdmissionFrame_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAdmissionOutcomeType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AdmissionOutcome.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAdmissionReasonType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AdmissionReason.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAdmissionReason_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AdmissionReason_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorArtifactFrame(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ArtifactFrame => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorArtifactFrame_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ArtifactFrame_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorArtifactStateType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ArtifactState.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorArtifactState_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ArtifactState_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityDecisionType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityDecision.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityFrame(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityFrame => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorBlockReasonType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.BlockReason.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorBlockReason_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.BlockReason_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorContextFactsType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ContextFacts.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorContextFacts_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ContextFacts_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDecisionFrame(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.DecisionFrame => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDecisionFrame_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.DecisionFrame_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctorSignalType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.DoctorSignal.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctorSignal_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.DoctorSignal_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDominantFaultType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.DominantFault.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDominantFault_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.DominantFault_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorEvidenceFrame(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.EvidenceFrame => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorEvidenceFrame_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.EvidenceFrame_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorEvidenceStateType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.EvidenceState.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorEvidenceState_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.EvidenceState_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorFaultSummary(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.FaultSummary => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorFaultSummary_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.FaultSummary_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImageFactsType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ImageFacts.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImageFacts_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ImageFacts_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImageSignalType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ImageSignal.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImageSignal_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ImageSignal_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPreparationContextType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PreparationContext.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPreparationContext_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PreparationContext_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPresentationFrame(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PresentationFrame => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPresentationFrame_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PresentationFrame_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPresentationProposalType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PresentationProposal.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPresentationProposal_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PresentationProposal_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPublicModeType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PublicMode.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPublicMode_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PublicMode_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorRecoveryEventType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.RecoveryEvent.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorRecoveryEvent_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.RecoveryEvent_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorRecoveryFrame(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.RecoveryFrame => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorRecoveryFrame_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.RecoveryFrame_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorRecoveryStateType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.RecoveryState.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorRecoveryState_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.RecoveryState_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReviewFactsType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ReviewFacts.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReviewFacts_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ReviewFacts_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReviewFrame(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ReviewFrame => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReviewFrame_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ReviewFrame_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReviewStateType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ReviewState.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReviewState_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ReviewState_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorSelectedActionType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.SelectedAction.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorSelectedAction_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.SelectedAction_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorSelectedReasonType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.SelectedReason.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorSelectedReason_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.SelectedReason_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorServiceFactsType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ServiceFacts.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorServiceFacts_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ServiceFacts_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorServiceObservationType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ServiceObservation.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorServiceObservation_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.ServiceObservation_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorUpstreamDispositionType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.UpstreamDisposition.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorVisibilityType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Visibility.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorVisibility_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Visibility_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


