// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

BatteryCapacityBand.scala

BatteryCheck.scala

BatteryAssessment.scala

LifecycleContext.scala

ChargeContextQualification.scala

BatteryReadinessAdvice.scala

ChargerConnection.scala

ChargeActivity.scala

ChargerPathQualification.scala

ChargeSessionState.scala

ChargeEligibilityEnvelope.scala

ChargeRequest.scala

ChargeDecision.scala

SnapshotPreSessionState.scala

SnapshotNextSessionState.scala

SnapshotChargeDisposition.scala

ChargeReason.scala

ChargePermission.scala

FlightControlBatteryNotice.scala

PilotSessionState.scala

PilotChargeDisposition.scala

PilotAdvisory.scala

ChargeSessionSnapshot.scala

PilotBatteryStatus.scala

Base_Types.scala

BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_Containers.scala

ChargeContextQualifier_supervisorProcess_chargeContextQualifier_Containers.scala

ChargerPathQualifier_supervisorProcess_chargerPathQualifier_Containers.scala

ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_Containers.scala

ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_Containers.scala

ChargeSessionController_supervisorProcess_chargeSessionController_Containers.scala

FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_Containers.scala

PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_Containers.scala

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

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(param: RandomLibI) extends MJen[Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload] {
  override def generate(f: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload())

      if (!continue) {
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


