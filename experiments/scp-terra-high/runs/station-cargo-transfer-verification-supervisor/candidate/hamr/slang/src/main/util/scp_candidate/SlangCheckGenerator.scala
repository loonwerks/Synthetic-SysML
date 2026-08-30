// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

TransferRequest.scala

CargoState.scala

QualifiedRequest.scala

DockServiceCondition.scala

ServiceEligibility.scala

SessionState.scala

AdmittedDirective.scala

VerificationDisposition.scala

SessionExpectation.scala

CommandProposal.scala

SnapshotSessionState.scala

SnapshotSessionResult.scala

ShipTransferEvidence.scala

ShipFinding.scala

WarehouseReceiptEvidence.scala

WarehouseFinding.scala

ShipCommand.scala

WarehouseQuery.scala

PilotTransferReport.scala

StationTransferReport.scala

SessionSnapshot.scala

Base_Types.scala

RequestQualifier_supervisorProcess_requestQualifier_Containers.scala

ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_Containers.scala

PriorityArbiter_supervisorProcess_priorityArbiter_Containers.scala

SessionController_supervisorProcess_sessionController_Containers.scala

ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_Containers.scala

WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_Containers.scala

CompletionReconciler_supervisorProcess_completionReconciler_Containers.scala

CommandSafetyGate_supervisorProcess_commandSafetyGate_Containers.scala

OutcomeReporter_supervisorProcess_outcomeReporter_Containers.scala

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

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCargoStateType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CargoState.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CargoState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCargoStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCargoState_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCommandProposalType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCommandProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorDockServiceConditionType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorPilotTransferReportType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSessionExpectationType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSessionSnapshot(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSessionStateType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSessionStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSessionState_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorShipCommandType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorShipCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorShipFindingType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorShipFindingType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorStationTransferReportType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorTransferRequestType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorTransferRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorWarehouseQueryType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.Type] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Station_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(param: RandomLibI) extends MJen[Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload] {
  override def generate(f: Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload())

      if (!continue) {
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


