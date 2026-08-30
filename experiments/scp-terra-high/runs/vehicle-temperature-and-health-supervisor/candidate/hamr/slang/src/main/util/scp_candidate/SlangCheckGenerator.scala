// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

TemperatureRelation.scala

InputStatus.scala

TemperatureAssessment.scala

MaintenanceTiming.scala

MaintenanceAssessment.scala

ReturnIndication.scala

RecoveryProposal.scala

VehicleHealthMode.scala

DecisionReason.scala

ElectricalPowerDisposition.scala

RecoveryGuidance.scala

TemperatureSample.scala

MaintenanceSample.scala

ReturnSample.scala

HealthDecision.scala

Base_Types.scala

TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_Containers.scala

MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_Containers.scala

RecoveryApplicability_supervisionProcess_recoveryApplicability_Containers.scala

HealthModeArbitration_supervisionProcess_healthModeArbitration_Containers.scala

BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_Containers.scala

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

@record class Gen_Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorDecisionReasonType(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.DecisionReason.Type] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.DecisionReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorDecisionReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorDecisionReason_Payload(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorDecisionReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorElectricalPowerDispositionType(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.Type] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorHealthDecision(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.HealthDecision] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.HealthDecision => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorHealthDecision())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorHealthDecision_Payload(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorHealthDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorInputStatusType(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.InputStatus.Type] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.InputStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorInputStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorInputStatus_Payload(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.InputStatus_Payload] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.InputStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorInputStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorMaintenanceSample(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.MaintenanceSample] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.MaintenanceSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorMaintenanceSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorMaintenanceTimingType(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.MaintenanceTiming.Type] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.MaintenanceTiming.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorMaintenanceTimingType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorRecoveryGuidanceType(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.Type] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorRecoveryGuidanceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorRecoveryProposalType(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorRecoveryProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorReturnIndicationType(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.ReturnIndication.Type] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.ReturnIndication.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorReturnIndicationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorReturnIndication_Payload(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorReturnIndication_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorReturnSample(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.ReturnSample] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.ReturnSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorReturnSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorReturnSample_Payload(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorReturnSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorTemperatureAssessmentType(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorTemperatureAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorTemperatureRelationType(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.TemperatureRelation.Type] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.TemperatureRelation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorTemperatureRelationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorTemperatureSample(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.TemperatureSample] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.TemperatureSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorTemperatureSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorTemperatureSample_Payload(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorTemperatureSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorVehicleHealthModeType(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Type] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorVehicleHealthModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Vehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(param: RandomLibI) extends MJen[Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload] {
  override def generate(f: Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload())

      if (!continue) {
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


