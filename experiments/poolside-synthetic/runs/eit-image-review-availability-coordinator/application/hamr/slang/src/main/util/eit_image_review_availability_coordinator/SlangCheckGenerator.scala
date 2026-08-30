// #Sireum

package eit_image_review_availability_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

BatchEvent.scala

BatchCategory.scala

GeneratorFeedback.scala

GenerationState.scala

FeedbackCondition.scala

ViewerObservation.scala

ViewerCondition.scala

RecoveryRequest.scala

GeneratorProposal.scala

ProposalCondition.scala

DoctorRequest.scala

ReviewState.scala

WorkflowAction.scala

RequestDisposition.scala

DecisionNotice.scala

GenerationPreStateSnapshot.scala

GenerationDecisionNextState.scala

ReviewPreStateSnapshot.scala

ReviewDecisionNextState.scala

GenerationCommand.scala

ReviewAvailability.scala

WorkflowStatusGenerationState.scala

WorkflowStatusReviewState.scala

WorkflowStatusDisposition.scala

PublicNotice.scala

BatchAssessment.scala

FeedbackAssessment.scala

ViewerAssessment.scala

GeneratorProposalRecord.scala

WorkflowDecision.scala

GenerationDecisionSnapshot.scala

ReviewDecisionSnapshot.scala

WorkflowStatus.scala

Base_Types.scala

BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_Containers.scala

GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_Containers.scala

ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_Containers.scala

GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_Containers.scala

AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_Containers.scala

GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_Containers.scala

ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_Containers.scala

GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_Containers.scala

AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_Containers.scala

ObservationKind.scala

Container.scala

DataContent.scala

Aux_Types.scala

*/

