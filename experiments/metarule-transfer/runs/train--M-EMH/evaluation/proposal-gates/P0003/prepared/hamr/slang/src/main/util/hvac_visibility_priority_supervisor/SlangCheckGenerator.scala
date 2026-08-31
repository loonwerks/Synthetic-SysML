// #Sireum

package hvac_visibility_priority_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Validity.scala

Arrival.scala

EnableIntent.scala

DefrostIntent.scala

ThermalBand.scala

FanIntent.scala

RequestClass.scala

CabinBand.scala

ThermalNeed.scala

ThermalObservationValidity.scala

GlazingCondition.scala

VisibilityNeed.scala

VisibilityCriticality.scala

HumidityCondition.scala

HumidityNeed.scala

AirCondition.scala

AirNeed.scala

InterfaceState.scala

Budget.scala

ElectricalTier.scala

ElectricalCause.scala

ElectricalCriticality.scala

Availability.scala

WasteHeatEligibility.scala

BlowerReadiness.scala

ThermalReadiness.scala

ClearingReadiness.scala

AirTreatmentReadiness.scala

EquipmentCriticality.scala

ThermalBlowerAvailability.scala

ThermalEquipmentAvailability.scala

VisibilityBlowerAvailability.scala

ClearingAvailability.scala

AirTreatmentAvailability.scala

RecoveryState.scala

RecoveryEvent.scala

RecoveryCause.scala

Service.scala

HeatSource.scala

ThermalProposalAvailability.scala

ThermalDegradation.scala

VisibilityProposalAvailability.scala

ProposalUrgency.scala

CabinAirProposalAvailability.scala

HumidityDegradation.scala

AirDegradation.scala

SelectionCause.scala

SelectionMode.scala

Authorization.scala

ArbitrationMode.scala

ArbitrationCause.scala

NoncriticalCause.scala

Intensity.scala

EnergyTier.scala

CandidateCause.scala

RecoveryAcknowledgment.scala

SupervisorMode.scala

StatusCause.scala

UserClimateRequest.scala

QualifiedTarget.scala

QualifiedRequest.scala

CabinThermalObservation.scala

ThermalAssessment.scala

GlazingObservation.scala

HumidityObservation.scala

AirQualityObservation.scala

ElectricalAvailability.scala

ElectricalEligibility.scala

WasteHeatAvailability.scala

EquipmentReadiness.scala

ThermalPathReadiness.scala

VisibilityPathReadiness.scala

AirPathReadiness.scala

RecoveryReport.scala

ThermalProposal.scala

VisibilityProposal.scala

CabinAirProposal.scala

SelectedIntent.scala

ArbitrationStatus.scala

CabinActuationPlan.scala

SupervisorStatus.scala

CandidatePlan.scala

Base_Types.scala

RequestQualifier_supervision_requestQualifier_Containers.scala

ThermalNeedAssessor_supervision_thermalNeedAssessor_Containers.scala

VisibilityNeedAssessor_supervision_visibilityNeedAssessor_Containers.scala

HumidityNeedAssessor_supervision_humidityNeedAssessor_Containers.scala

AirQualityNeedAssessor_supervision_airQualityNeedAssessor_Containers.scala

ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_Containers.scala

WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_Containers.scala

EquipmentFaultAssessor_supervision_equipmentFaultAssessor_Containers.scala

PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_Containers.scala

ThermalServiceProposer_supervision_thermalServiceProposer_Containers.scala

VisibilityServiceProposer_supervision_visibilityServiceProposer_Containers.scala

CabinAirServiceProposer_supervision_cabinAirServiceProposer_Containers.scala

EnergySafePlanComposer_supervision_energySafePlanComposer_Containers.scala

CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_Containers.scala

AtomicResultPublisher_supervision_atomicResultPublisher_Containers.scala

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

