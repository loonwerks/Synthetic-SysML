// #Sireum

package hvac_energy_interface_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

ClimateRequest.scala

ThermalRelation.scala

ComfortDemand.scala

DefrostRequest.scala

GlazingCondition.scala

VisibilityDemand.scala

ElectricalState.scala

PowerEnvelope.scala

EngineHeat.scala

EnergyCapability.scala

FreshRequest.scala

RecoveryDecision.scala

Service.scala

SelectionReason.scala

ResourceGrant.scala

FanPreference.scala

ThermalService.scala

AirPath.scala

Blower.scala

ActuationDisposition.scala

SupervisorStatus.scala

RecoveryState.scala

EnergyContext.scala

ServiceSelection.scala

PlantCommand.scala

Base_Types.scala

ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_Containers.scala

VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_Containers.scala

EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_Containers.scala

RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_Containers.scala

ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_Containers.scala

ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_Containers.scala

ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_Containers.scala

SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_Containers.scala

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

@record class Gen_HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorActuationDispositionType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorActuationDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorActuationDisposition_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorActuationDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorAirPathType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.AirPath.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.AirPath.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorAirPathType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorAirPath_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.AirPath_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.AirPath_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorAirPath_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorBlowerType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.Blower.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.Blower.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorBlowerType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorBlower_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.Blower_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.Blower_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorBlower_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorClimateRequestType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ClimateRequest.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ClimateRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorClimateRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorClimateRequest_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorClimateRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorComfortDemandType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ComfortDemand.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ComfortDemand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorComfortDemandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorComfortDemand_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorComfortDemand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorDefrostRequestType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.DefrostRequest.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.DefrostRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorDefrostRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorDefrostRequest_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorDefrostRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorElectricalStateType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ElectricalState.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ElectricalState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorElectricalStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorElectricalState_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ElectricalState_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ElectricalState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorElectricalState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorEnergyCapabilityType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.EnergyCapability.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.EnergyCapability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorEnergyCapabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorEnergyCapability_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorEnergyCapability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorEnergyContext(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.EnergyContext] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.EnergyContext => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorEnergyContext())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorEnergyContext_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.EnergyContext_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.EnergyContext_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorEnergyContext_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorEngineHeatType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.EngineHeat.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.EngineHeat.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorEngineHeatType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorEngineHeat_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.EngineHeat_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.EngineHeat_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorEngineHeat_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorFanPreferenceType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.FanPreference.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.FanPreference.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorFanPreferenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorFanPreference_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.FanPreference_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.FanPreference_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorFanPreference_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorFreshRequestType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.FreshRequest.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.FreshRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorFreshRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorFreshRequest_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.FreshRequest_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.FreshRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorFreshRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorGlazingConditionType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.GlazingCondition.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.GlazingCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorGlazingConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorGlazingCondition_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorGlazingCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorPlantCommand(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.PlantCommand] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.PlantCommand => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorPlantCommand())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorPlantCommand_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.PlantCommand_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.PlantCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorPlantCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorPowerEnvelopeType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.PowerEnvelope.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.PowerEnvelope.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorPowerEnvelopeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorRecoveryDecisionType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorRecoveryDecisionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorRecoveryStateType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.RecoveryState.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.RecoveryState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorRecoveryStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorRecoveryState_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.RecoveryState_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.RecoveryState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorRecoveryState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorResourceGrantType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ResourceGrant.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ResourceGrant.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorResourceGrantType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorResourceGrant_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorResourceGrant_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorSelectionReasonType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.SelectionReason.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.SelectionReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorSelectionReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorSelectionReason_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.SelectionReason_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.SelectionReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorSelectionReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorServiceType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.Service.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.Service.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorServiceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorService_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.Service_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.Service_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorService_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorServiceSelection(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ServiceSelection] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ServiceSelection => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorServiceSelection())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorServiceSelection_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorServiceSelection_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorSupervisorStatusType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.SupervisorStatus.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.SupervisorStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorSupervisorStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorThermalRelationType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ThermalRelation.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ThermalRelation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorThermalRelationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorThermalRelation_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorThermalRelation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorThermalServiceType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ThermalService.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ThermalService.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorThermalServiceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorThermalService_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.ThermalService_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.ThermalService_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorThermalService_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorVisibilityDemandType(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorVisibilityDemandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS] {
  override def generate(f: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS())

      if (!continue) {
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


