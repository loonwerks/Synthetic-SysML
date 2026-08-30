// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

AirCareSelection.scala

RequestValidity.scala

RequestIntent.scala

CabinAirQuality.scala

AirQualityValidity.scala

AirAssessment.scala

CabinHumidity.scala

HumidityValidity.scala

HumidityAssessment.scala

StatusValidity.scala

FilterPathStatus.scala

DryingPathStatus.scala

TreatmentReadiness.scala

ReadinessContext.scala

AirProposal.scala

HumidityProposal.scala

RecoveryMemory.scala

AirTreatmentCommand.scala

StatusMode.scala

StatusReason.scala

RequestMemory.scala

TreatmentEquipmentStatus.scala

AirCareSupervisorStatus.scala

Base_Types.scala

AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_Containers.scala

AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_Containers.scala

HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_Containers.scala

TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_Containers.scala

FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_Containers.scala

HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_Containers.scala

ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_Containers.scala

AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_Containers.scala

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

@record class Gen_Cabin_Air_Treatment_SupervisorAirAssessmentType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirAssessment.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirAssessment_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirAssessment_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCareSelectionType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCareSelection.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCareSelection.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCareSelectionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCareSelection_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCareSelection_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCareSelection_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCareSelection_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCareSupervisorStatus(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCareSupervisorStatus())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirProposalType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirProposal.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirProposal_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirProposal_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirQualityValidityType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirQualityValidity.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirQualityValidity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirQualityValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirQualityValidity_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirQualityValidity_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirQualityValidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirQualityValidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirTreatmentCommandType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirTreatmentCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.AirTreatmentCommand_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.AirTreatmentCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorCabinAirQualityType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.CabinAirQuality.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.CabinAirQuality.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorCabinAirQualityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorCabinAirQuality_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.CabinAirQuality_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.CabinAirQuality_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorCabinAirQuality_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorCabinHumidityType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.CabinHumidity.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.CabinHumidity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorCabinHumidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorCabinHumidity_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.CabinHumidity_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.CabinHumidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorCabinHumidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorDryingPathStatusType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.DryingPathStatus.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.DryingPathStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorDryingPathStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorDryingPathStatus_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.DryingPathStatus_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.DryingPathStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorDryingPathStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorFilterPathStatusType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.FilterPathStatus.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.FilterPathStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorFilterPathStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorFilterPathStatus_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.FilterPathStatus_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.FilterPathStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorFilterPathStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityAssessmentType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityAssessment.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityAssessment_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityAssessment_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityProposalType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityProposal.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityProposal_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityProposal_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityValidityType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityValidity.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityValidity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorHumidityValidity_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.HumidityValidity_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.HumidityValidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorHumidityValidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorReadinessContextType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.ReadinessContext.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.ReadinessContext.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorReadinessContextType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorReadinessContext_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.ReadinessContext_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.ReadinessContext_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorReadinessContext_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorRecoveryMemoryType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorRecoveryMemoryType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorRecoveryMemory_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.RecoveryMemory_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.RecoveryMemory_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorRecoveryMemory_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorRequestIntentType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.RequestIntent.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.RequestIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorRequestIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorRequestIntent_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.RequestIntent_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.RequestIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorRequestIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorRequestMemoryType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.RequestMemory.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.RequestMemory.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorRequestMemoryType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorRequestMemory_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.RequestMemory_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.RequestMemory_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorRequestMemory_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorRequestValidityType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.RequestValidity.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.RequestValidity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorRequestValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorRequestValidity_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.RequestValidity_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.RequestValidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorRequestValidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorStatusModeType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.StatusMode.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.StatusMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorStatusModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorStatusMode_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.StatusMode_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.StatusMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorStatusMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorStatusReasonType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.StatusReason.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.StatusReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorStatusReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorStatusReason_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.StatusReason_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.StatusReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorStatusReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorStatusValidityType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.StatusValidity.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.StatusValidity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorStatusValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorStatusValidity_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.StatusValidity_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.StatusValidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorStatusValidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorTreatmentEquipmentStatus(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorTreatmentReadinessType(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorTreatmentReadinessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorTreatmentReadiness_Payload(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.TreatmentReadiness_Payload] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.TreatmentReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorTreatmentReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS())

      if (!continue) {
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


