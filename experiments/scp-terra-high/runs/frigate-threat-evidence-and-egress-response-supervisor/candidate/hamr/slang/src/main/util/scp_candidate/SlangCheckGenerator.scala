// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

EvidenceBand.scala

ObservationValidity.scala

EvidenceAssessment.scala

PilotDisposition.scala

SnapshotPreEpisodeState.scala

SnapshotNextEpisodeState.scala

SnapshotEvidenceAssessment.scala

SnapshotPilotDisposition.scala

ThreatReport.scala

DefenseAvailability.scala

CapacitorSupport.scala

DefenseQualification.scala

EgressRouteObservation.scala

EgressQualification.scala

ResponseAuthorization.scala

ResponseDirective.scala

EgressProgress.scala

SnapshotPreEgressState.scala

SnapshotNextEgressState.scala

SnapshotResponseDirective.scala

SnapshotDefenseCommand.scala

SnapshotEgressCommand.scala

DefenseCommand.scala

EgressCommand.scala

ResponseStatus.scala

ThreatObservation.scala

EpisodeSnapshot.scala

DefenseSupportObservation.scala

ResponseSnapshot.scala

Base_Types.scala

ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_Containers.scala

ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_Containers.scala

ThreatReportPolicy_threatResponseProcess_threatReportPolicy_Containers.scala

DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_Containers.scala

EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_Containers.scala

ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_Containers.scala

ResponseStateController_threatResponseProcess_responseStateController_Containers.scala

ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_Containers.scala

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

@record class Gen_Frigate_Threat_Egress_SupervisorCapacitorSupportType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.CapacitorSupport.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.CapacitorSupport.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorCapacitorSupportType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorCapacitorSupport_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorDefenseAvailabilityType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.DefenseAvailability.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.DefenseAvailability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorDefenseAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorDefenseAvailability_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorDefenseCommandType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.DefenseCommand.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.DefenseCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorDefenseCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorDefenseCommand_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorDefenseCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorDefenseQualificationType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.DefenseQualification.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.DefenseQualification.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorDefenseQualificationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorDefenseQualification_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorDefenseQualification_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorDefenseSupportObservation(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.DefenseSupportObservation] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.DefenseSupportObservation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorDefenseSupportObservation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEgressCommandType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EgressCommand.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EgressCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEgressCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEgressCommand_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EgressCommand_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EgressCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEgressCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEgressProgressType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EgressProgress.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EgressProgress.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEgressProgressType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEgressProgress_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EgressProgress_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EgressProgress_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEgressProgress_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEgressQualificationType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EgressQualification.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EgressQualification.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEgressQualificationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEgressQualification_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EgressQualification_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EgressQualification_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEgressQualification_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEgressRouteObservationType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EgressRouteObservation.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EgressRouteObservation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEgressRouteObservationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEpisodeSnapshot(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EpisodeSnapshot] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEpisodeSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEvidenceAssessmentType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEvidenceAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEvidenceBandType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EvidenceBand.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EvidenceBand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEvidenceBandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorEvidenceBand_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorEvidenceBand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorObservationValidityType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ObservationValidity.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ObservationValidity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorObservationValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorObservationValidity_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorObservationValidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorPilotDispositionType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.PilotDisposition.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.PilotDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorPilotDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorPilotDisposition_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorPilotDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseAuthorizationType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseAuthorization.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseAuthorization.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseAuthorizationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseAuthorization_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseDirectiveType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseDirective.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseDirective_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseSnapshot(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseSnapshot] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseSnapshot_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseStatusType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseStatus.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseStatus_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotDefenseCommandType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotDefenseCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotEgressCommandType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotEgressCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotNextEgressStateType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotNextEgressStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotPilotDispositionType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotPilotDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotPreEgressStateType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotPreEgressStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotResponseDirectiveType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotResponseDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatObservation(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatObservation] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatObservation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatObservation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatObservation_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatReportType(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatReport.Type] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatReport.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatReportType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatReport_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatReport_Payload] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS())

      if (!continue) {
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


