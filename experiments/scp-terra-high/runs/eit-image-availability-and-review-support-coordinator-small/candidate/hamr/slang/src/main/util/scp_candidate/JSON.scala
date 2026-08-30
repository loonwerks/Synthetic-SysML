// #Sireum
// @formatter:off

// This file is auto-generated from Acquisition_Token.scala, Input_Status.scala, Qualified_Acquisition.scala, Review_Intent.scala, Qualified_Intent.scala, Generation_Result.scala, Qualified_Generation_Result.scala, Image_State.scala, Recovery_Phase.scala, Resolution_Disposition.scala, Generation_Directive.scala, Image_Delivery.scala, Availability_Status.scala, Acquisition_Sample.scala, Review_Intent_Sample.scala, Generation_Result_Sample.scala, Image_Resolution.scala, Base_Types.scala, Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_Containers.scala, Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_Containers.scala, Generation_Result_Qualification_image_availability_process_generation_result_qualification_Containers.scala, Image_Availability_Governor_image_availability_process_image_availability_governor_Containers.scala, Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_Containers.scala, Doctor_Publication_image_availability_process_doctor_publication_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printEIT_Image_Availability_CoordinatorAcquisition_TokenType(o: EIT_Image_Availability_Coordinator.Acquisition_Token.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.Acquisition_Token.NoAcquisition => "NoAcquisition"
        case EIT_Image_Availability_Coordinator.Acquisition_Token.AcquisitionA => "AcquisitionA"
        case EIT_Image_Availability_Coordinator.Acquisition_Token.AcquisitionB => "AcquisitionB"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.Acquisition_Token")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAcquisition_Token_Payload(o: EIT_Image_Availability_Coordinator.Acquisition_Token_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Acquisition_Token_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorAcquisition_TokenType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorInput_StatusType(o: EIT_Image_Availability_Coordinator.Input_Status.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.Input_Status.Valid => "Valid"
        case EIT_Image_Availability_Coordinator.Input_Status.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.Input_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorInput_Status_Payload(o: EIT_Image_Availability_Coordinator.Input_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Input_Status_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorInput_StatusType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.Qualified_Acquisition.InvalidAcquisition => "InvalidAcquisition"
        case EIT_Image_Availability_Coordinator.Qualified_Acquisition.NoAdmittedAcquisition => "NoAdmittedAcquisition"
        case EIT_Image_Availability_Coordinator.Qualified_Acquisition.AdmittedA => "AdmittedA"
        case EIT_Image_Availability_Coordinator.Qualified_Acquisition.AdmittedB => "AdmittedB"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.Qualified_Acquisition")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(o: EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorReview_IntentType(o: EIT_Image_Availability_Coordinator.Review_Intent.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.Review_Intent.NoIntent => "NoIntent"
        case EIT_Image_Availability_Coordinator.Review_Intent.RequestImage => "RequestImage"
        case EIT_Image_Availability_Coordinator.Review_Intent.ReleaseImage => "ReleaseImage"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.Review_Intent")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorReview_Intent_Payload(o: EIT_Image_Availability_Coordinator.Review_Intent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Review_Intent_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorReview_IntentType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorQualified_IntentType(o: EIT_Image_Availability_Coordinator.Qualified_Intent.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.Qualified_Intent.InvalidIntent => "InvalidIntent"
        case EIT_Image_Availability_Coordinator.Qualified_Intent.NeutralIntent => "NeutralIntent"
        case EIT_Image_Availability_Coordinator.Qualified_Intent.FreshImageRequest => "FreshImageRequest"
        case EIT_Image_Availability_Coordinator.Qualified_Intent.ReleaseIntent => "ReleaseIntent"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.Qualified_Intent")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorQualified_Intent_Payload(o: EIT_Image_Availability_Coordinator.Qualified_Intent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Qualified_Intent_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorQualified_IntentType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_ResultType(o: EIT_Image_Availability_Coordinator.Generation_Result.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.Generation_Result.NoResult => "NoResult"
        case EIT_Image_Availability_Coordinator.Generation_Result.GenerationFailed => "GenerationFailed"
        case EIT_Image_Availability_Coordinator.Generation_Result.ImageA => "ImageA"
        case EIT_Image_Availability_Coordinator.Generation_Result.ImageB => "ImageB"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.Generation_Result")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Result_Payload(o: EIT_Image_Availability_Coordinator.Generation_Result_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Generation_Result_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorGeneration_ResultType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorQualified_Generation_ResultType(o: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.Qualified_Generation_Result.InvalidGenerationResult => "InvalidGenerationResult"
        case EIT_Image_Availability_Coordinator.Qualified_Generation_Result.PendingResult => "PendingResult"
        case EIT_Image_Availability_Coordinator.Qualified_Generation_Result.FailedResult => "FailedResult"
        case EIT_Image_Availability_Coordinator.Qualified_Generation_Result.ReadyResultA => "ReadyResultA"
        case EIT_Image_Availability_Coordinator.Qualified_Generation_Result.ReadyResultB => "ReadyResultB"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.Qualified_Generation_Result")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(o: EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorQualified_Generation_ResultType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImage_StateType(o: EIT_Image_Availability_Coordinator.Image_State.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.Image_State.Empty => "Empty"
        case EIT_Image_Availability_Coordinator.Image_State.RequestedA => "RequestedA"
        case EIT_Image_Availability_Coordinator.Image_State.RequestedB => "RequestedB"
        case EIT_Image_Availability_Coordinator.Image_State.ReadyA => "ReadyA"
        case EIT_Image_Availability_Coordinator.Image_State.ReadyB => "ReadyB"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.Image_State")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImage_State_Payload(o: EIT_Image_Availability_Coordinator.Image_State_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Image_State_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorImage_StateType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorRecovery_PhaseType(o: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.Recovery_Phase.Normal => "Normal"
        case EIT_Image_Availability_Coordinator.Recovery_Phase.AwaitNeutral => "AwaitNeutral"
        case EIT_Image_Availability_Coordinator.Recovery_Phase.AwaitFreshIntent => "AwaitFreshIntent"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.Recovery_Phase")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorRecovery_Phase_Payload(o: EIT_Image_Availability_Coordinator.Recovery_Phase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Recovery_Phase_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorRecovery_PhaseType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorResolution_DispositionType(o: EIT_Image_Availability_Coordinator.Resolution_Disposition.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.Resolution_Disposition.InputFaultDisposition => "InputFaultDisposition"
        case EIT_Image_Availability_Coordinator.Resolution_Disposition.RecoveryDisposition => "RecoveryDisposition"
        case EIT_Image_Availability_Coordinator.Resolution_Disposition.ReleasedDisposition => "ReleasedDisposition"
        case EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationStarted => "GenerationStarted"
        case EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationWaiting => "GenerationWaiting"
        case EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationCompleted => "GenerationCompleted"
        case EIT_Image_Availability_Coordinator.Resolution_Disposition.AcquisitionRequired => "AcquisitionRequired"
        case EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationFailure => "GenerationFailure"
        case EIT_Image_Availability_Coordinator.Resolution_Disposition.ExistingImageRetained => "ExistingImageRetained"
        case EIT_Image_Availability_Coordinator.Resolution_Disposition.AvailableRetained => "AvailableRetained"
        case EIT_Image_Availability_Coordinator.Resolution_Disposition.IdleDisposition => "IdleDisposition"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.Resolution_Disposition")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorResolution_Disposition_Payload(o: EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorResolution_DispositionType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_DirectiveType(o: EIT_Image_Availability_Coordinator.Generation_Directive.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.Generation_Directive.HoldGeneration => "HoldGeneration"
        case EIT_Image_Availability_Coordinator.Generation_Directive.GenerateFromA => "GenerateFromA"
        case EIT_Image_Availability_Coordinator.Generation_Directive.GenerateFromB => "GenerateFromB"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.Generation_Directive")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Directive_Payload(o: EIT_Image_Availability_Coordinator.Generation_Directive_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Generation_Directive_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorGeneration_DirectiveType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImage_DeliveryType(o: EIT_Image_Availability_Coordinator.Image_Delivery.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.Image_Delivery.Withheld => "Withheld"
        case EIT_Image_Availability_Coordinator.Image_Delivery.DeliverImageA => "DeliverImageA"
        case EIT_Image_Availability_Coordinator.Image_Delivery.DeliverImageB => "DeliverImageB"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.Image_Delivery")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImage_Delivery_Payload(o: EIT_Image_Availability_Coordinator.Image_Delivery_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Image_Delivery_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorImage_DeliveryType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailability_StatusType(o: EIT_Image_Availability_Coordinator.Availability_Status.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.Availability_Status.NoImageAvailable => "NoImageAvailable"
        case EIT_Image_Availability_Coordinator.Availability_Status.GenerationPending => "GenerationPending"
        case EIT_Image_Availability_Coordinator.Availability_Status.ImageAvailable => "ImageAvailable"
        case EIT_Image_Availability_Coordinator.Availability_Status.UpstreamAcquisitionRequired => "UpstreamAcquisitionRequired"
        case EIT_Image_Availability_Coordinator.Availability_Status.GenerationFailedStatus => "GenerationFailedStatus"
        case EIT_Image_Availability_Coordinator.Availability_Status.InputFault => "InputFault"
        case EIT_Image_Availability_Coordinator.Availability_Status.RecoveryPending => "RecoveryPending"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.Availability_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailability_Status_Payload(o: EIT_Image_Availability_Coordinator.Availability_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Availability_Status_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorAvailability_StatusType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAcquisition_Sample(o: EIT_Image_Availability_Coordinator.Acquisition_Sample): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Acquisition_Sample""""),
        ("token", printEIT_Image_Availability_CoordinatorAcquisition_TokenType(o.token)),
        ("status", printEIT_Image_Availability_CoordinatorInput_StatusType(o.status))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(o: EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorAcquisition_Sample(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorReview_Intent_Sample(o: EIT_Image_Availability_Coordinator.Review_Intent_Sample): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Review_Intent_Sample""""),
        ("intent", printEIT_Image_Availability_CoordinatorReview_IntentType(o.intent)),
        ("status", printEIT_Image_Availability_CoordinatorInput_StatusType(o.status))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(o: EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorReview_Intent_Sample(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Result_Sample(o: EIT_Image_Availability_Coordinator.Generation_Result_Sample): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Generation_Result_Sample""""),
        ("result", printEIT_Image_Availability_CoordinatorGeneration_ResultType(o.result)),
        ("status", printEIT_Image_Availability_CoordinatorInput_StatusType(o.status))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(o: EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorGeneration_Result_Sample(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImage_Resolution(o: EIT_Image_Availability_Coordinator.Image_Resolution): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Image_Resolution""""),
        ("next_image_state", printEIT_Image_Availability_CoordinatorImage_StateType(o.next_image_state)),
        ("next_recovery_phase", printEIT_Image_Availability_CoordinatorRecovery_PhaseType(o.next_recovery_phase)),
        ("disposition", printEIT_Image_Availability_CoordinatorResolution_DispositionType(o.disposition))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImage_Resolution_Payload(o: EIT_Image_Availability_Coordinator.Image_Resolution_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Image_Resolution_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorImage_Resolution(o.value))
      ))
    }

    @pure def printBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Boolean_Payload""""),
        ("value", printB(o.value))
      ))
    }

    @pure def printBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_Payload""""),
        ("value", printZ(o.value))
      ))
    }

    @pure def printBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_8_Payload""""),
        ("value", printS8(o.value))
      ))
    }

    @pure def printBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_16_Payload""""),
        ("value", printS16(o.value))
      ))
    }

    @pure def printBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_32_Payload""""),
        ("value", printS32(o.value))
      ))
    }

    @pure def printBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_64_Payload""""),
        ("value", printS64(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_8_Payload""""),
        ("value", printU8(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_16_Payload""""),
        ("value", printU16(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_32_Payload""""),
        ("value", printU32(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_64_Payload""""),
        ("value", printU64(o.value))
      ))
    }

    @pure def printBase_TypesFloat_Payload(o: Base_Types.Float_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_Payload""""),
        ("value", printR(o.value))
      ))
    }

    @pure def printBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_32_Payload""""),
        ("value", printF32(o.value))
      ))
    }

    @pure def printBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_64_Payload""""),
        ("value", printF64(o.value))
      ))
    }

    @pure def printBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Character_Payload""""),
        ("value", printC(o.value))
      ))
    }

    @pure def printBase_TypesString_Payload(o: Base_Types.String_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.String_Payload""""),
        ("value", printString(o.value))
      ))
    }

    @pure def printBase_TypesBits_Payload(o: Base_Types.Bits_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Bits_Payload""""),
        ("value", printISZ(T, o.value, printB _))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P => return printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P""""),
        ("api_acquisition_sample", printEIT_Image_Availability_CoordinatorAcquisition_Sample(o.api_acquisition_sample))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS""""),
        ("api_acquisition_sample", printEIT_Image_Availability_CoordinatorAcquisition_Sample(o.api_acquisition_sample))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P => return printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P""""),
        ("api_qualified_acquisition", printEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o.api_qualified_acquisition))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS""""),
        ("api_qualified_acquisition", printEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o.api_qualified_acquisition))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P => return printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P""""),
        ("api_review_intent_sample", printEIT_Image_Availability_CoordinatorReview_Intent_Sample(o.api_review_intent_sample))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS""""),
        ("api_review_intent_sample", printEIT_Image_Availability_CoordinatorReview_Intent_Sample(o.api_review_intent_sample))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P => return printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P""""),
        ("api_qualified_intent", printEIT_Image_Availability_CoordinatorQualified_IntentType(o.api_qualified_intent))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS""""),
        ("api_qualified_intent", printEIT_Image_Availability_CoordinatorQualified_IntentType(o.api_qualified_intent))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P => return printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P""""),
        ("api_generation_result_sample", printEIT_Image_Availability_CoordinatorGeneration_Result_Sample(o.api_generation_result_sample))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS""""),
        ("api_generation_result_sample", printEIT_Image_Availability_CoordinatorGeneration_Result_Sample(o.api_generation_result_sample))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P => return printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P""""),
        ("api_qualified_generation_result", printEIT_Image_Availability_CoordinatorQualified_Generation_ResultType(o.api_qualified_generation_result))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS""""),
        ("api_qualified_generation_result", printEIT_Image_Availability_CoordinatorQualified_Generation_ResultType(o.api_qualified_generation_result))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P => return printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P""""),
        ("api_qualified_acquisition", printEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o.api_qualified_acquisition)),
        ("api_qualified_generation_result", printEIT_Image_Availability_CoordinatorQualified_Generation_ResultType(o.api_qualified_generation_result)),
        ("api_qualified_intent", printEIT_Image_Availability_CoordinatorQualified_IntentType(o.api_qualified_intent))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS""""),
        ("api_qualified_acquisition", printEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o.api_qualified_acquisition)),
        ("api_qualified_generation_result", printEIT_Image_Availability_CoordinatorQualified_Generation_ResultType(o.api_qualified_generation_result)),
        ("api_qualified_intent", printEIT_Image_Availability_CoordinatorQualified_IntentType(o.api_qualified_intent))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P => return printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P""""),
        ("api_generation_resolution", printEIT_Image_Availability_CoordinatorImage_Resolution(o.api_generation_resolution)),
        ("api_publication_resolution", printEIT_Image_Availability_CoordinatorImage_Resolution(o.api_publication_resolution))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS""""),
        ("api_generation_resolution", printEIT_Image_Availability_CoordinatorImage_Resolution(o.api_generation_resolution)),
        ("api_publication_resolution", printEIT_Image_Availability_CoordinatorImage_Resolution(o.api_publication_resolution))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P => return printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P""""),
        ("api_image_resolution", printEIT_Image_Availability_CoordinatorImage_Resolution(o.api_image_resolution)),
        ("api_qualified_acquisition", printEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o.api_qualified_acquisition))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS""""),
        ("api_image_resolution", printEIT_Image_Availability_CoordinatorImage_Resolution(o.api_image_resolution)),
        ("api_qualified_acquisition", printEIT_Image_Availability_CoordinatorQualified_AcquisitionType(o.api_qualified_acquisition))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P => return printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P""""),
        ("api_generation_directive", printEIT_Image_Availability_CoordinatorGeneration_DirectiveType(o.api_generation_directive))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS""""),
        ("api_generation_directive", printEIT_Image_Availability_CoordinatorGeneration_DirectiveType(o.api_generation_directive))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P => return printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P""""),
        ("api_image_resolution", printEIT_Image_Availability_CoordinatorImage_Resolution(o.api_image_resolution))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS""""),
        ("api_image_resolution", printEIT_Image_Availability_CoordinatorImage_Resolution(o.api_image_resolution))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P => return printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P""""),
        ("api_availability_status", printEIT_Image_Availability_CoordinatorAvailability_StatusType(o.api_availability_status)),
        ("api_image_delivery", printEIT_Image_Availability_CoordinatorImage_DeliveryType(o.api_image_delivery))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS""""),
        ("api_availability_status", printEIT_Image_Availability_CoordinatorAvailability_StatusType(o.api_availability_status)),
        ("api_image_delivery", printEIT_Image_Availability_CoordinatorImage_DeliveryType(o.api_image_delivery))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_upstream_acquisition_qualification_postInit => "EIT_Image_Availability_System_Instance_image_availability_process_upstream_acquisition_qualification_postInit"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_upstream_acquisition_qualification_preCompute => "EIT_Image_Availability_System_Instance_image_availability_process_upstream_acquisition_qualification_preCompute"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_upstream_acquisition_qualification_postCompute => "EIT_Image_Availability_System_Instance_image_availability_process_upstream_acquisition_qualification_postCompute"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_doctor_intent_qualification_postInit => "EIT_Image_Availability_System_Instance_image_availability_process_doctor_intent_qualification_postInit"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_doctor_intent_qualification_preCompute => "EIT_Image_Availability_System_Instance_image_availability_process_doctor_intent_qualification_preCompute"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_doctor_intent_qualification_postCompute => "EIT_Image_Availability_System_Instance_image_availability_process_doctor_intent_qualification_postCompute"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_generation_result_qualification_postInit => "EIT_Image_Availability_System_Instance_image_availability_process_generation_result_qualification_postInit"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_generation_result_qualification_preCompute => "EIT_Image_Availability_System_Instance_image_availability_process_generation_result_qualification_preCompute"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_generation_result_qualification_postCompute => "EIT_Image_Availability_System_Instance_image_availability_process_generation_result_qualification_postCompute"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_image_availability_governor_postInit => "EIT_Image_Availability_System_Instance_image_availability_process_image_availability_governor_postInit"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_image_availability_governor_preCompute => "EIT_Image_Availability_System_Instance_image_availability_process_image_availability_governor_preCompute"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_image_availability_governor_postCompute => "EIT_Image_Availability_System_Instance_image_availability_process_image_availability_governor_postCompute"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_generation_directive_derivation_postInit => "EIT_Image_Availability_System_Instance_image_availability_process_generation_directive_derivation_postInit"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_generation_directive_derivation_preCompute => "EIT_Image_Availability_System_Instance_image_availability_process_generation_directive_derivation_preCompute"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_generation_directive_derivation_postCompute => "EIT_Image_Availability_System_Instance_image_availability_process_generation_directive_derivation_postCompute"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_doctor_publication_postInit => "EIT_Image_Availability_System_Instance_image_availability_process_doctor_publication_postInit"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_doctor_publication_preCompute => "EIT_Image_Availability_System_Instance_image_availability_process_doctor_publication_preCompute"
        case runtimemonitor.ObservationKind.EIT_Image_Availability_System_Instance_image_availability_process_doctor_publication_postCompute => "EIT_Image_Availability_System_Instance_image_availability_process_doctor_publication_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P => return printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P => return printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P => return printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P => return printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P => return printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P => return printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P => return printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P => return printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P => return printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P => return printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P => return printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P => return printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printutilEmptyContainer(o: util.EmptyContainer): ST = {
      return printObject(ISZ(
        ("type", st""""util.EmptyContainer"""")
      ))
    }

    @pure def print_artDataContent(o: art.DataContent): ST = {
      o match {
        case o: art.Empty => return print_artEmpty(o)
        case o: Base_Types.Boolean_Payload => return printBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => return printBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => return printBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => return printBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => return printBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => return printBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => return printBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => return printBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => return printBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => return printBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => return printBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => return printBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => return printBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => return printBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => return printBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => return printBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: EIT_Image_Availability_Coordinator.Image_State_Payload => return printEIT_Image_Availability_CoordinatorImage_State_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Input_Status_Payload => return printEIT_Image_Availability_CoordinatorInput_Status_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Review_Intent_Payload => return printEIT_Image_Availability_CoordinatorReview_Intent_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Recovery_Phase_Payload => return printEIT_Image_Availability_CoordinatorRecovery_Phase_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Image_Delivery_Payload => return printEIT_Image_Availability_CoordinatorImage_Delivery_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Qualified_Intent_Payload => return printEIT_Image_Availability_CoordinatorQualified_Intent_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Image_Resolution_Payload => return printEIT_Image_Availability_CoordinatorImage_Resolution_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Payload => return printEIT_Image_Availability_CoordinatorGeneration_Result_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Acquisition_Token_Payload => return printEIT_Image_Availability_CoordinatorAcquisition_Token_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload => return printEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Availability_Status_Payload => return printEIT_Image_Availability_CoordinatorAvailability_Status_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Payload => return printEIT_Image_Availability_CoordinatorGeneration_Directive_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload => return printEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload => return printEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload => return printEIT_Image_Availability_CoordinatorResolution_Disposition_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload => return printEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload => return printEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P => return printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P => return printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P => return printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P => return printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P => return printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P => return printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P => return printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P => return printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P => return printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P => return printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P => return printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P => return printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(o)
      }
    }

    @pure def print_artEmpty(o: art.Empty): ST = {
      return printObject(ISZ(
        ("type", st""""art.Empty"""")
      ))
    }

  }

  @record class Parser(val input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parseEIT_Image_Availability_CoordinatorAcquisition_TokenType(): EIT_Image_Availability_Coordinator.Acquisition_Token.Type = {
      val r = parseEIT_Image_Availability_CoordinatorAcquisition_TokenT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAcquisition_TokenT(typeParsed: B): EIT_Image_Availability_Coordinator.Acquisition_Token.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Acquisition_Token")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.Acquisition_Token.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.Acquisition_Token.")
          return EIT_Image_Availability_Coordinator.Acquisition_Token.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorAcquisition_Token_Payload(): EIT_Image_Availability_Coordinator.Acquisition_Token_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorAcquisition_Token_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAcquisition_Token_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Acquisition_Token_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Acquisition_Token_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorAcquisition_TokenType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Acquisition_Token_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorInput_StatusType(): EIT_Image_Availability_Coordinator.Input_Status.Type = {
      val r = parseEIT_Image_Availability_CoordinatorInput_StatusT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorInput_StatusT(typeParsed: B): EIT_Image_Availability_Coordinator.Input_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Input_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.Input_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.Input_Status.")
          return EIT_Image_Availability_Coordinator.Input_Status.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorInput_Status_Payload(): EIT_Image_Availability_Coordinator.Input_Status_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorInput_Status_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorInput_Status_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Input_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Input_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorInput_StatusType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Input_Status_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorQualified_AcquisitionType(): EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type = {
      val r = parseEIT_Image_Availability_CoordinatorQualified_AcquisitionT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorQualified_AcquisitionT(typeParsed: B): EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Qualified_Acquisition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.Qualified_Acquisition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.Qualified_Acquisition.")
          return EIT_Image_Availability_Coordinator.Qualified_Acquisition.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(): EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorQualified_Acquisition_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorQualified_Acquisition_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorQualified_AcquisitionType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorReview_IntentType(): EIT_Image_Availability_Coordinator.Review_Intent.Type = {
      val r = parseEIT_Image_Availability_CoordinatorReview_IntentT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorReview_IntentT(typeParsed: B): EIT_Image_Availability_Coordinator.Review_Intent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Review_Intent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.Review_Intent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.Review_Intent.")
          return EIT_Image_Availability_Coordinator.Review_Intent.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorReview_Intent_Payload(): EIT_Image_Availability_Coordinator.Review_Intent_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorReview_Intent_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorReview_Intent_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Review_Intent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Review_Intent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorReview_IntentType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Review_Intent_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorQualified_IntentType(): EIT_Image_Availability_Coordinator.Qualified_Intent.Type = {
      val r = parseEIT_Image_Availability_CoordinatorQualified_IntentT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorQualified_IntentT(typeParsed: B): EIT_Image_Availability_Coordinator.Qualified_Intent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Qualified_Intent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.Qualified_Intent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.Qualified_Intent.")
          return EIT_Image_Availability_Coordinator.Qualified_Intent.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorQualified_Intent_Payload(): EIT_Image_Availability_Coordinator.Qualified_Intent_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorQualified_Intent_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorQualified_Intent_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Qualified_Intent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Qualified_Intent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorQualified_IntentType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Qualified_Intent_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_ResultType(): EIT_Image_Availability_Coordinator.Generation_Result.Type = {
      val r = parseEIT_Image_Availability_CoordinatorGeneration_ResultT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_ResultT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Result.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Generation_Result")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.Generation_Result.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.Generation_Result.")
          return EIT_Image_Availability_Coordinator.Generation_Result.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_Payload(): EIT_Image_Availability_Coordinator.Generation_Result_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Result_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Generation_Result_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorGeneration_ResultType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Generation_Result_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorQualified_Generation_ResultType(): EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type = {
      val r = parseEIT_Image_Availability_CoordinatorQualified_Generation_ResultT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorQualified_Generation_ResultT(typeParsed: B): EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Qualified_Generation_Result")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.Qualified_Generation_Result.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.Qualified_Generation_Result.")
          return EIT_Image_Availability_Coordinator.Qualified_Generation_Result.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(): EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorQualified_Generation_Result_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorQualified_Generation_Result_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorQualified_Generation_ResultType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorImage_StateType(): EIT_Image_Availability_Coordinator.Image_State.Type = {
      val r = parseEIT_Image_Availability_CoordinatorImage_StateT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImage_StateT(typeParsed: B): EIT_Image_Availability_Coordinator.Image_State.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Image_State")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.Image_State.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.Image_State.")
          return EIT_Image_Availability_Coordinator.Image_State.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorImage_State_Payload(): EIT_Image_Availability_Coordinator.Image_State_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorImage_State_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImage_State_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Image_State_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Image_State_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorImage_StateType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Image_State_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorRecovery_PhaseType(): EIT_Image_Availability_Coordinator.Recovery_Phase.Type = {
      val r = parseEIT_Image_Availability_CoordinatorRecovery_PhaseT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorRecovery_PhaseT(typeParsed: B): EIT_Image_Availability_Coordinator.Recovery_Phase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Recovery_Phase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.Recovery_Phase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.Recovery_Phase.")
          return EIT_Image_Availability_Coordinator.Recovery_Phase.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorRecovery_Phase_Payload(): EIT_Image_Availability_Coordinator.Recovery_Phase_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorRecovery_Phase_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorRecovery_Phase_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Recovery_Phase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Recovery_Phase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorRecovery_PhaseType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Recovery_Phase_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorResolution_DispositionType(): EIT_Image_Availability_Coordinator.Resolution_Disposition.Type = {
      val r = parseEIT_Image_Availability_CoordinatorResolution_DispositionT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorResolution_DispositionT(typeParsed: B): EIT_Image_Availability_Coordinator.Resolution_Disposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Resolution_Disposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.Resolution_Disposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.Resolution_Disposition.")
          return EIT_Image_Availability_Coordinator.Resolution_Disposition.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorResolution_Disposition_Payload(): EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorResolution_Disposition_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorResolution_Disposition_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorResolution_DispositionType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_DirectiveType(): EIT_Image_Availability_Coordinator.Generation_Directive.Type = {
      val r = parseEIT_Image_Availability_CoordinatorGeneration_DirectiveT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_DirectiveT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Directive.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Generation_Directive")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.Generation_Directive.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.Generation_Directive.")
          return EIT_Image_Availability_Coordinator.Generation_Directive.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Directive_Payload(): EIT_Image_Availability_Coordinator.Generation_Directive_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Directive_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Directive_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Generation_Directive_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorGeneration_DirectiveType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Generation_Directive_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorImage_DeliveryType(): EIT_Image_Availability_Coordinator.Image_Delivery.Type = {
      val r = parseEIT_Image_Availability_CoordinatorImage_DeliveryT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImage_DeliveryT(typeParsed: B): EIT_Image_Availability_Coordinator.Image_Delivery.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Image_Delivery")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.Image_Delivery.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.Image_Delivery.")
          return EIT_Image_Availability_Coordinator.Image_Delivery.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorImage_Delivery_Payload(): EIT_Image_Availability_Coordinator.Image_Delivery_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorImage_Delivery_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImage_Delivery_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Image_Delivery_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Image_Delivery_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorImage_DeliveryType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Image_Delivery_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorAvailability_StatusType(): EIT_Image_Availability_Coordinator.Availability_Status.Type = {
      val r = parseEIT_Image_Availability_CoordinatorAvailability_StatusT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailability_StatusT(typeParsed: B): EIT_Image_Availability_Coordinator.Availability_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Availability_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.Availability_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.Availability_Status.")
          return EIT_Image_Availability_Coordinator.Availability_Status.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorAvailability_Status_Payload(): EIT_Image_Availability_Coordinator.Availability_Status_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorAvailability_Status_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailability_Status_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Availability_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Availability_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorAvailability_StatusType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Availability_Status_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorAcquisition_Sample(): EIT_Image_Availability_Coordinator.Acquisition_Sample = {
      val r = parseEIT_Image_Availability_CoordinatorAcquisition_SampleT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAcquisition_SampleT(typeParsed: B): EIT_Image_Availability_Coordinator.Acquisition_Sample = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Acquisition_Sample")
      }
      parser.parseObjectKey("token")
      val token = parseEIT_Image_Availability_CoordinatorAcquisition_TokenType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseEIT_Image_Availability_CoordinatorInput_StatusType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Acquisition_Sample(token, status)
    }

    def parseEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(): EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorAcquisition_Sample_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAcquisition_Sample_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorAcquisition_Sample()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorReview_Intent_Sample(): EIT_Image_Availability_Coordinator.Review_Intent_Sample = {
      val r = parseEIT_Image_Availability_CoordinatorReview_Intent_SampleT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorReview_Intent_SampleT(typeParsed: B): EIT_Image_Availability_Coordinator.Review_Intent_Sample = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Review_Intent_Sample")
      }
      parser.parseObjectKey("intent")
      val intent = parseEIT_Image_Availability_CoordinatorReview_IntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseEIT_Image_Availability_CoordinatorInput_StatusType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Review_Intent_Sample(intent, status)
    }

    def parseEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(): EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorReview_Intent_Sample_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorReview_Intent_Sample_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorReview_Intent_Sample()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_Sample(): EIT_Image_Availability_Coordinator.Generation_Result_Sample = {
      val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_SampleT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_SampleT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Result_Sample = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Generation_Result_Sample")
      }
      parser.parseObjectKey("result")
      val result = parseEIT_Image_Availability_CoordinatorGeneration_ResultType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseEIT_Image_Availability_CoordinatorInput_StatusType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Generation_Result_Sample(result, status)
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(): EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Sample_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_Sample_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorGeneration_Result_Sample()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorImage_Resolution(): EIT_Image_Availability_Coordinator.Image_Resolution = {
      val r = parseEIT_Image_Availability_CoordinatorImage_ResolutionT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImage_ResolutionT(typeParsed: B): EIT_Image_Availability_Coordinator.Image_Resolution = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Image_Resolution")
      }
      parser.parseObjectKey("next_image_state")
      val next_image_state = parseEIT_Image_Availability_CoordinatorImage_StateType()
      parser.parseObjectNext()
      parser.parseObjectKey("next_recovery_phase")
      val next_recovery_phase = parseEIT_Image_Availability_CoordinatorRecovery_PhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseEIT_Image_Availability_CoordinatorResolution_DispositionType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Image_Resolution(next_image_state, next_recovery_phase, disposition)
    }

    def parseEIT_Image_Availability_CoordinatorImage_Resolution_Payload(): EIT_Image_Availability_Coordinator.Image_Resolution_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorImage_Resolution_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImage_Resolution_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Image_Resolution_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Image_Resolution_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorImage_Resolution()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Image_Resolution_Payload(value)
    }

    def parseBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = parseBase_TypesBoolean_PayloadT(F)
      return r
    }

    def parseBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Boolean_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseB()
      parser.parseObjectNext()
      return Base_Types.Boolean_Payload(value)
    }

    def parseBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = parseBase_TypesInteger_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseZ()
      parser.parseObjectNext()
      return Base_Types.Integer_Payload(value)
    }

    def parseBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = parseBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS8()
      parser.parseObjectNext()
      return Base_Types.Integer_8_Payload(value)
    }

    def parseBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = parseBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS16()
      parser.parseObjectNext()
      return Base_Types.Integer_16_Payload(value)
    }

    def parseBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = parseBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS32()
      parser.parseObjectNext()
      return Base_Types.Integer_32_Payload(value)
    }

    def parseBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = parseBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS64()
      parser.parseObjectNext()
      return Base_Types.Integer_64_Payload(value)
    }

    def parseBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = parseBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU8()
      parser.parseObjectNext()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def parseBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = parseBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU16()
      parser.parseObjectNext()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def parseBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = parseBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU32()
      parser.parseObjectNext()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def parseBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = parseBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU64()
      parser.parseObjectNext()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def parseBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = parseBase_TypesFloat_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseR()
      parser.parseObjectNext()
      return Base_Types.Float_Payload(value)
    }

    def parseBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = parseBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      return Base_Types.Float_32_Payload(value)
    }

    def parseBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = parseBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF64()
      parser.parseObjectNext()
      return Base_Types.Float_64_Payload(value)
    }

    def parseBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = parseBase_TypesCharacter_PayloadT(F)
      return r
    }

    def parseBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Character_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseC()
      parser.parseObjectNext()
      return Base_Types.Character_Payload(value)
    }

    def parseBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = parseBase_TypesString_PayloadT(F)
      return r
    }

    def parseBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.String_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      return Base_Types.String_Payload(value)
    }

    def parseBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = parseBase_TypesBits_PayloadT(F)
      return r
    }

    def parseBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Bits_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseISZ(parser.parseB _)
      parser.parseObjectNext()
      return Base_Types.Bits_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container(): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P", "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_acquisition_sample")
      val api_acquisition_sample = parseEIT_Image_Availability_CoordinatorAcquisition_Sample()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(api_acquisition_sample)
    }

    def parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_acquisition_sample")
      val api_acquisition_sample = parseEIT_Image_Availability_CoordinatorAcquisition_Sample()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(api_acquisition_sample)
    }

    def parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container(): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P", "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_acquisition")
      val api_qualified_acquisition = parseEIT_Image_Availability_CoordinatorQualified_AcquisitionType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(api_qualified_acquisition)
    }

    def parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_acquisition")
      val api_qualified_acquisition = parseEIT_Image_Availability_CoordinatorQualified_AcquisitionType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(api_qualified_acquisition)
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container(): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P", "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_review_intent_sample")
      val api_review_intent_sample = parseEIT_Image_Availability_CoordinatorReview_Intent_Sample()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(api_review_intent_sample)
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_review_intent_sample")
      val api_review_intent_sample = parseEIT_Image_Availability_CoordinatorReview_Intent_Sample()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(api_review_intent_sample)
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container(): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P", "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_intent")
      val api_qualified_intent = parseEIT_Image_Availability_CoordinatorQualified_IntentType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(api_qualified_intent)
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_intent")
      val api_qualified_intent = parseEIT_Image_Availability_CoordinatorQualified_IntentType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(api_qualified_intent)
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container(): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P", "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_generation_result_sample")
      val api_generation_result_sample = parseEIT_Image_Availability_CoordinatorGeneration_Result_Sample()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(api_generation_result_sample)
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_generation_result_sample")
      val api_generation_result_sample = parseEIT_Image_Availability_CoordinatorGeneration_Result_Sample()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(api_generation_result_sample)
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container(): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P", "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_generation_result")
      val api_qualified_generation_result = parseEIT_Image_Availability_CoordinatorQualified_Generation_ResultType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(api_qualified_generation_result)
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_generation_result")
      val api_qualified_generation_result = parseEIT_Image_Availability_CoordinatorQualified_Generation_ResultType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(api_qualified_generation_result)
    }

    def parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container(): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P", "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P")
      }
      parser.parseObjectKey("api_qualified_acquisition")
      val api_qualified_acquisition = parseEIT_Image_Availability_CoordinatorQualified_AcquisitionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_generation_result")
      val api_qualified_generation_result = parseEIT_Image_Availability_CoordinatorQualified_Generation_ResultType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_intent")
      val api_qualified_intent = parseEIT_Image_Availability_CoordinatorQualified_IntentType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(api_qualified_acquisition, api_qualified_generation_result, api_qualified_intent)
    }

    def parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_acquisition")
      val api_qualified_acquisition = parseEIT_Image_Availability_CoordinatorQualified_AcquisitionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_generation_result")
      val api_qualified_generation_result = parseEIT_Image_Availability_CoordinatorQualified_Generation_ResultType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_intent")
      val api_qualified_intent = parseEIT_Image_Availability_CoordinatorQualified_IntentType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(api_qualified_acquisition, api_qualified_generation_result, api_qualified_intent)
    }

    def parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container(): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P", "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P")
      }
      parser.parseObjectKey("api_generation_resolution")
      val api_generation_resolution = parseEIT_Image_Availability_CoordinatorImage_Resolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_publication_resolution")
      val api_publication_resolution = parseEIT_Image_Availability_CoordinatorImage_Resolution()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(api_generation_resolution, api_publication_resolution)
    }

    def parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_generation_resolution")
      val api_generation_resolution = parseEIT_Image_Availability_CoordinatorImage_Resolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_publication_resolution")
      val api_publication_resolution = parseEIT_Image_Availability_CoordinatorImage_Resolution()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(api_generation_resolution, api_publication_resolution)
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container(): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P", "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P")
      }
      parser.parseObjectKey("api_image_resolution")
      val api_image_resolution = parseEIT_Image_Availability_CoordinatorImage_Resolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_acquisition")
      val api_qualified_acquisition = parseEIT_Image_Availability_CoordinatorQualified_AcquisitionType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(api_image_resolution, api_qualified_acquisition)
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS")
      }
      parser.parseObjectKey("api_image_resolution")
      val api_image_resolution = parseEIT_Image_Availability_CoordinatorImage_Resolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_acquisition")
      val api_qualified_acquisition = parseEIT_Image_Availability_CoordinatorQualified_AcquisitionType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(api_image_resolution, api_qualified_acquisition)
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container(): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P", "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P")
      }
      parser.parseObjectKey("api_generation_directive")
      val api_generation_directive = parseEIT_Image_Availability_CoordinatorGeneration_DirectiveType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(api_generation_directive)
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_generation_directive")
      val api_generation_directive = parseEIT_Image_Availability_CoordinatorGeneration_DirectiveType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(api_generation_directive)
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container(): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P", "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P")
      }
      parser.parseObjectKey("api_image_resolution")
      val api_image_resolution = parseEIT_Image_Availability_CoordinatorImage_Resolution()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(api_image_resolution)
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS")
      }
      parser.parseObjectKey("api_image_resolution")
      val api_image_resolution = parseEIT_Image_Availability_CoordinatorImage_Resolution()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(api_image_resolution)
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container(): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P", "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P")
      }
      parser.parseObjectKey("api_availability_status")
      val api_availability_status = parseEIT_Image_Availability_CoordinatorAvailability_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_image_delivery")
      val api_image_delivery = parseEIT_Image_Availability_CoordinatorImage_DeliveryType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(api_availability_status, api_image_delivery)
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS")
      }
      parser.parseObjectKey("api_availability_status")
      val api_availability_status = parseEIT_Image_Availability_CoordinatorAvailability_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_image_delivery")
      val api_image_delivery = parseEIT_Image_Availability_CoordinatorImage_DeliveryType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(api_availability_status, api_image_delivery)
    }

    def parseruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = parseruntimemonitorObservationKindT(F)
      return r
    }

    def parseruntimemonitorObservationKindT(typeParsed: B): runtimemonitor.ObservationKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("runtimemonitor.ObservationKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      runtimemonitor.ObservationKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for runtimemonitor.ObservationKind.")
          return runtimemonitor.ObservationKind.byOrdinal(0).get
      }
    }

    def parseutilContainer(): util.Container = {
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P", "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS", "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P", "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS", "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P", "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P", "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS", "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS", "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P", "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS", "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P", "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS", "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P", "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P", "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS", "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS", "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P", "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P", "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS", "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS", "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P", "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS", "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P", "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseutilEmptyContainer(): util.EmptyContainer = {
      val r = parseutilEmptyContainerT(F)
      return r
    }

    def parseutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        parser.parseObjectType("util.EmptyContainer")
      }
      return util.EmptyContainer()
    }

    def parse_artDataContent(): art.DataContent = {
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "EIT_Image_Availability_Coordinator.Image_State_Payload", "EIT_Image_Availability_Coordinator.Input_Status_Payload", "EIT_Image_Availability_Coordinator.Review_Intent_Payload", "EIT_Image_Availability_Coordinator.Recovery_Phase_Payload", "EIT_Image_Availability_Coordinator.Image_Delivery_Payload", "EIT_Image_Availability_Coordinator.Qualified_Intent_Payload", "EIT_Image_Availability_Coordinator.Image_Resolution_Payload", "EIT_Image_Availability_Coordinator.Generation_Result_Payload", "EIT_Image_Availability_Coordinator.Acquisition_Token_Payload", "EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload", "EIT_Image_Availability_Coordinator.Availability_Status_Payload", "EIT_Image_Availability_Coordinator.Generation_Directive_Payload", "EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload", "EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload", "EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload", "EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload", "EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload", "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P", "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS", "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P", "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS", "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P", "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P", "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS", "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS", "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P", "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS", "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P", "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS", "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P", "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P", "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS", "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS", "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P", "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P", "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS", "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS", "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P", "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS", "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P", "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS"))
      t.native match {
        case "art.Empty" => val r = parse_artEmptyT(T); return r
        case "Base_Types.Boolean_Payload" => val r = parseBase_TypesBoolean_PayloadT(T); return r
        case "Base_Types.Integer_Payload" => val r = parseBase_TypesInteger_PayloadT(T); return r
        case "Base_Types.Integer_8_Payload" => val r = parseBase_TypesInteger_8_PayloadT(T); return r
        case "Base_Types.Integer_16_Payload" => val r = parseBase_TypesInteger_16_PayloadT(T); return r
        case "Base_Types.Integer_32_Payload" => val r = parseBase_TypesInteger_32_PayloadT(T); return r
        case "Base_Types.Integer_64_Payload" => val r = parseBase_TypesInteger_64_PayloadT(T); return r
        case "Base_Types.Unsigned_8_Payload" => val r = parseBase_TypesUnsigned_8_PayloadT(T); return r
        case "Base_Types.Unsigned_16_Payload" => val r = parseBase_TypesUnsigned_16_PayloadT(T); return r
        case "Base_Types.Unsigned_32_Payload" => val r = parseBase_TypesUnsigned_32_PayloadT(T); return r
        case "Base_Types.Unsigned_64_Payload" => val r = parseBase_TypesUnsigned_64_PayloadT(T); return r
        case "Base_Types.Float_Payload" => val r = parseBase_TypesFloat_PayloadT(T); return r
        case "Base_Types.Float_32_Payload" => val r = parseBase_TypesFloat_32_PayloadT(T); return r
        case "Base_Types.Float_64_Payload" => val r = parseBase_TypesFloat_64_PayloadT(T); return r
        case "Base_Types.Character_Payload" => val r = parseBase_TypesCharacter_PayloadT(T); return r
        case "Base_Types.String_Payload" => val r = parseBase_TypesString_PayloadT(T); return r
        case "Base_Types.Bits_Payload" => val r = parseBase_TypesBits_PayloadT(T); return r
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "EIT_Image_Availability_Coordinator.Image_State_Payload" => val r = parseEIT_Image_Availability_CoordinatorImage_State_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Input_Status_Payload" => val r = parseEIT_Image_Availability_CoordinatorInput_Status_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Review_Intent_Payload" => val r = parseEIT_Image_Availability_CoordinatorReview_Intent_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Recovery_Phase_Payload" => val r = parseEIT_Image_Availability_CoordinatorRecovery_Phase_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Image_Delivery_Payload" => val r = parseEIT_Image_Availability_CoordinatorImage_Delivery_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Qualified_Intent_Payload" => val r = parseEIT_Image_Availability_CoordinatorQualified_Intent_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Image_Resolution_Payload" => val r = parseEIT_Image_Availability_CoordinatorImage_Resolution_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Result_Payload" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Acquisition_Token_Payload" => val r = parseEIT_Image_Availability_CoordinatorAcquisition_Token_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload" => val r = parseEIT_Image_Availability_CoordinatorAcquisition_Sample_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Availability_Status_Payload" => val r = parseEIT_Image_Availability_CoordinatorAvailability_Status_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Directive_Payload" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload" => val r = parseEIT_Image_Availability_CoordinatorReview_Intent_Sample_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload" => val r = parseEIT_Image_Availability_CoordinatorQualified_Acquisition_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload" => val r = parseEIT_Image_Availability_CoordinatorResolution_Disposition_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Sample_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload" => val r = parseEIT_Image_Availability_CoordinatorQualified_Generation_Result_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PST(T); return r
      }
    }

    def parse_artEmpty(): art.Empty = {
      val r = parse_artEmptyT(F)
      return r
    }

    def parse_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        parser.parseObjectType("art.Empty")
      }
      return art.Empty()
    }

    def eof(): B = {
      val r = parser.eof()
      return r
    }

  }

  def to[T](s: String, f: Parser => T): Either[T, Json.ErrorMsg] = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    parser.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromEIT_Image_Availability_CoordinatorAcquisition_Token_Payload(o: EIT_Image_Availability_Coordinator.Acquisition_Token_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAcquisition_Token_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAcquisition_Token_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Acquisition_Token_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAcquisition_Token_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Acquisition_Token_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAcquisition_Token_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAcquisition_Token_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorInput_Status_Payload(o: EIT_Image_Availability_Coordinator.Input_Status_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorInput_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorInput_Status_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Input_Status_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorInput_Status_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Input_Status_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorInput_Status_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorInput_Status_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(o: EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReview_Intent_Payload(o: EIT_Image_Availability_Coordinator.Review_Intent_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorReview_Intent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorReview_Intent_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Review_Intent_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReview_Intent_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Review_Intent_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorReview_Intent_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorReview_Intent_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorQualified_Intent_Payload(o: EIT_Image_Availability_Coordinator.Qualified_Intent_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorQualified_Intent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorQualified_Intent_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Qualified_Intent_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorQualified_Intent_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Qualified_Intent_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorQualified_Intent_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorQualified_Intent_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Payload(o: EIT_Image_Availability_Coordinator.Generation_Result_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Result_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Result_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Result_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Result_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Result_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(o: EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_State_Payload(o: EIT_Image_Availability_Coordinator.Image_State_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImage_State_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImage_State_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Image_State_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_State_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Image_State_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImage_State_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImage_State_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecovery_Phase_Payload(o: EIT_Image_Availability_Coordinator.Recovery_Phase_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorRecovery_Phase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorRecovery_Phase_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Recovery_Phase_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecovery_Phase_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Recovery_Phase_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorRecovery_Phase_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorRecovery_Phase_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorResolution_Disposition_Payload(o: EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorResolution_Disposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorResolution_Disposition_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorResolution_Disposition_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorResolution_Disposition_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorResolution_Disposition_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Directive_Payload(o: EIT_Image_Availability_Coordinator.Generation_Directive_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Directive_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Directive_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Directive_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Directive_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Directive_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Directive_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Directive_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Delivery_Payload(o: EIT_Image_Availability_Coordinator.Image_Delivery_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImage_Delivery_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImage_Delivery_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Image_Delivery_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Delivery_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Image_Delivery_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImage_Delivery_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImage_Delivery_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailability_Status_Payload(o: EIT_Image_Availability_Coordinator.Availability_Status_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailability_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailability_Status_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Availability_Status_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailability_Status_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Availability_Status_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailability_Status_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailability_Status_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAcquisition_Sample(o: EIT_Image_Availability_Coordinator.Acquisition_Sample, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAcquisition_Sample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAcquisition_Sample(s: String): Either[EIT_Image_Availability_Coordinator.Acquisition_Sample, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAcquisition_Sample(parser: Parser): EIT_Image_Availability_Coordinator.Acquisition_Sample = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAcquisition_Sample()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAcquisition_Sample _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(o: EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReview_Intent_Sample(o: EIT_Image_Availability_Coordinator.Review_Intent_Sample, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorReview_Intent_Sample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorReview_Intent_Sample(s: String): Either[EIT_Image_Availability_Coordinator.Review_Intent_Sample, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReview_Intent_Sample(parser: Parser): EIT_Image_Availability_Coordinator.Review_Intent_Sample = {
      val r = parser.parseEIT_Image_Availability_CoordinatorReview_Intent_Sample()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorReview_Intent_Sample _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(o: EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Sample(o: EIT_Image_Availability_Coordinator.Generation_Result_Sample, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Result_Sample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Sample(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Result_Sample, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Sample(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Result_Sample = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Result_Sample()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Result_Sample _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(o: EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Resolution(o: EIT_Image_Availability_Coordinator.Image_Resolution, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImage_Resolution(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImage_Resolution(s: String): Either[EIT_Image_Availability_Coordinator.Image_Resolution, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Resolution(parser: Parser): EIT_Image_Availability_Coordinator.Image_Resolution = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImage_Resolution()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImage_Resolution _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Resolution_Payload(o: EIT_Image_Availability_Coordinator.Image_Resolution_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImage_Resolution_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImage_Resolution_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Image_Resolution_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Resolution_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Image_Resolution_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImage_Resolution_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImage_Resolution_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBoolean_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBoolean_Payload(s: String): Either[Base_Types.Boolean_Payload, Json.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(parser: Parser): Base_Types.Boolean_Payload = {
      val r = parser.parseBase_TypesBoolean_Payload()
      return r
    }
    val r = to(s, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_Payload(s: String): Either[Base_Types.Integer_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_Payload(parser: Parser): Base_Types.Integer_Payload = {
      val r = parser.parseBase_TypesInteger_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_8_Payload(s: String): Either[Base_Types.Integer_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(parser: Parser): Base_Types.Integer_8_Payload = {
      val r = parser.parseBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_16_Payload(s: String): Either[Base_Types.Integer_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(parser: Parser): Base_Types.Integer_16_Payload = {
      val r = parser.parseBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_32_Payload(s: String): Either[Base_Types.Integer_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(parser: Parser): Base_Types.Integer_32_Payload = {
      val r = parser.parseBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_64_Payload(s: String): Either[Base_Types.Integer_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(parser: Parser): Base_Types.Integer_64_Payload = {
      val r = parser.parseBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_8_Payload(s: String): Either[Base_Types.Unsigned_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(parser: Parser): Base_Types.Unsigned_8_Payload = {
      val r = parser.parseBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_16_Payload(s: String): Either[Base_Types.Unsigned_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(parser: Parser): Base_Types.Unsigned_16_Payload = {
      val r = parser.parseBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_32_Payload(s: String): Either[Base_Types.Unsigned_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(parser: Parser): Base_Types.Unsigned_32_Payload = {
      val r = parser.parseBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_64_Payload(s: String): Either[Base_Types.Unsigned_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(parser: Parser): Base_Types.Unsigned_64_Payload = {
      val r = parser.parseBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_Payload(s: String): Either[Base_Types.Float_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_Payload(parser: Parser): Base_Types.Float_Payload = {
      val r = parser.parseBase_TypesFloat_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_32_Payload(s: String): Either[Base_Types.Float_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(parser: Parser): Base_Types.Float_32_Payload = {
      val r = parser.parseBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_64_Payload(s: String): Either[Base_Types.Float_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(parser: Parser): Base_Types.Float_64_Payload = {
      val r = parser.parseBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesCharacter_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesCharacter_Payload(s: String): Either[Base_Types.Character_Payload, Json.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(parser: Parser): Base_Types.Character_Payload = {
      val r = parser.parseBase_TypesCharacter_Payload()
      return r
    }
    val r = to(s, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesString_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesString_Payload(s: String): Either[Base_Types.String_Payload, Json.ErrorMsg] = {
    def fBase_TypesString_Payload(parser: Parser): Base_Types.String_Payload = {
      val r = parser.parseBase_TypesString_Payload()
      return r
    }
    val r = to(s, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBits_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBits_Payload(s: String): Either[Base_Types.Bits_Payload, Json.ErrorMsg] = {
    def fBase_TypesBits_Payload(parser: Parser): Base_Types.Bits_Payload = {
      val r = parser.parseBase_TypesBits_Payload()
      return r
    }
    val r = to(s, fBase_TypesBits_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, isCompact: B): String = {
    val st = Printer.printutilContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilContainer(s: String): Either[util.Container, Json.ErrorMsg] = {
    def futilContainer(parser: Parser): util.Container = {
      val r = parser.parseutilContainer()
      return r
    }
    val r = to(s, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, isCompact: B): String = {
    val st = Printer.printutilEmptyContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilEmptyContainer(s: String): Either[util.EmptyContainer, Json.ErrorMsg] = {
    def futilEmptyContainer(parser: Parser): util.EmptyContainer = {
      val r = parser.parseutilEmptyContainer()
      return r
    }
    val r = to(s, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, isCompact: B): String = {
    val st = Printer.print_artDataContent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artDataContent(s: String): Either[art.DataContent, Json.ErrorMsg] = {
    def f_artDataContent(parser: Parser): art.DataContent = {
      val r = parser.parse_artDataContent()
      return r
    }
    val r = to(s, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, isCompact: B): String = {
    val st = Printer.print_artEmpty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artEmpty(s: String): Either[art.Empty, Json.ErrorMsg] = {
    def f_artEmpty(parser: Parser): art.Empty = {
      val r = parser.parse_artEmpty()
      return r
    }
    val r = to(s, f_artEmpty _)
    return r
  }

}