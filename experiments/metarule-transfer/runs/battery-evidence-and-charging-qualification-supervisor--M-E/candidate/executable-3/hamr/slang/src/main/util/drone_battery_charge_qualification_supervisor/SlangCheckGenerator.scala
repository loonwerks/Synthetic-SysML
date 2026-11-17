// #Sireum

package drone_battery_charge_qualification_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

ServiceRequest.scala

PilotAdvisory.scala

SourceChargeSession.scala

ChargeSession.scala

SessionCase.scala

RequestResult.scala

BatteryBand.scala

Validity.scala

QualifiedBand.scala

ChargerReport.scala

ChargeInterfaceReport.scala

LifecyclePhase.scala

BatteryConfidence.scala

ConfidenceCase.scala

ChargeEligibility.scala

AttentionState.scala

AttentionCause.scala

AttentionCase.scala

PilotNotice.scala

FlightControlNotice.scala

ChargeAuthorization.scala

ChargerFacts.scala

InterfaceFacts.scala

LifecycleFacts.scala

FaultVector.scala

AdvisoryFacts.scala

PublishedSession.scala

PublishedRequestResult.scala

BatteryReportValue.scala

BatteryQualification.scala

LifecycleReportValue.scala

BatteryStateFacts.scala

AttentionResolution.scala

FaultFacts.scala

SessionResolution.scala

PublicDecisionFacts.scala

PilotStatus.scala

Base_Types.scala

CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_Containers.scala

BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_Containers.scala

ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_Containers.scala

ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_Containers.scala

LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_Containers.scala

BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_Containers.scala

ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_Containers.scala

AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_Containers.scala

BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_Containers.scala

FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_Containers.scala

ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_Containers.scala

NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_Containers.scala

AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_Containers.scala

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

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAttentionCaseType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAttentionCaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAttentionCauseType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAttentionCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAttentionResolution(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAttentionResolution())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAttentionStateType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAttentionStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAttentionState_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryBandType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryBand.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryBand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryBandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryQualification(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryQualification())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryReportValue(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeSessionType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeSessionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeSession_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargerFacts(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargerFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargerReportType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargerReportType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargerReport_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorConfidenceCaseType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorConfidenceCaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorFaultFacts(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.FaultFacts] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.FaultFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorFaultFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorFaultVector(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.FaultVector] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.FaultVector => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorFaultVector())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorFaultVector_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorInterfaceFacts(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorLifecycleFacts(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorLifecyclePhaseType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorLifecyclePhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorPilotAdvisoryType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorPilotAdvisoryType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorPilotNoticeType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorPilotStatus(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.PilotStatus] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.PilotStatus => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorPilotStatus())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorPublishedSession(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.PublishedSession] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.PublishedSession => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorPublishedSession())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorQualifiedBandType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorRequestResultType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.RequestResult.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.RequestResult.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorRequestResultType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorRequestResult_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorServiceRequestType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorServiceRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorSessionCaseType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.SessionCase.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.SessionCase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorSessionCaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorSessionCase_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorSessionResolution(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.SessionResolution] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.SessionResolution => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorSessionResolution())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorSourceChargeSessionType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorSourceChargeSessionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorValidityType(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.Validity.Type] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.Validity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Battery_Charge_Qualification_SupervisorValidity_Payload(param: RandomLibI) extends MJen[Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload] {
  override def generate(f: Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Battery_Charge_Qualification_SupervisorValidity_Payload())

      if (!continue) {
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


