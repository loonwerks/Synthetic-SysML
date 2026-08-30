// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

AccessRequest.scala

RequestOperation.scala

Correlation.scala

VesselStatus.scala

VesselClass.scala

StationReport.scala

StationProgress.scala

ServiceActivity.scala

ServiceClass.scala

LifecycleState.scala

RequestDisposition.scala

ControlEvent.scala

BerthState.scala

GateState.scala

RecoveryState.scala

RecoveryIntent.scala

LifecycleDirective.scala

DecisionContext.scala

BerthEvidenceKind.scala

GateDirective.scala

PriorityKind.scala

SupervisoryAction.scala

DecisionCause.scala

PublicMode.scala

AccessStatus.scala

DockingOutcome.scala

RequestFacts.scala

VesselFacts.scala

StationFacts.scala

ServiceFacts.scala

AdmissionGuard.scala

PriorLifecycleView.scala

AdmissionDecision.scala

RecoveryTransition.scala

CoordinationFrame.scala

BerthTransitionEvidence.scala

GateSafetyFrame.scala

PriorityDirective.scala

DockingProposal.scala

AccessProposal.scala

UndockingProposal.scala

DockingDecisionFrame.scala

DockingAccessResult.scala

Base_Types.scala

RequestClassification_supervisor_process_request_classification_Containers.scala

VesselStatusAssessment_supervisor_process_vessel_status_assessment_Containers.scala

StationReportAssessment_supervisor_process_station_report_assessment_Containers.scala

ServiceActivityAssessment_supervisor_process_service_activity_assessment_Containers.scala

RequestAdmission_supervisor_process_request_admission_Containers.scala

AccessCoherence_supervisor_process_access_coherence_Containers.scala

DockingLifecycle_supervisor_process_docking_lifecycle_Containers.scala

BerthCommitment_supervisor_process_berth_commitment_Containers.scala

ServiceAccessGate_supervisor_process_service_access_gate_Containers.scala

RecoverySupervisor_supervisor_process_recovery_supervisor_Containers.scala

DockingActionEligibility_supervisor_process_docking_action_eligibility_Containers.scala

AccessActionEligibility_supervisor_process_access_action_eligibility_Containers.scala

UndockingActionEligibility_supervisor_process_undocking_action_eligibility_Containers.scala

DockingActionArbitration_supervisor_process_docking_action_arbitration_Containers.scala

ResultComposition_supervisor_process_result_composition_Containers.scala

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