@record class Gen_HVAC_Visibility_Priority_SupervisorAirConditionType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirCondition.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirCondition_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirCondition_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirDegradationType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirDegradation.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirDegradation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirDegradationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirDegradation_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirDegradation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirDegradation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirNeedType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirNeed.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirNeed.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirNeedType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirNeed_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirNeed_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirNeed_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirNeed_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirPathReadiness(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirPathReadiness] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirPathReadiness => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirPathReadiness())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirPathReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirPathReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirQualityNeedAssessor_supervision_airQualityNeedAssessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirQualityObservation(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirQualityObservation] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirQualityObservation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirQualityObservation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirQualityObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirQualityObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirTreatmentAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirTreatmentAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirTreatmentReadinessType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirTreatmentReadinessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAirTreatmentReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorArbitrationCauseType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ArbitrationCause.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ArbitrationCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorArbitrationCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorArbitrationCause_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ArbitrationCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorArbitrationCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorArbitrationModeType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorArbitrationModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorArbitrationMode_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ArbitrationMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorArbitrationMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorArbitrationStatus(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ArbitrationStatus] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ArbitrationStatus => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorArbitrationStatus())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ArbitrationStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorArbitrationStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorArrivalType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.Arrival.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.Arrival.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorArrivalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorArrival_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.Arrival_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.Arrival_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorArrival_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.AtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAtomicResultPublisher_supervision_atomicResultPublisher_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAuthorizationType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.Authorization.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.Authorization.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAuthorizationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAuthorization_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.Authorization_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.Authorization_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAuthorization_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAvailabilityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.Availability.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.Availability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorAvailability_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.Availability_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.Availability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorBlowerReadinessType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.BlowerReadiness.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.BlowerReadiness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorBlowerReadinessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.BlowerReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorBlowerReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorBudgetType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.Budget.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.Budget.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorBudgetType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorBudget_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.Budget_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.Budget_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorBudget_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinActuationPlan(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinActuationPlan] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinActuationPlan => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinActuationPlan())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinActuationPlan_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinActuationPlan_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinAirProposal(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinAirProposal] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinAirProposal => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinAirProposal())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinAirProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinAirProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinAirProposalAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinAirServiceProposer_supervision_cabinAirServiceProposer_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinBandType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinBand.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinBand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinBandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinBand_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinBand_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinBand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinBand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinThermalObservation(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinThermalObservation] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinThermalObservation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinThermalObservation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CabinThermalObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCabinThermalObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCandidateCauseType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CandidateCause.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CandidateCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCandidateCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCandidateCause_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CandidateCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCandidateCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCandidatePlan(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CandidatePlan] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CandidatePlan => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCandidatePlan())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCandidatePlan_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CandidatePlan_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCandidatePlan_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorClearingAvailabilityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ClearingAvailability.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ClearingAvailability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorClearingAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorClearingAvailability_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ClearingAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorClearingAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorClearingReadinessType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ClearingReadiness.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ClearingReadiness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorClearingReadinessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorClearingReadiness_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ClearingReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorClearingReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorCriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorDefrostIntentType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.DefrostIntent.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.DefrostIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorDefrostIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorDefrostIntent_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.DefrostIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorDefrostIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalAvailability(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalAvailability] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalAvailability => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalAvailability())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalCauseType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalCause.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalCause_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalCriticalityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalCriticalityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalCriticality_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalCriticality_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalEligibility(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalEligibility] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalEligibility => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalEligibility())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalEligibility_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalEligibility_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalEligibilityOwner_supervision_electricalEligibilityOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalTierType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalTier.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalTier.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalTierType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorElectricalTier_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ElectricalTier_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorElectricalTier_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEnableIntentType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EnableIntent.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EnableIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEnableIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEnableIntent_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EnableIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEnableIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEnergySafePlanComposer_supervision_energySafePlanComposer_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEnergyTierType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EnergyTier.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EnergyTier.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEnergyTierType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEnergyTier_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EnergyTier_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEnergyTier_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEquipmentCriticalityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEquipmentCriticalityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EquipmentCriticality_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEquipmentCriticality_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEquipmentFaultAssessor_supervision_equipmentFaultAssessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEquipmentReadiness(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EquipmentReadiness] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EquipmentReadiness => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEquipmentReadiness())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.EquipmentReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorEquipmentReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorFanIntentType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.FanIntent.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.FanIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorFanIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorFanIntent_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.FanIntent_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.FanIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorFanIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorGlazingConditionType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.GlazingCondition.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.GlazingCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorGlazingConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorGlazingCondition_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.GlazingCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorGlazingCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorGlazingObservation(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.GlazingObservation] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.GlazingObservation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorGlazingObservation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorGlazingObservation_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.GlazingObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorGlazingObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHeatSourceType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HeatSource.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HeatSource.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHeatSourceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHeatSource_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HeatSource_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HeatSource_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHeatSource_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHumidityConditionType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HumidityCondition.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HumidityCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHumidityConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHumidityCondition_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HumidityCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHumidityCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHumidityDegradationType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HumidityDegradation.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HumidityDegradation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHumidityDegradationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HumidityDegradation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHumidityDegradation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHumidityNeedType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HumidityNeed.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HumidityNeed.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHumidityNeedType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHumidityNeed_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HumidityNeed_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHumidityNeed_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHumidityNeedAssessor_supervision_humidityNeedAssessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHumidityObservation(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HumidityObservation] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HumidityObservation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHumidityObservation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorHumidityObservation_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.HumidityObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorHumidityObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorIntensityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.Intensity.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.Intensity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorIntensityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorIntensity_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.Intensity_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.Intensity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorIntensity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorInterfaceStateType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.InterfaceState.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.InterfaceState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorInterfaceStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorInterfaceState_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.InterfaceState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorInterfaceState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorNoncriticalCauseType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.NoncriticalCause.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.NoncriticalCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorNoncriticalCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.NoncriticalCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorNoncriticalCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorPriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorProposalUrgencyType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorProposalUrgencyType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorProposalUrgency_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ProposalUrgency_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorProposalUrgency_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorQualifiedRequest(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.QualifiedRequest] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.QualifiedRequest => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorQualifiedRequest())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.QualifiedRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorQualifiedRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorQualifiedTarget(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.QualifiedTarget] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.QualifiedTarget => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorQualifiedTarget())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.QualifiedTarget_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorQualifiedTarget_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRecoveryAcknowledgment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRecoveryCauseType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RecoveryCause.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RecoveryCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRecoveryCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRecoveryCause_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RecoveryCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRecoveryCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRecoveryEventType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RecoveryEvent.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RecoveryEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRecoveryEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RecoveryEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRecoveryEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRecoveryReport(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RecoveryReport] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RecoveryReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRecoveryReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRecoveryReport_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RecoveryReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRecoveryReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRecoveryStateType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RecoveryState.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RecoveryState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRecoveryStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRecoveryState_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RecoveryState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRecoveryState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRequestClassType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RequestClass.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RequestClass.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRequestClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRequestClass_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RequestClass_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RequestClass_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRequestClass_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorRequestQualifier_supervision_requestQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorSelectedIntent(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.SelectedIntent] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.SelectedIntent => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorSelectedIntent())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorSelectedIntent_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.SelectedIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorSelectedIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorSelectionCauseType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.SelectionCause.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.SelectionCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorSelectionCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorSelectionCause_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.SelectionCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorSelectionCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorSelectionModeType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.SelectionMode.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.SelectionMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorSelectionModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorSelectionMode_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.SelectionMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorSelectionMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorServiceType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.Service.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.Service.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorServiceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorService_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.Service_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.Service_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorService_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorStatusCauseType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.StatusCause.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.StatusCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorStatusCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorStatusCause_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.StatusCause_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.StatusCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorStatusCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorSupervisorModeType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.SupervisorMode.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.SupervisorMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorSupervisorModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorSupervisorMode_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.SupervisorMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorSupervisorMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorSupervisorStatus(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.SupervisorStatus] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.SupervisorStatus => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorSupervisorStatus())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.SupervisorStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorSupervisorStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalAssessment(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalAssessment] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalAssessment => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalAssessment())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalAssessment_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalBandType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalBand.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalBand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalBandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalBand_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalBand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalBand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalBlowerAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalBlowerAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalDegradationType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalDegradation.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalDegradation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalDegradationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalDegradation_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalDegradation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalDegradation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalEquipmentAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalNeedType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalNeed.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalNeed.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalNeedType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalNeed_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalNeed_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalNeed_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalNeedAssessor_supervision_thermalNeedAssessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalObservationValidityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalObservationValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalObservationValidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalPathReadiness(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalPathReadiness())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalPathReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalProposal(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalProposal] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalProposal => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalProposal())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalProposal_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalProposalAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalProposalAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalReadinessType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalReadiness.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalReadiness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalReadinessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalReadiness_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorThermalServiceProposer_supervision_thermalServiceProposer_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorUserClimateRequest(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.UserClimateRequest] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.UserClimateRequest => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorUserClimateRequest())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.UserClimateRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorUserClimateRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorValidityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.Validity.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.Validity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorValidity_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.Validity_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.Validity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorValidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityBlowerAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityCriticalityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityCriticalityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityCriticality_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityCriticality_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityNeedType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityNeedType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityNeed_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityNeed_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityNeedAssessor_supervision_visibilityNeedAssessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityPathReadiness(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityPathReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityProposal(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityProposal] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityProposal => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityProposal())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityProposalAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorVisibilityServiceProposer_supervision_visibilityServiceProposer_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorWasteHeatAvailability(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorWasteHeatAvailability())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorWasteHeatAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Type] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorWasteHeatEligibility_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_HVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS(param: RandomLibI) extends MJen[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS] {
  override def generate(f: HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextHVAC_Visibility_Priority_SupervisorWasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_PostState_Container_PS())

      if (!continue) {
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


