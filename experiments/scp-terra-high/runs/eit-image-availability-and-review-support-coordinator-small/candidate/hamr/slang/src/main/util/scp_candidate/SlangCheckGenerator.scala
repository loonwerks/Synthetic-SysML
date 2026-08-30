// #Sireum

package scp_candidate

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

@record class Gen_EIT_Image_Availability_CoordinatorAcquisition_Sample(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Acquisition_Sample] {
  override def generate(f: EIT_Image_Availability_Coordinator.Acquisition_Sample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAcquisition_Sample())

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

@record class Gen_EIT_Image_Availability_CoordinatorAcquisition_Sample_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Acquisition_Sample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAcquisition_Sample_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorAcquisition_TokenType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Acquisition_Token.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.Acquisition_Token.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAcquisition_TokenType())

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

@record class Gen_EIT_Image_Availability_CoordinatorAcquisition_Token_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Acquisition_Token_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Acquisition_Token_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAcquisition_Token_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorAvailability_StatusType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Availability_Status.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.Availability_Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailability_StatusType())

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

@record class Gen_EIT_Image_Availability_CoordinatorAvailability_Status_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Availability_Status_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Availability_Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailability_Status_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container())

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

@record class Gen_EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_P())

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

@record class Gen_EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PreState_Container_PS())

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

@record class Gen_EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container())

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

@record class Gen_EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_P())

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

@record class Gen_EIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_PostState_Container_PS())

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

@record class Gen_EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container())

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

@record class Gen_EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_P())

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

@record class Gen_EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PreState_Container_PS())

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

@record class Gen_EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container())

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

@record class Gen_EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_P())

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

@record class Gen_EIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctor_Publication_image_availability_process_doctor_publication_PostState_Container_PS())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_DirectiveType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Directive.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Directive.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_DirectiveType())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Directive_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Directive_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Directive_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Directive_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_P())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PreState_Container_PS())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_P())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Directive_Derivation_image_availability_process_generation_directive_derivation_PostState_Container_PS())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_ResultType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Result.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Result.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_ResultType())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Result_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Result_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Result_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Result_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_P())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PreState_Container_PS())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_P())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Result_Qualification_image_availability_process_generation_result_qualification_PostState_Container_PS())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Result_Sample(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Result_Sample] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Result_Sample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Result_Sample())

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

@record class Gen_EIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Generation_Result_Sample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorGeneration_Result_Sample_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container())

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

@record class Gen_EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_P())

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

@record class Gen_EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PreState_Container_PS())

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

@record class Gen_EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container())

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

@record class Gen_EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_P())

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

@record class Gen_EIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImage_Availability_Governor_image_availability_process_image_availability_governor_PostState_Container_PS())

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

@record class Gen_EIT_Image_Availability_CoordinatorImage_DeliveryType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Image_Delivery.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.Image_Delivery.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImage_DeliveryType())

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

@record class Gen_EIT_Image_Availability_CoordinatorImage_Delivery_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Image_Delivery_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Image_Delivery_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImage_Delivery_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorImage_Resolution(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Image_Resolution] {
  override def generate(f: EIT_Image_Availability_Coordinator.Image_Resolution => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImage_Resolution())

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

@record class Gen_EIT_Image_Availability_CoordinatorImage_Resolution_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Image_Resolution_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Image_Resolution_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImage_Resolution_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorImage_StateType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Image_State.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.Image_State.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImage_StateType())

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

@record class Gen_EIT_Image_Availability_CoordinatorImage_State_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Image_State_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Image_State_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImage_State_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorInput_StatusType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Input_Status.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.Input_Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorInput_StatusType())

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

@record class Gen_EIT_Image_Availability_CoordinatorInput_Status_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Input_Status_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Input_Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorInput_Status_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorQualified_AcquisitionType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorQualified_AcquisitionType())

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

@record class Gen_EIT_Image_Availability_CoordinatorQualified_Acquisition_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Qualified_Acquisition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorQualified_Acquisition_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorQualified_Generation_ResultType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorQualified_Generation_ResultType())

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

@record class Gen_EIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Qualified_Generation_Result_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorQualified_Generation_Result_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorQualified_IntentType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Qualified_Intent.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.Qualified_Intent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorQualified_IntentType())

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

@record class Gen_EIT_Image_Availability_CoordinatorQualified_Intent_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Qualified_Intent_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Qualified_Intent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorQualified_Intent_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorRecovery_PhaseType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Recovery_Phase.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.Recovery_Phase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorRecovery_PhaseType())

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

@record class Gen_EIT_Image_Availability_CoordinatorRecovery_Phase_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Recovery_Phase_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Recovery_Phase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorRecovery_Phase_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorResolution_DispositionType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Resolution_Disposition.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.Resolution_Disposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorResolution_DispositionType())

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

@record class Gen_EIT_Image_Availability_CoordinatorResolution_Disposition_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Resolution_Disposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorResolution_Disposition_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorReview_IntentType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Review_Intent.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.Review_Intent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReview_IntentType())

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

@record class Gen_EIT_Image_Availability_CoordinatorReview_Intent_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Review_Intent_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Review_Intent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReview_Intent_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorReview_Intent_Sample(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Review_Intent_Sample] {
  override def generate(f: EIT_Image_Availability_Coordinator.Review_Intent_Sample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReview_Intent_Sample())

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

@record class Gen_EIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Review_Intent_Sample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReview_Intent_Sample_Payload())

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

@record class Gen_EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container())

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

@record class Gen_EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_P())

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

@record class Gen_EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PreState_Container_PS())

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

@record class Gen_EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container())

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

@record class Gen_EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_P())

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

@record class Gen_EIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorUpstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_PostState_Container_PS())

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


