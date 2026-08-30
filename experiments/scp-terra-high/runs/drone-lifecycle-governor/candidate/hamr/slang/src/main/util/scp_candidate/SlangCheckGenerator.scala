// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

LifecycleRequest.scala

ChargerState.scala

RecoveryProposal.scala

EffectiveIntent.scala

FreshRequestPreemption.scala

BatteryCapacityBand.scala

BatteryCheck.scala

BatteryQualification.scala

NavigationCondition.scala

RadioCondition.scala

FlightQualification.scala

LifecycleState.scala

EligibilityReason.scala

DecisionPreState.scala

DecisionNextState.scala

TransitionResult.scala

PowerCommand.scala

ChargeCommand.scala

FlightAuthorization.scala

PilotLifecycleState.scala

RequestDisposition.scala

PilotNotice.scala

ArbitratedIntent.scala

EligibilityEnvelope.scala

DecisionSnapshot.scala

PilotStatus.scala

Base_Types.scala

RequestArbiter_governorProcess_requestArbiter_Containers.scala

BatteryQualificationOwner_governorProcess_batteryQualificationOwner_Containers.scala

FlightReadinessOwner_governorProcess_flightReadinessOwner_Containers.scala

OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_Containers.scala

LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_Containers.scala

PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_Containers.scala

FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_Containers.scala

SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_Containers.scala

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

