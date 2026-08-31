// #Sireum

package forest_observation_eligibility_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

RequestCommand.scala

RequestToken.scala

GateOutcome.scala

EvaluationTicket.scala

RequestContext.scala

EligibilityStatus.scala

EnergyEvidence.scala

EnergyVerdict.scala

TaggedTicket.scala

CameraEvidence.scala

RadioEvidence.scala

SupportVerdict.scala

EligibilityDecision.scala

ObservationProgress.scala

ObservationAuthorization.scala

RequestState.scala

LastAcceptedToken.scala

GatePhase.scala

RequestInput.scala

TaggedEnergyVerdict.scala

TaggedSupportVerdict.scala

Base_Types.scala

RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_Containers.scala

EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_Containers.scala

ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_Containers.scala

EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_Containers.scala

AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_Containers.scala

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

@record class Gen_Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorCameraEvidenceType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.CameraEvidence.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.CameraEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorCameraEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorCameraEvidence_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorCameraEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEligibilityDecisionType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEligibilityDecisionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEligibilityStatusType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEligibilityStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEnergyEvidenceType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EnergyEvidence.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EnergyEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEnergyEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEnergyVerdictType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EnergyVerdict.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EnergyVerdict.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEnergyVerdictType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEvaluationTicketType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEvaluationTicketType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorGateOutcomeType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.GateOutcome.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.GateOutcome.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorGateOutcomeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorGateOutcome_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorGateOutcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorGatePhaseType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.GatePhase.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.GatePhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorGatePhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorGatePhase_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.GatePhase_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.GatePhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorGatePhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorLastAcceptedTokenType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorLastAcceptedTokenType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorLastAcceptedToken_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.LastAcceptedToken_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.LastAcceptedToken_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorLastAcceptedToken_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorObservationAuthorizationType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorObservationAuthorizationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorObservationProgressType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.ObservationProgress.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.ObservationProgress.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorObservationProgressType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorObservationProgress_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorObservationProgress_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRadioEvidenceType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RadioEvidence.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RadioEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRadioEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRadioEvidence_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRadioEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestCommandType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestCommand.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestCommand_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestContextType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestContext.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestContext.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestContextType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestContext_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestContext_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestContext_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestContext_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestInput(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestInput] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestInput => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestInput())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestInput_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestInput_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestInput_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestInput_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestStateType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestState.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestState_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestState_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestTokenType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestToken.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestToken.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestTokenType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorRequestToken_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.RequestToken_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.RequestToken_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorRequestToken_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorSupportVerdictType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.SupportVerdict.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.SupportVerdict.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorSupportVerdictType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorSupportVerdict_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorSupportVerdict_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorTaggedSupportVerdict(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorTaggedSupportVerdict())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorTaggedTicketType(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.TaggedTicket.Type] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.TaggedTicket.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorTaggedTicketType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Forest_Observation_Eligibility_SupervisorTaggedTicket_Payload(param: RandomLibI) extends MJen[Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload] {
  override def generate(f: Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextForest_Observation_Eligibility_SupervisorTaggedTicket_Payload())

      if (!continue) {
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


