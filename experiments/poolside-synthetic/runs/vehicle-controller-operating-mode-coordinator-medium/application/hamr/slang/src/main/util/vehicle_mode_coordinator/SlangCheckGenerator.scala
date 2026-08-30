// #Sireum

package vehicle_mode_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

ReportedCondition.scala

ReportCurrency.scala

ConditionAssessment.scala

SelectedIntent.scala

ControllerMode.scala

TransitionKind.scala

ParkingBrakeDisposition.scala

CoordinationStatus.scala

RecoveryTarget.scala

QualifiedTransition.scala

LifecycleLevels.scala

LifecycleFacts.scala

ServiceLevels.scala

ServiceFacts.scala

ConditionEvidence.scala

ArbitrationResult.scala

TransitionResolution.scala

CoordinationOutcome.scala

Base_Types.scala

LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_Containers.scala

ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_Containers.scala

ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_Containers.scala

IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_Containers.scala

CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_Containers.scala

RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_Containers.scala

TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_Containers.scala

ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_Containers.scala

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

@record class Gen_Vehicle_Mode_CoordinatorArbitrationResult(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ArbitrationResult] {
  override def generate(f: Vehicle_Mode_Coordinator.ArbitrationResult => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorArbitrationResult())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorArbitrationResult_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ArbitrationResult_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.ArbitrationResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorArbitrationResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorConditionAssessmentType(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ConditionAssessment.Type] {
  override def generate(f: Vehicle_Mode_Coordinator.ConditionAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorConditionAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorConditionAssessment_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ConditionAssessment_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.ConditionAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorConditionAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorConditionEvidence(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ConditionEvidence] {
  override def generate(f: Vehicle_Mode_Coordinator.ConditionEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorConditionEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorConditionEvidence_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ConditionEvidence_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.ConditionEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorConditionEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorControllerModeType(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ControllerMode.Type] {
  override def generate(f: Vehicle_Mode_Coordinator.ControllerMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorControllerModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorControllerMode_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ControllerMode_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.ControllerMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorControllerMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorCoordinationOutcome(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.CoordinationOutcome] {
  override def generate(f: Vehicle_Mode_Coordinator.CoordinationOutcome => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorCoordinationOutcome())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorCoordinationOutcome_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.CoordinationOutcome_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.CoordinationOutcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorCoordinationOutcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorCoordinationStatusType(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.CoordinationStatus.Type] {
  override def generate(f: Vehicle_Mode_Coordinator.CoordinationStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorCoordinationStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorCoordinationStatus_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.CoordinationStatus_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.CoordinationStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorCoordinationStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorLifecycleFacts(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.LifecycleFacts] {
  override def generate(f: Vehicle_Mode_Coordinator.LifecycleFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorLifecycleFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorLifecycleFacts_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.LifecycleFacts_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.LifecycleFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorLifecycleFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorLifecycleLevels(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.LifecycleLevels] {
  override def generate(f: Vehicle_Mode_Coordinator.LifecycleLevels => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorLifecycleLevels())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorLifecycleLevels_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.LifecycleLevels_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.LifecycleLevels_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorLifecycleLevels_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorParkingBrakeDispositionType(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ParkingBrakeDisposition.Type] {
  override def generate(f: Vehicle_Mode_Coordinator.ParkingBrakeDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorParkingBrakeDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorQualifiedTransitionType(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.QualifiedTransition.Type] {
  override def generate(f: Vehicle_Mode_Coordinator.QualifiedTransition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorQualifiedTransitionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorQualifiedTransition_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.QualifiedTransition_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.QualifiedTransition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorQualifiedTransition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorRecoveryTargetType(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.RecoveryTarget.Type] {
  override def generate(f: Vehicle_Mode_Coordinator.RecoveryTarget.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorRecoveryTargetType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorRecoveryTarget_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.RecoveryTarget_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.RecoveryTarget_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorRecoveryTarget_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorReportCurrencyType(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ReportCurrency.Type] {
  override def generate(f: Vehicle_Mode_Coordinator.ReportCurrency.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorReportCurrencyType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorReportCurrency_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ReportCurrency_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.ReportCurrency_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorReportCurrency_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorReportedConditionType(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ReportedCondition.Type] {
  override def generate(f: Vehicle_Mode_Coordinator.ReportedCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorReportedConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorReportedCondition_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ReportedCondition_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.ReportedCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorReportedCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorSelectedIntentType(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.SelectedIntent.Type] {
  override def generate(f: Vehicle_Mode_Coordinator.SelectedIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorSelectedIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorSelectedIntent_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.SelectedIntent_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.SelectedIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorSelectedIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorServiceFacts(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ServiceFacts] {
  override def generate(f: Vehicle_Mode_Coordinator.ServiceFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorServiceFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorServiceFacts_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ServiceFacts_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.ServiceFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorServiceFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorServiceLevels(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ServiceLevels] {
  override def generate(f: Vehicle_Mode_Coordinator.ServiceLevels => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorServiceLevels())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorServiceLevels_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.ServiceLevels_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.ServiceLevels_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorServiceLevels_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorTransitionKindType(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.TransitionKind.Type] {
  override def generate(f: Vehicle_Mode_Coordinator.TransitionKind.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorTransitionKindType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorTransitionKind_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.TransitionKind_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.TransitionKind_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorTransitionKind_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container] {
  override def generate(f: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P] {
  override def generate(f: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS] {
  override def generate(f: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorTransitionResolution(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.TransitionResolution] {
  override def generate(f: Vehicle_Mode_Coordinator.TransitionResolution => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorTransitionResolution())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Mode_CoordinatorTransitionResolution_Payload(param: RandomLibI) extends MJen[Vehicle_Mode_Coordinator.TransitionResolution_Payload] {
  override def generate(f: Vehicle_Mode_Coordinator.TransitionResolution_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Mode_CoordinatorTransitionResolution_Payload())

      if (!continue) {
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


