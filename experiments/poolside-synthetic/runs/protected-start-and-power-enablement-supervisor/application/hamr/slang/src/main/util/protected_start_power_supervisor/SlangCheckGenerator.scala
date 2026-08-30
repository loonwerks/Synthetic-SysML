// #Sireum

package protected_start_power_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Command.scala

Validity.scala

PedalCondition.scala

TemperatureBand.scala

QualifiedTemperature.scala

SupplyAvailability.scala

ParkingBrakeCondition.scala

ThermalState.scala

SelfTestProgress.scala

SelfTestState.scala

Session.scala

SessionCause.scala

RearmState.scala

FuelDisposition.scala

ElectricalDisposition.scala

ParkingBrakeDisposition.scala

Notice.scala

CommandReport.scala

QualifiedCommandFacts.scala

QualifiedPedalFacts.scala

QualifiedSupplyFacts.scala

QualifiedParkingBrakeFacts.scala

StartRestraintFact.scala

ReadinessFacts.scala

ExactFaultSummary.scala

RecoveryPermitFact.scala

BrakePedalReport.scala

TemperatureReport.scala

ElectricalPowerReport.scala

ParkingBrakeReport.scala

ThermalStateFacts.scala

SelfTestReport.scala

SelfTestStateFacts.scala

SessionDecisionFacts.scala

RearmStateFacts.scala

ActuationDisposition.scala

SupervisoryStatus.scala

Base_Types.scala

CommandQualificationOwner_protected_start_power_process_command_qualification_owner_Containers.scala

BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_Containers.scala

TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_Containers.scala

ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_Containers.scala

ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_Containers.scala

ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_Containers.scala

SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_Containers.scala

StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_Containers.scala

ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_Containers.scala

OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_Containers.scala

FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_Containers.scala

RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_Containers.scala

ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_Containers.scala

SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_Containers.scala

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

