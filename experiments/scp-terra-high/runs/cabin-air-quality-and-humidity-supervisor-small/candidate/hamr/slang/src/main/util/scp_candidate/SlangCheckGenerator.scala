// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

AirCarePreference.scala

PreferenceValidity.scala

AirCareIntent.scala

CabinAirQuality.scala

AirQualityValidity.scala

AirAssessment.scala

CabinHumidityBand.scala

HumidityValidity.scala

HumidityAssessment.scala

MeasurementConfidence.scala

AirTreatmentDirective.scala

AirCareStatus.scala

ConfidenceMode.scala

Base_Types.scala

PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_Containers.scala

AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_Containers.scala

HumidityAssessor_airCareSupervisionProcess_humidityAssessor_Containers.scala

ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_Containers.scala

AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_Containers.scala

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

@record class Gen_Cabin_Air_Care_SupervisorAirAssessmentType(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirAssessment.Type] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirAssessment_Payload(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirAssessment_Payload] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirCareIntentType(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirCareIntent.Type] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirCareIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirCareIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirCareIntent_Payload(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirCareIntent_Payload] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirCareIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirCareIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirCarePreferenceType(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirCarePreference.Type] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirCarePreference.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirCarePreferenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirCarePreference_Payload(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirCarePreference_Payload] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirCarePreference_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirCarePreference_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirCareStatusType(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirCareStatus.Type] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirCareStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirCareStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirCareStatus_Payload(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirCareStatus_Payload] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirCareStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirCareStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirQualityValidityType(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirQualityValidity.Type] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirQualityValidity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirQualityValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirQualityValidity_Payload(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirQualityValidity_Payload] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirQualityValidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirQualityValidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirTreatmentDirectiveType(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirTreatmentDirective.Type] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirTreatmentDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirTreatmentDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorAirTreatmentDirective_Payload(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload] {
  override def generate(f: Cabin_Air_Care_Supervisor.AirTreatmentDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorAirTreatmentDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorCabinAirQualityType(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.CabinAirQuality.Type] {
  override def generate(f: Cabin_Air_Care_Supervisor.CabinAirQuality.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorCabinAirQualityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorCabinAirQuality_Payload(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.CabinAirQuality_Payload] {
  override def generate(f: Cabin_Air_Care_Supervisor.CabinAirQuality_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorCabinAirQuality_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorCabinHumidityBandType(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.CabinHumidityBand.Type] {
  override def generate(f: Cabin_Air_Care_Supervisor.CabinHumidityBand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorCabinHumidityBandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorCabinHumidityBand_Payload(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload] {
  override def generate(f: Cabin_Air_Care_Supervisor.CabinHumidityBand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorCabinHumidityBand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorConfidenceModeType(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.ConfidenceMode.Type] {
  override def generate(f: Cabin_Air_Care_Supervisor.ConfidenceMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorConfidenceModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorConfidenceMode_Payload(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.ConfidenceMode_Payload] {
  override def generate(f: Cabin_Air_Care_Supervisor.ConfidenceMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorConfidenceMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorHumidityAssessmentType(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.HumidityAssessment.Type] {
  override def generate(f: Cabin_Air_Care_Supervisor.HumidityAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorHumidityAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorHumidityAssessment_Payload(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.HumidityAssessment_Payload] {
  override def generate(f: Cabin_Air_Care_Supervisor.HumidityAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorHumidityAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container] {
  override def generate(f: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P] {
  override def generate(f: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container] {
  override def generate(f: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P] {
  override def generate(f: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorHumidityAssessor_airCareSupervisionProcess_humidityAssessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorHumidityValidityType(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.HumidityValidity.Type] {
  override def generate(f: Cabin_Air_Care_Supervisor.HumidityValidity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorHumidityValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorHumidityValidity_Payload(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.HumidityValidity_Payload] {
  override def generate(f: Cabin_Air_Care_Supervisor.HumidityValidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorHumidityValidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorMeasurementConfidenceType(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.MeasurementConfidence.Type] {
  override def generate(f: Cabin_Air_Care_Supervisor.MeasurementConfidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorMeasurementConfidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorMeasurementConfidence_Payload(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload] {
  override def generate(f: Cabin_Air_Care_Supervisor.MeasurementConfidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorMeasurementConfidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container] {
  override def generate(f: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P] {
  override def generate(f: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container] {
  override def generate(f: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P] {
  override def generate(f: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Care_Supervisor.ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container] {
  override def generate(f: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P] {
  override def generate(f: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container] {
  override def generate(f: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P] {
  override def generate(f: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Care_Supervisor.PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorPreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorPreferenceValidityType(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.PreferenceValidity.Type] {
  override def generate(f: Cabin_Air_Care_Supervisor.PreferenceValidity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorPreferenceValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Care_SupervisorPreferenceValidity_Payload(param: RandomLibI) extends MJen[Cabin_Air_Care_Supervisor.PreferenceValidity_Payload] {
  override def generate(f: Cabin_Air_Care_Supervisor.PreferenceValidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Care_SupervisorPreferenceValidity_Payload())

      if (!continue) {
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


