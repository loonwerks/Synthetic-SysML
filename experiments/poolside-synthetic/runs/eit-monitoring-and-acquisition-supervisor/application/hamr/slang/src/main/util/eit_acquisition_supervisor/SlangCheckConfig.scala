// #Sireum

package eit_acquisition_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

DoctorSignal.scala

RequestClass.scala

PreparationObservation.scala

PreparationFacts.scala

EquipmentObservation.scala

EquipmentFacts.scala

BatchSignal.scala

BatchFacts.scala

ImageFeedback.scala

ImageResultFacts.scala

DominantFault.scala

RecoveryState.scala

RecoveryGate.scala

RecoveryCause.scala

StartFeasibility.scala

SessionState.scala

CycleState.scala

ImageState.scala

RecoveryEvent.scala

Proposal.scala

SelectedAction.scala

SelectedCause.scala

AcquisitionCommand.scala

ImageCommand.scala

PublicMode.scala

ImageDisposition.scala

RequestFactsRecord.scala

FaultSummary.scala

RecoveryFrame.scala

SessionFrame.scala

CycleFrame.scala

ImageFrame.scala

DecisionFrame.scala

ControlFrame.scala

StatusFrame.scala

Base_Types.scala

DoctorRequestQualification_acquisition_process_doctor_request_qualification_Containers.scala

PreparationAssessment_acquisition_process_preparation_assessment_Containers.scala

EquipmentAssessment_acquisition_process_equipment_assessment_Containers.scala

BatchAssessment_acquisition_process_batch_assessment_Containers.scala

ImageResultAssessment_acquisition_process_image_result_assessment_Containers.scala

FaultComposition_acquisition_process_fault_composition_Containers.scala

SessionControl_acquisition_process_session_control_Containers.scala

AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_Containers.scala

ImageAvailabilityControl_acquisition_process_image_availability_control_Containers.scala

RecoveryControl_acquisition_process_recovery_control_Containers.scala

StartFeasibilityOwner_acquisition_process_start_feasibility_Containers.scala

CollectionFeasibilityOwner_acquisition_process_collection_feasibility_Containers.scala

ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_Containers.scala

SupervisoryArbitration_acquisition_process_supervisory_arbitration_Containers.scala

PublicationComposition_acquisition_process_publication_composition_Containers.scala

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

@datatype class Config_EIT_Acquisition_SupervisorAcquisitionCommandType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.AcquisitionCommand.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorAcquisitionCommand_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.AcquisitionCommand_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorBatchFactsType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.BatchFacts.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorBatchFacts_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.BatchFacts_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorBatchSignalType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.BatchSignal.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorBatchSignal_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.BatchSignal_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorControlFrame(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ControlFrame => B) {}

@datatype class Config_EIT_Acquisition_SupervisorControlFrame_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ControlFrame_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorCycleFrame(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.CycleFrame => B) {}

@datatype class Config_EIT_Acquisition_SupervisorCycleFrame_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.CycleFrame_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorCycleStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.CycleState.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorCycleState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.CycleState_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorDecisionFrame(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.DecisionFrame => B) {}

@datatype class Config_EIT_Acquisition_SupervisorDecisionFrame_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.DecisionFrame_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorDoctorSignalType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.DoctorSignal.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorDoctorSignal_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.DoctorSignal_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorDominantFaultType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.DominantFault.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorDominantFault_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.DominantFault_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorEquipmentFactsType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.EquipmentFacts.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorEquipmentFacts_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.EquipmentFacts_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorEquipmentObservationType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.EquipmentObservation.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorEquipmentObservation_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.EquipmentObservation_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorFaultSummary(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.FaultSummary => B) {}

@datatype class Config_EIT_Acquisition_SupervisorFaultSummary_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.FaultSummary_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageCommandType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageCommand.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageCommand_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageCommand_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageDispositionType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageDisposition.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageDisposition_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageDisposition_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageFeedbackType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageFeedback.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageFeedback_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageFeedback_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageFrame(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageFrame => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageFrame_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageFrame_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageResultFactsType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageResultFacts.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageResultFacts_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageResultFacts_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageState.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorImageState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.ImageState_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPreparationFactsType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.PreparationFacts.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPreparationFacts_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.PreparationFacts_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPreparationObservationType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.PreparationObservation.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPreparationObservation_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.PreparationObservation_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorProposalType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.Proposal.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorProposal_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.Proposal_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPublicModeType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.PublicMode.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPublicMode_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.PublicMode_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryCauseType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RecoveryCause.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryCause_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RecoveryCause_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryEventType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RecoveryEvent.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryEvent_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RecoveryEvent_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryFrame(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RecoveryFrame => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryFrame_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RecoveryFrame_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryGateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RecoveryGate.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryGate_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RecoveryGate_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RecoveryState.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRecoveryState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RecoveryState_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRequestClassType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RequestClass.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRequestClass_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RequestClass_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRequestFactsRecord(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RequestFactsRecord => B) {}

@datatype class Config_EIT_Acquisition_SupervisorRequestFactsRecord_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.RequestFactsRecord_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSelectedActionType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SelectedAction.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSelectedAction_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SelectedAction_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSelectedCauseType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SelectedCause.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSelectedCause_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SelectedCause_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSessionFrame(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SessionFrame => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSessionFrame_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SessionFrame_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSessionStateType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SessionState.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSessionState_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SessionState_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorStartFeasibilityType(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.StartFeasibility.Type => B) {}

@datatype class Config_EIT_Acquisition_SupervisorStartFeasibility_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.StartFeasibility_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorStatusFrame(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.StatusFrame => B) {}

@datatype class Config_EIT_Acquisition_SupervisorStatusFrame_Payload(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.StatusFrame_Payload => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_DataTypeId.Type], filter: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P => B) {}

@datatype class Config_EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


