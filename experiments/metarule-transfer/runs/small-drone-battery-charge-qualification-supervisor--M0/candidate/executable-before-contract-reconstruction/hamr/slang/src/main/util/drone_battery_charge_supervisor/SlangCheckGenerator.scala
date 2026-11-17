// #Sireum

package drone_battery_charge_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

BatteryIndication.scala

InputStatus.scala

BatteryEvidence.scala

ChargerAvailability.scala

FlightActivity.scala

ChargeContext.scala

ChargeIntent.scala

QualifiedChargeIntent.scala

ChargeAuthorization.scala

ChargeDisposition.scala

BatteryAttention.scala

BatteryReadinessEvidence.scala

BatterySample.scala

ChargerSample.scala

FlightActivitySample.scala

ChargeIntentSample.scala

ChargeDecision.scala

Base_Types.scala

Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_Containers.scala

Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_Containers.scala

Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_Containers.scala

Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_Containers.scala

Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_Containers.scala

Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_Containers.scala

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

@record class Gen_Drone_Battery_Charge_SupervisorBatteryAttentionType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.BatteryAttention.Type] {
  override def generate(f: Drone_Battery_Charge_Supervisor.BatteryAttention.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBatteryAttentionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorBatteryAttention_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.BatteryAttention_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.BatteryAttention_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBatteryAttention_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorBatteryEvidenceType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.BatteryEvidence.Type] {
  override def generate(f: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBatteryEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBatteryEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorBatteryIndicationType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.BatteryIndication.Type] {
  override def generate(f: Drone_Battery_Charge_Supervisor.BatteryIndication.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBatteryIndicationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorBatteryIndication_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.BatteryIndication_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.BatteryIndication_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBatteryIndication_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type] {
  override def generate(f: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorBatterySample(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.BatterySample] {
  override def generate(f: Drone_Battery_Charge_Supervisor.BatterySample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBatterySample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorBatterySample_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.BatterySample_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.BatterySample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBatterySample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargeAuthorizationType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargeAuthorizationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargeAuthorization_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargeContextType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargeContext.Type] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargeContext.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargeContextType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargeContext_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargeContext_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargeContext_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargeContext_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargeDecision(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargeDecision] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargeDecision => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargeDecision())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargeDecision_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargeDecision_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargeDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargeDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargeDispositionType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargeDisposition.Type] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargeDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargeDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargeDisposition_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargeDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargeIntentType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargeIntent.Type] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargeIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargeIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargeIntent_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargeIntent_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargeIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargeIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargeIntentSample(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargeIntentSample] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargeIntentSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargeIntentSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargeIntentSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargerAvailabilityType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargerAvailability.Type] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargerAvailability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargerAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargerAvailability_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargerAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargerSample(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargerSample] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargerSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargerSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorChargerSample_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.ChargerSample_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.ChargerSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorChargerSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorFlightActivityType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.FlightActivity.Type] {
  override def generate(f: Drone_Battery_Charge_Supervisor.FlightActivity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorFlightActivityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorFlightActivity_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.FlightActivity_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.FlightActivity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorFlightActivity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorFlightActivitySample(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.FlightActivitySample] {
  override def generate(f: Drone_Battery_Charge_Supervisor.FlightActivitySample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorFlightActivitySample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorFlightActivitySample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorInputStatusType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.InputStatus.Type] {
  override def generate(f: Drone_Battery_Charge_Supervisor.InputStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorInputStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorInputStatus_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.InputStatus_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.InputStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorInputStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type] {
  override def generate(f: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload] {
  override def generate(f: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS())

      if (!continue) {
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