@record class Gen_Drone_Lifecycle_GovernorArbitratedIntent(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.ArbitratedIntent] {
  override def generate(f: Drone_Lifecycle_Governor.ArbitratedIntent => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorArbitratedIntent())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorArbitratedIntent_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.ArbitratedIntent_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.ArbitratedIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorArbitratedIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorBatteryCapacityBandType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.BatteryCapacityBand.Type] {
  override def generate(f: Drone_Lifecycle_Governor.BatteryCapacityBand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorBatteryCapacityBandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorBatteryCapacityBand_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.BatteryCapacityBand_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.BatteryCapacityBand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorBatteryCapacityBand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorBatteryCheckType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.BatteryCheck.Type] {
  override def generate(f: Drone_Lifecycle_Governor.BatteryCheck.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorBatteryCheckType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorBatteryCheck_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.BatteryCheck_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.BatteryCheck_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorBatteryCheck_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorBatteryQualificationType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.BatteryQualification.Type] {
  override def generate(f: Drone_Lifecycle_Governor.BatteryQualification.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorBatteryQualificationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorBatteryQualification_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.BatteryQualification_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.BatteryQualification_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorBatteryQualification_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorChargeCommandType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.ChargeCommand.Type] {
  override def generate(f: Drone_Lifecycle_Governor.ChargeCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorChargeCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorChargeCommand_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.ChargeCommand_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.ChargeCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorChargeCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorChargerStateType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.ChargerState.Type] {
  override def generate(f: Drone_Lifecycle_Governor.ChargerState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorChargerStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorChargerState_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.ChargerState_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.ChargerState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorChargerState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorDecisionNextStateType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.DecisionNextState.Type] {
  override def generate(f: Drone_Lifecycle_Governor.DecisionNextState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorDecisionNextStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorDecisionNextState_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.DecisionNextState_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.DecisionNextState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorDecisionNextState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorDecisionPreStateType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.DecisionPreState.Type] {
  override def generate(f: Drone_Lifecycle_Governor.DecisionPreState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorDecisionPreStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorDecisionPreState_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.DecisionPreState_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.DecisionPreState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorDecisionPreState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorDecisionSnapshot(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.DecisionSnapshot] {
  override def generate(f: Drone_Lifecycle_Governor.DecisionSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorDecisionSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorDecisionSnapshot_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.DecisionSnapshot_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.DecisionSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorDecisionSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorEffectiveIntentType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.EffectiveIntent.Type] {
  override def generate(f: Drone_Lifecycle_Governor.EffectiveIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorEffectiveIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorEffectiveIntent_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.EffectiveIntent_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.EffectiveIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorEffectiveIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorEligibilityEnvelope(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.EligibilityEnvelope] {
  override def generate(f: Drone_Lifecycle_Governor.EligibilityEnvelope => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorEligibilityEnvelope())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorEligibilityEnvelope_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.EligibilityEnvelope_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.EligibilityEnvelope_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorEligibilityEnvelope_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorEligibilityReasonType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.EligibilityReason.Type] {
  override def generate(f: Drone_Lifecycle_Governor.EligibilityReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorEligibilityReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorEligibilityReason_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.EligibilityReason_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.EligibilityReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorEligibilityReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightAuthorizationType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightAuthorization.Type] {
  override def generate(f: Drone_Lifecycle_Governor.FlightAuthorization.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightAuthorizationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightAuthorization_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightAuthorization_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.FlightAuthorization_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightAuthorization_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightQualificationType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightQualification.Type] {
  override def generate(f: Drone_Lifecycle_Governor.FlightQualification.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightQualificationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightQualification_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightQualification_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.FlightQualification_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightQualification_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFreshRequestPreemptionType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FreshRequestPreemption.Type] {
  override def generate(f: Drone_Lifecycle_Governor.FreshRequestPreemption.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFreshRequestPreemptionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorFreshRequestPreemption_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.FreshRequestPreemption_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.FreshRequestPreemption_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorFreshRequestPreemption_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorLifecycleRequestType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.LifecycleRequest.Type] {
  override def generate(f: Drone_Lifecycle_Governor.LifecycleRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorLifecycleRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorLifecycleRequest_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.LifecycleRequest_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.LifecycleRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorLifecycleRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorLifecycleStateType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.LifecycleState.Type] {
  override def generate(f: Drone_Lifecycle_Governor.LifecycleState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorLifecycleStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorLifecycleState_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.LifecycleState_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.LifecycleState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorLifecycleState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorNavigationConditionType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.NavigationCondition.Type] {
  override def generate(f: Drone_Lifecycle_Governor.NavigationCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorNavigationConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorNavigationCondition_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.NavigationCondition_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.NavigationCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorNavigationCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorPilotLifecycleStateType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.PilotLifecycleState.Type] {
  override def generate(f: Drone_Lifecycle_Governor.PilotLifecycleState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorPilotLifecycleStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorPilotLifecycleState_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.PilotLifecycleState_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.PilotLifecycleState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorPilotLifecycleState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorPilotNoticeType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.PilotNotice.Type] {
  override def generate(f: Drone_Lifecycle_Governor.PilotNotice.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorPilotNoticeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorPilotNotice_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.PilotNotice_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.PilotNotice_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorPilotNotice_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorPilotStatus(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.PilotStatus] {
  override def generate(f: Drone_Lifecycle_Governor.PilotStatus => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorPilotStatus())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorPilotStatus_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.PilotStatus_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.PilotStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorPilotStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorPowerCommandType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.PowerCommand.Type] {
  override def generate(f: Drone_Lifecycle_Governor.PowerCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorPowerCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorPowerCommand_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.PowerCommand_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.PowerCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorPowerCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorRadioConditionType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.RadioCondition.Type] {
  override def generate(f: Drone_Lifecycle_Governor.RadioCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorRadioConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorRadioCondition_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.RadioCondition_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.RadioCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorRadioCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorRecoveryProposalType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.RecoveryProposal.Type] {
  override def generate(f: Drone_Lifecycle_Governor.RecoveryProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorRecoveryProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorRecoveryProposal_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.RecoveryProposal_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.RecoveryProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorRecoveryProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorRequestDispositionType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.RequestDisposition.Type] {
  override def generate(f: Drone_Lifecycle_Governor.RequestDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorRequestDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorRequestDisposition_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.RequestDisposition_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.RequestDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorRequestDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorTransitionResultType(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.TransitionResult.Type] {
  override def generate(f: Drone_Lifecycle_Governor.TransitionResult.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorTransitionResultType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_GovernorTransitionResult_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Governor.TransitionResult_Payload] {
  override def generate(f: Drone_Lifecycle_Governor.TransitionResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_GovernorTransitionResult_Payload())

      if (!continue) {
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


