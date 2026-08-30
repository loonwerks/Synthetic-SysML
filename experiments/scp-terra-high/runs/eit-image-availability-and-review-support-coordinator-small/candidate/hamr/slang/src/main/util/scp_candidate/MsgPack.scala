// #Sireum
// @formatter:off

// This file is auto-generated from Acquisition_Token.scala, Input_Status.scala, Qualified_Acquisition.scala, Review_Intent.scala, Qualified_Intent.scala, Generation_Result.scala, Qualified_Generation_Result.scala, Image_State.scala, Recovery_Phase.scala, Resolution_Disposition.scala, Generation_Directive.scala, Image_Delivery.scala, Availability_Status.scala, Acquisition_Sample.scala, Review_Intent_Sample.scala, Generation_Result_Sample.scala, Image_Resolution.scala, Base_Types.scala, Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_Containers.scala, Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_Containers.scala, Generation_Result_Qualification_image_availability_process_generation_result_qualification_Containers.scala, Image_Availability_Governor_image_availability_process_image_availability_governor_Containers.scala, Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_Containers.scala, Doctor_Publication_image_availability_process_doctor_publication_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val EIT_Image_Availability_CoordinatorAcquisition_Token_Payload: Z = -32

    val EIT_Image_Availability_CoordinatorInput_Status_Payload: Z = -31

    val EIT_Image_Availability_CoordinatorQualified_Acquisition_Payload: Z = -30

    val EIT_Image_Availability_CoordinatorReview_Intent_Payload: Z = -29

    val EIT_Image_Availability_CoordinatorQualified_Intent_Payload: Z = -28

    val EIT_Image_Availability_CoordinatorGeneration_Result_Payload: Z = -27

    val EIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload: Z = -26

    val EIT_Image_Availability_CoordinatorImage_State_Payload: Z = -25

    val EIT_Image_Availability_CoordinatorRecovery_Phase_Payload: Z = -24

    val EIT_Image_Availability_CoordinatorResolution_Disposition_Payload: Z = -23

    val EIT_Image_Availability_CoordinatorGeneration_Directive_Payload: Z = -22

    val EIT_Image_Availability_CoordinatorImage_Delivery_Payload: Z = -21

    val EIT_Image_Availability_CoordinatorAvailability_Status_Payload: Z = -20

    val EIT_Image_Availability_CoordinatorAcquisition_Sample: Z = -19

    val EIT_Image_Availability_CoordinatorAcquisition_Sample_Payload: Z = -18

    val EIT_Image_Availability_CoordinatorReview_Intent_Sample: Z = -17

    val EIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload: Z = -16

    val EIT_Image_Availability_CoordinatorGeneration_Result_Sample: Z = -15

    val EIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload: Z = -14

    val EIT_Image_Availability_CoordinatorImage_Resolution: Z = -13

    val EIT_Image_Availability_CoordinatorImage_Resolution_Payload: Z = -12

    val Base_TypesBoolean_Payload: Z = -11

    val Base_TypesInteger_Payload: Z = -10

    val Base_TypesInteger_8_Payload: Z = -9

    val Base_TypesInteger_16_Payload: Z = -8

    val Base_TypesInteger_32_Payload: Z = -7

    val Base_TypesInteger_64_Payload: Z = -6

    val Base_TypesUnsigned_8_Payload: Z = -5

    val Base_TypesUnsigned_16_Payload: Z = -4

    val Base_TypesUnsigned_32_Payload: Z = -3

    val Base_TypesUnsigned_64_Payload: Z = -2

    val Base_TypesFloat_Payload: Z = -1

    val Base_TypesFloat_32_Payload: Z = 0

    val Base_TypesFloat_64_Payload: Z = 1

    val Base_TypesCharacter_Payload: Z = 2

    val Base_TypesString_Payload: Z = 3

    val Base_TypesBits_Payload: Z = 4

    val EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P: Z = 5

    val EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS: Z = 6

    val EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P: Z = 7

    val EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS: Z = 8

    val EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P: Z = 9

    val EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS: Z = 10

    val EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P: Z = 11

    val EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS: Z = 12

    val EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P: Z = 13

    val EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS: Z = 14

    val EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P: Z = 15

    val EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS: Z = 16

    val EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P: Z = 17

    val EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS: Z = 18

    val EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P: Z = 19

    val EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS: Z = 20

    val EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P: Z = 21

    val EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS: Z = 22

    val EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P: Z = 23

    val EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS: Z = 24

    val EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P: Z = 25

    val EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS: Z = 26

    val EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P: Z = 27

    val EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS: Z = 28

    val utilEmptyContainer: Z = 29

    val _artEmpty: Z = 30

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeEIT_Image_Availability_CoordinatorAcquisition_TokenType(o: EIT_Image_Availability_Coordinator.Acquisition_Token.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorAcquisition_Token_Payload(o: EIT_Image_Availability_Coordinator.Acquisition_Token_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAcquisition_Token_Payload)
      writeEIT_Image_Availability_CoordinatorAcquisition_TokenType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorInput_StatusType(o: EIT_Image_Availability_Coordinator.Input_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorInput_Status_Payload(o: EIT_Image_Availability_Coordinator.Input_Status_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorInput_Status_Payload)
      writeEIT_Image_Availability_CoordinatorInput_StatusType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(o: EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorQualified_Acquisition_Payload)
      writeEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorReview_IntentType(o: EIT_Image_Availability_Coordinator.Review_Intent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorReview_Intent_Payload(o: EIT_Image_Availability_Coordinator.Review_Intent_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorReview_Intent_Payload)
      writeEIT_Image_Availability_CoordinatorReview_IntentType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorQualified_IntentType(o: EIT_Image_Availability_Coordinator.Qualified_Intent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorQualified_Intent_Payload(o: EIT_Image_Availability_Coordinator.Qualified_Intent_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorQualified_Intent_Payload)
      writeEIT_Image_Availability_CoordinatorQualified_IntentType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_ResultType(o: EIT_Image_Availability_Coordinator.Generation_Result.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Result_Payload(o: EIT_Image_Availability_Coordinator.Generation_Result_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Payload)
      writeEIT_Image_Availability_CoordinatorGeneration_ResultType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorQualified_Generation_ResultType(o: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(o: EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload)
      writeEIT_Image_Availability_CoordinatorQualified_Generation_ResultType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorImage_StateType(o: EIT_Image_Availability_Coordinator.Image_State.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorImage_State_Payload(o: EIT_Image_Availability_Coordinator.Image_State_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorImage_State_Payload)
      writeEIT_Image_Availability_CoordinatorImage_StateType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorRecovery_PhaseType(o: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorRecovery_Phase_Payload(o: EIT_Image_Availability_Coordinator.Recovery_Phase_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorRecovery_Phase_Payload)
      writeEIT_Image_Availability_CoordinatorRecovery_PhaseType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorResolution_DispositionType(o: EIT_Image_Availability_Coordinator.Resolution_Disposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorResolution_Disposition_Payload(o: EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorResolution_Disposition_Payload)
      writeEIT_Image_Availability_CoordinatorResolution_DispositionType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_DirectiveType(o: EIT_Image_Availability_Coordinator.Generation_Directive.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Directive_Payload(o: EIT_Image_Availability_Coordinator.Generation_Directive_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Payload)
      writeEIT_Image_Availability_CoordinatorGeneration_DirectiveType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorImage_DeliveryType(o: EIT_Image_Availability_Coordinator.Image_Delivery.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorImage_Delivery_Payload(o: EIT_Image_Availability_Coordinator.Image_Delivery_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorImage_Delivery_Payload)
      writeEIT_Image_Availability_CoordinatorImage_DeliveryType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorAvailability_StatusType(o: EIT_Image_Availability_Coordinator.Availability_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Availability_CoordinatorAvailability_Status_Payload(o: EIT_Image_Availability_Coordinator.Availability_Status_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAvailability_Status_Payload)
      writeEIT_Image_Availability_CoordinatorAvailability_StatusType(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorAcquisition_Sample(o: EIT_Image_Availability_Coordinator.Acquisition_Sample): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAcquisition_Sample)
      writeEIT_Image_Availability_CoordinatorAcquisition_TokenType(o.token)
      writeEIT_Image_Availability_CoordinatorInput_StatusType(o.status)
    }

    def writeEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(o: EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorAcquisition_Sample_Payload)
      writeEIT_Image_Availability_CoordinatorAcquisition_Sample(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorReview_Intent_Sample(o: EIT_Image_Availability_Coordinator.Review_Intent_Sample): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorReview_Intent_Sample)
      writeEIT_Image_Availability_CoordinatorReview_IntentType(o.intent)
      writeEIT_Image_Availability_CoordinatorInput_StatusType(o.status)
    }

    def writeEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(o: EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload)
      writeEIT_Image_Availability_CoordinatorReview_Intent_Sample(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Result_Sample(o: EIT_Image_Availability_Coordinator.Generation_Result_Sample): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Sample)
      writeEIT_Image_Availability_CoordinatorGeneration_ResultType(o.result)
      writeEIT_Image_Availability_CoordinatorInput_StatusType(o.status)
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(o: EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload)
      writeEIT_Image_Availability_CoordinatorGeneration_Result_Sample(o.value)
    }

    def writeEIT_Image_Availability_CoordinatorImage_Resolution(o: EIT_Image_Availability_Coordinator.Image_Resolution): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorImage_Resolution)
      writeEIT_Image_Availability_CoordinatorImage_StateType(o.next_image_state)
      writeEIT_Image_Availability_CoordinatorRecovery_PhaseType(o.next_recovery_phase)
      writeEIT_Image_Availability_CoordinatorResolution_DispositionType(o.disposition)
    }

    def writeEIT_Image_Availability_CoordinatorImage_Resolution_Payload(o: EIT_Image_Availability_Coordinator.Image_Resolution_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorImage_Resolution_Payload)
      writeEIT_Image_Availability_CoordinatorImage_Resolution(o.value)
    }

    def writeBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBoolean_Payload)
      writer.writeB(o.value)
    }

    def writeBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_Payload)
      writer.writeZ(o.value)
    }

    def writeBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_8_Payload)
      writer.writeS8(o.value)
    }

    def writeBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_16_Payload)
      writer.writeS16(o.value)
    }

    def writeBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_32_Payload)
      writer.writeS32(o.value)
    }

    def writeBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_64_Payload)
      writer.writeS64(o.value)
    }

    def writeBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_8_Payload)
      writer.writeU8(o.value)
    }

    def writeBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_16_Payload)
      writer.writeU16(o.value)
    }

    def writeBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_32_Payload)
      writer.writeU32(o.value)
    }

    def writeBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_64_Payload)
      writer.writeU64(o.value)
    }

    def writeBase_TypesFloat_Payload(o: Base_Types.Float_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_Payload)
      writer.writeR(o.value)
    }

    def writeBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_32_Payload)
      writer.writeF32(o.value)
    }

    def writeBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_64_Payload)
      writer.writeF64(o.value)
    }

    def writeBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesCharacter_Payload)
      writer.writeC(o.value)
    }

    def writeBase_TypesString_Payload(o: Base_Types.String_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesString_Payload)
      writer.writeString(o.value)
    }

    def writeBase_TypesBits_Payload(o: Base_Types.Bits_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBits_Payload)
      writer.writeISZ(o.value, writer.writeB _)
    }

    def writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P => writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorAcquisition_Sample(o.api_acquisition_sample)
    }

    def writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorAcquisition_Sample(o.api_acquisition_sample)
    }

    def writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P => writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o.api_qualified_acquisition)
    }

    def writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o.api_qualified_acquisition)
    }

    def writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P => writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorReview_Intent_Sample(o.api_review_intent_sample)
    }

    def writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorReview_Intent_Sample(o.api_review_intent_sample)
    }

    def writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P => writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorQualified_IntentType(o.api_qualified_intent)
    }

    def writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorQualified_IntentType(o.api_qualified_intent)
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P => writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorGeneration_Result_Sample(o.api_generation_result_sample)
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorGeneration_Result_Sample(o.api_generation_result_sample)
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P => writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorQualified_Generation_ResultType(o.api_qualified_generation_result)
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorQualified_Generation_ResultType(o.api_qualified_generation_result)
    }

    def writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P => writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o.api_qualified_acquisition)
      writeEIT_Image_Availability_CoordinatorQualified_Generation_ResultType(o.api_qualified_generation_result)
      writeEIT_Image_Availability_CoordinatorQualified_IntentType(o.api_qualified_intent)
    }

    def writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o.api_qualified_acquisition)
      writeEIT_Image_Availability_CoordinatorQualified_Generation_ResultType(o.api_qualified_generation_result)
      writeEIT_Image_Availability_CoordinatorQualified_IntentType(o.api_qualified_intent)
    }

    def writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P => writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorImage_Resolution(o.api_generation_resolution)
      writeEIT_Image_Availability_CoordinatorImage_Resolution(o.api_publication_resolution)
    }

    def writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorImage_Resolution(o.api_generation_resolution)
      writeEIT_Image_Availability_CoordinatorImage_Resolution(o.api_publication_resolution)
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P => writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorImage_Resolution(o.api_image_resolution)
      writeEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o.api_qualified_acquisition)
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorImage_Resolution(o.api_image_resolution)
      writeEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o.api_qualified_acquisition)
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P => writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorGeneration_DirectiveType(o.api_generation_directive)
    }

    def writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorGeneration_DirectiveType(o.api_generation_directive)
    }

    def writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P => writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P)
      writeEIT_Image_Availability_CoordinatorImage_Resolution(o.api_image_resolution)
    }

    def writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS)
      writeEIT_Image_Availability_CoordinatorImage_Resolution(o.api_image_resolution)
    }

    def writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P => writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P)
      writeEIT_Image_Availability_CoordinatorAvailability_StatusType(o.api_availability_status)
      writeEIT_Image_Availability_CoordinatorImage_DeliveryType(o.api_image_delivery)
    }

    def writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS)
      writeEIT_Image_Availability_CoordinatorAvailability_StatusType(o.api_availability_status)
      writeEIT_Image_Availability_CoordinatorImage_DeliveryType(o.api_image_delivery)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P => writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P => writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P => writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P => writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P => writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P => writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P => writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P => writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P => writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P => writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P => writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P => writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(o)
      }
    }

    def writeutilEmptyContainer(o: util.EmptyContainer): Unit = {
      writer.writeZ(Constants.utilEmptyContainer)
    }

    def write_artDataContent(o: art.DataContent): Unit = {
      o match {
        case o: art.Empty => write_artEmpty(o)
        case o: Base_Types.Boolean_Payload => writeBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => writeBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => writeBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => writeBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => writeBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => writeBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => writeBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => writeBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => writeBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => writeBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => writeBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => writeBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => writeBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => writeBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => writeBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => writeBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: EIT_Image_Availability_Coordinator.Image_State_Payload => writeEIT_Image_Availability_CoordinatorImage_State_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Input_Status_Payload => writeEIT_Image_Availability_CoordinatorInput_Status_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Review_Intent_Payload => writeEIT_Image_Availability_CoordinatorReview_Intent_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Recovery_Phase_Payload => writeEIT_Image_Availability_CoordinatorRecovery_Phase_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Image_Delivery_Payload => writeEIT_Image_Availability_CoordinatorImage_Delivery_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Qualified_Intent_Payload => writeEIT_Image_Availability_CoordinatorQualified_Intent_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Image_Resolution_Payload => writeEIT_Image_Availability_CoordinatorImage_Resolution_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Payload => writeEIT_Image_Availability_CoordinatorGeneration_Result_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Acquisition_Token_Payload => writeEIT_Image_Availability_CoordinatorAcquisition_Token_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload => writeEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Availability_Status_Payload => writeEIT_Image_Availability_CoordinatorAvailability_Status_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Payload => writeEIT_Image_Availability_CoordinatorGeneration_Directive_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload => writeEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload => writeEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload => writeEIT_Image_Availability_CoordinatorResolution_Disposition_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload => writeEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload => writeEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P => writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P => writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P => writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P => writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P => writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P => writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P => writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P => writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P => writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P => writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P => writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS => writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P => writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS => writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(o)
      }
    }

    def write_artEmpty(o: art.Empty): Unit = {
      writer.writeZ(Constants._artEmpty)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readEIT_Image_Availability_CoordinatorAcquisition_TokenType(): EIT_Image_Availability_Coordinator.Acquisition_Token.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.Acquisition_Token.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorAcquisition_Token_Payload(): EIT_Image_Availability_Coordinator.Acquisition_Token_Payload = {
      val r = readEIT_Image_Availability_CoordinatorAcquisition_Token_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAcquisition_Token_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Acquisition_Token_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAcquisition_Token_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorAcquisition_TokenType()
      return EIT_Image_Availability_Coordinator.Acquisition_Token_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorInput_StatusType(): EIT_Image_Availability_Coordinator.Input_Status.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.Input_Status.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorInput_Status_Payload(): EIT_Image_Availability_Coordinator.Input_Status_Payload = {
      val r = readEIT_Image_Availability_CoordinatorInput_Status_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorInput_Status_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Input_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorInput_Status_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorInput_StatusType()
      return EIT_Image_Availability_Coordinator.Input_Status_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorQualified_AcquisitionType(): EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.Qualified_Acquisition.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(): EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload = {
      val r = readEIT_Image_Availability_CoordinatorQualified_Acquisition_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorQualified_Acquisition_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorQualified_Acquisition_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorQualified_AcquisitionType()
      return EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorReview_IntentType(): EIT_Image_Availability_Coordinator.Review_Intent.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.Review_Intent.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorReview_Intent_Payload(): EIT_Image_Availability_Coordinator.Review_Intent_Payload = {
      val r = readEIT_Image_Availability_CoordinatorReview_Intent_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorReview_Intent_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Review_Intent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorReview_Intent_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorReview_IntentType()
      return EIT_Image_Availability_Coordinator.Review_Intent_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorQualified_IntentType(): EIT_Image_Availability_Coordinator.Qualified_Intent.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.Qualified_Intent.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorQualified_Intent_Payload(): EIT_Image_Availability_Coordinator.Qualified_Intent_Payload = {
      val r = readEIT_Image_Availability_CoordinatorQualified_Intent_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorQualified_Intent_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Qualified_Intent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorQualified_Intent_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorQualified_IntentType()
      return EIT_Image_Availability_Coordinator.Qualified_Intent_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorGeneration_ResultType(): EIT_Image_Availability_Coordinator.Generation_Result.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.Generation_Result.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_Payload(): EIT_Image_Availability_Coordinator.Generation_Result_Payload = {
      val r = readEIT_Image_Availability_CoordinatorGeneration_Result_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Result_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorGeneration_ResultType()
      return EIT_Image_Availability_Coordinator.Generation_Result_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorQualified_Generation_ResultType(): EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.Qualified_Generation_Result.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(): EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload = {
      val r = readEIT_Image_Availability_CoordinatorQualified_Generation_Result_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorQualified_Generation_Result_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorQualified_Generation_ResultType()
      return EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorImage_StateType(): EIT_Image_Availability_Coordinator.Image_State.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.Image_State.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorImage_State_Payload(): EIT_Image_Availability_Coordinator.Image_State_Payload = {
      val r = readEIT_Image_Availability_CoordinatorImage_State_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorImage_State_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Image_State_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorImage_State_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorImage_StateType()
      return EIT_Image_Availability_Coordinator.Image_State_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorRecovery_PhaseType(): EIT_Image_Availability_Coordinator.Recovery_Phase.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.Recovery_Phase.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorRecovery_Phase_Payload(): EIT_Image_Availability_Coordinator.Recovery_Phase_Payload = {
      val r = readEIT_Image_Availability_CoordinatorRecovery_Phase_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorRecovery_Phase_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Recovery_Phase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorRecovery_Phase_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorRecovery_PhaseType()
      return EIT_Image_Availability_Coordinator.Recovery_Phase_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorResolution_DispositionType(): EIT_Image_Availability_Coordinator.Resolution_Disposition.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.Resolution_Disposition.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorResolution_Disposition_Payload(): EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload = {
      val r = readEIT_Image_Availability_CoordinatorResolution_Disposition_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorResolution_Disposition_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorResolution_Disposition_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorResolution_DispositionType()
      return EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorGeneration_DirectiveType(): EIT_Image_Availability_Coordinator.Generation_Directive.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.Generation_Directive.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Directive_Payload(): EIT_Image_Availability_Coordinator.Generation_Directive_Payload = {
      val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Directive_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Directive_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorGeneration_DirectiveType()
      return EIT_Image_Availability_Coordinator.Generation_Directive_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorImage_DeliveryType(): EIT_Image_Availability_Coordinator.Image_Delivery.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.Image_Delivery.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorImage_Delivery_Payload(): EIT_Image_Availability_Coordinator.Image_Delivery_Payload = {
      val r = readEIT_Image_Availability_CoordinatorImage_Delivery_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorImage_Delivery_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Image_Delivery_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorImage_Delivery_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorImage_DeliveryType()
      return EIT_Image_Availability_Coordinator.Image_Delivery_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorAvailability_StatusType(): EIT_Image_Availability_Coordinator.Availability_Status.Type = {
      val r = reader.readZ()
      return EIT_Image_Availability_Coordinator.Availability_Status.byOrdinal(r).get
    }

    def readEIT_Image_Availability_CoordinatorAvailability_Status_Payload(): EIT_Image_Availability_Coordinator.Availability_Status_Payload = {
      val r = readEIT_Image_Availability_CoordinatorAvailability_Status_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAvailability_Status_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Availability_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAvailability_Status_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorAvailability_StatusType()
      return EIT_Image_Availability_Coordinator.Availability_Status_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorAcquisition_Sample(): EIT_Image_Availability_Coordinator.Acquisition_Sample = {
      val r = readEIT_Image_Availability_CoordinatorAcquisition_SampleT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAcquisition_SampleT(typeParsed: B): EIT_Image_Availability_Coordinator.Acquisition_Sample = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAcquisition_Sample)
      }
      val token = readEIT_Image_Availability_CoordinatorAcquisition_TokenType()
      val status = readEIT_Image_Availability_CoordinatorInput_StatusType()
      return EIT_Image_Availability_Coordinator.Acquisition_Sample(token, status)
    }

    def readEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(): EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload = {
      val r = readEIT_Image_Availability_CoordinatorAcquisition_Sample_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorAcquisition_Sample_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorAcquisition_Sample_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorAcquisition_Sample()
      return EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorReview_Intent_Sample(): EIT_Image_Availability_Coordinator.Review_Intent_Sample = {
      val r = readEIT_Image_Availability_CoordinatorReview_Intent_SampleT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorReview_Intent_SampleT(typeParsed: B): EIT_Image_Availability_Coordinator.Review_Intent_Sample = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorReview_Intent_Sample)
      }
      val intent = readEIT_Image_Availability_CoordinatorReview_IntentType()
      val status = readEIT_Image_Availability_CoordinatorInput_StatusType()
      return EIT_Image_Availability_Coordinator.Review_Intent_Sample(intent, status)
    }

    def readEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(): EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload = {
      val r = readEIT_Image_Availability_CoordinatorReview_Intent_Sample_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorReview_Intent_Sample_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorReview_Intent_Sample()
      return EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_Sample(): EIT_Image_Availability_Coordinator.Generation_Result_Sample = {
      val r = readEIT_Image_Availability_CoordinatorGeneration_Result_SampleT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_SampleT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Result_Sample = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Sample)
      }
      val result = readEIT_Image_Availability_CoordinatorGeneration_ResultType()
      val status = readEIT_Image_Availability_CoordinatorInput_StatusType()
      return EIT_Image_Availability_Coordinator.Generation_Result_Sample(result, status)
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(): EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload = {
      val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Sample_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_Sample_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorGeneration_Result_Sample()
      return EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorImage_Resolution(): EIT_Image_Availability_Coordinator.Image_Resolution = {
      val r = readEIT_Image_Availability_CoordinatorImage_ResolutionT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorImage_ResolutionT(typeParsed: B): EIT_Image_Availability_Coordinator.Image_Resolution = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorImage_Resolution)
      }
      val next_image_state = readEIT_Image_Availability_CoordinatorImage_StateType()
      val next_recovery_phase = readEIT_Image_Availability_CoordinatorRecovery_PhaseType()
      val disposition = readEIT_Image_Availability_CoordinatorResolution_DispositionType()
      return EIT_Image_Availability_Coordinator.Image_Resolution(next_image_state, next_recovery_phase, disposition)
    }

    def readEIT_Image_Availability_CoordinatorImage_Resolution_Payload(): EIT_Image_Availability_Coordinator.Image_Resolution_Payload = {
      val r = readEIT_Image_Availability_CoordinatorImage_Resolution_PayloadT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorImage_Resolution_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Image_Resolution_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorImage_Resolution_Payload)
      }
      val value = readEIT_Image_Availability_CoordinatorImage_Resolution()
      return EIT_Image_Availability_Coordinator.Image_Resolution_Payload(value)
    }

    def readBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = readBase_TypesBoolean_PayloadT(F)
      return r
    }

    def readBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBoolean_Payload)
      }
      val value = reader.readB()
      return Base_Types.Boolean_Payload(value)
    }

    def readBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = readBase_TypesInteger_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_Payload)
      }
      val value = reader.readZ()
      return Base_Types.Integer_Payload(value)
    }

    def readBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = readBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_8_Payload)
      }
      val value = reader.readS8()
      return Base_Types.Integer_8_Payload(value)
    }

    def readBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = readBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_16_Payload)
      }
      val value = reader.readS16()
      return Base_Types.Integer_16_Payload(value)
    }

    def readBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = readBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_32_Payload)
      }
      val value = reader.readS32()
      return Base_Types.Integer_32_Payload(value)
    }

    def readBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = readBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_64_Payload)
      }
      val value = reader.readS64()
      return Base_Types.Integer_64_Payload(value)
    }

    def readBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = readBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_8_Payload)
      }
      val value = reader.readU8()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def readBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = readBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_16_Payload)
      }
      val value = reader.readU16()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def readBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = readBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_32_Payload)
      }
      val value = reader.readU32()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def readBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = readBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_64_Payload)
      }
      val value = reader.readU64()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def readBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = readBase_TypesFloat_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_Payload)
      }
      val value = reader.readR()
      return Base_Types.Float_Payload(value)
    }

    def readBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = readBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_32_Payload)
      }
      val value = reader.readF32()
      return Base_Types.Float_32_Payload(value)
    }

    def readBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = readBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_64_Payload)
      }
      val value = reader.readF64()
      return Base_Types.Float_64_Payload(value)
    }

    def readBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = readBase_TypesCharacter_PayloadT(F)
      return r
    }

    def readBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesCharacter_Payload)
      }
      val value = reader.readC()
      return Base_Types.Character_Payload(value)
    }

    def readBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = readBase_TypesString_PayloadT(F)
      return r
    }

    def readBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesString_Payload)
      }
      val value = reader.readString()
      return Base_Types.String_Payload(value)
    }

    def readBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = readBase_TypesBits_PayloadT(F)
      return r
    }

    def readBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBits_Payload)
      }
      val value = reader.readISZ(reader.readB _)
      return Base_Types.Bits_Payload(value)
    }

    def readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container(): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P)
      }
      val api_acquisition_sample = readEIT_Image_Availability_CoordinatorAcquisition_Sample()
      return EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(api_acquisition_sample)
    }

    def readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS)
      }
      val api_acquisition_sample = readEIT_Image_Availability_CoordinatorAcquisition_Sample()
      return EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(api_acquisition_sample)
    }

    def readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container(): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P)
      }
      val api_qualified_acquisition = readEIT_Image_Availability_CoordinatorQualified_AcquisitionType()
      return EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(api_qualified_acquisition)
    }

    def readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS)
      }
      val api_qualified_acquisition = readEIT_Image_Availability_CoordinatorQualified_AcquisitionType()
      return EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(api_qualified_acquisition)
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container(): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P)
      }
      val api_review_intent_sample = readEIT_Image_Availability_CoordinatorReview_Intent_Sample()
      return EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(api_review_intent_sample)
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS)
      }
      val api_review_intent_sample = readEIT_Image_Availability_CoordinatorReview_Intent_Sample()
      return EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(api_review_intent_sample)
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container(): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P)
      }
      val api_qualified_intent = readEIT_Image_Availability_CoordinatorQualified_IntentType()
      return EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(api_qualified_intent)
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS)
      }
      val api_qualified_intent = readEIT_Image_Availability_CoordinatorQualified_IntentType()
      return EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(api_qualified_intent)
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container(): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P)
      }
      val api_generation_result_sample = readEIT_Image_Availability_CoordinatorGeneration_Result_Sample()
      return EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(api_generation_result_sample)
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS)
      }
      val api_generation_result_sample = readEIT_Image_Availability_CoordinatorGeneration_Result_Sample()
      return EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(api_generation_result_sample)
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container(): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P)
      }
      val api_qualified_generation_result = readEIT_Image_Availability_CoordinatorQualified_Generation_ResultType()
      return EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(api_qualified_generation_result)
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS)
      }
      val api_qualified_generation_result = readEIT_Image_Availability_CoordinatorQualified_Generation_ResultType()
      return EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(api_qualified_generation_result)
    }

    def readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container(): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P)
      }
      val api_qualified_acquisition = readEIT_Image_Availability_CoordinatorQualified_AcquisitionType()
      val api_qualified_generation_result = readEIT_Image_Availability_CoordinatorQualified_Generation_ResultType()
      val api_qualified_intent = readEIT_Image_Availability_CoordinatorQualified_IntentType()
      return EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(api_qualified_acquisition, api_qualified_generation_result, api_qualified_intent)
    }

    def readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS)
      }
      val api_qualified_acquisition = readEIT_Image_Availability_CoordinatorQualified_AcquisitionType()
      val api_qualified_generation_result = readEIT_Image_Availability_CoordinatorQualified_Generation_ResultType()
      val api_qualified_intent = readEIT_Image_Availability_CoordinatorQualified_IntentType()
      return EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(api_qualified_acquisition, api_qualified_generation_result, api_qualified_intent)
    }

    def readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container(): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P)
      }
      val api_generation_resolution = readEIT_Image_Availability_CoordinatorImage_Resolution()
      val api_publication_resolution = readEIT_Image_Availability_CoordinatorImage_Resolution()
      return EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(api_generation_resolution, api_publication_resolution)
    }

    def readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS)
      }
      val api_generation_resolution = readEIT_Image_Availability_CoordinatorImage_Resolution()
      val api_publication_resolution = readEIT_Image_Availability_CoordinatorImage_Resolution()
      return EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(api_generation_resolution, api_publication_resolution)
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container(): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P)
      }
      val api_image_resolution = readEIT_Image_Availability_CoordinatorImage_Resolution()
      val api_qualified_acquisition = readEIT_Image_Availability_CoordinatorQualified_AcquisitionType()
      return EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(api_image_resolution, api_qualified_acquisition)
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS)
      }
      val api_image_resolution = readEIT_Image_Availability_CoordinatorImage_Resolution()
      val api_qualified_acquisition = readEIT_Image_Availability_CoordinatorQualified_AcquisitionType()
      return EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(api_image_resolution, api_qualified_acquisition)
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container(): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P)
      }
      val api_generation_directive = readEIT_Image_Availability_CoordinatorGeneration_DirectiveType()
      return EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(api_generation_directive)
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS)
      }
      val api_generation_directive = readEIT_Image_Availability_CoordinatorGeneration_DirectiveType()
      return EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(api_generation_directive)
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container(): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container.")
          val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P)
      }
      val api_image_resolution = readEIT_Image_Availability_CoordinatorImage_Resolution()
      return EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(api_image_resolution)
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS)
      }
      val api_image_resolution = readEIT_Image_Availability_CoordinatorImage_Resolution()
      return EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(api_image_resolution)
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container(): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container.")
          val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P = {
      val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P)
      }
      val api_availability_status = readEIT_Image_Availability_CoordinatorAvailability_StatusType()
      val api_image_delivery = readEIT_Image_Availability_CoordinatorImage_DeliveryType()
      return EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(api_availability_status, api_image_delivery)
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS = {
      val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS)
      }
      val api_availability_status = readEIT_Image_Availability_CoordinatorAvailability_StatusType()
      val api_image_delivery = readEIT_Image_Availability_CoordinatorImage_DeliveryType()
      return EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(api_availability_status, api_image_delivery)
    }

    def readruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = reader.readZ()
      return runtimemonitor.ObservationKind.byOrdinal(r).get
    }

    def readutilContainer(): util.Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readutilEmptyContainer(): util.EmptyContainer = {
      val r = readutilEmptyContainerT(F)
      return r
    }

    def readutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        reader.expectZ(Constants.utilEmptyContainer)
      }
      return util.EmptyContainer()
    }

    def read_artDataContent(): art.DataContent = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._artEmpty => val r = read_artEmptyT(T); return r
        case Constants.Base_TypesBoolean_Payload => val r = readBase_TypesBoolean_PayloadT(T); return r
        case Constants.Base_TypesInteger_Payload => val r = readBase_TypesInteger_PayloadT(T); return r
        case Constants.Base_TypesInteger_8_Payload => val r = readBase_TypesInteger_8_PayloadT(T); return r
        case Constants.Base_TypesInteger_16_Payload => val r = readBase_TypesInteger_16_PayloadT(T); return r
        case Constants.Base_TypesInteger_32_Payload => val r = readBase_TypesInteger_32_PayloadT(T); return r
        case Constants.Base_TypesInteger_64_Payload => val r = readBase_TypesInteger_64_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_8_Payload => val r = readBase_TypesUnsigned_8_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_16_Payload => val r = readBase_TypesUnsigned_16_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_32_Payload => val r = readBase_TypesUnsigned_32_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_64_Payload => val r = readBase_TypesUnsigned_64_PayloadT(T); return r
        case Constants.Base_TypesFloat_Payload => val r = readBase_TypesFloat_PayloadT(T); return r
        case Constants.Base_TypesFloat_32_Payload => val r = readBase_TypesFloat_32_PayloadT(T); return r
        case Constants.Base_TypesFloat_64_Payload => val r = readBase_TypesFloat_64_PayloadT(T); return r
        case Constants.Base_TypesCharacter_Payload => val r = readBase_TypesCharacter_PayloadT(T); return r
        case Constants.Base_TypesString_Payload => val r = readBase_TypesString_PayloadT(T); return r
        case Constants.Base_TypesBits_Payload => val r = readBase_TypesBits_PayloadT(T); return r
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImage_State_Payload => val r = readEIT_Image_Availability_CoordinatorImage_State_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorInput_Status_Payload => val r = readEIT_Image_Availability_CoordinatorInput_Status_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorReview_Intent_Payload => val r = readEIT_Image_Availability_CoordinatorReview_Intent_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorRecovery_Phase_Payload => val r = readEIT_Image_Availability_CoordinatorRecovery_Phase_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImage_Delivery_Payload => val r = readEIT_Image_Availability_CoordinatorImage_Delivery_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorQualified_Intent_Payload => val r = readEIT_Image_Availability_CoordinatorQualified_Intent_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImage_Resolution_Payload => val r = readEIT_Image_Availability_CoordinatorImage_Resolution_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Payload => val r = readEIT_Image_Availability_CoordinatorGeneration_Result_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAcquisition_Token_Payload => val r = readEIT_Image_Availability_CoordinatorAcquisition_Token_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAcquisition_Sample_Payload => val r = readEIT_Image_Availability_CoordinatorAcquisition_Sample_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorAvailability_Status_Payload => val r = readEIT_Image_Availability_CoordinatorAvailability_Status_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Payload => val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload => val r = readEIT_Image_Availability_CoordinatorReview_Intent_Sample_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorQualified_Acquisition_Payload => val r = readEIT_Image_Availability_CoordinatorQualified_Acquisition_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorResolution_Disposition_Payload => val r = readEIT_Image_Availability_CoordinatorResolution_Disposition_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload => val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Sample_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload => val r = readEIT_Image_Availability_CoordinatorQualified_Generation_Result_PayloadT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P => val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS => val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P => val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS => val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def read_artEmpty(): art.Empty = {
      val r = read_artEmptyT(F)
      return r
    }

    def read_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        reader.expectZ(Constants._artEmpty)
      }
      return art.Empty()
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromEIT_Image_Availability_CoordinatorAcquisition_Token_Payload(o: EIT_Image_Availability_Coordinator.Acquisition_Token_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAcquisition_Token_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAcquisition_Token_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Acquisition_Token_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAcquisition_Token_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Acquisition_Token_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorAcquisition_Token_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAcquisition_Token_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorInput_Status_Payload(o: EIT_Image_Availability_Coordinator.Input_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorInput_Status_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorInput_Status_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Input_Status_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorInput_Status_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Input_Status_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorInput_Status_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorInput_Status_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(o: EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReview_Intent_Payload(o: EIT_Image_Availability_Coordinator.Review_Intent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorReview_Intent_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorReview_Intent_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Review_Intent_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReview_Intent_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Review_Intent_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorReview_Intent_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorReview_Intent_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorQualified_Intent_Payload(o: EIT_Image_Availability_Coordinator.Qualified_Intent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorQualified_Intent_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorQualified_Intent_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Qualified_Intent_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorQualified_Intent_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Qualified_Intent_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorQualified_Intent_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorQualified_Intent_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Payload(o: EIT_Image_Availability_Coordinator.Generation_Result_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Result_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Result_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Result_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Result_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Result_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(o: EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_State_Payload(o: EIT_Image_Availability_Coordinator.Image_State_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImage_State_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImage_State_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Image_State_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_State_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Image_State_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorImage_State_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImage_State_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecovery_Phase_Payload(o: EIT_Image_Availability_Coordinator.Recovery_Phase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorRecovery_Phase_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorRecovery_Phase_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Recovery_Phase_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecovery_Phase_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Recovery_Phase_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorRecovery_Phase_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorRecovery_Phase_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorResolution_Disposition_Payload(o: EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorResolution_Disposition_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorResolution_Disposition_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorResolution_Disposition_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorResolution_Disposition_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorResolution_Disposition_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Directive_Payload(o: EIT_Image_Availability_Coordinator.Generation_Directive_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Directive_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Directive_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Directive_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Directive_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Directive_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Directive_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Directive_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Delivery_Payload(o: EIT_Image_Availability_Coordinator.Image_Delivery_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImage_Delivery_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImage_Delivery_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Image_Delivery_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Delivery_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Image_Delivery_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorImage_Delivery_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImage_Delivery_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailability_Status_Payload(o: EIT_Image_Availability_Coordinator.Availability_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAvailability_Status_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAvailability_Status_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Availability_Status_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailability_Status_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Availability_Status_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorAvailability_Status_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAvailability_Status_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAcquisition_Sample(o: EIT_Image_Availability_Coordinator.Acquisition_Sample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAcquisition_Sample(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAcquisition_Sample(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Acquisition_Sample, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAcquisition_Sample(reader: Reader): EIT_Image_Availability_Coordinator.Acquisition_Sample = {
      val r = reader.readEIT_Image_Availability_CoordinatorAcquisition_Sample()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAcquisition_Sample _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(o: EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReview_Intent_Sample(o: EIT_Image_Availability_Coordinator.Review_Intent_Sample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorReview_Intent_Sample(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorReview_Intent_Sample(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Review_Intent_Sample, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReview_Intent_Sample(reader: Reader): EIT_Image_Availability_Coordinator.Review_Intent_Sample = {
      val r = reader.readEIT_Image_Availability_CoordinatorReview_Intent_Sample()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorReview_Intent_Sample _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(o: EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Sample(o: EIT_Image_Availability_Coordinator.Generation_Result_Sample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Result_Sample(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Sample(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Result_Sample, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Sample(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Result_Sample = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Result_Sample()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Result_Sample _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(o: EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Resolution(o: EIT_Image_Availability_Coordinator.Image_Resolution, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImage_Resolution(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImage_Resolution(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Image_Resolution, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Resolution(reader: Reader): EIT_Image_Availability_Coordinator.Image_Resolution = {
      val r = reader.readEIT_Image_Availability_CoordinatorImage_Resolution()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImage_Resolution _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Resolution_Payload(o: EIT_Image_Availability_Coordinator.Image_Resolution_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImage_Resolution_Payload(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImage_Resolution_Payload(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Image_Resolution_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Resolution_Payload(reader: Reader): EIT_Image_Availability_Coordinator.Image_Resolution_Payload = {
      val r = reader.readEIT_Image_Availability_CoordinatorImage_Resolution_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImage_Resolution_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBoolean_Payload(o)
    return w.result
  }

  def toBase_TypesBoolean_Payload(data: ISZ[U8]): Either[Base_Types.Boolean_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(reader: Reader): Base_Types.Boolean_Payload = {
      val r = reader.readBase_TypesBoolean_Payload()
      return r
    }
    val r = to(data, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_Payload(data: ISZ[U8]): Either[Base_Types.Integer_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_Payload(reader: Reader): Base_Types.Integer_Payload = {
      val r = reader.readBase_TypesInteger_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_8_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_8_Payload(data: ISZ[U8]): Either[Base_Types.Integer_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(reader: Reader): Base_Types.Integer_8_Payload = {
      val r = reader.readBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_16_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_16_Payload(data: ISZ[U8]): Either[Base_Types.Integer_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(reader: Reader): Base_Types.Integer_16_Payload = {
      val r = reader.readBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_32_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_32_Payload(data: ISZ[U8]): Either[Base_Types.Integer_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(reader: Reader): Base_Types.Integer_32_Payload = {
      val r = reader.readBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_64_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_64_Payload(data: ISZ[U8]): Either[Base_Types.Integer_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(reader: Reader): Base_Types.Integer_64_Payload = {
      val r = reader.readBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_8_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_8_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(reader: Reader): Base_Types.Unsigned_8_Payload = {
      val r = reader.readBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_16_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_16_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(reader: Reader): Base_Types.Unsigned_16_Payload = {
      val r = reader.readBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_32_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_32_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(reader: Reader): Base_Types.Unsigned_32_Payload = {
      val r = reader.readBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_64_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_64_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(reader: Reader): Base_Types.Unsigned_64_Payload = {
      val r = reader.readBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_Payload(data: ISZ[U8]): Either[Base_Types.Float_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_Payload(reader: Reader): Base_Types.Float_Payload = {
      val r = reader.readBase_TypesFloat_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_32_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_32_Payload(data: ISZ[U8]): Either[Base_Types.Float_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(reader: Reader): Base_Types.Float_32_Payload = {
      val r = reader.readBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_64_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_64_Payload(data: ISZ[U8]): Either[Base_Types.Float_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(reader: Reader): Base_Types.Float_64_Payload = {
      val r = reader.readBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesCharacter_Payload(o)
    return w.result
  }

  def toBase_TypesCharacter_Payload(data: ISZ[U8]): Either[Base_Types.Character_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(reader: Reader): Base_Types.Character_Payload = {
      val r = reader.readBase_TypesCharacter_Payload()
      return r
    }
    val r = to(data, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesString_Payload(o)
    return w.result
  }

  def toBase_TypesString_Payload(data: ISZ[U8]): Either[Base_Types.String_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesString_Payload(reader: Reader): Base_Types.String_Payload = {
      val r = reader.readBase_TypesString_Payload()
      return r
    }
    val r = to(data, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBits_Payload(o)
    return w.result
  }

  def toBase_TypesBits_Payload(data: ISZ[U8]): Either[Base_Types.Bits_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBits_Payload(reader: Reader): Base_Types.Bits_Payload = {
      val r = reader.readBase_TypesBits_Payload()
      return r
    }
    val r = to(data, fBase_TypesBits_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container(reader: Reader): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container(reader: Reader): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(reader: Reader): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(reader: Reader): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS = {
      val r = reader.readEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilContainer(o)
    return w.result
  }

  def toutilContainer(data: ISZ[U8]): Either[util.Container, MessagePack.ErrorMsg] = {
    def futilContainer(reader: Reader): util.Container = {
      val r = reader.readutilContainer()
      return r
    }
    val r = to(data, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilEmptyContainer(o)
    return w.result
  }

  def toutilEmptyContainer(data: ISZ[U8]): Either[util.EmptyContainer, MessagePack.ErrorMsg] = {
    def futilEmptyContainer(reader: Reader): util.EmptyContainer = {
      val r = reader.readutilEmptyContainer()
      return r
    }
    val r = to(data, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artDataContent(o)
    return w.result
  }

  def to_artDataContent(data: ISZ[U8]): Either[art.DataContent, MessagePack.ErrorMsg] = {
    def f_artDataContent(reader: Reader): art.DataContent = {
      val r = reader.read_artDataContent()
      return r
    }
    val r = to(data, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artEmpty(o)
    return w.result
  }

  def to_artEmpty(data: ISZ[U8]): Either[art.Empty, MessagePack.ErrorMsg] = {
    def f_artEmpty(reader: Reader): art.Empty = {
      val r = reader.read_artEmpty()
      return r
    }
    val r = to(data, f_artEmpty _)
    return r
  }

}