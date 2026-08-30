// #Sireum

package mining_cargo_transfer_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

OffloadRequestEvent.scala

InputStatus.scala

QualifiedRequest.scala

DockingObservation.scala

DockingAssessment.scala

ShipTransferProgress.scala

QualifiedShipProgress.scala

WarehouseReceiptEvidence.scala

QualifiedWarehouseEvidence.scala

TransferPhase.scala

TransferDisposition.scala

CargoTransferCommand.scala

TransferSupervisorStatus.scala

TransferVerificationFinding.scala

OffloadRequestSample.scala

DockingSample.scala

ShipTransferSample.scala

WarehouseReceiptSample.scala

TransferResolution.scala

Base_Types.scala

RequestQualification_supervisionProcess_requestQualification_Containers.scala

DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_Containers.scala

ShipProgressQualification_supervisionProcess_shipProgressQualification_Containers.scala

WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_Containers.scala

TransferDecisionOwner_supervisionProcess_transferDecisionOwner_Containers.scala

TransferCommandDerivation_supervisionProcess_transferCommandDerivation_Containers.scala

TransferReportDerivation_supervisionProcess_transferReportDerivation_Containers.scala

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

@record class Gen_Mining_Cargo_Transfer_SupervisorCargoTransferCommandType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.Type] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorCargoTransferCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorDockingAssessmentType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorDockingAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorDockingAssessment_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorDockingAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorDockingObservationType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.DockingObservation.Type] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.DockingObservation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorDockingObservationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorDockingObservation_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorDockingObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorDockingSample(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.DockingSample] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.DockingSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorDockingSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorDockingSample_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.DockingSample_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.DockingSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorDockingSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorInputStatusType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.InputStatus.Type] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.InputStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorInputStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorInputStatus_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.InputStatus_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.InputStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorInputStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorOffloadRequestEventType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent.Type] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorOffloadRequestEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorOffloadRequestSample(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.OffloadRequestSample] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorOffloadRequestSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorQualifiedRequestType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorQualifiedRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorQualifiedShipProgressType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorQualifiedShipProgressType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorShipTransferProgressType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.Type] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorShipTransferProgressType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorShipTransferSample(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.ShipTransferSample] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.ShipTransferSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorShipTransferSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorShipTransferSample_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorShipTransferSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferDispositionType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferDisposition.Type] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferDisposition_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferPhaseType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferPhase.Type] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferPhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferPhase_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferPhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferResolution(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferResolution] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferResolution => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferResolution())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferResolution_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferResolution_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferSupervisorStatusType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.Type] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferVerificationFindingType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.Type] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferVerificationFindingType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceType(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence.Type] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorWarehouseReceiptSample(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorWarehouseReceiptSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(param: RandomLibI) extends MJen[Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload] {
  override def generate(f: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload())

      if (!continue) {
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