@record class Gen_String(param: RandomLibI) extends MJen[String] {
  override def generate(f: String => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextString())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Z(param: RandomLibI) extends MJen[Z] {
  override def generate(f: Z => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextZ())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_B(param: RandomLibI) extends MJen[B] {
  override def generate(f: B => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextB())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_C(param: RandomLibI) extends MJen[C] {
  override def generate(f: C => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextC())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_R(param: RandomLibI) extends MJen[R] {
  override def generate(f: R => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextR())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_F32(param: RandomLibI) extends MJen[F32] {
  override def generate(f: F32 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextF32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_F64(param: RandomLibI) extends MJen[F64] {
  override def generate(f: F64 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextF64())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S8(param: RandomLibI) extends MJen[S8] {
  override def generate(f: S8 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS8())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S16(param: RandomLibI) extends MJen[S16] {
  override def generate(f: S16 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS16())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S32(param: RandomLibI) extends MJen[S32] {
  override def generate(f: S32 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S64(param: RandomLibI) extends MJen[S64] {
  override def generate(f: S64 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS64())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U8(param: RandomLibI) extends MJen[U8] {
  override def generate(f: U8 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU8())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U16(param: RandomLibI) extends MJen[U16] {
  override def generate(f: U16 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU16())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U32(param: RandomLibI) extends MJen[U32] {
  override def generate(f: U32 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U64(param: RandomLibI) extends MJen[U64] {
  override def generate(f: U64 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU64())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}


@record class Gen__artDataContent(param: RandomLibI) extends MJen[art.DataContent] {
  override def generate(f: art.DataContent => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.next_artDataContent())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen__artEmpty(param: RandomLibI) extends MJen[art.Empty] {
  override def generate(f: art.Empty => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.next_artEmpty())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesBoolean_Payload(param: RandomLibI) extends MJen[Base_Types.Boolean_Payload] {
  override def generate(f: Base_Types.Boolean_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesBoolean_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_Payload] {
  override def generate(f: Base_Types.Integer_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_8_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_8_Payload] {
  override def generate(f: Base_Types.Integer_8_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_8_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_16_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_16_Payload] {
  override def generate(f: Base_Types.Integer_16_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_16_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_32_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_32_Payload] {
  override def generate(f: Base_Types.Integer_32_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_32_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_64_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_64_Payload] {
  override def generate(f: Base_Types.Integer_64_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_64_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_8_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_8_Payload] {
  override def generate(f: Base_Types.Unsigned_8_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_8_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_16_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_16_Payload] {
  override def generate(f: Base_Types.Unsigned_16_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_16_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_32_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_32_Payload] {
  override def generate(f: Base_Types.Unsigned_32_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_32_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_64_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_64_Payload] {
  override def generate(f: Base_Types.Unsigned_64_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_64_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesFloat_Payload(param: RandomLibI) extends MJen[Base_Types.Float_Payload] {
  override def generate(f: Base_Types.Float_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesFloat_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesFloat_32_Payload(param: RandomLibI) extends MJen[Base_Types.Float_32_Payload] {
  override def generate(f: Base_Types.Float_32_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesFloat_32_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesFloat_64_Payload(param: RandomLibI) extends MJen[Base_Types.Float_64_Payload] {
  override def generate(f: Base_Types.Float_64_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesFloat_64_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesCharacter_Payload(param: RandomLibI) extends MJen[Base_Types.Character_Payload] {
  override def generate(f: Base_Types.Character_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesCharacter_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesString_Payload(param: RandomLibI) extends MJen[Base_Types.String_Payload] {
  override def generate(f: Base_Types.String_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesString_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_ISZB(param: RandomLibI) extends MJen[ISZ[B]] {
  override def generate(f: ISZ[B] => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextISZB())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesBits_Payload(param: RandomLibI) extends MJen[Base_Types.Bits_Payload] {
  override def generate(f: Base_Types.Bits_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesBits_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorBatchAssessment(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.BatchAssessment] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.BatchAssessment => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorBatchAssessment())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorBatchCategoryType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.BatchCategory.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.BatchCategory.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorBatchCategoryType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorBatchEventType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.BatchEvent.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.BatchEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorBatchEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorDecisionNoticeType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.DecisionNotice.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.DecisionNotice.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorDecisionNoticeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorDoctorRequestType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.DoctorRequest.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.DoctorRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorDoctorRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorFeedbackAssessment(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.FeedbackAssessment] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorFeedbackAssessment())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorFeedbackConditionType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.FeedbackCondition.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.FeedbackCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorFeedbackConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationCommandType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationCommand.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationStateType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationState.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGenerationState_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GenerationState_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GenerationState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGenerationState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorProposalType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorProposal.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorProposalConditionType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ProposalCondition.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ProposalCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorProposalConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorPublicNoticeType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.PublicNotice.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.PublicNotice.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorPublicNoticeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorRecoveryRequestType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.RecoveryRequest.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.RecoveryRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorRecoveryRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorRequestDispositionType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.RequestDisposition.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.RequestDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorRequestDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewAvailabilityType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewAvailability.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewAvailability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewStateType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewState.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorReviewState_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ReviewState_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ReviewState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorReviewState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorViewerAssessment(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ViewerAssessment] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ViewerAssessment => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorViewerAssessment())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorViewerConditionType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ViewerCondition.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ViewerCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorViewerConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorViewerObservationType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ViewerObservation.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ViewerObservation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorViewerObservationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorWorkflowActionType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.WorkflowAction.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.WorkflowAction.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorWorkflowActionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorWorkflowDecision(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.WorkflowDecision] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.WorkflowDecision => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorWorkflowDecision())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorWorkflowStatus(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.WorkflowStatus] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.WorkflowStatus => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorWorkflowStatus())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateType(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.Type] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(param: RandomLibI) extends MJen[EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload] {
  override def generate(f: EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_utilContainer(param: RandomLibI) extends MJen[util.Container] {
  override def generate(f: util.Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextutilContainer())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_utilEmptyContainer(param: RandomLibI) extends MJen[util.EmptyContainer] {
  override def generate(f: util.EmptyContainer => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextutilEmptyContainer())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_runtimemonitorObservationKindType(param: RandomLibI) extends MJen[runtimemonitor.ObservationKind.Type] {
  override def generate(f: runtimemonitor.ObservationKind.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextruntimemonitorObservationKindType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}


