// #Sireum

package cabin_air_quality_humidity_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Validity.scala

Arrival.scala

EnableChoice.scala

FilterPolicy.scala

HumidityPolicy.scala

RoutineAirflow.scala

CandidateClass.scala

AirCondition.scala

AirEvidence.scala

HumidityCondition.scala

HumidityEvidence.scala

PathGrant.scala

PathDisposition.scala

BlowerReadiness.scala

FilterUnitReadiness.scala

HumidifierReadiness.scala

DehumidifierReadiness.scala

FilterBranchBlowerDisposition.scala

FilterBranchPathDisposition.scala

HumidityBranchBlowerDisposition.scala

HumidityBranchHumidifierDisposition.scala

HumidityBranchDehumidifierDisposition.scala

RoutineBranchBlowerDisposition.scala

ComposerBlowerDisposition.scala

ComposerFilterDisposition.scala

ComposerHumidifierDisposition.scala

ComposerDehumidifierDisposition.scala

TrustState.scala

AirRecoveryEvent.scala

HumidityRecoveryEvent.scala

PreferenceEvent.scala

FilterProposal.scala

StatusCause.scala

HumidityProposal.scala

RoutineProposal.scala

SelectedIntent.scala

FlowClass.scala

TreatmentAction.scala

AuthorityUse.scala

SupervisorMode.scala

UserAirPreference.scala

QualifiedPreferenceCandidate.scala

AirQualityObservation.scala

HumidityObservation.scala

SharedAirPathAuthority.scala

AirTreatmentReadiness.scala

FilterCapabilityFacts.scala

HumidityCapabilityFacts.scala

BlowerCapabilityFact.scala

CapabilitySet.scala

AirRecoveryReport.scala

HumidityRecoveryReport.scala

AcceptedPreference.scala

FilterProposalReport.scala

HumidityProposalReport.scala

RoutineProposalReport.scala

SelectionReport.scala

CompositionReport.scala

CabinAirTreatmentPlan.scala

CabinAirSupervisorStatus.scala

Base_Types.scala

PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_Containers.scala

AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_Containers.scala

HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_Containers.scala

SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_Containers.scala

TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_Containers.scala

AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_Containers.scala

HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_Containers.scala

PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_Containers.scala

FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_Containers.scala

HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_Containers.scala

RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_Containers.scala

CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_Containers.scala

AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_Containers.scala

StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_Containers.scala

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

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAcceptedPreference(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAcceptedPreference())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirConditionType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirCondition.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirCondition_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirCondition_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirEvidenceType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirEvidence_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirQualityObservation(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirQualityObservation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirRecoveryEventType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirRecoveryEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorArrivalType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.Arrival.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.Arrival.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorArrivalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorArrival_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.Arrival_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.Arrival_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorArrival_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAuthorityUseType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAuthorityUseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorBlowerReadinessType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorBlowerReadinessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCandidateClassType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCandidateClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CandidateClass_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CandidateClass_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCapabilitySet(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCapabilitySet())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorComposerBlowerDispositionType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorComposerBlowerDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDispositionType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorComposerFilterDispositionType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorComposerFilterDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorComposerHumidifierDispositionType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCompositionReport(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CompositionReport] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CompositionReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCompositionReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.CompositionReport_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.CompositionReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorDehumidifierReadinessType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorDehumidifierReadinessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorEnableChoiceType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorEnableChoiceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.EnableChoice_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.EnableChoice_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDispositionType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFilterBranchPathDispositionType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFilterPolicyType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFilterPolicyType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFilterProposalType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFilterProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FilterProposal_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FilterProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFilterProposalReport(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFilterProposalReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFilterUnitReadinessType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFilterUnitReadinessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFlowClassType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFlowClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorFlowClass_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.FlowClass_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.FlowClass_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorFlowClass_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidifierReadinessType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidifierReadinessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDispositionType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDispositionType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDispositionType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityConditionType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityObservation(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityObservation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityPolicyType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityPolicyType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalReport(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEventType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPathDispositionType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPathDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PathDisposition_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PathDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPathGrantType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PathGrant.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PathGrant.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPathGrantType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPathGrant_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PathGrant_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PathGrant_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPathGrant_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPreferenceEventType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPreferenceEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorRoutineAirflowType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDispositionType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorRoutineProposalType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorRoutineProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorRoutineProposalReport(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorSelectedIntentType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorSelectedIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorSelectionReport(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.SelectionReport] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.SelectionReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorSelectionReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.SelectionReport_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.SelectionReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorStatusCauseType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.StatusCause.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.StatusCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorStatusCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorStatusCause_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.StatusCause_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.StatusCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorStatusCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorSupervisorModeType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorSupervisorModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorTreatmentActionType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorTreatmentActionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorTrustStateType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorTrustStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorTrustState_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.TrustState_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.TrustState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorTrustState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorUserAirPreference(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorUserAirPreference())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorValidityType(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.Validity.Type] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.Validity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Cabin_Air_Quality_Humidity_SupervisorValidity_Payload(param: RandomLibI) extends MJen[Cabin_Air_Quality_Humidity_Supervisor.Validity_Payload] {
  override def generate(f: Cabin_Air_Quality_Humidity_Supervisor.Validity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextCabin_Air_Quality_Humidity_SupervisorValidity_Payload())

      if (!continue) {
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


