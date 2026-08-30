// #Sireum

package ore_hold_mining_guard_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

InputStatus.scala

RequestDisposition.scala

HoldObservation.scala

HoldAssessment.scala

AsteroidCondition.scala

LaserCondition.scala

TargetCondition.scala

SupportAssessment.scala

GuardMode.scala

ResolutionReason.scala

MiningCommand.scala

GuardStatus.scala

OffloadReadiness.scala

PilotRequestSample.scala

RequestAssessment.scala

HoldSample.scala

MiningSupportSample.scala

GuardResolution.scala

Base_Types.scala

RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_Containers.scala

HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_Containers.scala

MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_Containers.scala

OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_Containers.scala

MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_Containers.scala

GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_Containers.scala

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

@record class Gen_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Type] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorAsteroidConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorGuardModeType(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorGuardModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorGuardMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorGuardResolution(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.GuardResolution] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.GuardResolution => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorGuardResolution())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorGuardStatusType(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorGuardStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorHoldObservationType(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.HoldObservation.Type] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.HoldObservation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorHoldObservationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorHoldSample(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.HoldSample] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.HoldSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorHoldSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorHoldSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorInputStatusType(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorInputStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorInputStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorLaserConditionType(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Type] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorLaserConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningCommandType(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorOffloadReadinessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorRequestAssessment(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.RequestAssessment] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorRequestAssessment())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.Type] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorRequestDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.Type] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorResolutionReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorTargetConditionType(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Type] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorTargetConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload(param: RandomLibI) extends MJen[Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload] {
  override def generate(f: Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload())

      if (!continue) {
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


