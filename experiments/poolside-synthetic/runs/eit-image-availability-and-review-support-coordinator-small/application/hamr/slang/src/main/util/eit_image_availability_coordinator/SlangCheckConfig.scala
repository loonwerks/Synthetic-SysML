// #Sireum

package eit_image_availability_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Acquisition_Token.scala

Input_Status.scala

Qualified_Acquisition.scala

Review_Intent.scala

Qualified_Intent.scala

Generation_Result.scala

Qualified_Generation_Result.scala

Image_State.scala

Recovery_Phase.scala

Resolution_Disposition.scala

Generation_Directive.scala

Image_Delivery.scala

Availability_Status.scala

Acquisition_Sample.scala

Review_Intent_Sample.scala

Generation_Result_Sample.scala

Image_Resolution.scala

Base_Types.scala

Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_Containers.scala

Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_Containers.scala

Generation_Result_Qualification_image_availability_process_generation_result_qualification_Containers.scala

Image_Availability_Governor_image_availability_process_image_availability_governor_Containers.scala

Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_Containers.scala

Doctor_Publication_image_availability_process_doctor_publication_Containers.scala

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

@datatype class Config_EIT_Image_Availability_CoordinatorAcquisition_Sample(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Acquisition_Sample => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAcquisition_TokenType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Acquisition_Token.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAcquisition_Token_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Acquisition_Token_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailability_StatusType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Availability_Status.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorAvailability_Status_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Availability_Status_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_DirectiveType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Generation_Directive.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Directive_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Generation_Directive_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_ResultType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Generation_Result.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Result_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Generation_Result_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Result_Sample(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Generation_Result_Sample => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImage_DeliveryType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Image_Delivery.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImage_Delivery_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Image_Delivery_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImage_Resolution(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Image_Resolution => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImage_Resolution_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Image_Resolution_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImage_StateType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Image_State.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorImage_State_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Image_State_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorInput_StatusType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Input_Status.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorInput_Status_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Input_Status_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorQualified_AcquisitionType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorQualified_Generation_ResultType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorQualified_IntentType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Qualified_Intent.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorQualified_Intent_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Qualified_Intent_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorRecovery_PhaseType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Recovery_Phase.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorRecovery_Phase_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Recovery_Phase_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorResolution_DispositionType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Resolution_Disposition.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorResolution_Disposition_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReview_IntentType(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Review_Intent.Type => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReview_Intent_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Review_Intent_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReview_Intent_Sample(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Review_Intent_Sample => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_DataTypeId.Type], filter: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


