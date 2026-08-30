// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

TransferRequest.scala

RequestKind.scala

Correlation.scala

DockContext.scala

DockReason.scala

ShipReport.scala

ShipReportClass.scala

ShipReportValue.scala

WarehouseReport.scala

WarehouseReportClass.scala

WarehouseReportValue.scala

SessionState.scala

FaultTrigger.scala

OrdinaryInhibition.scala

RequestDisposition.scala

RequestLedger.scala

ControlEvent.scala

RecoveryState.scala

ShipEvidenceState.scala

WarehouseEvidenceState.scala

RecoveryIntent.scala

ProgressClass.scala

TransferOutcome.scala

ShipUpdate.scala

WarehouseUpdate.scala

PriorityKind.scala

ProposalKind.scala

TransferAction.scala

DecisionCause.scala

DecisionOutcomeValue.scala

CoordinationMode.scala

PublicRequestDisposition.scala

PublicTransferOutcome.scala

RequestFacts.scala

DockFacts.scala

ShipReportFacts.scala

WarehouseReportFacts.scala

SessionView.scala

CoordinationGuard.scala

AdmissionDecision.scala

RecoveryTransition.scala

CoordinationFrame.scala

PriorityDirective.scala

ActionProposal.scala

TransferDecision.scala

TransferCoordinationResult.scala

Base_Types.scala

RequestAcquisition_cargo_coordination_process_request_acquisition_Containers.scala

DockContextAssessment_cargo_coordination_process_dock_context_assessment_Containers.scala

ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_Containers.scala

WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_Containers.scala

RequestAdmission_cargo_coordination_process_request_admission_Containers.scala

EvidenceCoherence_cargo_coordination_process_evidence_coherence_Containers.scala

TransferSession_cargo_coordination_process_transfer_session_Containers.scala

ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_Containers.scala

WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_Containers.scala

RecoverySupervisor_cargo_coordination_process_recovery_supervisor_Containers.scala

RequestActionEligibility_cargo_coordination_process_request_action_eligibility_Containers.scala

ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_Containers.scala

WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_Containers.scala

TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_Containers.scala

ResultComposition_cargo_coordination_process_result_composition_Containers.scala

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

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorActionProposal(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorActionProposal())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorControlEventType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorControlEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDockContextType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDockContextType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDockFacts(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDockFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDockReasonType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDockReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorPriorityKindType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorPriorityKindType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorProgressClassType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorProgressClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorProposalKindType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorProposalKindType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestKindType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorSessionStateType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorSessionStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorSessionView(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.SessionView] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.SessionView => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorSessionView())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipReportType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportClassType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipReportClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportValueType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipReportValueType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.Type] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS())

      if (!continue) {
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


