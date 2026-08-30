// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

StartIndicationLevel.scala

OnIndicationLevel.scala

OffIndicationLevel.scala

IndicationLevel.scala

ConflictClass.scala

SelectedIndication.scala

RecoveryDecision.scala

PriorOperatingDemand.scala

OperatingDemand.scala

PriorMaintenanceSession.scala

MaintenanceSession.scala

PriorDegradedEpisode.scala

DegradedEpisode.scala

ControllerMode.scala

TransitionReason.scala

BrakeDemand.scala

PublishedControllerMode.scala

ParkingBrakeCommand.scala

LifecycleIndications.scala

LifecycleEpochFacts.scala

MaintenanceEpochFacts.scala

DegradationEpochFacts.scala

ReturnEpochFacts.scala

MaintenanceIndication.scala

DegradedIndication.scala

ReturnIndication.scala

DemandSnapshot.scala

MaintenanceSnapshot.scala

EpisodeSnapshot.scala

ModeDecision.scala

CoordinationFrame.scala

Base_Types.scala

LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_Containers.scala

MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_Containers.scala

DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_Containers.scala

ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_Containers.scala

ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_Containers.scala

IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_Containers.scala

OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_Containers.scala

MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_Containers.scala

DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_Containers.scala

RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_Containers.scala

ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_Containers.scala

ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_Containers.scala

OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_Containers.scala

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

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorConflictClassType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorConflictClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorControllerModeType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorControllerModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorModeDecision(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorModeDecision())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorReturnIndication(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorReturnIndication())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorTransitionReasonType(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.Type] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorTransitionReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload] {
  override def generate(f: Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload())

      if (!continue) {
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


