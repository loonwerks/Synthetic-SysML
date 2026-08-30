// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

LifecycleEvent.scala

InputStatus.scala

LifecycleAssessment.scala

ConditionEvent.scala

ConditionAssessment.scala

CoordinationClass.scala

ControllerModeDisposition.scala

DecisionReason.scala

CoordinationResult.scala

LifecycleSample.scala

ConditionSample.scala

ModeDecision.scala

Base_Types.scala

LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_Containers.scala

ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_Containers.scala

CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_Containers.scala

ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_Containers.scala

CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_Containers.scala

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

@record class Gen_Vehicle_Controller_Mode_CoordinatorConditionAssessmentType(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorConditionAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorConditionEventType(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ConditionEvent.Type] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ConditionEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorConditionEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorConditionEvent_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorConditionEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorConditionSample(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ConditionSample] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ConditionSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorConditionSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorConditionSample_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorConditionSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorControllerModeDispositionType(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorControllerModeDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCoordinationClassType(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCoordinationClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCoordinationResultType(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CoordinationResult.Type] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CoordinationResult.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCoordinationResultType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorDecisionReasonType(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.DecisionReason.Type] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.DecisionReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorDecisionReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorDecisionReason_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorDecisionReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorInputStatusType(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.InputStatus.Type] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.InputStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorInputStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorInputStatus_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.InputStatus_Payload] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.InputStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorInputStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorLifecycleEventType(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.LifecycleEvent.Type] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.LifecycleEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorLifecycleEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorLifecycleSample(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.LifecycleSample] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.LifecycleSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorLifecycleSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorModeDecision(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ModeDecision] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ModeDecision => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorModeDecision())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Controller_Mode_CoordinatorModeDecision_Payload(param: RandomLibI) extends MJen[Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload] {
  override def generate(f: Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Controller_Mode_CoordinatorModeDecision_Payload())

      if (!continue) {
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


