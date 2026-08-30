// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

ContactSignature.scala

ContactSignatureStatus.scala

ContactIdentity.scala

IdentityStatus.scala

QualifiedThreat.scala

DefenseAvailability.scala

DefenseAvailabilityStatus.scala

DroneReadiness.scala

DroneReadinessStatus.scala

DefenseCondition.scala

DestinationStatus.scala

DestinationEvidenceStatus.scala

WarpProgress.scala

WarpProgressStatus.scala

RetreatCondition.scala

ResponseRequestValue.scala

RequestStatus.scala

DefenseActivation.scala

RetreatNavigationCommand.scala

ResponseDisposition.scala

AcknowledgmentValue.scala

AcknowledgmentStatus.scala

ReportPriority.scala

ResponseCommitment.scala

ContactEvidence.scala

IdentificationEvidence.scala

DefenseEvidence.scala

RetreatNavigationEvidence.scala

ResponseRequest.scala

ResponseRecord.scala

ReportAcknowledgment.scala

ThreatReport.scala

Base_Types.scala

ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_Containers.scala

DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_Containers.scala

RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_Containers.scala

PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_Containers.scala

ThreatReportComposer_threatResponseProcess_threatReportComposer_Containers.scala

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

@record class Gen_Frigate_Threat_Response_CoordinatorAcknowledgmentStatusType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorAcknowledgmentStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorAcknowledgmentValueType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.AcknowledgmentValue.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.AcknowledgmentValue.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorAcknowledgmentValueType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorContactEvidence(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ContactEvidence] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ContactEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorContactEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorContactEvidence_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ContactEvidence_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ContactEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorContactEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorContactIdentityType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ContactIdentity.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ContactIdentity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorContactIdentityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorContactIdentity_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ContactIdentity_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ContactIdentity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorContactIdentity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorContactSignatureType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ContactSignature.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ContactSignature.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorContactSignatureType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorContactSignature_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ContactSignature_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ContactSignature_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorContactSignature_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorContactSignatureStatusType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ContactSignatureStatus.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ContactSignatureStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorContactSignatureStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseActivationType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseActivation.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseActivation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseActivationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseActivation_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseActivation_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseActivation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseActivation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseAvailabilityType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseAvailability.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseAvailability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseAvailability_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseAvailabilityStatusType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseConditionType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseCondition.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseCondition_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseCondition_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseEvidence(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseEvidence] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseEvidence_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDestinationEvidenceStatusType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDestinationEvidenceStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDestinationStatusType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DestinationStatus.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DestinationStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDestinationStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDestinationStatus_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DestinationStatus_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DestinationStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDestinationStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDroneReadinessType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DroneReadiness.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DroneReadiness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDroneReadinessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDroneReadiness_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DroneReadiness_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DroneReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDroneReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDroneReadinessStatusType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DroneReadinessStatus.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DroneReadinessStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDroneReadinessStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorIdentificationEvidence(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.IdentificationEvidence] {
  override def generate(f: Frigate_Threat_Response_Coordinator.IdentificationEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorIdentificationEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorIdentityStatusType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.IdentityStatus.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.IdentityStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorIdentityStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorIdentityStatus_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.IdentityStatus_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.IdentityStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorIdentityStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorQualifiedThreatType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.QualifiedThreat.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.QualifiedThreat.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorQualifiedThreatType())

      if (!continue) {
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

@record class Gen_Frigate_Threat_Response_CoordinatorReportAcknowledgment(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ReportAcknowledgment] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ReportAcknowledgment => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorReportAcknowledgment())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorReportPriorityType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ReportPriority.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ReportPriority.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorReportPriorityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorReportPriority_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ReportPriority_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ReportPriority_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorReportPriority_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRequestStatusType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RequestStatus.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RequestStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRequestStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRequestStatus_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RequestStatus_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RequestStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRequestStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseCommitmentType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseCommitment.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseCommitment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseCommitmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseCommitment_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseCommitment_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseCommitment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseCommitment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseDispositionType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseDisposition.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseDisposition_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseRecord(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseRecord] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseRecord => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseRecord())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseRecord_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseRecord_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseRecord_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseRecord_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseRequest(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseRequest] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseRequest => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseRequest())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseRequest_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseRequest_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseRequestValueType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseRequestValue.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseRequestValue.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseRequestValueType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorResponseRequestValue_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRetreatConditionType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RetreatCondition.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RetreatCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRetreatConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRetreatCondition_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RetreatCondition_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RetreatCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRetreatCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRetreatNavigationCommandType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRetreatNavigationEvidence(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatReport(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatReport] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatReport())

      if (!continue) {
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

@record class Gen_Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS] {
  override def generate(f: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorWarpProgressType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.WarpProgress.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.WarpProgress.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorWarpProgressType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorWarpProgress_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.WarpProgress_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.WarpProgress_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorWarpProgress_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorWarpProgressStatusType(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.WarpProgressStatus.Type] {
  override def generate(f: Frigate_Threat_Response_Coordinator.WarpProgressStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorWarpProgressStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Frigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(param: RandomLibI) extends MJen[Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload] {
  override def generate(f: Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload())

      if (!continue) {
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