@record class Gen_Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorActuationDisposition(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ActuationDisposition] {
  override def generate(f: Protected_Start_Power_Supervisor.ActuationDisposition => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorActuationDisposition())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorActuationDisposition_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ActuationDisposition_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.ActuationDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorActuationDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorBrakePedalReport(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.BrakePedalReport] {
  override def generate(f: Protected_Start_Power_Supervisor.BrakePedalReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorBrakePedalReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorBrakePedalReport_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.BrakePedalReport_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.BrakePedalReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorBrakePedalReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorCommandType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.Command.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.Command.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorCommand_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.Command_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.Command_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorCommandReport(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.CommandReport] {
  override def generate(f: Protected_Start_Power_Supervisor.CommandReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorCommandReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorCommandReport_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.CommandReport_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.CommandReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorCommandReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorElectricalDispositionType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ElectricalDisposition.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.ElectricalDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorElectricalDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorElectricalDisposition_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ElectricalDisposition_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.ElectricalDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorElectricalDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorElectricalPowerReport(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ElectricalPowerReport] {
  override def generate(f: Protected_Start_Power_Supervisor.ElectricalPowerReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorElectricalPowerReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorElectricalPowerReport_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorElectricalPowerReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorExactFaultSummary(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ExactFaultSummary] {
  override def generate(f: Protected_Start_Power_Supervisor.ExactFaultSummary => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorExactFaultSummary())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorExactFaultSummary_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ExactFaultSummary_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.ExactFaultSummary_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorExactFaultSummary_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorFuelDispositionType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.FuelDisposition.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.FuelDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorFuelDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorFuelDisposition_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.FuelDisposition_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.FuelDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorFuelDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorNoticeType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.Notice.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.Notice.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorNoticeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorNotice_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.Notice_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.Notice_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorNotice_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorParkingBrakeConditionType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ParkingBrakeCondition.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.ParkingBrakeCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorParkingBrakeConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorParkingBrakeCondition_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorParkingBrakeCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorParkingBrakeDispositionType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ParkingBrakeDisposition.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.ParkingBrakeDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorParkingBrakeDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorParkingBrakeDisposition_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorParkingBrakeReport(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ParkingBrakeReport] {
  override def generate(f: Protected_Start_Power_Supervisor.ParkingBrakeReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorParkingBrakeReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorParkingBrakeReport_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorParkingBrakeReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorPedalConditionType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.PedalCondition.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.PedalCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorPedalConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorPedalCondition_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.PedalCondition_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.PedalCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorPedalCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorQualifiedCommandFacts(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.QualifiedCommandFacts] {
  override def generate(f: Protected_Start_Power_Supervisor.QualifiedCommandFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorQualifiedCommandFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorQualifiedCommandFacts_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorQualifiedParkingBrakeFacts(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts] {
  override def generate(f: Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorQualifiedPedalFacts(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.QualifiedPedalFacts] {
  override def generate(f: Protected_Start_Power_Supervisor.QualifiedPedalFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorQualifiedPedalFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorQualifiedPedalFacts_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorQualifiedSupplyFacts(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.QualifiedSupplyFacts] {
  override def generate(f: Protected_Start_Power_Supervisor.QualifiedSupplyFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorQualifiedSupplyFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorQualifiedTemperatureType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.QualifiedTemperature.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.QualifiedTemperature.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorQualifiedTemperatureType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorQualifiedTemperature_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.QualifiedTemperature_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.QualifiedTemperature_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorQualifiedTemperature_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorReadinessFacts(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ReadinessFacts] {
  override def generate(f: Protected_Start_Power_Supervisor.ReadinessFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorReadinessFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorReadinessFacts_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ReadinessFacts_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.ReadinessFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorReadinessFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorRearmStateType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.RearmState.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.RearmState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorRearmStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorRearmState_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.RearmState_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.RearmState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorRearmState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorRearmStateFacts(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.RearmStateFacts] {
  override def generate(f: Protected_Start_Power_Supervisor.RearmStateFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorRearmStateFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorRearmStateFacts_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.RearmStateFacts_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.RearmStateFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorRearmStateFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorRecoveryPermitFact(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.RecoveryPermitFact] {
  override def generate(f: Protected_Start_Power_Supervisor.RecoveryPermitFact => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorRecoveryPermitFact())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorRecoveryPermitFact_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorRecoveryPermitFact_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSelfTestProgressType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SelfTestProgress.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.SelfTestProgress.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSelfTestProgressType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSelfTestProgress_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SelfTestProgress_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.SelfTestProgress_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSelfTestProgress_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSelfTestReport(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SelfTestReport] {
  override def generate(f: Protected_Start_Power_Supervisor.SelfTestReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSelfTestReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSelfTestReport_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SelfTestReport_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.SelfTestReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSelfTestReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSelfTestStateType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SelfTestState.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.SelfTestState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSelfTestStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSelfTestState_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SelfTestState_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.SelfTestState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSelfTestState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSelfTestStateFacts(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SelfTestStateFacts] {
  override def generate(f: Protected_Start_Power_Supervisor.SelfTestStateFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSelfTestStateFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSelfTestStateFacts_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSelfTestStateFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSessionType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.Session.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.Session.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSessionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSession_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.Session_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.Session_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSession_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSessionCauseType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SessionCause.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.SessionCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSessionCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSessionCause_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SessionCause_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.SessionCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSessionCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSessionDecisionFacts(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SessionDecisionFacts] {
  override def generate(f: Protected_Start_Power_Supervisor.SessionDecisionFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSessionDecisionFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSessionDecisionFacts_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSessionDecisionFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorStartRestraintFact(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.StartRestraintFact] {
  override def generate(f: Protected_Start_Power_Supervisor.StartRestraintFact => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorStartRestraintFact())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorStartRestraintFact_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.StartRestraintFact_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.StartRestraintFact_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorStartRestraintFact_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSupervisoryStatus(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SupervisoryStatus] {
  override def generate(f: Protected_Start_Power_Supervisor.SupervisoryStatus => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSupervisoryStatus())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSupervisoryStatus_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SupervisoryStatus_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.SupervisoryStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSupervisoryStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSupplyAvailabilityType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SupplyAvailability.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.SupplyAvailability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSupplyAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorSupplyAvailability_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.SupplyAvailability_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.SupplyAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorSupplyAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorTemperatureBandType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.TemperatureBand.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.TemperatureBand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorTemperatureBandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorTemperatureBand_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.TemperatureBand_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.TemperatureBand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorTemperatureBand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorTemperatureReport(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.TemperatureReport] {
  override def generate(f: Protected_Start_Power_Supervisor.TemperatureReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorTemperatureReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorTemperatureReport_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.TemperatureReport_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.TemperatureReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorTemperatureReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container] {
  override def generate(f: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P] {
  override def generate(f: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS] {
  override def generate(f: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorThermalStateType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ThermalState.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.ThermalState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorThermalStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorThermalState_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ThermalState_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.ThermalState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorThermalState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorThermalStateFacts(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ThermalStateFacts] {
  override def generate(f: Protected_Start_Power_Supervisor.ThermalStateFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorThermalStateFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorThermalStateFacts_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.ThermalStateFacts_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.ThermalStateFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorThermalStateFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorValidityType(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.Validity.Type] {
  override def generate(f: Protected_Start_Power_Supervisor.Validity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Protected_Start_Power_SupervisorValidity_Payload(param: RandomLibI) extends MJen[Protected_Start_Power_Supervisor.Validity_Payload] {
  override def generate(f: Protected_Start_Power_Supervisor.Validity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextProtected_Start_Power_SupervisorValidity_Payload())

      if (!continue) {
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


