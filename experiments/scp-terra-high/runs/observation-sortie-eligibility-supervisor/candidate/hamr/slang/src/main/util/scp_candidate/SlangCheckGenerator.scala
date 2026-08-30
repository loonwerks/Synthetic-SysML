// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

EnergyQuality.scala

Validity.scala

Freshness.scala

EnergyCause.scala

GpsCondition.scala

InertialCondition.scala

BarometricCondition.scala

NavigationCause.scala

EquipmentCondition.scala

SingleEquipmentCause.scala

Engine1Condition.scala

Engine2Condition.scala

Engine3Condition.scala

Engine4Condition.scala

Confirmation.scala

PropulsionCause.scala

OperatorEvent.scala

PriorityDirective.scala

ReleaseFeedback.scala

RequestPhase.scala

FaultState.scala

EquipmentCause.scala

RecoveryPhase.scala

RecoveryGate.scala

CarriedPriority.scala

SortieDirective.scala

EligibilityReason.scala

StatusRequestPhase.scala

StatusFaultState.scala

StatusRecoveryPhase.scala

StatusDecision.scala

LimitingCause.scala

EnergyEvidence.scala

EnergyAssessment.scala

NavigationEvidenceRecord.scala

NavigationAssessment.scala

EquipmentEvidence.scala

SingleEquipmentAssessment.scala

PropulsionEvidence.scala

PropulsionAssessment.scala

FaultSummary.scala

RecoveryFacts.scala

EligibilityDecision.scala

EligibilityStatus.scala

Base_Types.scala

EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_Containers.scala

NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_Containers.scala

CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_Containers.scala

ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_Containers.scala

ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_Containers.scala

PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_Containers.scala

RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_Containers.scala

FaultRegistry_eligibility_supervisor_process_fault_registry_Containers.scala

PriorityArbiter_eligibility_supervisor_process_priority_arbiter_Containers.scala

RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_Containers.scala

EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_Containers.scala

PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_Containers.scala

StatusComposer_eligibility_supervisor_process_status_composer_Containers.scala

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

@record class Gen_Observation_Sortie_Eligibility_SupervisorBarometricConditionType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.BarometricCondition.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.BarometricCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorBarometricConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorCarriedPriorityType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorCarriedPriorityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorConfirmationType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.Confirmation.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.Confirmation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorConfirmationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorConfirmation_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorConfirmation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEligibilityDecision(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EligibilityDecision] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEligibilityDecision())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEligibilityReasonType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEligibilityReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEligibilityStatus(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EligibilityStatus] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EligibilityStatus => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEligibilityStatus())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEnergyAssessment(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EnergyAssessment] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEnergyAssessment())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEnergyCauseType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EnergyCause.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EnergyCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEnergyCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEnergyCause_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEnergyEvidence(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EnergyEvidence] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EnergyEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEnergyEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEnergyQualityType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEnergyQualityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEngine1ConditionType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.Engine1Condition.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.Engine1Condition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEngine1ConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEngine2ConditionType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.Engine2Condition.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.Engine2Condition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEngine2ConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEngine3ConditionType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.Engine3Condition.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.Engine3Condition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEngine3ConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEngine4ConditionType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.Engine4Condition.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.Engine4Condition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEngine4ConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEquipmentCauseType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEquipmentCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEquipmentConditionType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEquipmentConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEquipmentEvidence(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEquipmentEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorFaultStateType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.FaultState.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.FaultState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorFaultStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorFaultState_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.FaultState_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.FaultState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorFaultState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorFaultSummary(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.FaultSummary] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.FaultSummary => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorFaultSummary())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorFaultSummary_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorFreshnessType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.Freshness.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.Freshness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorFreshnessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorFreshness_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.Freshness_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.Freshness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorFreshness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorGpsConditionType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.GpsCondition.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.GpsCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorGpsConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorGpsCondition_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorInertialConditionType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.InertialCondition.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.InertialCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorInertialConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorInertialCondition_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorLimitingCauseType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.LimitingCause.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.LimitingCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorLimitingCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorLimitingCause_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorNavigationAssessment(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.NavigationAssessment] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorNavigationAssessment())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorNavigationCauseType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.NavigationCause.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.NavigationCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorNavigationCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorNavigationCause_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorOperatorEventType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorOperatorEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPriorityDirectiveType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPropulsionAssessment(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPropulsionAssessment())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPropulsionCauseType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPropulsionCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPropulsionEvidence(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPropulsionEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRecoveryFacts(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RecoveryFacts] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RecoveryFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRecoveryFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRecoveryGateType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRecoveryGateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRecoveryPhaseType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorReleaseFeedbackType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRequestPhaseType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRequestPhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorRequestPhase_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorSingleEquipmentCauseType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorSingleEquipmentCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorSortieDirectiveType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.SortieDirective.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.SortieDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorSortieDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorSortieDirective_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorStatusDecisionType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.StatusDecision.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.StatusDecision.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorStatusDecisionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorStatusDecision_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorStatusFaultStateType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorStatusFaultStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorStatusRequestPhaseType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorStatusRequestPhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorValidityType(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.Validity.Type] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.Validity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Sortie_Eligibility_SupervisorValidity_Payload(param: RandomLibI) extends MJen[Observation_Sortie_Eligibility_Supervisor.Validity_Payload] {
  override def generate(f: Observation_Sortie_Eligibility_Supervisor.Validity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Sortie_Eligibility_SupervisorValidity_Payload())

      if (!continue) {
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


