// #Sireum

package frigate_threat_response_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

ContactClass.scala

EvidenceStatus.scala

ThreatBand.scala

ThreatValidity.scala

AlertState.scala

ThreatReport.scala

DefenseAuthority.scala

DefenseOutcome.scala

ChannelGate.scala

ChannelState.scala

EscapeAuthority.scala

EscapeOutcome.scala

RouteStatus.scala

MiningInterlock.scala

DefenseProposal.scala

EscapeProposal.scala

ResponsePattern.scala

DefenseDirective.scala

EscapeDirective.scala

ResponseStage.scala

DefenseChannelCondition.scala

EscapeChannelCondition.scala

ThreatEvidence.scala

QualifiedThreat.scala

DefenseReadinessContext.scala

ResponseFrame.scala

Base_Types.scala

ThreatQualification_threatResponseProcess_threatQualification_Containers.scala

AlertMemory_threatResponseProcess_alertMemory_Containers.scala

DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_Containers.scala

EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_Containers.scala

DefenseReadiness_threatResponseProcess_defenseReadiness_Containers.scala

DepartureReadiness_threatResponseProcess_departureReadiness_Containers.scala

DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_Containers.scala

DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_Containers.scala

ResponseCoordination_threatResponseProcess_responseCoordination_Containers.scala

ReportFrameComposition_threatResponseProcess_reportFrameComposition_Containers.scala

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

@record class Gen_Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorAlertStateType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.AlertState.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.AlertState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorAlertStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorAlertState_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.AlertState_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.AlertState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorAlertState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorChannelGateType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ChannelGate.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ChannelGate.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorChannelGateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorChannelGate_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ChannelGate_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ChannelGate_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorChannelGate_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorChannelStateType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ChannelState.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ChannelState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorChannelStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorChannelState_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ChannelState_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ChannelState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorChannelState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorContactClassType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ContactClass.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ContactClass.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorContactClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorContactClass_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ContactClass_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ContactClass_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorContactClass_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseAuthorityType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseAuthority.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseAuthority.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseAuthorityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseAuthority_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseChannelConditionType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseChannelCondition.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseChannelCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseChannelConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseDirectiveType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseDirective.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseDirective_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseDirective_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseOutcomeType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseOutcome.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseOutcome.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseOutcomeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseOutcome_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseProposalType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseProposal.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseProposal_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseProposal_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseReadinessContext(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseReadinessContext] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseReadinessContext => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseReadinessContext())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeAuthorityType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeAuthority.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeAuthority.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeAuthorityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeAuthority_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeChannelConditionType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeChannelCondition.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeChannelCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeChannelConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeDirectiveType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeDirective.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeDirective_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeDirective_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeOutcomeType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeOutcome.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeOutcome.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeOutcomeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeOutcome_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeProposalType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeProposal.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEscapeProposal_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EscapeProposal_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EscapeProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEscapeProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEvidenceStatusType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EvidenceStatus.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EvidenceStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEvidenceStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorEvidenceStatus_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorMiningInterlockType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.MiningInterlock.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.MiningInterlock.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorMiningInterlockType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorMiningInterlock_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.MiningInterlock_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.MiningInterlock_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorMiningInterlock_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorQualifiedThreat(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.QualifiedThreat] {
  override def generate(f: Frigate_Threat_Response_Coordinator.QualifiedThreat => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorQualifiedThreat())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorQualifiedThreat_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseFrame(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseFrame] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseFrame_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseFrame_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponsePatternType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponsePattern.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponsePattern.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponsePatternType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponsePattern_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponsePattern_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponsePattern_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponsePattern_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseStageType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseStage.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseStage.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseStageType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseStage_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseStage_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseStage_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseStage_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRouteStatusType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RouteStatus.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RouteStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRouteStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRouteStatus_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RouteStatus_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RouteStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRouteStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatBandType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatBand.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatBand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatBandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatBand_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatBand_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatBand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatBand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatEvidence(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatEvidence] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatEvidence_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatReportType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatReport.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatReport.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatReportType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatReport_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatReport_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatValidityType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatValidity.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatValidity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatValidity_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatValidity_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatValidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatValidity_Payload())

      if (!continue) {
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


