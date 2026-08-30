// #Sireum

package vehicle_start_readiness_recovery_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

RequestDisposition.scala

BrakeObservation.scala

ThermalCondition.scala

MaintenanceCondition.scala

HealthQualification.scala

PowerObservation.scala

SelfTestObservation.scala

TestCycleDirective.scala

CycleAssessment.scala

StartDecision.scala

LifecycleDirectiveSnapshot.scala

LifecyclePreMode.scala

LifecycleMode.scala

LifecycleReason.scala

StartEnable.scala

ParkingBrakeCommand.scala

PowerDisposition.scala

SelfTestCommand.scala

ControlLifecycleMode.scala

SupervisoryStatus.scala

RequestLevels.scala

BrakeFacts.scala

PowerFacts.scala

RequestFacts.scala

HealthObservation.scala

StartAuthorizationFacts.scala

AppliedLifecycleSnapshot.scala

ControlFrame.scala

Base_Types.scala

RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_Containers.scala

BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_Containers.scala

HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_Containers.scala

PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_Containers.scala

SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_Containers.scala

StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_Containers.scala

LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_Containers.scala

CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_Containers.scala

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

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorControlFrame(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorControlFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorHealthObservation(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorHealthObservation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorPowerDispositionType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorPowerDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorPowerFacts(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorPowerFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorPowerObservationType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorRequestDispositionType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorRequestDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorRequestFacts(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorRequestFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorRequestLevels(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorRequestLevels())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorStartDecisionType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorStartDecisionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorStartEnableType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorStartEnableType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorThermalConditionType(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition.Type] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorThermalConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(param: RandomLibI) extends MJen[Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload] {
  override def generate(f: Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload())

      if (!continue) {
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