@record class Gen_Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container] {
  override def generate(f: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container] {
  override def generate(f: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container] {
  override def generate(f: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container] {
  override def generate(f: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessProposal(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessProposal] {
  override def generate(f: Docking_Access_Supervisor.AccessProposal => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessProposal())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessProposal_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessProposal_Payload] {
  override def generate(f: Docking_Access_Supervisor.AccessProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessRequestType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessRequest.Type] {
  override def generate(f: Docking_Access_Supervisor.AccessRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessRequest_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessRequest_Payload] {
  override def generate(f: Docking_Access_Supervisor.AccessRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessStatusType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessStatus.Type] {
  override def generate(f: Docking_Access_Supervisor.AccessStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAccessStatus_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AccessStatus_Payload] {
  override def generate(f: Docking_Access_Supervisor.AccessStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAccessStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAdmissionDecision(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AdmissionDecision] {
  override def generate(f: Docking_Access_Supervisor.AdmissionDecision => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAdmissionDecision())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAdmissionDecision_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AdmissionDecision_Payload] {
  override def generate(f: Docking_Access_Supervisor.AdmissionDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAdmissionDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAdmissionGuard(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AdmissionGuard] {
  override def generate(f: Docking_Access_Supervisor.AdmissionGuard => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAdmissionGuard())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorAdmissionGuard_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.AdmissionGuard_Payload] {
  override def generate(f: Docking_Access_Supervisor.AdmissionGuard_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorAdmissionGuard_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container] {
  override def generate(f: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container] {
  override def generate(f: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorBerthEvidenceKindType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.BerthEvidenceKind.Type] {
  override def generate(f: Docking_Access_Supervisor.BerthEvidenceKind.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorBerthEvidenceKindType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorBerthEvidenceKind_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.BerthEvidenceKind_Payload] {
  override def generate(f: Docking_Access_Supervisor.BerthEvidenceKind_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorBerthEvidenceKind_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorBerthStateType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.BerthState.Type] {
  override def generate(f: Docking_Access_Supervisor.BerthState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorBerthStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorBerthState_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.BerthState_Payload] {
  override def generate(f: Docking_Access_Supervisor.BerthState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorBerthState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorBerthTransitionEvidence(param: RandomLibI) extends MJen[Docking_Access_Supervisor.BerthTransitionEvidence] {
  override def generate(f: Docking_Access_Supervisor.BerthTransitionEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorBerthTransitionEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorBerthTransitionEvidence_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.BerthTransitionEvidence_Payload] {
  override def generate(f: Docking_Access_Supervisor.BerthTransitionEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorBerthTransitionEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorControlEventType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ControlEvent.Type] {
  override def generate(f: Docking_Access_Supervisor.ControlEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorControlEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorControlEvent_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ControlEvent_Payload] {
  override def generate(f: Docking_Access_Supervisor.ControlEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorControlEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorCoordinationFrame(param: RandomLibI) extends MJen[Docking_Access_Supervisor.CoordinationFrame] {
  override def generate(f: Docking_Access_Supervisor.CoordinationFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorCoordinationFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorCoordinationFrame_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.CoordinationFrame_Payload] {
  override def generate(f: Docking_Access_Supervisor.CoordinationFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorCoordinationFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorCorrelationType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.Correlation.Type] {
  override def generate(f: Docking_Access_Supervisor.Correlation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorCorrelationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorCorrelation_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.Correlation_Payload] {
  override def generate(f: Docking_Access_Supervisor.Correlation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorCorrelation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDecisionCauseType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DecisionCause.Type] {
  override def generate(f: Docking_Access_Supervisor.DecisionCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDecisionCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDecisionCause_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DecisionCause_Payload] {
  override def generate(f: Docking_Access_Supervisor.DecisionCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDecisionCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDecisionContextType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DecisionContext.Type] {
  override def generate(f: Docking_Access_Supervisor.DecisionContext.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDecisionContextType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDecisionContext_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DecisionContext_Payload] {
  override def generate(f: Docking_Access_Supervisor.DecisionContext_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDecisionContext_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingAccessResult(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingAccessResult] {
  override def generate(f: Docking_Access_Supervisor.DockingAccessResult => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingAccessResult())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingAccessResult_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingAccessResult_Payload] {
  override def generate(f: Docking_Access_Supervisor.DockingAccessResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingAccessResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container] {
  override def generate(f: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container] {
  override def generate(f: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container] {
  override def generate(f: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container] {
  override def generate(f: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingDecisionFrame(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingDecisionFrame] {
  override def generate(f: Docking_Access_Supervisor.DockingDecisionFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingDecisionFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingDecisionFrame_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingDecisionFrame_Payload] {
  override def generate(f: Docking_Access_Supervisor.DockingDecisionFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingDecisionFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container] {
  override def generate(f: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container] {
  override def generate(f: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingOutcomeType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingOutcome.Type] {
  override def generate(f: Docking_Access_Supervisor.DockingOutcome.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingOutcomeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingOutcome_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingOutcome_Payload] {
  override def generate(f: Docking_Access_Supervisor.DockingOutcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingOutcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingProposal(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingProposal] {
  override def generate(f: Docking_Access_Supervisor.DockingProposal => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingProposal())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorDockingProposal_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.DockingProposal_Payload] {
  override def generate(f: Docking_Access_Supervisor.DockingProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorDockingProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorGateDirectiveType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.GateDirective.Type] {
  override def generate(f: Docking_Access_Supervisor.GateDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorGateDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorGateDirective_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.GateDirective_Payload] {
  override def generate(f: Docking_Access_Supervisor.GateDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorGateDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorGateSafetyFrame(param: RandomLibI) extends MJen[Docking_Access_Supervisor.GateSafetyFrame] {
  override def generate(f: Docking_Access_Supervisor.GateSafetyFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorGateSafetyFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorGateSafetyFrame_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.GateSafetyFrame_Payload] {
  override def generate(f: Docking_Access_Supervisor.GateSafetyFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorGateSafetyFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorGateStateType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.GateState.Type] {
  override def generate(f: Docking_Access_Supervisor.GateState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorGateStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorGateState_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.GateState_Payload] {
  override def generate(f: Docking_Access_Supervisor.GateState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorGateState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorLifecycleDirectiveType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.LifecycleDirective.Type] {
  override def generate(f: Docking_Access_Supervisor.LifecycleDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorLifecycleDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorLifecycleDirective_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.LifecycleDirective_Payload] {
  override def generate(f: Docking_Access_Supervisor.LifecycleDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorLifecycleDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorLifecycleStateType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.LifecycleState.Type] {
  override def generate(f: Docking_Access_Supervisor.LifecycleState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorLifecycleStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorLifecycleState_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.LifecycleState_Payload] {
  override def generate(f: Docking_Access_Supervisor.LifecycleState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorLifecycleState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorPriorLifecycleView(param: RandomLibI) extends MJen[Docking_Access_Supervisor.PriorLifecycleView] {
  override def generate(f: Docking_Access_Supervisor.PriorLifecycleView => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorPriorLifecycleView())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorPriorLifecycleView_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.PriorLifecycleView_Payload] {
  override def generate(f: Docking_Access_Supervisor.PriorLifecycleView_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorPriorLifecycleView_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorPriorityDirective(param: RandomLibI) extends MJen[Docking_Access_Supervisor.PriorityDirective] {
  override def generate(f: Docking_Access_Supervisor.PriorityDirective => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorPriorityDirective())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorPriorityDirective_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.PriorityDirective_Payload] {
  override def generate(f: Docking_Access_Supervisor.PriorityDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorPriorityDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorPriorityKindType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.PriorityKind.Type] {
  override def generate(f: Docking_Access_Supervisor.PriorityKind.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorPriorityKindType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorPriorityKind_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.PriorityKind_Payload] {
  override def generate(f: Docking_Access_Supervisor.PriorityKind_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorPriorityKind_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorPublicModeType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.PublicMode.Type] {
  override def generate(f: Docking_Access_Supervisor.PublicMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorPublicModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorPublicMode_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.PublicMode_Payload] {
  override def generate(f: Docking_Access_Supervisor.PublicMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorPublicMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRecoveryIntentType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RecoveryIntent.Type] {
  override def generate(f: Docking_Access_Supervisor.RecoveryIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRecoveryIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRecoveryIntent_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RecoveryIntent_Payload] {
  override def generate(f: Docking_Access_Supervisor.RecoveryIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRecoveryIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRecoveryStateType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RecoveryState.Type] {
  override def generate(f: Docking_Access_Supervisor.RecoveryState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRecoveryStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRecoveryState_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RecoveryState_Payload] {
  override def generate(f: Docking_Access_Supervisor.RecoveryState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRecoveryState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container] {
  override def generate(f: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container] {
  override def generate(f: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRecoveryTransition(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RecoveryTransition] {
  override def generate(f: Docking_Access_Supervisor.RecoveryTransition => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRecoveryTransition())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRecoveryTransition_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RecoveryTransition_Payload] {
  override def generate(f: Docking_Access_Supervisor.RecoveryTransition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRecoveryTransition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container] {
  override def generate(f: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container] {
  override def generate(f: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container] {
  override def generate(f: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container] {
  override def generate(f: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestDispositionType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestDisposition.Type] {
  override def generate(f: Docking_Access_Supervisor.RequestDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestDisposition_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestDisposition_Payload] {
  override def generate(f: Docking_Access_Supervisor.RequestDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestFacts(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestFacts] {
  override def generate(f: Docking_Access_Supervisor.RequestFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestFacts_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestFacts_Payload] {
  override def generate(f: Docking_Access_Supervisor.RequestFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestOperationType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestOperation.Type] {
  override def generate(f: Docking_Access_Supervisor.RequestOperation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestOperationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorRequestOperation_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.RequestOperation_Payload] {
  override def generate(f: Docking_Access_Supervisor.RequestOperation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorRequestOperation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container] {
  override def generate(f: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container] {
  override def generate(f: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container] {
  override def generate(f: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container] {
  override def generate(f: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceActivityType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceActivity.Type] {
  override def generate(f: Docking_Access_Supervisor.ServiceActivity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceActivityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceActivity_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceActivity_Payload] {
  override def generate(f: Docking_Access_Supervisor.ServiceActivity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceActivity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container] {
  override def generate(f: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container] {
  override def generate(f: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceClassType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceClass.Type] {
  override def generate(f: Docking_Access_Supervisor.ServiceClass.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceClass_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceClass_Payload] {
  override def generate(f: Docking_Access_Supervisor.ServiceClass_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceClass_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceFacts(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceFacts] {
  override def generate(f: Docking_Access_Supervisor.ServiceFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorServiceFacts_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.ServiceFacts_Payload] {
  override def generate(f: Docking_Access_Supervisor.ServiceFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorServiceFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorStationFacts(param: RandomLibI) extends MJen[Docking_Access_Supervisor.StationFacts] {
  override def generate(f: Docking_Access_Supervisor.StationFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorStationFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorStationFacts_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.StationFacts_Payload] {
  override def generate(f: Docking_Access_Supervisor.StationFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorStationFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorStationProgressType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.StationProgress.Type] {
  override def generate(f: Docking_Access_Supervisor.StationProgress.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorStationProgressType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorStationProgress_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.StationProgress_Payload] {
  override def generate(f: Docking_Access_Supervisor.StationProgress_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorStationProgress_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorStationReportType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.StationReport.Type] {
  override def generate(f: Docking_Access_Supervisor.StationReport.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorStationReportType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorStationReport_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.StationReport_Payload] {
  override def generate(f: Docking_Access_Supervisor.StationReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorStationReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container] {
  override def generate(f: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container] {
  override def generate(f: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorSupervisoryActionType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.SupervisoryAction.Type] {
  override def generate(f: Docking_Access_Supervisor.SupervisoryAction.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorSupervisoryActionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorSupervisoryAction_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.SupervisoryAction_Payload] {
  override def generate(f: Docking_Access_Supervisor.SupervisoryAction_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorSupervisoryAction_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container] {
  override def generate(f: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container] {
  override def generate(f: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorUndockingProposal(param: RandomLibI) extends MJen[Docking_Access_Supervisor.UndockingProposal] {
  override def generate(f: Docking_Access_Supervisor.UndockingProposal => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorUndockingProposal())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorUndockingProposal_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.UndockingProposal_Payload] {
  override def generate(f: Docking_Access_Supervisor.UndockingProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorUndockingProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorVesselClassType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.VesselClass.Type] {
  override def generate(f: Docking_Access_Supervisor.VesselClass.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorVesselClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorVesselClass_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.VesselClass_Payload] {
  override def generate(f: Docking_Access_Supervisor.VesselClass_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorVesselClass_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorVesselFacts(param: RandomLibI) extends MJen[Docking_Access_Supervisor.VesselFacts] {
  override def generate(f: Docking_Access_Supervisor.VesselFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorVesselFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorVesselFacts_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.VesselFacts_Payload] {
  override def generate(f: Docking_Access_Supervisor.VesselFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorVesselFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorVesselStatusType(param: RandomLibI) extends MJen[Docking_Access_Supervisor.VesselStatus.Type] {
  override def generate(f: Docking_Access_Supervisor.VesselStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorVesselStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorVesselStatus_Payload(param: RandomLibI) extends MJen[Docking_Access_Supervisor.VesselStatus_Payload] {
  override def generate(f: Docking_Access_Supervisor.VesselStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorVesselStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container] {
  override def generate(f: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container(param: RandomLibI) extends MJen[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container] {
  override def generate(f: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(param: RandomLibI) extends MJen[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P] {
  override def generate(f: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS] {
  override def generate(f: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS())

      if (!continue) {
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


